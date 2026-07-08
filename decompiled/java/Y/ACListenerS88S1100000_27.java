package Y;

import X.C0IF2;
import X.C0IJT;
import X.C1161920gLG;
import X.C1568560qv8;
import X.C1803800x2Y;
import X.C1804000x2s;
import X.C1805230x4r;
import X.C1805460x5E;
import X.C1806080x6E;
import X.C2095008Iq;
import X.C474500IjA;
import X.C495520Jby;
import X.C784440Upu;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class ACListenerS88S1100000_27 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS88S1100000_27 aCListenerS88S1100000_27, View view) {
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJJIIZI("top_banner");
        Context context = ((C1805460x5E) aCListenerS88S1100000_27.l1).LIZJ.getContext();
        if (context == null) {
            return;
        }
        C1805460x5E c1805460x5E = (C1805460x5E) aCListenerS88S1100000_27.l1;
        String str = aCListenerS88S1100000_27.s0;
        c1805460x5E.getClass();
        if (str.length() != 0) {
            if (C1804000x2s.LIZ(context)) {
                C784440Upu.LIZ().LIZIZ(new C0IF2(1));
            } else {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, new C495520Jby(str).LIZLLL());
            }
        }
    }

    public static final void onClick$1(ACListenerS88S1100000_27 aCListenerS88S1100000_27, View view) {
        Integer numLJIIJJI;
        NoticesResult.Notice notice;
        Map<String, String> map;
        NoticesResult.Notice notice2;
        Map<String, String> map2;
        String str;
        C1806080x6E c1806080x6E = (C1806080x6E) aCListenerS88S1100000_27.l1;
        C1568560qv8 c1568560qv8 = c1806080x6E.LJIIIZ;
        String str2 = null;
        if (c1568560qv8 != null && (notice2 = c1568560qv8.LIZ) != null && (map2 = notice2.extra) != null && (str = map2.get("gift_id")) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str);
        } else {
            numLJIIJJI = null;
        }
        C1568560qv8 c1568560qv82 = c1806080x6E.LJIIIZ;
        if (c1568560qv82 != null && (notice = c1568560qv82.LIZ) != null && (map = notice.extra) != null) {
            str2 = map.get("vault_type");
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_vault_recharge_banner_click");
        c474500IjALIZ.LJJII(numLJIIJJI, "gift_id");
        c474500IjALIZ.LJJII("banner", "banner_type");
        c474500IjALIZ.LJJII("app", "app_type");
        c474500IjALIZ.LJJII(str2, "vault_type");
        c474500IjALIZ.LIZ();
        Context context = ((C1806080x6E) aCListenerS88S1100000_27.l1).LIZJ.getContext();
        if (context == null) {
            return;
        }
        ((C1806080x6E) aCListenerS88S1100000_27.l1).LJII(context, aCListenerS88S1100000_27.s0);
    }

    public static final void onClick$2(ACListenerS88S1100000_27 aCListenerS88S1100000_27, View view) {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((C1805230x4r) aCListenerS88S1100000_27.l1).LIZ, aCListenerS88S1100000_27.s0);
    }

    public static final void onClick$3(ACListenerS88S1100000_27 aCListenerS88S1100000_27, View view) {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((C1805230x4r) aCListenerS88S1100000_27.l1).LIZ, aCListenerS88S1100000_27.s0);
    }

    public ACListenerS88S1100000_27(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
