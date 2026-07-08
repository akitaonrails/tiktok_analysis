package X;

import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0kvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337970kvD {
    public static final int LIZJ(Number number) {
        float fFloatValue = number.floatValue();
        float f = 0.0f;
        if (fFloatValue != 0.0f) {
            C1168340gVc c1168340gVc = C1168340gVc.LIZJ;
            f = C1168340gVc.LIZJ.LIZIZ * fFloatValue;
        }
        return Math.round(f);
    }

    public static final int LIZLLL(Number number) {
        float fFloatValue = number.floatValue();
        float f = 0.0f;
        if (fFloatValue != 0.0f) {
            C1168340gVc c1168340gVc = C1168340gVc.LIZJ;
            f = fFloatValue / C1168340gVc.LIZJ.LIZIZ;
        }
        return Math.round(f);
    }

    public static final int LIZ(Number number, C1168340gVc c1168340gVc) {
        return Math.round(LIZIZ(number, c1168340gVc));
    }

    public static final float LIZIZ(Number number, C1168340gVc c1168340gVc) {
        float fFloatValue = number.floatValue();
        if (fFloatValue == 0.0f) {
            return 0.0f;
        }
        return fFloatValue * c1168340gVc.LIZIZ;
    }

    public static final float LJ(Number number, C1168340gVc c1168340gVc) {
        float fFloatValue = number.floatValue();
        if (fFloatValue == 0.0f) {
            return 0.0f;
        }
        float f = c1168340gVc.LIZIZ;
        if (f == 0.0f) {
            C1325860kbg.LIZIZ(null, AFwS208S0000000_20.get$arr$(76), C2097608Jq.LJ());
            f = 3.0f;
        }
        return fFloatValue / f;
    }

    public static final float LJFF(Number number, C1168340gVc c1168340gVc) {
        if (number.floatValue() == 0.0f) {
            return 0.0f;
        }
        return Math.round(r2 * c1168340gVc.LIZ);
    }
}
