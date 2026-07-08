package X;

import com.ss.android.ugc.aweme.journey.step.swipeup.NujRevampViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10U0, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10U0 implements InterfaceC1735440vGI {
    public final /* synthetic */ long LL;
    public final /* synthetic */ NujRevampViewModel LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    @Override // X.InterfaceC1735440vGI
    public final void LJJI(long j) {
    }

    @Override // X.InterfaceC1735440vGI
    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Timer finished ");
        sbLIZ.append(this.LL);
        C1911410zq7.LIZ("NujRevampSwipeUp", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.LLILLJJLI = null;
        this.LLILLL.invoke();
    }

    @Override // X.InterfaceC1735440vGI
    public final void onStart() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Timer started ");
        sbLIZ.append(this.LL);
        C1911410zq7.LIZ("NujRevampSwipeUp", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C10U0(long j, NujRevampViewModel nujRevampViewModel, Function0<Unit> function0) {
        this.LL = j;
        this.LLILLJJLI = nujRevampViewModel;
        this.LLILLL = function0;
    }
}
