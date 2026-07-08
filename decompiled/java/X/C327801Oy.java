package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostPanelBanner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01Oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C327801Oy implements InterfaceC340001Tq {
    public final InterfaceC497601wk LIZ;
    public final AbstractC2252651DEx LIZIZ;
    public final Function0<Long> LIZJ;
    public final C2252321DDq LIZLLL;
    public final AnonymousClass0951 LJ;
    public AnonymousClass0956 LJFF;

    @Override // X.InterfaceC340001Tq
    public final AnonymousClass0951 LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC340001Tq
    public final void LIZIZ(CohostPanelBanner.CountdownInfo countdownInfo, boolean z) {
        AnonymousClass0956 anonymousClass0956 = this.LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJFF = null;
        if (countdownInfo == null) {
            C20441214yg.LJIIIZ("LeagueMatchCountdownTimerUseCase", "Invalid params. countdownInfo is null");
        } else if (!z) {
            C20441214yg.LJIIIZ("LeagueMatchCountdownTimerUseCase", "isCountdownTimerVisible is false");
        } else {
            this.LJFF = C23250099c.LIZLLL(this.LIZ, this.LIZIZ, null, new C327701Ox(this, countdownInfo.endTimestampSec * 1000, countdownInfo, null), 2);
        }
    }

    public C327801Oy(LifecycleCoroutineScope lifecycleCoroutineScope, AbstractC2252651DEx abstractC2252651DEx, AnonymousClass0206 anonymousClass0206) {
        this.LIZ = lifecycleCoroutineScope;
        this.LIZIZ = abstractC2252651DEx;
        this.LIZJ = anonymousClass0206;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C01P0(0L, null));
        this.LIZLLL = c2252321DDqLIZ;
        this.LJ = C09IC.LIZIZ(c2252321DDqLIZ);
    }
}
