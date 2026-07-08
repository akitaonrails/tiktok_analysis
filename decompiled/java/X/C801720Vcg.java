package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Vcg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801720Vcg extends C801730Vch {
    public final void LJIIIIZZ() {
        LIZ(',');
    }

    public final void LJIIIZ() {
        LIZ('{');
    }

    public final void LJIIJ() {
        LIZ('}');
    }

    public C801720Vcg(String str) {
        super(str);
    }

    public final void LJII(String str) {
        this.LIZ.LIZ('\"');
        LIZLLL(str);
        this.LIZ.LIZ('\"');
        this.LIZ.LIZ(':');
        LIZ(' ');
    }

    public final void LJIIJJI(String str) {
        LIZ('\"');
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\f') {
                    if (cCharAt != '\r') {
                        if (cCharAt != '\"' && cCharAt != '\\') {
                            if (cCharAt != 8232 && cCharAt != 8233) {
                                switch (cCharAt) {
                                    case '\b':
                                        LIZLLL("\\b");
                                        break;
                                    case BdTuring.TYPE_ECAF /* 9 */:
                                        LIZLLL("\\t");
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        LIZLLL("\\n");
                                        break;
                                    default:
                                        if (cCharAt <= 31) {
                                            LIZLLL(C786410Ut5.j4("\\u%04x", new Object[]{Integer.valueOf(cCharAt)}));
                                        } else {
                                            LIZ(cCharAt);
                                        }
                                        break;
                                }
                            } else {
                                LIZLLL(C786410Ut5.j4("\\u%04x", new Object[]{Integer.valueOf(cCharAt)}));
                            }
                        } else {
                            LIZ('\\');
                            LIZ(cCharAt);
                        }
                    } else {
                        LIZLLL("\\r");
                    }
                } else {
                    LIZLLL("\\f");
                }
            }
        }
        LIZ('\"');
    }
}
