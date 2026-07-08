package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mSA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396840mSA implements InterfaceC1396970mSN {
    public final CopyOnWriteArrayList<InterfaceC1396870mSD> LIZ;
    public final C1396890mSF LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public final Object LJI;
    public List<AbstractC1396720mRy<AbstractC1384320m7y>> LJII;
    public List<AbstractC1396720mRy<AbstractC1384320m7y>> LJIIIIZZ;
    public boolean LJIIIZ;
    public AbstractC1384320m7y LJIIJ;
    public final InterfaceC1384330m7z LJIIJJI;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e4, code lost:
    
        r2 = r8.LIZ;
        r5.LJIJJ(r8.LJIIJJI, r8.LIZIZ);
        r2.add(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1396840mSA(X.InterfaceC1384330m7z r9) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1396840mSA.<init>(X.0m7z):void");
    }

    public final void LIZJ(int i) {
        if (i == 1000) {
            Iterator<InterfaceC1396870mSD> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJIILIIL();
            }
        } else {
            for (InterfaceC1396870mSD interfaceC1396870mSD : this.LIZ) {
                if (interfaceC1396870mSD.LJJIJLIJ() == i) {
                    interfaceC1396870mSD.LJIILIIL();
                }
            }
        }
    }

    @Override // X.InterfaceC1396970mSN
    public final InterfaceC1397010mSR LIZLLL(MotionEvent motionEvent) {
        InterfaceC1397010mSR interfaceC1397010mSRLIZLLL;
        Iterator it2 = new C13EO(this.LIZ).iterator();
        while (true) {
            InterfaceC1396870mSD interfaceC1396870mSD = null;
            if (!it2.hasNext()) {
                return null;
            }
            InterfaceC1396870mSD interfaceC1396870mSD2 = (InterfaceC1396870mSD) it2.next();
            if (interfaceC1396870mSD2 instanceof InterfaceC1396970mSN) {
                interfaceC1396870mSD = interfaceC1396870mSD2;
            }
            InterfaceC1396970mSN interfaceC1396970mSN = (InterfaceC1396970mSN) interfaceC1396870mSD;
            if (interfaceC1396970mSN != null && (interfaceC1397010mSRLIZLLL = interfaceC1396970mSN.LIZLLL(motionEvent)) != null) {
                return interfaceC1397010mSRLIZLLL;
            }
        }
    }

    public final void LJ(Canvas canvas) {
        Long lValueOf;
        Long lValueOf2;
        this.LJIIJJI.getConfig().LIZJ.getClass();
        synchronized (this.LJI) {
            try {
                int i = 1;
                AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy = null;
                for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2 : this.LJII) {
                    if (!C1384750m8f.LJIIL || !this.LJIIJJI.getFilters().LIZIZ(abstractC1396720mRy2.LJ(), i, this.LJIIJJI.LJIJ(), this.LJIIJJI.getConfig())) {
                        AbstractC1384320m7y abstractC1384320m7y = this.LJIIJ;
                        if (abstractC1384320m7y != null) {
                            lValueOf = Long.valueOf(abstractC1384320m7y.LIZJ);
                        } else {
                            lValueOf = null;
                        }
                        AbstractC1384320m7y abstractC1384320m7yLJ = abstractC1396720mRy2.LJ();
                        if (abstractC1384320m7yLJ != null) {
                            lValueOf2 = Long.valueOf(abstractC1384320m7yLJ.LIZJ);
                        } else {
                            lValueOf2 = null;
                        }
                        if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                            abstractC1396720mRy = abstractC1396720mRy2;
                        } else {
                            if (C1384750m8f.LJIILL) {
                                abstractC1396720mRy2.LIZLLL(canvas, this.LJIIJJI.getConfig());
                            } else {
                                InterfaceC1396980mSO.LIZ.getClass();
                                abstractC1396720mRy2.LIZLLL(canvas, this.LJIIJJI.getConfig());
                                this.LJIIJJI.getConfig().LIZJ.getClass();
                            }
                            i++;
                            if (abstractC1396720mRy2.LJ() != null) {
                                System.nanoTime();
                            }
                        }
                    }
                }
                if (abstractC1396720mRy != null) {
                    if (C1384750m8f.LJIILL) {
                        abstractC1396720mRy.LIZLLL(canvas, this.LJIIJJI.getConfig());
                    } else {
                        InterfaceC1396980mSO.LIZ.getClass();
                        abstractC1396720mRy.LIZLLL(canvas, this.LJIIJJI.getConfig());
                        this.LJIIJJI.getConfig().LIZJ.getClass();
                    }
                    if (abstractC1396720mRy.LJ() != null) {
                        System.nanoTime();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF(Canvas canvas) {
        Long lValueOf;
        Long lValueOf2;
        this.LJIIJJI.getConfig().LIZJ.getClass();
        this.LJII.clear();
        Iterator<InterfaceC1396870mSD> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            this.LJII.addAll(it2.next().LJ());
        }
        int i = 1;
        if (C1384750m8f.LJIILIIL && (!C1384750m8f.LJIIJJI || this.LJIIIZ)) {
            C08XD.LJJ(this.LJII, C20085613iQ.LIZ(AFwS259S0000000_21.get$arr$(325), AFwS259S0000000_21.get$arr$(326), AFwS259S0000000_21.get$arr$(327)));
        }
        if (this.LJIIJJI.getConfig().LJIIIIZZ.LIZ) {
            this.LJ = canvas.saveLayer(0.0f, 0.0f, this.LIZJ, this.LIZLLL, null, 31);
        }
        AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy = null;
        for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2 : this.LJII) {
            if (C1384750m8f.LJIIL) {
                this.LJIIJJI.getFilters().LIZIZ(abstractC1396720mRy2.LJ(), i, this.LJIIJJI.LJIJ(), this.LJIIJJI.getConfig());
            }
            AbstractC1384320m7y abstractC1384320m7y = this.LJIIJ;
            if (abstractC1384320m7y != null) {
                lValueOf = Long.valueOf(abstractC1384320m7y.LIZJ);
            } else {
                lValueOf = null;
            }
            AbstractC1384320m7y abstractC1384320m7yLJ = abstractC1396720mRy2.LJ();
            if (abstractC1384320m7yLJ != null) {
                lValueOf2 = Long.valueOf(abstractC1384320m7yLJ.LIZJ);
            } else {
                lValueOf2 = null;
            }
            if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                abstractC1396720mRy = abstractC1396720mRy2;
            } else {
                InterfaceC1396980mSO.LIZ.getClass();
                abstractC1396720mRy2.LIZLLL(canvas, this.LJIIJJI.getConfig());
                this.LJIIJJI.getConfig().LIZJ.getClass();
                i++;
                if (abstractC1396720mRy2.LJ() != null) {
                    System.nanoTime();
                }
            }
        }
        if (abstractC1396720mRy != null) {
            InterfaceC1396980mSO.LIZ.getClass();
            abstractC1396720mRy.LIZLLL(canvas, this.LJIIJJI.getConfig());
            this.LJIIJJI.getConfig().LIZJ.getClass();
            if (abstractC1396720mRy.LJ() != null) {
                System.nanoTime();
            }
        }
        if (this.LJIIJJI.getConfig().LJIIIIZZ.LIZ) {
            canvas.restoreToCount(this.LJ);
        }
        this.LJII.clear();
    }

    public final void LJII(InterfaceC1396920mSI interfaceC1396920mSI) {
        this.LIZIZ.LIZIZ.LJFF(interfaceC1396920mSI.LIZIZ(), interfaceC1396920mSI);
    }

    public final void LIZ(long j, List<? extends AbstractC1384320m7y> list) {
        Object obj;
        for (InterfaceC1396870mSD interfaceC1396870mSD : this.LIZ) {
            ArrayList<AbstractC1384320m7y> arrayList = new ArrayList();
            for (AbstractC1384320m7y abstractC1384320m7y : list) {
                if (abstractC1384320m7y.LIZJ() == interfaceC1396870mSD.LJJIJLIJ()) {
                    arrayList.add(abstractC1384320m7y);
                }
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (AbstractC1384320m7y abstractC1384320m7y2 : arrayList) {
                    C1396890mSF c1396890mSF = this.LIZIZ;
                    int iLIZIZ = abstractC1384320m7y2.LIZIZ();
                    if (iLIZIZ != 1000) {
                        C1396930mSJ<AbstractC1396720mRy<AbstractC1384320m7y>> c1396930mSJLIZLLL = c1396890mSF.LIZ.LIZLLL(iLIZIZ);
                        if (c1396930mSJLIZLLL == null) {
                            c1396930mSJLIZLLL = new C1396930mSJ<>();
                            c1396890mSF.LIZ.LJFF(iLIZIZ, c1396930mSJLIZLLL);
                        }
                        int i = c1396930mSJLIZLLL.LIZIZ;
                        if (i > 0) {
                            int i2 = i - 1;
                            Object[] objArr = c1396930mSJLIZLLL.LIZ;
                            obj = objArr[i2];
                            objArr[i2] = null;
                            c1396930mSJLIZLLL.LIZIZ = i2;
                        } else {
                            obj = null;
                        }
                        AbstractC1396720mRy<? extends AbstractC1384320m7y> abstractC1396720mRyLIZ = (AbstractC1396720mRy) obj;
                        if (abstractC1396720mRyLIZ == null) {
                            InterfaceC1396920mSI interfaceC1396920mSILIZLLL = c1396890mSF.LIZIZ.LIZLLL(iLIZIZ);
                            if (interfaceC1396920mSILIZLLL != null) {
                                abstractC1396720mRyLIZ = interfaceC1396920mSILIZLLL.LIZ();
                            } else {
                                abstractC1396720mRyLIZ = null;
                            }
                            if (!(abstractC1396720mRyLIZ instanceof AbstractC1396720mRy) || abstractC1396720mRyLIZ == null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Unknown drawType=");
                                sbLIZ.append(iLIZIZ);
                                sbLIZ.append(", did you forget to ");
                                sbLIZ.append("register your custom DanmakuFactory?");
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                        abstractC1396720mRyLIZ.LJJIIJZLJL(interfaceC1396870mSD.LIZIZ());
                        abstractC1396720mRyLIZ.LIZJ(abstractC1384320m7y2, this.LJIIJJI.getConfig());
                        abstractC1396720mRyLIZ.LJIL(this.LJIIJJI.getConfig());
                        arrayList2.add(abstractC1396720mRyLIZ);
                    } else {
                        c1396890mSF.getClass();
                        throw new IllegalArgumentException("drawType is DRAW_TYPE_UNDEFINE! Did you forget to define the drawType in your custom DanmakuData?");
                    }
                }
                interfaceC1396870mSD.LJJIJIL(j, arrayList2);
            }
        }
    }

    public final void LIZIZ(int i, Function1<? super AbstractC1384320m7y, Boolean> function1) {
        if (i == 1000) {
            Iterator<InterfaceC1396870mSD> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJJI(function1);
            }
            if (this.LJIIJJI.LJIIL()) {
                synchronized (this.LJI) {
                    try {
                        this.LJII.clear();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            if (!C1384750m8f.LJIILIIL) {
                this.LJIIJ = null;
                return;
            }
            return;
        }
        for (InterfaceC1396870mSD interfaceC1396870mSD : this.LIZ) {
            if (interfaceC1396870mSD.LJJIJLIJ() == i) {
                interfaceC1396870mSD.LJJI(function1);
            }
        }
    }

    public final void LJI(int i, int i2) {
        if (this.LIZJ == i && this.LIZLLL == i2) {
            return;
        }
        Iterator<InterfaceC1396870mSD> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(i, i2);
        }
        this.LIZJ = i;
        this.LIZLLL = i2;
    }

    public final int LJIIIIZZ(long j, boolean z, boolean z2) {
        this.LJFF = 0;
        Iterator<InterfaceC1396870mSD> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            this.LJFF += it2.next().LIZJ(j, z, z2);
        }
        return this.LJFF;
    }
}
