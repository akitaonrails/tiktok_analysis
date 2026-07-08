package X;

import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Cpd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242351Cpd {
    public static final boolean LIZ(BaseHeaderComponent baseHeaderComponent) {
        if (baseHeaderComponent == null) {
            return false;
        }
        BaseHeaderComponent.Companion.getClass();
        if (Intrinsics.LJFF(baseHeaderComponent, BaseHeaderComponent.EMPTY_HEADER_COMPONENT$delegate.getValue()) || baseHeaderComponent.text.text.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final BaseHeaderComponent LIZIZ(C2242321Cpa c2242321Cpa) {
        TextComponent textComponentLIZ = C2243551CrZ.LIZ(c2242321Cpa.text);
        if (textComponentLIZ == null) {
            TextComponent.Companion.getClass();
            textComponentLIZ = C2243491CrT.LIZ();
        }
        return new BaseHeaderComponent(textComponentLIZ);
    }
}
