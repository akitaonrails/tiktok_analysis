package X;

import Y.ARunnableS109S0100000_9;
import android.app.Activity;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629410OmR {
    public static final C19EG LIZ() {
        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
            if (abstractC1387200mCc.LIZ instanceof InterfaceC1603190roz) {
                Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                if (activityLIZIZ != null) {
                    return C1388190mED.LIZIZ(activityLIZIZ);
                }
                return null;
            }
        }
        return null;
    }

    public static final void LIZIZ(Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS109S0100000_9(function0, 147));
        }
    }

    public static final void LIZJ(Fragment fragment, ViewGroup viewGroup, List<? extends C13IQ<? extends AbstractC738140SxQ>> list) {
        C339190DRl.LIZIZ(viewGroup);
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        Iterator<? extends C13IQ<? extends AbstractC738140SxQ>> it2 = list.iterator();
        while (it2.hasNext()) {
            C723850SaN.LJIIIIZZ(fragment, it2.next());
        }
    }
}
