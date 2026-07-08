package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.SixTabButtonConfig;
import com.ss.android.ugc.aweme.im.push.api.IMPushApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0raw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@InterfaceC20647615qs("six_tab_create_guide")
public final class C1594480raw extends C10GR {
    public static boolean LLILZIL;
    public final Context LL;
    public final C1592950rYT LLILLJJLI;
    public final int LLILLL = 2000;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(464));

    public final Keva LJIIL() {
        return (Keva) this.LLILZ.getValue();
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        int iIntValue;
        int iIntValue2;
        if (C1908480zlO.LIZIZ.LJIIIZ(false)) {
            return false;
        }
        IMPushApi.LIZ.getClass();
        if (C817570W5j.LIZ().LIZLLL().LJIIJJI() || C1618630sDt.LIZIZ.isShowing() || LJIIL().getBoolean("has_enter_publish", false)) {
            return false;
        }
        int i = LJIIL().getInt("publish_tool_tip_show_count", 0);
        C01GW c01gw = C315230CXh.LIZIZ;
        Integer num = ((SixTabButtonConfig) c01gw.getValue()).createBubbleAppearTimes;
        if (num == null || num.intValue() == 0) {
            iIntValue = 2;
        } else {
            Integer num2 = ((SixTabButtonConfig) c01gw.getValue()).createBubbleAppearTimes;
            iIntValue = num2 != null ? num2.intValue() : 0;
        }
        if (i >= iIntValue) {
            return false;
        }
        long j = LJIIL().getLong("publish_tool_tip_show_time", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Integer num3 = ((SixTabButtonConfig) c01gw.getValue()).createBubbleIntervalTime;
        if (num3 == null || num3.intValue() == 0) {
            iIntValue2 = 172800000;
        } else {
            Integer num4 = ((SixTabButtonConfig) c01gw.getValue()).createBubbleIntervalTime;
            iIntValue2 = (num4 != null ? num4.intValue() : 0) * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT;
        }
        return jCurrentTimeMillis - j > ((long) iIntValue2);
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL);
        if (c19egLIZIZ != null) {
            return new C688120Qyw(this.LL, c19egLIZIZ, null);
        }
        return null;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    public C1594480raw(Context context, C1592950rYT c1592950rYT) {
        this.LL = context;
        this.LLILLJJLI = c1592950rYT;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        LLILZIL = true;
        LJIIL().storeLong("publish_tool_tip_show_time", System.currentTimeMillis());
        LJIIL().storeInt("publish_tool_tip_show_count", LJIIL().getInt("publish_tool_tip_show_count", 0) + 1);
        C450720Hlu c450720Hlu = new C450720Hlu(c688120Qyw.LIZ);
        C1592950rYT c1592950rYT = this.LLILLJJLI;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = c1592950rYT;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c450720Hlu.LLILLJJLI.LJFF = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        c450720Hlu.LJIIJ(2131834312);
        c450720Hlu.LIZJ(new AwS603S0100000_24(c20656615sK, 436));
        c450720Hlu.LIZIZ().show();
    }
}
