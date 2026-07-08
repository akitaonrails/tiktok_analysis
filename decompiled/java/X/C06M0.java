package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.assem.PcsIndustrySelectBottomAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06M0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06M0 extends C09AY implements Function2<UIAssem, C1784660wXg, Unit> {
    public final /* synthetic */ PcsIndustrySelectBottomAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06M0(PcsIndustrySelectBottomAssem pcsIndustrySelectBottomAssem) {
        super(2);
        this.LL = pcsIndustrySelectBottomAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C1784660wXg c1784660wXg) {
        Integer numLIZJ;
        Integer numLIZJ2;
        C1784660wXg c1784660wXg2 = c1784660wXg;
        boolean z = true;
        if (c1784660wXg2.LLILLL == 0 || !c1784660wXg2.LLJ || c1784660wXg2.LLIZ) {
            z = false;
        }
        PcsIndustrySelectBottomAssem pcsIndustrySelectBottomAssem = this.LL;
        C197039127h c197039127h = pcsIndustrySelectBottomAssem.LLJJIII;
        if (c197039127h != null) {
            c197039127h.setEnabled(z);
            Context context = c197039127h.getContext();
            if (z) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.ey7, context);
                numLIZJ2 = C1308910kAL.LIZJ(R.attr.eyv, context);
            } else {
                numLIZJ = C1308910kAL.LIZJ(R.attr.ey_, context);
                numLIZJ2 = C1308910kAL.LIZJ(R.attr.ezt, context);
            }
            ViewGroup viewGroup = pcsIndustrySelectBottomAssem.LLJJIJI;
            if (viewGroup != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Float.valueOf(8.0f)));
                if (numLIZJ != null) {
                    gradientDrawable.setColor(numLIZJ.intValue());
                }
                viewGroup.setBackground(gradientDrawable);
            }
            if (numLIZJ2 != null) {
                c197039127h.setTextColor(numLIZJ2.intValue());
            }
        }
        return Unit.LIZ;
    }
}
