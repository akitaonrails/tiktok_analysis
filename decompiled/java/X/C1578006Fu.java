package X;

import Y.AComparatorS21S0000000_2;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakCmdMessageUploadInfo;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06Fu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1578006Fu {
    public static final C01GW<C1578006Fu> LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(553));
    public final Function0<Keva> LIZ;
    public final Object LIZIZ;
    public final C01GW LIZJ;

    public C1578006Fu() {
        this(null);
    }

    public final List<Pair<String, StreakCmdMessageUploadInfo>> LIZJ() {
        try {
            Map<String, ?> all = this.LIZ.invoke().getAll();
            ArrayList<Pair> arrayList = new ArrayList(all.size());
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), C09EF.LIZ.LJIIIIZZ(String.valueOf(entry.getValue()), (Type) this.LIZJ.getValue())));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Pair pair : arrayList) {
                Iterable iterable = (Iterable) pair.getSecond();
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new Pair(pair.getFirst(), (StreakCmdMessageUploadInfo) it2.next()));
                }
                C19719612Di.LJJI(C13LP.LLIIII(arrayList3), arrayList2);
            }
            return arrayList2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    public C1578006Fu(Object obj) {
        AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(552);
        Object obj2 = new Object();
        this.LIZ = aFwS187S0000000_2;
        this.LIZIZ = obj2;
        this.LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(554));
    }

    public final void LIZIZ(int i) {
        if (i <= 0) {
            return;
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS21S0000000_2(8), LIZJ());
        this.LIZ.invoke().clear();
        if (i >= listLJLLLL.size()) {
            return;
        }
        List<Pair> listSubList = listLJLLLL.subList(i, listLJLLLL.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : listSubList) {
            Object first = pair.getFirst();
            Object arrayList = linkedHashMap.get(first);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(first, arrayList);
            }
            ((List) arrayList).add(pair.getSecond());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            this.LIZ.invoke().storeString((String) entry.getKey(), GsonProtectorUtils.toJson(C09EF.LIZ, entry.getValue()));
        }
    }

    public final List<StreakCmdMessageUploadInfo> LIZLLL(String str) {
        try {
            List<StreakCmdMessageUploadInfo> list = (List) C09EF.LIZ.LJIIIIZZ(this.LIZ.invoke().getString(str, null), (Type) this.LIZJ.getValue());
            if (list == null) {
                return C13BV.INSTANCE;
            }
            return list;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    public final void LIZ(String str, StreakCmdMessageUploadInfo streakCmdMessageUploadInfo) {
        try {
            synchronized (this.LIZIZ) {
                try {
                    List<Pair<String, StreakCmdMessageUploadInfo>> listLIZJ = LIZJ();
                    if (listLIZJ.size() >= 50) {
                        int size = listLIZJ.size() - 50;
                        if (size == 0) {
                            Pair pair = (Pair) C13LP.LJJJJZI(C13LP.LJLLLL(new AComparatorS21S0000000_2(7), listLIZJ));
                            String str2 = (String) pair.getFirst();
                            StreakCmdMessageUploadInfo streakCmdMessageUploadInfo2 = (StreakCmdMessageUploadInfo) pair.getSecond();
                            ArrayList arrayList = new ArrayList(LIZLLL(str2));
                            arrayList.remove(streakCmdMessageUploadInfo2);
                            this.LIZ.invoke().storeString(str2, GsonProtectorUtils.toJson(C09EF.LIZ, arrayList));
                        } else {
                            LIZIZ(size + 1);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(LIZLLL(str));
                    arrayList2.add(streakCmdMessageUploadInfo);
                    this.LIZ.invoke().storeString(str, GsonProtectorUtils.toJson(C09EF.LIZ, arrayList2));
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Exception th) {
        }
    }
}
