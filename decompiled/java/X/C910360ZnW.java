package X;

import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZnW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.views.GreetingCardPopupView$setAlphaPlayerPlayingUI$1$1", f = "GreetingCardPopupView.kt", l = {}, m = "invokeSuspend")
public final class C910360ZnW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DataSource LL;
    public final /* synthetic */ C910370ZnX LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ List<C909870Zmj> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910360ZnW(DataSource dataSource, C910370ZnX c910370ZnX, Function0<Unit> function0, Function0<Unit> function02, List<C909870Zmj> list, boolean z, InterfaceC1364105Vn<? super C910360ZnW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dataSource;
        this.LLILLJJLI = c910370ZnX;
        this.LLILLL = function0;
        this.LLILZ = function02;
        this.LLILZIL = list;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C910360ZnW(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GreetingCardPopupView@4419.setAlphaPlayerPlayingUI$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            C1390410mHn c1390410mHn = this.LLILLJJLI.LLILZ;
            if (c1390410mHn != null) {
                c1390410mHn.LIZLLL();
            }
            C1584506Ih.LIZ(this.LLILLJJLI.LLILZ);
            C197039127h c197039127h = this.LLILLJJLI.LLJILLL;
            if (c197039127h != null) {
                c197039127h.setLoading(false);
            }
            Function0<Unit> function0 = this.LLILLL;
            if (function0 == null) {
                function0 = this.LLILZ;
            }
            function0.invoke();
        } else {
            this.LLILLJJLI.LIZ(this.LLILZIL, this.LLILZLL, this.LL, this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GreetingCardPopupView@4419.setAlphaPlayerPlayingUI$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
