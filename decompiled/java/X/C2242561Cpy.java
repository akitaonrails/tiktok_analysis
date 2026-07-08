package X;

import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;

/* JADX INFO: renamed from: X.1Cpy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242561Cpy {
    public static final BaseUserComponent LIZ(C2242541Cpw c2242541Cpw) {
        TextComponent textComponentLIZ;
        TextComponent textComponentLIZ2;
        ImageComponent imageComponentLIZJ;
        ActionLinkComponent actionLinkComponentLIZ;
        Long l = c2242541Cpw.user_id;
        C2243521CrW c2243521CrW = c2242541Cpw.nickname;
        TextComponent textComponentLIZ3 = null;
        if (c2243521CrW != null) {
            textComponentLIZ = C2243551CrZ.LIZ(c2243521CrW);
        } else {
            textComponentLIZ = null;
        }
        C2243521CrW c2243521CrW2 = c2242541Cpw.description;
        if (c2243521CrW2 != null) {
            textComponentLIZ2 = C2243551CrZ.LIZ(c2243521CrW2);
        } else {
            textComponentLIZ2 = null;
        }
        C2244091CsR c2244091CsR = c2242541Cpw.avatar;
        if (c2244091CsR != null) {
            imageComponentLIZJ = C2244081CsQ.LIZJ(c2244091CsR);
        } else {
            imageComponentLIZJ = null;
        }
        C2244321Cso c2244321Cso = c2242541Cpw.link_info;
        if (c2244321Cso != null) {
            actionLinkComponentLIZ = C2244351Csr.LIZ(c2244321Cso);
        } else {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        }
        C2243521CrW c2243521CrW3 = c2242541Cpw.username;
        if (c2243521CrW3 != null) {
            textComponentLIZ3 = C2243551CrZ.LIZ(c2243521CrW3);
        }
        return new BaseUserComponent(l, textComponentLIZ, textComponentLIZ2, imageComponentLIZJ, actionLinkComponentLIZ, textComponentLIZ3, c2242541Cpw.follower_count, c2242541Cpw.is_verify);
    }
}
