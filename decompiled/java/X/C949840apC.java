package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0apC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949840apC {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final BizApplyParams LJFF;
    public final EnumC2235671Cer LJI;
    public final EnumC949920apK LJII;
    public final boolean LJIIIIZZ;
    public final Map<String, Object> LJIIIZ;

    public C949840apC() {
        this(0L, 0, 0, null, null, null, false, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C949840apC)) {
            return false;
        }
        C949840apC c949840apC = (C949840apC) obj;
        return this.LIZ == c949840apC.LIZ && this.LIZIZ == c949840apC.LIZIZ && this.LIZJ == c949840apC.LIZJ && this.LIZLLL == c949840apC.LIZLLL && this.LJ == c949840apC.LJ && Intrinsics.LJFF(this.LJFF, c949840apC.LJFF) && this.LJI == c949840apC.LJI && this.LJII == c949840apC.LJII && this.LJIIIIZZ == c949840apC.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c949840apC.LJIIIZ);
    }

    public final int hashCode() {
        int iY2 = ((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ)) * 31;
        BizApplyParams bizApplyParams = this.LJFF;
        int iHashCode = (((((((iY2 + (bizApplyParams == null ? 0 : bizApplyParams.hashCode())) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        Map<String, Object> map = this.LJIIIZ;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyParam(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", strategy=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", expireTimeInSeconds=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", bizApplyParams=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", replyStatus=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", applyIntent=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", useApplyDirectUpAbility=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", custom=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C949840apC(long j, int i, int i2, BizApplyParams bizApplyParams, EnumC2235671Cer enumC2235671Cer, EnumC949920apK enumC949920apK, boolean z, int i3) {
        j = (i3 & 1) != 0 ? -1L : j;
        long j2 = (i3 & 2) == 0 ? 0L : -1L;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        bizApplyParams = (i3 & 32) != 0 ? null : bizApplyParams;
        enumC2235671Cer = (i3 & 64) != 0 ? EnumC2235671Cer.Agree : enumC2235671Cer;
        enumC949920apK = (i3 & 128) != 0 ? EnumC949920apK.NormalApply : enumC949920apK;
        boolean z2 = (i3 & 256) == 0 ? z : false;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = 0L;
        this.LJFF = bizApplyParams;
        this.LJI = enumC2235671Cer;
        this.LJII = enumC949920apK;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = null;
    }
}
