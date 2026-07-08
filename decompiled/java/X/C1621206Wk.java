package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.assem.PcsIndustrySelectListAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06Wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1621206Wk extends C09AY implements Function2<Long, String, Unit> {
    public final /* synthetic */ PcsIndustrySelectListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1621206Wk(PcsIndustrySelectListAssem pcsIndustrySelectListAssem) {
        super(2);
        this.LL = pcsIndustrySelectListAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Long l, String str) {
        C1781540wSe next;
        long jLongValue = l.longValue();
        String str2 = str;
        AssemVMLazy assemVMLazy = this.LL.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsIndustrySelectListAssem.LLJJJ;
        AssemViewModel value = assemVMLazy.getValue();
        C1784660wXg c1784660wXg = (C1784660wXg) value.getState();
        if (!c1784660wXg.LLIZ) {
            Iterator<C1781540wSe> it2 = c1784660wXg.LLILLJJLI.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZ == jLongValue) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            value.setState(new C1784690wXj(jLongValue, str2, c1784660wXg, next));
        }
        return Unit.LIZ;
    }
}
