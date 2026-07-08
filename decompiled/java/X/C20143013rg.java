package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.13rg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20143013rg {
    public static final ThreadLocal<TypedValue> LIZ = new ThreadLocal<>();
    public static final WeakHashMap<C838430Wun, SparseArray<C838440Wuo>> LIZIZ = new WeakHashMap<>(0);
    public static final Object LIZJ = new Object();

    public static float LIZIZ(Resources resources, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C20143113rh.LIZ(resources, i);
        }
        ThreadLocal<TypedValue> threadLocal = LIZ;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Resource ID #0x");
        sbLIZ.append(Integer.toHexString(i));
        sbLIZ.append(" type #0x");
        sbLIZ.append(Integer.toHexString(typedValue.type));
        sbLIZ.append(" is not valid");
        throw new Resources.NotFoundException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Typeface LIZJ(int i, Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return LJ(context, i, new TypedValue(), 0, null, false);
    }

    public static void LIZLLL(Context context, int i, AbstractC20142713rd abstractC20142713rd) {
        if (context.isRestricted()) {
            abstractC20142713rd.LIZ(-4);
        } else {
            LJ(context, i, new TypedValue(), 0, abstractC20142713rd, false);
        }
    }

    public static void LIZ(C838430Wun c838430Wun, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (LIZJ) {
            try {
                SparseArray<C838440Wuo> sparseArray = LIZIZ.get(c838430Wun);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    LIZIZ.put(c838430Wun, sparseArray);
                }
                sparseArray.append(i, new C838440Wuo(colorStateList, c838430Wun.LIZ.getConfiguration(), theme));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface LJ(android.content.Context r15, int r16, android.util.TypedValue r17, int r18, X.AbstractC20142713rd r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20143013rg.LJ(android.content.Context, int, android.util.TypedValue, int, X.13rd, boolean):android.graphics.Typeface");
    }
}
