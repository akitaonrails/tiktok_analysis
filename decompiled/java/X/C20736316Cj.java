package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: X.16Cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20736316Cj {
    public static final ThreadLocal<TypedValue> LIZ = new ThreadLocal<>();
    public static final SparseArray<SparseIntArray> LIZIZ = new SparseArray<>();

    public static TypedValue LIZ() {
        ThreadLocal<TypedValue> threadLocal = LIZ;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        typedValue.type = 0;
        typedValue.string = null;
        typedValue.data = 0;
        typedValue.assetCookie = 0;
        typedValue.resourceId = 0;
        typedValue.changingConfigurations = -1;
        typedValue.density = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            typedValue.sourceResourceId = 0;
        }
        return typedValue;
    }

    public static int LIZIZ(int i, Context context) {
        TypedValue typedValueLIZ = LIZ();
        context.getTheme().resolveAttribute(i, typedValueLIZ, true);
        return typedValueLIZ.data;
    }

    public static int LIZJ(int i, View view) {
        return LIZIZ(i, view.getContext());
    }

    public static C20743516Fd LIZLLL(int i, Context context) {
        C783370UoB c783370UoB = C783380UoC.LIZ;
        int iLJ = LJ(i, context);
        c783370UoB.getClass();
        Drawable drawableLIZ = C783370UoB.LIZ(iLJ, context);
        if (drawableLIZ == null) {
            return null;
        }
        return new C20743516Fd(drawableLIZ);
    }

    public static int LJ(int i, Context context) {
        int iLIZ;
        InterfaceC783390UoD interfaceC783390UoDLJI = C011Z.LIZ.LJI();
        if (interfaceC783390UoDLJI != null && (iLIZ = interfaceC783390UoDLJI.LIZ()) != 0) {
            return LJII(iLIZ, i, context);
        }
        return -1;
    }

    public static Drawable LJI(int i, Context context) {
        int iLJII = LJII(C011Z.LIZ.LJII(), i, context);
        if (iLJII != -1) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = iLJII;
            return c0hti.LIZ(context);
        }
        return null;
    }

    public static int LJFF(Context context, TypedArray typedArray, int i) {
        int iLIZ;
        if (!typedArray.hasValue(i)) {
            return -1;
        }
        TypedValue typedValueLIZ = LIZ();
        typedArray.getValue(i, typedValueLIZ);
        if (typedValueLIZ.type == 2) {
            InterfaceC783390UoD interfaceC783390UoDLJI = C011Z.LIZ.LJI();
            if (interfaceC783390UoDLJI == null || (iLIZ = interfaceC783390UoDLJI.LIZ()) == 0) {
                return -1;
            }
            return LJII(iLIZ, typedValueLIZ.data, context);
        }
        return typedValueLIZ.resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJII(int r4, int r5, android.content.Context r6) {
        /*
            r3 = -1
            if (r4 != 0) goto L4
            return r3
        L4:
            android.util.SparseArray<android.util.SparseIntArray> r0 = X.C20736316Cj.LIZIZ
            java.lang.Object r2 = r0.get(r4)
            android.util.SparseIntArray r2 = (android.util.SparseIntArray) r2
            if (r2 == 0) goto L15
            int r1 = r2.get(r5, r3)     // Catch: java.lang.Exception -> L1e
            if (r1 != r3) goto L4c
            goto L34
        L15:
            android.util.SparseIntArray r2 = new android.util.SparseIntArray
            r2.<init>()
            r0.put(r4, r2)
            goto L33
        L1e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0fFP r0 = X.C011Z.LIZ
            X.0fFK r0 = r0.LIZIZ()
            if (r0 == 0) goto L33
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ThemeAttributeResolver"
            X.C20441214yg.LJ(r0, r1)
        L33:
            r1 = -1
        L34:
            if (r6 == 0) goto L4c
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r0[r1] = r5
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r4, r0)
            int r1 = r0.getResourceId(r1, r3)
            if (r1 == r3) goto L49
            r2.put(r5, r1)
        L49:
            r0.recycle()
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20736316Cj.LJII(int, int, android.content.Context):int");
    }
}
