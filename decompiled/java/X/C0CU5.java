package X;

import com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0CU5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.QRCodeResultOpenHelper$open$2$resolvedText$1", f = "QRCodeResultOpenHelper.kt", l = {}, m = "invokeSuspend")
public final class C0CU5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ IQRCodeServiceForVisualSearch LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CU5(IQRCodeServiceForVisualSearch iQRCodeServiceForVisualSearch, String str, InterfaceC1364105Vn<? super C0CU5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iQRCodeServiceForVisualSearch;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CU5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QRCodeResultOpenHelper@64fd.open$2$resolvedText$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZIZ = this.LL.LIZIZ(this.LLILLJJLI);
        String str = this.LLILLJJLI;
        if (a0.LJJJIL(strLIZIZ)) {
            strLIZIZ = str;
        }
        C1C7U.LIZIZ("QRCodeResultOpenHelper@64fd.open$2$resolvedText$1");
        return strLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
