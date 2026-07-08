package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0mlg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.policy.CompliancePolicyMonitor$registerSmartRouterMonitor$1$onOpen$1", f = "CompliancePolicyMonitor.kt", l = {}, m = "invokeSuspend")
public final class C1408940mlg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Intent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408940mlg(Intent intent, InterfaceC1364105Vn<? super C1408940mlg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408940mlg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CompliancePolicyMonitor@fb7f.registerSmartRouterMonitor$1$onOpen$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Intent intent = this.LL;
        String string = null;
        try {
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        string = extras.getString("url");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (string != null && string.length() != 0) {
                List<String> list = C1408950mlh.LIZIZ;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<String> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (u.LJJIIJZLJL(string, it2.next(), false)) {
                            C1408970mlj.LIZ.getClass();
                            String value = EnumC1408960mli.POLICY_URL_REQUEST.getValue();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ(EnumC1408980mlk.POLICY_URL.getValue(), string);
                            C20684815ws.LJIILLIIL(value, c2344009Gk.LIZ);
                            break;
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CompliancePolicyMonitor@fb7f.registerSmartRouterMonitor$1$onOpen$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
