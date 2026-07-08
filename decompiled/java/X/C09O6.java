package X;

import com.ss.android.ugc.aweme.share.SystemShareActivity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09O6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleMediaType$1$1", f = "SystemShareActivity.kt", l = {}, m = "invokeSuspend")
public final class C09O6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SystemShareActivity LL;
    public final /* synthetic */ C09O8 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09O6(SystemShareActivity systemShareActivity, C09O8 c09o8, String str, InterfaceC1364105Vn<? super C09O6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = systemShareActivity;
        this.LLILLJJLI = c09o8;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09O6(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("SystemShareActivity@a089.handleMediaType$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1B4P c1b4p = this.LL.LL;
        if (this.LLILLJJLI == C09O8.IMAGE) {
            i = 1;
        } else {
            i = 2;
        }
        c1b4p.LIZ = i;
        c1b4p.LIZIZ = Collections.singletonList(this.LLILLL);
        this.LL.LLLZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SystemShareActivity@a089.handleMediaType$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
