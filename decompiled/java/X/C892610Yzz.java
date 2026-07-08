package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yzz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tars.impl.TarsPipeLine$downloadResource$1", f = "TarsPipeLine.kt", l = {186}, m = "invokeSuspend")
public final class C892610Yzz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC882520Yji LLILLL;
    public final /* synthetic */ C0Z0A LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C892610Yzz(InterfaceC882520Yji interfaceC882520Yji, C0Z0A c0z0a, InterfaceC1364105Vn<? super C892610Yzz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC882520Yji;
        this.LLILZ = c0z0a;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C892610Yzz(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:13:0x003e, B:14:0x0041, B:15:0x0047, B:17:0x004d, B:19:0x0064, B:21:0x0068, B:23:0x006e, B:25:0x0072, B:27:0x00a7, B:29:0x00ad, B:31:0x00b1, B:32:0x00c0, B:34:0x00c6, B:37:0x00dd, B:38:0x00e1), top: B:51:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:13:0x003e, B:14:0x0041, B:15:0x0047, B:17:0x004d, B:19:0x0064, B:21:0x0068, B:23:0x006e, B:25:0x0072, B:27:0x00a7, B:29:0x00ad, B:31:0x00b1, B:32:0x00c0, B:34:0x00c6, B:37:0x00dd, B:38:0x00e1), top: B:51:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:13:0x003e, B:14:0x0041, B:15:0x0047, B:17:0x004d, B:19:0x0064, B:21:0x0068, B:23:0x006e, B:25:0x0072, B:27:0x00a7, B:29:0x00ad, B:31:0x00b1, B:32:0x00c0, B:34:0x00c6, B:37:0x00dd, B:38:0x00e1), top: B:51:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5 A[SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C892610Yzz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
