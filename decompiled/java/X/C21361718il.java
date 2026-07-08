package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21361718il {
    public Function0<Unit> LIZ;
    public final C19LK LIZIZ = new C19LK(this, 1);

    public final void LIZ(InterfaceC540220LGq interfaceC540220LGq, C19EG c19eg, Function0 function0) {
        boolean zLIZ;
        if (((Boolean) C280790AzV.LIZ.getValue()).booleanValue()) {
            if (interfaceC540220LGq != null) {
                zLIZ = interfaceC540220LGq.LIZ();
            } else {
                zLIZ = C540230LGr.LIZ(c19eg);
            }
            if (zLIZ) {
                function0.invoke();
                return;
            }
        }
        this.LIZ = function0;
        this.LIZIZ.cancel();
        this.LIZIZ.start();
    }
}
