package X;

import Y.ARunnableS106S0100000_6;
import android.view.View;
import android.view.animation.Interpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421700GgC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C21646719nd LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ long LLILZIL = 250;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C421700GgC(C21646719nd c21646719nd, View view, float f, float f2) {
        super(0);
        this.LL = c21646719nd;
        this.LLILLJJLI = view;
        this.LLILLL = f;
        this.LLILZ = f2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        C21646719nd c21646719nd = this.LL;
        View view = this.LLILLJJLI;
        c21646719nd.getClass();
        view.getLocationInWindow(new int[2]);
        C786410Ut5.ed(this.LLILLJJLI, (this.LLILLL + this.LLILZ) - r1[1]);
        this.LLILLJJLI.animate().translationY(0.0f).setDuration(this.LLILZIL).setInterpolator((Interpolator) this.LL.LJI.getValue()).withEndAction(new ARunnableS106S0100000_6(this.LLILLJJLI, 201)).start();
        return Unit.LIZ;
    }
}
