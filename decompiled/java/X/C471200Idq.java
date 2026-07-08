package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Idq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C471200Idq extends C2217421BqW implements Function1<C469770IbX, C0IYZ> {
    public C471200Idq(Object obj) {
        super(1, obj, C471280Idy.class, "createAdapterProvider", "createAdapterProvider(Lcom/bytedance/android/feed/api/DrawerExtraData;)Lcom/bytedance/android/livesdk/feed/drawerfeed/base/BaseDrawerFeedLiveAdapterProvider;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0IYZ invoke(C469770IbX c469770IbX) {
        final C469770IbX c469770IbX2 = c469770IbX;
        this.receiver.getClass();
        return new C0IYZ(c469770IbX2) { // from class: X.0IYN
            @Override // X.C0IYZ
            public final InterfaceC468510IYv LIZJ() {
                return new InterfaceC468510IYv() { // from class: X.0IYM
                    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
                    @Override // X.InterfaceC468510IYv
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.AbstractC468490IYt LIZ(android.view.ViewGroup r10, java.lang.Object[] r11) {
                        /*
                            r9 = this;
                            r7 = r10
                            android.content.Context r0 = r7.getContext()
                            android.view.LayoutInflater r1 = X.C786410Ut5.ne(r0)
                            r0 = 2131568374(0x7f0d26f6, float:1.8762344E38)
                            r2 = 0
                            android.view.View r3 = X.C786410Ut5.Td(r1, r0, r7, r2)
                            int r0 = r11.length
                            r1 = 1
                            if (r0 != 0) goto L53
                            r0 = 1
                        L16:
                            r0 = r0 ^ 1
                            r6 = 0
                            if (r0 == 0) goto L51
                            r4 = r11[r2]
                            boolean r0 = r4 instanceof java.lang.String
                            if (r0 == 0) goto L51
                            java.lang.String r4 = (java.lang.String) r4
                        L23:
                            int r0 = r11.length
                            if (r0 <= r1) goto L4f
                            r5 = r11[r1]
                            boolean r0 = r5 instanceof X.C11RK
                            if (r0 == 0) goto L4f
                            boolean r0 = r5 instanceof X.C11RK
                            if (r0 == 0) goto L4d
                            X.11RK r5 = (X.C11RK) r5
                        L32:
                            int r1 = r11.length
                            r0 = 4
                            if (r1 <= r0) goto L43
                            r1 = r11[r0]
                            boolean r0 = r1 instanceof X.C11RK
                            if (r0 == 0) goto L43
                            boolean r0 = r1 instanceof X.C11RK
                            if (r0 == 0) goto L43
                            r6 = r1
                            X.11RK r6 = (X.C11RK) r6
                        L43:
                            X.0IY6 r2 = new X.0IY6
                            X.0IYN r0 = r9.LIZ
                            X.0IbX r8 = r0.LIZ
                            r2.<init>(r3, r4, r5, r6, r7, r8)
                            return r2
                        L4d:
                            r5 = r6
                            goto L32
                        L4f:
                            r5 = r6
                            goto L32
                        L51:
                            r4 = r6
                            goto L23
                        L53:
                            r0 = 0
                            goto L16
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0IYM.LIZ(android.view.ViewGroup, java.lang.Object[]):X.0IYt");
                    }
                };
            }

            @Override // X.C0IYZ
            public final InterfaceC468510IYv LIZLLL() {
                return new InterfaceC468510IYv() { // from class: X.0IYO
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
                    @Override // X.InterfaceC468510IYv
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.AbstractC468490IYt LIZ(android.view.ViewGroup r9, java.lang.Object[] r10) {
                        /*
                            r8 = this;
                            r3 = r9
                            android.content.Context r0 = r3.getContext()
                            android.view.LayoutInflater r2 = X.C786410Ut5.ne(r0)
                            r1 = 2131569760(0x7f0d2c60, float:1.8765156E38)
                            r0 = 0
                            android.view.View r4 = X.C786410Ut5.Td(r2, r1, r3, r0)
                            int r2 = r10.length
                            r1 = 0
                            r0 = 4
                            if (r2 <= r0) goto L35
                            r5 = r10[r0]
                            boolean r0 = r5 instanceof X.C11RK
                            if (r0 == 0) goto L35
                            X.11RK r5 = (X.C11RK) r5
                        L1e:
                            r0 = 6
                            java.lang.Object r6 = X.C13LQ.LJJIIZ(r0, r10)
                            boolean r0 = r6 instanceof java.util.concurrent.atomic.AtomicBoolean
                            if (r0 == 0) goto L33
                            java.util.concurrent.atomic.AtomicBoolean r6 = (java.util.concurrent.atomic.AtomicBoolean) r6
                        L29:
                            X.0IYe r2 = new X.0IYe
                            X.0IYN r0 = r8.LIZ
                            X.0IbX r7 = r0.LIZ
                            r2.<init>(r3, r4, r5, r6, r7)
                            return r2
                        L33:
                            r6 = r1
                            goto L29
                        L35:
                            r5 = r1
                            goto L1e
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0IYO.LIZ(android.view.ViewGroup, java.lang.Object[]):X.0IYt");
                    }
                };
            }
        };
    }
}
