package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07RO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07RO extends C09AY implements Function0<Long> {
    public C07RO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(((long) ((Number) C07RN.LIZ.getValue()).intValue()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }
}
