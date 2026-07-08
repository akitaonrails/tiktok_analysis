package X;

import com.bytedance.pipo.verify.base.model.StatusReason;
import com.bytedance.pipo.verify.base.model.response.AlertMsg;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714540uia {
    public final EnumC1714570uid LIZ;
    public final StatusReason LIZIZ;
    public final AlertMsg LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1714540uia)) {
            return false;
        }
        C1714540uia c1714540uia = (C1714540uia) obj;
        return this.LIZ == c1714540uia.LIZ && Intrinsics.LJFF(this.LIZIZ, c1714540uia.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1714540uia.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1714540uia.LIZLLL) && Intrinsics.LJFF(this.LJ, c1714540uia.LJ) && this.LJFF == c1714540uia.LJFF;
    }

    public C1714540uia(EnumC1714570uid enumC1714570uid, StatusReason statusReason, AlertMsg alertMsg, String str, String str2, int i) {
        this.LIZ = enumC1714570uid;
        this.LIZIZ = statusReason;
        this.LIZJ = alertMsg;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = i;
    }
}
