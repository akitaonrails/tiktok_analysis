package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0ffy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136320ffy {
    public final C1135810ff9 LIZ;
    public final ArrayList<String> LIZIZ;
    public boolean LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveGiftMessageRequest(source=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", excludeList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", conflictWithVideo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1136320ffy(C1135810ff9 c1135810ff9, String str) {
        ArrayList<String> arrayList = new ArrayList<>(2);
        this.LIZ = c1135810ff9;
        this.LIZIZ = arrayList;
        this.LIZJ = false;
        this.LIZLLL = str;
    }
}
