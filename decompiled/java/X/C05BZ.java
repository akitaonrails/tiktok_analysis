package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tako.setting.TakoWsConfigInfoModel;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05BZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05BZ {
    public static final TakoWsConfigInfoModel LIZ = new TakoWsConfigInfoModel(false, 0);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final long LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1126));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((TakoWsConfigInfoModel) c01gwLIZIZ.getValue()).enableConnection;
        LIZLLL = ((TakoWsConfigInfoModel) c01gwLIZIZ.getValue()).keepAliveTimeInterval * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
