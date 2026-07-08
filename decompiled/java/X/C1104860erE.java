package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0erE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104860erE {
    public final String LIZ;
    public final int LIZIZ = R.drawable.est;
    public final Function1<Context, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1104860erE)) {
            return false;
        }
        C1104860erE c1104860erE = (C1104860erE) obj;
        return Intrinsics.LJFF(this.LIZ, c1104860erE.LIZ) && this.LIZIZ == c1104860erE.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1104860erE.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VirtualTicketOnboardingTipData(contentText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", leftIconRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1104860erE(String str, AwS596S0100000_17 awS596S0100000_17) {
        this.LIZ = str;
        this.LIZJ = awS596S0100000_17;
    }
}
