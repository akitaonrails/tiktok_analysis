package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0HvL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.interfaces.DefaultRecordInputAbilityImpl$initVoiceMessageStates$1$1", f = "IRecordInputAbility.kt", l = {}, m = "invokeSuspend")
public final class C456570HvL extends C09AX implements InterfaceC1631620sYq<Integer, EnumC430090Gtj, InterfaceC1364105Vn<? super C456580HvM>, Object> {
    public /* synthetic */ int LL;
    public /* synthetic */ EnumC430090Gtj LLILLJJLI;

    public C456570HvL(InterfaceC1364105Vn<? super C456570HvL> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultRecordInputAbilityImpl@7bf5.initVoiceMessageStates$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C456580HvM c456580HvM = new C456580HvM(this.LL, this.LLILLJJLI);
        C1C7U.LIZIZ("DefaultRecordInputAbilityImpl@7bf5.initVoiceMessageStates$1$1");
        return c456580HvM;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Integer num, EnumC430090Gtj enumC430090Gtj, InterfaceC1364105Vn<? super C456580HvM> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        C456570HvL c456570HvL = new C456570HvL(interfaceC1364105Vn);
        c456570HvL.LL = iIntValue;
        c456570HvL.LLILLJJLI = enumC430090Gtj;
        return c456570HvL.invokeSuspend(Unit.LIZ);
    }
}
