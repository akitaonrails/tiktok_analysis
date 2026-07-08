package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: X.12y9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19928312y9<T> implements InterfaceC19924912xb<T> {
    public static final int[] LJIILLIIL = new int[0];
    public static final Unsafe LJIIZILJ = C19917512wP.LJIILLIIL();
    public final int[] LIZ;
    public final Object[] LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final InterfaceC19925612xi LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final int[] LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final InterfaceC19921912x7 LJIIJJI;
    public final InterfaceC19931012ya LJIIL;
    public final AbstractC19929412yK<?, ?> LJIILIIL;
    public final AbstractC19929512yL<?> LJIILJJIL;
    public final InterfaceC19930412yU LJIILL;

    public static long LJJIIJ(int i) {
        return i & 1048575;
    }

    public static int LJJJJIZL(int i) {
        return (i & 267386880) >>> 20;
    }

    @Override // X.InterfaceC19924912xb
    public final T newInstance() {
        return (T) this.LJIIJJI.LIZ(this.LJ);
    }

    public static void LJIIJ(Object obj) {
        if (LJIJ(obj)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Mutating immutable message: ");
        sbLIZ.append(obj);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C19927712y3 LJIILL(Object obj) {
        AbstractC19924712xZ abstractC19924712xZ = (AbstractC19924712xZ) obj;
        C19927712y3 c19927712y3 = abstractC19924712xZ.unknownFields;
        if (c19927712y3 == C19927712y3.LJFF) {
            C19927712y3 c19927712y32 = new C19927712y3();
            abstractC19924712xZ.unknownFields = c19927712y32;
            return c19927712y32;
        }
        return c19927712y3;
    }

    public static boolean LJIJ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC19924712xZ) {
            return ((AbstractC19924712xZ) obj).isMutable();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    @Override // X.InterfaceC19924912xb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZIZ(T r9) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19928312y9.LIZIZ(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    @Override // X.InterfaceC19924912xb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(T r15) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19928312y9.LIZLLL(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    @Override // X.InterfaceC19924912xb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(T r8) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19928312y9.LJI(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x058b  */
    @Override // X.InterfaceC19924912xb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJII(T r18) {
        /*
            Method dump skipped, instruction units count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19928312y9.LJII(java.lang.Object):int");
    }

    public final InterfaceC19931212yc LJIIL(int i) {
        return (InterfaceC19931212yc) this.LIZIZ[((i / 3) * 2) + 1];
    }

    public final Object LJIILIIL(int i) {
        return this.LIZIZ[(i / 3) * 2];
    }

    public final InterfaceC19924912xb LJIILJJIL(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.LIZIZ;
        InterfaceC19924912xb interfaceC19924912xb = (InterfaceC19924912xb) objArr[i2];
        if (interfaceC19924912xb != null) {
            return interfaceC19924912xb;
        }
        InterfaceC19924912xb<T> interfaceC19924912xbLIZ = C19921412x2.LIZJ.LIZ((Class) objArr[i2 + 1]);
        this.LIZIZ[i2] = interfaceC19924912xbLIZ;
        return interfaceC19924912xbLIZ;
    }

    public final int LJJJJJ(int i) {
        return this.LIZ[i + 1];
    }

    public static int LJJIIJZLJL(long j, Object obj) {
        return ((Integer) C19917512wP.LJIILL(j, obj)).intValue();
    }

    public static long LJJIIZ(long j, Object obj) {
        return ((Long) C19917512wP.LJIILL(j, obj)).longValue();
    }

    public static Field LJJIZ(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Field ");
            sbLIZ.append(str);
            sbLIZ.append(" for ");
            sbLIZ.append(cls.getName());
            sbLIZ.append(" not found. Known fields are ");
            sbLIZ.append(Arrays.toString(declaredFields));
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    @Override // X.InterfaceC19924912xb
    public final void LIZ(T t, T t2) {
        LJIIJ(t);
        t2.getClass();
        for (int i = 0; i < this.LIZ.length; i += 3) {
            int iLJJJJJ = LJJJJJ(i);
            long j = 1048575 & iLJJJJJ;
            int i2 = this.LIZ[i];
            switch ((iLJJJJJ & 267386880) >>> 20) {
                case 0:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LIZJ.LJIILL(t, j, C19917512wP.LJIIJJI(j, t2));
                        LJJJ(i, t);
                    }
                    break;
                case 1:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LIZJ.LJIILLIIL(t, j, C19917512wP.LJIIL(j, t2));
                        LJJJ(i, t);
                    }
                    break;
                case 2:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LJJ(j, C19917512wP.LJIILJJIL(j, t2), t);
                        LJJJ(i, t);
                    }
                    break;
                case 3:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LJJ(j, C19917512wP.LJIILJJIL(j, t2), t);
                        LJJJ(i, t);
                    }
                    break;
                case 4:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LJIL(C19917512wP.LJIILIIL(j, t2), j, t);
                        LJJJ(i, t);
                    }
                    break;
                case 5:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LJJ(j, C19917512wP.LJIILJJIL(j, t2), t);
                        LJJJ(i, t);
                    }
                    break;
                case 6:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LJIL(C19917512wP.LJIILIIL(j, t2), j, t);
                        LJJJ(i, t);
                    }
                    break;
                case 7:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LIZJ.LJIILIIL(j, t, C19917512wP.LJI(j, t2));
                        LJJJ(i, t);
                    }
                    break;
                case 8:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LJJI(j, t, C19917512wP.LJIILL(j, t2));
                        LJJJ(i, t);
                    }
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    LJIL(i, t, t2);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LJJI(j, t, C19917512wP.LJIILL(j, t2));
                        LJJJ(i, t);
                    }
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LJIL(C19917512wP.LJIILIIL(j, t2), j, t);
                        LJJJ(i, t);
                    }
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LJIL(C19917512wP.LJIILIIL(j, t2), j, t);
                        LJJJ(i, t);
                    }
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LJIL(C19917512wP.LJIILIIL(j, t2), j, t);
                        LJJJ(i, t);
                    }
                    break;
                case 14:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LJJ(j, C19917512wP.LJIILJJIL(j, t2), t);
                        LJJJ(i, t);
                    }
                    break;
                case 15:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LJIL(C19917512wP.LJIILIIL(j, t2), j, t);
                        LJJJ(i, t);
                    }
                    break;
                case 16:
                    if (LJIIZILJ(i, t2)) {
                        C19917512wP.LJJ(j, C19917512wP.LJIILJJIL(j, t2), t);
                        LJJJ(i, t);
                    }
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    LJIL(i, t, t2);
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                case 19:
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                case 21:
                case 22:
                case 23:
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                case 35:
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.LJIIL.LIZJ(j, t, t2);
                    break;
                case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    InterfaceC19930412yU interfaceC19930412yU = this.LJIILL;
                    Class<?> cls = C19928512yB.LIZ;
                    C19917512wP.LJJI(j, t, interfaceC19930412yU.LIZ(C19917512wP.LJIILL(j, t), C19917512wP.LJIILL(j, t2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (LJIJI(i2, i, t2)) {
                        C19917512wP.LJJI(j, t, C19917512wP.LJIILL(j, t2));
                        LJJJI(i2, i, t);
                    }
                    break;
                case 60:
                    LJJ(i, t, t2);
                    break;
                case 61:
                case BaseNotice.CREATOR /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (LJIJI(i2, i, t2)) {
                        C19917512wP.LJJI(j, t, C19917512wP.LJIILL(j, t2));
                        LJJJI(i2, i, t);
                    }
                    break;
                case 68:
                    LJJ(i, t, t2);
                    break;
            }
        }
        AbstractC19929412yK<?, ?> abstractC19929412yK = this.LJIILIIL;
        Class<?> cls2 = C19928512yB.LIZ;
        abstractC19929412yK.LJIILJJIL(t, abstractC19929412yK.LJIIJ(abstractC19929412yK.LJI(t), abstractC19929412yK.LJI(t2)));
        if (this.LJFF) {
            C19928512yB.LJIIJJI(this.LJIILJJIL, t, t2);
        }
    }

    @Override // X.InterfaceC19924912xb
    public final boolean LIZJ(T t, T t2) {
        boolean zLJIIL;
        int length = this.LIZ.length;
        for (int i = 0; i < length; i += 3) {
            int iLJJJJJ = LJJJJJ(i);
            long j = iLJJJJJ & 1048575;
            switch ((iLJJJJJ & 267386880) >>> 20) {
                case 0:
                    if (!LJIIIZ(i, t, t2) || Double.doubleToLongBits(C19917512wP.LJIIJJI(j, t)) != Double.doubleToLongBits(C19917512wP.LJIIJJI(j, t2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!LJIIIZ(i, t, t2) || Float.floatToIntBits(C19917512wP.LJIIL(j, t)) != Float.floatToIntBits(C19917512wP.LJIIL(j, t2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!LJIIIZ(i, t, t2) || C19917512wP.LJIILJJIL(j, t) != C19917512wP.LJIILJJIL(j, t2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!LJIIIZ(i, t, t2) || C19917512wP.LJIILJJIL(j, t) != C19917512wP.LJIILJJIL(j, t2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!LJIIIZ(i, t, t2) || C19917512wP.LJIILIIL(j, t) != C19917512wP.LJIILIIL(j, t2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!LJIIIZ(i, t, t2) || C19917512wP.LJIILJJIL(j, t) != C19917512wP.LJIILJJIL(j, t2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!LJIIIZ(i, t, t2) || C19917512wP.LJIILIIL(j, t) != C19917512wP.LJIILIIL(j, t2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!LJIIIZ(i, t, t2) || C19917512wP.LJI(j, t) != C19917512wP.LJI(j, t2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!LJIIIZ(i, t, t2) || !C19928512yB.LJIIL(C19917512wP.LJIILL(j, t), C19917512wP.LJIILL(j, t2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    if (!LJIIIZ(i, t, t2) || !C19928512yB.LJIIL(C19917512wP.LJIILL(j, t), C19917512wP.LJIILL(j, t2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    if (!LJIIIZ(i, t, t2) || !C19928512yB.LJIIL(C19917512wP.LJIILL(j, t), C19917512wP.LJIILL(j, t2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    if (!LJIIIZ(i, t, t2) || C19917512wP.LJIILIIL(j, t) != C19917512wP.LJIILIIL(j, t2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    if (!LJIIIZ(i, t, t2) || C19917512wP.LJIILIIL(j, t) != C19917512wP.LJIILIIL(j, t2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    if (!LJIIIZ(i, t, t2) || C19917512wP.LJIILIIL(j, t) != C19917512wP.LJIILIIL(j, t2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!LJIIIZ(i, t, t2) || C19917512wP.LJIILJJIL(j, t) != C19917512wP.LJIILJJIL(j, t2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!LJIIIZ(i, t, t2) || C19917512wP.LJIILIIL(j, t) != C19917512wP.LJIILIIL(j, t2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!LJIIIZ(i, t, t2) || C19917512wP.LJIILJJIL(j, t) != C19917512wP.LJIILJJIL(j, t2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    if (!LJIIIZ(i, t, t2) || !C19928512yB.LJIIL(C19917512wP.LJIILL(j, t), C19917512wP.LJIILL(j, t2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                case 19:
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                case 21:
                case 22:
                case 23:
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                case 35:
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zLJIIL = C19928512yB.LJIIL(C19917512wP.LJIILL(j, t), C19917512wP.LJIILL(j, t2));
                    break;
                case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    zLJIIL = C19928512yB.LJIIL(C19917512wP.LJIILL(j, t), C19917512wP.LJIILL(j, t2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case BaseNotice.CREATOR /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j2 = this.LIZ[i + 2] & 1048575;
                    if (C19917512wP.LJIILIIL(j2, t) != C19917512wP.LJIILIIL(j2, t2) || !C19928512yB.LJIIL(C19917512wP.LJIILL(j, t), C19917512wP.LJIILL(j, t2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zLJIIL) {
                return false;
            }
        }
        if (!this.LJIILIIL.LJI(t).equals(this.LJIILIIL.LJI(t2))) {
            return false;
        }
        if (!this.LJFF) {
            return true;
        }
        return this.LJIILJJIL.LIZJ(t).equals(this.LJIILJJIL.LIZJ(t2));
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x04d6  */
    @Override // X.InterfaceC19924912xb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(T r12, X.InterfaceC19361110or r13) {
        /*
            Method dump skipped, instruction units count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19928312y9.LJ(java.lang.Object, X.10or):void");
    }

    public final boolean LJIIZILJ(int i, Object obj) {
        boolean zEquals;
        int i2 = this.LIZ[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iLJJJJJ = LJJJJJ(i);
            long j2 = iLJJJJJ & 1048575;
            switch ((iLJJJJJ & 267386880) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(C19917512wP.LJIIJJI(j2, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C19917512wP.LJIIL(j2, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C19917512wP.LJIILJJIL(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C19917512wP.LJIILJJIL(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C19917512wP.LJIILIIL(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C19917512wP.LJIILJJIL(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C19917512wP.LJIILIIL(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C19917512wP.LJI(j2, obj);
                case 8:
                    Object objLJIILL = C19917512wP.LJIILL(j2, obj);
                    if (objLJIILL instanceof String) {
                        zEquals = ((String) objLJIILL).isEmpty();
                    } else if (objLJIILL instanceof AbstractC19922812xG) {
                        zEquals = AbstractC19922812xG.EMPTY.equals(objLJIILL);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    if (C19917512wP.LJIILL(j2, obj) == null) {
                        return false;
                    }
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    zEquals = AbstractC19922812xG.EMPTY.equals(C19917512wP.LJIILL(j2, obj));
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    if (C19917512wP.LJIILIIL(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    if (C19917512wP.LJIILIIL(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    if (C19917512wP.LJIILIIL(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C19917512wP.LJIILJJIL(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C19917512wP.LJIILIIL(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C19917512wP.LJIILJJIL(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    if (C19917512wP.LJIILL(j2, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !zEquals;
        }
        if (((1 << (i2 >>> 20)) & C19917512wP.LJIILIIL(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object LJJI(int i, Object obj) {
        InterfaceC19924912xb interfaceC19924912xbLJIILJJIL = LJIILJJIL(i);
        long jLJJJJJ = LJJJJJ(i) & 1048575;
        if (!LJIIZILJ(i, obj)) {
            return interfaceC19924912xbLJIILJJIL.newInstance();
        }
        Object object = LJIIZILJ.getObject(obj, jLJJJJJ);
        if (LJIJ(object)) {
            return object;
        }
        Object objNewInstance = interfaceC19924912xbLJIILJJIL.newInstance();
        if (object != null) {
            interfaceC19924912xbLJIILJJIL.LIZ(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final void LJJJ(int i, Object obj) {
        int i2 = this.LIZ[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        C19917512wP.LJIL((1 << (i2 >>> 20)) | C19917512wP.LJIILIIL(j, obj), j, obj);
    }

    public final int LJJJIL(int i, int i2) {
        int length = (this.LIZ.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.LIZ[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0552  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJL(T r20, X.InterfaceC19361110or r21) {
        /*
            Method dump skipped, instruction units count: 1538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19928312y9.LJJJJJL(java.lang.Object, X.10or):void");
    }

    public static void LJJJJLI(int i, Object obj, InterfaceC19361110or interfaceC19361110or) {
        if (obj instanceof String) {
            ((C19929012yG) interfaceC19361110or).LIZ.LJJIJ(i, (String) obj);
        } else {
            ((C19929012yG) interfaceC19361110or).LIZIZ(i, (AbstractC19922812xG) obj);
        }
    }

    @Override // X.InterfaceC19924912xb
    public final void LJIIIIZZ(T t, InterfaceC19929112yH interfaceC19929112yH, C19926312xp c19926312xp) throws Throwable {
        if (c19926312xp != null) {
            LJIIJ(t);
            LJIJJ(this.LJIILIIL, this.LJIILJJIL, t, interfaceC19929112yH, c19926312xp);
            return;
        }
        throw null;
    }

    public final boolean LJIIIZ(int i, Object obj, Object obj2) {
        if (LJIIZILJ(i, obj) == LJIIZILJ(i, obj2)) {
            return true;
        }
        return false;
    }

    public final boolean LJIJI(int i, int i2, Object obj) {
        if (C19917512wP.LJIILIIL(this.LIZ[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIL(int i, Object obj, Object obj2) {
        if (!LJIIZILJ(i, obj2)) {
            return;
        }
        long jLJJJJJ = LJJJJJ(i) & 1048575;
        Unsafe unsafe = LJIIZILJ;
        Object object = unsafe.getObject(obj2, jLJJJJJ);
        if (object != null) {
            InterfaceC19924912xb interfaceC19924912xbLJIILJJIL = LJIILJJIL(i);
            if (!LJIIZILJ(i, obj)) {
                if (!LJIJ(object)) {
                    unsafe.putObject(obj, jLJJJJJ, object);
                } else {
                    Object objNewInstance = interfaceC19924912xbLJIILJJIL.newInstance();
                    interfaceC19924912xbLJIILJJIL.LIZ(objNewInstance, object);
                    unsafe.putObject(obj, jLJJJJJ, objNewInstance);
                }
                LJJJ(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jLJJJJJ);
            if (!LJIJ(object2)) {
                Object objNewInstance2 = interfaceC19924912xbLJIILJJIL.newInstance();
                interfaceC19924912xbLJIILJJIL.LIZ(objNewInstance2, object2);
                unsafe.putObject(obj, jLJJJJJ, objNewInstance2);
                object2 = objNewInstance2;
            }
            interfaceC19924912xbLJIILJJIL.LIZ(object2, object);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Source subfield ");
        sbLIZ.append(this.LIZ[i]);
        sbLIZ.append(" is present but null: ");
        sbLIZ.append(obj2);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJ(int i, Object obj, Object obj2) {
        int i2 = this.LIZ[i];
        if (!LJIJI(i2, i, obj2)) {
            return;
        }
        long jLJJJJJ = LJJJJJ(i) & 1048575;
        Unsafe unsafe = LJIIZILJ;
        Object object = unsafe.getObject(obj2, jLJJJJJ);
        if (object != null) {
            InterfaceC19924912xb interfaceC19924912xbLJIILJJIL = LJIILJJIL(i);
            if (!LJIJI(i2, i, obj)) {
                if (!LJIJ(object)) {
                    unsafe.putObject(obj, jLJJJJJ, object);
                } else {
                    Object objNewInstance = interfaceC19924912xbLJIILJJIL.newInstance();
                    interfaceC19924912xbLJIILJJIL.LIZ(objNewInstance, object);
                    unsafe.putObject(obj, jLJJJJJ, objNewInstance);
                }
                LJJJI(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jLJJJJJ);
            if (!LJIJ(object2)) {
                Object objNewInstance2 = interfaceC19924912xbLJIILJJIL.newInstance();
                interfaceC19924912xbLJIILJJIL.LIZ(objNewInstance2, object2);
                unsafe.putObject(obj, jLJJJJJ, objNewInstance2);
                object2 = objNewInstance2;
            }
            interfaceC19924912xbLJIILJJIL.LIZ(object2, object);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Source subfield ");
        sbLIZ.append(this.LIZ[i]);
        sbLIZ.append(" is present but null: ");
        sbLIZ.append(obj2);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object LJJIFFI(int i, int i2, Object obj) {
        InterfaceC19924912xb interfaceC19924912xbLJIILJJIL = LJIILJJIL(i2);
        if (!LJIJI(i, i2, obj)) {
            return interfaceC19924912xbLJIILJJIL.newInstance();
        }
        Object object = LJIIZILJ.getObject(obj, LJJJJJ(i2) & 1048575);
        if (LJIJ(object)) {
            return object;
        }
        Object objNewInstance = interfaceC19924912xbLJIILJJIL.newInstance();
        if (object != null) {
            interfaceC19924912xbLJIILJJIL.LIZ(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final void LJJIJLIJ(int i, InterfaceC19929112yH interfaceC19929112yH, Object obj) {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C19917512wP.LJJI(i & 1048575, obj, interfaceC19929112yH.LJJII());
        } else if (this.LJI) {
            C19917512wP.LJJI(i & 1048575, obj, interfaceC19929112yH.LJIIL());
        } else {
            C19917512wP.LJJI(i & 1048575, obj, interfaceC19929112yH.LJIILL());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJJIL(int i, InterfaceC19929112yH interfaceC19929112yH, Object obj) {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            interfaceC19929112yH.LJIIIZ(this.LJIIL.LIZ(i & 1048575, obj));
        } else {
            interfaceC19929112yH.LJJIJL(this.LJIIL.LIZ(i & 1048575, obj));
        }
    }

    public final void LJJJI(int i, int i2, Object obj) {
        C19917512wP.LJIL(i, this.LIZ[i2 + 2] & 1048575, obj);
    }

    public final void LJJJJ(int i, Object obj, Object obj2) {
        LJIIZILJ.putObject(obj, LJJJJJ(i) & 1048575, obj2);
        LJJJ(i, obj);
    }

    public final void LJJJJI(int i, int i2, Object obj, Object obj2) {
        LJIIZILJ.putObject(obj, LJJJJJ(i2) & 1048575, obj2);
        LJJJI(i, i2, obj);
    }

    public final <K, V> void LJJJJL(InterfaceC19361110or interfaceC19361110or, int i, Object obj, int i2) {
        if (obj != null) {
            this.LJIILL.LJ(LJIILIIL(i2));
            Map<?, ?> mapLJII = this.LJIILL.LJII(obj);
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.LIZ.getClass();
            Iterator<Map.Entry<?, ?>> it2 = mapLJII.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry<?, ?> next = it2.next();
                c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                next.getKey();
                next.getValue();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC19924912xb
    public final void LJFF(T t, byte[] bArr, int i, int i2, C19926712xt c19926712xt) throws C19926612xs {
        LJJIJ(t, bArr, i, i2, 0, c19926712xt);
    }

    public final void LJIIJJI(Object obj, int i, Object obj2, AbstractC19929412yK abstractC19929412yK, Object obj3) {
        InterfaceC19931212yc interfaceC19931212ycLJIIL;
        Object objLJIILL = C19917512wP.LJIILL(LJJJJJ(i) & 1048575, obj);
        if (objLJIILL == null || (interfaceC19931212ycLJIIL = LJIIL(i)) == null) {
            return;
        }
        Map<?, ?> mapLJI = this.LJIILL.LJI(objLJIILL);
        this.LJIILL.LJ(LJIILIIL(i));
        for (Map.Entry<?, ?> entry : mapLJI.entrySet()) {
            if (!interfaceC19931212ycLJIIL.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    abstractC19929412yK.LJFF(obj3);
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    public final boolean LJIILLIIL(int i, int i2, int i3, int i4, Object obj) {
        if (i2 == 1048575) {
            return LJIIZILJ(i, obj);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x061c A[LOOP:2: B:244:0x0618->B:246:0x061c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0514 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x050c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.12yK, X.12yK<UT, UB>] */
    /* JADX WARN: Type inference failed for: r26v0, types: [X.12yH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <UT, UB, ET extends X.InterfaceC19930212yS<ET>> void LJIJJ(X.AbstractC19929412yK<UT, UB> r23, X.AbstractC19929512yL<ET> r24, T r25, X.InterfaceC19929112yH r26, X.C19926312xp r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19928312y9.LJIJJ(X.12yK, X.12yL, java.lang.Object, X.12yH, X.12xp):void");
    }

    public final <K, V> void LJIJJLI(Object obj, int i, Object obj2, C19926312xp c19926312xp, InterfaceC19929112yH interfaceC19929112yH) {
        long jLJJJJJ = LJJJJJ(i) & 1048575;
        Object objLJIILL = C19917512wP.LJIILL(jLJJJJJ, obj);
        if (objLJIILL == null) {
            objLJIILL = this.LJIILL.LIZIZ(obj2);
            C19917512wP.LJJI(jLJJJJJ, obj, objLJIILL);
        } else if (this.LJIILL.LIZLLL(objLJIILL)) {
            Object objLIZIZ = this.LJIILL.LIZIZ(obj2);
            this.LJIILL.LIZ(objLIZIZ, objLJIILL);
            C19917512wP.LJJI(jLJJJJJ, obj, objLIZIZ);
            objLJIILL = objLIZIZ;
        }
        this.LJIILL.LJI(objLJIILL);
        this.LJIILL.LJ(obj2);
        interfaceC19929112yH.LJJIL();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <E> void LJJIJIL(Object obj, long j, InterfaceC19929112yH interfaceC19929112yH, InterfaceC19924912xb<E> interfaceC19924912xb, C19926312xp c19926312xp) {
        interfaceC19929112yH.LJJ(this.LJIIL.LIZ(j, obj), interfaceC19924912xb, c19926312xp);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <E> void LJJIJL(Object obj, int i, InterfaceC19929112yH interfaceC19929112yH, InterfaceC19924912xb<E> interfaceC19924912xb, C19926312xp c19926312xp) {
        interfaceC19929112yH.LJJIIJZLJL(this.LJIIL.LIZ(i & 1048575, obj), interfaceC19924912xb, c19926312xp);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C19928312y9 LJJII(X.InterfaceC19921712x5 r23, X.InterfaceC19921912x7 r24, X.InterfaceC19931012ya r25, X.AbstractC19929412yK r26, X.AbstractC19929512yL r27, X.InterfaceC19930412yU r28) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19928312y9.LJJII(X.12x5, X.12x7, X.12ya, X.12yK, X.12yL, X.12yU):X.12y9");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> X.C19928312y9<T> LJJIII(X.C19918112wV r34, X.InterfaceC19921912x7 r35, X.InterfaceC19931012ya r36, X.AbstractC19929412yK<?, ?> r37, X.AbstractC19929512yL<?> r38, X.InterfaceC19930412yU r39) {
        /*
            Method dump skipped, instruction units count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19928312y9.LJJIII(X.12wV, X.12x7, X.12ya, X.12yK, X.12yL, X.12yU):X.12y9");
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x02e4, code lost:
    
        if (r4 != r2) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02e6, code lost:
    
        r10 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0322, code lost:
    
        if (r4 != r2) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0325, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x034c, code lost:
    
        if (r45 != 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0350, code lost:
    
        if (r2 == r44) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0356, code lost:
    
        throw X.C19926612xs.LJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0359, code lost:
    
        if (r2 > r44) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x035f, code lost:
    
        if (r19 != r45) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0361, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0366, code lost:
    
        throw X.C19926612xs.LJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r20 == 1048575) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        r14.putInt(r12, r20, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        r1 = r7.LJIIIZ;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        if (r1 >= r7.LJIIJ) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        r9 = r7.LJIIIIZZ[r1];
        r0 = r7.LJIILIIL;
        r7 = r7;
        r8 = r12;
        r12 = r12;
        r7.LJIIJJI(r8, r9, null, r0, r12);
        r1 = r1 + 1;
        r7 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJIJ(T r41, byte[] r42, int r43, int r44, int r45, X.C19926712xt r46) throws X.C19926612xs {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19928312y9.LJJIJ(java.lang.Object, byte[], int, int, int, X.12xt):int");
    }

    public final void LJJIIZI(Object obj, byte[] bArr, int i, int i2, int i3, long j, C19926712xt c19926712xt) throws C19926612xs {
        Unsafe unsafe = LJIIZILJ;
        Object objLJIILIIL = LJIILIIL(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.LJIILL.LIZLLL(object)) {
            Object objLIZIZ = this.LJIILL.LIZIZ(objLJIILIIL);
            this.LJIILL.LIZ(objLIZIZ, object);
            unsafe.putObject(obj, j, objLIZIZ);
            object = objLIZIZ;
        }
        this.LJIILL.LJ(objLJIILIIL);
        this.LJIILL.LJI(object);
        int iLJIJI = C19926512xr.LJIJI(bArr, i, c19926712xt);
        int i4 = c19926712xt.LIZ;
        if (i4 >= 0 && i4 <= i2 - iLJIJI) {
            throw null;
        }
        throw C19926612xs.LJII();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int LJJIJIIJI(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C19926712xt c19926712xt) throws C19926612xs {
        boolean z;
        Unsafe unsafe = LJIIZILJ;
        long j2 = this.LIZ[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(C19926512xr.LIZLLL(i, bArr))));
                    int i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(C19926512xr.LIZJ(i, bArr))));
                    int i10 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i10;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    int iLJIJJLI = C19926512xr.LJIJJLI(bArr, i, c19926712xt);
                    unsafe.putObject(t, j, Long.valueOf(c19926712xt.LIZIZ));
                    unsafe.putInt(t, j2, i4);
                    return iLJIJJLI;
                }
                return i;
            case 55:
            case BaseNotice.CREATOR /* 62 */:
                if (i5 == 0) {
                    int iLJIJI = C19926512xr.LJIJI(bArr, i, c19926712xt);
                    unsafe.putObject(t, j, Integer.valueOf(c19926712xt.LIZ));
                    unsafe.putInt(t, j2, i4);
                    return iLJIJI;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(C19926512xr.LIZLLL(i, bArr)));
                    int i11 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i11;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(C19926512xr.LIZJ(i, bArr)));
                    int i12 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i12;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    int iLJIJJLI2 = C19926512xr.LJIJJLI(bArr, i, c19926712xt);
                    if (c19926712xt.LIZIZ != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(t, j, Boolean.valueOf(z));
                    unsafe.putInt(t, j2, i4);
                    return iLJIJJLI2;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int iLJIJI2 = C19926512xr.LJIJI(bArr, i, c19926712xt);
                    int i13 = c19926712xt.LIZ;
                    if (i13 == 0) {
                        unsafe.putObject(t, j, "");
                    } else {
                        if ((i6 & 536870912) != 0) {
                            if (C19920112wp.LIZ.LJ(0, bArr, iLJIJI2, iLJIJI2 + i13) != 0) {
                                throw C19926612xs.LIZJ();
                            }
                        }
                        unsafe.putObject(t, j, new String(bArr, iLJIJI2, i13, C19922012x8.LIZ));
                        iLJIJI2 += i13;
                    }
                    unsafe.putInt(t, j2, i4);
                    return iLJIJI2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    Object objLJJIFFI = LJJIFFI(i4, i8, t);
                    int iLJJ = C19926512xr.LJJ(objLJJIFFI, LJIILJJIL(i8), bArr, i, i2, c19926712xt);
                    LJJJJI(i4, i8, t, objLJJIFFI);
                    return iLJJ;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    int iLIZ = C19926512xr.LIZ(bArr, i, c19926712xt);
                    unsafe.putObject(t, j, c19926712xt.LIZJ);
                    unsafe.putInt(t, j2, i4);
                    return iLIZ;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int iLJIJI3 = C19926512xr.LJIJI(bArr, i, c19926712xt);
                    int i14 = c19926712xt.LIZ;
                    InterfaceC19931212yc interfaceC19931212ycLJIIL = LJIIL(i8);
                    if (interfaceC19931212ycLJIIL != null && !interfaceC19931212ycLJIIL.isInRange(i14)) {
                        LJIILL(t).LJFF(i3, Long.valueOf(i14));
                        return iLJIJI3;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i14));
                    unsafe.putInt(t, j2, i4);
                    return iLJIJI3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    int iLJIJI4 = C19926512xr.LJIJI(bArr, i, c19926712xt);
                    unsafe.putObject(t, j, Integer.valueOf(AbstractC19927312xz.LIZLLL(c19926712xt.LIZ)));
                    unsafe.putInt(t, j2, i4);
                    return iLJIJI4;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    int iLJIJJLI3 = C19926512xr.LJIJJLI(bArr, i, c19926712xt);
                    unsafe.putObject(t, j, Long.valueOf(AbstractC19927312xz.LJ(c19926712xt.LIZIZ)));
                    unsafe.putInt(t, j2, i4);
                    return iLJIJJLI3;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    Object objLJJIFFI2 = LJJIFFI(i4, i8, t);
                    int iLJIL = C19926512xr.LJIL(objLJJIFFI2, LJIILJJIL(i8), bArr, i, i2, (i3 & (-8)) | 4, c19926712xt);
                    LJJJJI(i4, i8, t, objLJJIFFI2);
                    return iLJIL;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int LJJIJIIJIL(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C19926712xt c19926712xt) throws C19926612xs {
        int iLJIJJLI;
        int iLJIJJ;
        boolean z;
        boolean z2;
        int iLJ = i;
        Unsafe unsafe = LJIIZILJ;
        InterfaceC19921012wy interfaceC19921012wyLJIILL2 = (InterfaceC19921012wy) unsafe.getObject(t, j2);
        if (!interfaceC19921012wyLJIILL2.LJJLIL()) {
            interfaceC19921012wyLJIILL2 = interfaceC19921012wyLJIILL2.LJIILL2(interfaceC19921012wyLJIILL2.size() * 2);
            unsafe.putObject(t, j2, interfaceC19921012wyLJIILL2);
        }
        switch (i7) {
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 35:
                if (i5 == 2) {
                    return C19926512xr.LJIIIIZZ(bArr, iLJ, interfaceC19921012wyLJIILL2, c19926712xt);
                }
                if (i5 == 1) {
                    C19888612rk c19888612rk = (C19888612rk) interfaceC19921012wyLJIILL2;
                    c19888612rk.LJ(Double.longBitsToDouble(C19926512xr.LIZLLL(iLJ, bArr)));
                    while (true) {
                        iLJIJJLI = iLJ + 8;
                        if (iLJIJJLI < i2) {
                            iLJ = C19926512xr.LJIJI(bArr, iLJIJJLI, c19926712xt);
                            if (i3 == c19926712xt.LIZ) {
                                c19888612rk.LJ(Double.longBitsToDouble(C19926512xr.LIZLLL(iLJ, bArr)));
                            }
                        }
                    }
                    return iLJIJJLI;
                }
                return iLJ;
            case 19:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                if (i5 == 2) {
                    return C19926512xr.LJIIJJI(bArr, iLJ, interfaceC19921012wyLJIILL2, c19926712xt);
                }
                if (i5 == 5) {
                    C19888112rf c19888112rf = (C19888112rf) interfaceC19921012wyLJIILL2;
                    c19888112rf.LJ(Float.intBitsToFloat(C19926512xr.LIZJ(iLJ, bArr)));
                    while (true) {
                        iLJIJJLI = iLJ + 4;
                        if (iLJIJJLI < i2) {
                            iLJ = C19926512xr.LJIJI(bArr, iLJIJJLI, c19926712xt);
                            if (i3 == c19926712xt.LIZ) {
                                c19888112rf.LJ(Float.intBitsToFloat(C19926512xr.LIZJ(iLJ, bArr)));
                            }
                        }
                    }
                    return iLJIJJLI;
                }
                return iLJ;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return C19926512xr.LJIILL(bArr, iLJ, interfaceC19921012wyLJIILL2, c19926712xt);
                }
                if (i5 == 0) {
                    C19888812rm c19888812rm = (C19888812rm) interfaceC19921012wyLJIILL2;
                    iLJIJJLI = C19926512xr.LJIJJLI(bArr, iLJ, c19926712xt);
                    c19888812rm.LJ(c19926712xt.LIZIZ);
                    while (iLJIJJLI < i2) {
                        int iLJIJI = C19926512xr.LJIJI(bArr, iLJIJJLI, c19926712xt);
                        if (i3 == c19926712xt.LIZ) {
                            iLJIJJLI = C19926512xr.LJIJJLI(bArr, iLJIJI, c19926712xt);
                            c19888812rm.LJ(c19926712xt.LIZIZ);
                        } else {
                            return iLJIJJLI;
                        }
                    }
                    return iLJIJJLI;
                }
                return iLJ;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C19926512xr.LJIILJJIL(bArr, iLJ, interfaceC19921012wyLJIILL2, c19926712xt);
                }
                if (i5 == 0) {
                    return C19926512xr.LJIJJ(i3, bArr, iLJ, i2, interfaceC19921012wyLJIILL2, c19926712xt);
                }
                return iLJ;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return C19926512xr.LJIIJ(bArr, iLJ, interfaceC19921012wyLJIILL2, c19926712xt);
                }
                if (i5 == 1) {
                    C19888812rm c19888812rm2 = (C19888812rm) interfaceC19921012wyLJIILL2;
                    c19888812rm2.LJ(C19926512xr.LIZLLL(iLJ, bArr));
                    while (true) {
                        iLJIJJLI = iLJ + 8;
                        if (iLJIJJLI < i2) {
                            iLJ = C19926512xr.LJIJI(bArr, iLJIJJLI, c19926712xt);
                            if (i3 == c19926712xt.LIZ) {
                                c19888812rm2.LJ(C19926512xr.LIZLLL(iLJ, bArr));
                            }
                        }
                    }
                    return iLJIJJLI;
                }
                return iLJ;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return C19926512xr.LJIIIZ(bArr, iLJ, interfaceC19921012wyLJIILL2, c19926712xt);
                }
                if (i5 == 5) {
                    C19889012ro c19889012ro = (C19889012ro) interfaceC19921012wyLJIILL2;
                    c19889012ro.LJJLL(C19926512xr.LIZJ(iLJ, bArr));
                    while (true) {
                        iLJIJJLI = iLJ + 4;
                        if (iLJIJJLI < i2) {
                            iLJ = C19926512xr.LJIJI(bArr, iLJIJJLI, c19926712xt);
                            if (i3 == c19926712xt.LIZ) {
                                c19889012ro.LJJLL(C19926512xr.LIZJ(iLJ, bArr));
                            }
                        }
                    }
                    return iLJIJJLI;
                }
                return iLJ;
            case 25:
            case 42:
                if (i5 == 2) {
                    return C19926512xr.LJII(bArr, iLJ, interfaceC19921012wyLJIILL2, c19926712xt);
                }
                if (i5 == 0) {
                    C19888412ri c19888412ri = (C19888412ri) interfaceC19921012wyLJIILL2;
                    iLJIJJLI = C19926512xr.LJIJJLI(bArr, iLJ, c19926712xt);
                    if (c19926712xt.LIZIZ != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c19888412ri.LJ(z);
                    while (iLJIJJLI < i2) {
                        int iLJIJI2 = C19926512xr.LJIJI(bArr, iLJIJJLI, c19926712xt);
                        if (i3 == c19926712xt.LIZ) {
                            iLJIJJLI = C19926512xr.LJIJJLI(bArr, iLJIJI2, c19926712xt);
                            if (c19926712xt.LIZIZ != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c19888412ri.LJ(z2);
                        } else {
                            return iLJIJJLI;
                        }
                    }
                    return iLJIJJLI;
                }
                return iLJ;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        iLJIJJLI = C19926512xr.LJIJI(bArr, iLJ, c19926712xt);
                        int i8 = c19926712xt.LIZ;
                        if (i8 >= 0) {
                            if (i8 == 0) {
                                interfaceC19921012wyLJIILL2.add("");
                            } else {
                                interfaceC19921012wyLJIILL2.add(new String(bArr, iLJIJJLI, i8, C19922012x8.LIZ));
                                iLJIJJLI += i8;
                            }
                            while (iLJIJJLI < i2) {
                                int iLJIJI3 = C19926512xr.LJIJI(bArr, iLJIJJLI, c19926712xt);
                                if (i3 == c19926712xt.LIZ) {
                                    iLJIJJLI = C19926512xr.LJIJI(bArr, iLJIJI3, c19926712xt);
                                    int i9 = c19926712xt.LIZ;
                                    if (i9 >= 0) {
                                        if (i9 == 0) {
                                            interfaceC19921012wyLJIILL2.add("");
                                        } else {
                                            interfaceC19921012wyLJIILL2.add(new String(bArr, iLJIJJLI, i9, C19922012x8.LIZ));
                                            iLJIJJLI += i9;
                                        }
                                    } else {
                                        throw C19926612xs.LJFF();
                                    }
                                }
                            }
                        } else {
                            throw C19926612xs.LJFF();
                        }
                    } else {
                        iLJIJJLI = C19926512xr.LJIJI(bArr, iLJ, c19926712xt);
                        int i10 = c19926712xt.LIZ;
                        if (i10 >= 0) {
                            if (i10 == 0) {
                                interfaceC19921012wyLJIILL2.add("");
                            } else {
                                int i11 = iLJIJJLI + i10;
                                if (C19920112wp.LIZ.LJ(0, bArr, iLJIJJLI, i11) == 0) {
                                    interfaceC19921012wyLJIILL2.add(new String(bArr, iLJIJJLI, i10, C19922012x8.LIZ));
                                    iLJIJJLI = i11;
                                } else {
                                    throw C19926612xs.LIZJ();
                                }
                            }
                            while (iLJIJJLI < i2) {
                                int iLJIJI4 = C19926512xr.LJIJI(bArr, iLJIJJLI, c19926712xt);
                                if (i3 == c19926712xt.LIZ) {
                                    iLJIJJLI = C19926512xr.LJIJI(bArr, iLJIJI4, c19926712xt);
                                    int i12 = c19926712xt.LIZ;
                                    if (i12 >= 0) {
                                        if (i12 == 0) {
                                            interfaceC19921012wyLJIILL2.add("");
                                        } else {
                                            int i13 = iLJIJJLI + i12;
                                            if (C19920112wp.LIZ.LJ(0, bArr, iLJIJJLI, i13) == 0) {
                                                interfaceC19921012wyLJIILL2.add(new String(bArr, iLJIJJLI, i12, C19922012x8.LIZ));
                                                iLJIJJLI = i13;
                                            } else {
                                                throw C19926612xs.LIZJ();
                                            }
                                        }
                                    } else {
                                        throw C19926612xs.LJFF();
                                    }
                                }
                            }
                        } else {
                            throw C19926612xs.LJFF();
                        }
                    }
                    return iLJIJJLI;
                }
                return iLJ;
            case 27:
                if (i5 == 2) {
                    return C19926512xr.LJI(LJIILJJIL(i6), i3, bArr, iLJ, i2, interfaceC19921012wyLJIILL2, c19926712xt);
                }
                return iLJ;
            case 28:
                if (i5 == 2) {
                    iLJIJJLI = C19926512xr.LJIJI(bArr, iLJ, c19926712xt);
                    int i14 = c19926712xt.LIZ;
                    if (i14 >= 0) {
                        if (i14 <= bArr.length - iLJIJJLI) {
                            if (i14 == 0) {
                                interfaceC19921012wyLJIILL2.add(AbstractC19922812xG.EMPTY);
                            } else {
                                interfaceC19921012wyLJIILL2.add(AbstractC19922812xG.copyFrom(bArr, iLJIJJLI, i14));
                                iLJIJJLI += i14;
                            }
                            while (iLJIJJLI < i2) {
                                int iLJIJI5 = C19926512xr.LJIJI(bArr, iLJIJJLI, c19926712xt);
                                if (i3 == c19926712xt.LIZ) {
                                    iLJIJJLI = C19926512xr.LJIJI(bArr, iLJIJI5, c19926712xt);
                                    int i15 = c19926712xt.LIZ;
                                    if (i15 >= 0) {
                                        if (i15 <= bArr.length - iLJIJJLI) {
                                            if (i15 == 0) {
                                                interfaceC19921012wyLJIILL2.add(AbstractC19922812xG.EMPTY);
                                            } else {
                                                interfaceC19921012wyLJIILL2.add(AbstractC19922812xG.copyFrom(bArr, iLJIJJLI, i15));
                                                iLJIJJLI += i15;
                                            }
                                        } else {
                                            throw C19926612xs.LJII();
                                        }
                                    } else {
                                        throw C19926612xs.LJFF();
                                    }
                                } else {
                                    return iLJIJJLI;
                                }
                            }
                            return iLJIJJLI;
                        }
                        throw C19926612xs.LJII();
                    }
                    throw C19926612xs.LJFF();
                }
                return iLJ;
            case 30:
            case 44:
                if (i5 == 2) {
                    iLJIJJ = C19926512xr.LJIILJJIL(bArr, iLJ, interfaceC19921012wyLJIILL2, c19926712xt);
                } else {
                    if (i5 == 0) {
                        iLJIJJ = C19926512xr.LJIJJ(i3, bArr, iLJ, i2, interfaceC19921012wyLJIILL2, c19926712xt);
                    }
                    return iLJ;
                }
                C19928512yB.LJIIJ(t, i4, interfaceC19921012wyLJIILL2, LJIIL(i6), null, this.LJIILIIL);
                return iLJIJJ;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
            case 47:
                if (i5 == 2) {
                    return C19926512xr.LJIIL(bArr, iLJ, interfaceC19921012wyLJIILL2, c19926712xt);
                }
                if (i5 == 0) {
                    C19889012ro c19889012ro2 = (C19889012ro) interfaceC19921012wyLJIILL2;
                    iLJIJJLI = C19926512xr.LJIJI(bArr, iLJ, c19926712xt);
                    c19889012ro2.LJJLL(AbstractC19927312xz.LIZLLL(c19926712xt.LIZ));
                    while (iLJIJJLI < i2) {
                        int iLJIJI6 = C19926512xr.LJIJI(bArr, iLJIJJLI, c19926712xt);
                        if (i3 == c19926712xt.LIZ) {
                            iLJIJJLI = C19926512xr.LJIJI(bArr, iLJIJI6, c19926712xt);
                            c19889012ro2.LJJLL(AbstractC19927312xz.LIZLLL(c19926712xt.LIZ));
                        } else {
                            return iLJIJJLI;
                        }
                    }
                    return iLJIJJLI;
                }
                return iLJ;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
            case 48:
                if (i5 == 2) {
                    return C19926512xr.LJIILIIL(bArr, iLJ, interfaceC19921012wyLJIILL2, c19926712xt);
                }
                if (i5 == 0) {
                    C19888812rm c19888812rm3 = (C19888812rm) interfaceC19921012wyLJIILL2;
                    iLJIJJLI = C19926512xr.LJIJJLI(bArr, iLJ, c19926712xt);
                    c19888812rm3.LJ(AbstractC19927312xz.LJ(c19926712xt.LIZIZ));
                    while (iLJIJJLI < i2) {
                        int iLJIJI7 = C19926512xr.LJIJI(bArr, iLJIJJLI, c19926712xt);
                        if (i3 == c19926712xt.LIZ) {
                            iLJIJJLI = C19926512xr.LJIJJLI(bArr, iLJIJI7, c19926712xt);
                            c19888812rm3.LJ(AbstractC19927312xz.LJ(c19926712xt.LIZIZ));
                        } else {
                            return iLJIJJLI;
                        }
                    }
                    return iLJIJJLI;
                }
                return iLJ;
            case 49:
                if (i5 == 3) {
                    InterfaceC19924912xb interfaceC19924912xbLJIILJJIL = LJIILJJIL(i6);
                    int i16 = (i3 & (-8)) | 4;
                    iLJ = C19926512xr.LJ(interfaceC19924912xbLJIILJJIL, bArr, iLJ, i2, i16, c19926712xt);
                    interfaceC19921012wyLJIILL2.add(c19926712xt.LIZJ);
                    while (iLJ < i2) {
                        int iLJIJI8 = C19926512xr.LJIJI(bArr, iLJ, c19926712xt);
                        if (i3 == c19926712xt.LIZ) {
                            iLJ = C19926512xr.LJ(interfaceC19924912xbLJIILJJIL, bArr, iLJIJI8, i2, i16, c19926712xt);
                            interfaceC19921012wyLJIILL2.add(c19926712xt.LIZJ);
                        }
                    }
                }
                return iLJ;
            default:
                return iLJ;
        }
    }

    public C19928312y9(int[] iArr, Object[] objArr, int i, int i2, InterfaceC19925612xi interfaceC19925612xi, boolean z, int[] iArr2, int i3, int i4, InterfaceC19921912x7 interfaceC19921912x7, InterfaceC19931012ya interfaceC19931012ya, AbstractC19929412yK<?, ?> abstractC19929412yK, AbstractC19929512yL<?> abstractC19929512yL, InterfaceC19930412yU interfaceC19930412yU) {
        boolean z2;
        this.LIZ = iArr;
        this.LIZIZ = objArr;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJI = interfaceC19925612xi instanceof AbstractC19924712xZ;
        if (abstractC19929512yL != null && abstractC19929512yL.LJ(interfaceC19925612xi)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJFF = z2;
        this.LJII = z;
        this.LJIIIIZZ = iArr2;
        this.LJIIIZ = i3;
        this.LJIIJ = i4;
        this.LJIIJJI = interfaceC19921912x7;
        this.LJIIL = interfaceC19931012ya;
        this.LJIILIIL = abstractC19929412yK;
        this.LJIILJJIL = abstractC19929512yL;
        this.LJ = interfaceC19925612xi;
        this.LJIILL = interfaceC19930412yU;
    }
}
