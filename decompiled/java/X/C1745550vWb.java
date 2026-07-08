package X;

import Y.ARunnableS116S0100000_16;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0vWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745550vWb extends C09AY implements InterfaceC1631620sYq<CandInputDataOptions, Boolean, String, Unit> {
    public final /* synthetic */ CandInputData LL;
    public final /* synthetic */ C1745540vWa LLILLJJLI;
    public final /* synthetic */ CandHelper LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745550vWb(CandInputData candInputData, C1745540vWa c1745540vWa, CandHelper candHelper, int i) {
        super(3);
        this.LL = candInputData;
        this.LLILLJJLI = c1745540vWa;
        this.LLILLL = candHelper;
        this.LLILZ = i;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(CandInputDataOptions candInputDataOptions, Boolean bool, String str) {
        List<CandInputData> list;
        CandInputDataOptions candInputDataOptions2 = candInputDataOptions;
        boolean zBooleanValue = bool.booleanValue();
        this.LL.LIZIZ = 0;
        C1745560vWc c1745560vWc = null;
        RecyclerView recyclerView = null;
        if (!zBooleanValue) {
            this.LLILLJJLI.LIZ++;
            C1745560vWc c1745560vWc2 = this.LLILLL.LJ;
            if (c1745560vWc2 == null) {
                c1745560vWc2 = null;
            }
            if (candInputDataOptions2 != null) {
                list = candInputDataOptions2.candInputOptions;
            } else {
                list = null;
            }
            if (!C19719512Dh.LJI(list)) {
                list = null;
            }
            c1745560vWc2.LL = list;
            C1745560vWc c1745560vWc3 = this.LLILLL.LJ;
            if (c1745560vWc3 == null) {
                c1745560vWc3 = null;
            }
            c1745560vWc3.notifyDataSetChanged();
            CandHelper candHelper = this.LLILLL;
            RecyclerView recyclerView2 = candHelper.LIZLLL;
            if (recyclerView2 != null) {
                recyclerView = recyclerView2;
            }
            HandlerHook.viewPost(recyclerView, new ARunnableS116S0100000_16(candHelper, 45));
        } else {
            C1389880mGw c1389880mGw = new C1389880mGw(this.LLILLL.LIZIZ);
            c1389880mGw.LJIIIIZZ(2131832705);
            c1389880mGw.LIZLLL(1000L);
            c1389880mGw.LJ(R.raw.icon_exclamation_mark_triangle_fill);
            c1389880mGw.LJI(R.attr.a1h);
            c1389880mGw.LJIIJ();
            C1745560vWc c1745560vWc4 = this.LLILLL.LJ;
            if (c1745560vWc4 != null) {
                c1745560vWc = c1745560vWc4;
            }
            c1745560vWc.notifyItemChanged(this.LLILZ);
        }
        return Unit.LIZ;
    }
}
