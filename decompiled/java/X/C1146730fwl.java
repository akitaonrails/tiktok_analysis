package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemComposeKt$JsEventEffects$2$1", f = "GiftAnchorPanelGiftPageCenterAssemCompose.kt", l = {302}, m = "invokeSuspend")
public final class C1146730fwl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function0<InterfaceC346201Wa<C262100zr>> LLILLJJLI;
    public final /* synthetic */ C05P1<C1146430fwH> LLILLL;
    public final /* synthetic */ C05P1<Context> LLILZ;
    public final /* synthetic */ Function1<AbstractC1146640fwc, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1146730fwl(Function0<? extends InterfaceC346201Wa<C262100zr>> function0, C05P1<C1146430fwH> c05p1, C05P1<? extends Context> c05p12, Function1<? super AbstractC1146640fwc, Unit> function1, InterfaceC1364105Vn<? super C1146730fwl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function0;
        this.LLILLL = c05p1;
        this.LLILZ = c05p12;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1146730fwl(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.JsEventEffects$2$1");
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
            InterfaceC346201Wa<C262100zr> interfaceC346201WaInvoke = this.LLILLJJLI.invoke();
            final C05P1<C1146430fwH> c05p1 = this.LLILLL;
            final C05P1<Context> c05p12 = this.LLILZ;
            final Function1<AbstractC1146640fwc, Unit> function1 = this.LLILZIL;
            InterfaceC346701Wf<? super C262100zr> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0fwf
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    C262100zr c262100zr = (C262100zr) obj2;
                    C1146350fw9 c1146350fw9LIZ = C1146540fwS.LIZ(c05p1.getValue(), c262100zr);
                    if (c1146350fw9LIZ != null && C1146560fwU.LIZ(c1146350fw9LIZ, c05p12.getValue())) {
                        return Unit.LIZ;
                    }
                    function1.invoke(new C1146610fwZ(c262100zr));
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201WaInvoke.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.JsEventEffects$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.JsEventEffects$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
