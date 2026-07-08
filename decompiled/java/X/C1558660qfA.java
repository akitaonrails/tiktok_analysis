package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AwS425S0200000_24;

/* JADX INFO: renamed from: X.0qfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558660qfA {
    public static final AwS425S0200000_24 LIZ(AbstractC20085213iM abstractC20085213iM, Lifecycle lifecycle) {
        Context context;
        Integer numLIZ;
        if (lifecycle != null && (lifecycle instanceof AbstractC1563340qmi)) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycle;
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.MAIN;
            if (abstractC1563340qmi.LJI(enumC682280QpW)) {
                Object obj = abstractC1563340qmi.LL;
                if ((obj instanceof C199Y) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) obj))) != null) {
                    AwS425S0200000_24 awS425S0200000_24LIZIZ = LIZIZ(abstractC20085213iM, lifecycle);
                    C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                    return awS425S0200000_24LIZIZ;
                }
            }
        }
        return LIZIZ(abstractC20085213iM, lifecycle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0qfB, androidx.lifecycle.LifecycleObserver] */
    public static final AwS425S0200000_24 LIZIZ(final AbstractC20085213iM abstractC20085213iM, Lifecycle lifecycle) {
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) > 0) {
            ?? r2 = new LifecycleEventObserver() { // from class: X.0qfB
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    AbstractC20085213iM abstractC20085213iM2 = abstractC20085213iM;
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        abstractC20085213iM2.LIZLLL();
                    }
                }
            };
            lifecycle.addObserver(r2);
            return new AwS425S0200000_24(lifecycle, (C1558670qfB) r2, 3);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot configure ");
        sbLIZ.append(abstractC20085213iM);
        sbLIZ.append(" to disposeComposition at Lifecycle ON_DESTROY: ");
        sbLIZ.append(lifecycle);
        sbLIZ.append("is already destroyed");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }
}
