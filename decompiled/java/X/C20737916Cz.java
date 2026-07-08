package X;

/* JADX INFO: renamed from: X.16Cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20737916Cz {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(X.C16D0 r5, java.nio.channels.ByteChannel r6) {
        /*
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r5.LLILLJJLI
            java.util.concurrent.LinkedBlockingQueue r0 = (java.util.concurrent.LinkedBlockingQueue) r0
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r4 = 0
            if (r0 != 0) goto L56
            boolean r0 = r6 instanceof X.InterfaceC20737516Cv
            if (r0 == 0) goto L73
            r3 = r6
            X.16Cv r3 = (X.InterfaceC20737516Cv) r3
            boolean r0 = r3.LJJIJL()
            if (r0 == 0) goto L1d
            r3.LJLLL()
        L1d:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r5.LLILLJJLI
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4a
            boolean r0 = r5.LLIZLLLIL
            if (r0 == 0) goto L4a
            X.16D2 r0 = r5.LLJIJIL
            if (r0 == 0) goto L4a
            X.11a3 r1 = r0.LIZ
            if (r1 == 0) goto L4a
            X.11a3 r0 = X.EnumC19524111a3.SERVER
            if (r1 != r0) goto L4a
            java.lang.Boolean r0 = r5.LLJJIII
            if (r0 == 0) goto L75
            java.lang.Integer r0 = r5.LLJJI
            int r2 = r0.intValue()
            java.lang.String r1 = r5.LLJJ
            java.lang.Boolean r0 = r5.LLJJIII
            boolean r0 = r0.booleanValue()
            r5.LJ(r2, r1, r0)
        L4a:
            if (r3 == 0) goto L54
            X.16Cv r6 = (X.InterfaceC20737516Cv) r6
            boolean r0 = r6.LJJIJL()
            if (r0 != 0) goto L55
        L54:
            r4 = 1
        L55:
            return r4
        L56:
            r6.write(r0)
            int r0 = r0.remaining()
            if (r0 <= 0) goto L60
            return r4
        L60:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r5.LLILLJJLI
            java.util.concurrent.LinkedBlockingQueue r0 = (java.util.concurrent.LinkedBlockingQueue) r0
            r0.poll()
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r5.LLILLJJLI
            java.util.concurrent.LinkedBlockingQueue r0 = (java.util.concurrent.LinkedBlockingQueue) r0
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            if (r0 != 0) goto L56
        L73:
            r3 = 0
            goto L1d
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "this method must be used in conjunction with flushAndClose"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20737916Cz.LIZ(X.16D0, java.nio.channels.ByteChannel):boolean");
    }
}
