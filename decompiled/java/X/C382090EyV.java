package X;

import java.util.List;

/* JADX INFO: renamed from: X.0EyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382090EyV {
    public final List<C378710Et3> LIZ;
    public final C378710Et3 LIZIZ;
    public final boolean LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final long LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestPrompts(prompts=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", defaultPrompt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", uploadDuration=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C382090EyV(List<C378710Et3> list, C378710Et3 c378710Et3, boolean z, Integer num, String str, long j) {
        this.LIZ = list;
        this.LIZIZ = c378710Et3;
        this.LIZJ = z;
        this.LIZLLL = num;
        this.LJ = str;
        this.LJFF = j;
    }
}
