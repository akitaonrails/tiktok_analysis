package X;

import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.common.meteor.render.newcache.BitmapCacheManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mS9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396830mS9 implements InterfaceC1385080m9C, InterfaceC1384330m7z {
    public WeakReference<InterfaceC1396910mSH> LIZ;
    public final C1384750m8f LIZIZ;
    public final C1384800m8k LIZJ;
    public InterfaceC1066480drK LIZLLL;
    public final List<C13IQ<? extends InterfaceC1396870mSD>> LJ;
    public final C1396850mSB LJFF;
    public final List<InterfaceC1396310mRJ> LJI;
    public final List<InterfaceC1385050m99> LJII;
    public final C01GW LJIIIIZZ;
    public final C1396900mSG LJIIIZ;
    public final C01GW LJIIJ;
    public final C1385100m9E LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public long LJIILJJIL;
    public final ChoreographerFrameCallbackC1402070mab LJIILL;
    public final C01GW LJIILLIIL;

    @Override // X.InterfaceC1384330m7z
    public final boolean LJIIL() {
        return false;
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJIIZILJ() {
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJ() {
    }

    public final InterfaceC1396960mSM LJJJI() {
        return (InterfaceC1396960mSM) this.LJIIJ.getValue();
    }

    public final C1396840mSA LJJJIL() {
        return (C1396840mSA) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC1384330m7z
    public final void pause() {
        this.LJIIL = false;
        this.LJFF.LJ = false;
        LJJJJI();
    }

    @Override // X.InterfaceC1384330m7z
    public final void stop() {
        this.LJIIL = false;
        this.LJFF.LJ();
        ((ArrayList) this.LJII).clear();
        BitmapCacheManager.LIZJ(this);
        LJJJJI();
        LJJIJ(LSPassThroughRecordSizeConfig.DEFAULT, null);
    }

    @Override // X.InterfaceC1384330m7z
    public final InterfaceC1396910mSH LJII() {
        WeakReference<InterfaceC1396910mSH> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC1384330m7z
    public final long LJIJ() {
        return this.LJFF.LJI();
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJIIZI() {
        this.LJIIJJI.LIZ.LIZLLL.getClass();
        LJJJJI();
        LJJJJ();
        InterfaceC1396910mSH interfaceC1396910mSHLJJJ = LJJJ();
        if (interfaceC1396910mSHLJJJ != null) {
            interfaceC1396910mSHLJJJ.LIZ();
        }
    }

    public final InterfaceC1396910mSH LJJJ() {
        WeakReference<InterfaceC1396910mSH> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void LJJJJI() {
        this.LJIILJJIL = 0L;
        C786410Ut5.v2().removeFrameCallback(this.LJIILL);
    }

    @Override // X.InterfaceC1384330m7z
    public final void resume() {
        LJIIJJI(this.LJFF.LJI());
    }

    public C1396830mS9() {
        C1384750m8f c1384750m8f = new C1384750m8f();
        ((ArrayList) c1384750m8f.LIZ).add(this);
        this.LIZIZ = c1384750m8f;
        C1384800m8k c1384800m8k = new C1384800m8k();
        this.LIZJ = c1384800m8k;
        this.LJ = new ArrayList();
        this.LJFF = new C1396850mSB(c1384750m8f, c1384800m8k);
        ArrayList arrayList = new ArrayList();
        this.LJI = arrayList;
        this.LJII = new ArrayList();
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJIIIIZZ = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 55));
        this.LJIIIZ = new C1396900mSG();
        this.LJIIJ = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 54));
        this.LJIIJJI = new C1385100m9E(c1384750m8f);
        this.LJIILIIL = true;
        arrayList.add(this);
        new ARunnableS121S0100000_21(this, 12);
        this.LJIILL = new ChoreographerFrameCallbackC1402070mab(this, 0);
        this.LJIILLIIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(15));
    }

    public final void LJJJJ() {
        C786410Ut5.v2().postFrameCallback(this.LJIILL);
    }

    @Override // X.InterfaceC1384330m7z
    public final C1385100m9E LJJIIJ() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1384330m7z
    public final List<C13IQ<? extends InterfaceC1396870mSD>> LJJIJL() {
        return this.LJ;
    }

    @Override // X.InterfaceC1384330m7z
    public final InterfaceC1066480drK LJJIL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1384330m7z
    public final C1384750m8f getConfig() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1384330m7z
    public final C1384800m8k getFilters() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1384330m7z
    public final boolean isPlaying() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1384330m7z
    public final void LIZLLL(List<? extends AbstractC1384320m7y> list) {
        this.LJFF.LIZ.addAll(list);
        LJJIIZI();
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJFF(InterfaceC1066480drK interfaceC1066480drK) {
        this.LIZLLL = interfaceC1066480drK;
    }

    @Override // X.InterfaceC1384330m7z
    public final boolean LJI(InterfaceC1396910mSH interfaceC1396910mSH) {
        if (!Intrinsics.LJFF(LJJJ(), interfaceC1396910mSH)) {
            return false;
        }
        this.LJFF.LJIIIZ = false;
        this.LIZ = null;
        return true;
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJIIIIZZ(AbstractC1396950mSL abstractC1396950mSL) {
        ((ArrayList) this.LJI).remove(abstractC1396950mSL);
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJIIIZ(AbstractC1384320m7y abstractC1384320m7y) {
        this.LJFF.LIZIZ(abstractC1384320m7y);
        LJJIIZI();
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJIIJ(long j) {
        this.LJFF.LIZLLL(j);
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJIIJJI(long j) {
        Context contextN3;
        View view;
        Context context;
        if (this.LJIIL) {
            return;
        }
        this.LJIIL = true;
        this.LJFF.LIZLLL(j);
        InterfaceC1396910mSH interfaceC1396910mSHLJJJ = LJJJ();
        if (interfaceC1396910mSHLJJJ != null && (view = interfaceC1396910mSHLJJJ.getView()) != null && (context = view.getContext()) != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        BitmapCacheManager.LIZIZ(contextN3, this, this.LIZIZ);
        LJJJJI();
        LJJJJ();
        InterfaceC1396910mSH interfaceC1396910mSHLJJJ2 = LJJJ();
        if (interfaceC1396910mSHLJJJ2 != null) {
            interfaceC1396910mSHLJJJ2.LIZ();
        }
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJIILL(InterfaceC1396920mSI interfaceC1396920mSI) {
        if (interfaceC1396920mSI.LIZIZ() >= 2000) {
            LJJJIL().LJII(interfaceC1396920mSI);
            return;
        }
        throw new IllegalArgumentException("The custom DrawType must not be less than 2000.");
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJIILLIIL(InterfaceC1385050m99 interfaceC1385050m99) {
        if (!((ArrayList) this.LJII).contains(interfaceC1385050m99)) {
            ((ArrayList) this.LJII).add(interfaceC1385050m99);
        }
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJIJI(int i) {
        LJJJIL().LIZJ(i);
    }

    @Override // X.InterfaceC1384330m7z
    public final boolean LJIJJLI(InterfaceC1396910mSH interfaceC1396910mSH) {
        if (LJJJ() == null) {
            this.LJFF.LJIIIZ = false;
            this.LIZ = new WeakReference<>(interfaceC1396910mSH);
            return true;
        }
        return Intrinsics.LJFF(LJJJ(), interfaceC1396910mSH);
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJIL(Canvas canvas) {
        Long lValueOf;
        this.LJIIJJI.LIZ.LIZLLL.getClass();
        if (LJJJIL().LJFF == 0 && this.LIZIZ.LIZLLL.LJIIJ) {
            long jLIZJ = this.LJFF.LIZJ();
            int i = this.LIZIZ.LIZLLL.LJ;
            if (i > 0) {
                jLIZJ = (jLIZJ * ((long) 100)) / ((long) i);
            }
            if (jLIZJ > 0 && (lValueOf = Long.valueOf(jLIZJ)) != null) {
                long jLongValue = lValueOf.longValue();
                if (jLongValue > 160) {
                    InterfaceC1396910mSH interfaceC1396910mSHLJJJ = LJJJ();
                    if (interfaceC1396910mSHLJJJ != null) {
                        interfaceC1396910mSHLJJJ.LIZIZ(jLongValue - 80, new AwS565S0100000_21(this, 53));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (this.LJIIL) {
            if (LJJJI() != null) {
                long jNanoTime = System.nanoTime();
                LJJJIL().LJFF(canvas);
                long jNanoTime2 = System.nanoTime();
                InterfaceC1396960mSM interfaceC1396960mSMLJJJI = LJJJI();
                if (interfaceC1396960mSMLJJJI != null) {
                    interfaceC1396960mSMLJJJI.LIZ(jNanoTime, jNanoTime2);
                }
                InterfaceC1396910mSH interfaceC1396910mSHLJJJ2 = LJJJ();
                if (interfaceC1396910mSHLJJJ2 != null) {
                    interfaceC1396910mSHLJJJ2.LIZ();
                    return;
                }
                return;
            }
            LJJJIL().LJFF(canvas);
            InterfaceC1396910mSH interfaceC1396910mSHLJJJ3 = LJJJ();
            if (interfaceC1396910mSHLJJJ3 == null) {
                return;
            }
            interfaceC1396910mSHLJJJ3.LIZ();
            return;
        }
        if (LJJJI() != null) {
            long jNanoTime3 = System.nanoTime();
            LJJJIL().LJFF(canvas);
            long jNanoTime4 = System.nanoTime();
            InterfaceC1396960mSM interfaceC1396960mSMLJJJI2 = LJJJI();
            if (interfaceC1396960mSMLJJJI2 == null) {
                return;
            }
            interfaceC1396960mSMLJJJI2.LIZ(jNanoTime3, jNanoTime4);
            return;
        }
        LJJJIL().LJFF(canvas);
        InterfaceC1396910mSH interfaceC1396910mSHLJJJ4 = LJJJ();
        if (interfaceC1396910mSHLJJJ4 == null) {
            return;
        }
        interfaceC1396910mSHLJJJ4.LIZ();
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJIFFI(AbstractC1384320m7y abstractC1384320m7y) {
        this.LJFF.LIZJ.add(abstractC1384320m7y);
        if (this.LIZIZ.LIZLLL.LJIIJ) {
            LJJIIZI();
        }
    }

    @Override // X.InterfaceC1396310mRJ
    public final void LJJII(C1396940mSK c1396940mSK) {
        int i = c1396940mSK.LIZ;
        Object obj = null;
        if (i != 1005) {
            switch (i) {
                case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                    Object obj2 = c1396940mSK.LIZJ;
                    if (obj2 instanceof Boolean) {
                        obj = obj2;
                    }
                    Boolean bool = (Boolean) obj;
                    if (bool != null) {
                        this.LJIILIIL = bool.booleanValue();
                    }
                    break;
                case 1001:
                    InterfaceC1396910mSH interfaceC1396910mSHLJJJ = LJJJ();
                    if (interfaceC1396910mSHLJJJ != null) {
                        interfaceC1396910mSHLJJJ.LIZ();
                    }
                    if (C1384750m8f.LJIIJJI) {
                        LJJJIL().LJIIIZ = true;
                    }
                    break;
                case 1002:
                    InterfaceC1396910mSH interfaceC1396910mSHLJJJ2 = LJJJ();
                    if (interfaceC1396910mSHLJJJ2 != null) {
                        interfaceC1396910mSHLJJJ2.LIZ();
                    }
                    if (C1384750m8f.LJIIJJI) {
                        LJJJIL().LJIIIZ = false;
                    }
                    break;
            }
            return;
        }
        Object obj3 = c1396940mSK.LIZJ;
        if (obj3 instanceof Boolean) {
            obj = obj3;
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 != null) {
            bool2.booleanValue();
        }
        for (AbstractC1384320m7y abstractC1384320m7y : this.LJFF.LIZ) {
            if (abstractC1384320m7y instanceof C1384310m7x) {
                ((C1384310m7x) abstractC1384320m7y).LJIIJ = true;
            }
        }
        for (AbstractC1384320m7y abstractC1384320m7y2 : this.LJFF.LIZJ) {
            if (abstractC1384320m7y2 instanceof C1384310m7x) {
                ((C1384310m7x) abstractC1384320m7y2).LJIIJ = true;
            }
        }
    }

    @Override // X.InterfaceC1385080m9C
    public final void LJJIII(int i) {
        InterfaceC1396910mSH interfaceC1396910mSHLJJJ;
        Iterator<InterfaceC1396870mSD> it2 = LJJJIL().LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIII(i);
        }
        if (i != 1100) {
            if (i != 1101) {
                if (i != 1103) {
                    if (i != 1104) {
                        if (i != 1200) {
                            if (i == 1800 && (interfaceC1396910mSHLJJJ = LJJJ()) != null) {
                                interfaceC1396910mSHLJJJ.LIZ();
                            }
                        } else {
                            LJJJIL().LJIIIIZZ(this.LJFF.LJI(), this.LJIIL, true);
                        }
                    } else if (!this.LIZIZ.LIZLLL.LJIIIIZZ) {
                        LJJJIL().LIZIZ(1003, null);
                    }
                } else if (!this.LIZIZ.LIZLLL.LJII) {
                    LJJJIL().LIZIZ(1002, null);
                }
            } else {
                C1396850mSB c1396850mSB = this.LJFF;
                c1396850mSB.LJI = c1396850mSB.LJIIIIZZ;
                c1396850mSB.LJII = System.currentTimeMillis();
            }
        } else {
            InterfaceC1396910mSH interfaceC1396910mSHLJJJ2 = LJJJ();
            if (interfaceC1396910mSHLJJJ2 != null) {
                interfaceC1396910mSHLJJJ2.LIZJ(this.LIZIZ.LIZLLL.LIZJ / 255.0f);
            }
        }
        InterfaceC1396910mSH interfaceC1396910mSHLJJJ3 = LJJJ();
        if (interfaceC1396910mSHLJJJ3 != null) {
            interfaceC1396910mSHLJJJ3.LIZ();
        }
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJIJIIJI(InterfaceC1396310mRJ interfaceC1396310mRJ) {
        ((ArrayList) this.LJI).add(interfaceC1396310mRJ);
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJIZ(C19719912Dl c19719912Dl) {
        ((ArrayList) this.LJ).add(c19719912Dl);
    }

    @Override // X.InterfaceC1384330m7z
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LJIILIIL) {
            return false;
        }
        Iterator it2 = ((List) this.LJIILLIIL.getValue()).iterator();
        while (it2.hasNext()) {
            if (((Boolean) ((Function1) it2.next()).invoke(motionEvent)).booleanValue()) {
                return false;
            }
        }
        return this.LJIIIZ.LIZ(motionEvent, LJJJIL());
    }

    @Override // X.InterfaceC1384330m7z
    public final void LIZ(int i, int i2) {
        LJJJIL().LJI(i, i2);
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJIIZ(long j, List list) {
        C1396850mSB c1396850mSB = this.LJFF;
        c1396850mSB.LIZ.clear();
        c1396850mSB.LIZ.addAll(list);
        if (j > 0) {
            this.LJFF.LIZLLL(j);
        }
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJIJ(int i, Function1<? super AbstractC1384320m7y, Boolean> function1) {
        LJJJIL().LIZIZ(i, function1);
        if (i == 1000) {
            LJJIIZI();
        }
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJIIJZLJL(int i, AbstractC1384320m7y abstractC1384320m7y, Object obj) {
        C1385110m9F c1385110m9FLIZIZ = C1397030mST.LIZ.LIZIZ();
        if (c1385110m9FLIZIZ == null) {
            c1385110m9FLIZIZ = new C1385110m9F(i, abstractC1384320m7y, obj);
        } else {
            c1385110m9FLIZIZ.LIZ = i;
            c1385110m9FLIZIZ.LIZIZ = abstractC1384320m7y;
            c1385110m9FLIZIZ.LIZJ = obj;
        }
        Iterator it2 = ((ArrayList) this.LJII).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1385050m99) it2.next()).onEvent(c1385110m9FLIZIZ);
        }
        C1085650eMF<C1385110m9F> c1085650eMF = C1397030mST.LIZ;
        c1385110m9FLIZIZ.LIZ = 0;
        c1385110m9FLIZIZ.LIZIZ = null;
        try {
            C1397030mST.LIZ.LIZ(c1385110m9FLIZIZ);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJIJIIJIL(int i, AbstractC1384320m7y abstractC1384320m7y, Object obj) {
        C1396940mSK c1396940mSK = new C1396940mSK(i, abstractC1384320m7y, obj);
        Iterator it2 = ((ArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1396310mRJ) it2.next()).LJJII(c1396940mSK);
        }
    }
}
