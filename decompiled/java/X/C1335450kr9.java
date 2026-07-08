package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335450kr9 implements InterfaceC1335470krB {
    public static final Class<?> LJII = C1335450kr9.class;
    public final int LIZ;
    public final InterfaceC1320070kSL<File> LIZIZ;
    public final String LIZJ;
    public final InterfaceC1320070kSL<File> LIZLLL;
    public final String LJ;
    public final InterfaceC1331440kkg LJFF;
    public volatile C1335540krI LJI = new C1335540krI(null, null);

    public final synchronized InterfaceC1335470krB LJIIL() {
        InterfaceC1335470krB interfaceC1335470krB;
        File file;
        C1335540krI c1335540krI = this.LJI;
        if (c1335540krI.LIZ == null || (file = c1335540krI.LIZIZ) == null || !file.exists()) {
            if (this.LJI.LIZ != null && this.LJI.LIZIZ != null) {
                C1335730krb.LIZIZ(this.LJI.LIZIZ);
            }
            LJIIJJI();
        }
        interfaceC1335470krB = this.LJI.LIZ;
        interfaceC1335470krB.getClass();
        return interfaceC1335470krB;
    }

    public final void LJIIJJI() throws C1335550krJ {
        C0VSJ c0vsj = new C0VSJ(this.LIZIZ.get(), this.LIZJ);
        C0VSJ c0vsj2 = new C0VSJ(this.LIZLLL.get(), this.LJ);
        try {
            C1335490krD.LIZ(c0vsj);
            Class<?> cls = LJII;
            C1328570kg3.LIZ("Created cache directory %s", c0vsj.getAbsolutePath());
            try {
                C1335490krD.LIZ(c0vsj2);
            } catch (C1335550krJ e) {
                TryCatchGuardChecker.doCheck(e);
                C1328570kg3.LJ(cls, "create config directory %s failed", c0vsj2.getAbsoluteFile());
            }
            C1328570kg3.LIZ("Created config directory %s", c0vsj2.getAbsolutePath());
            this.LJI = new C1335540krI(c0vsj, new C1335660krU(c0vsj, c0vsj2, this.LIZ, this.LJFF));
        } catch (C1335550krJ e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LJFF.getClass();
            throw e2;
        }
    }

    @Override // X.InterfaceC1335470krB
    public final C1325500kb6 LIZ() {
        return LJIIL().LIZ();
    }

    @Override // X.InterfaceC1335470krB
    public final void LIZIZ() {
        try {
            LJIIL().LIZIZ();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LIZLLL(LJII, "purgeUnexpectedResources", e);
        }
    }

    @Override // X.InterfaceC1335470krB
    public final List<InterfaceC1335610krP> LIZLLL() {
        return LJIIL().LIZLLL();
    }

    @Override // X.InterfaceC1335470krB
    public final Collection<InterfaceC1335610krP> LJ() {
        return LJIIL().LJ();
    }

    @Override // X.InterfaceC1335470krB
    public final Collection<InterfaceC1335610krP> LJIIIZ() {
        return LJIIL().LJIIIZ();
    }

    @Override // X.InterfaceC1335470krB
    public final void clearAll() {
        LJIIL().clearAll();
    }

    @Override // X.InterfaceC1335470krB
    public final boolean isExternal() {
        try {
            return LJIIL().isExternal();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC1335470krB
    public final long LIZJ(InterfaceC1335610krP interfaceC1335610krP) {
        return LJIIL().LIZJ(interfaceC1335610krP);
    }

    @Override // X.InterfaceC1335470krB
    public final long LJIIIIZZ(String str) {
        return LJIIL().LJIIIIZZ(str);
    }

    @Override // X.InterfaceC1335470krB
    public final long remove(String str) {
        return LJIIL().remove(str);
    }

    @Override // X.InterfaceC1335470krB
    public final Map LJFF(Object obj, String str) {
        return LJIIL().LJFF(obj, str);
    }

    @Override // X.InterfaceC1335470krB
    public final InterfaceC1317730kOZ LJI(Object obj, String str) {
        return LJIIL().LJI(obj, str);
    }

    @Override // X.InterfaceC1335470krB
    public final boolean LJII(Object obj, String str) {
        return LJIIL().LJII(obj, str);
    }

    @Override // X.InterfaceC1335470krB
    public final InterfaceC1335640krS LJIIJ(Object obj, String str) {
        return LJIIL().LJIIJ(obj, str);
    }

    public C1335450kr9(int i, InterfaceC1320070kSL interfaceC1320070kSL, String str, InterfaceC1320070kSL interfaceC1320070kSL2, String str2, C1330900kjo c1330900kjo) {
        this.LIZ = i;
        this.LJFF = c1330900kjo;
        this.LIZIZ = interfaceC1320070kSL;
        this.LIZJ = str;
        this.LIZLLL = interfaceC1320070kSL2;
        this.LJ = str2;
    }
}
