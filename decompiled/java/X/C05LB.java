package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05LB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.refresh.MessageRefreshWorkerV2Impl$refreshUserCards$2", f = "MessageRefreshWorkerV2Impl.kt", l = {156, 157}, m = "invokeSuspend")
public final class C05LB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ Set<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LB(Set<String> set, InterfaceC1364105Vn<? super C05LB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = set;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LB(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Set<String> set;
        C1C7U.LIZ("MessageRefreshWorkerV2Impl@a39d.refreshUserCards$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    set = (Set) this.LL;
                    C155000ia.LIZIZ(obj);
                    IMContactApi.LIZ.getClass();
                    C069P.LIZ().LJ().LJJIII(C13LP.LLIIII(set));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MessageRefreshWorkerV2Impl@a39d.refreshUserCards$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMContactApi.LIZ.getClass();
            InterfaceC1725106pF interfaceC1725106pFLIZ = C069P.LIZ().LIZ();
            List listLLIIII = C13LP.LLIIII(this.LLILLL);
            this.LLILLJJLI = 1;
            obj = interfaceC1725106pFLIZ.LJII("im_chat_message_usercard", listLLIIII, this, false, false, false);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MessageRefreshWorkerV2Impl@a39d.refreshUserCards$2");
                return objLJFF;
            }
        }
        set = this.LLILLL;
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        C1483005rI c1483005rI = new C1483005rI(1);
        this.LL = set;
        this.LLILLJJLI = 2;
        if (c1bgsLJ.LJJIFFI((List) obj, c1483005rI, this) == objLJFF) {
            C1C7U.LIZIZ("MessageRefreshWorkerV2Impl@a39d.refreshUserCards$2");
            return objLJFF;
        }
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LJ().LJJIII(C13LP.LLIIII(set));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MessageRefreshWorkerV2Impl@a39d.refreshUserCards$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
