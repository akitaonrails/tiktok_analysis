package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AYX, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AYX extends C1AYR {
    public final Context LJIIJJI;
    public final InterfaceC2181151AXx LJIIL;
    public final C2181141AXw LJIILIIL;
    public final int LJIILJJIL;
    public final C01GW LJIILL;

    public final C1AYY LJIJI() {
        return (C1AYY) this.LJIILL.getValue();
    }

    @Override // X.C1AYR
    public final void LIZ() {
        LJIJI().LIZ();
    }

    @Override // X.C1AYR
    public final List<C1AX3> LIZIZ() {
        return LJIJI().LJI;
    }

    @Override // X.C1AYR
    public final String LJIIIIZZ() {
        return LJIJI().LJFF;
    }

    @Override // X.C1AYR
    public final Layout LIZJ(boolean z) {
        return LJIJI().LJ;
    }

    @Override // X.C1AYR
    public final C1AX3 LJFF(int i) {
        Map<String, OnLineMicInfo> mapLIZ;
        String key;
        String key2;
        C1AYY c1ayyLJIJI = LJIJI();
        Layout layout = c1ayyLJIJI.LJ;
        if (layout == null) {
            C1CC2.LIZ("live currentLayout is null.", new Throwable());
            return c1ayyLJIJI.LJIIIIZZ(i);
        }
        C1AX3 c1ax3 = null;
        if (!layout.isFixedType() && !c1ayyLJIJI.LIZJ.LIZ()) {
            for (Map.Entry<String, OnLineMicInfo> entry : c1ayyLJIJI.LJIIIZ.LJJII().entrySet()) {
                if (c1ayyLJIJI.LJIIIZ.LJIIL()) {
                    MicPositionInfo micPositionInfo = entry.getValue().micPositionData;
                    if (micPositionInfo != null && micPositionInfo.uiPos == i) {
                        key2 = entry.getKey();
                        break;
                    }
                } else {
                    MicPositionInfo micPositionInfo2 = entry.getValue().micPositionData;
                    if (micPositionInfo2 != null && micPositionInfo2.position == i) {
                        key2 = entry.getKey();
                        break;
                    }
                }
            }
            key2 = null;
            Iterator<C1AX3> it2 = c1ayyLJIJI.LJI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1AX3 next = it2.next();
                C1AX3 c1ax32 = next;
                if (key2 != null && Intrinsics.LJFF(c1ax32.LIZ.LIZJ, key2)) {
                    c1ax3 = next;
                    break;
                }
            }
            C1AX3 c1ax33 = c1ax3;
            if (c1ax33 != null) {
                return c1ax33;
            }
            return c1ayyLJIJI.LJIIIIZZ(i);
        }
        if (c1ayyLJIJI.LIZLLL == 2) {
            mapLIZ = c1ayyLJIJI.LJIIIZ.LJJIJIIJIL();
        } else {
            mapLIZ = c1ayyLJIJI.LJIIIZ.LIZ();
        }
        for (Map.Entry<String, OnLineMicInfo> entry2 : mapLIZ.entrySet()) {
            if (c1ayyLJIJI.LJIIIZ.LJIIL()) {
                MicPositionInfo micPositionInfo3 = entry2.getValue().micPositionData;
                if (micPositionInfo3 != null && micPositionInfo3.uiPos == i) {
                    key = entry2.getKey();
                    break;
                }
            } else {
                MicPositionInfo micPositionInfo4 = entry2.getValue().micPositionData;
                if (micPositionInfo4 != null && micPositionInfo4.position == i) {
                    key = entry2.getKey();
                    break;
                }
            }
        }
        key = null;
        Iterator<C1AX3> it3 = c1ayyLJIJI.LJI.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C1AX3 next2 = it3.next();
            C1AX3 c1ax34 = next2;
            if (key != null && Intrinsics.LJFF(c1ax34.LIZ.LIZJ, key)) {
                c1ax3 = next2;
                break;
            }
        }
        C1AX3 c1ax35 = c1ax3;
        if (c1ax35 != null) {
            return c1ax35;
        }
        return c1ayyLJIJI.LJIIIIZZ(i);
    }

    @Override // X.C1AYR
    public final C1AX3 LJI(String str) {
        C1AX3 next;
        Iterator<C1AX3> it2 = LJIJI().LJI.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(str, next.LIZ.LIZJ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    @Override // X.C1AYR
    public final void LJIIL(String str) {
        LJIJI().LJ(str);
    }

    @Override // X.C1AYR
    public final void LJIILJJIL(Layout layout, boolean z) {
        this.LJIIIZ = layout;
        LJIJI().LJFF(layout);
    }

    @Override // X.C1AYR
    public final boolean LJIILLIIL(C1AXI c1axi, FrameLayout frameLayout) {
        return LJIJI().LJI(c1axi, frameLayout);
    }

    public C1AYX(AtomicBoolean atomicBoolean, boolean z, Context context, InterfaceC2181151AXx interfaceC2181151AXx, C2181141AXw c2181141AXw, int i) {
        super(atomicBoolean, z, context, interfaceC2181151AXx, c2181141AXw, i);
        this.LJIIJJI = context;
        this.LJIIL = interfaceC2181151AXx;
        this.LJIILIIL = c2181141AXw;
        this.LJIILJJIL = i;
        this.LJIILL = C452501pT.LIZIZ(new C2181191AYb(this));
    }
}
