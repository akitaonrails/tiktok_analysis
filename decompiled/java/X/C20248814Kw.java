package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.14Kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20248814Kw {
    public C1208900hZ2 LIZIZ;
    public C1046190dKb LIZJ;
    public C20248714Kv LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public Function0<Float> LJII;
    public Function1<? super View, Boolean> LJIIJ;
    public Function0<String> LIZ = AFwS219S0000000_30.get$arr$(276);
    public float LJI = 0.5f;
    public int LJIIIIZZ = 500;
    public EnumC2211841BhW LJIIIZ = EnumC2211841BhW.NORMAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.14Kv] */
    public final void LIZ(final Function1<? super Long, Unit> function1) {
        this.LIZLLL = new InterfaceC2211921Bhe() { // from class: X.14Kv
            @Override // X.InterfaceC2211921Bhe
            public final void LIZ(long j) {
                function1.invoke(Long.valueOf(j));
            }
        };
    }

    public final void LIZIZ(Function2<? super View, ? super String, Unit> function2) {
        this.LIZIZ = new C1208900hZ2(function2, 6);
    }

    public static void LIZJ(C20248814Kw c20248814Kw, boolean z, boolean z2, float f, int i, EnumC2211841BhW enumC2211841BhW, Function1 function1, AwS550S0100000_6 awS550S0100000_6, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            f = 0.5f;
        }
        if ((i2 & 8) != 0) {
            i = 500;
        }
        if ((i2 & 16) != 0) {
            enumC2211841BhW = EnumC2211841BhW.NORMAL;
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        if ((i2 & 64) != 0) {
            awS550S0100000_6 = null;
        }
        c20248814Kw.LJ = z;
        c20248814Kw.LJFF = z2;
        c20248814Kw.LJI = f;
        c20248814Kw.LJIIIIZZ = i;
        c20248814Kw.LJIIIZ = enumC2211841BhW;
        c20248814Kw.LJIIJ = function1;
        c20248814Kw.LJII = awS550S0100000_6;
    }
}
