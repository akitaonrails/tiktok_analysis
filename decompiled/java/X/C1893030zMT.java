package X;

import android.R;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.thirdparty.exp.PoiThirdPartyLoadingViewOpt;
import com.ss.android.ugc.aweme.poi.thirdparty.provider.viewmodel.PoiThirdPartyViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zMT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893030zMT extends AbstractC1542070qEP {
    public final InterfaceC1893040zMU LLILLJJLI;
    public final String LLILLL;
    public C1749280vcc LLILZ;
    public Context LLILZIL;
    public PoiThirdPartyViewModel LLILZLL;

    @Override // X.AbstractC1542070qEP, X.InterfaceC1163130gND
    public final void release() {
        this.LLILZIL = null;
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJL() {
        C1749280vcc c1749280vcc;
        String host;
        List<String> list;
        C01GW c01gw = PoiThirdPartyLoadingViewOpt.LIZIZ;
        if (!((PoiThirdPartyLoadingViewOpt.Config) c01gw.getValue()).enable) {
            return null;
        }
        try {
            host = UriProtector.parse(this.LLILLL).getHost();
            if (host == null) {
                host = "";
            }
            list = ((PoiThirdPartyLoadingViewOpt.Config) c01gw.getValue()).list;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (a0.LJJIIZI(host, it2.next(), false)) {
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
                PoiThirdPartyViewModel poiThirdPartyViewModel = this.LLILZLL;
                if (poiThirdPartyViewModel != null) {
                    poiThirdPartyViewModel.vQ2(EnumC1892960zMM.LOADING);
                }
                C1749280vcc c1749280vcc2 = this.LLILZ;
                if (c1749280vcc2 == null) {
                    c1749280vcc2 = null;
                }
                c1749280vcc2.LJ();
                C1749280vcc c1749280vcc3 = this.LLILZ;
                if (c1749280vcc3 == null) {
                    c1749280vcc3 = null;
                }
                C786410Ut5.LLLZLZ(c1749280vcc3, 0);
                C1749280vcc c1749280vcc4 = this.LLILZ;
                if (c1749280vcc4 == null) {
                    c1749280vcc = null;
                    c1749280vcc4 = null;
                } else {
                    c1749280vcc = c1749280vcc4;
                }
                c1749280vcc.setBackgroundColor(C446980Hfs.LIZ(c1749280vcc4.getContext(), R.color.transparent));
                C1749280vcc c1749280vcc5 = this.LLILZ;
                if (c1749280vcc5 != null) {
                    return c1749280vcc5;
                }
                return null;
            }
        }
        return null;
    }

    @Override // X.AbstractC1542070qEP
    public final void LIZ(SparkContext sparkContext) {
        SparkActivity sparkActivityLIZ = C1893200zMk.LIZ(sparkContext);
        PoiThirdPartyViewModel poiThirdPartyViewModel = null;
        if ((sparkActivityLIZ instanceof C19EG) && sparkActivityLIZ != null) {
            poiThirdPartyViewModel = (PoiThirdPartyViewModel) ViewModelProviders.of(sparkActivityLIZ).get(PoiThirdPartyViewModel.class);
        }
        this.LLILZLL = poiThirdPartyViewModel;
    }

    @Override // X.InterfaceC1163110gNB
    public final void LJIIJ(Context context) {
        this.LLILZIL = context;
        C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
        c1749280vcc.setLayoutVariant(0);
        this.LLILZ = c1749280vcc;
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJJLIIL(InterfaceC1051240dSk interfaceC1051240dSk) {
        boolean zLIZIZ;
        String string;
        String string2;
        Integer numLIZJ;
        String string3;
        String string4;
        Integer num;
        String str;
        Integer num2;
        String str2;
        String strLJIJI;
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        String str3 = "";
        if (zLIZIZ) {
            PoiThirdPartyViewModel poiThirdPartyViewModel = this.LLILZLL;
            if (poiThirdPartyViewModel != null) {
                poiThirdPartyViewModel.vQ2(EnumC1892960zMM.ERROR);
            }
            C1749280vcc c1749280vcc = this.LLILZ;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 10);
            Context context = this.LLILZIL;
            if (context == null || (string3 = context.getString(2131821904)) == null) {
                string3 = "";
            }
            c1722300uv6.LJI = string3;
            Context context2 = this.LLILZIL;
            if (context2 == null || (string4 = context2.getString(2131821903)) == null) {
                string4 = "";
            }
            c1722300uv6.LJIIIIZZ = string4;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = com.zhiliaoapp.musically.R.raw.icon_large_error_robot;
            c419910GdJ.LJ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.a1p);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJIIIZ = new AwS607S0100000_28(awS572S0100000_28, 16);
            c1749280vcc.setStatus(c1722300uv6);
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            PoiThirdPartyViewModel poiThirdPartyViewModel2 = this.LLILZLL;
            if (poiThirdPartyViewModel2 != null) {
                num = poiThirdPartyViewModel2.LLILZ;
            } else {
                num = null;
            }
            linkedHashMap.put("error_code", String.valueOf(num));
            PoiThirdPartyViewModel poiThirdPartyViewModel3 = this.LLILZLL;
            if (poiThirdPartyViewModel3 == null || (str = poiThirdPartyViewModel3.LLILZIL) == null) {
                str = "";
            }
            linkedHashMap.put("error_reason", str);
            PoiThirdPartyViewModel poiThirdPartyViewModel4 = this.LLILZLL;
            if (poiThirdPartyViewModel4 != null) {
                num2 = poiThirdPartyViewModel4.LLILZLL;
            } else {
                num2 = null;
            }
            linkedHashMap.put("origin_code", String.valueOf(num2));
            PoiThirdPartyViewModel poiThirdPartyViewModel5 = this.LLILZLL;
            if (poiThirdPartyViewModel5 == null || (str2 = poiThirdPartyViewModel5.LLIZ) == null) {
                str2 = "";
            }
            linkedHashMap.put("origin_reason", str2);
            SparkContext sparkContextLLIILZL = this.LLILLJJLI.LLIILZL();
            if (sparkContextLLIILZL != null && (strLJIJI = sparkContextLLIILZL.LJIJI()) != null) {
                str3 = strLJIJI;
            }
            linkedHashMap.put("url", str3);
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("poi_third_party_page_not_found", linkedHashMap, null);
        } else {
            PoiThirdPartyViewModel poiThirdPartyViewModel6 = this.LLILZLL;
            if (poiThirdPartyViewModel6 != null) {
                poiThirdPartyViewModel6.vQ2(EnumC1892960zMM.NOT_NET);
            }
            C1749280vcc c1749280vcc2 = this.LLILZ;
            if (c1749280vcc2 == null) {
                c1749280vcc2 = null;
            }
            C1722300uv6 c1722300uv62 = new C1722300uv6();
            AwS572S0100000_28 awS572S0100000_282 = new AwS572S0100000_28(interfaceC1051240dSk, 11);
            Context context3 = this.LLILZIL;
            if (context3 == null || (string = context3.getString(2131821902)) == null) {
                string = "";
            }
            c1722300uv62.LJI = string;
            Context context4 = this.LLILZIL;
            if (context4 != null && (string2 = context4.getString(2131821901)) != null) {
                str3 = string2;
            }
            c1722300uv62.LJIIIIZZ = str3;
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = com.zhiliaoapp.musically.R.raw.icon_large_wifi_slash;
            c419910GdJ2.LJ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.a1p);
            c1722300uv62.LIZJ = 0;
            c1722300uv62.LIZIZ = c419910GdJ2;
            c1722300uv62.LJIIIZ = new AwS607S0100000_28(awS572S0100000_282, 15);
            c1749280vcc2.setStatus(c1722300uv62);
        }
        Context context5 = this.LLILZIL;
        if (context5 != null && (numLIZJ = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.bx, context5)) != null) {
            int iIntValue = numLIZJ.intValue();
            C1749280vcc c1749280vcc3 = this.LLILZ;
            if (c1749280vcc3 == null) {
                c1749280vcc3 = null;
            }
            c1749280vcc3.setBackgroundColor(iIntValue);
        }
        C1749280vcc c1749280vcc4 = this.LLILZ;
        if (c1749280vcc4 == null) {
            c1749280vcc4 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc4, 0);
        C1749280vcc c1749280vcc5 = this.LLILZ;
        if (c1749280vcc5 == null) {
            return null;
        }
        return c1749280vcc5;
    }

    public C1893030zMT(C1892870zMD c1892870zMD, String str) {
        this.LLILLJJLI = c1892870zMD;
        this.LLILLL = str;
    }
}
