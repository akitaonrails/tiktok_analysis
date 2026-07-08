package X;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Set;

/* JADX INFO: renamed from: X.09jt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2456309jt {
    public static volatile Boolean LIZ;
    public static boolean LIZIZ;

    public static boolean LIZIZ() {
        Boolean boolValueOf = LIZ;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(LIZ());
            LIZ = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean LIZ() {
        Set<String> categories;
        Intent intentLIZ = C086T.LIZ();
        return intentLIZ != null && (categories = intentLIZ.getCategories()) != null && categories.size() == 1 && "android.intent.action.MAIN".equals(intentLIZ.getAction()) && categories.contains("android.intent.category.LAUNCHER");
    }

    public static boolean LIZJ() {
        Intent intentLIZ;
        ComponentName component;
        Intent intentLIZ2 = C086T.LIZ();
        boolean zEquals = (intentLIZ2 == null || (component = intentLIZ2.getComponent()) == null) ? false : component.getShortClassName().equals("com.google.firebase.iid.FirebaseInstanceIdReceiver");
        return LIZIZ ? zEquals || !((intentLIZ = C086T.LIZ()) == null || intentLIZ.getAction() == null || intentLIZ.getComponent() == null || !intentLIZ.getAction().equals("com.google.firebase.MESSAGING_EVENT") || !intentLIZ.getComponent().getShortClassName().equals("com.fcm.service.SSGcmListenerService")) : zEquals;
    }
}
