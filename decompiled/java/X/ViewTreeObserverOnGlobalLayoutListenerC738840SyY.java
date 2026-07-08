package X;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryFragment;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListFragment;
import com.ss.android.ugc.aweme.story.feed.immersive.protocol.IStoryGalleryProtocol;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC738840SyY implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC738840SyY viewTreeObserverOnGlobalLayoutListenerC738840SyY) {
        ((IStoryGalleryProtocol) ((StoryGalleryFragment) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l0).LLIZ.getValue()).jy2((StoryGalleryFragment) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l0);
        ViewTreeObserver viewTreeObserver = ((View) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l1).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC738840SyY);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC738840SyY, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC738840SyY viewTreeObserverOnGlobalLayoutListenerC738840SyY) {
        if (((View) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l0).getHeight() == 0) {
            return;
        }
        StoryViewerListFragment storyViewerListFragment = (StoryViewerListFragment) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l1;
        if (storyViewerListFragment.LLJ) {
            return;
        }
        storyViewerListFragment.LLJ = true;
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l0;
        storyViewerListFragment.SR(view, view.getHeight(), 0, null);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC738840SyY viewTreeObserverOnGlobalLayoutListenerC738840SyY) {
        C0SPV c0spv = (C0SPV) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l0;
        c0spv.LLLFZ = c0spv.LLILLJJLI.getWidth();
        C0SPV c0spv2 = (C0SPV) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l0;
        if (c0spv2.LLLFZ != 0 && !c0spv2.LLLFFI) {
            c0spv2.LJFF((Aweme) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l1);
            ((C0SPV) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l0).LLLFFI = true;
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC738840SyY viewTreeObserverOnGlobalLayoutListenerC738840SyY) {
        ((Function0) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l0).invoke();
        C786410Ut5.C3(((BaseCellSlotComponent) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l1).LJJIJL().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC738840SyY);
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC738840SyY viewTreeObserverOnGlobalLayoutListenerC738840SyY) {
        Rect rect = new Rect();
        ((C21368918jv) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l0).getLocalVisibleRect(rect);
        if (rect.top >= 0 && rect.bottom <= ((C21368918jv) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l0).getHeight()) {
            int i = rect.bottom;
            Layout layout = ((C21368918jv) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l0).getLayout();
            if (layout != null) {
                PostModePageViewModel postModePageViewModel = (PostModePageViewModel) viewTreeObserverOnGlobalLayoutListenerC738840SyY.l1;
                int lineEnd = layout.getLineEnd(layout.getLineForVertical(i));
                int i2 = postModePageViewModel.LLLILZ;
                if (lineEnd < i2) {
                    lineEnd = i2;
                }
                postModePageViewModel.LLLILZ = lineEnd;
            }
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC738840SyY(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
