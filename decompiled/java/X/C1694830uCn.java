package X;

import Y.ARunnableS125S0100000_25;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uCn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@InterfaceC1294060jmO
public final class C1694830uCn implements InterfaceC1692040u8I {
    public final View LIZ;
    public final InterfaceC1694880uCs LIZIZ;
    public final Executor LIZJ;
    public boolean LIZLLL;
    public Function1<? super List<? extends InterfaceC1694390uC5>, Unit> LJ;
    public Function1<? super C1695040uD8, Unit> LJFF;
    public C1686970u07 LJI;
    public C1695020uD6 LJII;
    public final List<WeakReference<InputConnectionC1694660uCW>> LJIIIIZZ;
    public final C01GW LJIIIZ;
    public Rect LJIIJ;
    public final C1694820uCm LJIIJJI;
    public final C19968013Aw<EnumC1694860uCq> LJIIL;
    public ARunnableS125S0100000_25 LJIILIIL;

    @Override // X.InterfaceC1692040u8I
    public final void LIZ() {
        this.LIZLLL = false;
        this.LJ = AFwS266S0000000_25.get$arr$(358);
        this.LJFF = AFwS266S0000000_25.get$arr$(359);
        this.LJIIJ = null;
        LJIIIIZZ(EnumC1694860uCq.LLILLJJLI);
    }

    @Override // X.InterfaceC1692040u8I
    public final void LIZJ() {
        LJIIIIZZ(EnumC1694860uCq.LL);
    }

    @Override // X.InterfaceC1692040u8I
    public final void LJFF() {
        LJIIIIZZ(EnumC1694860uCq.LLILZ);
    }

    @Override // X.InterfaceC1692040u8I
    public final void LJII() {
        LJIIIIZZ(EnumC1694860uCq.LLILLL);
    }

