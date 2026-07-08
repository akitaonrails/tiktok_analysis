package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05FS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.ocr.OCRVerifyViewModel$init$1$1", f = "OCRVerifyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C05FS extends C09AX implements InterfaceC1631620sYq<C1713570uh1, String, InterfaceC1364105Vn<? super String>, Object> {
    public /* synthetic */ Object LL;

    public C05FS(InterfaceC1364105Vn<? super C05FS> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OCRVerifyViewModel@d3ed.init$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        C1C7U.LIZIZ("OCRVerifyViewModel@d3ed.init$1$1");
        return obj2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1713570uh1 c1713570uh1, String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        C05FS c05fs = new C05FS(interfaceC1364105Vn);
        c05fs.LL = str;
        return c05fs.invokeSuspend(Unit.LIZ);
    }
}
