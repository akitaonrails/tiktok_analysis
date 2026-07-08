package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS48S1300000_8;

/* JADX INFO: renamed from: X.0MV6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MV6 extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ C0MV0 LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ LifecycleOwner LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MV6(C118300cf c118300cf, C118300cf c118300cf2, C0MV0 c0mv0, Activity activity, LifecycleOwner lifecycleOwner, String str) {
        super(1);
        this.LL = c118300cf;
        this.LLILLJJLI = c118300cf2;
        this.LLILLL = c0mv0;
        this.LLILZ = activity;
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LJFF(this.LL.element, new AwS48S1300000_8(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, 7));
        c1397620mTQ2.LJII(this.LLILLJJLI.element, new AwS374S0200000_8(this.LLILLL, this.LLILZ, this.LLILZLL, 225));
        return Unit.LIZ;
    }
}
