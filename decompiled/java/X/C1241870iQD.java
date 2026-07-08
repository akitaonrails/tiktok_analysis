package X;

import com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultAllTabVM;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iQD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultAllTabVM$refresh$1$job$1", f = "InboxSearchResultAllTabVM.kt", l = {184, 207, 339, 214}, m = "invokeSuspend")
public final class C1241870iQD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public InboxSearchPowerChunkProtocol LLILZIL;
    public C1242050iQV LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ InboxSearchPowerChunkProtocol LLJ;
    public final /* synthetic */ InboxSearchResultAllTabVM LLJI;
    public final /* synthetic */ C1242050iQV LLJIJIL;
    public final /* synthetic */ Map<EnumC1241910iQH, List<InterfaceC1240590iO9>> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241870iQD(InboxSearchPowerChunkProtocol inboxSearchPowerChunkProtocol, InboxSearchResultAllTabVM inboxSearchResultAllTabVM, C1242050iQV c1242050iQV, Map<EnumC1241910iQH, List<InterfaceC1240590iO9>> map, InterfaceC1364105Vn<? super C1241870iQD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = inboxSearchPowerChunkProtocol;
        this.LLJI = inboxSearchResultAllTabVM;
        this.LLJIJIL = c1242050iQV;
        this.LLJILJIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1241870iQD c1241870iQD = new C1241870iQD(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c1241870iQD.LLIZLLLIL = obj;
        return c1241870iQD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0144 A[Catch: all -> 0x01c7, TryCatch #1 {all -> 0x01c7, blocks: (B:33:0x0139, B:34:0x013c, B:36:0x0144, B:37:0x0150, B:39:0x0156, B:40:0x016e, B:44:0x01c3), top: B:55:0x0016 }] */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultAllTabVM] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1241870iQD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
