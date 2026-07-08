package X;

import com.ss.android.ugc.aweme.story.model.StoryBulletListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.bubble.manager.StoryInteractionListManager$fetchStoryBulletList$1", f = "StoryInteractionListManager.kt", l = {113, 116, 119, 139}, m = "invokeSuspend")
public final class C331310Cyn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public StoryBulletListResponse LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C730840Sle LLILZLL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C331340Cyq>> LLIZ;
    public final /* synthetic */ C331340Cyq LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331310Cyn(C730840Sle c730840Sle, InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn, C331340Cyq c331340Cyq, InterfaceC1364105Vn<? super C331310Cyn> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILZLL = c730840Sle;
        this.LLIZ = interfaceC1364105Vn;
        this.LLIZLLLIL = c331340Cyq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331310Cyn(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5 A[Catch: Exception -> 0x014f, TryCatch #0 {Exception -> 0x014f, blocks: (B:56:0x0124, B:62:0x012e, B:63:0x0142, B:44:0x00ea, B:46:0x00ee, B:50:0x00fe, B:52:0x0106, B:47:0x00f5, B:36:0x00cb, B:38:0x00d1, B:41:0x00da, B:40:0x00d5, B:30:0x009e, B:35:0x00c1), top: B:84:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee A[Catch: Exception -> 0x014f, TryCatch #0 {Exception -> 0x014f, blocks: (B:56:0x0124, B:62:0x012e, B:63:0x0142, B:44:0x00ea, B:46:0x00ee, B:50:0x00fe, B:52:0x0106, B:47:0x00f5, B:36:0x00cb, B:38:0x00d1, B:41:0x00da, B:40:0x00d5, B:30:0x009e, B:35:0x00c1), top: B:84:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5 A[Catch: Exception -> 0x014f, TryCatch #0 {Exception -> 0x014f, blocks: (B:56:0x0124, B:62:0x012e, B:63:0x0142, B:44:0x00ea, B:46:0x00ee, B:50:0x00fe, B:52:0x0106, B:47:0x00f5, B:36:0x00cb, B:38:0x00d1, B:41:0x00da, B:40:0x00d5, B:30:0x009e, B:35:0x00c1), top: B:84:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe A[Catch: Exception -> 0x014f, TryCatch #0 {Exception -> 0x014f, blocks: (B:56:0x0124, B:62:0x012e, B:63:0x0142, B:44:0x00ea, B:46:0x00ee, B:50:0x00fe, B:52:0x0106, B:47:0x00f5, B:36:0x00cb, B:38:0x00d1, B:41:0x00da, B:40:0x00d5, B:30:0x009e, B:35:0x00c1), top: B:84:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124 A[Catch: Exception -> 0x014f, TryCatch #0 {Exception -> 0x014f, blocks: (B:56:0x0124, B:62:0x012e, B:63:0x0142, B:44:0x00ea, B:46:0x00ee, B:50:0x00fe, B:52:0x0106, B:47:0x00f5, B:36:0x00cb, B:38:0x00d1, B:41:0x00da, B:40:0x00d5, B:30:0x009e, B:35:0x00c1), top: B:84:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012e A[Catch: Exception -> 0x014f, TryCatch #0 {Exception -> 0x014f, blocks: (B:56:0x0124, B:62:0x012e, B:63:0x0142, B:44:0x00ea, B:46:0x00ee, B:50:0x00fe, B:52:0x0106, B:47:0x00f5, B:36:0x00cb, B:38:0x00d1, B:41:0x00da, B:40:0x00d5, B:30:0x009e, B:35:0x00c1), top: B:84:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142 A[Catch: Exception -> 0x014f, TRY_LEAVE, TryCatch #0 {Exception -> 0x014f, blocks: (B:56:0x0124, B:62:0x012e, B:63:0x0142, B:44:0x00ea, B:46:0x00ee, B:50:0x00fe, B:52:0x0106, B:47:0x00f5, B:36:0x00cb, B:38:0x00d1, B:41:0x00da, B:40:0x00d5, B:30:0x009e, B:35:0x00c1), top: B:84:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331310Cyn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
