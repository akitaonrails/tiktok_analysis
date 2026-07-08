package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z6N, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z6N {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZJ() {
        /*
            X.01GW r4 = X.C262880ARy.LIZ
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r3 = 0
            r2 = 2
            r0 = 1
            if (r1 == r0) goto L2d
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r2) goto L2d
            boolean r0 = X.C0XF5.LIZIZ()
            if (r0 == 0) goto L2c
            X.0Vh4 r0 = X.C036E.LIZ
            X.0O0L r1 = r0.LIZJ
            X.0O0L r0 = X.C0O0L.AVAILABLE
            if (r1 != r0) goto L2c
            r3 = 1
        L2c:
            return r3
        L2d:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.network.spi.INetworkLevelService> r0 = com.ss.android.ugc.aweme.network.spi.INetworkLevelService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.network.spi.INetworkLevelService r0 = (com.ss.android.ugc.aweme.network.spi.INetworkLevelService) r0
            X.0mpO r0 = r0.getNqeNetworkLevel()
            X.0tKk r0 = r0.LIZ
            int[] r1 = X.C1661330tKl.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L5d;
                case 2: goto L5d;
                case 3: goto L50;
                case 4: goto L5c;
                case 5: goto L6b;
                case 6: goto L6b;
                case 7: goto L6b;
                default: goto L4a;
            }
        L4a:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L50:
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r2) goto L6b
        L5c:
            return r3
        L5d:
            boolean r0 = X.C0XF5.LIZIZ()
            if (r0 == 0) goto L5c
            X.0Vh4 r0 = X.C036E.LIZ
            X.0O0L r1 = r0.LIZJ
            X.0O0L r0 = X.C0O0L.AVAILABLE
            if (r1 != r0) goto L5c
        L6b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z6N.LIZJ():boolean");
    }

    public static final void LIZ(Function0<Unit> function0) {
        if (!((Boolean) C0AS4.LIZ.getValue()).booleanValue()) {
            function0.invoke();
        } else {
            LIZIZ(function0, false);
        }
    }

    public static final boolean LIZIZ(final Function0 function0, boolean z) {
        if (LIZJ()) {
            C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[CheckNetState]net available, call directly, callWhenNetworkAvailable=");
            sbLIZ.append(z);
            c1437510nVlLJJLIIIJ.LIZ("CheckNetState", C2188811AlT.LIZIZ(sbLIZ));
            if (!z) {
                function0.invoke();
            }
            return false;
        }
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("CheckNetState", "[CheckNetState]net not available, hold");
        C01GW c01gw = C262880ARy.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 1 && ((Number) c01gw.getValue()).intValue() != 2) {
            C036E.LIZ.LIZ(new C0H62() { // from class: X.0Z6L
                @Override // X.C0H62
                public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                    C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[CheckNetState]onNetworkChange: ");
                    sbLIZ2.append(c0o0l2);
                    c1437510nVlLJJLIIIJ2.LIZ("CheckNetState", C2188811AlT.LIZIZ(sbLIZ2));
                    if (c0o0l2 == C0O0L.AVAILABLE) {
                        C036E.LIZ.LIZLLL(this);
                        function0.invoke();
                    }
                }
            });
            return true;
        }
        ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).observerNetworkChange(new C0CSC() { // from class: X.0Z6M
            @Override // X.C0CSC
            public final void LIZ(EnumC325100Com enumC325100Com) {
                C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[CheckNetState]onNetworkChange: ");
                sbLIZ2.append(enumC325100Com);
                c1437510nVlLJJLIIIJ2.LIZ("CheckNetState", C2188811AlT.LIZIZ(sbLIZ2));
                if (C0Z6N.LIZJ()) {
                    function0.invoke();
                    ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).removeNetworkChangeObserver(this);
                }
            }
        });
        return true;
    }
}
