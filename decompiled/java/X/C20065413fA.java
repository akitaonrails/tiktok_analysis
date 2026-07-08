package X;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS602S0100000_23;

/* JADX INFO: renamed from: X.13fA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20065413fA extends AbstractC20055413dY implements InterfaceC20079413hQ, InterfaceC1369205Xm, InterfaceC1690500u5o {
    public Object LLJJ;
    public Object LLJJI;
    public Object[] LLJJIII;
    public PointerInputEventHandler LLJJIJI;
    public AnonymousClass0956 LLJJIJIIJIL;
    public C20067313fT LLJJIJIL = C1679720toQ.LIZ;
    public final C19968013Aw<C1516410pZ1<?>> LLJJJ;
    public final C19968013Aw LLJJJIL;
    public final C19968013Aw<C1516410pZ1<?>> LLJJJJ;
    public C20067313fT LLJJJJJIL;
    public long LLJJJJLIIL;

    @Override // X.InterfaceC20056213dg
    public final /* synthetic */ void LJJIIZ() {
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJJLIIIJLJLI(long j) {
        return C1682420tsm.LIZLLL(j, this);
    }

    @Override // X.InterfaceC20056213dg
    public final /* synthetic */ boolean LJL() {
        return false;
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJLI(long j) {
        return C1682420tsm.LIZIZ(j, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ long LJLJLJ(float f) {
        return C1685230txJ.LIZIZ(this, f);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ int LJLLJ(float f) {
        return C1682420tsm.LIZ(f, this);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ float LJLLL(long j) {
        return C1682420tsm.LIZJ(j, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ float LLI(long j) {
        return C1685230txJ.LIZ(this, j);
    }

    @Override // X.InterfaceC1369205Xm
    public final void LLIIL() {
    }

    @Override // X.InterfaceC20079413hQ
    public final void LJLLLL() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJIIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(new CancellationException() { // from class: X.0pYz
                public static final int $stable = 0;

                @Override // java.lang.Throwable
                public Throwable fillInStackTrace() {
                    setStackTrace(C1516380pYy.LIZ);
                    return this;
                }
            });
            this.LLJJIJIIJIL = null;
        }
    }

    @Override // X.InterfaceC20056213dg
    public final void LLIIIILZ() {
        C20067313fT c20067313fT = this.LLJJJJJIL;
        if (c20067313fT == null) {
            return;
        }
        List<C20066813fO> list = c20067313fT.LIZ;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!(true ^ ((C20066813fO) ListProtector.get(list, i)).LIZLLL)) {
                List<C20066813fO> list2 = c20067313fT.LIZ;
                ArrayList arrayList = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C20066813fO c20066813fO = (C20066813fO) ListProtector.get(list2, i2);
                    long j = c20066813fO.LIZ;
                    long j2 = c20066813fO.LIZJ;
                    long j3 = c20066813fO.LIZIZ;
                    float f = c20066813fO.LJ;
                    boolean z = c20066813fO.LIZLLL;
                    arrayList.add(new C20066813fO(j, j3, j2, false, f, j3, j2, z, z, c20066813fO.LJIIIIZZ, 0L));
                }
                C20067313fT c20067313fT2 = new C20067313fT(arrayList, null);
                this.LLJJIJIL = c20067313fT2;
                LLJJ(c20067313fT2, EnumC20065813fE.Initial);
                LLJJ(c20067313fT2, EnumC20065813fE.Main);
                LLJJ(c20067313fT2, EnumC20065813fE.Final);
                this.LLJJJJJIL = null;
                return;
            }
        }
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LJJ() {
        return C20052513d5.LJFF(this).LLJJJJLIIL.LJJ();
    }

    @Override // X.InterfaceC1690500u5o
    public final float getDensity() {
        return C20052513d5.LJFF(this).LLJJJJLIIL.getDensity();
    }

    @Override // X.InterfaceC1369205Xm
    public final InterfaceC1374305Zl getViewConfiguration() {
        return C20052513d5.LJFF(this).LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJJJZ() {
        LJLLLL();
    }

    @Override // X.InterfaceC20056213dg
    public final long LJJLIIIJ() {
        return C20082213hs.LIZ;
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZLL() {
        LJLLLL();
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        LJLLLL();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJI(int i) {
        return i / getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJJJLL(float f) {
        return f * getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LLIIIJ(float f) {
        return f / getDensity();
    }

    @Override // X.InterfaceC1369205Xm
    public final <R> Object LJJJLIIL(Function2<? super C05ZT, ? super InterfaceC1364105Vn<? super R>, ? extends Object> function2, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C1516410pZ1 c1516410pZ1 = new C1516410pZ1(this, c2252611DEt);
        synchronized (this.LLJJJIL) {
            try {
                this.LLJJJ.LIZLLL(c1516410pZ1);
                InterfaceC1364105Vn<Unit> interfaceC1364105VnLIZ = C099U.LIZ(function2, c1516410pZ1, c1516410pZ1);
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC1364105VnLIZ.resumeWith(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c2252611DEt.LJJII(new AwS602S0100000_23(c1516410pZ1, 57));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final void LLJJ(C20067313fT c20067313fT, EnumC20065813fE enumC20065813fE) {
        InterfaceC20236714Gf<? super C20067313fT> interfaceC20236714Gf;
        InterfaceC20236714Gf<? super C20067313fT> interfaceC20236714Gf2;
        synchronized (this.LLJJJIL) {
            try {
                C19968013Aw<C1516410pZ1<?>> c19968013Aw = this.LLJJJJ;
                c19968013Aw.LJ(c19968013Aw.LLILLL, this.LLJJJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        try {
            int i = C20065713fD.LIZ[enumC20065813fE.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    C19968013Aw<C1516410pZ1<?>> c19968013Aw2 = this.LLJJJJ;
                    int i2 = c19968013Aw2.LLILLL - 1;
                    C1516410pZ1<?>[] c1516410pZ1Arr = c19968013Aw2.LL;
                    if (i2 < c1516410pZ1Arr.length) {
                        while (i2 >= 0) {
                            C1516410pZ1<?> c1516410pZ1 = c1516410pZ1Arr[i2];
                            if (enumC20065813fE == c1516410pZ1.LLILZ && (interfaceC20236714Gf2 = c1516410pZ1.LLILLL) != null) {
                                c1516410pZ1.LLILLL = null;
                                C189200o6.m2constructorimpl(c20067313fT);
                                interfaceC20236714Gf2.resumeWith(c20067313fT);
                            }
                            i2--;
                        }
                    }
                }
            } else {
                C19968013Aw<C1516410pZ1<?>> c19968013Aw3 = this.LLJJJJ;
                C1516410pZ1<?>[] c1516410pZ1Arr2 = c19968013Aw3.LL;
                int i3 = c19968013Aw3.LLILLL;
                for (int i4 = 0; i4 < i3; i4++) {
                    C1516410pZ1<?> c1516410pZ12 = c1516410pZ1Arr2[i4];
                    if (enumC20065813fE == c1516410pZ12.LLILZ && (interfaceC20236714Gf = c1516410pZ12.LLILLL) != null) {
                        c1516410pZ12.LLILLL = null;
                        C189200o6.m2constructorimpl(c20067313fT);
                        interfaceC20236714Gf.resumeWith(c20067313fT);
                    }
                }
            }
            this.LLJJJJ.LJIIIZ();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LLJJJJ.LJIIIZ();
            throw th2;
        }
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJJZ(C20067313fT c20067313fT, EnumC20065813fE enumC20065813fE, long j) {
        this.LLJJJJLIIL = j;
        if (enumC20065813fE == EnumC20065813fE.Initial) {
            this.LLJJIJIL = c20067313fT;
        }
        if (this.LLJJIJIIJIL == null) {
            this.LLJJIJIIJIL = C23250099c.LIZLLL(LLILLIZIL(), null, C099V.UNDISPATCHED, new C05UF(this, null), 1);
        }
        LLJJ(c20067313fT, enumC20065813fE);
        List<C20066813fO> list = c20067313fT.LIZ;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!C05ZS.LIZJ((C20066813fO) ListProtector.get(list, i))) {
                    break;
                } else {
                    i++;
                }
            } else {
                c20067313fT = null;
                break;
            }
        }
        this.LLJJJJJIL = c20067313fT;
    }

    public C20065413fA(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.LLJJ = obj;
        this.LLJJI = obj2;
        this.LLJJIII = objArr;
        this.LLJJIJI = pointerInputEventHandler;
        C19968013Aw<C1516410pZ1<?>> c19968013Aw = new C19968013Aw<>(new C1516410pZ1[16]);
        this.LLJJJ = c19968013Aw;
        this.LLJJJIL = c19968013Aw;
        this.LLJJJJ = new C19968013Aw<>(new C1516410pZ1[16]);
        this.LLJJJJLIIL = 0L;
    }
}
