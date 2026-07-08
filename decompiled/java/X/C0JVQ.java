package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JVQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel$fetchLiveSubMediaModelBitmap$1$1", f = "SuggestEmotePageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0JVQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IHostSubscription.Result.PhotoFile LL;
    public final /* synthetic */ IHostSubscription.Params LLILLJJLI;
    public final /* synthetic */ SuggestEmotePageViewModel LLILLL;
    public final /* synthetic */ C492890JUp LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JVQ(IHostSubscription.Result.PhotoFile photoFile, IHostSubscription.Params params, SuggestEmotePageViewModel suggestEmotePageViewModel, C492890JUp c492890JUp, InterfaceC1364105Vn<? super C0JVQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = photoFile;
        this.LLILLJJLI = params;
        this.LLILLL = suggestEmotePageViewModel;
        this.LLILZ = c492890JUp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JVQ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        Bitmap bitmapCreateScaledBitmap;
        C1C7U.LIZ("SuggestEmotePageViewModel@d5d7.fetchLiveSubMediaModelBitmap$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IHostSubscription.Result.PhotoFile photoFile = this.LL;
        if (photoFile != null && (bitmap = photoFile.bitmap) != null) {
            IHostSubscription.Params params = this.LLILLJJLI;
            SuggestEmotePageViewModel suggestEmotePageViewModel = this.LLILLL;
            C492890JUp c492890JUp = this.LLILZ;
            if (bitmap.getWidth() <= params.max_width && bitmap.getHeight() <= params.max_height) {
                bitmapCreateScaledBitmap = bitmap;
            } else {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, params.max_width, params.max_height, true);
            }
            suggestEmotePageViewModel.getClass();
            if (bitmapCreateScaledBitmap.getByteCount() > params.max_size) {
                C766270U4b.LIZLLL(2131841517);
            }
            suggestEmotePageViewModel.withState(new C0JVR(c492890JUp, bitmap, suggestEmotePageViewModel));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SuggestEmotePageViewModel@d5d7.fetchLiveSubMediaModelBitmap$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
