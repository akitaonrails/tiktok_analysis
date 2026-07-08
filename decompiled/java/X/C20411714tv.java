package X;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.cover.PlaybookEditorCoverDialog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.PlayImage;

/* JADX INFO: renamed from: X.14tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20411714tv implements InterfaceC170900l9<List<? extends PlayImage>> {
    public final /* synthetic */ PlaybookEditorCoverDialog LIZ;

    public C20411714tv(PlaybookEditorCoverDialog playbookEditorCoverDialog) {
        this.LIZ = playbookEditorCoverDialog;
    }

    @Override // X.InterfaceC170900l9
    public final void LIZ(List<? extends PlayImage> list) {
        PlayImage playImage;
        PlaybookEditorCoverDialog playbookEditorCoverDialog = this.LIZ;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        playbookEditorCoverDialog.LLLII = arrayList;
        PlaybookEditorCoverDialog playbookEditorCoverDialog2 = this.LIZ;
        int i = 0;
        for (Object obj : (ArrayList) playbookEditorCoverDialog2.LLLI) {
            int i2 = i + 1;
            if (i >= 0) {
                View view = (View) obj;
                List<PlayImage> list2 = playbookEditorCoverDialog2.LLLII;
                if (list2 != null && (playImage = (PlayImage) C13LP.LJJJLZIJ(i, list2)) != null) {
                    C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(ImageModel.genBy(playImage.url));
                    c1324610kZfLJIIIZ.LJIJI(Float.valueOf(C418440Gaw.LIZIZ(8)));
                    c1324610kZfLJIIIZ.LJIIIZ = R.drawable.e18;
                    c1324610kZfLJIIIZ.LJJI(view);
                } else {
                    C1324610kZf url = C1819620xS4.LIZ().setUrl(null);
                    url.LJIJI(Float.valueOf(C418440Gaw.LIZIZ(8)));
                    url.LJIIIZ = R.drawable.e18;
                    url.LJJI(view);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LIZ.BS(true);
    }

    @Override // X.InterfaceC170900l9
    public final void onFailed(Throwable th) {
        String message;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        C20441214yg.LJ("PlaybookEditorCoverDialog", String.valueOf(message));
        this.LIZ.BS(true);
    }
}
