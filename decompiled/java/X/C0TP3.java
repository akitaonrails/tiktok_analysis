package X;

import Y.AcS495S0100000_12;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.wallet.LiveMoneyPlatformFeedbackLinkMapping;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS161S1100000_12;

/* JADX INFO: renamed from: X.0TP3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TP3 {
    public static final C0TP3 LIZ = new C0TP3();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(232));

    public static AwS161S1100000_12 LIZIZ(Context context, String str, C0KPG c0kpg) {
        EnumC1792020wjY enumC1792020wjY;
        LiveMoneyPlatformFeedbackLinkMapping liveMoneyPlatformFeedbackLinkMapping = LiveMoneyPlatformFeedbackLinkMapping.INSTANCE;
        C0KQW c0kqw = c0kpg.LIZLLL;
        if (c0kqw == null || (enumC1792020wjY = c0kqw.LIZ) == null) {
            enumC1792020wjY = EnumC1792020wjY.UNDEFINED;
        }
        return new AwS161S1100000_12(context, liveMoneyPlatformFeedbackLinkMapping.getFeedbackUrl(str, enumC1792020wjY.getValue()), 0);
    }

    public static void LIZ(Context context, String str, String str2, int i, Function0 function0) {
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZJ = str;
        c782110Um9.LJIIIZ(str2);
        c782110Um9.LJIILIIL(i, new AcS495S0100000_12(function0, 27));
        c782110Um9.LJIIJ(2131851998, new C304701Gb());
        c782110Um9.LJIILLIIL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }
}
