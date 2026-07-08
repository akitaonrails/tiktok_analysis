package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.model.message.Img;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import webcast.data.oec_msg.ProductItem;

/* JADX INFO: renamed from: X.181K, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C181K extends AbstractC21202217y8 {
    public PopupCardVO LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public C182J LLJ;
    public final AwS646S0100000_32 LLJI;
    public final AwS611S0100000_32 LLJIJIL;

    @Override // X.InterfaceC21184117vD
    public final void LJJIIZI(String str, Img img) {
    }

    @Override // X.InterfaceC21197317xL
    public final void LJJIL() {
    }

    @Override // X.InterfaceC21184117vD
    public final void LJJLIIIJILLIZJL(boolean z) {
    }

    @Override // X.InterfaceC21197317xL
    public final void LLJJ(int i, AtmosphereTag atmosphereTag) {
    }

    @Override // X.InterfaceC21184117vD
    public final void b0(ProductItem productItem) {
    }

    @Override // X.AbstractC21202217y8
    public final boolean h0() {
        return false;
    }

    public void j0() {
    }

    @Override // X.AbstractC21202217y8
    public void setAtmosphereTags(List<AtmosphereTag> list) {
    }

    @Override // X.AbstractC21202217y8, X.InterfaceC21184117vD
    public List<String> getProductShowIds() {
        List<String> list;
        C182J c182j = this.LLJ;
        return (c182j == null || (list = (List) c182j.LJIIIZ.getValue()) == null) ? C13BV.INSTANCE : list;
    }

    @Override // X.AbstractC21202217y8
    public Map<String, String> getPromotionLogoDaInfo() {
        return new LinkedHashMap();
    }

    @Override // X.AbstractC21202217y8
    public Map<String, String> getCommonShowParams() {
        return C2097608Jq.LJ();
    }

    public final C182J getProductViewController() {
        return this.LLJ;
    }

    @Override // X.InterfaceC21147917pN
    public final Map<String, String> LLJJLIIIJLLLLLLLZ(int i) {
        return new LinkedHashMap();
    }

    public final void setProductViewController(C182J c182j) {
        this.LLJ = c182j;
    }

    public C181K(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJI = new AwS646S0100000_32(this, 32);
        this.LLJIJIL = new AwS611S0100000_32(this, 374);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (!getShown()) {
            setShown(true);
            C181I popCardViewCallback = getPopCardViewCallback();
            if (popCardViewCallback != null) {
                popCardViewCallback.LJ();
            }
            j0();
        }
        if (z) {
            boolean zO1 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().o1();
            int i5 = i3 - i;
            int iLIZ = C1210230hbB.LIZ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, getContext());
            if (!zO1 && i5 >= iLIZ) {
                z2 = false;
            }
            if (z2 != this.LLIZ) {
                this.LLIZ = z2;
                if (this.LLILZLL != null) {
                    j0();
                }
            }
        }
    }

    @Override // X.AbstractC21202217y8
    public void i0(PopupCardVO popupCardVO, C1743900vTw c1743900vTw, Function0<Unit> function0, boolean z, boolean z2, int i) {
        this.LLILZLL = popupCardVO;
        this.LLIZ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().o1();
        this.LLIZLLLIL = i;
    }
}
