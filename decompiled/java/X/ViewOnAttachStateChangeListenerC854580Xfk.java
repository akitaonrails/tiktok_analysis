package X;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestTopBarAssem;

/* JADX INFO: renamed from: X.0Xfk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class ViewOnAttachStateChangeListenerC854580Xfk implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC854580Xfk viewOnAttachStateChangeListenerC854580Xfk, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC854580Xfk(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC854580Xfk viewOnAttachStateChangeListenerC854580Xfk, View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            MessageRequestTopBarAssem messageRequestTopBarAssem = (MessageRequestTopBarAssem) viewOnAttachStateChangeListenerC854580Xfk.l0;
            ViewTreeObserver.OnDrawListener onDrawListener = (ViewTreeObserver.OnDrawListener) messageRequestTopBarAssem.LLJJJJJIL.getValue();
            viewTreeObserver.addOnDrawListener(onDrawListener);
            C2187701Ajg.LIZ(viewTreeObserver, onDrawListener, ViewTreeObserver.OnDrawListener.class);
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) messageRequestTopBarAssem.LLJJJJLIIL.getValue();
            viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
            C2187701Ajg.LIZ(viewTreeObserver, onScrollChangedListener, ViewTreeObserver.OnScrollChangedListener.class);
        }
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC854580Xfk viewOnAttachStateChangeListenerC854580Xfk, View view) throws Throwable {
        WebView webView = (WebView) viewOnAttachStateChangeListenerC854580Xfk.l0;
        if (webView != null) {
            webView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC854580Xfk);
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            C2204961BRm.LJIIJJI(activityLJFF, new Intent("COM.PNS.LEAVE_THIRD_CONTAINER"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wwd3M8baS7ZpzbzjuZhVW9mcoFsmbIPp9mEocppcU=", null));
        }
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC854580Xfk viewOnAttachStateChangeListenerC854580Xfk, View view) {
        if (view.getViewTreeObserver().isAlive()) {
            C786410Ut5.B3(view.getViewTreeObserver(), (ViewTreeObserver.OnDrawListener) ((MessageRequestTopBarAssem) viewOnAttachStateChangeListenerC854580Xfk.l0).LLJJJJJIL.getValue());
            C786410Ut5.E3(view.getViewTreeObserver(), (ViewTreeObserver.OnScrollChangedListener) ((MessageRequestTopBarAssem) viewOnAttachStateChangeListenerC854580Xfk.l0).LLJJJJLIIL.getValue());
        }
    }
}
