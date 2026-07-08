package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11cB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.PrepareParamsHandler$handleData$2", f = "PrepareParamsHandler.kt", l = {43, 70}, m = "invokeSuspend")
public final class C19537311cB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C19536911c7 LLILZIL;
    public final /* synthetic */ C19537211cA LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19537311cB(C19536911c7 c19536911c7, C19537211cA c19537211cA, InterfaceC1364105Vn<? super C19537311cB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c19536911c7;
        this.LLILZLL = c19537211cA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19537311cB c19537311cB = new C19537311cB(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c19537311cB.LLILZ = obj;
        return c19537311cB;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19537311cB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
