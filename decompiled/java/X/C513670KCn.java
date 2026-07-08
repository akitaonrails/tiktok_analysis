package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KCn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513670KCn {
    public static final C513670KCn LJIJ = new C513670KCn(0);
    public final long LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final long LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final int LJIIZILJ;

    public C513670KCn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C513670KCn)) {
            return false;
        }
        C513670KCn c513670KCn = (C513670KCn) obj;
        return this.LIZ == c513670KCn.LIZ && Intrinsics.LJFF(this.LIZIZ, c513670KCn.LIZIZ) && this.LIZJ == c513670KCn.LIZJ && Intrinsics.LJFF(this.LIZLLL, c513670KCn.LIZLLL) && Intrinsics.LJFF(this.LJ, c513670KCn.LJ) && Intrinsics.LJFF(this.LJFF, c513670KCn.LJFF) && Intrinsics.LJFF(this.LJI, c513670KCn.LJI) && Intrinsics.LJFF(this.LJII, c513670KCn.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c513670KCn.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c513670KCn.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c513670KCn.LJIIJ) && this.LJIIJJI == c513670KCn.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c513670KCn.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c513670KCn.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c513670KCn.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c513670KCn.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c513670KCn.LJIILLIIL) && this.LJIIZILJ == c513670KCn.LJIIZILJ;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJIIJJI)) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode()) * 31) + this.LJIILL.hashCode()) * 31) + this.LJIILLIIL.hashCode()) * 31) + this.LJIIZILJ;
    }

    public final String toString() {
        return "PageEntryContextDto(creatorId=" + this.LIZ + ", creatorSecUid=" + this.LIZIZ + ", roomId=" + this.LIZJ + ", packageId=" + this.LIZLLL + ", currentPackageId=" + this.LJ + ", showEntrance=" + this.LJFF + ", pageType=" + this.LJI + ", fromId=" + this.LJII + ", groupId=" + this.LJIIIIZZ + ", extraParamsJson=" + this.LJIIIZ + ", requestExtraParam=" + this.LJIIJ + ", fmpTimestamp=" + this.LJIIJJI + ", contextToken=" + this.LJIIL + ", fromSubEnter=" + this.LJIILIIL + ", subscribeState=" + this.LJIILJJIL + ", privilegeShowType=" + this.LJIILL + ", privilegePageType=" + this.LJIILLIIL + ", openBenefitPage=" + this.LJIIZILJ + ')';
    }

    public final Map<String, String> LIZIZ() {
        Object obj;
        if (a0.LJJJIL(this.LJIIIZ)) {
            return new LinkedHashMap();
        }
        try {
            JSONObject jSONObject = new JSONObject(this.LJIIIZ);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.optString(next));
            }
            C189200o6.m2constructorimpl(linkedHashMap);
            obj = linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = linkedHashMap2;
        }
        return (Map) obj2;
    }

    public /* synthetic */ C513670KCn(int i) {
        this(0L, "", 0L, "", "", "", "", "", "", "", "", 0L, "", "", "", "", "", 0);
    }

    public static C513670KCn LIZ(C513670KCn c513670KCn, long j) {
        return new C513670KCn(c513670KCn.LIZ, c513670KCn.LIZIZ, c513670KCn.LIZJ, c513670KCn.LIZLLL, c513670KCn.LJ, c513670KCn.LJFF, c513670KCn.LJI, c513670KCn.LJII, c513670KCn.LJIIIIZZ, c513670KCn.LJIIIZ, c513670KCn.LJIIJ, j, c513670KCn.LJIIL, c513670KCn.LJIILIIL, c513670KCn.LJIILJJIL, c513670KCn.LJIILL, c513670KCn.LJIILLIIL, c513670KCn.LJIIZILJ);
    }

    public C513670KCn(long j, String str, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j3, String str10, String str11, String str12, String str13, String str14, int i) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = j2;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = j3;
        this.LJIIL = str10;
        this.LJIILIIL = str11;
        this.LJIILJJIL = str12;
        this.LJIILL = str13;
        this.LJIILLIIL = str14;
        this.LJIIZILJ = i;
    }
}
