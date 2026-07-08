package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.LandscapeFeedAutoPlayAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandScapeFeedIntroAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

/* JADX INFO: renamed from: X.0RFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ViewOnTouchListenerC692790RFl implements View.OnTouchListener {
    public final C425650GmZ LL;
    public final C692720RFe LLILLJJLI;
    public final C692780RFk LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final GestureDetector LLILZLL;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C2189821An6 c2189821An6;
        C0RJN c0rjnLIZIZ;
        ViewParent parent;
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.LLILZIL = false;
            this.LLILZ = false;
            this.LL.LIZ(motionEvent, this.LLILLJJLI);
            this.LLILZLL.onTouchEvent(motionEvent);
        } else if (motionEvent.getAction() == 2) {
            if (this.LLILZIL) {
                this.LL.LIZ(motionEvent, this.LLILLJJLI);
            } else if (!this.LLILZ) {
                if (this.LL.LIZ(motionEvent, this.LLILLJJLI)) {
                    this.LLILZIL = true;
                } else {
                    this.LLILZLL.onTouchEvent(motionEvent);
                }
            }
            if ((this.LLILZIL || this.LLILZ) && view != null && (parent = view.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.LLILZ) {
                LandscapeVideoViewCell landscapeVideoViewCell = this.LLILLL.LL;
                landscapeVideoViewCell.getClass();
                if (C692810RFn.LIZ && landscapeVideoViewCell.LLLLLLZZ()) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - landscapeVideoViewCell.LLLLLZL;
                    C586360MzC c586360MzC = C586360MzC.LIZ;
                    Aweme aweme = landscapeVideoViewCell.LLJJ;
                    BaseFeedPageParams baseFeedPageParams = landscapeVideoViewCell.LLLLLLZ;
                    if (baseFeedPageParams == null) {
                        baseFeedPageParams = null;
                    }
                    String str = baseFeedPageParams.eventType;
                    float f = landscapeVideoViewCell.LLLLLZIL;
                    Context context = landscapeVideoViewCell.LLLII;
                    Fragment fragment = landscapeVideoViewCell.LLJJIII;
                    if (fragment != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment)) != null) {
                        c2189821An6 = c0rjnLIZIZ.LIZJ;
                    } else {
                        c2189821An6 = null;
                    }
                    c586360MzC.getClass();
                    C586360MzC.LIZ(aweme, str, "long_press", 2.0f, f, context, jElapsedRealtime, c2189821An6);
                    C421520Gfu c421520Gfu = landscapeVideoViewCell.LLLLJI;
                    if (c421520Gfu != null) {
                        c421520Gfu.LIZLLL();
                    }
                    C1483410ohn.LJLJJI().setSpeed(landscapeVideoViewCell.LLLLLZIL);
                    if (C692480REg.LIZ()) {
                        LandscapeFeedAutoPlayAbility landscapeFeedAutoPlayAbility = (LandscapeFeedAutoPlayAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(landscapeVideoViewCell), LandscapeFeedAutoPlayAbility.class, null);
                        if (landscapeFeedAutoPlayAbility != null) {
                            landscapeFeedAutoPlayAbility.ic1();
                        }
                        LandScapeFeedIntroAbility landScapeFeedIntroAbility = (LandScapeFeedIntroAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(landscapeVideoViewCell), LandScapeFeedIntroAbility.class, null);
                        if (landScapeFeedIntroAbility != null) {
                            landScapeFeedIntroAbility.iI();
                        }
                    }
                }
            } else if (this.LLILZIL) {
                this.LL.LIZ(motionEvent, this.LLILLJJLI);
            }
            this.LLILZLL.onTouchEvent(motionEvent);
            return true;
        }
        return true;
    }

    public ViewOnTouchListenerC692790RFl(C425650GmZ c425650GmZ, C692720RFe c692720RFe, C692780RFk c692780RFk) {
        this.LL = c425650GmZ;
        this.LLILLJJLI = c692720RFe;
        this.LLILLL = c692780RFk;
        this.LLILZLL = new GestureDetector(c425650GmZ.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.0RFm
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                ViewOnTouchListenerC692790RFl viewOnTouchListenerC692790RFl = this.LL;
                if (!viewOnTouchListenerC692790RFl.LLILZ && !viewOnTouchListenerC692790RFl.LLILZIL) {
                    return viewOnTouchListenerC692790RFl.LLILLL.onDoubleTap(motionEvent);
                }
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                ViewOnTouchListenerC692790RFl viewOnTouchListenerC692790RFl = this.LL;
                if (viewOnTouchListenerC692790RFl.LLILZIL) {
                    return;
                }
                viewOnTouchListenerC692790RFl.LLILZ = true;
                viewOnTouchListenerC692790RFl.LLILLL.onLongPress(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                ViewOnTouchListenerC692790RFl viewOnTouchListenerC692790RFl = this.LL;
                if (!viewOnTouchListenerC692790RFl.LLILZ && !viewOnTouchListenerC692790RFl.LLILZIL) {
                    return viewOnTouchListenerC692790RFl.LLILLL.onSingleTapConfirmed(motionEvent);
                }
                return false;
            }
        });
    }
}
