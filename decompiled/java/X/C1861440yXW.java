package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yXW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$carryInCard$1", f = "MessageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1861440yXW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MessageViewModel LL;
    public final /* synthetic */ C1863340yaa LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1861440yXW(MessageViewModel messageViewModel, C1863340yaa c1863340yaa, InterfaceC1364105Vn<? super C1861440yXW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = messageViewModel;
        this.LLILLJJLI = c1863340yaa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1861440yXW(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("MessageViewModel@9229.carryInCard$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.kR2(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.carryInCard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
