package X;

import Y.ARunnableS117S0100000_17;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.livesetting.gift.GiftCollaborateGiftingDestroyTimeoutSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0fXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131150fXd {
    public DataChannel LIZ;
    public LifecycleOwner LIZIZ;
    public Context LIZJ;
    public String LIZLLL;
    public long LJFF;
    public long LJII;
    public final Object LJ = new Object();
    public long LJI = -1;
    public final Set<Long> LJIIIIZZ = new LinkedHashSet();
    public final AwS596S0100000_17 LJIIIZ = new AwS596S0100000_17(this, 721);
    public final C1151790g4v LJIIJ = new C1151790g4v(this, 8);

    public final void LIZ() {
        String str = this.LIZLLL;
        if (str != null) {
            InterfaceC1087010eOR interfaceC1087010eOR = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
            if (interfaceC1087010eOR != null) {
                interfaceC1087010eOR.Ud(EnumC1101860emO.ID, str);
            }
            C0IK5.LIZLLL(this.LJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeShortTouchView, viewId=");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ("CollaborateGiftingBiz", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZLLL = null;
    }

    public final void LIZIZ() {
        C20441214yg.LJIIIZ("CollaborateGiftingBiz", "resetSession");
        if (this.LIZLLL != null) {
            C486790J7d.LIZLLL(new ARunnableS117S0100000_17(this, 313), this.LJ, GiftCollaborateGiftingDestroyTimeoutSetting.INSTANCE.getExpireMs());
        }
        this.LJIIIIZZ.clear();
        this.LJFF = 0L;
        this.LJI = -1L;
    }

    public static void LIZJ(AbstractC1132210fZL abstractC1132210fZL) {
        C1132220fZM c1132220fZM;
        if ((abstractC1132210fZL instanceof C1132220fZM) && (c1132220fZM = (C1132220fZM) abstractC1132210fZL) != null && !c1132220fZM.LJIIIIZZ) {
            return;
        }
        try {
            C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(C1131540fYG.LIZLLL(abstractC1132210fZL)), "EVENT_GIFT_MECHANIC_PROGRESS_UPDATE"));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("syncProgressToFE success is_finish=");
            sbLIZ.append(abstractC1132210fZL instanceof C1132230fZN ? 1 : 0);
            sbLIZ.append(" hasSubscriber=");
            sbLIZ.append(C1548820qPI.LIZJ().containsKey("EVENT_GIFT_MECHANIC_PROGRESS_UPDATE"));
            C20441214yg.LJIIIZ("CollaborateGiftingBiz", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("CollaborateGiftingBiz", "syncProgressToFE failed", th);
        }
    }
}
