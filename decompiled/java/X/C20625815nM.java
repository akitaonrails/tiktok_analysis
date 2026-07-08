package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15nM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20625815nM extends C09AY implements Function0<Activity> {
    public final /* synthetic */ C20608715kb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20625815nM(C20608715kb c20608715kb) {
        super(0);
        this.LL = c20608715kb;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Activity invoke() {
        this.LL.LIZIZ().LJ().getClass();
        return ActivityStack.getTopActivity();
    }
}
