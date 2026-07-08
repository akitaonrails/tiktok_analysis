package com.bytedance.als.ui;

import X.AbstractC1664470tPp;
import X.AbstractC1664490tPr;
import X.C01GW;
import X.C05YF;
import X.C0LFH;
import X.C19A3;
import X.C19AL;
import X.C452501pT;
import X.EnumC371580EhY;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public abstract class UIPanelComponent<API_COMPONENT extends C05YF, SCENE extends AbstractC1664490tPr<STATE, ACTION>, STATE, ACTION> extends AbstractC1664470tPp<API_COMPONENT, STATE, ACTION> {
    public final C19A3 LLILLL;
    public Class<?> LLILZ;
    public EnumC371580EhY LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25((UIPanelComponent) this, 61));
    public final Function0<SCENE> LLIZ = new AwS569S0100000_25((UIPanelComponent) this, 62);
    public final C19AL LLIZLLLIL;

    public final SCENE B3() {
        return (SCENE) this.LLILZLL.getValue();
    }

    public final Class<?> H3() {
        Class<?> cls = this.LLILZ;
        if (cls != null) {
            return cls;
        }
        return null;
    }

    public void hide() {
        if (this.LLILLL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) && B3().isVisible()) {
            C0LFH.LIZ(new AwS569S0100000_25((UIPanelComponent) this, 60));
        }
    }

    public final EnumC371580EhY q3() {
        EnumC371580EhY enumC371580EhY = this.LLILZIL;
        if (enumC371580EhY != null) {
            return enumC371580EhY;
        }
        return null;
    }

    public void show() {
        if (this.LLILLL.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || B3().isVisible()) {
            return;
        }
        if (this.LLILLL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            C0LFH.LIZ(new AwS569S0100000_25((UIPanelComponent) this, 63));
        } else {
            this.LLILLL.getLifecycle().addObserver(new GenericLifecycleObserver(this) { // from class: com.bytedance.als.ui.UIPanelComponent.show.2
                public final /* synthetic */ UIPanelComponent<API_COMPONENT, SCENE, STATE, ACTION> LL;

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_CREATE) {
                        onCreate();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
                public final void onCreate() {
                    this.LL.LLILLL.getLifecycle().removeObserver(this);
                    C0LFH.LIZ(new AwS569S0100000_25((UIPanelComponent) this.LL, 64));
                }

                {
                    this.LL = this;
                }
            });
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (q3() == EnumC371580EhY.SHOW) {
            show();
        }
    }

    public Function0<SCENE> E3() {
        return this.LLIZ;
    }

    public C19AL v3() {
        return this.LLIZLLLIL;
    }

    public UIPanelComponent(C19A3 c19a3) {
        this.LLILLL = c19a3;
    }

    public final void O3(EnumC371580EhY enumC371580EhY) {
        this.LLILZIL = enumC371580EhY;
    }

    public final void Q3(Class<?> cls) {
        this.LLILZ = cls;
    }
}
