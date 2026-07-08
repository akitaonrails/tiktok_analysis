package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.select.PlaybookEditorSelectEntityDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.14nN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20371114nN extends C2217421BqW implements Function0<Unit> {
    public C20371114nN(PlaybookEditorDialog playbookEditorDialog) {
        super(0, playbookEditorDialog, PlaybookEditorDialog.class, "showEditorSelectEntityDialog", "showEditorSelectEntityDialog()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BasePlaybookEditorViewModel basePlaybookEditorViewModelBS;
        PlaybookEditorDialog playbookEditorDialog = (PlaybookEditorDialog) this.receiver;
        playbookEditorDialog.getClass();
        C20441214yg.LJIIIZ("Editor_PlaybookEditorDialog", "showEditorSelectEntityDialog");
        PlaybookEditorSelectEntityDialog playbookEditorSelectEntityDialog = playbookEditorDialog.LLLLJ;
        if ((playbookEditorSelectEntityDialog == null || !playbookEditorSelectEntityDialog.isVisible()) && (basePlaybookEditorViewModelBS = playbookEditorDialog.BS()) != null) {
            PlaybookEditorSelectEntityDialog playbookEditorSelectEntityDialog2 = new PlaybookEditorSelectEntityDialog(basePlaybookEditorViewModelBS, playbookEditorDialog.LLLIIIL, new C20371314nP(playbookEditorDialog), new C20370814nK(playbookEditorDialog), new C20370214nE(playbookEditorDialog), new AwS610S0100000_31(playbookEditorDialog, 474));
            playbookEditorDialog.LLLLJ = playbookEditorSelectEntityDialog2;
            C20374514nv.LJIIJ(playbookEditorDialog, playbookEditorSelectEntityDialog2, "PlaybookEditorSelectEntityDialog");
        }
        return Unit.LIZ;
    }
}
