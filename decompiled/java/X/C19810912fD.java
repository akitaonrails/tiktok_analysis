package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.12fD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19810912fD {
    public final String LIZ;
    public final boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final /* synthetic */ C19804812eE LJ;

    public final boolean LIZIZ() {
        if (!this.LIZJ) {
            this.LIZJ = true;
            this.LIZLLL = this.LJ.LJIIZILJ().getBoolean(this.LIZ, this.LIZIZ);
        }
        return this.LIZLLL;
    }

    public final void LIZ(boolean z) {
        SharedPreferences.Editor editorEdit = this.LJ.LJIIZILJ().edit();
        editorEdit.putBoolean(this.LIZ, z);
        editorEdit.apply();
        this.LIZLLL = z;
    }

    public C19810912fD(C19804812eE c19804812eE, String str, boolean z) {
        this.LJ = c19804812eE;
        C0W3J.LJI(str);
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
