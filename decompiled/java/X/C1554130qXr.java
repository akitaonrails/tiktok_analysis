package X;

import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1554130qXr {
    public final CopyOnWriteArrayList<InterfaceC1554220qY0> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(Function2 function2, Fragment fragment) {
        if ((fragment instanceof SparkPopup) && fragment != null) {
            Iterator<InterfaceC1554220qY0> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                function2.invoke(it2.next(), fragment);
            }
        }
    }

    public final boolean LIZIZ(Function2 function2, Fragment fragment) {
        if ((fragment instanceof SparkPopup) && fragment != null) {
            Iterator<InterfaceC1554220qY0> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                if (((Boolean) function2.invoke(it2.next(), fragment)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
