package X;

import com.ss.android.ugc.aweme.hangout.component.distribute.viewmodel.MultiTopLiveDistributeVM;

/* JADX INFO: renamed from: X.0IoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.distribute.viewmodel.MultiTopLiveDistributeVM", f = "MultiTopLiveDistributeVM.kt", l = {176}, m = "fetchDistributeItems")
public final class C477670IoH extends AbstractC23140094w {
    public EnumC479370Ir1 LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ MultiTopLiveDistributeVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C477670IoH(MultiTopLiveDistributeVM multiTopLiveDistributeVM, InterfaceC1364105Vn<? super C477670IoH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = multiTopLiveDistributeVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLiveDistributeVM@dee1.fetchDistributeItems$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZ.wQ2(null, this);
        C1C7U.LIZIZ("MultiTopLiveDistributeVM@dee1.fetchDistributeItems$1");
        return objWQ2;
    }
}
