package Y;

import X.C0HZQ;
import X.C0I0B;
import X.C0IJT;
import X.C0JG1;
import X.C13LZ;
import X.C1400340mXo;
import X.C15P7;
import X.C16AR;
import X.C20618815mE;
import X.C20687915xN;
import X.C20750816Hy;
import X.C474500IjA;
import X.EnumC19358210oO;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import com.bytedance.android.livesdk.TryModeSheetBaseFragment;
import com.bytedance.android.livesdk.dataChannel.DialogMotionEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.fragment.EditShareSelectFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public class ATListenerS463S0100000_31 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS463S0100000_31(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS463S0100000_31 aTListenerS463S0100000_31, View view, MotionEvent motionEvent) {
        TryModeSheetBaseFragment tryModeSheetBaseFragment = (TryModeSheetBaseFragment) aTListenerS463S0100000_31.l0;
        tryModeSheetBaseFragment.getClass();
        if ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && System.currentTimeMillis() - tryModeSheetBaseFragment.LLJLLL >= 1000) {
            DataChannel dataChannel = tryModeSheetBaseFragment.LLJZ;
            if (dataChannel != null) {
                dataChannel.FQ2(DialogMotionEvent.class);
            }
            tryModeSheetBaseFragment.LLJLLL = System.currentTimeMillis();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS463S0100000_31 aTListenerS463S0100000_31, View view, MotionEvent motionEvent) {
        return ((GestureDetector) aTListenerS463S0100000_31.l0).onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$2(ATListenerS463S0100000_31 aTListenerS463S0100000_31, View view, MotionEvent motionEvent) {
        ((C16AR) aTListenerS463S0100000_31.l0).dismiss();
        return false;
    }

    public static final boolean onTouch$3(ATListenerS463S0100000_31 aTListenerS463S0100000_31, View view, MotionEvent motionEvent) {
        int friendCount;
        if (motionEvent.getActionMasked() == 0) {
            User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
            if (currentUser != null) {
                friendCount = currentUser.getFriendCount();
            } else {
                friendCount = 0;
            }
            C20618815mE.LIZJ(((EditShareSelectFragment) aTListenerS463S0100000_31.l0).SR().LLJI, EnumC19358210oO.CLICK_ON_SEARCH_BAR, ((EditShareSelectFragment) aTListenerS463S0100000_31.l0).SR().LLJ, ((EditShareSelectFragment) aTListenerS463S0100000_31.l0).SR().LLJIJIL, friendCount, ((EditShareSelectFragment) aTListenerS463S0100000_31.l0).SR().getState().LL.size(), null, ((EditShareSelectFragment) aTListenerS463S0100000_31.l0).LLJJIJIIJIL, 320);
        }
        return false;
    }

    public static final boolean onTouch$4(ATListenerS463S0100000_31 aTListenerS463S0100000_31, View view, MotionEvent motionEvent) {
        View view2;
        C15P7 c15p7 = (C15P7) aTListenerS463S0100000_31.l0;
        c15p7.getClass();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    Object parent = c15p7.getParent();
                    if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
                        float width = view2.getWidth() - c15p7.getWidth();
                        if (width < 0.0f) {
                            width = 0.0f;
                        }
                        float height = view2.getHeight() - c15p7.getHeight();
                        if (height < 0.0f) {
                            height = 0.0f;
                        }
                        float fLIZLLL = C13LZ.LIZLLL(motionEvent.getRawX() + c15p7.LLJILJILJ, 0.0f, width);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c15p7);
                        c15p7.setX(fLIZLLL);
                        float fLIZLLL2 = C13LZ.LIZLLL(motionEvent.getRawY() + c15p7.LLJILLL, 0.0f, height);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c15p7);
                        c15p7.setY(fLIZLLL2);
                        c15p7.LLJJ = true;
                        c15p7.LLJJI = true;
                        return true;
                    }
                    return true;
                }
            }
            ViewParent parent2 = c15p7.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            if (c15p7.LLJJ) {
                c15p7.LLJJ = false;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cohost_subtitle_move");
                C0JG1.LIZ(c474500IjALIZ);
                c474500IjALIZ.LIZ();
                return true;
            }
            return true;
        }
        c15p7.LLJILJILJ = c15p7.getX() - motionEvent.getRawX();
        c15p7.LLJILLL = c15p7.getY() - motionEvent.getRawY();
        c15p7.LLJJ = false;
        ViewParent parent3 = c15p7.getParent();
        if (parent3 != null) {
            parent3.requestDisallowInterceptTouchEvent(true);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$5(ATListenerS463S0100000_31 aTListenerS463S0100000_31, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                C20687915xN c20687915xN = (C20687915xN) aTListenerS463S0100000_31.l0;
                c20687915xN.getClass();
                c20687915xN.LIZ(AFwS221S0000000_31.get$arr$(129));
                c20687915xN.LIZIZ.clearAnimation();
                return false;
            }
            return false;
        }
        C20687915xN c20687915xN2 = (C20687915xN) aTListenerS463S0100000_31.l0;
        c20687915xN2.getClass();
        c20687915xN2.LIZIZ(AFwS221S0000000_31.get$arr$(130));
        c20687915xN2.LIZIZ.startAnimation(AnimationUtils.loadAnimation(c20687915xN2.LIZ, R.anim.bx));
        return false;
    }

    public static final boolean onTouch$6(ATListenerS463S0100000_31 aTListenerS463S0100000_31, View view, MotionEvent motionEvent) {
        boolean zIsChecked;
        if (motionEvent.getAction() == 0) {
            C0HZQ c0hzq = ((CutMusicPanel) aTListenerS463S0100000_31.l0).LLLIZZ;
            if (c0hzq != null) {
                zIsChecked = c0hzq.isChecked();
            } else {
                zIsChecked = false;
            }
            Function1<? super Boolean, Unit> function1 = ((CutMusicPanel) aTListenerS463S0100000_31.l0).LLLLILI;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(!zIsChecked));
            }
        }
        return false;
    }

    public static final boolean onTouch$7(ATListenerS463S0100000_31 aTListenerS463S0100000_31, View view, MotionEvent motionEvent) {
        StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment = (StoryThoughtAvatarCreationFragment) aTListenerS463S0100000_31.l0;
        if (storyThoughtAvatarCreationFragment.LLJ == null) {
            storyThoughtAvatarCreationFragment.getClass();
            storyThoughtAvatarCreationFragment.LLJ = new GestureDetector(storyThoughtAvatarCreationFragment.getContext(), new C20750816Hy(storyThoughtAvatarCreationFragment, 2));
        }
        GestureDetector gestureDetector = ((StoryThoughtAvatarCreationFragment) aTListenerS463S0100000_31.l0).LLJ;
        if (gestureDetector == null || !gestureDetector.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
