package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CsZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.speedtest.PreScheduleRequest$request$3", f = "PreScheduleRequest.kt", l = {249, 158, 165}, m = "invokeSuspend")
public final class C327450CsZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C328040CtW>, Object> {
    public InterfaceC383701eN LL;
    public C327950CtN LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C327950CtN LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327450CsZ(C327950CtN c327950CtN, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c327950CtN;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327450CsZ(this.LLILZLL, interfaceC1364105Vn, this.LLIZ, this.LLIZLLLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327450CsZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C328040CtW> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
