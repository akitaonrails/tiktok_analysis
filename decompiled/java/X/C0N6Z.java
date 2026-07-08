package X;

import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6Z {
    public static WeakReference<IMidAdCellAbility> LJIIIIZZ;
    public static boolean LJIIIZ;
    public static InterfaceC1483670oiD LJIIJ;
    public static Aweme LJIILL;
    public static final HashMap<String, Aweme> LIZ = new HashMap<>();
    public static final HashMap<String, Aweme> LIZIZ = new HashMap<>();
    public static final HashMap<String, Aweme> LIZJ = new HashMap<>();
    public static final HashMap<String, Long> LIZLLL = new HashMap<>();
    public static final HashSet<String> LJ = new HashSet<>();
    public static final HashMap<String, Boolean> LJFF = new HashMap<>();
    public static final HashMap<String, Boolean> LJI = new HashMap<>();
    public static final HashMap<String, Boolean> LJII = new HashMap<>();
    public static final HashMap<String, Boolean> LJIIJJI = new HashMap<>();
    public static final C01GW LJIIL = C452501pT.LIZIZ(new C584820Mwi());
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(new C583180Mu4());
    public static int LJIILJJIL = -1;
    public static final CopyOnWriteArrayList<InterfaceC588420N6a> LJIILLIIL = new CopyOnWriteArrayList<>();

    public static Aweme LIZ(String str) {
        if (str == null) {
            return null;
        }
        return LIZ.get(str);
    }

    public static Aweme LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        return LIZIZ.get(str);
    }

    public static boolean LIZJ(String str) {
        Boolean bool;
        if (str == null || (bool = LJIIJJI.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void LJ(String str) {
        if (str == null) {
            return;
        }
        LJ.add(str);
    }

    public static void LIZLLL(int i, Aweme aweme) {
        String aid;
        String creativeIdStr;
        String aid2;
        String aid3;
        AwemeRawAd awemeRawAd;
        String aid4;
        boolean zBooleanValue;
        boolean z;
        boolean zBooleanValue2;
        Boolean bool;
        Boolean bool2;
        if (aweme == null) {
            return;
        }
        Aweme aweme2 = LJIILL;
        String aid5 = null;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        String aid6 = aweme.getAid();
        if (aid6 == null) {
            return;
        }
        if (C2245741Cv6.LIZIZ(aweme)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onLongVideoSelect] isShownInCurrent=");
            String aid7 = aweme.getAid();
            if (aid7 != null && (bool2 = LJI.get(aid7)) != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                zBooleanValue = false;
            }
            sbLIZ.append(zBooleanValue);
            sbLIZ.append(", isRewind=");
            sbLIZ.append(LIZJ(aweme.getAid()));
            sbLIZ.append(", hasShownPostRollAdsBefore=");
            if (LIZIZ(aweme.getAid()) != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(", dislike=");
            String aid8 = aweme.getAid();
            if (aid8 != null && (bool = LJII.get(aid8)) != null) {
                zBooleanValue2 = bool.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            sbLIZ.append(zBooleanValue2);
            C2188811AlT.LIZIZ(sbLIZ);
            CopyOnWriteArrayList<InterfaceC588420N6a> copyOnWriteArrayList = LJIILLIIL;
            if (copyOnWriteArrayList != null) {
                Iterator<InterfaceC588420N6a> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(aweme);
                }
            }
        }
        if (LJIILJJIL != i && aid != null && !Intrinsics.LJFF(aid, aid6)) {
            if (C2245741Cv6.LIZIZ(LJIILL)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[onViewHolderSelected] long video slide away, long video=");
                Aweme aweme3 = LJIILL;
                if (aweme3 != null) {
                    aid4 = aweme3.getAid();
                } else {
                    aid4 = null;
                }
                sbLIZ2.append(aid4);
                C2188811AlT.LIZIZ(sbLIZ2);
                LJI.remove(aid);
                HashMap<String, Boolean> map = LJIIJJI;
                Boolean bool3 = Boolean.TRUE;
                map.put(aid, bool3);
                if (((Boolean) LJIIL.getValue()).booleanValue()) {
                    LJ(aid);
                    LJIIIZ = false;
                    LJFF.put(aid, bool3);
                }
                Iterator<InterfaceC588420N6a> it3 = LJIILLIIL.iterator();
                while (it3.hasNext()) {
                    it3.next().LJ(aid);
                }
            } else if (C2245741Cv6.LIZJ(LJIILL)) {
                HashMap<String, Aweme> map2 = LIZ;
                Aweme aweme4 = LJIILL;
                if (aweme4 != null && (awemeRawAd = aweme4.getAwemeRawAd()) != null) {
                    creativeIdStr = awemeRawAd.getCreativeIdStr();
                } else {
                    creativeIdStr = null;
                }
                Aweme aweme5 = map2.get(creativeIdStr);
                if (aweme5 != null && (aid2 = aweme5.getAid()) != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[onViewHolderSelected] post roll slide away, long video=");
                    sbLIZ3.append(aid2);
                    sbLIZ3.append(", post roll=");
                    Aweme aweme6 = LJIILL;
                    if (aweme6 != null) {
                        aid3 = aweme6.getAid();
                    } else {
                        aid3 = null;
                    }
                    sbLIZ3.append(aid3);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    LJI.remove(aid2);
                    LJIIJJI.put(aid2, Boolean.TRUE);
                    LJIIIZ = false;
                    Iterator<InterfaceC588420N6a> it4 = LJIILLIIL.iterator();
                    while (it4.hasNext()) {
                        it4.next().LIZIZ(aid);
                    }
                } else {
                    return;
                }
            }
        }
        if (LJIILJJIL == i) {
            if (C2245741Cv6.LIZIZ(LJIILL) && C2245741Cv6.LIZJ(aweme)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("[onViewHolderSelected] long video -> post roll, long video=");
                Aweme aweme7 = LJIILL;
                if (aweme7 != null) {
                    aid5 = aweme7.getAid();
                }
                sbLIZ4.append(aid5);
                sbLIZ4.append(", post roll=");
                sbLIZ4.append(aweme.getAid());
                C2188811AlT.LIZIZ(sbLIZ4);
                if (((Boolean) LJIIL.getValue()).booleanValue()) {
                    LJ(aid);
                    LJIIIZ = false;
                    if (aid != null) {
                        LJFF.put(aid, Boolean.TRUE);
                    }
                }
                for (InterfaceC588420N6a interfaceC588420N6a : LJIILLIIL) {
                    if (aid != null) {
                        interfaceC588420N6a.LIZJ(aid);
                    }
                }
            } else if (C2245741Cv6.LIZJ(LJIILL) && C2245741Cv6.LIZIZ(aweme)) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("[onViewHolderSelected] post roll -> long video, post roll=");
                Aweme aweme8 = LJIILL;
                if (aweme8 != null) {
                    aid5 = aweme8.getAid();
                }
                sbLIZ5.append(aid5);
                sbLIZ5.append(", long video=");
                sbLIZ5.append(aweme.getAid());
                C2188811AlT.LIZIZ(sbLIZ5);
                for (InterfaceC588420N6a interfaceC588420N6a2 : LJIILLIIL) {
                    if (aid != null) {
                        interfaceC588420N6a2.LIZLLL(aid6);
                    }
                }
            }
        }
        LJIILJJIL = i;
        LJIILL = aweme;
    }
}
