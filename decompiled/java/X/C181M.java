package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.model.message.Img;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import webcast.data.oec_msg.ProductItem;

/* JADX INFO: renamed from: X.181M, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C181M extends AbstractC21202917yF {
    public UsPopupCardVO LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public C182K LLIZLLLIL;
    public final AwS646S0100000_32 LLJ;
    public final AwS611S0100000_32 LLJI;

    @Override // X.InterfaceC21197417xM
    public final void A(int i, C184F c184f) {
    }

    @Override // X.InterfaceC21184217vE
    public final void LJJIIZI(String str, Img img) {
    }

    @Override // X.InterfaceC21197417xM
    public final void LJJIL() {
    }

    @Override // X.InterfaceC21184217vE
    public final void LJJLIIIJILLIZJL(boolean z) {
    }

    @Override // X.InterfaceC21184217vE
    public final boolean LLLLLZ() {
        return false;
    }

    @Override // X.InterfaceC21184217vE
    public final void U(ProductItem productItem, C1563990qnl c1563990qnl) {
    }

    @Override // X.AbstractC21202917yF
    public final boolean h0() {
        return false;
    }

    public void l0() {
    }

    @Override // X.AbstractC21202917yF
    public void setAtmosphereTags(List<C184F> list) {
    }

    @Override // X.AbstractC21202917yF, X.InterfaceC21184217vE
    public List<String> getProductShowIds() {
        List<String> list;
        C182K c182k = this.LLIZLLLIL;
        return (c182k == null || (list = (List) c182k.LJIIJ.getValue()) == null) ? C13BV.INSTANCE : list;
    }

    @Override // X.AbstractC21202917yF
    public Map<String, String> getPromotionLogoDaInfo() {
        return new LinkedHashMap();
    }

    @Override // X.AbstractC21202917yF
    public Map<String, String> getCommonShowParams() {
        return C2097608Jq.LJ();
    }

    public final C182K getProductViewController() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1865210ydb
    public final Map<String, String> LJLLL(String str) {
        return new LinkedHashMap();
    }

    public final void setProductViewController(C182K c182k) {
        this.LLIZLLLIL = c182k;
    }

    public C181M(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJ = new AwS646S0100000_32(this, 6);
        this.LLJI = new AwS611S0100000_32(this, 17);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (!getShown()) {
            setShown(true);
            InterfaceC212166181c popCardViewCallback = getPopCardViewCallback();
            if (popCardViewCallback != null) {
                popCardViewCallback.LJ();
            }
            l0();
        }
        if (z) {
            boolean zO1 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().o1();
            int i5 = i3 - i;
            int iLIZ = C1210230hbB.LIZ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, getContext());
            if (!zO1 && i5 >= iLIZ) {
                z2 = false;
            }
            if (z2 != this.LLILZLL) {
                this.LLILZLL = z2;
                if (this.LLILZIL != null) {
                    l0();
                }
            }
        }
    }

    @Override // X.AbstractC21202917yF
    public void j0(UsPopupCardVO usPopupCardVO, C1743900vTw c1743900vTw, Function2<? super Boolean, ? super String, Unit> function2, boolean z, boolean z2, int i) {
        this.LLILZIL = usPopupCardVO;
        this.LLILZLL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().o1();
        this.LLIZ = i;
    }
}
