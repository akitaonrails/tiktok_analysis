package X;

/* JADX INFO: renamed from: X.1DcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259671DcT implements InterfaceC846210XHn, Cloneable {
    public final String LL;
    public final String LLILLJJLI;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    @Override // X.InterfaceC846210XHn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC846220XHo[] getElements() {
        /*
            r10 = this;
            java.lang.String r1 = r10.LLILLJJLI
            r6 = 0
            if (r1 == 0) goto La0
            X.1DcQ r5 = new X.1DcQ
            int r0 = r1.length()
            r5.<init>(r0)
            r5.LIZIZ(r1)
            X.1DcR r4 = new X.1DcR
            int r0 = r1.length()
            r4.<init>(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1f:
            int r1 = r4.LIZIZ
            int r0 = r4.LIZ
            if (r1 < r0) goto L32
            int r0 = r3.size()
            X.0XHo[] r0 = new X.InterfaceC846220XHo[r0]
            java.lang.Object[] r0 = r3.toArray(r0)
            X.0XHo[] r0 = (X.InterfaceC846220XHo[]) r0
            return r0
        L32:
            X.1DcV r2 = X.C2259661DcS.LIZ(r5, r4)
            int r9 = r4.LIZIZ
            int r7 = r4.LIZ
            if (r9 >= r7) goto L55
            int r1 = r9 + (-1)
            char[] r0 = r5.LIZ
            char r0 = r0[r1]
            r8 = 44
            if (r0 == r8) goto L55
        L46:
            if (r9 >= r7) goto L57
            char[] r0 = r5.LIZ
            char r0 = r0[r9]
            boolean r0 = X.C2259711DcX.LIZ(r0)
            if (r0 == 0) goto L57
            int r9 = r9 + 1
            goto L46
        L55:
            r0 = 0
            goto L62
        L57:
            r4.LIZ(r9)
            int r1 = r4.LIZIZ
            int r0 = r4.LIZ
            if (r1 < r0) goto L77
            X.08NY[] r0 = new X.C08NY[r6]
        L62:
            java.lang.String r7 = r2.LL
            java.lang.String r2 = r2.LLILLJJLI
            X.1DcU r1 = new X.1DcU
            r1.<init>(r7, r2, r0)
            int r0 = r7.length()
            if (r0 != 0) goto L73
            if (r2 == 0) goto L1f
        L73:
            r3.add(r1)
            goto L1f
        L77:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L7c:
            int r1 = r4.LIZIZ
            int r0 = r4.LIZ
            if (r1 >= r0) goto L93
            X.1DcV r0 = X.C2259661DcS.LIZ(r5, r4)
            r7.add(r0)
            int r0 = r4.LIZIZ
            int r1 = r0 + (-1)
            char[] r0 = r5.LIZ
            char r0 = r0[r1]
            if (r0 != r8) goto L7c
        L93:
            int r0 = r7.size()
            X.08NY[] r0 = new X.C08NY[r0]
            java.lang.Object[] r0 = r7.toArray(r0)
            X.08NY[] r0 = (X.C08NY[]) r0
            goto L62
        La0:
            X.0XHo[] r0 = new X.InterfaceC846220XHo[r6]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2259671DcT.getElements():X.0XHo[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        C2259641DcQ c2259641DcQ;
        if (this instanceof InterfaceC2259701DcW) {
            c2259641DcQ = ((InterfaceC2259701DcW) this).LJIIIZ();
        } else {
            c2259641DcQ = new C2259641DcQ(64);
            String name = getName();
            String value = getValue();
            int length = name.length() + 2;
            if (value != null) {
                length += value.length();
            }
            int length2 = c2259641DcQ.LIZ.length;
            int i = c2259641DcQ.LIZIZ;
            if (length > length2 - i) {
                c2259641DcQ.LIZJ(i + length);
            }
            c2259641DcQ.LIZIZ(name);
            c2259641DcQ.LIZIZ(": ");
            if (value != null) {
                c2259641DcQ.LIZIZ(value);
            }
        }
        return c2259641DcQ.toString();
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // X.InterfaceC846210XHn
    public final String getName() {
        return this.LL;
    }

    @Override // X.InterfaceC846210XHn
    public final String getValue() {
        return this.LLILLJJLI;
    }

    public C2259671DcT(String str, String str2) {
        if (str != null) {
            this.LL = str;
            this.LLILLJJLI = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
