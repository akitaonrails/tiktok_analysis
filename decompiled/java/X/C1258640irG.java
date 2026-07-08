package X;

import Y.ARunnableS119S0100000_19;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.profile.business.profile.tab.MTAwemeListFragment;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;

/* JADX INFO: renamed from: X.0irG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258640irG implements InterfaceC21676019sM {
    public float LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final UserProfileAbility LLILZIL;
    public final int LLILZLL;
    public final GestureDetector LLIZ;
    public final /* synthetic */ MTAwemeListFragment LLIZLLLIL;

    @Override // X.InterfaceC21676019sM
    public final void LJIIZILJ(boolean z) {
    }

    public C1258640irG(MTAwemeListFragment mTAwemeListFragment) {
        int scaledTouchSlop;
        this.LLIZLLLIL = mTAwemeListFragment;
        this.LLILZIL = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(mTAwemeListFragment.getParentFragment(), null), UserProfileAbility.class, null);
        if (mTAwemeListFragment.LLJJIJI.getContext() != null) {
            scaledTouchSlop = ViewConfiguration.get(mTAwemeListFragment.LLJJIJI.getContext()).getScaledTouchSlop();
        } else {
            scaledTouchSlop = 10;
        }
        this.LLILZLL = scaledTouchSlop;
        this.LLIZ = new GestureDetector(mTAwemeListFragment.LLJJIJI.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.0irI
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                UserProfileAbility userProfileAbility;
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFling: vY=");
                sbLIZ.append(f2);
                sbLIZ.append(", hasTriggeredFlingLoad:");
                sbLIZ.append(this.LL.LLILZ);
                sbLIZ.append(", hasMoreUp:");
                sbLIZ.append(this.LL.LLIZLLLIL.D);
                C2188811AlT.LIZIZ(sbLIZ);
                float scaledMinimumFlingVelocity = ViewConfiguration.get(this.LL.LLIZLLLIL.LLJJIJI.getContext()).getScaledMinimumFlingVelocity();
                if (f2 > 0.0f) {
                    C1258640irG c1258640irG = this.LL;
                    if (c1258640irG.LLIZLLLIL.D && !c1258640irG.LLILZ && Math.abs(f2) >= scaledMinimumFlingVelocity && (userProfileAbility = this.LL.LLILZIL) != null && userProfileAbility.Zp() != null && this.LL.LLILZIL.Zp().LIZLLL()) {
                        int iComputeVerticalScrollOffset = this.LL.LLIZLLLIL.LLJJIJI.computeVerticalScrollOffset();
                        float fAbs = Math.abs(((int) f2) * 0.44f);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onFling: distanceToTopPx=");
                        sbLIZ2.append(iComputeVerticalScrollOffset);
                        sbLIZ2.append(", predictedDistance=");
                        sbLIZ2.append(fAbs);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (fAbs + 30.0f >= iComputeVerticalScrollOffset) {
                            C1720106oR.LJI("MTAwemeListFragment", "onFling. invoke load more up");
                            C1258640irG c1258640irG2 = this.LL;
                            c1258640irG2.LLILZ = true;
                            c1258640irG2.LLIZLLLIL.OU();
                            this.LL.LLIZLLLIL.iT(-358032022, 18, "load_latest_fling");
                            return true;
                        }
                    }
                }
                return false;
            }
        });
    }

    @Override // X.InterfaceC21676019sM
    public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return;
        }
        if (motionEvent.getY() - this.LL > this.LLILZLL * 2) {
            this.LLIZLLLIL.iT(-358032022, 18, "load_latest_scroll_dragging");
        } else {
            C1259360isQ c1259360isQ = this.LLIZLLLIL.LLJJJ;
            if (c1259360isQ.LLJILJILJ && c1259360isQ.LLILLL != null) {
                HandlerHook.viewPost(c1259360isQ.LLILLL, new ARunnableS119S0100000_19(c1259360isQ, 203));
            }
        }
        UserProfileAbility userProfileAbility = this.LLILZIL;
        if (userProfileAbility != null && userProfileAbility.Zp() != null) {
            this.LLILZIL.Zp().LJFF(false);
        }
        this.LLILLJJLI = false;
        this.LLILLL = false;
    }

    @Override // X.InterfaceC21676019sM
    public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
        UserProfileAbility userProfileAbility;
        int actionMasked = motionEvent.getActionMasked();
        this.LLIZ.onTouchEvent(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                float y = motionEvent.getY() - this.LL;
                if (!this.LLILLJJLI && y > this.LLILZLL && !recyclerView.canScrollVertically(-1) && this.LLIZLLLIL.D && (userProfileAbility = this.LLILZIL) != null && userProfileAbility.Zp() != null && this.LLILZIL.Zp().LIZLLL()) {
                    this.LLILLJJLI = true;
                    this.LLIZLLLIL.OU();
                    return true;
                }
            }
        } else {
            this.LL = motionEvent.getY();
            this.LLILLJJLI = false;
            this.LLILLL = false;
            this.LLILZ = false;
            UserProfileAbility userProfileAbility2 = this.LLILZIL;
            if (userProfileAbility2 != null && userProfileAbility2.Zp() != null && this.LLIZLLLIL.D && this.LLILZIL.Zp().LIZLLL() && !this.LLILLL) {
                this.LLILZIL.Zp().LJFF(true);
                this.LLILLL = true;
            }
        }
        return false;
    }
}
