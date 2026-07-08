package X;

import Y.ARunnableS131S0100000_31;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.match.EnigmaBattleSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.15DJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15DJ {
    public final C15DP LIZ;
    public final Function0<Boolean> LIZIZ;
    public long LIZLLL;
    public ARunnableS131S0100000_31 LJI;
    public List<Long> LIZJ = C13BV.INSTANCE;
    public boolean LJ = true;
    public final Set<Long> LJFF = new LinkedHashSet();
    public long LJII = Long.MAX_VALUE;

    public final void LIZ() {
        C20441214yg.LIZIZ("ScoreRevealManager", "clear all scheduled reveals");
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = this.LJI;
        if (aRunnableS131S0100000_31 != null) {
            C473410IhP.LJ(aRunnableS131S0100000_31);
        }
        this.LJI = null;
        this.LJFF.clear();
        this.LJ = true;
        this.LJII = Long.MAX_VALUE;
    }

    public final void LIZIZ(long j) {
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = this.LJI;
        if (aRunnableS131S0100000_31 != null) {
            C473410IhP.LJ(aRunnableS131S0100000_31);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scheduleHide: delayMs=");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("ScoreRevealManager", C2188811AlT.LIZIZ(sbLIZ));
        ARunnableS131S0100000_31 aRunnableS131S0100000_312 = new ARunnableS131S0100000_31(this, 123);
        this.LJI = aRunnableS131S0100000_312;
        C473410IhP.LIZJ(aRunnableS131S0100000_312, j);
    }

    public final void LIZJ(EnigmaBattleSetting enigmaBattleSetting) {
        if (!SettingsManager.INSTANCE.getBooleanValue("live_match_score_reveal_enable", true)) {
            C20441214yg.LIZIZ("ScoreRevealManager", "Score reveal disabled by setting");
            return;
        }
        List<Long> listLJLJJLL = C13LP.LJLJJLL(C13LP.LJLLJ(enigmaBattleSetting.enigmaScoreRevealCountdownSec));
        this.LIZJ = listLJLJJLL;
        this.LIZLLL = enigmaBattleSetting.enigmaScoreRevealDurationSec;
        if (!listLJLJJLL.isEmpty() && this.LIZLLL > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setupConfig: countdowns=");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", duration=");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append('s');
            C20441214yg.LIZIZ("ScoreRevealManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C20441214yg.LIZIZ("ScoreRevealManager", "No reveal config, skip setup");
    }

    public C15DJ(C15DN c15dn, AFwS205S0000000_17 aFwS205S0000000_17) {
        this.LIZ = c15dn;
        this.LIZIZ = aFwS205S0000000_17;
    }

    public final void LIZLLL(long j, boolean z) {
        if (!this.LIZIZ.invoke().booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerReveal: no enigma score in match, skip reveal at ");
            sbLIZ.append(j);
            C20441214yg.LIZIZ("ScoreRevealManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LJFF.add(Long.valueOf(j));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("triggerReveal: countdownSec=");
        sbLIZ2.append(j);
        sbLIZ2.append(", isFirstReveal=");
        sbLIZ2.append(this.LJ);
        sbLIZ2.append(", skipAnimation=");
        sbLIZ2.append(z);
        sbLIZ2.append(", triggeredPoints=");
        sbLIZ2.append(this.LJFF);
        C20441214yg.LIZIZ("ScoreRevealManager", C2188811AlT.LIZIZ(sbLIZ2));
        this.LIZ.LIZ(true, z);
        if (this.LJ) {
            this.LJ = false;
            this.LIZ.LIZIZ();
        }
        if (!z) {
            LIZIZ(this.LIZLLL * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
    }
}
