package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1CQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230261CQu {
    public final int LIZ;
    public final int LIZIZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.LIZ;
        if (i == 0) {
            sb.append("this");
        } else if (i == 1) {
            sb.append("prev");
        } else if (i == 2) {
            sb.append("next");
        } else if (i == 3) {
            sb.append("parent");
        } else if (i != 4) {
            sb.append("?");
        } else {
            sb.append("screen");
        }
        sb.append(e3.d);
        int i2 = this.LIZIZ;
        if (i2 == 10) {
            sb.append("visible");
        } else if (i2 != 15) {
            switch (i2) {
                case 0:
                    sb.append("left");
                    break;
                case 1:
                    sb.append("top");
                    break;
                case 2:
                    sb.append("right");
                    break;
                case 3:
                    sb.append("bottom");
                    break;
                case 4:
                    sb.append("centerX");
                    break;
                case 5:
                    sb.append("centerY");
                    break;
                case 6:
                    sb.append("width");
                    break;
                case 7:
                    sb.append("height");
                    break;
                default:
                    switch (i2) {
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            sb.append("isPad");
                            break;
                        case 21:
                            sb.append("isLand");
                            break;
                        case 22:
                            sb.append("centerYFirstLine");
                            break;
                        default:
                            sb.append("?");
                            break;
                    }
                    break;
            }
        } else {
            sb.append("tag");
        }
        return sb.toString();
    }

    public C2230261CQu(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
