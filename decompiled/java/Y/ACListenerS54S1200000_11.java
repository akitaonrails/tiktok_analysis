package Y;

import X.AbstractC714580S1g;
import X.C0OBG;
import X.C0S1X;
import X.C0S1Z;
import X.C0SVZ;
import X.C0Y8T;
import X.C0ZH0;
import X.C1336205Ku;
import X.C1483410ohn;
import X.C1599690rjL;
import X.C1954807lC;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C297010BkZ;
import X.C332740D2q;
import X.C424420Gka;
import X.C631370Opb;
import X.C698050RZr;
import X.C714550S1d;
import X.C714560S1e;
import X.C714570S1f;
import X.C722430SVl;
import X.C729510SjV;
import X.EnumC896890ZGl;
import X.InterfaceC1365380ldQ;
import X.InterfaceC1481730of5;
import X.InterfaceC1483670oiD;
import X.InterfaceC722440SVm;
import X.InterfaceC723060SXw;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.feed.assem.quickreply.QuickDMBoxAssem;
import com.ss.android.ugc.aweme.feed.assem.quickreply.QuickDMViewModel;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.MixFlowParam;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.SubOnlyVideo;
import com.ss.android.ugc.aweme.feed.model.SubscriptionInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.ad.AdAIGCLabel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.mix.bottom.AbsMixBottomBarVM;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.PlaylistRouterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1.StoryWheeTagComponent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class ACListenerS54S1200000_11 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS54S1200000_11 aCListenerS54S1200000_11, View view) {
        Integer numMobEventType;
        AdAIGCLabel adAigcLabel;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((CommerceVideoDelegateKt) aCListenerS54S1200000_11.l1).context, "aweme://webview");
        smartRouteBuildRoute.withParam("url", aCListenerS54S1200000_11.s0);
        smartRouteBuildRoute.open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        AwemeRawAd awemeRawAd = (AwemeRawAd) aCListenerS54S1200000_11.l2;
        if (awemeRawAd != null && (adAigcLabel = awemeRawAd.getAdAigcLabel()) != null) {
            numMobEventType = adAigcLabel.mobEventType();
        } else {
            numMobEventType = null;
        }
        c2344009Gk.LJ(numMobEventType, "aigc_ads_label_type");
        c2344009Gk.LIZJ(1, "label_clicked");
        C20684815ws.LJIILLIIL("click_aigc_ads_label", c2344009Gk.LIZ);
    }

    public static final void onClick$1(ACListenerS54S1200000_11 aCListenerS54S1200000_11, View view) {
        boolean zLJFF;
        String mixId;
        float currentPosition;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        StandardBusinessModel standardBusinessModel;
        SubOnlyVideo subOnlyVideo;
        String str;
        if (view != null && !C0OBG.LIZ(3000L, view)) {
            Integer numValueOf = null;
            if (view.getContext() instanceof InterfaceC723060SXw) {
                MixFlowParam mixFlowParam = AwemeBizExtKt.getMixFlowParam((Aweme) aCListenerS54S1200000_11.l1);
                if (mixFlowParam != null) {
                    str = mixFlowParam.from;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str, "from_search_mix")) {
                    ((InterfaceC723060SXw) view.getContext()).LJJJJJL();
                    return;
                }
            }
            int i = 0;
            if (!C297010BkZ.LIZ()) {
                ((AbsMixBottomBarVM) aCListenerS54S1200000_11.l2).wQ2(view.getContext(), (Aweme) aCListenerS54S1200000_11.l1, aCListenerS54S1200000_11.s0, false);
            } else {
                PlaylistRouterService.LIZIZ().LIZ(view.getContext(), (Aweme) aCListenerS54S1200000_11.l1, aCListenerS54S1200000_11.s0, false, true);
            }
            ContentModel contentModel = ((Aweme) aCListenerS54S1200000_11.l1).getContentModel();
            if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null) {
                zLJFF = Intrinsics.LJFF(subOnlyVideo.getShouldShowPaywall(), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            if (!zLJFF) {
                if (AwemeExtKt.isPhotoMode((Aweme) aCListenerS54S1200000_11.l1) && (photoModeImageInfo = ((Aweme) aCListenerS54S1200000_11.l1).getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && !imageList.isEmpty()) {
                    Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
                    while (it2.hasNext()) {
                        SubscriptionInfo subscriptionInfo = it2.next().subscriptionInfo;
                        if (subscriptionInfo != null && Intrinsics.LJFF(subscriptionInfo.isPreview(), Boolean.FALSE)) {
                            i = 1;
                            break;
                        }
                    }
                }
            } else {
                i = 1;
                break;
            }
            IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
            String str2 = aCListenerS54S1200000_11.s0;
            PlayListInfo playListInfo = ((Aweme) aCListenerS54S1200000_11.l1).playlist_info;
            if (playListInfo != null) {
                mixId = playListInfo.getMixId();
            } else {
                mixId = null;
            }
            String strLIZ = C332740D2q.LIZ((Aweme) aCListenerS54S1200000_11.l1);
            String authorUid = AwemeExtKt.getAuthorUid((Aweme) aCListenerS54S1200000_11.l1);
            InterfaceC1483670oiD interfaceC1483670oiDLJIILL = C1483410ohn.LJLJJI().LJIILL();
            if (interfaceC1483670oiDLJIILL != null && (interfaceC1481730of5LJIIIZ = interfaceC1483670oiDLJIILL.LJIIIZ()) != null) {
                currentPosition = interfaceC1481730of5LJIIIZ.getCurrentPosition();
            } else {
                currentPosition = 0.0f;
            }
            Video video = ((Aweme) aCListenerS54S1200000_11.l1).getVideo();
            if (video != null) {
                numValueOf = Integer.valueOf(video.getDuration());
            }
            iMixFeedService.LJIILIIL(str2, mixId, strLIZ, authorUid, currentPosition, "click_banner", null, numValueOf, Integer.valueOf(i), Integer.valueOf(i));
        }
    }

    public static final void onClick$2(ACListenerS54S1200000_11 aCListenerS54S1200000_11, View view) {
        C722430SVl.LIZJ(aCListenerS54S1200000_11.s0, (InterfaceC722440SVm) aCListenerS54S1200000_11.l1);
        C0SVZ c0svzLIZJ = ((InterfaceC722440SVm) aCListenerS54S1200000_11.l1).LIZJ();
        if (c0svzLIZJ != null) {
            c0svzLIZJ.LIZIZ();
        }
        ((Function1) aCListenerS54S1200000_11.l2).invoke(view);
    }

    public static final void onClick$3(ACListenerS54S1200000_11 aCListenerS54S1200000_11, View view) {
        int iIntValue;
        Map<String, String> linkedHashMap;
        String str;
        C424420Gka.LIZ().LIZJ(aCListenerS54S1200000_11.s0);
        QuickDMViewModel quickDMViewModelBp = ((QuickDMBoxAssem) aCListenerS54S1200000_11.l1).Bp();
        C714560S1e c714560S1e = (C714560S1e) aCListenerS54S1200000_11.l2;
        String str2 = aCListenerS54S1200000_11.s0;
        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ((QuickDMBoxAssem) aCListenerS54S1200000_11.l1);
        quickDMViewModelBp.getClass();
        AbstractC714580S1g abstractC714580S1g = c714560S1e.LL;
        if (abstractC714580S1g instanceof C714570S1f) {
            C714570S1f c714570S1f = (C714570S1f) abstractC714580S1g;
            User user = c714570S1f.LIZ;
            C0ZH0 c0zh0 = c714570S1f.LIZJ;
            String str3 = c714570S1f.LIZLLL;
            Integer num = (Integer) ((LinkedHashMap) quickDMViewModelBp.LL).get(str2);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue <= quickDMViewModelBp.LLILLJJLI) {
                IMSharePanelApi.LIZ.getClass();
                InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                Aweme aweme = videoItemParams.getAweme();
                String str4 = videoItemParams.mEventType;
                EnumC896890ZGl enumC896890ZGl = EnumC896890ZGl.TYPE_MAIN_FEED_MUF_ENTRANCE;
                if (Intrinsics.LJFF(user.getUid(), AwemeExtKt.getAuthorUid(videoItemParams.getAweme()))) {
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("dm_reply_type", "emoji");
                    if (C729510SjV.LJJIJIL(videoItemParams.getAweme())) {
                        str = "story";
                    } else {
                        str = "post";
                    }
                    pairArr[1] = new Pair("story_type", str);
                    linkedHashMap = C2097608Jq.LJIIJ(pairArr);
                } else {
                    linkedHashMap = new LinkedHashMap<>();
                }
                shareService.LJJJI(str2, user, aweme, str4, enumC896890ZGl, "feed", c0zh0, str3, false, linkedHashMap, new AwS590S0100000_11(quickDMViewModelBp, 497));
            }
        } else {
            String str5 = "";
            if (abstractC714580S1g instanceof C0S1X) {
                User user2 = ((C0S1X) abstractC714580S1g).LIZ;
                IMSharePanelApi.LIZ.getClass();
                InterfaceC1365380ldQ shareService2 = C1599690rjL.LIZ().getShareService();
                Aweme aweme2 = videoItemParams.getAweme();
                String str6 = videoItemParams.mEventType;
                if (str6 != null) {
                    str5 = str6;
                }
                shareService2.LJJJI(str2, user2, aweme2, str5, EnumC896890ZGl.TYPE_FEED_QUICK_ENTRANCE, null, null, null, false, new LinkedHashMap(), new AwS590S0100000_11(quickDMViewModelBp, 498));
            } else if (abstractC714580S1g instanceof C0S1Z) {
                C0S1Z c0s1z = (C0S1Z) abstractC714580S1g;
                User user3 = c0s1z.LIZ;
                C0Y8T c0y8t = c0s1z.LIZIZ;
                IMSharePanelApi.LIZ.getClass();
                InterfaceC1365380ldQ shareService3 = C1599690rjL.LIZ().getShareService();
                Aweme aweme3 = videoItemParams.getAweme();
                String str7 = videoItemParams.mEventType;
                if (str7 != null) {
                    str5 = str7;
                }
                shareService3.LJII(str2, user3, c0y8t, aweme3, str5, EnumC896890ZGl.TYPE_FEED_QUICK_ENTRANCE, null, null, null, new AwS590S0100000_11(quickDMViewModelBp, 496));
            } else if (!(abstractC714580S1g instanceof C714550S1d)) {
                throw new C1954807lC();
            }
        }
        C1336205Ku.LIZ(false).getQuickDmService().onQuickReplyEmojiSendAnimations(((QuickDMBoxAssem) aCListenerS54S1200000_11.l1).LJJIJL().findViewById(R.id.gzl), aCListenerS54S1200000_11.s0, null, new AwS555S0100000_11((QuickDMBoxAssem) aCListenerS54S1200000_11.l1, 1549));
    }

    public static final void onClick$4(ACListenerS54S1200000_11 aCListenerS54S1200000_11, View view) {
        Integer numMobEventType;
        AdAIGCLabel adAigcLabel;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C698050RZr) aCListenerS54S1200000_11.l1).LIZ, "aweme://webview");
        String str = aCListenerS54S1200000_11.s0;
        if (str == null) {
            return;
        }
        smartRouteBuildRoute.withParam("url", str);
        smartRouteBuildRoute.open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        AwemeRawAd awemeRawAd = ((VideoItemParams) aCListenerS54S1200000_11.l2).getAweme().getAwemeRawAd();
        if (awemeRawAd != null && (adAigcLabel = awemeRawAd.getAdAigcLabel()) != null) {
            numMobEventType = adAigcLabel.mobEventType();
        } else {
            numMobEventType = null;
        }
        c2344009Gk.LJ(numMobEventType, "aigc_ads_label_type");
        c2344009Gk.LIZJ(1, "label_clicked");
        C20684815ws.LJIILLIIL("click_aigc_ads_label", c2344009Gk.LIZ);
    }

    public static final void onClick$5(ACListenerS54S1200000_11 aCListenerS54S1200000_11, View view) {
        ((VideoExposeSharerInformationAssem) aCListenerS54S1200000_11.l1).Gp(((View) aCListenerS54S1200000_11.l2).findViewById(R.id.gzl), aCListenerS54S1200000_11.s0);
    }

    public static final void onClick$6(ACListenerS54S1200000_11 aCListenerS54S1200000_11, View view) {
        ((VideoExposeSharerInformationAssem) aCListenerS54S1200000_11.l1).Gp(((View) aCListenerS54S1200000_11.l2).findViewById(R.id.gzl), aCListenerS54S1200000_11.s0);
    }

    public static final void onClick$7(ACListenerS54S1200000_11 aCListenerS54S1200000_11, View view) {
        if (aCListenerS54S1200000_11.s0.length() > 0) {
            C20684815ws.LJIILLIIL("ttsocial_story_video_top_anchor_click", ((StoryWheeTagComponent) aCListenerS54S1200000_11.l1).Ep().LIZ);
            SmartRouter.buildRoute((Context) aCListenerS54S1200000_11.l2, aCListenerS54S1200000_11.s0).open();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$8(Y.ACListenerS54S1200000_11 r9, android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS54S1200000_11.onClick$8(Y.ACListenerS54S1200000_11, android.view.View):void");
    }

    public ACListenerS54S1200000_11(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
