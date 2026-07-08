package X;

import com.ss.android.ugc.aweme.social.creation.record.viewmodel.RecordViewModel;
import com.ss.android.ugc.aweme.social.creation.record.viewmodel.RecordViewModelState;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tG0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.viewmodel.RecordViewModel$uiState$1", f = "RecordViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1658380tG0 extends C09AX implements InterfaceC2280181EMu<C1665700tRo, C1658500tGC, C1658470tG9, EnumC1656620tDA, C1632540saK, C1683130ttv, C1658370tFz, InterfaceC1364105Vn<? super RecordViewModelState>, Object> {
    public /* synthetic */ C1665700tRo LL;
    public /* synthetic */ C1658500tGC LLILLJJLI;
    public /* synthetic */ C1658470tG9 LLILLL;
    public /* synthetic */ EnumC1656620tDA LLILZ;
    public /* synthetic */ C1632540saK LLILZIL;
    public /* synthetic */ C1683130ttv LLILZLL;
    public final /* synthetic */ RecordViewModel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1658380tG0(RecordViewModel recordViewModel, InterfaceC1364105Vn<? super C1658380tG0> interfaceC1364105Vn) {
        super(8, interfaceC1364105Vn);
        this.LLIZ = recordViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordViewModel@3296.uiState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1665700tRo c1665700tRo = this.LL;
        C1658500tGC c1658500tGC = this.LLILLJJLI;
        C1658470tG9 c1658470tG9 = this.LLILLL;
        EnumC1656620tDA enumC1656620tDA = this.LLILZ;
        C1632540saK c1632540saK = this.LLILZIL;
        RecordViewModelState recordViewModelState = new RecordViewModelState(c1665700tRo, c1658500tGC, c1658470tG9, this.LLILZLL, c1632540saK.LIZIZ, c1632540saK.LIZ, C1658350tFx.LIZ(enumC1656620tDA), this.LLIZ.LLIZLLLIL, new C1658370tFz(false, 15));
        RecordViewModel recordViewModel = this.LLIZ;
        RecordViewModelState recordViewModelStateZ20 = ((InterfaceC1648760t0U) recordViewModel.LLILZLL.getValue(recordViewModel, RecordViewModel.LLJI[4])).z20(recordViewModelState);
        C1C7U.LIZIZ("RecordViewModel@3296.uiState$1");
        return recordViewModelStateZ20;
    }

    @Override // X.InterfaceC2280181EMu
    public final Object dN(C1665700tRo c1665700tRo, C1658500tGC c1658500tGC, C1658470tG9 c1658470tG9, EnumC1656620tDA enumC1656620tDA, C1632540saK c1632540saK, C1683130ttv c1683130ttv, C1658370tFz c1658370tFz, InterfaceC1364105Vn<? super RecordViewModelState> interfaceC1364105Vn) {
        C1658380tG0 c1658380tG0 = new C1658380tG0(this.LLIZ, interfaceC1364105Vn);
        c1658380tG0.LL = c1665700tRo;
        c1658380tG0.LLILLJJLI = c1658500tGC;
        c1658380tG0.LLILLL = c1658470tG9;
        c1658380tG0.LLILZ = enumC1656620tDA;
        c1658380tG0.LLILZIL = c1632540saK;
        c1658380tG0.LLILZLL = c1683130ttv;
        return c1658380tG0.invokeSuspend(Unit.LIZ);
    }
}
