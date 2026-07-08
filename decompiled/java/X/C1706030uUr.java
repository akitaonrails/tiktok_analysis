package X;

/* JADX INFO: renamed from: X.0uUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.PrefabPaginatedResProvider", f = "PrefabPaginatedResProvider.kt", l = {55, 66, 76}, m = "fetchPrefabCategory")
public final class C1706030uUr extends AbstractC23140094w {
    public Object LL;
    public C1706100uUy LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1705990uUn LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706030uUr(C1705990uUn c1705990uUn, InterfaceC1364105Vn<? super C1706030uUr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1705990uUn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PrefabPaginatedResProvider@ac.fetchPrefabCategory$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(null, null, this);
        C1C7U.LIZIZ("PrefabPaginatedResProvider@ac.fetchPrefabCategory$1");
        return objLIZIZ;
    }
}
