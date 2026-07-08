package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SMR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2$warmUpCachedBitmap$1$1", f = "SmartImagePhotoViewHolderV2.kt", l = {}, m = "invokeSuspend")
public final class C0SMR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SmartImagePhotoViewHolderV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SMR(SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2, InterfaceC1364105Vn<? super C0SMR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = smartImagePhotoViewHolderV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SMR(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapLIZIZ;
        C1C7U.LIZ("SmartImagePhotoViewHolderV2@a051.warmUpCachedBitmap$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2 = this.LL;
        UrlModel urlModel = smartImagePhotoViewHolderV2.LLLLIL.LJIIZILJ;
        if (urlModel != null && (bitmapLIZIZ = C1331660kl2.LIZJ().LIZIZ(new C03IT(urlModel.getUrlList()))) != null && !bitmapLIZIZ.isRecycled()) {
            smartImagePhotoViewHolderV2.LJJIJIIJI(bitmapLIZIZ, false, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartImagePhotoViewHolderV2@a051.warmUpCachedBitmap$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
