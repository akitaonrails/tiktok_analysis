package Y;

import X.C20731516An;
import X.C21688219uK;
import X.C488430JDl;
import X.C488440JDm;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.MultiTopLivePlayFeedAssemV2;

/* JADX INFO: loaded from: classes8.dex */
public class ATListenerS336S0200000_7 implements View.OnTouchListener {
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
            default:
                return false;
        }
    }

    public ATListenerS336S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS336S0200000_7 aTListenerS336S0200000_7, View view, MotionEvent motionEvent) {
        C21688219uK c21688219uK;
        if (motionEvent.getAction() == 0 && (c21688219uK = ((C488430JDl) aTListenerS336S0200000_7.l0).LLILLJJLI) != null) {
            c21688219uK.LJIILLIIL((C488440JDm) aTListenerS336S0200000_7.l1);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS336S0200000_7 aTListenerS336S0200000_7, View view, MotionEvent motionEvent) {
        C20731516An c20731516An;
        int action = motionEvent.getAction();
        if ((action != 1 && action != 3) || ((ViewOnAttachStateChangeListenerC20604515jv) aTListenerS336S0200000_7.l0).getTranslationY() == 0.0f || ((MultiTopLivePlayFeedAssemV2) aTListenerS336S0200000_7.l1).Zo().LLLFF || (c20731516An = ((MultiTopLivePlayFeedAssemV2) aTListenerS336S0200000_7.l1).LLLFFI) == null) {
            return false;
        }
        c20731516An.LIZIZ(0);
        return false;
    }
}
