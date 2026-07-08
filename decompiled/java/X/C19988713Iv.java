package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.13Iv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19988713Iv {
    public final AbstractC19987713Il LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public int LIZLLL;

    public final AbstractC19979113Fd LIZ() {
        AbstractC19979113Fd c13bg;
        Object obj;
        Object objInvoke;
        byte bLJIJJLI = this.LIZ.LJIJJLI();
        if (bLJIJJLI == 1) {
            return LIZLLL(true);
        }
        if (bLJIJJLI == 0) {
            return LIZLLL(false);
        }
        if (bLJIJJLI != 6) {
            if (bLJIJJLI == 8) {
                return LIZIZ();
            }
            AbstractC19987713Il abstractC19987713Il = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot read Json element because of unexpected ");
            sbLIZ.append(C13JC.LIZIZ(bLJIJJLI));
            AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
            throw null;
        }
        int i = this.LIZLLL + 1;
        this.LIZLLL = i;
        if (i == 200) {
            C19989013Iy c19989013Iy = new C19989013Iy(Unit.LIZ, new C19988813Iw(this, null));
            while (true) {
                obj = c19989013Iy.LLILZ;
                InterfaceC1364105Vn<Object> interfaceC1364105Vn = c19989013Iy.LLILLL;
                if (interfaceC1364105Vn == null) {
                    break;
                }
                Object obj2 = C13JG.LIZ;
                if (Intrinsics.LJFF(obj2, obj)) {
                    try {
                        InterfaceC1631620sYq<? super C13JB<?, ?>, Object, ? super InterfaceC1364105Vn<Object>, ? extends Object> interfaceC1631620sYq = c19989013Iy.LL;
                        Object obj3 = c19989013Iy.LLILLJJLI;
                        if (interfaceC1631620sYq instanceof a) {
                            C19719512Dh.LJ(3, interfaceC1631620sYq);
                            objInvoke = interfaceC1631620sYq.invoke(c19989013Iy, obj3, interfaceC1364105Vn);
                        } else {
                            objInvoke = C099M.LJ(interfaceC1631620sYq, c19989013Iy, obj3, interfaceC1364105Vn);
                        }
                        if (objInvoke != C099R.LJFF()) {
                            C189200o6.m2constructorimpl(objInvoke);
                            interfaceC1364105Vn.resumeWith(objInvoke);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C098200Yq c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                        interfaceC1364105Vn.resumeWith(c098200Yq);
                    }
                } else {
                    c19989013Iy.LLILZ = obj2;
                    interfaceC1364105Vn.resumeWith(obj);
                }
            }
            C155000ia.LIZIZ(obj);
            c13bg = (AbstractC19979113Fd) obj;
        } else {
            byte bLJI = this.LIZ.LJI((byte) 6);
            if (this.LIZ.LJIJJLI() == 4) {
                AbstractC19987713Il.LJIILLIIL(this.LIZ, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (this.LIZ.LIZJ()) {
                    String strLJIIJJI = this.LIZIZ ? this.LIZ.LJIIJJI() : this.LIZ.LJIIIZ();
                    this.LIZ.LJI((byte) 5);
                    linkedHashMap.put(strLJIIJJI, LIZ());
                    bLJI = this.LIZ.LJFF();
                    if (bLJI != 4) {
                        if (bLJI != 7) {
                            AbstractC19987713Il.LJIILLIIL(this.LIZ, "Expected end of the object or comma", 0, null, 6);
                            throw null;
                        }
                    }
                } else if (bLJI == 6) {
                    this.LIZ.LJI((byte) 7);
                } else if (bLJI == 4) {
                    if (!this.LIZJ) {
                        C19988213Iq.LJFF(this.LIZ, "object");
                        throw null;
                    }
                    this.LIZ.LJI((byte) 7);
                }
            }
            c13bg = new C13BG(linkedHashMap);
        }
        this.LIZLLL--;
        return c13bg;
    }

    public final C13BE LIZIZ() {
        byte bLJFF = this.LIZ.LJFF();
        if (this.LIZ.LJIJJLI() == 4) {
            AbstractC19987713Il.LJIILLIIL(this.LIZ, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (this.LIZ.LIZJ()) {
            arrayList.add(LIZ());
            bLJFF = this.LIZ.LJFF();
            if (bLJFF != 4) {
                AbstractC19987713Il abstractC19987713Il = this.LIZ;
                boolean z = bLJFF == 9;
                int i = abstractC19987713Il.LIZ;
                if (!z) {
                    AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bLJFF == 8) {
            this.LIZ.LJI((byte) 9);
        } else if (bLJFF == 4) {
            if (!this.LIZJ) {
                C19988213Iq.LJFF(this.LIZ, "array");
                throw null;
            }
            this.LIZ.LJI((byte) 9);
        }
        return new C13BE(arrayList);
    }

    public final C13GN LIZLLL(boolean z) {
        String strLJIIJJI;
        if (!this.LIZIZ && z) {
            strLJIIJJI = this.LIZ.LJIIIZ();
        } else {
            strLJIIJJI = this.LIZ.LJIIJJI();
            if (!z && Intrinsics.LJFF(strLJIIJJI, "null")) {
                return C13GQ.INSTANCE;
            }
        }
        return new C19981913Gf(strLJIIJJI, z);
    }

    public C19988713Iv(C19988913Ix c19988913Ix, AbstractC19987713Il abstractC19987713Il) {
        this.LIZ = abstractC19987713Il;
        this.LIZIZ = c19988913Ix.LIZJ;
        this.LIZJ = c19988913Ix.LJIILIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[PHI: r1 r2 r11 r14
      0x005d: PHI (r1v3 X.13Iv) = (r1v2 X.13Iv), (r1v5 X.13Iv) binds: [B:18:0x0057, B:12:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r2v1 java.util.HashMap) = (r2v0 java.util.HashMap), (r2v3 java.util.HashMap) binds: [B:18:0x0057, B:12:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r11v1 byte) = (r11v0 byte), (r11v6 byte) binds: [B:18:0x0057, B:12:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r14v1 X.13JB<kotlin.Unit, X.13Fd>) = (r14v0 X.13JB<kotlin.Unit, X.13Fd>), (r14v2 X.13JB<kotlin.Unit, X.13Fd>) binds: [B:18:0x0057, B:12:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0085 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C13JB<kotlin.Unit, X.AbstractC19979113Fd> r14, X.InterfaceC1364105Vn<? super X.AbstractC19979113Fd> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C13J0
            if (r0 == 0) goto L8f
            r9 = r15
            X.13J0 r9 = (X.C13J0) r9
            int r2 = r9.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r9.LLIZ = r2
        L12:
            java.lang.Object r0 = r9.LLILZIL
            java.lang.Object r10 = X.C099R.LJFF()
            int r1 = r9.LLIZ
            r7 = 7
            r6 = 0
            r8 = 1
            r5 = 4
            r4 = 6
            r3 = 0
            if (r1 == 0) goto L46
            if (r1 != r8) goto L96
            java.lang.Object r11 = r9.LLILZ
            java.lang.Object r2 = r9.LLILLL
            java.util.HashMap r2 = (java.util.HashMap) r2
            X.13Iv r1 = r9.LLILLJJLI
            X.13JB r14 = r9.LL
            X.C155000ia.LIZIZ(r0)
        L31:
            r2.put(r11, r0)
            X.13Il r0 = r1.LIZ
            byte r11 = r0.LJFF()
            if (r11 == r5) goto L5d
            if (r11 == r7) goto La5
            X.13Il r1 = r1.LIZ
            java.lang.String r0 = "Expected end of the object or comma"
            X.AbstractC19987713Il.LJIILLIIL(r1, r0, r6, r3, r4)
            throw r3
        L46:
            X.C155000ia.LIZIZ(r0)
            X.13Il r0 = r13.LIZ
            byte r11 = r0.LJI(r4)
            X.13Il r0 = r13.LIZ
            byte r0 = r0.LJIJJLI()
            if (r0 == r5) goto Lbf
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1 = r13
        L5d:
            X.13Il r0 = r1.LIZ
            boolean r0 = r0.LIZJ()
            if (r0 == 0) goto L9e
            boolean r0 = r1.LIZIZ
            if (r0 == 0) goto L88
            X.13Il r0 = r1.LIZ
            java.lang.String r11 = r0.LJIIJJI()
        L6f:
            X.13Il r12 = r1.LIZ
            r0 = 5
            r12.LJI(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r9.LL = r14
            r9.LLILLJJLI = r1
            r9.LLILLL = r2
            r9.LLILZ = r11
            r9.LLIZ = r8
            java.lang.Object r0 = r14.LIZ(r0, r9)
            if (r0 != r10) goto L31
            return r10
        L88:
            X.13Il r0 = r1.LIZ
            java.lang.String r11 = r0.LJIIIZ()
            goto L6f
        L8f:
            X.13J0 r9 = new X.13J0
            r9.<init>(r13, r15)
            goto L12
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9e:
            if (r11 != r4) goto Lab
            X.13Il r0 = r1.LIZ
            r0.LJI(r7)
        La5:
            X.13BG r0 = new X.13BG
            r0.<init>(r2)
            return r0
        Lab:
            if (r11 != r5) goto La5
            boolean r0 = r1.LIZJ
            if (r0 == 0) goto Lb7
            X.13Il r0 = r1.LIZ
            r0.LJI(r7)
            goto La5
        Lb7:
            X.13Il r1 = r1.LIZ
            java.lang.String r0 = "object"
            X.C19988213Iq.LJFF(r1, r0)
            throw r3
        Lbf:
            X.13Il r1 = r13.LIZ
            java.lang.String r0 = "Unexpected leading comma"
            X.AbstractC19987713Il.LJIILLIIL(r1, r0, r6, r3, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19988713Iv.LIZJ(X.13JB, X.05Vn):java.lang.Object");
    }
}
