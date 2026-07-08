package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xy0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.client.ConversationListModelImpl$batchDeleteConversations$$inlined$bridge$default$1", f = "ConversationListModelImpl.kt", l = {102}, m = "invokeSuspend")
public final class C865900Xy0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC863600XuI LLILLJJLI;
    public final /* synthetic */ C866710XzJ LLILLL;
    public final /* synthetic */ List LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865900Xy0(InterfaceC863600XuI interfaceC863600XuI, InterfaceC1364105Vn interfaceC1364105Vn, C866710XzJ c866710XzJ, List list, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC863600XuI;
        this.LLILLL = c866710XzJ;
        this.LLILZ = list;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865900Xy0(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0Y6Q c0y6qLIZIZ;
        C1C7U.LIZ("ConversationListModelImpl@8f5d.batchDeleteConversations$$inlined$bridge$default$1");
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
                InterfaceC866310Xyf interfaceC866310XyfLIZIZ = this.LLILLL.LIZIZ.LIZIZ();
                List<String> list = this.LLILZ;
                boolean z = this.LLILZIL;
                this.LL = 1;
                obj = interfaceC866310XyfLIZIZ.LJIIZILJ(list, z, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ConversationListModelImpl@8f5d.batchDeleteConversations$$inlined$bridge$default$1");
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
        C1C7U.LIZIZ("ConversationListModelImpl@8f5d.batchDeleteConversations$$inlined$bridge$default$1");
        return unit;
    }
}
