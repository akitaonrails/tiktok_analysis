package X;

import Y.AObserverS221S0100000_17;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.dialogoeventbserver.LiveDialogStatusEventObserverManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;

/* JADX INFO: renamed from: X.0eHQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1082660eHQ extends ElementSpecImpl {
    public final AbstractC1080560eE2 LL;
    public int LLILLJJLI;
    public boolean LLILLL;

    public void LIZ(C1082760eHa c1082760eHa) {
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void attach(ConstraintProperty constraintProperty) {
        LiveDialogStatusEventObserverManager liveDialogStatusEventObserverManager;
        MutableLiveData<C1082760eHa> mutableLiveData;
        super.attach(constraintProperty);
        this.LLILLL = false;
        this.LLILLJJLI = 0;
        AbstractC1080560eE2 abstractC1080560eE2 = this.LL;
        Fragment fragment = abstractC1080560eE2.LIZ.LL;
        if (fragment != null) {
            DataChannel dataChannel = abstractC1080560eE2.getDataChannel();
            if (fragment.getActivity() != null && (liveDialogStatusEventObserverManager = (LiveDialogStatusEventObserverManager) ViewModelProviders.of(fragment, new C1086680eNu(fragment, dataChannel)).get(LiveDialogStatusEventObserverManager.class)) != null && (mutableLiveData = liveDialogStatusEventObserverManager.LLILLL) != null) {
                mutableLiveData.observe(fragment, new AObserverS221S0100000_17(this, 53));
            }
        }
    }

    public AbstractC1082660eHQ(int i, AbstractC1080560eE2 abstractC1080560eE2) {
        super(i);
        this.LL = abstractC1080560eE2;
    }
}
