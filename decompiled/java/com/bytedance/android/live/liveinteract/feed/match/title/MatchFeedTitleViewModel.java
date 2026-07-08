package com.bytedance.android.live.liveinteract.feed.match.title;

import X.C15F6;
import X.C15F9;
import X.C15FE;
import X.C20441214yg;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class MatchFeedTitleViewModel extends ViewModel {
    public DataChannel LL;
    public final C15F9 LLILLJJLI = new C15F9(null, 7);
    public final MutableLiveData<C15F9> LLILLL = new MutableLiveData<>();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        super.onCleared();
    }

    public static void vQ2(MatchFeedTitleViewModel matchFeedTitleViewModel, C15F6 c15f6, C15FE c15fe) {
        if (Intrinsics.LJFF(matchFeedTitleViewModel.LLILLJJLI.LLILLJJLI, c15f6)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchContentState , target = ");
            sbLIZ.append(c15f6);
            sbLIZ.append(" , return by same");
            C20441214yg.LIZIZ("MatchFeedTitleViewModel", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            matchFeedTitleViewModel.LLILLL.setValue(C15F9.LIZ(matchFeedTitleViewModel.LLILLJJLI, c15f6, c15fe));
        } else {
            matchFeedTitleViewModel.LLILLL.postValue(C15F9.LIZ(matchFeedTitleViewModel.LLILLJJLI, c15f6, c15fe));
        }
    }
}
