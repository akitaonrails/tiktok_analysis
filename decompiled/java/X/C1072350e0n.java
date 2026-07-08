package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0e0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072350e0n {
    public static final InterfaceC1264610j0t LIZ(Context context, Function1<? super C1071690dzj, Unit> function1) {
        C1071690dzj c1071690dzj = new C1071690dzj(context);
        function1.invoke(c1071690dzj);
        return c1071690dzj.LIZ();
    }

    public static final InterfaceC1264610j0t LIZIZ(Fragment fragment, Function1<? super C1071690dzj, Unit> function1) {
        if (!fragment.isDetached() && fragment.getContext() != null) {
            C19EG activity = fragment.getActivity();
            if (activity != null && activity.isFinishing()) {
                return null;
            }
            C19EG activity2 = fragment.getActivity();
            if (activity2 != null && activity2.isDestroyed()) {
                return null;
            }
            C1071690dzj c1071690dzj = new C1071690dzj(fragment.requireContext());
            function1.invoke(c1071690dzj);
            return c1071690dzj.LIZ();
        }
        return null;
    }

    public static final InterfaceC1264610j0t LIZJ(EnumC1073320e2M enumC1073320e2M, Function1<? super C1071690dzj, Unit> function1) {
        C844470XAv.LIZ.getClass();
        C1071690dzj c1071690dzj = new C1071690dzj(C844470XAv.LIZ());
        c1071690dzj.LIZJ = enumC1073320e2M;
        function1.invoke(c1071690dzj);
        return c1071690dzj.LIZ();
    }
}
