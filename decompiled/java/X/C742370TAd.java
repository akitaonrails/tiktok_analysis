package X;

import android.app.Activity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742370TAd extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ Activity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C742370TAd(Activity activity) {
        super(0);
        this.LL = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.LL.isDestroyed());
    }
}
