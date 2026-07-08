package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: renamed from: X.0GhU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422500GhU {
    public static final List LIZ(View view, AFwS236S0000000_6 aFwS236S0000000_6) {
        ArrayList arrayList = new ArrayList();
        if (view == null) {
            return arrayList;
        }
        if (((Boolean) aFwS236S0000000_6.invoke(view)).booleanValue()) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it2 = new C09RD((ViewGroup) view).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                }
                List listLIZ = LIZ((View) c09re.next(), aFwS236S0000000_6);
                if ((!((ArrayList) listLIZ).isEmpty()) && listLIZ != null) {
                    arrayList.addAll(listLIZ);
                }
            }
        }
        return arrayList;
    }
}
