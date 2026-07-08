package X;

import com.ss.android.ugc.aweme.experiment.ApmBodyHeaderAllowKeysModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0W8D, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W8D extends C09AY implements Function0<Boolean> {
    public C0W8D() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((ApmBodyHeaderAllowKeysModel) C0W8A.LIZJ.getValue()).globalInterceptorEnable);
    }
}
