package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel$fetchLiveSubMediaModelBitmap$1$1", f = "SubWaveEmotePageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C492790JUf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IHostSubscription.Result.PhotoFile LL;
    public final /* synthetic */ IHostSubscription.Params LLILLJJLI;
    public final /* synthetic */ SubWaveEmotePageViewModel LLILLL;
    public final /* synthetic */ C0JUY LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492790JUf(IHostSubscription.Result.PhotoFile photoFile, IHostSubscription.Params params, SubWaveEmotePageViewModel subWaveEmotePageViewModel, C0JUY c0juy, Context context, InterfaceC1364105Vn<? super C492790JUf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = photoFile;
        this.LLILLJJLI = params;
        this.LLILLL = subWaveEmotePageViewModel;
        this.LLILZ = c0juy;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C492790JUf(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        Bitmap bitmapCreateScaledBitmap;
        C1C7U.LIZ("SubWaveEmotePageViewModel@2b86.fetchLiveSubMediaModelBitmap$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IHostSubscription.Result.PhotoFile photoFile = this.LL;
        if (photoFile != null && (bitmap = photoFile.bitmap) != null) {
            IHostSubscription.Params params = this.LLILLJJLI;
            SubWaveEmotePageViewModel subWaveEmotePageViewModel = this.LLILLL;
            C0JUY c0juy = this.LLILZ;
            Context context = this.LLILZIL;
            if (bitmap.getWidth() <= params.max_width && bitmap.getHeight() <= params.max_height) {
                bitmapCreateScaledBitmap = bitmap;
            } else {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, params.max_width, params.max_height, true);
            }
            subWaveEmotePageViewModel.getClass();
            if (bitmapCreateScaledBitmap.getByteCount() > params.max_size) {
                C766270U4b.LIZLLL(2131841517);
            }
            subWaveEmotePageViewModel.withState(new C492770JUd(c0juy, bitmap, subWaveEmotePageViewModel, context));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubWaveEmotePageViewModel@2b86.fetchLiveSubMediaModelBitmap$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
