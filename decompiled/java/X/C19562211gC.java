package X;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11gC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19562211gC {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final DialogInterface.OnClickListener LJFF;
    public final DialogInterface.OnClickListener LJI;

    public final void LIZ() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.LIZ);
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            builder.setTitle(this.LIZIZ);
        }
        if (!TextUtils.isEmpty(this.LIZJ)) {
            builder.setMessage(this.LIZJ);
        }
        builder.setPositiveButton(this.LIZLLL, new C12YK(this, 2));
        if (!TextUtils.isEmpty(this.LJ)) {
            builder.setNegativeButton(this.LJ, new C12YK(this, 3));
        }
        try {
            C786410Ut5.B4(builder.create());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C19562211gC(C1625650sPD c1625650sPD) {
        this.LIZ = c1625650sPD.LJI;
        this.LIZIZ = c1625650sPD.LIZ;
        this.LIZJ = c1625650sPD.LIZIZ;
        this.LJ = c1625650sPD.LIZLLL;
        this.LIZLLL = c1625650sPD.LIZJ;
        this.LJFF = c1625650sPD.LJ;
        this.LJI = c1625650sPD.LJFF;
    }
}
