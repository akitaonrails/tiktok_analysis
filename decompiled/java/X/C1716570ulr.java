package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS488S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ulr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716570ulr extends AbstractC1716900umO {
    public static C1716560ulq LJIIJJI;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final Function0<String> LJIIIIZZ;
    public final String LJIIIZ;
    public Boolean LJIIJ;

    @Override // X.InterfaceC1717200ums
    public final String LJI() {
        return "KYC";
    }

    @Override // X.InterfaceC1717200ums
    public final void LJII(C19EG c19eg, final C1717190umr c1717190umr, final String str) {
        String str2;
        String str3 = "";
        C1716600ulu.LIZ.put(this.LJFF, new InterfaceC1716640uly() { // from class: X.0ulv
            @Override // X.InterfaceC1716640uly
            public final void LIZLLL() {
                c1717190umr.LIZJ(null, str, null);
            }
        });
        try {
            String str4 = this.LJFF;
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("step", "kyc_schema");
            String str5 = this.LJII;
            if (str5 == null) {
                str5 = "";
            }
            pairArr[1] = new Pair("result", str5);
            C1716470ulh.LIZ(str4, "rd_pipo_on_boarding", C2097608Jq.LJIIIIZZ(pairArr));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (C1948507kB.LIZ(this.LJII) && (str2 = this.LJII) != null) {
            UriProtector.parse(str2).buildUpon().appendQueryParameter("source_btm_token", str).build().toString();
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("pipo_onboarding_kyc_inject_session_enable", true)) {
                C1716550ulp c1716550ulp = C1716550ulp.LIZ;
                String str6 = this.LJFF;
                c1716550ulp.getClass();
                String strLJ = C1716550ulp.LJ(str6);
                if (strLJ != null) {
                    str3 = strLJ;
                }
                UriProtector.parse(str2).buildUpon().appendQueryParameter("session_id", str3).build().toString();
                LJIIL(c19eg, str2, this.LJFF, c1717190umr);
                return;
            }
            LJIIL(c19eg, str2, this.LJFF, c1717190umr);
            return;
        }
        if (C1948507kB.LIZ(this.LJI)) {
            C1716510ull c1716510ull = C1716510ull.LIZ;
            String str7 = this.LJI;
            if (str7 != null) {
                str3 = str7;
            }
            C1716510ull.LIZIZ(c1716510ull, c19eg, str3, true, true, true, this.LJFF, this.LJIIIZ, null, str, 128);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0ulq] */
    public final void LJIIL(Context context, String str, String str2, final C1717190umr c1717190umr) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_onboarding_kyc_direct_use_spark", true)) {
            try {
                C1716560ulq c1716560ulq = LJIIJJI;
                if (c1716560ulq != null) {
                    C1548820qPI.LJIIIIZZ("PIPO_KYC_COMPLETED", c1716560ulq);
                }
                final String str3 = this.LJFF;
                LJIIJJI = new InterfaceC1141530foN(c1717190umr, str3) { // from class: X.0ulq
                    public final InterfaceC1716260ulM LL;
                    public final String LLILLJJLI;

                    @Override // X.InterfaceC1141530foN
                    public final void mh2(C262100zr c262100zr) {
                        String string;
                        String str4;
                        C1548820qPI.LJIIIIZZ("PIPO_KYC_COMPLETED", this);
                        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                        Boolean boolValueOf = null;
                        if (interfaceC1107590evd != null) {
                            string = interfaceC1107590evd.getString("kycStatus");
                        } else {
                            string = null;
                        }
                        try {
                            String str5 = this.LLILLJJLI;
                            Pair[] pairArr = new Pair[2];
                            pairArr[0] = new Pair("step", "receive_kyc");
                            if (string == null) {
                                str4 = "";
                            } else {
                                str4 = string;
                            }
                            pairArr[1] = new Pair("result", str4);
                            C1716470ulh.LIZ(str5, "rd_pipo_on_boarding", C2097608Jq.LJIIIIZZ(pairArr));
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                        if (!Intrinsics.LJFF(string, "approved") && string != null && string.length() != 0) {
                            InterfaceC1716260ulM interfaceC1716260ulM = this.LL;
                            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                            if (interfaceC1107590evd2 != null) {
                                boolValueOf = Boolean.valueOf(interfaceC1107590evd2.getBoolean("hasSubmitted"));
                            }
                            interfaceC1716260ulM.LIZ(boolValueOf);
                            return;
                        }
                        this.LL.LIZJ(string, null, null);
                    }

                    {
                        this.LL = c1717190umr;
                        this.LLILLJJLI = str3;
                    }
                };
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(str);
                sparkContext.sendEventListener = new AwS488S0200000_26(this, c1717190umr, 6);
                sparkContext.LJJJJZI(new C1776240wK6(this, 3));
                C1716510ull c1716510ull = C1716510ull.LIZ;
                String str4 = this.LJFF;
                c1716510ull.getClass();
                sparkContext.LJJLIIIJILLIZJL(C2097608Jq.LJIIL(C1716510ull.LIZ(str4), C2097908Jt.LIZJ(new Pair("tt_uid", C1716590ult.LIZ()))));
                C1716560ulq c1716560ulq2 = LJIIJJI;
                if (c1716560ulq2 != null) {
                    C1548820qPI.LJFF("PIPO_KYC_COMPLETED", c1716560ulq2, sparkContext.containerId);
                }
                c1537900q7g.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "vc open url");
                return;
            }
        }
        C1716510ull.LIZ.getClass();
        C1718900upc c1718900upc = C1718900upc.LIZ;
        Map mapLIZ = C1716510ull.LIZ(str2);
        c1718900upc.getClass();
        C1718900upc.LJFF(context, str, mapLIZ, true);
    }

    public C1716570ulr(String str, String str2, String str3, Function0 function0, String str4) {
        super(null);
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = str3;
        this.LJIIIIZZ = function0;
        this.LJIIIZ = str4;
    }
}
