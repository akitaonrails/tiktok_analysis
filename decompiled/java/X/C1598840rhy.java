package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rhy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598840rhy implements InterfaceC1597700rg8<InterfaceC1891350zJl>, InterfaceC1596890rep, InterfaceC1597500rfo {
    public volatile C1597440rfi LIZ;
    public volatile List<C1598860ri0> LIZJ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(3));
    public final C1597730rgB LJ = new C0NYY() { // from class: X.0rgB
        @Override // X.C0NYY
        public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            C595660NXw c595660NXw;
            boolean zLIZJ;
            C1597440rfi c1597440rfi = this.LL.LIZ;
            if (c1597440rfi == null) {
                return Unit.LIZ;
            }
            if (!c1597440rfi.LJIIIZ) {
                return Unit.LIZ;
            }
            List<C1598860ri0> list = this.LL.LIZJ;
            if (list == null) {
                return Unit.LIZ;
            }
            boolean z = false;
            for (C1598860ri0 c1598860ri0 : list) {
                String uid = c1598860ri0.LL.getUid();
                if (uid != null && (c595660NXw = map.get(uid)) != null && c1598860ri0.LLILLJJLI != (zLIZJ = C896480ZEw.LIZJ(c595660NXw))) {
                    c1598860ri0.LLILLJJLI = zLIZJ;
                    z = true;
                }
            }
            if (!z) {
                return Unit.LIZ;
            }
            Object objLIZIZ = c1597440rfi.LIZIZ(EnumC1597060rf6.ACTIVE_STATUS, new C1596730reZ(3, EnumC1597050rf5.REFRESH, null, Collections.singletonList(new C00X7(true)), 12), interfaceC1364105Vn);
            if (objLIZIZ == C099R.LJFF()) {
                return objLIZIZ;
            }
            return Unit.LIZ;
        }
    };

    @Override // X.InterfaceC1597500rfo
    public final void LIZ(SkylightListViewModel skylightListViewModel) {
        C897520ZIw c897520ZIw = (C897520ZIw) this.LIZLLL.getValue();
        if (c897520ZIw != null) {
            C2145008am.LIZ(c897520ZIw, skylightListViewModel);
        }
    }

    @Override // X.InterfaceC1596890rep
    public final void LIZIZ(C1597440rfi c1597440rfi) {
        this.LIZ = c1597440rfi;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    @Override // X.InterfaceC1597700rg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1596730reZ r16, X.InterfaceC1364105Vn<? super X.C1160260gIa<? extends X.InterfaceC1891350zJl>> r17) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598840rhy.LIZJ(X.0reZ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C897520ZIw r6, X.InterfaceC1364105Vn r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1598900ri4
            if (r0 == 0) goto L7c
            r4 = r7
            X.0ri4 r4 = (X.C1598900ri4) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L51
            if (r0 != r2) goto L91
            X.0ZId r6 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r1.iterator()
        L34:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0ri0 r0 = (X.C1598860ri0) r0
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r0.LL
            java.lang.String r0 = r0.getUid()
            boolean r0 = r4.add(r0)
            if (r0 == 0) goto L34
            r3.add(r1)
            goto L34
        L51:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.LIZIZ
            r1 = 0
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L64
            if (r6 == 0) goto L64
            X.0rgB r0 = r5.LJ
            r6.LIZIZ(r1, r0)
        L64:
            X.0rjL r0 = com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi r0 = X.C1599690rjL.LIZ()
            com.ss.android.ugc.aweme.im.sharepanel.impl.service.IMActiveContactsProvider r0 = r0.LIZLLL()
            r4.LL = r6
            r4.LLILZ = r2
            java.lang.Object r1 = r0.LIZ(r4)
            if (r1 != r3) goto L24
            return r3
        L7c:
            X.0ri4 r4 = new X.0ri4
            r4.<init>(r5, r7)
            goto L12
        L82:
            if (r6 == 0) goto L90
            r0 = 4
            kotlin.jvm.internal.AFwS259S0000000_21 r0 = kotlin.jvm.internal.AFwS259S0000000_21.get$arr$(r0)
            java.util.List r0 = X.C0O26.LIZIZ(r3, r0)
            r6.LJIIIIZZ(r0)
        L90:
            return r3
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598840rhy.LJ(X.0ZIw, X.05Vn):java.lang.Object");
    }
}
