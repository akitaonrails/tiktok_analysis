package X;

import com.tiktok.ttm.ttmparam.ITTMParamData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514960pWg extends ITTMParamData {
    public final Double LIZIZ;
    public final C2200981BCe LIZJ;
    public final C1BC7 LIZLLL;
    public final C1512840pTG LJ;
    public final String LJFF;
    public final Boolean LJI;
    public final C1512820pTE LJII;
    public final C1512930pTP LJIIIIZZ;
    public final C1512850pTH LJIIIZ;
    public final C1514970pWh LJIIJ;
    public final C0XE1 LJIIJJI;

    public C1514960pWg() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1514960pWg)) {
            return false;
        }
        C1514960pWg c1514960pWg = (C1514960pWg) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1514960pWg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1514960pWg.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1514960pWg.LIZLLL) && Intrinsics.LJFF(this.LJ, c1514960pWg.LJ) && Intrinsics.LJFF(this.LJFF, c1514960pWg.LJFF) && Intrinsics.LJFF(this.LJI, c1514960pWg.LJI) && Intrinsics.LJFF(this.LJII, c1514960pWg.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1514960pWg.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1514960pWg.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1514960pWg.LJIIJ) && this.LJIIJJI == c1514960pWg.LJIIJJI;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final Object getInputData() {
        return this;
    }

    public final int hashCode() {
        Double d = this.LIZIZ;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        C2200981BCe c2200981BCe = this.LIZJ;
        int iHashCode2 = (iHashCode + (c2200981BCe == null ? 0 : c2200981BCe.hashCode())) * 31;
        C1BC7 c1bc7 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (c1bc7 == null ? 0 : c1bc7.hashCode())) * 31;
        C1512840pTG c1512840pTG = this.LJ;
        int iHashCode4 = (iHashCode3 + (c1512840pTG == null ? 0 : c1512840pTG.hashCode())) * 31;
        String str = this.LJFF;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LJI;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        C1512820pTE c1512820pTE = this.LJII;
        int iHashCode7 = (iHashCode6 + (c1512820pTE == null ? 0 : c1512820pTE.hashCode())) * 31;
        C1512930pTP c1512930pTP = this.LJIIIIZZ;
        int iHashCode8 = (iHashCode7 + (c1512930pTP == null ? 0 : c1512930pTP.hashCode())) * 31;
        C1512850pTH c1512850pTH = this.LJIIIZ;
        int iHashCode9 = (iHashCode8 + (c1512850pTH == null ? 0 : c1512850pTH.hashCode())) * 31;
        C1514970pWh c1514970pWh = this.LJIIJ;
        int iHashCode10 = (iHashCode9 + (c1514970pWh == null ? 0 : c1514970pWh.hashCode())) * 31;
        C0XE1 c0xe1 = this.LJIIJJI;
        return iHashCode10 + (c0xe1 != null ? c0xe1.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceAndAppStateModel(deviceScore=" + this.LIZIZ + ", netState=" + this.LIZJ + ", appForegroundState=" + this.LIZLLL + ", cpuState=" + this.LJ + ", currentPage=" + this.LJFF + ", isInChatPage=" + this.LJI + ", memoryState=" + this.LJII + ", batteryState=" + this.LJIIIIZZ + ", trafficState=" + this.LJIIIZ + ", lowPowerModeState=" + this.LJIIJ + ", wsConnectState=" + this.LJIIJJI + ')';
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final double getDoubleValue(String str, int i) {
        C1512840pTG c1512840pTG;
        if (Intrinsics.LJFF(str, "cpuUsagePercent")) {
            C1512840pTG c1512840pTG2 = this.LJ;
            if (c1512840pTG2 == null) {
                return -1.0d;
            }
            return c1512840pTG2.LIZIZ;
        }
        if (!Intrinsics.LJFF(str, "cpuSpeedPercent") || (c1512840pTG = this.LJ) == null) {
            return -1.0d;
        }
        return c1512840pTG.LIZJ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final long getIntValue(String str, int i) {
        C2200981BCe c2200981BCe;
        EnumC2201021BCi enumC2201021BCi;
        C1512820pTE c1512820pTE;
        C1512820pTE c1512820pTE2;
        C1BC7 c1bc7;
        C2200981BCe c2200981BCe2;
        EnumC2201041BCk enumC2201041BCk;
        int i2;
        C1512850pTH c1512850pTH;
        C1512850pTH c1512850pTH2;
        C1512820pTE c1512820pTE3;
        C1512930pTP c1512930pTP;
        C1512850pTH c1512850pTH3;
        C1512820pTE c1512820pTE4;
        C1514970pWh c1514970pWh;
        C1512820pTE c1512820pTE5;
        Boolean bool;
        C1512930pTP c1512930pTP2;
        int typeValue;
        C1512820pTE c1512820pTE6;
        C0XE1 c0xe1;
        C1512930pTP c1512930pTP3;
        if (str == null) {
            return -1L;
        }
        switch (str.hashCode()) {
            case -2079994764:
                if (!str.equals("batteryIsSavePowerMode") || (c1512930pTP3 = this.LJIIIIZZ) == null) {
                    return -1L;
                }
                return C169O.LIZJ(c1512930pTP3.LJ);
            case -1641261373:
                if (!str.equals("wsConnectState") || (c0xe1 = this.LJIIJJI) == null) {
                    return -1L;
                }
                typeValue = c0xe1.getTypeValue();
                break;
                break;
            case -1451909145:
                if (!str.equals("memoryBlockGcCount") || (c1512820pTE6 = this.LJII) == null) {
                    return -1L;
                }
                return c1512820pTE6.LJFF;
            case -1182092476:
                if (!str.equals("batteryCurrentBatteryPercent") || (c1512930pTP2 = this.LJIIIIZZ) == null) {
                    return -1L;
                }
                typeValue = c1512930pTP2.LIZLLL;
                break;
                break;
            case -1032358122:
                if (!str.equals("isInChatPage") || (bool = this.LJI) == null) {
                    return -1L;
                }
                return C169O.LIZJ(bool.booleanValue());
            case -919868398:
                if (!str.equals("memoryTotalMem") || (c1512820pTE5 = this.LJII) == null) {
                    return -1L;
                }
                return c1512820pTE5.LIZJ;
            case -609179118:
                if (!str.equals("lowPowerModeIsLowPowerMode") || (c1514970pWh = this.LJIIJ) == null) {
                    return -1L;
                }
                return C169O.LIZJ(c1514970pWh.LIZIZ);
            case -461977355:
                if (!str.equals("memoryBlockGcTime") || (c1512820pTE4 = this.LJII) == null) {
                    return -1L;
                }
                return c1512820pTE4.LJI;
            case -424161452:
                if (!str.equals("trafficDistanceTimeInMillSecond") || (c1512850pTH3 = this.LJIIIZ) == null) {
                    return -1L;
                }
                return c1512850pTH3.LIZLLL;
            case -318256732:
                if (!str.equals("batteryIsChanging") || (c1512930pTP = this.LJIIIIZZ) == null) {
                    return -1L;
                }
                return C169O.LIZJ(c1512930pTP.LIZIZ);
            case 329919018:
                if (!str.equals("memoryGcTime") || (c1512820pTE3 = this.LJII) == null) {
                    return -1L;
                }
                return c1512820pTE3.LJ;
            case 506445956:
                if (!str.equals("trafficTxTrafficByte") || (c1512850pTH2 = this.LJIIIZ) == null) {
                    return -1L;
                }
                return c1512850pTH2.LIZJ;
            case 1093251970:
                if (!str.equals("trafficRxTrafficByte") || (c1512850pTH = this.LJIIIZ) == null) {
                    return -1L;
                }
                return c1512850pTH.LIZIZ;
            case 1197398020:
                if (!str.equals("netConnectState") || (c2200981BCe2 = this.LIZJ) == null || (enumC2201041BCk = c2200981BCe2.LIZ) == null || (i2 = C2200991BCf.LIZ[enumC2201041BCk.ordinal()]) == 1) {
                    return -1L;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new C1954807lC();
                    }
                    return 1L;
                }
                return 0L;
            case 1338351930:
                if (!str.equals("isAppForeground") || (c1bc7 = this.LIZLLL) == null) {
                    return -1L;
                }
                return C169O.LIZJ(c1bc7.LIZ);
            case 1622041938:
                if (!str.equals("memoryGcCount") || (c1512820pTE2 = this.LJII) == null) {
                    return -1L;
                }
                return c1512820pTE2.LIZLLL;
            case 1707466375:
                if (!str.equals("memoryAvailMem") || (c1512820pTE = this.LJII) == null) {
                    return -1L;
                }
                return c1512820pTE.LIZIZ;
            case 1839776103:
                if (!str.equals("netConnectType") || (c2200981BCe = this.LIZJ) == null || (enumC2201021BCi = c2200981BCe.LIZIZ) == null) {
                    return -1L;
                }
                switch (C2200991BCf.LIZIZ[enumC2201021BCi.ordinal()]) {
                    case 1:
                        return -1L;
                    case 2:
                        return 0L;
                    case 3:
                        return 1L;
                    case 4:
                        return 2L;
                    case 5:
                        return 3L;
                    case 6:
                        return 4L;
                    default:
                        throw new C1954807lC();
                }
            default:
                return -1L;
        }
        return typeValue;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final String getStringValue(String str, int i) {
        String str2;
        if (!Intrinsics.LJFF(str, "currentPage") || (str2 = this.LJFF) == null) {
            return "";
        }
        return str2;
    }

    public C1514960pWg(Double d, C2200981BCe c2200981BCe, C1BC7 c1bc7, C1512840pTG c1512840pTG, String str, Boolean bool, C1512820pTE c1512820pTE, C1512930pTP c1512930pTP, C1512850pTH c1512850pTH, C1514970pWh c1514970pWh, C0XE1 c0xe1) {
        this.LIZIZ = d;
        this.LIZJ = c2200981BCe;
        this.LIZLLL = c1bc7;
        this.LJ = c1512840pTG;
        this.LJFF = str;
        this.LJI = bool;
        this.LJII = c1512820pTE;
        this.LJIIIIZZ = c1512930pTP;
        this.LJIIIZ = c1512850pTH;
        this.LJIIJ = c1514970pWh;
        this.LJIIJJI = c0xe1;
    }
}
