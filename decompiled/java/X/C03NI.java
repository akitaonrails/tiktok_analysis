package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03NI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03NI extends C21674119s3 {
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final String LJIIZILJ;
    public float LJIJ;
    public long LJIJI;
    public int LJIJJ;

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJFF() {
        IEventCenter iEventCenter;
        IEventCenter iEventCenter2;
        C03O0 c03o0 = C03O0.LIZ;
        float fCurrentTimeMillis = this.LJIJI > 0 ? System.currentTimeMillis() - this.LJIJI : -1.0f;
        int i = this.LJIJJ;
        c03o0.getClass();
        C03O0.LJLJLLL(fCurrentTimeMillis, "CenterSmoothScroller", i);
        this.LJIJI = -1L;
        this.LJIJJ = 0;
        if ((C871103an.LIZ() || C818203Ho.LIZ()) && this.LJIILL) {
            String str = this.LJIIZILJ;
            if (Intrinsics.LJFF(str, "payment_methods")) {
                IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
                if (iEventCenter3 != null) {
                    iEventCenter3.LIZ("ec_osp_payment_module_shake", "{}");
                }
            } else if (Intrinsics.LJFF(str, "shipping_address") && (iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null)) != null) {
                iEventCenter.LIZ("ec_osp_address_module_shake", "{}");
            }
        }
        if (this.LJIILL && Intrinsics.LJFF(this.LJIIZILJ, "age_confirm_module") && (iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null)) != null) {
            iEventCenter2.LIZ("ec_osp_age_confirm_module_shake", "{}");
        }
    }

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJ() {
        this.LJIJI = System.currentTimeMillis();
    }

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        float f;
        float f2;
        if (!C818203Ho.LIZ() && !this.LJIILLIIL) {
            f2 = displayMetrics.densityDpi;
            f = 0.1f;
        } else {
            f = this.LJIJ * 1.5f;
            this.LJIJ = f;
            f2 = displayMetrics.densityDpi;
        }
        return f / f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03NI(Context context, boolean z, boolean z2, String str, int i) {
        super(context);
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        str = (i & 8) != 0 ? null : str;
        this.LJIILL = z;
        this.LJIILLIIL = z2;
        this.LJIIZILJ = str;
        this.LJIJ = 20.0f;
        this.LJIJI = -1L;
        this.LJIJJ = -1;
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
    }
}
