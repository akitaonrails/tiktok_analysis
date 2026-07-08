package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17y8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21202217y8 extends ConstraintLayout implements InterfaceC21197317xL, InterfaceC21184117vD, InterfaceC21147917pN, InterfaceC21184317vF {
    public boolean LL;
    public C181I LLILLJJLI;
    public final C212254184m LLILLL;
    public final C185S LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC21184317vF
    public void LLLLLLIL() {
    }

    @Override // X.InterfaceC21184317vF
    public void LLLLLLJ(int i) {
    }

    public abstract /* synthetic */ Map<String, String> getCommonShowParams();

    public abstract /* synthetic */ List<String> getProductShowIds();

    public abstract Map<String, String> getPromotionLogoDaInfo();

    public abstract boolean h0();

    public abstract void i0(PopupCardVO popupCardVO, C1743900vTw c1743900vTw, Function0<Unit> function0, boolean z, boolean z2, int i);

    public abstract /* synthetic */ void setAtmosphereTags(List<AtmosphereTag> list);

    public void e0() {
        this.LLILLL.LIZIZ();
        this.LLILLL.LIZ.clear();
    }

    public final C212254184m getControllerLifecycleManager() {
        return this.LLILLL;
    }

    public final C185S getControllerShowParametersManager() {
        return this.LLILZ;
    }

    public List<String> getInnerItemsShowParamsProductPromotionTag() {
        return C13BV.INSTANCE;
    }

    public final C181I getPopCardViewCallback() {
        return this.LLILLJJLI;
    }

    public final boolean getShown() {
        return this.LL;
    }

    public final void setPopCardViewCallback(C181I c181i) {
        this.LLILLJJLI = c181i;
    }

    public final void setShown(boolean z) {
        this.LL = z;
    }

    public AbstractC21202217y8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = new C212254184m();
        this.LLILZ = new C185S();
    }
}
