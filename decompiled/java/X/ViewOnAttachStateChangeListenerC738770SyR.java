package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.tag.FeedTaggedListCell;
import com.ss.android.ugc.aweme.tag.viewmodel.FeedTaggedListViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS125S1100000_11;

/* JADX INFO: renamed from: X.0SyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class ViewOnAttachStateChangeListenerC738770SyR implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC738770SyR viewOnAttachStateChangeListenerC738770SyR, View view) {
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC738770SyR viewOnAttachStateChangeListenerC738770SyR, View view) {
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
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
        }
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC738770SyR viewOnAttachStateChangeListenerC738770SyR, View view) {
        FeedTaggedListViewModel feedTaggedListViewModelL5 = ((FeedTaggedListCell) viewOnAttachStateChangeListenerC738770SyR.l0).L5();
        String uid = ((C737490SwN) viewOnAttachStateChangeListenerC738770SyR.l1).LL.getUid();
        if (!feedTaggedListViewModelL5.LLILLJJLI.contains(uid)) {
            feedTaggedListViewModelL5.LLILLJJLI.add(uid);
            try {
                C737520SwQ.LIZ("show_tagged_user", new AwS125S1100000_11(uid, feedTaggedListViewModelL5, 17));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC738770SyR viewOnAttachStateChangeListenerC738770SyR, View view) {
        C786410Ut5.C3(view.getViewTreeObserver(), (ViewTreeObserver.OnGlobalLayoutListener) viewOnAttachStateChangeListenerC738770SyR.l0);
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC738770SyR);
        ((VideoViewCell) viewOnAttachStateChangeListenerC738770SyR.l1).y0.remove((ViewTreeObserver.OnGlobalLayoutListener) viewOnAttachStateChangeListenerC738770SyR.l0);
        ((VideoViewCell) viewOnAttachStateChangeListenerC738770SyR.l1).z0.remove((ViewTreeObserver.OnGlobalLayoutListener) viewOnAttachStateChangeListenerC738770SyR.l0);
        ((VideoViewCell) viewOnAttachStateChangeListenerC738770SyR.l1).A0.remove((ViewTreeObserver.OnGlobalLayoutListener) viewOnAttachStateChangeListenerC738770SyR.l0);
    }

    public ViewOnAttachStateChangeListenerC738770SyR(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
