package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Iv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481900Iv6 extends C09AY implements Function0<C481890Iv5> {
    public final /* synthetic */ C486390J5p LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C481900Iv6(C486390J5p c486390J5p) {
        super(0);
        this.LL = c486390J5p;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Iv5] */
    @Override // kotlin.jvm.functions.Function0
    public final C481890Iv5 invoke() {
        final C486390J5p c486390J5p = this.LL;
        return new InterfaceC481880Iv4() { // from class: X.0Iv5
            /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
            @Override // X.InterfaceC481880Iv4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C481790Iuv q(com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage r7) {
                /*
                    r6 = this;
                    java.lang.String r1 = r7.LL
                    X.0J5p r0 = r1
                    X.01GW r0 = r0.LLILLJJLI
                    java.lang.Object r0 = r0.getValue()
                    java.util.Map r0 = (java.util.Map) r0
                    java.lang.Object r0 = r0.get(r1)
                    java.util.Set r0 = (java.util.Set) r0
                    r4 = 0
                    if (r0 == 0) goto L32
                    java.util.Iterator r2 = r0.iterator()
                    r5 = r4
                L1a:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L33
                    java.lang.Object r0 = r2.next()
                    X.0Iv4 r0 = (X.InterfaceC481880Iv4) r0
                    X.0Iuv r1 = r0.q(r7)
                    if (r5 != 0) goto L1a
                    boolean r0 = r1.LIZ
                    if (r0 == 0) goto L1a
                    r5 = r1
                    goto L1a
                L32:
                    r5 = r4
                L33:
                    X.0J5p r0 = r1
                    X.01GW r0 = r0.LL
                    java.lang.Object r1 = r0.getValue()
                    java.util.Map r1 = (java.util.Map) r1
                    X.0J5p r0 = r1
                    X.0Iv7 r0 = r0.LLILLL
                    if (r0 == 0) goto L76
                    java.lang.String r0 = r0.LIZ
                L45:
                    java.lang.Object r0 = r1.get(r0)
                    java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
                    if (r0 == 0) goto L74
                    java.lang.Object r0 = r0.get()
                    X.0Iv4 r0 = (X.InterfaceC481880Iv4) r0
                    if (r0 == 0) goto L74
                    X.0Iuv r3 = r0.q(r7)
                L59:
                    r2 = 0
                    if (r5 != 0) goto L73
                    if (r3 == 0) goto L66
                    boolean r1 = r3.LIZ
                    r0 = 1
                    if (r1 != r0) goto L66
                    r5 = r3
                    if (r3 != 0) goto L73
                L66:
                    X.0Iuv r5 = new X.0Iuv
                    X.0J5p r0 = r1
                    X.0Iv7 r0 = r0.LLILLL
                    if (r0 == 0) goto L70
                    java.lang.String r4 = r0.LIZ
                L70:
                    r5.<init>(r2, r2, r4)
                L73:
                    return r5
                L74:
                    r3 = r4
                    goto L59
                L76:
                    r0 = r4
                    goto L45
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C481890Iv5.q(com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage):X.0Iuv");
            }
        };
    }
}
