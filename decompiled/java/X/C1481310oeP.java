package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0oeP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481310oeP {
    public static final C603840NmI<String, Integer> LIZ = new C603840NmI<>(20);
    public static final C603840NmI<String, Integer> LIZIZ = new C603840NmI<>(20);

    public static String LIZ(SimVideoUrlModel simVideoUrlModel) {
        List<SimBitRate> bitRate;
        if (simVideoUrlModel == null) {
            return null;
        }
        if (simVideoUrlModel.hasDashBitrate()) {
            bitRate = simVideoUrlModel.getDashBitRate();
        } else {
            bitRate = simVideoUrlModel.getBitRate();
        }
        JSONArray jSONArray = new JSONArray();
        if (bitRate != null && !bitRate.isEmpty()) {
            Iterator<SimBitRate> it2 = bitRate.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().getGearName());
            }
        }
        return jSONArray.toString();
    }

    public static EnumC585580Mxw LIZJ(InterfaceC585470Mxl interfaceC585470Mxl) {
        if (interfaceC585470Mxl == null) {
            return EnumC585580Mxw.DEFAULT;
        }
        return interfaceC585470Mxl.LIZLLL();
    }

    public static int LIZLLL(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel == null) {
            return 0;
        }
        if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4() && simVideoUrlModel.getHitDashAudioBitrate() != null) {
            return simVideoUrlModel.getHitDashAudioBitrate().getBitRate();
        }
        if (simVideoUrlModel.getAudioBitrate() == null || simVideoUrlModel.getAudioBitrate().size() < 1) {
            return 0;
        }
        return ((SimAudioBitrate) ListProtector.get(simVideoUrlModel.getAudioBitrate(), 0)).getBitRate();
    }

    public static int LJFF(String str) {
        Integer num;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        synchronized (c1477400oY6) {
            if (TextUtils.isEmpty(str) || (num = c1477400oY6.LJIJI.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        }
    }

    public static String LJI(String str) {
        Integer num;
        if (TextUtils.isEmpty(str)) {
            return "not_landscape";
        }
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        synchronized (c1477400oY6) {
            if (!TextUtils.isEmpty(str) && (num = c1477400oY6.LJIJ.get(str)) != null) {
                int iIntValue = num.intValue();
                if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        return "fake_landscape";
                    }
                    return "not_landscape";
                }
                return "landscape";
            }
            return "not_landscape";
        }
    }

    public static String LJII(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel == null) {
            return null;
        }
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        String sourceId = simVideoUrlModel.getSourceId();
        synchronized (c1477400oY6) {
            if (TextUtils.isEmpty(sourceId)) {
                return null;
            }
            return c1477400oY6.LJJI.get(sourceId);
        }
    }

    public static String LJIIIIZZ(InterfaceC1481730of5 interfaceC1481730of5) {
        if (interfaceC1481730of5 != null) {
            return interfaceC1481730of5.getPlayerType().toString();
        }
        return "TT";
    }

    public static String LJIIIZ(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel == null) {
            return null;
        }
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        String sourceId = simVideoUrlModel.getSourceId();
        synchronized (c1477400oY6) {
            if (TextUtils.isEmpty(sourceId)) {
                return null;
            }
            return c1477400oY6.LJJIFFI.get(sourceId);
        }
    }

    public static String LJIIJ(String str) {
        List<C00BE> list;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        synchronized (c1477400oY6) {
            if (!TextUtils.isEmpty(str)) {
                list = c1477400oY6.LJIILIIL.get(str);
            } else {
                list = null;
            }
        }
        c1477400oY6.LJJJIL(str);
        if (list != null && !list.isEmpty()) {
            return GsonProtectorUtils.toJson(new Gson(), list);
        }
        return "";
    }

    public static String LJIIJJI(String str) {
        return C1477400oY6.LJJJJI.LJIILJJIL(str);
    }

    public static int LJIILIIL(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel == null) {
            return 0;
        }
        if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
            if (simVideoUrlModel.getHitDashVideoBitrate() != null) {
                return simVideoUrlModel.getHitDashVideoBitrate().getBitRate();
            }
        } else if (simVideoUrlModel.getHitBitrate() != null) {
            return simVideoUrlModel.getHitBitrate().getBitRate();
        }
        if (simVideoUrlModel.getRawBitRate() == null || simVideoUrlModel.getRawBitRate().size() < 1) {
            return 0;
        }
        return ((SimBitRate) ListProtector.get(simVideoUrlModel.getRawBitRate(), 0)).getBitRate();
    }

    public static String LIZIZ(SimVideoUrlModel simVideoUrlModel, boolean z) {
        List<SimBitRate> bitRate;
        if (!z || simVideoUrlModel == null) {
            return null;
        }
        if (simVideoUrlModel.hasDashBitrate()) {
            bitRate = simVideoUrlModel.getDashBitRate();
        } else {
            bitRate = simVideoUrlModel.getBitRate();
        }
        JSONArray jSONArray = new JSONArray();
        if (bitRate != null && !bitRate.isEmpty()) {
            Iterator<SimBitRate> it2 = bitRate.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().getBitRate());
            }
        }
        return jSONArray.toString();
    }

    public static int LJ(InterfaceC1481730of5 interfaceC1481730of5, String str) {
        Integer numValueOf;
        SimVideoUrlModel simVideoUrlModelLJIIL = LJIIL(interfaceC1481730of5, str);
        if (simVideoUrlModelLJIIL == null) {
            return -1;
        }
        SimAudioBitrate hitDashAudioBitrate = simVideoUrlModelLJIIL.getHitDashAudioBitrate();
        if (hitDashAudioBitrate == null || (numValueOf = Integer.valueOf(hitDashAudioBitrate.getQualityType())) == null) {
            numValueOf = -1;
        }
        return numValueOf.intValue();
    }

    public static SimVideoUrlModel LJIIL(InterfaceC1481730of5 interfaceC1481730of5, String str) {
        if (interfaceC1481730of5 == null) {
            return null;
        }
        return interfaceC1481730of5.LJJII(str);
    }

    public static int LJIILJJIL(InterfaceC1481730of5 interfaceC1481730of5, String str) {
        Integer numValueOf;
        Integer numValueOf2;
        SimVideoUrlModel simVideoUrlModelLJIIL = LJIIL(interfaceC1481730of5, str);
        Integer num = -1;
        if (simVideoUrlModelLJIIL == null) {
            return -1;
        }
        if (simVideoUrlModelLJIIL.hasDashBitrateAndSelectAsMp4()) {
            SimBitRate hitDashVideoBitrate = simVideoUrlModelLJIIL.getHitDashVideoBitrate();
            if (hitDashVideoBitrate != null && (numValueOf2 = Integer.valueOf(hitDashVideoBitrate.getQualityType())) != null) {
                num = numValueOf2;
            }
            return num.intValue();
        }
        if (!TextUtils.isEmpty(C1477400oY6.LJJJJI.LJIIJJI(str))) {
            C1471500oOa videoInfo = interfaceC1481730of5.getVideoInfo();
            if (videoInfo == null) {
                return -1;
            }
            return videoInfo.LJIIJ;
        }
        InterfaceC1477220oXo hitBitrate = simVideoUrlModelLJIIL.getHitBitrate();
        if (hitBitrate != null && (numValueOf = Integer.valueOf(hitBitrate.getQualityType())) != null) {
            num = numValueOf;
        }
        return num.intValue();
    }
}
