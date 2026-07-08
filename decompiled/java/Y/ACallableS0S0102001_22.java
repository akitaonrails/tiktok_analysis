package Y;

import X.C1435540nSa;
import X.C1435550nSb;
import X.C1C7U;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes23.dex */
public class ACallableS0S0102001_22 implements Callable {
    public final int $t;
    public float f3;
    public int i1;
    public int i2;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS0S0102001_22 aCallableS0S0102001_22) {
        C1C7U.LIZ("CompileTask@a3ca.setupEditorCallbacks$1$2$onCallback$5");
        List<String> list = ((C1435540nSa) aCallableS0S0102001_22.l0).LLJJLIIIJLLLLLLLZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type:");
        sbLIZ.append(aCallableS0S0102001_22.i1);
        sbLIZ.append(" ext:");
        sbLIZ.append(aCallableS0S0102001_22.i2);
        sbLIZ.append(" f:");
        sbLIZ.append(aCallableS0S0102001_22.f3);
        ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("CompileTask@a3ca.setupEditorCallbacks$1$2$onCallback$5");
        return null;
    }

    public static final Object call$1(ACallableS0S0102001_22 aCallableS0S0102001_22) {
        C1C7U.LIZ("DMVideoCompileTask@c7d8.setupEditorCallbacks$2$onCallback$4");
        List<String> list = ((C1435550nSb) aCallableS0S0102001_22.l0).LLJJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type:");
        sbLIZ.append(aCallableS0S0102001_22.i1);
        sbLIZ.append(" ext:");
        sbLIZ.append(aCallableS0S0102001_22.i2);
        sbLIZ.append(" f:");
        sbLIZ.append(aCallableS0S0102001_22.f3);
        ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("DMVideoCompileTask@c7d8.setupEditorCallbacks$2$onCallback$4");
        return null;
    }

    public ACallableS0S0102001_22(Object obj, int i, int i2, float f, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
        this.f3 = f;
    }
}
