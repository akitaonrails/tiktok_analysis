package X;

import android.os.Bundle;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08RR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08RR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Bundle bundle) {
        Object obj;
        String name;
        Iterator<T> it2 = bundle.keySet().iterator();
        while (it2.hasNext()) {
            String name2 = null;
            try {
                obj = bundle.get((String) it2.next());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (obj == null) {
                name = null;
            } else {
                name = obj.getClass().getName();
            }
            if (!Intrinsics.LJFF(name, "androidx.fragment.app.FragmentManagerState")) {
                if (obj != null) {
                    name2 = obj.getClass().getName();
                }
                if (Intrinsics.LJFF(name2, "android.app.FragmentManagerState")) {
                }
            }
            for (Object obj2 : (Object[]) Reflect.on(obj).field("mActive", new Class[0]).get()) {
                Bundle bundle2 = (Bundle) Reflect.on(obj2).field("mSavedFragmentState", new Class[0]).get();
                if (bundle2 != null) {
                    bundle2.remove("android:view_state");
                }
            }
        }
    }
}
