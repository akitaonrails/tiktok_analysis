package Y;

import X.C2212201Bi6;
import X.C2212931BjH;
import X.InterfaceC689540R2y;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectAssem;

/* JADX INFO: loaded from: classes31.dex */
public class ATListenerS349S0200000_30 implements View.OnTouchListener {
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

    /* JADX WARN: Multi-variable type inference failed */
    public ATListenerS349S0200000_30(Object obj, TakoMultipleSelectAssem<InterfaceC689540R2y> takoMultipleSelectAssem, InterfaceC689540R2y interfaceC689540R2y) {
        this.$t = interfaceC689540R2y;
        this.l0 = obj;
        this.l1 = takoMultipleSelectAssem;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$0(Y.ATListenerS349S0200000_30 r20, android.view.View r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS349S0200000_30.onTouch$0(Y.ATListenerS349S0200000_30, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$1(ATListenerS349S0200000_30 aTListenerS349S0200000_30, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ((C2212931BjH) aTListenerS349S0200000_30.l1).LIZJ((C2212201Bi6) aTListenerS349S0200000_30.l0, motionEvent.getRawX(), motionEvent.getRawY());
        }
        return true;
    }
}
