package Y;

import X.C1398200mUM;
import X.C1402410mb9;
import X.C1558520qew;
import X.InterfaceC1398220mUO;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentMentionAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.RefactorKeyboardPanelV2;
import com.ss.android.ugc.aweme.commentv2.actionbar.CommentPageActionBarAssem;

/* JADX INFO: loaded from: classes22.dex */
public class ATListenerS343S0200000_21 implements View.OnTouchListener {
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

    public ATListenerS343S0200000_21(RefactorKeyboardPanelV2 refactorKeyboardPanelV2, int i) {
        this.$t = i;
        this.l1 = refactorKeyboardPanelV2;
        this.l0 = new GestureDetector(refactorKeyboardPanelV2.getContext(), new C1402410mb9(refactorKeyboardPanelV2, 0));
    }

    public ATListenerS343S0200000_21(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS343S0200000_21 aTListenerS343S0200000_21, View view, MotionEvent motionEvent) {
        ((GestureDetector) aTListenerS343S0200000_21.l0).onTouchEvent(motionEvent);
        TuxTextView tuxTextView = ((CommentPageActionBarAssem) aTListenerS343S0200000_21.l1).LLJJJ;
        if (tuxTextView != null) {
            tuxTextView.performClick();
            return true;
        }
        return true;
    }

    public static final boolean onTouch$1(ATListenerS343S0200000_21 aTListenerS343S0200000_21, View view, MotionEvent motionEvent) {
        ((GestureDetector) aTListenerS343S0200000_21.l0).onTouchEvent(motionEvent);
        TuxIconView tuxIconView = ((CommentPageActionBarAssem) aTListenerS343S0200000_21.l1).LLJJJJ;
        if (tuxIconView != null) {
            tuxIconView.performClick();
            return true;
        }
        return true;
    }

    public static final boolean onTouch$2(ATListenerS343S0200000_21 aTListenerS343S0200000_21, View view, MotionEvent motionEvent) {
        C1398200mUM c1398200mUM;
        InterfaceC1398220mUO interfaceC1398220mUO;
        if (motionEvent.getAction() == 0 && (interfaceC1398220mUO = (c1398200mUM = (C1398200mUM) aTListenerS343S0200000_21.l0).LLLI) != null) {
            interfaceC1398220mUO.onClickTopDesc(c1398200mUM.LL, (View) aTListenerS343S0200000_21.l1);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$3(ATListenerS343S0200000_21 aTListenerS343S0200000_21, View view, MotionEvent motionEvent) {
        ICommentMentionAssemAbility iCommentMentionAssemAbility = (ICommentMentionAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL((RefactorKeyboardPanelV2) aTListenerS343S0200000_21.l1), ICommentMentionAssemAbility.class, null);
        if (motionEvent != null) {
            ((GestureDetector) aTListenerS343S0200000_21.l0).onTouchEvent(motionEvent);
        }
        if (iCommentMentionAssemAbility != null && iCommentMentionAssemAbility.f40()) {
            return true;
        }
        return false;
    }
}
