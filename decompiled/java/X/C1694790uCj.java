package X;

import android.graphics.Rect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS58S0500000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694790uCj extends AbstractC1693180uA8 {
    public C09AE LIZIZ;
    public C1694800uCk LIZJ;
    public C2252331DDr LIZLLL;

    @Override // X.InterfaceC1692040u8I
    public final void LIZ() {
        C09AE c09ae = this.LIZIZ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LIZIZ = null;
        C05YC<Unit> c05ycLJIIJ = LJIIJ();
        if (c05ycLJIIJ != null) {
            ((C2252331DDr) c05ycLJIIJ).LIZIZ();
        }
    }

    @Override // X.AbstractC1693180uA8, X.InterfaceC1692040u8I
    public final void LIZJ() {
        InterfaceC1694690uCZ interfaceC1694690uCZ = this.LIZ;
        if (interfaceC1694690uCZ != null) {
            this.LIZIZ = interfaceC1694690uCZ.LJLJJI(new C1694950uCz(null, this, interfaceC1694690uCZ, null));
        }
    }

    public final C05YC<Unit> LJIIJ() {
        C2252331DDr c2252331DDr = this.LIZLLL;
        if (c2252331DDr != null) {
            return c2252331DDr;
        }
        if (!C1694930uCx.LIZ) {
            return null;
        }
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, EnumC2252401DDy.DROP_LATEST, 2);
        this.LIZLLL = c2252331DDrLIZIZ;
        return c2252331DDrLIZIZ;
    }

    @Override // X.AbstractC1693180uA8
    public final void LJIIIIZZ() {
        C05YC<Unit> c05ycLJIIJ = LJIIJ();
        if (c05ycLJIIJ != null) {
            ((C2252331DDr) c05ycLJIIJ).LIZJ(Unit.LIZ);
        }
    }

    @Override // X.AbstractC1693180uA8, X.InterfaceC1692040u8I
    public final void LJI(C1683130ttv c1683130ttv) {
        Rect rect;
        C1694800uCk c1694800uCk = this.LIZJ;
        if (c1694800uCk != null) {
            c1694800uCk.LJIIJJI = new Rect(C814420VxA.LIZIZ(c1683130ttv.LIZ), C814420VxA.LIZIZ(c1683130ttv.LIZIZ), C814420VxA.LIZIZ(c1683130ttv.LIZJ), C814420VxA.LIZIZ(c1683130ttv.LIZLLL));
            if (((ArrayList) c1694800uCk.LJIIIZ).isEmpty() && (rect = c1694800uCk.LJIIJJI) != null) {
                c1694800uCk.LIZ.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    @Override // X.InterfaceC1692040u8I
    public final void LIZLLL(C1686970u07 c1686970u07, C1686970u07 c1686970u072) {
        boolean z;
        int iLJI;
        int iLJFF;
        int iLJI2;
        C1694800uCk c1694800uCk = this.LIZJ;
        if (c1694800uCk != null) {
            if (C1692280u8g.LIZIZ(c1694800uCk.LJII.LIZIZ, c1686970u072.LIZIZ) && Intrinsics.LJFF(c1694800uCk.LJII.LIZJ, c1686970u072.LIZJ)) {
                z = false;
            } else {
                z = true;
            }
            c1694800uCk.LJII = c1686970u072;
            int size = ((ArrayList) c1694800uCk.LJIIIZ).size();
            for (int i = 0; i < size; i++) {
                InputConnectionC1694650uCV inputConnectionC1694650uCV = (InputConnectionC1694650uCV) ((Reference) ListProtector.get(c1694800uCk.LJIIIZ, i)).get();
                if (inputConnectionC1694650uCV != null) {
                    inputConnectionC1694650uCV.LJI = c1686970u072;
                }
            }
            C1694810uCl c1694810uCl = c1694800uCk.LJIIL;
            synchronized (c1694810uCl.LIZJ) {
                try {
                    c1694810uCl.LJIIIZ = null;
                    c1694810uCl.LJIIJJI = null;
                    c1694810uCl.LJIIJ = null;
                    c1694810uCl.LJIIL = null;
                    c1694810uCl.LJIILIIL = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            int iLJFF2 = -1;
            if (Intrinsics.LJFF(c1686970u07, c1686970u072)) {
                if (z) {
                    InterfaceC1694900uCu interfaceC1694900uCu = c1694800uCk.LIZIZ;
                    int iLJI3 = C1692280u8g.LJI(c1686970u072.LIZIZ);
                    int iLJFF3 = C1692280u8g.LJFF(c1686970u072.LIZIZ);
                    C1692280u8g c1692280u8g = c1694800uCk.LJII.LIZJ;
                    if (c1692280u8g != null) {
                        iLJI2 = C1692280u8g.LJI(c1692280u8g.LIZ);
                    } else {
                        iLJI2 = -1;
                    }
                    C1692280u8g c1692280u8g2 = c1694800uCk.LJII.LIZJ;
                    if (c1692280u8g2 != null) {
                        iLJFF2 = C1692280u8g.LJFF(c1692280u8g2.LIZ);
                    }
                    interfaceC1694900uCu.LIZ(iLJI3, iLJFF3, iLJI2, iLJFF2);
                    return;
                }
                return;
            }
            if (c1686970u07 != null && (!Intrinsics.LJFF(c1686970u07.LIZ.LLILLJJLI, c1686970u072.LIZ.LLILLJJLI) || (C1692280u8g.LIZIZ(c1686970u07.LIZIZ, c1686970u072.LIZIZ) && !Intrinsics.LJFF(c1686970u07.LIZJ, c1686970u072.LIZJ)))) {
                c1694800uCk.LIZIZ.LIZIZ();
                return;
            }
            int size2 = ((ArrayList) c1694800uCk.LJIIIZ).size();
            for (int i2 = 0; i2 < size2; i2++) {
                InputConnectionC1694650uCV inputConnectionC1694650uCV2 = (InputConnectionC1694650uCV) ((Reference) ListProtector.get(c1694800uCk.LJIIIZ, i2)).get();
                if (inputConnectionC1694650uCV2 != null) {
                    C1686970u07 c1686970u073 = c1694800uCk.LJII;
                    InterfaceC1694900uCu interfaceC1694900uCu2 = c1694800uCk.LIZIZ;
                    if (inputConnectionC1694650uCV2.LJIIJ) {
                        inputConnectionC1694650uCV2.LJI = c1686970u073;
                        if (inputConnectionC1694650uCV2.LJIIIIZZ) {
                            interfaceC1694900uCu2.updateExtractedText(inputConnectionC1694650uCV2.LJII, C1695910uEX.LIZ(c1686970u073));
                        }
                        C1692280u8g c1692280u8g3 = c1686970u073.LIZJ;
                        if (c1692280u8g3 != null) {
                            iLJI = C1692280u8g.LJI(c1692280u8g3.LIZ);
                        } else {
                            iLJI = -1;
                        }
                        C1692280u8g c1692280u8g4 = c1686970u073.LIZJ;
                        if (c1692280u8g4 != null) {
                            iLJFF = C1692280u8g.LJFF(c1692280u8g4.LIZ);
                        } else {
                            iLJFF = -1;
                        }
                        interfaceC1694900uCu2.LIZ(C1692280u8g.LJI(c1686970u073.LIZIZ), C1692280u8g.LJFF(c1686970u073.LIZIZ), iLJI, iLJFF);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1692040u8I
    public final void LIZIZ(C1686970u07 c1686970u07, C1695020uD6 c1695020uD6, AwS234S0300000_25 awS234S0300000_25, AwS604S0100000_25 awS604S0100000_25) {
        AwS58S0500000_25 awS58S0500000_25 = new AwS58S0500000_25(c1686970u07, this, c1695020uD6, awS234S0300000_25, awS604S0100000_25, 12);
        InterfaceC1694690uCZ interfaceC1694690uCZ = this.LIZ;
        if (interfaceC1694690uCZ != null) {
            this.LIZIZ = interfaceC1694690uCZ.LJLJJI(new C1694950uCz(awS58S0500000_25, this, interfaceC1694690uCZ, null));
        }
    }

    @Override // X.AbstractC1693180uA8, X.InterfaceC1692040u8I
    public final void LJ(C1686970u07 c1686970u07, InterfaceC1692600u9C interfaceC1692600u9C, C1692150u8T c1692150u8T, AwS604S0100000_25 awS604S0100000_25, C1683130ttv c1683130ttv, C1683130ttv c1683130ttv2) {
        C1694800uCk c1694800uCk = this.LIZJ;
        if (c1694800uCk != null) {
            C1694810uCl c1694810uCl = c1694800uCk.LJIIL;
            synchronized (c1694810uCl.LIZJ) {
                try {
                    c1694810uCl.LJIIIZ = c1686970u07;
                    c1694810uCl.LJIIJJI = interfaceC1692600u9C;
                    c1694810uCl.LJIIJ = c1692150u8T;
                    c1694810uCl.LJIIL = c1683130ttv;
                    c1694810uCl.LJIILIIL = c1683130ttv2;
                    if (c1694810uCl.LJ || c1694810uCl.LIZLLL) {
                        c1694810uCl.LIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
