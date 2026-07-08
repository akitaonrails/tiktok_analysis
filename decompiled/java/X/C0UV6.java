package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UV6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UV6 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function1<Integer, Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0UV6(Activity activity, int i, Function1<? super Integer, Unit> function1, Function0<Unit> function0, String str) {
        super(0);
        this.LL = activity;
        this.LLILLJJLI = i;
        this.LLILLL = function1;
        this.LLILZ = function0;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z = C925080aBG.LIZ;
        Activity activity = this.LL;
        C0UV0.LiveResource.checkInstall(activity, "interact", new C0UV5(activity, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL));
        return Unit.LIZ;
    }
}
