package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IFrameSlot;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import webcast.data.oec_msg.AuctionInfo;

/* JADX INFO: renamed from: X.17xX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21198517xX<T extends View> implements IFrameSlot, InterfaceC1740480vOQ, InterfaceC21184217vE, InterfaceC21181817uq, InterfaceC1865210ydb {
    public UsPopupCardVO LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(154));
    public int LLILLL = 1;
    public boolean LLILZ;
    public T LLILZIL;
    public AbstractC21194117wp LLILZLL;
    public AFwS223S0000000_32 LLIZ;
    public C1743900vTw LLIZLLLIL;
    public C09AY LLJ;
    public C09AY LLJI;
    public AwS646S0100000_32 LLJIJIL;
    public C09AY LLJILJIL;
    public C09AY LLJILJILJ;
    public C09AY LLJILLL;
    public C21194517wt LLJJ;

    public abstract void LJIJJLI(String str);

    public abstract Animation LJIL();

    public abstract Animation LJJ();

    public abstract Animation LJJIFFI();

    public abstract Map LJJII();

    public abstract void LJJIII(int i, AtmosphereTag atmosphereTag);

    public void LJJIIJZLJL(AuctionInfo auctionInfo, C1563990qnl c1563990qnl) {
    }

    public abstract T LJJIIZ(Context context);

    public abstract void LJJIJ(boolean z);

    public abstract void LJJIJIIJI(Boolean bool);

    public void LJJIJL(String str) {
    }

    public abstract void LJJIJLIJ(String str);

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
        if (!C2274811E2d.LIZ()) {
            return LJIL();
        }
        if (((Boolean) this.LLILLJJLI.getValue()).booleanValue()) {
            return LJJIFFI();
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LJIJ() {
        if (C2274811E2d.LIZ()) {
            return null;
        }
        return LJJ();
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
        T t = (T) LJJIIZ(context);
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

    public void LJJIJIIJIL(UsPopupCardVO usPopupCardVO) {
        this.LL = usPopupCardVO;
    }

    public final void LJJIJIL(UsPopupCardVO usPopupCardVO, boolean z) {
        List<Product> list;
        ArrayList arrayList = new ArrayList();
        if (usPopupCardVO != null) {
            if (usPopupCardVO.cardType == 2) {
                ShoppingBagList shoppingBagList = usPopupCardVO.shoppingBagList;
                if (shoppingBagList != null && (list = shoppingBagList.productList) != null) {
                    Iterator<Product> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LIZJ());
                    }
                }
            } else {
                String str = usPopupCardVO.imageUrlKey;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJI("pop_card", arrayList, EnumC1756020vnU.UNDEFINE);
        LJJIJIIJIL(usPopupCardVO);
        if (usPopupCardVO != null) {
            this.LLILZ = false;
        }
        LJJIJ(z);
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }

    public final void LJJIL(View view, Function0<Unit> function0, Function0<Unit> function02) {
        C1756050vnX.LIZJ(view, this, function0, function02);
    }
}
