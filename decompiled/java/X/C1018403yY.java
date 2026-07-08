package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03yY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.helper.ECAsyncLogger$sendLog$1", f = "ECAsyncLogger.kt", l = {}, m = "invokeSuspend")
public final class C1018403yY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1018403yY(String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1018403yY(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn, this.LL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECAsyncLogger@e314.sendLog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        String str = this.LLILLJJLI;
        Map<String, Object> map = this.LLILLL;
        try {
            if (z) {
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                JSONObject jSONObjectLIZ = C1018503yZ.LIZ(map);
                c1507790pL7.getClass();
                C1507790pL7.LIZLLL(str, jSONObjectLIZ);
            } else {
                C1018703yb.LIZIZ(str, map);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECAsyncLogger@e314.sendLog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
