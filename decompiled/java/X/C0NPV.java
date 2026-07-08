package X;

import com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel;

/* JADX INFO: renamed from: X.0NPV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel", f = "TakoRecordFragmentViewModel.kt", l = {74}, m = "awaitPhotoPreviewUri")
public final class C0NPV extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoRecordFragmentViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NPV(TakoRecordFragmentViewModel takoRecordFragmentViewModel, InterfaceC1364105Vn<? super C0NPV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = takoRecordFragmentViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoRecordFragmentViewModel@f921.awaitPhotoPreviewUri$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(this);
        C1C7U.LIZIZ("TakoRecordFragmentViewModel@f921.awaitPhotoPreviewUri$1");
        return objVQ2;
    }
}
