package X;

import com.bytedance.android.livesdkapi.depend.model.live.NotifyAvoidRule;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0en3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102270en3 extends C1102260en2 {
    public final NotifyAvoidRule LJJJIL;
    public final long LJJJJ;

    @Override // X.C1102260en2
    public final String toString() {
        return "EffectNotifyRecord{id='" + this.LIZ + "', enterTs=" + this.LIZJ + ", startNotifyTs=" + this.LJI + ", priority=" + this.LJJJJ + ", isTimely=" + this.LIZLLL + ", animType=" + this.LJ + ", component=" + this.LJIIIIZZ + ", biz=" + this.LJIIJ + ", scene=" + this.LJIIL + ", horizontalRange=" + this.LJIILJJIL + ", verticalRange=" + this.LJIILL + ", feature=" + this.LJIILLIIL + ", avoidScene=" + this.LJFF + ", readyTs=" + this.LJIJ + ", activeTs=" + this.LJIJI + ", activeTotalDuration=" + this.LJIJJ + ", lastActiveDuration=" + this.LJIJJLI + ", activeCount=" + this.LJIL + ", recoverCount=" + this.LJJ + ", isInactivating=" + this.LJJI + ", inactiveTs=" + this.LJJIFFI + ", conflictCheckResult=" + this.LJJII + ", inactiveTotalDuration=" + this.LJJIII + ", lastInactiveDuration=" + this.LJJIIJ + ", inactiveCount=" + this.LJJIIJZLJL + ", isRecovery=" + this.LJJIIZ + ", isConsumed=" + this.LJJIJ + ", consumeMethod=" + this.LJJIJIIJIL + ", delayRunnable=" + this.LJJIJIL + ", cleanupRunnable=" + this.LJJIL + ", avoidSceneObserver=" + this.LJJJ + '}';
    }

    @Override // X.C1102260en2
    public final void LJJIFFI(JSONObject jSONObject) throws JSONException {
        jSONObject.put("priority", this.LJJJJ);
    }

    public C1102270en3(String str, InterfaceC1102300en6 interfaceC1102300en6, DataChannel dataChannel, NotifyAvoidRule notifyAvoidRule, long j) {
        super(str, interfaceC1102300en6, dataChannel, j, notifyAvoidRule.timely, notifyAvoidRule.animType, notifyAvoidRule.avoidScene);
        this.LJJJIL = notifyAvoidRule;
        this.LJJJJ = notifyAvoidRule.priority;
    }
}
