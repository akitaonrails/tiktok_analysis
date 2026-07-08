package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0Ceh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel$onInit$1$1", f = "CreateTabBottomBtnViewModel.kt", l = {}, m = "invokeSuspend")
public final class C318850Ceh extends C09AX implements InterfaceC1631620sYq<EnumC318870Cej, Boolean, InterfaceC1364105Vn<? super C318880Cek>, Object> {
    public /* synthetic */ EnumC318870Cej LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C318850Ceh(InterfaceC1364105Vn<? super C318850Ceh> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateTabBottomBtnViewModel@8f4d.onInit$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C318880Cek c318880Cek = new C318880Cek(this.LL, this.LLILLJJLI);
        C1C7U.LIZIZ("CreateTabBottomBtnViewModel@8f4d.onInit$1$1");
        return c318880Cek;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(EnumC318870Cej enumC318870Cej, Boolean bool, InterfaceC1364105Vn<? super C318880Cek> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C318850Ceh c318850Ceh = new C318850Ceh(interfaceC1364105Vn);
        c318850Ceh.LL = enumC318870Cej;
        c318850Ceh.LLILLJJLI = zBooleanValue;
        return c318850Ceh.invokeSuspend(Unit.LIZ);
    }
}
