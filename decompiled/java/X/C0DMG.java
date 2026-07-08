package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DMG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DMG extends C09AY implements Function2<Integer, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DMG(View view, int i, String str, boolean z) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = view;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Integer num2) {
        int iIntValue;
        GradientDrawable gradientDrawable;
        int iIntValue2 = num.intValue();
        Integer num3 = num2;
        if (!this.LL && num3 != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = iIntValue2;
        }
        View view = this.LLILLJJLI;
        Drawable background = null;
        if (view != null) {
            background = view.getBackground();
        }
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setColor(iIntValue);
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            view2.setBackground(background);
        }
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewLiveTabCapsuleColorThemeChangeEvent: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", update color: ");
        sbLIZ.append(iIntValue2);
        sbLIZ.append(", ");
        sbLIZ.append(num3);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
