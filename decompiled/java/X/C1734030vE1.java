package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetResCfg;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vE1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.mallstatus.controller.tab.handler.EcMallTabStatusHandlerForBackButton$onMallStatusChanged$2", f = "EcMallTabStatusHandlerForBackButton.kt", l = {78}, m = "invokeSuspend")
public final class C1734030vE1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<n> LLILLJJLI;
    public final /* synthetic */ C1740940vPA LLILLL;
    public final /* synthetic */ C1767790w6T LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734030vE1(AnonymousClass0957<n> anonymousClass0957, C1740940vPA c1740940vPA, C1767790w6T c1767790w6T, InterfaceC1364105Vn<? super C1734030vE1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = c1740940vPA;
        this.LLILZ = c1767790w6T;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1734030vE1(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Type type;
        C1C7U.LIZ("EcMallTabStatusHandlerForBackButton@768.onMallStatusChanged$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<n> anonymousClass0957 = this.LLILLJJLI;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcMallTabStatusHandlerForBackButton@768.onMallStatusChanged$2");
                return objLJFF;
            }
        }
        k kVar = (k) obj;
        DiversionTargetResCfg diversionTargetResCfg = null;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                z = false;
            }
            if (!z) {
                type = new TypeToken<DiversionTargetResCfg>() { // from class: X.0vE2
                }.getType();
            } else {
                type = C2371409Qy.LIZJ(C13LE.LJII(DiversionTargetResCfg.class));
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, kVar, type);
            if (!(objFromJson instanceof DiversionTargetResCfg)) {
                objFromJson = null;
            }
            diversionTargetResCfg = (DiversionTargetResCfg) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (diversionTargetResCfg != null) {
            this.LLILLL.LIZLLL(diversionTargetResCfg, this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMallTabStatusHandlerForBackButton@768.onMallStatusChanged$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
