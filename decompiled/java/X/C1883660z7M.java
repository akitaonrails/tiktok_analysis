package X;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z7M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883660z7M extends C09AY implements Function1<MotionEvent, Boolean> {
    public final /* synthetic */ C1883540z7A LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883660z7M(C1883540z7A c1883540z7A) {
        super(1);
        this.LL = c1883540z7A;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(MotionEvent motionEvent) {
        return Boolean.valueOf(this.LL.LJIIIZ);
    }
}
