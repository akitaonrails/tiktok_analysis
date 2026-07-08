package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Z09, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z09 implements InterfaceC882520Yji {
    public final /* synthetic */ InterfaceC20236714Gf<Object> LIZ;

    @Override // X.InterfaceC882520Yji
    public final void LIZIZ(Map<String, ? extends Object> map) {
    }

    public C0Z09(C2252611DEt c2252611DEt) {
        this.LIZ = c2252611DEt;
    }

    @Override // X.InterfaceC882520Yji
    public final void LIZ(C892820Z0u c892820Z0u) {
        InterfaceC20236714Gf<Object> interfaceC20236714Gf = this.LIZ;
        C098200Yq c098200Yq = new C098200Yq(c892820Z0u);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
    }

    @Override // X.InterfaceC882520Yji
    public final void onSuccess(Object obj) {
        InterfaceC20236714Gf<Object> interfaceC20236714Gf = this.LIZ;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
    }
}
