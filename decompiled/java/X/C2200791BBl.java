package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.1BBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200791BBl extends BroadcastReceiver {
    public static boolean LIZJ;
    public static InterfaceC2200861BBs LIZLLL;
    public static InterfaceC2200731BBf LJ;
    public static InterfaceC2200871BBt LJFF;
    public static final C2200791BBl LIZ = new C2200791BBl();
    public static C1512930pTP LIZIZ = new C1512930pTP();
    public static final Set<InterfaceC1300470jwj> LJI = new LinkedHashSet();

    public static void LIZ(Intent intent) {
        boolean z;
        EnumC1006810cJ5 enumC1006810cJ5;
        EnumC1006810cJ5 enumC1006810cJ52;
        if (intent == null) {
            return;
        }
        if (C2200821BBo.LJIILL && LIZJ) {
            return;
        }
        C1512930pTP c1512930pTP = new C1512930pTP();
        int intExtra = (int) (100 * (intent.getIntExtra("level", -1) / intent.getIntExtra("scale", -1)));
        int intExtra2 = intent.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
        boolean z2 = true;
        if (intExtra2 != 2 && intExtra2 != 5) {
            z = false;
        } else {
            z = true;
        }
        c1512930pTP.LIZLLL = intExtra;
        c1512930pTP.LIZIZ = z;
        if (intExtra >= 30 || z) {
            z2 = false;
        }
        c1512930pTP.LJ = z2;
        if (z) {
            enumC1006810cJ5 = EnumC1006810cJ5.Low;
        } else {
            float f = intExtra;
            C2200821BBo.LIZ.getClass();
            C2200811BBn c2200811BBn = C2200821BBo.LJIIIZ;
            if (f < c2200811BBn.LIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Critical;
            } else if (f < c2200811BBn.LIZIZ) {
                enumC1006810cJ5 = EnumC1006810cJ5.High;
            } else if (f < c2200811BBn.LIZJ) {
                enumC1006810cJ5 = EnumC1006810cJ5.Medium;
            } else {
                enumC1006810cJ5 = EnumC1006810cJ5.Low;
            }
        }
        c1512930pTP.LIZ = enumC1006810cJ5;
        c1512930pTP.LIZJ = intent;
        LIZIZ = c1512930pTP;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive Battery change.. ");
        sbLIZ.append(intExtra);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC2200871BBt interfaceC2200871BBt = LJFF;
        if (interfaceC2200871BBt != null) {
            interfaceC2200871BBt.LIZ(new C1514970pWh(c1512930pTP.LJ));
        }
        InterfaceC2200861BBs interfaceC2200861BBs = LIZLLL;
        if (interfaceC2200861BBs != null) {
            interfaceC2200861BBs.LIZJ(c1512930pTP);
        }
        Set<InterfaceC1300470jwj> set = LJI;
        synchronized (set) {
            try {
                Iterator<InterfaceC1300470jwj> it2 = set.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(c1512930pTP);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        int intExtra3 = intent.getIntExtra("temperature", 0);
        InterfaceC2200731BBf interfaceC2200731BBf = LJ;
        if (interfaceC2200731BBf != null) {
            C2189391AmP c2189391AmP = new C2189391AmP();
            float f2 = intExtra3 / 10;
            c2189391AmP.LIZIZ = f2;
            LIZ.getClass();
            C2200821BBo.LIZ.getClass();
            C2200721BBe c2200721BBe = C2200821BBo.LJIILJJIL;
            if (f2 > c2200721BBe.LIZ) {
                enumC1006810cJ52 = EnumC1006810cJ5.Critical;
            } else if (f2 > c2200721BBe.LIZIZ) {
                enumC1006810cJ52 = EnumC1006810cJ5.High;
            } else if (f2 > c2200721BBe.LIZJ) {
                enumC1006810cJ52 = EnumC1006810cJ5.Medium;
            } else {
                enumC1006810cJ52 = EnumC1006810cJ5.Low;
            }
            c2189391AmP.LIZ = enumC1006810cJ52;
            interfaceC2200731BBf.LJFF(c2189391AmP);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C2408409cA.LIZ();
            LIZ(intent);
        }
    }
}
