package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoDynamicBgColorComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SKR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoDynamicBgColorComponent$updateExtractColor$1$1", f = "PhotoDynamicBgColorComponent.kt", l = {280}, m = "invokeSuspend")
public final class C0SKR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0SKU>, Object> {
    public int LL;
    public final /* synthetic */ PhotoDynamicBgColorComponent LLILLJJLI;
    public final /* synthetic */ InterfaceC719460SKa LLILLL;
    public final /* synthetic */ Bitmap LLILZ;
    public final /* synthetic */ InterfaceC719460SKa LLILZIL;
    public final /* synthetic */ Bitmap LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ C12CL LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SKR(PhotoDynamicBgColorComponent photoDynamicBgColorComponent, InterfaceC719460SKa interfaceC719460SKa, Bitmap bitmap, InterfaceC719460SKa interfaceC719460SKa2, Bitmap bitmap2, float f, C12CL c12cl, InterfaceC1364105Vn<? super C0SKR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = photoDynamicBgColorComponent;
        this.LLILLL = interfaceC719460SKa;
        this.LLILZ = bitmap;
        this.LLILZIL = interfaceC719460SKa2;
        this.LLILZLL = bitmap2;
        this.LLIZ = f;
        this.LLIZLLLIL = c12cl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SKR(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String imageUrl;
        Bitmap bitmapLJIILIIL;
        String imageUrl2;
        C1C7U.LIZ("PhotoDynamicBgColorComponent@2fea.updateExtractColor$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C12CT c12ct = (C12CT) this.LLILLJJLI.LLJJLIIIJLLLLLLLZ.getValue();
            InterfaceC719460SKa interfaceC719460SKa = this.LLILLL;
            Bitmap bitmapLJIILIIL2 = null;
            if (interfaceC719460SKa != null) {
                imageUrl = interfaceC719460SKa.getImageUrl();
            } else {
                imageUrl = null;
            }
            Bitmap bitmap = this.LLILZ;
            InterfaceC719460SKa interfaceC719460SKa2 = this.LLILLL;
            if (interfaceC719460SKa2 != null) {
                bitmapLJIILIIL = interfaceC719460SKa2.LJIILIIL();
            } else {
                bitmapLJIILIIL = null;
            }
            InterfaceC719460SKa interfaceC719460SKa3 = this.LLILZIL;
            if (interfaceC719460SKa3 != null) {
                imageUrl2 = interfaceC719460SKa3.getImageUrl();
            } else {
                imageUrl2 = null;
            }
            Bitmap bitmap2 = this.LLILZLL;
            InterfaceC719460SKa interfaceC719460SKa4 = this.LLILZIL;
            if (interfaceC719460SKa4 != null) {
                bitmapLJIILIIL2 = interfaceC719460SKa4.LJIILIIL();
            }
            float f = this.LLIZ;
            C12CL c12cl = this.LLIZLLLIL;
            this.LL = 1;
            obj = c12ct.LIZLLL(imageUrl, bitmap, bitmapLJIILIIL, imageUrl2, bitmap2, bitmapLJIILIIL2, f, c12cl, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PhotoDynamicBgColorComponent@2fea.updateExtractColor$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PhotoDynamicBgColorComponent@2fea.updateExtractColor$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0SKU> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
