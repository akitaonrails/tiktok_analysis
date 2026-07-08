package com.bytedance.android.live.dialogoeventbserver;

import X.C1082760eHa;
import X.C1119470fEn;
import X.C770910ULx;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveDialogStatusEventObserverManager extends ViewModel {
    public static final /* synthetic */ int LLILZ = 0;
    public final LifecycleOwner LL;
    public final C1119470fEn<C770910ULx> LLILLJJLI = new C1119470fEn<>((Object) null);
    public final MutableLiveData<C1082760eHa> LLILLL = new MutableLiveData<>();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLJJLI.LIZIZ();
    }

    public LiveDialogStatusEventObserverManager(Fragment fragment, DataChannel dataChannel) {
        this.LL = fragment;
        dataChannel.BQ2(fragment, LiveDialogStatusChannel.class, new AwS596S0100000_17(this, 337));
    }
}
