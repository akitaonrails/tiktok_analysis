package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog;
import java.util.List;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14ss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20405214ss extends C09AY implements Function0<Observer<C1158290gFP>> {
    public final /* synthetic */ PlaybookPolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20405214ss(PlaybookPolymerizationDialog playbookPolymerizationDialog) {
        super(0);
        this.LL = playbookPolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Observer<C1158290gFP> invoke() {
        final PlaybookPolymerizationDialog playbookPolymerizationDialog = this.LL;
        return new Observer() { // from class: X.14rh
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                List<Playbook> value;
                MutableLiveData<List<Playbook>> mutableLiveData;
                if (obj != null) {
                    PlaybookPolymerizationDialog playbookPolymerizationDialog2 = playbookPolymerizationDialog;
                    PlaybookAnchorViewModel playbookAnchorViewModel = playbookPolymerizationDialog2.LLL;
                    if (playbookAnchorViewModel == null || (mutableLiveData = playbookAnchorViewModel.LLJILLL) == null || (value = mutableLiveData.getValue()) == null) {
                        value = C13BV.INSTANCE;
                    }
                    playbookPolymerizationDialog2.JS("PlaybookFetchListLocalParams_Update", value);
                }
            }
        };
    }
}
