package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0bM6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970240bM6 {
    public static int LIZ = 30;
    public static int LIZIZ = 10;
    public static int LIZJ = 10;

    public static final boolean LIZ() {
        Object obj;
        RandomLinkMicSetting.DisconnectJudge disconnectJudge;
        RandomLinkMicSetting.DisconnectJudge disconnectJudge2;
        LiveRandomLinkmicSetting liveRandomLinkmicSetting = LiveRandomLinkmicSetting.INSTANCE;
        RandomLinkMicSetting value = liveRandomLinkmicSetting.getValue();
        LIZ = value != null ? value.banTime : 30;
        liveRandomLinkmicSetting.getValue();
        RandomLinkMicSetting value2 = liveRandomLinkmicSetting.getValue();
        int i = 10;
        LIZIZ = (value2 == null || (disconnectJudge2 = value2.disconnectJudge) == null) ? 10 : disconnectJudge2.frequency;
        RandomLinkMicSetting value3 = liveRandomLinkmicSetting.getValue();
        if (value3 != null && (disconnectJudge = value3.disconnectJudge) != null) {
            i = disconnectJudge.period;
        }
        LIZJ = i;
        C1101510elp c1101510elp = new C1101510elp(Integer.valueOf(LIZIZ), InterfaceC934710aQn.xb.LIZIZ());
        List<E> list = c1101510elp.LIZIZ;
        if ((list != 0 ? list.size() : 0) < LIZIZ) {
            return false;
        }
        List<E> list2 = c1101510elp.LIZIZ;
        if (list2 == 0 || list2.size() <= 0) {
            obj = null;
        } else {
            obj = ListProtector.get(c1101510elp.LIZIZ, r1.size() - 1);
        }
        Double d = (Double) obj;
        return ((d != null ? (long) d.doubleValue() : 0L) + ((long) (LIZ * 60))) - (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) > 0;
    }

    public static final boolean LIZIZ() {
        C959600b4w c959600b4wC0 = C915980Zwa.LJIIIZ().c0();
        return (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - (c959600b4wC0 != null ? c959600b4wC0.LJIL : 0L) < ((long) LIZJ);
    }
}
