package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Hs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.resize.StickerBitmapResizeHelperKt$saveBitImgBitmap$2", f = "StickerBitmapResizeHelper.kt", l = {}, m = "invokeSuspend")
public final class C2347409Hs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Bitmap.CompressFormat LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2347409Hs(int i, int i2, int i3, Bitmap.CompressFormat compressFormat, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = str2;
        this.LLILZLL = compressFormat;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LL;
        return new C2347409Hs(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZLL, str, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StickerBitmapResizeHelperKt@959a.saveBitImgBitmap$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C2286708xd.LIZJ(this.LL)) {
            C1C7U.LIZIZ("StickerBitmapResizeHelperKt@959a.saveBitImgBitmap$2");
            return false;
        }
        Bitmap bitmapLJI = C2475309mx.LJI(this.LLILLJJLI, this.LLILLL, C2475309mx.LIZIZ(this.LL), this.LLILZ, this.LL);
        if (bitmapLJI == null) {
            C1C7U.LIZIZ("StickerBitmapResizeHelperKt@959a.saveBitImgBitmap$2");
            return false;
        }
        Boolean boolValueOf = Boolean.valueOf(C2475309mx.LJFF(100, this.LLILZLL, bitmapLJI, new C0VSJ(this.LLILZIL)));
        C1C7U.LIZIZ("StickerBitmapResizeHelperKt@959a.saveBitImgBitmap$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
