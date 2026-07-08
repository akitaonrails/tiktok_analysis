package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0JUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel$fetchLiveSubMediaModelBitmap$1", f = "SubWaveEmotePageViewModel.kt", l = {323}, m = "invokeSuspend")
public final class C492780JUe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SubWaveEmotePageViewModel LLILLJJLI;
    public final /* synthetic */ C0JUY LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492780JUe(Context context, SubWaveEmotePageViewModel subWaveEmotePageViewModel, C0JUY c0juy, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = subWaveEmotePageViewModel;
        this.LLILLL = c0juy;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C492780JUe(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("SubWaveEmotePageViewModel@2b86.fetchLiveSubMediaModelBitmap$1");
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
            IHostSubscription.Params paramsVQ2 = this.LLILLJJLI.vQ2();
            LiveSubMediaModel liveSubMediaModel = this.LLILLL.LLILLL;
            if (liveSubMediaModel == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SubWaveEmotePageViewModel@2b86.fetchLiveSubMediaModelBitmap$1");
                return unit;
            }
            IHostSubscription.Result.PhotoFile photoFileLIZ = C20188213yy.LIZ(this.LLILZ, liveSubMediaModel, paramsVQ2);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C492790JUf c492790JUf = new C492790JUf(photoFileLIZ, paramsVQ2, this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c492790JUf) == objLJFF) {
                C1C7U.LIZIZ("SubWaveEmotePageViewModel@2b86.fetchLiveSubMediaModelBitmap$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SubWaveEmotePageViewModel@2b86.fetchLiveSubMediaModelBitmap$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
