package X;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Gke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424460Gke extends C09AY implements Function0<C1295960jpS> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C1609500rzA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C424460Gke(Context context, C1609500rzA c1609500rzA) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = c1609500rzA;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C1295960jpS invoke() {
        C1295960jpS c1295960jpS = new C1295960jpS(this.LL);
        C1609500rzA c1609500rzA = this.LLILLJJLI;
        c1295960jpS.setRepeatCount(-1);
        C786410Ut5.LLD(8, c1295960jpS);
        c1609500rzA.addView(c1295960jpS, new FrameLayout.LayoutParams(c1609500rzA.getWidth(), c1609500rzA.getHeight()));
        return c1295960jpS;
    }
}
