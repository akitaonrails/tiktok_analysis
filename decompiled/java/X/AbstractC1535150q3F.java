package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q3F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1535150q3F<Input, Output> implements InterfaceC1535220q3M<Object, AbstractC1534220q1k<Output>> {
    public final Class<Input> LIZ;
    public final Class<Output> LIZIZ;
    public C1535040q34 LIZJ;

    public void LJ() {
    }

    public abstract void LJFF(AbstractC1534220q1k<Input> abstractC1534220q1k, C1533790q13 c1533790q13, List<? extends Class<?>> list, Function1<? super AbstractC1534220q1k<Output>, Unit> function1);

    public final C1535040q34 LIZLLL() {
        C1535040q34 c1535040q34 = this.LIZJ;
        if (c1535040q34 != null) {
            return c1535040q34;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getName());
        sbLIZ.append(", ");
        sbLIZ.append(super.toString());
        sbLIZ.append(", returnType: ");
        sbLIZ.append(this.LIZIZ.getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC1535150q3F(Class<Input> cls, Class<Output> cls2) {
        this.LIZ = cls;
        this.LIZIZ = cls2;
    }
}
