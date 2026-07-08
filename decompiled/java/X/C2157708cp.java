package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingActivity;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingActivity$onCreate$3", f = "ECTrendingActivity.kt", l = {}, m = "invokeSuspend")
public final class C2157708cp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ECTrendingActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2157708cp(ECTrendingActivity eCTrendingActivity, InterfaceC1364105Vn<? super C2157708cp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = eCTrendingActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2157708cp(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECTrendingActivity@7ac3.onCreate$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String stringExtra = null;
        try {
            stringExtra = this.LL.getIntent().getStringExtra("is_from_external");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (Intrinsics.LJFF(stringExtra, "1")) {
            try {
                String stringExtra2 = this.LL.getIntent().getStringExtra("ec_track_params");
                if (stringExtra2 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    JSONObject jSONObject = new JSONObject(stringExtra2);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        linkedHashMap.put(next, jSONObject.get(next).toString());
                    }
                    C1507790pL7.LIZ.getClass();
                    C1507790pL7.LIZJ("tiktokec_deeplink_enter_page", linkedHashMap);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECTrendingActivity@7ac3.onCreate$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
