package X;

import com.google.protobuf.k0;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.12zU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19936612zU {
    public final Method LIZ;
    public final Method LIZIZ;
    public final Method LIZJ;
    public final Method LIZLLL;
    public final Method LJ;
    public final Method LJFF;
    public final Method LJI;

    public C19936612zU(String str, Class<? extends k0> cls, Class<? extends AbstractC19933512yz<?>> cls2, String str2, boolean z, boolean z2) {
        Method methodOrDie;
        Method methodOrDie2;
        Method methodOrDie3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get");
        sbLIZ.append(str);
        Method methodOrDie4 = k0.getMethodOrDie(cls, C2188811AlT.LIZIZ(sbLIZ), new Class[0]);
        this.LIZ = methodOrDie4;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("get");
        sbLIZ2.append(str);
        this.LIZIZ = k0.getMethodOrDie(cls2, C2188811AlT.LIZIZ(sbLIZ2), new Class[0]);
        Class<?> returnType = methodOrDie4.getReturnType();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("set");
        sbLIZ3.append(str);
        this.LIZJ = k0.getMethodOrDie(cls2, C2188811AlT.LIZIZ(sbLIZ3), returnType);
        Method methodOrDie5 = null;
        if (z2) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("has");
            sbLIZ4.append(str);
            methodOrDie = k0.getMethodOrDie(cls, C2188811AlT.LIZIZ(sbLIZ4), new Class[0]);
        } else {
            methodOrDie = null;
        }
        this.LIZLLL = methodOrDie;
        if (z2) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("has");
            sbLIZ5.append(str);
            methodOrDie2 = k0.getMethodOrDie(cls2, C2188811AlT.LIZIZ(sbLIZ5), new Class[0]);
        } else {
            methodOrDie2 = null;
        }
        this.LJ = methodOrDie2;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("clear");
        sbLIZ6.append(str);
        k0.getMethodOrDie(cls2, C2188811AlT.LIZIZ(sbLIZ6), new Class[0]);
        if (z) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("get");
            sbLIZ7.append(str2);
            sbLIZ7.append("Case");
            methodOrDie3 = k0.getMethodOrDie(cls, C2188811AlT.LIZIZ(sbLIZ7), new Class[0]);
        } else {
            methodOrDie3 = null;
        }
        this.LJFF = methodOrDie3;
        if (z) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("get");
            sbLIZ8.append(str2);
            sbLIZ8.append("Case");
            methodOrDie5 = k0.getMethodOrDie(cls2, C2188811AlT.LIZIZ(sbLIZ8), new Class[0]);
        }
        this.LJI = methodOrDie5;
    }
}
