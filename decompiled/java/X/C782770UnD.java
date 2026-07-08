package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782770UnD extends C09AY implements Function1<C782820UnI, Unit> {
    public final /* synthetic */ C0UX6 LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ C0UX6 LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C782770UnD(View view, LifecycleOwner lifecycleOwner, C0UX6 c0ux6, C0UX6 c0ux62, String str, Function1 function1) {
        super(1);
        this.LL = c0ux6;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = c0ux62;
        this.LLILZ = view;
        this.LLILZIL = function1;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C782820UnI c782820UnI) {
        C782820UnI c782820UnI2 = c782820UnI;
        if (c782820UnI2.LIZ == this.LL && this.LLILLJJLI.getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) <= 0) {
            RedDotExtensionKt.LJIILIIL(this.LLILLL, this.LLILZ, this.LLILZIL, c782820UnI2.LIZIZ, null, this.LLILZLL, 8);
        }
        return Unit.LIZ;
    }
}
