package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.relation.api.PlaceUserInfo;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0rPS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587360rPS {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LJFF;
    public static PlaceUserInfo LJI;
    public static final ArrayList<String> LIZ = new ArrayList<>();
    public static final ArrayList<Aweme> LIZLLL = new ArrayList<>();
    public static String LJ = "";
    public static final ArrayList<String> LJII = new ArrayList<>();

    public static boolean LIZJ() {
        PlaceUserInfo placeUserInfo = LJI;
        return C123100dR.LIZ(placeUserInfo != null ? placeUserInfo.uid : null);
    }

    public static void LIZLLL() {
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ != null) {
            C1570330qxz c1570330qxz = C680080Qly.LIZIZ(c19egLIZIZ).LL;
            if (c1570330qxz.LIZ == 2) {
                String str = c1570330qxz.LIZIZ;
                c1570330qxz.LIZIZ = null;
                if (str == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    ListProtector.add(LIZ, 0, str);
                    c1570330qxz.LIZIZ = "";
                }
                boolean z = c1570330qxz.LJI;
                c1570330qxz.LJI = false;
                LIZJ = z;
            }
        }
    }

    public static C1587420rPY LIZ() {
        LIZLLL();
        ArrayList<String> arrayList = LIZ;
        if (arrayList.size() == 0) {
            return new C1587420rPY("", false, false);
        }
        C1587420rPY c1587420rPY = new C1587420rPY(C08JS.LIZLLL(arrayList), LIZIZ, LIZJ);
        arrayList.clear();
        LIZIZ = false;
        LIZJ = false;
        return c1587420rPY;
    }

    public static C1587420rPY LIZIZ(boolean z) {
        if (z) {
            C1587540rPk.LL.getClass();
            if (!C1587540rPk.LLIZLLLIL) {
                LIZLLL();
                ArrayList<String> arrayList = LJII;
                if (arrayList.size() == 0) {
                    return new C1587420rPY("", null, false, false, true);
                }
                C1587420rPY c1587420rPY = new C1587420rPY(C08JS.LIZLLL(arrayList), null, LIZIZ, LIZJ, true);
                arrayList.clear();
                return c1587420rPY;
            }
        }
        return LIZ();
    }
}
