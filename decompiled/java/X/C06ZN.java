package X;

import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06ZN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel$emitMentionPanelEvent$1", f = "ShareContactListViewModel.kt", l = {141}, m = "invokeSuspend")
public final class C06ZN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ShareContactListViewModel LLILLJJLI;
    public final /* synthetic */ C0I1F LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06ZN(ShareContactListViewModel shareContactListViewModel, C0I1F c0i1f, InterfaceC1364105Vn<? super C06ZN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = shareContactListViewModel;
        this.LLILLL = c0i1f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06ZN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareContactListViewModel@dcfa.emitMentionPanelEvent$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLIZLLLIL;
            C0I1F c0i1f = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(c0i1f, this) == objLJFF) {
                C1C7U.LIZIZ("ShareContactListViewModel@dcfa.emitMentionPanelEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareContactListViewModel@dcfa.emitMentionPanelEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
