package Y;

import X.AbstractC1056160dag;
import X.AbstractC21673619ry;
import X.AnonymousClass0317;
import X.C034S;
import X.C1120604Zw;
import X.C1389890mGx;
import X.C13LP;
import X.C1748780vbo;
import X.C18MZ;
import X.C18NO;
import X.C18NR;
import X.C1AQS;
import X.C21208817zC;
import X.C21271118Mb;
import X.C21511619Go;
import X.C259800zU;
import X.InterfaceC1541990qEH;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcShouldEnablePrefixInMultiAnchorAB;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.model.MultiAnchorYmalSchema;
import com.ss.android.ugc.aweme.ecommerce.model.PanelBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.model.PromotionResource;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class AObserverS191S0200000_32 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, X.19Go, java.lang.Object] */
    public static final void onChanged$0(AObserverS191S0200000_32 aObserverS191S0200000_32, Object obj) {
        ?? r3 = (C21511619Go) obj;
        if (!Intrinsics.LJFF(r3, ((C259800zU) aObserverS191S0200000_32.l0).element)) {
            Function1 function1 = (Function1) aObserverS191S0200000_32.l1;
            if (function1 != null) {
                function1.invoke(r3.LIZ);
            }
            ((C259800zU) aObserverS191S0200000_32.l0).element = r3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, X.19Go, java.lang.Object] */
    public static final void onChanged$1(AObserverS191S0200000_32 aObserverS191S0200000_32, Object obj) {
        ?? r3 = (C21511619Go) obj;
        if (!Intrinsics.LJFF(r3, ((C259800zU) aObserverS191S0200000_32.l0).element)) {
            Function1 function1 = (Function1) aObserverS191S0200000_32.l1;
            if (function1 != null) {
                function1.invoke(r3.LIZ);
            }
            ((C259800zU) aObserverS191S0200000_32.l0).element = r3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, X.19Go, java.lang.Object] */
    public static final void onChanged$2(AObserverS191S0200000_32 aObserverS191S0200000_32, Object obj) {
        ?? r3 = (C21511619Go) obj;
        if (!Intrinsics.LJFF(r3, ((C259800zU) aObserverS191S0200000_32.l0).element)) {
            Function1 function1 = (Function1) aObserverS191S0200000_32.l1;
            if (function1 != null) {
                function1.invoke(r3.LIZ);
            }
            ((C259800zU) aObserverS191S0200000_32.l0).element = r3;
        }
    }

    public static final void onChanged$3(AObserverS191S0200000_32 aObserverS191S0200000_32, Object obj) {
        String str;
        boolean z;
        AbstractC21673619ry adapter;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        PromotionResource promotionResource;
        boolean z2;
        String name;
        CartEntry cartEntry;
        Integer num;
        Map<String, String> map;
        String str2;
        MultiAnchorYmalSchema multiAnchorYmalSchema;
        GetItemProductInfoResponseData getItemProductInfoResponseData = (GetItemProductInfoResponseData) obj;
        ((ECommerceAnchorPanelFragment) aObserverS191S0200000_32.l0).LLLIILIL = true;
        SettingsManager.LIZLLL().getClass();
        boolean zLIZ = SettingsManager.LIZ("ec_sv_use_ymal_schema_from_server", false);
        ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = (ECommerceAnchorPanelFragment) aObserverS191S0200000_32.l0;
        String str3 = eCommerceAnchorPanelFragment.LLLIIL;
        PanelBannerInfo panelBannerInfo = null;
        if (zLIZ && getItemProductInfoResponseData != null && (multiAnchorYmalSchema = getItemProductInfoResponseData.multiAnchorYmalSchema) != null) {
            str = multiAnchorYmalSchema.openUrl;
        } else {
            str = null;
        }
        eCommerceAnchorPanelFragment.LLLIIL = str;
        if (zLIZ && eCommerceAnchorPanelFragment.LLLIIIL && eCommerceAnchorPanelFragment.LLLIL && !Intrinsics.LJFF(str3, str)) {
            z = true;
        } else {
            z = false;
        }
        ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment2 = (ECommerceAnchorPanelFragment) aObserverS191S0200000_32.l0;
        if ((eCommerceAnchorPanelFragment2.LLLIIIL && !eCommerceAnchorPanelFragment2.LLLIL) || z) {
            eCommerceAnchorPanelFragment2.qS((View) aObserverS191S0200000_32.l1);
        }
        AnchorBizUtils.LIZ.getClass();
        List listLJIJJ = AnchorBizUtils.LJIJJ(getItemProductInfoResponseData, false);
        ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment3 = (ECommerceAnchorPanelFragment) aObserverS191S0200000_32.l0;
        RecyclerView recyclerView = eCommerceAnchorPanelFragment3.LLJJJIL;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS132S0100000_32(eCommerceAnchorPanelFragment3, 30));
        }
        ((ECommerceAnchorPanelFragment) aObserverS191S0200000_32.l0).LLL = 1;
        C21271118Mb c21271118Mb = (C21271118Mb) C13LP.LJJJLL(listLJIJJ);
        if (c21271118Mb != null && (map = c21271118Mb.LJJIIJZLJL) != null && (str2 = map.get("multi_panel_common_voucher_toast")) != null) {
            ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment4 = (ECommerceAnchorPanelFragment) aObserverS191S0200000_32.l0;
            List<PanelVoucherInfo> list = c21271118Mb.LJJII;
            if (list != null && !list.isEmpty()) {
                C1389890mGx c1389890mGx = new C1389890mGx(eCommerceAnchorPanelFragment4);
                c1389890mGx.LJFF(R.raw.icon_tick_fill);
                c1389890mGx.LJII(R.attr.a0i);
                c1389890mGx.LJIIJ(str2);
                c1389890mGx.LJIIJJI();
            } else {
                C1389890mGx c1389890mGx2 = new C1389890mGx(eCommerceAnchorPanelFragment4);
                c1389890mGx2.LJFF(R.raw.icon_info_circle);
                c1389890mGx2.LJII(R.attr.ee);
                c1389890mGx2.LJIIJ(str2);
                c1389890mGx2.LJIIJJI();
            }
        }
        RecyclerView recyclerView2 = ((ECommerceAnchorPanelFragment) aObserverS191S0200000_32.l0).LLJJJIL;
        if (recyclerView2 != null) {
            adapter = recyclerView2.getAdapter();
        } else {
            adapter = null;
        }
        if ((adapter instanceof C18MZ) && adapter != null && c21271118Mb != null && (cartEntry = c21271118Mb.LJIIIZ) != null && (num = cartEntry.itemCount) != null) {
            num.intValue();
        }
        ((ECommerceAnchorPanelFragment) aObserverS191S0200000_32.l0).FS(c21271118Mb);
        C1748780vbo.LIZ(((ECommerceAnchorPanelFragment) aObserverS191S0200000_32.l0).LLLIIIIL, new AwS611S0100000_32(c21271118Mb, 59));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name2 = IAdDependencyService.class.getName();
            if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
        }
        AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("landing_ad", "detail_show_success", ((ECommerceAnchorPanelFragment) aObserverS191S0200000_32.l0).LLJJI.awemeRawAd);
        abstractC1056160dagOnAdEvent.LIZ.put("refer", "landing_page");
        abstractC1056160dagOnAdEvent.LIZIZ.put("entryPoint", "other");
        abstractC1056160dagOnAdEvent.LIZIZ.put("platform", "native");
        abstractC1056160dagOnAdEvent.LIZIZ();
        ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment5 = (ECommerceAnchorPanelFragment) aObserverS191S0200000_32.l0;
        eCommerceAnchorPanelFragment5.LLJJIJIL.RQ2(eCommerceAnchorPanelFragment5.isResumed());
        if (c21271118Mb != null) {
            ((ECommerceAnchorPanelFragment) aObserverS191S0200000_32.l0).uS(c21271118Mb);
        }
        ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment6 = (ECommerceAnchorPanelFragment) aObserverS191S0200000_32.l0;
        if (c21271118Mb != null && (promotionResource = c21271118Mb.LJJIFFI) != null) {
            panelBannerInfo = promotionResource.panelBannerInfo;
        }
        eCommerceAnchorPanelFragment6.sS(panelBannerInfo);
    }

    public static final void onChanged$4(AObserverS191S0200000_32 aObserverS191S0200000_32, Object obj) {
        ((C21208817zC) aObserverS191S0200000_32.l0).getClass();
        ((InterfaceC1541990qEH) aObserverS191S0200000_32.l1).updateData(C21208817zC.LIZ((String) obj, "live data observe"));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, X.19Go, java.lang.Object] */
    public static final void onChanged$5(AObserverS191S0200000_32 aObserverS191S0200000_32, Object obj) {
        ?? r3 = (C21511619Go) obj;
        if (!Intrinsics.LJFF(r3, ((C259800zU) aObserverS191S0200000_32.l0).element)) {
            Function1 function1 = (Function1) aObserverS191S0200000_32.l1;
            if (function1 != null) {
                function1.invoke(r3.LIZ);
            }
            ((C259800zU) aObserverS191S0200000_32.l0).element = r3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, X.19Go, java.lang.Object] */
    public static final void onChanged$6(AObserverS191S0200000_32 aObserverS191S0200000_32, Object obj) {
        ?? r3 = (C21511619Go) obj;
        if (!Intrinsics.LJFF(r3, ((C259800zU) aObserverS191S0200000_32.l0).element)) {
            Function1 function1 = (Function1) aObserverS191S0200000_32.l1;
            if (function1 != null) {
                function1.invoke(r3.LIZ);
            }
            ((C259800zU) aObserverS191S0200000_32.l0).element = r3;
        }
    }

    public static final void onChanged$7(AObserverS191S0200000_32 aObserverS191S0200000_32, Object obj) {
        C18NO c18no = (C18NO) aObserverS191S0200000_32.l0;
        C18NR c18nr = c18no.LIZJ;
        if (c18nr != null) {
            c18nr.setSufTitle(c18no.LIZIZ.VQ2());
        }
        C18NO c18no2 = (C18NO) aObserverS191S0200000_32.l0;
        C18NR c18nr2 = c18no2.LIZJ;
        if (c18nr2 != null) {
            String strXQ2 = c18no2.LIZIZ.XQ2();
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            Aweme aweme = (Aweme) aObserverS191S0200000_32.l1;
            anchorBizUtils.getClass();
            c18nr2.LIZIZ(strXQ2, AnchorBizUtils.LJJIJL(aweme));
        }
        if (Intrinsics.LJFF(((EcShouldEnablePrefixInMultiAnchorAB.Config) EcShouldEnablePrefixInMultiAnchorAB.LIZIZ.getValue()).mainAnchor, Boolean.TRUE)) {
            C18NO c18no3 = (C18NO) aObserverS191S0200000_32.l0;
            c18no3.LIZIZ.CQ2(c18no3.LIZJ);
        }
    }

    public AObserverS191S0200000_32(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
