package X;

import android.app.Activity;
import android.view.View;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX INFO: renamed from: X.0fHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121260fHg {
    public static final C19EG LIZ(View view) {
        Object next;
        Iterator it2 = C09R4.LJ(AFwS254S0000000_17.get$arr$(90), view.getContext()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof Activity) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C19EG) next;
    }
}
