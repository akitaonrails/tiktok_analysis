package X;

import android.content.Context;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JVL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageViewModel$submitEmote$1$1$1$1$1", f = "SuggestEmotePageViewModel.kt", l = {395}, m = "invokeSuspend")
public final class C0JVL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super UserEmote>, Object> {
    public int LL;
    public final /* synthetic */ SuggestEmotePageViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C492890JUp LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JVL(Context context, SuggestEmotePageViewModel suggestEmotePageViewModel, C492890JUp c492890JUp, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = suggestEmotePageViewModel;
        this.LLILLL = context;
        this.LLILZ = c492890JUp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JVL(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SuggestEmotePageViewModel@d5d7.submitEmote$1$1$1$1$1");
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
            C0JVN c0jvn = (C0JVN) this.LLILLJJLI.LL.getValue().getOperator();
            Context context = this.LLILLL;
            C492890JUp c492890JUp = this.LLILZ;
            IHostSubscription.Params paramsVQ2 = this.LLILLJJLI.vQ2();
            this.LL = 1;
            obj = c0jvn.Y(context, c492890JUp, paramsVQ2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SuggestEmotePageViewModel@d5d7.submitEmote$1$1$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SuggestEmotePageViewModel@d5d7.submitEmote$1$1$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super UserEmote> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
