package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05L3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.GroupMemberUtil$getGroupMemberList$callback$1$onSuccess$2$2", f = "GroupMemberUtil.kt", l = {205, 206}, m = "invokeSuspend")
public final class C05L3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05L3(List<String> list, InterfaceC1364105Vn<? super C05L3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05L3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupMemberUtil@7ee8.getGroupMemberList$callback$1$onSuccess$2$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GroupMemberUtil@7ee8.getGroupMemberList$callback$1$onSuccess$2$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMContactApi.LIZ.getClass();
            InterfaceC1725106pF interfaceC1725106pFLIZ = C069P.LIZ().LIZ();
            List<String> list = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC1725106pFLIZ.LJII("im_chat_group", list, this, false, false, false);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GroupMemberUtil@7ee8.getGroupMemberList$callback$1$onSuccess$2$2");
                return objLJFF;
            }
        }
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        C1483005rI c1483005rI = new C1483005rI(1);
        this.LL = 2;
        if (c1bgsLJ.LJJIFFI((List) obj, c1483005rI, this) == objLJFF) {
            C1C7U.LIZIZ("GroupMemberUtil@7ee8.getGroupMemberList$callback$1$onSuccess$2$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GroupMemberUtil@7ee8.getGroupMemberList$callback$1$onSuccess$2$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
