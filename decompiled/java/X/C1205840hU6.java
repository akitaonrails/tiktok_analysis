package X;

import X.C1205840hU6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0hU6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205840hU6 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(671));

    public static Map LIZ() {
        return (Map) LIZ.getValue();
    }

    public static InterfaceC736910SvR LIZIZ(final Lifecycle lifecycle, C19719912Dl c19719912Dl) {
        if (LIZ().get(lifecycle) == null) {
            LIZ().put(lifecycle, new LinkedHashMap());
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistRepoManager$getRepository$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1205840hU6.LIZ().remove(lifecycle);
                    }
                }
            });
        }
        Map map = (Map) LIZ().get(lifecycle);
        InterfaceC736910SvR interfaceC736910SvR = null;
        if (map != null) {
            interfaceC736910SvR = (InterfaceC736910SvR) map.get(c19719912Dl.toString());
        }
        if (!(interfaceC736910SvR instanceof InterfaceC736910SvR) || interfaceC736910SvR == null) {
            interfaceC736910SvR = (InterfaceC736910SvR) C09R7.LIZ(c19719912Dl).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (map == null) {
                LIZ().put(lifecycle, new LinkedHashMap());
            }
            Map map2 = (Map) LIZ().get(lifecycle);
            if (map2 != null) {
                map2.put(c19719912Dl.toString(), interfaceC736910SvR);
            }
        }
        return interfaceC736910SvR;
    }
}
