package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0FN7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FN7 implements Runnable {
    public final /* synthetic */ View LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ EnumC1235690iGF LLILZIL;

    public C0FN7(Activity activity, View view, EnumC1235690iGF enumC1235690iGF, boolean z, boolean z2) {
        this.LL = view;
        this.LLILLJJLI = activity;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = enumC1235690iGF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("EditToolbarHelperKt@3637.showECommerceStickerMessageToolTip$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditToolbarHelperKt@3637.showECommerceStickerMessageToolTip$1");
    }

    public final void LIZ() {
        if (C388010FJf.LIZ() || !this.LL.isAttachedToWindow() || this.LLILLJJLI.isFinishing() || this.LLILLJJLI.isDestroyed()) {
            return;
        }
        ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLLLL(this.LLILLJJLI, this.LL, this.LLILZIL, this.LLILLL, this.LLILZ);
    }
}
