package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.client.ConversationModelImpl$batchSetMemberRole$$inlined$bridge$default$1", f = "ConversationModelImpl.kt", l = {102}, m = "invokeSuspend")
public final class C866170XyR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC863600XuI LLILLJJLI;
    public final /* synthetic */ C866530Xz1 LLILLL;
    public final /* synthetic */ List LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Map LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C866170XyR(InterfaceC863600XuI interfaceC863600XuI, InterfaceC1364105Vn interfaceC1364105Vn, C866530Xz1 c866530Xz1, List list, int i, Map map) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC863600XuI;
        this.LLILLL = c866530Xz1;
        this.LLILZ = list;
        this.LLILZIL = i;
        this.LLILZLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C866170XyR(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0Y6Q c0y6qLIZIZ;
        C1C7U.LIZ("ConversationModelImpl@4b41.batchSetMemberRole$$inlined$bridge$default$1");
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
                List list = this.LLILZ;
                int i2 = this.LLILZIL;
                Map mapLJ = this.LLILZLL;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                this.LL = 1;
                obj = interfaceC866190XyTLJI.LJI(i2, str, list, mapLJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ConversationModelImpl@4b41.batchSetMemberRole$$inlined$bridge$default$1");
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
        C867000Xzm.LIZIZ(c0y6qLIZIZ, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConversationModelImpl@4b41.batchSetMemberRole$$inlined$bridge$default$1");
        return unit;
    }
}
