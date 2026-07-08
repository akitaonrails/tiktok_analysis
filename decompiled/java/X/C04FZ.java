package X;

import com.bytedance.goda.v2.model.dto.GodaV2EventGroup;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04FZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FZ {
    public final Map<String, GodaV2EventGroup> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C04FZ) && Intrinsics.LJFF(this.LIZ, ((C04FZ) obj).LIZ);
    }

    public C04FZ(Map<String, GodaV2EventGroup> map) {
        this.LIZ = map;
    }
}
