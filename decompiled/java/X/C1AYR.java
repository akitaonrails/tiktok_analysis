package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1AYR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C1AYR {
    public static final /* synthetic */ int LJIIJ = 0;
    public final AtomicBoolean LIZ;
    public final boolean LIZIZ;
    public final Context LIZJ;
    public final InterfaceC2181151AXx LIZLLL;
    public final C2181141AXw LJ;
    public final int LJFF;
    public int LJI;
    public final C01GW LJII = C452501pT.LIZIZ(new C1AYZ(this));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C2181181AYa(this));
    public Layout LJIIIZ;

    public void LIZ() {
        C1AZW.LJFF(LJIIJJI(122), "clear", null, null);
        LIZLLL().LIZ();
        LJ().LIZ();
    }

    public final C1AYW LIZLLL() {
        return (C1AYW) this.LJII.getValue();
    }

    public final C1AYU LJ() {
        return (C1AYU) this.LJIIIIZZ.getValue();
    }

    public final Set<String> LJII() {
        HashSet hashSet = new HashSet();
        Iterator<C1AX3> it2 = LIZIZ().iterator();
        while (it2.hasNext()) {
            String str = it2.next().LIZ.LIZJ;
            if (str != null) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final boolean LJIIJ() {
        return this.LIZIZ || this.LIZ.get();
    }

    public List<C1AX3> LIZIZ() {
        return (LJIIJ() ? LIZLLL() : LJ()).LJI;
    }

    public String LJIIIIZZ() {
        return LJIIJ() ? LIZLLL().LJFF : LJ().LJFF;
    }

    public final List<PosIdentity> LJIIIZ() {
        return (LJIIJ() ? LIZLLL() : LJ()).LJII;
    }

    public static String LJIIJJI(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.LAYOUT.getValue());
        sbLIZ.append("_MicDataCenter_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Layout LIZJ(boolean z) {
        if (LJIIJ()) {
            Layout layout = LIZLLL().LJ;
            if (layout == null) {
                if (z) {
                    return LJ().LJ;
                }
                return null;
            }
            return layout;
        }
        return LJ().LJ;
    }

    public C1AX3 LJFF(int i) {
        if (LJIIJ()) {
            C1AX3 c1ax3LJIIIIZZ = LIZLLL().LJIIIIZZ(i);
            String strLJIIJJI = LJIIJJI(113);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getMicWindow = ");
            sbLIZ.append(i);
            sbLIZ.append(" - ");
            sbLIZ.append(c1ax3LJIIIIZZ);
            C1AZW.LJIIJ(12, strLJIIJJI, C2188811AlT.LIZIZ(sbLIZ), null, null);
            return c1ax3LJIIIIZZ;
        }
        return LJ().LJIIIIZZ(i);
    }

    public C1AX3 LJI(String str) {
        C1AX3 c1ax3 = null;
        if (LJIIJ()) {
            Iterator<C1AX3> it2 = LIZLLL().LJI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1AX3 next = it2.next();
                if (Intrinsics.LJFF(str, next.LIZ.LIZJ)) {
                    c1ax3 = next;
                    break;
                }
            }
            return c1ax3;
        }
        Iterator<C1AX3> it3 = LJ().LJI.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C1AX3 next2 = it3.next();
            if (Intrinsics.LJFF(str, next2.LIZ.LIZJ)) {
                c1ax3 = next2;
                break;
            }
        }
        return c1ax3;
    }

    public void LJIIL(String str) {
        String strLJIIJJI = LJIIJJI(88);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeMicDataByLinkMicId linkMicId = ");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLJIIJJI, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LIZLLL().LJ(str);
        LJ().LJ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIILIIL(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.LJIIJ()
            if (r0 == 0) goto L3d
            X.1AYW r2 = r3.LIZLLL()
        La:
            int r1 = r3.LJFF
            r0 = 4
            if (r1 != r0) goto L1c
            X.0Zzw r1 = X.C918060Zzw.LIZ
            boolean r0 = r3.LIZIZ
            r1.getClass()
            boolean r0 = X.C918060Zzw.LIZ(r0)
            if (r0 != 0) goto L2c
        L1c:
            int r0 = r3.LJFF
            if (r0 != 0) goto L72
            java.util.List<tikcast.linkmic.common.PosIdentity> r0 = r2.LJII
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L72
        L2c:
            java.util.List<tikcast.linkmic.common.PosIdentity> r0 = r2.LJII
            java.lang.Object r2 = X.C13LP.LJJJLZIJ(r4, r0)
            tikcast.linkmic.common.PosIdentity r2 = (tikcast.linkmic.common.PosIdentity) r2
            if (r2 != 0) goto L42
            X.1AXx r0 = r3.LIZLLL
            int r0 = r0.LJIILLIIL(r4)
            return r0
        L3d:
            X.1AYU r2 = r3.LJ()
            goto La
        L42:
            int r0 = r2.type
            if (r0 != 0) goto L5a
            java.lang.String r0 = r2.value
            java.lang.Integer r0 = X.C500260Jjc.LJJLIIJ(r0)
            if (r0 == 0) goto L53
            int r0 = r0.intValue()
            return r0
        L53:
            X.1AXx r0 = r3.LIZLLL
            int r0 = r0.LJIILLIIL(r4)
            return r0
        L5a:
            X.1AXx r1 = r3.LIZLLL
            java.lang.String r0 = r2.value
            com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo r0 = r1.LJIJI(r0)
            if (r0 == 0) goto L6b
            com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo r0 = r0.micPositionData
            if (r0 == 0) goto L6b
            int r0 = r0.position
            return r0
        L6b:
            X.1AXx r0 = r3.LIZLLL
            int r0 = r0.LJIILLIIL(r4)
            return r0
        L72:
            X.1AXx r0 = r3.LIZLLL
            int r0 = r0.LJIILLIIL(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AYR.LJIILIIL(int):int");
    }

    public final boolean LJIJ(List<PosIdentity> list) {
        C1AYS c1aysLJ;
        if (list.isEmpty()) {
            return false;
        }
        if (LJIIJ()) {
            c1aysLJ = LIZLLL();
        } else {
            c1aysLJ = LJ();
        }
        return c1aysLJ.LJII(list);
    }

    public void LJIILJJIL(Layout layout, boolean z) {
        String strLJIIJJI = LJIIJJI(66);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLayout layoutId=");
        sbLIZ.append(layout.layoutId);
        C1AZW.LJIIJ(12, strLJIIJJI, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LJIIIZ = layout;
        if (!LJIIJ() && !z) {
            LJ().LJFF(layout);
        } else {
            LIZLLL().LJFF(layout);
        }
    }

    public boolean LJIILLIIL(C1AXI c1axi, FrameLayout frameLayout) {
        String strLJIIJJI = LJIIJJI(49);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateOrInsertMicData linked = ");
        sbLIZ.append(LJIIJ());
        sbLIZ.append(" data = ");
        sbLIZ.append(c1axi);
        C1AZW.LJIIJ(12, strLJIIJJI, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (LJIIJ()) {
            return LIZLLL().LJI(c1axi, frameLayout);
        }
        return LJ().LJI(c1axi, frameLayout);
    }

    public C1AYR(AtomicBoolean atomicBoolean, boolean z, Context context, InterfaceC2181151AXx interfaceC2181151AXx, C2181141AXw c2181141AXw, int i) {
        this.LIZ = atomicBoolean;
        this.LIZIZ = z;
        this.LIZJ = context;
        this.LIZLLL = interfaceC2181151AXx;
        this.LJ = c2181141AXw;
        this.LJFF = i;
    }
}
