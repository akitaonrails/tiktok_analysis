package X;

import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS104S1000000_20;
import kotlin.jvm.internal.AwS564S0100000_20;

/* JADX INFO: renamed from: X.0kTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321070kTx implements InterfaceC1321160kU6 {
    public final Context LL;
    public boolean LLILLJJLI;
    public final C1320980kTo<C1331070kk5> LLILLL;
    public final C1320120kSQ LLILZ;
    public final C1325540kbA LLILZIL;
    public C1323050kX9<AbstractC1327750kej> LLILZLL;
    public C1321180kU8 LLIZ;
    public Uri LLIZLLLIL;
    public Object LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL = true;
    public boolean LLJILJILJ;
    public InterfaceC1321130kU3 LLJILLL;
    public InterfaceC1321110kU1 LLJJ;
    public Object LLJJI;
    public final C01GW LLJJIII;

    public final void LJI() {
        LJIIIIZZ(true);
        LIZLLL(this.LLIZLLLIL);
    }

    public final void LJII() {
        LJIIIIZZ(false);
        C1320980kTo<C1331070kk5> c1320980kTo = this.LLILLL;
        if (c1320980kTo != null) {
            c1320980kTo.LIZIZ = false;
            if (c1320980kTo.LIZ) {
                c1320980kTo.LIZ = false;
                C1321060kTw.LJ(new ARunnableS120S0100000_20(c1320980kTo, 403));
            }
        }
        LIZJ(true);
    }

    @Override // X.InterfaceC1321160kU6
    public final void onDraw() {
    }

    public final C1321120kU2 LJ() {
        C1331070kk5 c1331070kk5;
        C1320980kTo<C1331070kk5> c1320980kTo = this.LLILLL;
        if (c1320980kTo == null || (c1331070kk5 = (C1331070kk5) c1320980kTo.LIZ()) == null) {
            return null;
        }
        return c1331070kk5.LJ;
    }

    public final C1331070kk5 LJFF() {
        C1320980kTo<C1331070kk5> c1320980kTo = this.LLILLL;
        if (c1320980kTo != null) {
            return (C1331070kk5) c1320980kTo.LIZ();
        }
        return null;
    }

    public final String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        c1320100kSOLIZIZ.LIZIZ(String.valueOf(this.LLILLL), "holder");
        return c1320100kSOLIZIZ.toString();
    }

    public C1321070kTx(Context context) {
        boolean z;
        this.LL = context;
        if (!C1321060kTw.LIZ) {
            if (context.getApplicationInfo().targetSdkVersion < 24) {
                z = true;
            } else {
                z = false;
            }
            C1321060kTw.LIZIZ = z;
            C1321060kTw.LIZ = true;
        }
        Class<?> cls = C1322200kVm.LIZ;
        C1328130kfL c1328130kfLLJIILIIL = C1328130kfL.LJIILIIL();
        this.LLILZIL = c1328130kfLLJIILIIL.LJIIL();
        this.LLILZ = new C1320120kSQ(context.getResources(), c1328130kfLLJIILIIL.LIZIZ(context));
        C1331070kk5 c1331070kk5LIZ = C1335990ks1.LIZLLL(context, null).LIZ();
        this.LLILLL = new C1320980kTo<>(c1331070kk5LIZ);
        C1321120kU2 c1321120kU2 = c1331070kk5LIZ.LJ;
        if (c1321120kU2 instanceof InterfaceC1320910kTh) {
            c1321120kU2.LLILZLL = this;
        }
        this.LLIZ = new C1321180kU8();
        this.LLJJIII = C452501pT.LIZIZ(new AwS564S0100000_20(this, 54));
    }

    @Override // X.InterfaceC1321160kU6
    public final void LIZ(boolean z) {
        if (this.LLJILJIL == z) {
            return;
        }
        this.LLJILJIL = z;
        if (z) {
            LJIIIZ(true, false, null);
            LIZLLL(this.LLIZLLLIL);
            return;
        }
        C1320980kTo<C1331070kk5> c1320980kTo = this.LLILLL;
        if (c1320980kTo != null) {
            c1320980kTo.LIZIZ = false;
            if (c1320980kTo.LIZ) {
                c1320980kTo.LIZ = false;
                C1321060kTw.LJ(new ARunnableS120S0100000_20(c1320980kTo, 403));
            }
        }
        LIZJ(true);
        LJIIIZ(false, false, null);
    }

    public final void LIZIZ(String str) {
        Uri uri = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    uri = UriProtector.parse(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1325860kbg.LIZIZ(th, new AwS104S1000000_20(str, 5), C2097608Jq.LJ());
            }
        }
        LJIIIZ(true, false, null);
        this.LLIZLLLIL = uri;
        LIZLLL(uri);
    }

    public final void LIZJ(boolean z) {
        C1331070kk5 c1331070kk5LJFF;
        if (z && (c1331070kk5LJFF = LJFF()) != null) {
            c1331070kk5LJFF.reset();
        }
        C1325860kbg.LIZ();
        C1323050kX9<AbstractC1327750kej> c1323050kX9 = this.LLILZLL;
        if (c1323050kX9 != null) {
            C1323050kX9.LJII(c1323050kX9);
            this.LLILZLL = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.net.Uri r10) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1321070kTx.LIZLLL(android.net.Uri):void");
    }

    public final void LJIIIIZZ(boolean z) {
        if (this.LLJIJIL == z) {
            return;
        }
        this.LLJIJIL = z;
        if (z) {
            C1320980kTo<C1331070kk5> c1320980kTo = this.LLILLL;
            if (c1320980kTo != null) {
                c1320980kTo.LIZIZ = true;
                c1320980kTo.LIZ = true;
            }
            LJIIIZ(true, false, null);
            return;
        }
        this.LLJILJILJ = false;
        LJIIIZ(false, true, null);
    }

    public final void LJIIJJI(Drawable drawable, C1323050kX9 c1323050kX9) {
        C1331070kk5 c1331070kk5LJFF;
        if (drawable != null && (c1331070kk5LJFF = LJFF()) != null) {
            c1331070kk5LJFF.LJFF(drawable, 1.0f, true);
        }
        C1325860kbg.LIZ();
        C1323050kX9<AbstractC1327750kej> c1323050kX92 = this.LLILZLL;
        if (c1323050kX92 != null) {
            C1323050kX9.LJII(c1323050kX92);
            this.LLILZLL = null;
        }
        this.LLILZLL = c1323050kX9;
    }

    public final void LJIIIZ(boolean z, boolean z2, C1321180kU8 c1321180kU8) {
        if (this.LLJI == z) {
            return;
        }
        this.LLJI = z;
        if (!z && z2) {
            C1325860kbg.LIZ();
            C1321180kU8 c1321180kU82 = this.LLIZ;
            c1321180kU82.getClass();
            C1325860kbg.LIZ();
            c1321180kU82.LIZ = true;
            if (c1321180kU8 == null) {
                c1321180kU8 = new C1321180kU8();
            }
            this.LLIZ = c1321180kU8;
        }
    }
}
