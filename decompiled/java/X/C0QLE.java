package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0QLE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QLE {
    public static final C0QLE LIZ = new C0QLE();
    public static final WeakHashMap<InterfaceC214902198i, C680740Qn2> LIZIZ = new WeakHashMap<>();
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());

    public static void LIZ(InterfaceC214902198i interfaceC214902198i) {
        C680740Qn2 c680740Qn2 = LIZIZ.get(interfaceC214902198i);
        if (c680740Qn2 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[SAFPlaceholder] dismiss: no active overlay for ");
            sbLIZ.append(interfaceC214902198i.getClass().getSimpleName());
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[SAFPlaceholder] dismiss triggered by business for ");
        sbLIZ2.append(interfaceC214902198i.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ2);
        c680740Qn2.LIZ();
    }
}
