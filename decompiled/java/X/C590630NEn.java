package X;

import com.ss.android.ugc.aweme.coldcache.exp.ColdCacheReportConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590630NEn extends C09AY implements Function0<Boolean> {
    public C590630NEn() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C590610NEl.LIZ.getClass();
        return Boolean.valueOf(((ColdCacheReportConfig) C590610NEl.LIZJ.getValue()).reportBrandSafety);
    }
}
