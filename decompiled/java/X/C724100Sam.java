package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724100Sam {
    public static final void LIZ(ReusedAssem<?> reusedAssem, boolean z) {
        boolean z2 = reusedAssem.LLILLJJLI;
        LIZIZ(reusedAssem, z, false, true);
        if (!z2 && z) {
            C724460SbM c724460SbM = reusedAssem.LL;
            Iterator it2 = ((CopyOnWriteArrayList) c724460SbM.LL.getValue()).iterator();
            while (it2.hasNext()) {
                ((Function0) it2.next()).invoke();
            }
            ((CopyOnWriteArrayList) c724460SbM.LL.getValue()).clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LIZJ(ReusedAssem<?> reusedAssem, Object obj) {
        InterfaceC712990Rxx interfaceC712990Rxx;
        reusedAssem.getClass();
        if ((reusedAssem instanceof InterfaceC712990Rxx) && (interfaceC712990Rxx = (InterfaceC712990Rxx) reusedAssem) != null) {
            if (obj == null) {
                obj = reusedAssem.bo();
            }
            return interfaceC712990Rxx.ur(obj);
        }
        return true;
    }

    public static final void LIZIZ(ReusedAssem<?> reusedAssem, boolean z, boolean z2, boolean z3) {
        reusedAssem.LLILLJJLI = z;
        if (z) {
            C724240Sb0.LJII(new C724110San(reusedAssem));
        } else {
            reusedAssem.uo();
        }
        C724240Sb0.LJII(new C724090Sal(reusedAssem));
        reusedAssem.wo(z2, z3);
    }
}
