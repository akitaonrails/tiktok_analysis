package com.bytedance.android.live.layer;

import X.C0UO0;
import X.C1083340eIW;
import X.C1161920gLG;
import X.C11NZ;
import X.C784440Upu;
import X.InterfaceC742320T9y;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredElementConfig;
import com.bytedance.ies.sdk.widgets.LayeredElementConfigSetting;
import com.bytedance.ies.sdk.widgets.LayeredElementConfiguration;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.LayeredElementManager;
import kotlin.jvm.internal.AFwS301S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseLayeredElementManager<T extends LayeredElementContext> extends LayeredElementManager<T> {
    public Fragment LL;

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager, com.bytedance.ies.sdk.widgets.recycleelement.IRecycleLayeredElementManager
    public final void recycle() {
        this.LL = null;
        super.recycle();
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager
    public final <V> InterfaceC742320T9y<V, V> createRxTransformer() {
        return new C0UO0();
    }

    static {
        LayeredElementConfig value = LayeredElementConfigSetting.getValue();
        LayeredElementConfiguration layeredElementConfiguration = LayeredElementConfiguration.INSTANCE;
        layeredElementConfiguration.setGuidelineIndicatorEnabled(value.isGuidelineIndicatorEnabled());
        layeredElementConfiguration.setAnimationDuration(value.getAnimationDuration());
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        layeredElementConfiguration.setDebug(iHostAppContext != null ? iHostAppContext.isLocalTest() : false);
        layeredElementConfiguration.setSladarReporter(AFwS301S0000000_17.get$arr$(6));
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager
    public final <V> C11NZ<V> createRxObservable(Class<V> cls) {
        return C784440Upu.LIZ().LJ(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager, com.bytedance.ies.sdk.widgets.recycleelement.IRecycleLayeredElementManager
    public void reuse(Fragment fragment, DataChannel dataChannel) {
        this.LL = fragment;
        super.reuse(fragment, dataChannel);
    }

    public BaseLayeredElementManager(Context context, Fragment fragment, C1083340eIW c1083340eIW, DataChannel dataChannel) {
        super(context, fragment, c1083340eIW, dataChannel);
        this.LL = fragment;
    }
}
