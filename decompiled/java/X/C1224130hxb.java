package X;

import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorTabContactListVM;

/* JADX INFO: renamed from: X.0hxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorTabContactListVM", f = "SelectorTabContactListVM.kt", l = {73}, m = "onRefresh")
public final class C1224130hxb extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SelectorTabContactListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1224130hxb(SelectorTabContactListVM selectorTabContactListVM, InterfaceC1364105Vn<? super C1224130hxb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = selectorTabContactListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectorTabContactListVM@8fd7.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("SelectorTabContactListVM@8fd7.onRefresh$1");
        return objOnRefresh;
    }
}
