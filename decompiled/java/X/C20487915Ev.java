package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveMatchThemeConfigSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20487915Ev {
    public final C20486515Eh LIZ;
    public final C20486515Eh LIZIZ;
    public final String LIZJ;
    public final EnumC994560bzK LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20487915Ev)) {
            return false;
        }
        C20487915Ev c20487915Ev = (C20487915Ev) obj;
        return Intrinsics.LJFF(this.LIZ, c20487915Ev.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20487915Ev.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20487915Ev.LIZJ) && this.LIZLLL == c20487915Ev.LIZLLL && this.LJ == c20487915Ev.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C20486515Eh c20486515Eh = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c20486515Eh == null ? 0 : c20486515Eh.hashCode())) * 31;
        String str = this.LIZJ;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountdownTitleBarResource(leftImageSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rightImageSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", jumpSchema=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fallbackJumpTarget=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZIZ() {
        return LiveMatchThemeConfigSetting.INSTANCE.isConfiguredTheme(Integer.valueOf(this.LJ));
    }

    public C20487915Ev(C20486515Eh c20486515Eh, C20486515Eh c20486515Eh2, String str, EnumC994560bzK enumC994560bzK, int i) {
        this.LIZ = c20486515Eh;
        this.LIZIZ = c20486515Eh2;
        this.LIZJ = str;
        this.LIZLLL = enumC994560bzK;
        this.LJ = i;
    }

    public static C20487915Ev LIZ(C20487915Ev c20487915Ev, C20486515Eh c20486515Eh, C20486515Eh c20486515Eh2, String str, int i, int i2) {
        EnumC994560bzK enumC994560bzK;
        int i3 = i;
        String str2 = str;
        C20486515Eh c20486515Eh3 = c20486515Eh2;
        C20486515Eh c20486515Eh4 = c20486515Eh;
        if ((i2 & 1) != 0) {
            c20486515Eh4 = c20487915Ev.LIZ;
        }
        if ((i2 & 2) != 0) {
            c20486515Eh3 = c20487915Ev.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            str2 = c20487915Ev.LIZJ;
        }
        if ((i2 & 8) != 0) {
            enumC994560bzK = c20487915Ev.LIZLLL;
        } else {
            enumC994560bzK = null;
        }
        if ((i2 & 16) != 0) {
            i3 = c20487915Ev.LJ;
        }
        return new C20487915Ev(c20486515Eh4, c20486515Eh3, str2, enumC994560bzK, i3);
    }
}
