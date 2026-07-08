package X;

import Y.ARunnableS0S0100200_7;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.scene.Scene;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0IMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465330IMp {
    public static void LIZ(final long j, final long j2, final long j3, final C465350IMr c465350IMr, final C1494850p0F c1494850p0F, final C1494570ozn c1494570ozn) {
        if (!SlardarSampleSetting.INSTANCE.isReport("livesdk_room_enter_full_link_duration", 0.0d)) {
            return;
        }
        if (c1494570ozn != null && c1494850p0F != null) {
            C08D5.LIZIZ(C0IK5.LIZ(), new Runnable() { // from class: X.0pIo
                public final void LIZ() {
                    boolean z;
                    n nVarLJJIJ;
                    h hVarLJJIIZI;
                    k kVarLJJIIZ;
                    k kVarLJJIIZ2;
                    k kVarLJJIIZ3;
                    HashMap map = new HashMap();
                    if (c1494570ozn.LJIL != 0) {
                        map.put("sync", "1");
                        z = true;
                    } else {
                        map.put("sync", CardStruct.IStatusCode.DEFAULT);
                        z = false;
                    }
                    map.put("start_request", String.valueOf(j));
                    map.put("observer_time", String.valueOf(c1494570ozn.LJIILIIL - j));
                    if (!z) {
                        C1494570ozn c1494570ozn2 = c1494570ozn;
                        map.put("async_schedule_time", String.valueOf(c1494570ozn2.LJJIIZI - c1494570ozn2.LJJIJIIJI));
                    }
                    C1494570ozn c1494570ozn3 = c1494570ozn;
                    map.put("request_serializer_time", String.valueOf(c1494570ozn3.LJJIIZI - c1494570ozn3.LJJIJ));
                    C1494570ozn c1494570ozn4 = c1494570ozn;
                    map.put("request_filter_time", String.valueOf(c1494570ozn4.LJIILL - c1494570ozn4.LJIILJJIL));
                    map.put("real_call_start", String.valueOf(c1494850p0F.LJI));
                    n nVarLJI = C2348809Ig.LJI(c1494850p0F.LJJIIJ);
                    n nVarLJJIJ2 = null;
                    n nVarLJJIJ3 = nVarLJI != null ? nVarLJI.LJJIJ("timing") : null;
                    n nVarLJI2 = C2348809Ig.LJI(c1494850p0F.LJJIIJ);
                    n nVarLJJIJ4 = nVarLJI2 != null ? nVarLJI2.LJJIJ("base") : null;
                    if (nVarLJJIJ3 != null) {
                        nVarLJJIJ2 = nVarLJJIJ3.LJJIJ("detailed_duration");
                        nVarLJJIJ = nVarLJJIJ3.LJJIJ("request");
                    } else {
                        nVarLJJIJ = null;
                    }
                    long jLJIIZILJ = -1;
                    long jLJIIZILJ2 = (nVarLJJIJ2 == null || (kVarLJJIIZ3 = nVarLJJIJ2.LJJIIZ("inner")) == null) ? -1L : kVarLJJIIZ3.LJIIZILJ();
                    long jLJIIZILJ3 = (nVarLJJIJ == null || (kVarLJJIIZ2 = nVarLJJIJ.LJJIIZ("duration")) == null) ? -1L : kVarLJJIIZ2.LJIIZILJ();
                    map.put("dns_time", String.valueOf(c1494850p0F.LJIIJ));
                    if (nVarLJJIJ2 != null && (kVarLJJIIZ = nVarLJJIJ2.LJJIIZ("rtt")) != null) {
                        jLJIIZILJ = kVarLJJIIZ.LJIIZILJ();
                    }
                    map.put("rtt_time", String.valueOf(jLJIIZILJ));
                    map.put("connect_time", String.valueOf(c1494850p0F.LJIIJJI));
                    map.put("inner_time", String.valueOf(jLJIIZILJ2));
                    map.put("ttnet_total_time", String.valueOf(jLJIIZILJ3));
                    map.put("network_time", String.valueOf(jLJIIZILJ3 - jLJIIZILJ2));
                    map.put("real_call_end", String.valueOf(c1494850p0F.LJIIIZ));
                    C1494570ozn c1494570ozn5 = c1494570ozn;
                    map.put("response_serializer_time", String.valueOf(c1494570ozn5.LJJIJLIJ - c1494570ozn5.LJJIJL));
                    long j4 = z ? c1494570ozn.LJJLIIIJILLIZJL : c1494570ozn.LJJLIIIJ;
                    map.put("response_filter_time", String.valueOf(j4 - c1494570ozn.LJJIJLIJ));
                    map.put("observer_callback_time", String.valueOf(j3 - j4));
                    map.put("finish_request", String.valueOf(j2));
                    map.put("request_total_time", String.valueOf(j2 - j));
                    C1494600ozq<?> c1494600ozq = c1494850p0F;
                    map.put("net_call_time", String.valueOf(c1494600ozq.LJIIIZ - c1494600ozq.LJI));
                    String str = c465350IMr.LIZIZ;
                    if (str != null) {
                        map.put("enter_from_merge", str);
                    }
                    String str2 = c465350IMr.LIZJ;
                    if (str2 != null) {
                        map.put("enter_method", str2);
                    }
                    String str3 = c465350IMr.LIZ;
                    if (str3 != null) {
                        map.put("action_type", str3);
                    }
                    String str4 = c465350IMr.LIZLLL;
                    if (str4 != null) {
                        map.put("log_id", str4);
                    }
                    String str5 = c465350IMr.LJ;
                    if (str5 != null) {
                        map.put("path", str5);
                    }
                    String str6 = c465350IMr.LJFF;
                    if (str6 != null) {
                        map.put(Scene.SCENE_SERVICE, str6);
                    }
                    String str7 = c465350IMr.LJI;
                    if (str7 != null) {
                        map.put("is_from_ec", str7);
                    }
                    if (nVarLJJIJ4 != null && (hVarLJJIIZI = nVarLJJIJ4.LJJIIZI("redirecting_list")) != null && hVarLJJIIZI.size() > 0) {
                        map.put("host", hVarLJJIIZI.LJJIIJZLJL(hVarLJJIIZI.size() - 1).toString());
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_room_enter_full_link_duration");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJIIZI(map);
                    if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                        c474500IjALIZ.LIZ();
                    } else {
                        c474500IjALIZ.LJJIJLIJ();
                        c474500IjALIZ.LJJIJL();
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveEnterRoomMonitor$Companion@20f9.reportLog$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveEnterRoomMonitor$Companion@20f9.reportLog$2");
                }
            }, null, 0L);
        } else {
            C08D5.LIZIZ(C0IK5.LIZ(), new ARunnableS0S0100200_7(j, j2, c465350IMr, 0), null, 0L);
        }
    }
}
