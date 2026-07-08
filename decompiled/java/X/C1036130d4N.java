package X;

import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;

/* JADX INFO: renamed from: X.0d4N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1036130d4N {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final C1016930cZP LJI;
    public final boolean LJII;
    public final AiAgentConfig LJIIIIZZ;
    public final Integer LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdWebUpdateModel(webUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", webTitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFromLynxLandPage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFromJsb=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", refer=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", useWebUrl=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", adLpBottomModel=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", fromCreate=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", aiAgentConfig=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", clickFrom=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1036130d4N(String str, String str2, boolean z, boolean z2, String str3, int i, C1016930cZP c1016930cZP, boolean z3, AiAgentConfig aiAgentConfig, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = str3;
        this.LJFF = i;
        this.LJI = c1016930cZP;
        this.LJII = z3;
        this.LJIIIIZZ = aiAgentConfig;
        this.LJIIIZ = num;
    }
}
