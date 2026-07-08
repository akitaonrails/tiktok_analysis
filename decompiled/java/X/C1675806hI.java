package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.freqcontrol.IUFCDebugHelper;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06hI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1675806hI {
    public final C1676806hS<EnumC15599068v> LIZ;
    public final C1675706hH LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final C1676306hN LJFF;
    public final ArrayList<Pair<String, Boolean>> LJI;
    public final C1DEV LJII;
    public AnonymousClass0956 LJIIIIZZ;
    public AnonymousClass0956 LJIIIZ;
    public AnonymousClass0956 LJIIJ;
    public boolean LJIIJJI;
    public Long LJIIL;
    public InterfaceC1677406hY LJIILIIL;
    public final ArrayList<InterfaceC1677406hY> LJIILJJIL;
    public final ArrayList<InterfaceC1677406hY> LJIILL;
    public final ArrayList<InterfaceC1677406hY> LJIILLIIL;
    public EnumC15599068v[] LJIIZILJ;
    public final boolean LJIJ;

    public final void LIZJ() {
        String promptId;
        if (this.LJIIJJI) {
            this.LJIIJJI = false;
            AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LJIIIZ = null;
            AnonymousClass0956 anonymousClass09562 = this.LJIIJ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            this.LJIIJ = null;
            AnonymousClass0956 anonymousClass09563 = this.LJIIIIZZ;
            if (anonymousClass09563 != null) {
                anonymousClass09563.LIZIZ(null);
            }
            this.LJIIIIZZ = null;
            try {
                this.LJI.clear();
                this.LIZ.LIZJ();
                this.LJIILJJIL.clear();
                this.LJIILL.clear();
                this.LJIILLIIL.clear();
                C1676306hN c1676306hN = this.LJFF;
                for (C1677306hX c1677306hX : c1676306hN.LIZ) {
                    InterfaceC1677406hY interfaceC1677406hY = c1676306hN.LIZIZ;
                    if (interfaceC1677406hY == null || (promptId = interfaceC1677406hY.getPromptId()) == null) {
                        promptId = "";
                    }
                    c1677306hX.LIZ(new C1677706hb(promptId));
                }
                c1676306hN.LIZ.clear();
                c1676306hN.LIZIZ = null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1677306hX LIZLLL() {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1675806hI.LIZLLL():X.06hX");
    }

    public C1675806hI(C1676806hS<EnumC15599068v> c1676806hS, C1675706hH c1675706hH) {
        this.LIZ = c1676806hS;
        this.LIZIZ = c1675706hH;
        long j = C1676706hR.LIZIZ;
        long j2 = C1676706hR.LIZJ;
        this.LIZJ = j2;
        this.LIZLLL = j - j2;
        this.LJ = System.currentTimeMillis();
        this.LJFF = new C1676306hN();
        ArrayList<Pair<String, Boolean>> arrayList = new ArrayList<>();
        this.LJI = arrayList;
        this.LJII = new C1DEV(false);
        this.LJIIJJI = true;
        this.LJIILJJIL = new ArrayList<>();
        this.LJIILL = new ArrayList<>();
        this.LJIILLIIL = new ArrayList<>();
        this.LJIIZILJ = new EnumC15599068v[0];
        IUFCDebugHelper.LIZ.getClass();
        IUFCDebugHelper value = C1677506hZ.LIZIZ.getValue();
        this.LJIJ = value != null && value.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Started window ");
        sbLIZ.append(c1676806hS);
        LJ(C2188811AlT.LIZIZ(sbLIZ), false);
        IPromptUnifiedFrequencyController.LIZ.getClass();
        IPromptUnifiedFrequencyController iPromptUnifiedFrequencyControllerLIZ = C06R9.LIZ();
        C06RH c06rh = C06RH.SHARED;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Started Window ");
        sbLIZ2.append(c1676806hS);
        iPromptUnifiedFrequencyControllerLIZ.LJ(c06rh, C2188811AlT.LIZIZ(sbLIZ2), c1675706hH.LIZIZ, false);
        List listLLIIII = C13LP.LLIIII(c1676806hS.LIZJ);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Pair(((EnumC15599068v) it2.next()).toString(), Boolean.TRUE));
        }
        arrayList.addAll(arrayList2);
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIIIZ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C1676006hK(this, null), 2);
        if (this.LJIIL == null) {
            this.LJIIL = this.LIZIZ.LJIIJ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00eb -> B:43:0x00f7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1677406hY r15, X.InterfaceC1364105Vn<? super X.InterfaceC1678106hf> r16) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1675806hI.LIZ(X.06hY, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(boolean r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1676506hP
            if (r0 == 0) goto L28
            r3 = r9
            X.06hP r3 = (X.C1676506hP) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r2 = r3.LLILLL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILZIL
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L36
            if (r0 != r6) goto L2e
            boolean r8 = r3.LL
            X.01eN r4 = r3.LLILLJJLI
            X.C155000ia.LIZIZ(r2)
            goto L64
        L28:
            X.06hP r3 = new X.06hP
            r3.<init>(r7, r9)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r2)
            if (r8 != 0) goto L4e
            X.06hS<X.068v> r0 = r7.LIZ
            java.util.Set<? extends T> r0 = r0.LIZJ
            java.util.List r0 = X.C13LP.LLIIII(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L4e
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4e:
            X.0956 r0 = r7.LJIIIZ
            if (r0 == 0) goto L55
            r0.LIZIZ(r5)
        L55:
            X.1DEV r4 = r7.LJII
            r3.LLILLJJLI = r4
            r3.LL = r8
            r3.LLILZIL = r6
            java.lang.Object r0 = r4.LIZLLL(r5, r3)
            if (r0 != r1) goto L64
            return r1
        L64:
            X.0956 r0 = r7.LJIIJ     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L6e
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L87
            r4.LIZIZ(r5)
            return r0
        L6e:
            X.03Hh r3 = X.C817503Hh.LL     // Catch: java.lang.Throwable -> L87
            X.1DFH r2 = X.C0PEM.LIZ     // Catch: java.lang.Throwable -> L87
            X.06hJ r1 = new X.06hJ     // Catch: java.lang.Throwable -> L87
            if (r8 != 0) goto L77
            r6 = 0
        L77:
            r1.<init>(r7, r6, r5)     // Catch: java.lang.Throwable -> L87
            r0 = 2
            X.0956 r0 = X.C23250099c.LIZLLL(r3, r2, r5, r1, r0)     // Catch: java.lang.Throwable -> L87
            r7.LJIIJ = r0     // Catch: java.lang.Throwable -> L87
            r4.LIZIZ(r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L87:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L87
            r4.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1675806hI.LIZIZ(boolean, X.05Vn):java.lang.Object");
    }

    public final void LJ(String str, boolean z) {
        IPromptUnifiedFrequencyController.LIZ.getClass();
        C06R9.LIZ().LJ(C06RH.ROOM, str, this.LIZIZ.LIZIZ, z);
    }
}
