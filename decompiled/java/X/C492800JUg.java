package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel$fetchMediaModelBitmap$bitmap$1", f = "SceneryPictureViewModel.kt", l = {}, m = "invokeSuspend")
public final class C492800JUg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ IHostSubscription.Result.PhotoFile LL;
    public final /* synthetic */ IHostSubscription.Params LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492800JUg(IHostSubscription.Result.PhotoFile photoFile, IHostSubscription.Params params, InterfaceC1364105Vn<? super C492800JUg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = photoFile;
        this.LLILLJJLI = params;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C492800JUg(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapCreateScaledBitmap;
        C1C7U.LIZ("SceneryPictureViewModel@1920.fetchMediaModelBitmap$bitmap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IHostSubscription.Result.PhotoFile photoFile = this.LL;
        if (photoFile != null && (bitmapCreateScaledBitmap = photoFile.bitmap) != null) {
            IHostSubscription.Params params = this.LLILLJJLI;
            if (bitmapCreateScaledBitmap.getWidth() > params.max_width || bitmapCreateScaledBitmap.getHeight() > params.max_height) {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, params.max_width, params.max_height, true);
            }
            if (bitmapCreateScaledBitmap.getByteCount() > params.max_size) {
                C766270U4b.LIZLLL(2131841517);
            }
            C1C7U.LIZIZ("SceneryPictureViewModel@1920.fetchMediaModelBitmap$bitmap$1");
            return bitmapCreateScaledBitmap;
        }
        C1C7U.LIZIZ("SceneryPictureViewModel@1920.fetchMediaModelBitmap$bitmap$1");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
