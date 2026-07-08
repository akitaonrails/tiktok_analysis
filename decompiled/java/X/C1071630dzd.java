package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0dzd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071630dzd {
    public final Context LIZ;
    public final C19EG LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final EnumC1073320e2M LIZLLL;
    public final C1073080e1y LJ;
    public final C1071130dyp LJFF;
    public final C1071160dys LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationAuthDialogCenterConfig(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hostActivity=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", coroutineScope=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", triggerScene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", strategyConfig=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", pipelineConfig=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", tracker=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", bundle=");
        sbLIZ.append((Object) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1071630dzd(Context context, C19EG c19eg, InterfaceC497601wk interfaceC497601wk, EnumC1073320e2M enumC1073320e2M, C1073080e1y c1073080e1y, C1071130dyp c1071130dyp, C1071160dys c1071160dys) {
        this.LIZ = context;
        this.LIZIZ = c19eg;
        this.LIZJ = interfaceC497601wk;
        this.LIZLLL = enumC1073320e2M;
        this.LJ = c1073080e1y;
        this.LJFF = c1071130dyp;
        this.LJI = c1071160dys;
    }
}
