package X;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: X.0dzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071620dzc {
    public final Context LIZ;
    public final C19EG LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final C1071130dyp LIZLLL;
    public final C1071160dys LJ;
    public final EnumC1073320e2M LJFF;
    public final Bundle LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationAuthConfig(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hostActivity=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", coroutineScope=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pipelineConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", tracker=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", triggerScene=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", bundle=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1071620dzc(Context context, C19EG c19eg, InterfaceC497601wk interfaceC497601wk, C1071130dyp c1071130dyp, C1071160dys c1071160dys, EnumC1073320e2M enumC1073320e2M, Bundle bundle) {
        this.LIZ = context;
        this.LIZIZ = c19eg;
        this.LIZJ = interfaceC497601wk;
        this.LIZLLL = c1071130dyp;
        this.LJ = c1071160dys;
        this.LJFF = enumC1073320e2M;
        this.LJI = bundle;
    }
}
