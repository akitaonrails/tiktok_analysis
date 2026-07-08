package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0WkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C832040WkU {
    public static final Status LIZJ = new Status(8, "The connection to Google Play services was lost");
    public final Set<BasePendingResult<?>> LIZ = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public final C832300Wku LIZIZ = new C832300Wku(this);
}
