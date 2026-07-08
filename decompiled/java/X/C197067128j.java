package X;

import Y.AObjectS403S0100000_29;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.128j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197067128j {
    public final C128Y LIZ;
    public final Function0<Unit> LIZIZ;
    public boolean LJ;
    public Bundle LJFF;
    public boolean LJI;
    public final C197074128q LIZJ = new Object() { // from class: X.128q
    };
    public final Map<String, InterfaceC197061128d> LIZLLL = new LinkedHashMap();
    public boolean LJII = true;

    public final void LIZIZ() {
        if (this.LIZ.getLifecycle().getCurrentState() != Lifecycle.State.INITIALIZED) {
            "Restarter must be created only during owner's initialization stage".toString();
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (!(!this.LJ)) {
            "SavedStateRegistry was already attached.".toString();
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.LIZIZ.invoke();
        this.LIZ.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: X.128m
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C197067128j c197067128j = this.LL;
                if (event == Lifecycle.Event.ON_START) {
                    c197067128j.LJII = true;
                } else {
                    if (event != Lifecycle.Event.ON_STOP) {
                        return;
                    }
                    c197067128j.LJII = false;
                }
            }
        });
        this.LJ = true;
    }

    public final void LIZ(Bundle bundle) {
        if (!this.LJ) {
            LIZIZ();
        }
        if (!this.LIZ.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            if (!this.LJI) {
                Bundle bundleLIZ = null;
                if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    bundleLIZ = C1303050k0t.LIZ(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                this.LJFF = bundleLIZ;
                this.LJI = true;
                return;
            }
            "SavedStateRegistry was already restored.".toString();
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performRestore cannot be called when owner is ");
        sbLIZ.append(this.LIZ.getLifecycle().getCurrentState());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.128q] */
    public C197067128j(C128Y c128y, AObjectS403S0100000_29 aObjectS403S0100000_29) {
        this.LIZ = c128y;
        this.LIZIZ = aObjectS403S0100000_29;
    }
}
