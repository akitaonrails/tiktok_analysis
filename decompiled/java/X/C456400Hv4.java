package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Hv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SingleChatInputViewModel$subscribeForSendBtnState$2", f = "SingleChatInputViewModel.kt", l = {}, m = "invokeSuspend")
public final class C456400Hv4 extends C09AX implements InterfaceC1631620sYq<Boolean, EnumC430090Gtj, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ EnumC430090Gtj LLILLJJLI;
    public final /* synthetic */ SingleChatInputViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456400Hv4(SingleChatInputViewModel singleChatInputViewModel, InterfaceC1364105Vn<? super C456400Hv4> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = singleChatInputViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z;
        C1C7U.LIZ("SingleChatInputViewModel@c295.subscribeForSendBtnState$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z2 = this.LL;
        EnumC430090Gtj enumC430090Gtj = this.LLILLJJLI;
        C2252321DDq c2252321DDq = this.LLILLL.LLJILJIL;
        do {
            value = c2252321DDq.getValue();
            if (z2 && enumC430090Gtj != EnumC430090Gtj.LOCKED && enumC430090Gtj != EnumC430090Gtj.RECORD_FINISHED) {
                z = false;
            } else {
                z = true;
            }
            value.getClass();
        } while (!c2252321DDq.compareAndSet(value, new C1626606Ym(z, false)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleChatInputViewModel@c295.subscribeForSendBtnState$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, EnumC430090Gtj enumC430090Gtj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C456400Hv4 c456400Hv4 = new C456400Hv4(this.LLILLL, interfaceC1364105Vn);
        c456400Hv4.LL = zBooleanValue;
        c456400Hv4.LLILLJJLI = enumC430090Gtj;
        return c456400Hv4.invokeSuspend(Unit.LIZ);
    }
}
