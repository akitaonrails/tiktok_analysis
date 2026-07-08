package X;

import android.app.Application;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839450WwR extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ Application LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C839450WwR(Application application) {
        super(0);
        this.LL = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C145T.LIZ(this.LL) == 1);
    }
}
