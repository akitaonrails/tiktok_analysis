package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d0N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033650d0N {
    public final C1031810cxP LIZ;
    public final InterfaceC1032940czE LIZIZ;
    public final boolean LIZJ;
    public final HashMap<String, Object> LIZLLL;
    public final HashMap<String, String> LJ;
    public final HashMap<String, Object> LJFF;
    public final List<HashMap<String, Object>> LJI;
    public final String LJII;

    public C1033650d0N() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1033650d0N)) {
            return false;
        }
        C1033650d0N c1033650d0N = (C1033650d0N) obj;
        return Intrinsics.LJFF(this.LIZ, c1033650d0N.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1033650d0N.LIZIZ) && this.LIZJ == c1033650d0N.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1033650d0N.LIZLLL) && Intrinsics.LJFF(this.LJ, c1033650d0N.LJ) && Intrinsics.LJFF(this.LJFF, c1033650d0N.LJFF) && Intrinsics.LJFF(this.LJI, c1033650d0N.LJI) && Intrinsics.LJFF(this.LJII, c1033650d0N.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        HashMap<String, Object> map = this.LIZLLL;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        HashMap<String, String> map2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        HashMap<String, Object> map3 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        List<HashMap<String, Object>> list = this.LJI;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LJII;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RewardAdSaasOpenParams(config=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", delegate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", animated=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", commonParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", extraRequestParams=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", extraLogParams=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", prefetchParams=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1033650d0N(C1031810cxP c1031810cxP, HashMap map, HashMap map2, HashMap map3, List list) {
        C1033660d0O c1033660d0O = new InterfaceC1032940czE() { // from class: X.0d0O
            @Override // X.InterfaceC1032940czE
            public final void distributeRewards() {
            }

            @Override // X.InterfaceC1032940czE
            public final void onRewardAdDataReady() {
            }

            @Override // X.InterfaceC1032940czE
            public final void onRewardCountdownFinished() {
            }

            @Override // X.InterfaceC1032940czE
            public final void skipRewardAdWatchDuration(int i) {
            }

            @Override // X.InterfaceC1032940czE
            public final void updateBubbleTip(String str) {
            }

            @Override // X.InterfaceC1032940czE
            public final void videoPlayStateDidChange(EnumC1031610cx5 enumC1031610cx5, int i) {
            }

            @Override // X.InterfaceC1032940czE
            public final void willExit(Context context) {
            }

            @Override // X.InterfaceC1032940czE
            public final void didExit(C1033020czM c1033020czM) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("didExit info=");
                sbLIZ.append(c1033020czM);
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1032940czE
            public final void onRewardAdPause(Integer num) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onRewardAdPause playOrder=");
                sbLIZ.append(num);
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1032940czE
            public final void onRewardAdResume(Integer num) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onRewardAdResume playOrder=");
                sbLIZ.append(num);
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1032940czE
            public final void onRewardAdShow(Integer num) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onRewardAdShow playOrder=");
                sbLIZ.append(num);
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1032940czE
            public final void viewDidLoad(ViewGroup viewGroup, Fragment fragment) {
            }
        };
        this.LIZ = c1031810cxP;
        this.LIZIZ = c1033660d0O;
        this.LIZJ = true;
        this.LIZLLL = map;
        this.LJ = map2;
        this.LJFF = map3;
        this.LJI = list;
        this.LJII = null;
    }
}
