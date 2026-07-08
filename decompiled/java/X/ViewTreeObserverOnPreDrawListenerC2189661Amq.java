package X;

import android.view.ViewTreeObserver;
import defpackage.RecyclerViewFirstDrawWatcher;
import oo5.b;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1Amq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class ViewTreeObserverOnPreDrawListenerC2189661Amq implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC2189661Amq viewTreeObserverOnPreDrawListenerC2189661Amq) {
        RecyclerViewFirstDrawWatcher recyclerViewFirstDrawWatcher = (RecyclerViewFirstDrawWatcher) viewTreeObserverOnPreDrawListenerC2189661Amq.l0;
        if (!recyclerViewFirstDrawWatcher.LLILLL && recyclerViewFirstDrawWatcher.LL.getChildCount() > 0) {
            RecyclerViewFirstDrawWatcher recyclerViewFirstDrawWatcher2 = (RecyclerViewFirstDrawWatcher) viewTreeObserverOnPreDrawListenerC2189661Amq.l0;
            recyclerViewFirstDrawWatcher2.LLILLL = true;
            recyclerViewFirstDrawWatcher2.LIZ();
            ((RecyclerViewFirstDrawWatcher) viewTreeObserverOnPreDrawListenerC2189661Amq.l0).LLILLJJLI.invoke();
        }
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC2189661Amq viewTreeObserverOnPreDrawListenerC2189661Amq) throws JSONException {
        ((ActivityC2186501Ahk) viewTreeObserverOnPreDrawListenerC2189661Amq.l0).LLJJI = System.currentTimeMillis();
        b bVar = b.LJIJJLI;
        ActivityC2186501Ahk activityC2186501Ahk = (ActivityC2186501Ahk) viewTreeObserverOnPreDrawListenerC2189661Amq.l0;
        long j = activityC2186501Ahk.LLJJIII;
        long j2 = activityC2186501Ahk.LLJJI;
        bVar.getClass();
        b.LJIIIZ(j, j2, "payin_checkout_ocr");
        C786410Ut5.D3(((ActivityC2186501Ahk) viewTreeObserverOnPreDrawListenerC2189661Amq.l0).LLJI.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC2189661Amq);
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC2189661Amq(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
