package Y;

import X.AbstractC1128120fSk;
import X.C0IJT;
import X.C0TZ2;
import X.C0TZ3;
import X.C1106200etO;
import X.C1106210etP;
import X.C1106320eta;
import X.C1117860fCC;
import X.C1128080fSg;
import X.C1128110fSj;
import X.C1128190fSr;
import X.C1129850fVX;
import X.C1148910g0H;
import X.C1161920gLG;
import X.C1697810uHb;
import X.C176900m7;
import X.C474500IjA;
import X.C481220Iu0;
import X.C494720Jag;
import X.C494730Jah;
import X.C495520Jby;
import X.C497740JfY;
import X.C755620TkW;
import X.C755630TkX;
import X.C782110Um9;
import X.C786410Ut5;
import X.InterfaceC1372610lp5;
import X.InterfaceC481210Itz;
import X.InterfaceC743640TFa;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.gift.base.business.dialog.v2.favorite.GiftFavoritePanelAssem;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class ACListenerS86S1100000_17 implements View.OnClickListener {
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
            case 4:
                onClick$4(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS86S1100000_17 aCListenerS86S1100000_17, View view) {
        Uri uri = UriProtector.parse(new C495520Jby(aCListenerS86S1100000_17.s0).LIZLLL());
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        if (iActionHandlerService != null) {
            iActionHandlerService.handle(((C1117860fCC) aCListenerS86S1100000_17.l1).getContext(), uri);
        }
    }

    public static final void onClick$1(ACListenerS86S1100000_17 aCListenerS86S1100000_17, View view) {
        int i;
        Long lValueOf;
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((C1128080fSg) aCListenerS86S1100000_17.l1).getContext(), UriProtector.parse(new C495520Jby(aCListenerS86S1100000_17.s0).LIZLLL()));
        AbstractC1128120fSk abstractC1128120fSk = ((C1128080fSg) aCListenerS86S1100000_17.l1).LLIZ;
        if (abstractC1128120fSk != null) {
            C1128190fSr c1128190fSrLIZ = C1128110fSj.LIZ(abstractC1128120fSk);
            long jLIZ = abstractC1128120fSk.LIZ();
            if (c1128190fSrLIZ != null) {
                i = c1128190fSrLIZ.LIZ;
            } else {
                i = 0;
            }
            int iLIZIZ = abstractC1128120fSk.LIZIZ();
            if (c1128190fSrLIZ != null) {
                lValueOf = Long.valueOf(c1128190fSrLIZ.LIZIZ);
            } else {
                lValueOf = null;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_party_banner_click");
            C176900m7.LIZ(c474500IjALIZ);
            c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "gift_id");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "task_left_progress");
            c474500IjALIZ.LJJII(Integer.valueOf(iLIZIZ), "ongoing_stage");
            c474500IjALIZ.LJJII(lValueOf, "ongoing_to_unlock_gift_id");
            c474500IjALIZ.LJJII("top_of_gift_panel", "show_entrance");
            c474500IjALIZ.LIZ();
        }
    }

    public static final void onClick$2(ACListenerS86S1100000_17 aCListenerS86S1100000_17, View view) {
        Activity topActivity;
        C1106320eta c1106320eta = (C1106320eta) aCListenerS86S1100000_17.l1;
        String str = aCListenerS86S1100000_17.s0;
        if (str == null) {
            str = "";
        }
        c1106320eta.getClass();
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction != null) {
            topActivity = iHostAction.getTopActivity();
        } else {
            topActivity = null;
        }
        C1106200etO c1106200etO = new C1106200etO();
        c1106200etO.LJIIIZ = str;
        c1106200etO.LJJIL = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
        if (c1106320eta.LIZJ) {
            c1106200etO.LJJI = "live_links";
            c1106200etO.LJJIJLIJ = c1106320eta.LIZLLL;
        }
        InterfaceC481210Itz interfaceC481210ItzMh = ((IShareService) C1161920gLG.LIZJ(IShareService.class)).mh();
        C1106210etP c1106210etP = new C1106210etP(c1106200etO);
        InterfaceC1372610lp5 interfaceC1372610lp5 = new InterfaceC1372610lp5() { // from class: X.0etQ
            @Override // X.InterfaceC1372610lp5
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZIZ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZJ(String str2, String str3, Bundle bundle) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZLLL(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJFF(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJI(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJII() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onDismiss() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onShow(int i) {
            }
        };
        C481220Iu0 c481220Iu0 = (C481220Iu0) interfaceC481210ItzMh;
        c481220Iu0.getClass();
        c1106210etP.LIZIZ();
        c481220Iu0.LIZ(topActivity, c1106210etP, interfaceC1372610lp5);
    }

    public static final void onClick$3(ACListenerS86S1100000_17 aCListenerS86S1100000_17, View view) {
        String str = aCListenerS86S1100000_17.s0;
        if (str != null && str.length() != 0) {
            ((Function0) aCListenerS86S1100000_17.l1).invoke();
        }
    }

    public static final void onClick$4(ACListenerS86S1100000_17 aCListenerS86S1100000_17, View view) {
        int i;
        String str = ((GiftFavoritePanelAssem) aCListenerS86S1100000_17.l1).Ho().LLILZIL;
        List<C1148910g0H> list = ((GiftFavoritePanelAssem) aCListenerS86S1100000_17.l1).Go().getState().LL;
        ArrayList arrayList = new ArrayList();
        Iterator<C1148910g0H> it2 = list.iterator();
        while (it2.hasNext()) {
            Long l = it2.next().LIZLLL;
            if (l != null) {
                arrayList.add(l);
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("edit_featured_area_recover_button_click");
        c474500IjALIZ.LJIL();
        C1129850fVX.LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "button_type");
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((Number) next).longValue() != 0) {
                arrayList2.add(next);
            }
        }
        c474500IjALIZ.LJJII(arrayList2, "featured_gift_id_set");
        if (!arrayList.isEmpty()) {
            Iterator it4 = arrayList.iterator();
            i = 0;
            while (it4.hasNext()) {
                if (((Number) it4.next()).longValue() != 0 && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "featured_gift_cnt");
        c474500IjALIZ.LIZ();
        Context context = ((GiftFavoritePanelAssem) aCListenerS86S1100000_17.l1).getContext();
        if (context != null) {
            String str2 = aCListenerS86S1100000_17.s0;
            GiftFavoritePanelAssem giftFavoritePanelAssem = (GiftFavoritePanelAssem) aCListenerS86S1100000_17.l1;
            C755630TkX c755630TkX = new C755630TkX();
            c755630TkX.LIZ = C497740JfY.LJIJI(R.string.f1_);
            c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0g0B
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            };
            C0TZ3 c0tz3 = new C0TZ3(c755630TkX);
            C755620TkW c755620TkW = new C755620TkW();
            c755620TkW.LIZ = C497740JfY.LJIJI(2131843771);
            c755620TkW.LIZJ = new AcS497S0100000_17(giftFavoritePanelAssem, 17);
            C0TZ2 c0tz2 = new C0TZ2(c755620TkW);
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LIZJ = C497740JfY.LJIJI(2131843769);
            c782110Um9.LJIIIZ(str2);
            C494720Jag c494720Jag = new C494720Jag();
            c494720Jag.LIZIZ = 2;
            c494720Jag.LIZ(c0tz2);
            c494720Jag.LIZ(c0tz3);
            c782110Um9.LIZJ(new C494730Jah(c494720Jag));
            C786410Ut5.E4(c782110Um9.LIZ());
        }
    }

    public ACListenerS86S1100000_17(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
