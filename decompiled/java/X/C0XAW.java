package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS247S0000000_13;

/* JADX INFO: renamed from: X.0XAW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XAW {
    public final ConcurrentHashMap<Integer, C0XAX> LIZ = new ConcurrentHashMap<>();
    public final WeakReference<Activity> LIZIZ = new WeakReference<>(null);

    public final void LIZ(Activity activity, Fragment fragment) {
        C0XAX c0xax;
        if ((activity != null || (activity = this.LIZIZ.get()) != null) && (c0xax = this.LIZ.get(Integer.valueOf(activity.hashCode()))) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c0xax.LIZIZ != null) {
                System.currentTimeMillis();
            }
            ArrayList arrayList = new ArrayList();
            for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                ListProtector.add(arrayList, 0, parentFragment);
            }
            C13LP.LJJLIIIJ(arrayList, "#", null, null, 0, null, AFwS247S0000000_13.get$arr$(64), 30);
            C13LP.LJJLIIIJ(arrayList, "#", null, null, 0, null, AFwS247S0000000_13.get$arr$(65), 30);
            C844260XAa c844260XAa = (C844260XAa) ((ConcurrentHashMap) c0xax.LIZ).get(Integer.valueOf(fragment.hashCode()));
            if (c844260XAa == null) {
                c844260XAa = new C844260XAa("", "");
            }
            System.currentTimeMillis();
            c844260XAa.getClass();
            c0xax.LIZIZ = c844260XAa;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFragmentChanged cost time: ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
