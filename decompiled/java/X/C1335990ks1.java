package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: renamed from: X.0ks1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335990ks1 {
    public static C1331100kk8 LIZIZ(C1331090kk7 c1331090kk7) {
        if (c1331090kk7.LJIIZILJ == null) {
            c1331090kk7.LJIIZILJ = new C1331100kk8();
        }
        return c1331090kk7.LJIIZILJ;
    }

    public static AbstractC1320320kSk LIZJ(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return InterfaceC1320380kSq.LIZ;
            case 1:
                return InterfaceC1320380kSq.LIZIZ;
            case 2:
                return InterfaceC1320380kSq.LIZJ;
            case 3:
                return InterfaceC1320380kSq.LIZLLL;
            case 4:
                return InterfaceC1320380kSq.LJ;
            case 5:
                return InterfaceC1320380kSq.LJFF;
            case 6:
                return InterfaceC1320380kSq.LJI;
            case 7:
                return InterfaceC1320380kSq.LJII;
            case 8:
                return InterfaceC1320380kSq.LJIIIIZZ;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static C1331090kk7 LIZLLL(Context context, AttributeSet attributeSet) {
        C1336010ks3.LIZIZ();
        C1331090kk7 c1331090kk7 = new C1331090kk7(context, context.getResources());
        LJ(c1331090kk7, context, attributeSet);
        C1336010ks3.LIZIZ();
        return c1331090kk7;
    }

    public static Drawable LIZ(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new ColorDrawable(typedValue.data);
            }
            return null;
        }
        return C800330VaR.LIZIZ(context, resourceId);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01eb A[PHI: r0 r7 r8
      0x01eb: PHI (r0v15 boolean) = (r0v13 boolean), (r0v17 boolean) binds: [B:131:0x0204, B:116:0x01e9] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r7v7 boolean) = (r7v5 boolean), (r7v9 boolean) binds: [B:131:0x0204, B:116:0x01e9] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r8v7 boolean) = (r8v5 boolean), (r8v9 boolean) binds: [B:131:0x0204, B:116:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C1331090kk7 r17, android.content.Context r18, android.util.AttributeSet r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1335990ks1.LJ(X.0kk7, android.content.Context, android.util.AttributeSet):void");
    }
}
