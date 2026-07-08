package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PSJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C0PSJ implements Serializable {
    public final C0PRW fragmentData;
    public final C0PS4 globalData;

    public C0PSJ() {
        this(new C0PRW(0, null, null, null, null, null, null, null, false, null, false, null, 4095, null), new C0PS4(-1, 0, "", new LinkedHashMap(), "", "", ""));
    }

    public final C0PSJ copy(C0PRW c0prw, C0PS4 c0ps4) {
        return new C0PSJ(c0prw, c0ps4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PSJ)) {
            return false;
        }
        C0PSJ c0psj = (C0PSJ) obj;
        return Intrinsics.LJFF(this.fragmentData, c0psj.fragmentData) && Intrinsics.LJFF(this.globalData, c0psj.globalData);
    }

    public int hashCode() {
        return (this.fragmentData.hashCode() * 31) + this.globalData.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchMutableData(fragmentData=");
        sbLIZ.append(this.fragmentData);
        sbLIZ.append(", globalData=");
        sbLIZ.append(this.globalData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C0PSJ refreshFragmentData(C0PRW c0prw) {
        return copy(c0prw, this.globalData);
    }

    public C0PSJ(C0PRW c0prw, C0PS4 c0ps4) {
        this.fragmentData = c0prw;
        this.globalData = c0ps4;
    }
}
