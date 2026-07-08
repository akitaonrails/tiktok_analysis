package X;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0H6M, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public abstract class C0H6M {
    public int LIZ;
    public int LIZIZ;
    public final boolean LIZJ = true;
    public Function0<Unit> LIZLLL;
    public Function0<Unit> LJ;

    public abstract String LIZIZ();

    public abstract Integer LIZJ();

    public abstract C0H7H LIZLLL();

    public abstract C0HGY LJ();

    public boolean LJFF() {
        return false;
    }

    public List<Pair<int[], PropertyValuesHolder[]>> LJI() {
        return null;
    }

    public abstract void LJII(Canvas canvas);

    public abstract Object LJIIJ(InterfaceC1364105Vn<? super Pair<C0HOC, ? extends EnumC440340HOm>> interfaceC1364105Vn);

    public final void LJIIIZ() {
        Function0<Unit> function0 = this.LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public boolean LIZ() {
        return this.LIZJ;
    }

    public void LJIIIIZZ(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
