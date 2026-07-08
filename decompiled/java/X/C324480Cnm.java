package X;

import Y.ARunnableS5S1300000_4;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Cnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C324480Cnm {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C324490Cnn());
    public static final List<String> LIZIZ = new ArrayList();
    public static final ArrayList<String> LIZJ = new ArrayList<>();
    public static ARunnableS5S1300000_4 LIZLLL;
    public static ARunnableS5S1300000_4 LJ;
    public static int LJFF;

    public static void LIZIZ(C1592450rXf c1592450rXf, final String str, FrameLayout frameLayout, List list) {
        String strLIZIZ;
        boolean z;
        if (str != null && str.length() != 0) {
            C01GW c01gw = LIZ;
            if (!((HashSet) c01gw.getValue()).contains(str)) {
                if (c1592450rXf.getWidth() > 0 && frameLayout != null && frameLayout.getWidth() != 0) {
                    ((HashSet) c01gw.getValue()).add(str);
                    int[] iArr = new int[2];
                    frameLayout.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int width = frameLayout.getWidth() + i;
                    final ArrayList arrayList = new ArrayList();
                    for (int tabCount = c1592450rXf.getTabCount() - 1; -1 < tabCount; tabCount--) {
                        View viewLJIILJJIL = c1592450rXf.LJIILJJIL(tabCount);
                        if (viewLJIILJJIL != null) {
                            int[] iArr2 = new int[2];
                            viewLJIILJJIL.getLocationOnScreen(iArr2);
                            C1591980rWu c1591980rWuLJIILIIL = c1592450rXf.LJIILIIL(tabCount);
                            if (c1591980rWuLJIILIIL == null || (strLIZIZ = c1591980rWuLJIILIIL.LIZIZ()) == null) {
                                strLIZIZ = "";
                            }
                            int i2 = iArr2[0];
                            int width2 = viewLJIILJJIL.getWidth() + i2;
                            if (i2 < i) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (width2 > width) {
                                z = false;
                            } else if (z) {
                                MainTabStrip.LLJLLIL.getClass();
                                String strLIZLLL = C1591440rW2.LIZLLL(strLIZIZ);
                                if (strLIZLLL != null) {
                                    arrayList.add(strLIZLLL);
                                }
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("tag = ");
                            sbLIZ.append(strLIZIZ);
                            sbLIZ.append(", isFull = ");
                            sbLIZ.append(z);
                            sbLIZ.append(", left = ");
                            sbLIZ.append(i2);
                            sbLIZ.append(", right = ");
                            sbLIZ.append(width2);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                    if (LIZJ.isEmpty()) {
                        for (int size = list.size() - 1; -1 < size; size--) {
                            ArrayList<String> arrayList2 = LIZJ;
                            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                            String strTag = ((InterfaceC1583870rJp) ListProtector.get(list, size)).tag();
                            c1584320rKY.getClass();
                            arrayList2.add(C1584320rKY.LJI(strTag));
                        }
                    }
                    C823050WQl.LJFF().submit(new Runnable() { // from class: X.0Cnl
                        public final void LIZ() throws JSONException {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("tab_name", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
                            C1584320rKY c1584320rKY2 = C1584320rKY.LIZ;
                            String str2 = str;
                            c1584320rKY2.getClass();
                            jSONObject.put("current_tab_name", C1584320rKY.LJI(C1584320rKY.LJI(str2)));
                            ArrayList<String> arrayList3 = C324480Cnm.LIZJ;
                            jSONObject.put("first_screen_tab_name", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62));
                            jSONObject.put("first_screen_tab_cnt", arrayList3.size());
                            List<String> list2 = C324480Cnm.LIZIZ;
                            jSONObject.put("first_screen_full_tab_name", C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62));
                            jSONObject.put("first_screen_full_tab_cnt", ((ArrayList) list2).size());
                            int iIndexOf = arrayList3.indexOf(C1584320rKY.LJI(str));
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("top_");
                            sbLIZ2.append(iIndexOf + 1);
                            sbLIZ2.append("tab");
                            jSONObject.put("current_location", C2188811AlT.LIZIZ(sbLIZ2));
                            C20684815ws.LJIJ("show_homepage_tab_ntab", jSONObject);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("MobShowTopTabV2@bced.reportTabShowAfterScroll$2");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("MobShowTopTabV2@bced.reportTabShowAfterScroll$2");
                        }
                    });
                    return;
                }
                C637920P0k.LIZ(c1592450rXf, new ARunnableS5S1300000_4(c1592450rXf, frameLayout, str, list, 0));
            }
        }
    }

    public static void LIZ(String str, C1592450rXf c1592450rXf, C705890RmV c705890RmV, List list, boolean z, boolean z2) {
        if (((Number) C0AJQ.LIZ.getValue()).intValue() == 0) {
            if ((z && Intrinsics.LJFF(str, "For You")) || !Intrinsics.LJFF(str, "For You")) {
                if (((ArrayList) LIZIZ).isEmpty()) {
                    LIZLLL = new ARunnableS5S1300000_4(c1592450rXf, c705890RmV, str, list, 2);
                    return;
                }
                if (z2) {
                    LIZIZ(c1592450rXf, str, c705890RmV, list);
                } else if (LJFF != 0) {
                    LJ = new ARunnableS5S1300000_4(c1592450rXf, c705890RmV, str, list, 3);
                } else {
                    C786410Ut5.LJLIIL(300L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS5S1300000_4(c1592450rXf, c705890RmV, str, list, 4));
                }
            }
        }
    }
}
