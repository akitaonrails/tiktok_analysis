package Y;

import X.C1336205Ku;
import X.C1582570rHj;
import X.C1731606qI;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackReason;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.creator.CreatorAssem;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.user.UserAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageSharePackage;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.Map;
import kotlin.jvm.internal.AwS90S0110000_2;

/* JADX INFO: loaded from: classes3.dex */
public class ACListenerS70S0300000_2 implements View.OnClickListener {
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
        }
    }

    public static final void onClick$0(ACListenerS70S0300000_2 aCListenerS70S0300000_2, View view) {
        ((C1582570rHj) aCListenerS70S0300000_2.l0).setSelected(!r1.isSelected());
        if (((C1582570rHj) aCListenerS70S0300000_2.l0).isSelected()) {
            ((CreatorAssem) aCListenerS70S0300000_2.l1).hp().setState(new AwS90S0110000_2((BotFeedbackReason) aCListenerS70S0300000_2.l2, true, 6));
        } else {
            ((CreatorAssem) aCListenerS70S0300000_2.l1).hp().setState(new AwS90S0110000_2((BotFeedbackReason) aCListenerS70S0300000_2.l2, false, 6));
        }
    }

    public static final void onClick$1(ACListenerS70S0300000_2 aCListenerS70S0300000_2, View view) {
        ((C1582570rHj) aCListenerS70S0300000_2.l0).setSelected(!r1.isSelected());
        if (((C1582570rHj) aCListenerS70S0300000_2.l0).isSelected()) {
            ((UserAssem) aCListenerS70S0300000_2.l1).hp().setState(new AwS90S0110000_2((BotFeedbackReason) aCListenerS70S0300000_2.l2, true, 7));
        } else {
            ((UserAssem) aCListenerS70S0300000_2.l1).hp().setState(new AwS90S0110000_2((BotFeedbackReason) aCListenerS70S0300000_2.l2, false, 7));
        }
    }

    public static final void onClick$2(ACListenerS70S0300000_2 aCListenerS70S0300000_2, View view) {
        SearchImageSharePackage searchImageSharePackage;
        String str;
        Map<String, String> map;
        Map<String, String> map2;
        String str2;
        Map<String, String> map3;
        Map<String, String> map4;
        C1731606qI c1731606qI = C1731606qI.LIZ;
        Context context = (Context) aCListenerS70S0300000_2.l0;
        IMUser iMUser = (IMUser) aCListenerS70S0300000_2.l1;
        BaseSharePackage baseSharePackage = (BaseSharePackage) aCListenerS70S0300000_2.l2;
        c1731606qI.getClass();
        String str3 = null;
        if (baseSharePackage instanceof SearchImageSharePackage) {
            searchImageSharePackage = (SearchImageSharePackage) baseSharePackage;
        } else {
            searchImageSharePackage = null;
        }
        if (iMUser != null) {
            IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
            EnterChatParams enterChatParams = new EnterChatParams(context, iMUser);
            enterChatParams.setQuickChat(true);
            if (searchImageSharePackage != null && (map4 = searchImageSharePackage.mobParams) != null) {
                str2 = map4.get("enter_method");
            } else {
                str2 = null;
            }
            enterChatParams.setEnterMethodForMob(str2);
            if (searchImageSharePackage != null && (map3 = searchImageSharePackage.mobParams) != null) {
                str3 = map3.get("enter_from");
            }
            enterChatParams.setEnterFromForMob(str3);
            imChatService.LJIILLIIL(enterChatParams, null);
            return;
        }
        IIMChatService iIMChatService = (IIMChatService) PluggableExtentionKt.pluggableSpi$default(IIMChatService.class, false, false, false, 14, null);
        if (iIMChatService == null) {
            return;
        }
        Bundle bundle = new Bundle();
        if (searchImageSharePackage != null && (map2 = searchImageSharePackage.mobParams) != null) {
            str = map2.get("enter_from");
        } else {
            str = null;
        }
        C786410Ut5.LJJJI("enter_from", str, bundle);
        if (searchImageSharePackage != null && (map = searchImageSharePackage.mobParams) != null) {
            str3 = map.get("enter_method");
        }
        C786410Ut5.LJJJI("enter_method", str3, bundle);
        iIMChatService.LJIIL(context, bundle, true, null);
    }

    public ACListenerS70S0300000_2(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
