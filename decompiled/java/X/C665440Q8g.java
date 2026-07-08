package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Q8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665440Q8g extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ Lifecycle LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665440Q8g(LifecycleOwner lifecycleOwner, Lifecycle lifecycle, String str) {
        super(0);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1563370qml.LIZ(this.LL, EnumC682280QpW.MAIN, new C665380Q8a(this.LLILLJJLI, this.LLILLL));
        return Unit.LIZ;
    }
}
