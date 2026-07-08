package X;

import java.text.SimpleDateFormat;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822820WPo extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C822810WPn LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C822820WPo(long j, long j2, long j3, C822810WPn c822810WPn) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = j3;
        this.LLILZ = c822810WPn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitProcessor isInBlockPeriod ---> lastExposureTime: ");
        sbLIZ.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(this.LL)));
        sbLIZ.append(" \n currentTime: ");
        sbLIZ.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(this.LLILLJJLI)));
        sbLIZ.append(" \n penaltyExpireTime: ");
        sbLIZ.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(this.LLILLL)));
        sbLIZ.append(", ruleId: ");
        sbLIZ.append(this.LLILZ.LIZIZ.getRuleId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
