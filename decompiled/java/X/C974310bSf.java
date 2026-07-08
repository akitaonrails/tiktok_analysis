package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFunnyEffectPlaybookIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchIcyClashPlaybookIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchSpecificGiftPlaybookIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchVictoryLapFunnyEffectApplySetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0bSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974310bSf {
    public final LifecycleOwner LIZ;
    public final DataChannel LIZIZ;
    public long LJII;
    public ActivePlaybook LJIIIIZZ;
    public boolean LJIILIIL;
    public final long LIZJ = LiveMatchFunnyEffectPlaybookIdSetting.INSTANCE.getValue();
    public final long LIZLLL = LiveMatchSpecificGiftPlaybookIdSetting.INSTANCE.getValue();
    public final long LJ = LiveMatchIcyClashPlaybookIdSetting.INSTANCE.getValue();
    public final IEffectService LJFF = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
    public final String LJI = LiveMatchVictoryLapFunnyEffectApplySetting.INSTANCE.getValue();
    public Map<String, String> LJIIIZ = new LinkedHashMap();
    public Map<String, String> LJIIJ = new LinkedHashMap();
    public String LJIIJJI = "";
    public long LJIIL = System.currentTimeMillis();
    public final AwS629S0100000_15 LJIILJJIL = new AwS629S0100000_15(this, 92);
    public final AwS594S0100000_15 LJIILL = new AwS594S0100000_15(this, 1022);

    public final void LIZIZ() {
        if (!C915980Zwa.LJFF().gm1() || !this.LJIILIIL) {
            C20441214yg.LIZIZ("MatchPlaybookUpdateObserver", "removeCurrentFunnyEffect, currently not in victory lap, no removal");
            return;
        }
        C0U78 c0u78ComposerManagerB = this.LJFF.composerManagerB();
        List<LiveEffect> listQr = c0u78ComposerManagerB.qr(this.LJI);
        if (listQr != null) {
            for (LiveEffect liveEffect : listQr) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removeCurrentFunnyEffect, removing ");
                sbLIZ.append(liveEffect.getName());
                sbLIZ.append(" effect, id ");
                sbLIZ.append(liveEffect.getEffectId());
                C20441214yg.LIZIZ("MatchPlaybookUpdateObserver", C2188811AlT.LIZIZ(sbLIZ));
                c0u78ComposerManagerB.LJIIJ(liveEffect, this.LJI);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C499701x5 r10) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C974310bSf.LIZ(X.01x5):void");
    }

    public C974310bSf(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = dataChannel;
    }

    public final void LIZJ(String str, String str2, Playbook playbook) {
        String string;
        String strLJFF;
        ActivePlaybook activePlaybookLJ = C978440bZK.LJ(this.LIZIZ);
        DataChannel dataChannel = this.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C974350bSj.LIZ(linkedHashMap);
        C974350bSj.LIZLLL(linkedHashMap, activePlaybookLJ);
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("click_action", str2);
        String str3 = "";
        if (playbook == null || (string = Long.valueOf(playbook.playbookId).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("new_playbook_id", string);
        if (playbook != null && (strLJFF = C978440bZK.LJFF(playbook)) != null) {
            str3 = strLJFF;
        }
        linkedHashMap.put("new_playbook_biz", str3);
        if (dataChannel != null) {
            C935410aRv.LIZ(dataChannel, "livesdk_pk_playbook_change_game_popup", linkedHashMap);
        }
        C974350bSj.LJII("livesdk_pk_playbook_change_game_popup", linkedHashMap);
    }
}
