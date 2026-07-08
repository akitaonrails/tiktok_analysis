package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.assem.IMQuickMessageInputAssem$resetInputOnTextCameraEventAndClosePanelOnCameraEvent$observer$1$onSendMsgFromRecordPage$1", f = "IMQuickMessageInputAssem.kt", l = {398}, m = "invokeSuspend")
public final class C457260HwS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC457250HwR LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C457260HwS(InterfaceC457250HwR interfaceC457250HwR, InterfaceC1364105Vn<? super C457260HwS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC457250HwR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C457260HwS(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMQuickMessageInputAssem@9dd9.resetInputOnTextCameraEventAndClosePanelOnCameraEvent$observer$1$onSendMsgFromRecordPage$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("IMQuickMessageInputAssem@9dd9.resetInputOnTextCameraEventAndClosePanelOnCameraEvent$observer$1$onSendMsgFromRecordPage$1");
                return objLJFF;
            }
        }
        InterfaceC457250HwR interfaceC457250HwR = this.LLILLJJLI;
        if (interfaceC457250HwR != null) {
            interfaceC457250HwR.LIZ(C0ZGS.NONE, "quick_reply_media");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMQuickMessageInputAssem@9dd9.resetInputOnTextCameraEventAndClosePanelOnCameraEvent$observer$1$onSendMsgFromRecordPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
