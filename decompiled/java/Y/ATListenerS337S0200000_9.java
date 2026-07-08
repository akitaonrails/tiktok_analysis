package Y;

import X.C0OWY;
import X.C0P0T;
import X.C118300cf;
import X.C1308910kAL;
import X.C1623706Xj;
import X.C259800zU;
import X.C636490Oxr;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.AnimatorSet;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentSheetCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class ATListenerS337S0200000_9 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return false;
        }
    }

    public ATListenerS337S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS337S0200000_9 aTListenerS337S0200000_9, View view, MotionEvent motionEvent) {
        if (Intrinsics.LJFF(view, (ViewOnAttachStateChangeListenerC20604515jv) aTListenerS337S0200000_9.l0) && ((GestureDetector) aTListenerS337S0200000_9.l1).onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS337S0200000_9 aTListenerS337S0200000_9, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    BulletinCommentSheetCell bulletinCommentSheetCell = (BulletinCommentSheetCell) aTListenerS337S0200000_9.l0;
                    if (bulletinCommentSheetCell.LLIZ) {
                        bulletinCommentSheetCell.P5();
                    }
                }
            } else {
                BulletinCommentSheetCell bulletinCommentSheetCell2 = (BulletinCommentSheetCell) aTListenerS337S0200000_9.l0;
                if (bulletinCommentSheetCell2.LLIZ) {
                    bulletinCommentSheetCell2.LLIZ = false;
                    if (!bulletinCommentSheetCell2.LLILZLL) {
                        bulletinCommentSheetCell2.N5();
                        return true;
                    }
                }
            }
        } else {
            BulletinCommentSheetCell bulletinCommentSheetCell3 = (BulletinCommentSheetCell) aTListenerS337S0200000_9.l0;
            if (!bulletinCommentSheetCell3.LLILZLL && !(((C0OWY) ((AssemViewModel) bulletinCommentSheetCell3.LLJI.getValue()).getState()).LL instanceof C1623706Xj)) {
                ((BulletinCommentSheetCell) aTListenerS337S0200000_9.l0).LLIZ = true;
                if (Intrinsics.LJFF((Boolean) aTListenerS337S0200000_9.l1, Boolean.TRUE)) {
                    AnimatorSet animatorSet = ((BulletinCommentSheetCell) aTListenerS337S0200000_9.l0).LLILLJJLI;
                    if (animatorSet != null) {
                        animatorSet.start();
                        return true;
                    }
                } else {
                    AnimatorSet animatorSet2 = ((BulletinCommentSheetCell) aTListenerS337S0200000_9.l0).LLILLL;
                    if (animatorSet2 != null) {
                        animatorSet2.start();
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean onTouch$2(ATListenerS337S0200000_9 aTListenerS337S0200000_9, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((C118300cf) aTListenerS337S0200000_9.l0).element = 2;
            ((C0P0T) aTListenerS337S0200000_9.l1).dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, android.graphics.drawable.Drawable] */
    public static final boolean onTouch$3(ATListenerS337S0200000_9 aTListenerS337S0200000_9, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                view.setBackground((Drawable) ((C259800zU) aTListenerS337S0200000_9.l0).element);
            }
        } else {
            ((C259800zU) aTListenerS337S0200000_9.l0).element = view.getBackground();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view.getContext());
            if (numLIZJ != null) {
                view.setBackground(new ColorDrawable(numLIZJ.intValue()));
            }
        }
        ((C636490Oxr) ((BulletinCommentSheetCell) aTListenerS337S0200000_9.l1).LLJIJIL.getValue()).LIZIZ(motionEvent);
        return true;
    }
}
