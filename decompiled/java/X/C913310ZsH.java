package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0ZsH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913310ZsH {
    public static final CopyOnWriteArrayList<InterfaceC913320ZsI> LIZ = new CopyOnWriteArrayList<>();

    public static void LIZ(int i, int i2, Intent intent, Fragment fragment) {
        Iterator<InterfaceC913320ZsI> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(i, i2, intent, fragment);
        }
    }
}
