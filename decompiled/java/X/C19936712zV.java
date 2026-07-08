package X;

import com.google.protobuf.k0;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.12zV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19936712zV {
    public final Method LIZ;
    public final Method LIZIZ;
    public final Method LIZJ;
    public final Method LIZLLL;
    public final Method LJ;
    public final Method LJFF;
    public final Method LJI;
    public final Method LJII;

    public C19936712zV(Class cls, Class cls2, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get");
        sbLIZ.append(str);
        sbLIZ.append("List");
        this.LIZ = k0.getMethodOrDie(cls, C2188811AlT.LIZIZ(sbLIZ), new Class[0]);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("get");
        sbLIZ2.append(str);
        sbLIZ2.append("List");
        this.LIZIZ = k0.getMethodOrDie(cls2, C2188811AlT.LIZIZ(sbLIZ2), new Class[0]);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("get");
        sbLIZ3.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        Class cls3 = Integer.TYPE;
        Method methodOrDie = k0.getMethodOrDie(cls, strLIZIZ, cls3);
        this.LIZJ = methodOrDie;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("get");
        sbLIZ4.append(str);
        this.LIZLLL = k0.getMethodOrDie(cls2, C2188811AlT.LIZIZ(sbLIZ4), cls3);
        Class<?> returnType = methodOrDie.getReturnType();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("set");
        sbLIZ5.append(str);
        k0.getMethodOrDie(cls2, C2188811AlT.LIZIZ(sbLIZ5), cls3, returnType);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("add");
        sbLIZ6.append(str);
        this.LJ = k0.getMethodOrDie(cls2, C2188811AlT.LIZIZ(sbLIZ6), returnType);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("get");
        sbLIZ7.append(str);
        sbLIZ7.append("Count");
        this.LJFF = k0.getMethodOrDie(cls, C2188811AlT.LIZIZ(sbLIZ7), new Class[0]);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("get");
        sbLIZ8.append(str);
        sbLIZ8.append("Count");
        this.LJI = k0.getMethodOrDie(cls2, C2188811AlT.LIZIZ(sbLIZ8), new Class[0]);
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("clear");
        sbLIZ9.append(str);
        this.LJII = k0.getMethodOrDie(cls2, C2188811AlT.LIZIZ(sbLIZ9), new Class[0]);
    }
}
