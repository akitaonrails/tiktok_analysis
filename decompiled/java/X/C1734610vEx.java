package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm.PcsFormVm;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734610vEx extends C09AY implements Function1<C1734460vEi, Unit> {
    public final /* synthetic */ PcsFormVm LL;
    public final /* synthetic */ String LLILLJJLI = "got_it";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734610vEx(PcsFormVm pcsFormVm) {
        super(1);
        this.LL = pcsFormVm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1734460vEi c1734460vEi) {
        if (Intrinsics.LJFF(c1734460vEi.LLILLL, C1246060iWy.LIZ)) {
            C1734710vF7.LIZIZ(this.LL.LLJIJIL, "click", C2097908Jt.LIZJ(new Pair("click_position", this.LLILLJJLI)));
        }
        this.LL.setState(new C1734590vEv());
        return Unit.LIZ;
    }
}
