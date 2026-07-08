package X;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OWY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OWY implements InterfaceC0148002o {
    public final AbstractC1623806Xk<Unit> LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<String> LLILLL;
    public final C291001Au<KeyEvent> LLILZ;
    public final C291001Au<InterfaceC456120Huc> LLILZIL;
    public final String LLILZLL;
    public final C0OTS LLIZ;
    public final C291001Au<C0OTS> LLIZLLLIL;

    public C0OWY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OWY)) {
            return false;
        }
        C0OWY c0owy = (C0OWY) obj;
        return Intrinsics.LJFF(this.LL, c0owy.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0owy.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0owy.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0owy.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0owy.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0owy.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0owy.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0owy.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Boolean> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<String> c291001Au2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<KeyEvent> c291001Au3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<InterfaceC456120Huc> c291001Au4 = this.LLILZIL;
        int iHashCode5 = (((iHashCode4 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31;
        C0OTS c0ots = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (c0ots == null ? 0 : c0ots.hashCode())) * 31;
        C291001Au<C0OTS> c291001Au5 = this.LLIZLLLIL;
        return iHashCode6 + (c291001Au5 != null ? c291001Au5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentActionState(updateCommentDiggState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", focusEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", addEmojiEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", deleteEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", panelTypeEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", currentPublishText=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", replyItem=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", rethinkEditEvent=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0OWY(int i) {
        this(C491101vh.LIZ, null, null, null, null, "", null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0OWY(AbstractC1623806Xk<Unit> abstractC1623806Xk, C291001Au<Boolean> c291001Au, C291001Au<String> c291001Au2, C291001Au<? extends KeyEvent> c291001Au3, C291001Au<? extends InterfaceC456120Huc> c291001Au4, String str, C0OTS c0ots, C291001Au<C0OTS> c291001Au5) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
        this.LLILZLL = str;
        this.LLIZ = c0ots;
        this.LLIZLLLIL = c291001Au5;
    }

    public static C0OWY LIZ(C0OWY c0owy, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, String str, C0OTS c0ots, C291001Au c291001Au5, int i) {
        C291001Au c291001Au6 = c291001Au5;
        C0OTS c0ots2 = c0ots;
        String str2 = str;
        C291001Au c291001Au7 = c291001Au4;
        C291001Au c291001Au8 = c291001Au3;
        C291001Au c291001Au9 = c291001Au2;
        C291001Au c291001Au10 = c291001Au;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk2 = c0owy.LL;
        }
        if ((i & 2) != 0) {
            c291001Au10 = c0owy.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au9 = c0owy.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au8 = c0owy.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au7 = c0owy.LLILZIL;
        }
        if ((i & 32) != 0) {
            str2 = c0owy.LLILZLL;
        }
        if ((i & 64) != 0) {
            c0ots2 = c0owy.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au6 = c0owy.LLIZLLLIL;
        }
        c0owy.getClass();
        return new C0OWY(abstractC1623806Xk2, c291001Au10, c291001Au9, c291001Au8, c291001Au7, str2, c0ots2, c291001Au6);
    }
}
