package X;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0XoB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C859810XoB implements InterfaceC497601wk {
    public volatile C09AE LLILZ;
    public volatile AnonymousClass0956 LLILZIL;
    public volatile AnonymousClass0956 LLILZLL;
    public final /* synthetic */ C054G LL = C2296808zG.LIZIZ();
    public C859740Xo4 LLILLJJLI = new C859740Xo4(0);
    public final AtomicInteger LLILLL = new AtomicInteger(0);
    public final ReentrantLock LLIZ = new ReentrantLock(true);
    public final SortedMap<Float, C01LM> LLIZLLLIL = Collections.synchronizedSortedMap(new TreeMap());

    public final void LIZ() {
        C1706630uVp.LJFF("AnimSeqShowMgrImpl", "onDestroy()");
        C23250099c.LIZLLL(this, C0PEM.LIZJ, null, new C859800XoA(this, null), 2);
    }

    public final void LJFF() {
        C1706630uVp.LJFF("AnimSeqShowMgrImpl", "toggleAnim()");
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(this, C2107308Nj.LIZ, null, new C859840XoE(this, true, null), 2);
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL.LL;
    }

    public final void LIZJ(boolean z) {
        C1706630uVp.LJFF("AnimSeqShowMgrImpl", "doToggleAnim()");
        if (z) {
            C1706630uVp.LJFF("AnimSeqShowMgrImpl", "tryShowAnim()");
            if (this.LLILZLL != null) {
                C1706630uVp.LIZ("AnimSeqShowMgrImpl", "launchDoAnimLoopJob has already launched，return");
                return;
            } else {
                this.LLILZLL = C23250099c.LIZLLL(this, C0PEM.LIZJ, null, new C859710Xo1(this, null), 2);
                return;
            }
        }
        C1706630uVp.LJFF("AnimSeqShowMgrImpl", "tryNotShowAnim()");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C859850XoF
            if (r0 == 0) goto L79
            r8 = r11
            X.0XoF r8 = (X.C859850XoF) r8
            int r2 = r8.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r8.LLILZIL = r2
        L12:
            java.lang.Object r3 = r8.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILZIL
            r9 = 2
            r6 = 1
            r5 = 0
            java.lang.String r4 = "AnimSeqShowMgrImpl"
            if (r0 == 0) goto L30
            if (r0 == r6) goto L5c
            if (r0 != r9) goto L7f
            X.C155000ia.LIZIZ(r3)
        L28:
            java.lang.String r0 = "launchDoAnimLoop() end."
            X.C1706630uVp.LIZ(r4, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r0 = "launchDoAnimLoop(), start loop."
            X.C1706630uVp.LIZ(r4, r0)
            X.00cf r3 = new X.00cf
            r3.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = r10.LLILLL
            int r0 = r0.get()
            r3.element = r0
            X.013C r2 = new X.013C
            r2.<init>()
            X.0XoC r1 = new X.0XoC
            r1.<init>(r10, r2, r3, r5)
            r8.LL = r2
            r8.LLILLJJLI = r1
            r8.LLILZIL = r6
            java.lang.Object r0 = r1.invoke(r8)
            if (r0 != r7) goto L63
            return r7
        L5c:
            X.0XoC r1 = r8.LLILLJJLI
            X.013C r2 = r8.LL
            X.C155000ia.LIZIZ(r3)
        L63:
            boolean r0 = r2.element
            if (r0 == 0) goto L28
            java.lang.String r0 = "block loop due to register version changed, loop block again."
            X.C1706630uVp.LIZ(r4, r0)
            r8.LL = r5
            r8.LLILLJJLI = r5
            r8.LLILZIL = r9
            java.lang.Object r0 = r1.invoke(r8)
            if (r0 != r7) goto L28
            return r7
        L79:
            X.0XoF r8 = new X.0XoF
            r8.<init>(r10, r11)
            goto L12
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C859810XoB.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C859770Xo7
            if (r0 == 0) goto L82
            r5 = r10
            X.0Xo7 r5 = (X.C859770Xo7) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r8 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r6 = 3
            r7 = 2
            r3 = 1
            java.lang.String r2 = "AnimSeqShowMgrImpl"
            r1 = 0
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L50
            if (r0 == r7) goto L6d
            if (r0 != r6) goto L88
            X.C155000ia.LIZIZ(r8)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            X.C155000ia.LIZIZ(r8)
            java.lang.String r0 = "tryLaunchDoAnimLoopJob()"
            X.C1706630uVp.LIZ(r2, r0)
            java.util.SortedMap<java.lang.Float, X.01LM> r0 = r9.LLIZLLLIL
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L77
            X.0Xo2 r0 = new X.0Xo2
            r0.<init>(r9, r1)
            r5.LL = r9
            r5.LLILZ = r3
            java.lang.Object r8 = X.C2296808zG.LJ(r0, r5)
            if (r8 != r4) goto L4e
            return r4
        L4e:
            r0 = r9
            goto L55
        L50:
            X.0XoB r0 = r5.LL
            X.C155000ia.LIZIZ(r8)
        L55:
            X.09AE r8 = (X.C09AE) r8
            r0.LLILZ = r8
            java.lang.String r0 = "worker thread delay..."
            X.C1706630uVp.LIZ(r2, r0)
            X.09AE r0 = r9.LLILZ
            if (r0 == 0) goto L70
            r5.LL = r1
            r5.LLILZ = r7
            java.lang.Object r0 = r0.LJJZ(r5)
            if (r0 != r4) goto L70
            return r4
        L6d:
            X.C155000ia.LIZIZ(r8)
        L70:
            r9.LLILZ = r1
            java.lang.String r0 = "worker thread delay end."
            X.C1706630uVp.LIZ(r2, r0)
        L77:
            r5.LL = r1
            r5.LLILZ = r6
            java.lang.Object r0 = r9.LIZLLL(r5)
            if (r0 != r4) goto L2b
            return r4
        L82:
            X.0Xo7 r5 = new X.0Xo7
            r5.<init>(r9, r10)
            goto L12
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C859810XoB.LJI(X.05Vn):java.lang.Object");
    }

    public final void LIZIZ(float f, C01LM c01lm) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register(), type=");
        sbLIZ.append(f);
        stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(",registered?=");
        sbLIZ2.append(this.LLIZLLLIL.containsKey(Float.valueOf(f)));
        stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ2));
        Float fValueOf = Float.valueOf(f);
        SortedMap<Float, C01LM> sortedMap = this.LLIZLLLIL;
        if (c01lm == null) {
            c01lm = new C01LM() { // from class: X.0Xo9
                @Override // X.C01LM
                public final Object LIZ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                    return false;
                }
            };
        }
        sortedMap.put(fValueOf, c01lm);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(",register success, map=");
        sbLIZ3.append(this.LLIZLLLIL);
        sbLIZ3.append('.');
        stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ3));
        if (this.LLILZIL != null) {
            stringBuffer.append(",cancel DelayJob,");
            AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLILZIL = null;
        }
        this.LLILZIL = C23250099c.LIZLLL(this, null, null, new C859780Xo8(this, null), 3);
        C1706630uVp.LJFF("AnimSeqShowMgrImpl", stringBuffer.toString());
    }

    public final void LJ(float f, C01LM c01lm) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register(),type=");
        sbLIZ.append(f);
        sbLIZ.append(",provider=");
        sbLIZ.append(c01lm);
        sbLIZ.append(",version=");
        sbLIZ.append(this.LLILLL.get());
        C23250099c.LIZLLL(this, C0PEM.LIZJ, null, new C859830XoD(this, C2188811AlT.LIZIZ(sbLIZ), f, c01lm, null), 2);
    }
}
