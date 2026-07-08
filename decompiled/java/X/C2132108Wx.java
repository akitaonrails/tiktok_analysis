package X;

import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigPage;
import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigPageLife;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Wx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1294060jmO
public final class C2132108Wx {
    public static final C01GW<C2132108Wx> LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1329));
    public EcomLoadRetreatConfigPageLife LIZJ;
    public final List<AbstractC2132008Ww> LIZ = Collections.synchronizedList(new ArrayList());
    public final List<C2130508Wh> LIZIZ = Collections.synchronizedList(new ArrayList());
    public final CopyOnWriteArrayList<AbstractC2132008Ww> LIZLLL = new CopyOnWriteArrayList<>();

    public C2132108Wx() {
        if (C1507840pLC.LIZJ()) {
            C1507830pLB.LJFF(new InterfaceC2173208fK() { // from class: X.08Wy
                @Override // X.InterfaceC2173208fK
                public final void LIZ(List<String> list) {
                }

                @Override // X.InterfaceC2173208fK
                public final void LJI(String str) {
                    EcomLoadRetreatConfigPageLife ecomLoadRetreatConfigPageLife;
                    C2132108Wx c2132108Wx = this.LIZ;
                    EcomLoadRetreatConfigPage ecomLoadRetreatConfigPage = C1507840pLC.LIZIZ().pages.get(str);
                    if (ecomLoadRetreatConfigPage != null) {
                        ecomLoadRetreatConfigPageLife = ecomLoadRetreatConfigPage.enter;
                    } else {
                        ecomLoadRetreatConfigPageLife = null;
                    }
                    if (!Intrinsics.LJFF(c2132108Wx.LIZJ, ecomLoadRetreatConfigPageLife)) {
                        c2132108Wx.LIZJ = ecomLoadRetreatConfigPageLife;
                        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2131608Ws(ecomLoadRetreatConfigPageLife, c2132108Wx, null), 3);
                    }
                }

                @Override // X.InterfaceC2173208fK
                public final void LJ(String str, String str2) {
                    C2132108Wx c2132108Wx = this.LIZ;
                    if (!Intrinsics.LJFF(c2132108Wx.LIZJ, null)) {
                        c2132108Wx.LIZJ = null;
                        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2131608Ws(null, c2132108Wx, null), 3);
                    }
                }
            });
        }
    }

    public static void LIZ(AbstractC2132008Ww abstractC2132008Ww) throws JSONException {
        abstractC2132008Ww.LJIIJJI(System.currentTimeMillis());
        if (C1505950pI9.LJFF()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stage", "execute");
            jSONObject.put("prepare_to_execute_dur", System.currentTimeMillis() - abstractC2132008Ww.LJI());
            jSONObject.put("count", abstractC2132008Ww.LJII());
            String strLJIIIZ = abstractC2132008Ww.LJIIIZ();
            String str = abstractC2132008Ww.LJFF().pageName;
            if (str == null) {
                str = "unknown";
            }
            String str2 = abstractC2132008Ww.LJFF().entryId;
            if (str2 == null) {
                str2 = "unknown";
            }
            String str3 = abstractC2132008Ww.LJFF().type;
            if (str3 == null) {
                str3 = "unknown";
            }
            C1505950pI9.LIZ(jSONObject, strLJIIIZ, str, str2, str3, abstractC2132008Ww.LIZLLL());
        }
        abstractC2132008Ww.LIZIZ();
    }
}
