package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.frame.VideoFrameCache$2", f = "VideoFrameCache.kt", l = {99, 102, 103, 106}, m = "invokeSuspend")
public final class C370940EgW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C099F LL;
    public int LLILLJJLI;
    public final /* synthetic */ C370920EgU LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C370940EgW(C370920EgU c370920EgU, InterfaceC1364105Vn<? super C370940EgW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c370920EgU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C370940EgW(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[Catch: all -> 0x00b7, TryCatch #1 {all -> 0x00b7, blocks: (B:24:0x0066, B:27:0x007e, B:30:0x0089, B:32:0x008f, B:35:0x00a6, B:37:0x00aa), top: B:49:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[Catch: all -> 0x00b7, TryCatch #1 {all -> 0x00b7, blocks: (B:24:0x0066, B:27:0x007e, B:30:0x0089, B:32:0x008f, B:35:0x00a6, B:37:0x00aa), top: B:49:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0055 -> B:22:0x005e). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370940EgW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
