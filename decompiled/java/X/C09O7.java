package X;

import com.ss.android.ugc.aweme.share.SystemShareActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09O7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleMediaType$2$1", f = "SystemShareActivity.kt", l = {}, m = "invokeSuspend")
public final class C09O7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SystemShareActivity LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ C09O8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09O7(SystemShareActivity systemShareActivity, List<String> list, C09O8 c09o8, InterfaceC1364105Vn<? super C09O7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = systemShareActivity;
        this.LLILLJJLI = list;
        this.LLILLL = c09o8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09O7(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("SystemShareActivity@a089.handleMediaType$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SystemShareActivity systemShareActivity = this.LL;
        C1B4P c1b4p = systemShareActivity.LL;
        c1b4p.LIZIZ = this.LLILLJJLI;
        if (this.LLILLL == C09O8.IMAGE) {
            i = 3;
        } else {
            i = 4;
        }
        c1b4p.LIZ = i;
        systemShareActivity.LLLZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SystemShareActivity@a089.handleMediaType$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
