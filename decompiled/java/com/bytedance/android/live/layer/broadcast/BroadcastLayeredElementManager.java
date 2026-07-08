package com.bytedance.android.live.layer.broadcast;

import X.C1080540eE0;
import X.C1083340eIW;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BroadcastLayeredElementManager extends BaseLayeredElementManager<C1080540eE0> {
    @Override // com.bytedance.android.live.layer.BaseLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public C1080540eE0 onCreateLayeredElementContext(Context context, ViewGroup viewGroup, DataChannel dataChannel) {
        return new C1080540eE0(context, viewGroup, dataChannel, this);
    }

    public BroadcastLayeredElementManager(Context context, Fragment fragment, C1083340eIW c1083340eIW, DataChannel dataChannel) {
        super(context, fragment, c1083340eIW, dataChannel);
    }
}
