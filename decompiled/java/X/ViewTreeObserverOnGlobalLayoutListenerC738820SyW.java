package X;

import Y.ARunnableS111S0100000_11;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.view.TextureView;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0SyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC738820SyW implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws Throwable {
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
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC738820SyW viewTreeObserverOnGlobalLayoutListenerC738820SyW) throws Throwable {
        int i;
        int iLJ;
        int i2;
        if (((TextureView) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l0).getWidth() > 0 && ((TextureView) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l0).getHeight() > 0) {
            C786410Ut5.C3(((TextureView) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC738820SyW);
            if (((Video) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l1).getWidth() > 0 && ((Video) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l1).getHeight() > 0) {
                C692910RFx c692910RFx = new C692910RFx();
                ShoutoutsPlayActivity shoutoutsPlayActivity = (ShoutoutsPlayActivity) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l2;
                TextureView textureView = (TextureView) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l0;
                int width = ((Video) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l1).getWidth();
                int height = ((Video) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l1).getHeight();
                C692910RFx.LIZLLL(shoutoutsPlayActivity);
                double d = ((double) C692910RFx.LJFF) / ((double) C692910RFx.LJI);
                int iLIZIZ = 0;
                if (d <= 0.5d) {
                    boolean z = C14LC.LJIIIZ;
                    C14LC c14lc = C309690CBz.LIZ;
                    if (c14lc.LIZIZ == 0) {
                        if (c14lc.LJFF) {
                            iLJ = C692910RFx.LJ() - C14LC.LIZIZ();
                            i2 = 0;
                            c14lc.getClass();
                        } else {
                            iLJ = C692910RFx.LJ();
                            i2 = c14lc.LIZ;
                        }
                    } else {
                        i = c14lc.LIZJ;
                        if (i == 0) {
                            iLJ = C692910RFx.LJ();
                            i2 = c14lc.LIZ;
                        }
                        c692910RFx.LIZJ(textureView, width, height, i, C692910RFx.LJFF, null, null);
                        return;
                    }
                    i = iLJ - i2;
                    if (!c14lc.LIZLLL) {
                        i -= c14lc.LIZIZ;
                    }
                    c692910RFx.LIZJ(textureView, width, height, i, C692910RFx.LJFF, null, null);
                    return;
                }
                if (d >= 0.6666666666666666d) {
                    c692910RFx.LJIIIZ(width, height, C692910RFx.LJFF, C692910RFx.LJI, textureView, null, null);
                    return;
                }
                int i3 = C692910RFx.LJIIIIZZ;
                boolean z2 = C14LC.LJIIIZ;
                C14LC c14lc2 = C309690CBz.LIZ;
                if (c14lc2.LJFF) {
                    iLIZIZ = C14LC.LIZIZ();
                }
                c692910RFx.LJIIIIZZ(textureView, width, height, (i3 - iLIZIZ) - c14lc2.LIZ, C692910RFx.LJFF, null, null);
            }
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC738820SyW viewTreeObserverOnGlobalLayoutListenerC738820SyW) {
        VideoViewCell videoViewCell = (VideoViewCell) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l0;
        WeakReference weakReference = (WeakReference) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l1;
        WeakReference weakReference2 = (WeakReference) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l2;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        videoViewCell.getClass();
        VideoViewCell.LLLLIILLL((View) weakReference.get(), (View) weakReference2.get());
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC738820SyW viewTreeObserverOnGlobalLayoutListenerC738820SyW) {
        View view;
        View viewFindViewById;
        Rect rect = new Rect();
        ((C21368918jv) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l0).getLocalVisibleRect(rect);
        C720690SOt c720690SOt = (C720690SOt) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l1).get();
        if (c720690SOt != null && (view = c720690SOt.LLJ) != null && (viewFindViewById = view.findViewById(R.id.rkl)) != null && viewFindViewById.getVisibility() != 0 && c720690SOt.LLJILJIL != -1) {
            C2487409ou.LIZJ(new ARunnableS111S0100000_11(c720690SOt, 162));
        }
        if (rect.top >= 0 && rect.bottom <= ((C21368918jv) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l0).getHeight()) {
            int i = rect.bottom;
            Layout layout = ((C21368918jv) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l0).getLayout();
            if (layout != null) {
                PostModePageViewModel postModePageViewModel = (PostModePageViewModel) viewTreeObserverOnGlobalLayoutListenerC738820SyW.l2;
                int lineEnd = layout.getLineEnd(layout.getLineForVertical(i));
                int i2 = postModePageViewModel.LLLILZ;
                if (lineEnd < i2) {
                    lineEnd = i2;
                }
                postModePageViewModel.LLLILZ = lineEnd;
            }
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC738820SyW(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
