package X;

import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorTabContactListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0hxc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorTabContactListVM$onRefresh$res$1", f = "SelectorTabContactListVM.kt", l = {76}, m = "invokeSuspend")
public final class C1224140hxc extends C09AX implements Function1<InterfaceC1364105Vn<? super AbstractC1223670hwr>, Object> {
    public int LL;
    public final /* synthetic */ SelectorTabContactListVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1224140hxc(SelectorTabContactListVM selectorTabContactListVM, InterfaceC1364105Vn<? super C1224140hxc> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = selectorTabContactListVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1224140hxc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectorTabContactListVM@8fd7.onRefresh$res$1");
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
            InterfaceC1224180hxg interfaceC1224180hxgLIZIZ = this.LLILLJJLI.yQ2().LIZIZ();
            this.LL = 1;
            obj = interfaceC1224180hxgLIZIZ.LJJIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SelectorTabContactListVM@8fd7.onRefresh$res$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SelectorTabContactListVM@8fd7.onRefresh$res$1");
        return obj;
    }
}
