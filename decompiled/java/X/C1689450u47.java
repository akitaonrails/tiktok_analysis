package X;

import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u47, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel$loadNotificationSettings$2", f = "MessageNotificationFragment.kt", l = {}, m = "invokeSuspend")
public final class C1689450u47 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ImNotificationViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1689450u47(ImNotificationViewModel imNotificationViewModel, InterfaceC1364105Vn<? super C1689450u47> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = imNotificationViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1689450u47(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0127 A[Catch: Exception -> 0x0133, TRY_LEAVE, TryCatch #0 {Exception -> 0x0133, blocks: (B:3:0x0016, B:5:0x0020, B:7:0x0026, B:10:0x002e, B:12:0x0034, B:14:0x003d, B:16:0x0043, B:17:0x004c, B:19:0x0052, B:20:0x005e, B:21:0x0062, B:23:0x0068, B:26:0x007a, B:28:0x007e, B:30:0x0082, B:32:0x0086, B:33:0x008f, B:35:0x0095, B:37:0x00a3, B:38:0x00ac, B:40:0x00b2, B:42:0x00c3, B:43:0x00c7, B:44:0x00d0, B:46:0x00d6, B:48:0x00e7, B:49:0x00eb, B:51:0x00fb, B:53:0x0103, B:54:0x011e, B:55:0x0124, B:36:0x00a1, B:56:0x0127), top: B:61:0x0016 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689450u47.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
