package X;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454050HrH implements InterfaceC0148002o {
    public final C291001Au<KeyEvent> LL;
    public final C291001Au<String> LLILLJJLI;
    public final C291001Au<C454040HrG> LLILLL;
    public final C291001Au<Integer> LLILZ;
    public final C291001Au<C454010HrD> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final C291001Au<C454060HrI> LLIZ;
    public final C291001Au<Boolean> LLIZLLLIL;

    public C454050HrH() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C454050HrH)) {
            return false;
        }
        C454050HrH c454050HrH = (C454050HrH) obj;
        return Intrinsics.LJFF(this.LL, c454050HrH.LL) && Intrinsics.LJFF(this.LLILLJJLI, c454050HrH.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c454050HrH.LLILLL) && Intrinsics.LJFF(this.LLILZ, c454050HrH.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c454050HrH.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c454050HrH.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c454050HrH.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c454050HrH.LLIZLLLIL);
    }

    public final int hashCode() {
        C291001Au<KeyEvent> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<String> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<C454040HrG> c291001Au3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Integer> c291001Au4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<C454010HrD> c291001Au5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<Boolean> c291001Au6 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31;
        C291001Au<C454060HrI> c291001Au7 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (c291001Au7 == null ? 0 : c291001Au7.hashCode())) * 31;
        C291001Au<Boolean> c291001Au8 = this.LLIZLLLIL;
        return iHashCode7 + (c291001Au8 != null ? c291001Au8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerPanelViewModelState(dispatchKeyEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sendSystemEmojiEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sendThirdPartyStickerEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", refreshPageEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", sendStoreStickerEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", searchStickerPanelChangeEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", sendStickerParam=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", suppressPanelSwitchEvent=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C454050HrH(int i) {
        this(null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C454050HrH(C291001Au<? extends KeyEvent> c291001Au, C291001Au<String> c291001Au2, C291001Au<C454040HrG> c291001Au3, C291001Au<Integer> c291001Au4, C291001Au<C454010HrD> c291001Au5, C291001Au<Boolean> c291001Au6, C291001Au<C454060HrI> c291001Au7, C291001Au<Boolean> c291001Au8) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
        this.LLILZLL = c291001Au6;
        this.LLIZ = c291001Au7;
        this.LLIZLLLIL = c291001Au8;
    }

    public static C454050HrH LIZ(C454050HrH c454050HrH, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, int i) {
        C291001Au<C454040HrG> c291001Au8;
        C291001Au c291001Au9 = c291001Au7;
        C291001Au c291001Au10 = c291001Au6;
        C291001Au c291001Au11 = c291001Au5;
        C291001Au c291001Au12 = c291001Au4;
        C291001Au c291001Au13 = c291001Au3;
        C291001Au c291001Au14 = c291001Au2;
        C291001Au c291001Au15 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au15 = c454050HrH.LL;
        }
        if ((i & 2) != 0) {
            c291001Au14 = c454050HrH.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au8 = c454050HrH.LLILLL;
        } else {
            c291001Au8 = null;
        }
        if ((i & 8) != 0) {
            c291001Au13 = c454050HrH.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au12 = c454050HrH.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au11 = c454050HrH.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au10 = c454050HrH.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au9 = c454050HrH.LLIZLLLIL;
        }
        c454050HrH.getClass();
        return new C454050HrH(c291001Au15, c291001Au14, c291001Au8, c291001Au13, c291001Au12, c291001Au11, c291001Au10, c291001Au9);
    }
}
