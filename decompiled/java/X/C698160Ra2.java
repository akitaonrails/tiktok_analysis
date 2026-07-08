package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ra2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698160Ra2 implements InterfaceC703750Rj3 {
    public String LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public C698170Ra3 LJ;
    public C698170Ra3 LJFF;
    public Function0<Unit> LJI;
    public Integer LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C698160Ra2)) {
            return false;
        }
        C698160Ra2 c698160Ra2 = (C698160Ra2) obj;
        return Intrinsics.LJFF(this.LIZ, c698160Ra2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c698160Ra2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c698160Ra2.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c698160Ra2.LIZLLL) && Intrinsics.LJFF(this.LJ, c698160Ra2.LJ) && Intrinsics.LJFF(this.LJFF, c698160Ra2.LJFF) && Intrinsics.LJFF(this.LJI, c698160Ra2.LJI) && Intrinsics.LJFF(this.LJII, c698160Ra2.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C698170Ra3 c698170Ra3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (c698170Ra3 == null ? 0 : c698170Ra3.hashCode())) * 31;
        C698170Ra3 c698170Ra32 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (c698170Ra32 == null ? 0 : c698170Ra32.hashCode())) * 31;
        Function0<Unit> function0 = this.LJI;
        int iHashCode6 = (iHashCode5 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Integer num = this.LJII;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnnotationElementContent(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", componentKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rawTitleFont=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rawTitleColor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rawFromIcon=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", rawBackIcon=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", clickAction=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", localIconRes=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC703750Rj3
    public final C698160Ra2 LIZ() {
        return new C698160Ra2(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII);
    }

    @Override // X.InterfaceC703750Rj3
    public final String LLLII() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC703750Rj3
    public final void LIZIZ(InterfaceC703750Rj3 interfaceC703750Rj3) {
        if (!(interfaceC703750Rj3 instanceof C698160Ra2)) {
            return;
        }
        C698160Ra2 c698160Ra2 = (C698160Ra2) interfaceC703750Rj3;
        this.LIZ = c698160Ra2.LIZ;
        this.LIZJ = c698160Ra2.LIZJ;
        this.LIZLLL = c698160Ra2.LIZLLL;
        this.LJ = c698160Ra2.LJ;
        this.LJFF = c698160Ra2.LJFF;
        this.LJI = c698160Ra2.LJI;
        this.LJII = c698160Ra2.LJII;
    }

    public final C698190Ra5 LIZJ(Context context) {
        String str;
        C698170Ra3 c698170Ra3 = this.LJFF;
        C698190Ra5 c698190Ra5LJFF = null;
        if (c698170Ra3 != null && (str = c698170Ra3.LIZ) != null) {
            try {
                c698190Ra5LJFF = C2248361CzK.LJFF(context, str);
                return c698190Ra5LJFF;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return c698190Ra5LJFF;
    }

    public /* synthetic */ C698160Ra2(String str, String str2, String str3, String str4, C698170Ra3 c698170Ra3, C698170Ra3 c698170Ra32, AwS555S0100000_11 awS555S0100000_11, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : c698170Ra3, (i & 32) != 0 ? null : c698170Ra32, (i & 64) != 0 ? null : awS555S0100000_11, (Integer) null);
    }

    public C698160Ra2(String str, String str2, String str3, String str4, C698170Ra3 c698170Ra3, C698170Ra3 c698170Ra32, Function0<Unit> function0, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = c698170Ra3;
        this.LJFF = c698170Ra32;
        this.LJI = function0;
        this.LJII = num;
    }
}
