package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.11xu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19672011xu {
    public final C375830EoP<Unit> LIZ;
    public final C375830EoP<Pair<Float, Float>> LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;

    public C19672011xu() {
        this(0);
    }

    public /* synthetic */ C19672011xu(int i) {
        this(null, null, 0, null);
    }

    public C19672011xu(C375830EoP<Unit> c375830EoP, C375830EoP<Pair<Float, Float>> c375830EoP2, int i, Integer num) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = i;
        this.LIZLLL = num;
    }

    public static C19672011xu LIZ(C19672011xu c19672011xu, C375830EoP c375830EoP, C375830EoP c375830EoP2, Integer num, int i) {
        int i2;
        if ((i & 1) != 0) {
            c375830EoP = c19672011xu.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP2 = c19672011xu.LIZIZ;
        }
        if ((i & 4) != 0) {
            i2 = c19672011xu.LIZJ;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            num = c19672011xu.LIZLLL;
        }
        c19672011xu.getClass();
        return new C19672011xu(c375830EoP, c375830EoP2, i2, num);
    }
}
