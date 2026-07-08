package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.sei.SeiPlaybookExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.im.PlaybookMessage;

/* JADX INFO: renamed from: X.14p4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20381614p4 extends AbstractC20384214pU {
    @Override // X.AbstractC20384214pU
    public final String LJIJJ() {
        return "PlaybookGuestModel";
    }

    @Override // X.AbstractC20384214pU
    public final boolean LJJII(long j) {
        return false;
    }

    @Override // X.AbstractC20384214pU
    public final void LJJIIZI() {
        LJJIII(null, "endIM", false, true);
    }

    @Override // X.AbstractC20384214pU
    public final void LJJIJ(PlaybookMessage playbookMessage) {
        long jLJIJI = AbstractC20384214pU.LJIJI();
        ActivePlaybook activePlaybook = new ActivePlaybook();
        activePlaybook.roomId = jLJIJI;
        activePlaybook.playId = playbookMessage.playId;
        activePlaybook.playStatus = playbookMessage.playStatus;
        Playbook playbook = new Playbook();
        PlaybookContent playbookContent = new PlaybookContent();
        playbook.playbookId = playbookMessage.playbookId;
        playbook.content = playbookContent;
        playbookContent.title = playbookMessage.title;
        playbookContent.coverUrl = playbookMessage.coverUrl;
        playbookContent.tagTypes = playbookMessage.firstLevelTagTypes;
        activePlaybook.playbook = playbook;
        activePlaybook.playbookGroup = playbookMessage.playbookGroup;
        activePlaybook.currentStateId = playbookMessage.currentStateId;
        LJJIII(activePlaybook, "onGoingIMGuest", false, true);
    }

    public C20381614p4(DataChannel dataChannel, WeakReference<Context> weakReference) {
        super(dataChannel, weakReference);
    }

    public final void LJJIJIIJIL(SeiPlaybookExtra seiPlaybookExtra, String str) {
        String str2;
        String str3;
        String str4;
        PlaybookContent playbookContent;
        PlaybookContent playbookContent2;
        PlaybookContent playbookContent3;
        PlaybookContent playbookContent4;
        String str5 = null;
        if (seiPlaybookExtra == null) {
            if (this.LJIIIZ == null) {
                C20441214yg.LJIIIZ("PlaybookGuestModel", "updateActivePlaybookBySeiPlaybookExtra return, equal activePlaybook, seiPlaybookExtra=null");
                return;
            } else {
                LJJIII(null, str, false, true);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("activePlaybook: ");
        sbLIZ.append(PlaybookUtilKt.LIZLLL(seiPlaybookExtra, AbstractC20384214pU.LJIJI()));
        C20441214yg.LIZIZ("playbook_auto_run", C2188811AlT.LIZIZ(sbLIZ));
        Long l = seiPlaybookExtra.playId;
        if (l != null && l.longValue() > 0) {
            ActivePlaybook activePlaybookLIZLLL = PlaybookUtilKt.LIZLLL(seiPlaybookExtra, AbstractC20384214pU.LJIJI());
            ActivePlaybook activePlaybook = this.LJIIIZ;
            if (activePlaybook != null && Intrinsics.LJFF(Long.valueOf(activePlaybookLIZLLL.playId), Long.valueOf(activePlaybook.playId)) && Intrinsics.LJFF(Integer.valueOf(activePlaybookLIZLLL.playStatus), Integer.valueOf(activePlaybook.playStatus))) {
                Playbook playbook = activePlaybookLIZLLL.playbook;
                if (playbook != null && (playbookContent4 = playbook.content) != null) {
                    str2 = playbookContent4.title;
                } else {
                    str2 = null;
                }
                Playbook playbook2 = activePlaybook.playbook;
                if (playbook2 != null && (playbookContent3 = playbook2.content) != null) {
                    str3 = playbookContent3.title;
                } else {
                    str3 = null;
                }
                if (Intrinsics.LJFF(str2, str3)) {
                    Playbook playbook3 = activePlaybookLIZLLL.playbook;
                    if (playbook3 != null && (playbookContent2 = playbook3.content) != null) {
                        str4 = playbookContent2.coverUrl;
                    } else {
                        str4 = null;
                    }
                    Playbook playbook4 = activePlaybook.playbook;
                    if (playbook4 != null && (playbookContent = playbook4.content) != null) {
                        str5 = playbookContent.coverUrl;
                    }
                    if (Intrinsics.LJFF(str4, str5) && Intrinsics.LJFF(Long.valueOf(activePlaybookLIZLLL.currentStateId), Long.valueOf(activePlaybook.currentStateId))) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateActivePlaybookBySeiPlaybookExtra return,  equal activePlaybook, seiPlaybookExtra=");
                        sbLIZ2.append(seiPlaybookExtra);
                        C20441214yg.LJIIIZ("PlaybookGuestModel", C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                }
            }
            LJJIII(activePlaybookLIZLLL, str, false, true);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateActivePlaybookBySeiPlaybookExtra return,  playId=");
        sbLIZ3.append(l);
        C20441214yg.LJIIIZ("PlaybookGuestModel", C2188811AlT.LIZIZ(sbLIZ3));
    }
}
