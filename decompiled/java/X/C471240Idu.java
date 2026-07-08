package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Idu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C471240Idu extends C2217421BqW implements Function1<C469770IbX, C0IYZ> {
    public C471240Idu(Object obj) {
        super(1, obj, C471290Idz.class, "createAdapterProvider", "createAdapterProvider(Lcom/bytedance/android/feed/api/DrawerExtraData;)Lcom/bytedance/android/livesdk/feed/drawerfeed/base/BaseDrawerFeedLiveAdapterProvider;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0IYZ invoke(C469770IbX c469770IbX) {
        this.receiver.getClass();
        return new C0IYZ() { // from class: X.0IYL
            @Override // X.C0IYZ
            public final InterfaceC468510IYv LIZJ() {
                return new InterfaceC468510IYv() { // from class: X.0IYK
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
                            X.0IY9 r2 = new X.0IY9
                            X.0IYL r0 = r9.LIZ
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
                        throw new UnsupportedOperationException("Method not decompiled: X.C0IYK.LIZ(android.view.ViewGroup, java.lang.Object[]):X.0IYt");
                    }
                };
            }
        };
    }
}
