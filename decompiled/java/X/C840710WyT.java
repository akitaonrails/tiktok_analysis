package X;

import com.bytedance.helios.network.api.consumer.OperateHistory;
import com.bytedance.helios.network.api.consumer.ReportParam;
import com.bytedance.pumbaa.ruler.base.models.RuleModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840710WyT {
    public C840750WyX LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public C840990Wyv LJI;
    public boolean LJII;
    public Double LJIIIIZZ;
    public boolean LJIIIZ;
    public Throwable LJIIJ;
    public final String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public boolean LJIILJJIL;
    public Set<String> LJIILL;
    public final ConcurrentHashMap<String, Double> LJIILLIIL;
    public transient Map<String, Object> LJIIZILJ;
    public Set<String> LJIJ;
    public Set<String> LJIJI;
    public Map<String, Object> LJIJJ;
    public List<ReportParam> LJIJJLI;
    public List<RuleModel> LJIL;
    public List<OperateHistory> LJJ;
    public final long LJJI;
    public C840970Wyt LJJIFFI;
    public final String LJJII;
    public String LJJIII;

    public C840710WyT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C840710WyT)) {
            return false;
        }
        C840710WyT c840710WyT = (C840710WyT) obj;
        return Intrinsics.LJFF(this.LIZ, c840710WyT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c840710WyT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c840710WyT.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c840710WyT.LIZLLL) && Intrinsics.LJFF(this.LJ, c840710WyT.LJ) && Intrinsics.LJFF(this.LJFF, c840710WyT.LJFF) && Intrinsics.LJFF(this.LJI, c840710WyT.LJI) && this.LJII == c840710WyT.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c840710WyT.LJIIIIZZ) && this.LJIIIZ == c840710WyT.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c840710WyT.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c840710WyT.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c840710WyT.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c840710WyT.LJIILIIL) && this.LJIILJJIL == c840710WyT.LJIILJJIL && Intrinsics.LJFF(this.LJIILL, c840710WyT.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c840710WyT.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c840710WyT.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c840710WyT.LJIJ) && Intrinsics.LJFF(this.LJIJI, c840710WyT.LJIJI) && Intrinsics.LJFF(this.LJIJJ, c840710WyT.LJIJJ) && Intrinsics.LJFF(this.LJIJJLI, c840710WyT.LJIJJLI) && Intrinsics.LJFF(this.LJIL, c840710WyT.LJIL) && Intrinsics.LJFF(this.LJJ, c840710WyT.LJJ) && this.LJJI == c840710WyT.LJJI && Intrinsics.LJFF(this.LJJIFFI, c840710WyT.LJJIFFI) && Intrinsics.LJFF(this.LJJII, c840710WyT.LJJII) && Intrinsics.LJFF(this.LJJIII, c840710WyT.LJJIII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31;
        boolean z = this.LJII;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode + r0) * 31;
        Double d = this.LJIIIIZZ;
        int iHashCode2 = (i + (d == null ? 0 : d.hashCode())) * 31;
        boolean z2 = this.LJIIIZ;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (iHashCode2 + r02) * 31;
        Throwable th = this.LJIIJ;
        int iHashCode3 = (i2 + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.LJIIJJI;
        return ((((((((((((((((((((((((((((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31) + (this.LJIILJJIL ? 1 : 0)) * 31) + this.LJIILL.hashCode()) * 31) + this.LJIILLIIL.hashCode()) * 31) + this.LJIIZILJ.hashCode()) * 31) + this.LJIJ.hashCode()) * 31) + this.LJIJI.hashCode()) * 31) + this.LJIJJ.hashCode()) * 31) + this.LJIJJLI.hashCode()) * 31) + this.LJIL.hashCode()) * 31) + this.LJJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJJI)) * 31) + this.LJJIFFI.hashCode()) * 31) + this.LJJII.hashCode()) * 31) + this.LJJIII.hashCode();
    }

    public final String toString() {
        return "BaseEvent(invokeContext=" + this.LIZ + ", eventType=" + this.LIZIZ + ", eventSource=" + this.LIZJ + ", settingsVersion=" + this.LIZLLL + ", userRegion=" + this.LJ + ", regionSource=" + this.LJFF + ", sampleRateModel=" + this.LJI + ", inventoryCollection=" + this.LJII + ", inventorySample=" + this.LJIIIIZZ + ", isFinalModified=" + this.LJIIIZ + ", throwable=" + this.LJIIJ + ", stackTrace=" + this.LJIIJJI + ", currentPage=" + this.LJIIL + ", currentRegion=" + this.LJIILIIL + ", isBackground=" + this.LJIILJJIL + ", appScenes=" + this.LJIILL + ", strategyIds=" + this.LJIILLIIL + ", extraInfo=" + this.LJIIZILJ + ", monitorScenes=" + this.LJIJ + ", reportTags=" + this.LJIJI + ", engineParams=" + this.LJIJJ + ", reportParams=" + this.LJIJJLI + ", hitRules=" + this.LJIL + ", operateHistory=" + this.LJJ + ", callTime=" + this.LJJI + ", handleResult=" + this.LJJIFFI + ", sdkVersion=" + this.LJJII + ", uuid=" + this.LJJIII + ')';
    }

    public /* synthetic */ C840710WyT(int i) {
        this(new C840750WyX(0), "", "", "", "", "", new C840990Wyv(15), false, null, false, null, null, "", "", false, new LinkedHashSet(), new ConcurrentHashMap(), new LinkedHashMap(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashMap(), new ArrayList(), new ArrayList(), new ArrayList(), System.currentTimeMillis(), new C840970Wyt(0), "6.22.0.1-bugfix", UUID.randomUUID().toString());
    }

    public static C840710WyT LIZ(C840710WyT c840710WyT) {
        C840750WyX c840750WyX = c840710WyT.LIZ;
        String str = c840710WyT.LIZIZ;
        String str2 = c840710WyT.LIZJ;
        String str3 = c840710WyT.LIZLLL;
        String str4 = c840710WyT.LJ;
        String str5 = c840710WyT.LJFF;
        C840990Wyv c840990Wyv = c840710WyT.LJI;
        boolean z = c840710WyT.LJII;
        Double d = c840710WyT.LJIIIIZZ;
        boolean z2 = c840710WyT.LJIIIZ;
        Throwable th = c840710WyT.LJIIJ;
        String str6 = c840710WyT.LJIIJJI;
        String str7 = c840710WyT.LJIIL;
        String str8 = c840710WyT.LJIILIIL;
        boolean z3 = c840710WyT.LJIILJJIL;
        Set<String> set = c840710WyT.LJIILL;
        ConcurrentHashMap<String, Double> concurrentHashMap = c840710WyT.LJIILLIIL;
        Map<String, Object> map = c840710WyT.LJIIZILJ;
        Set<String> set2 = c840710WyT.LJIJ;
        Set<String> set3 = c840710WyT.LJIJI;
        Map<String, Object> map2 = c840710WyT.LJIJJ;
        List<ReportParam> list = c840710WyT.LJIJJLI;
        List<RuleModel> list2 = c840710WyT.LJIL;
        List<OperateHistory> list3 = c840710WyT.LJJ;
        long j = c840710WyT.LJJI;
        C840970Wyt c840970Wyt = c840710WyT.LJJIFFI;
        String str9 = c840710WyT.LJJII;
        String str10 = c840710WyT.LJJIII;
        c840710WyT.getClass();
        return new C840710WyT(c840750WyX, str, str2, str3, str4, str5, c840990Wyv, z, d, z2, th, str6, str7, str8, z3, set, concurrentHashMap, map, set2, set3, map2, list, list2, list3, j, c840970Wyt, str9, str10);
    }

    public final void LIZIZ(C840750WyX c840750WyX) {
        this.LIZ = c840750WyX;
        this.LJIIZILJ = new LinkedHashMap();
        this.LJIJI = new LinkedHashSet();
        this.LJIJ = new LinkedHashSet();
        Map<String, Object> map = this.LJIJJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (Intrinsics.LJFF(entry.getKey(), "webview_channel") || Intrinsics.LJFF(entry.getKey(), "webview_url")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.LJIJJ = new LinkedHashMap(linkedHashMap);
        List<ReportParam> list = this.LJIJJLI;
        ArrayList arrayList = new ArrayList();
        for (ReportParam reportParam : list) {
            if (reportParam.isRemain()) {
                arrayList.add(reportParam);
            }
        }
        this.LJIJJLI = new ArrayList(arrayList);
        this.LJIL = new ArrayList();
        this.LJJ = new ArrayList();
        this.LJJIFFI = new C840970Wyt(0);
    }

    public C840710WyT(C840750WyX c840750WyX, String str, String str2, String str3, String str4, String str5, C840990Wyv c840990Wyv, boolean z, Double d, boolean z2, Throwable th, String str6, String str7, String str8, boolean z3, Set<String> set, ConcurrentHashMap<String, Double> concurrentHashMap, Map<String, Object> map, Set<String> set2, Set<String> set3, Map<String, Object> map2, List<ReportParam> list, List<RuleModel> list2, List<OperateHistory> list3, long j, C840970Wyt c840970Wyt, String str9, String str10) {
        this.LIZ = c840750WyX;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = c840990Wyv;
        this.LJII = z;
        this.LJIIIIZZ = d;
        this.LJIIIZ = z2;
        this.LJIIJ = th;
        this.LJIIJJI = str6;
        this.LJIIL = str7;
        this.LJIILIIL = str8;
        this.LJIILJJIL = z3;
        this.LJIILL = set;
        this.LJIILLIIL = concurrentHashMap;
        this.LJIIZILJ = map;
        this.LJIJ = set2;
        this.LJIJI = set3;
        this.LJIJJ = map2;
        this.LJIJJLI = list;
        this.LJIL = list2;
        this.LJJ = list3;
        this.LJJI = j;
        this.LJJIFFI = c840970Wyt;
        this.LJJII = str9;
        this.LJJIII = str10;
    }
}
