package X;

import com.bytedance.android.livesdk.livesetting.MultiGuestLayoutMonitorSwitchSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.1CkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238981CkC extends AbstractC2238971CkB {
    public final C2238991CkD LJIILJJIL;
    public boolean LJIILL;
    public EnumC1156220gC4 LJIILLIIL;
    public String LJIIZILJ;
    public int LJIJ;

    @Override // X.AbstractC2238971CkB
    public final void LIZ(Map<String, String> map) {
        long jLongValue;
        String str;
        String str2;
        String str3;
        super.LIZ(map);
        long j = this.LJII - this.LJFF;
        long j2 = 0;
        if (j < 0) {
            j = 0;
        }
        map.put("background_load_duration", String.valueOf(j));
        Long l = this.LJIIIIZZ.get("download");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j3 = jLongValue - this.LJI;
        if (j3 >= 0) {
            j2 = j3;
        }
        map.put("background_fetch_duration", String.valueOf(j2));
        if (this.LJIILL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_thumbnail", str);
        int i = C1156230gC5.LIZ[this.LJIILLIIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "remote";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str2 = "disk";
            }
        } else {
            str2 = "memory";
        }
        map.put("load_type", str2);
        if (this.LJIJ == 4) {
            if (C930540aK4.LJJIJ()) {
                str3 = "voice_chat";
            } else {
                str3 = "multi_guest";
            }
        } else {
            str3 = "others";
        }
        map.put("live_status", str3);
    }

    @Override // X.AbstractC2238971CkB
    public final String LIZLLL(boolean z) {
        boolean z2;
        long jLongValue;
        long jLongValue2;
        String str;
        if (!z) {
            return "";
        }
        C2238991CkD c2238991CkD = this.LJIILJJIL;
        boolean z3 = true;
        if (c2238991CkD != null && c2238991CkD.LJIIJJI) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BackgroundFlow reason:");
            sbLIZ.append(this.LJIILJJIL.LJIIL);
            C20441214yg.LIZIZ("flick_wws", C2188811AlT.LIZIZ(sbLIZ));
            if (C939210aY3.LIZJ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("bg flick: ");
                sbLIZ2.append(this.LJIILJJIL.LJIIL);
                C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
            }
            return this.LJIILJJIL.LJIIL;
        }
        Long l = this.LJIIIIZZ.get("bg_res_ready");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = this.LJIIIIZZ.get("bg_res_not_ready");
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        if (jLongValue2 - this.LJI <= this.LJ) {
            z3 = false;
        }
        long j = this.LJII;
        if ((C463380IFc.LIZ() && z3) || (!C463380IFc.LIZ() && (jLongValue == 0 || jLongValue > this.LJI))) {
            str = "resource_not_ready";
        } else {
            str = "resource_load_late";
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("BackgroundFlow bgLoadedTime:");
        sbLIZ3.append(j);
        sbLIZ3.append(" videoFirstFrameTime:");
        sbLIZ3.append(this.LJI);
        sbLIZ3.append(" reason:");
        sbLIZ3.append(str);
        C20441214yg.LIZIZ("flick_wws", C2188811AlT.LIZIZ(sbLIZ3));
        if (C939210aY3.LIZJ()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("bg flick: ");
            sbLIZ4.append(str);
            C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
        }
        return str;
    }

    public final void LJ(long j) {
        String str = this.LJIIZILJ;
        if (str != null && str.length() == 0) {
            C20441214yg.LIZIZ("flick_wws", "BackgroundFlow sticker is empty");
        } else if (!this.LJIIJ) {
            this.LJII = j;
            this.LJIIJ = true;
            LIZIZ();
        }
    }

    public C2238981CkC(String str, String str2, C2238991CkD c2238991CkD) {
        super(MultiGuestLayoutMonitorSwitchSetting.INSTANCE.getBgFlickThresholdMs(), str, str2, "background");
        this.LJIILJJIL = c2238991CkD;
        this.LJIILLIIL = EnumC1156220gC4.DISK;
        this.LJIJ = -1;
    }
}
