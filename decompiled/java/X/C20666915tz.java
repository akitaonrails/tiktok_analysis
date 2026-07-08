package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20666915tz implements InterfaceC0148002o {
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final Drawable LLIZLLLIL;
    public final String LLJ;
    public final float LLJI;
    public final int LLJIJIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C20666915tz() {
        int i = 0;
        this(i, null, 0 == true ? 1 : 0, i, i, i, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 2047, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20666915tz)) {
            return false;
        }
        C20666915tz c20666915tz = (C20666915tz) obj;
        return this.LL == c20666915tz.LL && Intrinsics.LJFF(this.LLILLJJLI, c20666915tz.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c20666915tz.LLILLL) && this.LLILZ == c20666915tz.LLILZ && this.LLILZIL == c20666915tz.LLILZIL && this.LLILZLL == c20666915tz.LLILZLL && this.LLIZ == c20666915tz.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c20666915tz.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c20666915tz.LLJ) && Float.compare(this.LLJI, c20666915tz.LLJI) == 0 && this.LLJIJIL == c20666915tz.LLJIJIL;
    }

    public final String toString() {
        return "InnerPushRightState(rightType=" + this.LL + ", rightBtnText=" + this.LLILLJJLI + ", rightImageUrl=" + this.LLILLL + ", rightImageWidth=" + this.LLILZ + ", rightImageHeight=" + this.LLILZIL + ", rightImageRadius=" + this.LLILZLL + ", rightImageResId=" + this.LLIZ + ", rightImageDrawable=" + this.LLIZLLLIL + ", rightSchemaUrl=" + this.LLJ + ", rightImageBorderWidth=" + this.LLJI + ", visibility=" + this.LLJIJIL + ')';
    }

    public final int hashCode() {
        int i = this.LL * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode2 = (((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31) + this.LLIZ) * 31;
        Drawable drawable = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        String str3 = this.LLJ;
        return ((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LLJI)) * 31) + this.LLJIJIL;
    }

    public static C20666915tz LIZ(C20666915tz c20666915tz, Drawable drawable, int i, int i2) {
        int i3;
        String str;
        String str2;
        int i4;
        int i5;
        int i6;
        float f;
        int i7 = i;
        Drawable drawable2 = drawable;
        int i8 = 0;
        if ((i2 & 1) != 0) {
            i3 = c20666915tz.LL;
        } else {
            i3 = 0;
        }
        String str3 = null;
        if ((i2 & 2) != 0) {
            str = c20666915tz.LLILLJJLI;
        } else {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = c20666915tz.LLILLL;
        } else {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            i4 = c20666915tz.LLILZ;
        } else {
            i4 = 0;
        }
        if ((i2 & 16) != 0) {
            i5 = c20666915tz.LLILZIL;
        } else {
            i5 = 0;
        }
        if ((i2 & 32) != 0) {
            i6 = c20666915tz.LLILZLL;
        } else {
            i6 = 0;
        }
        if ((i2 & 64) != 0) {
            i8 = c20666915tz.LLIZ;
        }
        if ((i2 & 128) != 0) {
            drawable2 = c20666915tz.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            str3 = c20666915tz.LLJ;
        }
        if ((i2 & 512) != 0) {
            f = c20666915tz.LLJI;
        } else {
            f = 0.0f;
        }
        if ((i2 & 1024) != 0) {
            i7 = c20666915tz.LLJIJIL;
        }
        c20666915tz.getClass();
        return new C20666915tz(i3, str, str2, i4, i5, i6, i8, drawable2, str3, f, i7);
    }

    public C20666915tz(int i, String str, String str2, int i2, int i3, int i4, int i5, Drawable drawable, String str3, float f, int i6) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
        this.LLIZ = i5;
        this.LLIZLLLIL = drawable;
        this.LLJ = str3;
        this.LLJI = f;
        this.LLJIJIL = i6;
    }

    public /* synthetic */ C20666915tz(int i, String str, String str2, int i2, int i3, int i4, int i5, Drawable drawable, String str3, float f, int i6, int i7) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : str2, (i6 & 8) != 0 ? 36 : i2, (i6 & 16) != 0 ? 48 : i3, (i6 & 32) != 0 ? 4 : i4, (i6 & 64) == 0 ? i5 : 0, (i6 & 128) != 0 ? null : drawable, (i6 & 256) == 0 ? str3 : null, (i6 & 512) != 0 ? 0.5f : f, 0);
    }
}
