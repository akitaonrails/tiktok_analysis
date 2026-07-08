package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PreviewPageActivePlaybookHasConsume;
import com.bytedance.android.live.liveinteract.multiguestv3.model.PreviewPageActivePlaybook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.ActivePlaybook;

/* JADX INFO: renamed from: X.14pZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20384714pZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PlaybookAnchorServiceV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20384714pZ(PlaybookAnchorServiceV2 playbookAnchorServiceV2) {
        super(0);
        this.LL = playbookAnchorServiceV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PlaybookAnchorViewModel playbookAnchorViewModel;
        PlaybookAnchorViewModel playbookAnchorViewModel2;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2 = this.LL;
        playbookAnchorServiceV2.getClass();
        try {
            WeakReference<Fragment> weakReference = playbookAnchorServiceV2.LLJIJIL;
            Fragment fragment = weakReference != null ? weakReference.get() : null;
            if (!C500260Jjc.LJJJI((Boolean) playbookAnchorServiceV2.LLJI.gg0(PreviewPageActivePlaybookHasConsume.class)) && !C500260Jjc.LJJIL() && playbookAnchorServiceV2.LLJILJILJ && fragment != null) {
                PreviewPageActivePlaybook previewPageActivePlaybook = (PreviewPageActivePlaybook) C520010KaN.LJIIIIZZ(fragment, "preview_page_active_playbook");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("autoStartFromPreviewPage, previewPageActivePlaybook=");
                sbLIZ.append(previewPageActivePlaybook);
                C20441214yg.LJIIIZ("PlaybookAnchorServiceV2", C2188811AlT.LIZIZ(sbLIZ));
                if (previewPageActivePlaybook != null && ((playbookAnchorViewModel = (PlaybookAnchorViewModel) playbookAnchorServiceV2.LLILLJJLI) == null || (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) == null || (value = mutableLiveData.getValue()) == null || value.playStatus != 1)) {
                    if (C500260Jjc.LJJJI(Boolean.valueOf(previewPageActivePlaybook.existsCustomContent)) && (playbookAnchorViewModel2 = (PlaybookAnchorViewModel) playbookAnchorServiceV2.LLILLJJLI) != null) {
                        playbookAnchorViewModel2.RQ2(previewPageActivePlaybook.playbookId, previewPageActivePlaybook.originalPlaybookContentId, previewPageActivePlaybook.flowStr);
                    }
                    PlaybookAnchorViewModel playbookAnchorViewModel3 = (PlaybookAnchorViewModel) playbookAnchorServiceV2.LLILLJJLI;
                    if (playbookAnchorViewModel3 != null) {
                        long j = previewPageActivePlaybook.playbookId;
                        long j2 = previewPageActivePlaybook.playbookContentId;
                        long j3 = previewPageActivePlaybook.originalPlaybookContentId;
                        String str = previewPageActivePlaybook.flowStr;
                        String str2 = previewPageActivePlaybook.from;
                        PlaybookAnchorViewModel.SQ2(playbookAnchorViewModel3, null, null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), str, null, str2, previewPageActivePlaybook.autoApplyType, false, null, previewPageActivePlaybook.previewStartIsActivityFrom ? str2 : "", "", previewPageActivePlaybook.panelEntrance, false, false, 50176);
                    }
                }
                playbookAnchorServiceV2.LLJI.zW(PreviewPageActivePlaybookHasConsume.class, Boolean.TRUE);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("autoStartFromPreviewPage error=");
            sbLIZ2.append(th.getMessage());
            C20441214yg.LJ("PlaybookAnchorServiceV2", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return Unit.LIZ;
    }
}
