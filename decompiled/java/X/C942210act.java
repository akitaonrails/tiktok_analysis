package X;

import Y.AComparatorS514S0100000_15;
import Y.AObjectS379S0100000_3;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiGuestPanelLayoutTypeListConfigSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import tikcast.linkmic.common.AnchorPanelLayoutTypeSetting;

/* JADX INFO: renamed from: X.0act, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942210act {
    public static final C942210act LIZ = new C942210act();

    public static int LJ() {
        return (C915980Zwa.LJIIIIZZ().LLJLL() != null ? r0.LIZIZ() : 0) - 1;
    }

    public static int LIZLLL(int i) {
        if (i != 2 && i != 3) {
            if (i == 6) {
                return 9;
            }
            return 8;
        }
        if (!C917910Zzh.LIZ(C930540aK4.LIZJ())) {
            return 6;
        }
        return 8;
    }

    public static int LJFF(int i) {
        AnchorPanelLayoutTypeSetting next;
        int iLIZLLL;
        Iterator<AnchorPanelLayoutTypeSetting> it2 = C940770aaZ.LIZ().getDataSource().LIZLLL().panelLayoutTypeSetting.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.panelLayoutType == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AnchorPanelLayoutTypeSetting anchorPanelLayoutTypeSetting = next;
        if (anchorPanelLayoutTypeSetting != null) {
            iLIZLLL = anchorPanelLayoutTypeSetting.maxPosition;
        } else {
            iLIZLLL = LIZLLL(i) + 1;
        }
        if (iLIZLLL - 1 < LJ()) {
            Iterator it3 = LJI(i).iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Number) it3.next()).intValue();
                LIZ.getClass();
                if (iIntValue >= LJ()) {
                    return iIntValue + 1;
                }
            }
        }
        return iLIZLLL;
    }

    public static List LJI(int i) {
        switch (i) {
            case 3:
                if (C917910Zzh.LIZ(C930540aK4.LIZJ())) {
                    return C1697810uHb.LJIIJJI(4, 6, 8);
                }
                return C1697810uHb.LJIIJJI(4, 6);
            case 4:
            case 8:
            default:
                return C13BV.INSTANCE;
            case 5:
                return C1697810uHb.LJIIJJI(2, 3, 4, 5, 8);
            case 6:
                return C1697810uHb.LJIIJJI(5, 9);
            case 7:
                return C1697810uHb.LJIIJJI(6, 8);
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return Collections.singletonList(8);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return C1697810uHb.LJIIJJI(4, 8);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return C1697810uHb.LJIIJJI(6, 8);
        }
    }

    public static boolean LJIIIZ(int i) {
        if (LIZLLL(i) >= LJ()) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(List<C948400ams> list, boolean z) {
        C948400ams c948400amsLIZJ;
        C948400ams c948400amsLIZJ2;
        if (C01ZD.LIZ(7)) {
            C948400ams c948400amsLIZJ3 = LIZJ(this, 6, z);
            if (c948400amsLIZJ3 != null) {
                ((ArrayList) list).add(c948400amsLIZJ3);
            }
            if (C934960aRC.LIZ() >= 1 && (c948400amsLIZJ2 = LIZJ(this, 11, z)) != null) {
                ((ArrayList) list).add(c948400amsLIZJ2);
            }
            C948400ams c948400amsLIZJ4 = LIZJ(this, 7, z);
            if (c948400amsLIZJ4 != null) {
                ((ArrayList) list).add(c948400amsLIZJ4);
            }
        }
        if (C934960aRC.LIZ() >= 1 && (c948400amsLIZJ = LIZJ(this, 12, z)) != null) {
            ((ArrayList) list).add(c948400amsLIZJ);
        }
    }

    public final List LJII(Context context, boolean z) {
        boolean zLIZIZ;
        int i = 16;
        if (C931780aM4.LIZIZ() && !C500260Jjc.LJJIL()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C948400ams(LJIIIZ(9), 9, C497740JfY.LJIJI(2131854871), R.drawable.f43));
            arrayList.add(new C948400ams(LJIIIZ(10), 10, C497740JfY.LJIJI(2131854872), R.drawable.f44));
            C717620SCy c717620SCy = new C717620SCy(new AObjectS379S0100000_3(MultiGuestPanelLayoutTypeListConfigSetting.INSTANCE.getValue(), 4));
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCy, 10));
            if (iLIZIZ >= 16) {
                i = iLIZIZ;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            Iterator it2 = c717620SCy.iterator();
            while (true) {
                C717610SCx c717610SCx = (C717610SCx) it2;
                if (c717610SCx.hasNext()) {
                    IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                    Pair pair = new Pair(indexedValue.LIZIZ, Integer.valueOf(indexedValue.LIZ));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                } else {
                    return C13LP.LJLLLL(new AComparatorS514S0100000_15(linkedHashMap, 14), arrayList);
                }
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (context != null && !C500260Jjc.LJJ()) {
                zLIZIZ = C960203pA.LIZIZ(context);
            } else {
                zLIZIZ = false;
            }
            LIZ(arrayList2, zLIZIZ, z);
            LIZIZ(arrayList2, zLIZIZ);
            C717620SCy c717620SCy2 = new C717620SCy(new AObjectS379S0100000_3(MultiGuestPanelLayoutTypeListConfigSetting.INSTANCE.getValue(), 4));
            int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCy2, 10));
            if (iLIZIZ2 >= 16) {
                i = iLIZIZ2;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
            Iterator it3 = c717620SCy2.iterator();
            while (true) {
                C717610SCx c717610SCx2 = (C717610SCx) it3;
                if (c717610SCx2.hasNext()) {
                    IndexedValue indexedValue2 = (IndexedValue) c717610SCx2.next();
                    Pair pair2 = new Pair(indexedValue2.LIZIZ, Integer.valueOf(indexedValue2.LIZ));
                    linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
                } else {
                    return C13LP.LJLLLL(new AComparatorS514S0100000_15(linkedHashMap2, 16), arrayList2);
                }
            }
        }
    }

    public static C948400ams LIZJ(C942210act c942210act, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        c942210act.getClass();
        boolean zLIZ = C934890aR5.LIZ();
        if (i != 11) {
            if (i != 12) {
                switch (i) {
                    case 1:
                        String strLJIJI = C497740JfY.LJIJI(2131854603);
                        if (zLIZ) {
                            i10 = R.drawable.f4b;
                        } else if (z) {
                            i10 = R.drawable.f4c;
                        } else {
                            i10 = R.drawable.f3w;
                        }
                        return new C948400ams(true, 1, strLJIJI, i10);
                    case 2:
                        boolean zLJIIIZ = LJIIIZ(2);
                        String strLJIJI2 = C497740JfY.LJIJI(2131854602);
                        if (zLIZ) {
                            i9 = R.drawable.f4g;
                        } else if (z) {
                            i9 = R.drawable.f4a;
                        } else {
                            i9 = R.drawable.f3z;
                        }
                        return new C948400ams(zLJIIIZ, 2, strLJIJI2, i9);
                    case 3:
                        boolean zLJIIIZ2 = LJIIIZ(3);
                        String strLJIJI3 = C497740JfY.LJIJI(2131854600);
                        if (zLIZ) {
                            i8 = R.drawable.f4f;
                        } else if (z) {
                            i8 = R.drawable.f49;
                        } else {
                            i8 = R.drawable.f3u;
                        }
                        return new C948400ams(zLJIIIZ2, 3, strLJIJI3, i8);
                    case 4:
                        boolean zLJIIIZ3 = LJIIIZ(4);
                        String strLJIJI4 = C497740JfY.LJIJI(2131854601);
                        if (zLIZ) {
                            i7 = R.drawable.f4e;
                        } else if (z) {
                            i7 = R.drawable.f4_;
                        } else {
                            i7 = R.drawable.f3x;
                        }
                        return new C948400ams(zLJIIIZ3, 4, strLJIJI4, i7);
                    case 5:
                        boolean zLJIIIZ4 = LJIIIZ(5);
                        String strLJIJI5 = C497740JfY.LJIJI(2131854599);
                        if (zLIZ) {
                            i6 = R.drawable.f4d;
                        } else if (z) {
                            i6 = R.drawable.f48;
                        } else {
                            i6 = R.drawable.f3s;
                        }
                        return new C948400ams(zLJIIIZ4, 5, strLJIJI5, i6);
                    case 6:
                        boolean zLJIIIZ5 = LJIIIZ(6);
                        String strLJIJI6 = C497740JfY.LJIJI(2131854605);
                        if (zLIZ) {
                            i5 = R.drawable.f46;
                        } else if (z) {
                            i5 = R.drawable.f47;
                        } else {
                            i5 = R.drawable.f3r;
                        }
                        return new C948400ams(zLJIIIZ5, 6, strLJIJI6, i5);
                    case 7:
                        boolean zLJIIIZ6 = LJIIIZ(7);
                        String strLJIJI7 = C497740JfY.LJIJI(2131854586);
                        if (zLIZ) {
                            i4 = R.drawable.f45;
                        } else if (z) {
                            i4 = R.drawable.f4i;
                        } else {
                            i4 = R.drawable.f3q;
                        }
                        return new C948400ams(zLJIIIZ6, 7, strLJIJI7, i4);
                    default:
                        return null;
                }
            }
            boolean zLJIIIZ7 = LJIIIZ(12);
            String strLJIJI8 = C497740JfY.LJIJI(2131854587);
            if (zLIZ) {
                i3 = R.drawable.f4h;
            } else if (z) {
                i3 = R.drawable.f4j;
            } else {
                i3 = R.drawable.f41;
            }
            return new C948400ams(zLJIIIZ7, 12, strLJIJI8, i3);
        }
        boolean zLJIIIZ8 = LJIIIZ(11);
        String strLJIJI9 = C497740JfY.LJIJI(2131854594);
        if (zLIZ) {
            i2 = R.drawable.f4k;
        } else if (z) {
            i2 = R.drawable.f4l;
        } else {
            i2 = R.drawable.f42;
        }
        return new C948400ams(zLJIIIZ8, 11, strLJIJI9, i2);
    }

    public final void LIZ(List<C948400ams> list, boolean z, boolean z2) {
        C948400ams c948400amsLIZJ;
        if (C01ZD.LIZ(1)) {
            if (!z2 && (c948400amsLIZJ = LIZJ(this, 1, z)) != null) {
                ((ArrayList) list).add(c948400amsLIZJ);
            }
            C948400ams c948400amsLIZJ2 = LIZJ(this, 2, z);
            if (c948400amsLIZJ2 != null) {
                ((ArrayList) list).add(c948400amsLIZJ2);
            }
            C948400ams c948400amsLIZJ3 = LIZJ(this, 4, z);
            if (c948400amsLIZJ3 != null) {
                ((ArrayList) list).add(c948400amsLIZJ3);
            }
            C948400ams c948400amsLIZJ4 = LIZJ(this, 5, z);
            if (c948400amsLIZJ4 != null) {
                ((ArrayList) list).add(c948400amsLIZJ4);
            }
            C948400ams c948400amsLIZJ5 = LIZJ(this, 3, z);
            if (c948400amsLIZJ5 != null) {
                ((ArrayList) list).add(c948400amsLIZJ5);
            }
        }
    }
}
