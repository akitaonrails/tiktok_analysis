package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import java.util.List;

/* JADX INFO: renamed from: X.14oe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20379014oe implements C14E9 {
    public final /* synthetic */ PlaybookEditorDialog LIZ;

    @Override // X.C14E9
    public final void LLLLLLLLL(String str, String str2, String str3) {
    }

    @Override // X.C14E9
    public final void f(List<String> list) {
    }

    public C20379014oe(PlaybookEditorDialog playbookEditorDialog) {
        this.LIZ = playbookEditorDialog;
    }

    @Override // X.C14E9
    public final void LLZLI(String str) {
        BasePlaybookSheetFragment basePlaybookSheetFragment = this.LIZ.LLLLIL;
        if (basePlaybookSheetFragment != null) {
            basePlaybookSheetFragment.close(1);
        }
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        Context context = C915980Zwa.LIZJ().context();
        if (str == null) {
            str = "";
        }
        multiCanvasUtils.getClass();
        String strLJIIL = MultiCanvasUtils.LJIIL(context, str);
        BasePlaybookEditorViewModel basePlaybookEditorViewModelBS = this.LIZ.BS();
        if (basePlaybookEditorViewModelBS != null) {
            basePlaybookEditorViewModelBS.GQ2(strLJIIL);
        }
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIJ("upload_cover", "choose_photo", this.LIZ.JS(), this.LIZ.HS(), this.LIZ.ES(), null, null);
    }
}
