package X;

import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Idp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C471190Idp extends C2217421BqW implements Function1<C469770IbX, C0IYZ> {
    public C471190Idp(Object obj) {
        super(1, obj, C471270Idx.class, "createAdapterProvider", "createAdapterProvider(Lcom/bytedance/android/feed/api/DrawerExtraData;)Lcom/bytedance/android/livesdk/feed/drawerfeed/base/BaseDrawerFeedLiveAdapterProvider;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0IYZ invoke(C469770IbX c469770IbX) {
        final C469770IbX c469770IbX2 = c469770IbX;
        this.receiver.getClass();
        return new C0IYZ(c469770IbX2) { // from class: X.0IYX
            @Override // X.C0IYZ
            public final Map<Integer, InterfaceC468510IYv> LIZIZ() {
                HashMap map = new HashMap();
                Integer numValueOf = Integer.valueOf(R.layout.gdw);
                C469770IbX c469770IbX3 = this.LIZ;
                final String str = c469770IbX3 != null ? c469770IbX3.LIZ : null;
                map.put(numValueOf, new InterfaceC468510IYv() { // from class: X.0IYb
                    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
                    @Override // X.InterfaceC468510IYv
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.AbstractC468490IYt LIZ(android.view.ViewGroup r5, java.lang.Object[] r6) {
                        /*
                            r4 = this;
                            android.content.Context r0 = r5.getContext()
                            android.view.LayoutInflater r2 = X.C786410Ut5.ne(r0)
                            r1 = 2131567913(0x7f0d2529, float:1.876141E38)
                            r0 = 0
                            android.view.View r3 = X.C786410Ut5.Td(r2, r1, r5, r0)
                            int r1 = r6.length
                            r0 = 5
                            if (r1 <= r0) goto L28
                            r2 = r6[r0]
                            boolean r0 = r2 instanceof X.C11RK
                            if (r0 == 0) goto L28
                            X.11RK r2 = (X.C11RK) r2
                        L1c:
                            X.0Ie5 r1 = new X.0Ie5
                            java.lang.String r0 = r1
                            if (r0 != 0) goto L24
                            java.lang.String r0 = ""
                        L24:
                            r1.<init>(r3, r2, r0)
                            return r1
                        L28:
                            r2 = 0
                            goto L1c
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C468310IYb.LIZ(android.view.ViewGroup, java.lang.Object[]):X.0IYt");
                    }
                });
                return map;
            }

            @Override // X.C0IYZ
            public final InterfaceC468510IYv LIZJ() {
                return new InterfaceC468510IYv() { // from class: X.0IYT
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
                            X.0IY3 r2 = new X.0IY3
                            X.0IYX r0 = r9.LIZ
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
                        throw new UnsupportedOperationException("Method not decompiled: X.C0IYT.LIZ(android.view.ViewGroup, java.lang.Object[]):X.0IYt");
                    }
                };
            }

            @Override // X.C0IYZ
            public final InterfaceC468510IYv LIZLLL() {
                C469770IbX c469770IbX3 = this.LIZ;
                return Intrinsics.LJFF("following", c469770IbX3 != null ? c469770IbX3.LIZ : null) ? new InterfaceC468510IYv() { // from class: X.0IYY
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
                    @Override // X.InterfaceC468510IYv
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.AbstractC468490IYt LIZ(android.view.ViewGroup r5, java.lang.Object[] r6) {
                        /*
                            r4 = this;
                            android.content.Context r0 = r5.getContext()
                            android.view.LayoutInflater r2 = X.C786410Ut5.ne(r0)
                            r1 = 2131569760(0x7f0d2c60, float:1.8765156E38)
                            r0 = 0
                            android.view.View r3 = X.C786410Ut5.Td(r2, r1, r5, r0)
                            int r1 = r6.length
                            r0 = 4
                            if (r1 <= r0) goto L26
                            r2 = r6[r0]
                            boolean r0 = r2 instanceof X.C11RK
                            if (r0 == 0) goto L26
                            X.11RK r2 = (X.C11RK) r2
                        L1c:
                            X.0IYc r1 = new X.0IYc
                            X.0IYX r0 = r4.LIZ
                            X.0IbX r0 = r0.LIZ
                            r1.<init>(r3, r2, r0)
                            return r1
                        L26:
                            r2 = 0
                            goto L1c
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0IYY.LIZ(android.view.ViewGroup, java.lang.Object[]):X.0IYt");
                    }
                } : new C468300IYa(this);
            }
        };
    }
}
