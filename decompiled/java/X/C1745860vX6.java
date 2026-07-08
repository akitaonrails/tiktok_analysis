package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS43S0310000_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vX6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder$onBind$2$6$2", f = "PhoneInputItemViewHolder.kt", l = {271}, m = "invokeSuspend")
public final class C1745860vX6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PhoneInputItemViewHolder LLILLJJLI;
    public final /* synthetic */ C1745680vWo LLILLL;
    public final /* synthetic */ C1745300vWC LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745860vX6(PhoneInputItemViewHolder phoneInputItemViewHolder, C1745680vWo c1745680vWo, C1745300vWC c1745300vWC, boolean z, InterfaceC1364105Vn<? super C1745860vX6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = phoneInputItemViewHolder;
        this.LLILLL = c1745680vWo;
        this.LLILZ = c1745300vWC;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1745860vX6(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1745680vWo next;
        Pair pair;
        Object objYS2 = obj;
        C1C7U.LIZ("PhoneInputItemViewHolder@de87.onBind$2$6$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objYS2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objYS2);
            List<C1745680vWo> listXR2 = this.LLILLJJLI.c6().XR2();
            C1745680vWo c1745680vWo = this.LLILLL;
            Iterator<C1745680vWo> it2 = listXR2.iterator();
            while (true) {
                str = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ.key, c1745680vWo.LIZ.key)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1745680vWo c1745680vWo2 = next;
            if (c1745680vWo2 != null) {
                c1745680vWo2.LIZIZ = this.LLILLL.LIZIZ;
                c1745680vWo2.LIZ = this.LLILLL.LIZ;
                c1745680vWo2.LIZJ = this.LLILLL.LIZJ;
            }
            Object obj2 = this.LLILLL.LIZIZ;
            if (obj2 instanceof Pair) {
                pair = (Pair) obj2;
            } else {
                pair = null;
            }
            AddressEditViewModel addressEditViewModelC6 = this.LLILLJJLI.c6();
            C1745680vWo c1745680vWo3 = this.LLILLL;
            if (pair != null) {
                str = (String) pair.getSecond();
            }
            this.LL = 1;
            objYS2 = addressEditViewModelC6.yS2(c1745680vWo3, str, this);
            if (objYS2 == objLJFF) {
                C1C7U.LIZIZ("PhoneInputItemViewHolder@de87.onBind$2$6$2");
                return objLJFF;
            }
        }
        C1745340vWG c1745340vWG = (C1745340vWG) objYS2;
        this.LLILZ.LJFF(c1745340vWG);
        if (this.LLILLJJLI.LLJJIJI != -1) {
            AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
            if (addressEditFragment != null) {
                C1748720vbi.LIZIZ(addressEditFragment, new C10511049d(), new AwS43S0310000_26(this.LLILLL, this.LLILLJJLI, this.LLILZIL, c1745340vWG, 1));
            }
            this.LLILLJJLI.LLJJIJI = -1L;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhoneInputItemViewHolder@de87.onBind$2$6$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
