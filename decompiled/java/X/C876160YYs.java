package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerConversationViewHolder$setCache$1", f = "SellerConversationViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C876160YYs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1750690vet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C876160YYs(C1750690vet c1750690vet, InterfaceC1364105Vn<? super C876160YYs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1750690vet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C876160YYs(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SellerConversationViewHolder@fc2a.setCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLLFII = C876100YYm.LLJILJILJ.LLILZIL.getPigeonIMClient().LIZIZ.LJIIJJI().LLFII(String.valueOf(this.LL.LL));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLFII, 10));
        Iterator it2 = listLLFII.iterator();
        while (it2.hasNext()) {
            arrayList.add(C876170YYt.LIZIZ((C869590Y9l) it2.next()));
        }
        List<SellerMessage> listLJLJJLL = C13LP.LJLJJLL(arrayList);
        if (((!listLJLJJLL.isEmpty()) || (listLJLJJLL = this.LL.LLJIJIL) != null) && !listLJLJJLL.isEmpty()) {
            C2146308az c2146308az = C2146308az.LIZ;
            String str = this.LL.LLIZ;
            c2146308az.getClass();
            C2146308az.LIZJ(C2146308az.LIZIZ(str), C876170YYt.LIZ(this.LL.LLIZ), listLJLJJLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SellerConversationViewHolder@fc2a.setCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
