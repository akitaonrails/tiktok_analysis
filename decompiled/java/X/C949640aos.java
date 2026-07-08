package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.linkroom.MatchPlaybookEventLeakFixSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.playbook.ActivePlaybookChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0aos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949640aos {
    public static final /* synthetic */ int LJI = 0;
    public final DataChannel LIZ;
    public final WeakReference<LifecycleOwner> LIZIZ;
    public final LifecycleOwner LIZJ;
    public final List<String> LIZLLL;
    public final AwS594S0100000_15 LJ;
    public final AwS594S0100000_15 LJFF;

    static {
        new C978350bZB();
    }

    public final void LIZ(Map<String, String> map) {
        String str;
        String strValueOf;
        map.put("live_status", C915980Zwa.LIZLLL().pY0(this.LIZ));
        if (C915980Zwa.LIZLLL().J8()) {
            str = "host";
        } else if (C915980Zwa.LIZLLL().Nf2()) {
            str = "guest";
        } else {
            str = "audience";
        }
        map.put("user_type", str);
        if (C915980Zwa.LIZLLL().w9()) {
            map.put("cohost_channel_id", String.valueOf(C915980Zwa.LIZLLL().getChannelId()));
            map.put("cohost_competition_id", C978440bZK.LJIIIIZZ());
            int iY91 = C915980Zwa.LIZLLL().y91();
            if (iY91 == 0) {
                strValueOf = "1";
            } else {
                strValueOf = String.valueOf(iY91);
            }
            map.put("cohost_current_host_cnt", strValueOf);
        }
    }

    public final void LIZIZ(Map<String, String> map) {
        String str;
        DataChannel dataChannel;
        C499701x5 c499701x5;
        Set<ActivePlaybook> set;
        map.put("live_status", C915980Zwa.LIZLLL().pY0(this.LIZ));
        if (C915980Zwa.LIZLLL().J8()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_in_live", str);
        if (!Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT) && (dataChannel = this.LIZ) != null && (c499701x5 = (C499701x5) dataChannel.gg0(ActivePlaybookChannel.class)) != null && (set = c499701x5.LIZ) != null) {
            for (ActivePlaybook activePlaybook : set) {
                Playbook playbook = activePlaybook.playbook;
                map.put("play_id_in_use", String.valueOf(activePlaybook.playId));
                if (playbook != null) {
                    map.put("is_in_playbook", "1");
                    map.put("playbook_id_in_use", String.valueOf(playbook.playbookId));
                    map.put("playbook_biz_in_use", C978440bZK.LJFF(playbook));
                } else {
                    map.put("is_in_playbook", CardStruct.IStatusCode.DEFAULT);
                }
            }
            if (set.isEmpty()) {
                map.put("is_in_playbook", CardStruct.IStatusCode.DEFAULT);
            }
        }
    }

    public C949640aos(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        WeakReference<LifecycleOwner> weakReference;
        this.LIZ = dataChannel;
        if (MatchPlaybookEventLeakFixSetting.enable()) {
            weakReference = new WeakReference<>(lifecycleOwner);
        } else {
            weakReference = null;
        }
        this.LIZIZ = weakReference;
        this.LIZJ = MatchPlaybookEventLeakFixSetting.enable() ? null : lifecycleOwner;
        this.LIZLLL = C1697810uHb.LJIIJJI("livesdk_anchor_playbook_entrance_show", "livesdk_anchor_playbook_entrance_click", "livesdk_multi_anchor_playbook_module_show", "livesdk_multi_anchor_playbook_list_module_show", "livesdk_multi_anchor_playbook_list", "livesdk_multi_anchor_playbook_detail", "livesdk_multi_anchor_playbook_feature_entrance", "livesdk_multiguest_playbook_feature_set", "livesdk_multiguest_playbook_banner", "livesdk_pk_playbook_banner", "livesdk_pk_playbook_change_game_popup");
        this.LJ = new AwS594S0100000_15(this, 1021);
        this.LJFF = new AwS594S0100000_15(this, 1020);
    }
}
