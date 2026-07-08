package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.data.oec_msg.AuctionInfo;

/* JADX INFO: renamed from: X.17yF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21202917yF extends ConstraintLayout implements InterfaceC21197417xM, InterfaceC21184217vE, InterfaceC1865210ydb {
    public boolean LL;
    public InterfaceC212166181c LLILLJJLI;
    public final C182B LLILLL;
    public final C181O LLILZ;

    public abstract /* synthetic */ Map<String, String> getCommonShowParams();

    public abstract /* synthetic */ List<String> getProductShowIds();

    public abstract Map<String, String> getPromotionLogoDaInfo();

    public abstract boolean h0();

    public void i0(AuctionInfo auctionInfo, C1563990qnl c1563990qnl) {
    }

    public abstract void j0(UsPopupCardVO usPopupCardVO, C1743900vTw c1743900vTw, Function2<? super Boolean, ? super String, Unit> function2, boolean z, boolean z2, int i);

    public abstract /* synthetic */ void setAtmosphereTags(List<C184F> list);

    public void e0() {
        this.LLILLL.LIZIZ();
        this.LLILLL.LIZ.clear();
    }

    public final C182B getControllerLifecycleManager() {
        return this.LLILLL;
    }

    public final C181O getControllerShowParametersManager() {
        return this.LLILZ;
    }

    public List<String> getInnerItemsShowParamsProductPromotionTag() {
        return C13BV.INSTANCE;
    }

    public final InterfaceC212166181c getPopCardViewCallback() {
        return this.LLILLJJLI;
    }

    public final boolean getShown() {
        return this.LL;
    }

    public final void setPopCardViewCallback(InterfaceC212166181c interfaceC212166181c) {
        this.LLILLJJLI = interfaceC212166181c;
    }

    public final void setShown(boolean z) {
        this.LL = z;
    }

    public AbstractC21202917yF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = new C182B();
        this.LLILZ = new C181O();
    }
}
