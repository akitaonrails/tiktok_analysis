package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0TPF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TPF {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(508));
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;

    public final Keva LIZIZ() {
        return (Keva) this.LIZ.getValue();
    }

    public final void LJIIIZ() {
        C1022620cia.LJ("TTPlusKevaHelper", "START BLOCK");
        LIZIZ().storeLong(LIZ("block_start_date"), new Date().getTime());
        LIZIZ().storeInt(LIZ("card_dislike_count"), 0);
        LIZIZ().storeInt(LIZ("card_fast_skip_count"), 0);
        LIZIZ().storeBoolean(LIZ("enable_ad_record"), false);
        this.LJIILIIL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0TPF() {
        /*
            r2 = this;
            r2.<init>()
            r0 = 508(0x1fc, float:7.12E-43)
            kotlin.jvm.internal.AFwS199S0000000_12 r0 = kotlin.jvm.internal.AFwS199S0000000_12.get$arr$(r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            r2.LIZ = r0
            X.0TOM r0 = X.C0TOM.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings r0 = X.C0TOM.LIZIZ()
            if (r0 == 0) goto L84
            com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription r0 = r0.subscription
            if (r0 == 0) goto L84
            com.bytedance.ies.ugc.aweme.commercialize.compliance.model.FeedCardConfig r1 = r0.feedCardConfig
            if (r1 == 0) goto L85
            java.lang.Integer r0 = r1.cardReqGapMax
            if (r0 == 0) goto L85
            int r0 = r0.intValue()
        L2a:
            r2.LIZIZ = r0
            com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings$AdFreeSettings r0 = com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings.LIZ()
            int r0 = r0.cardStayTimeCap
            r2.LIZJ = r0
            if (r1 == 0) goto L7d
            java.lang.Integer r0 = r1.cardFrequencyCap
            if (r0 == 0) goto L7d
            int r0 = r0.intValue()
        L3e:
            r2.LIZLLL = r0
            com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings$AdFreeSettings r0 = com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings.LIZ()
            int r0 = r0.cardFrequencyTimeInterval
            r2.LJ = r0
            com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings$AdFreeSettings r0 = com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings.LIZ()
            int r0 = r0.cardBlockTimeInterval
            r2.LJFF = r0
            com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings$AdFreeSettings r0 = com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings.LIZ()
            int r0 = r0.frequencyCardDislikeCount
            r2.LJI = r0
            com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings$AdFreeSettings r0 = com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings.LIZ()
            int r0 = r0.frequencyCardFastSkippedCount
            r2.LJII = r0
            if (r1 == 0) goto L76
            java.lang.Integer r0 = r1.cardReqGapMin
            if (r0 == 0) goto L76
            int r0 = r0.intValue()
        L6a:
            r2.LJIIIIZZ = r0
            java.lang.String r0 = ""
            r2.LJIIJ = r0
            r0 = 1
            r2.LJIILL = r0
            r2.LJIJ = r0
            return
        L76:
            com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings$AdFreeSettings r0 = com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings.LIZ()
            int r0 = r0.cardReqGapMin
            goto L6a
        L7d:
            com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings$AdFreeSettings r0 = com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings.LIZ()
            int r0 = r0.cardFrequencyCap
            goto L3e
        L84:
            r1 = 0
        L85:
            com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings$AdFreeSettings r0 = com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings.LIZ()
            int r0 = r0.cardReqGapMax
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TPF.<init>():void");
    }

    public final void LJI() {
        boolean z;
        int i = 0;
        int i2 = LIZIZ().getInt(LIZ("card_dislike_count"), 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CARD DISLIKE COUNT:");
        sbLIZ.append(i2);
        sbLIZ.append(' ');
        C1022620cia.LJ("TTPlusKevaHelper", C2188811AlT.LIZIZ(sbLIZ));
        int i3 = i2 + 1;
        if (i3 >= this.LJI) {
            z = true;
            i = 2;
        } else {
            z = false;
        }
        this.LJIILLIIL = i;
        this.LJIIZILJ = 1;
        if (z) {
            LJIIIZ();
        } else {
            LIZIZ().storeInt(LIZ("card_dislike_count"), i3);
        }
        this.LJIILJJIL = true;
    }

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZJ(int i) {
        C1022620cia.LJ("TTPlusKevaHelper", "INTERACT REQUEST");
        LIZIZ().storeBoolean(LIZ("enable_ad_record"), false);
        this.LJIIL = i;
        this.LJIIIZ = true;
        this.LJIILL = true;
    }

    public final void LIZLLL(int i, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "card_type");
        c2344009Gk.LIZJ(this.LJIIL, "scenario_type");
        c2344009Gk.LJIIIIZZ("fail_reason", str);
        if (str2 != null) {
            c2344009Gk.LJFF("card_style", str2);
        }
        C20684815ws.LJIILLIIL("ttplus_feedcard_show_fail", c2344009Gk.LIZ);
    }

    public final void LJ(int i, int i2, int i3, String str) {
        boolean z = this.LJIIJJI;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(this.LJIIL, "scenario_type");
        c2344009Gk.LIZJ(i, "click_value");
        c2344009Gk.LIZJ(z ? 1 : 0, "backswipe");
        c2344009Gk.LIZJ(i2, "card_type");
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("card_style", str);
        if (i3 >= 0) {
            c2344009Gk.LIZJ(i3, "slide_index");
        }
        C20684815ws.LJIILLIIL("ttplus_feedcard_click", c2344009Gk.LIZ);
    }

    public final void LJIIIIZZ(int i, String str, String str2, Function0 function0) {
        boolean zLJFF = Intrinsics.LJFF(this.LJIIJ, String.valueOf(str));
        this.LJIIJJI = zLJFF;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(this.LJIIL, "scenario_type");
        c2344009Gk.LIZJ(zLJFF ? 1 : 0, "backswipe");
        c2344009Gk.LIZJ(i, "card_type");
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("card_style", str2);
        C20684815ws.LJIILLIIL("ttplus_feedcard_show", c2344009Gk.LIZ);
        this.LJIJ = true;
        if (this.LJIIJJI) {
            return;
        }
        function0.invoke();
        this.LJIIJ = String.valueOf(str);
        C20550215bA c20550215bALIZ = C1616440sAM.LIZ(42);
        C20550115b9.LIZ.getClass();
        C20550115b9.LJIJ(c20550215bALIZ, str);
        List listLJLI = C13LQ.LJLI(LIZIZ().getStringArray(LIZ("total_show_dates"), new String[0]));
        ArrayList arrayList = (ArrayList) listLJLI;
        arrayList.add(String.valueOf(new Date().getTime()));
        LIZIZ().storeStringArray(LIZ("total_show_dates"), (String[]) arrayList.toArray(new String[0]));
        LIZIZ().storeLong(LIZ("last_show_date"), new Date().getTime());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CARD SHOW ");
        sbLIZ.append(listLJLI);
        C1022620cia.LJ("TTPlusKevaHelper", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIIZ = false;
        this.LJIILJJIL = false;
        this.LJIILLIIL = 0;
        LIZIZ().storeBoolean(LIZ("enable_ad_record"), true);
    }

    public final void LJFF(long j, int i, String str, Long l, int i2, JSONArray jSONArray) {
        if (!this.LJIJ) {
            return;
        }
        this.LJIJ = false;
        boolean z = this.LJIIJJI;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "stay_time");
        c2344009Gk.LIZJ(this.LJIIZILJ, "exit_value");
        c2344009Gk.LIZJ(this.LJIILLIIL, "temp_block");
        c2344009Gk.LIZJ(this.LJIIL, "scenario_type");
        c2344009Gk.LIZJ(z ? 1 : 0, "backswipe");
        c2344009Gk.LIZJ(i, "card_type");
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("card_style", str);
        if (l != null) {
            l.longValue();
            c2344009Gk.LIZLLL(l.longValue(), "video_black_time");
        }
        if (i2 >= 0) {
            c2344009Gk.LIZJ(i2, "slide_index");
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("slide_stay_time_");
                sbLIZ.append(i3);
                c2344009Gk.LJFF(C2188811AlT.LIZIZ(sbLIZ), JSONArrayProtectorUtils.getString(jSONArray, i3));
            }
        }
        C20684815ws.LJIILLIIL("ttplus_feedcard_exit", c2344009Gk.LIZ);
    }

    public final void LJII(long j, int i, String str, Long l, int i2, JSONArray jSONArray) {
        boolean z;
        int i3;
        int i4 = 0;
        if (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT) < this.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJIILJJIL) {
            LJFF(j, i, str, l, -1, null);
            return;
        }
        if (z) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        this.LJIIZILJ = i3;
        if (this.LJIIJJI) {
            LJFF(j, i, str, l, i2, jSONArray);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CARD LEAVE DURATION: ");
        sbLIZ.append(j);
        sbLIZ.append(' ');
        C1022620cia.LJ("TTPlusKevaHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            int i5 = LIZIZ().getInt(LIZ("card_fast_skip_count"), 0);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CARD FAST COUNT: ");
            sbLIZ2.append(i5);
            C1022620cia.LJ("TTPlusKevaHelper", C2188811AlT.LIZIZ(sbLIZ2));
            int i6 = i5 + 1;
            if (i6 >= this.LJII) {
                LJIIIZ();
                this.LJIILLIIL = 1;
                LJFF(j, i, str, l, i2, jSONArray);
                return;
            }
            LIZIZ().storeInt(LIZ("card_fast_skip_count"), i6);
        } else {
            LIZIZ().storeInt(LIZ("card_fast_skip_count"), 0);
        }
        if (this.LJIILIIL) {
            return;
        }
        if (LIZIZ().getStringArray(LIZ("total_show_dates"), new String[0]).length == this.LIZLLL) {
            i4 = 3;
        }
        this.LJIILLIIL = i4;
        LJFF(j, i, str, l, i2, jSONArray);
    }
}
