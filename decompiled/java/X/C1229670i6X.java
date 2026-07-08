package X;

import com.ss.android.ugc.aweme.publicgroup.assem.GroupListAssem;
import com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i6X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.assem.GroupListAssem$onPublicGroupCreateFinishEvent$1", f = "GroupListAssem.kt", l = {336, 337}, m = "invokeSuspend")
public final class C1229670i6X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GroupListAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1229670i6X(GroupListAssem groupListAssem, InterfaceC1364105Vn<? super C1229670i6X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupListAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1229670i6X(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupListAssem@3935.onPublicGroupCreateFinishEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GroupListAssem@3935.onPublicGroupCreateFinishEvent$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("GroupListAssem@3935.onPublicGroupCreateFinishEvent$1");
                return objLJFF;
            }
        }
        GroupListViewModel groupListViewModelIp = this.LLILLJJLI.ip();
        this.LL = 2;
        if (groupListViewModelIp.vQ2(false, this) == objLJFF) {
            C1C7U.LIZIZ("GroupListAssem@3935.onPublicGroupCreateFinishEvent$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GroupListAssem@3935.onPublicGroupCreateFinishEvent$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
