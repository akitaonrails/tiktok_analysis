package X;

import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem;
import com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment$loadConversationData$1", f = "MessageNotificationToneChooseFragment.kt", l = {443, 458}, m = "invokeSuspend")
public final class C891340Yxw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AlertToneItem LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ IMessageAlertToneService LLILZ;
    public final /* synthetic */ MessageNotificationToneChooseFragment LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C891340Yxw(IMessageAlertToneService iMessageAlertToneService, MessageNotificationToneChooseFragment messageNotificationToneChooseFragment, InterfaceC1364105Vn<? super C891340Yxw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = iMessageAlertToneService;
        this.LLILZIL = messageNotificationToneChooseFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C891340Yxw(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e A[Catch: Exception -> 0x0160, TryCatch #0 {Exception -> 0x0160, blocks: (B:55:0x00d9, B:56:0x00dc, B:59:0x00e2, B:62:0x00e8, B:63:0x00ee, B:65:0x0123, B:68:0x0128, B:70:0x014e, B:71:0x015a, B:14:0x003b, B:15:0x003e, B:17:0x004d, B:20:0x0057, B:23:0x005d, B:24:0x0066, B:26:0x006c, B:28:0x0077, B:32:0x0080, B:34:0x0084, B:35:0x0088, B:36:0x0091, B:38:0x0097, B:47:0x00b1, B:41:0x00a2, B:44:0x00aa, B:48:0x00b5, B:50:0x00bc, B:51:0x00c1, B:22:0x005b, B:10:0x0027), top: B:79:0x000e }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C891340Yxw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
