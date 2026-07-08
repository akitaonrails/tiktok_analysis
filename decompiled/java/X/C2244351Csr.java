package X;

import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import java.util.List;

/* JADX INFO: renamed from: X.1Csr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244351Csr {
    public static final ActionLinkComponent LIZ(C2244321Cso c2244321Cso) {
        ActionLinkType actionLinkTypeLIZIZ;
        List list = c2244321Cso.url_list;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        EnumC2244361Css enumC2244361Css = c2244321Cso.action_type;
        if (enumC2244361Css == null || (actionLinkTypeLIZIZ = LIZIZ(enumC2244361Css)) == null) {
            actionLinkTypeLIZIZ = ActionLinkType.INVALID;
        }
        String str = c2244321Cso.name;
        if (str == null) {
            str = "";
        }
        return new ActionLinkComponent(list, actionLinkTypeLIZIZ, str);
    }

    public static final ActionLinkType LIZIZ(EnumC2244361Css enumC2244361Css) {
        for (ActionLinkType actionLinkType : ActionLinkType.values()) {
            if (actionLinkType.getValue() == enumC2244361Css.getValue()) {
                return actionLinkType;
            }
        }
        return ActionLinkType.INVALID;
    }
}
