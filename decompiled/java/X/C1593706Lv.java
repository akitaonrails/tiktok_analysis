package X;

import com.ss.android.ugc.aweme.im.b2c.analytics.B2CAnalyticsAssem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Lv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.analytics.B2CAnalyticsAssem$reportEnterB2CChat$1", f = "B2CAnalyticsAssem.kt", l = {148, 120}, m = "invokeSuspend")
public final class C1593706Lv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public B2CAnalyticsAssem LLILLJJLI;
    public IMUser LLILLL;
    public int LLILZ;
    public final /* synthetic */ B2CAnalyticsAssem LLILZIL;
    public final /* synthetic */ IMUser LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1593706Lv(B2CAnalyticsAssem b2CAnalyticsAssem, IMUser iMUser, InterfaceC1364105Vn<? super C1593706Lv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = b2CAnalyticsAssem;
        this.LLILZLL = iMUser;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1593706Lv(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:7:0x001a, B:55:0x0106, B:57:0x0112, B:60:0x0118, B:15:0x004c, B:17:0x0050, B:19:0x005c, B:25:0x0066, B:27:0x0070, B:29:0x0074, B:31:0x007e, B:34:0x0085, B:38:0x00b9, B:40:0x00c3, B:43:0x00c9, B:46:0x00d1, B:49:0x00e6, B:52:0x00ed, B:54:0x00fc), top: B:67:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:7:0x001a, B:55:0x0106, B:57:0x0112, B:60:0x0118, B:15:0x004c, B:17:0x0050, B:19:0x005c, B:25:0x0066, B:27:0x0070, B:29:0x0074, B:31:0x007e, B:34:0x0085, B:38:0x00b9, B:40:0x00c3, B:43:0x00c9, B:46:0x00d1, B:49:0x00e6, B:52:0x00ed, B:54:0x00fc), top: B:67:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118 A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:7:0x001a, B:55:0x0106, B:57:0x0112, B:60:0x0118, B:15:0x004c, B:17:0x0050, B:19:0x005c, B:25:0x0066, B:27:0x0070, B:29:0x0074, B:31:0x007e, B:34:0x0085, B:38:0x00b9, B:40:0x00c3, B:43:0x00c9, B:46:0x00d1, B:49:0x00e6, B:52:0x00ed, B:54:0x00fc), top: B:67:0x0010 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1593706Lv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
