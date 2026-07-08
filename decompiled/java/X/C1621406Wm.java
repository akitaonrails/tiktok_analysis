package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.assem.PcsIndustrySelectListAssem;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06Wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1621406Wm extends C09AY implements Function2<UIAssem, C1784660wXg, Unit> {
    public final /* synthetic */ PcsIndustrySelectListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1621406Wm(PcsIndustrySelectListAssem pcsIndustrySelectListAssem) {
        super(2);
        this.LL = pcsIndustrySelectListAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C1784660wXg c1784660wXg) {
        int i;
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1784660wXg c1784660wXg2 = c1784660wXg;
        C1808010x9L c1808010x9L = this.LL.LLJJIJIIJIL;
        List<C1781540wSe> list = c1784660wXg2.LLILLJJLI;
        long j = c1784660wXg2.LLILLL;
        long j2 = c1808010x9L.LLILLL;
        List<C1781540wSe> list2 = c1808010x9L.LLILLJJLI;
        c1808010x9L.LLILLJJLI = list;
        c1808010x9L.LLILLL = j;
        int i2 = 0;
        if (list2.isEmpty() && (!list.isEmpty())) {
            c1808010x9L.notifyDataSetChanged();
        } else if (j2 != j) {
            Iterator<C1781540wSe> it2 = c1808010x9L.LLILLJJLI.iterator();
            int i3 = 0;
            while (true) {
                i = -1;
                if (it2.hasNext()) {
                    if (it2.next().LIZ == j2) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            Iterator<C1781540wSe> it3 = c1808010x9L.LLILLJJLI.iterator();
            int i4 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (it3.next().LIZ == j) {
                    i = i4;
                    break;
                }
                i4++;
            }
            if (i3 >= 0) {
                c1808010x9L.notifyItemChanged(i3, "deselect");
            }
            if (i >= 0) {
                c1808010x9L.notifyItemChanged(i, "select");
            }
        }
        PcsIndustrySelectListAssem pcsIndustrySelectListAssem = this.LL;
        boolean z = c1784660wXg2.LLJJI;
        TextView textView = pcsIndustrySelectListAssem.LLJJIJI;
        if (textView != null) {
            if (!z) {
                i2 = 8;
            }
            C786410Ut5.LLIL(textView, i2);
        }
        if (z) {
            f = 12.0f;
        } else {
            f = 28.0f;
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(f);
        TextView textView2 = pcsIndustrySelectListAssem.LLJJIII;
        ViewGroup.LayoutParams layoutParams = null;
        if (textView2 != null) {
            layoutParams = textView2.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.bottomMargin != iLIZIZ) {
            marginLayoutParams.bottomMargin = iLIZIZ;
            TextView textView3 = pcsIndustrySelectListAssem.LLJJIII;
            if (textView3 != null) {
                C786410Ut5.g6(textView3, marginLayoutParams);
            }
        }
        return Unit.LIZ;
    }
}
