package X;

import Y.ACListenerS116S0200000_12;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0U7O, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U7O extends C0U7P {
    public boolean LLILZLL;

    public C0U7O(View view, C0U7M c0u7m) {
        super(view, c0u7m);
        if (LiveAIBeautySetting.INSTANCE.enableDialogUpdate()) {
            this.LLILZIL.setBackgroundResource(R.drawable.dm3);
        } else {
            this.LLILZIL.setBackgroundResource(R.drawable.dm2);
        }
        C500260Jjc.LJLJLJ(this.LLILZ, false);
        C500260Jjc.LJLJLJ(this.LLILLL, true);
        this.LLILLJJLI.setText(C497740JfY.LJIJI(2131851215));
        C786410Ut5.I7(new ACListenerS116S0200000_12(this, c0u7m, 94), view);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    @Override // X.C0U7P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(boolean r4, boolean r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L72
            com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting r1 = com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting.INSTANCE
            boolean r0 = r1.enableDialogUpdate()
            if (r0 != 0) goto L72
            boolean r0 = r1.enableDialogUpdate()
            if (r0 != 0) goto L22
            X.16F5 r2 = r3.LLILLJJLI
            android.view.View r0 = r3.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131107347(0x7f061e13, float:1.782727E38)
            int r0 = X.C20736316Cj.LIZIZ(r0, r1)
            r2.setTextColor(r0)
        L22:
            boolean r0 = r3.LLILZLL
            if (r0 == r4) goto L4b
            if (r4 == 0) goto L4e
            X.16F5 r1 = r3.LLILLJJLI
            r0 = 2131851216(0x7f1177d0, float:1.9336016E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r1.setText(r0)
            android.view.View r0 = r3.LLILZIL
            X.C500260Jjc.LLFFF(r0)
            com.bytedance.android.live.design.view.icon.LiveIconView r2 = r3.LLILLL
            android.view.View r0 = r3.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131104287(0x7f06121f, float:1.7821064E38)
            X.16Fd r0 = X.C20736316Cj.LIZLLL(r0, r1)
            r2.setIcon(r0)
        L4b:
            r3.LLILZLL = r4
            return
        L4e:
            X.16F5 r1 = r3.LLILLJJLI
            r0 = 2131851215(0x7f1177cf, float:1.9336014E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r1.setText(r0)
            android.view.View r0 = r3.LLILZIL
            X.C500260Jjc.LJIILLIIL(r0)
            com.bytedance.android.live.design.view.icon.LiveIconView r2 = r3.LLILLL
            android.view.View r0 = r3.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131104158(0x7f06119e, float:1.7820803E38)
            X.16Fd r0 = X.C20736316Cj.LIZLLL(r0, r1)
            r2.setIcon(r0)
            goto L4b
        L72:
            com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting.INSTANCE
            boolean r0 = r0.enableDialogUpdate()
            if (r0 != 0) goto L22
            X.16F5 r2 = r3.LLILLJJLI
            android.view.View r0 = r3.itemView
            android.content.Context r1 = r0.getContext()
            r0 = 2131103657(0x7f060fa9, float:1.7819786E38)
            int r0 = X.C20736316Cj.LIZIZ(r0, r1)
            r2.setTextColor(r0)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U7O.I5(boolean, boolean):void");
    }
}
