package X;

import com.ss.android.ugc.aweme.coldcache.exp.ColdCacheReportConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590620NEm extends C09AY implements Function0<Boolean> {
    public C590620NEm() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C590610NEl.LIZ.getClass();
        return Boolean.valueOf(((ColdCacheReportConfig) C590610NEl.LIZJ.getValue()).reportAfterFirstFrameOpt);
    }
}
