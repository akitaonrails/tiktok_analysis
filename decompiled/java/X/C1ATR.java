package X;

import X.C830490Whz;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyInvisibleActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1ATR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ATR {
    public static volatile C1ATR LIZIZ;
    public final C830490Whz LIZ = new C830490Whz();

    public static C1ATR LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C1ATR.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1ATR();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static void LIZJ(C1072020e0G c1072020e0G) {
        Bundle bundle = c1072020e0G.LIZLLL;
        if (bundle == null) {
            bundle = new Bundle();
        }
        C786410Ut5.LJJJI("provider_id", c1072020e0G.LIZIZ, bundle);
        bundle.putInt("action_type", 1);
        if (c1072020e0G.LIZJ != null) {
            C21614219iO c21614219iOLIZ = C21614219iO.LIZ();
            String str = c1072020e0G.LIZIZ;
            InterfaceC21614319iP interfaceC21614319iP = c1072020e0G.LIZJ;
            synchronized (c21614219iOLIZ.LIZ) {
                try {
                    C0WIY c0wiy = new C0WIY(str, 1);
                    List list = (List) c21614219iOLIZ.LIZ.get(c0wiy);
                    if (list == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(interfaceC21614319iP);
                        c21614219iOLIZ.LIZ.put(c0wiy, arrayList);
                    } else if (!list.contains(interfaceC21614319iP)) {
                        list.add(interfaceC21614319iP);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Intent intent = new Intent(c1072020e0G.LIZ, (Class<?>) LobbyInvisibleActivity.class);
        intent.putExtras(bundle);
        C19EG c19eg = c1072020e0G.LIZ;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, c19eg);
        C2204961BRm.LLJJJJJIL(101, intent, c19eg, new C0WZX("dzBzEgAjS8/YVFkiQFyIaW1ZwJwkpjh//q8bhlow+mzVW/iHy09e4Jp7Xek=", null));
    }

    public static void LJ(InterfaceC21614319iP interfaceC21614319iP) {
        if (interfaceC21614319iP == null) {
            return;
        }
        C21614219iO c21614219iOLIZ = C21614219iO.LIZ();
        synchronized (c21614219iOLIZ.LIZ) {
            try {
                Iterator it2 = ((C830490Whz.a) c21614219iOLIZ.LIZ.entrySet()).iterator();
                while (true) {
                    C830520Wi2 c830520Wi2 = (C830520Wi2) it2;
                    if (c830520Wi2.hasNext()) {
                        c830520Wi2.next();
                        List list = (List) c830520Wi2.getValue();
                        if (list != null) {
                            list.remove(interfaceC21614319iP);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final synchronized C1AWO LIZ(String str) {
        LobbyCore.tryInitProviderConfig();
        C1AWO c1awo = (C1AWO) this.LIZ.get(str);
        if (c1awo != null) {
            c1awo.nB1();
            c1awo.init();
            return c1awo;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r5, java.util.List r6) {
        /*
            r4 = this;
            boolean r0 = X.C833690Wn9.LIZ
            r3 = 0
            if (r0 == 0) goto L1a
            if (r6 == 0) goto L23
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L1c
            r1 = 0
        Le:
            int r0 = r6.size()
            if (r1 >= r0) goto L1c
            com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r1)
            int r1 = r1 + 1
            goto Le
        L1a:
            if (r6 == 0) goto L23
        L1c:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L23
            r3 = 1
        L23:
            com.bytedance.lobby.internal.LobbyCore.tryInitProviderConfig()
            X.0Whz r0 = r4.LIZ
            java.util.Collection r0 = r0.values()
            X.0Whz$e r0 = (X.C830490Whz.e) r0
            java.util.Iterator r2 = r0.iterator()
        L32:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r1 = r2.next()
            X.1AWO r1 = (X.C1AWO) r1
            if (r3 == 0) goto L4c
            X.1EDr r0 = r1.getConfig()
            java.lang.String r0 = r0.LIZIZ
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L32
        L4c:
            r1.KY0(r5)
            goto L32
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ATR.LIZLLL(int, java.util.List):void");
    }
}
