package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11cD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.FileHandler$handleData$2", f = "FileHandler.kt", l = {51}, m = "invokeSuspend")
public final class C19537511cD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C19536911c7 LLIZ;
    public final /* synthetic */ C19537111c9 LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19537511cD(C19536911c7 c19536911c7, C19537111c9 c19537111c9, InterfaceC1364105Vn<? super C19537511cD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c19536911c7;
        this.LLIZLLLIL = c19537111c9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19537511cD c19537511cD = new C19537511cD(this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c19537511cD.LLILZLL = obj;
        return c19537511cD;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x005c -> B:6:0x002a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19537511cD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
