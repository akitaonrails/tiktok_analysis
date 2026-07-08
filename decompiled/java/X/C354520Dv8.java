package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.MagicI2VHandler$handleApplyMagic$1", f = "MagicI2VHandler.kt", l = {185, 200}, m = "invokeSuspend")
public final class C354520Dv8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C354390Duv LLILLL;
    public final /* synthetic */ C354510Dv7 LLILZ;
    public final /* synthetic */ InterfaceC354020DuK LLILZIL;
    public final /* synthetic */ C354540DvA LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C354520Dv8(C354390Duv c354390Duv, C354510Dv7 c354510Dv7, InterfaceC354020DuK interfaceC354020DuK, C354540DvA c354540DvA, InterfaceC1364105Vn<? super C354520Dv8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c354390Duv;
        this.LLILZ = c354510Dv7;
        this.LLILZIL = interfaceC354020DuK;
        this.LLILZLL = c354540DvA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C354520Dv8(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354520Dv8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
