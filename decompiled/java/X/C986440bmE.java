package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvite4029011FixSetting;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS559S0100000_15;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986440bmE {
    public final C986430bmD LIZ;
    public final Function0<Boolean> LIZIZ;
    public final Function0<Set<Long>> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function2<Boolean, Boolean, Unit> LJ;
    public final Function0<Unit> LJFF;
    public C0N1A LJI = C0N1A.IDLE;
    public volatile boolean LJII;
    public InterfaceC986480bmI LJIIIIZZ;
    public long LJIIIZ;

    public final void LIZIZ() {
        C0N1A c0n1a = this.LJI;
        C0N1A c0n1a2 = C0N1A.EXHAUSTED;
        if (c0n1a == c0n1a2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markCancelled: cancel observed (state=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        C20441214yg.LIZIZ("MatchInvite4029011RetrySession", C2188811AlT.LIZIZ(sbLIZ));
        this.LJII = true;
        if (this.LJI == C0N1A.WAITING) {
            this.LJI = c0n1a2;
            InterfaceC986480bmI interfaceC986480bmI = this.LJIIIIZZ;
            if (interfaceC986480bmI != null) {
                interfaceC986480bmI.cancel();
            }
            this.LJIIIIZZ = null;
            LIZ("cancelled_by_user");
        }
    }

    public final void LIZJ() {
        C0N1A c0n1a = this.LJI;
        C0N1A c0n1a2 = C0N1A.EXHAUSTED;
        if (c0n1a == c0n1a2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markCompletedSuccessfully: invite resolved → EXHAUSTED (state=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        C20441214yg.LIZIZ("MatchInvite4029011RetrySession", C2188811AlT.LIZIZ(sbLIZ));
        boolean z = this.LJI == C0N1A.RETRYING;
        this.LJI = c0n1a2;
        InterfaceC986480bmI interfaceC986480bmI = this.LJIIIIZZ;
        if (interfaceC986480bmI != null) {
            interfaceC986480bmI.cancel();
        }
        this.LJIIIIZZ = null;
        if (z) {
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            C986430bmD c986430bmD = this.LIZ;
            EnumC919170a1j enumC919170a1j = c986430bmD.LIZIZ;
            boolean z2 = c986430bmD.LIZLLL;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LIZ.LJ;
            JSONObject jSONObject = new JSONObject();
            C0K04.LJIIIZ(jSONObject, "is_rematch", z2);
            C0K04.LJ("total_duration_ms", jElapsedRealtime, jSONObject);
            c974540bT2.LLIIIJ("match_invite_4029011_retry_success", jSONObject, new JSONObject(), new JSONObject(), false, enumC919170a1j);
        }
    }

    public final boolean LJ() {
        LiveMatchInvite4029011FixSetting liveMatchInvite4029011FixSetting = LiveMatchInvite4029011FixSetting.INSTANCE;
        if (!liveMatchInvite4029011FixSetting.isEnabled()) {
            C20441214yg.LIZIZ("MatchInvite4029011RetrySession", "on4029011: setting disabled → fall through to existing failure path");
            return false;
        }
        if (this.LJI != C0N1A.IDLE) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on4029011: retry already attempted (state=");
            sbLIZ.append(this.LJI);
            sbLIZ.append(") → fall through to existing failure path");
            C20441214yg.LJIIL("MatchInvite4029011RetrySession", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        long delayMs = liveMatchInvite4029011FixSetting.getDelayMs();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("on4029011: 4029011 received → waiting ");
        sbLIZ2.append(delayMs);
        sbLIZ2.append("ms (snapshot=");
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(')');
        C20441214yg.LIZIZ("MatchInvite4029011RetrySession", C2188811AlT.LIZIZ(sbLIZ2));
        this.LJI = C0N1A.WAITING;
        this.LJIIIZ = SystemClock.elapsedRealtime();
        this.LJFF.invoke();
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        C986430bmD c986430bmD = this.LIZ;
        EnumC919170a1j enumC919170a1j = c986430bmD.LIZIZ;
        boolean z = c986430bmD.LIZLLL;
        int size = c986430bmD.LIZ.size();
        Long l = this.LIZ.LIZJ;
        JSONObject jSONObject = new JSONObject();
        C0K04.LJIIIZ(jSONObject, "is_rematch", z);
        C0K04.LIZLLL(size, "linked_uids_count", jSONObject);
        C0K04.LJ("gift_id", l != null ? l.longValue() : 0L, jSONObject);
        C0K04.LJ("delay_ms", delayMs, jSONObject);
        c974540bT2.LLIIIJ("match_invite_4029011_received", jSONObject, new JSONObject(), new JSONObject(), false, enumC919170a1j);
        this.LJIIIIZZ = C986450bmF.LIZ(delayMs, new AwS559S0100000_15(this, 1011));
        return true;
    }

    public final void LIZ(String str) {
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        EnumC919170a1j enumC919170a1j = this.LIZ.LIZIZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LJIIIZ;
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("reason", str, jSONObject);
        C0K04.LJ("wait_elapsed_ms", jElapsedRealtime, jSONObject);
        c974540bT2.LLIIIJ("match_invite_4029011_retry_aborted", jSONObject, new JSONObject(), new JSONObject(), false, enumC919170a1j);
    }

    public final void LIZLLL(Throwable th) {
        boolean z;
        if (th == null || this.LJI != C0N1A.RETRYING) {
            return;
        }
        if ((th instanceof C501470JlZ) && ((C501520Jle) th).getErrorCode() == 4029011) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markRetryFailed: retry attempt failed → emitting retry_failed (isSecond4029011=");
        sbLIZ.append(z);
        sbLIZ.append(", throwable=");
        sbLIZ.append(th);
        sbLIZ.append(')');
        C20441214yg.LIZIZ("MatchInvite4029011RetrySession", C2188811AlT.LIZIZ(sbLIZ));
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        EnumC919170a1j enumC919170a1j = this.LIZ.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        C0K04.LJIIIZ(jSONObject, "is_second_4029011", z);
        JSONObject jSONObject2 = new JSONObject();
        C974540bT2.LJJI(th, jSONObject, jSONObject2);
        c974540bT2.LLIIIJ("match_invite_4029011_retry_failed", jSONObject, jSONObject2, new JSONObject(), false, enumC919170a1j);
        this.LJI = C0N1A.EXHAUSTED;
    }

    public C986440bmE(C986430bmD c986430bmD, Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function0 function04) {
        this.LIZ = c986430bmD;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = function03;
        this.LJ = function2;
        this.LJFF = function04;
    }
}
