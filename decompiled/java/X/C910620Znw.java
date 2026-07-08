package X;

import com.ss.android.ugc.aweme.im.sdk.unreadindicator.GroupChatUnreadIndicatorViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Znw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.unreadindicator.GroupChatUnreadIndicatorViewModel$setUnreadUI$1", f = "GroupChatUnreadIndicatorViewModel.kt", l = {32, 38, 46}, m = "invokeSuspend")
public final class C910620Znw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC910720Zo6 LL;
    public GroupChatUnreadIndicatorViewModel LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public final /* synthetic */ GroupChatUnreadIndicatorViewModel LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ List<C910680Zo2> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910620Znw(GroupChatUnreadIndicatorViewModel groupChatUnreadIndicatorViewModel, int i, long j, List<C910680Zo2> list, InterfaceC1364105Vn<? super C910620Znw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = groupChatUnreadIndicatorViewModel;
        this.LLIZ = i;
        this.LLIZLLLIL = j;
        this.LLJ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C910620Znw(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073 A[PHI: r5 r6 r13 r15
      0x0073: PHI (r5v4 java.util.Iterator) = (r5v3 java.util.Iterator), (r5v5 java.util.Iterator) binds: [B:16:0x0058, B:24:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r6v2 com.ss.android.ugc.aweme.im.sdk.unreadindicator.GroupChatUnreadIndicatorViewModel) = 
      (r6v1 com.ss.android.ugc.aweme.im.sdk.unreadindicator.GroupChatUnreadIndicatorViewModel)
      (r6v3 com.ss.android.ugc.aweme.im.sdk.unreadindicator.GroupChatUnreadIndicatorViewModel)
     binds: [B:16:0x0058, B:24:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r13v2 long) = (r13v1 long), (r13v3 long) binds: [B:16:0x0058, B:24:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r15v1 X.0Zo6) = (r15v0 X.0Zo6), (r15v2 X.0Zo6) binds: [B:16:0x0058, B:24:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:24:0x00aa). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C910620Znw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
