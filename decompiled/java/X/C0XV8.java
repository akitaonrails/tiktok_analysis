package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0XV8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XV8 {
    public static void LIZ() {
        Iterator<C0XVA> it2 = C0NPK.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL();
        }
    }

    public static void LIZIZ() {
        Iterator<C0XVA> it2 = C0NPK.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onStart();
        }
    }

    public static void LIZJ(Bundle bundle) {
        if (!C0NPK.LIZIZ.isEmpty()) {
            ((C0XV9) ListProtector.remove(C0NPK.LIZIZ, 0)).LIZ(bundle);
        } else {
            LIZ();
        }
    }
}
