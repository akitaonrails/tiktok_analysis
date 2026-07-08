package X;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Jr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1588106Jr implements InterfaceC0148002o {
    public final C0OOW LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<String> LLILLL;
    public final C291001Au<KeyEvent> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final C291001Au<Boolean> LLIZ;

    public C1588106Jr() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1588106Jr)) {
            return false;
        }
        C1588106Jr c1588106Jr = (C1588106Jr) obj;
        return Intrinsics.LJFF(this.LL, c1588106Jr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1588106Jr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1588106Jr.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1588106Jr.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1588106Jr.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1588106Jr.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1588106Jr.LLIZ);
    }

    public final int hashCode() {
        C0OOW c0oow = this.LL;
        return ((((((((((((c0oow == null ? 0 : c0oow.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPublishPanelState(publishInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", focusEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", addEmojiEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", deleteEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", publishEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", visibilityEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", clearSelectedItemEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1588106Jr(int i) {
        Boolean bool = Boolean.FALSE;
        this(null, new C291001Au(bool), new C291001Au(null), new C291001Au(null), new C291001Au(bool), new C291001Au(null), new C291001Au(bool));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1588106Jr(C0OOW c0oow, C291001Au<Boolean> c291001Au, C291001Au<String> c291001Au2, C291001Au<? extends KeyEvent> c291001Au3, C291001Au<Boolean> c291001Au4, C291001Au<Boolean> c291001Au5, C291001Au<Boolean> c291001Au6) {
        this.LL = c0oow;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
        this.LLILZLL = c291001Au5;
        this.LLIZ = c291001Au6;
    }

    public static C1588106Jr LIZ(C1588106Jr c1588106Jr, C0OOW c0oow, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, int i) {
        C291001Au c291001Au7 = c291001Au6;
        C291001Au c291001Au8 = c291001Au5;
        C291001Au c291001Au9 = c291001Au4;
        C291001Au c291001Au10 = c291001Au3;
        C291001Au c291001Au11 = c291001Au2;
        C291001Au c291001Au12 = c291001Au;
        C0OOW c0oow2 = c0oow;
        if ((i & 1) != 0) {
            c0oow2 = c1588106Jr.LL;
        }
        if ((i & 2) != 0) {
            c291001Au12 = c1588106Jr.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au11 = c1588106Jr.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au10 = c1588106Jr.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au9 = c1588106Jr.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au8 = c1588106Jr.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au7 = c1588106Jr.LLIZ;
        }
        c1588106Jr.getClass();
        return new C1588106Jr(c0oow2, c291001Au12, c291001Au11, c291001Au10, c291001Au9, c291001Au8, c291001Au7);
    }
}
