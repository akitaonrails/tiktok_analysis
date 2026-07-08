package X;

import android.os.Looper;
import android.os.MessageQueue;
import kotlin.Unit;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: renamed from: X.0dah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056170dah {
    public static final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        MessageQueue messageQueueMyQueue = Looper.myQueue();
        C1077370e8t c1077370e8t = new C1077370e8t(c2252611DEt, 1);
        c2252611DEt.LJJII(new AwS382S0200000_16(c1077370e8t, messageQueueMyQueue, 24));
        C786410Ut5.f3(c1077370e8t, messageQueueMyQueue);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }
}
