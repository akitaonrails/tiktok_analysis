package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.PoiReTagInfo;
import com.ss.android.ugc.aweme.poi.anchor.banner.PoiReTagBottomBarAssemTrigger;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiReTagEntranceOptExperiment;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiReTagUIExperiment;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0hMJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201010hMJ implements AnonymousClass1652 {
    public ViewGroup LIZ;
    public TuxTextView LIZIZ;
    public FrameLayout LIZJ;
    public TuxIconView LIZLLL;
    public TuxIconView LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public VideoItemParams LJIIIIZZ;
    public ConstraintLayout LJIIIZ;
    public TuxTextView LJIIJ;
    public TuxTextView LJIIJJI;
    public FrameLayout LJIIL;

    @Override // X.AnonymousClass1652
    public final void LIZ() {
        this.LJFF = true;
        this.LJII = false;
        VideoItemParams videoItemParams = this.LJIIIIZZ;
        if (C1201020hMK.LIZ(videoItemParams != null ? videoItemParams.getAweme() : null)) {
            VideoItemParams videoItemParams2 = this.LJIIIIZZ;
            LJII(videoItemParams2 != null ? videoItemParams2.getAweme() : null);
        } else {
            ViewGroup viewGroup = this.LIZ;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
            }
        }
    }

    @Override // X.AnonymousClass1652
    public final void LIZJ() {
        this.LJFF = false;
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return;
        }
        C1957607le.LIZ.getClass();
        C1957607le.LIZ();
    }

    public final String LIZLLL() {
        Aweme aweme;
        VideoItemParams videoItemParams = this.LJIIIIZZ;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            String strValueOf = String.valueOf(C1443290nf5.LIZ().passedDaysAfterPost(aweme.getCreateTime()));
            if (strValueOf != null) {
                return strValueOf;
            }
        }
        return "";
    }

    public final void LJI() {
        PoiReTagEntranceOptExperiment.LIZ.getClass();
        if (PoiReTagEntranceOptExperiment.LIZIZ()) {
            C1957607le.LIZ.getClass();
            if (PoiReTagEntranceOptExperiment.LIZIZ()) {
                C1957607le.LIZIZ().storeInt(C1957607le.LJFF("key_poi_re_tag_entrance_close_time"), C1957607le.LIZIZ().getInt(C1957607le.LJFF("key_poi_re_tag_entrance_close_time"), 0) + 1);
            }
        } else {
            C1957607le.LIZ.getClass();
            Map mapLIZLLL = C1957607le.LIZLLL();
            int iLIZJ = C1957607le.LIZJ();
            PoiReTagUIExperiment.PoiReTagConfig poiReTagConfig = (PoiReTagUIExperiment.PoiReTagConfig) PoiReTagUIExperiment.LIZIZ.getValue();
            if (iLIZJ < (poiReTagConfig != null ? poiReTagConfig.closeMaxTimes : 2)) {
                mapLIZLLL.put(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), Integer.valueOf(iLIZJ + 1));
                C1957607le.LIZIZ().storeString("key_poi_re_tag_show_entrance_count", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), mapLIZLLL));
            }
        }
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
    }

    @Override // X.AnonymousClass1652
    public final void LJJIIJ() {
        ViewGroup viewGroup;
        if (this.LJFF && (viewGroup = this.LIZ) != null && viewGroup.getVisibility() == 0) {
            C1957607le.LIZ.getClass();
            C1957607le.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2 A[PHI: r11
      0x00a2: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String) binds: [B:55:0x009f, B:49:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.ss.android.ugc.aweme.feed.model.Aweme r15) {
        /*
            r14 = this;
            boolean r0 = r14.LJFF
            if (r0 == 0) goto L9b
            boolean r0 = r14.LJI
            if (r0 == 0) goto L9b
            boolean r0 = r14.LJII
            if (r0 != 0) goto L9b
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r14.LJIIIIZZ
            java.lang.String r12 = ""
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L2a
            long r1 = r0.getCreateTime()
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = X.C1443290nf5.LIZ()
            long r0 = r0.passedDaysAfterPost(r1)
            java.lang.String r9 = java.lang.String.valueOf(r0)
            if (r9 != 0) goto L2b
        L2a:
            r9 = r12
        L2b:
            r1 = 1
            if (r15 == 0) goto Laa
            com.ss.android.ugc.aweme.poi.PoiReTagInfo r0 = r15.getPoiReTagInfo()
            if (r0 == 0) goto Laa
            boolean r0 = r0.showPoiReTagBanner()
            if (r0 != r1) goto Laa
            r4 = 1
        L3b:
            X.0hMN r3 = X.C1201050hMN.LIZ
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r14.LJIIIIZZ
            r2 = 0
            if (r0 == 0) goto L46
            java.lang.String r6 = r0.mEventType
            if (r6 != 0) goto L47
        L46:
            r6 = r12
        L47:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r14.LJIIIIZZ
            if (r0 == 0) goto La8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto La8
            java.lang.String r7 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
        L55:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r14.LJIIIIZZ
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto La6
            java.lang.String r8 = r0.getAid()
        L63:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r14.LJIIIIZZ
            if (r0 == 0) goto La4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto La4
            int r0 = r0.getAwemeType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L75:
            java.lang.String r10 = "video"
            if (r4 == 0) goto L9c
            if (r15 == 0) goto L9c
            com.ss.android.ugc.aweme.poi.PoiReTagInfo r0 = r15.getPoiReTagInfo()
            if (r0 == 0) goto L9c
            java.lang.String r11 = r0.getFirstPoiId()
        L85:
            com.ss.android.ugc.aweme.poi.PoiReTagInfo r0 = r15.getPoiReTagInfo()
            if (r0 == 0) goto La2
            java.lang.String r12 = r0.getFirstCollectInfo()
        L8f:
            r3.getClass()
            java.util.Map r13 = X.C1201050hMN.LIZ(r15, r2)
            X.C1201050hMN.LIZLLL(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.LJII = r1
        L9b:
            return
        L9c:
            r11 = r2
            if (r4 == 0) goto L8f
            if (r15 == 0) goto La2
            goto L85
        La2:
            r12 = r2
            goto L8f
        La4:
            r5 = r2
            goto L75
        La6:
            r8 = r2
            goto L63
        La8:
            r7 = r2
            goto L55
        Laa:
            r4 = 0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1201010hMJ.LJII(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0203  */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, java.lang.String] */
    @Override // X.AnonymousClass1652
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.view.View r25, final com.ss.android.ugc.aweme.feed.model.VideoItemParams r26) {
        /*
            Method dump skipped, instruction units count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1201010hMJ.LIZIZ(android.view.View, com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    public final void LJ(VideoItemParams videoItemParams, boolean z) {
        Context context;
        String str;
        Map<String, String> linkedHashMap;
        PoiReTagInfo poiReTagInfo;
        String recPoiIdList;
        Aweme aweme = videoItemParams.getAweme();
        String str2 = videoItemParams.mEventType;
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        int i = PoiReTagBottomBarAssemTrigger.LLJLILLLLZIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openSearchPoiPage store aid: ");
        sbLIZ.append(aweme.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        C1957607le c1957607le = C1957607le.LIZ;
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        c1957607le.getClass();
        C1957607le.LJ(aid);
        String strLIZLLL = LIZLLL();
        ViewGroup viewGroup2 = this.LIZ;
        if (viewGroup2 != null) {
            context = viewGroup2.getContext();
        } else {
            context = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//poi/search");
        smartRouteBuildRoute.withParam("page_scene", EnumC1198680hIY.POI_RE_TAG);
        smartRouteBuildRoute.withParam("aid", aweme.getAid());
        smartRouteBuildRoute.withParam("enable_preload", true);
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        Integer numValueOf = Integer.valueOf(aweme.getAwemeType());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("retag_enter_method", "video");
        linkedHashMap2.put("post_after_days", LIZLLL());
        if (z && (poiReTagInfo = aweme.getPoiReTagInfo()) != null && (recPoiIdList = poiReTagInfo.getRecPoiIdList()) != null && recPoiIdList.length() > 0) {
            linkedHashMap2.put("rec_poi_id_list", recPoiIdList);
        }
        smartRouteBuildRoute.withParam("poi_mob_param", new PoiMobParam(null, null, null, null, str, numValueOf, null, "", false, 0, linkedHashMap2, null, null, null));
        smartRouteBuildRoute.withParam("retag_enter_method", "video");
        smartRouteBuildRoute.withParam("after_post_days", strLIZLLL);
        smartRouteBuildRoute.withParam("show_rec_poi_re_tag_banner", z);
        smartRouteBuildRoute.open(113);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap3.put("enter_from", str2);
        linkedHashMap3.put("enter_method", "click_re_tag_entrance");
        linkedHashMap3.put("aweme_type", String.valueOf(videoItemParams.getAweme().getAwemeType()));
        linkedHashMap3.put("retag_enter_method", "video");
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        if (iPoiService == null || (linkedHashMap = iPoiService.LLII()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap3.putAll(linkedHashMap);
        C1189060h32.LJIJI(linkedHashMap3, "after_post_days", LIZLLL());
        linkedHashMap3.putAll(C1200530hLX.LIZIZ(null, "enter_poi_search"));
        C20684815ws.LJIILLIIL("enter_poi_search", linkedHashMap3);
    }

    public final void LJFF(TuxTextView tuxTextView, String str, int i, int i2) {
        try {
            int i3 = PoiReTagBottomBarAssemTrigger.LLJLILLLLZIIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setTextOnGlobalLayout textToDisplay:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            tuxTextView.setTuxFont(62);
            SpannableString spannableString = new SpannableString(str);
            if (i2 > 0 && i > 0) {
                C786410Ut5.p2(spannableString, new C444920HcY(63, false), i, i2, 18);
            }
            tuxTextView.setText(spannableString);
            tuxTextView.requestLayout();
            tuxTextView.invalidate();
            ViewGroup viewGroup = this.LIZ;
            if (viewGroup != null) {
                C339190DRl.LIZLLL(viewGroup);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C339190DRl.LIZLLL(tuxTextView);
            ViewGroup viewGroup2 = this.LIZ;
            if (viewGroup2 != null) {
                C339190DRl.LIZLLL(viewGroup2);
            }
        }
    }
}
