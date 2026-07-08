package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yp6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.analytics.IMConvLoadAnalytics$tryReportUnreadPerfEvent$1", f = "IMConvLoadAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C885860Yp6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C885860Yp6(boolean z, InterfaceC1364105Vn<? super C885860Yp6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C885860Yp6(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0162 A[Catch: all -> 0x032c, TryCatch #0 {all -> 0x032c, blocks: (B:4:0x0012, B:6:0x0016, B:11:0x0021, B:13:0x0035, B:17:0x003e, B:19:0x0046, B:24:0x0050, B:26:0x006d, B:28:0x007c, B:31:0x0086, B:34:0x008c, B:49:0x00ce, B:51:0x00dd, B:53:0x00ec, B:55:0x00f3, B:57:0x00f8, B:65:0x010c, B:68:0x0112, B:70:0x012b, B:72:0x013a, B:81:0x0153, B:83:0x0158, B:98:0x019a, B:100:0x01a9, B:102:0x01b8, B:104:0x01bf, B:106:0x01c4, B:121:0x01e9, B:123:0x01fe, B:124:0x0203, B:126:0x0229, B:127:0x022e, B:129:0x0255, B:130:0x025a, B:132:0x0281, B:133:0x0286, B:135:0x02ad, B:136:0x02b2, B:138:0x02d8, B:139:0x02dd, B:142:0x02fb, B:85:0x0162, B:87:0x0171, B:89:0x0180, B:91:0x0187, B:93:0x018c, B:36:0x0096, B:38:0x00a5, B:40:0x00b4, B:42:0x00bb, B:44:0x00c0), top: B:156:0x0012 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C885860Yp6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
