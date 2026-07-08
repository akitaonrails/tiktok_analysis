package X;

import android.util.Log;

/* JADX INFO: renamed from: X.0Qgd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676770Qgd {
    public final String LIZ;
    public int LIZIZ;
    public final Throwable LIZJ;

    public /* synthetic */ C676770Qgd() {
        this("unknown error");
    }

    public C676770Qgd(Throwable th) {
        this(Log.getStackTraceString(th));
        this.LIZJ = th;
    }

    public C676770Qgd(String str) {
        this.LIZ = str;
        this.LIZIZ = -1;
    }
}
