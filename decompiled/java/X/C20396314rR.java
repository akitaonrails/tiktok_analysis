package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookInteractivePolymerizationDialog;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14rR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20396314rR extends C09AY implements Function2<List<? extends Playbook>, String, Unit> {
    public final /* synthetic */ PlaybookInteractivePolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20396314rR(PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog) {
        super(2);
        this.LL = playbookInteractivePolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends Playbook> list, String str) {
        MutableLiveData<C1158290gFP> mutableLiveData;
        C1158290gFP value;
        View view;
        PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog = this.LL;
        PlaybookAnchorViewModel playbookAnchorViewModel = playbookInteractivePolymerizationDialog.LLL;
        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLJJIJIIJIL) != null && (value = mutableLiveData.getValue()) != null && !value.LIZ && value.LIZJ && (view = playbookInteractivePolymerizationDialog.LLLF) != null && playbookInteractivePolymerizationDialog.LLLIIL == null) {
            C20398214rk c20398214rk = new C20398214rk(view, playbookInteractivePolymerizationDialog.LLL, playbookInteractivePolymerizationDialog.LLJZIJLIL, playbookInteractivePolymerizationDialog, playbookInteractivePolymerizationDialog.BS(), false, EnumC20429714wp.INTERACTION);
            playbookInteractivePolymerizationDialog.LLLIIL = c20398214rk;
            c20398214rk.S5(new C20390514qV(0));
        }
        return Unit.LIZ;
    }
}
