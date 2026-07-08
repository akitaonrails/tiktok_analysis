package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;

/* JADX INFO: renamed from: X.0y4R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843410y4R {
    public final AIGenerationType LIZ;
    public final C375830EoP<C1838890xx9> LIZIZ;
    public final C375830EoP<Boolean> LIZJ;
    public final Boolean LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1843410y4R() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    public /* synthetic */ C1843410y4R(AIGenerationType aIGenerationType, Boolean bool, int i) {
        this((i & 1) != 0 ? AIGenerationType.NONE : aIGenerationType, null, null, (i & 8) != 0 ? null : bool);
    }

    public C1843410y4R(AIGenerationType aIGenerationType, C375830EoP<C1838890xx9> c375830EoP, C375830EoP<Boolean> c375830EoP2, Boolean bool) {
        this.LIZ = aIGenerationType;
        this.LIZIZ = c375830EoP;
        this.LIZJ = c375830EoP2;
        this.LIZLLL = bool;
    }

    public static C1843410y4R LIZ(C1843410y4R c1843410y4R, C375830EoP c375830EoP, C375830EoP c375830EoP2, Boolean bool, int i) {
        AIGenerationType aIGenerationType;
        if ((i & 1) != 0) {
            aIGenerationType = c1843410y4R.LIZ;
        } else {
            aIGenerationType = null;
        }
        if ((i & 2) != 0) {
            c375830EoP = c1843410y4R.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP2 = c1843410y4R.LIZJ;
        }
        if ((i & 8) != 0) {
            bool = c1843410y4R.LIZLLL;
        }
        c1843410y4R.getClass();
        return new C1843410y4R(aIGenerationType, c375830EoP, c375830EoP2, bool);
    }
}
