package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.adapter.ISeaPdpListUIRegisterService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.register.CardRegisterProvider;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755420vmW extends AbstractC1748520vbO<Object> {
    public final ECBaseFragment LLILZIL;
    public final C987903td LLILZLL;
    public final Function1<Integer, Unit> LLIZ;

    @Override // X.AbstractC1747950vaT
    public final void LLLIILIL(C19465311Dn c19465311Dn) {
        Object obj;
        Integer numLJIIJJI;
        Object obj2;
        String string;
        CardRegisterProvider cardRegisterProvider;
        Map map;
        Map<String, Object> map2 = this.LLILLL;
        Object obj3 = null;
        if (map2 != null) {
            obj = map2.get("card_register");
        } else {
            obj = null;
        }
        if ((obj instanceof CardRegisterProvider) && (cardRegisterProvider = (CardRegisterProvider) obj) != null && (map = (Map) cardRegisterProvider.LLILLJJLI.getValue()) != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                AbstractC1764430w13 abstractC1764430w13 = (AbstractC1764430w13) ((Map.Entry) it2.next()).getValue();
                abstractC1764430w13.getClass();
                c19465311Dn.LJFF(new AwS392S0200000_26(abstractC1764430w13, (AbstractC1764430w13<AbstractC1066304Ez, AbstractC1764350w0v<Object, Object>, C1764410w11<Object>>) this, (C1755420vmW) 87), new AwS605S0100000_26(abstractC1764430w13, (AbstractC1764430w13<AbstractC1066304Ez, AbstractC1764350w0v<Object, Object>, C1764410w11<Object>>) this, (C1755420vmW) 436), null);
            }
        }
        new Object() { // from class: X.0vmZ
        }.getClass();
        Map<String, Object> map3 = this.LLILLL;
        if (map3 != null && (obj2 = map3.get("biz_type")) != null && (string = obj2.toString()) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(string);
        } else {
            numLJIIJJI = null;
        }
        EnumC955203oM enumC955203oMLIZ = C955103oL.LIZ(numLJIIJJI);
        Map<String, Object> map4 = this.LLILLL;
        if (map4 != null) {
            obj3 = map4.get("biz_env");
        }
        if (!(obj3 instanceof C987903td) || obj3 == null) {
            int iLJIIJJI = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, enumC955203oMLIZ, "product_detail", null, null, 12);
            C969603qg c969603qg = EnumC969503qf.Companion;
            String bizName = enumC955203oMLIZ.getBizName();
            c969603qg.getClass();
            C969603qg.LIZIZ(iLJIIJJI, "product_detail", bizName);
        }
        Iterator it3 = ServiceManager.get().getServices(ISeaPdpListUIRegisterService.class).iterator();
        while (it3.hasNext()) {
            ((ISeaPdpListUIRegisterService) it3.next()).LIZ(this, c19465311Dn);
        }
    }

    public final void LLLIL(Set<String> set) {
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()) {
            this.LLILZ.LJFF(new AwS140S1100000_26(this, it2.next(), 53), AFwS268S0000000_26.get$arr$(712), null);
        }
    }

    @Override // X.C11DY, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        return this.LLILZ.LIZIZ(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C21681819tI c21681819tI;
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof AbsFullSpanVH) {
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null) {
                c21681819tI.LLILLJJLI = true;
            }
        }
        if (viewHolder instanceof InterfaceC1755440vmY) {
            ((InterfaceC1755440vmY) viewHolder).onViewAttachedToWindow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof InterfaceC1755440vmY) {
            ((InterfaceC1755440vmY) viewHolder).onViewDetachedFromWindow();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof AbsCardVH) {
            ((AbsCardVH) viewHolder).e6();
        }
    }

    @Override // X.C11DY, X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Function1<Integer, Unit> function1;
        super.onBindViewHolder(viewHolder, i, list);
        if ((viewHolder instanceof AbsFullSpanVH) && i >= 0 && (function1 = this.LLIZ) != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0vma] */
    public C1755420vmW(final SeaPdpFragment seaPdpFragment, final Integer num, final C987903td c987903td, final CardRegisterProvider cardRegisterProvider, Function1 function1) {
        final ?? r2 = new AbstractC339510DSr<Object>() { // from class: X.0vma
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(Object obj, Object obj2) {
                if ((obj instanceof AbstractC1764350w0v) && (obj2 instanceof AbstractC1764350w0v)) {
                    if (obj == obj2) {
                        return true;
                    }
                    return false;
                }
                return Intrinsics.LJFF(obj, obj2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(Object obj, Object obj2) {
                if ((obj instanceof AbstractC1764350w0v) && (obj2 instanceof AbstractC1764350w0v)) {
                    C04FY c04fy = ((AbstractC1764400w10) obj).LLILZIL.LJIILL;
                    C04FY c04fy2 = ((AbstractC1764400w10) obj2).LLILZIL.LJIILL;
                    String str = null;
                    if (c04fy != null && c04fy.LIZLLL != null) {
                        String str2 = c04fy.LIZLLL;
                        if (c04fy2 != null) {
                            str = c04fy2.LIZLLL;
                        }
                        if (Intrinsics.LJFF(str2, str)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return Intrinsics.LJFF(obj.getClass(), obj2.getClass());
            }
        };
        new AbstractC1747950vaT<T>(seaPdpFragment, r2, num, c987903td, cardRegisterProvider) { // from class: X.0vbO
            {
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("biz_type", num), new Pair("region", null), new Pair("page_name", "product_detail"), new Pair("template", null), new Pair("biz_env", c987903td), new Pair("card_register", cardRegisterProvider));
            }
        };
        this.LLILZIL = seaPdpFragment;
        this.LLILZLL = c987903td;
        this.LLIZ = function1;
    }
}
