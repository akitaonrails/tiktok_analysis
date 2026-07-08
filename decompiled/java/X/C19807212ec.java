package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.12ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19807212ec {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final /* synthetic */ C19804812eE LJ;

    public final void LIZ() {
        this.LJ.LJ();
        this.LJ.LIZ.LJIILIIL.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.LJ.LJIIZILJ().edit();
        editorEdit.remove(this.LIZIZ);
        editorEdit.remove(this.LIZJ);
        editorEdit.putLong(this.LIZ, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public C19807212ec(C19804812eE c19804812eE, long j) {
        boolean z;
        this.LJ = c19804812eE;
        C0W3J.LJI("health_monitor");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LIZIZ(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("health_monitor");
        sbLIZ.append(":start");
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("health_monitor");
        sbLIZ2.append(":count");
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("health_monitor");
        sbLIZ3.append(":value");
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
        this.LIZLLL = j;
    }
}
