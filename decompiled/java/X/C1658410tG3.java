package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0tG3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.viewmodel.component.CenterViewModelDelegate$uiState$1", f = "CenterViewModelDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1658410tG3 extends C09AX implements InterfaceC1631620sYq<C1660100tIm<InterfaceC1659860tIO>, AbstractC1665600tRe, InterfaceC1364105Vn<? super C1658500tGC>, Object> {
    public /* synthetic */ C1660100tIm LL;
    public /* synthetic */ AbstractC1665600tRe LLILLJJLI;

    public C1658410tG3(InterfaceC1364105Vn<? super C1658410tG3> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CenterViewModelDelegate@bea0.uiState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1658500tGC c1658500tGC = new C1658500tGC(this.LL, this.LLILLJJLI, 2);
        C1C7U.LIZIZ("CenterViewModelDelegate@bea0.uiState$1");
        return c1658500tGC;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1660100tIm<InterfaceC1659860tIO> c1660100tIm, AbstractC1665600tRe abstractC1665600tRe, InterfaceC1364105Vn<? super C1658500tGC> interfaceC1364105Vn) {
        C1658410tG3 c1658410tG3 = new C1658410tG3(interfaceC1364105Vn);
        c1658410tG3.LL = c1660100tIm;
        c1658410tG3.LLILLJJLI = abstractC1665600tRe;
        return c1658410tG3.invokeSuspend(Unit.LIZ);
    }
}
