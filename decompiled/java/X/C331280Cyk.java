package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.bubble.manager.StoryInteractionListManager$refreshCurrentBubbleWithoutReset$1", f = "StoryInteractionListManager.kt", l = {75, 83, 89}, m = "invokeSuspend")
public final class C331280Cyk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C730840Sle LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331280Cyk(C730840Sle c730840Sle, InterfaceC1364105Vn<? super C331280Cyk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c730840Sle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331280Cyk(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:31:0x007b, B:32:0x007e, B:34:0x0082, B:35:0x0089, B:22:0x0051, B:24:0x005d, B:25:0x0063, B:27:0x006b, B:28:0x0070), top: B:55:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[Catch: Exception -> 0x00b4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b4, blocks: (B:31:0x007b, B:32:0x007e, B:34:0x0082, B:35:0x0089, B:22:0x0051, B:24:0x005d, B:25:0x0063, B:27:0x006b, B:28:0x0070), top: B:55:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331280Cyk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
