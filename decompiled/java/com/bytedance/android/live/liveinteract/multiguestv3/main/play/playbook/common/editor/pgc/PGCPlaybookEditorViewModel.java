package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.pgc;

import X.AnonymousClass0207;
import X.C01GW;
import X.C20377814oS;
import X.C452501pT;
import X.C500260Jjc;
import X.C5182020e;
import X.InterfaceC20378014oU;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookTagAggregation;

/* JADX INFO: loaded from: classes.dex */
public final class PGCPlaybookEditorViewModel extends BasePlaybookEditorViewModel {
    public final C01GW LLIZ;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel
    public final int yQ2() {
        return 2;
    }

    public final void IQ2() {
        this.LLILLL.LJIIJJI.postValue(0);
        this.LLILLL.LJIIL.postValue(null);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        IQ2();
        C20377814oS c20377814oS = this.LLILZ;
        c20377814oS.LJII.remove(this.LLIZ.getValue());
        super.onCleared();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel
    public final void EQ2(Playbook playbook) {
        List<PlaybookTagAggregation> value;
        this.LLILZ.LJII.add((InterfaceC20378014oU) this.LLIZ.getValue());
        super.EQ2(playbook);
        LiveData<List<PlaybookTagAggregation>> liveDataLJJIJIL = this.LLILLJJLI.LJJIJIL();
        if (liveDataLJJIJIL != null && (value = liveDataLJJIJIL.getValue()) != null) {
            MutableLiveData<List<PlaybookTagAggregation>> mutableLiveData = this.LLILLL.LJIIIIZZ;
            ArrayList arrayList = new ArrayList(value);
            C500260Jjc.LJJJLIIL(arrayList, AnonymousClass0207.get$arr$(17));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C500260Jjc.LJJJLZIJ(((PlaybookTagAggregation) it2.next()).tags, AnonymousClass0207.get$arr$(18));
            }
            mutableLiveData.postValue(arrayList);
        }
    }

    public PGCPlaybookEditorViewModel(DataChannel dataChannel, BasePlaybookService<?> basePlaybookService, WeakReference<Context> weakReference) {
        super(dataChannel, basePlaybookService, weakReference);
        this.LLIZ = C452501pT.LIZIZ(new C5182020e(this, 52));
    }
}
