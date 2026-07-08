package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884070YmD extends C09AY implements Function0<Boolean> {
    public C884070YmD() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AbstractC19994813Le.Default.nextInt(LSPassThroughRecordSizeConfig.DEFAULT) < C884080YmE.LIZ().emptyInboxMonitorSampleRate);
    }
}
