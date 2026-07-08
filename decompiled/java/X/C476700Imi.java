package X;

import androidx.lifecycle.ComputableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Imi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476700Imi extends ComputableLiveData<C1A6I<Object>> {
    public C1A6I<Object> LIZ;
    public AbstractC470910IdN<Object, Object> LIZIZ;
    public final C476710Imj LIZJ;
    public final /* synthetic */ Object LIZLLL;
    public final /* synthetic */ AbstractC470740Id6 LJ;
    public final /* synthetic */ C476690Imh LJFF;
    public final /* synthetic */ Executor LJI;
    public final /* synthetic */ Executor LJII;
    public final /* synthetic */ AbstractC470940IdQ LJIIIIZZ;

    @Override // androidx.lifecycle.ComputableLiveData
    public final C1A6I<Object> compute() {
        C1A6I<Object> c1a6k;
        Object objLJIIJJI = this.LIZLLL;
        C1A6I<Object> c1a6i = this.LIZ;
        if (c1a6i != null) {
            objLJIIJJI = c1a6i.LJIIJJI();
        }
        do {
            AbstractC470910IdN<Object, Object> abstractC470910IdN = this.LIZIZ;
            if (abstractC470910IdN != null) {
                abstractC470910IdN.LJFF(this.LIZJ);
            }
            AbstractC470910IdN<Object, Object> abstractC470910IdNLIZ = this.LJ.LIZ();
            this.LIZIZ = abstractC470910IdNLIZ;
            abstractC470910IdNLIZ.LIZIZ(this.LIZJ);
            final AbstractC470910IdN<Object, Object> abstractC470910IdN2 = this.LIZIZ;
            final C476690Imh c476690Imh = this.LJFF;
            new Object(abstractC470910IdN2, c476690Imh) { // from class: X.0Ieq
                public Executor LIZ;
                public Executor LIZIZ;
                public Key LIZJ;

                {
                    if (abstractC470910IdN2 != null) {
                        if (c476690Imh != null) {
                            return;
                        } else {
                            throw new IllegalArgumentException("Config may not be null");
                        }
                    }
                    throw new IllegalArgumentException("DataSource may not be null");
                }
            };
            Executor executor = this.LJI;
            Executor executor2 = this.LJII;
            AbstractC470940IdQ abstractC470940IdQ = this.LJIIIIZZ;
            if (executor == null) {
                throw new IllegalArgumentException("MainThreadExecutor required");
            }
            if (executor2 == null) {
                throw new IllegalArgumentException("BackgroundThreadExecutor required");
            }
            if (abstractC470910IdN2.LIZLLL() || !c476690Imh.LIZJ) {
                if (!abstractC470910IdN2.LIZLLL()) {
                    final AbstractC485130J0t abstractC485130J0t = (AbstractC485130J0t) abstractC470910IdN2;
                    AbstractC470910IdN<Object, Object> abstractC470910IdN3 = new AbstractC485110J0r<Integer, Value>(abstractC485130J0t) { // from class: X.0J0n
                        public final AbstractC485130J0t<Value> LIZJ;

                        @Override // X.AbstractC470910IdN
                        public final void LIZJ() {
                            this.LIZJ.LIZJ();
                        }

                        @Override // X.AbstractC470910IdN
                        public final boolean LJ() {
                            return this.LIZJ.LJ();
                        }

                        {
                            this.LIZJ = abstractC485130J0t;
                        }

                        @Override // X.AbstractC470910IdN
                        public final void LIZIZ(InterfaceC470920IdO interfaceC470920IdO) {
                            this.LIZJ.LIZIZ(interfaceC470920IdO);
                        }

                        @Override // X.AbstractC470910IdN
                        public final void LJFF(InterfaceC470920IdO interfaceC470920IdO) {
                            this.LIZJ.LJFF(interfaceC470920IdO);
                        }

                        @Override // X.AbstractC485110J0r
                        public final Object LJIIIZ(int i) {
                            return Integer.valueOf(i);
                        }

                        @Override // X.AbstractC485110J0r
                        public final void LJI(int i, int i2, Executor executor3, C1A6L c1a6l) {
                            this.LIZJ.LJI(1, i + 1, i2, executor3, c1a6l);
                        }

                        @Override // X.AbstractC485110J0r
                        public final void LJII(int i, int i2, Executor executor3, C1A6L c1a6l) {
                            int i3 = i - 1;
                            if (i3 < 0) {
                                this.LIZJ.LJI(2, i3, 0, executor3, c1a6l);
                                return;
                            }
                            int iMin = Math.min(i2, i3 + 1);
                            this.LIZJ.LJI(2, (i3 - iMin) + 1, iMin, executor3, c1a6l);
                        }

                        @Override // X.AbstractC485110J0r
                        public final void LJIIIIZZ(Object obj, int i, int i2, boolean z, Executor executor3, C1A6L c1a6l) {
                            Integer num = (Integer) obj;
                            if (num != null) {
                                num.intValue();
                            }
                            AbstractC485130J0t<Value> abstractC485130J0t2 = this.LIZJ;
                            abstractC485130J0t2.getClass();
                            C485100J0q c485100J0q = new C485100J0q(abstractC485130J0t2, i2, c1a6l);
                            abstractC485130J0t2.LJII();
                            C485140J0u<T> c485140J0u = c485100J0q.LIZ;
                            synchronized (c485140J0u.LIZLLL) {
                                try {
                                    c485140J0u.LJ = executor3;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    };
                    iIntValue = objLJIIJJI != null ? ((Integer) objLJIIJJI).intValue() : -1;
                    abstractC470910IdN2 = abstractC470910IdN3;
                }
                c1a6k = new C1A6K<>((AbstractC485110J0r) abstractC470910IdN2, executor, executor2, abstractC470940IdQ, c476690Imh, objLJIIJJI, iIntValue);
            } else {
                c1a6k = new C1A6J<>((AbstractC485130J0t) abstractC470910IdN2, executor, executor2, abstractC470940IdQ, c476690Imh, objLJIIJJI != null ? ((Integer) objLJIIJJI).intValue() : 0);
            }
            this.LIZ = c1a6k;
        } while (c1a6k.LJIILIIL());
        return this.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Imj] */
    public C476700Imi(C08D8 c08d8, AbstractC470740Id6 abstractC470740Id6, C476690Imh c476690Imh, C08D8 c08d82, AbstractC470940IdQ abstractC470940IdQ) {
        super(c08d8);
        C08DA c08da = C08D9.LIZJ;
        this.LIZLLL = null;
        this.LJ = abstractC470740Id6;
        this.LJFF = c476690Imh;
        this.LJI = c08da;
        this.LJII = c08d82;
        this.LJIIIIZZ = abstractC470940IdQ;
        this.LIZJ = new InterfaceC470920IdO() { // from class: X.0Imj
            @Override // X.InterfaceC470920IdO
            public final void LIZ() {
                this.LIZ.invalidate();
            }
        };
    }
}
