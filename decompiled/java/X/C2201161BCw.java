package X;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201161BCw extends AbstractC2201091BCp<C1BDB> implements InterfaceC1593780rZo {
    public String LJFF;

    @Override // X.AbstractC2201091BCp
    public final void LJIIL() {
        ((ArrayList) C20533215Wg.LJ).add(this);
    }

    @Override // X.AbstractC2201091BCp
    public final C1BDB LJIILIIL() {
        return new C1BDB();
    }

    @Override // X.AbstractC2201091BCp
    public final C1BDB LJIILJJIL() {
        C1BDB c1bdb = new C1BDB();
        c1bdb.LIZ = this.LJFF;
        return c1bdb;
    }

    @Override // X.AbstractC2201091BCp
    public final InterfaceC1702080uOU LJIIJJI() {
        return EnumC2184731Aet.Page;
    }

    @Override // X.InterfaceC1593780rZo
    public final void LIZLLL(String str) {
        this.LJFF = str;
        C1BDB c1bdb = new C1BDB();
        c1bdb.LIZ = this.LJFF;
        LJJ(c1bdb);
    }

    @Override // X.AbstractC2201091BCp
    public final boolean LJIILLIIL(C1BDB c1bdb, C1BDB c1bdb2) {
        return !Intrinsics.LJFF(c1bdb.LIZ, c1bdb2.LIZ);
    }
}
