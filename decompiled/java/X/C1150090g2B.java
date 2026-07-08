package X;

import Y.AfS186S0100000_17;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.api.ILocationPickerService;
import com.bytedance.android.live.wallet.data.model.exchange.DefaultLocationData;
import com.bytedance.android.live.wallet.model.LocationAddress;
import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveShouldFetchLocationCodeListSettings;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0g2B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150090g2B implements InterfaceC1134930fdj {
    public static final C1150090g2B LIZ = new C1150090g2B();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static C1270404y6 LIZJ;

    public static C1270404y6 LIZLLL() {
        String strCurrentRegionCode;
        C006A c006aLIZJ = null;
        try {
            c006aLIZJ = C1161920gLG.LIZJ(IHostAppContext.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        IHostAppContext iHostAppContext = (IHostAppContext) c006aLIZJ;
        if (iHostAppContext == null || (strCurrentRegionCode = iHostAppContext.currentRegionCode()) == null) {
            strCurrentRegionCode = "";
        }
        C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
        String str = "region_" + strCurrentRegionCode.toLowerCase(Locale.ROOT);
        c1124870fNVLIZJ.getClass();
        String strLIZIZ = C1124870fNV.LIZIZ(str);
        if (strLIZIZ == null || !(!a0.LJJJIL(strLIZIZ))) {
            strLIZIZ = strCurrentRegionCode;
        }
        String str2 = null;
        return new C1270404y6(strLIZIZ, str2, str2, str2, 62);
    }

    @Override // X.InterfaceC1134930fdj
    public final boolean LIZ(long j, C1134410fct c1134410fct, DataChannel dataChannel, String str) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1270404y6 LIZIZ() {
        /*
            X.0JT6<java.lang.String> r0 = X.C0U53.f124de     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r0.LIZ()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto Lc
            java.lang.String r2 = ""
        Lc:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L10
            goto L1c
        L10:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L1c:
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            r5 = 0
            if (r0 == 0) goto L24
            r2 = r5
        L24:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L74
            boolean r0 = kotlin.text.a0.LJJJIL(r2)
            if (r0 != 0) goto L74
            com.google.gson.Gson r1 = X.C19748512Ol.LIZJ     // Catch: java.lang.Throwable -> L56
            java.lang.Class<X.04y7> r0 = X.C1270504y7.class
            java.lang.Object r6 = r1.LJII(r2, r0)     // Catch: java.lang.Throwable -> L56
            X.04y7 r6 = (X.C1270504y7) r6     // Catch: java.lang.Throwable -> L56
            r3 = 0
            if (r6 == 0) goto L54
            long r1 = r6.LIZIZ     // Catch: java.lang.Throwable -> L56
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L54
            long r3 = X.C158B.LIZ()     // Catch: java.lang.Throwable -> L56
            long r3 = r3 - r1
            r1 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L54
            X.04y6 r0 = r6.LIZ     // Catch: java.lang.Throwable -> L56
        L50:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L56
            goto L62
        L54:
            r0 = r5
            goto L50
        L56:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L62:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r2 != 0) goto L6c
            r5 = r0
        L69:
            X.04y6 r5 = (X.C1270404y6) r5
            return r5
        L6c:
            java.lang.String r1 = "TaxUtils"
            java.lang.String r0 = "parse default location cache failed"
            X.C20441214yg.LJFF(r1, r0, r2)
            goto L69
        L74:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1150090g2B.LIZIZ():X.04y6");
    }

    public static boolean LJII() {
        C006A c006aLIZJ;
        String strCurrentRegionCode;
        try {
            c006aLIZJ = C1161920gLG.LIZJ(IHostAppContext.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c006aLIZJ = null;
        }
        IHostAppContext iHostAppContext = (IHostAppContext) c006aLIZJ;
        if (iHostAppContext == null || (strCurrentRegionCode = iHostAppContext.currentRegionCode()) == null) {
            strCurrentRegionCode = "";
        }
        return LiveShouldFetchLocationCodeListSettings.INSTANCE.enable(strCurrentRegionCode);
    }

    public static final C1270404y6 LIZJ() {
        if (!LJII()) {
            return LIZLLL();
        }
        if (LIZJ == null) {
            LIZJ = LIZIZ();
        }
        C1270404y6 c1270404y6 = LIZJ;
        return c1270404y6 == null ? LIZLLL() : c1270404y6;
    }

    public static void LJFF(Function1 function1) {
        try {
            IWalletExchange iWalletExchangeWalletExchange = C1148670fzt.LIZ().walletExchange();
            Map mapLJ = C2097608Jq.LJ();
            ((WalletExchange) iWalletExchangeWalletExchange).getClass();
            C1149970g1z.LIZ(new LinkedHashMap(mapLJ)).LJIL(new InterfaceC1487280oo2() { // from class: X.0g1t
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    DefaultLocationData defaultLocationData = (DefaultLocationData) obj;
                    return new com.bytedance.android.live.wallet.model.DefaultLocationData(defaultLocationData.country, defaultLocationData.state, defaultLocationData.county, defaultLocationData.city, defaultLocationData.LIZ, defaultLocationData.LIZIZ);
                }
            }).LJJIIZ(new AfS186S0100000_17(function1, 90), new AfS186S0100000_17(function1, 91));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (function1 != null) {
                function1.invoke(null);
            }
            C20441214yg.LJFF("TaxUtils", "request default location failed", e);
        }
    }

    public static void LJI(C1270404y6 c1270404y6) {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            String strLJIILL = C19748512Ol.LIZJ.LJIILL(new C1270504y7(c1270404y6, C158B.LIZ()));
            try {
                C0U53.f124de.LIZJ(strLJIILL);
                c098200Yq2 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                C0JT6<String> c0jt6 = C0U53.f124de;
                c0jt6.LIZ.LJFF(new HashMap<>());
                c0jt6.LIZJ(strLJIILL);
            }
            c098200Yq = C189200o6.m1boximpl(c098200Yq2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("TaxUtils", "save default location cache failed", thM5exceptionOrNullimpl);
        }
    }

    public final void LJ(Context context, final AwS383S0200000_17 awS383S0200000_17) {
        if (context == null) {
            return;
        }
        C1270404y6 c1270404y6LIZJ = LIZJ();
        LIZ.getClass();
        if (!Intrinsics.LJFF(c1270404y6LIZJ.LIZ, "United States") && !Intrinsics.LJFF(c1270404y6LIZJ.LIZ, "Canada")) {
            return;
        }
        ((ILocationPickerService) C1161920gLG.LIZJ(ILocationPickerService.class)).sH0(context, c1270404y6LIZJ.LIZ, c1270404y6LIZJ.toString(), new InterfaceC21691419uq() { // from class: X.0g2A
            @Override // X.InterfaceC21691419uq
            public final void LJIIJ(String str) {
            }

            @Override // X.InterfaceC21691419uq
            public final void LIZ(boolean z, LocationAddress locationAddress) {
                String str;
                String str2;
                String str3;
                String str4;
                LocationObject locationObject;
                if (!z) {
                    return;
                }
                C1150090g2B.LIZ.getClass();
                LocationObject locationObject2 = locationAddress.region;
                String str5 = "";
                if (locationObject2 == null || (str = locationObject2.name) == null) {
                    str = "";
                }
                LocationObject locationObject3 = locationAddress.province;
                if (locationObject3 == null || (str2 = locationObject3.name) == null) {
                    str2 = "";
                }
                if (str2.length() <= 0 && ((locationObject = locationAddress.state) == null || (str2 = locationObject.name) == null)) {
                    str2 = "";
                }
                LocationObject locationObject4 = locationAddress.county;
                if (locationObject4 == null || (str3 = locationObject4.name) == null) {
                    str3 = "";
                }
                LocationObject locationObject5 = locationAddress.city;
                if (locationObject5 != null && (str4 = locationObject5.name) != null) {
                    str5 = str4;
                }
                C1270404y6 c1270404y6 = new C1270404y6(str, str2, str3, str5, 48);
                C1150090g2B.LIZJ = c1270404y6;
                C1150090g2B.LJI(c1270404y6);
                Function1<String, Unit> function1 = awS383S0200000_17;
                if (function1 != null) {
                    function1.invoke(c1270404y6.toString());
                }
            }
        }, null);
    }
}
