package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BEN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BEN extends C1BE6<C1BEQ> {
    public final C2201491BEd LIZ;
    public C1BEQ LIZIZ;
    public C1BEU LIZJ;
    public C1BEV LIZLLL;

    @Override // X.C1BE6
    public final void LIZ() {
    }

    @Override // X.C1BE6
    public final void LIZIZ() {
        LJII(false);
    }

    @Override // X.C1BE6
    public final void LIZJ() {
        LJII(true);
    }

    @Override // X.C1BE6
    public final void LJ() {
    }

    @Override // X.C1BE6
    public final void LIZLLL() {
        C2201621BEq c2201621BEq = new C2201621BEq();
        C2201491BEd c2201491BEd = this.LIZ;
        c2201621BEq.LIZ = c2201491BEd.LIZ;
        c2201621BEq.LIZIZ = c2201491BEd.LIZIZ;
        this.LIZIZ = new C1BEQ(c2201621BEq);
        this.LIZLLL = new C1BEV(this, this.LIZ.LIZJ);
        this.LIZJ = new C1BEU(this);
    }

    public final void LJI() {
        InterfaceC2201461BEa c1bei;
        C1BER c1ber = C1BE8.LIZIZ().LIZJ;
        List<C1BEK> listLIZ = null;
        if (c1ber == null || TextUtils.isEmpty("c2s")) {
            return;
        }
        if (c1ber.LIZLLL == null) {
            c1ber.LIZLLL = new HashMap();
        }
        JSONObject jSONObject = (JSONObject) ((HashMap) c1ber.LIZLLL).get("c2s");
        if (jSONObject != null) {
            this.LIZIZ.LIZIZ(jSONObject);
            C1BEU c1beu = this.LIZJ;
            int i = this.LIZIZ.LIZJ;
            if (i != c1beu.LIZ || c1beu.LIZIZ == null) {
                if (i == 0) {
                    c1bei = new C1BEI();
                } else if (i == 1) {
                    c1bei = new C2201571BEl();
                } else if (i != 2) {
                    return;
                } else {
                    c1bei = new C2201581BEm();
                }
                InterfaceC2201461BEa interfaceC2201461BEa = c1beu.LIZIZ;
                if (interfaceC2201461BEa != null) {
                    listLIZ = interfaceC2201461BEa.LIZ();
                    interfaceC2201461BEa.LIZJ();
                    interfaceC2201461BEa.release();
                }
                c1beu.LIZIZ = c1bei;
                if (listLIZ != null) {
                    c1bei.LJI(listLIZ);
                }
            }
        }
    }

    public C1BEN(C2201491BEd c2201491BEd) {
        this.LIZ = c2201491BEd;
    }

    public final void LJII(boolean z) {
        List<C1BEK> listLJ;
        if (this.LIZIZ.LIZ && (listLJ = this.LIZJ.LJ()) != null && !listLJ.isEmpty()) {
            C1BEB.LIZIZ().getClass();
            C2201451BDz.LIZLLL.LIZ();
            C1BEE.LIZ();
            boolean z2 = false;
            for (C1BEK c1bek : listLJ) {
                if (!z || c1bek.LJIIL) {
                    if (!z2 && C2201451BDz.LIZLLL.LIZIZ()) {
                        LJFF(c1bek, true);
                    } else {
                        c1bek.LJIIIZ++;
                        this.LIZJ.LIZLLL(c1bek);
                        z2 = true;
                    }
                }
            }
        }
    }

    public final void LJFF(C1BEK c1bek, boolean z) {
        c1bek.toString();
        List<String> list = c1bek.LJFF;
        if (z || (c1bek.LJIILIIL > 0 && (System.currentTimeMillis() - c1bek.LJIIIIZZ) / 1000 > c1bek.LJIILIIL)) {
            this.LIZJ.LJFF(c1bek);
        }
        if (c1bek.LJIILIIL > 0 && (System.currentTimeMillis() - c1bek.LJIIIIZZ) / 1000 > c1bek.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("event expired:");
            sbLIZ.append(c1bek.toString());
            C2188811AlT.LIZIZ(sbLIZ);
            C1BEJ.onEventExpired(c1bek);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            String str = (String) ListProtector.get(list, i);
            long jUptimeMillis = SystemClock.uptimeMillis();
            C1BEV c1bev = this.LIZLLL;
            c1bev.getClass();
            boolean zLJI = MethodIDManager.LJI(137677);
            C2201471BEb c2201471BEb = new C2201471BEb();
            c2201471BEb.LIZ = str;
            c2201471BEb.LIZIZ = "GET";
            c2201471BEb.LIZLLL = c1bek;
            C1BEW c1bewLIZ = c1bev.LIZIZ.LIZ(new C1BEZ(c2201471BEb));
            if (zLJI) {
                MethodIDManager.LJ();
            }
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            int i2 = this.LIZIZ.LJII;
            if (c1bewLIZ != null && i2 > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cost:");
                sbLIZ2.append(jUptimeMillis2);
                sbLIZ2.append(" code:");
                sbLIZ2.append(c1bewLIZ.LIZ);
                sbLIZ2.append(" msg:");
                sbLIZ2.append(c1bewLIZ.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
    }
}
