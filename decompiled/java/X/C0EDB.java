package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EDB, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EDB {
    public final boolean LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final String LJ;
    public EnumC361080EDq LJFF;
    public int LJI;

    public C0EDB(int i) {
        boolean z;
        int i2;
        int i3;
        String str;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            i2 = 12;
        } else {
            i2 = 0;
        }
        int i4 = (i & 4) == 0 ? 0 : 12;
        if ((i & 8) != 0) {
            i3 = R.drawable.bpe;
        } else {
            i3 = 0;
        }
        if ((i & 16) != 0) {
            str = "lark_loading_icon.json";
        } else {
            str = null;
        }
        EnumC361080EDq enumC361080EDq = (i & 32) != 0 ? EnumC361080EDq.RIGHT_TOP : null;
        int i5 = (i & 64) != 0 ? 3 : 0;
        this.LIZ = z;
        this.LIZIZ = i2;
        this.LIZJ = i4;
        this.LIZLLL = i3;
        this.LJ = str;
        this.LJFF = enumC361080EDq;
        this.LJI = i5;
    }
}
