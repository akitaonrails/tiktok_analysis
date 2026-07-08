package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.ugc;

import X.C01GW;
import X.C20377814oS;
import X.C452501pT;
import X.C5182020e;
import X.InterfaceC20378014oU;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes.dex */
public final class UGCPlaybookEditorViewModel extends BasePlaybookEditorViewModel {
    public final C01GW LLIZ;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel
    public final int yQ2() {
        return 1;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C20377814oS c20377814oS = this.LLILZ;
        c20377814oS.LJII.remove(this.LLIZ.getValue());
        super.onCleared();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel
    public final void EQ2(Playbook playbook) {
        this.LLILZ.LJII.add((InterfaceC20378014oU) this.LLIZ.getValue());
        super.EQ2(playbook);
    }

    public UGCPlaybookEditorViewModel(DataChannel dataChannel, BasePlaybookService<?> basePlaybookService, WeakReference<Context> weakReference) {
        super(dataChannel, basePlaybookService, weakReference);
        this.LLIZ = C452501pT.LIZIZ(new C5182020e(this, 53));
    }
}
