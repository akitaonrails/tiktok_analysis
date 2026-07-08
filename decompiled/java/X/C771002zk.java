package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.02zk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C771002zk extends C035N<C730202tA> implements InterfaceC772302zx {
    public final C032I LIZJ;

    @Override // X.InterfaceC772302zx
    public final Pair<C719202rO, C723002s0> LJJJJLL() {
        C743202vG c743202vGLJJIII;
        AnonymousClass0302 anonymousClass0302 = (AnonymousClass0302) this.LIZJ.vr2(AnonymousClass0302.class);
        if (anonymousClass0302 == null || (c743202vGLJJIII = anonymousClass0302.LJJIII()) == null) {
            return null;
        }
        return c743202vGLJJIII.LIZ;
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C730202tA(0);
    }

    public C771002zk(C032I c032i) {
        this.LIZJ = c032i;
    }
}
