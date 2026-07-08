package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.020N, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020N extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020N(int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020N(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(C020N c020n, Object obj) {
        C291001Au c291001Au = new C291001Au(Boolean.valueOf(c020n.z0));
        obj.getClass();
        return new C231600uw((C291001Au<Boolean>) c291001Au);
    }

    public static final Object invoke$1(C020N c020n, Object obj) {
        boolean z;
        String str = (String) obj;
        boolean z2 = false;
        if (str != null) {
            boolean z3 = c020n.z0;
            if (a0.LJJIZ(str, ':', 0, false, 6) < 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(z ^ z3)) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }

    public static final Object invoke$10(C020N c020n, Object obj) {
        ((Boolean) obj).booleanValue();
        return Boolean.valueOf(c020n.z0);
    }

    public static final Object invoke$11(C020N c020n, Object obj) {
        ((Boolean) obj).booleanValue();
        return Boolean.valueOf(c020n.z0);
    }

    public static final Object invoke$12(C020N c020n, Object obj) {
        boolean z;
        String str = (String) obj;
        boolean z2 = false;
        if (str != null) {
            boolean z3 = c020n.z0;
            if (a0.LJJIZ(str, ':', 0, false, 6) < 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(z ^ z3)) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }

    public static final Object invoke$13(C020N c020n, Object obj) {
        String strSubstring = (String) obj;
        if (!c020n.z0) {
            int iLJJIZ = a0.LJJIZ(strSubstring, '%', 0, false, 6);
            if (iLJJIZ >= 0) {
                strSubstring = strSubstring.substring(0, iLJJIZ);
            }
            return strSubstring.toUpperCase(Locale.US);
        }
        return strSubstring;
    }

    public static final Object invoke$14(C020N c020n, Object obj) {
        boolean z;
        String str = (String) obj;
        boolean z2 = false;
        if (str != null) {
            boolean z3 = c020n.z0;
            if (a0.LJJIZ(str, ':', 0, false, 6) < 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(z ^ z3)) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }

    public static final Object invoke$15(C020N c020n, Object obj) {
        String strSubstring = (String) obj;
        if (!c020n.z0) {
            int iLJJIZ = a0.LJJIZ(strSubstring, '%', 0, false, 6);
            if (iLJJIZ >= 0) {
                strSubstring = strSubstring.substring(0, iLJJIZ);
            }
            return strSubstring.toUpperCase(Locale.US);
        }
        return strSubstring;
    }

    public static final Object invoke$2(C020N c020n, Object obj) {
        String strSubstring = (String) obj;
        if (!c020n.z0) {
            int iLJJIZ = a0.LJJIZ(strSubstring, '%', 0, false, 6);
            if (iLJJIZ >= 0) {
                strSubstring = strSubstring.substring(0, iLJJIZ);
            }
            return strSubstring.toUpperCase(Locale.US);
        }
        return strSubstring;
    }

    public static final Object invoke$3(C020N c020n, Object obj) {
        String strSubstring = (String) obj;
        if (!c020n.z0) {
            int iLJJIZ = a0.LJJIZ(strSubstring, '%', 0, false, 6);
            if (iLJJIZ >= 0) {
                strSubstring = strSubstring.substring(0, iLJJIZ);
            }
            return strSubstring.toUpperCase(Locale.US);
        }
        return strSubstring;
    }

    public static final Object invoke$4(C020N c020n, Object obj) {
        boolean z;
        String str = (String) obj;
        boolean z2 = false;
        if (str != null) {
            boolean z3 = c020n.z0;
            if (a0.LJJIZ(str, ':', 0, false, 6) < 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(z ^ z3)) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }

    public static final Object invoke$5(C020N c020n, Object obj) {
        int i;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
        if (c020n.z0) {
            i = 72;
        } else {
            i = 64;
        }
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        return Unit.LIZ;
    }

    public static final Object invoke$6(C020N c020n, Object obj) {
        boolean z;
        String str = (String) obj;
        boolean z2 = false;
        if (str != null) {
            boolean z3 = c020n.z0;
            if (a0.LJJIZ(str, ':', 0, false, 6) < 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(z ^ z3)) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }

    public static final Object invoke$7(C020N c020n, Object obj) {
        String strSubstring = (String) obj;
        if (!c020n.z0) {
            int iLJJIZ = a0.LJJIZ(strSubstring, '%', 0, false, 6);
            if (iLJJIZ >= 0) {
                strSubstring = strSubstring.substring(0, iLJJIZ);
            }
            return strSubstring.toUpperCase(Locale.US);
        }
        return strSubstring;
    }

    public static final Object invoke$8(C020N c020n, Object obj) {
        C291001Au c291001Au = new C291001Au(Boolean.valueOf(c020n.z0));
        obj.getClass();
        return new C234300vN(c291001Au);
    }

    public static final Object invoke$9(C020N c020n, Object obj) {
        boolean z;
        if (((Number) obj).intValue() != 5 && c020n.z0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
