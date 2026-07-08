package X;

import Y.ARunnableS101S0100000_1;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelAssemFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: renamed from: X.0477, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0477 extends C09AY implements Function0<AnonymousClass0462> {
    public final /* synthetic */ SkuPanelAssemFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0477(SkuPanelAssemFragment skuPanelAssemFragment) {
        super(0);
        this.LL = skuPanelAssemFragment;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0462] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass0462 invoke() {
        final SkuPanelAssemFragment skuPanelAssemFragment = this.LL;
        return new Activity.ScreenCaptureCallback() { // from class: X.0462
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                Window window;
                SkuPanelAssemFragment skuPanelAssemFragment2 = skuPanelAssemFragment;
                if (skuPanelAssemFragment2.LLJJJJ || skuPanelAssemFragment2.iS() || !skuPanelAssemFragment.isResumed()) {
                    return;
                }
                C10296040w.LIZ.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(C10296040w.LIZIZ);
                C1018703yb.LIZIZ("tiktokec_screenshot_product_detail", linkedHashMap);
                Context context = skuPanelAssemFragment.LLJJIJIIJIL.getContext();
                if (context != null && C10460047e.LIZ() && !C1486180omG.LIZIZ(context)) {
                    Dialog dialog = skuPanelAssemFragment.LLJJIJIIJIL.getDialog();
                    if (dialog == null || (window = dialog.getWindow()) == null) {
                        C19EG activity = skuPanelAssemFragment.LLJJIJIIJIL.getActivity();
                        window = activity != null ? activity.getWindow() : null;
                    }
                    C1486180omG.LIZ(window, new AwS367S0200000_1(skuPanelAssemFragment, context, 137));
                }
                SkuPanelAssemFragment skuPanelAssemFragment3 = skuPanelAssemFragment;
                skuPanelAssemFragment3.LLJJJJ = true;
                C786410Ut5.LJLIIL(1000L, skuPanelAssemFragment3.LLJJJIL, new ARunnableS101S0100000_1(skuPanelAssemFragment3, 27));
            }
        };
    }
}
