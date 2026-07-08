package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0UjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C780470UjV {
    public final Context LIZ;
    public CharSequence LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    public final DialogC780480UjW LIZ() {
        DialogC780480UjW dialogC780480UjW = new DialogC780480UjW(this.LIZ);
        dialogC780480UjW.LLIZLLLIL = this.LIZIZ;
        dialogC780480UjW.setOnCancelListener(null);
        dialogC780480UjW.setOnDismissListener(null);
        dialogC780480UjW.setOnShowListener(null);
        dialogC780480UjW.setCancelable(this.LIZJ);
        dialogC780480UjW.setCanceledOnTouchOutside(this.LIZLLL);
        return dialogC780480UjW;
    }

    public C780470UjV(Context context) {
        this.LIZ = context;
    }
}
