package Y;

import X.C09JN;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C470590Icr;
import X.C918230a0D;
import X.C918350a0P;
import X.C918650a0t;
import X.C957560b1e;
import X.C957590b1h;
import X.C974540bT2;
import X.C976520bWE;
import X.C977590bXx;
import X.C977620bY0;
import X.C977630bY1;
import X.C977720bYA;
import X.C977730bYB;
import X.C977770bYF;
import X.EnumC918860a1E;
import X.EnumC919170a1j;
import X.EnumC976510bWD;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvite4004049FixSetting;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class AfS0S0310100_15 implements C09JN {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0310100_15 afS0S0310100_15, Object obj) {
        C1C7U.LIZ("TeamMatchInviterViewModel@38a2.requestCancelApi$dispose$1");
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        C976520bWE c976520bWE = EnumC976510bWD.Companion;
        EnumC976510bWD enumC976510bWD = (EnumC976510bWD) afS0S0310100_15.l0;
        c976520bWE.getClass();
        c974540bT2.LJJJLIIL(C976520bWE.LIZ(enumC976510bWD), (C470590Icr) obj, afS0S0310100_15.z3, (EnumC919170a1j) afS0S0310100_15.l1);
        if (LiveMatchInvite4004049FixSetting.INSTANCE.isEnable()) {
            C977590bXx c977590bXx = (C977590bXx) afS0S0310100_15.l2;
            if (c977590bXx.LJIJI == afS0S0310100_15.j4) {
                c977590bXx.LJIJI = 0L;
            }
        }
        C977590bXx c977590bXx2 = (C977590bXx) afS0S0310100_15.l2;
        if (!c977590bXx2.LJIJJLI) {
            c977590bXx2.LJIIZILJ.setValue(C977720bYA.LIZ(new C977720bYA(null, null, null, null), null, null, (EnumC976510bWD) afS0S0310100_15.l0, null, 11));
        }
        C1C7U.LIZIZ("TeamMatchInviterViewModel@38a2.requestCancelApi$dispose$1");
    }

    public static final void accept$1(AfS0S0310100_15 afS0S0310100_15, Object obj) {
        Function0<Unit> function0;
        C1C7U.LIZ("CombinedMatchInviterViewModel@5274.requestCancelApi$dispose$1");
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        C976520bWE c976520bWE = EnumC976510bWD.Companion;
        EnumC976510bWD enumC976510bWD = (EnumC976510bWD) afS0S0310100_15.l0;
        c976520bWE.getClass();
        c974540bT2.LJJJLIIL(C976520bWE.LIZ(enumC976510bWD), (C470590Icr) obj, afS0S0310100_15.z3, EnumC919170a1j.MATCH_TYPE_1V1);
        ((C977630bY1) afS0S0310100_15.l1).LJJIL.remove(Long.valueOf(afS0S0310100_15.j4));
        if (LiveMatchInvite4004049FixSetting.INSTANCE.isEnable()) {
            C977630bY1 c977630bY1 = (C977630bY1) afS0S0310100_15.l1;
            if (c977630bY1.LJJIJLIJ == afS0S0310100_15.j4) {
                c977630bY1.LJJIJLIJ = 0L;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Removed battleId: ");
        sbLIZ.append(afS0S0310100_15.j4);
        sbLIZ.append(" for, remaining battleIds: ");
        sbLIZ.append(((C977630bY1) afS0S0310100_15.l1).LJJIL.size());
        C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C977630bY1 c977630bY12 = (C977630bY1) afS0S0310100_15.l1;
        if (!c977630bY12.LJJJIL) {
            c977630bY12.LJJ.setValue(C977770bYF.LIZ(new C977770bYF(0), null, null, null, (EnumC976510bWD) afS0S0310100_15.l0, null, 23));
        }
        C957590b1h c957590b1h = (C957590b1h) afS0S0310100_15.l2;
        if (c957590b1h != null && (function0 = c957590b1h.LIZ) != null) {
            function0.invoke();
        }
        ((C977630bY1) afS0S0310100_15.l1).LJJIZ = new C957560b1e(0, 3);
        C1C7U.LIZIZ("CombinedMatchInviterViewModel@5274.requestCancelApi$dispose$1");
    }

    public static final void accept$2(AfS0S0310100_15 afS0S0310100_15, Object obj) {
        C1C7U.LIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.sendImPushLegacy$1");
        if (Intrinsics.LJFF(obj, Boolean.TRUE) && afS0S0310100_15.z3) {
            ((C918650a0t) afS0S0310100_15.l0).LJIIJJI(((C918650a0t) afS0S0310100_15.l0).LIZ.getId(), Collections.singletonList(Long.valueOf(afS0S0310100_15.j4)));
            ((C918650a0t) afS0S0310100_15.l0).LIZLLL((Function1) afS0S0310100_15.l1, new C918230a0D(((C918350a0P) afS0S0310100_15.l2).LIZIZ(), EnumC918860a1E.LEGACY, true, null, null, null, null, 120));
        } else {
            ((C918650a0t) afS0S0310100_15.l0).LIZLLL((Function1) afS0S0310100_15.l1, new C918230a0D(((C918350a0P) afS0S0310100_15.l2).LIZIZ(), EnumC918860a1E.LEGACY, false, null, "share_single_message_failed_or_canceled", null, null, 104));
        }
        C1C7U.LIZIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.sendImPushLegacy$1");
    }

    public static final void accept$3(AfS0S0310100_15 afS0S0310100_15, Object obj) {
        Function0<Unit> function0;
        C1C7U.LIZ("TwoMatchInviterViewModel@1a1b.requestCancelApi$dispose$1");
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        C976520bWE c976520bWE = EnumC976510bWD.Companion;
        EnumC976510bWD enumC976510bWD = (EnumC976510bWD) afS0S0310100_15.l0;
        c976520bWE.getClass();
        c974540bT2.LJJJLIIL(C976520bWE.LIZ(enumC976510bWD), (C470590Icr) obj, afS0S0310100_15.z3, EnumC919170a1j.MATCH_TYPE_1V1);
        ((C977620bY0) afS0S0310100_15.l1).LJJIJ.remove(Long.valueOf(afS0S0310100_15.j4));
        if (LiveMatchInvite4004049FixSetting.INSTANCE.isEnable()) {
            C977620bY0 c977620bY0 = (C977620bY0) afS0S0310100_15.l1;
            if (c977620bY0.LJJII == afS0S0310100_15.j4) {
                c977620bY0.LJJII = 0L;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Removed battleId: ");
        sbLIZ.append(afS0S0310100_15.j4);
        sbLIZ.append(" for, remaining battleIds: ");
        sbLIZ.append(((C977620bY0) afS0S0310100_15.l1).LJJIJ.size());
        C20441214yg.LIZIZ("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C977620bY0 c977620bY02 = (C977620bY0) afS0S0310100_15.l1;
        if (!c977620bY02.LJJIIJ) {
            c977620bY02.LJIIZILJ.setValue(C977730bYB.LIZ(new C977730bYB(null, null, null, null), null, null, (EnumC976510bWD) afS0S0310100_15.l0, null, 11));
        }
        C957590b1h c957590b1h = (C957590b1h) afS0S0310100_15.l2;
        if (c957590b1h != null && (function0 = c957590b1h.LIZ) != null) {
            function0.invoke();
        }
        ((C977620bY0) afS0S0310100_15.l1).LJJIJLIJ = new C957560b1e(0, 3);
        C1C7U.LIZIZ("TwoMatchInviterViewModel@1a1b.requestCancelApi$dispose$1");
    }

    public AfS0S0310100_15(Object obj, boolean z, Object obj2, Object obj3, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z3 = z;
        this.l1 = obj2;
        this.l2 = obj3;
        this.j4 = j;
    }
}
