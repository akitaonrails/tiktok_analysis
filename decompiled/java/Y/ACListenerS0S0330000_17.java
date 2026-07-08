package Y;

import X.C1104530eqh;
import X.C1133640fbe;
import X.C1146120fvm;
import X.C1146350fw9;
import android.view.View;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.bottom.GiftAnchorPanelGiftPageGiftPageBottomAssem;
import com.bytedance.android.livesdk.gift.event.LiveSendRedEnvelopeEvent;
import com.bytedance.android.livesdk.gift.model.GiftPanelCardletByCreator;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes18.dex */
public class ACListenerS0S0330000_17 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;
    public boolean z4;
    public boolean z5;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS0S0330000_17 aCListenerS0S0330000_17, View view) {
        String str;
        if (aCListenerS0S0330000_17.z3) {
            C1146350fw9 c1146350fw9 = (C1146350fw9) aCListenerS0S0330000_17.l0;
            if (c1146350fw9.LLILLJJLI == 3) {
                if (a0.LJJIIZI(((GiftPanelCardletByCreator) aCListenerS0S0330000_17.l1).schemaUrl, "webcast_super_fan_box_send_panel", false)) {
                    str = "superfan_box";
                } else {
                    str = "treasure_box";
                }
                ((C1146120fvm) ((GiftAnchorPanelGiftPageGiftPageBottomAssem) aCListenerS0S0330000_17.l2).LLJJI.getValue()).LLILLJJLI.LC0(LiveSendRedEnvelopeEvent.class, new C1104530eqh("gift_panel_creator", "", "normal", str, null, 32));
            } else {
                ((GiftAnchorPanelGiftPageGiftPageBottomAssem) aCListenerS0S0330000_17.l2).kp(((GiftPanelCardletByCreator) aCListenerS0S0330000_17.l1).schemaUrl, c1146350fw9);
            }
            C1146350fw9 c1146350fw92 = (C1146350fw9) aCListenerS0S0330000_17.l0;
            C1133640fbe.LJIIIZ(c1146350fw92, aCListenerS0S0330000_17.z4, aCListenerS0S0330000_17.z5, c1146350fw92.LLJJIJI, false);
        }
    }

    public static final void onClick$1(ACListenerS0S0330000_17 aCListenerS0S0330000_17, View view) {
        if (aCListenerS0S0330000_17.z3) {
            C1146350fw9 c1146350fw9 = (C1146350fw9) aCListenerS0S0330000_17.l0;
            if (c1146350fw9.LLILLJJLI == 3) {
                ((C1146120fvm) ((GiftAnchorPanelGiftPageGiftPageBottomAssem) aCListenerS0S0330000_17.l1).LLJJI.getValue()).LLILLJJLI.LC0(LiveSendRedEnvelopeEvent.class, new C1104530eqh("gift_panel_creator", "", "normal", null, null, 48));
            } else {
                ((GiftAnchorPanelGiftPageGiftPageBottomAssem) aCListenerS0S0330000_17.l1).kp(((GiftPanelCardletByCreator) aCListenerS0S0330000_17.l2).schemaUrl, c1146350fw9);
            }
            C1146350fw9 c1146350fw92 = (C1146350fw9) aCListenerS0S0330000_17.l0;
            C1133640fbe.LJIIIZ(c1146350fw92, aCListenerS0S0330000_17.z4, aCListenerS0S0330000_17.z5, c1146350fw92.LLJJIJI, false);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS0S0330000_17(com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.bottom.GiftAnchorPanelGiftPageGiftPageBottomAssem r2, X.C1146350fw9 r3, com.bytedance.android.livesdk.gift.model.GiftPanelCardletByCreator r4, boolean r5, boolean r6, boolean r7, int r8) {
        /*
            r1 = this;
            r1.$t = r8
            if (r8 == 0) goto L15
            r0 = r1
            r0.z3 = r5
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
            r0.z4 = r6
            r0.z5 = r7
        L11:
            r0.<init>()
            return
        L15:
            r0 = r1
            r0.z3 = r5
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
            r0.z4 = r6
            r0.z5 = r7
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS0S0330000_17.<init>(com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.bottom.GiftAnchorPanelGiftPageGiftPageBottomAssem, X.0fw9, com.bytedance.android.livesdk.gift.model.GiftPanelCardletByCreator, boolean, boolean, boolean, int):void");
    }
}
