package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.BufferedReader;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oHN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1467030oHN implements InterfaceC1468020oIy {
    public final WeakReference<C1466990oHJ> LIZ;
    public final WeakReference<InterfaceC1467680oIQ> LIZIZ;

    public final Map<String, Long> LIZ() {
        InterfaceC1467950oIr interfaceC1467950oIr;
        C1466990oHJ c1466990oHJ = this.LIZ.get();
        if (c1466990oHJ == null || (interfaceC1467950oIr = c1466990oHJ.LJIIIIZZ) == null) {
            return null;
        }
        HashMap map = new HashMap();
        C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
        map.put("vds", Long.valueOf(c1470430oMr.LJIIJ(45, 0L)));
        map.put("vps", Long.valueOf(c1470430oMr.LJIIJ(46, 0L)));
        map.put("download_speed", Long.valueOf(c1470430oMr.LJIIJ(63, -1L)));
        map.put("vlen", Long.valueOf(c1470430oMr.LJIIJ(72, -1L)));
        map.put("alen", Long.valueOf(c1470430oMr.LJIIJ(73, -1L)));
        map.put("vDecLen", Long.valueOf(c1470430oMr.LJIIJ(602, -1L)));
        map.put("aDecLen", Long.valueOf(c1470430oMr.LJIIJ(603, -1L)));
        map.put("vBaseLen", Long.valueOf(c1470430oMr.LJIIJ(604, -1L)));
        map.put("aBaseLen", Long.valueOf(c1470430oMr.LJIIJ(605, -1L)));
        map.put("avGap", Long.valueOf(c1470430oMr.LJIIJ(606, -1L)));
        map.put("single_vds", Long.valueOf(c1470430oMr.LJIIJ(145, 0L)));
        map.put("accu_vds", Long.valueOf(c1470430oMr.LJIIJ(476, 0L)));
        return map;
    }

    public final float LIZIZ(int i) {
        InterfaceC1467950oIr interfaceC1467950oIr;
        C1466990oHJ c1466990oHJ = this.LIZ.get();
        if (c1466990oHJ == null || (interfaceC1467950oIr = c1466990oHJ.LJIIIIZZ) == null) {
            return -1.0f;
        }
        if (i != 82) {
            if (i != 83) {
                return -1.0f;
            }
            return ((C1470430oMr) interfaceC1467950oIr).LJIILIIL(-1.0f, 150);
        }
        return ((C1470430oMr) interfaceC1467950oIr).LJIILIIL(-1.0f, 151);
    }

    public final int LIZJ(int i) {
        C1466990oHJ c1466990oHJ = this.LIZ.get();
        if (c1466990oHJ == null) {
            return -1;
        }
        switch (i) {
            case 21:
                return c1466990oHJ.LJIILL;
            case 22:
                return c1466990oHJ.LJLIIL.LIZJ;
            case 23:
                return c1466990oHJ.LJLIIL.LIZIZ;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                InterfaceC1467950oIr interfaceC1467950oIr = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr == null) {
                    return -1;
                }
                C1467070oHR c1467070oHR = c1466990oHJ.LJLIIL;
                if (c1467070oHR.LJ < 0) {
                    c1467070oHR.LJ = ((C1470430oMr) interfaceC1467950oIr).LJI(157, -1);
                }
                return c1466990oHJ.LJLIIL.LJ;
            case 25:
                InterfaceC1467950oIr interfaceC1467950oIr2 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr2 == null) {
                    return -1;
                }
                if (c1466990oHJ.LJJJLZIJ < 0) {
                    c1466990oHJ.LJJJLZIJ = ((C1470430oMr) interfaceC1467950oIr2).LJI(158, -1);
                }
                return c1466990oHJ.LJJJLZIJ;
            case 26:
                return (int) c1466990oHJ.LLJJJJ();
            case 27:
                InterfaceC1467950oIr interfaceC1467950oIr3 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr3 == null) {
                    return -1;
                }
                if (((C1470430oMr) interfaceC1467950oIr3).LJIIZILJ()) {
                    return 1;
                }
                return 0;
            case 30:
                return C1467400oHy.LIZIZ(c1466990oHJ.LJIL);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return c1466990oHJ.LLILIL;
            case 35:
                return c1466990oHJ.LLLLIIIILLL;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return c1466990oHJ.R;
            case 42:
                InterfaceC1467950oIr interfaceC1467950oIr4 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr4 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr4).LJI(221, -1);
            case 43:
                InterfaceC1467950oIr interfaceC1467950oIr5 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr5 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr5).LJI(222, -1);
            case 44:
                InterfaceC1467950oIr interfaceC1467950oIr6 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr6 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr6).LJI(245, -1);
            case 49:
                InterfaceC1467950oIr interfaceC1467950oIr7 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr7 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr7).LJI(44, -1);
            case 61:
                InterfaceC1467950oIr interfaceC1467950oIr8 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr8 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr8).LJI(53, -1);
            case 63:
                int i2 = c1466990oHJ.v3;
                if (i2 != -1) {
                    return i2;
                }
                InterfaceC1467950oIr interfaceC1467950oIr9 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr9 != null) {
                    c1466990oHJ.v3 = ((C1470430oMr) interfaceC1467950oIr9).LJI(403, -1);
                }
                return c1466990oHJ.v3;
            case 64:
                int i3 = c1466990oHJ.u3;
                if (i3 != -1) {
                    return i3;
                }
                InterfaceC1467950oIr interfaceC1467950oIr10 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr10 != null) {
                    c1466990oHJ.u3 = ((C1470430oMr) interfaceC1467950oIr10).LJI(402, -1);
                }
                return c1466990oHJ.u3;
            case 67:
                int i4 = c1466990oHJ.s3;
                if (i4 > 0) {
                    return i4;
                }
                InterfaceC1467950oIr interfaceC1467950oIr11 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr11 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr11).getCurrentPosition();
            case 69:
                InterfaceC1467950oIr interfaceC1467950oIr12 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr12 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr12).LJI(601, -1);
            case 77:
                InterfaceC1467950oIr interfaceC1467950oIr13 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr13 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr13).LJI(540, -1);
            case 79:
                InterfaceC1467950oIr interfaceC1467950oIr14 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr14 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr14).LJI(826, -1);
            case 81:
                InterfaceC1467950oIr interfaceC1467950oIr15 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr15 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr15).LJI(643, -1);
            case 84:
                InterfaceC1467950oIr interfaceC1467950oIr16 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr16 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr16).LJI(186, -1);
            case 85:
                return 0;
            case 87:
                if (c1466990oHJ.LJIIL == null) {
                    return 1;
                }
                return 0;
            case 88:
                return c1466990oHJ.LJJJJZI;
            case 89:
                C1468040oJ0 c1468040oJ0 = c1466990oHJ.LLLZL;
                if (c1468040oJ0 == null) {
                    return -1;
                }
                return c1468040oJ0.LIZIZ() ? 1 : 0;
            case 90:
                C1468040oJ0 c1468040oJ02 = c1466990oHJ.LLLZL;
                if (c1468040oJ02 == null) {
                    return -1;
                }
                return c1468040oJ02.LIZJ() ? 1 : 0;
            case 97:
                InterfaceC1467950oIr interfaceC1467950oIr17 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr17 != null) {
                    return ((C1470430oMr) interfaceC1467950oIr17).LJI(181, -1);
                }
            case 94:
                return -1;
            case 100:
            case 101:
                return 0;
            case 103:
                InterfaceC1467950oIr interfaceC1467950oIr18 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr18 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr18).LJI(24, -1);
            case 113:
                int i5 = c1466990oHJ.F0;
                c1466990oHJ.F0 = 0;
                return i5;
            case 114:
                InterfaceC1467950oIr interfaceC1467950oIr19 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr19 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr19).LJI(469, -1);
            case 121:
                return TTVideoEngine.LJII;
            case 122:
                return TTVideoEngine.LJIIIIZZ;
            case 142:
                InterfaceC1467950oIr interfaceC1467950oIr20 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr20 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr20).LJI(754, -1);
            case 145:
                InterfaceC1467950oIr interfaceC1467950oIr21 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr21 == null) {
                    return 0;
                }
                return ((C1470430oMr) interfaceC1467950oIr21).LJI(758, 0);
            case 147:
                InterfaceC1467950oIr interfaceC1467950oIr22 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr22 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr22).LJI(1339, -1);
            case 148:
                return TTVideoEngine.LJIIJ;
            case 154:
                InterfaceC1467950oIr interfaceC1467950oIr23 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr23 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr23).LJI(1354, -1);
            case 155:
                InterfaceC1467950oIr interfaceC1467950oIr24 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr24 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr24).LJI(959, -1);
            case 156:
                InterfaceC1467950oIr interfaceC1467950oIr25 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr25 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr25).LJI(964, -1);
            case 157:
                InterfaceC1467950oIr interfaceC1467950oIr26 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr26 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr26).LJI(965, -1);
            case 167:
                InterfaceC1467950oIr interfaceC1467950oIr27 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr27 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr27).LJI(849, -1);
            case 169:
                InterfaceC1467950oIr interfaceC1467950oIr28 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr28 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr28).LJI(889, -1);
            case 171:
                InterfaceC1467950oIr interfaceC1467950oIr29 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr29 == null) {
                    return -1;
                }
                return ((C1470430oMr) interfaceC1467950oIr29).LJI(2004, -1);
            case 172:
                InterfaceC1467950oIr interfaceC1467950oIr30 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr30 == null) {
                    return 0;
                }
                return ((C1470430oMr) interfaceC1467950oIr30).LJI(153, 0);
            default:
                return -1;
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final long LIZLLL(int r8) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1467030oHN.LIZLLL(int):long");
    }

    public final String LJ(int i) {
        C1468920oKQ c1468920oKQ;
        InterfaceC1467950oIr interfaceC1467950oIr;
        C1466990oHJ c1466990oHJ = this.LIZ.get();
        InterfaceC1467680oIQ interfaceC1467680oIQ = this.LIZIZ.get();
        String str = "";
        if (c1466990oHJ == null || interfaceC1467680oIQ == null) {
            return "";
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        AbstractC1468760oKA abstractC1468760oKA = null;
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 110) {
                                    if (i != 111) {
                                        switch (i) {
                                            case 29:
                                                InterfaceC1467290oHn interfaceC1467290oHn = c1466990oHJ.LJIL;
                                                if (!interfaceC1467290oHn.LIZLLL()) {
                                                    return null;
                                                }
                                                return ((C1467550oID) interfaceC1467290oHn).LJIIJJI;
                                            case 37:
                                                return interfaceC1467680oIQ.LIZJ();
                                            case 46:
                                                C1468160oJC c1468160oJC = c1466990oHJ.LLLZIL;
                                                if (c1468160oJC == null) {
                                                    return "";
                                                }
                                                return c1468160oJC.LJJLIIIJILLIZJL;
                                            case 55:
                                                InterfaceC1467950oIr interfaceC1467950oIr2 = c1466990oHJ.LJIIIIZZ;
                                                if (interfaceC1467950oIr2 != null) {
                                                    return ((C1470430oMr) interfaceC1467950oIr2).LJIIIZ(609);
                                                }
                                                break;
                                            case 65:
                                                InterfaceC1467950oIr interfaceC1467950oIr3 = c1466990oHJ.LJIIIIZZ;
                                                if (interfaceC1467950oIr3 != null) {
                                                    return ((C1470430oMr) interfaceC1467950oIr3).LJIIIZ(516);
                                                }
                                                break;
                                            case 76:
                                                C1474520oTS c1474520oTSLIZ = C1467400oHy.LIZ(c1466990oHJ.LJIL);
                                                if (c1474520oTSLIZ == null) {
                                                    return "";
                                                }
                                                return c1474520oTSLIZ.LIZ(7);
                                            case 78:
                                                InterfaceC1467950oIr interfaceC1467950oIr4 = c1466990oHJ.LJIIIIZZ;
                                                if (interfaceC1467950oIr4 != null) {
                                                    return ((C1470430oMr) interfaceC1467950oIr4).LJIIIZ(825);
                                                }
                                                break;
                                            case 80:
                                                InterfaceC1467950oIr interfaceC1467950oIr5 = c1466990oHJ.LJIIIIZZ;
                                                if (interfaceC1467950oIr5 != null) {
                                                    return ((C1470430oMr) interfaceC1467950oIr5).LJIIIZ(824);
                                                }
                                                break;
                                            case 102:
                                                return c1466990oHJ.O1;
                                            case 139:
                                                if (!c1466990oHJ.z5) {
                                                    return null;
                                                }
                                                return interfaceC1467680oIQ.LIZIZ(c1466990oHJ.LJIL.getVideoId());
                                            case 143:
                                                if (c1466990oHJ.i4 != 1 || (interfaceC1467950oIr = c1466990oHJ.LJIIIIZZ) == null) {
                                                    return "";
                                                }
                                                return ((C1470430oMr) interfaceC1467950oIr).LJIIIZ(755);
                                            case 146:
                                                InterfaceC1467950oIr interfaceC1467950oIr6 = c1466990oHJ.LJIIIIZZ;
                                                if (interfaceC1467950oIr6 != null) {
                                                    String strLJIIIZ = ((C1470430oMr) interfaceC1467950oIr6).LJIIIZ(479);
                                                    if (TextUtils.isEmpty(strLJIIIZ)) {
                                                        return "unknown_codec";
                                                    }
                                                    return strLJIIIZ;
                                                }
                                                break;
                                            case 151:
                                                InterfaceC1467950oIr interfaceC1467950oIr7 = c1466990oHJ.LJIIIIZZ;
                                                if (interfaceC1467950oIr7 != null) {
                                                    return ((C1470430oMr) interfaceC1467950oIr7).LJIIIZ(481);
                                                }
                                                break;
                                            case 166:
                                                if (c1466990oHJ.J5 <= 0 || (c1468920oKQ = c1466990oHJ.LLLLZI) == null) {
                                                    return null;
                                                }
                                                return c1468920oKQ.LJ();
                                            case 168:
                                                InterfaceC1467950oIr interfaceC1467950oIr8 = c1466990oHJ.LJIIIIZZ;
                                                if (interfaceC1467950oIr8 != null) {
                                                    return ((C1470430oMr) interfaceC1467950oIr8).LJIIIZ(848);
                                                }
                                                break;
                                            case 170:
                                                InterfaceC1467950oIr interfaceC1467950oIr9 = c1466990oHJ.LJIIIIZZ;
                                                if (interfaceC1467950oIr9 != null) {
                                                    return ((C1470430oMr) interfaceC1467950oIr9).LJIIIZ(888);
                                                }
                                                break;
                                            default:
                                                switch (i) {
                                                    case 31:
                                                        try {
                                                            return Build.BOARD;
                                                        } catch (Exception e) {
                                                            TryCatchGuardChecker.doCheck(e);
                                                            return "";
                                                        }
                                                    case 32:
                                                        try {
                                                            return Build.HARDWARE;
                                                        } catch (Exception e2) {
                                                            TryCatchGuardChecker.doCheck(e2);
                                                            return "";
                                                        }
                                                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                        InterfaceC1467950oIr interfaceC1467950oIr10 = c1466990oHJ.LJIIIIZZ;
                                                        if (interfaceC1467950oIr10 != null) {
                                                            return ((C1470430oMr) interfaceC1467950oIr10).LJIIIZ(200);
                                                        }
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 174:
                                                                InterfaceC1467950oIr interfaceC1467950oIr11 = c1466990oHJ.LJIIIIZZ;
                                                                if (interfaceC1467950oIr11 == null) {
                                                                    return "";
                                                                }
                                                                return ((C1470430oMr) interfaceC1467950oIr11).LJIIIZ(2008);
                                                            case 175:
                                                                InterfaceC1467950oIr interfaceC1467950oIr12 = c1466990oHJ.LJIIIIZZ;
                                                                if (interfaceC1467950oIr12 == null) {
                                                                    return "";
                                                                }
                                                                return ((C1470430oMr) interfaceC1467950oIr12).LJIIIZ(2009);
                                                            case 176:
                                                                InterfaceC1467950oIr interfaceC1467950oIr13 = c1466990oHJ.LJIIIIZZ;
                                                                if (interfaceC1467950oIr13 == null) {
                                                                    return "";
                                                                }
                                                                return ((C1470430oMr) interfaceC1467950oIr13).LJIIIZ(1807);
                                                            case 177:
                                                                InterfaceC1467950oIr interfaceC1467950oIr14 = c1466990oHJ.LJIIIIZZ;
                                                                if (interfaceC1467950oIr14 == null) {
                                                                    return "";
                                                                }
                                                                return ((C1470430oMr) interfaceC1467950oIr14).LJIIIZ(1382);
                                                        }
                                                }
                                                break;
                                        }
                                    } else {
                                        if (C1466990oHJ.y6 == null) {
                                            try {
                                                BufferedReader bufferedReader = new BufferedReader(new C0VSF("proc/cpuinfo"));
                                                String line = bufferedReader.readLine();
                                                while (true) {
                                                    if (line == null) {
                                                        break;
                                                    }
                                                    if (line.contains("Hardware")) {
                                                        String[] strArrSplit = line.split(":");
                                                        if (strArrSplit.length > 1) {
                                                            str = strArrSplit[1];
                                                        }
                                                    } else {
                                                        line = bufferedReader.readLine();
                                                    }
                                                }
                                                C1466990oHJ.y6 = str.trim();
                                            } catch (Exception e3) {
                                                TryCatchGuardChecker.doCheck(e3);
                                            }
                                        }
                                        return C1466990oHJ.y6;
                                    }
                                } else {
                                    InterfaceC1467950oIr interfaceC1467950oIr15 = c1466990oHJ.LJIIIIZZ;
                                    if (interfaceC1467950oIr15 != null) {
                                        return ((C1470430oMr) interfaceC1467950oIr15).LJIIIZ(467);
                                    }
                                }
                            } else {
                                InterfaceC1467950oIr interfaceC1467950oIr16 = c1466990oHJ.LJIIIIZZ;
                                if (interfaceC1467950oIr16 != null) {
                                    return ((C1470430oMr) interfaceC1467950oIr16).LJIIIZ(71);
                                }
                            }
                        } else {
                            AbstractC1468760oKA abstractC1468760oKA2 = c1466990oHJ.LLLLLLZZ;
                            if (abstractC1468760oKA2 != null) {
                                abstractC1468760oKA = abstractC1468760oKA2;
                            }
                            if (abstractC1468760oKA == null) {
                                return "own";
                            }
                            return "user";
                        }
                    } else {
                        return c1466990oHJ.LLZZZIL;
                    }
                } else {
                    InterfaceC1467950oIr interfaceC1467950oIr17 = c1466990oHJ.LJIIIIZZ;
                    if (interfaceC1467950oIr17 != null) {
                        return ((C1470430oMr) interfaceC1467950oIr17).LJIIIZ(5002);
                    }
                }
            } else {
                InterfaceC1467950oIr interfaceC1467950oIr18 = c1466990oHJ.LJIIIIZZ;
                if (interfaceC1467950oIr18 != null) {
                    int iLJI = ((C1470430oMr) interfaceC1467950oIr18).LJI(139, -1);
                    if (iLJI != 0) {
                        if (iLJI == 1) {
                            return "nativewindow";
                        }
                    } else {
                        return "opengl";
                    }
                }
            }
        } else {
            InterfaceC1467950oIr interfaceC1467950oIr19 = c1466990oHJ.LJIIIIZZ;
            if (interfaceC1467950oIr19 != null) {
                String strLJIIIZ2 = ((C1470430oMr) interfaceC1467950oIr19).LJIIIZ(478);
                int iLJI2 = ((C1470430oMr) c1466990oHJ.LJIIIIZZ).LJI(141, -1);
                if (iLJI2 == 1) {
                    strLJIIIZ2 = "bytevc1";
                } else if (iLJI2 == 33) {
                    strLJIIIZ2 = "bytevc2";
                }
                if (!c1466990oHJ.LJJIJIIJIL() && iLJI2 == 0) {
                    strLJIIIZ2 = "h264";
                }
                if (TextUtils.isEmpty(strLJIIIZ2)) {
                    return "unknown_codec";
                }
                return strLJIIIZ2;
            }
        }
        return "";
    }

    public C1467030oHN(C1466990oHJ c1466990oHJ, InterfaceC1467680oIQ interfaceC1467680oIQ) {
        this.LIZ = new WeakReference<>(c1466990oHJ);
        this.LIZIZ = new WeakReference<>(interfaceC1467680oIQ);
    }

    public final void LJFF(int i, Map map) {
        C1466990oHJ c1466990oHJ = this.LIZ.get();
        switch (i) {
            case 0:
                if (c1466990oHJ != null && c1466990oHJ.LLLLZLL != null) {
                    C1467470oI5 c1467470oI5 = new C1467470oI5();
                    c1467470oI5.LIZ = "bufferStartInfos";
                    c1467470oI5.LIZJ = map;
                    c1466990oHJ.LLLFF(c1467470oI5, false);
                    break;
                }
                break;
            case 1:
                if (c1466990oHJ != null && c1466990oHJ.LLLLZLL != null) {
                    C1467470oI5 c1467470oI52 = new C1467470oI5();
                    c1467470oI52.LIZ = "bufferEndInfos";
                    c1467470oI52.LIZJ = map;
                    c1466990oHJ.LLLFF(c1467470oI52, false);
                    break;
                }
                break;
            case 2:
                if (c1466990oHJ != null && c1466990oHJ.LLLLZLL != null) {
                    JSONObject jSONObject = new JSONObject(map);
                    C1467470oI5 c1467470oI53 = new C1467470oI5();
                    c1467470oI53.LIZ = "firstframe_split";
                    c1467470oI53.LIZJ = jSONObject;
                    c1467470oI53.LJFF = c1466990oHJ.r;
                    c1466990oHJ.LLLFF(c1467470oI53, true);
                    break;
                }
                break;
            case 3:
                if (c1466990oHJ != null && c1466990oHJ.LLLLZLL != null) {
                    C1467470oI5 c1467470oI54 = new C1467470oI5();
                    c1467470oI54.LIZ = "outsyncStartInfos";
                    c1467470oI54.LIZJ = map;
                    c1466990oHJ.LLLFF(c1467470oI54, false);
                    break;
                }
                break;
            case 4:
                if (c1466990oHJ != null && c1466990oHJ.LLLLZLL != null) {
                    C1467470oI5 c1467470oI55 = new C1467470oI5();
                    c1467470oI55.LIZ = "outsyncEndInfos";
                    c1467470oI55.LIZJ = map;
                    c1466990oHJ.LLLFF(c1467470oI55, false);
                    break;
                }
                break;
            case 5:
                if (c1466990oHJ != null && c1466990oHJ.LLLLZLL != null) {
                    C1467470oI5 c1467470oI56 = new C1467470oI5();
                    c1467470oI56.LIZ = "noRenderStartInfos";
                    c1467470oI56.LIZJ = map;
                    c1466990oHJ.LLLFF(c1467470oI56, false);
                    break;
                }
                break;
            case 6:
                if (c1466990oHJ != null && c1466990oHJ.LLLLZLL != null) {
                    C1467470oI5 c1467470oI57 = new C1467470oI5();
                    c1467470oI57.LIZ = "noRenderEndInfos";
                    c1467470oI57.LIZJ = map;
                    c1466990oHJ.LLLFF(c1467470oI57, false);
                    break;
                }
                break;
        }
    }
}
