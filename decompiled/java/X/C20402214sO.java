package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicNonMGPlaybookFixTechSwitchSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14sO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20402214sO extends C09AY implements Function0<C20394914rD> {
    public final /* synthetic */ C20398214rk LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20402214sO(View view, C20398214rk c20398214rk) {
        super(0);
        this.LL = c20398214rk;
        this.LLILLJJLI = view;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.14rD] */
    @Override // kotlin.jvm.functions.Function0
    public final C20394914rD invoke() {
        final C20398214rk c20398214rk = this.LL;
        final View view = this.LLILLJJLI;
        return new InterfaceC20405014sq() { // from class: X.14rD
            @Override // X.InterfaceC20405014sq
            public final long LLJJ() {
                MutableLiveData<ActivePlaybook> mutableLiveData;
                ActivePlaybook value;
                Playbook playbook;
                PlaybookAnchorViewModel playbookAnchorViewModel = c20398214rk.LL;
                if (playbookAnchorViewModel == null || (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) == null || (value = mutableLiveData.getValue()) == null || (playbook = value.playbook) == null) {
                    return 0L;
                }
                return playbook.playbookId;
            }

            @Override // X.InterfaceC20405014sq
            public final long m2() {
                MutableLiveData<Long> mutableLiveData;
                Long value;
                PlaybookAnchorViewModel playbookAnchorViewModel = c20398214rk.LL;
                if (playbookAnchorViewModel == null || (mutableLiveData = playbookAnchorViewModel.LLJJ) == null || (value = mutableLiveData.getValue()) == null) {
                    return 0L;
                }
                return value.longValue();
            }

            @Override // X.InterfaceC20405014sq
            public final void tq(Playbook playbook, C20402114sN c20402114sN) {
                Context context = view.getContext();
                if (context != null) {
                    C20398214rk c20398214rk2 = c20398214rk;
                    C20394714rB c20394714rB = C20394714rB.LIZ;
                    DataChannel dataChannel = c20398214rk2.LLILLJJLI;
                    PlaybookAnchorViewModel playbookAnchorViewModel = c20398214rk2.LL;
                    C1117360fBO c1117360fBO = (C1117360fBO) c20398214rk2.LLJILJIL.getValue();
                    PlaybookAnchorViewModel playbookAnchorViewModel2 = c20398214rk2.LL;
                    c20394714rB.getClass();
                    C20406514t5 c20406514t5LIZJ = C20394714rB.LIZJ(playbook, c1117360fBO, playbookAnchorViewModel2);
                    C20403214sY c20403214sY = new C20403214sY(c20398214rk2, c20402114sN);
                    c20394714rB.getClass();
                    C20394714rB.LJ(dataChannel, context, playbook, playbookAnchorViewModel, c20406514t5LIZJ, null, null, c20403214sY);
                }
            }

            @Override // X.InterfaceC20405014sq
            public final void nn(Playbook playbook, boolean z, C978410bZH c978410bZH) {
                PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
                long j;
                EnumC20429314wl enumC20429314wlLIZ;
                DataChannel dataChannel = c20398214rk.LLILLJJLI;
                if (dataChannel != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) != null) {
                    long j2 = playbook.playbookId;
                    PlaybookContent playbookContent = playbook.content;
                    if (playbookContent != null) {
                        j = playbookContent.playbookContentId;
                    } else {
                        j = 0;
                    }
                    C20382814pG c20382814pG = new C20382814pG(j2, j, false, true, false, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -2060);
                    String str = C978360bZC.LIZJ.LIZ;
                    C915190ZvJ c915190ZvJ = new C915190ZvJ("my_playbook item click", false, 6);
                    if (LinkMicNonMGPlaybookFixTechSwitchSetting.INSTANCE.isEnable()) {
                        enumC20429314wlLIZ = C20394214r6.LIZ(c20398214rk.LL);
                    } else {
                        enumC20429314wlLIZ = null;
                    }
                    playbookAnchorServiceV2LIZIZ.LJJIFFI(c20382814pG, str, c915190ZvJ, enumC20429314wlLIZ, false);
                }
            }
        };
    }
}
