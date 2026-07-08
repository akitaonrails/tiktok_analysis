package X;

import android.app.Activity;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Of, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C325901Of {
    public static final void LIZ(LifecycleOwner lifecycleOwner, LifecycleObserver lifecycleObserver) {
        Lifecycle lifecycle;
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.addObserver(lifecycleObserver);
                return;
            }
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LJ(C2107308Nj.LIZ, new C325801Oe(lifecycleOwner, lifecycleObserver, null));
    }

    public static final void LIZIZ(LifecycleOwner lifecycleOwner, LifecycleObserver lifecycleObserver) {
        Lifecycle lifecycle;
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.addObserver(lifecycleObserver);
                return;
            }
            return;
        }
        C2487409ou.LIZJ(new RunnableC514501zT(lifecycleOwner, lifecycleObserver, 45));
    }

    public static final void LJ(LifecycleOwner lifecycleOwner, LifecycleObserver lifecycleObserver) {
        Lifecycle lifecycle;
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(lifecycleObserver);
                return;
            }
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LJ(C2107308Nj.LIZ, new C325501Ob(lifecycleOwner, lifecycleObserver, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void LIZJ(final LiveData<T> liveData, final LifecycleOwner lifecycleOwner, final Observer<T> observer) {
        if (liveData == null || lifecycleOwner == 0) {
            return;
        }
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            liveData.observe(lifecycleOwner, observer);
            return;
        }
        if (lifecycleOwner instanceof Activity) {
            ((Activity) lifecycleOwner).runOnUiThread(new Runnable() { // from class: X.01Og
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LifecycleExtensionsKt@38c0.observeOnMainThread$1");
                    try {
                        liveData.observe(lifecycleOwner, observer);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LifecycleExtensionsKt@38c0.observeOnMainThread$1");
                }
            });
            return;
        }
        if (lifecycleOwner instanceof Fragment) {
            if (((Number) C326401Ok.LIZ.getValue()).intValue() == 1) {
                C2487409ou.LIZJ(new Runnable() { // from class: X.01Oh
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LifecycleExtensionsKt@38c0.observeOnMainThread$2");
                        try {
                            liveData.observe(lifecycleOwner, observer);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LifecycleExtensionsKt@38c0.observeOnMainThread$2");
                    }
                });
                return;
            } else {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LJ(C2107308Nj.LIZ, new C325601Oc(liveData, lifecycleOwner, observer, null));
                return;
            }
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        C23250099c.LJ(C2107308Nj.LIZ, new C325701Od(liveData, lifecycleOwner, observer, null));
    }

    public static final <T> void LIZLLL(final LiveData<T> liveData, final LifecycleOwner lifecycleOwner, final Observer<T> observer) {
        if (liveData == null || lifecycleOwner == null) {
            return;
        }
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            liveData.observe(lifecycleOwner, observer);
        } else {
            C2487409ou.LIZJ(new Runnable() { // from class: X.01Oi
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LifecycleExtensionsKt@38c0.observeOnMainThreadPost$1");
                    try {
                        liveData.observe(lifecycleOwner, observer);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LifecycleExtensionsKt@38c0.observeOnMainThreadPost$1");
                }
            });
        }
    }
}
