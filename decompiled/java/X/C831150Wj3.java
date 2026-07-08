package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0Wj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831150Wj3 {
    public final Map<BasePendingResult<?>, Boolean> LIZ = Collections.synchronizedMap(new WeakHashMap());
    public final Map<C835520Wq6<?>, Boolean> LIZIZ = Collections.synchronizedMap(new WeakHashMap());

    public final void LIZ(Status status, boolean z) {
        HashMap map;
        HashMap map2;
        synchronized (this.LIZ) {
            try {
                map = new HashMap(this.LIZ);
            } finally {
            }
        }
        synchronized (this.LIZIZ) {
            try {
                map2 = new HashMap(this.LIZIZ);
            } finally {
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).LJFF(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C835520Wq6) entry2.getKey()).LIZJ(new C0W4V(status));
            }
        }
    }
}
