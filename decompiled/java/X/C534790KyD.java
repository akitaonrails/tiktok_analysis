package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C534790KyD extends C2217421BqW implements Function0<Boolean> {
    public C534790KyD(C0MJC c0mjc) {
        super(0, c0mjc, C0MJC.class, "getStickerPanelVisibility", "getStickerPanelVisibility()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        C0MJC c0mjc = (C0MJC) this.receiver;
        if (Intrinsics.LJFF(c0mjc.LJJIIZI().qr1().LJI(), Boolean.TRUE)) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c0mjc.LLILLL);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C534780KyC(c0mjc, null), 2);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
