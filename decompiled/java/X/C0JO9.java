package X;

import com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService;
import com.bytedance.android.livesdk.model.CommentReply;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JO9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService$feedbackComment$1", f = "AIReplyAnchorManagerService.kt", l = {101, 112, 118}, m = "invokeSuspend")
public final class C0JO9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ CommentReply LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ AIReplyAnchorManagerService LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JO9(CommentReply commentReply, boolean z, long j, AIReplyAnchorManagerService aIReplyAnchorManagerService, InterfaceC1364105Vn<? super C0JO9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = commentReply;
        this.LLILZIL = z;
        this.LLILZLL = j;
        this.LLIZ = aIReplyAnchorManagerService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JO9(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2 A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:42:0x00d7, B:43:0x00da, B:29:0x008a, B:31:0x0091, B:37:0x00a9, B:38:0x00b2, B:36:0x00a2, B:18:0x0053, B:19:0x0056, B:15:0x0033), top: B:50:0x000f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JO9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
