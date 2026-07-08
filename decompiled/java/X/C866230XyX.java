package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.client.ConversationModelImpl$removeMember$$inlined$bridge$default$1", f = "ConversationModelImpl.kt", l = {119}, m = "invokeSuspend")
public final class C866230XyX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC867020Xzo LLILLJJLI;
    public final /* synthetic */ C866530Xz1 LLILLL;
    public final /* synthetic */ List LLILZ;
    public final /* synthetic */ Map LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C866230XyX(InterfaceC867020Xzo interfaceC867020Xzo, InterfaceC1364105Vn interfaceC1364105Vn, C866530Xz1 c866530Xz1, List list, Map map) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC867020Xzo;
        this.LLILLL = c866530Xz1;
        this.LLILZ = list;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C866230XyX(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0Y6Q c0y6qLIZIZ;
        C1C7U.LIZ("ConversationModelImpl@4b41.removeMember$$inlined$bridge$default$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC866190XyT interfaceC866190XyTLJI = this.LLILLL.LIZJ.LIZIZ().LJI();
                String str = this.LLILLL.LIZIZ;
                List<Long> list = this.LLILZ;
                Map<String, String> mapLJ = this.LLILZIL;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                this.LL = 1;
                obj = interfaceC866190XyTLJI.LJ(str, list, mapLJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ConversationModelImpl@4b41.removeMember$$inlined$bridge$default$1");
                    return objLJFF;
                }
            }
            c0y6qLIZIZ = (C0Y6Q) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1, message, th));
        }
        C867000Xzm.LIZJ(c0y6qLIZIZ, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConversationModelImpl@4b41.removeMember$$inlined$bridge$default$1");
        return unit;
    }
}
