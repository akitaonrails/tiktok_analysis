package X;

import android.view.View;
import com.bytedance.ies.sdk.widgets.ElementSpec;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImpl;
import com.bytedance.ies.sdk.widgets.PlaceholderElementSpec;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eC5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1079350eC5 {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;
    public static final int LJI;
    public static final int LJII;
    public static final int LJIIIIZZ;
    public static final int LJIIIZ;
    public static final List<Integer> LJIIJ;
    public static final int LJIIJJI;
    public static final int LJIIL;

    static {
        int iGenerateViewId = View.generateViewId();
        LIZ = iGenerateViewId;
        int iGenerateViewId2 = View.generateViewId();
        LIZIZ = iGenerateViewId2;
        LIZJ = View.generateViewId();
        LIZLLL = View.generateViewId();
        LJ = View.generateViewId();
        LJFF = View.generateViewId();
        LJI = View.generateViewId();
        int iGenerateViewId3 = View.generateViewId();
        LJII = iGenerateViewId3;
        LJIIIIZZ = View.generateViewId();
        LJIIIZ = View.generateViewId();
        LJIIJ = C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZ), Integer.valueOf(iGenerateViewId), Integer.valueOf(iGenerateViewId3), Integer.valueOf(iGenerateViewId2));
        LJIIJJI = View.generateViewId();
        LJIIL = View.generateViewId();
    }

    public static final void LIZ(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, int i, Function1<? super GroupableElementSpecImpl, Unit> function1) {
        ElementSpec elementSpec;
        if (multiElementSpecImpl.enableWidgetPlaceholderOpt(i)) {
            PlaceholderElementSpec placeholderElementSpec = new PlaceholderElementSpec(i, LJIIJ);
            placeholderElementSpec.setOnInit(function1);
            elementSpec = placeholderElementSpec;
        } else {
            C1079330eC3 c1079330eC3 = new C1079330eC3(i);
            elementSpec = c1079330eC3;
            if (function1 != null) {
                function1.invoke(c1079330eC3);
                elementSpec = c1079330eC3;
            }
        }
        multiElementSpecImpl.registerElement(elementSpec);
    }
}
