package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690160R5i {
    public static final List<Integer> LIZ;
    public static final List<Integer> LIZIZ;

    static {
        Integer numValueOf = Integer.valueOf(R.id.c26);
        LIZ = C1697810uHb.LJIIJJI(Integer.valueOf(R.id.yeg), numValueOf);
        LIZIZ = C1697810uHb.LJIIJJI(numValueOf, Integer.valueOf(R.id.ci1), Integer.valueOf(R.id.kvd));
    }

    public static final void LIZ(ViewGroup viewGroup) {
        LIZIZ(viewGroup, new C690170R5j());
    }

    public static void LIZIZ(ViewGroup viewGroup, Function1 function1) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!LIZ.contains(Integer.valueOf(childAt.getId()))) {
                if (!LIZJ(viewGroup, function1)) {
                    function1.invoke(childAt);
                }
            } else if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                int childCount2 = viewGroup2.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = viewGroup2.getChildAt(i2);
                    if (!LIZ.contains(Integer.valueOf(childAt2.getId()))) {
                        if (!LIZJ(childAt2, function1)) {
                            function1.invoke(childAt2);
                        }
                    } else if (!Intrinsics.LJFF(childAt2.getTag(C700100RdA.LJIIL), Boolean.TRUE) && !LIZJ(childAt2, function1)) {
                        function1.invoke(childAt2);
                    }
                }
            }
        }
    }

    public static boolean LIZJ(View view, Function1 function1) {
        if (!C1834107Gh.LIZ() || view.getId() != R.id.kvd) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                function1.invoke(viewGroup.getChildAt(i));
            }
            return true;
        }
        return true;
    }
}
