package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.HorizontalPanelRequestManagerImpl$launchFetch$1", f = "HorizontalPanelRequestManager.kt", l = {250, 251, 263, 312}, m = "invokeSuspend")
public final class C1633300sbY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C1633280sbW LLILLJJLI;
    public C1633220sbQ LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C1633200sbO LLIZ;
    public final /* synthetic */ C1633280sbW LLIZLLLIL;
    public final /* synthetic */ InterfaceC1633390sbh LLJ;
    public final /* synthetic */ C1633750scH LLJI;
    public final /* synthetic */ Map<String, String> LLJIJIL;
    public final /* synthetic */ C1633220sbQ LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633300sbY(C1633200sbO c1633200sbO, C1633280sbW c1633280sbW, InterfaceC1633390sbh interfaceC1633390sbh, C1633750scH c1633750scH, Map<String, String> map, C1633220sbQ c1633220sbQ, InterfaceC1364105Vn<? super C1633300sbY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c1633200sbO;
        this.LLIZLLLIL = c1633280sbW;
        this.LLJ = interfaceC1633390sbh;
        this.LLJI = c1633750scH;
        this.LLJIJIL = map;
        this.LLJILJIL = c1633220sbQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1633300sbY c1633300sbY = new C1633300sbY(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c1633300sbY.LLILZLL = obj;
        return c1633300sbY;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0142 A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #0 {all -> 0x0150, blocks: (B:30:0x0138, B:32:0x0142), top: B:39:0x0138 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1633300sbY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
