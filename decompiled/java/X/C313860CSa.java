package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.innerpush.workflow.IMInnerPushHandleModeSwitch$setInnerPushHandleMode$1", f = "IMInnerPushHandleModeSwitch.kt", l = {}, m = "invokeSuspend")
public final class C313860CSa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C313860CSa(int i, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313860CSa(this.LLILLJJLI, this.LL, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMInnerPushHandleModeSwitch@4a8f.setInnerPushHandleMode$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C876900Yae.LIZ.LJII(this.LLILLJJLI, this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMInnerPushHandleModeSwitch@4a8f.setInnerPushHandleMode$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
