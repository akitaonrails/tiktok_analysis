package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0agE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944280agE {
    public static String LIZ = "";
    public static final EnumC467700IVs LIZIZ = EnumC467700IVs.UNKNOWN;

    public static EnumC467700IVs LIZJ() {
        C915980Zwa.LJII().jn1();
        return EnumC467700IVs.CROSS_ROOM_ARCH;
    }

    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearIdentifyingSEIChannelId");
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        sbLIZ.append(", clear SEIChannelId=");
        sbLIZ.append(LIZ);
        C20441214yg.LJIIIZ("MultiHostSeiIdentifyMetricsHelper", C2188811AlT.LIZIZ(sbLIZ));
        LIZ = "";
    }

    public static EnumC467700IVs LIZIZ(C945320ahu c945320ahu) {
        int type;
        LiveSeiStruct liveSeiStruct;
        SeiAppData seiAppData;
        if (c945320ahu != null && (liveSeiStruct = c945320ahu.LIZ) != null && (seiAppData = liveSeiStruct.LIZ) != null) {
            type = seiAppData.linkerArchType;
        } else {
            type = EnumC467700IVs.UNKNOWN.getType();
        }
        EnumC467700IVs enumC467700IVs = EnumC467700IVs.CROSS_ROOM_ARCH;
        if (type != enumC467700IVs.getType()) {
            EnumC467700IVs enumC467700IVs2 = EnumC467700IVs.MULTI_ARCH;
            if (type != enumC467700IVs2.getType()) {
                EnumC467700IVs enumC467700IVs3 = EnumC467700IVs.OLD_ARCH;
                if (type != enumC467700IVs3.getType()) {
                    return EnumC467700IVs.UNKNOWN;
                }
                return enumC467700IVs3;
            }
            return enumC467700IVs2;
        }
        return enumC467700IVs;
    }

    public static String LIZLLL(C945320ahu c945320ahu) {
        LiveSeiStruct liveSeiStruct;
        SeiAppData seiAppData;
        String str;
        LiveSeiStruct liveSeiStruct2;
        SeiAppData seiAppData2;
        String str2;
        LiveSeiStruct liveSeiStruct3;
        SeiAppData seiAppData3;
        String str3;
        LiveSeiStruct liveSeiStruct4;
        SeiAppData seiAppData4;
        String str4;
        int i = C467710IVt.LIZ[LIZIZ(c945320ahu).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (c945320ahu != null && (liveSeiStruct4 = c945320ahu.LIZ) != null && (seiAppData4 = liveSeiStruct4.LIZ) != null && (str4 = seiAppData4.channelId) != null) {
                        return str4;
                    }
                } else if (c945320ahu != null && (liveSeiStruct3 = c945320ahu.LIZ) != null && (seiAppData3 = liveSeiStruct3.LIZ) != null && (str3 = seiAppData3.channelId) != null) {
                    return str3;
                }
            } else if (c945320ahu != null && (liveSeiStruct2 = c945320ahu.LIZ) != null && (seiAppData2 = liveSeiStruct2.LIZ) != null && (str2 = seiAppData2.channelId) != null) {
                return str2;
            }
        } else if (c945320ahu != null && (liveSeiStruct = c945320ahu.LIZ) != null && (seiAppData = liveSeiStruct.LIZ) != null && (str = seiAppData.groupChannelId) != null) {
            return str;
        }
        return "";
    }

    public static boolean LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isChannelIdIdentifying");
        sbLIZ.append(", channelId=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("MultiHostSeiIdentifyMetricsHelper", C2188811AlT.LIZIZ(sbLIZ));
        return Intrinsics.LJFF(LIZ, str);
    }

    public static void LJFF(C945320ahu c945320ahu) {
        String str;
        boolean zLIZ;
        boolean z;
        LiveSeiStruct liveSeiStruct;
        SeiAppData seiAppData;
        List<SeiRegion> list;
        LiveSeiStruct liveSeiStruct2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLinkWidgetData");
        sbLIZ.append(", sei origin = ");
        SeiAppData seiAppData2 = null;
        if (c945320ahu != null) {
            str = c945320ahu.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("MultiHostSeiIdentifyMetricsHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (c945320ahu != null && (liveSeiStruct2 = c945320ahu.LIZ) != null) {
            seiAppData2 = liveSeiStruct2.LIZ;
        }
        if (seiAppData2 == null && !C969340bKe.LJI(c945320ahu)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setLinkWidgetData");
            sbLIZ2.append(", shouldSkipSEI = true");
            C20441214yg.LJIIIZ("MultiHostSeiIdentifyMetricsHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (C915980Zwa.LJII().LLI().isLinked()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("setLinkWidgetData");
            sbLIZ3.append(", return isLined = true");
            C20441214yg.LJIIIZ("MultiHostSeiIdentifyMetricsHelper", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (c945320ahu != null) {
            zLIZ = c945320ahu.LIZ();
        } else {
            zLIZ = false;
        }
        boolean zLIZIZ = C176600m4.LIZIZ(Boolean.valueOf(C500260Jjc.LJJIIZ(LIZLLL(c945320ahu))));
        boolean z2 = !Intrinsics.LJFF(LIZLLL(c945320ahu), CardStruct.IStatusCode.DEFAULT);
        if (c945320ahu != null && (liveSeiStruct = c945320ahu.LIZ) != null && (seiAppData = liveSeiStruct.LIZ) != null && (list = seiAppData.grids) != null && list.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("isSeiValid");
        sbLIZ4.append(", isCoHostSei=");
        sbLIZ4.append(zLIZ);
        sbLIZ4.append(", isSeiChannelIdNotBlank=");
        sbLIZ4.append(zLIZIZ);
        sbLIZ4.append(", isSeiChannelIdNot0=");
        sbLIZ4.append(z2);
        sbLIZ4.append(", isSeiCountValid=");
        sbLIZ4.append(z);
        C20441214yg.LJIIIZ("MultiHostSeiIdentifyMetricsHelper", C2188811AlT.LIZIZ(sbLIZ4));
        if (zLIZ && zLIZIZ && z2 && z) {
            if (LJ(LIZLLL(c945320ahu))) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("setLinkWidgetData");
                sbLIZ5.append(", return isChannelIdIdentifying = true");
                C20441214yg.LJIIIZ("MultiHostSeiIdentifyMetricsHelper", C2188811AlT.LIZIZ(sbLIZ5));
                return;
            }
            LIZ = LIZLLL(c945320ahu);
            C954660awy.LJ = SystemClock.uptimeMillis();
            LIZIZ(c945320ahu).getType();
            String str2 = C954660awy.LJFF;
            new C955610ayV().LJJ(LIZIZ(c945320ahu).getType(), C950220apo.LJJ(LIZLLL(c945320ahu)), C158B.LIZ() - C915980Zwa.LJI().LIZJ().LJJIJ(), "sei");
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("setLinkWidgetData");
            sbLIZ6.append(", sei identifying start, SEIChannelId=");
            sbLIZ6.append(LIZ);
            C20441214yg.LJIIIZ("MultiHostSeiIdentifyMetricsHelper", C2188811AlT.LIZIZ(sbLIZ6));
            return;
        }
        if (C500260Jjc.LJJIIZ(LIZ)) {
            new C955610ayV().LJIL(LIZIZ.getType(), C950220apo.LJJ(LIZ), C158B.LIZ() - C915980Zwa.LJI().LIZJ().LJJIJ(), "invalid_app_data");
            LIZ("setLinkWidgetData");
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("setLinkWidgetData");
            sbLIZ7.append(", return isSeiValid = false, isChannelIdIdentifying = true");
            C20441214yg.LJIIIZ("MultiHostSeiIdentifyMetricsHelper", C2188811AlT.LIZIZ(sbLIZ7));
            return;
        }
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("setLinkWidgetData");
        sbLIZ8.append(", return isSeiValid = false, isChannelIdIdentifying = false");
        C20441214yg.LJIIIZ("MultiHostSeiIdentifyMetricsHelper", C2188811AlT.LIZIZ(sbLIZ8));
    }
}
