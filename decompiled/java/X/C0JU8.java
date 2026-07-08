package X;

import android.content.Context;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JU8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel$submitEmote$1$1$1$1$1", f = "SubWaveEmotePageViewModel.kt", l = {443}, m = "invokeSuspend")
public final class C0JU8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EmoteModel>, Object> {
    public int LL;
    public final /* synthetic */ SubWaveEmotePageViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C0JUY LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JU8(Context context, SubWaveEmotePageViewModel subWaveEmotePageViewModel, C0JUY c0juy, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = subWaveEmotePageViewModel;
        this.LLILLL = context;
        this.LLILZ = c0juy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JU8(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubWaveEmotePageViewModel@2b86.submitEmote$1$1$1$1$1");
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
            C0JUA c0jua = (C0JUA) this.LLILLJJLI.LL.getValue().getOperator();
            Context context = this.LLILLL;
            C0JUY c0juy = this.LLILZ;
            IHostSubscription.Params paramsVQ2 = this.LLILLJJLI.vQ2();
            this.LL = 1;
            obj = c0jua.j0(context, c0juy, paramsVQ2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SubWaveEmotePageViewModel@2b86.submitEmote$1$1$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SubWaveEmotePageViewModel@2b86.submitEmote$1$1$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EmoteModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
