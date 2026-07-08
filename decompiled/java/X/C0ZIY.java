package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;

/* JADX INFO: renamed from: X.0ZIY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZIY {
    public final int LIZ;
    public final int LIZIZ;
    public final TextExtraStruct LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionKeyData(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", struct=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZIY(int i, int i2, TextExtraStruct textExtraStruct, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = textExtraStruct;
        this.LIZLLL = str;
    }
}
