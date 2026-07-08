package X;

import Y.ARunnableS86S0200000_17;
import android.os.SystemClock;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyAvoidRule;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0en2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1102260en2 implements InterfaceC1102190emv {
    public final String LIZ;
    public final InterfaceC1102300en6 LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final List<String> LJFF;
    public final long LJI = C963140bAe.LIZIZ();
    public final String LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final int LJIIL;
    public final String LJIILIIL;
    public final List<Long> LJIILJJIL;
    public final List<Long> LJIILL;
    public final int LJIILLIIL;
    public final String LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public int LJIL;
    public int LJJ;
    public boolean LJJI;
    public long LJJIFFI;
    public C1102320en8 LJJII;
    public long LJJIII;
    public long LJJIIJ;
    public int LJJIIJZLJL;
    public boolean LJJIIZ;
    public C1102330en9 LJJIIZI;
    public boolean LJJIJ;
    public EnumC1097810efr LJJIJIIJI;
    public int LJJIJIIJIL;
    public ARunnableS86S0200000_17 LJJIJIL;
    public ARunnableS86S0200000_17 LJJIJL;
    public long LJJIJLIJ;
    public ARunnableS86S0200000_17 LJJIL;
    public long LJJIZ;
    public C1102280en4 LJJJ;
    public int LJJJI;

    @Override // X.InterfaceC1102110emn
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC1102110emn
    public final long LJIILLIIL() {
        return 0L;
    }

    @Override // X.InterfaceC1102110emn
    public final long LJJ() {
        return 0L;
    }

    public void LJJIFFI(JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1102110emn
    public final /* bridge */ /* synthetic */ String LJJJ() {
        return null;
    }

    @Override // X.InterfaceC1102110emn
    public final Map<String, String> getExtras() {
        return null;
    }

    @Override // X.InterfaceC1102110emn
    public final EnumC245600xC LIZLLL() {
        return this.LIZIZ.LJIILIIL() ? EnumC245600xC.CLICK_TO_ROUTE : EnumC245600xC.SHOW_ONLY;
    }

    @Override // X.InterfaceC1102110emn
    public final String LJII() {
        C1102320en8 c1102320en8 = this.LJJII;
        if (c1102320en8 == null) {
            return null;
        }
        int i = c1102320en8.LIZIZ;
        C1102250en1.LIZ.getClass();
        return C1102250en1.LJFF(i);
    }

    @Override // X.InterfaceC1102110emn
    public final String LJIIIIZZ() {
        String strLIZ;
        C1102320en8 c1102320en8 = this.LJJII;
        return (c1102320en8 == null || (strLIZ = c1102320en8.LIZ()) == null) ? "" : strLIZ;
    }

    @Override // X.InterfaceC1102110emn
    public final Integer LJIIIZ() {
        C1102320en8 c1102320en8 = this.LJJII;
        if (c1102320en8 != null) {
            return c1102320en8.LIZJ;
        }
        return null;
    }

    @Override // X.InterfaceC1102110emn
    public final String LJIILIIL() {
        C1102320en8 c1102320en8 = this.LJJII;
        if (c1102320en8 != null) {
            return c1102320en8.LIZ();
        }
        return null;
    }

    public final void LJJI() {
        if (this.LJJIFFI != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.LJJIFFI;
            this.LJJIIJ = jUptimeMillis;
            this.LJJIII += jUptimeMillis;
            this.LJJIFFI = 0L;
        }
        this.LJJI = false;
        this.LJJII = null;
        if (this.LJIJI == 0) {
            boolean z = this.LJJIFFI != 0;
            this.LJJIIZ = z;
            if (z) {
                this.LJJ++;
            }
            this.LJIL++;
            this.LJIJI = SystemClock.uptimeMillis();
        }
    }

    @Override // X.InterfaceC1102110emn
    public final String Xc() {
        return this.LIZIZ.Xc().getKey();
    }

    public String toString() {
        return "EffectNotifyRecord{id='" + this.LIZ + "', enterTs=" + this.LIZJ + ", startNotifyTs=" + this.LJI + ", isTimely=" + this.LIZLLL + ", animType=" + this.LJ + ", component=" + this.LJIIIIZZ + ", biz=" + this.LJIIJ + ", scene=" + this.LJIIL + ", horizontalRange=" + this.LJIILJJIL + ", verticalRange=" + this.LJIILL + ", feature=" + this.LJIILLIIL + ", avoidScene=" + this.LJFF + ", readyTs=" + this.LJIJ + ", activeTs=" + this.LJIJI + ", activeTotalDuration=" + this.LJIJJ + ", lastActiveDuration=" + this.LJIJJLI + ", activeCount=" + this.LJIL + ", recoverCount=" + this.LJJ + ", isInactivating=" + this.LJJI + ", inactiveTs=" + this.LJJIFFI + ", conflictCheckResult=" + this.LJJII + ", inactiveTotalDuration=" + this.LJJIII + ", lastInactiveDuration=" + this.LJJIIJ + ", inactiveCount=" + this.LJJIIJZLJL + ", isRecovery=" + this.LJJIIZ + ", isConsumed=" + this.LJJIJ + ", consumeMethod=" + this.LJJIJIIJIL + ", delayRunnable=" + this.LJJIJIL + ", cleanupRunnable=" + this.LJJIL + ", avoidSceneObserver=" + this.LJJJ + '}';
    }

    @Override // X.InterfaceC1102110emn
    public final long LJIIJJI() {
        return C963140bAe.LIZIZ() - this.LJI;
    }

    @Override // X.InterfaceC1102110emn
    public final long LJIIZILJ() {
        return SystemClock.uptimeMillis() - this.LIZJ;
    }

    @Override // X.InterfaceC1102110emn
    public final int LIZ() {
        return this.LJIL;
    }

    @Override // X.InterfaceC1102110emn
    public final String LIZIZ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1102110emn
    public final long LJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1102110emn
    public final long LJFF() {
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC1102110emn
    public final boolean LJI() {
        return this.LJJIIZ;
    }

    @Override // X.InterfaceC1102110emn
    public final long LJIIJ() {
        return this.LJJIII;
    }

    @Override // X.InterfaceC1102110emn
    public final String LJIIL() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1102110emn
    public final long LJIILJJIL() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC1102190emv
    public final String LJIILL() {
        return this.LJII;
    }

    @Override // X.InterfaceC1102110emn
    public final int LJIJ() {
        return this.LJJIIJZLJL;
    }

    @Override // X.InterfaceC1102190emv
    public final boolean LJIJI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1102110emn
    public final long LJIJJ() {
        return this.LJJIIJ;
    }

    @Override // X.InterfaceC1102110emn
    public final int LJIJJLI() {
        return this.LJJJI;
    }

    @Override // X.InterfaceC1102110emn
    public final int LJIL() {
        return this.LJJ;
    }

    @Override // X.InterfaceC1102110emn
    public final String getBusinessName() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1102190emv
    public final String getFeatureName() {
        return this.LJIIZILJ;
    }

    public C1102260en2(String str, InterfaceC1102300en6 interfaceC1102300en6, DataChannel dataChannel, long j, boolean z, int i, List<String> list) {
        int i2;
        String str2;
        Map<String, String> map;
        Map<String, String> map2;
        String str3;
        Map<String, String> map3;
        this.LIZ = str;
        this.LIZIZ = interfaceC1102300en6;
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = i;
        this.LJFF = list;
        C1102250en1 c1102250en1 = C1102250en1.LIZ;
        String strLJIILL = interfaceC1102300en6.LJIILL();
        c1102250en1.getClass();
        String str4 = "";
        if (strLJIILL == null && ((map3 = C1102250en1.LJIIJ().anim) == null || (strLJIILL = map3.get(String.valueOf(i))) == null)) {
            strLJIILL = "";
        }
        this.LJII = strLJIILL;
        int iLJIILJJIL = interfaceC1102300en6.LJIILJJIL();
        this.LJIIIIZZ = iLJIILJJIL;
        interfaceC1102300en6.LJIIL();
        Map<String, String> map4 = C1102250en1.LJIIJ().component;
        this.LJIIIZ = (map4 == null || (str3 = map4.get(String.valueOf(iLJIILJJIL))) == null) ? "" : str3;
        int biz = interfaceC1102300en6.getBiz();
        this.LJIIJ = biz;
        String strWc = interfaceC1102300en6.Wc();
        if (strWc == null && ((map2 = C1102250en1.LJIIJ().biz) == null || (strWc = map2.get(String.valueOf(biz))) == null)) {
            strWc = "";
        }
        this.LJIIJJI = strWc;
        int scene = interfaceC1102300en6.getScene();
        this.LJIIL = scene;
        String strCd = interfaceC1102300en6.cd();
        if (strCd == null && ((map = C1102250en1.LJIIJ().scene) == null || (strCd = map.get(String.valueOf(scene))) == null)) {
            strCd = "";
        }
        this.LJIILIIL = strCd;
        this.LJIILJJIL = C1102250en1.LJII(dataChannel, C1102250en1.LJIILIIL(dataChannel, iLJIILJJIL, biz, scene));
        this.LJIILL = C1102250en1.LJIILL(dataChannel, C1102250en1.LJIILIIL(dataChannel, iLJIILJJIL, biz, scene));
        NotifyAvoidRule notifyAvoidRuleLJIILIIL = C1102250en1.LJIILIIL(dataChannel, interfaceC1102300en6.LJIILJJIL(), interfaceC1102300en6.getBiz(), interfaceC1102300en6.getScene());
        if (notifyAvoidRuleLJIILIIL != null) {
            i2 = notifyAvoidRuleLJIILIIL.feature;
        } else {
            i2 = 0;
        }
        this.LJIILLIIL = i2;
        Map<String, String> map5 = C1102250en1.LJIIJ().feature;
        if (map5 != null && (str2 = map5.get(String.valueOf(i2))) != null) {
            str4 = str2;
        }
        this.LJIIZILJ = str4;
    }
}
