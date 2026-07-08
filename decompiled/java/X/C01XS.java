package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01XS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.mob.ProfileIdentifierMobHelper$mobComponentClick$1", f = "ProfileIdentifierMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C01XS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ n LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01XS(n nVar, InterfaceC1364105Vn<? super C01XS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01XS(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileIdentifierMobHelper@8587.mobComponentClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Map map = (Map) C08JS.LIZ(this.LL.toString(), new LinkedHashMap().getClass());
            if (map != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJII(map);
                C1251280ifO.LIZ("org_identifier_click", c2344009Gk.LIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileIdentifierMobHelper@8587.mobComponentClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
