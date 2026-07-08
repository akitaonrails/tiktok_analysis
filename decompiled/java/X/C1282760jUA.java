package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS4S1101000_20;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.NodeOptParams;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.params.QuicParams;
import com.ss.pusher.core.params.UploadBWProbeParams;
import com.ss.pusher.core.transport.RTMPUploadBWProbe;
import com.ss.pusher.core.utils.AVLog;
import com.ss.pusher.core.utils.SafeHandlerThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jUA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282760jUA implements InterfaceC1282750jU9 {
    public RTMPUploadBWProbe LIZ;
    public SafeHandlerThread LIZIZ;
    public final SafeHandlerThread.SafeHandler LIZJ;
    public final LiveSdkSetting LIZLLL;
    public boolean LJ;
    public int LJFF;
    public String LJIIIZ;
    public long LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public InterfaceC1282830jUH LJIILL;
    public HashMap<String, String> LJIILLIIL;
    public InterfaceC1282750jU9 LJJI;
    public int LJI = 1;
    public final TEBundle LJII = new TEBundle();
    public final TEBundle LJIIIIZZ = new TEBundle();
    public String LJIILIIL = "";
    public int LJIILJJIL = -1;
    public boolean LJIIZILJ = false;
    public boolean LJIJ = false;
    public boolean LJIJI = false;
    public String LJIJJ = "";
    public final String LJIJJLI = "none";
    public HashMap<String, List<String>> LJIL = null;
    public int LJJ = 0;
    public int LJJIFFI = 0;
    public String LJJII = "no_retry";
    public List<String> LJJIII = new ArrayList();
    public long LJJIIJ = 0;

    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL() {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1282760jUA.LIZLLL():java.lang.String");
    }

    public final String LJFF() {
        if (TextUtils.isEmpty(this.LJIIJJI)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(e3.d);
        sbLIZ.append(this.LJIIJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJII() {
        int iLJIIJJI;
        String strLJIL;
        TEBundle tEBundle;
        TEBundle tEBundle2 = new TEBundle();
        TEBundle tEBundle3 = new TEBundle();
        LiveSdkSetting liveSdkSetting = this.LIZLLL;
        UploadBWProbeParams uploadBWProbeParams = liveSdkSetting.uploadBWProbeParams;
        QuicParams quicParams = uploadBWProbeParams.quicParams;
        PushBase pushBase = liveSdkSetting.mPushBase;
        boolean z = true;
        if (this.LJIIIIZZ != null && (tEBundle = this.LJII) != null) {
            this.LJ = uploadBWProbeParams.enableSendLogInfo;
            this.LJFF = uploadBWProbeParams.fixNotifyCrash;
            this.LJI = uploadBWProbeParams.releaseOldObject;
            tEBundle.setInt("bw_test_result_valid_time_ms", uploadBWProbeParams.resultValidTimeMS);
            this.LJII.setInt("bw_test_sample_number_of_stable_result", uploadBWProbeParams.sampleNumberOfStableResult);
            this.LJII.setInt("bw_test_retry_count_limit", uploadBWProbeParams.retryCountLimit);
            this.LJII.setInt("bw_test_fix_notify_crash", uploadBWProbeParams.fixNotifyCrash);
            this.LJII.setInt("bw_test_callback_after_stop", uploadBWProbeParams.callbackAfterStop);
            this.LJII.setInt("bw_test_report_at_destrcut", uploadBWProbeParams.reportAtDestruct);
            this.LJII.setInt("bw_test_report_at_stop", uploadBWProbeParams.reportAtStop);
            this.LJII.setInt("bw_test_report_api_detail", uploadBWProbeParams.reportApiDetail);
            this.LJII.setInt("upload_bw_test_time", uploadBWProbeParams.bWTestTime);
            this.LJII.setInt("upload_bw_test_time_ms", uploadBWProbeParams.bWTestTimeMS);
            this.LJII.setInt("packet_send_valid_time_ms", uploadBWProbeParams.packetSendValidTimeMS);
            this.LJII.setInt("PeakAvgCount", uploadBWProbeParams.peakAvgCount);
            this.LJII.setInt("SendPacketVersion", uploadBWProbeParams.sendPacketVersion);
            this.LJII.setInt("BwProbeDirectSendMode", uploadBWProbeParams.bwProbeDirectSendMode);
            this.LJII.setInt("TotalSendPacketSize", uploadBWProbeParams.totalSendPacketSize);
            this.LJII.setInt("upload_bw_probe_log_interval", uploadBWProbeParams.logInterval);
            this.LJII.setInt("bottom_line_540p", uploadBWProbeParams.bottomLine540p);
            this.LJII.setInt("bottom_line_720p", uploadBWProbeParams.bottomLine720p);
            this.LJII.setInt("BottomLine1080p", uploadBWProbeParams.bottomLine1080p);
            this.LJII.setInt("bottom_line_540p_bwe", uploadBWProbeParams.bottomLine540pBwe);
            this.LJII.setInt("bottom_line_720p_bwe", uploadBWProbeParams.bottomLine720pBwe);
            this.LJII.setInt("BottomLine1080pBwe", uploadBWProbeParams.bottomLine1080pBwe);
            this.LJII.setInt("upload_bw_probe_bottom_level", uploadBWProbeParams.bWProbeBottomLevel);
            this.LJII.setInt("upload_bw_probe_aim_level", uploadBWProbeParams.bWProbeAimLevel);
            this.LJII.setString("upload_bw_probe_suggest_protocol", uploadBWProbeParams.suggestProtocol);
            this.LJII.setInt("upload_bw_probe_result_strategy", uploadBWProbeParams.resultStrategy);
            this.LJII.setInt("upload_bw_probe_ewma_half_life", uploadBWProbeParams.ewmaHalfLife);
            this.LJII.setDouble("upload_bw_probe_ewma_estimate", uploadBWProbeParams.ewmaEstimate);
            this.LJII.setDouble("upload_bw_probe_ewma_weight", uploadBWProbeParams.ewmaWeight);
            this.LJII.setDouble("upload_bw_probe_first_order_filter_param", uploadBWProbeParams.firstOrderFilterParam);
            this.LJII.setInt("upload_bw_probe_log_interval_ms", uploadBWProbeParams.logIntervalMS);
            this.LJII.setInt("upload_bw_probe_report_bbr_info", uploadBWProbeParams.reportBbrInfo);
            this.LJII.setInt("pre_push_stream_threshold", uploadBWProbeParams.prePushStreamThreshold);
            this.LJII.setDouble("pre_push_stream_drop_frame_range", uploadBWProbeParams.prePushStreamDropFrameRange);
            this.LJII.setInt("pre_push_stream_fps", pushBase.fps);
            this.LJII.setInt("pre_push_stream_bitrate", pushBase.defaultBitrate);
            this.LJIIIIZZ.setLong("rtmp_init_video_bitrate", uploadBWProbeParams.defaultBitrate);
            this.LJIIIIZZ.setLong("rtmp_max_video_bitrate", uploadBWProbeParams.maxBitrate);
            this.LJIIIIZZ.setLong("rtmp_min_video_bitrate", uploadBWProbeParams.minBitrate);
            this.LJIIIIZZ.setString("video_type", uploadBWProbeParams.vCodec);
            this.LJIIIIZZ.setBool("video_enable_accelera", uploadBWProbeParams.useHardwareEncode);
            this.LJIIIIZZ.setInt("BwProbeDirectSendMode", uploadBWProbeParams.bwProbeDirectSendMode);
            this.LJIIIIZZ.setString("liveio_settings", pushBase.LJJJJIZL.toString());
            tEBundle2.setInt("open_timeout", uploadBWProbeParams.openTimeOut);
            tEBundle2.setInt("drop_video_frame_threshold_B", uploadBWProbeParams.dropVideoFrameThresholdB);
            tEBundle2.setInt("enable_refactor_report_net_info", 1);
            tEBundle2.setInt("log_interval_ms", uploadBWProbeParams.logIntervalMS);
            this.LJIIIIZZ.setBundle("rtmp_cache_cfg", tEBundle2);
            if (C173600la.LIZ(Integer.valueOf(quicParams.initCwnd))) {
                tEBundle3.setInt("init_cwnd", quicParams.initCwnd);
            }
            if (C173600la.LIZ(Integer.valueOf(quicParams.initMtu))) {
                tEBundle3.setInt("init_mtu", quicParams.initMtu);
            }
            if (C173600la.LIZ(Integer.valueOf(quicParams.enableMtuDiscovery))) {
                tEBundle3.setInt("enable_mtu_discovery", quicParams.enableMtuDiscovery);
            }
            if (C173600la.LIZ(Integer.valueOf(quicParams.initQuicType))) {
                tEBundle3.setInt("init_quic_type", quicParams.initQuicType);
            }
            if (C173600la.LIZ(Integer.valueOf(quicParams.congestionType))) {
                tEBundle3.setInt("congestion_type", quicParams.congestionType);
            }
            if (C173600la.LIZ(Integer.valueOf(quicParams.enbaleBbrInfoReport))) {
                tEBundle3.setInt("enable_bbrinfo_report", quicParams.enbaleBbrInfoReport);
            }
            if (C173600la.LIZ(Integer.valueOf(quicParams.quicVersion))) {
                tEBundle3.setInt("quic_version", quicParams.quicVersion);
            } else {
                tEBundle3.setInt("quic_version", 43);
            }
            n nVar = quicParams.quicConfigJson;
            if (nVar != null) {
                tEBundle3.setString("quic_config_json", nVar.toString());
            }
            n nVar2 = quicParams.quicEngineParam;
            if (nVar2 != null) {
                tEBundle3.setString("quic_engine_param", nVar2.toString());
            }
            this.LJIIIIZZ.setBundle("quic_params", tEBundle3);
        }
        LJIIIZ(uploadBWProbeParams);
        if (uploadBWProbeParams.retryCountLimit > 0 && this.LJJIFFI == 0) {
            UploadBWProbeParams uploadBWProbeParams2 = this.LIZLLL.uploadBWProbeParams;
            n nVar3 = uploadBWProbeParams2.protocolDownGradeDetail;
            int i = uploadBWProbeParams2.retryCountLimit;
            if (nVar3.size() != 0 && nVar3.LJJIJIIJIL("ProtocolDownGradeMode") && nVar3.LJJIJIIJIL("ProtocolOrder")) {
                try {
                    iLJIIJJI = nVar3.LJJIIZ("ProtocolDownGradeMode").LJIIJJI();
                } catch (Exception e) {
                    e = e;
                    iLJIIJJI = 0;
                }
                try {
                    strLJIL = nVar3.LJJIIZ("ProtocolOrder").LJIL();
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    strLJIL = null;
                }
                if (!TextUtils.isEmpty(strLJIL)) {
                    List<String> listAsList = Arrays.asList(strLJIL.split(","));
                    if (iLJIIJJI == 1) {
                        this.LJJIII = listAsList;
                    } else if (iLJIIJJI == 2) {
                        for (int i2 = 0; i2 < i; i2++) {
                            this.LJJIII.add((String) ListProtector.get(listAsList, i2 % listAsList.size()));
                        }
                    } else if (iLJIIJJI != 3) {
                        for (int i3 = 0; i3 < i; i3++) {
                            this.LJJIII.add(uploadBWProbeParams2.suggestProtocol);
                        }
                    } else {
                        int size = i / listAsList.size();
                        int size2 = (i - (listAsList.size() * size)) + size;
                        int i4 = 0;
                        while (i4 < listAsList.size()) {
                            int i5 = i4 == 0 ? size2 : size;
                            for (int i6 = 0; i6 < i5; i6++) {
                                this.LJJIII.add((String) ListProtector.get(listAsList, i4));
                            }
                            i4++;
                        }
                    }
                }
            } else {
                for (int i7 = 0; i7 < i; i7++) {
                    this.LJJIII.add(uploadBWProbeParams2.suggestProtocol);
                }
            }
        }
        NodeOptParams nodeOptParams = this.LIZLLL.nodeOpt;
        if (nodeOptParams != null) {
            boolean z2 = nodeOptParams.strategyNodeOpt;
            this.LJIJI = z2;
            if (z2 && this.LJIILLIIL == null) {
                this.LJIILLIIL = new HashMap<>();
                AVLog.ioe("LiveCoreUploadBWProbe", "dostart mOptUrlMap is not null");
            }
        }
        if (this.LJIILL == null && !this.LJIJI) {
            z = false;
        }
        this.LJIIZILJ = z;
        this.LJIJ = false;
        this.LJIJJ = "";
    }

    public static void LIZJ(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bwProbeState", 2);
            jSONObject.put("bwProbeFailReason_", i);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AVLog.logKibanaEvent(4, "LiveCoreUploadBWProbe", "bw_probe", false, C786410Ut5.J3(jSONObject), null);
    }

    public final String LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("retryCount", this.LJJIFFI);
                jSONObject.put("retryReason", this.LJJII);
                str = C786410Ut5.J3(jSONObject);
                return str;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(java.lang.String r8) {
        /*
            r7 = this;
            com.ss.pusher.core.params.LiveSdkSetting r0 = r7.LIZLLL
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r0.LJFF
            if (r2 == 0) goto L18
            r8.getClass()
            int r0 = r8.hashCode()
            java.lang.String r6 = "quic"
            java.lang.String r5 = "tls"
            java.lang.String r4 = "tcp"
            java.lang.String r3 = "kcp"
            switch(r0) {
                case 106008: goto L29;
                case 114657: goto L21;
                case 114939: goto L36;
                case 3482174: goto L19;
                default: goto L18;
            }
        L18:
            return
        L19:
            boolean r0 = r8.equals(r6)
            if (r0 == 0) goto L18
            r0 = 3
            goto L30
        L21:
            boolean r0 = r8.equals(r4)
            if (r0 == 0) goto L18
            r0 = 1
            goto L30
        L29:
            boolean r0 = r8.equals(r3)
            if (r0 == 0) goto L18
            r0 = 0
        L30:
            r1 = 1935(0x78f, float:2.712E-42)
            switch(r0) {
                case 0: goto L8b;
                case 1: goto L72;
                case 2: goto L56;
                case 3: goto L3d;
                default: goto L35;
            }
        L35:
            return
        L36:
            boolean r0 = r8.equals(r5)
            if (r0 != 0) goto L56
            return
        L3d:
            java.lang.String r0 = "rtmpq://"
            r7.LJIILIIL = r0
            java.util.HashMap r2 = (java.util.HashMap) r2
            boolean r0 = r2.containsKey(r6)
            if (r0 == 0) goto L53
            java.lang.Object r0 = r2.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
        L53:
            r7.LJIILJJIL = r1
            return
        L56:
            java.lang.String r0 = "rtmps://"
            r7.LJIILIIL = r0
            java.util.HashMap r2 = (java.util.HashMap) r2
            boolean r0 = r2.containsKey(r5)
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r2.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L6c:
            r7.LJIILJJIL = r0
            return
        L6f:
            r0 = 443(0x1bb, float:6.21E-43)
            goto L6c
        L72:
            java.lang.String r0 = "rtmp://"
            r7.LJIILIIL = r0
            java.util.HashMap r2 = (java.util.HashMap) r2
            boolean r0 = r2.containsKey(r4)
            if (r0 == 0) goto L88
            java.lang.Object r0 = r2.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
        L88:
            r7.LJIILJJIL = r1
            return
        L8b:
            java.lang.String r0 = "rtmpk://"
            r7.LJIILIIL = r0
            java.util.HashMap r2 = (java.util.HashMap) r2
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto La1
            java.lang.Object r0 = r2.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
        La1:
            r7.LJIILJJIL = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1282760jUA.LJI(java.lang.String):void");
    }

    public final int LJIIIIZZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startBWTest(), url : ");
        sbLIZ.append(str);
        AVLog.logKibana(4, "LiveCoreUploadBWProbe", C2188811AlT.LIZIZ(sbLIZ), null);
        if (str != null && !TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("\\?");
            if (strArrSplit != null && strArrSplit.length >= 1 && strArrSplit[0].contains(".sdp")) {
                if (this.LJJI != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("reason", 5);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    this.LJJI.LIZ(2, 0, 0L, C786410Ut5.J3(jSONObject));
                    LIZJ(5);
                }
                return -1;
            }
            if (this.LJI == 0) {
                if (this.LJFF == 0) {
                    if (this.LJJI != null) {
                        this.LIZ = new RTMPUploadBWProbe(this);
                    }
                    if (this.LIZ == null) {
                        return -1;
                    }
                }
                long j = this.LJJIIJ;
                RTMPUploadBWProbe rTMPUploadBWProbe = this.LIZ;
                if (rTMPUploadBWProbe != null) {
                    rTMPUploadBWProbe.SetStartNativeApiCallTime1970(j);
                }
            }
            C786410Ut5.LJJZZIII(this.LIZJ, new ARunnableS4S1101000_20(this, str, 3));
            return 0;
        }
        if (this.LJJI != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("reason", 4);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            this.LJJI.LIZ(2, 0, 0L, C786410Ut5.J3(jSONObject2));
            LIZJ(4);
        }
        return -1;
    }

    public final void LJIIIZ(UploadBWProbeParams uploadBWProbeParams) {
        int i;
        int i2;
        try {
            new n();
            if (uploadBWProbeParams.retryCountLimit > 0 && (i = this.LJJIFFI) > 0) {
                String str = this.LJJIII.get(i - 1);
                n nVarLJJIJ = this.LIZLLL.uploadBWProbeParams.protocolDownGradeDetail.LJJIJ(str);
                if (!TextUtils.equals(str, this.LIZLLL.uploadBWProbeParams.suggestProtocol)) {
                    if (nVarLJJIJ.LJJIJIIJIL("EnableSendLogInfo")) {
                        this.LJ = nVarLJJIJ.LJJIIZ("EnableSendLogInfo").LJ();
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("FixNotifyCrash")) {
                        this.LJFF = nVarLJJIJ.LJJIIZ("FixNotifyCrash").LJIIJJI();
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("ReleaseOldObject")) {
                        this.LJI = nVarLJJIJ.LJJIIZ("ReleaseOldObject").LJIIJJI();
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("resultValidTimeMS")) {
                        this.LJII.setInt("bw_test_result_valid_time_ms", nVarLJJIJ.LJJIIZ("resultValidTimeMS").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("sampleNumberOfStableResult")) {
                        this.LJII.setInt("bw_test_sample_number_of_stable_result", nVarLJJIJ.LJJIIZ("sampleNumberOfStableResult").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("retryCountLimit")) {
                        this.LJII.setInt("bw_test_retry_count_limit", nVarLJJIJ.LJJIIZ("retryCountLimit").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("FixNotifyCrash")) {
                        this.LJII.setInt("bw_test_fix_notify_crash", nVarLJJIJ.LJJIIZ("FixNotifyCrash").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("CallbackAfterStop")) {
                        this.LJII.setInt("bw_test_callback_after_stop", nVarLJJIJ.LJJIIZ("CallbackAfterStop").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("ReportAtDestruct")) {
                        this.LJII.setInt("bw_test_report_at_destrcut", nVarLJJIJ.LJJIIZ("ReportAtDestruct").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("ReportAtStop")) {
                        this.LJII.setInt("bw_test_report_at_stop", nVarLJJIJ.LJJIIZ("ReportAtStop").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("ReportApiDetail")) {
                        this.LJII.setInt("bw_test_report_api_detail", nVarLJJIJ.LJJIIZ("ReportApiDetail").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("bWTestTime")) {
                        this.LJII.setInt("upload_bw_test_time", nVarLJJIJ.LJJIIZ("bWTestTime").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("bWTestTimeMS")) {
                        this.LJII.setInt("upload_bw_test_time_ms", nVarLJJIJ.LJJIIZ("bWTestTimeMS").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("packetSendValidTimeMS")) {
                        this.LJII.setInt("packet_send_valid_time_ms", nVarLJJIJ.LJJIIZ("packetSendValidTimeMS").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("PeakAvgCount")) {
                        this.LJII.setInt("PeakAvgCount", nVarLJJIJ.LJJIIZ("PeakAvgCount").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("SendPacketVersion")) {
                        this.LJII.setInt("SendPacketVersion", nVarLJJIJ.LJJIIZ("SendPacketVersion").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("BwProbeDirectSendMode")) {
                        this.LJII.setInt("BwProbeDirectSendMode", nVarLJJIJ.LJJIIZ("BwProbeDirectSendMode").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("TotalSendPacketSize")) {
                        this.LJII.setInt("TotalSendPacketSize", nVarLJJIJ.LJJIIZ("TotalSendPacketSize").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("logInterval")) {
                        this.LJII.setInt("upload_bw_probe_log_interval", nVarLJJIJ.LJJIIZ("logInterval").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("BottomLine540p")) {
                        this.LJII.setInt("bottom_line_540p", nVarLJJIJ.LJJIIZ("BottomLine540p").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("BottomLine720p")) {
                        this.LJII.setInt("bottom_line_720p", nVarLJJIJ.LJJIIZ("BottomLine720p").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("BottomLine1080p")) {
                        this.LJII.setInt("BottomLine1080p", nVarLJJIJ.LJJIIZ("BottomLine1080p").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("BottomLine540pBwe")) {
                        this.LJII.setInt("bottom_line_540p_bwe", nVarLJJIJ.LJJIIZ("BottomLine540pBwe").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("BottomLine720pBwe")) {
                        this.LJII.setInt("bottom_line_720p_bwe", nVarLJJIJ.LJJIIZ("BottomLine720pBwe").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("BottomLine1080pBwe")) {
                        this.LJII.setInt("BottomLine1080pBwe", nVarLJJIJ.LJJIIZ("BottomLine1080pBwe").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("BWProbeBottomLevel")) {
                        this.LJII.setInt("upload_bw_probe_bottom_level", nVarLJJIJ.LJJIIZ("BWProbeBottomLevel").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("BWProbeAimLevel")) {
                        this.LJII.setInt("upload_bw_probe_aim_level", nVarLJJIJ.LJJIIZ("BWProbeAimLevel").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("SuggestProtocol")) {
                        this.LJII.setString("upload_bw_probe_suggest_protocol", nVarLJJIJ.LJJIIZ("SuggestProtocol").LJIL());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("ResultStrategy")) {
                        this.LJII.setInt("upload_bw_probe_result_strategy", nVarLJJIJ.LJJIIZ("ResultStrategy").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("EwmaHalfLife")) {
                        this.LJII.setInt("upload_bw_probe_ewma_half_life", nVarLJJIJ.LJJIIZ("EwmaHalfLife").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("EwmaEstimate")) {
                        this.LJII.setDouble("upload_bw_probe_ewma_estimate", nVarLJJIJ.LJJIIZ("EwmaEstimate").LJIIIZ());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("EwmaWeight")) {
                        this.LJII.setDouble("upload_bw_probe_ewma_weight", nVarLJJIJ.LJJIIZ("EwmaWeight").LJIIIZ());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("FirstOrderFilterParam")) {
                        this.LJII.setDouble("upload_bw_probe_first_order_filter_param", nVarLJJIJ.LJJIIZ("FirstOrderFilterParam").LJIIIZ());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("logIntervalMS")) {
                        this.LJII.setInt("upload_bw_probe_log_interval_ms", nVarLJJIJ.LJJIIZ("logIntervalMS").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("ReportBbrInfo")) {
                        this.LJII.setInt("upload_bw_probe_report_bbr_info", nVarLJJIJ.LJJIIZ("ReportBbrInfo").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("prePushStreamThreshold")) {
                        this.LJII.setInt("pre_push_stream_threshold", nVarLJJIJ.LJJIIZ("prePushStreamThreshold").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("prePushStreamDropFrameRange")) {
                        this.LJII.setDouble("pre_push_stream_drop_frame_range", nVarLJJIJ.LJJIIZ("prePushStreamDropFrameRange").LJIIIZ());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("defaultBitrate")) {
                        this.LJIIIIZZ.setLong("rtmp_init_video_bitrate", nVarLJJIJ.LJJIIZ("defaultBitrate").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("maxBitrate")) {
                        this.LJIIIIZZ.setLong("rtmp_max_video_bitrate", nVarLJJIJ.LJJIIZ("maxBitrate").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("minBitrate")) {
                        this.LJIIIIZZ.setLong("rtmp_min_video_bitrate", nVarLJJIJ.LJJIIZ("minBitrate").LJIIJJI());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("vCodec")) {
                        this.LJIIIIZZ.setString("video_type", nVarLJJIJ.LJJIIZ("vCodec").LJIL());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("useHardware")) {
                        this.LJIIIIZZ.setBool("video_enable_accelera", nVarLJJIJ.LJJIIZ("useHardware").LJ());
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("BwProbeDirectSendMode")) {
                        this.LJIIIIZZ.setInt("BwProbeDirectSendMode", nVarLJJIJ.LJJIIZ("BwProbeDirectSendMode").LJIIJJI());
                    }
                    TEBundle tEBundle = new TEBundle();
                    if (nVarLJJIJ.LJJIJIIJIL("openTimeout")) {
                        tEBundle.setInt("open_timeout", nVarLJJIJ.LJJIIZ("openTimeout").LJIIJJI());
                        i2 = 1;
                    } else {
                        i2 = 1;
                        tEBundle.setInt("open_timeout", uploadBWProbeParams.openTimeOut);
                    }
                    if (nVarLJJIJ.LJJIJIIJIL("dropVideoFrameThresholdB")) {
                        tEBundle.setInt("drop_video_frame_threshold_B", nVarLJJIJ.LJJIIZ("dropVideoFrameThresholdB").LJIIJJI());
                    } else {
                        tEBundle.setInt("drop_video_frame_threshold_B", uploadBWProbeParams.dropVideoFrameThresholdB);
                    }
                    tEBundle.setInt("enable_refactor_report_net_info", i2);
                    if (nVarLJJIJ.LJJIJIIJIL("logIntervalMS")) {
                        tEBundle.setInt("log_interval_ms", nVarLJJIJ.LJJIIZ("logIntervalMS").LJIIJJI());
                    } else {
                        tEBundle.setInt("log_interval_ms", uploadBWProbeParams.logIntervalMS);
                    }
                    this.LJIIIIZZ.setBundle("rtmp_cache_cfg", tEBundle);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1282760jUA(C1282780jUC c1282780jUC, LiveSdkSetting liveSdkSetting) {
        this.LJJI = c1282780jUC;
        this.LIZLLL = liveSdkSetting;
        SafeHandlerThread safeHandlerThread = new SafeHandlerThread("LiveCoreWorkUploadBWProbeThread");
        this.LIZIZ = safeHandlerThread;
        safeHandlerThread.start();
        this.LIZJ = (SafeHandlerThread.SafeHandler) this.LIZIZ.getHandler();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[LOOP:0: B:6:0x001a->B:20:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0042 A[EDGE_INSN: B:82:0x0042->B:24:0x0042 BREAK  A[LOOP:0: B:6:0x001a->B:20:0x0039], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] LJ(X.InterfaceC1282830jUH r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1282760jUA.LJ(X.0jUH, java.lang.String):java.lang.String[]");
    }

    @Override // X.InterfaceC1282750jU9
    public final void LIZ(int i, int i2, long j, String str) {
        int i3;
        UploadBWProbeParams uploadBWProbeParams = this.LIZLLL.uploadBWProbeParams;
        if (i == 2 && (i3 = uploadBWProbeParams.retryCountLimit) > 0 && this.LJJIFFI < i3 && System.currentTimeMillis() - this.LJJIIJ < uploadBWProbeParams.bWTestTimeMS) {
            this.LJJIFFI++;
            if (!TextUtils.isEmpty(str)) {
                try {
                    str.toString();
                    JSONObject jSONObject = new JSONObject(str);
                    if (TextUtils.equals(this.LJJII, "no_retry")) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(JSONObjectProtectorUtils.getString(jSONObject, "reason"));
                        sbLIZ.append("-");
                        sbLIZ.append(JSONObjectProtectorUtils.getString(jSONObject, "event1"));
                        this.LJJII = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(this.LJJII);
                        sbLIZ2.append(",");
                        sbLIZ2.append(JSONObjectProtectorUtils.getString(jSONObject, "reason"));
                        sbLIZ2.append("-");
                        sbLIZ2.append(JSONObjectProtectorUtils.getString(jSONObject, "event1"));
                        this.LJJII = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (this.LJI == 0) {
                RTMPUploadBWProbe rTMPUploadBWProbe = this.LIZ;
                rTMPUploadBWProbe.disableCallback();
                C786410Ut5.LJJZZIII(this.LIZJ, new ARunnableS120S0100000_20(rTMPUploadBWProbe, 99));
            }
            LJII();
            int iCurrentTimeMillis = (int) (((long) this.LIZLLL.uploadBWProbeParams.bWTestTimeMS) - (System.currentTimeMillis() - this.LJJIIJ));
            this.LJII.setInt("upload_bw_test_time_ms", iCurrentTimeMillis);
            this.LJII.setInt("bw_test_retry_count", this.LJJIFFI);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("call startBWTestInternal in startBWTestRetry, and test url is ");
            sbLIZ3.append(this.LJIIIZ);
            sbLIZ3.append(", and retry reason is ");
            sbLIZ3.append(this.LJJII);
            sbLIZ3.append(", and rest test duration is ");
            sbLIZ3.append(iCurrentTimeMillis);
            AVLog.i("LiveCoreUploadBWProbe", C2188811AlT.LIZIZ(sbLIZ3));
            LJIIIIZZ(this.LJIIIZ);
            return;
        }
        this.LJJI.LIZ(i, i2, j, LIZIZ(str));
    }
}
