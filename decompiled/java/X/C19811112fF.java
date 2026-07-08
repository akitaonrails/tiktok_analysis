package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.12fF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19811112fF {
    public final String LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public final /* synthetic */ C19804812eE LIZLLL;

    public final String LIZ() {
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            this.LIZJ = this.LIZLLL.LJIIZILJ().getString(this.LIZ, null);
        }
        return this.LIZJ;
    }

    public final void LIZIZ(String str) {
        SharedPreferences.Editor editorEdit = this.LIZLLL.LJIIZILJ().edit();
        editorEdit.putString(this.LIZ, str);
        editorEdit.apply();
        this.LIZJ = str;
    }

    public C19811112fF(C19804812eE c19804812eE, String str) {
        this.LIZLLL = c19804812eE;
        C0W3J.LJI(str);
        this.LIZ = str;
    }
}
