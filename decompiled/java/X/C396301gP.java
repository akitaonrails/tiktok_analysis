package X;

import com.bytedance.android.live.effect.bulletin.LiveBoardsViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01gP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.bulletin.LiveBoardsViewModel$fetchLiveBoardsEffect$1", f = "LiveBoardsViewModel.kt", l = {41, 45, 46, BaseNotice.RECOMMEND_LIVE, 56, 58, 63}, m = "invokeSuspend")
public final class C396301gP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ LiveBoardsViewModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C396301gP(LiveBoardsViewModel liveBoardsViewModel, String str, InterfaceC1364105Vn<? super C396301gP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveBoardsViewModel;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C396301gP(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:50:0x0103, B:51:0x0106, B:52:0x010b, B:54:0x0119, B:58:0x0135, B:42:0x00e0, B:43:0x00e3, B:44:0x00e8, B:46:0x00ee, B:35:0x00c0, B:36:0x00c3, B:38:0x00cb, B:15:0x0052, B:16:0x005e, B:18:0x0064, B:20:0x0073, B:22:0x0077, B:25:0x007d, B:27:0x0086, B:29:0x00ad, B:31:0x00b4, B:24:0x007b, B:62:0x0172), top: B:71:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:50:0x0103, B:51:0x0106, B:52:0x010b, B:54:0x0119, B:58:0x0135, B:42:0x00e0, B:43:0x00e3, B:44:0x00e8, B:46:0x00ee, B:35:0x00c0, B:36:0x00c3, B:38:0x00cb, B:15:0x0052, B:16:0x005e, B:18:0x0064, B:20:0x0073, B:22:0x0077, B:25:0x007d, B:27:0x0086, B:29:0x00ad, B:31:0x00b4, B:24:0x007b, B:62:0x0172), top: B:71:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:50:0x0103, B:51:0x0106, B:52:0x010b, B:54:0x0119, B:58:0x0135, B:42:0x00e0, B:43:0x00e3, B:44:0x00e8, B:46:0x00ee, B:35:0x00c0, B:36:0x00c3, B:38:0x00cb, B:15:0x0052, B:16:0x005e, B:18:0x0064, B:20:0x0073, B:22:0x0077, B:25:0x007d, B:27:0x0086, B:29:0x00ad, B:31:0x00b4, B:24:0x007b, B:62:0x0172), top: B:71:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:50:0x0103, B:51:0x0106, B:52:0x010b, B:54:0x0119, B:58:0x0135, B:42:0x00e0, B:43:0x00e3, B:44:0x00e8, B:46:0x00ee, B:35:0x00c0, B:36:0x00c3, B:38:0x00cb, B:15:0x0052, B:16:0x005e, B:18:0x0064, B:20:0x0073, B:22:0x0077, B:25:0x007d, B:27:0x0086, B:29:0x00ad, B:31:0x00b4, B:24:0x007b, B:62:0x0172), top: B:71:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:50:0x0103, B:51:0x0106, B:52:0x010b, B:54:0x0119, B:58:0x0135, B:42:0x00e0, B:43:0x00e3, B:44:0x00e8, B:46:0x00ee, B:35:0x00c0, B:36:0x00c3, B:38:0x00cb, B:15:0x0052, B:16:0x005e, B:18:0x0064, B:20:0x0073, B:22:0x0077, B:25:0x007d, B:27:0x0086, B:29:0x00ad, B:31:0x00b4, B:24:0x007b, B:62:0x0172), top: B:71:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0119 A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:50:0x0103, B:51:0x0106, B:52:0x010b, B:54:0x0119, B:58:0x0135, B:42:0x00e0, B:43:0x00e3, B:44:0x00e8, B:46:0x00ee, B:35:0x00c0, B:36:0x00c3, B:38:0x00cb, B:15:0x0052, B:16:0x005e, B:18:0x0064, B:20:0x0073, B:22:0x0077, B:25:0x007d, B:27:0x0086, B:29:0x00ad, B:31:0x00b4, B:24:0x007b, B:62:0x0172), top: B:71:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135 A[Catch: Exception -> 0x0177, TRY_ENTER, TryCatch #0 {Exception -> 0x0177, blocks: (B:50:0x0103, B:51:0x0106, B:52:0x010b, B:54:0x0119, B:58:0x0135, B:42:0x00e0, B:43:0x00e3, B:44:0x00e8, B:46:0x00ee, B:35:0x00c0, B:36:0x00c3, B:38:0x00cb, B:15:0x0052, B:16:0x005e, B:18:0x0064, B:20:0x0073, B:22:0x0077, B:25:0x007d, B:27:0x0086, B:29:0x00ad, B:31:0x00b4, B:24:0x007b, B:62:0x0172), top: B:71:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C396301gP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
