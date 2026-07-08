package X;

import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ctv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel$getUserFlag$1$1", f = "ShareMoreViewModel.kt", l = {}, m = "invokeSuspend")
public final class C328290Ctv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShareMoreViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328290Ctv(ShareMoreViewModel shareMoreViewModel, String str, InterfaceC1364105Vn<? super C328290Ctv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shareMoreViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328290Ctv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareMoreViewModel@e3f8.getUserFlag$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJJ.setValue(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareMoreViewModel@e3f8.getUserFlag$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
