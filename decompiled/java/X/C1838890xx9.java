package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;

/* JADX INFO: renamed from: X.0xx9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838890xx9 {
    public final boolean LIZ;
    public final int LIZIZ;
    public final AIGenerationType LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1838890xx9() {
        this(false, (int) (0 == true ? 1 : 0), 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1838890xx9(boolean z, int i, int i2) {
        AIGenerationType aIGenerationType;
        z = (i2 & 1) != 0 ? false : z;
        i = (i2 & 2) != 0 ? 0 : i;
        if ((i2 & 4) != 0) {
            aIGenerationType = AIGenerationType.NONE;
        } else {
            aIGenerationType = null;
        }
        this(i, aIGenerationType, z);
    }

    public C1838890xx9(int i, AIGenerationType aIGenerationType, boolean z) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = aIGenerationType;
    }
}
