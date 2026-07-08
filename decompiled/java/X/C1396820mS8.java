package X;

import Y.ARunnableS121S0100000_21;
import Y.ARunnableS27S0201000_21;
import Y.ARunnableS32S0101000_21;
import Y.ARunnableS90S0200000_21;
import android.content.Context;
import android.graphics.Canvas;
import android.os.HandlerThread;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.meteor.render.newcache.BitmapCacheManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0mS8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396820mS8 implements InterfaceC1385080m9C, InterfaceC1384330m7z {
    public static final HandlerThread LJIJ = new HandlerThread("danmaku");
    public WeakReference<InterfaceC1396910mSH> LIZ;
    public final C1384750m8f LIZIZ;
    public final C1384800m8k LIZJ;
    public InterfaceC1066480drK LIZLLL;
    public final List<C13IQ<? extends InterfaceC1396870mSD>> LJ;
    public final C1396850mSB LJFF;
    public final List<InterfaceC1396310mRJ> LJI;
    public final List<InterfaceC1385050m99> LJII;
    public C1396840mSA LJIIIIZZ;
    public final C1396900mSG LJIIIZ;
    public final C1384770m8h LJIIJ;
    public final C1385100m9E LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final BPEAHandler LJIILJJIL;
    public long LJIILL;
    public final ARunnableS121S0100000_21 LJIILLIIL;
    public final C01GW LJIIZILJ;

    @Override // X.InterfaceC1384330m7z
    public final boolean LJIIL() {
        return true;
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJ() {
    }

    @Override // X.InterfaceC1384330m7z
    public final void pause() {
        this.LJIIL = false;
        this.LJFF.LJ = false;
        this.LJIILL = 0L;
        this.LJIILJJIL.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC1384330m7z
    public final void stop() throws JSONException {
        this.LJIIL = false;
        this.LJFF.LJ();
        ((ArrayList) this.LJII).clear();
        BitmapCacheManager.LIZJ(this);
        this.LJIILL = 0L;
        this.LJIILJJIL.removeCallbacksAndMessages(null);
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
    public final void LJIIZILJ() {
        this.LJIIIIZZ = new C1396840mSA(this);
    }

    @Override // X.InterfaceC1384330m7z
    public final long LJIJ() {
        return this.LJFF.LJI();
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJIIZI() {
        this.LJIIJJI.LIZ.LIZLLL.getClass();
        this.LJIILL = 0L;
        this.LJIILJJIL.removeCallbacksAndMessages(null);
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

    @Override // X.InterfaceC1384330m7z
    public final void resume() {
        LJIIJJI(this.LJFF.LJI());
    }

    public C1396820mS8() {
        C1384750m8f c1384750m8f = new C1384750m8f();
        ((ArrayList) c1384750m8f.LIZ).add(this);
        c1384750m8f.LIZLLL.LIZIZ = true;
        this.LIZIZ = c1384750m8f;
        C1384800m8k c1384800m8k = new C1384800m8k();
        this.LIZJ = c1384800m8k;
        this.LJ = new ArrayList();
        this.LJFF = new C1396850mSB(c1384750m8f, c1384800m8k);
        ArrayList arrayList = new ArrayList();
        this.LJI = arrayList;
        this.LJII = new ArrayList();
        this.LJIIIZ = new C1396900mSG();
        this.LJIIJ = C1384750m8f.LJIILJJIL ? new C1384770m8h(c1384750m8f) : null;
        this.LJIIJJI = new C1385100m9E(c1384750m8f);
        this.LJIILIIL = true;
        arrayList.add(this);
        HandlerThread handlerThread = LJIJ;
        if (handlerThread.getState() == Thread.State.NEW) {
            handlerThread.start();
        }
        this.LJIILJJIL = new BPEAHandler(C786410Ut5.W2(handlerThread));
        new ARunnableS121S0100000_21(this, 11);
        this.LJIILLIIL = new ARunnableS121S0100000_21(this, 10);
        this.LJIIZILJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(24));
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
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS90S0200000_21(list, this, 1));
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
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS90S0200000_21(abstractC1396950mSL, this, 5));
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJIIIZ(AbstractC1384320m7y abstractC1384320m7y) {
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS90S0200000_21(abstractC1384320m7y, this, 2));
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
        InterfaceC1396910mSH interfaceC1396910mSHLJJJ2 = LJJJ();
        if (interfaceC1396910mSHLJJJ2 != null) {
            interfaceC1396910mSHLJJJ2.LIZ();
        }
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJIILL(InterfaceC1396920mSI interfaceC1396920mSI) {
        if (interfaceC1396920mSI.LIZIZ() >= 2000) {
            this.LJIIIIZZ.LJII(interfaceC1396920mSI);
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
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS32S0101000_21(i, this, 1));
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
        if (this.LJIIL) {
            if (this.LJIIJ != null) {
                long jNanoTime = System.nanoTime();
                this.LJIIIIZZ.LJ(canvas);
                long jNanoTime2 = System.nanoTime();
                C1384770m8h c1384770m8h = this.LJIIJ;
                if (c1384770m8h != null) {
                    c1384770m8h.LIZ(jNanoTime, jNanoTime2);
                }
            } else {
                this.LJIIIIZZ.LJ(canvas);
            }
        } else if (this.LJIIJ != null) {
            long jNanoTime3 = System.nanoTime();
            this.LJIIIIZZ.LJ(canvas);
            long jNanoTime4 = System.nanoTime();
            C1384770m8h c1384770m8h2 = this.LJIIJ;
            if (c1384770m8h2 != null) {
                c1384770m8h2.LIZ(jNanoTime3, jNanoTime4);
            }
        } else {
            this.LJIIIIZZ.LJ(canvas);
        }
        this.LIZIZ.LIZLLL.getClass();
        C786410Ut5.LJJZZIII(this.LJIILJJIL, this.LJIILLIIL);
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
                    break;
                case 1002:
                    InterfaceC1396910mSH interfaceC1396910mSHLJJJ2 = LJJJ();
                    if (interfaceC1396910mSHLJJJ2 != null) {
                        interfaceC1396910mSHLJJJ2.LIZ();
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
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS32S0101000_21(i, this, 2));
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJIJIIJI(InterfaceC1396310mRJ interfaceC1396310mRJ) {
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS90S0200000_21(interfaceC1396310mRJ, this, 3));
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJIZ(C19719912Dl c19719912Dl) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1384330m7z
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LJIILIIL) {
            return false;
        }
        Iterator it2 = ((List) this.LJIIZILJ.getValue()).iterator();
        while (it2.hasNext()) {
            if (((Boolean) ((Function1) it2.next()).invoke(motionEvent)).booleanValue()) {
                return false;
            }
        }
        return this.LJIIIZ.LIZ(motionEvent, this.LJIIIIZZ);
    }

    @Override // X.InterfaceC1384330m7z
    public final void LIZ(int i, int i2) {
        this.LJIIIIZZ.LJI(i, i2);
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJIIZ(final long j, final List list) {
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new Runnable() { // from class: X.0mSE
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AsyncDanmakuController@3623.setData$1");
                try {
                    C1396850mSB c1396850mSB = this.LL.LJFF;
                    List list2 = list;
                    c1396850mSB.LIZ.clear();
                    c1396850mSB.LIZ.addAll(list2);
                    long j2 = j;
                    if (j2 > 0) {
                        this.LL.LJFF.LIZLLL(j2);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AsyncDanmakuController@3623.setData$1");
            }
        });
    }

    @Override // X.InterfaceC1384330m7z
    public final void LJJIJ(int i, Function1<? super AbstractC1384320m7y, Boolean> function1) {
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS27S0201000_21(i, this, function1, 0));
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
        C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS90S0200000_21(new C1396940mSK(i, abstractC1384320m7y, obj), this, 4));
    }
}
