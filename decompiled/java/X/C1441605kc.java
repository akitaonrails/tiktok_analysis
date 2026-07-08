package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel$onPrepared$1$1", f = "SellerMessageListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1441605kc extends C09AX implements InterfaceC1631620sYq<List<? extends C0YX2>, Boolean, InterfaceC1364105Vn<? super Pair<? extends List<? extends C0YX2>, ? extends Boolean>>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C1441605kc(InterfaceC1364105Vn<? super C1441605kc> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SellerMessageListViewModel@16a7.onPrepared$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = new Pair(this.LL, Boolean.valueOf(this.LLILLJJLI));
        C1C7U.LIZIZ("SellerMessageListViewModel@16a7.onPrepared$1$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(List<? extends C0YX2> list, Boolean bool, InterfaceC1364105Vn<? super Pair<? extends List<? extends C0YX2>, ? extends Boolean>> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C1441605kc c1441605kc = new C1441605kc(interfaceC1364105Vn);
        c1441605kc.LL = list;
        c1441605kc.LLILLJJLI = zBooleanValue;
        return c1441605kc.invokeSuspend(Unit.LIZ);
    }
}
