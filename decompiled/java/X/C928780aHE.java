package X;

import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aHE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928780aHE {
    public final List<ListByTypeResponse.ReservedUser> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C928780aHE) && Intrinsics.LJFF(this.LIZ, ((C928780aHE) obj).LIZ);
    }

    public C928780aHE(List<ListByTypeResponse.ReservedUser> list) {
        this.LIZ = list;
    }
}
