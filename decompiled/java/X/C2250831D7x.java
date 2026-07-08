package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1D7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250831D7x {
    public final Function2<Boolean, Function1<? super C1D82, Unit>, Unit> LIZ;
    public final Function0<Boolean> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C1D82 c1d82) {
        HashSet hashSet = new HashSet(c1d82.LIZ.LIZ);
        if (c1d82.LJ()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(hashSet, 10));
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                c1d82.LJI(it2.next());
                arrayList.add(Boolean.TRUE);
            }
        }
    }

    public C2250831D7x(C21185917vV c21185917vV, C1D4B c1d4b) {
        this.LIZ = c1d4b;
        this.LIZIZ = c21185917vV;
    }

    public static void LIZIZ(C2250831D7x c2250831D7x, String str) {
        C157K.LJIIIIZZ.getClass();
        if (!C157K.LIZJ.LJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WaveDependsOperator: ");
            sbLIZ.append(str);
            C157K.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("WaveDependsOperator: ");
        sbLIZ2.append(str);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
