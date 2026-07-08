package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aHD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928770aHD {
    public final List<LinkPlayerInfo> LIZ;
    public final Object LIZIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C928770aHD)) {
            return false;
        }
        C928770aHD c928770aHD = (C928770aHD) obj;
        return Intrinsics.LJFF(this.LIZ, c928770aHD.LIZ) && Intrinsics.LJFF(this.LIZIZ, c928770aHD.LIZIZ);
    }

    public C928770aHD(List list) {
        this.LIZ = list;
    }
}
