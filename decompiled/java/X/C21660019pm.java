package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19pm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21660019pm {
    public final String LIZ;
    public final String LIZIZ;
    public final Bundle LIZJ;
    public final Class<? extends Fragment> LIZLLL;
    public final C21659719pj LJ;
    public final C21698919w3 LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21660019pm)) {
            return false;
        }
        C21660019pm c21660019pm = (C21660019pm) obj;
        return Intrinsics.LJFF(this.LIZ, c21660019pm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c21660019pm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c21660019pm.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c21660019pm.LIZLLL) && Intrinsics.LJFF(this.LJ, c21660019pm.LJ) && Intrinsics.LJFF(this.LJFF, c21660019pm.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Class<? extends Fragment> cls = this.LIZLLL;
        int iHashCode2 = (iHashCode + (cls == null ? 0 : cls.hashCode())) * 31;
        C21659719pj c21659719pj = this.LJ;
        int iHashCode3 = (iHashCode2 + (c21659719pj == null ? 0 : c21659719pj.hashCode())) * 31;
        C21698919w3 c21698919w3 = this.LJFF;
        return iHashCode3 + (c21698919w3 != null ? c21698919w3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlexibleLandingPageOpenRequest(componentKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetSchema=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", args=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", contentFragmentClz=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sheetConfig=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mobParams=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("componentKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",targetSchema=");
        try {
            c098200Yq = C21660119pn.LIZIZ(UriProtector.parse(this.LIZIZ));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = "invalid_route";
        }
        sbLIZ.append((String) c098200Yq);
        sbLIZ.append(",contentFragment=");
        Class<? extends Fragment> cls = this.LIZLLL;
        sbLIZ.append(cls != null ? cls.getSimpleName() : null);
        sbLIZ.append(",variant=");
        C21659719pj c21659719pj = this.LJ;
        sbLIZ.append(c21659719pj != null ? c21659719pj.variant : null);
        sbLIZ.append(",useFlexPanel=");
        C21659719pj c21659719pj2 = this.LJ;
        sbLIZ.append(c21659719pj2 != null ? c21659719pj2.useFlexPanel : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21660019pm(String str, String str2, Bundle bundle, Class<? extends Fragment> cls, C21659719pj c21659719pj, C21698919w3 c21698919w3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = bundle;
        this.LIZLLL = cls;
        this.LJ = c21659719pj;
        this.LJFF = c21698919w3;
    }
}
