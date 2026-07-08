package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13tA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20152213tA implements InterfaceC728860SiS {
    public C20152013t8 LIZ;

    @Override // X.InterfaceC728860SiS
    public final void LIZ(Bundle bundle, Class<? extends InterfaceC20153313tL> cls, InterfaceC1726310v1Z interfaceC1726310v1Z, Boolean bool) {
        LIZIZ(bundle, cls.newInstance(), interfaceC1726310v1Z, bool);
    }

    public final void LIZIZ(Bundle bundle, InterfaceC20153313tL interfaceC20153313tL, InterfaceC1726310v1Z interfaceC1726310v1Z, Boolean bool) {
        C20152913tH.LIZLLL.getClass();
        if (!C20153113tJ.LIZ()) {
            return;
        }
        try {
            this.LIZ.LIZ(interfaceC20153313tL, bundle, interfaceC1726310v1Z, Intrinsics.LJFF(bool, Boolean.TRUE));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20152413tC.LIZ(e);
        }
    }
}
