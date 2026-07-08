package X;

/* JADX INFO: renamed from: X.0uUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.PrefabPaginatedResProvider", f = "PrefabPaginatedResProvider.kt", l = {97}, m = "fetchPrefabSubList")
public final class C1706040uUs extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1705990uUn LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706040uUs(C1705990uUn c1705990uUn, InterfaceC1364105Vn<? super C1706040uUs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1705990uUn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PrefabPaginatedResProvider@ac.fetchPrefabSubList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, 0, null, 0, null, this);
        C1C7U.LIZIZ("PrefabPaginatedResProvider@ac.fetchPrefabSubList$1");
        return objLIZ;
    }
}
