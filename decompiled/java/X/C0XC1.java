package X;

import android.accounts.Account;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XC1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XC1 {
    public InterfaceC844540XBc LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C0XDL LJ;
    public boolean LJFF;
    public int LJI;
    public InterfaceC23070092e LJII;
    public Context LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public InterfaceC844950XCr LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public JSONObject LJJI;
    public Map<String, Object> LJJIFFI;
    public Account LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public EnumC2207081BZq LJJIIZ;
    public C820710WHl LJJIIZI;
    public TelephonyManager LJJIJ;

    public final C844770XBz LIZ() {
        if (this.LJIIIIZZ == null || this.LJI <= 0 || TextUtils.isEmpty(this.LJIIZILJ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parameters error:");
            sbLIZ.append(this.LJIIIIZZ == null);
            sbLIZ.append(", ");
            sbLIZ.append(this.LJI);
            sbLIZ.append(", ");
            sbLIZ.append(this.LJIIZILJ);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (TextUtils.isEmpty(this.LJIILLIIL)) {
            throw new IllegalArgumentException("appName is empty");
        }
        if (this.LJII == null) {
            throw new IllegalArgumentException("please set network client");
        }
        if (this.LIZ == null) {
            throw new IllegalArgumentException("please set event depend");
        }
        if (TextUtils.isEmpty(this.LJIJ)) {
            this.LJIJ = this.LJIIZILJ;
        }
        if (this.LJJIJ == null) {
            this.LJJIJ = (TelephonyManager) C786410Ut5.H2(this.LJIIIIZZ, "phone");
        }
        C0XC2 c0xc2LIZJ = C0XC2.LIZJ();
        int i = this.LJI;
        c0xc2LIZJ.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("register", new C0XCA());
        concurrentHashMap.put("activate", new C0XCD());
        concurrentHashMap.put("params", new C0XCM());
        concurrentHashMap.put("dSign", new C0XCB());
        ((ConcurrentHashMap) c0xc2LIZJ.LIZ).put(String.valueOf(i), concurrentHashMap);
        return new C844770XBz(this);
    }

    public C0XC1() {
        new Object() { // from class: X.0XDJ
        };
        this.LJJIIJ = true;
        this.LJJIIJZLJL = false;
    }
}
