package X;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C620540OVo implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<String> LLILLJJLI;
    public final C291001Au<KeyEvent> LLILLL;
    public final C291001Au<String> LLILZ;
    public final C291001Au<Unit> LLILZIL;
    public final boolean LLILZLL;
    public final String LLIZ;

    public C620540OVo() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C620540OVo)) {
            return false;
        }
        C620540OVo c620540OVo = (C620540OVo) obj;
        return Intrinsics.LJFF(this.LL, c620540OVo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c620540OVo.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c620540OVo.LLILLL) && Intrinsics.LJFF(this.LLILZ, c620540OVo.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c620540OVo.LLILZIL) && this.LLILZLL == c620540OVo.LLILZLL && Intrinsics.LJFF(this.LLIZ, c620540OVo.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        String str = this.LLIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinTextEditState(focusEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", addEmojiEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", deleteEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", publishEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", draftSaveEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", canPublish=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", previewLink=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C620540OVo(int i) {
        this(new C291001Au(Boolean.FALSE), new C291001Au(null), new C291001Au(null), new C291001Au(null), new C291001Au(null), null, false);
    }

    public C620540OVo(C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, String str, boolean z) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
        this.LLILZLL = z;
        this.LLIZ = str;
    }

    public static C620540OVo LIZ(C620540OVo c620540OVo, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, boolean z, String str, int i) {
        String str2 = str;
        boolean z2 = z;
        C291001Au c291001Au6 = c291001Au5;
        C291001Au c291001Au7 = c291001Au4;
        C291001Au c291001Au8 = c291001Au3;
        C291001Au c291001Au9 = c291001Au2;
        C291001Au c291001Au10 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au10 = c620540OVo.LL;
        }
        if ((i & 2) != 0) {
            c291001Au9 = c620540OVo.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au8 = c620540OVo.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au7 = c620540OVo.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au6 = c620540OVo.LLILZIL;
        }
        if ((i & 32) != 0) {
            z2 = c620540OVo.LLILZLL;
        }
        if ((i & 64) != 0) {
            str2 = c620540OVo.LLIZ;
        }
        c620540OVo.getClass();
        return new C620540OVo(c291001Au10, c291001Au9, c291001Au8, c291001Au7, c291001Au6, str2, z2);
    }
}
