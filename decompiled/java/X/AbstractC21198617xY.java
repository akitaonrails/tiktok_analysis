package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IFrameSlot;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;

/* JADX INFO: renamed from: X.17xY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21198617xY<T extends View> implements IFrameSlot, InterfaceC1740480vOQ, InterfaceC21184117vD, InterfaceC21181717up, InterfaceC21147917pN, InterfaceC21184317vF {
    public PopupCardVO LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(149));
    public int LLILLL = 1;
    public boolean LLILZ;
    public T LLILZIL;
    public AbstractC21194217wq LLILZLL;
    public AFwS223S0000000_32 LLIZ;
    public C1743900vTw LLIZLLLIL;
    public C09AY LLJ;
    public C09AY LLJI;
    public AwS646S0100000_32 LLJIJIL;
    public C09AY LLJILJIL;
    public C09AY LLJILJILJ;
    public C09AY LLJILLL;
    public C21194617wu LLJJ;
    public AwS611S0100000_32 LLJJI;

    public boolean LJJ() {
        return true;
    }

    public abstract void LJJIFFI(String str);

    public abstract Animation LJJII();

    public abstract Animation LJJIII();

    public abstract Animation LJJIIJZLJL();

    public abstract Map LJJIIZ();

    public abstract void LJJIJ(int i, AtmosphereTag atmosphereTag);

    public abstract T LJJIJIIJI(Context context);

    public abstract void LJJIJIIJIL(boolean z);

    public void LJJIJLIJ(String str) {
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // X.InterfaceC1748820vbs
    public final String getPageName() {
        return "pop_card";
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LJIIZILJ() {
        if (!C2274811E2d.LIZ() && LJJ()) {
            return LJJII();
        }
        if (((Boolean) this.LLILLJJLI.getValue()).booleanValue()) {
            return LJJIIJZLJL();
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LJIJ() {
        if (C2274811E2d.LIZ() || !LJJ()) {
            return null;
        }
        return LJJIII();
    }

    @Override // X.InterfaceC1748820vbs
    public final Map<String, String> Aa() {
        return C988803tm.LIZIZ;
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1748810vbr
    public final List<String> getRegisteredLane() {
        return C988803tm.LIZ;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final View LJIJI(Context context) {
        T t = (T) LJJIJIIJI(context);
        LJJIL(t, null, null);
        this.LLILZIL = t;
        AFwS223S0000000_32 aFwS223S0000000_32 = this.LLIZ;
        return t;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final void LJIJJ(String str) {
        ?? r0 = this.LLJILLL;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    public void LJJIJIL(PopupCardVO popupCardVO) {
        this.LL = popupCardVO;
    }

    public final void LJJIJL(PopupCardVO popupCardVO, boolean z) {
        List<Product> list;
        ArrayList arrayList = new ArrayList();
        if (popupCardVO != null) {
            if (popupCardVO.cardType == 2) {
                ShoppingBagList shoppingBagList = popupCardVO.shoppingBagList;
                if (shoppingBagList != null && (list = shoppingBagList.productList) != null) {
                    Iterator<Product> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LIZJ());
                    }
                }
            } else {
                String str = popupCardVO.imageUrlKey;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJI("pop_card", arrayList, EnumC1756020vnU.UNDEFINE);
        LJJIJIL(popupCardVO);
        if (popupCardVO != null) {
            this.LLILZ = false;
        }
        LJJIJIIJIL(z);
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }

    public final void LJJIL(View view, Function0<Unit> function0, Function0<Unit> function02) {
        C1756050vnX.LIZJ(view, this, function0, function02);
    }
}
