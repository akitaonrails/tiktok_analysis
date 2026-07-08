package X;

import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;

/* JADX INFO: renamed from: X.1CpW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242281CpW {
    public final ImageComponent LIZ;
    public final TextComponent LIZIZ;
    public final ActionLinkComponent LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2242281CpW(int i, ActionLinkComponent actionLinkComponent, ImageComponent imageComponent) {
        TextComponent textComponentLIZ;
        if ((i & 1) != 0) {
            ImageComponent.Companion.getClass();
            imageComponent = C18ZU.LIZ();
        }
        if ((i & 2) != 0) {
            TextComponent.Companion.getClass();
            textComponentLIZ = C2243491CrT.LIZ();
        } else {
            textComponentLIZ = null;
        }
        if ((i & 4) != 0) {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponent = C2244301Csm.LIZ();
        }
        this(actionLinkComponent, imageComponent, textComponentLIZ);
    }

    public C2242281CpW(ActionLinkComponent actionLinkComponent, ImageComponent imageComponent, TextComponent textComponent) {
        this.LIZ = imageComponent;
        this.LIZIZ = textComponent;
        this.LIZJ = actionLinkComponent;
    }
}
