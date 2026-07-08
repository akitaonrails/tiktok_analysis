package X;

import com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarButtonStrategyConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.DisplayNameLang;

/* JADX INFO: renamed from: X.0ZlM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909020ZlM {
    public static final ActionBarButtonConf LIZ(ActionBarButtonStrategyConf actionBarButtonStrategyConf) {
        Long lLJIILIIL;
        Long lLJIILIIL2;
        String str;
        String str2;
        Integer num = actionBarButtonStrategyConf.type;
        String str3 = actionBarButtonStrategyConf.actionSchema;
        String str4 = actionBarButtonStrategyConf.title;
        String str5 = actionBarButtonStrategyConf.icon;
        String str6 = actionBarButtonStrategyConf.iconDark;
        String str7 = actionBarButtonStrategyConf.id;
        if (str7 != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str7);
        } else {
            lLJIILIIL = null;
        }
        String str8 = actionBarButtonStrategyConf.resourceId;
        if (str8 != null) {
            lLJIILIIL2 = C2095008Iq.LJIILIIL(str8);
        } else {
            lLJIILIIL2 = null;
        }
        String str9 = actionBarButtonStrategyConf.displayName;
        Integer num2 = actionBarButtonStrategyConf.width;
        Integer num3 = actionBarButtonStrategyConf.height;
        String str10 = actionBarButtonStrategyConf.staticUrl;
        String str11 = actionBarButtonStrategyConf.animateUrl;
        String str12 = actionBarButtonStrategyConf.staticType;
        String str13 = actionBarButtonStrategyConf.animateType;
        DisplayNameLang displayNameLang = actionBarButtonStrategyConf.displayNameLang;
        if (displayNameLang != null) {
            str = displayNameLang.en;
            str2 = displayNameLang.local;
        } else {
            str = null;
            str2 = null;
        }
        return new ActionBarButtonConf(num, str3, str4, str5, str6, lLJIILIIL, lLJIILIIL2, str9, num2, num3, str10, str11, str12, str13, new com.ss.android.ugc.aweme.im.chatroom.api.actionbar.DisplayNameLang(str, str2), actionBarButtonStrategyConf.resourceName, actionBarButtonStrategyConf.lightInteractionName, actionBarButtonStrategyConf.flipIconOnRTL, null, null, true, actionBarButtonStrategyConf.buttonId, actionBarButtonStrategyConf.sortLogic, actionBarButtonStrategyConf.clickActionSchema, actionBarButtonStrategyConf.scpBizExtra);
    }
}
