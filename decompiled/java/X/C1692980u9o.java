package X;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS269S0300000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import o0.k;

/* JADX INFO: renamed from: X.0u9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692980u9o {
    public final C05P0 LIZ = C20028913Yh.LJI(null);
    public C1692220u8a LIZIZ;
    public final C13ES<Function1<C1691750u7p, Unit>> LIZJ;

    public C1692980u9o(C1692220u8a c1692220u8a) {
        AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(588);
        c1692220u8a.getClass();
        C1692230u8b c1692230u8b = new C1692230u8b(c1692220u8a);
        ArrayList arrayList = (ArrayList) c1692230u8b.LLILLL;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) aFwS266S0000000_25.invoke(((C1692290u8h) ListProtector.get(arrayList, i)).LIZ(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C1692270u8f c1692270u8f = (C1692270u8f) ListProtector.get(list, i2);
                arrayList3.add(new C1692290u8h(c1692270u8f.LIZ, c1692270u8f.LIZIZ, c1692270u8f.LIZJ, c1692270u8f.LIZLLL));
            }
            C19719612Di.LJJI(arrayList3, arrayList2);
        }
        ((ArrayList) c1692230u8b.LLILLL).clear();
        ((ArrayList) c1692230u8b.LLILLL).addAll(arrayList2);
        this.LIZIZ = c1692230u8b.LJIIL();
        this.LIZJ = new C13ES<>();
    }

    public static C1692270u8f LIZJ(C1692270u8f c1692270u8f, C1692150u8T c1692150u8T) {
        int iLJI = c1692150u8T.LJI(c1692150u8T.LIZIZ.LJFF - 1, false);
        if (c1692270u8f.LIZIZ >= iLJI) {
            return null;
        }
        return C1692270u8f.LIZ(c1692270u8f, null, Math.min(c1692270u8f.LIZJ, iLJI), 11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj;
        Object obj2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1154651354);
        char c = 2;
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i2 & 1, z)) {
            InterfaceC1693160uA6 interfaceC1693160uA6 = (InterfaceC1693160uA6) c13zcLJIIJ.LJJIL(C20055113dV.LJIIZILJ);
            C1692220u8a c1692220u8a = this.LIZIZ;
            List listLIZ = c1692220u8a.LIZ(c1692220u8a.length());
            int size = listLIZ.size();
            int i4 = 0;
            while (i4 < size) {
                C1692270u8f c1692270u8f = (C1692270u8f) ListProtector.get(listLIZ, i4);
                if (c1692270u8f.LIZIZ != c1692270u8f.LIZJ) {
                    c13zcLJIIJ.LJJIIJZLJL(1386075176);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                    if (objLJJ == c1680520tpi) {
                        objLJJ = new C612270Nzt();
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    InterfaceC595010NVj interfaceC595010NVj = (InterfaceC595010NVj) objLJJ;
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C596250Na3.LIZ(C1689740u4a.LIZIZ(C1679660toK.LIZ(InterfaceC1685750ty9.LIZ, new AwS391S0200000_25(this, (C1692980u9o) c1692270u8f, (C1692270u8f<AbstractC1693010u9r>) 398)), false, AFwS266S0000000_25.get$arr$(589)).LIZ(new C1690620u60(new C1691740u7o(this, c1692270u8f))), interfaceC595010NVj);
                    InterfaceC1693130uA3.LIZ.getClass();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = interfaceC1685750ty9LIZ.LIZ(new PointerHoverIconModifierElement(C1693140uA4.LIZJ, false));
                    boolean zLJII = c13zcLJIIJ.LJII(this) | c13zcLJIIJ.LJJIIJ(c1692270u8f) | c13zcLJIIJ.LJII(interfaceC1693160uA6);
                    Object objLJJ2 = c13zcLJIIJ.LJJ();
                    if (zLJII || objLJJ2 == c1680520tpi) {
                        objLJJ2 = new AwS269S0300000_25(this, (C1692980u9o) c1692270u8f, (C1692270u8f<AbstractC1693010u9r>) interfaceC1693160uA6, (InterfaceC1693160uA6) 31);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                    }
                    Object obj3 = null;
                    k.LIZ(C634380OuS.LIZLLL(interfaceC1685750ty9LIZ2, interfaceC595010NVj, null, true, null, null, null, null, null, true, (Function0) objLJJ2), c13zcLJIIJ, 0);
                    C1693060u9w c1693060u9wLIZIZ = ((AbstractC1693010u9r) c1692270u8f.LIZ).LIZIZ();
                    if (c1693060u9wLIZIZ == null || (c1693060u9wLIZIZ.LIZ == null && c1693060u9wLIZIZ.LIZIZ == null && c1693060u9wLIZIZ.LIZJ == null && c1693060u9wLIZIZ.LIZLLL == null)) {
                        c13zcLJIIJ.LJJIIJZLJL(1388926990);
                        c13zcLJIIJ.LJJJJL(false);
                    } else {
                        c13zcLJIIJ.LJJIIJZLJL(1386898319);
                        Object objLJJ3 = c13zcLJIIJ.LJJ();
                        if (objLJJ3 == c1680520tpi) {
                            objLJJ3 = new C1693040u9u(interfaceC595010NVj);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                        }
                        C1693040u9u c1693040u9u = (C1693040u9u) objLJJ3;
                        Unit unit = Unit.LIZ;
                        Object objLJJ4 = c13zcLJIIJ.LJJ();
                        Object obj4 = null;
                        if (objLJJ4 == c1680520tpi) {
                            objLJJ4 = new C1693000u9q(c1693040u9u, null);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                        }
                        C1680540tpk.LJFF(unit, (Function2) objLJJ4, c13zcLJIIJ);
                        Object[] objArr = new Object[7];
                        if ((((C13FG) c1693040u9u.LIZIZ).LIZLLL() & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objArr[0] = Boolean.valueOf(z2);
                        if ((((C13FG) c1693040u9u.LIZIZ).LIZLLL() & 1) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objArr[1] = Boolean.valueOf(z3);
                        if ((((C13FG) c1693040u9u.LIZIZ).LIZLLL() & 4) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objArr[c] = Boolean.valueOf(z4);
                        C1693060u9w c1693060u9wLIZIZ2 = ((AbstractC1693010u9r) c1692270u8f.LIZ).LIZIZ();
                        if (c1693060u9wLIZIZ2 != null) {
                            obj = c1693060u9wLIZIZ2.LIZ;
                        } else {
                            obj = null;
                        }
                        objArr[3] = obj;
                        C1693060u9w c1693060u9wLIZIZ3 = ((AbstractC1693010u9r) c1692270u8f.LIZ).LIZIZ();
                        if (c1693060u9wLIZIZ3 != null) {
                            obj2 = c1693060u9wLIZIZ3.LIZIZ;
                        } else {
                            obj2 = null;
                        }
                        objArr[4] = obj2;
                        C1693060u9w c1693060u9wLIZIZ4 = ((AbstractC1693010u9r) c1692270u8f.LIZ).LIZIZ();
                        if (c1693060u9wLIZIZ4 != null) {
                            obj3 = c1693060u9wLIZIZ4.LIZJ;
                        }
                        objArr[5] = obj3;
                        C1693060u9w c1693060u9wLIZIZ5 = ((AbstractC1693010u9r) c1692270u8f.LIZ).LIZIZ();
                        if (c1693060u9wLIZIZ5 != null) {
                            obj4 = c1693060u9wLIZIZ5.LIZLLL;
                        }
                        objArr[6] = obj4;
                        boolean zLJII2 = c13zcLJIIJ.LJII(this) | c13zcLJIIJ.LJJIIJ(c1692270u8f);
                        Object objLJJ5 = c13zcLJIIJ.LJJ();
                        if (zLJII2 || objLJJ5 == c1680520tpi) {
                            objLJJ5 = new AwS234S0300000_25(this, (C1692980u9o) c1692270u8f, (C1692270u8f<AbstractC1693010u9r>) c1693040u9u, (C1693040u9u) 58);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                        }
                        LIZIZ(objArr, (Function1) objLJJ5, c13zcLJIIJ, (i2 << 6) & 896);
                        c13zcLJIIJ.LJJJJL(false);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(1388940878);
                    c13zcLJIIJ.LJJJJL(false);
                }
                i4++;
                c = 2;
            }
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 100);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.Object[] r14, kotlin.jvm.functions.Function1<? super X.C1691750u7p, kotlin.Unit> r15, X.InterfaceC1680500tpg r16, int r17) {
        /*
            r13 = this;
            r0 = -2083052099(0xffffffff83d725bd, float:-1.2645229E-36)
            r1 = r16
            X.13ZC r4 = r1.LJIIJ(r0)
            r11 = r17
            r0 = r11 & 48
            r6 = 32
            r10 = r15
            if (r0 != 0) goto L4f
            boolean r0 = r4.LJII(r10)
            if (r0 == 0) goto L4c
            r7 = 32
        L1a:
            r7 = r7 | r11
        L1b:
            r0 = r11 & 384(0x180, float:5.38E-43)
            r8 = r13
            if (r0 != 0) goto L29
            boolean r0 = r4.LJII(r8)
            if (r0 == 0) goto L49
            r0 = 256(0x100, float:3.59E-43)
        L28:
            r7 = r7 | r0
        L29:
            r9 = r14
            int r0 = r9.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = -416604407(0xffffffffe72b1f09, float:-8.080972E23)
            r4.LJIIL(r0, r1)
            int r2 = r9.length
            r5 = 0
            r1 = 0
        L38:
            if (r1 >= r2) goto L51
            r0 = r9[r1]
            boolean r0 = r4.LJII(r0)
            if (r0 == 0) goto L47
            r0 = 4
        L43:
            r7 = r7 | r0
            int r1 = r1 + 1
            goto L38
        L47:
            r0 = 0
            goto L43
        L49:
            r0 = 128(0x80, float:1.8E-43)
            goto L28
        L4c:
            r7 = 16
            goto L1a
        L4f:
            r7 = r11
            goto L1b
        L51:
            r4.LJJJJL(r5)
            r0 = r7 & 14
            if (r0 != 0) goto L5a
            r7 = r7 | 2
        L5a:
            r1 = r7 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 == r0) goto Lbb
            r1 = 1
        L61:
            r0 = r7 & 1
            boolean r0 = r4.LJIJJLI(r0, r1)
            if (r0 == 0) goto Lb7
            X.0CmK r1 = new X.0CmK
            r0 = 2
            r1.<init>(r0)
            r1.LIZ(r10)
            r1.LIZIZ(r9)
            int r0 = r1.LIZJ()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r3 = r1.LIZLLL(r0)
            boolean r2 = r4.LJII(r8)
            r0 = r7 & 112(0x70, float:1.57E-43)
            if (r0 != r6) goto L88
            r5 = 1
        L88:
            r2 = r2 | r5
            java.lang.Object r1 = r4.LJJ()
            if (r2 != 0) goto L98
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto La2
        L98:
            kotlin.jvm.internal.AwS391S0200000_25 r1 = new kotlin.jvm.internal.AwS391S0200000_25
            r0 = 407(0x197, float:5.7E-43)
            r1.<init>(r8, r10, r0)
            r4.LJJIJIIJI(r1)
        La2:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            X.C1680540tpk.LIZJ(r3, r1, r4)
        La7:
            X.13Ys r0 = r4.LJJJJZI()
            if (r0 == 0) goto Lb6
            kotlin.jvm.internal.AwS62S0301000_25 r7 = new kotlin.jvm.internal.AwS62S0301000_25
            r12 = 45
            r7.<init>(r8, r9, r10, r11, r12)
            r0.LIZLLL = r7
        Lb6:
            return
        Lb7:
            r4.LIZJ()
            goto La7
        Lbb:
            r1 = 0
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1692980u9o.LIZIZ(java.lang.Object[], kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }
}
