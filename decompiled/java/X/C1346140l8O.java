package X;

import android.os.Bundle;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.commentv2.uitls.CommentPreloadV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l8O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346140l8O {
    public static void LIZ(C1346140l8O c1346140l8O, Float f, final Aweme aweme, final String str, final String str2, final String str3, final int i, Integer num, int i2, int i3, boolean z, boolean z2, int i4, String str4, Long l, int i5) {
        final long commentCount;
        final Long creativeId;
        String aid;
        AwemeRawAd awemeRawAd;
        AwemeStatistics statistics;
        final Long l2 = l;
        boolean z3 = z2;
        final boolean z4 = z;
        final int i6 = i2;
        final String value = str4;
        final int iLJI = i3;
        final Integer num2 = num;
        final int i7 = i4;
        final Float f2 = f;
        final String strLIZIZ = null;
        if ((i5 & 1) != 0) {
            f2 = null;
        }
        if ((i5 & 64) != 0) {
            num2 = -1;
        }
        if ((i5 & 128) != 0) {
            i6 = 0;
        }
        if ((i5 & 256) != 0) {
            iLJI = C1350950lG9.LIZIZ.LJI();
        }
        if ((i5 & 512) != 0) {
            z4 = true;
        }
        if ((i5 & 1024) != 0) {
            z3 = false;
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i7 = 0;
        }
        if ((i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            value = EnumC746780TRc.OTHER.getValue();
        }
        if ((i5 & 8192) != 0) {
            l2 = null;
        }
        c1346140l8O.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPreloadV2.preloadComment needSplitResponse = ");
        sbLIZ.append(z3);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            commentCount = statistics.getCommentCount();
        } else {
            commentCount = 0;
        }
        if (aweme != null && aweme.getAwemeRawAd() != null && !C1017070cZd.LJLJJLL(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            creativeId = awemeRawAd.getCreativeId();
        } else {
            creativeId = null;
        }
        int[] iArrLIZ = C422830Gi1.LIZ(100);
        if (iArrLIZ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(iArrLIZ[0]);
            sbLIZ2.append('_');
            sbLIZ2.append(iArrLIZ[1]);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (C295800Bic.LIZ()) {
            C20152913tH.LIZLLL.getClass();
            if (!C20153113tJ.LIZ()) {
                return;
            }
        }
        if (C294380BgK.LIZ() && Intrinsics.LJFF(str2, "homepage_hot") && aweme != null && (aid = aweme.getAid()) != null && C0S25.LIZ.containsKey(aid)) {
            return;
        }
        C20153113tJ c20153113tJ = C20152913tH.LIZLLL;
        final boolean z5 = z3;
        InterfaceC20153213tK interfaceC20153213tK = new InterfaceC20153213tK(num2, i, aweme, str, creativeId, str2, strLIZIZ, str3, commentCount, i6, iLJI, z5, z4, i7, value, f2, l2) { // from class: X.0l8P
            public final Bundle LIZ;
            public final /* synthetic */ String LIZIZ;

            @Override // X.InterfaceC20153213tK
            public final void LIZ(C20152113t9 c20152113t9) {
                Bundle bundle = this.LIZ;
                C1346140l8O c1346140l8O2 = CommentPreloadV2.Companion;
                final String str5 = this.LIZIZ;
                c1346140l8O2.getClass();
                c20152113t9.LIZ(bundle, CommentPreloadV2.class, new InterfaceC1726310v1Z() { // from class: X.0l5l
                    @Override // X.InterfaceC1726310v1Z
                    public final void LIZ(Exception exc) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("preload: onFail: ");
                        sbLIZ3.append(exc.getStackTrace());
                        C1344030l4z.LIZJ("CommentPreloadV2", C2188811AlT.LIZIZ(sbLIZ3));
                    }

                    @Override // X.InterfaceC1726310v1Z
                    public final void onSuccess(Object obj) {
                        if (!(obj instanceof CommentItemList)) {
                            C1344030l4z.LIZJ("CommentPreloadV2", "preload: onSuccess: ret is invalid");
                            return;
                        }
                        CommentPerfMonitorUtil commentPerfMonitorUtil = CommentPerfMonitorUtil.LIZ;
                        EnumC2010207u8 enumC2010207u8 = EnumC2010207u8.EVE;
                        commentPerfMonitorUtil.getClass();
                        CommentPerfMonitorUtil.LJII.LJJII = enumC2010207u8;
                        Integer numValueOf = null;
                        CommentItemList commentItemList = (CommentItemList) obj;
                        if (commentItemList != null) {
                            String str6 = str5;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("preload: onSuccess: ");
                            List<Comment> list = commentItemList.items;
                            if (list != null) {
                                numValueOf = Integer.valueOf(list.size());
                            }
                            sbLIZ3.append(numValueOf);
                            C1344030l4z.LIZJ("CommentPreloadV2", C2188811AlT.LIZIZ(sbLIZ3));
                            CommentItemList commentItemList2 = (CommentItemList) obj;
                            commentItemList2.isPreload = true;
                            commentItemList2.preloadTriggerMethod = str6;
                            ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZJ().LIZLLL(commentItemList2.items);
                        }
                    }
                }, Boolean.FALSE);
            }

            {
                String aid2;
                int chargeType;
                User author;
                float fFloatValue;
                String authorUid;
                AwemeRawAd awemeRawAd2;
                this.LIZIZ = value;
                Bundle bundle = new Bundle();
                if (num2 != null && num2.intValue() != -1) {
                    bundle.putInt("comment_ttl", num2.intValue());
                }
                bundle.putInt("strategyId", i);
                if (aweme != null) {
                    aid2 = aweme.getAid();
                } else {
                    aid2 = null;
                }
                C786410Ut5.LJJJI("aid", aid2, bundle);
                bundle.putLong("cursor", 0L);
                bundle.putInt("count", 20);
                C786410Ut5.LJJJI("insertCids", str, bundle);
                bundle.putLong("creativeId", creativeId != null ? creativeId.longValue() : 0L);
                bundle.putInt("channelId", C737370SwB.LIZ(str2));
                C786410Ut5.LJJJI("userAvatarShrink", strLIZIZ, bundle);
                if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                    chargeType = awemeRawAd2.getChargeType();
                } else {
                    chargeType = 0;
                }
                bundle.putInt("adPricingType", chargeType);
                bundle.putInt("loadType", 0);
                bundle.putInt("commentLimit", C1353700lKa.LIZIZ());
                bundle.putInt("offlinePin", C729800Sjy.LIZ());
                if (aweme != null) {
                    author = aweme.getAuthor();
                } else {
                    author = null;
                }
                bundle.putInt("authorRelationType", C1343890l4l.LIZ(author, str2).getValue());
                bundle.putInt("scenario", 0);
                C786410Ut5.LJJJI("enterFrom", str2, bundle);
                C786410Ut5.LJJJI("searchParams", str3, bundle);
                bundle.putLong("showCount", commentCount);
                bundle.putInt("comment_preload", i6);
                bundle.putLong("expireTime", C1344240l5K.LIZIZ(aweme));
                bundle.putInt("source", iLJI);
                bundle.putBoolean("need_split_parse_data", z5);
                bundle.putBoolean("rate_limit", z4);
                bundle.putInt("surprise_type", i7);
                C786410Ut5.LJJJI("preload_trigger_method", value, bundle);
                if (f2 != null) {
                    fFloatValue = f2.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                bundle.putFloat("predict_value", fFloatValue);
                if (aweme != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme);
                } else {
                    authorUid = null;
                }
                C786410Ut5.LJJJI("authorId", authorUid, bundle);
                C786410Ut5.LJJJI("pollId", l2 != null ? l2.toString() : null, bundle);
                this.LIZ = bundle;
            }
        };
        c20153113tJ.getClass();
        C20153113tJ.LIZJ(interfaceC20153213tK);
    }
}
