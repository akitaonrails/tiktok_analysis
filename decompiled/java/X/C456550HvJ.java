package X;

import Y.AgS287S0100000_6;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.interfaces.DefaultRecordInputAbilityImpl$initVoiceMessageStates$2", f = "IRecordInputAbility.kt", l = {362}, m = "invokeSuspend")
public final class C456550HvJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YD<Boolean> LLILLJJLI;
    public final /* synthetic */ C458200Hxy LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456550HvJ(C05YD<Boolean> c05yd, C458200Hxy c458200Hxy, InterfaceC1364105Vn<? super C456550HvJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yd;
        this.LLILLL = c458200Hxy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C456550HvJ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultRecordInputAbilityImpl@7bf5.initVoiceMessageStates$2");
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
            C05YD<Boolean> c05yd = this.LLILLJJLI;
            C458200Hxy c458200Hxy = this.LLILLL;
            C414301jJ c414301jJ = new C414301jJ(c05yd, c458200Hxy.LJIILJJIL, new C456540HvI(c458200Hxy, null));
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 171);
            this.LL = 1;
            if (c414301jJ.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultRecordInputAbilityImpl@7bf5.initVoiceMessageStates$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultRecordInputAbilityImpl@7bf5.initVoiceMessageStates$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
