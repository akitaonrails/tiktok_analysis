package X;

import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fT7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128350fT7 {
    public final int LIZ;
    public final long LIZIZ;
    public final GiftColorInfo LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1128350fT7)) {
            return false;
        }
        C1128350fT7 c1128350fT7 = (C1128350fT7) obj;
        return this.LIZ == c1128350fT7.LIZ && this.LIZIZ == c1128350fT7.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1128350fT7.LIZJ) && this.LIZLLL == c1128350fT7.LIZLLL;
    }

    public static C1128350fT7 LIZ(C1128350fT7 c1128350fT7, boolean z) {
        return new C1128350fT7(c1128350fT7.LIZ, c1128350fT7.LIZIZ, c1128350fT7.LIZJ, z);
    }

    public C1128350fT7(int i, long j, GiftColorInfo giftColorInfo, boolean z) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = giftColorInfo;
        this.LIZLLL = z;
    }
}
