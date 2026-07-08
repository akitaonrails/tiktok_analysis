package X;

/* JADX INFO: renamed from: X.05sq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1492605sq {
    public final String LIZ;
    public final String LIZIZ;
    public final float LIZJ;
    public final EnumC1492905st LIZLLL;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public float LIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC1492605sq(String str, String str2, EnumC1492905st enumC1492905st, int i) {
        float f;
        str2 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this(str, str2, f, (i & 8) != 0 ? EnumC1492905st.TEA : enumC1492905st);
    }

    public AbstractC1492605sq(String str, String str2, float f, EnumC1492905st enumC1492905st) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = f;
        this.LIZLLL = enumC1492905st;
    }
}
