package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11cC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.FetchHandler$handleData$2", f = "FetchHandler.kt", l = {66}, m = "invokeSuspend")
public final class C19537411cC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C19536911c7 LLILZ;
    public final /* synthetic */ C19537011c8 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19537411cC(C19536911c7 c19536911c7, C19537011c8 c19537011c8, InterfaceC1364105Vn<? super C19537411cC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c19536911c7;
        this.LLILZIL = c19537011c8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19537411cC c19537411cC = new C19537411cC(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c19537411cC.LLILLL = obj;
        return c19537411cC;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0037 -> B:6:0x001e). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19537411cC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
