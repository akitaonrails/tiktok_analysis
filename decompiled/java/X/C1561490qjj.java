package X;

import Y.ARunnableS124S0100000_24;
import android.os.Looper;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qjj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561490qjj extends C09AY implements Function1<List<? extends InterfaceC214942199w>, Unit> {
    public C1561490qjj() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends InterfaceC214942199w> list) {
        List<? extends InterfaceC214942199w> list2 = list;
        if (((Boolean) C07DM.LIZ.getValue()).booleanValue()) {
            if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                C786410Ut5.LJJZZIII(C214933199n.LIZJ, new ARunnableS124S0100000_24(list2, 112));
            } else {
                C214933199n.LIZ(list2);
            }
        }
        return Unit.LIZ;
    }
}
