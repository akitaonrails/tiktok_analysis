package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VirtualInfoModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS49S0200000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03Ab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C798703Ab extends ConstraintLayout {
    public Function0<Unit> LL;
    public OrderSubmitAssemViewModel LLILLJJLI;
    public String LLILLL;
    public C719102rN LLILZ;
    public String LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;

    private final TuxTextView getContentText() {
        return (TuxTextView) this.LLIZLLLIL.getValue();
    }

    private final TuxTextView getHeaderText() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    public final ConstraintLayout getContainer() {
        return (ConstraintLayout) this.LLILZLL.getValue();
    }

    public C798703Ab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e0(UserVirtualInfo userVirtualInfo, VirtualInfoModule virtualInfoModule) {
        if (virtualInfoModule != null) {
            C03C8.LIZJ(getHeaderText(), virtualInfoModule.header, "order_submit_virtual_product", null);
            C03C8.LIZJ(getContentText(), virtualInfoModule.content, "order_submit_virtual_product", null);
            C12ES.LJIILL(0, this);
        } else {
            C0H1U.LIZIZ(this);
        }
        C786410Ut5.Y7(getContainer(), null);
        C786410Ut5.I7(new AkS49S0200000_1(this, userVirtualInfo, 0), getContainer());
    }

    public C798703Ab(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ap7, this, true);
        this.LLILZLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 651));
        this.LLIZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 653));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 652));
    }
}
