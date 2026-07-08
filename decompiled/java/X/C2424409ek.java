package X;

import java.util.List;

/* JADX INFO: renamed from: X.09ek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2424409ek implements InterfaceC2121108Sr {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ List LJ;
    public final /* synthetic */ C2424609em LJFF;

    public C2424409ek(long j, C2424609em c2424609em, List list, List list2, List list3, boolean z) {
        this.LJFF = c2424609em;
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = list3;
    }

    @Override // X.InterfaceC2121108Sr
    public final void LIZIZ() {
        if (this.LIZLLL) {
            return;
        }
        C2424609em c2424609em = this.LJFF;
        List list = this.LJ;
        List list2 = this.LIZ;
        List list3 = this.LIZIZ;
        c2424609em.LJIIIIZZ.zza().LIZ(list, new C2424409ek(this.LIZJ, c2424609em, list2, list3, list, true));
    }

    @Override // X.InterfaceC2121108Sr
    public final void zza() {
        C2424609em c2424609em = this.LJFF;
        List list = this.LIZ;
        List list2 = this.LIZIZ;
        long j = this.LIZJ;
        c2424609em.LJIIJJI.addAll(list);
        c2424609em.LJIIL.addAll(list2);
        Long lValueOf = Long.valueOf(j);
        c2424609em.LJIIJJI(5, 0, null, lValueOf, lValueOf, null, null);
    }

    @Override // X.InterfaceC2121108Sr
    public final void LIZ(int i) {
        this.LJFF.LJIIJJI(6, i, null, null, null, null, null);
    }
}
