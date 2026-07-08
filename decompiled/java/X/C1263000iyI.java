package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263000iyI {
    public InterfaceC1263010iyJ LIZ;
    public final List<Function1<InterfaceC1263010iyJ, Unit>> LIZIZ = new ArrayList();

    public final void LIZ(Integer num, Function1<? super InterfaceC1263010iyJ, Unit> function1) {
        int size;
        InterfaceC1263010iyJ interfaceC1263010iyJ = this.LIZ;
        if (interfaceC1263010iyJ != null && interfaceC1263010iyJ.LJLJI()) {
            InterfaceC1263010iyJ interfaceC1263010iyJ2 = this.LIZ;
            if (interfaceC1263010iyJ2 == null) {
                interfaceC1263010iyJ2 = null;
            }
            function1.invoke(interfaceC1263010iyJ2);
            return;
        }
        if (num != null) {
            size = num.intValue();
        } else {
            size = ((ArrayList) this.LIZIZ).size();
        }
        ListProtector.add(this.LIZIZ, size, function1);
    }
}
