package X;

import Y.AObjectS62S0000000_9;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.simkit.model.FeedCacheStrategyConfig;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NEO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NEO {
    public static boolean LJIILL;
    public static final C01GW<C0NEO> LJIILLIIL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AObjectS62S0000000_9(7));
    public boolean LIZ;
    public int LIZIZ;
    public C1475410oUt LIZLLL;
    public InterfaceC1475300oUi LJI;
    public final int LIZJ = 2;
    public final C0NEQ LJ = new InterfaceC1475300oUi() { // from class: X.0NEQ
        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void Sm() {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void Z9() {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void ck() {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void qc(long j, long j2, String str) {
        }

        @Override // X.InterfaceC1475300oUi
        public final void LLLLZLLIL(String str) {
            Iterator<C0NER> it2 = this.LL.LJFF.iterator();
            while (it2.hasNext()) {
                it2.next().LLLLZLLIL(str);
            }
        }

        @Override // X.InterfaceC1475300oUi
        public final void T8(List<SimVideoUrlModel> list) {
            if (C1474810oTv.LJIJ()) {
                C0NEO c0neo = this.LL;
                if (c0neo.LIZ) {
                    InterfaceC1475300oUi interfaceC1475300oUi = c0neo.LJI;
                    if (interfaceC1475300oUi != null) {
                        interfaceC1475300oUi.T8(list);
                        return;
                    }
                    return;
                }
            }
            if (!this.LL.LIZ) {
                return;
            }
            if (list != null) {
                list.size();
            }
            if (!(!this.LL.LJIIIIZZ.isEmpty())) {
                return;
            }
            for (Map.Entry<String, SimVideoUrlModel> entry : this.LL.LJIIIIZZ.entrySet()) {
                if (list != null) {
                    C0NEO c0neo2 = this.LL;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<SimVideoUrlModel> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(entry.getKey(), it2.next().getSourceId()) && c0neo2.LJIIIIZZ.get(entry.getKey()) != null && c0neo2.LIZLLL != null) {
                            C1478160oZK.LIZ().LJJLIIIJLJLI(c0neo2.LJIIIIZZ.get(entry.getKey()), Integer.MAX_VALUE, C0NKB.LIZIZ, c0neo2.LIZLLL);
                        }
                        arrayList.add(Unit.LIZ);
                    }
                }
            }
        }

        @Override // X.InterfaceC1475300oUi
        public final void Dd(int i, String str, String str2, String str3) {
            String strLIZIZ;
            InterfaceC1475300oUi interfaceC1475300oUi;
            if (C1474810oTv.LJIJ()) {
                C0NEO c0neo = this.LL;
                if (c0neo.LIZ) {
                    String strLIZIZ2 = c0neo.LIZIZ(str);
                    if (strLIZIZ2 != null && (interfaceC1475300oUi = c0neo.LJI) != null) {
                        interfaceC1475300oUi.Dd(i, strLIZIZ2, str2, str3);
                        return;
                    }
                    return;
                }
            }
            C0NEO c0neo2 = this.LL;
            if (!c0neo2.LIZ || (strLIZIZ = c0neo2.LIZIZ(str)) == null) {
                return;
            }
            C0NEO c0neo3 = this.LL;
            if (c0neo3.LIZIZ >= c0neo3.LIZJ) {
                c0neo3.LJIIIIZZ.remove(strLIZIZ);
                InterfaceC1475300oUi interfaceC1475300oUi2 = this.LL.LJI;
                if (interfaceC1475300oUi2 != null) {
                    interfaceC1475300oUi2.Dd(i, strLIZIZ, str2, str3);
                }
            }
            C0NEO c0neo4 = this.LL;
            c0neo4.LIZIZ++;
            if (c0neo4.LJIIIIZZ.containsKey(strLIZIZ) && this.LL.LJIIIIZZ.get(strLIZIZ) != null && this.LL.LIZLLL != null) {
                C1478160oZK.LIZ().LJJLIIIJLJLI(this.LL.LJIIIIZZ.get(strLIZIZ), Integer.MAX_VALUE, C0NKB.LIZIZ, this.LL.LIZLLL);
                return;
            }
            this.LL.LJIIIIZZ.remove(strLIZIZ);
            InterfaceC1475300oUi interfaceC1475300oUi3 = this.LL.LJI;
            if (interfaceC1475300oUi3 == null) {
                return;
            }
            interfaceC1475300oUi3.Dd(i, strLIZIZ, str2, str3);
        }

        @Override // X.InterfaceC1475300oUi
        public final void Xi(String str, String str2, long j, long j2) {
            for (C0NER c0ner : this.LL.LJFF) {
                if (c0ner != null) {
                    c0ner.LLLLZLLLI(Long.valueOf(j), str, Long.valueOf(j2), str2);
                }
            }
        }

        @Override // X.InterfaceC1475300oUi
        public final void t8(String str, long j, long j2, String str2) {
            String strLIZIZ;
            InterfaceC1475300oUi interfaceC1475300oUi;
            if (C1474810oTv.LJIJ()) {
                C0NEO c0neo = this.LL;
                if (c0neo.LIZ) {
                    String strLIZIZ2 = c0neo.LIZIZ(str);
                    if (strLIZIZ2 != null && strLIZIZ2.length() != 0 && str != null && str.length() != 0 && str2 != null && str2.length() != 0 && (interfaceC1475300oUi = c0neo.LJI) != null) {
                        interfaceC1475300oUi.Xi(strLIZIZ2, str, j, j2);
                        return;
                    }
                    return;
                }
            }
            if (!this.LL.LIZ) {
                return;
            }
            if (j == j2) {
                tf(j, j2, str, str2);
                return;
            }
            if (!C1474810oTv.LJIJI() || (strLIZIZ = this.LL.LIZIZ(str)) == null || strLIZIZ.length() == 0 || str == null || str.length() == 0 || str2 == null || str2.length() == 0 || this.LL.LJIIJ.contains(strLIZIZ)) {
                return;
            }
            this.LL.getClass();
            if (((Number) C1474810oTv.k4.getValue()).intValue() > 0 && j2 < ((Number) r1.getValue()).intValue() * 1024) {
                return;
            }
            this.LL.LJIIJ.add(strLIZIZ);
            InterfaceC1475300oUi interfaceC1475300oUi2 = this.LL.LJI;
            if (interfaceC1475300oUi2 == null) {
                return;
            }
            interfaceC1475300oUi2.Xi(strLIZIZ, str, j, j2);
        }

        @Override // X.InterfaceC1475300oUi
        public final void tf(long j, long j2, String str, String str2) {
            String strLIZIZ;
            InterfaceC1475300oUi interfaceC1475300oUi;
            if (C1474810oTv.LJIJ()) {
                C0NEO c0neo = this.LL;
                if (c0neo.LIZ) {
                    String strLIZIZ2 = c0neo.LIZIZ(str);
                    if (strLIZIZ2 != null && strLIZIZ2.length() != 0 && str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                        if ((!((Boolean) C1474810oTv.j4.getValue()).booleanValue() || (j == j2 && j > 0)) && (interfaceC1475300oUi = c0neo.LJI) != null) {
                            interfaceC1475300oUi.tf(j, j2, strLIZIZ2, str2);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            C0NEO c0neo2 = this.LL;
            if (!c0neo2.LIZ || (strLIZIZ = c0neo2.LIZIZ(str)) == null || strLIZIZ.length() == 0 || str == null || str.length() == 0 || str2 == null || str2.length() == 0 || this.LL.LJIIIZ.contains(strLIZIZ)) {
                return;
            }
            this.LL.getClass();
            if (((Boolean) C1474810oTv.j4.getValue()).booleanValue() && (j != j2 || j <= 0)) {
                return;
            }
            this.LL.LJIIIIZZ.remove(strLIZIZ);
            this.LL.LJIIIZ.add(strLIZIZ);
            C0VSJ c0vsj = new C0VSJ(str2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String parent = c0vsj.getParent();
            if (parent != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(parent);
                sbLIZ2.append(File.separator);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
                if (strLIZIZ3 != null) {
                    sbLIZ.append(strLIZIZ3);
                    sbLIZ.append(strLIZIZ);
                    String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ);
                    c0vsj.renameTo(new C0VSJ(strLIZIZ4));
                    InterfaceC1475300oUi interfaceC1475300oUi2 = this.LL.LJI;
                    if (interfaceC1475300oUi2 == null) {
                        return;
                    }
                    interfaceC1475300oUi2.tf(j, j2, strLIZIZ, strLIZIZ4);
                    return;
                }
            }
            Dd(10001, str, str2, "file path is null");
        }
    };
    public final CopyOnWriteArrayList<C0NER> LJFF = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<String, List<String>> LJII = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, SimVideoUrlModel> LJIIIIZZ = new ConcurrentHashMap<>();
    public final Set<String> LJIIIZ = new LinkedHashSet();
    public final Set<String> LJIIJ = new LinkedHashSet();
    public int LJIIJJI = -1;
    public int LJIIL = -1;
    public long LJIILIIL = -1;
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new AObjectS62S0000000_9(8));

    public static final C0NEO LJFF() {
        return LJIILLIIL.getValue();
    }

    public final FeedCacheStrategyConfig LJI() {
        return (FeedCacheStrategyConfig) this.LJIILJJIL.getValue();
    }

    public final void LIZ(C0NER c0ner) {
        if (c0ner != null) {
            if (!LJIILL) {
                C1478160oZK.LIZ().LIZLLL(this.LJ);
                LJIILL = true;
            }
            this.LJFF.add(c0ner);
        }
    }

    public final String LIZIZ(String str) {
        for (Map.Entry<String, List<String>> entry : this.LJII.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(str, it2.next())) {
                    return key;
                }
            }
        }
        return null;
    }

    public final int LIZJ(int i) {
        Map<Integer, Integer> map;
        Integer num;
        FeedCacheStrategyConfig feedCacheStrategyConfigLJI = LJI();
        if (feedCacheStrategyConfigLJI != null && (map = feedCacheStrategyConfigLJI.activenessExpireTimeMapping) != null && (num = map.get(Integer.valueOf(i))) != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int LIZLLL(int i) {
        Map<Integer, Integer> map;
        Integer num;
        FeedCacheStrategyConfig feedCacheStrategyConfigLJI = LJI();
        if (feedCacheStrategyConfigLJI != null && (map = feedCacheStrategyConfigLJI.createtimeExpireTimeMapping) != null && (num = map.get(Integer.valueOf(i))) != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int LJ(String str) {
        Map<String, Integer> map;
        Integer num;
        FeedCacheStrategyConfig feedCacheStrategyConfigLJI = LJI();
        if (feedCacheStrategyConfigLJI != null && (map = feedCacheStrategyConfigLJI.expireTimeMappingCoefficient) != null && (num = map.get(str)) != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int LJII(int i) {
        Map<Integer, Integer> map;
        Integer num;
        FeedCacheStrategyConfig feedCacheStrategyConfigLJI = LJI();
        if (feedCacheStrategyConfigLJI != null && (map = feedCacheStrategyConfigLJI.netSpeedLabelExpireTimeMapping) != null && (num = map.get(Integer.valueOf(i))) != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int LJIIIIZZ(int i) {
        Map<Integer, Integer> map;
        Integer num;
        FeedCacheStrategyConfig feedCacheStrategyConfigLJI = LJI();
        if (feedCacheStrategyConfigLJI != null && (map = feedCacheStrategyConfigLJI.tier3ExpireTimeMapping) != null && (num = map.get(Integer.valueOf(i))) != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int LJIIIZ(int i) {
        Map<Integer, Integer> map;
        Integer num;
        FeedCacheStrategyConfig feedCacheStrategyConfigLJI = LJI();
        if (feedCacheStrategyConfigLJI != null && (map = feedCacheStrategyConfigLJI.timelinessExpireTimeMapping) != null && (num = map.get(Integer.valueOf(i))) != null) {
            return num.intValue();
        }
        return 0;
    }
}
