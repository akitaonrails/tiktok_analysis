package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.profit.IapListResult;
import webcast.api.profit.ListV3Result;

/* JADX INFO: renamed from: X.0x4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805210x4p {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final EnumC1562990qm9 LIZLLL;
    public final IapListResult.ListResultExtra LJ;
    public final ListV3Result.Extra LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final Map<String, List<C1805370x55>> LJIIIIZZ;
    public final boolean LJIIIZ;
    public final Long LJIIJ;
    public final Map<String, List<IapListResult.VoucherItem>> LJIIJJI;
    public final C1805370x55 LJIIL;
    public final C1805370x55 LJIILIIL;
    public final Map<String, Long> LJIILJJIL;
    public final boolean LJIILL;
    public final Throwable LJIILLIIL;

    public C1805210x4p() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1805210x4p)) {
            return false;
        }
        C1805210x4p c1805210x4p = (C1805210x4p) obj;
        return Intrinsics.LJFF(this.LIZ, c1805210x4p.LIZ) && this.LIZIZ == c1805210x4p.LIZIZ && this.LIZJ == c1805210x4p.LIZJ && this.LIZLLL == c1805210x4p.LIZLLL && Intrinsics.LJFF(this.LJ, c1805210x4p.LJ) && Intrinsics.LJFF(this.LJFF, c1805210x4p.LJFF) && this.LJI == c1805210x4p.LJI && this.LJII == c1805210x4p.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1805210x4p.LJIIIIZZ) && this.LJIIIZ == c1805210x4p.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1805210x4p.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1805210x4p.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1805210x4p.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1805210x4p.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1805210x4p.LJIILJJIL) && this.LJIILL == c1805210x4p.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c1805210x4p.LJIILLIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31;
        IapListResult.ListResultExtra listResultExtra = this.LJ;
        int iHashCode2 = (iHashCode + (listResultExtra == null ? 0 : listResultExtra.hashCode())) * 31;
        ListV3Result.Extra extra = this.LJFF;
        int iHashCode3 = (((((((((iHashCode2 + (extra == null ? 0 : extra.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31;
        Long l = this.LJIIJ;
        int iHashCode4 = (((iHashCode3 + (l == null ? 0 : l.hashCode())) * 31) + this.LJIIJJI.hashCode()) * 31;
        C1805370x55 c1805370x55 = this.LJIIL;
        int iHashCode5 = (iHashCode4 + (c1805370x55 == null ? 0 : c1805370x55.hashCode())) * 31;
        C1805370x55 c1805370x552 = this.LJIILIIL;
        int iHashCode6 = (((((iHashCode5 + (c1805370x552 == null ? 0 : c1805370x552.hashCode())) * 31) + this.LJIILJJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILL)) * 31;
        Throwable th = this.LJIILLIIL;
        return iHashCode6 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "WalletRechargeInternalState(selectedPanelChannel=" + this.LIZ + ", isFromPackageItemClicked=" + this.LIZIZ + ", isTabAlreadyChanged=" + this.LIZJ + ", switchPanelType=" + this.LIZLLL + ", extra=" + this.LJ + ", extraV3=" + this.LJFF + ", hasRechargeV3Before=" + this.LJI + ", shouldShowTab=" + this.LJII + ", packageListMap=" + this.LJIIIIZZ + ", isCustomV3Supported=" + this.LJIIIZ + ", recentlyPurchasedPacketId=" + this.LJIIJ + ", voucherLists=" + this.LJIIJJI + ", selectedDiamond=" + this.LJIIL + ", recommendedDiamond=" + this.LJIILIIL + ", recommendedPackageIdsFromServer=" + this.LJIILJJIL + ", retryAfterFail=" + this.LJIILL + ", walletPackageError=" + this.LJIILLIIL + ')';
    }

    public final boolean LIZIZ() {
        if (Intrinsics.LJFF(this.LIZ, "google_play")) {
            IapListResult.ListResultExtra listResultExtra = this.LJ;
            return listResultExtra != null && listResultExtra.isNewRecommendPackage;
        }
        ListV3Result.Extra extra = this.LJFF;
        return extra != null && extra.isNewRecommendPackage;
    }

    public final boolean LIZJ() {
        if (this.LJIIIIZZ.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<String, List<C1805370x55>>> it2 = this.LJIIIIZZ.entrySet().iterator();
        while (it2.hasNext()) {
            if (!it2.next().getValue().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ C1805210x4p(int i) {
        this("google_play", false, false, EnumC1562990qm9.DEFAULT, null, null, false, false, new LinkedHashMap(), false, null, new LinkedHashMap(), null, null, new LinkedHashMap(), false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1805210x4p(String str, boolean z, boolean z2, EnumC1562990qm9 enumC1562990qm9, IapListResult.ListResultExtra listResultExtra, ListV3Result.Extra extra, boolean z3, boolean z4, Map<String, ? extends List<C1805370x55>> map, boolean z5, Long l, Map<String, ? extends List<IapListResult.VoucherItem>> map2, C1805370x55 c1805370x55, C1805370x55 c1805370x552, Map<String, Long> map3, boolean z6, Throwable th) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = enumC1562990qm9;
        this.LJ = listResultExtra;
        this.LJFF = extra;
        this.LJI = z3;
        this.LJII = z4;
        this.LJIIIIZZ = map;
        this.LJIIIZ = z5;
        this.LJIIJ = l;
        this.LJIIJJI = map2;
        this.LJIIL = c1805370x55;
        this.LJIILIIL = c1805370x552;
        this.LJIILJJIL = map3;
        this.LJIILL = z6;
        this.LJIILLIIL = th;
    }

    public static C1805210x4p LIZ(C1805210x4p c1805210x4p, String str, boolean z, boolean z2, EnumC1562990qm9 enumC1562990qm9, IapListResult.ListResultExtra listResultExtra, ListV3Result.Extra extra, boolean z3, boolean z4, Map map, boolean z5, Long l, Map map2, C1805370x55 c1805370x55, C1805370x55 c1805370x552, Map map3, boolean z6, Throwable th, int i) {
        Throwable th2 = th;
        boolean z7 = z6;
        C1805370x55 c1805370x553 = c1805370x552;
        C1805370x55 c1805370x554 = c1805370x55;
        Map map4 = map2;
        Long l2 = l;
        boolean z8 = z5;
        Map map5 = map;
        boolean z9 = z4;
        boolean z10 = z3;
        ListV3Result.Extra extra2 = extra;
        IapListResult.ListResultExtra listResultExtra2 = listResultExtra;
        EnumC1562990qm9 enumC1562990qm92 = enumC1562990qm9;
        Map map6 = map3;
        boolean z11 = z2;
        boolean z12 = z;
        String str2 = str;
        if ((i & 1) != 0) {
            str2 = c1805210x4p.LIZ;
        }
        if ((i & 2) != 0) {
            z12 = c1805210x4p.LIZIZ;
        }
        if ((i & 4) != 0) {
            z11 = c1805210x4p.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC1562990qm92 = c1805210x4p.LIZLLL;
        }
        if ((i & 16) != 0) {
            listResultExtra2 = c1805210x4p.LJ;
        }
        if ((i & 32) != 0) {
            extra2 = c1805210x4p.LJFF;
        }
        if ((i & 64) != 0) {
            z10 = c1805210x4p.LJI;
        }
        if ((i & 128) != 0) {
            z9 = c1805210x4p.LJII;
        }
        if ((i & 256) != 0) {
            map5 = c1805210x4p.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            z8 = c1805210x4p.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            l2 = c1805210x4p.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            map4 = c1805210x4p.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c1805370x554 = c1805210x4p.LJIIL;
        }
        if ((i & 8192) != 0) {
            c1805370x553 = c1805210x4p.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            map6 = c1805210x4p.LJIILJJIL;
        }
        if ((32768 & i) != 0) {
            z7 = c1805210x4p.LJIILL;
        }
        if ((i & 65536) != 0) {
            th2 = c1805210x4p.LJIILLIIL;
        }
        c1805210x4p.getClass();
        return new C1805210x4p(str2, z12, z11, enumC1562990qm92, listResultExtra2, extra2, z10, z9, map5, z8, l2, map4, c1805370x554, c1805370x553, map6, z7, th2);
    }
}
