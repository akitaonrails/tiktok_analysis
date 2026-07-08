package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JC4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JC4 implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<String> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<User> LLILZIL;
    public final float LLILZLL;

    public C0JC4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JC4)) {
            return false;
        }
        C0JC4 c0jc4 = (C0JC4) obj;
        return Intrinsics.LJFF(this.LL, c0jc4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0jc4.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0jc4.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0jc4.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0jc4.LLILZIL) && Float.compare(this.LLILZLL, c0jc4.LLILZLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorVMState(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", query=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", inMentionMode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showMentionLoading=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", mentionPeople=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", inputContainerTranslationY=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<String> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<User> c291001Au4 = this.LLILZIL;
        return ((iHashCode4 + (c291001Au4 != null ? c291001Au4.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LLILZLL);
    }

    public /* synthetic */ C0JC4(int i) {
        this("", null, null, null, null, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0JC4(String str, C291001Au<String> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Boolean> c291001Au3, C291001Au<? extends User> c291001Au4, float f) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
        this.LLILZLL = f;
    }

    public static C0JC4 LIZ(C0JC4 c0jc4, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, float f, int i) {
        String str;
        float f2 = f;
        C291001Au c291001Au5 = c291001Au4;
        C291001Au c291001Au6 = c291001Au3;
        C291001Au c291001Au7 = c291001Au2;
        C291001Au c291001Au8 = c291001Au;
        if ((i & 1) != 0) {
            str = c0jc4.LL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            c291001Au8 = c0jc4.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au7 = c0jc4.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au6 = c0jc4.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au5 = c0jc4.LLILZIL;
        }
        if ((i & 32) != 0) {
            f2 = c0jc4.LLILZLL;
        }
        c0jc4.getClass();
        return new C0JC4(str, c291001Au8, c291001Au7, c291001Au6, c291001Au5, f2);
    }
}
