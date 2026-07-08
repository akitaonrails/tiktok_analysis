package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.nearby.container.repo.INearbyApi;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13Un, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20019113Un {
    public static final C20019113Un LIZ = new C20019113Un();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(349));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(350));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(351));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(347));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(348));
    public static final C13M7<String> LJI = new C13M7<>();
    public static final C13M7<String> LJII = new C13M7<>();

    public static C13M7 LIZJ() {
        return (C13M7) LJ.getValue();
    }

    public static C13M7 LIZLLL() {
        return (C13M7) LJFF.getValue();
    }

    public static C13M7 LJ() {
        return (C13M7) LIZJ.getValue();
    }

    public static C13M7 LJFF() {
        return (C13M7) LIZLLL.getValue();
    }

    public static boolean LJI() {
        return ((Boolean) C266820Acy.LIZ.getValue()).booleanValue();
    }

    public static INearbyApi.UnimpressVideos LIZ() {
        if (!LJI()) {
            return null;
        }
        if (LJ().isEmpty() && LJFF().isEmpty()) {
            return null;
        }
        return new INearbyApi.UnimpressVideos(C13LP.LLIIII(LJ()), C13LP.LLIIII(LJFF()));
    }

    public static void LIZIZ() {
        if (LJI()) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.13Uo
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("NearbyDuplicationManager@d9fe.flushPendingRemovals$1");
                    try {
                        C20019113Un.LIZ.getClass();
                        C20019113Un.LJIIJ("nearby_unimpress_aweme_ids", C20019113Un.LJ());
                        C20019113Un.LJIIJ("nearby_unimpress_group_ids", C20019113Un.LJFF());
                        C20019113Un.LJIIJ("nearby_cached_aweme_ids", C20019113Un.LIZJ());
                        C20019113Un.LJIIJ("nearby_cached_group_ids", C20019113Un.LIZLLL());
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("NearbyDuplicationManager@d9fe.flushPendingRemovals$1");
                }
            });
        }
    }

    public static Set LJIIIIZZ(String str) {
        Keva keva = (Keva) LIZIZ.getValue();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return keva.getStringSet(C2188811AlT.LIZIZ(sbLIZ), C08CX.INSTANCE);
    }

    public static void LJII(String str, String str2) {
        if (!LJI()) {
            return;
        }
        LJ().size();
        LJFF().size();
        LIZJ().size();
        LIZLLL().size();
        if (C123100dR.LIZ(str)) {
            LJ().remove(str);
            LIZJ().remove(str);
            LJI.add(str);
        }
        if (C123100dR.LIZ(str2)) {
            LJFF().remove(str2);
            LIZLLL().remove(str2);
            LJII.add(str2);
        }
    }

    public static void LJIIIZ(final List list, final boolean z) {
        if (LJI() && list != null && !list.isEmpty()) {
            C823050WQl.LJFF().execute(new Runnable() { // from class: X.13Um
                public final void LIZ() {
                    if (z) {
                        C20019113Un.LIZ.getClass();
                        C20019113Un.LJ().clear();
                        C20019113Un.LJFF().clear();
                        C20019113Un.LJI.clear();
                        C20019113Un.LJII.clear();
                    }
                    for (Aweme aweme : list) {
                        if (C123100dR.LIZ(aweme.getAid()) && !C20019113Un.LJI.contains(aweme.getAid())) {
                            C20019113Un.LIZ.getClass();
                            C20019113Un.LJ().add(aweme.getAid());
                        }
                        if (C123100dR.LIZ(aweme.getGroupId()) && !C20019113Un.LJII.contains(aweme.getGroupId())) {
                            C20019113Un.LIZ.getClass();
                            C20019113Un.LJFF().add(aweme.getGroupId());
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("NearbyDuplicationManager@d9fe.updateFromResponse$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("NearbyDuplicationManager@d9fe.updateFromResponse$1");
                }
            });
        }
    }

    public static void LJIIJ(String str, C13M7 c13m7) {
        int size = c13m7.size();
        Set<String> setLLIIJI = c13m7;
        if (size > 200) {
            setLLIIJI = C13LP.LLIIJI(C13LP.LL(c13m7, 200));
        }
        Keva keva = (Keva) LIZIZ.getValue();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(str);
        keva.storeStringSet(C2188811AlT.LIZIZ(sbLIZ), setLLIIJI);
    }
}
