package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0t1F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649230t1F {
    public final C375830EoP<C1649150t17> LIZ;
    public final C375830EoP<Function0<Unit>> LIZIZ;

    public C1649230t1F() {
        this(null, null);
    }

    public C1649230t1F(C375830EoP<C1649150t17> c375830EoP, C375830EoP<Function0<Unit>> c375830EoP2) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
    }

    public static C1649230t1F LIZ(C1649230t1F c1649230t1F, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        if ((i & 1) != 0) {
            c375830EoP = c1649230t1F.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP2 = c1649230t1F.LIZIZ;
        }
        c1649230t1F.getClass();
        return new C1649230t1F(c375830EoP, c375830EoP2);
    }
}
