package X;

import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Ydm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878840Ydm implements InterfaceC884250YmV, C0Y9E {
    public volatile boolean LJ;
    public final String LIZ = "ChatListMessageRequestEntranceDataSource";
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C878860Ydo());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C878830Ydl());
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(345));
    public final C878850Ydn LJFF = new InterfaceC989510brB<PrivacyUserSettingsV2>() { // from class: X.0Ydn
        @Override // X.InterfaceC989510brB
        public final void LLZZLLIL(PrivacyUserSettingsV2 privacyUserSettingsV2) {
            C876610YaB c876610YaB;
            boolean zLJIJJLI = ((PrivacySettingsFeature) this.LL.LIZLLL.getValue()).LJIJJLI(true);
            if (zLJIJJLI == this.LL.LJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPrivacySettingsChange skipped, isRiskyRequestOn unchanged=");
                sbLIZ.append(zLJIJJLI);
                C2188811AlT.LIZIZ(sbLIZ);
                C309160C9y.LIZLLL("ChatListMessageRequestEntranceDataSource");
                return;
            }
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
            if (abstractC883730YlfLJ != null) {
                c876610YaB = abstractC883730YlfLJ.LJI;
            } else {
                c876610YaB = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onPrivacySettingsChange received, isRiskyRequestOn changed to ");
            sbLIZ2.append(zLJIJJLI);
            sbLIZ2.append(", cachedData=");
            sbLIZ2.append(c876610YaB);
            C2188811AlT.LIZIZ(sbLIZ2);
            C309160C9y.LIZLLL("ChatListMessageRequestEntranceDataSource");
            if (c876610YaB == null) {
                return;
            }
            for (Map.Entry entry : ((ConcurrentHashMap) this.LL.LIZJ.getValue()).entrySet()) {
                C1729806q0.LIZ(((C878480YdC) entry.getKey()).LIZ, new C0YW3((C878780Ydg) entry.getValue(), c876610YaB, null));
            }
        }
    };

    @Override // X.C0Y9E
    public final void LIZ(List<String> list, boolean z) {
    }

    @Override // X.C0Y9E
    public final void LIZIZ(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC884250YmV
    public final void LJI(InterfaceC878560YdK interfaceC878560YdK, C877600Ybm c877600Ybm, int i, String str) {
    }

    @Override // X.InterfaceC884250YmV
    public final void LJII(InterfaceC878560YdK interfaceC878560YdK) {
    }

    @Override // X.C0Y9E
    public final void LJIIJ(C0Y9D c0y9d) {
    }

    @Override // X.InterfaceC884250YmV
    public final void LJIIJJI(InterfaceC878560YdK interfaceC878560YdK) {
    }

    @Override // X.C0Y9E
    public final void LJIILJJIL(String str, List<C0Y9G> list) {
    }

    @Override // X.C0Y9E
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC884250YmV
    public final ConcurrentHashMap<InterfaceC878560YdK, CopyOnWriteArrayList<InterfaceC878540YdI>> LJIILL() {
        return (ConcurrentHashMap) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC884250YmV
    public final void LIZJ() {
        C622680Oba.LIZLLL(this);
        C191862104e c191862104eLJ = C191871104n.LJ();
        C878850Ydn c878850Ydn = this.LJFF;
        c191862104eLJ.getClass();
        C191862104e.LIZLLL(c878850Ydn);
        ((ConcurrentHashMap) this.LIZJ.getValue()).clear();
        LJIILL().clear();
    }

    @Override // X.InterfaceC884250YmV
    public final boolean LJIIIIZZ() {
        return !C293380Bei.LIZIZ();
    }

    @Override // X.InterfaceC884250YmV
    public final void LJIILIIL() {
        LJIILL().clear();
    }

    @Override // X.InterfaceC884250YmV
    public final void init() {
        C622680Oba.LIZJ(this);
        C191862104e c191862104eLJ = C191871104n.LJ();
        C878850Ydn c878850Ydn = this.LJFF;
        c191862104eLJ.getClass();
        C191862104e.LIZJ(c878850Ydn);
    }

    @Override // X.InterfaceC884250YmV
    public final String getTag() {
        return this.LIZ;
    }

    public static Pair LJIJ(List list) {
        int iLIZ = C0CYN.LIZ(list);
        if (iLIZ > 0) {
            return new Pair(Integer.valueOf(iLIZ), Boolean.TRUE);
        }
        return new Pair(Integer.valueOf(list.size()), Boolean.FALSE);
    }

    @Override // X.InterfaceC884250YmV
    public final void LJ(InterfaceC878560YdK interfaceC878560YdK) {
        C878780Ydg c878780Ydg;
        if ((interfaceC878560YdK instanceof C878480YdC) && (c878780Ydg = (C878780Ydg) ((ConcurrentHashMap) this.LIZJ.getValue()).remove(interfaceC878560YdK)) != null) {
            ((C0YNW) C0YUC.LIZ(((C878480YdC) interfaceC878560YdK).LIZ.LL)).LIZJ.LJIIL(c878780Ydg);
        }
    }

    @Override // X.InterfaceC884250YmV
    public final void LJIIIZ(InterfaceC878560YdK interfaceC878560YdK) {
        if (!(interfaceC878560YdK instanceof C878480YdC)) {
            return;
        }
        C878480YdC c878480YdC = (C878480YdC) interfaceC878560YdK;
        C878780Ydg c878780Ydg = new C878780Ydg(this, c878480YdC);
        ((ConcurrentHashMap) this.LIZJ.getValue()).put(interfaceC878560YdK, c878780Ydg);
        ((C0YNW) C0YUC.LIZ(c878480YdC.LIZ.LL)).LIZJ.LJIIIZ(c878780Ydg);
    }

    @Override // X.InterfaceC884250YmV
    public final void LJIIL(InterfaceC878560YdK interfaceC878560YdK) {
        C878580YdM.LIZIZ(this, interfaceC878560YdK);
    }

    @C14EU
    public final void onRefreshStrangerEvent(C1671206gY c1671206gY) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive RefreshStrangerEvent uid=");
        sbLIZ.append(c1671206gY.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        C1729806q0.LIZJ(C881500Yi4.LIZLLL(), new AwS558S0100000_14(this, 1248));
    }

    public static String LJIIZILJ(int i, int i2) {
        if (i > 0) {
            return C1383370m6R.LIZ.getResources().getQuantityString(2131755037, i, Integer.valueOf(i));
        }
        if (i2 > 0) {
            if (C0CYH.LIZJ.LJIIIZ()) {
                return C1383370m6R.LIZ.getResources().getString(2131831541);
            }
            return C1383370m6R.LIZ.getResources().getQuantityString(2131755037, i2, Integer.valueOf(i2));
        }
        return null;
    }

    @Override // X.InterfaceC884250YmV
    public final void LIZLLL(InterfaceC878560YdK interfaceC878560YdK, List<? extends InterfaceC878540YdI> list) {
        C878580YdM.LIZ(this, interfaceC878560YdK, list);
    }

    @Override // X.InterfaceC884250YmV
    public final void LJFF(InterfaceC878560YdK interfaceC878560YdK, String str) {
        if (!(interfaceC878560YdK instanceof C878480YdC)) {
            return;
        }
        ((C0YNW) C0YUC.LIZ(((C878480YdC) interfaceC878560YdK).LIZ.LL)).LIZJ.LJIILJJIL();
    }
}
