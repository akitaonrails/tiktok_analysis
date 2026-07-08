package X;

import com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch;

/* JADX INFO: renamed from: X.0Hid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.QRCodeResultOpenHelper", f = "QRCodeResultOpenHelper.kt", l = {40}, m = "open")
public final class C448690Hid extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C448680Hic LLILLL;
    public IQRCodeServiceForVisualSearch LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C448680Hic LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C448690Hid(C448680Hic c448680Hic, InterfaceC1364105Vn<? super C448690Hid> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c448680Hic;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QRCodeResultOpenHelper@64fd.open$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLIZLLLIL.LIZIZ(null, null, 0, null, 0, this);
        C1C7U.LIZIZ("QRCodeResultOpenHelper@64fd.open$1");
        return objLIZIZ;
    }
}
