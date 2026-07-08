package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.12fE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19811012fE {
    public final String LIZ;
    public final long LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public final /* synthetic */ C19804812eE LJ;

    public final long LIZ() {
        if (!this.LIZJ) {
            this.LIZJ = true;
            this.LIZLLL = this.LJ.LJIIZILJ().getLong(this.LIZ, this.LIZIZ);
        }
        return this.LIZLLL;
    }

    public final void LIZIZ(long j) {
        SharedPreferences.Editor editorEdit = this.LJ.LJIIZILJ().edit();
        editorEdit.putLong(this.LIZ, j);
        editorEdit.apply();
        this.LIZLLL = j;
    }

    public C19811012fE(C19804812eE c19804812eE, String str, long j) {
        this.LJ = c19804812eE;
        C0W3J.LJI(str);
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
