package X;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XBR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XBR implements C0XCU, C0XBZ {
    public C0XBN LIZ;
    public C0XCK LIZIZ;
    public final InterfaceC844530XBb LIZJ;

    @Override // X.C0XCU
    public final void LIZ(C844630XBl c844630XBl) {
    }

    @Override // X.C0XCU
    public final void LIZIZ(Account account) {
    }

    @Override // X.C0XCU
    public final void LIZJ(Map map) {
    }

    @Override // X.C0XCU
    public final void LIZLLL(C844630XBl c844630XBl, long j, InterfaceC845020XCy interfaceC845020XCy) {
    }

    @Override // X.C0XCU
    public final boolean LJ(JSONObject jSONObject) {
        return false;
    }

    @Override // X.C0XCU
    public final boolean LJI() {
        return false;
    }

    @Override // X.C0XCU
    public final void LJII(C844630XBl c844630XBl) {
    }

    @Override // X.C0XCU
    public final C844630XBl LJIIIIZZ() {
        return null;
    }

    @Override // X.C0XCU
    public final void LJIIJ(Context context, Map map, boolean z) {
    }

    @Override // X.C0XCU
    public final boolean LJIIL() {
        return false;
    }

    @Override // X.C0XCU
    public final void LJIILIIL(String str, String str2) {
    }

    @Override // X.C0XCU
    public final void start() {
    }

    @Override // X.C0XCU
    public final C0XBN LJIIIZ() {
        C0XBN c0xbn = this.LIZ;
        if (c0xbn == null) {
            return null;
        }
        return c0xbn.clone();
    }

    @Override // X.C0XCU
    public final String getDid() {
        C0XBN c0xbn = this.LIZ;
        if (c0xbn == null) {
            return null;
        }
        return c0xbn.LL;
    }

    public C0XBR(C0XCI c0xci) {
        this.LIZJ = c0xci;
        C844830XCf.LIZ("OTHER PROCESS IMPL");
    }

    @Override // X.C0XCU
    public final void LJFF(C0XBN c0xbn) {
        this.LIZ = c0xbn;
    }

    @Override // X.C0XCU
    public final void LJIIJJI(C844770XBz c844770XBz, C844630XBl c844630XBl) {
        Context context = c844770XBz.LIZJ;
        C0XBQ c0xbq = new C0XBQ(context);
        c0xbq.LIZIZ = c844770XBz;
        C824230WUz.LIZ(context).LIZIZ(c0xbq.LIZIZ.LIZ(), "install_info", new C0WV2() { // from class: X.0XBS
            @Override // X.C0WV2
            public final void LIZJ(String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("install_info onUpdate ");
                sbLIZ.append(str);
                C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                C0XBN c0xbnLIZIZ = C0XBN.LIZIZ(str);
                if (c0xbnLIZIZ != null && !TextUtils.isEmpty(c0xbnLIZIZ.LL) && !TextUtils.isEmpty(c0xbnLIZIZ.LLILLJJLI)) {
                    C0XBZ c0xbz = this;
                    if (c0xbz != null) {
                        C0XBR c0xbr = (C0XBR) c0xbz;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("install info changed : ");
                        sbLIZ2.append(c0xbnLIZIZ);
                        C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        C0XCI c0xci = (C0XCI) c0xbr.LIZJ;
                        Context contextLJ = c0xci.LJ();
                        if (contextLJ != null) {
                            c0xci.LJFF.LIZIZ(contextLJ).LJFF(c0xbnLIZIZ);
                        }
                        C0XCK c0xck = c0xbr.LIZIZ;
                        if (c0xck != null) {
                            c0xck.LIZ(new C0XBY(c0xbnLIZIZ));
                            return;
                        }
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("install_info onUpdate invalid value ");
                sbLIZ3.append(c0xbnLIZIZ);
                C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            }
        });
        C0XB1.LIZIZ(c844770XBz);
        C0XBH.LIZIZ(InterfaceC844930XCp.class, String.valueOf(c844770XBz.LIZ), new C0XBD(c844770XBz));
    }
}
