package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;

/* JADX INFO: renamed from: X.0xdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826640xdO {
    public final AIGenerationType LIZ;
    public final C375830EoP<C1838890xx9> LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final C375830EoP<Boolean> LJ;

    public C1826640xdO() {
        this(0);
    }

    public /* synthetic */ C1826640xdO(int i) {
        this(AIGenerationType.NONE, null, null, null, null);
    }

    public C1826640xdO(AIGenerationType aIGenerationType, C375830EoP<C1838890xx9> c375830EoP, Integer num, Integer num2, C375830EoP<Boolean> c375830EoP2) {
        this.LIZ = aIGenerationType;
        this.LIZIZ = c375830EoP;
        this.LIZJ = num;
        this.LIZLLL = num2;
        this.LJ = c375830EoP2;
    }

    public static C1826640xdO LIZ(C1826640xdO c1826640xdO, AIGenerationType aIGenerationType, C375830EoP c375830EoP, Integer num, Integer num2, C375830EoP c375830EoP2, int i) {
        C375830EoP c375830EoP3 = c375830EoP2;
        Integer num3 = num2;
        Integer num4 = num;
        C375830EoP c375830EoP4 = c375830EoP;
        AIGenerationType aIGenerationType2 = aIGenerationType;
        if ((i & 1) != 0) {
            aIGenerationType2 = c1826640xdO.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP4 = c1826640xdO.LIZIZ;
        }
        if ((i & 4) != 0) {
            num4 = c1826640xdO.LIZJ;
        }
        if ((i & 8) != 0) {
            num3 = c1826640xdO.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP3 = c1826640xdO.LJ;
        }
        c1826640xdO.getClass();
        return new C1826640xdO(aIGenerationType2, c375830EoP4, num4, num3, c375830EoP3);
    }
}
