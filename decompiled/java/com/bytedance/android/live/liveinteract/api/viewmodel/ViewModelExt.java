package com.bytedance.android.live.liveinteract.api.viewmodel;

import X.C01GW;
import X.C452501pT;
import androidx.lifecycle.ViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public class ViewModelExt extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(37));

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Iterator it2 = ((List) this.LL.getValue()).iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
    }
}
