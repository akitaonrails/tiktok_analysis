package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTraceImpl;
import com.ss.android.ugc.aweme.favorites.agents.abilities.ICollect;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS445S0200000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O8Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O8Z extends C09AY implements Function2<VideoFavoriteAssem, C609900Nw4, Unit> {
    public C0O8Z() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoFavoriteAssem videoFavoriteAssem, C609900Nw4 c609900Nw4) {
        String aid;
        String aid2;
        Activity activityLIZ;
        Aweme aweme;
        String str;
        Aweme aweme2;
        Aweme aweme3;
        String string;
        String string2;
        String logExtra;
        Long creativeId;
        Long adId;
        Aweme aweme4;
        String aid3;
        VideoFavoriteAssem videoFavoriteAssem2 = videoFavoriteAssem;
        C609900Nw4 c609900Nw42 = c609900Nw4;
        if (c609900Nw42 != null) {
            Aweme aweme5 = ((VideoItemParams) C631370Opb.LIZ(videoFavoriteAssem2)).getAweme();
            Map<String, ? extends Object> mapLJIIL = null;
            Object obj = null;
            mapLJIIL = null;
            if (aweme5 != null) {
                aid = aweme5.getAid();
            } else {
                aid = null;
            }
            Aweme aweme6 = c609900Nw42.LIZ;
            if (aweme6 != null) {
                aid2 = aweme6.getAid();
            } else {
                aid2 = null;
            }
            if (Intrinsics.LJFF(aid, aid2)) {
                VideoFavoriteVM videoFavoriteVMBp = videoFavoriteAssem2.Bp();
                String str2 = c609900Nw42.LIZIZ;
                String str3 = c609900Nw42.LIZJ;
                String str4 = c609900Nw42.LIZLLL;
                videoFavoriteVMBp.getClass();
                C612130Nzf c612130Nzf = new C612130Nzf(videoFavoriteVMBp, str2, str3, str4);
                if (!videoFavoriteVMBp.AQ2()) {
                    if (C0O6R.LIZ == C0O68.AVAILABLE) {
                        VideoItemParams item = videoFavoriteVMBp.getItem();
                        if (item != null) {
                            aweme = item.getAweme();
                        } else {
                            aweme = null;
                        }
                        VideoItemParams item2 = videoFavoriteVMBp.getItem();
                        String str5 = "";
                        if (item2 == null || (str = item2.mEventType) == null) {
                            str = "";
                        }
                        videoFavoriteVMBp.vQ2(aweme, str, "click_feed_button");
                        VideoItemParams item3 = videoFavoriteVMBp.getItem();
                        if (item3 != null) {
                            aweme2 = item3.getAweme();
                        } else {
                            aweme2 = null;
                        }
                        C1440005kM.LIZ(new C737030Svd(5401, aweme2));
                        ICollect iCollect = (ICollect) videoFavoriteVMBp.LLILZIL.getValue();
                        VideoItemParams item4 = videoFavoriteVMBp.getItem();
                        if (item4 != null && (aweme4 = item4.getAweme()) != null && (aid3 = aweme4.getAid()) != null) {
                            str5 = aid3;
                        }
                        VideoItemParams item5 = videoFavoriteVMBp.getItem();
                        if (item5 != null && (aweme3 = item5.getAweme()) != null) {
                            if (!AwemeExtKt.isMonetizationTraffic(aweme3)) {
                                mapLJIIL = C2097608Jq.LJ();
                            } else {
                                C844470XAv.LIZ.getClass();
                                Context contextLIZ = C844470XAv.LIZ();
                                Map<String, Object> mapLIZ = EngagementTraceImpl.LIZIZ().LIZ();
                                Pair[] pairArr = new Pair[7];
                                AwemeRawAd monetizationData = AwemeExtKt.getMonetizationData(aweme3);
                                if (monetizationData != null && (adId = monetizationData.getAdId()) != null) {
                                    string = adId.toString();
                                } else {
                                    string = null;
                                }
                                pairArr[0] = new Pair("ad_id", string);
                                AwemeRawAd monetizationData2 = AwemeExtKt.getMonetizationData(aweme3);
                                if (monetizationData2 != null && (creativeId = monetizationData2.getCreativeId()) != null) {
                                    string2 = creativeId.toString();
                                } else {
                                    string2 = null;
                                }
                                pairArr[1] = new Pair("creative_id", string2);
                                AwemeRawAd monetizationData3 = AwemeExtKt.getMonetizationData(aweme3);
                                if (monetizationData3 != null) {
                                    logExtra = monetizationData3.getLogExtra();
                                } else {
                                    logExtra = null;
                                }
                                pairArr[2] = new Pair("log_extra", logExtra);
                                pairArr[3] = new Pair("user_agent", C1489110oqz.LIZ("other"));
                                pairArr[4] = new Pair("access", C786410Ut5.b3(contextLIZ));
                                pairArr[5] = new Pair("package", contextLIZ.getPackageName());
                                android.util.Pair<String, Boolean> pairLIZ = C614430O8b.LIZ(contextLIZ);
                                if (pairLIZ != null) {
                                    obj = pairLIZ.first;
                                }
                                pairArr[6] = new Pair("google_aid", obj);
                                mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), mapLIZ);
                            }
                        }
                        iCollect.collect(str5, mapLJIIL, new AwS623S0100000_9(videoFavoriteVMBp, 234), new AwS445S0200000_9(videoFavoriteVMBp, c612130Nzf, 44));
                    } else {
                        Context context = videoFavoriteVMBp.getContext();
                        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                            c1389890mGx.LJIIIZ(2131829438);
                            c1389890mGx.LJIIJJI();
                        }
                    }
                } else {
                    c612130Nzf.invoke();
                }
            }
        }
        return Unit.LIZ;
    }
}
