package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0FBZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FBZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C385880FBa LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FBZ(C385880FBa c385880FBa, boolean z, long j, long j2) {
        super(0);
        this.LL = c385880FBa;
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        View view = this.LL.mView;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (!this.LLILLJJLI) {
            this.LL.LLLLIL().LJIIJ.invoke();
        }
        this.LL.LLLLIL().LJIJ.invoke();
        this.LL.LLLLLL().LJJIII(this.LLILLL, this.LLILZ, System.currentTimeMillis(), C0F8Y.LJIIIIZZ(this.LL.LLLLILI().LIZ.LIZ));
        return Unit.LIZ;
    }
}
