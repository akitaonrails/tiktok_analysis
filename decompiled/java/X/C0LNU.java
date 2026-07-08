package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LNU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.openstory.base.OpenStoryBaseManager$dismissLoadingDialog$1", f = "OpenStoryBaseManager.kt", l = {}, m = "invokeSuspend")
public final class C0LNU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0LNW<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LNU(C0LNW<T> c0lnw, InterfaceC1364105Vn<? super C0LNU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0lnw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LNU(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenStoryBaseManager@d6cb.dismissLoadingDialog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DialogC1389620mGW dialogC1389620mGW = this.LL.LIZJ;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        this.LL.LIZJ = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OpenStoryBaseManager@d6cb.dismissLoadingDialog$1");
        return unit;
    }
}
