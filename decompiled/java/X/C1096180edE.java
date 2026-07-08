package X;

import com.bytedance.android.livesdk.programmedlive.pin.PLCusPinMsgViewModel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0edE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.programmedlive.pin.PLCusPinMsgViewModel$onMessage$1", f = "PLCusPinMsgViewModel.kt", l = {117, 120, 126}, m = "invokeSuspend")
public final class C1096180edE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C470590Icr LL;
    public int LLILLJJLI;
    public final /* synthetic */ IMessage LLILLL;
    public final /* synthetic */ PLCusPinMsgViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096180edE(IMessage iMessage, PLCusPinMsgViewModel pLCusPinMsgViewModel, InterfaceC1364105Vn<? super C1096180edE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = iMessage;
        this.LLILZ = pLCusPinMsgViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1096180edE(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0186  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1096180edE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
