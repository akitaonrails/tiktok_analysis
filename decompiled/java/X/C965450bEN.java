package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostEnableMatchResumeSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bEN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C965450bEN extends C2217421BqW implements Function0<Unit> {
    public C965450bEN(C966020bFI c966020bFI) {
        super(0, c966020bFI, C966020bFI.class, "handleCrossLinkerResume", "handleCrossLinkerResume()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C966020bFI c966020bFI = (C966020bFI) this.receiver;
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleCrossLinkerResume");
        sbLIZ.append(" start cur channelId ");
        sbLIZ.append(c966020bFI.LIZLLL);
        sbLIZ.append(", source businees_multi_host_cross_resume");
        C1AZW.LJIIIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (LiveCohostEnableMatchResumeSetting.INSTANCE.isEnableCoHostResume() && !c966020bFI.LJIILIIL()) {
            c966020bFI.LJ().LJJJLZIJ(false);
        }
        return Unit.LIZ;
    }
}
