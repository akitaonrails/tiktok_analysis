package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam;

/* JADX INFO: renamed from: X.0yHX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851530yHX {
    public final AIGenerationType LIZ;
    public final UploadImageParam LIZIZ;
    public final UploadImageParam LIZJ;
    public final C375830EoP<C1838890xx9> LIZLLL;
    public final Integer LJ;
    public final Boolean LJFF;
    public final Boolean LJI;

    public C1851530yHX() {
        this(0);
    }

    public /* synthetic */ C1851530yHX(int i) {
        this(AIGenerationType.NONE, null, null, null, null, null, null);
    }

    public C1851530yHX(AIGenerationType aIGenerationType, UploadImageParam uploadImageParam, UploadImageParam uploadImageParam2, C375830EoP<C1838890xx9> c375830EoP, Integer num, Boolean bool, Boolean bool2) {
        this.LIZ = aIGenerationType;
        this.LIZIZ = uploadImageParam;
        this.LIZJ = uploadImageParam2;
        this.LIZLLL = c375830EoP;
        this.LJ = num;
        this.LJFF = bool;
        this.LJI = bool2;
    }

    public static C1851530yHX LIZ(C1851530yHX c1851530yHX, AIGenerationType aIGenerationType, UploadImageParam uploadImageParam, UploadImageParam uploadImageParam2, C375830EoP c375830EoP, Integer num, Boolean bool, Boolean bool2, int i) {
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        Integer num2 = num;
        C375830EoP c375830EoP2 = c375830EoP;
        UploadImageParam uploadImageParam3 = uploadImageParam2;
        UploadImageParam uploadImageParam4 = uploadImageParam;
        AIGenerationType aIGenerationType2 = aIGenerationType;
        if ((i & 1) != 0) {
            aIGenerationType2 = c1851530yHX.LIZ;
        }
        if ((i & 2) != 0) {
            uploadImageParam4 = c1851530yHX.LIZIZ;
        }
        if ((i & 4) != 0) {
            uploadImageParam3 = c1851530yHX.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP2 = c1851530yHX.LIZLLL;
        }
        if ((i & 16) != 0) {
            num2 = c1851530yHX.LJ;
        }
        if ((i & 32) != 0) {
            bool4 = c1851530yHX.LJFF;
        }
        if ((i & 64) != 0) {
            bool3 = c1851530yHX.LJI;
        }
        c1851530yHX.getClass();
        return new C1851530yHX(aIGenerationType2, uploadImageParam4, uploadImageParam3, c375830EoP2, num2, bool4, bool3);
    }
}
