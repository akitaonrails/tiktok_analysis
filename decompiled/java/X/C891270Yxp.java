package X;

import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment$updateRemoteAlertTone$2", f = "MessageNotificationToneChooseFragment.kt", l = {574, 586, 599}, m = "invokeSuspend")
public final class C891270Yxp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageNotificationToneChooseFragment LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ AlertToneValueItem LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C891270Yxp(MessageNotificationToneChooseFragment messageNotificationToneChooseFragment, Function0<Unit> function0, String str, AlertToneValueItem alertToneValueItem, Function0<Unit> function02, Function0<Unit> function03, InterfaceC1364105Vn<? super C891270Yxp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageNotificationToneChooseFragment;
        this.LLILLL = function0;
        this.LLILZ = str;
        this.LLILZIL = alertToneValueItem;
        this.LLILZLL = function02;
        this.LLIZ = function03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C891270Yxp(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: Exception -> 0x00e8, TryCatch #0 {Exception -> 0x00e8, blocks: (B:41:0x00c9, B:42:0x00cc, B:47:0x00da, B:48:0x00dc, B:46:0x00d7, B:30:0x0086, B:31:0x0089, B:19:0x0053, B:21:0x0061, B:23:0x006c, B:26:0x007a, B:32:0x0090, B:34:0x00af, B:36:0x00ba, B:37:0x00bf, B:49:0x00e0, B:50:0x00e7), top: B:55:0x000e }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C891270Yxp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
