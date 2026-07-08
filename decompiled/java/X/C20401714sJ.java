package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14sJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20401714sJ extends C09AY implements Function0<Observer<C1158290gFP>> {
    public final /* synthetic */ C20394514r9 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20401714sJ(C20394514r9 c20394514r9) {
        super(0);
        this.LL = c20394514r9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Observer<C1158290gFP> invoke() {
        final C20394514r9 c20394514r9 = this.LL;
        return new Observer() { // from class: X.14rg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                List<Playbook> value;
                MutableLiveData<List<Playbook>> mutableLiveData;
                if (obj != null) {
                    C20394514r9 c20394514r92 = c20394514r9;
                    Function2<List<Playbook>, String, Unit> function2 = c20394514r92.LLILZLL;
                    PlaybookAnchorViewModel playbookAnchorViewModel = c20394514r92.LLILLL;
                    if (playbookAnchorViewModel == null || (mutableLiveData = playbookAnchorViewModel.LLJILLL) == null || (value = mutableLiveData.getValue()) == null) {
                        value = C13BV.INSTANCE;
                    }
                    function2.invoke(value, "PlaybookFetchListLocalParams_Update");
                }
            }
        };
    }
}
