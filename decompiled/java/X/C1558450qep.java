package X;

/* JADX INFO: renamed from: X.0qep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1558450qep implements InterfaceC665370Q7z {
    public final Object host;
    public final String key;
    public C1554890qZ5 lazyVScopeTree;
    public final C01GW tree$delegate = C452501pT.LIZIZ(new C1558460qeq(this));

    @Override // X.InterfaceC665370Q7z
    public C1554890qZ5 getTree() {
        return (C1554890qZ5) this.tree$delegate.getValue();
    }

    @Override // X.InterfaceC665370Q7z
    public Object getHost() {
        return this.host;
    }

    @Override // X.InterfaceC665370Q7z
    public String getKey() {
        return this.key;
    }

    public final C1554890qZ5 getLazyVScopeTree$assem_release() {
        return this.lazyVScopeTree;
    }

    public final void setLazyVScopeTree$assem_release(C1554890qZ5 c1554890qZ5) {
        this.lazyVScopeTree = c1554890qZ5;
    }

    public C1558450qep(String str, Object obj) {
        this.key = str;
        this.host = obj;
    }
}
