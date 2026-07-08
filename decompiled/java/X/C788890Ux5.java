package X;

import android.app.Activity;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0Ux5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788890Ux5 {
    public static final WeakHashMap<Activity, HashSet<String>> LIZ = new WeakHashMap<>();

    public static void LIZ(Activity activity, String str) {
        WeakHashMap<Activity, HashSet<String>> weakHashMap = LIZ;
        if (weakHashMap.get(activity) != null && weakHashMap.get(activity).contains(str)) {
            throw new IllegalArgumentException("tag duplicate, use another tag when invoke setupWithActivity for the second time in same Activity");
        }
        HashSet<String> hashSet = weakHashMap.get(activity);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            LIZ.put(activity, hashSet);
        }
        hashSet.add(str);
    }
}
