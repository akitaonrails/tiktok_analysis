package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0IUF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0IUF {
    public volatile boolean LIZIZ;
    public C0IUH LIZ = C0IUH.IDLE;
    public final C0IUG LIZJ = new C0IUI() { // from class: X.0IUG
        @Override // X.C0IUI
        public final C0IUH LIZ() {
            return this.LIZ.LIZ;
        }

        @Override // X.C0IUI
        public final C0IV2 LIZIZ() {
            return this.LIZ.LIZ();
        }
    };

    public abstract C0IV2 LIZ();

    public final void LIZLLL() {
        this.LIZ = C0IUH.RUNNING;
        C0IT6 c0it6 = C0IT6.LIZ;
        C0IUG c0iug = this.LIZJ;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C0IT6.LJFF;
        if (copyOnWriteArrayList.contains(c0iug)) {
            return;
        }
        copyOnWriteArrayList.add(c0iug);
    }

    public final void LJ() {
        this.LIZ = C0IUH.IDLE;
        C0IT6 c0it6 = C0IT6.LIZ;
        C0IUG c0iug = this.LIZJ;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C0IT6.LJFF;
        if (copyOnWriteArrayList.contains(c0iug)) {
            copyOnWriteArrayList.remove(c0iug);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C0ITP r12) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IUF.LIZIZ(X.0ITP):void");
    }

    public final void LIZJ(boolean z) {
        C0IUH c0iuh;
        this.LIZIZ = z;
        if (z) {
            c0iuh = C0IUH.FETCHING;
        } else {
            c0iuh = C0IUH.RUNNING;
        }
        this.LIZ = c0iuh;
    }
}
