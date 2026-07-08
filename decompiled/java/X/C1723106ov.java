package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1723106ov implements InterfaceC883330Yl1 {
    public static final C1723106ov LL;
    public static List<C1723206ow> LLILLJJLI;
    public static List<C1723206ow> LLILLL;

    static {
        C1723106ov c1723106ov = new C1723106ov();
        LL = c1723106ov;
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        C883250Ykt.LIZIZ(c1723106ov);
    }

    public static final String LIZIZ() {
        String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
        return curUserId == null ? "" : curUserId;
    }

    public static void LIZ(List list) {
        C1723106ov c1723106ov = LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("share_video_recent_records");
        sbLIZ.append(LIZIZ());
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        String strLIZIZ = LIZIZ();
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        LLILLJJLI = null;
        C23250099c.LIZLLL(c054gLIZ, null, null, new C1330005Ik(list, repo, strLIZIZ, null), 3);
    }

    public static C1723206ow LIZJ(String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{":"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() == 2) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
            EnumC1330205Im enumC1330205Im = EnumC1330205Im.EXTERNAL;
            int value = enumC1330205Im.getValue();
            if (numLJIIJJI == null || numLJIIJJI.intValue() != value) {
                enumC1330205Im = EnumC1330205Im.INTERNAL;
                int value2 = enumC1330205Im.getValue();
                if (numLJIIJJI == null || numLJIIJJI.intValue() != value2) {
                    return null;
                }
            }
            return new C1723206ow(enumC1330205Im, (String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable, java.util.List, java.util.List<X.06ow>] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<X.06ow>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public final synchronized void LJFF(Keva keva, List list) {
        ?? LJIIJJI;
        ?? arrayList = LLILLL;
        if (arrayList == 0) {
            List listLJJLL = C13LQ.LJJLL(keva.getStringArray("recent_video_share_targets", new String[0]));
            arrayList = new ArrayList();
            Iterator it2 = listLJJLL.iterator();
            while (it2.hasNext()) {
                C1723206ow c1723206owLIZJ = LIZJ((String) it2.next());
                if (c1723206owLIZJ != null) {
                    arrayList.add(c1723206owLIZJ);
                }
            }
        }
        if (list.size() + arrayList.size() > 10) {
            if (list.size() >= 10) {
                List listSubList = list.subList(list.size() - 10, list.size());
                LJIIJJI = new ArrayList();
                Iterator it3 = listSubList.iterator();
                while (it3.hasNext()) {
                    C1723206ow c1723206owLIZJ2 = LIZJ((String) it3.next());
                    if (c1723206owLIZJ2 != null) {
                        LJIIJJI.add(c1723206owLIZJ2);
                    }
                }
            } else {
                C323580CmK c323580CmK = new C323580CmK(2);
                c323580CmK.LIZIZ(arrayList.subList((list.size() + arrayList.size()) - 10, arrayList.size()).toArray(new C1723206ow[0]));
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    C1723206ow c1723206owLIZJ3 = LIZJ((String) it4.next());
                    if (c1723206owLIZJ3 != null) {
                        arrayList2.add(c1723206owLIZJ3);
                    }
                }
                c323580CmK.LIZIZ(arrayList2.toArray(new C1723206ow[0]));
                LJIIJJI = C1697810uHb.LJIIJJI(c323580CmK.LIZLLL(new C1723206ow[c323580CmK.LIZJ()]));
            }
        } else {
            C323580CmK c323580CmK2 = new C323580CmK(2);
            c323580CmK2.LIZIZ(arrayList.toArray(new C1723206ow[0]));
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                C1723206ow c1723206owLIZJ4 = LIZJ((String) it5.next());
                if (c1723206owLIZJ4 != null) {
                    arrayList3.add(c1723206owLIZJ4);
                }
            }
            c323580CmK2.LIZIZ(arrayList3.toArray(new C1723206ow[0]));
            LJIIJJI = C1697810uHb.LJIIJJI(c323580CmK2.LIZLLL(new C1723206ow[c323580CmK2.LIZJ()]));
        }
        LLILLL = LJIIJJI;
        if (LJIIJJI != 0) {
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(LJIIJJI, 10));
            Iterator it6 = LJIIJJI.iterator();
            while (it6.hasNext()) {
                arrayList4.add(((C1723206ow) it6.next()).toString());
            }
            keva.storeStringArray("recent_video_share_targets", (String[]) arrayList4.toArray(new String[0]));
        }
    }

    @Override // X.InterfaceC883330Yl1
    public final void LJII(EnumC883280Ykw enumC883280Ykw, C883460YlE c883460YlE) {
        if (enumC883280Ykw != EnumC883280Ykw.UNKNOWN) {
            LLILLL = null;
        }
    }
}
