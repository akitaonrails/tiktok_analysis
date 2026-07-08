package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.network.INetwork;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0Hu9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455830Hu9 {
    public static boolean LJFF;
    public static final C455830Hu9 LIZ = new C455830Hu9();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(417));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(416));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2545));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(418));
    public static List<SetSticker> LJI = C13BV.INSTANCE;

    public static long LIZIZ() {
        return ((INetwork) PluggableExtentionKt.pluggableSpi$default(INetwork.class, false, false, false, 14, null)) != null ? r0.getServerTime() : System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static String LIZJ(String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.im.common.model.SetSticker>> r15) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C455830Hu9.LIZ(X.05Vn):java.lang.Object");
    }
}
