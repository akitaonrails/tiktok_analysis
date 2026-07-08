package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.s;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.api.BaseControllerContext;
import com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizData;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.MemeRegInfo;
import com.ss.android.ugc.aweme.feed.model.MemeVideoReg;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PodcastUrlModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.SubOnlyVideo;
import com.ss.android.ugc.aweme.feed.model.SubOnlyVideoGates;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.prompt.InteractiveRecMatchInfo;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import com.ss.android.ugc.aweme.metrics.video.play.v2.PlayTimeEventNew;
import com.ss.android.ugc.aweme.metrics.video.play.v2.VideoPlayEventNew;
import com.ss.android.ugc.aweme.metrics.video.play.v2.VideoPlayFinishEventNew;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.poi.LocalServiceInfo;
import com.ss.android.ugc.aweme.poi.poidetail.IPoiDetailPageService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeCacheService;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386570mBb {
    public final ArrayList<InterfaceC1386630mBh<? extends InterfaceC1282004zy>> LIZ = new ArrayList<>();

    public final void LIZ() {
        this.LIZ.add(new InterfaceC1386630mBh<C1387370mCt>() { // from class: X.0mCs
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(447));

            public static String LJIIIZ(Aweme aweme) {
                User author = aweme.getAuthor();
                if (author != null && author.getFollowStatus() == 1) {
                    return "1";
                }
                User author2 = aweme.getAuthor();
                if (author2 != null && author2.getFollowStatus() == 2) {
                    return "1";
                }
                return CardStruct.IStatusCode.DEFAULT;
            }

            public static String LJIIJ(Aweme aweme) {
                Boolean boolIsSovUrllessEnabled;
                StandardBusinessModel standardBusinessModel;
                SubOnlyVideo subOnlyVideo;
                SubOnlyVideoGates subOnlyVideoGates;
                ContentModel contentModel = aweme.getContentModel();
                if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null && (subOnlyVideoGates = subOnlyVideo.getSubOnlyVideoGates()) != null) {
                    boolIsSovUrllessEnabled = subOnlyVideoGates.isSovUrllessEnabled();
                } else {
                    boolIsSovUrllessEnabled = null;
                }
                return C0OAL.LIZIZ(boolIsSovUrllessEnabled);
            }

            public static String LJIIJJI(Aweme aweme) {
                boolean z;
                Video video;
                if (aweme.getVideo() != null && ((video = aweme.getVideo()) == null || video.getPlayAddr() == null)) {
                    z = true;
                } else {
                    z = false;
                }
                return C0OAL.LIZIZ(Boolean.valueOf(z));
            }

            public static String LJIIL(Aweme aweme) {
                List<AnchorCommonStruct> anchors = aweme.getAnchors();
                if (anchors != null) {
                    Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getType() == EnumC1430380nKG.SUBSCRIPTION_ANCHOR.getTYPE()) {
                            return "1";
                        }
                    }
                    return CardStruct.IStatusCode.DEFAULT;
                }
                return CardStruct.IStatusCode.DEFAULT;
            }

            public static long LJIILIIL(Aweme aweme) {
                StandardBusinessModel standardBusinessModel;
                CMPreviewInfo cmPreviewInfo;
                Long previewSettingsDuration;
                ContentModel contentModel = aweme.getContentModel();
                if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) != null && (previewSettingsDuration = cmPreviewInfo.getPreviewSettingsDuration()) != null) {
                    return previewSettingsDuration.longValue();
                }
                return 0L;
            }

            public static String LJIILJJIL(Aweme aweme) {
                Boolean shouldShowPaywall;
                StandardBusinessModel standardBusinessModel;
                SubOnlyVideo subOnlyVideo;
                ContentModel contentModel = aweme.getContentModel();
                if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null) {
                    shouldShowPaywall = subOnlyVideo.getShouldShowPaywall();
                } else {
                    shouldShowPaywall = null;
                }
                return C0OAL.LIZIZ(shouldShowPaywall);
            }

            public static String LJIILL(Aweme aweme) {
                Integer subsStatus;
                StandardBusinessModel standardBusinessModel;
                SubOnlyVideo subOnlyVideo;
                CMPreviewInfo.SubsStatus.Companion companion = CMPreviewInfo.SubsStatus.Companion;
                ContentModel contentModel = aweme.getContentModel();
                if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null) {
                    subsStatus = subOnlyVideo.getSubsStatus();
                } else {
                    subsStatus = null;
                }
                return companion.fromInt(subsStatus).name().toLowerCase(Locale.ROOT);
            }

            /* JADX WARN: Removed duplicated region for block: B:172:0x0267  */
            /* JADX WARN: Removed duplicated region for block: B:280:0x03ff  */
            /* JADX WARN: Removed duplicated region for block: B:301:0x044e  */
            /* JADX WARN: Removed duplicated region for block: B:304:0x045a  */
            /* JADX WARN: Removed duplicated region for block: B:314:0x0474  */
            /* JADX WARN: Removed duplicated region for block: B:330:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:339:0x04d6  */
            /* JADX WARN: Removed duplicated region for block: B:346:0x04eb  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00bc  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZ(X.C1387240mCg r17) {
                /*
                    Method dump skipped, instruction units count: 1284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1387360mCs.LIZ(X.0mCg):X.04zy");
            }

            /* JADX WARN: Removed duplicated region for block: B:356:0x053a  */
            /* JADX WARN: Removed duplicated region for block: B:365:0x0552  */
            /* JADX WARN: Removed duplicated region for block: B:379:0x057a  */
            /* JADX WARN: Removed duplicated region for block: B:389:0x05a8  */
            /* JADX WARN: Removed duplicated region for block: B:399:0x05cc  */
            /* JADX WARN: Removed duplicated region for block: B:400:0x05cf  */
            /* JADX WARN: Removed duplicated region for block: B:424:0x061f  */
            /* JADX WARN: Removed duplicated region for block: B:426:0x0629  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZIZ(X.C1387240mCg r19) {
                /*
                    Method dump skipped, instruction units count: 1659
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1387360mCs.LIZIZ(X.0mCg):X.04zy");
            }

            /* JADX WARN: Removed duplicated region for block: B:334:0x05e3  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZJ(X.C1387240mCg r18) {
                /*
                    Method dump skipped, instruction units count: 2727
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1387360mCs.LIZJ(X.0mCg):X.04zy");
            }

            public static void LIZLLL(C1387370mCt c1387370mCt, Aweme aweme) {
                c1387370mCt.H = C1212100heC.LIZJ(aweme, null);
                c1387370mCt.K = C1212100heC.LJFF(aweme, null);
            }

            public static void LJ(C1387370mCt c1387370mCt, Aweme aweme) {
                List<InteractStickerStruct> interactStickerStructs;
                InteractStickerStruct next;
                AddYoursStickerStruct addYoursStickerStruct;
                String string = null;
                if (aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
                    Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.getAddYoursStickerStruct() != null) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    InteractStickerStruct interactStickerStruct = next;
                    if (interactStickerStruct != null && (addYoursStickerStruct = interactStickerStruct.getAddYoursStickerStruct()) != null) {
                        c1387370mCt.LLLF = 1;
                        Long topicId = addYoursStickerStruct.getTopicId();
                        if (topicId != null) {
                            string = topicId.toString();
                        }
                        String str = "";
                        if (string == null) {
                            string = "";
                        }
                        c1387370mCt.LLLFF = string;
                        String text = addYoursStickerStruct.getText();
                        if (text != null) {
                            str = text;
                        }
                        c1387370mCt.LLLFFI = str;
                        return;
                    }
                }
                c1387370mCt.LLLF = 0;
            }

            public static void LJFF(C1387370mCt c1387370mCt, Aweme aweme) {
                MemeRegInfo memeRegInfo;
                MemeVideoReg memeVideoReg;
                if (aweme != null && (memeRegInfo = aweme.memeRegInfo) != null && (memeVideoReg = memeRegInfo.memeVideoReg) != null) {
                    c1387370mCt.LLLIIIL = Integer.valueOf(memeVideoReg.isMeme());
                    c1387370mCt.LLLIIIIL = Integer.valueOf(memeVideoReg.canBoostMeme);
                } else {
                    c1387370mCt.LLLIIIL = 0;
                    c1387370mCt.LLLIIIIL = 0;
                }
            }

            public static void LJI(C1387370mCt c1387370mCt, Aweme aweme) {
                InteractStickerStruct next;
                MusicStickerStruct musicStickerStruct;
                String str;
                List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
                if (interactStickerStructs != null) {
                    Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.getMusicStickerStruct() != null) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    InteractStickerStruct interactStickerStruct = next;
                    if (interactStickerStruct != null && (musicStickerStruct = interactStickerStruct.getMusicStickerStruct()) != null && (str = musicStickerStruct.musicStickerFrom) != null && str.length() > 0) {
                        c1387370mCt.p = str;
                    }
                }
            }

            public static void LJIIIIZZ(C1387370mCt c1387370mCt, Aweme aweme) {
                String strLIZ = C1380900m2S.LIZ();
                if (strLIZ != null) {
                    String aid = null;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    }
                    if (Intrinsics.LJFF(strLIZ, aid) && C1380900m2S.LIZLLL() > 0) {
                        c1387370mCt.LLLI = Integer.valueOf(C1380900m2S.LIZLLL());
                        c1387370mCt.LLLII = C1380900m2S.LIZIZ();
                        if (aweme != null) {
                            AwemeExtKt.appendMobParam(aweme, "push_type", C1380900m2S.LIZJ());
                            AwemeExtKt.appendMobParam(aweme, "push_user_id", C1380900m2S.LIZ.get("push_user_id"));
                            AwemeExtKt.appendMobParam(aweme, "push_id", C1380900m2S.LIZIZ());
                            AwemeExtKt.appendMobParam(aweme, "is_from_push", "1");
                        }
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
            /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static void LJII(X.C1387370mCt r5, java.lang.String r6, com.ss.android.ugc.aweme.feed.model.Aweme r7) {
                /*
                    r4 = 0
                    if (r7 == 0) goto L49
                    com.ss.android.ugc.aweme.feed.model.HotSearchInfo r0 = r7.getHotSearchInfo()
                    if (r0 == 0) goto Lf
                    java.lang.String r3 = r0.getSentence()
                    if (r3 != 0) goto L13
                Lf:
                    java.lang.String r3 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getHotSpot(r7)
                L13:
                    com.ss.android.ugc.aweme.profile.model.HotListStruct r4 = r7.getHotListStruct()
                L17:
                    r2 = 9
                    if (r4 == 0) goto L45
                    int r0 = r4.getType()
                    if (r0 != r2) goto L45
                    r1 = 1
                L22:
                    int r0 = r4.getType()
                    if (r0 != r2) goto L32
                    boolean r0 = android.text.TextUtils.isEmpty(r3)
                    if (r0 == 0) goto L32
                    java.lang.String r3 = r4.getTitile()
                L32:
                    boolean r0 = android.text.TextUtils.isEmpty(r3)
                    if (r0 != 0) goto L44
                    java.lang.String r0 = "homepage_fresh_topic"
                    boolean r0 = android.text.TextUtils.equals(r6, r0)
                    if (r0 != 0) goto L4b
                    if (r1 != 0) goto L4b
                    r5.LLLJ = r3
                L44:
                    return
                L45:
                    r1 = 0
                    if (r4 == 0) goto L32
                    goto L22
                L49:
                    r3 = r4
                    goto L17
                L4b:
                    r5.LLLJL = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1387360mCs.LJII(X.0mCt, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C0N1J>() { // from class: X.0N1K
            public static C0N1J LIZLLL(C1387240mCg c1387240mCg) {
                C0N1J c0n1j = new C0N1J();
                c0n1j.LL = Integer.valueOf(C20703515zt.LJIIZILJ(c1387240mCg.LIZ) ? 1 : 0);
                c0n1j.LLILLJJLI = Integer.valueOf(C20703515zt.LJIJJLI(c1387240mCg.LIZ));
                return c0n1j;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1386730mBr>() { // from class: X.0mBq
            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                String title;
                String strLJIIZILJ;
                String desc;
                PhotoModeImageInfo photoModeImageInfo;
                Aweme aweme = c1387240mCg.LIZ;
                C161N c161n = C161N.LIZIZ;
                boolean zLJJJJZ = c161n.LJJJJZ(aweme);
                String strLJLJI = null;
                if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null) {
                    title = photoModeImageInfo.getTitle();
                } else {
                    title = null;
                }
                if (c161n.LJJIFFI(zLJJJJZ, C123100dR.LIZ(title))) {
                    strLJIIZILJ = c161n.LJIIZILJ(aweme);
                } else {
                    strLJIIZILJ = null;
                }
                boolean zLJJJ = c161n.LJJJ(aweme);
                if (aweme != null) {
                    desc = aweme.getDesc();
                } else {
                    desc = null;
                }
                if (c161n.LJJIFFI(zLJJJ, C123100dR.LIZ(desc))) {
                    strLJLJI = c161n.LJLJI(aweme);
                }
                C1386730mBr c1386730mBr = new C1386730mBr();
                c1386730mBr.LL = strLJLJI;
                c1386730mBr.LLILLJJLI = strLJIIZILJ;
                return c1386730mBr;
            }
        });
        this.LIZ.add(new AbstractC1386560mBa<C1386540mBY>() { // from class: X.0mBX
            public final Map<String, String> LIZ = new HashMap();

            public static int LJ(Aweme aweme) {
                if (aweme != null && aweme.getPlaylist_info() != null && aweme.isSubOnlyVideo()) {
                    return 1;
                }
                return 0;
            }

            public static boolean LJFF(Aweme aweme) {
                List<InteractStickerStruct> interactStickerStructs;
                if (aweme == null || (interactStickerStructs = aweme.getInteractStickerStructs()) == null) {
                    return false;
                }
                Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getQaStruct() != null) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                Context context;
                String strCf;
                String from;
                C2189821An6 param;
                Integer chatType;
                String chatTypeStr;
                DetailNavArgModel navArgModel;
                DetailNavArgModel navArgModel2;
                String contentSource;
                int i;
                int pageType;
                String str;
                String poiFullScreen;
                int i2;
                int i3;
                String str2;
                List<AnchorCommonStruct> anchors;
                String str3;
                String str4;
                Integer chatType2;
                String chatTypeStr2;
                DetailNavArgModel navArgModel3;
                String groupType;
                DetailNavArgModel navArgModel4;
                DetailNavArgModel navArgModel5;
                Aweme aweme = c1387240mCg.LIZ;
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                String challengeId = null;
                if (iBaseListFragmentPanel != null) {
                    context = iBaseListFragmentPanel.getContext();
                } else {
                    context = null;
                }
                if (baseControllerContext != null) {
                    strCf = baseControllerContext.Cf();
                    from = baseControllerContext.getFrom();
                } else {
                    strCf = null;
                    from = null;
                }
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                C1386540mBY c1386540mBY = new C1386540mBY();
                String strLIZLLL = AbstractC1386560mBa.LIZLLL(iFeedMobParamsProvider, baseControllerContext);
                c1386540mBY.LL = strCf;
                c1386540mBY.LLJJL = Integer.valueOf(LJ(aweme));
                if (Intrinsics.LJFF("from_chat", from)) {
                    if (param == null || (navArgModel5 = param.getNavArgModel()) == null || (chatTypeStr2 = navArgModel5.getChatTypeStr()) == null) {
                        Map<Integer, String> map = C892380Yzc.LIZJ;
                        if (param != null && (navArgModel3 = param.getNavArgModel()) != null) {
                            chatType2 = navArgModel3.getChatType();
                        } else {
                            chatType2 = null;
                        }
                        chatTypeStr2 = map.get(chatType2);
                    }
                    c1386540mBY.LLJJIJIIJIL = chatTypeStr2;
                    if (param != null && (navArgModel4 = param.getNavArgModel()) != null) {
                        groupType = navArgModel4.getGroupType();
                    } else {
                        groupType = null;
                    }
                    c1386540mBY.LLJJIJIL = groupType;
                    c1386540mBY.LL = "chat";
                }
                if (Intrinsics.LJFF("shared_feed", strCf) || Intrinsics.LJFF("shared_feed_like_history", strCf)) {
                    if (param == null || (navArgModel2 = param.getNavArgModel()) == null || (chatTypeStr = navArgModel2.getChatTypeStr()) == null) {
                        Map<Integer, String> map2 = C892380Yzc.LIZJ;
                        if (param != null && (navArgModel = param.getNavArgModel()) != null) {
                            chatType = navArgModel.getChatType();
                        } else {
                            chatType = null;
                        }
                        chatTypeStr = map2.get(chatType);
                    }
                    c1386540mBY.LLJJIJIIJIL = chatTypeStr;
                }
                if (Intrinsics.LJFF(strCf, "chat_inline_msg")) {
                    c1386540mBY.LL = "chat_inline_msg";
                }
                if (Intrinsics.LJFF("from_auto_message", from)) {
                    c1386540mBY.LL = "link_auto_message";
                }
                if (iFeedMobParamsProvider != null) {
                    contentSource = iFeedMobParamsProvider.getContentSource();
                } else {
                    contentSource = null;
                }
                if (Intrinsics.LJFF("like", contentSource) || Intrinsics.LJFF("discovery", strCf) || LJFF(aweme) || Intrinsics.LJFF(strCf, "playlist") || C14TF.LIZIZ.LJJJJIZL(strCf) || Intrinsics.LJFF("places_discover", strCf) || Intrinsics.LJFF("poi_detail", strCf) || Intrinsics.LJFF("shared_feed_like_history", strCf)) {
                    c1386540mBY.LLIZLLLIL = strLIZLLL;
                }
                if (C1386360mBG.LJI(c1386540mBY.LL)) {
                    c1386540mBY.LLILLL = C1386360mBG.LJ();
                }
                if (((IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class)).LIZIZ()) {
                    i = 1;
                } else {
                    i = 0;
                }
                c1386540mBY.LLILZ = i;
                if (baseControllerContext != null) {
                    pageType = baseControllerContext.getPageType();
                } else {
                    pageType = 0;
                }
                String strLJIJ = C735370Ssx.LJIJ(pageType, aweme);
                String str5 = "";
                if (strLJIJ == null) {
                    strLJIJ = "";
                }
                if (param != null) {
                    str = param.getmImprId();
                } else {
                    str = null;
                }
                c1386540mBY.LLILZIL = strLJIJ;
                if (TextUtils.isEmpty(strLJIJ) && !TextUtils.isEmpty(str)) {
                    if (str == null) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    c1386540mBY.LLILZIL = str4;
                }
                String str6 = c1386540mBY.LLILZIL;
                if (str6 == null) {
                    str6 = "";
                }
                c1386540mBY.LLILZIL = str6;
                if (C735370Ssx.LJJIJL(strCf)) {
                    if (!TextUtils.isEmpty(str)) {
                        str3 = str;
                    } else {
                        str3 = strLJIJ;
                    }
                    c1386540mBY.LLILZLL = str3;
                    c1386540mBY.LLIZ = C584850Mwl.LIZ.LIZIZ(C584840Mwk.LIZ(strLJIJ, str));
                }
                if (str != null) {
                    c1386540mBY.LLILZLL = str;
                }
                if (ComplianceServiceProvider.LJIL().LJJJJZI()) {
                    c1386540mBY.LLJ = "1";
                }
                if (C584460Mw8.LIZ) {
                    c1386540mBY.LLJI = "1";
                }
                if (Intrinsics.LJFF(strCf, "places_discover") || Intrinsics.LJFF("poi_detail", strCf)) {
                    if (param != null && (poiFullScreen = param.getPoiFullScreen()) != null) {
                        str5 = poiFullScreen;
                    }
                    c1386540mBY.LLJI = str5;
                }
                if (C735370Ssx.LJJIIZ(strCf)) {
                    if (param != null) {
                        challengeId = param.getChallengeId();
                    }
                    c1386540mBY.LLILLJJLI = challengeId;
                }
                String str7 = CardStruct.IStatusCode.DEFAULT;
                c1386540mBY.LLJIJIL = CardStruct.IStatusCode.DEFAULT;
                c1386540mBY.LLJJI = Integer.valueOf(C0SXF.LJJIII(context, aweme));
                if (aweme != null && (anchors = aweme.getAnchors()) != null && !anchors.isEmpty()) {
                    Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().getComponentKey(), "anchor_aigc_avatar")) {
                            i2 = 1;
                            break;
                        }
                    }
                    i2 = 0;
                } else {
                    i2 = 0;
                }
                c1386540mBY.LLJJIII = i2;
                C1387230mCf c1387230mCf = c1387240mCg.LJII;
                if (c1387230mCf != null && (str2 = c1387230mCf.LLJIJIL) != null) {
                    str7 = str2;
                }
                c1386540mBY.LLJJIJI = str7;
                if (C1601690rmZ.LIZJ()) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                c1386540mBY.LLJJJJ = i3;
                if (aweme != null && AwemeBizExtKt.getCacheSourceType(aweme) == C0N9C.OFFLINE_MODE.ordinal()) {
                    c1386540mBY.LLJJJJLIIL = "offline_video";
                }
                return c1386540mBY;
            }

            /* JADX WARN: Removed duplicated region for block: B:118:0x01a0  */
            /* JADX WARN: Removed duplicated region for block: B:137:0x01e8  */
            /* JADX WARN: Removed duplicated region for block: B:149:0x0201  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x020f  */
            /* JADX WARN: Removed duplicated region for block: B:184:0x0277  */
            /* JADX WARN: Removed duplicated region for block: B:187:0x0280  */
            /* JADX WARN: Removed duplicated region for block: B:190:0x028a  */
            /* JADX WARN: Removed duplicated region for block: B:193:0x0299  */
            /* JADX WARN: Removed duplicated region for block: B:200:0x02c1  */
            /* JADX WARN: Removed duplicated region for block: B:201:0x02c3  */
            /* JADX WARN: Removed duplicated region for block: B:202:0x02c8  */
            /* JADX WARN: Removed duplicated region for block: B:203:0x02cb  */
            /* JADX WARN: Removed duplicated region for block: B:204:0x02d0  */
            /* JADX WARN: Removed duplicated region for block: B:205:0x02d3  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZIZ(X.C1387240mCg r15) {
                /*
                    Method dump skipped, instruction units count: 799
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1386530mBX.LIZIZ(X.0mCg):X.04zy");
            }

            /* JADX WARN: Removed duplicated region for block: B:101:0x016a  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x01e7  */
            /* JADX WARN: Removed duplicated region for block: B:137:0x01f3  */
            /* JADX WARN: Removed duplicated region for block: B:143:0x0209  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x0210  */
            /* JADX WARN: Removed duplicated region for block: B:150:0x0219  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x0237  */
            /* JADX WARN: Removed duplicated region for block: B:158:0x0254  */
            /* JADX WARN: Removed duplicated region for block: B:161:0x0260  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x026c  */
            /* JADX WARN: Removed duplicated region for block: B:167:0x0278  */
            /* JADX WARN: Removed duplicated region for block: B:170:0x0288  */
            /* JADX WARN: Removed duplicated region for block: B:184:0x02ae  */
            /* JADX WARN: Removed duplicated region for block: B:189:0x02bc  */
            /* JADX WARN: Removed duplicated region for block: B:196:0x02cd  */
            /* JADX WARN: Removed duplicated region for block: B:201:0x02e7  */
            /* JADX WARN: Removed duplicated region for block: B:212:0x0304  */
            /* JADX WARN: Removed duplicated region for block: B:238:0x0362  */
            /* JADX WARN: Removed duplicated region for block: B:241:0x0375  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x0388  */
            /* JADX WARN: Removed duplicated region for block: B:246:0x038d  */
            /* JADX WARN: Removed duplicated region for block: B:247:0x0393  */
            /* JADX WARN: Removed duplicated region for block: B:248:0x0396 A[EDGE_INSN: B:272:0x0396->B:248:0x0396 BREAK  A[LOOP:0: B:218:0x031e->B:274:?]] */
            /* JADX WARN: Removed duplicated region for block: B:251:0x03a2  */
            /* JADX WARN: Removed duplicated region for block: B:252:0x03a6  */
            /* JADX WARN: Removed duplicated region for block: B:253:0x03a9  */
            /* JADX WARN: Removed duplicated region for block: B:254:0x03ac  */
            /* JADX WARN: Removed duplicated region for block: B:255:0x03af  */
            /* JADX WARN: Removed duplicated region for block: B:257:0x03b6  */
            /* JADX WARN: Removed duplicated region for block: B:258:0x03b9  */
            /* JADX WARN: Removed duplicated region for block: B:259:0x03bc  */
            /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZJ(X.C1387240mCg r17) {
                /*
                    Method dump skipped, instruction units count: 1005
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1386530mBX.LIZJ(X.0mCg):X.04zy");
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1386610mBf>() { // from class: X.0mBe
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                String str;
                String shootTabName;
                String contentType;
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    return new C1386610mBf();
                }
                C1386610mBf c1386610mBf = new C1386610mBf();
                String str2 = "1";
                if (aweme.getContentOriginalType() != 0) {
                    int contentOriginalType = aweme.getContentOriginalType();
                    if (contentOriginalType != 1) {
                        if (contentOriginalType == 2) {
                            str = "1";
                        } else if (contentOriginalType != 3) {
                            str = "";
                        } else {
                            str = "2";
                        }
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                } else {
                    str = null;
                }
                c1386610mBf.LL = str;
                String shootTabName2 = aweme.getShootTabName();
                if (shootTabName2 != null && shootTabName2.length() != 0 && aweme.getContentOriginalType() == 2) {
                    shootTabName = aweme.getShootTabName();
                } else {
                    shootTabName = null;
                }
                c1386610mBf.LLILLJJLI = shootTabName;
                String contentType2 = aweme.getContentType();
                if (contentType2 != null && contentType2.length() != 0) {
                    contentType = aweme.getContentType();
                } else {
                    contentType = null;
                }
                c1386610mBf.LLILLL = contentType;
                if (aweme.getContentSizeType() != 0) {
                    if (aweme.getContentSizeType() != 2) {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                } else {
                    str2 = null;
                }
                c1386610mBf.LLILZ = str2;
                return c1386610mBf;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                String str;
                String shootTabName;
                String contentType;
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    return new C1386610mBf();
                }
                C1386610mBf c1386610mBf = new C1386610mBf();
                String str2 = "1";
                if (aweme.getContentOriginalType() != 0) {
                    int contentOriginalType = aweme.getContentOriginalType();
                    if (contentOriginalType != 1) {
                        if (contentOriginalType == 2) {
                            str = "1";
                        } else if (contentOriginalType != 3) {
                            str = "";
                        } else {
                            str = "2";
                        }
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                } else {
                    str = null;
                }
                c1386610mBf.LL = str;
                String shootTabName2 = aweme.getShootTabName();
                if (shootTabName2 != null && shootTabName2.length() != 0 && aweme.getContentOriginalType() == 2) {
                    shootTabName = aweme.getShootTabName();
                } else {
                    shootTabName = null;
                }
                c1386610mBf.LLILLJJLI = shootTabName;
                String contentType2 = aweme.getContentType();
                if (contentType2 != null && contentType2.length() != 0) {
                    contentType = aweme.getContentType();
                } else {
                    contentType = null;
                }
                c1386610mBf.LLILLL = contentType;
                if (aweme.getContentSizeType() != 0) {
                    if (aweme.getContentSizeType() != 2) {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                } else {
                    str2 = null;
                }
                c1386610mBf.LLILZ = str2;
                return c1386610mBf;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                String str;
                String shootTabName;
                String contentType;
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    return new C1386610mBf();
                }
                C1386610mBf c1386610mBf = new C1386610mBf();
                String str2 = "1";
                if (aweme.getContentOriginalType() != 0) {
                    int contentOriginalType = aweme.getContentOriginalType();
                    if (contentOriginalType != 1) {
                        if (contentOriginalType == 2) {
                            str = "1";
                        } else if (contentOriginalType != 3) {
                            str = "";
                        } else {
                            str = "2";
                        }
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                } else {
                    str = null;
                }
                c1386610mBf.LL = str;
                String shootTabName2 = aweme.getShootTabName();
                if (shootTabName2 != null && shootTabName2.length() != 0 && aweme.getContentOriginalType() == 2) {
                    shootTabName = aweme.getShootTabName();
                } else {
                    shootTabName = null;
                }
                c1386610mBf.LLILLJJLI = shootTabName;
                String contentType2 = aweme.getContentType();
                if (contentType2 != null && contentType2.length() != 0) {
                    contentType = aweme.getContentType();
                } else {
                    contentType = null;
                }
                c1386610mBf.LLILLL = contentType;
                if (aweme.getContentSizeType() != 0) {
                    if (aweme.getContentSizeType() != 2) {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                } else {
                    str2 = null;
                }
                c1386610mBf.LLILZ = str2;
                return c1386610mBf;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1394630mOb>() { // from class: X.0mOa
            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZ(X.C1387240mCg r8) {
                /*
                    r7 = this;
                    com.ss.android.ugc.aweme.feed.model.Aweme r4 = r8.LIZ
                    com.ss.android.ugc.aweme.feed.api.I18nPlayControllerContext r3 = r8.LJFF
                    com.ss.android.ugc.aweme.feed.api.BaseControllerContext r0 = r8.LJI
                    r6 = 0
                    if (r0 == 0) goto L7a
                    java.lang.String r5 = r0.Cf()
                Ld:
                    r1 = 0
                    r0 = 1
                    X.0mOb r2 = LJ(r8, r1, r0)
                    com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider r0 = r8.LJIIIIZZ
                    if (r0 == 0) goto L78
                    java.lang.String r1 = r0.getEventType()
                L1b:
                    java.lang.String r0 = "single_song"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 != 0) goto L33
                    com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider r0 = r8.LJIIIIZZ
                    if (r0 == 0) goto L76
                    java.lang.String r1 = r0.getEventType()
                L2b:
                    java.lang.String r0 = "prop_page"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L4f
                L33:
                    com.ss.android.ugc.aweme.feed.api.BaseControllerContext r0 = r8.LJI
                    if (r0 == 0) goto L4b
                    android.app.Activity r0 = r0.getActivity()
                    if (r0 == 0) goto L4b
                    android.content.Intent r1 = r0.getIntent()
                    if (r1 == 0) goto L4b
                    java.lang.String r0 = "play_page_name"
                    java.lang.String r0 = LIZLLL(r1, r0)
                    if (r0 != 0) goto L4d
                L4b:
                    java.lang.String r0 = "111"
                L4d:
                    r2.LLJJIJI = r0
                L4f:
                    if (r4 == 0) goto L74
                    com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r4.getMixInfo()
                    if (r0 == 0) goto L74
                    java.lang.String r1 = r0.mixId
                L59:
                    boolean r0 = X.C123100dR.LIZ(r1)
                    if (r0 == 0) goto L61
                    r2.LL = r1
                L61:
                    boolean r0 = X.C735370Ssx.LJJIIZ(r5)
                    if (r0 == 0) goto L73
                    if (r3 == 0) goto L6d
                    java.lang.Integer r6 = r3.LJLLJ()
                L6d:
                    java.lang.String r0 = java.lang.String.valueOf(r6)
                    r2.LLILLJJLI = r0
                L73:
                    return r2
                L74:
                    r1 = r6
                    goto L59
                L76:
                    r1 = r6
                    goto L2b
                L78:
                    r1 = r6
                    goto L1b
                L7a:
                    r5 = r6
                    goto Ld
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1394620mOa.LIZ(X.0mCg):X.04zy");
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                String eventType;
                String str;
                String strLIZLLL;
                String strLIZLLL2;
                Activity activity;
                Intent intent;
                String strLIZLLL3;
                Activity activity2;
                Intent intent2;
                Activity activity3;
                Intent intent3;
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    return new C1394630mOb();
                }
                C1394630mOb c1394630mObLJ = LJ(c1387240mCg, false, false);
                if (aweme.getMixInfo() != null && !TextUtils.isEmpty(aweme.getMixInfo().mixId)) {
                    c1394630mObLJ.LL = aweme.getMixInfo().mixId;
                }
                c1394630mObLJ.LLILLJJLI = String.valueOf(AwemeBizExtKt.getOriginalPos(aweme));
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null) {
                    eventType = iFeedMobParamsProvider.getEventType();
                } else {
                    eventType = null;
                }
                if (Intrinsics.LJFF(eventType, "single_song")) {
                    BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                    String str2 = "";
                    if (baseControllerContext == null || (activity3 = baseControllerContext.getActivity()) == null || (intent3 = activity3.getIntent()) == null || (strLIZLLL = LIZLLL(intent3, "single_song_shoot_previous_page")) == null) {
                        strLIZLLL = "";
                    }
                    c1394630mObLJ.LLJIJIL = strLIZLLL;
                    BaseControllerContext baseControllerContext2 = c1387240mCg.LJI;
                    if (baseControllerContext2 == null || (activity2 = baseControllerContext2.getActivity()) == null || (intent2 = activity2.getIntent()) == null || (strLIZLLL2 = LIZLLL(intent2, "single_song_shoot_previous_enter_method")) == null) {
                        strLIZLLL2 = "";
                    }
                    c1394630mObLJ.LLJILJIL = strLIZLLL2;
                    BaseControllerContext baseControllerContext3 = c1387240mCg.LJI;
                    if (baseControllerContext3 != null && (activity = baseControllerContext3.getActivity()) != null && (intent = activity.getIntent()) != null && (strLIZLLL3 = LIZLLL(intent, "previous_search_query")) != null) {
                        str2 = strLIZLLL3;
                    }
                    c1394630mObLJ.LLJILJILJ = str2;
                }
                if (!C7884036c.LIZ() && !C1394640mOc.LIZ() && C0C64.LJIILLIIL().LJIJ(31744, 0, "detail_page_need_friend_tag", true) != 1) {
                    return c1394630mObLJ;
                }
                if (aweme.getDetailPageVideoTag() == VideoTag.FRIENDS_VIDEO) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c1394630mObLJ.LLJILLL = str;
                return c1394630mObLJ;
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZJ(X.C1387240mCg r11) {
                /*
                    Method dump skipped, instruction units count: 355
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1394620mOa.LIZJ(X.0mCg):X.04zy");
            }

            public static String LIZLLL(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static X.C1394630mOb LJ(X.C1387240mCg r10, boolean r11, boolean r12) {
                /*
                    Method dump skipped, instruction units count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1394620mOa.LJ(X.0mCg, boolean, boolean):X.0mOb");
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C017G>() { // from class: X.0mBA
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                String from;
                String str;
                HashMap<String, String> mobParams;
                String str2;
                HashMap<String, String> mobParams2;
                Aweme aweme = c1387240mCg.LIZ;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                String str3 = null;
                if (baseControllerContext != null) {
                    from = baseControllerContext.getFrom();
                } else {
                    from = null;
                }
                C017G c017g = new C017G();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, Object> mapLJII = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJII(aweme);
                if (mapLJII != null) {
                    for (Map.Entry<String, Object> entry : mapLJII.entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                }
                if (TextUtils.equals(from, "from_ecom_search_inflow_v2")) {
                    if (aweme != null && (mobParams2 = aweme.getMobParams()) != null) {
                        str3 = mobParams2.get("is_inner");
                    }
                    String str4 = "";
                    if (Intrinsics.LJFF(str3, "1")) {
                        if (aweme != null && (mobParams = aweme.getMobParams()) != null && (str2 = mobParams.get("inner_search_id")) != null) {
                            str4 = str2;
                        }
                        linkedHashMap.put("inner_search_id", str4);
                        linkedHashMap.put("is_inner", "1");
                    } else {
                        linkedHashMap.put("inner_search_id", "");
                        linkedHashMap.put("is_inner", CardStruct.IStatusCode.DEFAULT);
                    }
                    C1766860w4y.LIZ.getClass();
                    Map mapLIZJ = C1766860w4y.LIZJ("search_entrance_second", "search_entrance", "outer_result_id");
                    if (mapLIZJ != null) {
                        for (Map.Entry entry2 : mapLIZJ.entrySet()) {
                            if (Intrinsics.LJFF(entry2.getKey(), "search_entrance_second")) {
                                String str5 = (String) entry2.getValue();
                                if (str5 != null && str5.length() > 0) {
                                    linkedHashMap.put("search_entrance_second", str5);
                                }
                            } else if (Intrinsics.LJFF(entry2.getKey(), "search_entrance")) {
                                String str6 = (String) entry2.getValue();
                                if (str6 != null && str6.length() > 0) {
                                    linkedHashMap.put("search_entrance", str6);
                                }
                            } else if (Intrinsics.LJFF(entry2.getKey(), "outer_result_id") && (str = (String) entry2.getValue()) != null && str.length() > 0) {
                                linkedHashMap.put("outer_result_id", str);
                            }
                        }
                    }
                }
                c017g.LL = linkedHashMap;
                return c017g;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                String from;
                String str;
                HashMap<String, String> mobParams;
                String str2;
                HashMap<String, String> mobParams2;
                Aweme aweme = c1387240mCg.LIZ;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                String str3 = null;
                if (baseControllerContext != null) {
                    from = baseControllerContext.getFrom();
                } else {
                    from = null;
                }
                C017G c017g = new C017G();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, Object> mapLJII = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJII(aweme);
                if (mapLJII != null) {
                    for (Map.Entry<String, Object> entry : mapLJII.entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                }
                if (TextUtils.equals(from, "from_ecom_search_inflow_v2")) {
                    if (aweme != null && (mobParams2 = aweme.getMobParams()) != null) {
                        str3 = mobParams2.get("is_inner");
                    }
                    String str4 = "";
                    if (Intrinsics.LJFF(str3, "1")) {
                        if (aweme != null && (mobParams = aweme.getMobParams()) != null && (str2 = mobParams.get("inner_search_id")) != null) {
                            str4 = str2;
                        }
                        linkedHashMap.put("inner_search_id", str4);
                        linkedHashMap.put("is_inner", "1");
                    } else {
                        linkedHashMap.put("inner_search_id", "");
                        linkedHashMap.put("is_inner", CardStruct.IStatusCode.DEFAULT);
                    }
                    C1766860w4y.LIZ.getClass();
                    Map mapLIZJ = C1766860w4y.LIZJ("search_entrance_second", "search_entrance", "outer_result_id");
                    if (mapLIZJ != null) {
                        for (Map.Entry entry2 : mapLIZJ.entrySet()) {
                            if (Intrinsics.LJFF(entry2.getKey(), "search_entrance_second")) {
                                String str5 = (String) entry2.getValue();
                                if (str5 != null && str5.length() > 0) {
                                    linkedHashMap.put("search_entrance_second", str5);
                                }
                            } else if (Intrinsics.LJFF(entry2.getKey(), "search_entrance")) {
                                String str6 = (String) entry2.getValue();
                                if (str6 != null && str6.length() > 0) {
                                    linkedHashMap.put("search_entrance", str6);
                                }
                            } else if (Intrinsics.LJFF(entry2.getKey(), "outer_result_id") && (str = (String) entry2.getValue()) != null && str.length() > 0) {
                                linkedHashMap.put("outer_result_id", str);
                            }
                        }
                    }
                }
                c017g.LL = linkedHashMap;
                return c017g;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                String from;
                String str;
                HashMap<String, String> mobParams;
                String str2;
                HashMap<String, String> mobParams2;
                Aweme aweme = c1387240mCg.LIZ;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                String str3 = null;
                if (baseControllerContext != null) {
                    from = baseControllerContext.getFrom();
                } else {
                    from = null;
                }
                C017G c017g = new C017G();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, Object> mapLJII = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJII(aweme);
                if (mapLJII != null) {
                    for (Map.Entry<String, Object> entry : mapLJII.entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                }
                if (TextUtils.equals(from, "from_ecom_search_inflow_v2")) {
                    if (aweme != null && (mobParams2 = aweme.getMobParams()) != null) {
                        str3 = mobParams2.get("is_inner");
                    }
                    String str4 = "";
                    if (Intrinsics.LJFF(str3, "1")) {
                        if (aweme != null && (mobParams = aweme.getMobParams()) != null && (str2 = mobParams.get("inner_search_id")) != null) {
                            str4 = str2;
                        }
                        linkedHashMap.put("inner_search_id", str4);
                        linkedHashMap.put("is_inner", "1");
                    } else {
                        linkedHashMap.put("inner_search_id", "");
                        linkedHashMap.put("is_inner", CardStruct.IStatusCode.DEFAULT);
                    }
                    C1766860w4y.LIZ.getClass();
                    Map mapLIZJ = C1766860w4y.LIZJ("search_entrance_second", "search_entrance", "outer_result_id");
                    if (mapLIZJ != null) {
                        for (Map.Entry entry2 : mapLIZJ.entrySet()) {
                            if (Intrinsics.LJFF(entry2.getKey(), "search_entrance_second")) {
                                String str5 = (String) entry2.getValue();
                                if (str5 != null && str5.length() > 0) {
                                    linkedHashMap.put("search_entrance_second", str5);
                                }
                            } else if (Intrinsics.LJFF(entry2.getKey(), "search_entrance")) {
                                String str6 = (String) entry2.getValue();
                                if (str6 != null && str6.length() > 0) {
                                    linkedHashMap.put("search_entrance", str6);
                                }
                            } else if (Intrinsics.LJFF(entry2.getKey(), "outer_result_id") && (str = (String) entry2.getValue()) != null && str.length() > 0) {
                                linkedHashMap.put("outer_result_id", str);
                            }
                        }
                    }
                }
                c017g.LL = linkedHashMap;
                return c017g;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1387450mD1>() { // from class: X.0mD0
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                String tabName;
                String strCi0;
                String contentSource;
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                C1387450mD1 c1387450mD1 = new C1387450mD1();
                String str = "";
                if (iFeedMobParamsProvider == null || (tabName = iFeedMobParamsProvider.getTabName()) == null) {
                    tabName = "";
                }
                c1387450mD1.LL = tabName;
                String strCi02 = null;
                if (iFeedMobParamsProvider != null) {
                    strCi0 = iFeedMobParamsProvider.Ci0();
                } else {
                    strCi0 = null;
                }
                if (!TextUtils.isEmpty(strCi0)) {
                    if (iFeedMobParamsProvider != null) {
                        strCi02 = iFeedMobParamsProvider.Ci0();
                    }
                    c1387450mD1.LLILLJJLI = strCi02;
                }
                if (iFeedMobParamsProvider != null && (contentSource = iFeedMobParamsProvider.getContentSource()) != null) {
                    str = contentSource;
                }
                c1387450mD1.LLILLL = str;
                LIZLLL(c1387450mD1, c1387240mCg);
                return c1387450mD1;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZIZ(X.C1387240mCg r5) {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel r3 = r5.LIZJ
                    X.0mD1 r2 = new X.0mD1
                    r2.<init>()
                    if (r3 == 0) goto L1d
                    java.lang.String r1 = r3.getTabName()
                    if (r1 == 0) goto L17
                    X.0mD3 r0 = new X.0mD3
                    r0.<init>(r2)
                    X.C1387400mCw.LIZ(r1, r0)
                L17:
                    java.lang.String r0 = r3.getContentSource()
                    if (r0 != 0) goto L1f
                L1d:
                    java.lang.String r0 = ""
                L1f:
                    r2.LLILLL = r0
                    r1 = 0
                    if (r3 == 0) goto L3a
                    java.lang.String r0 = r3.Ci0()
                L28:
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L36
                    if (r3 == 0) goto L34
                    java.lang.String r1 = r3.Ci0()
                L34:
                    r2.LLILLJJLI = r1
                L36:
                    LIZLLL(r2, r5)
                    return r2
                L3a:
                    r0 = r1
                    goto L28
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1387440mD0.LIZIZ(X.0mCg):X.04zy");
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                String tagLine;
                String contentSource;
                String strCi0;
                C2189821An6 param;
                String tabName;
                IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                C1387450mD1 c1387450mD1 = new C1387450mD1();
                if (iBaseListFragmentPanel != null && (tabName = iBaseListFragmentPanel.getTabName()) != null) {
                    C1387400mCw.LIZ(tabName, new C1387460mD2(c1387450mD1));
                }
                String strCi02 = null;
                if (iBaseListFragmentPanel != null && (param = iBaseListFragmentPanel.getParam()) != null) {
                    tagLine = param.getTagLine();
                } else {
                    tagLine = null;
                }
                c1387450mD1.LLILZ = tagLine;
                if (iBaseListFragmentPanel == null || (contentSource = iBaseListFragmentPanel.getContentSource()) == null) {
                    contentSource = "";
                }
                c1387450mD1.LLILLL = contentSource;
                if (iBaseListFragmentPanel != null) {
                    strCi0 = iBaseListFragmentPanel.Ci0();
                } else {
                    strCi0 = null;
                }
                if (!TextUtils.isEmpty(strCi0)) {
                    if (iBaseListFragmentPanel != null) {
                        strCi02 = iBaseListFragmentPanel.Ci0();
                    }
                    c1387450mD1.LLILLJJLI = strCi02;
                }
                LIZLLL(c1387450mD1, c1387240mCg);
                return c1387450mD1;
            }

            public static void LIZLLL(C1387450mD1 c1387450mD1, C1387240mCg c1387240mCg) {
                IFeedMobParamsProvider iFeedMobParamsProvider;
                C2189821An6 param;
                DetailNavArgModel navArgModel;
                IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                if (((iBaseListFragmentPanel != null && (param = iBaseListFragmentPanel.getParam()) != null) || ((iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ) != null && (param = iFeedMobParamsProvider.getParam()) != null)) && (navArgModel = param.getNavArgModel()) != null && Intrinsics.LJFF(navArgModel.isProfileTabSearch(), Boolean.TRUE)) {
                    c1387450mD1.LLILZIL = "1";
                    String profileTabSearchId = navArgModel.getProfileTabSearchId();
                    if (profileTabSearchId == null) {
                        profileTabSearchId = "";
                    }
                    c1387450mD1.LLILZLL = profileTabSearchId;
                }
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C2189871AnB>() { // from class: X.1AnA
            /* JADX WARN: Removed duplicated region for block: B:162:0x0212  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZ(X.C1387240mCg r11) {
                /*
                    Method dump skipped, instruction units count: 554
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2189861AnA.LIZ(X.0mCg):X.04zy");
            }

            /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZIZ(X.C1387240mCg r11) {
                /*
                    Method dump skipped, instruction units count: 913
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2189861AnA.LIZIZ(X.0mCg):X.04zy");
            }

            /* JADX WARN: Removed duplicated region for block: B:83:0x010c  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZJ(X.C1387240mCg r12) {
                /*
                    Method dump skipped, instruction units count: 862
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2189861AnA.LIZJ(X.0mCg):X.04zy");
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1386770mBv>() { // from class: X.0mBu
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                C2189821An6 param;
                Map<String, String> extra;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                if (baseControllerContext == null) {
                    return new C1386770mBv();
                }
                String strCf = baseControllerContext.Cf();
                int pageType = baseControllerContext.getPageType();
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                C1386770mBv c1386770mBv = new C1386770mBv();
                if (strCf != null && u.LJJIIJZLJL(strCf, "gamecp", false) && param != null && param.getExtra() != null) {
                    LJ(c1386770mBv, param.getExtra());
                }
                if (pageType != 72 || param == null || (extra = param.getExtra()) == null) {
                    return c1386770mBv;
                }
                LIZLLL(c1386770mBv, extra);
                return c1386770mBv;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                C2189821An6 param;
                Integer numValueOf;
                Integer numValueOf2;
                Map<String, String> extra;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                if (baseControllerContext == null) {
                    return new C1386770mBv();
                }
                String strCf = baseControllerContext.Cf();
                int pageType = baseControllerContext.getPageType();
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                Integer numValueOf3 = null;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                C1386770mBv c1386770mBv = new C1386770mBv();
                if (strCf != null && u.LJJIIJZLJL(strCf, "gamecp", false) && param != null && param.getExtra() != null) {
                    LJ(c1386770mBv, param.getExtra());
                }
                if (pageType == 72 && param != null && (extra = param.getExtra()) != null) {
                    LIZLLL(c1386770mBv, extra);
                }
                if (!u.LJIJI(strCf, "homepage_hot", true) && !u.LJIJI(strCf, "homepage_follow", true)) {
                    return c1386770mBv;
                }
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme != null) {
                    numValueOf = Integer.valueOf(AwemeBizExtKt.getSessionPosition(aweme));
                } else {
                    numValueOf = null;
                }
                c1386770mBv.LLJJI = String.valueOf(numValueOf);
                Aweme aweme2 = c1387240mCg.LIZ;
                if (aweme2 != null) {
                    numValueOf2 = Integer.valueOf(AwemeBizExtKt.getSessionRequestPosition(aweme2));
                } else {
                    numValueOf2 = null;
                }
                c1386770mBv.LLJJIII = String.valueOf(numValueOf2);
                Aweme aweme3 = c1387240mCg.LIZ;
                if (aweme3 != null) {
                    numValueOf3 = Integer.valueOf(AwemeBizExtKt.getPositionInRequest(aweme3));
                }
                c1386770mBv.LLJJIJI = String.valueOf(numValueOf3);
                return c1386770mBv;
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZJ(X.C1387240mCg r17) {
                /*
                    Method dump skipped, instruction units count: 393
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1386760mBu.LIZJ(X.0mCg):X.04zy");
            }

            public static void LIZLLL(C1386770mBv c1386770mBv, Map map) {
                c1386770mBv.LLJJJ = (String) map.get("related_live_tag");
                c1386770mBv.LLJJIJIL = (String) map.get("game_bottom_bar_scene");
            }

            public static void LJ(C1386770mBv c1386770mBv, Map map) {
                String str = c1386770mBv.LLILLL;
                if (str == null || str.length() == 0) {
                    c1386770mBv.LLILLL = (String) map.get("game_id");
                }
                String str2 = c1386770mBv.LLILZIL;
                if (str2 == null || str2.length() == 0) {
                    c1386770mBv.LLILZIL = (String) map.get("game_tag_id");
                }
                c1386770mBv.LLILLJJLI = (String) map.get("game_name");
                c1386770mBv.LLILZ = (String) map.get("game_tag_name");
                c1386770mBv.LLILZLL = (String) map.get("game_first_scene");
                c1386770mBv.LLIZ = (String) map.get("game_second_scene");
                c1386770mBv.LLIZLLLIL = (String) map.get("game_third_scene");
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1386710mBp>() { // from class: X.0mBo
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                C2189821An6 param;
                C1386710mBp c1386710mBp = new C1386710mBp();
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                c1386710mBp.LLILZIL = param;
                c1386710mBp.LLILZLL = c1387240mCg.LIZ;
                return c1386710mBp;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                C2189821An6 param;
                C1386710mBp c1386710mBp = new C1386710mBp();
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                c1386710mBp.LLILZIL = param;
                c1386710mBp.LLILZLL = c1387240mCg.LIZ;
                return c1386710mBp;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZJ(X.C1387240mCg r7) {
                /*
                    r6 = this;
                    com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.LIZ
                    X.0mBp r3 = new X.0mBp
                    r3.<init>()
                    boolean r0 = X.C735370Ssx.LJJIJIL(r1)
                    java.lang.String r5 = "1"
                    java.lang.String r4 = "0"
                    if (r0 == 0) goto L80
                    r0 = r5
                L12:
                    r3.LL = r0
                    r2 = 0
                    if (r1 == 0) goto L76
                    com.ss.android.ugc.aweme.feed.model.Video r0 = r1.getVideo()
                    if (r0 == 0) goto L27
                    boolean r0 = X.C735370Ssx.LJJIIJZLJL(r1)
                    if (r0 == 0) goto L66
                    java.lang.String r0 = "fake_landscape"
                    r3.LLILLJJLI = r0
                L27:
                    if (r1 == 0) goto L76
                    com.ss.android.ugc.aweme.music.model.Music r0 = r1.getMusic()
                    if (r0 == 0) goto L76
                    com.ss.android.ugc.aweme.music.model.Music r0 = r1.getMusic()
                    if (r0 == 0) goto L64
                    boolean r0 = r0.isPgc()
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                L3d:
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    r3.LLILLL = r0
                L43:
                    com.ss.android.ugc.aweme.feed.model.RecReasonEntry r0 = r1.getRecReasonTag()
                    if (r0 == 0) goto L7d
                    int r1 = r0.type
                    com.ss.android.ugc.aweme.feed.model.RecReasonEntryType r0 = com.ss.android.ugc.aweme.feed.model.RecReasonEntryType.SRP
                    int r0 = r0.getType()
                    if (r1 != r0) goto L7d
                    r3.LLILZ = r5
                L55:
                    com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider r0 = r7.LJIIIIZZ
                    if (r0 == 0) goto L5d
                    X.1An6 r2 = r0.getParam()
                L5d:
                    r3.LLILZIL = r2
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LIZ
                    r3.LLILZLL = r0
                    return r3
                L64:
                    r0 = r2
                    goto L3d
                L66:
                    boolean r0 = X.C735370Ssx.LJJIJIL(r1)
                    if (r0 == 0) goto L71
                    java.lang.String r0 = "landscape"
                    r3.LLILLJJLI = r0
                    goto L27
                L71:
                    java.lang.String r0 = "portrait"
                    r3.LLILLJJLI = r0
                    goto L27
                L76:
                    java.lang.String r0 = "false"
                    r3.LLILLL = r0
                    if (r1 == 0) goto L7d
                    goto L43
                L7d:
                    r3.LLILZ = r4
                    goto L55
                L80:
                    r0 = r4
                    goto L12
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1386700mBo.LIZJ(X.0mCg):X.04zy");
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1386830mC1>() { // from class: X.0mC2
            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                Float fValueOf;
                C1387230mCf c1387230mCf = c1387240mCg.LJII;
                C1386830mC1 c1386830mC1 = new C1386830mC1();
                if (c1387230mCf != null) {
                    fValueOf = Float.valueOf(c1387230mCf.LLJI);
                } else {
                    fValueOf = null;
                }
                c1386830mC1.LLILLL = String.valueOf(fValueOf);
                return c1386830mC1;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    return new C1386830mC1();
                }
                C1386830mC1 c1386830mC1 = new C1386830mC1();
                float fLIZIZ = C585860MyO.LIZIZ(aweme);
                if (fLIZIZ > 0.0f) {
                    c1386830mC1.LL = "1";
                    c1386830mC1.LLILLJJLI = String.valueOf(fLIZIZ);
                    return c1386830mC1;
                }
                c1386830mC1.LL = CardStruct.IStatusCode.DEFAULT;
                c1386830mC1.LLILLJJLI = "1.0";
                return c1386830mC1;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1514240pVW>() { // from class: X.0pVV
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                String str;
                List<String> urlList;
                Aweme aweme = c1387240mCg.LIZ;
                String str2 = CardStruct.IStatusCode.DEFAULT;
                String str3 = "";
                if (aweme == null) {
                    C1514240pVW c1514240pVW = new C1514240pVW();
                    c1514240pVW.LL = CardStruct.IStatusCode.DEFAULT;
                    c1514240pVW.LLILLJJLI = "";
                    c1514240pVW.LLILLL = "";
                    return c1514240pVW;
                }
                C1514240pVW c1514240pVW2 = new C1514240pVW();
                if (aweme.getPodcastInfo() != null) {
                    if (Intrinsics.LJFF(aweme.getPodcastInfo().isPodcastPreview(), Boolean.TRUE)) {
                        str2 = "1";
                    }
                    c1514240pVW2.LL = str2;
                    PodcastUrlModel playAddr = aweme.getPodcastInfo().getPlayAddr();
                    if (playAddr == null || (urlList = playAddr.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
                        str = "";
                    }
                    c1514240pVW2.LLILLJJLI = str;
                    String episodeItemId = aweme.getPodcastInfo().getEpisodeItemId();
                    if (episodeItemId != null) {
                        str3 = episodeItemId;
                    }
                    c1514240pVW2.LLILLL = str3;
                    return c1514240pVW2;
                }
                c1514240pVW2.LL = CardStruct.IStatusCode.DEFAULT;
                c1514240pVW2.LLILLJJLI = "";
                c1514240pVW2.LLILLL = "";
                return c1514240pVW2;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZIZ(X.C1387240mCg r8) {
                /*
                    r7 = this;
                    com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.LIZ
                    if (r5 != 0) goto La
                    X.0pVW r3 = new X.0pVW
                    r3.<init>()
                    return r3
                La:
                    X.0pVW r3 = new X.0pVW
                    r3.<init>()
                    com.ss.android.ugc.aweme.feed.model.PodcastInfo r0 = r5.getPodcastInfo()
                    java.lang.String r2 = "0"
                    java.lang.String r4 = ""
                    if (r0 == 0) goto Lc1
                    com.ss.android.ugc.aweme.feed.model.PodcastInfo r0 = r5.getPodcastInfo()
                    java.lang.Boolean r0 = r0.isPodcastPreview()
                    if (r0 == 0) goto Lba
                    com.ss.android.ugc.aweme.feed.model.PodcastInfo r0 = r5.getPodcastInfo()
                    java.lang.Boolean r1 = r0.isPodcastPreview()
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto Lba
                    java.lang.String r0 = "1"
                    r3.LL = r0
                L37:
                    com.ss.android.ugc.aweme.feed.model.PodcastInfo r0 = r5.getPodcastInfo()
                    com.ss.android.ugc.aweme.feed.model.PodcastUrlModel r0 = r0.getPlayAddr()
                    if (r0 == 0) goto Lb7
                    com.ss.android.ugc.aweme.feed.model.PodcastInfo r0 = r5.getPodcastInfo()
                    com.ss.android.ugc.aweme.feed.model.PodcastUrlModel r1 = r0.getPlayAddr()
                    r0 = 0
                    if (r1 == 0) goto Lb7
                    java.util.List r1 = r1.getUrlList()
                    if (r1 == 0) goto Lb7
                    com.ss.android.ugc.aweme.feed.model.PodcastInfo r1 = r5.getPodcastInfo()
                    com.ss.android.ugc.aweme.feed.model.PodcastUrlModel r1 = r1.getPlayAddr()
                    r6 = 0
                    if (r1 == 0) goto Lb7
                    java.util.List r1 = r1.getUrlList()
                    if (r1 == 0) goto Lb7
                    boolean r1 = r1.isEmpty()
                    r2 = 1
                    r1 = r1 ^ 1
                    if (r1 != r2) goto Lb7
                    com.ss.android.ugc.aweme.feed.model.PodcastInfo r1 = r5.getPodcastInfo()
                    com.ss.android.ugc.aweme.feed.model.PodcastUrlModel r1 = r1.getPlayAddr()
                    if (r1 == 0) goto Lb5
                    java.util.List r1 = r1.getUrlList()
                    if (r1 == 0) goto Lb5
                    java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r6)
                    java.lang.String r1 = (java.lang.String) r1
                L82:
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto Lb7
                    com.ss.android.ugc.aweme.feed.model.PodcastInfo r1 = r5.getPodcastInfo()
                    com.ss.android.ugc.aweme.feed.model.PodcastUrlModel r1 = r1.getPlayAddr()
                    if (r1 == 0) goto L9e
                    java.util.List r1 = r1.getUrlList()
                    if (r1 == 0) goto L9e
                    java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r6)
                    java.lang.String r0 = (java.lang.String) r0
                L9e:
                    r3.LLILLJJLI = r0
                La0:
                    com.ss.android.ugc.aweme.feed.model.PodcastInfo r0 = r5.getPodcastInfo()
                    java.lang.String r0 = r0.getEpisodeItemId()
                    if (r0 == 0) goto Lbe
                    com.ss.android.ugc.aweme.feed.model.PodcastInfo r0 = r5.getPodcastInfo()
                    java.lang.String r0 = r0.getEpisodeItemId()
                    r3.LLILLL = r0
                    return r3
                Lb5:
                    r1 = r0
                    goto L82
                Lb7:
                    r3.LLILLJJLI = r4
                    goto La0
                Lba:
                    r3.LL = r2
                    goto L37
                Lbe:
                    r3.LLILLL = r4
                    return r3
                Lc1:
                    r3.LL = r2
                    r3.LLILLJJLI = r4
                    r3.LLILLL = r4
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1514230pVV.LIZIZ(X.0mCg):X.04zy");
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                String str;
                List<String> urlList;
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    return new C1514240pVW();
                }
                C1514240pVW c1514240pVW = new C1514240pVW();
                if (aweme.getPodcastInfo() != null) {
                    if (Intrinsics.LJFF(aweme.getPodcastInfo().isPodcastPreview(), Boolean.TRUE)) {
                        c1514240pVW.LL = "1";
                    } else {
                        c1514240pVW.LL = CardStruct.IStatusCode.DEFAULT;
                    }
                    PodcastUrlModel playAddr = aweme.getPodcastInfo().getPlayAddr();
                    if (playAddr != null && (urlList = playAddr.getUrlList()) != null) {
                        str = (String) C13LP.LJJJLZIJ(0, urlList);
                    } else {
                        str = null;
                    }
                    if (!C123100dR.LIZ(str)) {
                        str = "";
                    }
                    c1514240pVW.LLILLJJLI = str;
                    if (aweme.getPodcastInfo().getEpisodeItemId() != null) {
                        c1514240pVW.LLILLL = aweme.getPodcastInfo().getEpisodeItemId();
                    } else {
                        c1514240pVW.LLILLL = "";
                    }
                } else {
                    c1514240pVW.LL = CardStruct.IStatusCode.DEFAULT;
                    c1514240pVW.LLILLJJLI = "";
                    c1514240pVW.LLILLL = "";
                }
                List<String> ttsVoiceIDs = aweme.getTtsVoiceIDs();
                if (ttsVoiceIDs != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('[');
                    sbLIZ.append(C0N2Q.LIZJ(ttsVoiceIDs));
                    sbLIZ.append(']');
                    c1514240pVW.LLILZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (aweme.getTtsVoiceIDs() != null && (!r0.isEmpty())) {
                        c1514240pVW.LLILZIL = "1";
                    } else {
                        c1514240pVW.LLILZIL = CardStruct.IStatusCode.DEFAULT;
                    }
                }
                List<String> vcVoiceIDs = aweme.getVcVoiceIDs();
                if (vcVoiceIDs == null) {
                    return c1514240pVW;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('[');
                sbLIZ2.append(C0N2Q.LIZJ(vcVoiceIDs));
                sbLIZ2.append(']');
                c1514240pVW.LLILZLL = C2188811AlT.LIZIZ(sbLIZ2);
                return c1514240pVW;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<AnonymousClass0173>() { // from class: X.0Mz9
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return new AnonymousClass0173();
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return new AnonymousClass0173();
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    return new AnonymousClass0173();
                }
                AnonymousClass0173 anonymousClass0173 = new AnonymousClass0173();
                anonymousClass0173.LL = 0L;
                List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
                if (interactStickerStructs == null || interactStickerStructs.size() <= 0) {
                    return anonymousClass0173;
                }
                Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getQaStruct() != null) {
                        anonymousClass0173.LL = 1L;
                        return anonymousClass0173;
                    }
                }
                return anonymousClass0173;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1386510mBV>() { // from class: X.0mBU
            /* JADX WARN: Removed duplicated region for block: B:195:0x03d3  */
            /* JADX WARN: Removed duplicated region for block: B:207:0x03fd  */
            /* JADX WARN: Removed duplicated region for block: B:212:0x040d  */
            /* JADX WARN: Removed duplicated region for block: B:215:0x0419  */
            /* JADX WARN: Removed duplicated region for block: B:229:0x0440  */
            /* JADX WARN: Removed duplicated region for block: B:232:0x044a  */
            /* JADX WARN: Removed duplicated region for block: B:235:0x0452  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x046e  */
            /* JADX WARN: Removed duplicated region for block: B:247:0x047a  */
            /* JADX WARN: Removed duplicated region for block: B:250:0x0482  */
            /* JADX WARN: Removed duplicated region for block: B:253:0x048c  */
            /* JADX WARN: Removed duplicated region for block: B:256:0x0496  */
            /* JADX WARN: Removed duplicated region for block: B:259:0x04a3  */
            /* JADX WARN: Removed duplicated region for block: B:262:0x04ad  */
            /* JADX WARN: Removed duplicated region for block: B:265:0x04b7  */
            /* JADX WARN: Removed duplicated region for block: B:268:0x04c1  */
            /* JADX WARN: Removed duplicated region for block: B:271:0x04cb  */
            /* JADX WARN: Removed duplicated region for block: B:274:0x04d3  */
            /* JADX WARN: Removed duplicated region for block: B:277:0x04db  */
            /* JADX WARN: Removed duplicated region for block: B:280:0x04e3  */
            /* JADX WARN: Removed duplicated region for block: B:283:0x04ed  */
            /* JADX WARN: Removed duplicated region for block: B:286:0x04f7  */
            /* JADX WARN: Removed duplicated region for block: B:289:0x0501  */
            /* JADX WARN: Removed duplicated region for block: B:303:0x0531  */
            /* JADX WARN: Removed duplicated region for block: B:306:0x053b  */
            /* JADX WARN: Removed duplicated region for block: B:329:0x0581  */
            /* JADX WARN: Removed duplicated region for block: B:347:0x05bc  */
            /* JADX WARN: Removed duplicated region for block: B:354:0x05d4  */
            /* JADX WARN: Removed duplicated region for block: B:361:0x05ef  */
            /* JADX WARN: Removed duplicated region for block: B:375:0x062a  */
            /* JADX WARN: Removed duplicated region for block: B:383:0x0650  */
            /* JADX WARN: Removed duplicated region for block: B:386:0x0656  */
            /* JADX WARN: Removed duplicated region for block: B:387:0x066d  */
            /* JADX WARN: Removed duplicated region for block: B:389:0x0670  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
            /* JADX WARN: Removed duplicated region for block: B:401:0x0692  */
            /* JADX WARN: Removed duplicated region for block: B:402:0x0695  */
            /* JADX WARN: Removed duplicated region for block: B:406:0x069f  */
            /* JADX WARN: Removed duplicated region for block: B:408:0x06a5  */
            /* JADX WARN: Removed duplicated region for block: B:411:0x06ad  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:423:0x06e0  */
            /* JADX WARN: Removed duplicated region for block: B:426:0x06f9  */
            /* JADX WARN: Removed duplicated region for block: B:428:0x06ff  */
            /* JADX WARN: Removed duplicated region for block: B:429:0x0703  */
            /* JADX WARN: Removed duplicated region for block: B:430:0x0706  */
            /* JADX WARN: Removed duplicated region for block: B:434:0x0716 A[PHI: r34
              0x0716: PHI (r34v1 java.lang.String) = (r34v0 java.lang.String), (r34v3 java.lang.String) binds: [B:432:0x0712, B:35:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0112  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0116 A[PHI: r22
              0x0116: PHI (r22v9 java.lang.String) = (r22v0 java.lang.String), (r22v10 java.lang.String) binds: [B:67:0x0114, B:65:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0122  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZ(X.C1387240mCg r38) {
                /*
                    Method dump skipped, instruction units count: 1849
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1386500mBU.LIZ(X.0mCg):X.04zy");
            }

            /* JADX WARN: Can't wrap try/catch for region: R(105:6|(1:8)(1:103)|9|(1:11)(1:102)|12|(6:14|(1:16)(1:100)|17|(1:99)(1:21)|22|(1:26))(1:101)|27|(1:29)|30|(1:32)(1:98)|(1:34)(1:97)|(93:93|(0)(1:96)|(1:43)(1:92)|44|(2:46|(1:48)(1:91))(2:(2:90|48)|91)|49|(1:51)(1:88)|52|(1:56)|(1:58)(1:87)|59|(1:(1:62)(1:67))(2:68|(2:73|(2:75|(1:77))(4:78|(1:80)(1:86)|81|(1:85)))(1:72))|(1:64)(1:66)|65|104|541|105|(2:113|(1:115)(1:469))(0)|116|(1:468)(7:(1:119)(1:467)|(1:466)(1:123)|124|(3:132|(1:134)|135)|(3:139|(1:141)|142)|143|(4:147|(1:149)|150|(2:152|(32:154|(1:156)|157|(1:159)|160|(1:162)|163|(1:165)(1:465)|166|(1:168)|169|(1:171)|172|(1:174)(1:464)|175|(1:177)|178|(1:180)|181|(1:183)(1:463)|184|(1:186)(1:462)|187|(1:189)(1:461)|190|(1:192)(1:460)|193|(1:195)(1:459)|196|(1:198)(1:458)|199|(1:201)(1:457))(0))(0))(0))|(1:203)(1:456)|204|(1:455)(5:207|(14:209|(1:213)|214|(1:218)|219|(1:231)|232|(1:234)|235|(1:237)|238|(1:240)|241|(1:243))|244|(1:246)(1:454)|247)|248|(3:(1:251)(1:453)|252|(1:259))|(1:263)|(1:267)|268|(1:270)|271|(4:273|(1:275)|276|(8:448|(1:284)(1:451)|285|(1:287)(1:447)|288|(1:290)|291|(4:(1:294)(1:446)|295|(1:(1:298)(1:445))|299))(9:280|(9:282|(0)|284|285|(0)(0)|288|(0)|291|(0))|451|285|(0)(0)|288|(0)|291|(0)))(1:452)|300|(1:302)|303|(2:305|(1:307))|308|(1:310)|311|(3:315|(2:(1:442)(1:444)|443)(1:319)|(7:322|(3:324|(1:326)|327)|328|(1:330)(1:440)|331|(1:333)(1:439)|334))|335|(1:337)|338|(1:340)|341|(1:343)|344|(1:346)|347|(1:349)|350|(1:352)|353|(1:355)|356|(1:358)|359|(1:361)|362|(1:364)|365|(1:367)|368|(1:370)|371|(1:373)|374|(1:376)|377|(1:379)|380|(2:382|(1:(2:(1:386)(1:431)|387))(3:(1:433)|(1:437)|438))|388|(1:398)|399|(1:401)|(1:430)(1:409)|410|(1:416)|417|(2:539|470)|(1:476)|477|(1:(2:486|(1:490)))(5:(1:536)(1:482)|483|(1:485)(0)|486|(2:488|490))|491|(4:493|(2:497|(2:499|(1:510)(4:501|(1:507)|508|(0))))|511|(1:513))(1:535)|514|(1:516)|517|(1:521)|522|(1:524)|525|526)(1:38)|39|(1:41)(0)|(0)(0)|44|(0)(0)|49|(0)(0)|52|(2:54|56)|(0)(0)|59|(0)(0)|(0)(0)|65|104|541|105|(3:111|113|(0)(0))(0)|116|(0)(0)|(0)(0)|204|(1:455)(0)|248|(0)|(2:261|263)|(2:265|267)|268|(0)|271|(0)(0)|300|(0)|303|(0)|308|(0)|311|(3:313|315|(4:317|(0)(0)|443|(7:322|(0)|328|(0)(0)|331|(0)(0)|334))(0))(0)|335|(0)|338|(0)|341|(0)|344|(0)|347|(0)|350|(0)|353|(0)|356|(0)|359|(0)|362|(0)|365|(0)|368|(0)|371|(0)|374|(0)|377|(0)|380|(0)|388|(3:390|396|398)(2:396|398)|399|(0)|(2:403|430)(0)|410|(3:412|414|416)|417|(6:421|423|425|427|539|470)(4:419|427|539|470)|(2:474|476)|477|(0)(0)|491|(0)(0)|514|(0)|517|(2:519|521)(0)|522|(0)|525|526) */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x018c, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x018d, code lost:
            
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:113:0x0198  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x019c  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x01a7  */
            /* JADX WARN: Removed duplicated region for block: B:152:0x0226 A[PHI: r6
              0x0226: PHI (r6v10 java.util.Map<java.lang.String, java.lang.String>) = (r6v8 java.util.Map<java.lang.String, java.lang.String>), (r6v14 java.util.Map<java.lang.String, java.lang.String>) binds: [B:151:0x0224, B:146:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:203:0x039c  */
            /* JADX WARN: Removed duplicated region for block: B:250:0x04a9  */
            /* JADX WARN: Removed duplicated region for block: B:270:0x04e8  */
            /* JADX WARN: Removed duplicated region for block: B:273:0x04f2  */
            /* JADX WARN: Removed duplicated region for block: B:287:0x0519  */
            /* JADX WARN: Removed duplicated region for block: B:290:0x0523  */
            /* JADX WARN: Removed duplicated region for block: B:293:0x052b  */
            /* JADX WARN: Removed duplicated region for block: B:302:0x0547  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x0552  */
            /* JADX WARN: Removed duplicated region for block: B:310:0x0570  */
            /* JADX WARN: Removed duplicated region for block: B:315:0x0584  */
            /* JADX WARN: Removed duplicated region for block: B:324:0x05b1  */
            /* JADX WARN: Removed duplicated region for block: B:330:0x05dc  */
            /* JADX WARN: Removed duplicated region for block: B:333:0x05e6  */
            /* JADX WARN: Removed duplicated region for block: B:337:0x05fb  */
            /* JADX WARN: Removed duplicated region for block: B:340:0x0605  */
            /* JADX WARN: Removed duplicated region for block: B:343:0x060f  */
            /* JADX WARN: Removed duplicated region for block: B:346:0x061c  */
            /* JADX WARN: Removed duplicated region for block: B:349:0x0626  */
            /* JADX WARN: Removed duplicated region for block: B:352:0x0630  */
            /* JADX WARN: Removed duplicated region for block: B:355:0x063a  */
            /* JADX WARN: Removed duplicated region for block: B:358:0x0644  */
            /* JADX WARN: Removed duplicated region for block: B:361:0x064e  */
            /* JADX WARN: Removed duplicated region for block: B:364:0x0656  */
            /* JADX WARN: Removed duplicated region for block: B:367:0x065e  */
            /* JADX WARN: Removed duplicated region for block: B:370:0x0668  */
            /* JADX WARN: Removed duplicated region for block: B:373:0x0672  */
            /* JADX WARN: Removed duplicated region for block: B:376:0x067c  */
            /* JADX WARN: Removed duplicated region for block: B:379:0x0686  */
            /* JADX WARN: Removed duplicated region for block: B:382:0x0690  */
            /* JADX WARN: Removed duplicated region for block: B:401:0x06d2  */
            /* JADX WARN: Removed duplicated region for block: B:430:0x0729  */
            /* JADX WARN: Removed duplicated region for block: B:439:0x0742  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
            /* JADX WARN: Removed duplicated region for block: B:440:0x0745  */
            /* JADX WARN: Removed duplicated region for block: B:441:0x0748  */
            /* JADX WARN: Removed duplicated region for block: B:442:0x074a  */
            /* JADX WARN: Removed duplicated region for block: B:444:0x0754  */
            /* JADX WARN: Removed duplicated region for block: B:447:0x075d  */
            /* JADX WARN: Removed duplicated region for block: B:448:0x0760  */
            /* JADX WARN: Removed duplicated region for block: B:452:0x076a  */
            /* JADX WARN: Removed duplicated region for block: B:455:0x0774  */
            /* JADX WARN: Removed duplicated region for block: B:456:0x0779  */
            /* JADX WARN: Removed duplicated region for block: B:468:0x07ab  */
            /* JADX WARN: Removed duplicated region for block: B:469:0x07bf A[PHI: r28
              0x07bf: PHI (r28v7 java.lang.String) = (r28v0 java.lang.String), (r28v8 java.lang.String) binds: [B:114:0x019a, B:112:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:479:0x07e4  */
            /* JADX WARN: Removed duplicated region for block: B:493:0x081f  */
            /* JADX WARN: Removed duplicated region for block: B:510:0x0850  */
            /* JADX WARN: Removed duplicated region for block: B:516:0x0873  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:521:0x0885  */
            /* JADX WARN: Removed duplicated region for block: B:524:0x0891  */
            /* JADX WARN: Removed duplicated region for block: B:535:0x08a7  */
            /* JADX WARN: Removed duplicated region for block: B:537:0x08c1  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x00fd  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x013e  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0142  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x0145  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x0150  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x015b A[PHI: r37
              0x015b: PHI (r37v1 java.lang.String) = (r37v0 java.lang.String), (r37v3 java.lang.String) binds: [B:94:0x0157, B:40:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Type inference failed for: r12v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
            /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r12v5, types: [java.util.Map<java.lang.String, java.lang.String>] */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZIZ(X.C1387240mCg r40) {
                /*
                    Method dump skipped, instruction units count: 2245
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1386500mBU.LIZIZ(X.0mCg):X.04zy");
            }

            /* JADX WARN: Removed duplicated region for block: B:117:0x01d0 A[PHI: r3
              0x01d0: PHI (r3v7 java.util.Map<java.lang.String, java.lang.String>) = (r3v5 java.util.Map<java.lang.String, java.lang.String>), (r3v8 java.util.Map<java.lang.String, java.lang.String>) binds: [B:116:0x01ce, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:245:0x04b1  */
            /* JADX WARN: Removed duplicated region for block: B:248:0x04bb  */
            /* JADX WARN: Removed duplicated region for block: B:251:0x04c3  */
            /* JADX WARN: Removed duplicated region for block: B:400:0x06d3  */
            /* JADX WARN: Removed duplicated region for block: B:401:0x06d6  */
            /* JADX WARN: Removed duplicated region for block: B:420:0x0716  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x0149 A[PHI: r21
              0x0149: PHI (r21v8 java.lang.String) = (r21v0 java.lang.String), (r21v9 java.lang.String) binds: [B:81:0x0147, B:79:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZJ(X.C1387240mCg r36) {
                /*
                    Method dump skipped, instruction units count: 1834
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1386500mBU.LIZJ(X.0mCg):X.04zy");
            }

            public static boolean LIZLLL(String str, String str2) {
                if (TextUtils.equals(str, "general_search") || TextUtils.equals(str, "search_result") || TextUtils.equals(str, "search_ecommerce") || TextUtils.equals(str, "search_music") || C1ER1.LIZIZ.LLJJL(str) || (TextUtils.equals(str, "others_homepage") && !TextUtils.isEmpty(str2))) {
                    return true;
                }
                if (TextUtils.equals(str, "single_song") && !TextUtils.isEmpty(str2)) {
                    return true;
                }
                if (TextUtils.equals(str, "challenge") && !TextUtils.isEmpty(str2)) {
                    return true;
                }
                return false;
            }

            public static void LJ(Map map, Map map2) {
                if (Intrinsics.LJFF(map.get("token_type"), "tt_inspire_gallery")) {
                    Object obj = map.get("is_page");
                    if (obj != null) {
                        ((HashMap) map2).put("is_page", obj);
                    }
                    Object obj2 = map.get("fullscreen_actual_rank");
                    if (obj2 != null) {
                        ((HashMap) map2).put("fullscreen_actual_rank", obj2);
                    }
                }
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1386490mBT>() { // from class: X.0mBS
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                String strCf;
                Integer numValueOf;
                C2189821An6 param;
                VerticalViewPager verticalViewPagerLLLIIIIL;
                String strLJIIJ;
                String str;
                String repostFromGroupId;
                String repostFromUserId;
                String repostFromUserId2;
                Aweme aweme = c1387240mCg.LIZ;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                String profileSearchId = null;
                if (baseControllerContext != null) {
                    strCf = baseControllerContext.Cf();
                } else {
                    strCf = null;
                }
                C1386490mBT c1386490mBT = new C1386490mBT();
                if (C735370Ssx.LJJIJ(strCf)) {
                    if (aweme != null) {
                        AwemeExtKt.isImage(aweme);
                    }
                    c1386490mBT.LL = "1";
                    c1386490mBT.LLILLJJLI = 1;
                    C1386210mB1.LIZ.getClass();
                    c1386490mBT.LLILLL = C1386210mB1.LIZIZ;
                    c1386490mBT.LLILZ = 0;
                    c1386490mBT.LLILZIL = C1386210mB1.LIZJ;
                }
                if (aweme != null && (repostFromGroupId = AwemeExtKt.getRepostFromGroupId(aweme)) != null && repostFromGroupId.length() != 0) {
                    c1386490mBT.LLILZLL = "1";
                    if (aweme != null) {
                        repostFromUserId = AwemeExtKt.getRepostFromUserId(aweme);
                    } else {
                        repostFromUserId = null;
                    }
                    c1386490mBT.LLIZ = repostFromUserId;
                    if (aweme != null) {
                        repostFromUserId2 = AwemeExtKt.getRepostFromUserId(aweme);
                    } else {
                        repostFromUserId2 = null;
                    }
                    c1386490mBT.LLIZLLLIL = repostFromUserId2;
                }
                if (C735370Ssx.LJJIIZI(strCf)) {
                    if (C10EU.LJIIJJI(aweme)) {
                        str = "follow";
                    } else {
                        str = "unfollow";
                    }
                    c1386490mBT.LLJ = str;
                    c1386490mBT.LLJIJIL = C735370Ssx.LJIIIIZZ(aweme);
                    c1386490mBT.LLJILJIL = C735370Ssx.LJII(aweme);
                }
                if (TextUtils.equals(strCf, "homepage_hot") || TextUtils.equals(strCf, "homepage_follow")) {
                    String strLJIILLIIL = C735370Ssx.LJIILLIIL(aweme);
                    if (!TextUtils.isEmpty(strLJIILLIIL)) {
                        c1386490mBT.LLJI = strLJIILLIIL;
                    }
                }
                if (!C727520SgI.LJFF(aweme)) {
                    c1386490mBT.LLJI = C727520SgI.LIZJ(aweme);
                    c1386490mBT.LLJ = C727520SgI.LIZ(aweme);
                }
                if (aweme != null) {
                    if (aweme.getIsTikTokStory()) {
                        strLJIIJ = C735370Ssx.LJIJJLI(aweme.getAuthor());
                    } else {
                        strLJIIJ = C735370Ssx.LJIIJ(aweme);
                    }
                    if (!TextUtils.isEmpty(strLJIIJ)) {
                        c1386490mBT.LLJILJILJ = strLJIIJ;
                    }
                    User author = aweme.getAuthor();
                    if (author != null) {
                        c1386490mBT.LLJJIII = Integer.valueOf(author.getFollowStatusRelation());
                    }
                }
                if (Intrinsics.LJFF("self_profile_search_result_feed", strCf) || Intrinsics.LJFF("other_profile_search_result_feed", strCf)) {
                    IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel != null && (verticalViewPagerLLLIIIIL = iBaseListFragmentPanel.LLLIIIIL()) != null) {
                        numValueOf = Integer.valueOf(verticalViewPagerLLLIIIIL.getCurrentItem());
                    } else {
                        numValueOf = null;
                    }
                    c1386490mBT.LLJJJ = String.valueOf(numValueOf);
                    IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                    if (iFeedMobParamsProvider != null && (param = iFeedMobParamsProvider.getParam()) != null) {
                        profileSearchId = param.getProfileSearchId();
                    }
                    c1386490mBT.LLJJJIL = profileSearchId;
                }
                CommentService.LIZ.getClass();
                Map<String, String> contentRecReasonParams = C523420Kfs.LIZ().getContentRecReasonParams(aweme, strCf);
                if (contentRecReasonParams != null) {
                    c1386490mBT.LLJLLL = contentRecReasonParams.get("query_id");
                    c1386490mBT.LLJZ = contentRecReasonParams.get("recalled_query");
                    c1386490mBT.LLJZIJLIL = contentRecReasonParams.get("recalled_query_search_ts");
                }
                if (aweme != null) {
                    LJFF(c1386490mBT, aweme);
                }
                LJ(c1386490mBT, c1387240mCg);
                if (aweme != null) {
                    LIZLLL(c1386490mBT, aweme);
                }
                return c1386490mBT;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                String strCf;
                String repostFromGroupId;
                String str;
                String profileSearchId;
                C2189821An6 param;
                String enterMethodProfile;
                C2189821An6 param2;
                C2189821An6 param3;
                String tabName;
                C2189821An6 param4;
                DetailNavArgModel navArgModel;
                User author;
                String strLJIIJ;
                String str2;
                String repostFromGroupId2;
                String repostFromUserId;
                Aweme aweme = c1387240mCg.LIZ;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                String enterPosition = null;
                if (baseControllerContext != null) {
                    strCf = baseControllerContext.Cf();
                } else {
                    strCf = null;
                }
                C1386490mBT c1386490mBT = new C1386490mBT();
                String str3 = "1";
                if (C735370Ssx.LJJIJ(strCf)) {
                    if (aweme != null) {
                        AwemeExtKt.isImage(aweme);
                    }
                    c1386490mBT.LL = "1";
                    c1386490mBT.LLILLJJLI = 1;
                }
                if (aweme != null) {
                    repostFromGroupId = AwemeExtKt.getRepostFromGroupId(aweme);
                } else {
                    repostFromGroupId = null;
                }
                int pageType = 0;
                if (!TextUtils.isEmpty(repostFromGroupId)) {
                    if (aweme == null || !AwemeSaaSExtKt.isForwardAweme(aweme)) {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1386490mBT.LLILZLL = str3;
                    if (aweme != null) {
                        repostFromGroupId2 = AwemeExtKt.getRepostFromGroupId(aweme);
                    } else {
                        repostFromGroupId2 = null;
                    }
                    c1386490mBT.LLIZ = repostFromGroupId2;
                    if (aweme != null) {
                        repostFromUserId = AwemeExtKt.getRepostFromUserId(aweme);
                    } else {
                        repostFromUserId = null;
                    }
                    c1386490mBT.LLIZLLLIL = repostFromUserId;
                }
                if (C735370Ssx.LJJIIZI(strCf)) {
                    if (C10EU.LJIIJJI(aweme)) {
                        str2 = "follow";
                    } else {
                        str2 = "unfollow";
                    }
                    c1386490mBT.LLJ = str2;
                    c1386490mBT.LLJIJIL = C735370Ssx.LJIIIIZZ(aweme);
                    c1386490mBT.LLJILJIL = C735370Ssx.LJII(aweme);
                }
                if (aweme != null) {
                    if (aweme.getIsTikTokStory()) {
                        strLJIIJ = C735370Ssx.LJIJJLI(aweme.getAuthor());
                    } else {
                        strLJIIJ = C735370Ssx.LJIIJ(aweme);
                    }
                    if (!TextUtils.isEmpty(strLJIIJ)) {
                        c1386490mBT.LLJILJILJ = strLJIIJ;
                    }
                }
                if (TextUtils.equals(strCf, "homepage_hot") || TextUtils.equals(strCf, "homepage_follow")) {
                    String strLJIILLIIL = C735370Ssx.LJIILLIIL(aweme);
                    if (!TextUtils.isEmpty(strLJIILLIIL)) {
                        c1386490mBT.LLJI = strLJIILLIIL;
                    }
                }
                if (aweme != null && (author = aweme.getAuthor()) != null) {
                    c1386490mBT.LLJJIII = Integer.valueOf(author.getFollowStatusRelation());
                }
                if (Intrinsics.LJFF("self_profile_search_result_feed", strCf) || Intrinsics.LJFF("other_profile_search_result_feed", strCf)) {
                    C1387230mCf c1387230mCf = c1387240mCg.LJII;
                    if (c1387230mCf != null) {
                        str = c1387230mCf.LLJLLL;
                    } else {
                        str = null;
                    }
                    c1386490mBT.LLJJJ = str;
                    IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                    if (iFeedMobParamsProvider != null && (param = iFeedMobParamsProvider.getParam()) != null) {
                        profileSearchId = param.getProfileSearchId();
                    } else {
                        profileSearchId = null;
                    }
                    c1386490mBT.LLJJJIL = profileSearchId;
                }
                if (Intrinsics.LJFF("personal_homepage", strCf) || Intrinsics.LJFF("others_homepage", strCf)) {
                    IFeedMobParamsProvider iFeedMobParamsProvider2 = c1387240mCg.LJIIIIZZ;
                    if (iFeedMobParamsProvider2 != null && (param3 = iFeedMobParamsProvider2.getParam()) != null) {
                        enterMethodProfile = param3.getEnterMethodProfile();
                        if (enterMethodProfile != null && enterMethodProfile.length() == 0) {
                            enterMethodProfile = "slide";
                        }
                    } else {
                        enterMethodProfile = null;
                    }
                    c1386490mBT.LLJJJJJIL = enterMethodProfile;
                    c1386490mBT.LLJJJJ = String.valueOf(C1256070in7.LIZ);
                    if (baseControllerContext != null) {
                        pageType = baseControllerContext.getPageType();
                    }
                    c1386490mBT.LLJJJJLIIL = C735370Ssx.LJIILJJIL(pageType, aweme);
                    IFeedMobParamsProvider iFeedMobParamsProvider3 = c1387240mCg.LJIIIIZZ;
                    if (iFeedMobParamsProvider3 != null && (param2 = iFeedMobParamsProvider3.getParam()) != null) {
                        param2.setEnterMethodProfile("");
                    }
                }
                CommentService.LIZ.getClass();
                Map<String, String> contentRecReasonParams = C523420Kfs.LIZ().getContentRecReasonParams(aweme, strCf);
                if (contentRecReasonParams != null) {
                    c1386490mBT.LLJLLL = contentRecReasonParams.get("query_id");
                    c1386490mBT.LLJZ = contentRecReasonParams.get("recalled_query");
                    c1386490mBT.LLJZIJLIL = contentRecReasonParams.get("recalled_query_search_ts");
                }
                if (aweme != null) {
                    LJFF(c1386490mBT, aweme);
                }
                LJ(c1386490mBT, c1387240mCg);
                IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel != null) {
                    tabName = iBaseListFragmentPanel.getTabName();
                } else {
                    tabName = null;
                }
                c1386490mBT.LLLILZ = tabName;
                IBaseListFragmentPanel iBaseListFragmentPanel2 = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel2 != null && (param4 = iBaseListFragmentPanel2.getParam()) != null && (navArgModel = param4.getNavArgModel()) != null) {
                    enterPosition = navArgModel.getEnterPosition();
                }
                c1386490mBT.LLLILZJ = enterPosition;
                if (aweme != null) {
                    LIZLLL(c1386490mBT, aweme);
                }
                return c1386490mBT;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                String strLJIIJ;
                String strL2;
                int i;
                int i2;
                String str;
                String profileSearchId;
                C2189821An6 param;
                String enterMethodProfile;
                String string;
                VerticalViewPager verticalViewPagerLLLIIIIL;
                C2189821An6 param2;
                C1234710iEf c1234710iEf;
                String tabName;
                C2189821An6 param3;
                DetailNavArgModel navArgModel;
                int i3;
                String str2;
                String str3;
                String str4;
                String str5;
                Integer numValueOf;
                String str6;
                String str7;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                if (baseControllerContext == null) {
                    return new C1386490mBT();
                }
                String strCf = baseControllerContext.Cf();
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    return new C1386490mBT();
                }
                IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                C1386490mBT c1386490mBT = new C1386490mBT();
                String str8 = "1";
                int i4 = 0;
                if (C735370Ssx.LJJIJ(strCf)) {
                    AwemeExtKt.isImage(aweme);
                    c1386490mBT.LL = "1";
                    c1386490mBT.LLILLJJLI = 1;
                    C1386210mB1.LIZ.getClass();
                    c1386490mBT.LLILLL = C1386210mB1.LIZIZ;
                    c1386490mBT.LLILZ = 0;
                    c1386490mBT.LLILZIL = C1386210mB1.LIZJ;
                }
                if (!TextUtils.isEmpty(c1386490mBT.LLIZ)) {
                    c1386490mBT.LLILZLL = "1";
                    c1386490mBT.LLIZ = AwemeExtKt.getRepostFromUserId(aweme);
                    c1386490mBT.LLIZLLLIL = AwemeExtKt.getRepostFromUserId(aweme);
                    c1386490mBT.LLJILLL = String.valueOf(C0S77.LIZ(aweme));
                }
                if (C735370Ssx.LJJIIZI(strCf)) {
                    if (C10EU.LJIIJJI(aweme)) {
                        str7 = "follow";
                    } else {
                        str7 = "unfollow";
                    }
                    c1386490mBT.LLJ = str7;
                    c1386490mBT.LLJIJIL = C735370Ssx.LJIIIIZZ(aweme);
                    c1386490mBT.LLJILJIL = C735370Ssx.LJII(aweme);
                }
                if (aweme.getIsTikTokStory()) {
                    strLJIIJ = C735370Ssx.LJIJJLI(aweme.getAuthor());
                } else {
                    strLJIIJ = C735370Ssx.LJIIJ(aweme);
                }
                if (!TextUtils.isEmpty(strLJIIJ)) {
                    c1386490mBT.LLJILJILJ = strLJIIJ;
                }
                if (TextUtils.equals(strCf, "homepage_hot") || TextUtils.equals(strCf, "homepage_follow")) {
                    String strLJIILLIIL = C735370Ssx.LJIILLIIL(aweme);
                    if (!TextUtils.isEmpty(strLJIILLIIL)) {
                        c1386490mBT.LLJI = strLJIILLIIL;
                    }
                }
                Activity activity = baseControllerContext.getActivity();
                String str9 = "";
                if (!TextUtils.equals(baseControllerContext.Cf(), "homepage_friends") || activity == null) {
                    strL2 = "";
                } else {
                    strL2 = C1589640rT8.LIZIZ.L2(aweme, activity);
                }
                String enterPosition = null;
                if (TextUtils.equals(strCf, "homepage_friends")) {
                    c1386490mBT.LLJJ = strL2;
                    if (iBaseListFragmentPanel != null) {
                        numValueOf = Integer.valueOf(iBaseListFragmentPanel.LJLLJ());
                    } else {
                        numValueOf = null;
                    }
                    c1386490mBT.LLJJI = String.valueOf(numValueOf);
                    try {
                        C0O0R.LIZ.getClass();
                        c1386490mBT.LLJJL = String.valueOf(C0O0R.LIZJ);
                        c1386490mBT.LLJJLIIIJLLLLLLLZ = String.valueOf(C0O0R.LIZLLL);
                        if (C0O0R.LJ) {
                            str6 = "1";
                        } else {
                            str6 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c1386490mBT.LLJL = str6;
                        c1386490mBT.LLJLIL = C0O0R.LJFF;
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                if (AwemeBizExtKt.isFriendVideoPresent(aweme)) {
                    i = 1;
                } else {
                    i = 0;
                }
                c1386490mBT.LLJJIJI = i;
                if (!AwemeBizExtKt.isFriendVideoPresent(aweme)) {
                    str8 = CardStruct.IStatusCode.DEFAULT;
                }
                c1386490mBT.LLJJIJIIJIL = str8;
                if (C729980SkG.LJIIIZ(aweme)) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                c1386490mBT.LLJJIJIL = i2;
                if (!C727520SgI.LJFF(aweme)) {
                    c1386490mBT.LLJI = C727520SgI.LIZJ(aweme);
                    c1386490mBT.LLJ = C727520SgI.LIZ(aweme);
                }
                User author = aweme.getAuthor();
                if (author != null) {
                    c1386490mBT.LLJJIII = Integer.valueOf(author.getFollowStatusRelation());
                }
                if (Intrinsics.LJFF("self_profile_search_result_feed", strCf) || Intrinsics.LJFF("other_profile_search_result_feed", strCf)) {
                    C1387230mCf c1387230mCf = c1387240mCg.LJII;
                    if (c1387230mCf != null) {
                        str = c1387230mCf.LLJLLL;
                    } else {
                        str = null;
                    }
                    c1386490mBT.LLJJJ = str;
                    IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                    if (iFeedMobParamsProvider != null && (param = iFeedMobParamsProvider.getParam()) != null) {
                        profileSearchId = param.getProfileSearchId();
                    } else {
                        profileSearchId = null;
                    }
                    c1386490mBT.LLJJJIL = profileSearchId;
                }
                if (Intrinsics.LJFF("personal_homepage", strCf) || Intrinsics.LJFF("others_homepage", strCf)) {
                    IFeedMobParamsProvider iFeedMobParamsProvider2 = c1387240mCg.LJIIIIZZ;
                    if (iFeedMobParamsProvider2 != null && (param2 = iFeedMobParamsProvider2.getParam()) != null) {
                        enterMethodProfile = param2.getEnterMethodProfile();
                        if (enterMethodProfile != null && enterMethodProfile.length() == 0) {
                            enterMethodProfile = "slide";
                        }
                    } else {
                        enterMethodProfile = null;
                    }
                    c1386490mBT.LLJJJJJIL = enterMethodProfile;
                    c1386490mBT.LLJJJJ = String.valueOf(C1256070in7.LIZ);
                    IBaseListFragmentPanel iBaseListFragmentPanel2 = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel2 != null && (verticalViewPagerLLLIIIIL = iBaseListFragmentPanel2.LLLIIIIL()) != null) {
                        string = Integer.valueOf(verticalViewPagerLLLIIIIL.getCurrentItem()).toString();
                    } else {
                        string = null;
                    }
                    c1386490mBT.LLJJJJLIIL = string;
                }
                GScope gScope = GScope.LL;
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(gScope, "link_share_params_key", C1234710iEf.class, null);
                if (interfaceC1555100qZQLIZIZ != null) {
                    c1234710iEf = (C1234710iEf) interfaceC1555100qZQLIZIZ.getSource();
                } else {
                    c1234710iEf = null;
                }
                if (aweme.getAid() != null) {
                    String aid = aweme.getAid();
                    if (c1234710iEf != null && (str5 = c1234710iEf.LL) != null) {
                        str9 = str5;
                    }
                    if (Intrinsics.LJFF(aid, str9)) {
                        if (c1234710iEf != null) {
                            str2 = c1234710iEf.LLILLJJLI;
                        } else {
                            str2 = null;
                        }
                        c1386490mBT.LLJLILLLLZIIL = str2;
                        if (c1234710iEf != null) {
                            str3 = c1234710iEf.LLILLL;
                        } else {
                            str3 = null;
                        }
                        c1386490mBT.LLJLL = str3;
                        if (c1234710iEf != null) {
                            str4 = c1234710iEf.LLILZ;
                        } else {
                            str4 = null;
                        }
                        c1386490mBT.LLJLLIL = str4;
                        C1554960qZC.LIZLLL(gScope, C1234710iEf.class, "link_share_params_key");
                    }
                }
                CommentService.LIZ.getClass();
                Map<String, String> contentRecReasonParams = C523420Kfs.LIZ().getContentRecReasonParams(aweme, strCf);
                if (contentRecReasonParams != null) {
                    c1386490mBT.LLJLLL = contentRecReasonParams.get("query_id");
                    c1386490mBT.LLJZ = contentRecReasonParams.get("recalled_query");
                    c1386490mBT.LLJZIJLIL = contentRecReasonParams.get("recalled_query_search_ts");
                }
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    c1386490mBT.LLL = statistics.getDiggCount();
                    c1386490mBT.LLLF = statistics.getPlayCount();
                    c1386490mBT.LLLFF = statistics.getCommentCount();
                    c1386490mBT.LLLFFI = statistics.getCollectCount();
                    c1386490mBT.LLLFZ = statistics.getLoseCount();
                    if (statistics.getDiggCount() == 0 && statistics.getPlayCount() == 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    c1386490mBT.LLLI = i3;
                    if (statistics.getCommentCount() != 0 && statistics.getDiggCount() == 0 && statistics.getPlayCount() == 0) {
                        i4 = 1;
                    }
                    c1386490mBT.LLLII = i4;
                }
                LJFF(c1386490mBT, aweme);
                c1386490mBT.LLLIIIL = C453800Hqs.LIZIZ(aweme) ? 1 : 0;
                c1386490mBT.LLLIIL = C453800Hqs.LIZ(aweme) ? 1 : 0;
                LJ(c1386490mBT, c1387240mCg);
                if (iBaseListFragmentPanel != null) {
                    tabName = iBaseListFragmentPanel.getTabName();
                } else {
                    tabName = null;
                }
                c1386490mBT.LLLILZ = tabName;
                if (iBaseListFragmentPanel != null && (param3 = iBaseListFragmentPanel.getParam()) != null && (navArgModel = param3.getNavArgModel()) != null) {
                    enterPosition = navArgModel.getEnterPosition();
                }
                c1386490mBT.LLLILZJ = enterPosition;
                LIZLLL(c1386490mBT, aweme);
                return c1386490mBT;
            }

            public static void LIZLLL(C1386490mBT c1386490mBT, Aweme aweme) {
                MatchedFriendStruct matchedFriendStruct;
                SchoolMutualStruct schoolMutualStruct;
                String str;
                User author = aweme.getAuthor();
                if (author != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null && (schoolMutualStruct = matchedFriendStruct.schoolMutualStruct) != null) {
                    int i = schoolMutualStruct.schoolContentType;
                    String str2 = null;
                    if (i != 1) {
                        if (i != 2) {
                            str = null;
                        } else {
                            str = "college_related_post";
                        }
                    } else {
                        str = "college_member_post";
                    }
                    c1386490mBT.LLLILZLLLI = str;
                    int i2 = schoolMutualStruct.viewerVerifyStatus;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            str2 = "potential";
                        }
                    } else {
                        str2 = "verified";
                    }
                    c1386490mBT.LLLIZZ = str2;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static void LJ(X.C1386490mBT r3, X.C1387240mCg r4) {
                /*
                    com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider r0 = r4.LJIIIIZZ
                    if (r0 == 0) goto L44
                    X.1An6 r2 = r0.getParam()
                    if (r2 == 0) goto L44
                    java.lang.String r1 = r2.getEventType()
                    java.lang.String r0 = "school_community_page"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 != 0) goto L17
                    return
                L17:
                    java.lang.String r1 = r2.getAid()
                    boolean r0 = X.C123100dR.LIZ(r1)
                    if (r0 != 0) goto L22
                    return
                L22:
                    boolean r0 = X.C123100dR.LIZ(r1)
                    if (r0 == 0) goto L42
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LIZ
                    if (r0 == 0) goto L40
                    java.lang.String r0 = r0.getAid()
                L30:
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 != 0) goto L42
                    r0 = 1
                L37:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r3.LLLIILIL = r0
                    r3.LLLIL = r1
                    return
                L40:
                    r0 = 0
                    goto L30
                L42:
                    r0 = 0
                    goto L37
                L44:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1386480mBS.LJ(X.0mBT, X.0mCg):void");
            }

            public static void LJFF(C1386490mBT c1386490mBT, Aweme aweme) {
                List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
                int i = 0;
                if (interactStickerStructs != null) {
                    Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        InteractStickerStruct next = it2.next();
                        SocialAvatarStickerStruct socialAvatarStickerStruct = next.getSocialAvatarStickerStruct();
                        if (socialAvatarStickerStruct != null && C459610I0p.LIZ(socialAvatarStickerStruct)) {
                            if (next != null) {
                                i = 1;
                            }
                        }
                    }
                }
                c1386490mBT.LLLIIII = i;
                c1386490mBT.LLLIIIIL = C13LP.LJJLIIIJ(C459610I0p.LIZIZ(aweme), ",", null, null, 0, null, null, 62);
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1609950rzt>() { // from class: X.0rzs
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                C2189821An6 param;
                Map<String, String> extra;
                Fragment fragment;
                Map<String, String> extra2;
                String strLJIL;
                C0SZ8 c0sz8LJLIL;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                Map<String, String> extra3;
                String storyEnterFirstFeedMethod;
                Map<String, String> extra4;
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                Context context = null;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    C1609950rzt c1609950rzt = new C1609950rzt();
                    c1609950rzt.LLJI = "-1";
                    if (param != null && (extra4 = param.getExtra()) != null && extra4.containsKey("enter_position")) {
                        c1609950rzt.LLIZ = extra4.get("enter_position");
                    }
                    return c1609950rzt;
                }
                C1609950rzt c1609950rzt2 = new C1609950rzt();
                String str7 = "1";
                if (C729510SjV.LJJ(aweme)) {
                    LIZLLL(aweme, "getVideoPlayFinishParam");
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel != null) {
                        fragment = iBaseListFragmentPanel.getFragment();
                    } else {
                        fragment = null;
                    }
                    if (param != null) {
                        extra2 = param.getExtra();
                    } else {
                        extra2 = null;
                    }
                    c735840Sti.getClass();
                    C735840Sti.LIZLLL(c2344009Gk, aweme, null, null, null, fragment, extra2);
                    C735890Stn c735890StnLJ = LJ(c1387240mCg.LIZLLL, c1387240mCg, aweme);
                    String str8 = "";
                    if (param == null) {
                        strLJIL = "";
                    } else {
                        strLJIL = C1609930rzr.LJIL(param);
                    }
                    C735840Sti.LJI(c2344009Gk, c735890StnLJ, strLJIL, null);
                    C1609930rzr.LJIIJJI(aweme, c2344009Gk);
                    C1609930rzr.LJIIIIZZ(aweme, c2344009Gk);
                    C1609930rzr.LJFF(c2344009Gk, Boolean.valueOf(AwemeBizExtKt.getHasFriendsTag(aweme)));
                    C1609930rzr.LIZIZ(aweme, c2344009Gk);
                    HashMap map = (HashMap) c2344009Gk.LIZ;
                    c1609950rzt2.LL = (String) map.get("is_share_to_story");
                    c1609950rzt2.LLILLL = (String) map.get("story_start_num");
                    c1609950rzt2.LLILZ = (String) map.get("story_current_num");
                    c1609950rzt2.LLILZIL = (String) map.get("story_collection_id");
                    c1609950rzt2.LLILZLL = (String) map.get("item_cnt");
                    c1609950rzt2.LLIZ = (String) map.get("enter_position");
                    c1609950rzt2.LLIZLLLIL = (String) map.get("enter_play_method");
                    c1609950rzt2.LLJILJIL = (String) map.get("story_style_version");
                    c1609950rzt2.LLJ = C735840Sti.LIZIZ;
                    InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
                    IBaseListFragmentPanel iBaseListFragmentPanel2 = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel2 != null) {
                        c0sz8LJLIL = iBaseListFragmentPanel2.LJLIL();
                    } else {
                        c0sz8LJLIL = null;
                    }
                    IBaseListFragmentPanel iBaseListFragmentPanel3 = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel3 != null) {
                        context = iBaseListFragmentPanel3.getContext();
                    }
                    c1609950rzt2.LLJILJILJ = interfaceC706770RnvLJJIIJ.LJJIIZ(c0sz8LJLIL, context);
                    if (param != null && (storyEnterFirstFeedMethod = param.getStoryEnterFirstFeedMethod()) != null) {
                        str8 = storyEnterFirstFeedMethod;
                    }
                    c1609950rzt2.LLJILLL = str8;
                    c1609950rzt2.LLJJIII = (String) map.get("story_theme");
                    c1609950rzt2.LLJJIJI = (String) map.get("is_note");
                    c1609950rzt2.LLJJJIL = (String) map.get("has_friends_tag");
                    if (aweme.isStreaksPost()) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1609950rzt2.LLJJI = str;
                    c1609950rzt2.LLJJJJ = (String) map.get("request_id");
                    if (C730150SkX.LIZIZ(aweme) || C730150SkX.LIZ(aweme)) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1609950rzt2.LLJJJJJIL = str2;
                    if (C730150SkX.LIZIZ(aweme)) {
                        str3 = "1";
                    } else {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1609950rzt2.LLJJJJLIIL = str3;
                    C1256560inu.LIZ.getClass();
                    if (C1256560inu.LIZLLL(aweme)) {
                        str4 = "1";
                    } else {
                        str4 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1609950rzt2.LLJJL = str4;
                    c1609950rzt2.LLJLLIL = (String) map.get("mention_nums");
                    c1609950rzt2.LLJLLL = (String) map.get("share_to_story_type");
                    c1609950rzt2.LLJZ = (String) map.get("share_to_story_media_type");
                    c1609950rzt2.LLJZIJLIL = (String) map.get("is_mention");
                    c1609950rzt2.LLL = (String) map.get("is_own_video");
                    c1609950rzt2.LLLF = (String) map.get("repost_aweme_type");
                    if (C729510SjV.LJIJI(aweme)) {
                        if (C729510SjV.LJIJJ(aweme)) {
                            str5 = "unlocked";
                        } else {
                            str5 = "locked";
                        }
                        c1609950rzt2.LLLFF = str5;
                        if (param == null || (extra3 = param.getExtra()) == null || (str6 = extra3.get("is_centralized_avatar")) == null) {
                            str6 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c1609950rzt2.LLLFFI = str6;
                    }
                } else {
                    if (param != null && (extra = param.getExtra()) != null && extra.containsKey("enter_position")) {
                        c1609950rzt2.LLIZ = extra.get("enter_position");
                    }
                    c1609950rzt2.LLJJIII = C729510SjV.LJIIIIZZ(aweme);
                }
                LJFF(c1609950rzt2, aweme, c1387240mCg.LIZLLL);
                if (!aweme.getIsStoryToNormal()) {
                    str7 = CardStruct.IStatusCode.DEFAULT;
                }
                c1609950rzt2.LLJI = str7;
                return c1609950rzt2;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                C2189821An6 param;
                Map<String, String> extra;
                Fragment fragment;
                Map<String, String> extra2;
                String strLJIL;
                List<String> list;
                String storyEnterFirstFeedMethod;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                Map<String, String> extra3;
                ConcurrentHashMap<String, List<String>> emojiDisplaySet;
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    return new C1609950rzt();
                }
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                String strLJIL2 = null;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                C1609950rzt c1609950rzt = new C1609950rzt();
                String str7 = "1";
                if (C729510SjV.LJJ(aweme)) {
                    LIZLLL(aweme, "getVideoPlayTimeParam");
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    String enterPlayMethod = null;
                    IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel != null) {
                        fragment = iBaseListFragmentPanel.getFragment();
                    } else {
                        fragment = null;
                    }
                    if (param != null) {
                        extra2 = param.getExtra();
                    } else {
                        extra2 = null;
                    }
                    c735840Sti.getClass();
                    C735840Sti.LIZLLL(c2344009Gk, aweme, null, null, null, fragment, extra2);
                    C735890Stn c735890StnLJ = LJ(c1387240mCg.LIZLLL, c1387240mCg, aweme);
                    if (param != null) {
                        strLJIL = C1609930rzr.LJIL(param);
                        enterPlayMethod = param.getEnterPlayMethod();
                    } else {
                        strLJIL = null;
                    }
                    C735840Sti.LJI(c2344009Gk, c735890StnLJ, strLJIL, enterPlayMethod);
                    C1609930rzr.LJIIZILJ(aweme, c2344009Gk);
                    C1609930rzr.LJIIJJI(aweme, c2344009Gk);
                    if (param != null && (emojiDisplaySet = param.getEmojiDisplaySet()) != null) {
                        list = emojiDisplaySet.get(aweme.getAid());
                    } else {
                        list = null;
                    }
                    C1609930rzr.LJIILIIL(c2344009Gk, aweme, list);
                    C1609930rzr.LJFF(c2344009Gk, Boolean.valueOf(AwemeBizExtKt.getHasFriendsTag(aweme)));
                    if (param != null) {
                        strLJIL2 = C1609930rzr.LJIL(param);
                    }
                    C1609930rzr.LJIILLIIL(aweme, strLJIL2, c2344009Gk);
                    C1609930rzr.LIZIZ(aweme, c2344009Gk);
                    HashMap map = (HashMap) c2344009Gk.LIZ;
                    c1609950rzt.LL = (String) map.get("is_share_to_story");
                    c1609950rzt.LLILLL = (String) map.get("story_start_num");
                    c1609950rzt.LLILZ = (String) map.get("story_current_num");
                    c1609950rzt.LLILZIL = (String) map.get("story_collection_id");
                    c1609950rzt.LLILZLL = (String) map.get("item_cnt");
                    c1609950rzt.LLIZ = (String) map.get("enter_position");
                    c1609950rzt.LLIZLLLIL = (String) map.get("enter_play_method");
                    c1609950rzt.LLJ = C735840Sti.LIZIZ;
                    c1609950rzt.LLJILJIL = (String) map.get("story_style_version");
                    if (param == null || (storyEnterFirstFeedMethod = param.getStoryEnterFirstFeedMethod()) == null) {
                        storyEnterFirstFeedMethod = "";
                    }
                    c1609950rzt.LLJILLL = storyEnterFirstFeedMethod;
                    c1609950rzt.LLJJIII = (String) map.get("story_theme");
                    c1609950rzt.LLJJIJI = (String) map.get("is_note");
                    c1609950rzt.LLJJIJIIJIL = (String) map.get("emoji_data");
                    c1609950rzt.LLJJIJIL = (String) map.get("emoji_display");
                    c1609950rzt.LLJJJ = (String) map.get("emoji_match_rate");
                    c1609950rzt.LLJJJIL = (String) map.get("has_friends_tag");
                    if (aweme.isStreaksPost()) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1609950rzt.LLJJI = str;
                    c1609950rzt.LLJJJJ = (String) map.get("request_id");
                    if (C730150SkX.LIZIZ(aweme) || C730150SkX.LIZ(aweme)) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1609950rzt.LLJJJJJIL = str2;
                    if (C730150SkX.LIZIZ(aweme)) {
                        str3 = "1";
                    } else {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1609950rzt.LLJJJJLIIL = str3;
                    C1256560inu.LIZ.getClass();
                    if (C1256560inu.LIZLLL(aweme)) {
                        str4 = "1";
                    } else {
                        str4 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1609950rzt.LLJJL = str4;
                    c1609950rzt.LLJLIL = (String) map.get("is_add_story_highlight");
                    c1609950rzt.LLJLILLLLZIIL = (String) map.get("story_highlight_id");
                    c1609950rzt.LLJLL = (String) map.get("is_highlight_immersive_flow");
                    c1609950rzt.LLJLLIL = (String) map.get("mention_nums");
                    c1609950rzt.LLJLLL = (String) map.get("share_to_story_type");
                    c1609950rzt.LLJZ = (String) map.get("share_to_story_media_type");
                    c1609950rzt.LLJZIJLIL = (String) map.get("is_mention");
                    c1609950rzt.LLL = (String) map.get("is_own_video");
                    c1609950rzt.LLLF = (String) map.get("repost_aweme_type");
                    if (C729510SjV.LJIJI(aweme)) {
                        if (C729510SjV.LJIJJ(aweme)) {
                            str5 = "unlocked";
                        } else {
                            str5 = "locked";
                        }
                        c1609950rzt.LLLFF = str5;
                        if (param == null || (extra3 = param.getExtra()) == null || (str6 = extra3.get("is_centralized_avatar")) == null) {
                            str6 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c1609950rzt.LLLFFI = str6;
                    }
                } else {
                    if (param != null && (extra = param.getExtra()) != null && extra.containsKey("enter_position")) {
                        c1609950rzt.LLIZ = extra.get("enter_position");
                    }
                    c1609950rzt.LLJJIII = C729510SjV.LJIIIIZZ(aweme);
                }
                if (!aweme.getIsStoryToNormal()) {
                    str7 = CardStruct.IStatusCode.DEFAULT;
                }
                c1609950rzt.LLJI = str7;
                LJFF(c1609950rzt, aweme, c1387240mCg.LIZLLL);
                return c1609950rzt;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                C2189821An6 param;
                Map<String, String> extra;
                Fragment fragment;
                Map<String, String> extra2;
                String strLJIL;
                Fragment fragment2;
                String from;
                String strLJIL2;
                C0SZ8 c0sz8LJJIJIL;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                Map<String, String> extra3;
                String storyEnterFirstFeedMethod;
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    return new C1609950rzt();
                }
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                Context context = null;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                C1609950rzt c1609950rzt = new C1609950rzt();
                String str7 = "1";
                if (C729510SjV.LJJ(aweme)) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    String enterPlayMethod = null;
                    IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel != null) {
                        fragment = iBaseListFragmentPanel.getFragment();
                    } else {
                        fragment = null;
                    }
                    if (param != null) {
                        extra2 = param.getExtra();
                    } else {
                        extra2 = null;
                    }
                    c735840Sti.getClass();
                    C735840Sti.LIZLLL(c2344009Gk, aweme, null, null, null, fragment, extra2);
                    C735890Stn c735890StnLJ = LJ(c1387240mCg.LIZLLL, c1387240mCg, aweme);
                    String str8 = "";
                    if (param == null) {
                        strLJIL = "";
                    } else {
                        strLJIL = C1609930rzr.LJIL(param);
                        enterPlayMethod = param.getEnterPlayMethod();
                    }
                    C735840Sti.LJI(c2344009Gk, c735890StnLJ, strLJIL, enterPlayMethod);
                    C1609930rzr.LJIIZILJ(aweme, c2344009Gk);
                    C1609930rzr.LJIIJJI(aweme, c2344009Gk);
                    C1609930rzr.LJFF(c2344009Gk, Boolean.valueOf(AwemeBizExtKt.getHasFriendsTag(aweme)));
                    C1609930rzr.LJI(c2344009Gk, param);
                    IBaseListFragmentPanel iBaseListFragmentPanel2 = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel2 != null) {
                        fragment2 = iBaseListFragmentPanel2.getFragment();
                    } else {
                        fragment2 = null;
                    }
                    if (param != null) {
                        from = param.getFrom();
                    } else {
                        from = null;
                    }
                    C1609930rzr.LJ(fragment2, from, c2344009Gk);
                    if (param != null) {
                        strLJIL2 = C1609930rzr.LJIL(param);
                    } else {
                        strLJIL2 = null;
                    }
                    C1609930rzr.LJIILLIIL(aweme, strLJIL2, c2344009Gk);
                    C1609930rzr.LIZIZ(aweme, c2344009Gk);
                    HashMap map = (HashMap) c2344009Gk.LIZ;
                    c1609950rzt.LL = (String) map.get("is_share_to_story");
                    c1609950rzt.LLILLL = (String) map.get("story_start_num");
                    c1609950rzt.LLILZ = (String) map.get("story_current_num");
                    c1609950rzt.LLILZIL = (String) map.get("story_collection_id");
                    String str9 = (String) map.get("item_cnt");
                    if (str9 != null) {
                        C1387400mCw.LIZ(str9, new AwS603S0100000_24(c1609950rzt, 476));
                    }
                    c1609950rzt.LLIZ = (String) map.get("enter_position");
                    c1609950rzt.LLIZLLLIL = (String) map.get("enter_play_method");
                    c1609950rzt.LLJ = C735840Sti.LIZIZ;
                    c1609950rzt.LLJIJIL = (String) map.get("story_music_with_mute");
                    c1609950rzt.LLJILJIL = (String) map.get("story_style_version");
                    c1609950rzt.LLJJ = (String) map.get("is_preview_during_publishing");
                    InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
                    IBaseListFragmentPanel iBaseListFragmentPanel3 = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel3 != null) {
                        c0sz8LJJIJIL = iBaseListFragmentPanel3.LJJIJIL(aweme.getAid());
                    } else {
                        c0sz8LJJIJIL = null;
                    }
                    IBaseListFragmentPanel iBaseListFragmentPanel4 = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel4 != null) {
                        context = iBaseListFragmentPanel4.getContext();
                    }
                    c1609950rzt.LLJILJILJ = interfaceC706770RnvLJJIIJ.LJJIIZ(c0sz8LJJIJIL, context);
                    if (param != null && (storyEnterFirstFeedMethod = param.getStoryEnterFirstFeedMethod()) != null) {
                        str8 = storyEnterFirstFeedMethod;
                    }
                    c1609950rzt.LLJILLL = str8;
                    c1609950rzt.LLJJIII = (String) map.get("story_theme");
                    c1609950rzt.LLJJIJI = (String) map.get("is_note");
                    c1609950rzt.LLJJJIL = (String) map.get("has_friends_tag");
                    if (aweme.isStreaksPost()) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1609950rzt.LLJJI = str;
                    c1609950rzt.LLJJJJ = (String) map.get("request_id");
                    if (C730150SkX.LIZIZ(aweme) || C730150SkX.LIZ(aweme)) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1609950rzt.LLJJJJJIL = str2;
                    if (C730150SkX.LIZIZ(aweme)) {
                        str3 = "1";
                    } else {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1609950rzt.LLJJJJLIIL = str3;
                    C1256560inu.LIZ.getClass();
                    if (C1256560inu.LIZLLL(aweme)) {
                        str4 = "1";
                    } else {
                        str4 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1609950rzt.LLJJL = str4;
                    c1609950rzt.LLJJLIIIJLLLLLLLZ = (String) map.get("from_story_archive_tab_name");
                    c1609950rzt.LLJL = (String) map.get("last_seen_group_id");
                    c1609950rzt.LLJLIL = (String) map.get("is_add_story_highlight");
                    c1609950rzt.LLJLILLLLZIIL = (String) map.get("story_highlight_id");
                    c1609950rzt.LLJLL = (String) map.get("is_highlight_immersive_flow");
                    c1609950rzt.LLJLLIL = (String) map.get("mention_nums");
                    c1609950rzt.LLJLLL = (String) map.get("share_to_story_type");
                    c1609950rzt.LLJZ = (String) map.get("share_to_story_media_type");
                    c1609950rzt.LLJZIJLIL = (String) map.get("is_mention");
                    c1609950rzt.LLL = (String) map.get("is_own_video");
                    c1609950rzt.LLLF = (String) map.get("repost_aweme_type");
                    if (C729510SjV.LJIJI(aweme)) {
                        if (C729510SjV.LJIJJ(aweme)) {
                            str5 = "unlocked";
                        } else {
                            str5 = "locked";
                        }
                        c1609950rzt.LLLFF = str5;
                        if (param == null || (extra3 = param.getExtra()) == null || (str6 = extra3.get("is_centralized_avatar")) == null) {
                            str6 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c1609950rzt.LLLFFI = str6;
                    }
                } else {
                    if (param != null && (extra = param.getExtra()) != null && extra.containsKey("enter_position")) {
                        c1609950rzt.LLIZ = extra.get("enter_position");
                    }
                    c1609950rzt.LLJJIII = C729510SjV.LJIIIIZZ(aweme);
                }
                if (!aweme.getIsStoryToNormal()) {
                    str7 = CardStruct.IStatusCode.DEFAULT;
                }
                c1609950rzt.LLJI = str7;
                LJFF(c1609950rzt, aweme, c1387240mCg.LIZLLL);
                String str10 = c1609950rzt.LLIZLLLIL;
                if (str10 != null && str10.length() != 0) {
                    return c1609950rzt;
                }
                c1609950rzt.LLIZLLLIL = "manul_play";
                return c1609950rzt;
            }

            public static void LIZLLL(Aweme aweme, String str) {
                boolean z;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" aid=");
                sbLIZ.append(aweme.getAid());
                sbLIZ.append(" isTikTokStory=");
                sbLIZ.append(aweme.getIsTikTokStory());
                sbLIZ.append(" hasShareToStoryMeta=");
                sbLIZ.append(C1609960rzu.LIZJ(aweme));
                sbLIZ.append(" story=");
                boolean z2 = true;
                int size = 0;
                if (aweme.getStory() != null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ.append(z);
                sbLIZ.append(" socialBlob=");
                if (aweme.getSocialInteractionBlob() == null) {
                    z2 = false;
                }
                sbLIZ.append(z2);
                sbLIZ.append(" stickerCount=");
                List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
                if (interactStickerStructs != null) {
                    size = interactStickerStructs.size();
                }
                sbLIZ.append(size);
                C2188811AlT.LIZIZ(sbLIZ);
            }

            /* JADX WARN: Removed duplicated region for block: B:76:0x0109  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static X.C735890Stn LJ(X.C0SZ8 r9, X.C1387240mCg r10, com.ss.android.ugc.aweme.feed.model.Aweme r11) {
                /*
                    Method dump skipped, instruction units count: 295
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1609940rzs.LJ(X.0SZ8, X.0mCg, com.ss.android.ugc.aweme.feed.model.Aweme):X.0Stn");
            }

            public static void LJFF(C1609950rzt c1609950rzt, Aweme aweme, C0SZ8 c0sz8) {
                String str;
                C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
                if (c1618440sDa.LJJIIJ().LJIJI(c0sz8)) {
                    c1609950rzt.LLILLJJLI = c1618440sDa.LJJIIJ().LJIJJLI();
                    c1609950rzt.LLIZ = "feed";
                    return;
                }
                if (!aweme.getIsTikTokStory() && aweme.getAwemeType() != 40) {
                    str = "post";
                } else {
                    str = "story";
                }
                c1609950rzt.LLILLJJLI = str;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1386240mB4>() { // from class: X.0mB3
            /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[PHI: r2
              0x0057: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:28:0x0054, B:8:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZ(X.C1387240mCg r8) {
                /*
                    r7 = this;
                    X.0mB4 r6 = new X.0mB4
                    r6.<init>()
                    com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.LIZ
                    com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider r4 = r8.LJIIIIZZ
                    r3 = 0
                    if (r4 == 0) goto L53
                    X.1An6 r0 = r4.getParam()
                    if (r0 == 0) goto L53
                    java.lang.String r2 = r0.getExternalShareUrlUserId()
                L16:
                    X.1An6 r0 = r4.getParam()
                    if (r0 == 0) goto L57
                    java.lang.String r1 = r0.getExternalShareUserOId()
                L20:
                    X.1An6 r0 = r4.getParam()
                    if (r0 == 0) goto L2a
                    java.lang.String r3 = r0.getExternalShareAwemeId()
                L2a:
                    if (r5 == 0) goto L52
                    java.lang.String r0 = r5.getAid()
                    if (r0 == 0) goto L52
                    boolean r0 = X.C123100dR.LIZ(r3)
                    if (r0 == 0) goto L52
                    java.lang.String r0 = r5.getAid()
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
                    if (r0 == 0) goto L52
                    boolean r0 = X.C123100dR.LIZ(r2)
                    if (r0 == 0) goto L4a
                    r6.LLJ = r2
                L4a:
                    boolean r0 = X.C123100dR.LIZ(r1)
                    if (r0 == 0) goto L52
                    r6.LLJI = r1
                L52:
                    return r6
                L53:
                    r2 = r3
                    if (r4 == 0) goto L57
                    goto L16
                L57:
                    r1 = r3
                    if (r4 == 0) goto L2a
                    goto L20
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1386230mB3.LIZ(X.0mCg):X.04zy");
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[PHI: r2
              0x0057: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:28:0x0054, B:8:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZIZ(X.C1387240mCg r8) {
                /*
                    r7 = this;
                    X.0mB4 r6 = new X.0mB4
                    r6.<init>()
                    com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.LIZ
                    com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider r4 = r8.LJIIIIZZ
                    r3 = 0
                    if (r4 == 0) goto L53
                    X.1An6 r0 = r4.getParam()
                    if (r0 == 0) goto L53
                    java.lang.String r2 = r0.getExternalShareUrlUserId()
                L16:
                    X.1An6 r0 = r4.getParam()
                    if (r0 == 0) goto L57
                    java.lang.String r1 = r0.getExternalShareUserOId()
                L20:
                    X.1An6 r0 = r4.getParam()
                    if (r0 == 0) goto L2a
                    java.lang.String r3 = r0.getExternalShareAwemeId()
                L2a:
                    if (r5 == 0) goto L52
                    java.lang.String r0 = r5.getAid()
                    if (r0 == 0) goto L52
                    boolean r0 = X.C123100dR.LIZ(r3)
                    if (r0 == 0) goto L52
                    java.lang.String r0 = r5.getAid()
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
                    if (r0 == 0) goto L52
                    boolean r0 = X.C123100dR.LIZ(r2)
                    if (r0 == 0) goto L4a
                    r6.LLJ = r2
                L4a:
                    boolean r0 = X.C123100dR.LIZ(r1)
                    if (r0 == 0) goto L52
                    r6.LLJI = r1
                L52:
                    return r6
                L53:
                    r2 = r3
                    if (r4 == 0) goto L57
                    goto L16
                L57:
                    r1 = r3
                    if (r4 == 0) goto L2a
                    goto L20
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1386230mB3.LIZIZ(X.0mCg):X.04zy");
            }

            /* JADX WARN: Code restructure failed: missing block: B:64:0x00e3, code lost:
            
                if (r12.contains(r13) != false) goto L65;
             */
            /* JADX WARN: Removed duplicated region for block: B:108:0x017d  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x01b2  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x01bc  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x01c2  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x01de  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x01e6  */
            /* JADX WARN: Removed duplicated region for block: B:138:0x01e9  */
            /* JADX WARN: Removed duplicated region for block: B:141:0x01ed A[PHI: r2
              0x01ed: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:139:0x01ea, B:119:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:144:0x01f1  */
            /* JADX WARN: Removed duplicated region for block: B:151:0x0214  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x021d  */
            /* JADX WARN: Removed duplicated region for block: B:161:0x022c A[PHI: r1 r9
              0x022c: PHI (r1v12 X.0iEZ) = (r1v1 X.0iEZ), (r1v14 X.0iEZ) binds: [B:42:0x00a7, B:40:0x00a0] A[DONT_GENERATE, DONT_INLINE]
              0x022c: PHI (r9v9 java.util.List) = (r9v1 java.util.List), (r9v10 java.util.List) binds: [B:42:0x00a7, B:40:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x00e9  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x015e  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZJ(X.C1387240mCg r18) {
                /*
                    Method dump skipped, instruction units count: 563
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1386230mB3.LIZJ(X.0mCg):X.04zy");
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1359640lUA>() { // from class: X.0lU9
            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                InteractPermission interactPermission;
                String str;
                String str2;
                String str3;
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    return new C1359640lUA();
                }
                C1359640lUA c1359640lUA = new C1359640lUA();
                if (aweme.getAid() == null || (interactPermission = aweme.getInteractPermission()) == null || interactPermission.getUpvote() != 0) {
                    return c1359640lUA;
                }
                C1359620lU8 c1359620lU8LJI = C1359610lU7.LJI(aweme.getAid(), null);
                String str4 = "1";
                if (c1359620lU8LJI.LIZ) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c1359640lUA.LL = str;
                if (c1359620lU8LJI.LIZIZ) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c1359640lUA.LLILLJJLI = str2;
                c1359640lUA.LLILLL = Integer.valueOf(c1359620lU8LJI.LIZJ);
                if (c1359620lU8LJI.LIZLLL) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                c1359640lUA.LLILZ = str3;
                if (!c1359620lU8LJI.LJ) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c1359640lUA.LLILZIL = str4;
                c1359640lUA.LLILZLL = Integer.valueOf(c1359620lU8LJI.LJFF);
                c1359640lUA.LLIZLLLIL = Integer.valueOf(c1359620lU8LJI.LJI);
                c1359640lUA.LLIZ = Integer.valueOf(c1359620lU8LJI.LJII);
                c1359640lUA.LLJ = Integer.valueOf(c1359620lU8LJI.LJIIIIZZ);
                return c1359640lUA;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C017G>() { // from class: X.0mB9
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                String strCf;
                C2189821An6 param;
                String previousPage;
                String fromGroupId;
                HashMap<String, String> poiExtras;
                Context context;
                Fragment fragment;
                String str;
                Fragment fragment2;
                String pagePoiId;
                User author;
                Set<Map.Entry<String, k>> setEntrySet;
                String strXe1;
                Aweme aweme = c1387240mCg.LIZ;
                C1387230mCf c1387230mCf = c1387240mCg.LJII;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                DetailNavArgModel navArgModel = null;
                if (baseControllerContext != null) {
                    strCf = baseControllerContext.Cf();
                } else {
                    strCf = null;
                }
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                C017G c017g = new C017G();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C2344009Gk c2344009Gk = new C2344009Gk();
                C1612650s4F.LIZIZ(c2344009Gk, aweme);
                Map<String, String> map = c2344009Gk.LIZ;
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                if (iFeedMobParamsProvider != null && (strXe1 = iFeedMobParamsProvider.Xe1()) != null) {
                    iFeedMobParamsProvider.kd2();
                    linkedHashMap.put(strXe1, "");
                }
                if (aweme != null && (author = aweme.getAuthor()) != null) {
                    try {
                        n nVar = (n) C08JS.LIZ(C1365450ldX.LJFF(author), n.class);
                        if (nVar != null && (setEntrySet = nVar.entrySet()) != null) {
                            Iterator<T> it2 = setEntrySet.iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("social_info_");
                                sbLIZ.append((String) entry.getKey());
                                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), ((k) entry.getValue()).LJIL());
                            }
                        }
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (param != null) {
                    previousPage = param.getPreviousPage();
                    fromGroupId = param.getFromGroupId();
                } else {
                    previousPage = null;
                    fromGroupId = null;
                }
                linkedHashMap.putAll(C584760Mwc.LIZIZ(previousPage, fromGroupId));
                if (Intrinsics.LJFF("places_discover", strCf) || Intrinsics.LJFF("poi_detail", strCf)) {
                    if (param != null) {
                        String poiCollectInfo = param.getPoiCollectInfo();
                        if (poiCollectInfo != null) {
                            linkedHashMap.put("collect_info", poiCollectInfo);
                            try {
                                JSONObject jSONObject = new JSONObject(poiCollectInfo);
                                Iterator<String> itKeys = jSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    String string = JSONObjectProtectorUtils.getString(jSONObject, next);
                                    if (next != null && string != null) {
                                        linkedHashMap.put(next, string);
                                    }
                                }
                            } catch (JSONException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        if (param != null) {
                            String pageCollectInfo = param.getPageCollectInfo();
                            if (pageCollectInfo != null) {
                                linkedHashMap.put("page_collect_info", pageCollectInfo);
                                try {
                                    JSONObject jSONObject2 = new JSONObject(pageCollectInfo);
                                    Iterator<String> itKeys2 = jSONObject2.keys();
                                    while (itKeys2.hasNext()) {
                                        String next2 = itKeys2.next();
                                        String string2 = JSONObjectProtectorUtils.getString(jSONObject2, next2);
                                        if (next2 != null && string2 != null) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("page_");
                                            sbLIZ2.append(next2);
                                            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ2), string2);
                                        }
                                    }
                                } catch (JSONException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                }
                            }
                            if (param != null && (poiExtras = param.getPoiExtras()) != null) {
                                for (Map.Entry<String, String> entry2 : poiExtras.entrySet()) {
                                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                        }
                    }
                    linkedHashMap.putAll(C1606660rua.LIZIZ.LJFF(baseControllerContext.Cf()));
                }
                C1367960lha c1367960lha = C1367960lha.LIZ;
                if (c1367960lha != null && C1367960lha.LIZ() != null) {
                    IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
                    if (param != null) {
                        pagePoiId = param.getPagePoiId();
                    } else {
                        pagePoiId = null;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iPoiServiceLIZ.LJIILJJIL(aweme, pagePoiId));
                    C1367960lha.LIZ().LJZI(aweme, param, linkedHashMap2);
                    linkedHashMap.putAll(linkedHashMap2);
                }
                if (aweme != null) {
                    HashMap<String, String> map2 = new HashMap<>();
                    C1606660rua.LIZIZ.LIZJ(strCf, map2, aweme, false);
                    linkedHashMap.putAll(map2);
                    c1367960lha.getClass();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(C1367960lha.LIZ().LJIILJJIL(aweme, C1367960lha.LIZ().LJLJL(aweme.getAid())));
                    C1367960lha.LIZ().LJZI(aweme, param, linkedHashMap3);
                    C1893310zMv c1893310zMv = C1893310zMv.LIZIZ;
                    IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel != null) {
                        fragment2 = iBaseListFragmentPanel.getFragment();
                    } else {
                        fragment2 = null;
                    }
                    c1893310zMv.LJII(PageFinder.via(fragment2), "video_play_finish", linkedHashMap3, null);
                    linkedHashMap.putAll(linkedHashMap3);
                    linkedHashMap.putAll(LIZLLL(aweme, (String) linkedHashMap3.get("poi_id")));
                    Iterator<T> it3 = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZ().entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it3.next();
                        linkedHashMap.put(entry3.getKey(), entry3.getValue());
                    }
                }
                if (c1387230mCf != null && Intrinsics.LJFF(c1387230mCf.LLILZ, Boolean.TRUE)) {
                    C1389320mG2.LIZIZ(linkedHashMap);
                }
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                IBaseListFragmentPanel iBaseListFragmentPanel2 = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel2 != null) {
                    context = iBaseListFragmentPanel2.getContext();
                } else {
                    context = null;
                }
                C0SXF.LJFF(c2344009Gk2, param, aweme, context, false);
                linkedHashMap.putAll(c2344009Gk2.LIZ);
                BtmSDK btmSDK = BtmSDK.INSTANCE;
                IBaseListFragmentPanel iBaseListFragmentPanel3 = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel3 != null) {
                    fragment = iBaseListFragmentPanel3.getFragment();
                } else {
                    fragment = null;
                }
                for (Map.Entry entry4 : BtmSDK.createReportParams$default(btmSDK, "c0.d0", PageFinder.via(fragment), null, 4, null).entrySet()) {
                    linkedHashMap.put(entry4.getKey(), String.valueOf(entry4.getValue()));
                }
                if (param != null) {
                    navArgModel = param.getNavArgModel();
                }
                linkedHashMap.putAll(LJ(aweme, navArgModel));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry5 : linkedHashMap.entrySet()) {
                    String str2 = (String) entry5.getKey();
                    if ((str2 != null && str2.length() == 0) || ((str = (String) entry5.getValue()) != null && str.length() == 0)) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashSet.add("from_group_id");
                        linkedHashSet.add("group_id");
                        linkedHashSet.add("preview_status");
                        linkedHashSet.add("play_video_type");
                        linkedHashSet.add("series_enter_entrance");
                        if (!linkedHashSet.contains(entry5.getKey())) {
                        }
                    }
                    linkedHashMap4.put(entry5.getKey(), entry5.getValue());
                }
                c017g.LL = linkedHashMap4;
                return c017g;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                C2189821An6 param;
                HashMap<String, String> inboxLogExtra;
                String previousPage;
                String fromGroupId;
                String tracker;
                HashMap<String, String> poiExtras;
                Context context;
                Fragment fragment;
                String str;
                String pagePoiId;
                Fragment fragment2;
                User author;
                Set<Map.Entry<String, k>> setEntrySet;
                String strXe1;
                Aweme aweme = c1387240mCg.LIZ;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                if (baseControllerContext == null) {
                    return new C017G();
                }
                String strCf = baseControllerContext.Cf();
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                C1387230mCf c1387230mCf = c1387240mCg.LJII;
                C2344009Gk c2344009Gk = new C2344009Gk();
                C1612650s4F.LIZIZ(c2344009Gk, aweme);
                C017G c017g = new C017G();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, String> map = c2344009Gk.LIZ;
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel != null && (strXe1 = iBaseListFragmentPanel.Xe1()) != null) {
                    c1387240mCg.LIZJ.kd2();
                    linkedHashMap.put(strXe1, "");
                }
                if (aweme != null && (author = aweme.getAuthor()) != null) {
                    try {
                        n nVar = (n) C08JS.LIZ(C1365450ldX.LJFF(author), n.class);
                        if (nVar != null && (setEntrySet = nVar.entrySet()) != null) {
                            Iterator<T> it2 = setEntrySet.iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("social_info_");
                                sbLIZ.append((String) entry.getKey());
                                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), ((k) entry.getValue()).LJIL());
                            }
                        }
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (C1367960lha.LIZ != null && C1367960lha.LIZ() != null) {
                    IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
                    if (param != null) {
                        pagePoiId = param.getPagePoiId();
                    } else {
                        pagePoiId = null;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iPoiServiceLIZ.LJIILJJIL(aweme, pagePoiId));
                    C1367960lha.LIZ().LJZI(aweme, param, linkedHashMap2);
                    C1893310zMv c1893310zMv = C1893310zMv.LIZIZ;
                    IBaseListFragmentPanel iBaseListFragmentPanel2 = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel2 != null) {
                        fragment2 = iBaseListFragmentPanel2.getFragment();
                    } else {
                        fragment2 = null;
                    }
                    c1893310zMv.LJII(PageFinder.via(fragment2), "play_time", linkedHashMap2, null);
                    linkedHashMap.putAll(linkedHashMap2);
                    if (aweme != null) {
                        linkedHashMap.putAll(LIZLLL(aweme, (String) linkedHashMap2.get("poi_id")));
                    }
                }
                if (param != null) {
                    inboxLogExtra = param.getInboxLogExtra();
                } else {
                    inboxLogExtra = null;
                }
                C1357130lQ7.LIZLLL(linkedHashMap, "play_time", inboxLogExtra, new C20468080c());
                C1387230mCf c1387230mCf2 = c1387240mCg.LJII;
                if (c1387230mCf2 != null && (previousPage = c1387230mCf2.LLL) != null) {
                    if (param != null) {
                        fromGroupId = param.getFromGroupId();
                    } else {
                        fromGroupId = null;
                    }
                } else if (param != null) {
                    previousPage = param.getPreviousPage();
                    fromGroupId = param.getFromGroupId();
                } else {
                    previousPage = null;
                    fromGroupId = null;
                }
                linkedHashMap.putAll(C584760Mwc.LIZIZ(previousPage, fromGroupId));
                C0N2Q c0n2q = C0N2Q.LIZ;
                IFeedMobParamsProvider iFeedMobParamsProvider2 = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider2 != null) {
                    tracker = iFeedMobParamsProvider2.getTracker();
                } else {
                    tracker = null;
                }
                c0n2q.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                if (!TextUtils.isEmpty(tracker)) {
                    try {
                        JSONObject jSONObject = new JSONObject(tracker);
                        if (jSONObject.has("supplier_id")) {
                            linkedHashMap3.put("supplier_id", JSONObjectProtectorUtils.getString(jSONObject, "supplier_id"));
                        }
                        if (jSONObject.has("product_id")) {
                            linkedHashMap3.put("product_id", JSONObjectProtectorUtils.getString(jSONObject, "product_id"));
                        }
                        if (jSONObject.has("previous_page")) {
                            linkedHashMap3.put("previous_page", JSONObjectProtectorUtils.getString(jSONObject, "previous_page"));
                        }
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                linkedHashMap.putAll(linkedHashMap3);
                if (Intrinsics.LJFF("places_discover", strCf) || Intrinsics.LJFF("poi_detail", strCf)) {
                    if (param != null) {
                        String poiCollectInfo = param.getPoiCollectInfo();
                        if (poiCollectInfo != null) {
                            linkedHashMap.put("collect_info", poiCollectInfo);
                            try {
                                JSONObject jSONObject2 = new JSONObject(poiCollectInfo);
                                Iterator<String> itKeys = jSONObject2.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    String string = JSONObjectProtectorUtils.getString(jSONObject2, next);
                                    if (next != null && string != null) {
                                        linkedHashMap.put(next, string);
                                    }
                                }
                            } catch (JSONException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                        }
                        if (param != null) {
                            String pageCollectInfo = param.getPageCollectInfo();
                            if (pageCollectInfo != null) {
                                linkedHashMap.put("page_collect_info", pageCollectInfo);
                                try {
                                    JSONObject jSONObject3 = new JSONObject(pageCollectInfo);
                                    Iterator<String> itKeys2 = jSONObject3.keys();
                                    while (itKeys2.hasNext()) {
                                        String next2 = itKeys2.next();
                                        String string2 = JSONObjectProtectorUtils.getString(jSONObject3, next2);
                                        if (next2 != null && string2 != null) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("page_");
                                            sbLIZ2.append(next2);
                                            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ2), string2);
                                        }
                                    }
                                } catch (JSONException e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                }
                            }
                            if (param != null && (poiExtras = param.getPoiExtras()) != null) {
                                for (Map.Entry<String, String> entry2 : poiExtras.entrySet()) {
                                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                        }
                    }
                    linkedHashMap.putAll(C1606660rua.LIZIZ.LJFF(baseControllerContext.Cf()));
                }
                if (aweme != null) {
                    Iterator<T> it3 = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZ().entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it3.next();
                        linkedHashMap.put(entry3.getKey(), entry3.getValue());
                    }
                }
                HashMap<String, String> map2 = new HashMap<>();
                C1606660rua.LIZIZ.LIZJ(strCf, map2, aweme, false);
                linkedHashMap.putAll(map2);
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                DetailNavArgModel navArgModel = null;
                C1359610lU7.LJ(c2344009Gk2, aweme, null);
                linkedHashMap.putAll(c2344009Gk2.LIZ);
                linkedHashMap.putAll(C735370Ssx.LJJI(aweme));
                if (c1387230mCf != null && Intrinsics.LJFF(c1387230mCf.LLILZ, Boolean.TRUE)) {
                    C1389320mG2.LIZIZ(linkedHashMap);
                }
                C2344009Gk c2344009Gk3 = new C2344009Gk();
                IBaseListFragmentPanel iBaseListFragmentPanel3 = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel3 != null) {
                    context = iBaseListFragmentPanel3.getContext();
                } else {
                    context = null;
                }
                C0SXF.LJFF(c2344009Gk3, param, aweme, context, false);
                linkedHashMap.putAll(c2344009Gk3.LIZ);
                BtmSDK btmSDK = BtmSDK.INSTANCE;
                IBaseListFragmentPanel iBaseListFragmentPanel4 = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel4 != null) {
                    fragment = iBaseListFragmentPanel4.getFragment();
                } else {
                    fragment = null;
                }
                for (Map.Entry entry4 : BtmSDK.createReportParams$default(btmSDK, "c0.d0", PageFinder.via(fragment), null, 4, null).entrySet()) {
                    linkedHashMap.put(entry4.getKey(), String.valueOf(entry4.getValue()));
                }
                if (param != null) {
                    navArgModel = param.getNavArgModel();
                }
                linkedHashMap.putAll(LJ(aweme, navArgModel));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry5 : linkedHashMap.entrySet()) {
                    String str2 = (String) entry5.getKey();
                    if ((str2 != null && str2.length() == 0) || ((str = (String) entry5.getValue()) != null && str.length() == 0)) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashSet.add("from_group_id");
                        linkedHashSet.add("rec_type");
                        linkedHashSet.add("preview_status");
                        linkedHashSet.add("group_id");
                        linkedHashSet.add("play_video_type");
                        linkedHashSet.add("series_enter_entrance");
                        if (!linkedHashSet.contains(entry5.getKey())) {
                        }
                    }
                    linkedHashMap4.put(entry5.getKey(), entry5.getValue());
                }
                c017g.LL = linkedHashMap4;
                return c017g;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                C2189821An6 param;
                List<AnchorCommonStruct> anchors;
                HashMap<String, String> poiExtras;
                HashMap<String, String> inboxLogExtra;
                String previousPage;
                String fromGroupId;
                String fromProfileUid;
                Context context;
                Fragment fragment;
                DetailNavArgModel navArgModel;
                String str;
                Fragment fragment2;
                Boolean boolIsLSContent;
                String strLIZLLL;
                String pagePoiId;
                C2189821An6 param2;
                JSONObject jSONObject;
                String strXe1;
                String str2;
                Set<Map.Entry<String, k>> setEntrySet;
                Map<String, String> logExtraMap;
                Set<Map.Entry<String, k>> setEntrySet2;
                Aweme aweme = c1387240mCg.LIZ;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                if (baseControllerContext == null) {
                    return new C017G();
                }
                String strCf = baseControllerContext.Cf();
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                C1387230mCf c1387230mCf = c1387240mCg.LJII;
                C2344009Gk c2344009Gk = new C2344009Gk();
                C1612650s4F.LIZIZ.getClass();
                ISeriesCommonETService.LIZ.getClass();
                ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
                if (iSeriesCommonETServiceLIZ != null) {
                    iSeriesCommonETServiceLIZ.appendPaidContentParamForVideoPlay(aweme, c2344009Gk);
                }
                C017G c017g = new C017G();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, String> map = c2344009Gk.LIZ;
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                if (aweme != null) {
                    anchors = aweme.getAnchors();
                } else {
                    anchors = null;
                }
                if (anchors != null && anchors.size() > 0 && u.LJIJI(strCf, "anchor_detail", true)) {
                    AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) ListProtector.get(anchors, 0);
                    if (!TextUtils.isEmpty(anchorCommonStruct.getLogExtra())) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(anchorCommonStruct.getLogExtra());
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                Object obj = jSONObject2.get(next);
                                if (obj instanceof String) {
                                    linkedHashMap.put(next, obj);
                                }
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else {
                        linkedHashMap.put("anchor_type", "movie");
                        String keyword = anchorCommonStruct.getKeyword();
                        if (keyword == null) {
                            keyword = "";
                        }
                        linkedHashMap.put("anchor_entry", keyword);
                    }
                }
                if (aweme != null) {
                    User author = aweme.getAuthor();
                    if (author != null) {
                        try {
                            n nVar = (n) C08JS.LIZ(C1365450ldX.LJFF(author), n.class);
                            if (nVar != null && (setEntrySet2 = nVar.entrySet()) != null) {
                                Iterator<T> it2 = setEntrySet2.iterator();
                                while (it2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it2.next();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("social_info_");
                                    sbLIZ.append((String) entry.getKey());
                                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), ((k) entry.getValue()).LJIL());
                                }
                            }
                        } catch (s e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                    Music music = aweme.getMusic();
                    if (music != null && (logExtraMap = music.getLogExtraMap()) != null) {
                        for (Map.Entry<String, String> entry2 : logExtraMap.entrySet()) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    User author2 = aweme.getAuthor();
                    if (author2 != null) {
                        try {
                            n nVar2 = (n) C08JS.LIZ(C1365450ldX.LJFF(author2), n.class);
                            if (nVar2 != null && (setEntrySet = nVar2.entrySet()) != null) {
                                Iterator<T> it3 = setEntrySet.iterator();
                                while (it3.hasNext()) {
                                    Map.Entry entry3 = (Map.Entry) it3.next();
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("social_info_");
                                    sbLIZ2.append((String) entry3.getKey());
                                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ2), ((k) entry3.getValue()).LJIL());
                                }
                            }
                        } catch (s e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                    }
                }
                String str3 = CardStruct.IStatusCode.DEFAULT;
                if (aweme != null && aweme.getSurveyInfos() != null) {
                    List<SurveyInfo> surveyInfos = aweme.getSurveyInfos();
                    if (surveyInfos != null && surveyInfos.isEmpty()) {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        str2 = "1";
                    }
                    linkedHashMap.put("with_survey_info", str2);
                } else {
                    linkedHashMap.put("with_survey_info", CardStruct.IStatusCode.DEFAULT);
                }
                if (Intrinsics.LJFF("places_discover", strCf) || Intrinsics.LJFF("poi_detail", strCf)) {
                    if (param != null) {
                        String poiCollectInfo = param.getPoiCollectInfo();
                        if (poiCollectInfo != null) {
                            linkedHashMap.put("collect_info", poiCollectInfo);
                            try {
                                JSONObject jSONObject3 = new JSONObject(poiCollectInfo);
                                Iterator<String> itKeys2 = jSONObject3.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    String string = JSONObjectProtectorUtils.getString(jSONObject3, next2);
                                    if (next2 != null && string != null) {
                                        linkedHashMap.put(next2, string);
                                    }
                                }
                            } catch (JSONException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                            }
                        }
                        if (param != null) {
                            String pageCollectInfo = param.getPageCollectInfo();
                            if (pageCollectInfo != null) {
                                linkedHashMap.put("page_collect_info", pageCollectInfo);
                                try {
                                    JSONObject jSONObject4 = new JSONObject(pageCollectInfo);
                                    Iterator<String> itKeys3 = jSONObject4.keys();
                                    while (itKeys3.hasNext()) {
                                        String next3 = itKeys3.next();
                                        String string2 = JSONObjectProtectorUtils.getString(jSONObject4, next3);
                                        if (next3 != null && string2 != null) {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("page_");
                                            sbLIZ3.append(next3);
                                            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ3), string2);
                                        }
                                    }
                                } catch (JSONException e5) {
                                    TryCatchGuardChecker.doCheck(e5);
                                }
                            }
                            if (param != null && (poiExtras = param.getPoiExtras()) != null) {
                                for (Map.Entry<String, String> entry4 : poiExtras.entrySet()) {
                                    linkedHashMap.put(entry4.getKey(), entry4.getValue());
                                }
                            }
                        }
                    }
                    linkedHashMap.putAll(C1606660rua.LIZIZ.LJFF(baseControllerContext.Cf()));
                }
                if (param != null) {
                    inboxLogExtra = param.getInboxLogExtra();
                } else {
                    inboxLogExtra = null;
                }
                C1357130lQ7.LIZLLL(linkedHashMap, "video_play", inboxLogExtra, new C20468080c());
                if (param != null) {
                    previousPage = param.getPreviousPage();
                    fromGroupId = param.getFromGroupId();
                } else {
                    previousPage = null;
                    fromGroupId = null;
                }
                linkedHashMap.putAll(C584760Mwc.LIZIZ(previousPage, fromGroupId));
                IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel != null && (strXe1 = iBaseListFragmentPanel.Xe1()) != null) {
                    c1387240mCg.LIZJ.kd2();
                    linkedHashMap.put(strXe1, "");
                }
                C1387230mCf c1387230mCf2 = c1387240mCg.LJII;
                if (c1387230mCf2 != null && (jSONObject = c1387230mCf2.LLIZ) != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator<String> itKeys4 = jSONObject.keys();
                    while (itKeys4.hasNext()) {
                        try {
                            String next4 = itKeys4.next();
                            linkedHashMap2.put(next4, jSONObject.get(next4).toString());
                        } catch (JSONException e6) {
                            TryCatchGuardChecker.doCheck(e6);
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                }
                IFeedMobParamsProvider iFeedMobParamsProvider2 = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider2 != null && (param2 = iFeedMobParamsProvider2.getParam()) != null) {
                    fromProfileUid = param2.getFromProfileUid();
                } else {
                    fromProfileUid = null;
                }
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                C1359610lU7.LJ(c2344009Gk2, aweme, fromProfileUid);
                linkedHashMap.putAll(c2344009Gk2.LIZ);
                C1367960lha c1367960lha = C1367960lha.LIZ;
                if (c1367960lha != null && C1367960lha.LIZ() != null) {
                    IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
                    if (param != null) {
                        pagePoiId = param.getPagePoiId();
                    } else {
                        pagePoiId = null;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iPoiServiceLIZ.LJIILJJIL(aweme, pagePoiId));
                    C1367960lha.LIZ().LJZI(aweme, param, linkedHashMap3);
                    linkedHashMap.putAll(linkedHashMap3);
                }
                if (aweme != null) {
                    HashMap<String, String> map2 = new HashMap<>();
                    C1606660rua.LIZIZ.LIZJ(strCf, map2, aweme, false);
                    linkedHashMap.putAll(map2);
                    HashMap<String, String> map3 = new HashMap<>();
                    c1367960lha.getClass();
                    C1367960lha.LIZ().appendPoiTagParamsIfHave(strCf, map3, aweme);
                    linkedHashMap.putAll(map3);
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(C1367960lha.LIZ().LJIILJJIL(aweme, C1367960lha.LIZ().LJLJL(aweme.getAid())));
                    C1367960lha.LIZ().LJZI(aweme, param, linkedHashMap4);
                    C1893310zMv c1893310zMv = C1893310zMv.LIZIZ;
                    IBaseListFragmentPanel iBaseListFragmentPanel2 = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel2 != null) {
                        fragment2 = iBaseListFragmentPanel2.getFragment();
                    } else {
                        fragment2 = null;
                    }
                    c1893310zMv.LJII(PageFinder.via(fragment2), "video_play", linkedHashMap4, null);
                    linkedHashMap.putAll(linkedHashMap4);
                    linkedHashMap.putAll(LIZLLL(aweme, (String) linkedHashMap4.get("poi_id")));
                    Iterator<T> it4 = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZ().entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry5 = (Map.Entry) it4.next();
                        linkedHashMap.put(entry5.getKey(), entry5.getValue());
                    }
                    linkedHashMap.putAll(((C2344009Gk) C19651011uW.LIZIZ.LJIIIZ(aweme, new C2344009Gk())).LIZ);
                    LocalServiceInfo localServiceInfo = aweme.getLocalServiceInfo();
                    if (localServiceInfo != null && (boolIsLSContent = localServiceInfo.isLSContent()) != null && (strLIZLLL = C1200530hLX.LIZLLL(boolIsLSContent)) != null) {
                        str3 = strLIZLLL;
                    }
                    linkedHashMap.put("is_ls_content", str3);
                }
                linkedHashMap.putAll(C735370Ssx.LJJI(aweme));
                if (c1387230mCf != null && Intrinsics.LJFF(c1387230mCf.LLILZ, Boolean.TRUE)) {
                    C1389320mG2.LIZIZ(linkedHashMap);
                }
                C2344009Gk c2344009Gk3 = new C2344009Gk();
                IBaseListFragmentPanel iBaseListFragmentPanel3 = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel3 != null) {
                    context = iBaseListFragmentPanel3.getContext();
                } else {
                    context = null;
                }
                C0SXF.LJFF(c2344009Gk3, param, aweme, context, false);
                linkedHashMap.putAll(c2344009Gk3.LIZ);
                BtmSDK btmSDK = BtmSDK.INSTANCE;
                IBaseListFragmentPanel iBaseListFragmentPanel4 = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel4 != null) {
                    fragment = iBaseListFragmentPanel4.getFragment();
                } else {
                    fragment = null;
                }
                for (Map.Entry entry6 : BtmSDK.createReportParams$default(btmSDK, "c0.d0", PageFinder.via(fragment), null, 4, null).entrySet()) {
                    linkedHashMap.put(entry6.getKey(), String.valueOf(entry6.getValue()));
                }
                if (param != null) {
                    navArgModel = param.getNavArgModel();
                } else {
                    navArgModel = null;
                }
                linkedHashMap.putAll(LJ(aweme, navArgModel));
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                for (Map.Entry entry7 : linkedHashMap.entrySet()) {
                    String str4 = (String) entry7.getKey();
                    if ((str4 != null && str4.length() == 0) || ((str = (String) entry7.getValue()) != null && str.length() == 0)) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashSet.add("meta_song_matched_type");
                        linkedHashSet.add("ttm_matched_type");
                        linkedHashSet.add("ttm_track_id");
                        linkedHashSet.add("from_group_id");
                        linkedHashSet.add("group_id");
                        linkedHashSet.add("preview_status");
                        linkedHashSet.add("play_video_type");
                        linkedHashSet.add("series_enter_entrance");
                        if (!linkedHashSet.contains(entry7.getKey())) {
                        }
                    }
                    linkedHashMap5.put(entry7.getKey(), entry7.getValue());
                }
                c017g.LL = linkedHashMap5;
                return c017g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1, types: [int] */
            /* JADX WARN: Type inference failed for: r4v3 */
            public static Map LIZLLL(Aweme aweme, String str) {
                ?? r4;
                int i;
                List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
                if (interactStickerStructs != null && !interactStickerStructs.isEmpty()) {
                    for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                        if (interactStickerStruct.getPoiStickerStruct() != null) {
                            boolean zEquals = TextUtils.equals(interactStickerStruct.getPoiStickerStruct().getPoiId(), str);
                            i = 1;
                            r4 = zEquals;
                            break;
                        }
                    }
                    r4 = 0;
                    i = 0;
                } else {
                    r4 = 0;
                    i = 0;
                }
                return C2097608Jq.LJIIIIZZ(new Pair("is_poi_sticker", String.valueOf(i)), new Pair("is_sticker_poi", String.valueOf((int) r4)));
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static java.util.Map LJ(com.ss.android.ugc.aweme.feed.model.Aweme r14, com.ss.android.ugc.aweme.feed.param.DetailNavArgModel r15) {
                /*
                    Method dump skipped, instruction units count: 247
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1386290mB9.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.param.DetailNavArgModel):java.util.Map");
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1386590mBd>() { // from class: X.0mBc
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                C1386590mBd c1386590mBd = new C1386590mBd();
                C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                if (c19252910Tv.LIZLLL().LJIJI().LLJLLIL()) {
                    c1386590mBd.LLILLL = Boolean.valueOf(c19252910Tv.LIZLLL().LJIJI().LJLLL());
                    c1386590mBd.LLILZ = Boolean.valueOf(c19252910Tv.LIZLLL().LJIJI().LLJLL());
                }
                return c1386590mBd;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                C1386590mBd c1386590mBd = new C1386590mBd();
                C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                if (c19252910Tv.LIZLLL().LJIJI().LLLFF().LLIIZ()) {
                    c1386590mBd.LL = 0;
                    c1386590mBd.LLILLJJLI = 1;
                } else if (c19252910Tv.LIZLLL().LJIJI().LLLFF().LLLIIL()) {
                    c1386590mBd.LL = 1;
                    c1386590mBd.LLILLJJLI = 0;
                } else {
                    c1386590mBd.LL = 0;
                    c1386590mBd.LLILLJJLI = 0;
                }
                if (c19252910Tv.LIZLLL().LJIJI().LLJLLIL()) {
                    c1386590mBd.LLILLL = Boolean.valueOf(c19252910Tv.LIZLLL().LJIJI().LJLLL());
                    c1386590mBd.LLILZ = Boolean.valueOf(c19252910Tv.LIZLLL().LJIJI().LLJLL());
                }
                return c1386590mBd;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                C1386590mBd c1386590mBd = new C1386590mBd();
                C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                if (c19252910Tv.LIZLLL().LJIJI().LLLFF().LLIIZ()) {
                    c1386590mBd.LL = 0;
                    c1386590mBd.LLILLJJLI = 1;
                } else if (c19252910Tv.LIZLLL().LJIJI().LLLFF().LLLIIL()) {
                    c1386590mBd.LL = 1;
                    c1386590mBd.LLILLJJLI = 0;
                } else {
                    c1386590mBd.LL = 0;
                    c1386590mBd.LLILLJJLI = 0;
                }
                if (c19252910Tv.LIZLLL().LJIJI().LLJLLIL()) {
                    c1386590mBd.LLILLL = Boolean.valueOf(c19252910Tv.LIZLLL().LJIJI().LJLLL());
                    c1386590mBd.LLILZ = Boolean.valueOf(c19252910Tv.LIZLLL().LJIJI().LLJLL());
                }
                return c1386590mBd;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C2189911AnF>() { // from class: X.1AnE
            public static boolean LIZLLL(String str) {
                return ((ITakoService) ServiceManager.get().getService(ITakoService.class)).LJJJJIZL(str);
            }

            public static boolean LJFF(C2189821An6 c2189821An6) {
                boolean z;
                DetailNavArgModel navArgModel;
                String takoVideoSessionId;
                if (c2189821An6 != null && (navArgModel = c2189821An6.getNavArgModel()) != null && (takoVideoSessionId = navArgModel.getTakoVideoSessionId()) != null && takoVideoSessionId.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                return !z;
            }

            public static void LJI(C2189911AnF c2189911AnF) {
                C14FC c14fcLJJJJJL;
                C1862940yZw c1862940yZwLIZ;
                ITakoService iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null);
                if (iTakoService != null && (c14fcLJJJJJL = iTakoService.LJJJJJL()) != null && (c1862940yZwLIZ = c14fcLJJJJJL.LIZ()) != null) {
                    c2189911AnF.LLJJIJI = c1862940yZwLIZ.LIZ;
                    c2189911AnF.LLJJIJIL = c1862940yZwLIZ.LIZIZ;
                    c2189911AnF.LLJJIJIIJIL = c1862940yZwLIZ.LIZJ;
                }
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                C2189821An6 param;
                Integer numValueOf;
                String eventType;
                Aweme aweme = c1387240mCg.LIZ;
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel != null) {
                    numValueOf = Integer.valueOf(iBaseListFragmentPanel.LJLLJ());
                } else {
                    numValueOf = null;
                }
                if (param != null) {
                    eventType = param.getEventType();
                } else {
                    eventType = null;
                }
                boolean zLIZLLL = LIZLLL(eventType);
                boolean zLJFF = LJFF(param);
                if (!zLIZLLL && !zLJFF) {
                    return null;
                }
                Map<String, String> mapLJIL = C14TF.LIZIZ.LJIL(aweme, param);
                C2189911AnF c2189911AnF = new C2189911AnF();
                c2189911AnF.LL = mapLJIL.get("is_inner");
                c2189911AnF.LLILZIL = mapLJIL.get("is_mixed_layout");
                c2189911AnF.LLILZLL = mapLJIL.get("tako_response_type");
                c2189911AnF.LLIZ = mapLJIL.get("tako_response_rank");
                String str = mapLJIL.get("inspiration_session_id");
                if (str != null) {
                    c2189911AnF.LLJILLL = str;
                }
                String str2 = mapLJIL.get("bot_type");
                if (str2 != null) {
                    c2189911AnF.LLJJ = str2;
                }
                String str3 = mapLJIL.get("last_feed_group_id");
                if (str3 != null) {
                    c2189911AnF.LLJJIII = str3;
                }
                if (param != null) {
                    Long lValueOf = Long.valueOf(param.getTakoActionItemId());
                    if (lValueOf.longValue() > 0) {
                        c2189911AnF.LLILLJJLI = Long.valueOf(lValueOf.longValue());
                    }
                    String takoActionProcessId = param.getTakoActionProcessId();
                    if (takoActionProcessId != null && C123100dR.LIZ(takoActionProcessId)) {
                        c2189911AnF.LLILLL = takoActionProcessId;
                    }
                    String takoVideoLayer = param.getTakoVideoLayer();
                    if (takoVideoLayer != null && C123100dR.LIZ(takoVideoLayer)) {
                        c2189911AnF.LLILZ = takoVideoLayer;
                    }
                    String takoSituation = param.getTakoSituation();
                    if (takoSituation != null && C123100dR.LIZ(takoSituation)) {
                        c2189911AnF.LLIZLLLIL = takoSituation;
                    }
                    String takoCardRank = param.getTakoCardRank();
                    if (takoCardRank != null && C123100dR.LIZ(takoCardRank)) {
                        c2189911AnF.LLJ = takoCardRank;
                    }
                    String takoPage = param.getTakoPage();
                    if (takoPage != null && C123100dR.LIZ(takoPage)) {
                        c2189911AnF.LLJI = takoPage;
                    }
                    DetailNavArgModel navArgModel = param.getNavArgModel();
                    if (navArgModel != null) {
                        String takoInnerfeedEntranceGroupId = navArgModel.getTakoInnerfeedEntranceGroupId();
                        if (takoInnerfeedEntranceGroupId != null && C123100dR.LIZ(takoInnerfeedEntranceGroupId)) {
                            c2189911AnF.LLJIJIL = takoInnerfeedEntranceGroupId;
                        }
                        String takoInnerfeedEntranceRank = navArgModel.getTakoInnerfeedEntranceRank();
                        if (takoInnerfeedEntranceRank != null && C123100dR.LIZ(takoInnerfeedEntranceRank)) {
                            c2189911AnF.LLJILJIL = takoInnerfeedEntranceRank;
                        }
                        String takoItemUniqueId = navArgModel.getTakoItemUniqueId();
                        if (takoItemUniqueId != null && C123100dR.LIZ(takoItemUniqueId)) {
                            c2189911AnF.LLJJI = takoItemUniqueId;
                        }
                        if (C07HI.LIZIZ) {
                            String takoIndex = navArgModel.getTakoIndex();
                            if (takoIndex != null && C123100dR.LIZ(takoIndex)) {
                                c2189911AnF.LLJJJ = takoIndex;
                            }
                            String takoStyle = navArgModel.getTakoStyle();
                            if (takoStyle != null && C123100dR.LIZ(takoStyle)) {
                                c2189911AnF.LLJJJIL = takoStyle;
                            }
                            String takoWordsPos = navArgModel.getTakoWordsPos();
                            if (takoWordsPos != null && C123100dR.LIZ(takoWordsPos)) {
                                c2189911AnF.LLJJJJ = takoWordsPos;
                            }
                        }
                        String takoChatId = navArgModel.getTakoChatId();
                        if (takoChatId != null && C123100dR.LIZ(takoChatId)) {
                            c2189911AnF.LLJJJJJIL = takoChatId;
                        }
                        String takoSessionId = navArgModel.getTakoSessionId();
                        if (takoSessionId != null && C123100dR.LIZ(takoSessionId)) {
                            c2189911AnF.LLJJJJLIIL = takoSessionId;
                        }
                    }
                }
                if (numValueOf != null) {
                    numValueOf.intValue();
                    c2189911AnF.LLJILJILJ = numValueOf;
                }
                if (zLJFF) {
                    LJ(c2189911AnF, c1387240mCg, param);
                }
                LJI(c2189911AnF);
                return c2189911AnF;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                C2189821An6 param;
                Integer numValueOf;
                String eventType;
                Aweme aweme = c1387240mCg.LIZ;
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel != null) {
                    numValueOf = Integer.valueOf(iBaseListFragmentPanel.LJLLJ());
                } else {
                    numValueOf = null;
                }
                if (param != null) {
                    eventType = param.getEventType();
                } else {
                    eventType = null;
                }
                boolean zLIZLLL = LIZLLL(eventType);
                boolean zLJFF = LJFF(param);
                if (!zLIZLLL && !zLJFF) {
                    return null;
                }
                Map<String, String> mapLJIL = C14TF.LIZIZ.LJIL(aweme, param);
                C2189911AnF c2189911AnF = new C2189911AnF();
                c2189911AnF.LL = mapLJIL.get("is_inner");
                c2189911AnF.LLILZIL = mapLJIL.get("is_mixed_layout");
                c2189911AnF.LLILZLL = mapLJIL.get("tako_response_type");
                c2189911AnF.LLIZ = mapLJIL.get("tako_response_rank");
                String str = mapLJIL.get("inspiration_session_id");
                if (str != null) {
                    c2189911AnF.LLJILLL = str;
                }
                String str2 = mapLJIL.get("bot_type");
                if (str2 != null) {
                    c2189911AnF.LLJJ = str2;
                }
                String str3 = mapLJIL.get("last_feed_group_id");
                if (str3 != null) {
                    c2189911AnF.LLJJIII = str3;
                }
                if (param != null) {
                    Long lValueOf = Long.valueOf(param.getTakoActionItemId());
                    if (lValueOf.longValue() > 0) {
                        c2189911AnF.LLILLJJLI = Long.valueOf(lValueOf.longValue());
                    }
                    String takoActionProcessId = param.getTakoActionProcessId();
                    if (takoActionProcessId != null && C123100dR.LIZ(takoActionProcessId)) {
                        c2189911AnF.LLILLL = takoActionProcessId;
                    }
                    String takoVideoLayer = param.getTakoVideoLayer();
                    if (takoVideoLayer != null && C123100dR.LIZ(takoVideoLayer)) {
                        c2189911AnF.LLILZ = takoVideoLayer;
                    }
                    String takoSituation = param.getTakoSituation();
                    if (takoSituation != null && C123100dR.LIZ(takoSituation)) {
                        c2189911AnF.LLIZLLLIL = takoSituation;
                    }
                    String takoCardRank = param.getTakoCardRank();
                    if (takoCardRank != null && C123100dR.LIZ(takoCardRank)) {
                        c2189911AnF.LLJ = takoCardRank;
                    }
                    String takoPage = param.getTakoPage();
                    if (takoPage != null && C123100dR.LIZ(takoPage)) {
                        c2189911AnF.LLJI = takoPage;
                    }
                    DetailNavArgModel navArgModel = param.getNavArgModel();
                    if (navArgModel != null) {
                        String takoInnerfeedEntranceGroupId = navArgModel.getTakoInnerfeedEntranceGroupId();
                        if (takoInnerfeedEntranceGroupId != null && C123100dR.LIZ(takoInnerfeedEntranceGroupId)) {
                            c2189911AnF.LLJIJIL = takoInnerfeedEntranceGroupId;
                        }
                        String takoInnerfeedEntranceRank = navArgModel.getTakoInnerfeedEntranceRank();
                        if (takoInnerfeedEntranceRank != null && C123100dR.LIZ(takoInnerfeedEntranceRank)) {
                            c2189911AnF.LLJILJIL = takoInnerfeedEntranceRank;
                        }
                        String takoItemUniqueId = navArgModel.getTakoItemUniqueId();
                        if (takoItemUniqueId != null && C123100dR.LIZ(takoItemUniqueId)) {
                            c2189911AnF.LLJJI = takoItemUniqueId;
                        }
                        if (C07HI.LIZIZ) {
                            String takoIndex = navArgModel.getTakoIndex();
                            if (takoIndex != null && C123100dR.LIZ(takoIndex)) {
                                c2189911AnF.LLJJJ = takoIndex;
                            }
                            String takoStyle = navArgModel.getTakoStyle();
                            if (takoStyle != null && C123100dR.LIZ(takoStyle)) {
                                c2189911AnF.LLJJJIL = takoStyle;
                            }
                            String takoWordsPos = navArgModel.getTakoWordsPos();
                            if (takoWordsPos != null && C123100dR.LIZ(takoWordsPos)) {
                                c2189911AnF.LLJJJJ = takoWordsPos;
                            }
                        }
                        String takoChatId = navArgModel.getTakoChatId();
                        if (takoChatId != null && C123100dR.LIZ(takoChatId)) {
                            c2189911AnF.LLJJJJJIL = takoChatId;
                        }
                        String takoSessionId = navArgModel.getTakoSessionId();
                        if (takoSessionId != null && C123100dR.LIZ(takoSessionId)) {
                            c2189911AnF.LLJJJJLIIL = takoSessionId;
                        }
                    }
                }
                if (numValueOf != null) {
                    numValueOf.intValue();
                    c2189911AnF.LLJILJILJ = numValueOf;
                }
                if (zLJFF) {
                    LJ(c2189911AnF, c1387240mCg, param);
                }
                LJI(c2189911AnF);
                return c2189911AnF;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                C2189821An6 param;
                Integer numValueOf;
                String eventType;
                Aweme aweme = c1387240mCg.LIZ;
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel != null) {
                    numValueOf = Integer.valueOf(iBaseListFragmentPanel.LJLLJ());
                } else {
                    numValueOf = null;
                }
                if (param != null) {
                    eventType = param.getEventType();
                } else {
                    eventType = null;
                }
                boolean zLIZLLL = LIZLLL(eventType);
                boolean zLJFF = LJFF(param);
                if (!zLIZLLL && !zLJFF) {
                    return null;
                }
                Map<String, String> mapLJIL = C14TF.LIZIZ.LJIL(aweme, param);
                C2189911AnF c2189911AnF = new C2189911AnF();
                c2189911AnF.LL = mapLJIL.get("is_inner");
                c2189911AnF.LLILZIL = mapLJIL.get("is_mixed_layout");
                c2189911AnF.LLILZLL = mapLJIL.get("tako_response_type");
                c2189911AnF.LLIZ = mapLJIL.get("tako_response_rank");
                String str = mapLJIL.get("inspiration_session_id");
                if (str != null) {
                    c2189911AnF.LLJILLL = str;
                }
                String str2 = mapLJIL.get("bot_type");
                if (str2 != null) {
                    c2189911AnF.LLJJ = str2;
                }
                String str3 = mapLJIL.get("last_feed_group_id");
                if (str3 != null) {
                    c2189911AnF.LLJJIII = str3;
                }
                if (param != null) {
                    Long lValueOf = Long.valueOf(param.getTakoActionItemId());
                    if (lValueOf.longValue() > 0) {
                        c2189911AnF.LLILLJJLI = Long.valueOf(lValueOf.longValue());
                    }
                    String takoActionProcessId = param.getTakoActionProcessId();
                    if (takoActionProcessId != null && C123100dR.LIZ(takoActionProcessId)) {
                        c2189911AnF.LLILLL = takoActionProcessId;
                    }
                    String takoVideoLayer = param.getTakoVideoLayer();
                    if (takoVideoLayer != null && C123100dR.LIZ(takoVideoLayer)) {
                        c2189911AnF.LLILZ = takoVideoLayer;
                    }
                    String takoSituation = param.getTakoSituation();
                    if (takoSituation != null && C123100dR.LIZ(takoSituation)) {
                        c2189911AnF.LLIZLLLIL = takoSituation;
                    }
                    String takoCardRank = param.getTakoCardRank();
                    if (takoCardRank != null && C123100dR.LIZ(takoCardRank)) {
                        c2189911AnF.LLJ = takoCardRank;
                    }
                    String takoPage = param.getTakoPage();
                    if (takoPage != null && C123100dR.LIZ(takoPage)) {
                        c2189911AnF.LLJI = takoPage;
                    }
                    DetailNavArgModel navArgModel = param.getNavArgModel();
                    if (navArgModel != null) {
                        String takoInnerfeedEntranceGroupId = navArgModel.getTakoInnerfeedEntranceGroupId();
                        if (takoInnerfeedEntranceGroupId != null && C123100dR.LIZ(takoInnerfeedEntranceGroupId)) {
                            c2189911AnF.LLJIJIL = takoInnerfeedEntranceGroupId;
                        }
                        String takoInnerfeedEntranceRank = navArgModel.getTakoInnerfeedEntranceRank();
                        if (takoInnerfeedEntranceRank != null && C123100dR.LIZ(takoInnerfeedEntranceRank)) {
                            c2189911AnF.LLJILJIL = takoInnerfeedEntranceRank;
                        }
                        String takoItemUniqueId = navArgModel.getTakoItemUniqueId();
                        if (takoItemUniqueId != null && C123100dR.LIZ(takoItemUniqueId)) {
                            c2189911AnF.LLJJI = takoItemUniqueId;
                        }
                        if (C07HI.LIZIZ) {
                            String takoIndex = navArgModel.getTakoIndex();
                            if (takoIndex != null && C123100dR.LIZ(takoIndex)) {
                                c2189911AnF.LLJJJ = takoIndex;
                            }
                            String takoStyle = navArgModel.getTakoStyle();
                            if (takoStyle != null && C123100dR.LIZ(takoStyle)) {
                                c2189911AnF.LLJJJIL = takoStyle;
                            }
                            String takoWordsPos = navArgModel.getTakoWordsPos();
                            if (takoWordsPos != null && C123100dR.LIZ(takoWordsPos)) {
                                c2189911AnF.LLJJJJ = takoWordsPos;
                            }
                        }
                        String takoChatId = navArgModel.getTakoChatId();
                        if (takoChatId != null && C123100dR.LIZ(takoChatId)) {
                            c2189911AnF.LLJJJJJIL = takoChatId;
                        }
                        String takoSessionId = navArgModel.getTakoSessionId();
                        if (takoSessionId != null && C123100dR.LIZ(takoSessionId)) {
                            c2189911AnF.LLJJJJLIIL = takoSessionId;
                        }
                    }
                }
                if (numValueOf != null) {
                    numValueOf.intValue();
                    c2189911AnF.LLJILJILJ = numValueOf;
                }
                if (zLJFF) {
                    LJ(c2189911AnF, c1387240mCg, param);
                }
                LJI(c2189911AnF);
                return c2189911AnF;
            }

            public static void LJ(C2189911AnF c2189911AnF, C1387240mCg c1387240mCg, C2189821An6 c2189821An6) {
                Object obj;
                String str;
                String str2;
                AwemeBizData awemeBizData;
                Boolean bool;
                AwemeBizData awemeBizData2;
                String takoVideoSessionId;
                Object obj2 = null;
                if (c2189821An6 != null) {
                    String processId = c2189821An6.getProcessId();
                    if (processId != null && processId.length() > 0) {
                        c2189911AnF.LLJJL = processId;
                    }
                    DetailNavArgModel navArgModel = c2189821An6.getNavArgModel();
                    if (navArgModel != null && (takoVideoSessionId = navArgModel.getTakoVideoSessionId()) != null && takoVideoSessionId.length() > 0) {
                        c2189911AnF.LLJJLIIIJLLLLLLLZ = takoVideoSessionId;
                    }
                }
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme != null) {
                    IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                    if (iBaseListFragmentPanel != null) {
                        Integer numValueOf = Integer.valueOf(iBaseListFragmentPanel.hu(aweme));
                        if (numValueOf.intValue() >= 0) {
                            c2189911AnF.LLJL = Integer.valueOf(numValueOf.intValue());
                        }
                    }
                    ConcurrentHashMap<String, AwemeBizData> transientBizFields = aweme.getTransientBizFields();
                    if (transientBizFields != null && (awemeBizData2 = transientBizFields.get("tako_ai_video_recommend_type")) != null) {
                        obj = awemeBizData2.fieldData;
                    } else {
                        obj = null;
                    }
                    if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null && bool.booleanValue()) {
                        str = "Tako";
                    } else {
                        str = "FYP";
                    }
                    c2189911AnF.LLJLIL = str;
                    ConcurrentHashMap<String, AwemeBizData> transientBizFields2 = aweme.getTransientBizFields();
                    if (transientBizFields2 != null && (awemeBizData = transientBizFields2.get("tako_ai_video_track_info")) != null) {
                        obj2 = awemeBizData.fieldData;
                    }
                    if ((obj2 instanceof String) && (str2 = (String) obj2) != null && str2.length() > 0) {
                        c2189911AnF.LLJLILLLLZIIL = str2;
                    }
                }
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C0SUK>() { // from class: X.0Ssp
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg, false);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg, false);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg, true);
            }

            public static C0SUK LIZLLL(C1387240mCg c1387240mCg, boolean z) {
                String cmtToPostSourceGroupId;
                C2189821An6 param;
                DetailNavArgModel navArgModel;
                String cmtToPostSourceLinkPosition;
                C2189821An6 param2;
                DetailNavArgModel navArgModel2;
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    return null;
                }
                C0SUK c0suk = new C0SUK();
                if (C735370Ssx.LJJIIJ(aweme) || C735370Ssx.LJJIL(aweme)) {
                    c0suk.LL = "1";
                }
                if (C735370Ssx.LJJIL(aweme)) {
                    c0suk.LLILLJJLI = "1";
                }
                if (C735370Ssx.LJJIII(aweme)) {
                    c0suk.LLILLL = "1";
                }
                if (z) {
                    IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                    String str = "";
                    if (iFeedMobParamsProvider == null || (param2 = iFeedMobParamsProvider.getParam()) == null || (navArgModel2 = param2.getNavArgModel()) == null || (cmtToPostSourceGroupId = navArgModel2.getCmtToPostSourceGroupId()) == null) {
                        cmtToPostSourceGroupId = "";
                    }
                    c0suk.LLILZ = cmtToPostSourceGroupId;
                    IFeedMobParamsProvider iFeedMobParamsProvider2 = c1387240mCg.LJIIIIZZ;
                    if (iFeedMobParamsProvider2 != null && (param = iFeedMobParamsProvider2.getParam()) != null && (navArgModel = param.getNavArgModel()) != null && (cmtToPostSourceLinkPosition = navArgModel.getCmtToPostSourceLinkPosition()) != null) {
                        str = cmtToPostSourceLinkPosition;
                    }
                    c0suk.LLILZIL = str;
                }
                return c0suk;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C735310Ssr>() { // from class: X.0Ssq
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                C735310Ssr c735310Ssr = new C735310Ssr();
                c735310Ssr.LLILLL = Integer.valueOf(C1601690rmZ.LIZ(c1387240mCg.LIZ));
                return c735310Ssr;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                C735310Ssr c735310Ssr = new C735310Ssr();
                c735310Ssr.LLILLL = Integer.valueOf(C1601690rmZ.LIZ(c1387240mCg.LIZ));
                return c735310Ssr;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x00d4  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x00ed  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
            @Override // X.InterfaceC1386630mBh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC1282004zy LIZJ(X.C1387240mCg r7) {
                /*
                    Method dump skipped, instruction units count: 279
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C735300Ssq.LIZJ(X.0mCg):X.04zy");
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C0O0Z>() { // from class: X.0O0Y
            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                Long lValueOf;
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme == null) {
                    return new C0O0Z();
                }
                C0O0Z c0o0z = new C0O0Z();
                InteractiveRecMatchInfo interactiveRecMatchInfo = aweme.getInteractiveRecMatchInfo();
                int i = 0;
                if (interactiveRecMatchInfo != null && interactiveRecMatchInfo.getInstruction() > 0) {
                    i = 1;
                }
                c0o0z.LL = i;
                if (i == 0) {
                    return c0o0z;
                }
                String userQuery = null;
                if (interactiveRecMatchInfo != null) {
                    lValueOf = Long.valueOf(interactiveRecMatchInfo.getInstruction());
                } else {
                    lValueOf = null;
                }
                c0o0z.LLILLJJLI = lValueOf;
                if (interactiveRecMatchInfo != null) {
                    userQuery = interactiveRecMatchInfo.getUserQuery();
                }
                c0o0z.LLILLL = userQuery;
                return c0o0z;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C017A>() { // from class: X.0ND7
            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                String aKVar;
                Video video;
                VideoUrlModel playAddr;
                C017A c017a = new C017A();
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme != null && (video = aweme.getVideo()) != null && (playAddr = video.getPlayAddr()) != null) {
                    aKVar = playAddr.getaK();
                } else {
                    aKVar = null;
                }
                c017a.LL = Boolean.valueOf(C123100dR.LIZ(aKVar));
                return c017a;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C017E>() { // from class: X.0StG
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                String originalSimilarGroupId;
                C2189821An6 param;
                C017E c017e = new C017E();
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null && (param = iFeedMobParamsProvider.getParam()) != null) {
                    originalSimilarGroupId = param.getOriginalSimilarGroupId();
                } else {
                    originalSimilarGroupId = null;
                }
                c017e.LL = originalSimilarGroupId;
                return c017e;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                String originalSimilarGroupId;
                C2189821An6 param;
                C017E c017e = new C017E();
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null && (param = iFeedMobParamsProvider.getParam()) != null) {
                    originalSimilarGroupId = param.getOriginalSimilarGroupId();
                } else {
                    originalSimilarGroupId = null;
                }
                c017e.LL = originalSimilarGroupId;
                return c017e;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                String originalSimilarGroupId;
                C2189821An6 param;
                C017E c017e = new C017E();
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null && (param = iFeedMobParamsProvider.getParam()) != null) {
                    originalSimilarGroupId = param.getOriginalSimilarGroupId();
                } else {
                    originalSimilarGroupId = null;
                }
                c017e.LL = originalSimilarGroupId;
                return c017e;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<AnonymousClass0179>() { // from class: X.0mBF
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return new AnonymousClass0179();
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return new AnonymousClass0179();
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                Fragment fragment;
                AnonymousClass0179 anonymousClass0179 = new AnonymousClass0179();
                C2344009Gk c2344009Gk = new C2344009Gk();
                C1400330mXn c1400330mXn = C1400330mXn.LIZ;
                IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel != null) {
                    fragment = iBaseListFragmentPanel.getFragment();
                } else {
                    fragment = null;
                }
                c1400330mXn.getClass();
                C1400330mXn.LIZ(fragment, c2344009Gk);
                anonymousClass0179.LL = (String) ((HashMap) c2344009Gk.LIZ).get("last_prev_page_group_id");
                return anonymousClass0179;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1205360hTK>() { // from class: X.0hTO
            public boolean LIZ;
            public boolean LIZIZ;
            public boolean LIZJ;

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                String strCf;
                int iHu;
                String strValueOf;
                String str;
                Aweme aweme = c1387240mCg.LIZ;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                C1205360hTK c1205360hTK = null;
                if (baseControllerContext != null) {
                    strCf = baseControllerContext.Cf();
                } else {
                    strCf = null;
                }
                boolean zLJJIJIIJIL = C735370Ssx.LJJIJIIJIL(strCf);
                C1606660rua c1606660rua = C1606660rua.LIZIZ;
                boolean zLJ = c1606660rua.LJ();
                if (zLJJIJIIJIL) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C1205210hT5.LIZ(null, linkedHashMap, strCf, "video_play_finish");
                    c1205360hTK = new C1205360hTK();
                    c1205360hTK.LLILZIL = (String) linkedHashMap.get("nearby_tab_city_id");
                    c1205360hTK.LLILZLL = (String) linkedHashMap.get("device_tabcity_location_relationship");
                    if (zLJ) {
                        IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                        if (iBaseListFragmentPanel != null) {
                            iHu = iBaseListFragmentPanel.hu(aweme);
                        } else {
                            iHu = 0;
                        }
                        C1205250hT9 c1205250hT9 = C1205250hT9.LIZIZ;
                        int iLJIIIZ = c1205250hT9.LJIIIZ();
                        Long lLIZLLL = c1205250hT9.LIZLLL();
                        if (c1606660rua.LJIIZILJ()) {
                            strValueOf = String.valueOf(iHu);
                        } else {
                            strValueOf = String.valueOf(iHu - iLJIIIZ);
                        }
                        if (!this.LIZIZ && iHu == iLJIIIZ) {
                            this.LIZIZ = true;
                            str = "click";
                        } else {
                            str = "slide";
                        }
                        c1205360hTK.LL = String.valueOf(iLJIIIZ);
                        c1205360hTK.LLILLJJLI = strValueOf;
                        c1205360hTK.LLILZ = str;
                        c1205360hTK.LLILLL = "1";
                        c1205360hTK.LLIZ = lLIZLLL;
                    }
                }
                return c1205360hTK;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                String strCf;
                int iHu;
                String strValueOf;
                String str;
                Aweme aweme = c1387240mCg.LIZ;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                C1205360hTK c1205360hTK = null;
                if (baseControllerContext != null) {
                    strCf = baseControllerContext.Cf();
                } else {
                    strCf = null;
                }
                boolean zLJJIJIIJIL = C735370Ssx.LJJIJIIJIL(strCf);
                C1606660rua c1606660rua = C1606660rua.LIZIZ;
                boolean zLJ = c1606660rua.LJ();
                if (zLJJIJIIJIL) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C1205210hT5.LIZ(null, linkedHashMap, strCf, "play_time");
                    c1205360hTK = new C1205360hTK();
                    c1205360hTK.LLILZIL = (String) linkedHashMap.get("nearby_tab_city_id");
                    c1205360hTK.LLILZLL = (String) linkedHashMap.get("device_tabcity_location_relationship");
                    if (zLJ) {
                        IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                        if (iBaseListFragmentPanel != null) {
                            iHu = iBaseListFragmentPanel.hu(aweme);
                        } else {
                            iHu = 0;
                        }
                        C1205250hT9 c1205250hT9 = C1205250hT9.LIZIZ;
                        int iLJIIIZ = c1205250hT9.LJIIIZ();
                        Long lLIZLLL = c1205250hT9.LIZLLL();
                        if (c1606660rua.LJIIZILJ()) {
                            strValueOf = String.valueOf(iHu);
                        } else {
                            strValueOf = String.valueOf(iHu - iLJIIIZ);
                        }
                        if (!this.LIZJ && iHu == iLJIIIZ) {
                            this.LIZJ = true;
                            str = "click";
                        } else {
                            str = "slide";
                        }
                        c1205360hTK.LL = String.valueOf(iLJIIIZ);
                        c1205360hTK.LLILLJJLI = strValueOf;
                        c1205360hTK.LLILZ = str;
                        c1205360hTK.LLILLL = "1";
                        c1205360hTK.LLIZ = lLIZLLL;
                    }
                }
                return c1205360hTK;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                String strCf;
                int iHu;
                String strValueOf;
                String str;
                Aweme aweme = c1387240mCg.LIZ;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                C1205360hTK c1205360hTK = null;
                if (baseControllerContext != null) {
                    strCf = baseControllerContext.Cf();
                } else {
                    strCf = null;
                }
                boolean zLJJIJIIJIL = C735370Ssx.LJJIJIIJIL(strCf);
                C1606660rua c1606660rua = C1606660rua.LIZIZ;
                boolean zLJ = c1606660rua.LJ();
                if (zLJJIJIIJIL) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C1205210hT5.LIZ(null, linkedHashMap, strCf, "video_play");
                    c1205360hTK = new C1205360hTK();
                    c1205360hTK.LLILZIL = (String) linkedHashMap.get("nearby_tab_city_id");
                    c1205360hTK.LLILZLL = (String) linkedHashMap.get("device_tabcity_location_relationship");
                    if (zLJ) {
                        IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                        if (iBaseListFragmentPanel != null) {
                            iHu = iBaseListFragmentPanel.hu(aweme);
                        } else {
                            iHu = 0;
                        }
                        C1205250hT9 c1205250hT9 = C1205250hT9.LIZIZ;
                        int iLJIIIZ = c1205250hT9.LJIIIZ();
                        Long lLIZLLL = c1205250hT9.LIZLLL();
                        if (c1606660rua.LJIIZILJ()) {
                            strValueOf = String.valueOf(iHu);
                        } else {
                            strValueOf = String.valueOf(iHu - iLJIIIZ);
                        }
                        if (!this.LIZ && iHu == iLJIIIZ) {
                            this.LIZ = true;
                            str = "click";
                        } else {
                            str = "slide";
                        }
                        c1205360hTK.LL = String.valueOf(iLJIIIZ);
                        c1205360hTK.LLILLJJLI = strValueOf;
                        c1205360hTK.LLILZ = str;
                        c1205360hTK.LLILLL = "1";
                        c1205360hTK.LLIZ = lLIZLLL;
                    }
                }
                return c1205360hTK;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<AnonymousClass0177>() { // from class: X.0Mz8
            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                AnonymousClass0177 anonymousClass0177 = new AnonymousClass0177();
                if (C269590AhR.LIZ() > 0) {
                    anonymousClass0177.LL = Integer.valueOf(C269590AhR.LIZ());
                }
                return anonymousClass0177;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                AnonymousClass0177 anonymousClass0177 = new AnonymousClass0177();
                if (C269590AhR.LIZ() > 0) {
                    anonymousClass0177.LL = Integer.valueOf(C269590AhR.LIZ());
                }
                return anonymousClass0177;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                AnonymousClass0177 anonymousClass0177 = new AnonymousClass0177();
                if (C269590AhR.LIZ() > 0) {
                    anonymousClass0177.LL = Integer.valueOf(C269590AhR.LIZ());
                }
                return anonymousClass0177;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1205350hTJ>() { // from class: X.0hTP
            public static C1205350hTJ LIZLLL(C1387240mCg c1387240mCg) {
                String strCf;
                String pagePoiId;
                Integer numValueOf;
                String string;
                Integer numValueOf2;
                C2189821An6 param;
                BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                String string2 = null;
                if (baseControllerContext != null) {
                    strCf = baseControllerContext.Cf();
                } else {
                    strCf = null;
                }
                if (!Intrinsics.LJFF(strCf, "poi_detail")) {
                    return null;
                }
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider != null && (param = iFeedMobParamsProvider.getParam()) != null) {
                    pagePoiId = param.getPagePoiId();
                } else {
                    pagePoiId = null;
                }
                Integer poiDetailFeedClickIndex = ((IPoiDetailPageService) ServiceManager.get().getService(IPoiService.class)).getPoiDetailFeedClickIndex(pagePoiId);
                IBaseListFragmentPanel iBaseListFragmentPanel = c1387240mCg.LIZJ;
                if (iBaseListFragmentPanel != null && (numValueOf2 = Integer.valueOf(iBaseListFragmentPanel.hu(c1387240mCg.LIZ))) != null && poiDetailFeedClickIndex != null) {
                    numValueOf = Integer.valueOf(numValueOf2.intValue() - poiDetailFeedClickIndex.intValue());
                } else {
                    numValueOf = null;
                }
                C1205350hTJ c1205350hTJ = new C1205350hTJ();
                if (poiDetailFeedClickIndex != null) {
                    string = poiDetailFeedClickIndex.toString();
                } else {
                    string = null;
                }
                c1205350hTJ.LL = string;
                if (numValueOf != null) {
                    string2 = numValueOf.toString();
                }
                c1205350hTJ.LLILLJJLI = string2;
                return c1205350hTJ;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1361000lWM>() { // from class: X.0lWL
            /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static X.C1361000lWM LIZLLL(X.C1387240mCg r6) {
                /*
                    Method dump skipped, instruction units count: 212
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1360990lWL.LIZLLL(X.0mCg):X.0lWM");
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1360970lWJ>() { // from class: X.0lWK
            public static C1360970lWJ LIZLLL(C1387240mCg c1387240mCg) {
                String homepageUid;
                C2189821An6 param;
                C2189821An6 param2;
                C1360970lWJ c1360970lWJ = new C1360970lWJ();
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                String profileEntranceId = null;
                if (iFeedMobParamsProvider != null && (param2 = iFeedMobParamsProvider.getParam()) != null) {
                    homepageUid = param2.getHomepageUid();
                } else {
                    homepageUid = null;
                }
                c1360970lWJ.LL = homepageUid;
                IFeedMobParamsProvider iFeedMobParamsProvider2 = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider2 != null && (param = iFeedMobParamsProvider2.getParam()) != null) {
                    profileEntranceId = param.getProfileEntranceId();
                }
                c1360970lWJ.LLILLJJLI = profileEntranceId;
                return c1360970lWJ;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C017F>() { // from class: X.0lfc
            public static C017F LIZLLL(C1387240mCg c1387240mCg) {
                String eventType;
                String eventType2;
                Object c098200Yq;
                String attachedVibeFeedId;
                String strOptString;
                String vibeExtraParam;
                C2189821An6 param;
                DetailNavArgModel navArgModel;
                Object c098200Yq2;
                String strOptString2;
                String vibeExtraParam2;
                C2189821An6 param2;
                DetailNavArgModel navArgModel2;
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                String strLIZIZ = null;
                if (iFeedMobParamsProvider != null) {
                    eventType = iFeedMobParamsProvider.getEventType();
                } else {
                    eventType = null;
                }
                String str = "";
                if (C1575980r76.LIZIZ(eventType)) {
                    C017F c017f = new C017F();
                    try {
                        IFeedMobParamsProvider iFeedMobParamsProvider2 = c1387240mCg.LJIIIIZZ;
                        if (iFeedMobParamsProvider2 == null || (param2 = iFeedMobParamsProvider2.getParam()) == null || (navArgModel2 = param2.getNavArgModel()) == null || (vibeExtraParam2 = navArgModel2.getVibeExtraParam()) == null) {
                            vibeExtraParam2 = "";
                        }
                        c098200Yq2 = new JSONObject(vibeExtraParam2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq2 = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                        c098200Yq2 = null;
                    }
                    JSONObject jSONObject = (JSONObject) c098200Yq2;
                    if (jSONObject != null && (strOptString2 = jSONObject.optString("conversation_id")) != null) {
                        str = strOptString2;
                    }
                    IVibeCacheService iVibeCacheService = (IVibeCacheService) C1557990qe5.LIZJ.getValue();
                    if (iVibeCacheService != null) {
                        strLIZIZ = iVibeCacheService.LIZIZ(str);
                    }
                    c017f.LL = strLIZIZ;
                    return c017f;
                }
                IFeedMobParamsProvider iFeedMobParamsProvider3 = c1387240mCg.LJIIIIZZ;
                if (iFeedMobParamsProvider3 != null) {
                    eventType2 = iFeedMobParamsProvider3.getEventType();
                } else {
                    eventType2 = null;
                }
                if (!C1575980r76.LIZ(eventType2)) {
                    return null;
                }
                C017F c017f2 = new C017F();
                try {
                    IFeedMobParamsProvider iFeedMobParamsProvider4 = c1387240mCg.LJIIIIZZ;
                    if (iFeedMobParamsProvider4 == null || (param = iFeedMobParamsProvider4.getParam()) == null || (navArgModel = param.getNavArgModel()) == null || (vibeExtraParam = navArgModel.getVibeExtraParam()) == null) {
                        vibeExtraParam = "";
                    }
                    c098200Yq = new JSONObject(vibeExtraParam);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                JSONObject jSONObject2 = (JSONObject) c098200Yq;
                if (jSONObject2 != null && (strOptString = jSONObject2.optString("conversation_id")) != null) {
                    str = strOptString;
                }
                Aweme aweme = c1387240mCg.LIZ;
                if (aweme != null && (attachedVibeFeedId = AwemeBizExtKt.getAttachedVibeFeedId(aweme)) != null) {
                    strLIZIZ = attachedVibeFeedId;
                } else {
                    IVibeCacheService iVibeCacheService2 = (IVibeCacheService) C1557990qe5.LIZJ.getValue();
                    if (iVibeCacheService2 != null) {
                        strLIZIZ = iVibeCacheService2.LIZIZ(str);
                    }
                }
                c017f2.LL = strLIZIZ;
                return c017f2;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1386780mBw>() { // from class: X.0mBx
            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                Integer num;
                Integer num2;
                Integer num3;
                Integer num4;
                Integer num5;
                Integer num6;
                Integer num7;
                C1386780mBw c1386780mBw = new C1386780mBw();
                C1387230mCf c1387230mCf = c1387240mCg.LJII;
                Float f = null;
                if (c1387230mCf != null) {
                    num = c1387230mCf.LLLF;
                } else {
                    num = null;
                }
                c1386780mBw.LL = num;
                if (c1387230mCf != null) {
                    num2 = c1387230mCf.LLLFF;
                } else {
                    num2 = null;
                }
                c1386780mBw.LLILLJJLI = num2;
                if (c1387230mCf != null) {
                    num3 = c1387230mCf.LLLFZ;
                } else {
                    num3 = null;
                }
                c1386780mBw.LLILZ = num3;
                if (c1387230mCf != null) {
                    num4 = c1387230mCf.LLLFFI;
                } else {
                    num4 = null;
                }
                c1386780mBw.LLILLL = num4;
                if (c1387230mCf != null) {
                    num5 = c1387230mCf.LLLI;
                } else {
                    num5 = null;
                }
                c1386780mBw.LLILZIL = num5;
                if (c1387230mCf != null) {
                    num6 = c1387230mCf.LLLII;
                } else {
                    num6 = null;
                }
                c1386780mBw.LLILZLL = num6;
                if (c1387230mCf != null) {
                    num7 = c1387230mCf.LLLIIII;
                } else {
                    num7 = null;
                }
                c1386780mBw.LLIZ = num7;
                if (c1387230mCf != null) {
                    f = c1387230mCf.LLLIIIIL;
                }
                c1386780mBw.LLIZLLLIL = f;
                return c1386780mBw;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1386800mBy>() { // from class: X.0mBz
            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                Integer num;
                Float f;
                C1386800mBy c1386800mBy = new C1386800mBy();
                C1387230mCf c1387230mCf = c1387240mCg.LJII;
                Integer num2 = null;
                if (c1387230mCf != null) {
                    num = c1387230mCf.LLLIIIL;
                } else {
                    num = null;
                }
                c1386800mBy.LL = num;
                if (c1387230mCf != null) {
                    f = c1387230mCf.LLLIIL;
                } else {
                    f = null;
                }
                c1386800mBy.LLILLJJLI = f;
                if (c1387230mCf != null) {
                    num2 = c1387230mCf.LLLIILIL;
                }
                c1386800mBy.LLILLL = num2;
                return c1386800mBy;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C1386340mBE>() { // from class: X.0mBD
            public Boolean LIZ;

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                C2189821An6 param;
                boolean z;
                IFeedMobParamsProvider iFeedMobParamsProvider;
                JSONObject jSONObjectRC2;
                C2189821An6 param2;
                IFeedMobParamsProvider iFeedMobParamsProvider2 = c1387240mCg.LJIIIIZZ;
                String eventType = null;
                if (iFeedMobParamsProvider2 != null) {
                    param = iFeedMobParamsProvider2.getParam();
                } else {
                    param = null;
                }
                Aweme aweme = c1387240mCg.LIZ;
                boolean z2 = false;
                if (aweme != null && AwemeExtKt.isPhotoMode(aweme)) {
                    z = true;
                } else {
                    z = false;
                }
                if (C1360340lVI.LIZ(param)) {
                    this.LIZ = Boolean.FALSE;
                } else {
                    IFeedMobParamsProvider iFeedMobParamsProvider3 = c1387240mCg.LJIIIIZZ;
                    if (iFeedMobParamsProvider3 != null && (param2 = iFeedMobParamsProvider3.getParam()) != null) {
                        eventType = param2.getEventType();
                    }
                    if (Intrinsics.LJFF(eventType, "homepage_friends") && C319860CgK.LIZ() && !z && (iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ) != null && (jSONObjectRC2 = iFeedMobParamsProvider.RC2()) != null) {
                        if (jSONObjectRC2.optInt("is_auto_play") == 1) {
                            z2 = true;
                        }
                        this.LIZ = Boolean.valueOf(z2);
                    }
                }
                return LIZLLL(c1387240mCg);
            }

            public final C1386340mBE LIZLLL(C1387240mCg c1387240mCg) {
                boolean z;
                C2189821An6 param;
                String friendsV3DetailType;
                String eventType;
                JSONObject jSONObjectRC2;
                Integer numLJIIJJI;
                boolean zBooleanValue;
                C2189821An6 param2;
                JSONObject jSONObjectRC22;
                DetailNavArgModel navArgModel;
                Aweme aweme = c1387240mCg.LIZ;
                boolean zBooleanValue2 = true;
                int i = 0;
                if (aweme != null && AwemeExtKt.isPhotoMode(aweme)) {
                    z = true;
                } else {
                    z = false;
                }
                C1386340mBE c1386340mBE = new C1386340mBE();
                IFeedMobParamsProvider iFeedMobParamsProvider = c1387240mCg.LJIIIIZZ;
                String from = null;
                if (iFeedMobParamsProvider != null) {
                    param = iFeedMobParamsProvider.getParam();
                } else {
                    param = null;
                }
                if (C1360340lVI.LIZ(param)) {
                    c1386340mBE.LLILLL = "v3.0";
                    C1360330lVH c1360330lVH = new C1360330lVH(C1389300mG0.LIZJ(param), null, null, null, 14);
                    c1386340mBE.LLILZ = 0;
                    BaseControllerContext baseControllerContext = c1387240mCg.LJI;
                    if (baseControllerContext != null) {
                        from = baseControllerContext.getFrom();
                    }
                    boolean zLJFF = Intrinsics.LJFF(from, "STORY_ENTRANCE_FRIENDS_TOP_LIST");
                    c1386340mBE.LLILZIL = CardStruct.IStatusCode.DEFAULT;
                    if (c1360330lVH.LIZ() || zLJFF) {
                        i = 1;
                    }
                    c1386340mBE.LL = Integer.valueOf(i);
                    if (!z) {
                        Boolean bool = this.LIZ;
                        if (bool != null) {
                            zBooleanValue2 = bool.booleanValue();
                        }
                        c1386340mBE.LLILZLL = C1200530hLX.LIZLLL(Boolean.valueOf(zBooleanValue2));
                    }
                } else {
                    if (param != null && (navArgModel = param.getNavArgModel()) != null) {
                        friendsV3DetailType = navArgModel.getFriendsV3DetailType();
                    } else {
                        friendsV3DetailType = null;
                    }
                    if (Intrinsics.LJFF(friendsV3DetailType, "friends_v3_text_post_detail")) {
                        c1386340mBE.LL = 1;
                        IFeedMobParamsProvider iFeedMobParamsProvider2 = c1387240mCg.LJIIIIZZ;
                        if (iFeedMobParamsProvider2 != null && (jSONObjectRC22 = iFeedMobParamsProvider2.RC2()) != null) {
                            c1386340mBE.LLILLJJLI = Integer.valueOf(jSONObjectRC22.optInt("is_with_comment"));
                            return c1386340mBE;
                        }
                    } else {
                        if (C1360340lVI.LJ(param)) {
                            c1386340mBE.LLILLL = "v3.0";
                            c1386340mBE.LLILZ = 1;
                            c1386340mBE.LL = 0;
                            return c1386340mBE;
                        }
                        IFeedMobParamsProvider iFeedMobParamsProvider3 = c1387240mCg.LJIIIIZZ;
                        if (iFeedMobParamsProvider3 != null && (param2 = iFeedMobParamsProvider3.getParam()) != null) {
                            eventType = param2.getEventType();
                        } else {
                            eventType = null;
                        }
                        if (Intrinsics.LJFF(eventType, "homepage_friends") && C319860CgK.LIZ()) {
                            c1386340mBE.LLILLL = "v3.0";
                            c1386340mBE.LLILZ = 0;
                            c1386340mBE.LL = 0;
                            IFeedMobParamsProvider iFeedMobParamsProvider4 = c1387240mCg.LJIIIIZZ;
                            if (iFeedMobParamsProvider4 != null && (jSONObjectRC2 = iFeedMobParamsProvider4.RC2()) != null) {
                                c1386340mBE.LLILLJJLI = Integer.valueOf(jSONObjectRC2.optInt("is_with_comment"));
                                c1386340mBE.LLILZIL = String.valueOf(jSONObjectRC2.optInt("is_mute"));
                                if (!z) {
                                    Boolean bool2 = this.LIZ;
                                    if (bool2 != null) {
                                        zBooleanValue = bool2.booleanValue();
                                    } else {
                                        zBooleanValue = false;
                                    }
                                    c1386340mBE.LLILZLL = C1200530hLX.LIZLLL(Boolean.valueOf(zBooleanValue));
                                }
                                String strOptString = jSONObjectRC2.optString("enter_position");
                                if (strOptString.length() <= 0) {
                                    zBooleanValue2 = false;
                                }
                                if (Boolean.valueOf(zBooleanValue2).booleanValue()) {
                                    from = strOptString;
                                }
                                c1386340mBE.LLIZ = from;
                                if (C0BLI.LIZ() && (numLJIIJJI = C2095008Iq.LJIIJJI(jSONObjectRC2.optString("is_recommend"))) != null) {
                                    c1386340mBE.LLIZLLLIL = Integer.valueOf(numLJIIJJI.intValue());
                                    return c1386340mBE;
                                }
                            }
                        }
                    }
                }
                return c1386340mBE;
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<C586300Mz6>() { // from class: X.0Mz7
            public static C586300Mz6 LIZLLL(C1387240mCg c1387240mCg) {
                boolean z;
                Integer num;
                C586300Mz6 c586300Mz6 = new C586300Mz6();
                Aweme aweme = c1387240mCg.LIZ;
                boolean z2 = false;
                if (aweme != null && AwemeExtKt.isOfflineVideo(aweme)) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean bool = null;
                if (z) {
                    num = 1;
                } else {
                    num = null;
                }
                c586300Mz6.LL = num;
                Boolean boolValueOf = Boolean.valueOf(C1EE1.LIZIZ.LJJIII());
                if (boolValueOf.booleanValue()) {
                    z2 = true;
                }
                if (Boolean.valueOf(z2).booleanValue()) {
                    bool = boolValueOf;
                }
                c586300Mz6.LLILLJJLI = bool;
                return c586300Mz6;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                return LIZLLL(c1387240mCg);
            }
        });
        this.LIZ.add(new InterfaceC1386630mBh<AnonymousClass0178>() { // from class: X.0mBg
            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final /* bridge */ /* synthetic */ InterfaceC1282004zy LIZIZ(C1387240mCg c1387240mCg) {
                return null;
            }

            @Override // X.InterfaceC1386630mBh
            public final InterfaceC1282004zy LIZJ(C1387240mCg c1387240mCg) {
                if (C04VM.LIZ()) {
                    String str = (String) C705402pA.LIZIZ(c1387240mCg.LIZ).getFirst();
                    if (str.length() != 0) {
                        AnonymousClass0178 anonymousClass0178 = new AnonymousClass0178();
                        anonymousClass0178.LL = str;
                        return anonymousClass0178;
                    }
                    return null;
                }
                return null;
            }
        });
        this.LIZ.add(new C1386550mBZ());
    }

    public final void LIZIZ(C1387240mCg c1387240mCg) {
        VideoPlayEventNew videoPlayEventNew = new VideoPlayEventNew();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1386630mBh<? extends InterfaceC1282004zy> interfaceC1386630mBh : this.LIZ) {
            if (interfaceC1386630mBh instanceof C1386550mBZ) {
                interfaceC1386630mBh.getClass();
                C0279007p c0279007pLJI = C1386550mBZ.LJI(c1387240mCg, arrayList);
                videoPlayEventNew.LIZ().add(c0279007pLJI);
                arrayList.add(c0279007pLJI);
            } else {
                InterfaceC1282004zy interfaceC1282004zyLIZJ = interfaceC1386630mBh.LIZJ(c1387240mCg);
                if (interfaceC1282004zyLIZJ != null) {
                    videoPlayEventNew.LIZ().add(interfaceC1282004zyLIZJ);
                    arrayList.add(interfaceC1282004zyLIZJ);
                }
            }
        }
        videoPlayEventNew.LJIIIZ();
    }

    public final void LIZJ(C1387240mCg c1387240mCg) {
        VideoPlayFinishEventNew videoPlayFinishEventNew = new VideoPlayFinishEventNew();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1386630mBh<? extends InterfaceC1282004zy> interfaceC1386630mBh : this.LIZ) {
            if (interfaceC1386630mBh instanceof C1386550mBZ) {
                interfaceC1386630mBh.getClass();
                C0279007p c0279007pLJFF = C1386550mBZ.LJFF(c1387240mCg, arrayList);
                videoPlayFinishEventNew.LIZ().add(c0279007pLJFF);
                arrayList.add(c0279007pLJFF);
            } else {
                InterfaceC1282004zy interfaceC1282004zyLIZ = interfaceC1386630mBh.LIZ(c1387240mCg);
                if (interfaceC1282004zyLIZ != null) {
                    videoPlayFinishEventNew.LIZ().add(interfaceC1282004zyLIZ);
                    arrayList.add(interfaceC1282004zyLIZ);
                }
            }
        }
        videoPlayFinishEventNew.LJIIIZ();
    }

    public final void LIZLLL(C1387240mCg c1387240mCg) {
        PlayTimeEventNew playTimeEventNew = new PlayTimeEventNew();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1386630mBh<? extends InterfaceC1282004zy> interfaceC1386630mBh : this.LIZ) {
            if (interfaceC1386630mBh instanceof C1386550mBZ) {
                interfaceC1386630mBh.getClass();
                C0279007p c0279007pLJII = C1386550mBZ.LJII(c1387240mCg, arrayList);
                playTimeEventNew.LIZ().add(c0279007pLJII);
                arrayList.add(c0279007pLJII);
            } else {
                InterfaceC1282004zy interfaceC1282004zyLIZIZ = interfaceC1386630mBh.LIZIZ(c1387240mCg);
                if (interfaceC1282004zyLIZIZ != null) {
                    playTimeEventNew.LIZ().add(interfaceC1282004zyLIZIZ);
                    arrayList.add(interfaceC1282004zyLIZIZ);
                }
            }
        }
        playTimeEventNew.LJIIIZ();
        ICommonFeedAppDiffProtocol.LIZ.getClass();
        C1865480ye2.LIZ().LIZLLL();
    }
}
