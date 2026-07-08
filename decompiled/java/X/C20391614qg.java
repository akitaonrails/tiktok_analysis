package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookInteractivePolymerizationDialog;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20391614qg extends C09AY implements Function1<Playbook, Integer> {
    public final /* synthetic */ PlaybookInteractivePolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20391614qg(PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog) {
        super(1);
        this.LL = playbookInteractivePolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Playbook playbook) {
        int i;
        List<Playbook> value;
        Playbook playbook2 = playbook;
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LL.LLL;
        if (playbookAnchorViewModel != null && (value = playbookAnchorViewModel.KQ2(C20385714pj.LIZ(playbookAnchorViewModel)).getValue()) != null) {
            Iterator<Playbook> it2 = value.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next().playbookId == playbook2.playbookId) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
