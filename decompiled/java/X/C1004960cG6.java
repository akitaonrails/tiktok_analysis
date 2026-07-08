package X;

import Y.ARunnableS116S0100000_16;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.component.ctacomponent.AnolFeedCtaButtonData;
import com.ss.android.ugc.aweme.component.ctacomponent.AnoleFeedCTAData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cG6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004960cG6 extends AbstractC1014240cV4 {
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public ObjectAnimator LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public EnumC1004970cG7 LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public InterfaceC1004990cG9 LLLF;
    public boolean LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public ARunnableS116S0100000_16 LLLI;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final Aweme LJJIFFI() {
        Object obj = this.LLILLJJLI.LIZJ;
        if (obj instanceof Aweme) {
            return (Aweme) obj;
        }
        return null;
    }

    public final void LJJII() {
        ObjectAnimator objectAnimator = this.LLJLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LLJLL = null;
        View view = this.LLJLILLLLZIIL;
        if (view != null) {
            view.clearAnimation();
            view.setBackground(null);
            C786410Ut5.LJLLLLLL(8, view);
            C786410Ut5.Jc(view, 0.0f);
        }
    }

    public final AnoleFeedCTAData LJJIIJ() {
        return (AnoleFeedCTAData) this.LLLFFI.getValue();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        Object obj = this.LLILLJJLI.LIZJ;
        boolean zLJJZZIII = C1017070cZd.LJJZZIII(obj instanceof Aweme ? (Aweme) obj : null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isCTMAd=");
        sbLIZ.append(zLJJZZIII);
        LJJIIJZLJL("isReady_enter", C2188811AlT.LIZIZ(sbLIZ));
        AnoleFeedCTAData anoleFeedCTADataLJJIIJ = LJJIIJ();
        if (anoleFeedCTADataLJJIIJ != null && anoleFeedCTADataLJJIIJ.getShouldHideWhenDmNotEnabled() && zLJJZZIII) {
            DmNoticeProxy dmNoticeProxyLIZJ = DmNoticeProxyImpl.LIZJ();
            boolean z = (dmNoticeProxyLIZJ == null || dmNoticeProxyLIZJ.LIZIZ()) ? false : true;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dmProxy=");
            sbLIZ2.append(dmNoticeProxyLIZJ != null);
            sbLIZ2.append(",dmEnabled=");
            sbLIZ2.append(z);
            LJJIIJZLJL("isReady_ctm", C2188811AlT.LIZIZ(sbLIZ2));
            if (!z && this.LLLFF) {
                LJJIIJZLJL("isReady_fail", "reportDmShowFail");
                LJJIIJZLJL("reportDmShowFail", "send OTHERSHOW_FAIL");
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", this.LLILLJJLI.LIZLLL);
                c1022820ciuLIZLLL.LIZIZ("dm_not_enabled", "failed_detail_reason");
                c1022820ciuLIZLLL.LJII();
                this.LLLFF = false;
                LJJIIJZLJL("isReady_fail", "return dm_not_enabled");
                return new C1014500cVU(false, "dm_not_enabled");
            }
        }
        LJJIIJZLJL("isReady_exit", "return ready");
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        super.LIZ();
        LJJIJ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        super.LIZJ();
        LJJIJ();
        this.LLLFF = true;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        View view;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removePromptRunnable=");
        sbLIZ.append(this.LLLI != null);
        LJJIIJZLJL("unmount_enter", C2188811AlT.LIZIZ(sbLIZ));
        ARunnableS116S0100000_16 aRunnableS116S0100000_16 = this.LLLI;
        if (aRunnableS116S0100000_16 != null && (view = this.LLJLIL) != null) {
            HandlerHook.viewRemoveCallbacks(view, aRunnableS116S0100000_16);
        }
        this.LLLI = null;
        LJJII();
        super.LJ();
        InterfaceC1004990cG9 interfaceC1004990cG9 = this.LLLF;
        if (interfaceC1004990cG9 != null) {
            interfaceC1004990cG9.LJ();
        }
        this.LLLF = null;
        LJJIIJZLJL("unmount_exit", "done");
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIILL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleCTAComponent,type:");
        sbLIZ.append(this.LL.type);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIJI() {
        View view;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removePromptRunnable=");
        sbLIZ.append(this.LLLI != null);
        LJJIIJZLJL("reset_enter", C2188811AlT.LIZIZ(sbLIZ));
        ARunnableS116S0100000_16 aRunnableS116S0100000_16 = this.LLLI;
        if (aRunnableS116S0100000_16 != null && (view = this.LLJLIL) != null) {
            HandlerHook.viewRemoveCallbacks(view, aRunnableS116S0100000_16);
        }
        this.LLLI = null;
        super.LJIJI();
        AnoleFeedCTAData anoleFeedCTADataLJJIIJ = LJJIIJ();
        if (anoleFeedCTADataLJJIIJ != null) {
            C1004980cG8.LIZ(this, anoleFeedCTADataLJJIIJ.getInitialBackgroundColor());
        }
        LJJ();
        this.LLJZIJLIL = null;
        this.LLL = null;
        LJJI();
        this.LLJLLIL = false;
        this.LLJLLL = false;
        this.LLJZ = EnumC1004970cG7.LL;
        LJJIIJZLJL("reset_exit", "state cleared");
    }

    public final void LJJ() {
        C1001030c9l c1001030c9lLJ;
        Object c098200Yq;
        Object c098200Yq2;
        Aweme awemeLJJIFFI = LJJIFFI();
        if (awemeLJJIFFI == null || !C1017070cZd.LJJJJIZL(awemeLJJIFFI) || (c1001030c9lLJ = C1001020c9k.LJ(awemeLJJIFFI)) == null) {
            return;
        }
        String str = c1001030c9lLJ.LIZIZ;
        if (str != null) {
            LJJIJIIJIL(str);
        }
        String str2 = c1001030c9lLJ.LIZJ;
        if (str2 != null) {
            try {
                c098200Yq = Integer.valueOf(Color.parseColor(str2));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num = (Integer) c098200Yq;
            if (num != null) {
                int iIntValue = num.intValue();
                LJJIJIL(iIntValue);
                LJJIJIIJI(iIntValue, c1001030c9lLJ.LJ);
            }
        }
        String str3 = c1001030c9lLJ.LIZLLL;
        if (str3 != null) {
            try {
                c098200Yq2 = Integer.valueOf(Color.parseColor(str3));
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Integer num2 = (Integer) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
            if (num2 != null) {
                C1004980cG8.LIZ(this, num2.intValue());
            }
        }
    }

    public final void LJJI() {
        IAdPhotoModeService iAdPhotoModeService;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        Object c098200Yq;
        AwemeRawAd awemeRawAd;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        Aweme awemeLJJIFFI = LJJIFFI();
        if (awemeLJJIFFI == null || C1017070cZd.LJJJJIZL(LJJIFFI())) {
            return;
        }
        if ((C1017070cZd.LJLLI(awemeLJJIFFI) || C1017070cZd.LJLLILLLL(awemeLJJIFFI)) && (iAdPhotoModeService = (IAdPhotoModeService) PluggableExtentionKt.pluggableSpi$default(IAdPhotoModeService.class, false, false, false, 14, null)) != null) {
            int iLJJIJIIJIL = iAdPhotoModeService.LJJIJIIJIL();
            AwemeRawAd awemeRawAd2 = awemeLJJIFFI.getAwemeRawAd();
            if (awemeRawAd2 == null || (photoCarouselInfo = awemeRawAd2.getPhotoCarouselInfo()) == null || (productList = photoCarouselInfo.getProductList()) == null || (photoCarouselProductStruct = (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(iLJJIJIIJIL, productList)) == null) {
                return;
            }
            String productId = photoCarouselProductStruct.getProductId();
            if (!(productId.length() > 0)) {
                productId = null;
            }
            this.LLJZIJLIL = productId;
            Aweme awemeLJJIFFI2 = LJJIFFI();
            this.LLL = (awemeLJJIFFI2 == null || (photoModeImageInfo = awemeLJJIFFI2.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(iLJJIJIIJIL, imageList)) == null || (urlModel = photoModeImageUrlModel.displayImageNoWatermark) == null) ? null : urlModel.getUri();
            String buttonText = photoCarouselProductStruct.getButtonText();
            if (buttonText.length() > 0 || !((awemeRawAd = awemeLJJIFFI.getAwemeRawAd()) == null || (buttonText = awemeRawAd.getButtonText()) == null)) {
                LJJIJIIJIL(buttonText);
                String color = photoCarouselProductStruct.getColor();
                if (color.length() > 0) {
                    try {
                        c098200Yq = Integer.valueOf(Color.parseColor(color));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Integer num = (Integer) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                    if (num != null) {
                        C1004980cG8.LIZ(this, num.intValue());
                    }
                }
            }
        }
    }

    public final void LJJIIZI() {
        boolean showGuideAnimation;
        if (C1017070cZd.LJJJJIZL(LJJIFFI())) {
            LJJIIJZLJL("shouldPromptShowCTA", "result=false,reason=amazon_cta");
            showGuideAnimation = false;
        } else {
            AnoleFeedCTAData anoleFeedCTADataLJJIIJ = LJJIIJ();
            showGuideAnimation = anoleFeedCTADataLJJIIJ != null ? anoleFeedCTADataLJJIIJ.getShowGuideAnimation() : false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("result=");
            sbLIZ.append(showGuideAnimation);
            LJJIIJZLJL("shouldPromptShowCTA", C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("shouldPrompt=");
        sbLIZ2.append(showGuideAnimation);
        sbLIZ2.append(",promptRunnableExists=");
        sbLIZ2.append(this.LLLI != null);
        LJJIIJZLJL("promptShowCTA_enter", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LLJLIL == null) {
            LJJIIJZLJL("promptShowCTA_skip", "buttonView is null");
            return;
        }
        if (this.LLJLLL) {
            LJJIIJZLJL("promptShowCTA_skip", "already prompted");
            return;
        }
        if (!showGuideAnimation) {
            LJJIIJZLJL("promptShowCTA_skip", "shouldPromptShowCTA=false");
            return;
        }
        ARunnableS116S0100000_16 aRunnableS116S0100000_16 = this.LLLI;
        if (aRunnableS116S0100000_16 != null) {
            LJJIIJZLJL("promptShowCTA_replace", "remove old runnable");
            View view = this.LLJLIL;
            if (view != null) {
                HandlerHook.viewRemoveCallbacks(view, aRunnableS116S0100000_16);
            }
        }
        this.LLLI = new ARunnableS116S0100000_16(this, 227);
        View view2 = this.LLJLIL;
        if (view2 != null) {
            HandlerHook.viewPostDelay(view2, this.LLLI, 200L);
        }
        LJJIIJZLJL("promptShowCTA_schedule", "delay=200");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.component.ctacomponent.AnoleFeedCTAData r3 = r4.LJJIIJ()
            if (r3 != 0) goto L7
            return
        L7:
            boolean r0 = r3.isLiveLeftIcon()
            if (r0 != 0) goto Le
            return
        Le:
            X.0cNA r0 = r4.LLILLJJLI
            java.lang.Object r1 = r0.LIZJ
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.model.Aweme
            if (r0 == 0) goto L74
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            r2 = 0
            if (r1 == 0) goto L74
            boolean r0 = X.C1017070cZd.LLJILJIL(r1)
            if (r0 != 0) goto L27
            boolean r0 = X.C1017070cZd.LLD(r1)
            if (r0 == 0) goto L74
        L27:
            int r1 = r3.getIconType()
            X.0N0p r0 = X.EnumC587010N0p.TYPE_TUX_LOTTIE
            int r0 = r0.getValue()
            if (r1 != r0) goto L46
            android.view.View r1 = r4.LLJJIJIL
            if (r1 == 0) goto L45
            r0 = 2131363513(0x7f0a06b9, float:1.8346837E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0jpS r0 = (X.C1295960jpS) r0
            if (r0 == 0) goto L45
            X.C786410Ut5.LLD(r2, r0)
        L45:
            return
        L46:
            X.0N0p r0 = X.EnumC587010N0p.TYPE_TUX_ICON
            int r0 = r0.getValue()
            if (r1 != r0) goto L61
            android.view.View r1 = r4.LLJJIJIL
            if (r1 == 0) goto L45
            r0 = 2131363512(0x7f0a06b8, float:1.8346835E38)
            android.view.View r0 = r1.findViewById(r0)
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            if (r0 == 0) goto L45
            X.C786410Ut5.LLLLLLZZ(r0, r2)
            return
        L61:
            android.view.View r1 = r4.LLJJIJIL
            if (r1 == 0) goto L45
            r0 = 2131363507(0x7f0a06b3, float:1.8346825E38)
            android.view.View r0 = r1.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
            if (r0 == 0) goto L45
            X.C786410Ut5.l(r0, r2)
            return
        L74:
            r2 = 8
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1004960cG6.LJJIJ():void");
    }

    public static String LJJIII(double d) {
        double d2 = 1024;
        return C786410Ut5.k4(Locale.US, "%.1fMB", Arrays.copyOf(new Object[]{Double.valueOf((d / d2) / d2)}, 1));
    }

    public static String LJJIIZ(JSONObject jSONObject) {
        Object objValueOf;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        C08XD.LJIL(arrayList);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("event=");
        sbLIZ.append(jSONObject.optString("event"));
        sbLIZ.append(",keys=");
        sbLIZ.append(arrayList);
        sbLIZ.append(",buttonText=");
        sbLIZ.append(jSONObject.optString("buttonText"));
        sbLIZ.append(",buttonTextColor=");
        sbLIZ.append(jSONObject.optString("buttonTextColor"));
        sbLIZ.append(",backgroundColor=");
        sbLIZ.append(jSONObject.optString("backgroundColor"));
        sbLIZ.append(",status=");
        if (jSONObject.has(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
            objValueOf = Integer.valueOf(jSONObject.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS));
        } else {
            objValueOf = "NA";
        }
        sbLIZ.append(objValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        String str;
        String str2;
        Long lValueOf;
        Integer num;
        Object playProgress;
        Map<String, AnoleComponentRelationModel> map;
        AnoleComponentRelationModel anoleComponentRelationModel;
        List<AnoleComponentAppearModel> list;
        AnoleComponentAppearModel anoleComponentAppearModel2;
        AnolFeedCtaButtonData ctaButtonData;
        AnolFeedCtaButtonData ctaButtonData2;
        super.LJII(anoleComponentAppearModel);
        LJJIJ();
        if (!this.LLJLLIL) {
            this.LLJZ = EnumC1004970cG7.LLILLJJLI;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("appearType=");
        sbLIZ.append(anoleComponentAppearModel.type);
        sbLIZ.append(",playProgress=");
        sbLIZ.append(anoleComponentAppearModel.getPlayProgress());
        sbLIZ.append(",beforeVideoCompleteShowTime=");
        sbLIZ.append(anoleComponentAppearModel.getBeforeVideoCompleteShowTimeSeconds());
        LJJIIJZLJL("didShow", C2188811AlT.LIZIZ(sbLIZ));
        AnoleLogInfo logInfo = this.LL.getLogInfo();
        if (logInfo == null || (str = logInfo.tag) == null) {
            str = "anole_ad";
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str, "othershow", this.LLILLJJLI.LIZLLL);
        AnoleLogInfo logInfo2 = this.LL.getLogInfo();
        if (logInfo2 == null || (str2 = logInfo2.refer) == null) {
            str2 = "anole_cta";
        }
        c1022820ciuLIZLLL.LIZJ(str2, "refer");
        c1022820ciuLIZLLL.LIZIZ(Long.valueOf(this.LL.getID()), "component_id");
        AnoleModel anoleModel = this.LLILLJJLI.LIZLLL.getAnoleModel();
        Integer num2 = null;
        if (anoleModel != null) {
            lValueOf = Long.valueOf(anoleModel.templateID);
        } else {
            lValueOf = null;
        }
        c1022820ciuLIZLLL.LIZIZ(lValueOf, "template_id");
        c1022820ciuLIZLLL.LIZIZ(this.LL.type, "component_type");
        c1022820ciuLIZLLL.LIZIZ(0, "is_lynx");
        AnoleFeedCTAData anoleFeedCTADataLJJIIJ = LJJIIJ();
        if (anoleFeedCTADataLJJIIJ != null && (ctaButtonData2 = anoleFeedCTADataLJJIIJ.getCtaButtonData()) != null) {
            num = ctaButtonData2.buttonType;
        } else {
            num = null;
        }
        c1022820ciuLIZLLL.LIZIZ(num, "buttonType");
        AnoleFeedCTAData anoleFeedCTADataLJJIIJ2 = LJJIIJ();
        if (anoleFeedCTADataLJJIIJ2 != null && (ctaButtonData = anoleFeedCTADataLJJIIJ2.getCtaButtonData()) != null) {
            num2 = ctaButtonData.buttonType;
        }
        c1022820ciuLIZLLL.LIZIZ(num2, "button_type");
        AnoleModel anoleModel2 = this.LLILLJJLI.LIZLLL.getAnoleModel();
        if (anoleModel2 == null || (map = anoleModel2.componentRelations) == null || (anoleComponentRelationModel = map.get(this.LL.type)) == null || (list = anoleComponentRelationModel.showModels) == null || (anoleComponentAppearModel2 = (AnoleComponentAppearModel) C13LP.LJJJLZIJ(0, list)) == null || (playProgress = anoleComponentAppearModel2.getPlayProgress()) == null) {
            playProgress = 0;
        }
        c1022820ciuLIZLLL.LIZIZ(playProgress, "button_show_time");
        String str3 = this.LLJZIJLIL;
        if (str3 != null) {
            c1022820ciuLIZLLL.LIZIZ(str3, "current_product_id");
        }
        String str4 = this.LLL;
        if (str4 != null) {
            c1022820ciuLIZLLL.LIZIZ(str4, "image_id");
        }
        c1022820ciuLIZLLL.LJII();
    }

    public final void LJJIJIIJIL(String str) {
        TextView textView;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("text=");
        sbLIZ.append(str);
        LJJIIJZLJL("updateButtonText", C2188811AlT.LIZIZ(sbLIZ));
        View view = this.LLJJIJIL;
        if (view != null && (textView = (TextView) view.findViewById(R.id.b53)) != null) {
            textView.setText(str);
        }
    }

    public final void LJJIJIL(int i) {
        TextView textView;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("color=");
        sbLIZ.append(i);
        LJJIIJZLJL("updateButtonTextColor", C2188811AlT.LIZIZ(sbLIZ));
        View view = this.LLJJIJIL;
        if (view != null && (textView = (TextView) view.findViewById(R.id.b53)) != null) {
            textView.setTextColor(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0155 A[PHI: r5
      0x0155: PHI (r5v7 java.lang.String) = (r5v2 java.lang.String), (r5v8 java.lang.String) binds: [B:89:0x0190, B:71:0x0153] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163 A[PHI: r5 r6
      0x0163: PHI (r5v6 java.lang.String) = (r5v3 java.lang.String), (r5v7 java.lang.String) binds: [B:92:0x0194, B:75:0x0161] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r6v5 java.lang.String) = (r6v2 java.lang.String), (r6v6 java.lang.String) binds: [B:92:0x0194, B:75:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0193 A[PHI: r5
      0x0193: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v7 java.lang.String), (r5v7 java.lang.String) binds: [B:89:0x0190, B:73:0x015b, B:75:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0197 A[PHI: r5 r6
      0x0197: PHI (r5v4 java.lang.String) = (r5v3 java.lang.String), (r5v6 java.lang.String), (r5v6 java.lang.String) binds: [B:92:0x0194, B:77:0x0169, B:79:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v5 java.lang.String), (r6v5 java.lang.String) binds: [B:92:0x0194, B:77:0x0169, B:79:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Mk(X.AbstractC1003980cEW r10) {
        /*
            Method dump skipped, instruction units count: 1363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1004960cG6.Mk(X.0cEW):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0218 A[PHI: r14
      0x0218: PHI (r14v5 java.lang.String) = (r14v1 java.lang.String), (r14v7 java.lang.String) binds: [B:78:0x01d7, B:80:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fk(android.view.ViewGroup r21, X.InterfaceC1014340cVE r22) {
        /*
            Method dump skipped, instruction units count: 1223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1004960cG6.Fk(android.view.ViewGroup, X.0cVE):void");
    }

    public final void LJJIIJZLJL(String str, String str2) {
        boolean z;
        Boolean boolValueOf;
        LJIILL();
        if (C691740RBk.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[debug][");
            sbLIZ.append(str);
            sbLIZ.append("] ");
            sbLIZ.append(str2);
            sbLIZ.append(" | ");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isShowing=");
            sbLIZ2.append(this.LLILZIL);
            sbLIZ2.append(",buttonViewMounted=");
            if (this.LLJLIL != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ2.append(z);
            sbLIZ2.append(",hasChangeColor=");
            sbLIZ2.append(this.LLJLLIL);
            sbLIZ2.append(",hasPrompted=");
            sbLIZ2.append(this.LLJLLL);
            sbLIZ2.append(",highlightState=");
            sbLIZ2.append(this.LLJZ);
            sbLIZ2.append(",currentProductId=");
            sbLIZ2.append(this.LLJZIJLIL);
            sbLIZ2.append(",currentImageId=");
            sbLIZ2.append(this.LLL);
            sbLIZ2.append(",isDownloading=");
            InterfaceC1004990cG9 interfaceC1004990cG9 = this.LLLF;
            if (interfaceC1004990cG9 != null) {
                boolValueOf = Boolean.valueOf(interfaceC1004990cG9.LIZLLL());
            } else {
                boolValueOf = null;
            }
            sbLIZ2.append(boolValueOf);
            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void LJJIJIIJI(int i, Integer num) {
        ImageView imageView;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        int iIntValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("color=");
        sbLIZ.append(i);
        sbLIZ.append(",arrowResource=");
        sbLIZ.append(num);
        LJJIIJZLJL("updateButtonAccessoryStyle", C2188811AlT.LIZIZ(sbLIZ));
        View view = this.LLJJIJIL;
        if (view != null && (tuxIconView2 = (TuxIconView) view.findViewById(R.id.b4v)) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = R.drawable.cfd;
            }
            tuxIconView2.setIconRes(iIntValue);
            tuxIconView2.setTintColor(i);
        }
        View view2 = this.LLJJIJIL;
        if (view2 != null && (tuxIconView = (TuxIconView) view2.findViewById(R.id.b54)) != null) {
            tuxIconView.setTintColor(i);
        }
        View view3 = this.LLJJIJIL;
        if (view3 != null && (imageView = (ImageView) view3.findViewById(R.id.b4z)) != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public C1004960cG6(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJZ = EnumC1004970cG7.LL;
        this.LLLFFI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 915));
        this.LLLFZ = C452501pT.LIZIZ(new AwS417S0200000_16(c1009340cNA, anoleComponentModel, 106));
    }
}
