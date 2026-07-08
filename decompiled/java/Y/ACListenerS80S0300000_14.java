package Y;

import X.C05RE;
import X.C05RV;
import X.C0ZS7;
import X.C0ZZ1;
import X.C0ZZT;
import X.C127K;
import X.C1336205Ku;
import X.C1365870leD;
import X.C1388190mED;
import X.C1389910mGz;
import X.C1391190mJ3;
import X.C1440005kM;
import X.C197039127h;
import X.C2036307yL;
import X.C20684815ws;
import X.C343970De7;
import X.C345270DgD;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C889930Yvf;
import X.C891740Yya;
import X.C900650ZUx;
import X.C900660ZUy;
import X.EnumC901750ZZd;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.protocols.LiveCardViewModel;
import com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveCardAssem;
import com.ss.android.ugc.aweme.im.saas.host.api.shareeffect.IMShareEffectBridgeApi;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.ShareEffectReusedUISlot;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateAssem;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.Intrinsics;
import uxk.a;

/* JADX INFO: loaded from: classes15.dex */
public class ACListenerS80S0300000_14 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS80S0300000_14 aCListenerS80S0300000_14, View view) {
        String str;
        C1440005kM.LIZ(new C2036307yL((C1365870leD) aCListenerS80S0300000_14.l0));
        C345270DgD c345270DgD = C345270DgD.LIZ;
        Context context = (Context) aCListenerS80S0300000_14.l1;
        C1365870leD c1365870leD = (C1365870leD) aCListenerS80S0300000_14.l0;
        c345270DgD.getClass();
        IIMService iIMServiceLIZ = C1336205Ku.LIZ(false);
        if (c1365870leD.LIZJ) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", c1365870leD.LJ, bundle);
            C786410Ut5.LJJJI("enter_method", "share_toast", bundle);
            IIMChatService imChatService = iIMServiceLIZ.getImChatService();
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null || (activityLIZ = ActivityStack.getTopActivity()) != null) {
                context = activityLIZ;
            }
            imChatService.LJIIL(context, bundle, false, null);
        } else {
            if (c1365870leD.LJIIIIZZ) {
                str = "share";
            } else {
                str = c1365870leD.LJ;
            }
            IIMChatService imChatService2 = iIMServiceLIZ.getImChatService();
            Activity activityLIZ2 = C1388190mED.LIZ(context);
            if (activityLIZ2 == null) {
                activityLIZ2 = ActivityStack.getTopActivity();
            }
            EnterChatParams enterChatParams = new EnterChatParams(activityLIZ2, c1365870leD.LIZ);
            enterChatParams.setEnterFromForMob(str);
            enterChatParams.setEnterFrom(6);
            enterChatParams.setEnterMethodForMob("toast");
            enterChatParams.setQuickChat(true);
            imChatService2.LJIILLIIL(enterChatParams, null);
        }
        ((C1389910mGz) aCListenerS80S0300000_14.l2).LIZJ();
    }

    public static final void onClick$1(ACListenerS80S0300000_14 aCListenerS80S0300000_14, View view) {
        String str;
        String str2;
        LiveCardViewModel liveCardViewModelYp = ((ShareLiveCardAssem) aCListenerS80S0300000_14.l0).yp();
        C869590Y9l c869590Y9l = (C869590Y9l) aCListenerS80S0300000_14.l1;
        EnumC901750ZZd enumC901750ZZd = EnumC901750ZZd.AVATAR;
        C0ZZ1 c0zz1 = (C0ZZ1) aCListenerS80S0300000_14.l2;
        if (c0zz1 == null || (str = c0zz1.LIZIZ) == null) {
            str = "";
        }
        if (c0zz1 != null) {
            str2 = c0zz1.LIZJ;
        } else {
            str2 = null;
        }
        liveCardViewModelYp.DQ2(new C0ZZT(c869590Y9l, enumC901750ZZd, view, str, str2));
    }

    public static final void onClick$2(ACListenerS80S0300000_14 aCListenerS80S0300000_14, View view) {
        String str;
        String str2;
        LiveCardViewModel liveCardViewModelYp = ((ShareLiveCardAssem) aCListenerS80S0300000_14.l0).yp();
        C869590Y9l c869590Y9l = (C869590Y9l) aCListenerS80S0300000_14.l1;
        EnumC901750ZZd enumC901750ZZd = EnumC901750ZZd.MORE_VIDEO_BTN;
        C0ZZ1 c0zz1 = (C0ZZ1) aCListenerS80S0300000_14.l2;
        if (c0zz1 == null || (str = c0zz1.LIZIZ) == null) {
            str = "";
        }
        if (c0zz1 != null) {
            str2 = c0zz1.LIZJ;
        } else {
            str2 = null;
        }
        liveCardViewModelYp.DQ2(new C0ZZT(c869590Y9l, enumC901750ZZd, view, str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$3(Y.ACListenerS80S0300000_14 r9, android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS80S0300000_14.onClick$3(Y.ACListenerS80S0300000_14, android.view.View):void");
    }

    public static final void onClick$4(ACListenerS80S0300000_14 aCListenerS80S0300000_14, View view) {
        String str;
        C900650ZUx c900650ZUx = (C900650ZUx) aCListenerS80S0300000_14.l0;
        if (c900650ZUx != null && (str = c900650ZUx.LIZ) != null) {
            ShareEffectReusedUISlot shareEffectReusedUISlot = (ShareEffectReusedUISlot) aCListenerS80S0300000_14.l1;
            C869590Y9l c869590Y9l = (C869590Y9l) aCListenerS80S0300000_14.l2;
            IMShareEffectBridgeApi.LIZ.getClass();
            IMShareEffectBridgeApi value = C900660ZUy.LIZIZ.getValue();
            if (value != null) {
                value.LIZJ(shareEffectReusedUISlot.LJJIJL().getContext(), str);
            }
            shareEffectReusedUISlot.getClass();
            ShareEffectReusedUISlot.tp(c900650ZUx, c869590Y9l, "click_card");
        }
    }

    public static final void onClick$5(ACListenerS80S0300000_14 aCListenerS80S0300000_14, View view) {
        ((MessageListTextClickAbility) aCListenerS80S0300000_14.l0).uZ1(((TextTranslateAssem) aCListenerS80S0300000_14.l1).getContentView(), ((C0ZS7) aCListenerS80S0300000_14.l2).LJIILL().toString());
    }

    public static final void onClick$6(ACListenerS80S0300000_14 aCListenerS80S0300000_14, View view) {
        int i;
        String str;
        MutableLiveData<Boolean> mutableLiveData = ((CommonSettingItemStatus) aCListenerS80S0300000_14.l0)._checked;
        Boolean value = mutableLiveData.getValue();
        Boolean bool = Boolean.TRUE;
        mutableLiveData.setValue(Boolean.valueOf(!Intrinsics.LJFF(value, bool)));
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCListenerS80S0300000_14.l1;
        if (Intrinsics.LJFF(((CommonSettingItemStatus) aCListenerS80S0300000_14.l0)._checked.getValue(), bool)) {
            i = 0;
        } else {
            i = 3;
        }
        videoPublishEditModel.commentSetting = i;
        a aVar = a.LIZ;
        int i2 = ((VideoPublishEditModel) aCListenerS80S0300000_14.l1).commentSetting;
        aVar.getClass();
        a.LJII(i2);
        HashMap map = (HashMap) aCListenerS80S0300000_14.l2;
        if (map == null) {
            return;
        }
        if (Intrinsics.LJFF(((CommonSettingItemStatus) aCListenerS80S0300000_14.l0)._checked.getValue(), bool)) {
            str = "on";
        } else {
            str = "off";
        }
        map.put("to_status", str);
        C20684815ws.LJIILLIIL("disable_comment", (HashMap) aCListenerS80S0300000_14.l2);
    }

    public static final void onClick$7(ACListenerS80S0300000_14 aCListenerS80S0300000_14, View view) {
        if (((C891740Yya) aCListenerS80S0300000_14.l0).LJFF != C05RE.LIZ()) {
            C891740Yya c891740Yya = (C891740Yya) aCListenerS80S0300000_14.l0;
            C197039127h c197039127h = c891740Yya.LJIIIIZZ;
            if (c197039127h != null) {
                c197039127h.setLoading(true);
            }
            C197039127h c197039127h2 = c891740Yya.LJIIIIZZ;
            if (c197039127h2 != null) {
                c197039127h2.setClickable(false);
            }
            C127K c127k = c891740Yya.LJI;
            if (c127k != null) {
                c127k.setCellEnabled(false);
            }
            C127K c127k2 = c891740Yya.LJII;
            if (c127k2 != null) {
                c127k2.setCellEnabled(false);
            }
            C891740Yya c891740Yya2 = (C891740Yya) aCListenerS80S0300000_14.l0;
            Context context = (Context) aCListenerS80S0300000_14.l1;
            c891740Yya2.getClass();
            C889930Yvf c889930Yvf = C889930Yvf.LIZ;
            C05RV c05rv = c891740Yya2.LJFF;
            AwS380S0200000_14 awS380S0200000_14 = new AwS380S0200000_14(c891740Yya2, context, 87);
            c889930Yvf.getClass();
            C889930Yvf.LIZ(c05rv, "click_inbox_mode_switch_popup", awS380S0200000_14);
        } else {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJ((View) aCListenerS80S0300000_14.l2, C343970De7.LIZ);
        }
        ((C891740Yya) aCListenerS80S0300000_14.l0).LJII("click_apply");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS80S0300000_14(X.C869590Y9l r2, X.C900650ZUx r3, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.ShareEffectReusedUISlot r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 3 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS80S0300000_14.<init>(X.0Y9l, X.0ZUx, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.ShareEffectReusedUISlot, int):void");
    }

    public ACListenerS80S0300000_14(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
