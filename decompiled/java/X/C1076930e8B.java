package X;

import com.ss.android.ugc.aweme.feed.model.CommerceAgentHint;

/* JADX INFO: renamed from: X.0e8B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076930e8B {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final CommerceAgentHint LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgentActionItemRenderData(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enterHint=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", exitHint=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hint=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1076930e8B(long j, String str, String str2, String str3, String str4, String str5, CommerceAgentHint commerceAgentHint) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = commerceAgentHint;
    }
}
