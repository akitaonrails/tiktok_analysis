package X;

import com.bytedance.provider.impl.GScope;

/* JADX INFO: renamed from: X.0qZq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555360qZq implements InterfaceC665370Q7z {
    public final Object LL;
    public final C1555350qZp LLILLJJLI = new C1554890qZ5(this) { // from class: X.0qZp
        @Override // X.C1554890qZ5
        public final void LIZIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        }

        @Override // X.C1554890qZ5
        public final void LJ() {
        }

        @Override // X.C1554890qZ5
        public final void LJFF() {
        }

        @Override // X.C1554890qZ5
        public final InterfaceC665370Q7z LJI() {
            return GScope.LL;
        }
    };
    public final String LLILLL = "Default_Scope_Key";

    @Override // X.InterfaceC665370Q7z
    public final Object getHost() {
        return this.LL;
    }

    @Override // X.InterfaceC665370Q7z
    public final String getKey() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC665370Q7z
    public final C1554890qZ5 getTree() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0qZp] */
    public C1555360qZq(Object obj) {
        this.LL = obj;
    }
}
