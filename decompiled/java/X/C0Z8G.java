package X;

import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Z8G, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z8G implements Serializable {
    public final int backGroundColor;
    public final int backGroundColorHex;
    public final int backGroundColorHexDark;
    public final int textColor;
    public final int textColorHex;
    public final int textColorHexDark;
    public final int textFont;
    public static final C881370Yhr Companion = new C881370Yhr();
    public static final C0Z8G NORMAL = new C0Z8G(72, R.attr.a1k, 0, 0, 0, 0, 0);
    public static final C0Z8G NEW_STYLE_WITH_BG = new C0Z8G(92, R.attr.t9, R.attr.a0h, 0, 0, 0, 0);
    public static final C0Z8G NEW_STYLE = new C0Z8G(72, R.attr.t9, 0, 0, 0, 0, 0);
    public static final C01GW<C0Z8G> config$delegate = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(601));

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Z8G)) {
            return false;
        }
        C0Z8G c0z8g = (C0Z8G) obj;
        return this.textFont == c0z8g.textFont && this.textColor == c0z8g.textColor && this.backGroundColor == c0z8g.backGroundColor && this.textColorHex == c0z8g.textColorHex && this.textColorHexDark == c0z8g.textColorHexDark && this.backGroundColorHex == c0z8g.backGroundColorHex && this.backGroundColorHexDark == c0z8g.backGroundColorHexDark;
    }

    public int hashCode() {
        return (((((((((((this.textFont * 31) + this.textColor) * 31) + this.backGroundColor) * 31) + this.textColorHex) * 31) + this.textColorHexDark) * 31) + this.backGroundColorHex) * 31) + this.backGroundColorHexDark;
    }

    public C0Z8G(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.textFont = i;
        this.textColor = i2;
        this.backGroundColor = i3;
        this.textColorHex = i4;
        this.textColorHexDark = i5;
        this.backGroundColorHex = i6;
        this.backGroundColorHexDark = i7;
    }
}
