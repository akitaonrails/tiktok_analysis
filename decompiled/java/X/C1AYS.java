package X;

import android.content.Context;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1AYS, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1AYS {
    public final Context LIZ;
    public final InterfaceC2181151AXx LIZIZ;
    public final C2181141AXw LIZJ;
    public final int LIZLLL;
    public volatile Layout LJ;
    public volatile String LJFF;
    public final CopyOnWriteArrayList<C1AX3> LJI = new CopyOnWriteArrayList<>();
    public final List<PosIdentity> LJII = new CopyOnWriteArrayList();

    public final void LIZ() {
        C1AZW.LJFF(LIZLLL(210), "clear", null, null);
        this.LJ = null;
        this.LJFF = null;
        for (C1AX3 c1ax3 : this.LJI) {
            SurfaceView surfaceView = c1ax3.LIZ.LIZLLL;
            if (surfaceView != null) {
                C500260Jjc.LJJJLL(surfaceView);
            }
            c1ax3.LIZ.LIZLLL = null;
        }
        this.LJI.clear();
    }

    public static String LIZLLL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.LAYOUT.getValue());
        sbLIZ.append("_BaseDataProvider_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1AX3 LIZIZ(EnumC918810a19 enumC918810a19) {
        C1AXI c1axi = new C1AXI(enumC918810a19, null, null, null, null, null, null, 1008);
        FrameLayout frameLayout = new FrameLayout(this.LIZ);
        frameLayout.setId(R.id.ysm);
        return new C1AX3(c1axi, frameLayout);
    }

    public final void LJ(String str) {
        String strLIZLLL = LIZLLL(191);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeMicDataByLinkMicId linkMicId=");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLIZLLL, C2188811AlT.LIZIZ(sbLIZ), null, null);
        for (C1AX3 c1ax3 : this.LJI) {
            if (Intrinsics.LJFF(c1ax3.LIZ.LIZJ, str)) {
                if (c1ax3 != null) {
                    this.LJI.remove(c1ax3);
                    return;
                }
                return;
            }
        }
    }

    public final void LJFF(Layout layout) {
        String strLIZLLL = LIZLLL(198);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLayout layoutId=");
        sbLIZ.append(layout.layoutId);
        C1AZW.LJIIJ(12, strLIZLLL, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LJ = layout;
        this.LJFF = layout.layoutId;
    }

    public final boolean LJII(List<PosIdentity> list) {
        boolean z;
        if (!Intrinsics.LJFF(this.LJII, list)) {
            ArrayList arrayList = new ArrayList(list);
            ((CopyOnWriteArrayList) this.LJII).clear();
            ((CopyOnWriteArrayList) this.LJII).addAll(arrayList);
            z = true;
        } else {
            z = false;
        }
        String strLIZLLL = LIZLLL(221);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateUIPositions new: ");
        sbLIZ.append(list);
        sbLIZ.append(" old: ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(" result: ");
        sbLIZ.append(z);
        C1AZW.LJIIJ(12, strLIZLLL, C2188811AlT.LIZIZ(sbLIZ), null, null);
        return z;
    }

    public boolean LJI(C1AXI c1axi, FrameLayout frameLayout) {
        int i;
        C1AX3 next;
        C1AXI c1axi2;
        boolean z;
        Object next2;
        Map<String, OnLineMicInfo> mapLJJII;
        MicPositionInfo micPositionInfo;
        String str;
        Long l;
        Long l2;
        boolean zLJFF;
        String string;
        String string2;
        String strLIZLLL = LIZLLL(166);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateOrInsertMicData data=");
        sbLIZ.append(c1axi);
        C1AZW.LJIIJ(12, strLIZLLL, C2188811AlT.LIZIZ(sbLIZ), null, null);
        Iterator<C1AX3> it2 = this.LJI.iterator();
        while (true) {
            i = 0;
            if (it2.hasNext()) {
                next = it2.next();
                C1AX3 c1ax3 = next;
                if (c1axi.LIZJ != null && c1ax3.LIZ.LIZJ != null) {
                    String strLIZLLL2 = LIZLLL(173);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateOrInsertMicData #");
                    sbLIZ2.append(c1axi.LIZJ);
                    sbLIZ2.append("# - #");
                    sbLIZ2.append(c1ax3.LIZ.LIZJ);
                    sbLIZ2.append('#');
                    C1AZW.LJIIJ(12, strLIZLLL2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    String str2 = c1ax3.LIZ.LIZJ;
                    if (str2 != null) {
                        string = a0.LJLIIIL(str2).toString();
                    } else {
                        string = null;
                    }
                    String str3 = c1axi.LIZJ;
                    if (str3 != null) {
                        string2 = a0.LJLIIIL(str3).toString();
                    } else {
                        string2 = null;
                    }
                    zLJFF = Intrinsics.LJFF(string, string2);
                } else {
                    Long l3 = c1axi.LIZIZ;
                    if (l3 != null && (l2 = c1ax3.LIZ.LIZIZ) != null) {
                        zLJFF = Intrinsics.LJFF(l2, l3);
                    }
                }
                if (zLJFF) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1AX3 c1ax32 = next;
        if (c1ax32 != null) {
            c1axi2 = c1ax32.LIZ;
        } else {
            c1axi2 = null;
        }
        FrameLayout frameLayout2 = frameLayout;
        if (c1axi2 != null) {
            C1AXI c1axi3 = c1ax32.LIZ;
            EnumC918810a19 enumC918810a19 = c1axi3.LIZ;
            EnumC918810a19 enumC918810a192 = EnumC918810a19.StateLinked;
            if ((enumC918810a19 == enumC918810a192 && c1axi.LIZ == EnumC918810a19.StatePreparing) || (enumC918810a19 == enumC918810a192 && c1axi.LIZ == EnumC918810a19.StateJoined)) {
                String strLIZLLL3 = LIZLLL(223);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("no need update state because currentState is:");
                sbLIZ3.append(c1axi3.LIZ);
                sbLIZ3.append(", need update state is:");
                sbLIZ3.append(c1axi.LIZ);
                C1AZW.LJFF(strLIZLLL3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
                return false;
            }
            if (c1axi3.LIZIZ == null && (l = c1axi.LIZIZ) != null) {
                c1axi3.LIZIZ = l;
            }
            if (c1axi3.LIZJ == null && (str = c1axi.LIZJ) != null) {
                c1axi3.LIZJ = str;
            }
            EnumC918810a19 enumC918810a193 = c1axi.LIZ;
            if (enumC918810a19 != enumC918810a193 && enumC918810a193 != null) {
                if (enumC918810a19 != null) {
                    c1axi3.LJI = enumC918810a19;
                }
                c1axi3.LIZ = enumC918810a193;
                z = true;
            } else {
                z = false;
            }
            SurfaceView surfaceView = c1axi.LIZLLL;
            if (surfaceView != null) {
                c1axi3.LIZLLL = surfaceView;
                z = true;
            }
            WeakReference<InterfaceC1268870j7l> weakReference = c1axi.LJFF;
            if (weakReference != null) {
                c1axi3.LJFF = weakReference;
                z = true;
            }
            C1AXG c1axg = c1axi.LJ;
            if (c1axg != null) {
                c1axi3.LJ = c1axg;
            }
            Iterator it3 = ((CopyOnWriteArrayList) this.LJII).iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(((PosIdentity) next2).value, c1axi3.LIZJ)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            PosIdentity posIdentity = (PosIdentity) next2;
            if (posIdentity != null && posIdentity.type == 2) {
                c1axi.LJIIIZ = 1;
            }
            if (this.LIZLLL == 2) {
                Layout layout = this.LJ;
                if ((layout != null && layout.isFixedType()) || this.LIZJ.LIZ()) {
                    mapLJJII = this.LIZIZ.LIZ();
                } else {
                    mapLJJII = this.LIZIZ.LJJII();
                }
                OnLineMicInfo onLineMicInfo = mapLJJII.get(c1axi3.LIZJ);
                if (onLineMicInfo != null && (micPositionInfo = onLineMicInfo.micPositionData) != null) {
                    i = micPositionInfo.contentType;
                }
                c1axi.LJIIIZ = i;
            }
            C1AZW.LJIIJ(12, LIZLLL(247), z + " update micinfo = " + c1axi3, null, null);
            return z;
        }
        if (frameLayout == null) {
            C1091250eVH c1091250eVH = new C1091250eVH(this.LIZ, null, 6, 0);
            c1091250eVH.setId(R.id.ysn);
            c1091250eVH.setEnableFixedSize(true);
            frameLayout2 = c1091250eVH;
        }
        CopyOnWriteArrayList<C1AX3> copyOnWriteArrayList = this.LJI;
        C1AX3 c1ax33 = new C1AX3(c1axi, frameLayout2);
        String strLIZLLL4 = LIZLLL(179);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("updateOrInsertMicData micInfo = ");
        sbLIZ4.append(c1ax33);
        C1AZW.LJIIJ(12, strLIZLLL4, C2188811AlT.LIZIZ(sbLIZ4), null, null);
        return copyOnWriteArrayList.add(c1ax33);
    }

    public C1AYS(Context context, InterfaceC2181151AXx interfaceC2181151AXx, C2181141AXw c2181141AXw, int i) {
        this.LIZ = context;
        this.LIZIZ = interfaceC2181151AXx;
        this.LIZJ = c2181141AXw;
        this.LIZLLL = i;
    }
}
