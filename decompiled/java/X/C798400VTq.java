package X;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0VTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798400VTq {
    public static long LIZ;
    public static final int LIZIZ;
    public static final C798360VTm LIZJ;
    public static float LIZLLL;
    public static final AtomicBoolean LJ;

    static {
        int iMyPid = Process.myPid();
        LIZIZ = iMyPid;
        LIZJ = new C798360VTm(false, new int[]{iMyPid}, 23);
        LIZLLL = -1.0f;
        LJ = new AtomicBoolean(false);
    }
}
