package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615110OAr implements InterfaceC0148002o {
    public final AddYoursTopic LL;
    public final float LLILLJJLI;
    public final C291001Au<Unit> LLILLL;

    public C615110OAr() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C615110OAr)) {
            return false;
        }
        C615110OAr c615110OAr = (C615110OAr) obj;
        return Intrinsics.LJFF(this.LL, c615110OAr.LL) && Float.compare(this.LLILLJJLI, c615110OAr.LLILLJJLI) == 0 && Intrinsics.LJFF(this.LLILLL, c615110OAr.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursDetailPageState(topic=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", headerHiddenPercentage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", errorEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        AddYoursTopic addYoursTopic = this.LL;
        int iHashCode = (((addYoursTopic == null ? 0 : addYoursTopic.hashCode()) * 31) + Float.floatToIntBits(this.LLILLJJLI)) * 31;
        C291001Au<Unit> c291001Au = this.LLILLL;
        return iHashCode + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public /* synthetic */ C615110OAr(int i) {
        this(null, 0.0f, null);
    }

    public C615110OAr(AddYoursTopic addYoursTopic, float f, C291001Au<Unit> c291001Au) {
        this.LL = addYoursTopic;
        this.LLILLJJLI = f;
        this.LLILLL = c291001Au;
    }

    public static C615110OAr LIZ(C615110OAr c615110OAr, AddYoursTopic addYoursTopic, float f, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            addYoursTopic = c615110OAr.LL;
        }
        if ((i & 2) != 0) {
            f = c615110OAr.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c615110OAr.LLILLL;
        }
        c615110OAr.getClass();
        return new C615110OAr(addYoursTopic, f, c291001Au);
    }
}
