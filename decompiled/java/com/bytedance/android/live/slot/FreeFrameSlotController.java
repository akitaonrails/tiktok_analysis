package com.bytedance.android.live.slot;

import X.C01GW;
import X.C1123980fM4;
import X.C452501pT;
import X.InterfaceC1123990fM5;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.Queue;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class FreeFrameSlotController implements OnMessageListener, GenericLifecycleObserver {
    public final Context LL;
    public final InterfaceC1123990fM5 LLILLJJLI;
    public Queue<C1123980fM4> LLILLL;
    public DataChannel LLILZIL;
    public IMessageManager LLILZLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(119));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 101));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        Queue<C1123980fM4> queue = this.LLILLL;
        if (queue != null) {
            Iterator<T> it2 = queue.iterator();
            while (it2.hasNext()) {
                ((C1123980fM4) it2.next()).LIZIZ.onCreate(new Bundle());
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        IMessageManager iMessageManager = this.LLILZLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        Queue<C1123980fM4> queue = this.LLILLL;
        if (queue != null) {
            Iterator<T> it2 = queue.iterator();
            while (it2.hasNext()) {
                ((C1123980fM4) it2.next()).LIZIZ.onDestroy();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        Queue<C1123980fM4> queue = this.LLILLL;
        if (queue != null) {
            Iterator<T> it2 = queue.iterator();
            while (it2.hasNext()) {
                ((C1123980fM4) it2.next()).LIZIZ.onPause();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        Queue<C1123980fM4> queue = this.LLILLL;
        if (queue != null) {
            Iterator<T> it2 = queue.iterator();
            while (it2.hasNext()) {
                ((C1123980fM4) it2.next()).LIZIZ.onResume();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        Queue<C1123980fM4> queue = this.LLILLL;
        if (queue != null) {
            Iterator<T> it2 = queue.iterator();
            while (it2.hasNext()) {
                ((C1123980fM4) it2.next()).LIZIZ.onStart();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        Queue<C1123980fM4> queue = this.LLILLL;
        if (queue != null) {
            Iterator<T> it2 = queue.iterator();
            while (it2.hasNext()) {
                ((C1123980fM4) it2.next()).LIZIZ.onStop();
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Queue<C1123980fM4> queue = this.LLILLL;
        if (queue != null) {
            Iterator<T> it2 = queue.iterator();
            while (it2.hasNext()) {
                ((C1123980fM4) it2.next()).LIZIZ.onMessage(iMessage);
            }
        }
    }

    public FreeFrameSlotController(Context context, FreeFrameSlotWidget freeFrameSlotWidget) {
        this.LL = context;
        this.LLILLJJLI = freeFrameSlotWidget;
    }
}
