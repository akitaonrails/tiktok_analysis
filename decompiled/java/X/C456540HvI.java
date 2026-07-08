package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0HvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.interfaces.DefaultRecordInputAbilityImpl$initVoiceMessageStates$2$1", f = "IRecordInputAbility.kt", l = {}, m = "invokeSuspend")
public final class C456540HvI extends C09AX implements InterfaceC1631620sYq<Boolean, Boolean, InterfaceC1364105Vn<? super EnumC430090Gtj>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C458200Hxy LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456540HvI(C458200Hxy c458200Hxy, InterfaceC1364105Vn<? super C456540HvI> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c458200Hxy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC430090Gtj enumC430090GtjLJJIJLIJ;
        C1C7U.LIZ("DefaultRecordInputAbilityImpl@7bf5.initVoiceMessageStates$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        boolean z2 = this.LLILLJJLI;
        if (!z || z2) {
            enumC430090GtjLJJIJLIJ = EnumC430090Gtj.HIDDEN;
        } else {
            enumC430090GtjLJJIJLIJ = C458200Hxy.LJJIJLIJ(this.LLILLL.LJII);
        }
        C1C7U.LIZIZ("DefaultRecordInputAbilityImpl@7bf5.initVoiceMessageStates$2$1");
        return enumC430090GtjLJJIJLIJ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super EnumC430090Gtj> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C456540HvI c456540HvI = new C456540HvI(this.LLILLL, interfaceC1364105Vn);
        c456540HvI.LL = zBooleanValue;
        c456540HvI.LLILLJJLI = zBooleanValue2;
        return c456540HvI.invokeSuspend(Unit.LIZ);
    }
}