    @Override // X.InterfaceC1692040u8I
    @InterfaceC1294060jmO
    public final void LJI(C1683130ttv c1683130ttv) {
        Rect rect;
        this.LJIIJ = new Rect(C814420VxA.LIZIZ(c1683130ttv.LIZ), C814420VxA.LIZIZ(c1683130ttv.LIZIZ), C814420VxA.LIZIZ(c1683130ttv.LIZJ), C814420VxA.LIZIZ(c1683130ttv.LIZLLL));
        if (((ArrayList) this.LJIIIIZZ).isEmpty() && (rect = this.LJIIJ) != null) {
            this.LIZ.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final void LJIIIIZZ(EnumC1694860uCq enumC1694860uCq) {
        this.LJIIL.LIZLLL(enumC1694860uCq);
        if (this.LJIILIIL == null) {
            ARunnableS125S0100000_25 aRunnableS125S0100000_25 = new ARunnableS125S0100000_25(this, 70);
            this.LIZJ.execute(aRunnableS125S0100000_25);
            this.LJIILIIL = aRunnableS125S0100000_25;
        }
    }

    public C1694830uCn(View view, InterfaceC1696620uFg interfaceC1696620uFg) {
        C2174811A9n c2174811A9n = new C2174811A9n(view);
        final Choreographer choreographerV2 = C786410Ut5.v2();
        Executor executor = new Executor() { // from class: X.0uRo
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                choreographerV2.postFrameCallback(new Choreographer.FrameCallback() { // from class: X.0uRp
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        runnable.run();
                    }
                });
            }
        };
        this.LIZ = view;
        this.LIZIZ = c2174811A9n;
        this.LIZJ = executor;
        this.LJ = AFwS266S0000000_25.get$arr$(360);
        this.LJFF = AFwS266S0000000_25.get$arr$(361);
        this.LJI = new C1686970u07("", C1692280u8g.LIZIZ, 4);
        this.LJII = C1695020uD6.LJI;
        this.LJIIIIZZ = new ArrayList();
        this.LJIIIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 766));
        this.LJIIJJI = new C1694820uCm(interfaceC1696620uFg, c2174811A9n);
        this.LJIIL = new C19968013Aw<>(new EnumC1694860uCq[16]);
    }

    @Override // X.InterfaceC1692040u8I
    public final void LIZLLL(C1686970u07 c1686970u07, C1686970u07 c1686970u072) {
        boolean z;
        int iLJI;
        int iLJFF;
        int iLJI2;
        if (C1692280u8g.LIZIZ(this.LJI.LIZIZ, c1686970u072.LIZIZ) && Intrinsics.LJFF(this.LJI.LIZJ, c1686970u072.LIZJ)) {
            z = false;
        } else {
            z = true;
        }
        this.LJI = c1686970u072;
        int size = ((ArrayList) this.LJIIIIZZ).size();
        for (int i = 0; i < size; i++) {
            InputConnectionC1694660uCW inputConnectionC1694660uCW = (InputConnectionC1694660uCW) ((Reference) ListProtector.get(this.LJIIIIZZ, i)).get();
            if (inputConnectionC1694660uCW != null) {
                inputConnectionC1694660uCW.LIZLLL = c1686970u072;
            }
        }
        C1694820uCm c1694820uCm = this.LJIIJJI;
        synchronized (c1694820uCm.LIZJ) {
            try {
                c1694820uCm.LJIIIZ = null;
                c1694820uCm.LJIIJJI = null;
                c1694820uCm.LJIIJ = null;
                c1694820uCm.LJIIL = AFwS266S0000000_25.get$arr$(356);
                c1694820uCm.LJIILIIL = null;
                c1694820uCm.LJIILJJIL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        int iLJFF2 = -1;
        if (Intrinsics.LJFF(c1686970u07, c1686970u072)) {
            if (z) {
                InterfaceC1694880uCs interfaceC1694880uCs = this.LIZIZ;
                int iLJI3 = C1692280u8g.LJI(c1686970u072.LIZIZ);
                int iLJFF3 = C1692280u8g.LJFF(c1686970u072.LIZIZ);
                C1692280u8g c1692280u8g = this.LJI.LIZJ;
                if (c1692280u8g != null) {
                    iLJI2 = C1692280u8g.LJI(c1692280u8g.LIZ);
                } else {
                    iLJI2 = -1;
                }
                C1692280u8g c1692280u8g2 = this.LJI.LIZJ;
                if (c1692280u8g2 != null) {
                    iLJFF2 = C1692280u8g.LJFF(c1692280u8g2.LIZ);
                }
                interfaceC1694880uCs.LIZ(iLJI3, iLJFF3, iLJI2, iLJFF2);
                return;
            }
            return;
        }
        if (c1686970u07 != null && (!Intrinsics.LJFF(c1686970u07.LIZ.LLILLJJLI, c1686970u072.LIZ.LLILLJJLI) || (C1692280u8g.LIZIZ(c1686970u07.LIZIZ, c1686970u072.LIZIZ) && !Intrinsics.LJFF(c1686970u07.LIZJ, c1686970u072.LIZJ)))) {
            this.LIZIZ.LIZIZ();
            return;
        }
        int size2 = ((ArrayList) this.LJIIIIZZ).size();
        for (int i2 = 0; i2 < size2; i2++) {
            InputConnectionC1694660uCW inputConnectionC1694660uCW2 = (InputConnectionC1694660uCW) ((Reference) ListProtector.get(this.LJIIIIZZ, i2)).get();
            if (inputConnectionC1694660uCW2 != null) {
                C1686970u07 c1686970u073 = this.LJI;
                InterfaceC1694880uCs interfaceC1694880uCs2 = this.LIZIZ;
                if (inputConnectionC1694660uCW2.LJII) {
                    inputConnectionC1694660uCW2.LIZLLL = c1686970u073;
                    if (inputConnectionC1694660uCW2.LJFF) {
                        interfaceC1694880uCs2.updateExtractedText(inputConnectionC1694660uCW2.LJ, C1695900uEW.LIZ(c1686970u073));
                    }
                    C1692280u8g c1692280u8g3 = c1686970u073.LIZJ;
                    if (c1692280u8g3 != null) {
                        iLJI = C1692280u8g.LJI(c1692280u8g3.LIZ);
                    } else {
                        iLJI = -1;
                    }
                    C1692280u8g c1692280u8g4 = c1686970u073.LIZJ;
                    if (c1692280u8g4 != null) {
                        iLJFF = C1692280u8g.LJFF(c1692280u8g4.LIZ);
                    } else {
                        iLJFF = -1;
                    }
                    interfaceC1694880uCs2.LIZ(C1692280u8g.LJI(c1686970u073.LIZIZ), C1692280u8g.LJFF(c1686970u073.LIZIZ), iLJI, iLJFF);
                }
            }
        }
    }

    @Override // X.InterfaceC1692040u8I
    public final void LIZIZ(C1686970u07 c1686970u07, C1695020uD6 c1695020uD6, AwS234S0300000_25 awS234S0300000_25, AwS604S0100000_25 awS604S0100000_25) {
        this.LIZLLL = true;
        this.LJI = c1686970u07;
        this.LJII = c1695020uD6;
        this.LJ = awS234S0300000_25;
        this.LJFF = awS604S0100000_25;
        LJIIIIZZ(EnumC1694860uCq.LL);
    }

    @Override // X.InterfaceC1692040u8I
    public final void LJ(C1686970u07 c1686970u07, InterfaceC1692600u9C interfaceC1692600u9C, C1692150u8T c1692150u8T, AwS604S0100000_25 awS604S0100000_25, C1683130ttv c1683130ttv, C1683130ttv c1683130ttv2) {
        C1694820uCm c1694820uCm = this.LJIIJJI;
        synchronized (c1694820uCm.LIZJ) {
            try {
                c1694820uCm.LJIIIZ = c1686970u07;
                c1694820uCm.LJIIJJI = interfaceC1692600u9C;
                c1694820uCm.LJIIJ = c1692150u8T;
                c1694820uCm.LJIIL = awS604S0100000_25;
                c1694820uCm.LJIILIIL = c1683130ttv;
                c1694820uCm.LJIILJJIL = c1683130ttv2;
                if (c1694820uCm.LJ || c1694820uCm.LIZLLL) {
                    c1694820uCm.LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
