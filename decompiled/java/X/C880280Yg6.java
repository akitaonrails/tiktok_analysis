package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Yg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880280Yg6 {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZIZ(X.C880310Yg9 r6) {
        /*
            int r5 = r6.LIZ
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r5 <= 0) goto L2f
            r1 = 1
            boolean r0 = r6.LJIIIIZZ
            if (r0 == 0) goto L30
        L13:
            boolean r0 = r6.LIZIZ
            if (r0 != 0) goto L63
            boolean r0 = r6.LJ
            if (r0 != 0) goto L63
            com.ss.android.ugc.aweme.inbox.filter.FilterTabType r1 = r6.LJIIJ
            com.ss.android.ugc.aweme.inbox.filter.FilterTabType r0 = com.ss.android.ugc.aweme.inbox.filter.FilterTabType.SPAM
            if (r1 == r0) goto L63
            if (r2 == 0) goto L43
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.0Yg8 r0 = X.EnumC880300Yg8.RED_NUM
            r2.<init>(r1, r0)
            return r2
        L2f:
            r1 = 0
        L30:
            r2 = 0
            if (r1 != 0) goto L13
            boolean r0 = r6.LJI
            if (r0 != 0) goto L13
            boolean r0 = r6.LJIIIZ
            if (r0 != 0) goto L13
            kotlin.Pair r2 = new kotlin.Pair
            X.0Yg8 r0 = X.EnumC880300Yg8.NONE
            r2.<init>(r4, r0)
            return r2
        L43:
            boolean r0 = r6.LJII
            if (r0 == 0) goto L4f
            kotlin.Pair r2 = new kotlin.Pair
            X.0Yg8 r0 = X.EnumC880300Yg8.RED_NUM
            r2.<init>(r3, r0)
            return r2
        L4f:
            boolean r0 = r6.LJIIIZ
            if (r0 == 0) goto L5b
            kotlin.Pair r2 = new kotlin.Pair
            X.0Yg8 r0 = X.EnumC880300Yg8.RED_DOT
            r2.<init>(r3, r0)
            return r2
        L5b:
            kotlin.Pair r2 = new kotlin.Pair
            X.0Yg8 r0 = X.EnumC880300Yg8.RED_DOT
            r2.<init>(r4, r0)
            return r2
        L63:
            if (r5 <= 0) goto L75
            boolean r0 = r6.LJIIIIZZ
            if (r0 == 0) goto L75
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.0Yg8 r0 = X.EnumC880300Yg8.GRAY_NUM
            r2.<init>(r1, r0)
            return r2
        L75:
            boolean r0 = r6.LJII
            if (r0 == 0) goto L81
            kotlin.Pair r2 = new kotlin.Pair
            X.0Yg8 r0 = X.EnumC880300Yg8.GRAY_NUM
            r2.<init>(r3, r0)
            return r2
        L81:
            boolean r0 = r6.LJIIIZ
            if (r0 == 0) goto L8d
            kotlin.Pair r2 = new kotlin.Pair
            X.0Yg8 r0 = X.EnumC880300Yg8.GRAY_DOT
            r2.<init>(r3, r0)
            return r2
        L8d:
            kotlin.Pair r2 = new kotlin.Pair
            X.0Yg8 r0 = X.EnumC880300Yg8.GRAY_DOT
            r2.<init>(r4, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C880280Yg6.LIZIZ(X.0Yg9):kotlin.Pair");
    }

    public static int LIZLLL(C0Y8T c0y8t) {
        if (c0y8t == null) {
            return 0;
        }
        int unreadCount = (int) c0y8t.getUnreadCount();
        if (unreadCount > 0) {
            return unreadCount;
        }
        Pair<Boolean, Boolean> pairLIZ = C876830YaX.LIZ(c0y8t);
        boolean zBooleanValue = pairLIZ.getFirst().booleanValue();
        boolean zBooleanValue2 = pairLIZ.getSecond().booleanValue();
        if (!zBooleanValue || !zBooleanValue2) {
            return 0;
        }
        return 1;
    }

    public static AbstractC884010Ym7 LIZ(EnumC880300Yg8 enumC880300Yg8, int i) {
        int i2 = C880290Yg7.LIZ[enumC880300Yg8.ordinal()];
        if (i2 == 1) {
            return null;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 == 5) {
                        return new C880330YgB(i, R.attr.a1p);
                    }
                    throw new C1954807lC();
                }
                return new C880330YgB(i, R.attr.a04);
            }
            return new C880340YgC(i, R.attr.a03, R.attr.a1k);
        }
        return new C880340YgC(i, R.attr.a04, R.attr.zi);
    }

    public static AbstractC884010Ym7 LIZJ(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, FilterTabType filterTabType, boolean z6) {
        Pair pairLIZIZ = LIZIZ(new C880310Yg9(i, z2, false, false, z3, false, z, z4, z5, z6, filterTabType));
        return LIZ((EnumC880300Yg8) pairLIZIZ.getSecond(), ((Number) pairLIZIZ.getFirst()).intValue());
    }
}
