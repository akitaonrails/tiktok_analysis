package Y;

import X.C0QSJ;
import X.C1558520qew;
import X.C259800zU;
import X.C287610BPb;
import X.C458160Hxu;
import X.C458720Hyo;
import X.C458790Hyv;
import X.C458840Hz0;
import X.C687700QyG;
import X.C817403Hg;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.GPSPermissionCell;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomPanelKnob;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.longclick.IInboxLongPressMenuPopoverHelperImpl;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class ATListenerS98S0400000_6 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            default:
                return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v127, types: [T, android.view.VelocityTracker] */
    /* JADX WARN: Type inference failed for: r0v48, types: [T, X.0Hz0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.0Hz0] */
    public static final boolean onTouch$0(ATListenerS98S0400000_6 aTListenerS98S0400000_6, View view, MotionEvent motionEvent) {
        Object ability;
        RecyclerView recyclerViewLLII;
        float yVelocity;
        view.getParent().requestDisallowInterceptTouchEvent(true);
        C259800zU c259800zU = (C259800zU) aTListenerS98S0400000_6.l0;
        if (c259800zU.element == 0) {
            c259800zU.element = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = (VelocityTracker) ((C259800zU) aTListenerS98S0400000_6.l0).element;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int action = motionEvent.getAction();
        int height = 0;
        Object obj = null;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return true;
                    }
                } else {
                    C458840Hz0 c458840Hz0 = (C458840Hz0) ((C259800zU) aTListenerS98S0400000_6.l2).element;
                    if (c458840Hz0 == null) {
                        return false;
                    }
                    int iIntValue = (int) (((Number) ((ChatroomPanelKnob) aTListenerS98S0400000_6.l1).kp().LLJ.getValue()).intValue() - (motionEvent.getRawY() - ((C817403Hg) aTListenerS98S0400000_6.l3).element));
                    PanelStateViewModel panelStateViewModelKp = ((ChatroomPanelKnob) aTListenerS98S0400000_6.l1).kp();
                    C458790Hyv c458790Hyv = C458790Hyv.LL;
                    int i = c458840Hz0.LIZIZ;
                    if (iIntValue >= i) {
                        iIntValue = i;
                    } else {
                        int i2 = c458840Hz0.LIZ;
                        if (iIntValue <= i2) {
                            iIntValue = i2;
                        }
                    }
                    panelStateViewModelKp.vQ2(c458790Hyv, iIntValue);
                    ((C817403Hg) aTListenerS98S0400000_6.l3).element = motionEvent.getRawY();
                    return true;
                }
            }
            VelocityTracker velocityTracker2 = (VelocityTracker) ((C259800zU) aTListenerS98S0400000_6.l0).element;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
            }
            VelocityTracker velocityTracker3 = (VelocityTracker) ((C259800zU) aTListenerS98S0400000_6.l0).element;
            if (velocityTracker3 != null) {
                yVelocity = velocityTracker3.getYVelocity();
            } else {
                yVelocity = 0.0f;
            }
            C458840Hz0 c458840Hz02 = (C458840Hz0) ((C259800zU) aTListenerS98S0400000_6.l2).element;
            if (c458840Hz02 == null) {
                PanelStateViewModel panelStateViewModelKp2 = ((ChatroomPanelKnob) aTListenerS98S0400000_6.l1).kp();
                panelStateViewModelKp2.jt(C458790Hyv.LL, panelStateViewModelKp2.Ke().getValue().intValue());
            } else if (yVelocity < -500.0f) {
                ((ChatroomPanelKnob) aTListenerS98S0400000_6.l1).kp().jt(C458790Hyv.LL, c458840Hz02.LIZIZ);
            } else if (yVelocity > 500.0f) {
                PanelStateViewModel panelStateViewModelKp3 = ((ChatroomPanelKnob) aTListenerS98S0400000_6.l1).kp();
                panelStateViewModelKp3.jt(C458790Hyv.LL, panelStateViewModelKp3.Ke().getValue().intValue());
                ((C259800zU) aTListenerS98S0400000_6.l2).element = null;
            } else if (((Number) ((ChatroomPanelKnob) aTListenerS98S0400000_6.l1).kp().LLJ.getValue()).intValue() < c458840Hz02.LIZJ) {
                PanelStateViewModel panelStateViewModelKp4 = ((ChatroomPanelKnob) aTListenerS98S0400000_6.l1).kp();
                panelStateViewModelKp4.jt(C458790Hyv.LL, panelStateViewModelKp4.Ke().getValue().intValue());
                ((C259800zU) aTListenerS98S0400000_6.l2).element = null;
            } else {
                ((ChatroomPanelKnob) aTListenerS98S0400000_6.l1).kp().jt(C458790Hyv.LL, c458840Hz02.LIZIZ);
                if (C287610BPb.LIZ()) {
                    ((C259800zU) aTListenerS98S0400000_6.l2).element = null;
                }
            }
            VelocityTracker velocityTracker4 = (VelocityTracker) ((C259800zU) aTListenerS98S0400000_6.l0).element;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
            }
            ((C259800zU) aTListenerS98S0400000_6.l0).element = null;
            return true;
        }
        if (C287610BPb.LIZ()) {
            C458160Hxu state = ((ChatroomPanelKnob) aTListenerS98S0400000_6.l1).ip().getState();
            int iHp = ((ChatroomPanelKnob) aTListenerS98S0400000_6.l1).hp(state.LL, state.LLILLJJLI);
            ((C259800zU) aTListenerS98S0400000_6.l2).element = new C458840Hz0(Math.min(C458720Hyo.LIZ(((Number) ((ChatroomPanelKnob) aTListenerS98S0400000_6.l1).kp().LLIZLLLIL.getValue()).intValue()), iHp), iHp);
        } else if (((C259800zU) aTListenerS98S0400000_6.l2).element == 0) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL((ChatroomPanelKnob) aTListenerS98S0400000_6.l1), ChatRoomScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(MessagePowerListAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof MessagePowerListAbility) {
                obj = ability;
            }
            MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) obj;
            if (messagePowerListAbility != null && (recyclerViewLLII = messagePowerListAbility.LLII()) != null) {
                height = recyclerViewLLII.getHeight();
            }
            int i3 = C458720Hyo.LIZ;
            int iLIZ = C458720Hyo.LIZ(((Number) ((ChatroomPanelKnob) aTListenerS98S0400000_6.l1).kp().LLIZLLLIL.getValue()).intValue());
            ((C259800zU) aTListenerS98S0400000_6.l2).element = new C458840Hz0(iLIZ, Math.min((int) (((double) ((ChatroomPanelKnob) aTListenerS98S0400000_6.l1).ip().getState().LL) * 0.68d), height + iLIZ));
        }
        ((C817403Hg) aTListenerS98S0400000_6.l3).element = motionEvent.getRawY();
        return true;
    }

    public static final boolean onTouch$1(ATListenerS98S0400000_6 aTListenerS98S0400000_6, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            IInboxLongPressMenuPopoverHelperImpl iInboxLongPressMenuPopoverHelperImpl = (IInboxLongPressMenuPopoverHelperImpl) aTListenerS98S0400000_6.l0;
            View view2 = (View) aTListenerS98S0400000_6.l1;
            ImageView imageView = (ImageView) aTListenerS98S0400000_6.l2;
            ViewGroup viewGroup = (ViewGroup) aTListenerS98S0400000_6.l3;
            iInboxLongPressMenuPopoverHelperImpl.getClass();
            IInboxLongPressMenuPopoverHelperImpl.LIZIZ(view2, imageView, viewGroup, false);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$2(ATListenerS98S0400000_6 aTListenerS98S0400000_6, View view, MotionEvent motionEvent) {
        GPSPermissionCell gPSPermissionCell = (GPSPermissionCell) aTListenerS98S0400000_6.l0;
        Context context = (Context) aTListenerS98S0400000_6.l1;
        ConstraintLayout constraintLayout = (ConstraintLayout) aTListenerS98S0400000_6.l2;
        Function0 function0 = (Function0) aTListenerS98S0400000_6.l3;
        gPSPermissionCell.getClass();
        GPSPermissionCell.I5(context, constraintLayout, motionEvent, function0);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ATListenerS98S0400000_6(Object obj, GPSPermissionCell gPSPermissionCell, Context context, ConstraintLayout constraintLayout, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.l1 = gPSPermissionCell;
        this.l2 = context;
        this.l3 = constraintLayout;
    }
}
