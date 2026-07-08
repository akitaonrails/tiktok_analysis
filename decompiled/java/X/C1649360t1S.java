package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0t1S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649360t1S {
    public final C375830EoP<C1649380t1U> LIZ;
    public final C375830EoP<Function0<Unit>> LIZIZ;

    public C1649360t1S() {
        this(null, null);
    }

    public C1649360t1S(C375830EoP<C1649380t1U> c375830EoP, C375830EoP<Function0<Unit>> c375830EoP2) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
    }

    public static C1649360t1S LIZ(C1649360t1S c1649360t1S, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        if ((i & 1) != 0) {
            c375830EoP = c1649360t1S.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP2 = c1649360t1S.LIZIZ;
        }
        c1649360t1S.getClass();
        return new C1649360t1S(c375830EoP, c375830EoP2);
    }
}
