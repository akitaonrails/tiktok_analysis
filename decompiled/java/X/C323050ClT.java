package X;

import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSearchPageVM;

/* JADX INFO: renamed from: X.0ClT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSearchPageVM", f = "SelectorSearchPageVM.kt", l = {75}, m = "onRefresh")
public final class C323050ClT extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SelectorSearchPageVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323050ClT(SelectorSearchPageVM selectorSearchPageVM, InterfaceC1364105Vn<? super C323050ClT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = selectorSearchPageVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectorSearchPageVM@33f4.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("SelectorSearchPageVM@33f4.onRefresh$1");
        return objOnRefresh;
    }
}
