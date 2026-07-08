package X;

import com.bytedance.im.core.proto.Request;

/* JADX INFO: renamed from: X.0YCX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YCX extends AbstractC864770XwB {
    public final Request LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public int LJ;
    public long LJFF;
    public boolean LJI;
    public boolean LJII;
    public final long LJIIIIZZ;

    public C0YCX(Request request, int i, int i2, long j, int i3) {
        boolean z;
        i = (i3 & 2) != 0 ? -1 : i;
        i2 = (i3 & 4) != 0 ? -1 : i2;
        if ((i3 & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        j = (i3 & 256) != 0 ? 0L : j;
        this.LIZ = request;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJFF = 0L;
        this.LJI = false;
        this.LJII = z;
        this.LJIIIIZZ = j;
    }
}
