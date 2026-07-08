package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591980rWu {
    public static final /* synthetic */ int LJIIJ = 0;
    public int LIZ = -1;
    public View LIZIZ;
    public C1592450rXf LIZJ;
    public C1592080rX4 LIZLLL;
    public Object LJ;
    public InterfaceC1583870rJp LJFF;
    public C1591990rWv LJI;
    public Drawable LJII;
    public Drawable LJIIIIZZ;
    public C592330NLb LJIIIZ;

    public final boolean LIZ() {
        return this.LJIIIZ == null;
    }

    public final String LIZIZ() {
        Object obj = this.LJ;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final void LIZJ(Function1<? super C1592080rX4, Unit> function1) {
        C1592080rX4 c1592080rX4 = this.LIZLLL;
        if (c1592080rX4 != null) {
            function1.invoke(c1592080rX4);
        }
    }
}
