package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.0aAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924810aAp extends C0IMU<Boolean> {
    public static boolean LJJJJZ;
    public static C924810aAp LJJJJZI;
    public C943720afK LIZLLL;
    public C924820aAq LJ;
    public C924840aAs LJFF;
    public InterfaceC924830aAr LJII;
    public C945320ahu LJIIJJI;
    public String LJIILJJIL;
    public volatile String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public final C925000aB8 LJIJ;
    public MultiLiveAnchorPanelSettings LJJIII;
    public volatile boolean LJJIIZI;
    public volatile boolean LJJIJIIJI;
    public volatile boolean LJJIJIIJIL;
    public volatile boolean LJJIJIL;
    public final ConcurrentHashSet<InterfaceC915740ZwC> LJI = new ConcurrentHashSet<>();
    public boolean LJIIIIZZ = false;
    public boolean LJIIIZ = false;
    public boolean LJIIJ = false;
    public boolean LJIIL = false;
    public boolean LJIILIIL = false;
    public boolean LJIJI = false;
    public boolean LJIJJ = false;
    public boolean LJIJJLI = false;
    public boolean LJIL = false;
    public boolean LJJ = false;
    public long LJJI = 1;
    public final Set<Long> LJJIFFI = new HashSet();
    public int LJJII = 0;
    public int LJJIIJ = 2;
    public boolean LJJIIJZLJL = false;
    public int LJJIIZ = 2;
    public final Set<InterfaceC915240ZvO> LJJIJ = new HashSet();
    public Pair<Long, C945320ahu> LJJIJL = null;
    public boolean LJJIJLIJ = false;
    public boolean LJJIL = false;
    public boolean LJJIZ = false;
    public boolean LJJJ = false;
    public boolean LJJJI = false;
    public Long LJJJIL = 0L;
    public boolean LJJJJ = false;
    public String LJJJJI = "normal";
    public final Set<Long> LJJJJIZL = new HashSet();
    public boolean LJJJJJ = false;
    public boolean LJJJJJL = true;
    public long LJJJJL = 0;
    public boolean LJJJJLI = false;
    public boolean LJJJJLL = false;

    public final void LJII() {
        this.LJJIIZI = false;
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = false;
    }

    public static C924810aAp LJ() {
        if (LJJJJZI == null) {
            LJJJJZI = new C924810aAp();
        }
        return LJJJJZI;
    }

    public final String LIZLLL() {
        return this.LJIILL == null ? "" : this.LJIILL;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Boolean] */
    public C924810aAp() {
        this.LIZIZ = Boolean.FALSE;
        this.LJIJ = new C925000aB8();
    }

    public final void LJFF(InterfaceC915240ZvO interfaceC915240ZvO) {
        Set<InterfaceC915240ZvO> set = this.LJJIJ;
        if (set != null && interfaceC915240ZvO != null) {
            ((HashSet) set).add(interfaceC915240ZvO);
        }
    }

    public final void LJIIIIZZ(long j) {
        C925000aB8 c925000aB8 = this.LJIJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = c925000aB8.LLILLL;
        if (i != 0 && j <= c925000aB8.LL[i - 1]) {
            c925000aB8.LIZIZ(j, jCurrentTimeMillis);
            return;
        }
        if (i >= c925000aB8.LL.length) {
            c925000aB8.LIZ(i + 1);
        }
        c925000aB8.LL[i] = j;
        c925000aB8.LLILLJJLI[i] = jCurrentTimeMillis;
        c925000aB8.LLILLL = i + 1;
    }

    public final void LJIIIZ(boolean z) {
        this.LJIILIIL = z;
        C924820aAq c924820aAq = this.LJ;
        if (c924820aAq != null) {
            c924820aAq.LIZ(z);
        }
    }

    public final void LJIIJ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEligibleForApplyAutoApprove:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("LinkInRoomDataHolder", C2188811AlT.LIZIZ(sbLIZ));
        this.LJJJJLI = z;
    }

    public final void LJIIJJI(boolean z) {
        if (z == this.LJIIIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LinkInRoomDataHolder no need change inProgress: ");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("LinkInRoomDataHolder", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LJIIIZ = z;
        C943720afK c943720afK = this.LIZLLL;
        if (c943720afK != null) {
            c943720afK.LIZ(z);
        }
        Iterator<InterfaceC915740ZwC> it2 = this.LJI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(z);
        }
        C497700JfU.LIZ.LIZJ(z, EnumC768840UDy.MULTI_GUEST);
    }

    public final void LJIIL(int i) {
        int iMax = Math.max(i, 0);
        C924840aAs c924840aAs = this.LJFF;
        if (c924840aAs != null) {
            if (c924840aAs.LIZ != 0 && iMax == 0) {
                c924840aAs.LIZIZ.LLJI.LJJLIIIJL();
            }
            c924840aAs.LIZ = iMax;
        }
        this.LJJII = iMax;
        InterfaceC924830aAr interfaceC924830aAr = this.LJII;
        if (interfaceC924830aAr != null) {
            interfaceC924830aAr.LIZ(iMax);
        }
        Set<InterfaceC915240ZvO> set = this.LJJIJ;
        if (set != null) {
            for (InterfaceC915240ZvO interfaceC915240ZvO : (HashSet) set) {
                if (interfaceC915240ZvO != null) {
                    interfaceC915240ZvO.LIZ(this.LJJII);
                }
            }
        }
    }

    public final void LJIILIIL(InterfaceC915240ZvO interfaceC915240ZvO) {
        Set<InterfaceC915240ZvO> set = this.LJJIJ;
        if (set != null && interfaceC915240ZvO != null) {
            ((HashSet) set).remove(interfaceC915240ZvO);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Boolean] */
    public final void LJI(Room room, String str) {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("invite_issue_check", "rtcExtInfo reset");
        this.LJIJJLI = false;
        this.LJIL = false;
        this.LJJ = false;
        this.LIZIZ = Boolean.FALSE;
        this.LJIILL = null;
        this.LJIILJJIL = null;
        this.LJIILLIIL = "";
        this.LJIIZILJ = "";
        this.LJIJI = false;
        this.LJJIIZI = false;
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = false;
        this.LJJI = 1L;
        ((HashSet) this.LJJIFFI).clear();
        this.LJJII = 0;
        this.LJIIIZ = false;
        this.LJIILIIL = false;
        this.LJJIIZ = 2;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJJIIJZLJL = false;
        this.LJJJJJ = false;
        this.LJJIZ = false;
        this.LJJJ = false;
        this.LJJJJ = false;
        this.LJJJI = false;
        this.LJJJIL = 0L;
        ((HashSet) this.LJJIJ).clear();
        this.LJFF = null;
        this.LJII = null;
        this.LJI.clear();
        this.LJJJJI = "normal";
        if (this.LJIIL && TextUtils.equals(str, "onDestroy") && room != null && room.getId() != 0) {
            this.LJJIJL = new Pair<>(Long.valueOf(room.getId()), this.LJIIJJI);
        }
        if (TextUtils.equals(str, "onDestroy")) {
            this.LJIIL = false;
        }
        this.LJIIJJI = null;
        this.LJJJJJL = true;
        this.LJJJJL = 0L;
    }
}
