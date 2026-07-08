package X;

import com.bytedance.goda.model.dto.GodaCardData;
import com.bytedance.goda.model.dto.GodaContainer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04CW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04CW {
    public final String LIZ;
    public final GodaCardData LIZIZ;
    public final GodaContainer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04CW)) {
            return false;
        }
        C04CW c04cw = (C04CW) obj;
        return Intrinsics.LJFF(this.LIZ, c04cw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c04cw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c04cw.LIZJ);
    }

    public C04CW(String str, GodaCardData godaCardData, GodaContainer godaContainer) {
        this.LIZ = str;
        this.LIZIZ = godaCardData;
        this.LIZJ = godaContainer;
    }
}
