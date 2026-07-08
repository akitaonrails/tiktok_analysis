package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18YM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.longpress.MovingLongPressPopup$showPopup$3", f = "MovingLongPressPopup.kt", l = {172, 175, 178, 191}, m = "invokeSuspend")
public final class C18YM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C18YN LLILLJJLI;
    public final /* synthetic */ C18YE LLILLL;
    public final /* synthetic */ Object LLILZ;
    public final /* synthetic */ C18YJ<Object, Object> LLILZIL;
    public final /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C18YL LLIZ;
    public final /* synthetic */ C18YT<Object> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18YM(C18YN c18yn, C18YE c18ye, Object obj, C18YJ<Object, Object> c18yj, Object obj2, C18YL c18yl, C18YT<Object> c18yt, InterfaceC1364105Vn<? super C18YM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c18yn;
        this.LLILLL = c18ye;
        this.LLILZ = obj;
        this.LLILZIL = c18yj;
        this.LLILZLL = obj2;
        this.LLIZ = c18yl;
        this.LLIZLLLIL = c18yt;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.18YK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.18YK, java.lang.Object] */
    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18YM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.18YK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.18YK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.18YK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.18YK, java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18YM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
