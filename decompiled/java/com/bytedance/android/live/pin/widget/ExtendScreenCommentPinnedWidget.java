package com.bytedance.android.live.pin.widget;

import X.AbstractC1109730ez5;
import X.C1109830ezF;
import X.C1109850ezH;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1097170eep;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class ExtendScreenCommentPinnedWidget extends BaseCommentPinnedWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gzh;
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget, com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final int H1() {
        return (int) C497740JfY.LIZIZ(24.0f);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final AbstractC1109730ez5 J1() {
        return new AbstractC1109730ez5() { // from class: X.0eel
        };
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final void L1() {
        Fragment fragment;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null || fragment.getActivity() == null) {
            return;
        }
        this.LLILZIL = (PinMessageViewModel) ViewModelProviders.of(interfaceC1097170eep.getFragment()).get("extended", PinMessageViewModel.class);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final C1109830ezF B1() {
        ViewGroup viewGroup;
        View view = getView();
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return null;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.context), R.layout.gze, viewGroup, false);
        viewGroup.addView(viewTd);
        PinMessageViewModel pinMessageViewModel = this.LLILZIL;
        return new C1109830ezF(viewTd, pinMessageViewModel != null ? pinMessageViewModel.LL : null, true);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final C1109850ezH C1() {
        ViewGroup viewGroup;
        View view = getView();
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return null;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.context), R.layout.gzf, viewGroup, false);
        viewGroup.addView(viewTd);
        PinMessageViewModel pinMessageViewModel = this.LLILZIL;
        return new C1109850ezH(viewTd, pinMessageViewModel != null ? pinMessageViewModel.LL : null, true);
    }
}
