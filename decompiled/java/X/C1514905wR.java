package X;

import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05wR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem$onViewCreated$27$1$1$1$2$1", f = "MixStudioHomePageAssem.kt", l = {}, m = "invokeSuspend")
public final class C1514905wR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TuxTextView LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1514905wR(TuxTextView tuxTextView, boolean z, InterfaceC1364105Vn<? super C1514905wR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = tuxTextView;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1514905wR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("MixStudioHomePageAssem@94b0.onViewCreated$27$1$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TuxTextView tuxTextView = this.LL;
        if (this.LLILLJJLI) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextView);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.onViewCreated$27$1$1$1$2$1");
        return unit;
    }
}
