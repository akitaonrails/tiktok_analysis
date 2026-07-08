package com.bytedance.android.live.liveinteract.linkroom.business.contract;

import X.C0TCG;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;

/* JADX INFO: loaded from: classes16.dex */
public abstract class InteractDialogFragmentBaseContract$AbsPresenter<V extends InteractDialogFragmentBaseContract$AbsView> {
    public final V LL;

    public void LJIIIIZZ() {
    }

    public void onCreate() {
    }

    public final <R> C0TCG<R> LJII() {
        return this.LL.NR();
    }

    public InteractDialogFragmentBaseContract$AbsPresenter(V v) {
        this.LL = v;
    }
}
