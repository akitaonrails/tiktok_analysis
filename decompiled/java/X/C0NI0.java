package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3ByPassPreloadConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0NI0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NI0 {
    public static final C0NI0 LIZ = new C0NI0();
    public static final Set<String> LIZIZ = new LinkedHashSet();

    @InterfaceC1294060jmO
    public static void LIZJ(Context context, List list) {
        Set<String> set = LIZIZ;
        set.clear();
        C0W17.LIZJ("preload_util", "doPreloadWhenRefresh");
        if (list != null) {
            Pair pairLIZLLL = LIZLLL(list, set);
            List list2 = (List) pairLIZLLL.getFirst();
            List list3 = (List) pairLIZLLL.getSecond();
            C0NI2 c0ni2 = C0NI2.REFRESH;
            LJI(list2, c0ni2);
            LJ(context, c0ni2, list3);
        }
    }

    public static Pair LIZLLL(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC1361290lWp interfaceC1361290lWp = (InterfaceC1361290lWp) it2.next();
                if (interfaceC1361290lWp instanceof InterfaceC1361270lWn) {
                    C0OB8 c0ob8 = (C0OB8) interfaceC1361290lWp;
                    if (!set.contains(c0ob8.getAweme().getAid())) {
                        arrayList.add(c0ob8.getAweme());
                        set.add(c0ob8.getAweme().getAid());
                        if ((interfaceC1361290lWp instanceof C1361190lWf) || (interfaceC1361290lWp instanceof C1361230lWj)) {
                            arrayList2.add(((C0OB8) interfaceC1361290lWp).getAweme());
                        }
                    }
                }
            }
        }
        return new Pair(arrayList, arrayList2);
    }

    public static void LJFF(Aweme aweme, C0NI2 c0ni2) {
        boolean z;
        EnumC1334360kpO enumC1334360kpO;
        if (aweme == null) {
            return;
        }
        if (c0ni2 == C0NI2.BYPASS) {
            z = true;
            if (!((FriendsV3ByPassPreloadConfig) C0NI3.LIZIZ.getValue()).enable) {
                return;
            }
        } else {
            z = false;
        }
        Video video = aweme.getVideo();
        if (video == null) {
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(video.getCover()));
        if (z) {
            enumC1334360kpO = EnumC1334360kpO.LOW;
        } else {
            enumC1334360kpO = EnumC1334360kpO.HIGH;
        }
        c1331670kl3LJIIIIZZ.LJJIII = enumC1334360kpO;
        c1331670kl3LJIIIIZZ.LJIILIIL();
    }

    public static void LJI(List list, C0NI2 c0ni2) {
        String aid;
        if (((Boolean) C282900B6y.LIZ.getValue()).booleanValue()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                LIZ.getClass();
                LJFF(aweme, c0ni2);
            }
        }
        int i = C0NI1.LIZ[c0ni2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                    return;
                } else {
                    C1483340ohg.LIZ(list, false, false, "social_friends_tab_v3", true, "social_friends_tab_v3");
                    return;
                }
            }
            C1483340ohg.LJJIIZ("social_friends_tab_v3", "social_friends_tab_v3", list);
            return;
        }
        if (!((FriendsV3ByPassPreloadConfig) C0NI3.LIZIZ.getValue()).enable) {
            return;
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Aweme aweme2 = (Aweme) it3.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadVideos-byPass, aid=");
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
            int i2 = ((FriendsV3ByPassPreloadConfig) C0NI3.LIZIZ.getValue()).size;
            EnumC591520NHy enumC591520NHy = EnumC591520NHy.PRELOAD_TASK_PRIORITY_LOW;
            C0NIL c0nil = new C0NIL(C0NKA.Normal, "social_friends_tab_v3");
            LIZ.getClass();
            C1483340ohg.LIZJ(aweme2, new C0NI4(i2, enumC591520NHy, c0nil, null));
        }
    }

    public static void LIZ(Context context, C0NI2 c0ni2, List list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doPreload, strategy=");
        sbLIZ.append(c0ni2);
        C0W17.LIZJ("preload_util", C2188811AlT.LIZIZ(sbLIZ));
        if (c0ni2 == C0NI2.REFRESH) {
            LIZIZ.clear();
        }
        if (list != null) {
            Pair pairLIZLLL = LIZLLL(list, LIZIZ);
            List list2 = (List) pairLIZLLL.getFirst();
            List list3 = (List) pairLIZLLL.getSecond();
            LJI(list2, c0ni2);
            LJ(context, c0ni2, list3);
        }
    }

    public static void LJ(Context context, C0NI2 c0ni2, List list) {
        boolean z;
        EnumC1334360kpO enumC1334360kpO;
        if (c0ni2 == C0NI2.BYPASS) {
            z = true;
            if (!((FriendsV3ByPassPreloadConfig) C0NI3.LIZIZ.getValue()).enable) {
                return;
            }
        } else {
            z = false;
        }
        if (context != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                if (aweme != null && C582980Mtk.LIZIZ(aweme) && aweme != null) {
                    int iIntValue = ((Number) C278560Avu.LIZ.getValue()).intValue();
                    C1EE2 c1ee2 = C1EE2.LIZIZ;
                    IntRange intRange = new IntRange(0, iIntValue);
                    if (z) {
                        enumC1334360kpO = EnumC1334360kpO.LOW;
                    } else {
                        enumC1334360kpO = EnumC1334360kpO.HIGH;
                    }
                    c1ee2.LJJIFFI(context, "homepage_friends", aweme, intRange, enumC1334360kpO);
                }
            }
        }
    }

    public static void LIZIZ(Context context, List list, String str, Integer num, C0NI2 c0ni2, C0NI2 c0ni22) {
        int iIntValue;
        int size;
        if (context != null && list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(((InterfaceC1361290lWp) it2.next()).getUniqueKey(), str)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() > 0) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            if (num != null) {
                size = num.intValue();
            } else {
                size = list.size();
            }
            int i2 = size + iIntValue;
            int size2 = list.size();
            if (i2 > size2) {
                i2 = size2;
            }
            LIZ(context, c0ni2, list.subList(iIntValue, i2));
            if (c0ni22 != null && iIntValue > 0) {
                LIZ(context, c0ni22, list.subList(0, iIntValue));
            }
        }
    }
}
