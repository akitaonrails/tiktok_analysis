package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hv9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel$onClickSendBtn$1", f = "SingleChatInputViewModel.kt", l = {231}, m = "invokeSuspend")
public final class C456450Hv9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C458200Hxy LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ SingleChatInputViewModel LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456450Hv9(SingleChatInputViewModel singleChatInputViewModel, Context context, InterfaceC1364105Vn<? super C456450Hv9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = singleChatInputViewModel;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C456450Hv9(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C458200Hxy c458200HxyXQ2;
        Context context;
        C1C7U.LIZ("SingleChatInputViewModel@c295.onClickSendBtn$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                context = (Context) this.LLILLJJLI;
                c458200HxyXQ2 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c458200HxyXQ2 = this.LLILZ.xQ2();
            context = this.LLILZIL;
            C458200Hxy c458200HxyXQ22 = this.LLILZ.xQ2();
            Context context2 = this.LLILZIL;
            this.LL = c458200HxyXQ2;
            this.LLILLJJLI = context;
            this.LLILLL = 1;
            obj = c458200HxyXQ22.LJJIJL(context2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SingleChatInputViewModel@c295.onClickSendBtn$1");
                return objLJFF;
            }
        }
        C458370HyF c458370HyF = (C458370HyF) obj;
        if (c458370HyF == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SingleChatInputViewModel@c295.onClickSendBtn$1");
            return unit;
        }
        c458200HxyXQ2.LJJIL(context, c458370HyF, C0HVB.LOCK_AND_CLICK_SEND);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SingleChatInputViewModel@c295.onClickSendBtn$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
