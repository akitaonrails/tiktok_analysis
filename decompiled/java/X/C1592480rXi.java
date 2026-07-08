package X;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592480rXi extends C09AY implements Function1<C1592080rX4, Unit> {
    public final /* synthetic */ C817403Hg LL;
    public final /* synthetic */ C1592080rX4 LLILLJJLI;
    public final /* synthetic */ EnumC1571190qzN LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592480rXi(C817403Hg c817403Hg, C1592080rX4 c1592080rX4, EnumC1571190qzN enumC1571190qzN, int i) {
        super(1);
        this.LL = c817403Hg;
        this.LLILLJJLI = c1592080rX4;
        this.LLILLL = enumC1571190qzN;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C1592080rX4 c1592080rX4) {
        CharSequence text;
        ImageView customImageView;
        C1592080rX4 c1592080rX42 = c1592080rX4;
        float f = this.LL.element;
        if (Intrinsics.LJFF(this.LLILLJJLI, c1592080rX42)) {
            f = 1.0f;
        }
        TextView customTextView = c1592080rX42.getCustomTextView();
        if (customTextView != null) {
            EnumC1571190qzN enumC1571190qzN = this.LLILLL;
            C1592080rX4 c1592080rX43 = this.LLILLJJLI;
            int i = this.LLILZ;
            C786410Ut5.S4(f, customTextView);
            if ((C1591480rW6.LIZ() == 2 || C1591480rW6.LIZ() == 3) && enumC1571190qzN == EnumC1571190qzN.DARK) {
                C1592520rXm.LIZ(customTextView, !Intrinsics.LJFF(c1592080rX42, c1592080rX43));
            } else {
                customTextView.setShadowLayer(C1592730rY7.LIZ(), 0.0f, C1592730rY7.LIZIZ(), i);
            }
        }
        C1591980rWu tab = c1592080rX42.getTab();
        if (tab != null && tab.LIZ() && (customImageView = c1592080rX42.getCustomImageView()) != null) {
            C786410Ut5.V4(customImageView, f);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTabScrolledState:");
        TextView mCustomTextView$homepage_common_release = c1592080rX42.getMCustomTextView$homepage_common_release();
        if (mCustomTextView$homepage_common_release != null) {
            text = mCustomTextView$homepage_common_release.getText();
        } else {
            text = null;
        }
        sbLIZ.append((Object) text);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }
}
