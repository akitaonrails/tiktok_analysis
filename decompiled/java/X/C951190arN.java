package X;

import Y.AfS109S0300000_15;
import Y.AfS184S0100000_15;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0arN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C951190arN extends C1117360fBO {
    public final List<Object> LLILLL = new ArrayList();
    public C11JF LLILZ;

    public void LLLIIIIL() {
        C11JF c11jf = this.LLILZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILZ = null;
    }

    @Override // X.C1117360fBO
    public final void LLLII(List<?> list) {
        LLLIILIL(list, AFwS203S0000000_15.get$arr$(431), AFwS203S0000000_15.get$arr$(432));
    }

    public final void LLLIILIL(final List<?> list, Function0<Unit> function0, Function0<Unit> function02) {
        C11JF c11jf = this.LLILZ;
        if (c11jf != null && !c11jf.isDisposed()) {
            c11jf.dispose();
        }
        final List<Object> list2 = this.LLILLL;
        this.LLILZ = (C11JF) C11NZ.LJJJJZ(C21342318fd.LIZ(new C951220arQ(list2, list) { // from class: X.0arP
            @Override // X.AbstractC21342018fa
            public final Object LIZJ(int i, int i2) {
                Object obj = ListProtector.get(this.LIZ, i);
                Object obj2 = ListProtector.get(this.LIZIZ, i2);
                if ((obj instanceof InterfaceC951230arR) && obj2 != null) {
                    try {
                        return ((InterfaceC951230arR) obj).LIZLLL(obj2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return null;
                    }
                }
                return null;
            }
        }, true)).LJIILIIL(new C0UO0()).LJJLL(new AfS109S0300000_15(this, list, function0, 22), new AfS184S0100000_15(function02, 185));
    }
}
