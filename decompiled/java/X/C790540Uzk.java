package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: X.0Uzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790540Uzk {
    public static C790540Uzk LJ;
    public String LIZ;
    public Boolean LIZIZ;
    public Boolean LIZJ;
    public final Queue<Intent> LIZLLL = new ArrayDeque();

    public static synchronized C790540Uzk LIZ() {
        if (LJ == null) {
            LJ = new C790540Uzk();
        }
        return LJ;
    }

    public final boolean LIZIZ(Context context) {
        boolean z;
        if (this.LIZJ == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.LIZJ = Boolean.valueOf(z);
        }
        this.LIZIZ.booleanValue();
        return this.LIZJ.booleanValue();
    }

    public final boolean LIZJ(Context context) {
        boolean z;
        if (this.LIZIZ == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.LIZIZ = Boolean.valueOf(z);
        }
        this.LIZIZ.booleanValue();
        return this.LIZIZ.booleanValue();
    }
}
