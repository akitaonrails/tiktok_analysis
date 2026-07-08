package X;

import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;

/* JADX INFO: renamed from: X.1CpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242131CpH {
    public static final FallbackInfoComponent LIZ(C2242211CpP c2242211CpP) {
        ActionLinkComponent actionLinkComponentLIZ;
        TextComponent textComponentLIZ;
        C2244321Cso c2244321Cso = c2242211CpP.link_info;
        ImageComponent imageComponentLIZJ = null;
        if (c2244321Cso != null) {
            actionLinkComponentLIZ = C2244351Csr.LIZ(c2244321Cso);
        } else {
            actionLinkComponentLIZ = null;
        }
        C2243521CrW c2243521CrW = c2242211CpP.text;
        if (c2243521CrW == null || (textComponentLIZ = C2243551CrZ.LIZ(c2243521CrW)) == null) {
            TextComponent.Companion.getClass();
            textComponentLIZ = C2243491CrT.LIZ();
        }
        C2244091CsR c2244091CsR = c2242211CpP.image;
        if (c2244091CsR != null) {
            imageComponentLIZJ = C2244081CsQ.LIZJ(c2244091CsR);
        }
        return new FallbackInfoComponent(actionLinkComponentLIZ, imageComponentLIZJ, textComponentLIZ);
    }
}
