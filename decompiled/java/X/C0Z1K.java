package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z1K, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "detailpage.actions.ViewProfileActionKt$updateUser$1", f = "ViewProfileAction.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C0Z1K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0Z1M LLILLJJLI;
    public final /* synthetic */ AtomicReference<IMUser> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z1K(C0Z1M c0z1m, AtomicReference<IMUser> atomicReference, InterfaceC1364105Vn<? super C0Z1K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0z1m;
        this.LLILLL = atomicReference;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z1K(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2252331DDr c2252331DDrLIZJ = this.LLILLJJLI.LIZJ();
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLL, 60);
            this.LL = 1;
            c2252331DDrLIZJ.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDrLIZJ, agS295S0100000_14, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
