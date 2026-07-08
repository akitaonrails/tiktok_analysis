package X;

import Y.AObjectS388S0100000_13;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS82S0200000_13;
import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844710XBt implements C0XCU {
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public volatile C844770XBz LIZ;
    public volatile C844720XBu LIZIZ;
    public volatile C0XBV LIZJ;
    public volatile C0XCK LIZLLL;
    public final InterfaceC844530XBb LJI;
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public long LJII = 0;

    @Override // X.C0XCU
    public final void LJFF(C0XBN c0xbn) {
    }

    @Override // X.C0XCU
    public final boolean LJI() {
        C844830XCf.LIZ("install#activeManually");
        if (this.LIZIZ == null || this.LIZ == null) {
            return false;
        }
        InterfaceC844780XCa interfaceC844780XCa = C0XCJ.LIZIZ.LJIIIZ;
        if (!(interfaceC844780XCa == null ? Boolean.FALSE : interfaceC844780XCa.LIZJ("enable_force_active_behind_start")).booleanValue() || this.LJ.get()) {
            C824170WUt.LJ(new ARunnableS113S0100000_13(this, 255), this.LIZ.LIZ());
            return true;
        }
        this.LJFF.set(true);
        return false;
    }

    @Override // X.C0XCU
    public final C844630XBl LJIIIIZZ() {
        if (this.LIZJ == null) {
            return null;
        }
        return this.LIZJ.LIZLLL;
    }

    @Override // X.C0XCU
    public final C0XBN LJIIIZ() {
        if (this.LIZJ == null) {
            return null;
        }
        return LIZJ();
    }

    @Override // X.C0XCU
    public final boolean LJIIL() {
        if (this.LIZJ != null) {
            return this.LIZJ.LJIIJJI;
        }
        return false;
    }

    public final void LJIILL() {
        if (C844580XBg.LIZ(this.LIZ.LIZJ, this.LIZ).getBoolean("_install_started_v2", false)) {
            return;
        }
        C844580XBg.LIZ(this.LIZ.LIZJ, this.LIZ).edit().putBoolean("_install_started_v2", true).apply();
    }

    @Override // X.C0XCU
    public final String getDid() {
        if (this.LIZJ == null) {
            return null;
        }
        C0XBV c0xbv = this.LIZJ;
        c0xbv.LJFF.getClass();
        C0XBK c0xbk = (C0XBK) C0XBH.LIZ(C0XBK.class, c0xbv.LJFF.LIZ());
        return c0xbk != null ? c0xbk.getDeviceId() : c0xbv.LJIIIZ.LIZIZ("", "");
    }

    @Override // X.C0XCU
    public final void start() {
        if (this.LIZIZ == null || this.LIZ == null) {
            throw new RuntimeException("please init first");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("install#start aid : ");
        sbLIZ.append(this.LIZ.LIZ);
        C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C824170WUt.LJ(new Runnable() { // from class: X.0XCS
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("InstallServiceImpl@830b.start$1");
                try {
                    this.LL.LJIILJJIL(false);
                    if (this.LL.LJFF.compareAndSet(true, false)) {
                        this.LL.LJI();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("InstallServiceImpl@830b.start$1");
            }
        }, this.LIZ.LIZ());
        LJIILL();
    }

    public C844710XBt(C0XCI c0xci) {
        this.LJI = c0xci;
    }

    @Override // X.C0XCU
    public final void LIZ(C844630XBl c844630XBl) {
        C844830XCf.LIZ("install#changeUriRuntimeAndReInstall");
        if (this.LIZIZ != null && this.LIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeUriRuntimeAndReInstall ");
            sbLIZ.append(c844630XBl);
            C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C824170WUt.LJ(new ARunnableS82S0200000_13(this, c844630XBl, 87), this.LIZ.LIZ());
            return;
        }
        C844830XCf.LIZLLL(new RuntimeException("not init yet"));
    }

    @Override // X.C0XCU
    public final void LIZIZ(Account account) {
        if (this.LIZ == null) {
            return;
        }
        C824170WUt.LJ(new ARunnableS82S0200000_13(this, account, 88), this.LIZ.LIZ());
    }

    @Override // X.C0XCU
    public final void LIZJ(Map map) {
        boolean z;
        if (this.LIZJ != null) {
            loop0: while (true) {
                z = false;
                for (Map.Entry entry : ((HashMap) map).entrySet()) {
                    String str = (String) entry.getKey();
                    if (LJII(entry.getValue(), str) || z) {
                        z = true;
                    }
                }
            }
            if (z && this.LIZLLL != null) {
                this.LIZLLL.LIZ(new C844690XBr(this.LIZJ.LJIIIIZZ));
            }
        }
    }

    @Override // X.C0XCU
    public final boolean LJ(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (this.LIZJ != null) {
            C0XBV c0xbv = this.LIZJ;
            if (c0xbv.LJIIJ && (jSONObject2 = c0xbv.LJIIIIZZ) != null) {
                C2123908Tt.LIZJ(jSONObject, jSONObject2);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C0XCU
    public final void LJII(C844630XBl c844630XBl) {
        C844830XCf.LIZ("install#clearInstallInfoWhenSwitchChildMode");
        if (this.LIZIZ != null && this.LIZ != null && this.LIZJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearInstallInfoWhenSwitchChildMode ");
            sbLIZ.append(c844630XBl);
            C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C824170WUt.LJ(new ARunnableS82S0200000_13(this, c844630XBl, 86), this.LIZ.LIZ());
            return;
        }
        C844830XCf.LIZLLL(new RuntimeException("not init yet"));
    }

    public final void LJIILJJIL(boolean z) {
        InterfaceC844860XCi interfaceC844860XCi;
        if (this.LIZIZ != null && this.LIZ != null) {
            if (this.LJ.getAndSet(true)) {
                return;
            }
            InterfaceC844940XCq interfaceC844940XCq = (InterfaceC844940XCq) C0XBH.LIZ(InterfaceC844940XCq.class, this.LIZ.LIZ());
            if (interfaceC844940XCq != null) {
                interfaceC844940XCq.start();
            }
            C0XBV c0xbv = this.LIZJ;
            if (!c0xbv.LJIIL.getAndSet(true)) {
                C0XBF.LIZ(c0xbv.LJ, c0xbv.LIZLLL, c0xbv.LJFF);
            }
            C844720XBu c844720XBu = this.LIZIZ;
            c844720XBu.LJII(c844720XBu.LLILZIL, z, true);
            if (c844720XBu.LL.LJIILL) {
                ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(c844720XBu, 254);
                C0XCO c0xco = (C0XCO) c844720XBu.LLILZ;
                c0xco.LLILZ = new C844880XCk(c844720XBu, aRunnableS113S0100000_13);
                if (c0xco.LLILLL) {
                    C844830XCf.LIZ("dispatcher#active isActive");
                    aRunnableS113S0100000_13.run();
                }
            }
            C0XCI c0xci = C0XCJ.LIZIZ;
            InterfaceC844780XCa interfaceC844780XCa = c0xci.LJIIIZ;
            if (interfaceC844780XCa != null && interfaceC844780XCa.LIZJ("enable_event_track").booleanValue() && (interfaceC844860XCi = c0xci.LJIIJ) != null) {
                interfaceC844860XCi.LJ(new AObjectS388S0100000_13(c844720XBu, 5));
            }
            C0XBQ c0xbq = new C0XBQ(this.LIZ.LIZJ);
            C844770XBz c844770XBz = this.LIZ;
            c0xbq.LIZIZ = c844770XBz;
            if (c844770XBz != null) {
                C0XCI.LJII(String.valueOf(c844770XBz.LIZ)).LIZIZ(true, c0xbq);
                return;
            }
            return;
        }
        throw new RuntimeException("please init first");
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.0XBV] */
    @Override // X.C0XCU
    public final void LJIIJJI(final C844770XBz c844770XBz, final C844630XBl c844630XBl) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("main process install#init：aid: ");
        sbLIZ.append(c844770XBz.LIZ);
        C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this) {
            try {
                if (this.LIZIZ == null) {
                    this.LIZ = c844770XBz;
                    if (TextUtils.equals(c844770XBz.LJI, "local_test") || c844770XBz.LJJI) {
                        try {
                            C0XBH.LIZIZ(InterfaceC844940XCq.class, String.valueOf(c844770XBz.LIZ), (InterfaceC844940XCq) Class.forName("com.bytedance.bdinstall.nu.NUModeServiceImpl").getConstructor(C844770XBz.class).newInstance(c844770XBz));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C844830XCf.LIZIZ("not find new user mode impl ,ignore");
                        }
                    }
                    final Context context = c844770XBz.LIZJ;
                    this.LIZJ = new C0XBM(context, c844630XBl, c844770XBz) { // from class: X.0XBV
                    };
                    this.LIZJ.LJIILIIL = this.LIZLLL;
                    this.LIZIZ = new C844720XBu(c844770XBz, this.LIZJ, c844630XBl);
                    this.LIZIZ.LLJIJIL = this.LIZLLL;
                    C0XBH.LIZIZ(InterfaceC844930XCp.class, String.valueOf(c844770XBz.LIZ), new AbstractC1863807Rs(c844770XBz, c844630XBl) { // from class: X.0XBE
                        public final Context LIZ;
                        public volatile C844630XBl LIZIZ;
                        public volatile C844770XBz LIZJ;

                        @Override // X.AbstractC1863807Rs
                        public final String LIZLLL() {
                            return LIZIZ(this.LIZ).getString("device_token", null);
                        }

                        {
                            this.LIZJ = c844770XBz;
                            this.LIZ = c844770XBz.LIZJ;
                            this.LIZIZ = c844630XBl;
                        }

                        @Override // X.InterfaceC844930XCp
                        public final void LIZIZ(String str, C844630XBl c844630XBl2) {
                            SharedPreferences sharedPreferencesLIZ;
                            this.LIZIZ = c844630XBl2;
                            if (c844630XBl2 != null && (sharedPreferencesLIZ = c844630XBl2.LIZ(this.LIZJ)) != null) {
                                sharedPreferencesLIZ.edit().putString("device_token", str).apply();
                            }
                            C824230WUz.LIZ(this.LIZ).LIZJ(this.LIZJ.LIZ(), "device_token", str);
                        }
                    });
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init ：");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.C0XCU
    public final void LJIILIIL(String str, String str2) {
        Long lValueOf;
        if (this.LIZIZ != null && this.LIZ != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJII;
            InterfaceC844780XCa interfaceC844780XCa = C0XCJ.LIZIZ.LJIIIZ;
            if (interfaceC844780XCa == null) {
                lValueOf = 600000L;
            } else {
                long jLongValue = interfaceC844780XCa.getLongValue("retry_rest_seconds").longValue() * 1000;
                if (jLongValue <= 0) {
                    lValueOf = 600000L;
                } else {
                    lValueOf = Long.valueOf(jLongValue);
                }
            }
            if (jCurrentTimeMillis <= lValueOf.longValue()) {
                C844870XCj.LIZ("retryDSign: from=$from, fromError=$fromError :gap not allow ");
                return;
            }
            if (TextUtils.equals(str, "zti_client_err")) {
                C844770XBz c844770XBz = this.LIZ;
                String string = c844770XBz.LIZJ().getString("device_id", "");
                String string2 = c844770XBz.LIZJ().getString("install_id", "");
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    C844870XCj.LIZ("retryDSign: from=$from, fromError=$fromError :localDid or localIID is empty");
                    return;
                }
            }
            this.LJII = System.currentTimeMillis();
            C844870XCj.LIZ("retryDSign: real call dSign");
            this.LIZIZ.LIZJ(str, str2);
            return;
        }
        C844870XCj.LIZ("retryDSign: from=$from, fromError=$fromError : not init ");
    }

    @Override // X.C0XCU
    public final void LIZLLL(C844630XBl c844630XBl, long j, InterfaceC845020XCy interfaceC845020XCy) {
        C844830XCf.LIZ("install#resetInstallInfoWhenSwitchChildMode");
        if (this.LIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resetInstallInfoWhenSwitchChildMode ");
            sbLIZ.append(c844630XBl);
            C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C0XCE c0xce = new C0XCE(j, interfaceC845020XCy, this.LIZ);
            ((C0XCI) this.LJI).LIZIZ(false, c0xce);
            C786410Ut5.LJLIIL(c0xce.LIZ, c0xce.LIZJ, new ARunnableS113S0100000_13(c0xce, 150));
            if (this.LIZ != null) {
                C824170WUt.LJ(new ARunnableS82S0200000_13(this, c844630XBl, 89), this.LIZ.LIZ());
                return;
            }
            return;
        }
        C844830XCf.LIZLLL(new RuntimeException("not init yet"));
    }

    @Override // X.C0XCU
    public final void LJIIJ(Context context, Map map, boolean z) {
        C844720XBu c844720XBu;
        C844730XBv c844730XBv;
        SharedPreferences.Editor editorEdit = C844580XBg.LIZ(context, this.LIZ).edit();
        if (this.LIZJ != null) {
            boolean z2 = false;
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!LJII(str2, str) && !z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (editorEdit != null) {
                    editorEdit.putString(str, str2);
                }
            }
            if (editorEdit != null) {
                editorEdit.apply();
            }
            if (z2) {
                if (z && this.LIZIZ != null && (c844730XBv = (c844720XBu = this.LIZIZ).LLIZ) != null) {
                    c844720XBu.LJIIIIZZ(c844730XBv, true);
                }
                if (this.LIZLLL != null) {
                    this.LIZLLL.LIZ(new C844690XBr(this.LIZJ.LJIIIIZZ));
                }
            }
        }
    }
}
