package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;

/* JADX INFO: renamed from: X.0yH2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851220yH2 {
    public final AIGenerationType LIZ;
    public final C375830EoP<C1838890xx9> LIZIZ;
    public final boolean LIZJ;

    public C1851220yH2() {
        this(0);
    }

    public /* synthetic */ C1851220yH2(int i) {
        this(AIGenerationType.NONE, null, true);
    }

    public C1851220yH2(AIGenerationType aIGenerationType, C375830EoP<C1838890xx9> c375830EoP, boolean z) {
        this.LIZ = aIGenerationType;
        this.LIZIZ = c375830EoP;
        this.LIZJ = z;
    }

    public static C1851220yH2 LIZ(C1851220yH2 c1851220yH2, AIGenerationType aIGenerationType, C375830EoP c375830EoP, boolean z, int i) {
        if ((i & 1) != 0) {
            aIGenerationType = c1851220yH2.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP = c1851220yH2.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c1851220yH2.LIZJ;
        }
        c1851220yH2.getClass();
        return new C1851220yH2(aIGenerationType, c375830EoP, z);
    }
}
