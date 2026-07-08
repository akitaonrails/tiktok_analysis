package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.ISeaTrackHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0w0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764210w0h extends AbstractC1764160w0c<C1765010w1z> implements InterfaceC1765250w2N {
    public C1764590w1J LLJJIJI;
    public final Map<String, Object> LLJJIJIIJIL;
    public final Map<String, Object> LLJJIJIL;

    @Override // X.InterfaceC1765250w2N
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC1765250w2N
    public final void LJLIIIL(int i, String str) {
    }

    @Override // X.InterfaceC1765250w2N
    public final void LLLLZIL() {
    }

    @Override // X.InterfaceC1765250w2N
    public final void O3(Integer num, String str) {
    }

    @Override // X.InterfaceC1765250w2N
    public final void Z3() {
    }

    @Override // X.InterfaceC1765250w2N
    public final void b4() {
    }

    @Override // X.AbstractC1764160w0c
    public final InterfaceC1066204Ey L5() {
        C1764590w1J c1764590w1J = new C1764590w1J();
        this.LLJJIJI = c1764590w1J;
        return c1764590w1J;
    }

    @Override // X.AbstractC1764160w0c
    public final void T5(C1765010w1z c1765010w1z) {
        String str;
        C1764340w0u c1764340w0u;
        C1764510w1B c1764510w1BYN;
        List<C04G1> list;
        int size;
        this.LLJJIJIL.put("header_list_index", Integer.valueOf(getBindingAdapterPosition()));
        int bindingAdapterPosition = getBindingAdapterPosition();
        int bindingAdapterPosition2 = getBindingAdapterPosition() + 1;
        ISeaListHelper iSeaListHelperR5 = R5();
        if (iSeaListHelperR5 != null && (c1764510w1BYN = iSeaListHelperR5.yN()) != null && (list = c1764510w1BYN.LIZIZ) != null && (size = list.size()) > 1) {
            if (bindingAdapterPosition == 0) {
                str = "first";
            } else if (bindingAdapterPosition == size - 1) {
                str = "last";
            } else {
                str = "middle";
            }
        } else {
            str = "single";
        }
        C1764590w1J c1764590w1J = this.LLJJIJI;
        if (c1764590w1J != null) {
            c1764590w1J.LIZ.put("position_rank", Integer.valueOf(bindingAdapterPosition2));
            c1764590w1J.LIZ.put("position_type", str);
        }
        View view = this.itemView;
        Map<String, Object> mapW50 = null;
        if (view instanceof C1764340w0u) {
            c1764340w0u = (C1764340w0u) view;
            if (c1764340w0u != null) {
                Map<String, Object> map = this.LLJJIJIIJIL;
                ISeaHeadContainerHelper iSeaHeadContainerHelperP5 = P5();
                if (iSeaHeadContainerHelperP5 != null) {
                    mapW50 = iSeaHeadContainerHelperP5.w50();
                }
                Map<String, Object> map2 = this.LLJJIJIL;
                c1764340w0u.LLIZLLLIL = map;
                c1764340w0u.LLJ = mapW50;
                c1764340w0u.LLJI = map2;
            }
        } else {
            c1764340w0u = null;
        }
        C04G1 c04g1 = this.LLILLL;
        if (c04g1 != null && c1764340w0u != null) {
            c1764340w0u.LIZIZ(this, c04g1);
        }
    }

    @Override // X.AbstractC1764160w0c
    public final void W5(EnumC1764120w0Y enumC1764120w0Y) {
        this.LLJJIJIL.put("visible", 0);
    }

    public C1764210w0h(ViewGroup viewGroup, InterfaceC665370Q7z interfaceC665370Q7z) {
        super(new C1764340w0u(viewGroup.getContext(), interfaceC665370Q7z, 6), interfaceC665370Q7z);
        this.LLJJIJIIJIL = new LinkedHashMap();
        this.LLJJIJIL = new LinkedHashMap();
    }

    @Override // X.AbstractC1764160w0c
    public final void X5(int i, EnumC1764120w0Y enumC1764120w0Y) {
        ISeaTrackHelper iSeaTrackHelperS5;
        this.LLJJIJIL.put("visible", 1);
        C04G1 c04g1 = this.LLILLL;
        if (c04g1 != null && (iSeaTrackHelperS5 = S5()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("photo_type", "review");
            iSeaTrackHelperS5.O10(c04g1, i, enumC1764120w0Y, linkedHashMap);
        }
    }
}
