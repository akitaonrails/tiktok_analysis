package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0S0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714400S0o extends C21599719g3 {
    public Aweme LLLLZI;
    public ViewParent LLLLZIL;
    public float LLLLZLL;
    public float LLLLZLLIL;
    public VideoViewCell LLLLZLLLI;
    public final int LLLZ;
    public final C01GW LLLZI;

    public C714400S0o() {
        throw null;
    }

    private final HomeTabAbility getHomeTabAbility() {
        return (HomeTabAbility) this.LLLZI.getValue();
    }

    public final Aweme getAweme() {
        return this.LLLLZI;
    }

    public final float getDownX() {
        return this.LLLLZLL;
    }

    public final float getDownY() {
        return this.LLLLZLLIL;
    }

    public final ViewParent getRealParent() {
        return this.LLLLZIL;
    }

    @Override // X.C21600219g8, android.view.View
    public final boolean canScrollHorizontally(int i) {
        HomeTabAbility homeTabAbility = getHomeTabAbility();
        if (homeTabAbility != null && homeTabAbility.qM1() && C0S1A.LIZIZ()) {
            boolean zLIZLLL = C426750GoL.LIZLLL(getContext());
            if (!C0S1A.LIZ(this.LLLLZLL, this.LLLZ, zLIZLLL)) {
                return false;
            }
            return super.canScrollHorizontally(i);
        }
        return super.canScrollHorizontally(i);
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        C0SUL c0sul;
        VideoViewCell videoViewCell = this.LLLLZLLLI;
        if (videoViewCell != null && (c0sul = videoViewCell.LLLJL) != null) {
            c0sul.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLLLZLL = motionEvent.getRawX();
                this.LLLLZLLIL = motionEvent.getRawY();
                C1440005kM.LIZ(new C714410S0p(EnumC714390S0n.ACTION_DOWN));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onTouchEvent: ACTION_DOWN x = ");
                sbLIZ.append(motionEvent.getX());
                C2188811AlT.LIZIZ(sbLIZ);
            } else if (numValueOf.intValue() == 2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onTouchEvent: ACTION_MOVE x = ");
                sbLIZ2.append(motionEvent.getX());
                C2188811AlT.LIZIZ(sbLIZ2);
            } else if (numValueOf.intValue() == 1) {
                C1440005kM.LIZ(new C714410S0p(EnumC714390S0n.ACTION_UP));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onTouchEvent: ACTION_UP x = ");
                sbLIZ3.append(motionEvent.getX());
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAweme(Aweme aweme) {
        this.LLLLZI = aweme;
    }

    public final void setDownX(float f) {
        this.LLLLZLL = f;
    }

    public final void setDownY(float f) {
        this.LLLLZLLIL = f;
    }

    public final void setRealParent(ViewParent viewParent) {
        this.LLLLZIL = viewParent;
    }

    public C714400S0o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLZ = C497820Jfg.LIZIZ(context);
        this.LLLZI = C452501pT.LIZIZ(new AwS551S0100000_7(context, 182));
    }
}
