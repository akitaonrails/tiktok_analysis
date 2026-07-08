package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.components.base.magicprocessor.handler.I2VHandler$handleApplyMagic$1", f = "I2VHandler.kt", l = {160, 173, 177}, m = "invokeSuspend")
public final class C354450Dv1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC539460LDs LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ C354410Dux LLILZIL;
    public final /* synthetic */ C354510Dv7 LLILZLL;
    public final /* synthetic */ InterfaceC354020DuK LLIZ;
    public final /* synthetic */ C354540DvA LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C354450Dv1(C354410Dux c354410Dux, C354510Dv7 c354510Dv7, InterfaceC354020DuK interfaceC354020DuK, C354540DvA c354540DvA, InterfaceC1364105Vn<? super C354450Dv1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c354410Dux;
        this.LLILZLL = c354510Dv7;
        this.LLIZ = interfaceC354020DuK;
        this.LLIZLLLIL = c354540DvA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C354450Dv1(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0178  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354450Dv1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
