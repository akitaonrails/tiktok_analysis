package com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.guest;

import X.InterfaceC1097170eep;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.guest.TopGuestGamePlayGuestViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes.dex */
public final class TopGuestGamePlayGuestWidget extends BaseTopGuestGamePlayWidget<TopGuestGamePlayGuestViewModel> {
    public final DataChannel LLILLL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget
    public final String y1() {
        return "TopGuestGamePlayGuestWidget";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget
    public final void z1() {
        Fragment fragment;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null) {
            return;
        }
        final DataChannel dataChannel = this.LLILLL;
        ViewModelProvider.Factory factory = new ViewModelProvider.Factory(dataChannel) { // from class: X.01Zh
            public final DataChannel LIZ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            {
                this.LIZ = dataChannel;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                if (cls.isAssignableFrom(TopGuestGamePlayGuestViewModel.class)) {
                    return new TopGuestGamePlayGuestViewModel(this.LIZ);
                }
                throw new IllegalArgumentException("Unknown ViewModel class");
            }
        };
        if (!fragment.isAdded() || fragment.isRemoving() || fragment.isDetached() || fragment.getView() == null) {
            return;
        }
        this.LL = (VM) new ViewModelProvider(fragment, factory).get(TopGuestGamePlayGuestViewModel.class);
    }

    public TopGuestGamePlayGuestWidget(DataChannel dataChannel) {
        this.LLILLL = dataChannel;
    }
}
