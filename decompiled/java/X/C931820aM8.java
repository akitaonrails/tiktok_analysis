package X;

import android.util.LruCache;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LivesdkLsWatchLinkmicSettingsSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0aM8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931820aM8 {
    public static final LruCache<String, n> LIZ = new LruCache<>(5);
    public static boolean LIZIZ;

    public static String LJFF() {
        n nVar;
        try {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            LiveMode streamType = room != null ? room.getStreamType() : null;
            if (streamType == LiveMode.LIVE_STUDIO || streamType == LiveMode.THIRD_PARTY) {
                return LivesdkLsWatchLinkmicSettingsSetting.INSTANCE.getValue().toString();
            }
            Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room2 == null || (nVar = LIZ.get(room2.getIdStr())) == null) {
                return null;
            }
            return nVar.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1CC2.LIZ("getRawStringValue error", th);
            return null;
        }
    }

    public static boolean LIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(LIZIZ(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean LIZIZ(String str) {
        LiveMode streamType;
        n nVar;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room != null) {
            streamType = room.getStreamType();
        } else {
            streamType = null;
        }
        if (streamType != LiveMode.LIVE_STUDIO && streamType != LiveMode.THIRD_PARTY) {
            Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room2 != null && (nVar = LIZ.get(room2.getIdStr())) != null && nVar.LJJIJIIJIL(str)) {
                return true;
            }
            return false;
        }
        return LivesdkLsWatchLinkmicSettingsSetting.INSTANCE.getValue().containsKey(str);
    }

    public static Boolean LIZLLL(String str) {
        LiveMode streamType;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        k kVarLJJIIZ3;
        try {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room != null) {
                streamType = room.getStreamType();
            } else {
                streamType = null;
            }
            if (streamType != LiveMode.LIVE_STUDIO && streamType != LiveMode.THIRD_PARTY) {
                Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if (room2 == null) {
                    return null;
                }
                if (SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_anchor_side_exp_config_read_opt", true)) {
                    LruCache<String, n> lruCache = LIZ;
                    n nVar = lruCache.get(room2.getIdStr());
                    if (nVar != null) {
                        kVarLJJIIZ2 = nVar.LJJIIZ(str);
                    } else {
                        kVarLJJIIZ2 = null;
                    }
                    if (kVarLJJIIZ2 != null) {
                        n nVar2 = lruCache.get(room2.getIdStr());
                        if (nVar2 == null || (kVarLJJIIZ3 = nVar2.LJJIIZ(str)) == null) {
                            return null;
                        }
                        return Boolean.valueOf(kVarLJJIIZ3.LJ());
                    }
                    return Boolean.valueOf(LIZJ(room2, str));
                }
                n nVar3 = LIZ.get(room2.getIdStr());
                if (nVar3 == null || (kVarLJJIIZ = nVar3.LJJIIZ(str)) == null) {
                    return null;
                }
                return Boolean.valueOf(kVarLJJIIZ.LJ());
            }
            k kVar = LivesdkLsWatchLinkmicSettingsSetting.INSTANCE.getValue().get(str);
            if (kVar == null) {
                return null;
            }
            return Boolean.valueOf(kVar.LJ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getBoolValue error ");
            sbLIZ.append(str);
            C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), th);
            return null;
        }
    }

    public static Integer LJ(String str) {
        LiveMode streamType;
        n nVar;
        k kVarLJJIIZ;
        try {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room != null) {
                streamType = room.getStreamType();
            } else {
                streamType = null;
            }
            if (streamType != LiveMode.LIVE_STUDIO && streamType != LiveMode.THIRD_PARTY) {
                Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if (room2 == null || (nVar = LIZ.get(room2.getIdStr())) == null || (kVarLJJIIZ = nVar.LJJIIZ(str)) == null) {
                    return null;
                }
                return Integer.valueOf(kVarLJJIIZ.LJIIJJI());
            }
            k kVar = LivesdkLsWatchLinkmicSettingsSetting.INSTANCE.getValue().get(str);
            if (kVar == null) {
                return null;
            }
            return Integer.valueOf(kVar.LJIIJJI());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getIntValue error ");
            sbLIZ.append(str);
            C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), th);
            return null;
        }
    }

    public static boolean LIZJ(Room room, String str) {
        n nVar;
        try {
            n nVarLJI = C2348809Ig.LJI(room.roomCreateAbParam);
            if (nVarLJI == null || (nVar = nVarLJI.LJJIJ("linkmic_ab_params")) == null) {
                nVar = new n();
            }
            LIZ.put(room.getIdStr(), nVar);
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                return kVarLJJIIZ.LJ();
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJ("LiveAbUtil.getAbParamsFromRoom#catch", String.valueOf(th));
            return false;
        }
    }

    public static final void LJI(String str, String str2) {
        if (str2.length() != 0) {
            if (str != null && str.length() == 0) {
                return;
            }
            LIZIZ = true;
            try {
                if (LIZ.put(str2, C2348809Ig.LJI(str)) != null) {
                    return;
                }
                C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("receive live sei = ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1143300frELJIIJJI.getClass();
                AbstractC1143290frD.LIZ("live_ab", strLIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1CC2.LIZ("parseSei error", th);
            }
        }
    }
}
