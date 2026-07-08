package X;

import android.app.Activity;
import com.bytedance.hybrid.spark.page.SparkActivity;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1Bqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217641Bqs {
    public final CopyOnWriteArrayList<InterfaceC2217701Bqy> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(Activity activity, Function2 function2) {
        if ((activity instanceof SparkActivity) && activity != null) {
            Iterator<InterfaceC2217701Bqy> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                function2.invoke(it2.next(), activity);
            }
        }
    }
}
