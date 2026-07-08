package X;

import com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Yd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl$fetchGroupStatus$2", f = "InboxGroupChatSocialStatusViewModelImpl.kt", l = {346, 375, 390}, m = "invokeSuspend")
public final class C2135308Yd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InboxGroupChatSocialStatusViewModelImpl LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2135308Yd(InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl, List<String> list, String str, InterfaceC1364105Vn<? super C2135308Yd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = inboxGroupChatSocialStatusViewModelImpl;
        this.LLILZIL = list;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2135308Yd c2135308Yd = new C2135308Yd(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c2135308Yd.LLILLL = obj;
        return c2135308Yd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c1, code lost:
    
        if (X.C23250099c.LJI(r14, r2, r1) == r9) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.im.saas.host.api.feature.story.GroupChatStoryFeature] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2135308Yd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
