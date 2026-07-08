package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.tab.ECSearchLynxFilterAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Qgr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676910Qgr extends C09AY implements InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit> {
    public final /* synthetic */ ISearchResultSubPageAbility LL;
    public final /* synthetic */ ECSearchLynxFilterAssem LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C435470H5t LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C676910Qgr(ISearchResultSubPageAbility iSearchResultSubPageAbility, ECSearchLynxFilterAssem eCSearchLynxFilterAssem, int i, C435470H5t c435470H5t) {
        super(4);
        this.LL = iSearchResultSubPageAbility;
        this.LLILLJJLI = eCSearchLynxFilterAssem;
        this.LLILLL = i;
        this.LLILZ = c435470H5t;
    }

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        num2.intValue();
        int iIntValue2 = num3.intValue();
        num4.intValue();
        if (iIntValue2 != 0) {
            Integer numValueOf = Integer.valueOf(this.LL.dx0());
            int i = 0;
            if (numValueOf.intValue() > 0) {
                ViewGroup.LayoutParams layoutParams = null;
                if (1 != 0) {
                    int iIntValue3 = numValueOf.intValue();
                    this.LLILLJJLI.getClass();
                    int iNo = ECSearchLynxFilterAssem.No();
                    if (this.LLILLL + iIntValue > iIntValue3 && iIntValue <= iNo) {
                        ISearchResultSubPageAbility iSearchResultSubPageAbility = this.LL;
                        int i2 = iIntValue3 - iIntValue;
                        if (i2 >= 0) {
                            i = i2;
                        }
                        iSearchResultSubPageAbility.setMaxWidth(i);
                    } else if (iIntValue2 > 0 && iIntValue > iNo) {
                        ISearchResultSubPageAbility iSearchResultSubPageAbility2 = this.LL;
                        int i3 = iIntValue3 - iNo;
                        if (i3 >= 0) {
                            i = i3;
                        }
                        iSearchResultSubPageAbility2.setMaxWidth(i);
                        C435470H5t c435470H5t = this.LLILZ;
                        ViewGroup.LayoutParams layoutParams2 = c435470H5t.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = iNo;
                            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                            layoutParams = layoutParams2;
                        }
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c435470H5t);
                        c435470H5t.setLayoutParams(layoutParams);
                        this.LLILZ.requestLayout();
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
