package X;

import com.bytedance.im.core.proto.NewMessageNotify;

/* JADX INFO: renamed from: X.0YKK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YKK {
    public final NewMessageNotify LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final long LJFF;

    public static C0YKK LIZ(C0YKK c0ykk, long j, long j2, int i) {
        NewMessageNotify newMessageNotify;
        long j3;
        String str;
        long j4 = j2;
        long j5 = j;
        String str2 = null;
        if ((i & 1) != 0) {
            newMessageNotify = c0ykk.LIZ;
        } else {
            newMessageNotify = null;
        }
        if ((i & 2) != 0) {
            j3 = c0ykk.LIZIZ;
        } else {
            j3 = 0;
        }
        if ((i & 4) != 0) {
            str = c0ykk.LIZJ;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = c0ykk.LIZLLL;
        }
        if ((i & 16) != 0) {
            j5 = c0ykk.LJ;
        }
        if ((i & 32) != 0) {
            j4 = c0ykk.LJFF;
        }
        c0ykk.getClass();
        return new C0YKK(newMessageNotify, j3, str, str2, j5, j4);
    }

    public C0YKK(NewMessageNotify newMessageNotify, long j, String str, String str2, long j2, long j3) {
        this.LIZ = newMessageNotify;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = j2;
        this.LJFF = j3;
    }
}
