package X;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320250kSd extends AbstractC1320710kTN<C1323050kX9<AbstractC1327750kej>, InterfaceC1330440kj4> {
    public static final Class<?> LJJIJL = C1320250kSd.class;
    public final C1320120kSQ LJJII;
    public final C1322480kWE<InterfaceC1320130kSR> LJJIII;
    public final InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> LJJIIJ;
    public final C1325170kaZ LJJIIJZLJL;
    public InterfaceC1324680kZm LJJIIZ;
    public InterfaceC1320070kSL<InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>>> LJJIIZI;
    public boolean LJJIJ;
    public C1322480kWE<InterfaceC1320130kSR> LJJIJIIJI;
    public InterfaceC1320080kSM LJJIJIIJIL;
    public C1320290kSh LJJIJIL;

    public final synchronized InterfaceC1325670kbN LJJII() {
        InterfaceC1320080kSM interfaceC1320080kSM;
        interfaceC1320080kSM = this.LJJIJIIJIL;
        return interfaceC1320080kSM != null ? new C1320060kSK(this.LJIIIZ, interfaceC1320080kSM) : null;
    }

    public final synchronized void LJJIIJ() {
    }

    @Override // X.AbstractC1320710kTN
    public final C1323050kX9<AbstractC1327750kej> LJI() {
        InterfaceC1324680kZm interfaceC1324680kZm;
        C1323050kX9<AbstractC1327750kej> c1323050kX9;
        C1325170kaZ c1325170kaZ;
        C1336010ks3.LIZIZ();
        try {
            if (this.LJJIIJ != null && (interfaceC1324680kZm = this.LJJIIZ) != null) {
                this.LJJIIZ = C1324660kZk.LIZJ(interfaceC1324680kZm);
                if (((!C1328130kfL.LJIILIIL().LJJIIJ || (c1325170kaZ = this.LJJIIJZLJL) == null || (c1323050kX9 = c1325170kaZ.get(this.LJJIIZ)) == null) && (c1323050kX9 = this.LJJIIJ.get(this.LJJIIZ)) == null) || ((C1328060kfE) c1323050kX9.get().getQualityInfo()).LIZJ) {
                    C1336010ks3.LIZIZ();
                    return c1323050kX9;
                }
                c1323050kX9.close();
            }
            C1336010ks3.LIZIZ();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    @Override // X.AbstractC1320710kTN
    public final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> LJIIIIZZ() {
        C1336010ks3.LIZIZ();
        if (C1328570kg3.LJIIJ(2)) {
            C1328570kg3.LJIIJJI(LJJIJL, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY = this.LJJIIZI.get();
        C1336010ks3.LIZIZ();
        return interfaceC1320200kSY;
    }

    @Override // X.AbstractC1320710kTN
    public final String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        c1320100kSOLIZIZ.LIZIZ(super.toString(), "super");
        c1320100kSOLIZIZ.LIZIZ(this.LJJIIZI, "dataSourceSupplier");
        return c1320100kSOLIZIZ.toString();
    }

    @Override // X.AbstractC1320710kTN, X.InterfaceC1320850kTb
    public final void LIZJ(InterfaceC1316360kMM interfaceC1316360kMM) {
        super.LIZJ(interfaceC1316360kMM);
        LJJIIZ(null);
    }

    @Override // X.AbstractC1320710kTN
    public final Drawable LJFF(C1323050kX9<AbstractC1327750kej> c1323050kX9) {
        C1323050kX9<AbstractC1327750kej> c1323050kX92 = c1323050kX9;
        try {
            C1336010ks3.LIZIZ();
            C1322350kW1.LJFF(C1323050kX9.LJIJJ(c1323050kX92));
            AbstractC1327750kej abstractC1327750kej = c1323050kX92.get();
            LJJIIZ(abstractC1327750kej);
            Drawable drawableLJJIIJZLJL = LJJIIJZLJL(this.LJJIJIIJI, abstractC1327750kej);
            if (drawableLJJIIJZLJL == null && (drawableLJJIIJZLJL = LJJIIJZLJL(this.LJJIII, abstractC1327750kej)) == null) {
                C1322200kVm.LIZ().LJIILLIIL.getClass();
                abstractC1327750kej.setSourceUri(null);
                drawableLJJIIJZLJL = this.LJJII.LIZ(abstractC1327750kej, this.LJIJI);
                if (drawableLJJIIJZLJL == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unrecognized image class: ");
                    sbLIZ.append(abstractC1327750kej);
                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            C1336010ks3.LIZIZ();
            return drawableLJJIIJZLJL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    @Override // X.AbstractC1320710kTN
    public final int LJIIIZ(C1323050kX9<AbstractC1327750kej> c1323050kX9) {
        C1323050kX9<AbstractC1327750kej> c1323050kX92 = c1323050kX9;
        if (c1323050kX92 != null) {
            return c1323050kX92.LJIILL();
        }
        return 0;
    }

    @Override // X.AbstractC1320710kTN
    public final InterfaceC1330440kj4 LJIIJ(Object obj) {
        C1323050kX9 c1323050kX9 = (C1323050kX9) obj;
        C1322350kW1.LJFF(C1323050kX9.LJIJJ(c1323050kX9));
        return (InterfaceC1330440kj4) c1323050kX9.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1320710kTN
    public final void LJIJI(Drawable drawable) {
        if (drawable instanceof InterfaceC1316680kMs) {
            ((InterfaceC1316680kMs) drawable).LIZ();
        }
    }

    @Override // X.AbstractC1320710kTN
    public final void LJIJJLI(C1323050kX9<AbstractC1327750kej> c1323050kX9) {
        C1323050kX9.LJII(c1323050kX9);
    }

    public final synchronized void LJJIFFI(InterfaceC1320080kSM interfaceC1320080kSM) {
        InterfaceC1320080kSM interfaceC1320080kSM2 = this.LJJIJIIJIL;
        if (interfaceC1320080kSM2 instanceof C1320260kSe) {
            ((C1320260kSe) interfaceC1320080kSM2).LIZIZ(interfaceC1320080kSM);
        } else if (interfaceC1320080kSM2 != null) {
            final InterfaceC1320080kSM[] interfaceC1320080kSMArr = {interfaceC1320080kSM2, interfaceC1320080kSM};
            this.LJJIJIIJIL = new InterfaceC1320080kSM(interfaceC1320080kSMArr) { // from class: X.0kSe
                public final List<InterfaceC1320080kSM> LIZ;

                {
                    ArrayList arrayList = new ArrayList(interfaceC1320080kSMArr.length);
                    this.LIZ = arrayList;
                    Collections.addAll(arrayList, interfaceC1320080kSMArr);
                }

                public final synchronized void LIZIZ(InterfaceC1320080kSM interfaceC1320080kSM3) {
                    ((ArrayList) this.LIZ).add(interfaceC1320080kSM3);
                }

                @Override // X.InterfaceC1320080kSM
                public final synchronized void LIZ(int i, String str, boolean z) {
                    int size = ((ArrayList) this.LIZ).size();
                    for (int i2 = 0; i2 < size; i2++) {
                        InterfaceC1320080kSM interfaceC1320080kSM3 = (InterfaceC1320080kSM) ((ArrayList) this.LIZ).get(i2);
                        if (interfaceC1320080kSM3 != null) {
                            try {
                                interfaceC1320080kSM3.LIZ(i, str, z);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1328570kg3.LJI("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e);
                            }
                        }
                    }
                }
            };
        } else {
            this.LJJIJIIJIL = interfaceC1320080kSM;
        }
    }

    public final void LJJIIZ(AbstractC1327750kej abstractC1327750kej) {
        InterfaceC1320380kSq interfaceC1320380kSq;
        String str;
        C1319910kS5 c1319910kS5LIZ;
        if (!this.LJJIJ) {
            return;
        }
        if (this.LJIIIIZZ == null) {
            final C1320220kSa c1320220kSa = new C1320220kSa();
            C1320700kTM c1320700kTM = new C1320700kTM(c1320220kSa) { // from class: X.0kSb
                public long LIZIZ = -1;
                public final InterfaceC1320240kSc LIZJ;

                {
                    this.LIZJ = c1320220kSa;
                }

                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LJFF(Object obj, String str2) {
                    this.LIZIZ = System.currentTimeMillis();
                }

                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LJ(String str2, Object obj, Animatable animatable) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    InterfaceC1320240kSc interfaceC1320240kSc = this.LIZJ;
                    if (interfaceC1320240kSc != null) {
                        C1320220kSa c1320220kSa2 = (C1320220kSa) interfaceC1320240kSc;
                        c1320220kSa2.LLJJIJI = jCurrentTimeMillis - this.LIZIZ;
                        c1320220kSa2.invalidateSelf();
                    }
                }
            };
            this.LJJIJIL = new C1320290kSh();
            LJ(c1320700kTM);
            this.LJIIIIZZ = c1320220kSa;
            InterfaceC1320140kSS interfaceC1320140kSS = this.LJII;
            if (interfaceC1320140kSS != null) {
                interfaceC1320140kSS.LIZLLL(c1320220kSa);
            }
        }
        if (this.LJJIJIIJIL == null) {
            LJJIFFI(this.LJJIJIL);
        }
        Drawable drawable = this.LJIIIIZZ;
        if (drawable instanceof C1320220kSa) {
            C1320220kSa c1320220kSa2 = (C1320220kSa) drawable;
            String str2 = this.LJIIIZ;
            c1320220kSa2.getClass();
            if (str2 == null) {
                str2 = "none";
            }
            c1320220kSa2.LL = str2;
            c1320220kSa2.invalidateSelf();
            InterfaceC1320140kSS interfaceC1320140kSS2 = this.LJII;
            if (interfaceC1320140kSS2 != null && (c1319910kS5LIZ = C0SV5.LIZ(interfaceC1320140kSS2.LIZIZ())) != null) {
                interfaceC1320380kSq = c1319910kS5LIZ.LLILZIL;
            } else {
                interfaceC1320380kSq = null;
            }
            c1320220kSa2.LLILZIL = interfaceC1320380kSq;
            int i = this.LJJIJIL.LIZ;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                str = "unknown";
                            } else {
                                str = "local";
                            }
                        } else {
                            str = "memory_bitmap";
                        }
                    } else {
                        str = "memory_encoded";
                    }
                } else {
                    str = "disk";
                }
            } else {
                str = "network";
            }
            c1320220kSa2.LLJJIJIIJIL = str;
            c1320220kSa2.invalidateSelf();
            if (abstractC1327750kej != null) {
                int width = abstractC1327750kej.getWidth();
                int height = abstractC1327750kej.getHeight();
                c1320220kSa2.LLILLJJLI = width;
                c1320220kSa2.LLILLL = height;
                c1320220kSa2.invalidateSelf();
                c1320220kSa2.LLILZ = abstractC1327750kej.getSizeInBytes();
                return;
            }
            c1320220kSa2.LLILLJJLI = -1;
            c1320220kSa2.LLILLL = -1;
            c1320220kSa2.LLILZ = -1;
            c1320220kSa2.LLILZLL = -1;
            c1320220kSa2.LLIZ = -1;
            c1320220kSa2.LL = "none";
            c1320220kSa2.invalidateSelf();
            c1320220kSa2.LLJJIJI = -1L;
            c1320220kSa2.LLJJIJIIJIL = null;
            c1320220kSa2.invalidateSelf();
        }
    }

    public static Drawable LJJIIJZLJL(C1322480kWE c1322480kWE, AbstractC1327750kej abstractC1327750kej) {
        Drawable drawableLIZJ;
        if (c1322480kWE == null) {
            return null;
        }
        Iterator<E> it2 = c1322480kWE.iterator();
        while (it2.hasNext()) {
            InterfaceC1320130kSR interfaceC1320130kSR = (InterfaceC1320130kSR) it2.next();
            if (interfaceC1320130kSR.LIZIZ(abstractC1327750kej) && (drawableLIZJ = interfaceC1320130kSR.LIZJ(abstractC1327750kej)) != null) {
                return drawableLIZJ;
            }
        }
        return null;
    }

    @Override // X.AbstractC1320710kTN
    public final void LJIIZILJ(Object obj, String str) {
        synchronized (this) {
            try {
                InterfaceC1320080kSM interfaceC1320080kSM = this.LJJIJIIJIL;
                if (interfaceC1320080kSM != null) {
                    interfaceC1320080kSM.LIZ(5, str, true);
                }
                C1325680kbO c1325680kbO = (C1325680kbO) C1328130kfL.LJIILIIL().LJIIL().LJIIIZ(this.LJIJJLI, (C1320270kSf) LJJII());
                c1325680kbO.LIZJ(this.LJIJJLI, this.LJIIJ, this.LJIIIZ, false);
                c1325680kbO.LJII(this.LJIJJLI, this.LJIIIZ, false);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1320250kSd(Resources resources, C1320560kT8 c1320560kT8, InterfaceC1320130kSR interfaceC1320130kSR, Executor executor, InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> interfaceC1325150kaX, C1322480kWE<InterfaceC1320130kSR> c1322480kWE) {
        C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> c1325170kaZLJFF;
        super(c1320560kT8, executor);
        this.LJJII = new C1320120kSQ(resources, interfaceC1320130kSR);
        this.LJJIII = c1322480kWE;
        this.LJJIIJ = interfaceC1325150kaX;
        if (C1328130kfL.LJIILIIL().LJJIIJ) {
            c1325170kaZLJFF = C1328130kfL.LJIILIIL().LJFF();
        } else {
            c1325170kaZLJFF = null;
        }
        this.LJJIIJZLJL = c1325170kaZLJFF;
    }

    public final void LJJIII(InterfaceC1320070kSL<InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>>> interfaceC1320070kSL, String str, InterfaceC1324680kZm interfaceC1324680kZm, Object obj, C1322480kWE<InterfaceC1320130kSR> c1322480kWE, InterfaceC1320080kSM interfaceC1320080kSM, C1325710kbR c1325710kbR) {
        C1336010ks3.LIZIZ();
        this.LJIJJLI = c1325710kbR;
        LJIIL(obj, str);
        this.LJIJJ = false;
        this.LJJIIZI = interfaceC1320070kSL;
        LJJIIZ(null);
        this.LJJIIZ = interfaceC1324680kZm;
        this.LJJIJIIJI = c1322480kWE;
        synchronized (this) {
            try {
                this.LJJIJIIJIL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJJIIZ(null);
        LJJIFFI(interfaceC1320080kSM);
        C1336010ks3.LIZIZ();
    }
}
