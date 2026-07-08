package com.bytedance.android.live.broadcast.shortcutpanel;

import X.C2187701Ajg;
import X.EnumC771390UNt;
import X.ViewTreeObserverOnGlobalLayoutListenerC786100Usa;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.ShortCutPanelShowChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseSubShortCutPanelWidget extends LiveWidget {
    public final Function1<EnumC771390UNt, Boolean> LL;
    public final Function1<EnumC771390UNt, Boolean> LLILLJJLI;
    public String LLILLL = "";
    public ViewTreeObserverOnGlobalLayoutListenerC786100Usa LLILZ;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract EnumC771390UNt x1();

    public final void y1() {
        View view;
        ViewTreeObserver viewTreeObserver;
        if (this.LLILZ != null && (view = getView()) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC786100Usa viewTreeObserverOnGlobalLayoutListenerC786100Usa = this.LLILZ;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC786100Usa);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC786100Usa, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        this.LLILZ = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        y1();
        super.onDestroy();
    }

    public final void A1(Function0<Unit> function0) {
        ViewTreeObserver viewTreeObserver;
        if (!isShowing() && this.LL.invoke(x1()).booleanValue()) {
            show();
            if (function0 != null) {
                function0.invoke();
            }
            y1();
            View view = getView();
            int height = 0;
            if (view != null && view.getHeight() > 0) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    View view2 = getView();
                    if (view2 != null) {
                        height = view2.getHeight();
                    }
                    dataChannel.zW(ShortCutPanelShowChannel.class, Integer.valueOf(height));
                    return;
                }
                return;
            }
            this.LLILZ = new ViewTreeObserverOnGlobalLayoutListenerC786100Usa(this, 3);
            View view3 = getView();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC786100Usa viewTreeObserverOnGlobalLayoutListenerC786100Usa = this.LLILZ;
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC786100Usa);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC786100Usa, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseSubShortCutPanelWidget(Function1<? super EnumC771390UNt, Boolean> function1, Function1<? super EnumC771390UNt, Boolean> function12) {
        this.LL = function1;
        this.LLILLJJLI = function12;
    }

    public final void z1(String str, Function0<Unit> function0) {
        if (isShowing() && this.LLILLJJLI.invoke(x1()).booleanValue()) {
            this.LLILLL = str;
            hide();
            if (function0 != null) {
                function0.invoke();
            }
            y1();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(ShortCutPanelShowChannel.class, 0);
            }
        }
    }
}
