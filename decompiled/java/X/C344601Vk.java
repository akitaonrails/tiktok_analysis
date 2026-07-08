package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.services.ICreatorToolService;
import com.ss.android.ugc.profile.business.user.creator.product.ContentCellCreatorToolProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Vk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.user.creator.product.ContentCellCreatorToolProtocol$componentClick$1", f = "ContentCellCreatorToolProtocol.kt", l = {88}, m = "invokeSuspend")
public final class C344601Vk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ContentCellCreatorToolProtocol LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344601Vk(ContentCellCreatorToolProtocol contentCellCreatorToolProtocol, InterfaceC1364105Vn<? super C344601Vk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = contentCellCreatorToolProtocol;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C344601Vk c344601Vk = new C344601Vk(this.LLILLL, interfaceC1364105Vn);
        c344601Vk.LLILLJJLI = obj;
        return c344601Vk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("ContentCellCreatorToolProtocol@4bbd.componentClick$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ICreatorToolService iCreatorToolService = (ICreatorToolService) this.LLILLL.LLLFF.getValue();
            if (iCreatorToolService != null) {
                this.LL = 1;
                if (iCreatorToolService.LIZ(this) == objLJFF) {
                    C1C7U.LIZIZ("ContentCellCreatorToolProtocol@4bbd.componentClick$1");
                    return objLJFF;
                }
            } else {
                unit = null;
                C189200o6.m2constructorimpl(unit);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("ContentCellCreatorToolProtocol@4bbd.componentClick$1");
                return unit2;
            }
        }
        unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("ContentCellCreatorToolProtocol@4bbd.componentClick$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
