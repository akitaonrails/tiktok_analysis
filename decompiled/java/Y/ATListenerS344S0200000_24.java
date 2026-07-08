package Y;

import X.AbstractC1598130rgp;
import X.C0J5U;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;

/* JADX INFO: loaded from: classes25.dex */
public class ATListenerS344S0200000_24 implements View.OnTouchListener {
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
    public ATListenerS344S0200000_24(Object obj, InboxLiveBaseCell<T> inboxLiveBaseCell, T t) {
        this.$t = t;
        this.l0 = obj;
        this.l1 = inboxLiveBaseCell;
    }

    public static final boolean onTouch$0(ATListenerS344S0200000_24 aTListenerS344S0200000_24, View view, MotionEvent motionEvent) {
        InboxLiveBaseCell inboxLiveBaseCell = (InboxLiveBaseCell) aTListenerS344S0200000_24.l0;
        if (!inboxLiveBaseCell.LLJILJIL) {
            inboxLiveBaseCell.LLJILJIL = true;
            C0J5U c0j5u = C0J5U.LIZ;
            InboxLiveNotice inboxLiveNoticeLIZIZ = ((AbstractC1598130rgp) aTListenerS344S0200000_24.l1).LIZIZ();
            int bindingAdapterPosition = ((InboxLiveBaseCell) aTListenerS344S0200000_24.l0).getBindingAdapterPosition();
            View view2 = ((InboxLiveBaseCell) aTListenerS344S0200000_24.l0).itemView;
            c0j5u.getClass();
            inboxLiveBaseCell.LLJIJIL = C0J5U.LIZ(inboxLiveNoticeLIZIZ, bindingAdapterPosition, view2);
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[PHI: r0
      0x002d: PHI (r0v6 com.ss.android.ugc.aweme.main.TabChangeManager) = (r0v5 com.ss.android.ugc.aweme.main.TabChangeManager), (r0v14 com.ss.android.ugc.aweme.main.TabChangeManager) binds: [B:7:0x001b, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$1(Y.ATListenerS344S0200000_24 r3, android.view.View r4, android.view.MotionEvent r5) {
        /*
            int r0 = r5.getActionMasked()
            if (r0 != 0) goto L3c
            X.0hR8 r0 = com.ss.android.ugc.aweme.spi.TabSwitchMetricService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.spi.TabSwitchMetricService r0 = X.C1204000hR8.LIZ()
            if (r0 == 0) goto L3c
            r0.LJII()
            java.lang.Object r2 = r3.l0
            X.0rXD r2 = (X.C1592170rXD) r2
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r2.LJIIJJI
            r1 = 0
            if (r0 != 0) goto L2d
            X.19EG r0 = r2.LIZJ
            X.19EG r0 = X.C1388190mED.LIZIZ(r0)
            if (r0 == 0) goto L3e
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = X.C343710Ddh.LIZ(r0)
        L29:
            r2.LJIIJJI = r0
            if (r0 == 0) goto L31
        L2d:
            java.lang.String r1 = r0.CQ2()
        L31:
            java.lang.Object r0 = r3.l1
            X.0rJp r0 = (X.InterfaceC1583870rJp) r0
            java.lang.String r0 = r0.tag()
            X.C1593210rYt.LIZJ(r1, r0)
        L3c:
            r0 = 0
            return r0
        L3e:
            r0 = r1
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS344S0200000_24.onTouch$1(Y.ATListenerS344S0200000_24, android.view.View, android.view.MotionEvent):boolean");
    }
}
