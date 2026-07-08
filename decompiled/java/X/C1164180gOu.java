package X;

import com.ss.android.ugc.aweme.slash.component.navigation.QuickNavBarModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164180gOu implements InterfaceC0148002o {
    public final QuickNavBarModule LL;
    public final C291001Au<C1180620gpQ> LLILLJJLI;

    public C1164180gOu() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1164180gOu)) {
            return false;
        }
        C1164180gOu c1164180gOu = (C1164180gOu) obj;
        return Intrinsics.LJFF(this.LL, c1164180gOu.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1164180gOu.LLILLJJLI);
    }

    public final int hashCode() {
        QuickNavBarModule quickNavBarModule = this.LL;
        int iHashCode = (quickNavBarModule == null ? 0 : quickNavBarModule.hashCode()) * 31;
        C291001Au<C1180620gpQ> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickNavigationState(navigationData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", componentsResponse=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1164180gOu(QuickNavBarModule quickNavBarModule, C291001Au<C1180620gpQ> c291001Au) {
        this.LL = quickNavBarModule;
        this.LLILLJJLI = c291001Au;
    }
}
