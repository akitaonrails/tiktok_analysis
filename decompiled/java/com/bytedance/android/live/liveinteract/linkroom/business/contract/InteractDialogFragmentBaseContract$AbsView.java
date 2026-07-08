package com.bytedance.android.live.liveinteract.linkroom.business.contract;

import X.C0TCG;
import X.C0UO0;
import X.C11RB;
import X.C11RD;
import X.C978980baC;
import X.InterfaceC963450bB9;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter;
import com.bytedance.android.livesdk.ui.BaseFragment;

/* JADX INFO: loaded from: classes16.dex */
public abstract class InteractDialogFragmentBaseContract$AbsView<T extends InteractDialogFragmentBaseContract$AbsPresenter> extends BaseFragment {
    public InterfaceC963450bB9 LL;
    public LiveSheetFragment LLILLJJLI;
    public T LLILLL;

    public abstract C978980baC OR();

    public final <R> C0TCG<R> NR() {
        InterfaceC963450bB9 interfaceC963450bB9 = this.LL;
        if (interfaceC963450bB9 != null) {
            return C11RD.LIZ(C11RB.LIZJ(interfaceC963450bB9.getLifecycleOwner(), Lifecycle.Event.ON_DESTROY), new C0UO0());
        }
        LiveSheetFragment liveSheetFragment = this.LLILLJJLI;
        if (liveSheetFragment != null) {
            return C11RD.LIZ(C11RB.LIZJ(liveSheetFragment.getViewLifecycleOwner(), Lifecycle.Event.ON_DESTROY), new C0UO0());
        }
        return null;
    }
}
