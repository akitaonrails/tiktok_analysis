package X;

import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultAllTabVM;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iQE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultAllTabVM$refresh$localJob$1", f = "InboxSearchResultAllTabVM.kt", l = {161, 341, 165}, m = "invokeSuspend")
public final class C1241880iQE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ InboxSearchResultAllTabVM LLJ;
    public final /* synthetic */ C1242050iQV LLJI;
    public final /* synthetic */ Map<EnumC1241910iQH, List<InterfaceC1240590iO9>> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241880iQE(InboxSearchResultAllTabVM inboxSearchResultAllTabVM, C1242050iQV c1242050iQV, Map<EnumC1241910iQH, List<InterfaceC1240590iO9>> map, InterfaceC1364105Vn<? super C1241880iQE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = inboxSearchResultAllTabVM;
        this.LLJI = c1242050iQV;
        this.LLJIJIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1241880iQE c1241880iQE = new C1241880iQE(this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c1241880iQE.LLIZLLLIL = obj;
        return c1241880iQE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea A[Catch: all -> 0x016b, TryCatch #2 {all -> 0x016b, blocks: (B:8:0x0033, B:27:0x00e4, B:29:0x00ea, B:37:0x0134, B:41:0x0167), top: B:50:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0134 A[Catch: all -> 0x016b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x016b, blocks: (B:8:0x0033, B:27:0x00e4, B:29:0x00ea, B:37:0x0134, B:41:0x0167), top: B:50:0x0033 }] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ba -> B:14:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0113 -> B:46:0x0116). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1241880iQE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
