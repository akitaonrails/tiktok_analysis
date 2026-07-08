package Y;

import X.C1126410fPz;
import X.C1149290g0t;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes18.dex */
public class ATListenerS341S0200000_17 implements View.OnTouchListener {
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

    public ATListenerS341S0200000_17(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS341S0200000_17 aTListenerS341S0200000_17, View view, MotionEvent motionEvent) {
        ((C1126410fPz) aTListenerS341S0200000_17.l0).LLLIIIIL = true;
        try {
            boolean zLIZIZ = ((C1149290g0t) aTListenerS341S0200000_17.l1).LIZIZ(motionEvent, view);
            ((C1126410fPz) aTListenerS341S0200000_17.l0).LLLIIIIL = false;
            return zLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C1126410fPz) aTListenerS341S0200000_17.l0).LLLIIIIL = false;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0313  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$1(Y.ATListenerS341S0200000_17 r18, android.view.View r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS341S0200000_17.onTouch$1(Y.ATListenerS341S0200000_17, android.view.View, android.view.MotionEvent):boolean");
    }
}
