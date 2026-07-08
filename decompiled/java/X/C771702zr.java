package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.02zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C771702zr extends C035N<C729902t7> implements AnonymousClass0306 {
    public final C032I LIZJ;

    @Override // X.AnonymousClass0306
    public final C719202rO LJJLIL() {
        C743202vG c743202vGLJJIII;
        Pair<C719202rO, C723002s0> pair;
        AnonymousClass0302 anonymousClass0302 = (AnonymousClass0302) this.LIZJ.vr2(AnonymousClass0302.class);
        if (anonymousClass0302 == null || (c743202vGLJJIII = anonymousClass0302.LJJIII()) == null || (pair = c743202vGLJJIII.LIZ) == null) {
            return null;
        }
        return pair.getFirst();
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C729902t7(0);
    }

    public C771702zr(C032I c032i) {
        this.LIZJ = c032i;
    }
}
