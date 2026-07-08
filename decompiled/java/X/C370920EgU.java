package X;

import android.graphics.Bitmap;
import android.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS122S1200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;

/* JADX INFO: renamed from: X.0EgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370920EgU implements InterfaceC497601wk, InterfaceC370850EgN {
    public static boolean LLJJI;
    public static final C01GW<C1DFT> LLJJIII = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(416));
    public final Size LL;
    public final CoroutineContext LLILLL;
    public int LLIZ;
    public int LLJ;
    public final AbstractC2252651DEx LLJILJIL;
    public String LLJILJILJ;
    public final AnonymousClass0956 LLJILLL;
    public final AnonymousClass0956 LLJJ;
    public final Function1<Boolean, Unit> LLILLJJLI = null;
    public final C370950EgX LLILZ = new C370950EgX();
    public final List<InterfaceC371030Egf> LLILZIL = new ArrayList();
    public final LinkedList<C370710Eg9> LLILZLL = new LinkedList<>();
    public final LinkedList<List<C370780EgG>> LLIZLLLIL = new LinkedList<>();
    public final C1DEK LLJI = C095G.LIZ(4, null, 6);
    public final C1DEK LLJIJIL = C095G.LIZ(1, null, 6);

    public final void LIZIZ() {
        synchronized (this.LLILZLL) {
            try {
                this.LLILZLL.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        synchronized (this.LLIZLLLIL) {
            try {
                this.LLIZLLLIL.clear();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLILLL;
    }

    public static String LJ(String str) {
        return C371390EhF.LIZ(str);
    }

    public final void LJFF(boolean z) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(this, C2107308Nj.LIZ, null, new C358470E3p(this, z, null), 2);
    }

    public C370920EgU(CoroutineContext coroutineContext, Size size) {
        C1DFT value;
        this.LL = size;
        this.LLILLL = coroutineContext;
        if (((Boolean) C275420Aqq.LIZ.getValue()).booleanValue()) {
            value = LLJJIII.getValue();
        } else if (LLJJI) {
            value = C0PEM.LIZJ;
        } else {
            value = C0PEM.LIZ;
        }
        this.LLJILJIL = value;
        this.LLJILLL = C23250099c.LIZLLL(C2296808zG.LIZ(value), null, null, new C370960EgY(this, null), 3);
        this.LLJJ = C23250099c.LIZLLL(C2296808zG.LIZ(value), null, null, new C370940EgW(this, null), 3);
    }

    @Override // X.InterfaceC370850EgN
    public final void LIZ(C370820EgK c370820EgK, Bitmap bitmap) {
        List listLLIIII;
        this.LLILZ.LIZIZ(c370820EgK, bitmap);
        LJI(c370820EgK, bitmap);
        synchronized (this.LLILZIL) {
            try {
                listLLIIII = C13LP.LLIIII(this.LLILZIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C354270Duj.LIZJ(0L, new AwS406S0200000_5(listLLIIII, (List<? extends InterfaceC371030Egf>) c370820EgK, (C370820EgK) 161));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit LIZJ(boolean r11, X.InterfaceC1364105Vn r12) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370920EgU.LIZJ(boolean, X.05Vn):kotlin.Unit");
    }

    public final Bitmap LIZLLL(int i, String str) {
        boolean z;
        C371040Egg c371040Egg;
        String strLJ = LJ(str);
        if (strLJ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        C370820EgK c370820EgK = new C370820EgK(str, i, strLJ);
        C370950EgX c370950EgX = this.LLILZ;
        synchronized (c370950EgX.LIZ) {
            try {
                c371040Egg = c370950EgX.LIZ.get(c370820EgK);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C371040Egg c371040Egg2 = c371040Egg;
        if (c371040Egg2 == null) {
            return null;
        }
        return c371040Egg2.LIZIZ;
    }

    public final void LJI(C370820EgK c370820EgK, Bitmap bitmap) {
        C23250099c.LIZLLL(this, this.LLJILJIL, null, new C1440205kO(new AwS122S1200000_5(C371390EhF.LIZIZ(c370820EgK.LIZIZ, c370820EgK.LIZJ), c370820EgK, bitmap, 7), null), 2);
    }
}
