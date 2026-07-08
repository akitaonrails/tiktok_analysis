package X;

/* JADX INFO: renamed from: X.12zM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19935812zM {
    public final AnonymousClass1301 LIZ;
    public final InterfaceC19933712z1[] LIZIZ;
    public String[] LIZJ;
    public final InterfaceC19934212z6[] LIZLLL;
    public volatile boolean LJ = false;

    public final InterfaceC19933712z1 LIZIZ(C19939112zt c19939112zt) {
        if (c19939112zt.LLJIJIL == this.LIZ) {
            if (!c19939112zt.LJJIII()) {
                return this.LIZIZ[c19939112zt.LLILLJJLI];
            }
            throw new IllegalArgumentException("This type does not have extensions.");
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    public final InterfaceC19934212z6 LIZJ(C19939212zu c19939212zu) {
        if (c19939212zu.LLILZIL == this.LIZ) {
            return this.LIZLLL[c19939212zu.LLILLJJLI];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    public C19935812zM(AnonymousClass1301 anonymousClass1301, String[] strArr) {
        this.LIZ = anonymousClass1301;
        this.LIZJ = strArr;
        this.LIZIZ = new InterfaceC19933712z1[anonymousClass1301.LLIZLLLIL.length];
        this.LIZLLL = new InterfaceC19934212z6[anonymousClass1301.LLJIJIL.length];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final java.lang.Class r13, final java.lang.Class r14) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19935812zM.LIZ(java.lang.Class, java.lang.Class):void");
    }
}
