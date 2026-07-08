package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS109S1200000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vX7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder$autoFillLogNode$1$1", f = "PhoneInputItemViewHolder.kt", l = {334}, m = "invokeSuspend")
public final class C1745870vX7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PhoneInputItemViewHolder LLILLJJLI;
    public final /* synthetic */ C1745680vWo LLILLL;
    public final /* synthetic */ C1745300vWC LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745870vX7(PhoneInputItemViewHolder phoneInputItemViewHolder, C1745680vWo c1745680vWo, C1745300vWC c1745300vWC, String str, InterfaceC1364105Vn<? super C1745870vX7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = phoneInputItemViewHolder;
        this.LLILLL = c1745680vWo;
        this.LLILZ = c1745300vWC;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1745870vX7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        C1C7U.LIZ("PhoneInputItemViewHolder@de87.autoFillLogNode$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AddressEditViewModel addressEditViewModelC6 = this.LLILLJJLI.c6();
            C1745680vWo c1745680vWo = this.LLILLL;
            Object obj2 = c1745680vWo.LIZIZ;
            String str = null;
            if ((obj2 instanceof Pair) && (pair = (Pair) obj2) != null) {
                str = (String) pair.getSecond();
            }
            this.LL = 1;
            obj = addressEditViewModelC6.yS2(c1745680vWo, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PhoneInputItemViewHolder@de87.autoFillLogNode$1$1");
                return objLJFF;
            }
        }
        C1745340vWG c1745340vWG = (C1745340vWG) obj;
        this.LLILZ.LJFF(c1745340vWG);
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C10511049d(), new AwS109S1200000_26(this.LLILZIL, this.LLILLJJLI, c1745340vWG, 20));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhoneInputItemViewHolder@de87.autoFillLogNode$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
