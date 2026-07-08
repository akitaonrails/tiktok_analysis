package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qa1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555470qa1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ C1555440qZy LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1555470qa1(LifecycleOwner lifecycleOwner, C1555440qZy c1555440qZy) {
        super(0);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = c1555440qZy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LifecycleOwner lifecycleOwner = this.LL;
        C1563370qml.LIZ(lifecycleOwner, EnumC682280QpW.MAIN, new C1555510qa5(lifecycleOwner, this.LLILLJJLI));
        return Unit.LIZ;
    }
}
