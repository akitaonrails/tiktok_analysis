package X;

import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tracking.TrackingEventV3Data;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0x2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803820x2a implements InterfaceC1804890x4J {
    public static final void LJIIJJI(DataChannel dataChannel) {
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJIJJLI(dataChannel);
    }

    @Override // X.InterfaceC1804890x4J
    public final void LJIIIZ(DataChannel dataChannel) {
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJIL(dataChannel);
    }

    @Override // X.InterfaceC1804890x4J
    public final void LJ(C1803830x2b c1803830x2b, C1797200wru c1797200wru) {
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJJI(c1803830x2b, c1797200wru);
    }

    @Override // X.InterfaceC1804890x4J
    public final void LIZLLL(String str, String str2, boolean z) {
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJJJJJ(str, str2, z);
    }

    @Override // X.InterfaceC1804890x4J
    public final void LJI(long j, InterfaceC1284030jWD interfaceC1284030jWD, C1805530x5L c1805530x5L, Throwable th) {
        int i;
        C1803830x2b c1803830x2b;
        HashMap map = new HashMap();
        if (c1805530x5L != null && (c1803830x2b = c1805530x5L.LLILLL) != null) {
            i = c1803830x2b.LJ;
        } else {
            i = 0;
        }
        map.put("charge_source", Integer.valueOf(i));
        map.put("cost", Long.valueOf(System.currentTimeMillis() - j));
        map.put("error_msg", th.toString());
        map.put("cache_policy", interfaceC1284030jWD.toString());
        Throwable thLIZ = C1803480x22.LIZ(th);
        C1149180g0i.Companion.getClass();
        C1149180g0i c1149180g0iLIZ = C1149170g0h.LIZ(thLIZ);
        C1803440x1y.LIZJ("ttlive_wallet_recharge_panel_show", c1149180g0iLIZ.getErrorCode(), c1149180g0iLIZ.getDetailCode(), thLIZ.getMessage(), map);
        C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_wallet_recharge_panel_load_package_fail", C2348809Ig.LIZLLL(map), null, null, null, "wallet");
    }

    @Override // X.InterfaceC1804890x4J
    public final void LJFF(long j, InterfaceC1284030jWD interfaceC1284030jWD, C1805530x5L c1805530x5L, Throwable th, Map map) {
        int i;
        String message;
        C1803830x2b c1803830x2b;
        HashMap map2 = new HashMap();
        if (c1805530x5L != null && (c1803830x2b = c1805530x5L.LLILLL) != null) {
            i = c1803830x2b.LJ;
        } else {
            i = 0;
        }
        map2.put("charge_source", Integer.valueOf(i));
        map2.put("cost", Long.valueOf(System.currentTimeMillis() - j));
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        map2.put("error_msg", message);
        map2.put("use_fallback_cache", 1);
        map2.put("cache_policy", interfaceC1284030jWD.toString());
        map2.put("hit_cache", 1);
        if (map != null) {
            map2.putAll(map);
        }
        C1803440x1y.LIZ("ttlive_wallet_recharge_panel_use_fallback_cache", map2);
        C1796530wqp.LJIIJ(map2);
    }

    @Override // X.InterfaceC1804890x4J
    public final void LIZ(Throwable th, C1803830x2b c1803830x2b, boolean z, C1805370x55 c1805370x55, DataChannel dataChannel, int i) {
        C1797200wru c1797200wruLIZIZ = C1803530x27.LIZIZ(th);
        int errorCode = c1797200wruLIZIZ.getErrorCode();
        int detailCode = c1797200wruLIZIZ.getDetailCode();
        int internalCode = c1797200wruLIZIZ.getInternalCode();
        String mappedErrorCode = c1797200wruLIZIZ.getMappedErrorCode();
        String mappedErrorMessage = c1797200wruLIZIZ.getMappedErrorMessage();
        Exception exception = c1797200wruLIZIZ.getException();
        C1797200wru c1797200wru = new C1797200wru(1, errorCode, detailCode, mappedErrorCode, mappedErrorMessage, "ttlive_query_pipo_purchase", exception, null, null, 0, internalCode, null, 2944, null);
        C1803800x2Y.LIZ.getClass();
        String str = null;
        C1803800x2Y.LJJII(c1803830x2b, c1797200wru, false, null);
        if (c1805370x55 != null) {
            str = c1805370x55.LJ;
        }
        C1803800x2Y.LJJIJL(null, null, String.valueOf(str), c1803830x2b, dataChannel, "recharge_panel_load_package", c1797200wru.getErrorCode(), c1797200wru.getDetailCode(), c1797200wru.getException().getMessage(), c1797200wru.getMappedErrorCode(), c1797200wru.getMappedErrorMessage(), null, i);
        C1803540x28.LJI(String.valueOf(errorCode), String.valueOf(detailCode), exception.getMessage());
        if (z) {
            C1803800x2Y.LJJIFFI(c1803830x2b, "retry", false, exception);
        }
    }

    @Override // X.InterfaceC1804890x4J
    public final TrackingEventV3Data LIZIZ(C1803830x2b c1803830x2b, String str, boolean z, boolean z2, String str2, boolean z3) {
        String str3;
        String str4;
        String str5;
        String str6;
        if (c1803830x2b != null) {
            String str7 = c1803830x2b.LJIIL;
            int iIntValue = 0;
            if (str7 != null && str7.length() != 0 && c1803830x2b != null && (str3 = c1803830x2b.LIZLLL) != null && str3.length() != 0) {
                boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(z));
                boolean zLJJJI2 = C500260Jjc.LJJJI(Boolean.valueOf(z3));
                if (z2) {
                    str4 = "customized";
                } else {
                    str4 = "normal";
                }
                if (c1803830x2b != null) {
                    str5 = c1803830x2b.LJIIL;
                } else {
                    str5 = null;
                }
                if (c1803830x2b != null) {
                    str6 = c1803830x2b.LIZLLL;
                } else {
                    str6 = null;
                }
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(C1803840x2c.LIZ(null));
                if (numLJIIJJI != null) {
                    iIntValue = numLJIIJJI.intValue();
                }
                return new TrackingEventV3Data(zLJJJI ? 1 : 0, str, zLJJJI2 ? 1 : 0, str2, str4, str5, null, null, str6, iIntValue, 0, null, null);
            }
        }
        return null;
    }

    @Override // X.InterfaceC1804890x4J
    public final void LJIIIIZZ(C1805530x5L c1805530x5L, long j, String str, InterfaceC1284030jWD interfaceC1284030jWD, boolean z, Map map) {
        int i;
        C1803830x2b c1803830x2b;
        HashMap map2 = new HashMap();
        if (c1805530x5L != null && (c1803830x2b = c1805530x5L.LLILLL) != null) {
            i = c1803830x2b.LJ;
        } else {
            i = 0;
        }
        map2.put("charge_source", Integer.valueOf(i));
        C1803550x29.LJIL = str;
        map2.put("cost", Long.valueOf(System.currentTimeMillis() - j));
        map2.put("cache_policy", interfaceC1284030jWD.toString());
        map2.put("hit_cache", Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0));
        if (map != null) {
            map2.putAll(map);
        }
        C1803440x1y.LIZ("ttlive_wallet_recharge_panel_show", map2);
        C1796530wqp.LJIIJ(map2);
    }

    @Override // X.InterfaceC1804890x4J
    public final void LJIIJ(C1805530x5L c1805530x5L, boolean z, C1805370x55 c1805370x55, C1805370x55 c1805370x552, boolean z2, Map<String, String> map, boolean z3, int i) {
        C1803830x2b c1803830x2b;
        int i2;
        Integer numValueOf;
        boolean z4;
        if (c1805530x5L != null && (c1803830x2b = c1805530x5L.LLILLL) != null) {
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            if (!z3 && c1805370x55 != null) {
                i2 = c1805370x55.LJI;
            } else {
                i2 = 0;
            }
            String str = c1803830x2b.LJIILLIIL;
            String str2 = c1803830x2b.LJIIL;
            String str3 = c1803830x2b.LIZLLL;
            int i3 = c1803830x2b.LJ;
            DataChannel dataChannel = c1805530x5L.LLILZ;
            String str4 = null;
            if (c1805370x552 != null) {
                numValueOf = Integer.valueOf(c1805370x552.LJI);
                str4 = c1805370x552.LJ;
            } else {
                numValueOf = null;
            }
            C1806860x7U c1806860x7U = c1805530x5L.LLILZIL.LIZ;
            if (c1805370x55 != null && c1805370x55.LJIIIIZZ) {
                z4 = true;
            } else {
                z4 = false;
            }
            Map<String, String> mapLIZIZ = c1806860x7U.LIZIZ(z4, true, false);
            Map<String, String> map2 = c1803830x2b.LIZJ;
            c1803800x2Y.getClass();
            C1803800x2Y.LJJIL(c1803830x2b, i2, str, str2, str3, i3, z, dataChannel, map2, numValueOf, str4, z2, mapLIZIZ, map, z3, i);
        }
    }

    @Override // X.InterfaceC1804890x4J
    public final void LJII(C1803830x2b c1803830x2b, DataChannel dataChannel, Diamond diamond, boolean z, boolean z2, Map<String, String> map, Map<String, String> map2, int i, int i2) {
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJJJJ(c1803830x2b, dataChannel, diamond, z, z2, map, map2, i, i2);
    }

    @Override // X.InterfaceC1804890x4J
    public final void LIZJ(C1805530x5L c1805530x5L, int i, C1805370x55 c1805370x55, C1805370x55 c1805370x552, boolean z, Map<String, String> map, boolean z2, int i2, long j, int i3) {
        Integer value;
        int i4;
        String str;
        boolean z3;
        int i5 = i2;
        C1803830x2b c1803830x2b = c1805530x5L.LLILLL;
        if (c1803830x2b != null) {
            LiveData<Integer> liveData = c1805530x5L.LLILZIL.LIZLLL;
            Integer numValueOf = null;
            if (liveData != null) {
                value = liveData.getValue();
            } else {
                value = null;
            }
            if (!z2 && value != null && j > value.intValue()) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            if (z2) {
                i5 = 0;
            }
            DataChannel dataChannel = c1805530x5L.LLILZ;
            Map<String, String> map2 = c1803830x2b.LIZJ;
            if (c1805370x552 != null) {
                numValueOf = Integer.valueOf(c1805370x552.LJI);
                str = c1805370x552.LJ;
            } else {
                str = null;
            }
            C1806860x7U c1806860x7U = c1805530x5L.LLILZIL.LIZ;
            if (c1805370x55 != null && c1805370x55.LJIIIIZZ) {
                z3 = true;
            } else {
                z3 = false;
            }
            Map<String, String> mapLIZIZ = c1806860x7U.LIZIZ(z3, true, false);
            c1803800x2Y.getClass();
            C1803800x2Y.LJJJIL(i5, i, c1803830x2b, dataChannel, map2, numValueOf, str, z, mapLIZIZ, map, z2, i3, i4);
        }
    }
}
