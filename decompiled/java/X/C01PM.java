package X;

import com.bytedance.android.livesdk.aireply.AIReplyWatcherManagerService;
import com.bytedance.android.livesdk.model.message.CommentReplyMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01PM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.aireply.AIReplyWatcherManagerService$feedbackComment$1", f = "AIReplyWatcherManagerService.kt", l = {75, 83, 90}, m = "invokeSuspend")
public final class C01PM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ CommentReplyMessage LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ AIReplyWatcherManagerService LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01PM(boolean z, CommentReplyMessage commentReplyMessage, long j, AIReplyWatcherManagerService aIReplyWatcherManagerService, InterfaceC1364105Vn<? super C01PM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = commentReplyMessage;
        this.LLILZIL = j;
        this.LLILZLL = aIReplyWatcherManagerService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01PM(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:7:0x0019, B:30:0x0095, B:32:0x009c, B:38:0x00b4, B:39:0x00bd, B:37:0x00ad, B:10:0x0026, B:24:0x0068, B:25:0x006b, B:16:0x0038, B:20:0x0058), top: B:49:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01PM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
