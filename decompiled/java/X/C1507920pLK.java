package X;

import Y.ARunnableS123S0100000_23;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pLK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507920pLK {
    public static String LIZ;

    public C1507920pLK() {
        C1507830pLB.LIZLLL = true;
        C18E3.LJII(new C18HS() { // from class: X.0pLJ
            @Override // X.C18HS
            public final void onPageCreated(Object obj) {
                String str;
                CopyOnWriteArraySet<InterfaceC1507880pLG> copyOnWriteArraySet;
                if (C1507840pLC.LIZ.enable) {
                    C21246818Cs btmPageInfoV2 = BtmSDK.INSTANCE.getBtmPageInfoV2(PageFinder.via(obj));
                    if (btmPageInfoV2 != null) {
                        str = btmPageInfoV2.LIZIZ;
                    } else {
                        str = null;
                    }
                    String strLIZ = C1326620kcu.LIZ(str);
                    C2232408os c2232408os = C1507830pLB.LIZ;
                    if (strLIZ != null) {
                        C1507830pLB.LJIILL = strLIZ;
                        C1507830pLB.LJIILJJIL = System.currentTimeMillis();
                    }
                    String strLIZJ = C1507830pLB.LIZJ(strLIZ);
                    if (strLIZJ != null && (copyOnWriteArraySet = C1507830pLB.LJIIJ.get(strLIZJ)) != null) {
                        Iterator<InterfaceC1507880pLG> it2 = copyOnWriteArraySet.iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZJ();
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BtmPageLifecycleCallbackV2 Page onPageCreated btm=");
                    sbLIZ.append(str);
                    sbLIZ.append("， pageName=");
                    sbLIZ.append(strLIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }

            @Override // X.C18HS
            public final void onPageDestroyed(Object obj) {
                String str;
                C1507890pLH c1507890pLHLIZ;
                C21246818Cs btmPageInfoV2 = BtmSDK.INSTANCE.getBtmPageInfoV2(PageFinder.via(obj));
                if (btmPageInfoV2 != null) {
                    str = btmPageInfoV2.LIZIZ;
                } else {
                    str = null;
                }
                String strLIZ = C1326620kcu.LIZ(str);
                if (strLIZ != null && (c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ()) != null) {
                    c1507890pLHLIZ.LIZJ(strLIZ);
                }
            }

            @Override // X.C18HS
            public final void onPagePaused(Object obj) {
                String str;
                C1507890pLH c1507890pLHLIZ;
                String str2;
                CopyOnWriteArraySet<InterfaceC1507880pLG> copyOnWriteArraySet;
                if (C1507840pLC.LIZ.enable) {
                    C21246818Cs btmPageInfoV2 = BtmSDK.INSTANCE.getBtmPageInfoV2(PageFinder.via(obj));
                    if (btmPageInfoV2 != null) {
                        str2 = btmPageInfoV2.LIZIZ;
                    } else {
                        str2 = null;
                    }
                    String strLIZ = C1326620kcu.LIZ(str2);
                    C2232408os c2232408os = C1507830pLB.LIZ;
                    String strLIZJ = C1507830pLB.LIZJ(strLIZ);
                    if (strLIZJ != null && (copyOnWriteArraySet = C1507830pLB.LJIIJ.get(strLIZJ)) != null) {
                        Iterator<InterfaceC1507880pLG> it2 = copyOnWriteArraySet.iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZLLL();
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BtmPageLifecycleCallbackV2 Page onPagePaused btm=");
                    sbLIZ.append(str2);
                    sbLIZ.append("， pageName=");
                    sbLIZ.append(strLIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                if (C1507930pLL.LIZIZ) {
                    C21246818Cs btmPageInfoV22 = BtmSDK.INSTANCE.getBtmPageInfoV2(PageFinder.via(obj));
                    if (btmPageInfoV22 != null) {
                        str = btmPageInfoV22.LIZIZ;
                    } else {
                        str = null;
                    }
                    String strLIZ2 = C1326620kcu.LIZ(str);
                    if (strLIZ2 != null && (c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ()) != null) {
                        C1507970pLP c1507970pLP = c1507890pLHLIZ.LIZIZ;
                        c1507970pLP.getClass();
                        if (Intrinsics.LJFF(strLIZ2, c1507970pLP.LJIIIZ)) {
                            c1507970pLP.LJIIIZ = null;
                        }
                    }
                }
            }

            @Override // X.C18HS
            public final void onPageResumed(Object obj) {
                String str;
                C1507890pLH c1507890pLHLIZ;
                int i;
                C21246818Cs btmPageInfoV2 = BtmSDK.INSTANCE.getBtmPageInfoV2(PageFinder.via(obj));
                if (btmPageInfoV2 != null) {
                    str = btmPageInfoV2.LIZIZ;
                } else {
                    str = null;
                }
                String strLIZ = C1326620kcu.LIZ(str);
                C1507920pLK.LIZ = strLIZ;
                if (C1507840pLC.LIZ.enable) {
                    C2232408os c2232408os = C1507830pLB.LIZ;
                    if (C1507830pLB.LJI) {
                        C1507830pLB.LJI = false;
                    } else {
                        C1507830pLB.LJ(strLIZ);
                    }
                }
                if (C1507930pLL.LIZIZ && strLIZ != null && (c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ()) != null) {
                    C1507970pLP c1507970pLP = c1507890pLHLIZ.LIZIZ;
                    c1507970pLP.getClass();
                    if (!Intrinsics.LJFF(c1507970pLP.LJIIIZ, strLIZ)) {
                        c1507970pLP.LJIIIZ = strLIZ;
                        int i2 = C1507930pLL.LIZ.cancelTasksNetworkThreshold;
                        C0X4L c0x4l = C1506030pIH.LIZJ;
                        if (c0x4l != null) {
                            i = c0x4l.LIZIZ;
                        } else {
                            i = 8;
                        }
                        if (i2 >= i) {
                            c1507970pLP.LIZIZ.submit(new ARunnableS123S0100000_23(c1507970pLP, 156));
                        }
                    }
                }
            }
        });
    }
}
