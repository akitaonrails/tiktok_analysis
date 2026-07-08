package X;

import com.bytedance.im.core.proto.Participant;

/* JADX INFO: renamed from: X.0Y4U, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y4U {
    public final C0YEM LIZ;

    public C0Y4U(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    public final Participant LIZ(long j, long j2) {
        int i;
        C0Y8Z c0y8z = new C0Y8Z();
        c0y8z.LIZLLL = Long.valueOf(j);
        c0y8z.LJ = Long.valueOf(j2);
        if (this.LIZ.getUid() == j) {
            i = 1;
        } else {
            i = 0;
        }
        c0y8z.LJFF = Integer.valueOf(i);
        return c0y8z.build();
    }
}
