package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tracker.TrackerImpl;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h8F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192290h8F {
    public static final InterfaceC665370Q7z LIZIZ(Object obj) {
        if (obj instanceof C19EG) {
            return C1558360qeg.LJI((C19EG) obj, null);
        }
        if (obj instanceof Fragment) {
            return C1558360qeg.LJFF((Fragment) obj, null);
        }
        if (obj instanceof AbstractC738140SxQ) {
            return C1558520qew.LJIIL((AbstractC738140SxQ) obj);
        }
        if (obj instanceof InterfaceC713360RyY) {
            return C1558420qem.LIZIZ((InterfaceC713360RyY) obj);
        }
        if (!(obj instanceof InterfaceC665370Q7z)) {
            return null;
        }
        return (InterfaceC665370Q7z) obj;
    }

    public static final void LIZJ(LifecycleOwner lifecycleOwner, Function1<? super InterfaceC1183590guD, Unit> function1) {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "location_perf_tracker_ext", false) == 0 || (interfaceC665370Q7zLIZIZ = LIZIZ(lifecycleOwner)) == null) {
            return;
        }
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, TrackerImpl.class, null);
        TrackerImpl trackerImpl = (TrackerImpl) interfaceC494301wDLIZ;
        if ((trackerImpl instanceof InterfaceC1183590guD) && Intrinsics.LJFF(trackerImpl.LL, lifecycleOwner) && interfaceC494301wDLIZ != null) {
            function1.invoke(interfaceC494301wDLIZ);
        }
    }

    public static void LIZ(LifecycleOwner lifecycleOwner, String str, String str2, boolean z, String str3, View view, int i) {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        LifecycleOwner lifecycleOwner2;
        InterfaceC665370Q7z interfaceC665370Q7z;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            view = null;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "location_perf_tracker_ext", false) != 0 && (interfaceC665370Q7zLIZIZ = LIZIZ(lifecycleOwner)) != null) {
            TrackerImpl trackerImpl = (TrackerImpl) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, TrackerImpl.class, null);
            if (trackerImpl != null) {
                lifecycleOwner2 = trackerImpl.LL;
            } else {
                lifecycleOwner2 = null;
            }
            if (!Intrinsics.LJFF(lifecycleOwner2, lifecycleOwner)) {
                TrackerImpl trackerImpl2 = new TrackerImpl(lifecycleOwner, str, str2, view);
                trackerImpl2.LLJJL = str3;
                C1558520qew.LJII(interfaceC665370Q7zLIZIZ, trackerImpl2, TrackerImpl.class, null, null);
                if (!z) {
                    TrackerImpl trackerImpl3 = (TrackerImpl) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ.getTree().LJIIIIZZ(), TrackerImpl.class, null);
                    if (trackerImpl3 != null) {
                        ((ArrayList) trackerImpl3.LLILZLL).add(trackerImpl2);
                    }
                    if ((trackerImpl3 instanceof InterfaceC1193730hAZ) && trackerImpl3 != null) {
                        trackerImpl2.LLILZIL = trackerImpl3;
                    }
                }
                if (C1183030gtJ.LIZ().enableLcpTrack > 0 && (lifecycleOwner instanceof InterfaceC665370Q7z) && (interfaceC665370Q7z = (InterfaceC665370Q7z) lifecycleOwner) != null && view != null && (interfaceC665370Q7zLJ = C1558360qeg.LJ(view, "ttls_tracker")) != null) {
                    interfaceC665370Q7zLJ.getTree().LJI();
                    interfaceC665370Q7zLJ.getTree().LIZIZ(interfaceC665370Q7z);
                }
            }
        }
    }
}
