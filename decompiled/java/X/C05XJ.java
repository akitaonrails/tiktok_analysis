package X;

import android.net.Uri;
import android.util.Log;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.IThirdPartyUtilService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.05XJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cookie.IABClearCookieManager$recordUrlLoad$1", f = "IABClearCookieManager.kt", l = {}, m = "invokeSuspend")
public final class C05XJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05XJ(String str, InterfaceC1364105Vn<? super C05XJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05XJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IThirdPartyUtilService iThirdPartyUtilService;
        String host;
        C1C7U.LIZ("IABClearCookieManager@6094.recordUrlLoad$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        try {
            iThirdPartyUtilService = (IThirdPartyUtilService) PluggableExtentionKt.pluggableSpi$default(IThirdPartyUtilService.class, false, false, false, 14, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (iThirdPartyUtilService != null && iThirdPartyUtilService.LIZLLL(str)) {
            Uri uri = UriProtector.parse(str);
            if (uri != null && (host = uri.getHost()) != null && !a0.LJJJIL(host)) {
                List listLJLI = C13LQ.LJLI(Keva.getRepo("IABClearCookieManager").getStringArray("record_url", new String[0]));
                ArrayList arrayList = (ArrayList) listLJLI;
                if (arrayList.contains(host)) {
                    arrayList.remove(host);
                }
                arrayList.add(host);
                if (arrayList.size() > 200) {
                    arrayList.remove(0);
                }
                Keva.getRepo("IABClearCookieManager").storeStringArray("record_url", (String[]) listLJLI.toArray(new String[0]));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recordUrl: ");
                sbLIZ.append(host);
                sbLIZ.append(", recordCount: ");
                sbLIZ.append(arrayList.size());
                C189200o6.m2constructorimpl(C2286608xc.LJ(Log.i("IABClearCookieManager", C2188811AlT.LIZIZ(sbLIZ))));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("IABClearCookieManager@6094.recordUrlLoad$1");
                return unit;
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IABClearCookieManager@6094.recordUrlLoad$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("IABClearCookieManager@6094.recordUrlLoad$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
