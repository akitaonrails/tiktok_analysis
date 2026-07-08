package X;

import com.ss.android.ugc.aweme.component.phone.ttmobile.CollectMobileFromTTViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.phone.ttmobile.CollectMobileFromTTViewModel$onDataError$2", f = "CollectMobileFromTTViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1411330mpX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CollectMobileFromTTViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411330mpX(CollectMobileFromTTViewModel collectMobileFromTTViewModel, String str, String str2, String str3, InterfaceC1364105Vn<? super C1411330mpX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = collectMobileFromTTViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1411330mpX(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CollectMobileFromTTViewModel@b51d.onDataError$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new C1411340mpY(this.LLILLJJLI, this.LLILLL, this.LLILZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CollectMobileFromTTViewModel@b51d.onDataError$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
