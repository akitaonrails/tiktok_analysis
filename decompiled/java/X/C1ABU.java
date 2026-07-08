package X;

import android.content.Context;

/* JADX INFO: renamed from: X.1ABU, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ABU {
    public boolean LIZ = false;
    public final long LIZIZ;
    public final Context LIZJ;
    public final boolean LIZLLL;
    public final EnumC19379710rr LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageManagerParam(consumed=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isAnchor=");
        sbLIZ.append(false);
        sbLIZ.append(", context=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", websocketReuse=");
        sbLIZ.append(true);
        sbLIZ.append(", needMessageInstant=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", messageScene=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1ABU(long j, Context context, EnumC19379710rr enumC19379710rr, boolean z) {
        this.LIZIZ = j;
        this.LIZJ = context;
        this.LIZLLL = z;
        this.LJ = enumC19379710rr;
    }
}
