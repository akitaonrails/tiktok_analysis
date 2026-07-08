package X;

import com.bytedance.pipo.stellar.base.fragment.StellarViewModel;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.resourceloader.StellarChunk;

/* JADX INFO: renamed from: X.0uri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.stellar.base.fragment.StellarViewModel", f = "StellarViewModel.kt", l = {340}, m = "handleSuccessResponse")
public final class C1720200uri extends AbstractC23140094w {
    public StellarChunk LL;
    public StellarChunk LLILLJJLI;
    public CardDO LLILLL;
    public C1720310urt LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ StellarViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1720200uri(StellarViewModel stellarViewModel, InterfaceC1364105Vn<? super C1720200uri> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = stellarViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StellarViewModel@1bbc.handleSuccessResponse$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZLL.wQ2(null, this);
        C1C7U.LIZIZ("StellarViewModel@1bbc.handleSuccessResponse$1");
        return objWQ2;
    }
}
