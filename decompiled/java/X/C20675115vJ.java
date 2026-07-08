package X;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.15vJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20675115vJ {
    public static final ConcurrentMap<Integer, AtomicReference<C1155870gBV>> LIZ = new ConcurrentHashMap(2);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static View LIZ(int i, Context context) {
        C1155870gBV c1155870gBV;
        View view;
        Activity activityLIZ;
        Integer numValueOf;
        MutableContextWrapper mutableContextWrapper;
        if (context == null) {
            return null;
        }
        AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) LIZ).get(Integer.valueOf(i));
        if (atomicReference != null && (c1155870gBV = (C1155870gBV) atomicReference.get()) != null && (view = c1155870gBV.LIZ) != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (numValueOf = Integer.valueOf(activityLIZ.hashCode())) != null) {
            if (numValueOf.intValue() == c1155870gBV.LIZIZ) {
                atomicReference.set(null);
                Context context2 = view.getContext();
                if ((context2 instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context2) != null) {
                    mutableContextWrapper.setBaseContext(context);
                }
                return view;
            }
        }
        return null;
    }
}
