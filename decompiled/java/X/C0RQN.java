package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.biz.BizBottomAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.biz.BizTopAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.InteractInfoAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor;
import com.ss.android.ugc.feed.platform.performance.FeedInfraPerfConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS40S0200100_11;

/* JADX INFO: renamed from: X.0RQN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RQN {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static long LJFF() {
        if (C715260S3w.LIZJ()) {
            return System.nanoTime();
        }
        return 0L;
    }

    public static String LIZ(C0RQ5 c0rq5, EnumC697300RWu enumC697300RWu) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0rq5.getValue());
        sbLIZ.append('_');
        sbLIZ.append(enumC697300RWu.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(Object obj, C690870R8b c690870R8b) {
        VideoItemParams videoItemParams;
        Aweme aweme;
        String aid;
        if ((obj instanceof VideoItemParams) && (videoItemParams = (VideoItemParams) obj) != null && (aweme = videoItemParams.getAweme()) != null && (aid = aweme.getAid()) != null) {
            return aid;
        }
        if (c690870R8b == null) {
            return null;
        }
        return Integer.valueOf(c690870R8b.hashCode()).toString();
    }

    public static void LIZLLL(Object obj, EnumC697300RWu enumC697300RWu, long j) {
        C0RQO c0rqo;
        C0RQO c0rqo2;
        C0RQ5 c0rq5;
        Long l;
        if (C715260S3w.LIZJ()) {
            String strIg = null;
            if (obj instanceof C0RQO) {
                c0rqo = (C0RQO) obj;
            } else {
                c0rqo = null;
            }
            if (c0rqo instanceof C0RQO) {
                c0rqo2 = c0rqo;
            } else {
                c0rqo2 = null;
            }
            if (c0rqo2 instanceof InteractAreaComponent) {
                c0rq5 = C0RQ5.C_INTERACT_AREA;
            } else if (c0rqo2 instanceof InteractInfoAreaComponent) {
                c0rq5 = C0RQ5.C_INTERACT_INFO;
            } else if (c0rqo2 instanceof InteractRightAreaComponent) {
                c0rq5 = C0RQ5.C_INTERACT_RIGHT;
            } else if (c0rqo2 instanceof InteractBottomAreaComponent) {
                c0rq5 = C0RQ5.C_INTERACT_BOTTOM;
            } else if (c0rqo2 instanceof BizTopAreaComponent) {
                c0rq5 = C0RQ5.C_INTERACT_BIZ_TOP;
            } else if (c0rqo2 instanceof BizBottomAreaComponent) {
                c0rq5 = C0RQ5.C_INTERACT_BIZ_BOTTOM;
            } else if (c0rqo2 instanceof VideoTagContainer) {
                c0rq5 = C0RQ5.C_VIDEO_TAG;
            } else if (c0rqo2 instanceof FeedBottomButtonContainer) {
                c0rq5 = C0RQ5.C_BOTTOM_BUTTON;
            } else if (c0rqo2 instanceof InteractBottomBannerComponent) {
                c0rq5 = C0RQ5.C_BANNER;
            } else {
                c0rq5 = C0RQ5.C_DEFAULT;
            }
            Map map = (Map) FeedInfraPerfConfig.LJFF.getValue();
            if (map != null && (l = (Long) map.get(LIZ(c0rq5, enumC697300RWu))) != null) {
                long jLongValue = l.longValue();
                Thread.sleep(jLongValue);
                new AwS40S0200100_11(c0rq5, enumC697300RWu, jLongValue, 1);
                C695630RQj.LIZ();
            }
            C697790RYr c697790RYr = C697790RYr.LIZ;
            if (c0rqo != null) {
                strIg = c0rqo.Ig();
            }
            C697790RYr.LIZIZ(strIg, LIZ(c0rq5, enumC697300RWu), Long.valueOf((System.nanoTime() - j) / 100000), EnumC697820RYu.APPEND);
        }
    }

    public static void LIZJ(String str, EnumC695830RRd enumC695830RRd, EnumC697290RWt enumC697290RWt, String str2) {
        Integer num;
        if (str2 == null) {
            return;
        }
        if (C715260S3w.LIZIZ()) {
            C697790RYr c697790RYr = C697790RYr.LIZ;
            String end = enumC697290RWt.getEnd();
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(enumC695830RRd.getValue(), str2));
            EnumC697820RYu enumC697820RYu = EnumC697820RYu.APPEND;
            c697790RYr.getClass();
            C697790RYr.LIZJ(str, end, null, enumC697820RYu, mapLJIIJ, null);
        }
        C01GW c01gw = C715260S3w.LIZLLL;
        if (((Boolean) c01gw.getValue()).booleanValue() && !C1E7D.LIZ && ((Boolean) c01gw.getValue()).booleanValue()) {
            int i = C695820RRc.LIZ[enumC695830RRd.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            num = (Integer) ((Map) C0RQP.LIZ.getValue()).get(str2);
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        num = (Integer) ((Map) C0RQP.LIZIZ.getValue()).get(str2);
                    }
                } else {
                    num = (Integer) ((Map) C0RQP.LIZLLL.getValue()).get(str2);
                }
            } else {
                num = (Integer) ((Map) C0RQP.LIZJ.getValue()).get(str2);
            }
            if (num != null) {
                C08TN.LIZ().LIZ(num.intValue(), enumC695830RRd.getValue());
            }
        }
        if (((Boolean) C715260S3w.LJ.getValue()).booleanValue()) {
            FeedInfraTimingSensor.LL.getClass();
            InterfaceC1602960roc interfaceC1602960roc = (InterfaceC1602960roc) FeedInfraTimingSensor.LLJILJIL.getValue();
            if (interfaceC1602960roc != null) {
                interfaceC1602960roc.LIZ(enumC695830RRd.getValue(), str2);
            }
        }
    }

    public static void LJ(String str, C0RQ5 c0rq5, EnumC697300RWu enumC697300RWu, long j) {
        if (C715260S3w.LIZJ()) {
            C697790RYr c697790RYr = C697790RYr.LIZ;
            C697790RYr.LIZIZ(str, LIZ(c0rq5, enumC697300RWu), Long.valueOf((System.nanoTime() - j) / 100000), EnumC697820RYu.APPEND);
        }
    }
}
