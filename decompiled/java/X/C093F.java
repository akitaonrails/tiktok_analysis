package X;

import com.ss.android.ugc.aweme.bytebench.PrefetchStrategy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.slideslip.fullwidthhorizontal.PrefetchCountStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.093F, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C093F extends AbstractC2255721DQs<InterfaceC23198097c> implements InterfaceC23198097c {
    public static final C093H LLJILJIL = new Object() { // from class: X.093H
    };
    public static final int LLJILJILJ = 8;
    public final InterfaceC1624480sNK LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final C01GW LLILZIL;
    public final C095E<Pair<Effect, Long>> LLILZLL;
    public final C095E<Unit> LLIZ;
    public final ConcurrentLinkedQueue<C093G> LLIZLLLIL;
    public final AtomicLong LLJ;
    public volatile boolean LLJI;
    public final InterfaceC23198097c LLJIJIL;

    private final void W1() {
        ConcurrentLinkedQueue<C093G> concurrentLinkedQueue = this.LLIZLLLIL;
        ArrayList arrayList = new ArrayList();
        for (C093G c093g : concurrentLinkedQueue) {
            if (c093g.LIZIZ < this.LLJ.get()) {
                arrayList.add(c093g);
            }
        }
        this.LLIZLLLIL.removeAll(C13LP.LLIIJI(arrayList));
    }

    private final InterfaceC497601wk o2() {
        return (InterfaceC497601wk) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC23198097c
    public void pause() {
        C201955140j.LJIILL(C1632470saD.LIZIZ, "EffectPrefetcherComponentV2", "pausing the queue");
        this.LLJI = true;
    }

    private final void G2() {
        C23250099c.LIZLLL(o2(), null, null, new C093A(this, null), 3);
    }

    private final void H2() {
        C23250099c.LIZLLL(o2(), null, null, new AnonymousClass0939(this, null), 3);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILZLL.LJIIJJI(null);
        this.LLIZ.LJIIJJI(null);
        C2296808zG.LIZJ(o2(), null);
    }

    public InterfaceC23198097c Z1() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJIJIL;
    }

    private final void T2(long j) {
        long j2;
        do {
            j2 = this.LLJ.get();
            if (j <= j2) {
                return;
            }
        } while (!this.LLJ.compareAndSet(j2, j));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X1(X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C093D
            if (r0 == 0) goto L22
            r7 = r12
            X.093D r7 = (X.C093D) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r3 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r10 = 1
            java.lang.String r4 = "EffectPrefetcherComponentV2"
            if (r0 == 0) goto L30
            if (r0 != r10) goto L28
            goto L7e
        L22:
            X.093D r7 = new X.093D
            r7.<init>(r11, r12)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = r11.LLJI
            if (r0 == 0) goto L41
            X.0saD r1 = X.C1632470saD.LIZIZ
            java.lang.String r0 = "download Skipped with as Queue Paused"
            X.C201955140j.LIZLLL(r1, r4, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L41:
            java.util.concurrent.ConcurrentLinkedQueue<X.093G> r0 = r11.LLIZLLLIL
            java.lang.Object r3 = r0.poll()
            X.093G r3 = (X.C093G) r3
            if (r3 != 0) goto L4e
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4e:
            long r1 = r3.LIZIZ
            java.util.concurrent.atomic.AtomicLong r0 = r11.LLJ
            long r8 = r0.get()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 >= 0) goto L5d
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5d:
            X.0sNK r5 = r11.LL     // Catch: java.lang.Exception -> La1
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r3.LIZ     // Catch: java.lang.Exception -> La1
            r7.LLILLL = r10     // Catch: java.lang.Exception -> La1
            boolean r0 = X.C1626430sQT.LIZIZ(r5, r1, r10)     // Catch: java.lang.Exception -> La1
            r3 = 0
            if (r0 != 0) goto L7b
            boolean r0 = X.C1626430sQT.LIZ(r5, r1, r10)     // Catch: java.lang.Exception -> La1
            if (r0 != 0) goto L7b
            X.0sSX r2 = new X.0sSX     // Catch: java.lang.Exception -> La1
            r2.<init>(r5, r1, r3)     // Catch: java.lang.Exception -> La1
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r3 = X.C099A.LIZJ(r0, r2, r7)     // Catch: java.lang.Exception -> La1
        L7b:
            if (r3 != r6) goto L81
            return r6
        L7e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> La1
        L81:
            X.0saO r3 = (X.C1632580saO) r3     // Catch: java.lang.Exception -> La1
            X.0saD r2 = X.C1632470saD.LIZIZ     // Catch: java.lang.Exception -> La1
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> La1
            java.lang.String r0 = "download completed with state="
            r1.append(r0)     // Catch: java.lang.Exception -> La1
            if (r3 == 0) goto L94
            X.0soa r0 = r3.LIZ     // Catch: java.lang.Exception -> La1
            if (r0 != 0) goto L96
        L94:
            java.lang.String r0 = "SKIPPED"
        L96:
            r1.append(r0)     // Catch: java.lang.Exception -> La1
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> La1
            X.C201955140j.LIZLLL(r2, r4, r0)     // Catch: java.lang.Exception -> La1
            goto Lac
        La1:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0saD r1 = X.C1632470saD.LIZIZ
            java.lang.String r0 = "drainQueue coroutine exception"
            X.C201955140j.LJIIIZ(r1, r4, r0, r2)
        Lac:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C093F.X1(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC23198097c
    public void nl(int i, Function1<? super Integer, ? extends Effect> function1) {
        Effect effectInvoke;
        Effect effectInvoke2;
        this.LLJI = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        for (int i2 = 1; i2 <= Math.max(PrefetchCountStrategy.LIZIZ, PrefetchCountStrategy.LIZJ); i2++) {
            if (i2 <= PrefetchStrategy.LIZJ && (effectInvoke2 = function1.invoke(Integer.valueOf(i - i2))) != null) {
                c13dvLIZIZ.add(effectInvoke2);
            }
            if (i2 <= PrefetchStrategy.LIZLLL && (effectInvoke = function1.invoke(Integer.valueOf(i + i2))) != null) {
                c13dvLIZIZ.add(effectInvoke);
            }
        }
        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        if (!listLIZ.isEmpty()) {
            Iterator it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                this.LLILZLL.LJIIIIZZ(new Pair<>(it2.next(), Long.valueOf(jCurrentTimeMillis)));
            }
        }
    }

    public final void w2(Effect effect, long j) {
        T2(j);
        if (j < this.LLJ.get()) {
            return;
        }
        if (this.LLIZLLLIL.size() >= this.LLILZ) {
            W1();
        }
        Iterator<C093G> it2 = this.LLIZLLLIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C093G next = it2.next();
            if (Intrinsics.LJFF(next.LIZ.getEffectId(), effect.getEffectId())) {
                if (next != null) {
                    this.LLIZLLLIL.remove(next);
                }
            }
        }
        this.LLIZLLLIL.add(new C093G(effect, j));
        this.LLIZ.LJIIIIZZ(Unit.LIZ);
    }

    public C093F(InterfaceC1624480sNK interfaceC1624480sNK, int i, int i2) {
        this.LL = interfaceC1624480sNK;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        i2 = i2 < 10 ? 10 : i2;
        this.LLILZ = i2;
        this.LLILZIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(605));
        int i3 = i2 * 3;
        this.LLILZLL = C095G.LIZ(i3, null, 6);
        this.LLIZ = C095G.LIZ(i3, null, 6);
        this.LLIZLLLIL = new ConcurrentLinkedQueue<>();
        this.LLJ = new AtomicLong(0L);
        H2();
        G2();
        this.LLJIJIL = this;
    }
}
