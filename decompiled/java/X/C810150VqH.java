package X;

import Y.ARunnableS46S0300000_13;
import android.content.Context;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0VqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810150VqH implements InterfaceC809850Vpn {
    public static volatile C810150VqH LJ;
    public C810130VqF LIZ;
    public final Context LIZIZ;
    public C821300WJs LIZJ;
    public String LIZLLL;

    @Override // X.InterfaceC809850Vpn
    public final void LIZIZ() {
        C821300WJs c821300WJs = this.LIZJ;
        if (c821300WJs != null) {
            c821300WJs.LIZJ();
        }
    }

    @Override // X.InterfaceC809850Vpn
    public final synchronized void LIZ(C809810Vpj c809810Vpj) {
        C810130VqF c810130VqF = this.LIZ;
        if (c810130VqF != null) {
            C821320WJu c821320WJuLIZJ = LIZJ(c810130VqF);
            if (c821320WJuLIZJ != null) {
                C821300WJs c821300WJs = this.LIZJ;
                if (c821300WJs != null) {
                    c821300WJs.LIZ(c821320WJuLIZJ);
                } else {
                    this.LIZJ = C821310WJt.LIZJ(this.LIZIZ, c821320WJuLIZJ, c809810Vpj);
                }
            }
        } else {
            InterfaceC810270VqT interfaceC810270VqTLIZIZ = C810160VqI.LIZ().LIZIZ();
            if (interfaceC810270VqTLIZIZ == null) {
                return;
            }
            Context context = this.LIZIZ;
            C810180VqK c810180VqK = new C810180VqK(this, c809810Vpj);
            C810190VqL c810190VqL = (C810190VqL) interfaceC810270VqTLIZIZ;
            if (Looper.getMainLooper() == Looper.myLooper()) {
                RunnableC823120WQs.LIZIZ(new ARunnableS46S0300000_13(context, c810180VqK, c810190VqL, 18));
            } else {
                c810190VqL.LIZ.LIZJ(context, c810180VqK);
            }
        }
    }

    public final C821320WJu LIZJ(C810130VqF c810130VqF) {
        if (c810130VqF != null && c810130VqF.LIZ()) {
            this.LIZ = c810130VqF;
            HashMap map = new HashMap();
            C808950VoL.LIZIZ().getClass();
            C809040VoU.LIZ().LIZIZ(map);
            String str = (String) map.get("install_id");
            String str2 = (String) map.get("device_id");
            C809220Vom c809220Vom = C809030VoT.LJIIJ.LIZIZ;
            if (c809220Vom == null) {
                return null;
            }
            try {
                C0WKN c0wkn = new C0WKN(10006);
                c0wkn.LJ = c810130VqF.LIZ;
                c0wkn.LJIIIIZZ = str2;
                c0wkn.LJIIIZ = str;
                c0wkn.LJFF = c810130VqF.LIZIZ;
                c0wkn.LJII = c810130VqF.LIZJ;
                c0wkn.LJI = 30204;
                List<String> list = c810130VqF.LIZLLL;
                if (list != null) {
                    ((ArrayList) c0wkn.LIZLLL).addAll(list);
                }
                String strValueOf = String.valueOf(c809220Vom.LIZIZ);
                if (!C2093608Ic.LJ("host_aid")) {
                    ((HashMap) c0wkn.LIZIZ).put("host_aid", strValueOf);
                }
                String strValueOf2 = String.valueOf(c809220Vom.LIZJ);
                if (!C2093608Ic.LJ("host_version")) {
                    ((HashMap) c0wkn.LIZIZ).put("host_version", strValueOf2);
                }
                String str3 = this.LIZLLL;
                if (!C2093608Ic.LJ("sid")) {
                    ((HashMap) c0wkn.LIZIZ).put("sid", str3);
                }
                return c0wkn.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public C810150VqH(Context context, String str) {
        this.LIZIZ = context;
        this.LIZLLL = str;
    }
}
