package X;

import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;

/* JADX INFO: renamed from: X.1CqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242841CqQ {
    public static final BaseFooterComponent LIZ(C2242801CqM c2242801CqM) {
        TextComponent textComponentLIZ = C2243551CrZ.LIZ(c2242801CqM.text);
        if (textComponentLIZ == null) {
            TextComponent.Companion.getClass();
            textComponentLIZ = C2243491CrT.LIZ();
        }
        String str = c2242801CqM.footer_scene;
        if (str == null) {
            str = null;
        }
        return new BaseFooterComponent(textComponentLIZ, str);
    }
}
