package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareVM;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0cEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004090cEh extends C09AY implements Function2<QuickShareButtonAssem, Double, Unit> {
    public C1004090cEh() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(QuickShareButtonAssem quickShareButtonAssem, Double d) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        QuickShareButtonAssem quickShareButtonAssem2 = quickShareButtonAssem;
        Double d2 = d;
        if (d2 != null) {
            d2.doubleValue();
            int iCeil = (int) Math.ceil(d2.doubleValue());
            C1004140cEm.LIZ.getClass();
            if (C1004140cEm.LIZ().playTimeTrigger <= 0) {
                i = 16000;
            } else {
                i = C1004140cEm.LIZ().playTimeTrigger;
            }
            int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
            QuickShareVM quickShareVMGp = quickShareButtonAssem2.Gp();
            quickShareVMGp.getClass();
            quickShareVMGp.setState(new C1004100cEi(iCeil));
            int i3 = ((C1004110cEj) quickShareButtonAssem2.Gp().getState()).LLILLJJLI;
            C724270Sb3 c724270Sb3 = quickShareButtonAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            int iCeil2 = (((int) Math.ceil(((VideoItemParams) obj).getAweme().getVideo().getDuration() / 1000.0f)) * i3) + iCeil;
            if (iCeil2 == i2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("playGetDurationEvent  current=");
                sbLIZ.append(iCeil);
                sbLIZ.append("  trigger=");
                sbLIZ.append(i2);
                sbLIZ.append(" currentCompleteTimes=");
                sbLIZ.append(i3);
                sbLIZ.append("  calDuration=");
                sbLIZ.append(iCeil2);
                C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handlePlayDurationNs ");
                C724270Sb3 c724270Sb32 = quickShareButtonAssem2.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                sbLIZ2.append(QuickShareButtonAssem.Ip((VideoItemParams) obj2));
                C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ2));
                C724270Sb3 c724270Sb33 = quickShareButtonAssem2.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                } else {
                    obj3 = null;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("watch_");
                sbLIZ3.append(i2);
                sbLIZ3.append('s');
                quickShareButtonAssem2.Vp((VideoItemParams) obj3, C2188811AlT.LIZIZ(sbLIZ3), null);
            }
        }
        return Unit.LIZ;
    }
}
