package com.bytedance.android.live.liveinteract.multiguestv3.tool;

import X.C0UO0;
import X.C11JF;
import X.C19490011Na;
import X.C20441214yg;
import X.C2188811AlT;
import X.C915980Zwa;
import X.C918150a05;
import X.C920900a4W;
import X.C921180a4y;
import X.C938340aWe;
import X.C987100bnI;
import X.EnumC920860a4S;
import X.InterfaceC19483011Ki;
import Y.AfS178S0100000_9;
import Y.AfS184S0100000_15;
import com.bytedance.ies.sdk.datachannel.Event;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class NetworkStateTipsHelperManager {
    public final HashMap<String, C918150a05> LIZ = new HashMap<>();
    public final String LIZIZ;

    public static final class NetworkStateInfoEvent extends Event<C938340aWe> {
        public static final int $stable = 8;
    }

    public NetworkStateTipsHelperManager() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkStateTipsHelperManager");
        sbLIZ.append(hashCode());
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(int i, String str) {
        final C918150a05 c918150a05 = this.LIZ.get(str);
        if (c918150a05 == null) {
            c918150a05 = new C918150a05();
            this.LIZ.put(str, c918150a05);
        }
        boolean zLJFF = Intrinsics.LJFF(str, C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()));
        EnumC920860a4S enumC920860a4SLIZ = C920900a4W.LIZ(i);
        c918150a05.LJ = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c918150a05.LJFF);
        sbLIZ.append("_updateState networkState = ");
        sbLIZ.append(i);
        sbLIZ.append(" isSelf = ");
        sbLIZ.append(zLJFF);
        C20441214yg.LIZIZ("NetworkStateTips", C2188811AlT.LIZIZ(sbLIZ));
        if (zLJFF) {
            if (c918150a05.LIZLLL == null) {
                c918150a05.LIZLLL = (C11JF) C19490011Na.LIZJ(2L, TimeUnit.SECONDS).LJJLJLI(new AfS178S0100000_9(c918150a05, 53));
            }
            if (c918150a05.LIZJ == null) {
                c918150a05.LIZJ = (C11JF) C19490011Na.LIZ(60L, 60L, TimeUnit.SECONDS).LJJLJLI(new AfS178S0100000_9(c918150a05, 54));
            }
            if (enumC920860a4SLIZ != EnumC920860a4S.VERY_BAD && enumC920860a4SLIZ != EnumC920860a4S.BAD) {
                C11JF c11jf = c918150a05.LIZIZ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                c918150a05.LIZIZ = null;
                return;
            }
            if (c918150a05.LIZIZ != null) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c918150a05.LJFF);
            sbLIZ2.append("_updateState create toastDisposable");
            C20441214yg.LIZIZ("NetworkStateTips", C2188811AlT.LIZIZ(sbLIZ2));
            c918150a05.LIZIZ = (C11JF) C19490011Na.LIZ(8L, 8L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJIIZ(new C987100bnI(c918150a05, 14)).LJJIL(new InterfaceC19483011Ki() { // from class: X.0ZyQ
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    if (c918150a05.LIZ > 0 && (System.currentTimeMillis() - c918150a05.LIZ) / 1000 < 60) {
                        return false;
                    }
                    return true;
                }
            }).LJJLJLI(new AfS184S0100000_15(c918150a05, 133));
        }
    }
}
