package X;

import android.content.Context;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelAssem;

/* JADX INFO: renamed from: X.03Qj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C841103Qj {
    public final /* synthetic */ SkuPanelAssem LIZ;
    public final /* synthetic */ UIAssem LIZIZ;

    public final void LIZIZ() {
        this.LIZ.Lo().OG(false);
        this.LIZ.Go().dismissAllowingStateLoss();
    }

    public final void LIZ(String str) {
        this.LIZ.Lo().OG(false);
        Context context = this.LIZIZ.getContext();
        if (context != null) {
            SkuPanelAssem skuPanelAssem = this.LIZ;
            skuPanelAssem.Lo().wQ2(context, str, skuPanelAssem.Go(), 1);
        }
    }

    public C841103Qj(SkuPanelAssem skuPanelAssem, UIAssem uIAssem) {
        this.LIZ = skuPanelAssem;
        this.LIZIZ = uIAssem;
    }
}
