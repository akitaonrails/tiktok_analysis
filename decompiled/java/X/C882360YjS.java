package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YjS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882360YjS {
    public final InterfaceC1755906uD LIZ;
    public C882380YjU LIZIZ;

    public C882360YjS(InterfaceC1755906uD interfaceC1755906uD) {
        this.LIZ = interfaceC1755906uD;
    }

    public final void LIZ(C869590Y9l c869590Y9l) {
        String uuid;
        String uuid2;
        if (!this.LIZ.LJJJJI()) {
            if (c869590Y9l != null) {
                uuid = c869590Y9l.getUuid();
            } else {
                uuid = null;
            }
            C869590Y9l c869590Y9lLJIILJJIL = this.LIZ.LJIILJJIL();
            if (c869590Y9lLJIILJJIL != null) {
                uuid2 = c869590Y9lLJIILJJIL.getUuid();
            } else {
                uuid2 = null;
            }
            if (!Intrinsics.LJFF(uuid, uuid2)) {
                this.LIZIZ = null;
                return;
            }
        }
        if (c869590Y9l == null) {
            this.LIZIZ = null;
            return;
        }
        C882380YjU c882380YjU = this.LIZIZ;
        if (c882380YjU == null || !Intrinsics.LJFF(c869590Y9l.getUuid(), c882380YjU.LIZ.LIZ)) {
            this.LIZIZ = new C882380YjU(new C882370YjT(c869590Y9l), 0);
        }
    }

    public final void LIZIZ(int i) {
        C882380YjU c882380YjU = this.LIZIZ;
        if (c882380YjU == null || i < c882380YjU.LIZIZ) {
            return;
        }
        this.LIZIZ = new C882380YjU(c882380YjU.LIZ, i);
    }
}
