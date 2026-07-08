package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0Vem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803020Vem extends C802970Veh {
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public int LJIIJ;
    public final int LJIIJJI;
    public final boolean LJIIL;
    public boolean LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;

    @Override // X.C802970Veh
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("monitorType=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append("\nwaterLineMB=");
        sbLIZ.append(this.LJII);
        sbLIZ.append("\ndumpSizeMB=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append("\nmprotectProts=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append("\nmemType=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append("\nmemSize=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append("\nbacktraceRules=");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append("\nmonitorRules=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append("\nsleepTime=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append("\ndebug=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append("\npEnable=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append("\n");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C803020Vem(int i, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4) {
        Long lValueOf;
        int i2;
        super(23, 35, 3);
        this.LJII = 350;
        this.LJIIIIZZ = 650;
        this.LJIIIZ = LivePreCreateNextRoomPlayer.ENABLE;
        this.LJIILJJIL = "test";
        this.LJIILL = CardStruct.IStatusCode.DEFAULT;
        this.LJIILLIIL = CardStruct.IStatusCode.DEFAULT;
        this.LJIIZILJ = CardStruct.IStatusCode.DEFAULT;
        if (C802300Vdc.LIZIZ()) {
            this.LJIIJJI = 3;
            this.LJII = 0;
            this.LJIIIIZZ = 200;
            this.LJIIIZ = LSPassThroughRecordSizeConfig.DEFAULT;
            this.LJIILJJIL = "new_test";
            this.LJIILLIIL = "3";
            this.LJIIZILJ = "5";
            this.LJIIJ = 32;
            this.LJIILIIL = true;
            this.LJIIL = true;
            return;
        }
        this.LJIIJJI = i;
        if (jSONArray != null && jSONArray.length() == 2) {
            this.LJII = jSONArray.optInt(0);
            this.LJIIIIZZ = jSONArray.optInt(1);
        }
        if (jSONArray2 != null && jSONArray2.length() == 5) {
            int i3 = 0;
            for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                String strOptString = jSONArray2.optString(i4);
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    this.LJIIZILJ = strOptString;
                                }
                            } else {
                                i2 = CastIntegerProtector.parseInt(strOptString) << 1;
                            }
                        } else {
                            i2 = CastIntegerProtector.parseInt(strOptString) << 0;
                        }
                        i3 |= i2;
                    } else {
                        String string = null;
                        if (strOptString != null) {
                            try {
                                if (strOptString.endsWith("M")) {
                                    lValueOf = Long.valueOf(CastLongProtector.parseLong(strOptString.substring(0, strOptString.indexOf("M"))) * 1024 * 1024);
                                } else if (strOptString.endsWith("G")) {
                                    lValueOf = Long.valueOf(CastLongProtector.parseLong(strOptString.substring(0, strOptString.indexOf("G"))) * 1024 * 1024 * 1024);
                                } else if (strOptString.endsWith("K")) {
                                    lValueOf = Long.valueOf(CastLongProtector.parseLong(strOptString.substring(0, strOptString.indexOf("K"))) * 1024);
                                }
                                if (lValueOf != null) {
                                    string = lValueOf.toString();
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        this.LJIILL = string;
                    }
                } else {
                    this.LJIILJJIL = strOptString;
                }
            }
            this.LJIILLIIL = String.valueOf(i3);
        }
        if (jSONArray3 != null) {
            this.LJIIJ = 0;
            for (int i5 = 0; i5 < jSONArray3.length(); i5++) {
                this.LJIIJ |= 1 << jSONArray3.optInt(i5);
            }
        }
        if (jSONArray4 == null || jSONArray4.length() != 2) {
            return;
        }
        for (int i6 = 0; i6 < jSONArray4.length(); i6++) {
            String strOptString2 = jSONArray4.optString(i6);
            if (i6 != 0) {
                if (i6 == 1 && this.LJIILIIL) {
                    this.LJIILJJIL = strOptString2;
                }
            } else {
                this.LJIILIIL = "1".equals(strOptString2);
            }
        }
    }
}
