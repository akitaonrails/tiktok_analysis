package X;

import X.C1803670x2L;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800490wxD {
    public static final AnonymousClass1991 LIZIZ(InterfaceC214902198i interfaceC214902198i) {
        return C1803670x2L.LIZ.get(interfaceC214902198i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(final InterfaceC214902198i interfaceC214902198i, AnonymousClass1991 anonymousClass1991) {
        if (((Boolean) C18071075x.LIZ.getValue()).booleanValue()) {
            Fragment fragment = (Fragment) interfaceC214902198i;
            final WeakReference weakReference = new WeakReference(interfaceC214902198i);
            AnonymousClass1991 anonymousClass19912 = C1803670x2L.LIZ.get(interfaceC214902198i);
            if (anonymousClass19912 == null) {
                fragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.SceneConfig$bindConfig$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        Object obj;
                        if (event == Lifecycle.Event.ON_DESTROY && (obj = weakReference.get()) != null) {
                            C1803670x2L.LIZ.remove(obj);
                        }
                    }
                });
            }
            if (Intrinsics.LJFF(anonymousClass19912, anonymousClass1991)) {
                return;
            }
        } else {
            Fragment fragment2 = (Fragment) interfaceC214902198i;
            AnonymousClass1991 anonymousClass19913 = C1803670x2L.LIZ.get(interfaceC214902198i);
            if (anonymousClass19913 == null) {
                fragment2.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.SceneConfig$bindConfig$2
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1803670x2L.LIZ.remove(interfaceC214902198i);
                        }
                    }
                });
            }
            if (Intrinsics.LJFF(anonymousClass19913, anonymousClass1991)) {
                return;
            }
        }
        C1803670x2L.LIZ.put(interfaceC214902198i, anonymousClass1991);
    }

    public static final void LIZJ(InterfaceC214902198i interfaceC214902198i, int i, Intent intent) {
        SAFFragmentRootScene sAFFragmentRootSceneIb = interfaceC214902198i.ib();
        if (sAFFragmentRootSceneIb != null) {
            C20630415o6.LIZIZ(sAFFragmentRootSceneIb, i, intent);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
