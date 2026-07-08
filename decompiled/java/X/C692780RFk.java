package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.LandscapeFeedAutoPlayAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandScapeFeedIntroAbility;

/* JADX INFO: renamed from: X.0RFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692780RFk extends C21648719nx {
    public final LandscapeVideoViewCell LL;
    public final C0R9L LLILLJJLI;

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.LLILLJJLI.handleDoubleClick(motionEvent);
        return super.onDoubleTap(motionEvent);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        LandscapeVideoViewCell landscapeVideoViewCell = this.LL;
        landscapeVideoViewCell.getClass();
        if (C692810RFn.LIZ && landscapeVideoViewCell.LLLLLLZZ()) {
            landscapeVideoViewCell.LJJIFFI(true);
            landscapeVideoViewCell.LLLLLZL = SystemClock.elapsedRealtime();
            C421520Gfu c421520Gfu = landscapeVideoViewCell.LLLLJI;
            if (c421520Gfu != null) {
                c421520Gfu.LIZJ();
            }
            landscapeVideoViewCell.LLLLLZIL = C1483410ohn.LJLJJI().getSpeed();
            C1483410ohn.LJLJJI().setSpeed(2.0f);
            if (C692480REg.LIZ()) {
                LandscapeFeedAutoPlayAbility landscapeFeedAutoPlayAbility = (LandscapeFeedAutoPlayAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(landscapeVideoViewCell), LandscapeFeedAutoPlayAbility.class, null);
                if (landscapeFeedAutoPlayAbility != null) {
                    landscapeFeedAutoPlayAbility.Yu1();
                }
                LandScapeFeedIntroAbility landScapeFeedIntroAbility = (LandScapeFeedIntroAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(landscapeVideoViewCell), LandScapeFeedIntroAbility.class, null);
                if (landScapeFeedIntroAbility != null) {
                    landScapeFeedIntroAbility.FV0();
                }
            }
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        LandscapeVideoViewCell landscapeVideoViewCell = this.LL;
        if (landscapeVideoViewCell.LLLIIIIL) {
            landscapeVideoViewCell.LJJIFFI(false);
        } else if (landscapeVideoViewCell.o1()) {
            this.LL.LJJIFFI(false);
        } else {
            this.LL.LJJIFFI(true);
        }
        return onSingleTapUp(motionEvent);
    }

    public C692780RFk(LandscapeVideoViewCell landscapeVideoViewCell, C0R9L c0r9l) {
        this.LL = landscapeVideoViewCell;
        this.LLILLJJLI = c0r9l;
    }
}
