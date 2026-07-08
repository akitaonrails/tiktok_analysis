package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Asg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193281Asg implements InterfaceC2193371Asp {
    public static String LIZLLL = UUID.randomUUID().toString();
    public final InterfaceC2193271Asf LIZ;
    public int LIZIZ;
    public long LIZJ;

    static {
        System.currentTimeMillis();
    }

    public C2193281Asg(InterfaceC2193271Asf interfaceC2193271Asf) {
        this.LIZ = interfaceC2193271Asf;
    }

    public static void LJIIL(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C20684815ws.LJIJ("search_inspiration_banner_track_log", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIJJI(Map map, C19720512Dr c19720512Dr) {
        String str = c19720512Dr.LJ;
        if (str != null) {
            map.put("topic_id", str);
        }
        map.put("schema", c19720512Dr.LIZJ);
        String str2 = c19720512Dr.LJIJ;
        if (str2 != null) {
            map.put("logid", str2);
        }
        String str3 = c19720512Dr.LJIIIIZZ;
        if (str3 != null) {
            map.put("reco_id", str3);
        }
        String str4 = c19720512Dr.LIZ;
        if (str4 != null) {
            map.put("title", str4);
        }
        String str5 = c19720512Dr.LJIILL;
        if (str5 != null) {
            map.put("activity_name", str5);
        }
        Object obj = c19720512Dr.LJIIJ;
        if (obj == null) {
            obj = "";
        }
        map.put("topic_type", obj);
        String str6 = c19720512Dr.LJIIZILJ;
        if (str6 != null) {
            map.put("primary_scene", str6);
        }
    }

    @Override // X.InterfaceC2193371Asp
    public final void LJII(int i, long j) {
        this.LIZIZ = i;
        this.LIZJ = j;
    }

    public final Map<String, Object> LJIIJ(EnumC2193331Asl enumC2193331Asl, EnumC1735470vGL enumC1735470vGL, EnumC2193241Asc enumC2193241Asc) {
        String str;
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLJJI = this.LIZ.LJJI();
        long jLJIIZILJ = this.LIZ.LJIIZILJ();
        int iLJIJI = this.LIZ.LJIJI();
        long jLJIJJLI = this.LIZ.LJIJJLI();
        Pair[] pairArr = new Pair[16];
        boolean z2 = true;
        pairArr[0] = new Pair("is_cold_start", Boolean.valueOf(!C0CN5.LJI()));
        pairArr[1] = new Pair("stage", enumC2193331Asl.getValue());
        pairArr[2] = new Pair("result", enumC1735470vGL.getValue());
        if (C07BK.LIZ()) {
            str = "v3";
        } else {
            str = "v2";
        }
        pairArr[3] = new Pair("version", str);
        pairArr[4] = new Pair("local_timestamp", String.valueOf(jCurrentTimeMillis));
        pairArr[5] = new Pair("inspiration_session_id", LIZLLL);
        pairArr[6] = new Pair("trigger", enumC2193241Asc.getValue());
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        pairArr[7] = new Pair("user_id", curUserId);
        pairArr[8] = new Pair("user_post_count", Integer.valueOf(this.LIZIZ));
        pairArr[9] = new Pair("latest_post_time", Long.valueOf(this.LIZJ));
        pairArr[10] = new Pair("freq_timestamp", Long.valueOf(jLJJI));
        if (jLJJI > 0 && jCurrentTimeMillis >= jLJJI) {
            z = true;
        } else {
            z = false;
        }
        pairArr[11] = new Pair("freq_timestamp_expired", Boolean.valueOf(z));
        pairArr[12] = new Pair("banner_timestamp", Long.valueOf(jLJIIZILJ));
        if (jLJIIZILJ <= 0 || jCurrentTimeMillis < jLJIIZILJ) {
            z2 = false;
        }
        pairArr[13] = new Pair("banner_timestamp_expired", Boolean.valueOf(z2));
        pairArr[14] = new Pair("close_count", Integer.valueOf(iLJIJI));
        pairArr[15] = new Pair("close_timestamp", Long.valueOf(jLJIJJLI));
        return C2097608Jq.LJIIJ(pairArr);
    }

    @Override // X.InterfaceC2193371Asp
    public final void LJIIIIZZ(EnumC2193241Asc enumC2193241Asc, int i, long j, long j2) {
        Map<String, Object> mapLJIIJ = LJIIJ(EnumC2193331Asl.DELETE_CLOSE_CACHE, EnumC1735470vGL.SUCCESS, enumC2193241Asc);
        mapLJIIJ.put("before_close_count", Integer.valueOf(i));
        mapLJIIJ.put("before_close_timestamp", String.valueOf(j));
        mapLJIIJ.put("local_timestamp", String.valueOf(j2));
        LJIIL(mapLJIIJ);
    }

    @Override // X.InterfaceC2193371Asp
    public final void LJFF(EnumC2193241Asc enumC2193241Asc, C19720512Dr c19720512Dr, String str, EnumC2193251Asd enumC2193251Asd, int i, long j) {
        Map<String, Object> mapLJIIJ = LJIIJ(EnumC2193331Asl.BANNER_SWITCH, EnumC1735470vGL.SUCCESS, enumC2193241Asc);
        LJIIJJI(mapLJIIJ, c19720512Dr);
        mapLJIIJ.put("from_topic_id", str);
        mapLJIIJ.put("switch_reason", enumC2193251Asd.getValue());
        mapLJIIJ.put("remaining_banner_count", Integer.valueOf(i));
        mapLJIIJ.put("local_timestamp", String.valueOf(j));
        LJIIL(mapLJIIJ);
    }

    @Override // X.InterfaceC2193371Asp
    public final void LJI(C19720512Dr c19720512Dr, int i, int i2, long j, long j2, long j3) {
        Map<String, Object> mapLJIIJ = LJIIJ(EnumC2193331Asl.BANNER_CLOSE, EnumC1735470vGL.SUCCESS, EnumC2193241Asc.USER_INTERACTION);
        LJIIJJI(mapLJIIJ, c19720512Dr);
        mapLJIIJ.put("index", String.valueOf(i));
        mapLJIIJ.put("close_count", String.valueOf(i2));
        mapLJIIJ.put("total_exposure_duration", String.valueOf(j));
        mapLJIIJ.put("current_exposure_duration", String.valueOf(j2));
        mapLJIIJ.put("local_timestamp", String.valueOf(j3));
        LJIIL(mapLJIIJ);
    }

    @Override // X.InterfaceC2193371Asp
    public final void LIZJ(C19720512Dr c19720512Dr, EnumC1300180jwG enumC1300180jwG, String str, int i, long j, long j2, long j3) {
        Map<String, Object> mapLJIIJ = LJIIJ(EnumC2193331Asl.BANNER_CLICK, EnumC1735470vGL.SUCCESS, EnumC2193241Asc.USER_INTERACTION);
        LJIIJJI(mapLJIIJ, c19720512Dr);
        mapLJIIJ.put("schema", str);
        mapLJIIJ.put("click_area", enumC1300180jwG.getValue());
        mapLJIIJ.put("index", String.valueOf(i));
        mapLJIIJ.put("total_exposure_duration", String.valueOf(j));
        mapLJIIJ.put("current_exposure_duration", String.valueOf(j2));
        mapLJIIJ.put("local_timestamp", String.valueOf(j3));
        LJIIL(mapLJIIJ);
    }

    @Override // X.InterfaceC2193371Asp
    public final void LIZLLL(EnumC2193241Asc enumC2193241Asc, boolean z, long j, boolean z2, long j2, boolean z3, long j3) {
        Object obj;
        Map<String, Object> mapLJIIJ = LJIIJ(EnumC2193331Asl.REPO_INIT, EnumC1735470vGL.INIT, enumC2193241Asc);
        mapLJIIJ.put("is_cold_start", Boolean.valueOf(z));
        mapLJIIJ.put("is_first_show", Boolean.TRUE);
        mapLJIIJ.put("freq_timestamp", String.valueOf(j));
        String str = "true";
        if (z2) {
            obj = "true";
        } else {
            obj = "false";
        }
        mapLJIIJ.put("freq_timestamp_expired", obj);
        mapLJIIJ.put("banner_timestamp", String.valueOf(j2));
        if (!z3) {
            str = "false";
        }
        mapLJIIJ.put("banner_timestamp_expired", str);
        mapLJIIJ.put("local_timestamp", String.valueOf(j3));
        LJIIL(mapLJIIJ);
    }

    @Override // X.InterfaceC2193371Asp
    public final void LJ(EnumC2193241Asc enumC2193241Asc, String str, int i, long j, boolean z, long j2, String str2, int i2, String str3) {
        EnumC1735470vGL enumC1735470vGL;
        String str4;
        if (Intrinsics.LJFF(str, "success")) {
            enumC1735470vGL = EnumC1735470vGL.SUCCESS;
        } else {
            enumC1735470vGL = EnumC1735470vGL.FAIL;
        }
        Map<String, Object> mapLJIIJ = LJIIJ(EnumC2193331Asl.DATA_REQUEST, enumC1735470vGL, enumC2193241Asc);
        mapLJIIJ.put("response_banner_count", Integer.valueOf(i));
        mapLJIIJ.put("banner_timestamp", String.valueOf(j));
        if (z) {
            str4 = "true";
        } else {
            str4 = "false";
        }
        mapLJIIJ.put("banner_timestamp_expired", str4);
        mapLJIIJ.put("local_timestamp", String.valueOf(j2));
        if (str2 != null) {
            mapLJIIJ.put("logid", str2);
        }
        if (i2 != 0) {
            mapLJIIJ.put("error_code", Integer.valueOf(i2));
        }
        if (str3 != null) {
            mapLJIIJ.put("error_msg", str3);
        }
        LJIIL(mapLJIIJ);
    }

    @Override // X.InterfaceC2193371Asp
    public final void LIZIZ(EnumC2193241Asc enumC2193241Asc, C19720512Dr c19720512Dr, int i, int i2, boolean z, long j, long j2, long j3, Long l, Boolean bool) {
        String str;
        Map<String, Object> mapLJIIJ = LJIIJ(EnumC2193331Asl.BANNER_SHOW, EnumC1735470vGL.SUCCESS, enumC2193241Asc);
        LJIIJJI(mapLJIIJ, c19720512Dr);
        mapLJIIJ.put("is_first_show", Boolean.valueOf(z));
        mapLJIIJ.put("index", String.valueOf(i));
        mapLJIIJ.put("remaining_banner_count", Integer.valueOf(i2));
        mapLJIIJ.put("total_exposure_duration", String.valueOf(j));
        mapLJIIJ.put("current_exposure_duration", String.valueOf(j2));
        mapLJIIJ.put("local_timestamp", String.valueOf(j3));
        if (l != null) {
            mapLJIIJ.put("freq_timestamp", String.valueOf(l.longValue()));
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "true";
            } else {
                str = "false";
            }
            mapLJIIJ.put("freq_timestamp_expired", str);
        }
        LJIIL(mapLJIIJ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    @Override // X.InterfaceC2193371Asp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.EnumC2193241Asc r4, java.lang.String r5, java.lang.String r6, X.EnumC1154090g8d r7, java.lang.String r8, long r9, boolean r11, long r12, int r14, java.lang.String r15, java.lang.String r16) {
        /*
            r3 = this;
            int r0 = r6.hashCode()
            switch(r0) {
                case -1867169789: goto L84;
                case -21437972: goto L79;
                case 3532159: goto L6e;
                case 96784904: goto L63;
                default: goto L7;
            }
        L7:
            X.0vGL r1 = X.EnumC1735470vGL.FAIL
        L9:
            X.1Asl r0 = X.EnumC2193331Asl.FREQ_CHECK
            java.util.Map r2 = r3.LJIIJ(r0, r1, r4)
            java.lang.String r0 = "check_type"
            r2.put(r0, r5)
            if (r7 == 0) goto L1f
            java.lang.String r1 = "block_reason"
            java.lang.String r0 = r7.getValue()
            r2.put(r1, r0)
        L1f:
            if (r8 == 0) goto L26
            java.lang.String r0 = "block_detail"
            r2.put(r0, r8)
        L26:
            java.lang.String r1 = "freq_timestamp"
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r2.put(r1, r0)
            if (r11 == 0) goto L60
            java.lang.String r1 = "true"
        L33:
            java.lang.String r0 = "freq_timestamp_expired"
            r2.put(r0, r1)
            java.lang.String r1 = "local_timestamp"
            java.lang.String r0 = java.lang.String.valueOf(r12)
            r2.put(r1, r0)
            if (r14 == 0) goto L4c
            java.lang.String r1 = "error_code"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r2.put(r1, r0)
        L4c:
            if (r15 == 0) goto L53
            java.lang.String r0 = "error_msg"
            r2.put(r0, r15)
        L53:
            r1 = r16
            if (r1 == 0) goto L5c
            java.lang.String r0 = "logid"
            r2.put(r0, r1)
        L5c:
            LJIIL(r2)
            return
        L60:
            java.lang.String r1 = "false"
            goto L33
        L63:
            java.lang.String r0 = "error"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L7
            X.0vGL r1 = X.EnumC1735470vGL.ERROR
            goto L9
        L6e:
            java.lang.String r0 = "skip"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L7
            X.0vGL r1 = X.EnumC1735470vGL.SKIP
            goto L9
        L79:
            java.lang.String r0 = "blocked"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L7
            X.0vGL r1 = X.EnumC1735470vGL.BLOCKED
            goto L9
        L84:
            java.lang.String r0 = "success"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L7
            X.0vGL r1 = X.EnumC1735470vGL.SUCCESS
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2193281Asg.LJIIIZ(X.1Asc, java.lang.String, java.lang.String, X.0g8d, java.lang.String, long, boolean, long, int, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC2193371Asp
    public final void LIZ(C19720512Dr c19720512Dr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, long j) {
        Map<String, Object> mapLJIIJ = LJIIJ(EnumC2193331Asl.BANNER_TEXT_FIT, EnumC1735470vGL.SUCCESS, EnumC2193241Asc.USER_INTERACTION);
        LJIIJJI(mapLJIIJ, c19720512Dr);
        mapLJIIJ.put("title_truncated", Integer.valueOf(i));
        mapLJIIJ.put("subtitle_truncated", Integer.valueOf(i2));
        mapLJIIJ.put("subtitle_hidden_by_layout", Integer.valueOf(i3));
        mapLJIIJ.put("title_raw_length", Integer.valueOf(i4));
        mapLJIIJ.put("title_visible_length", Integer.valueOf(i5));
        mapLJIIJ.put("subtitle_raw_length", Integer.valueOf(i6));
        mapLJIIJ.put("subtitle_visible_length", Integer.valueOf(i7));
        mapLJIIJ.put("title_lines_required", Integer.valueOf(i8));
        mapLJIIJ.put("subtitle_lines_required", Integer.valueOf(i9));
        mapLJIIJ.put("title_font_final", Integer.valueOf(i10));
        mapLJIIJ.put("subtitle_font_final", Integer.valueOf(i11));
        mapLJIIJ.put("container_width_pt", Integer.valueOf(i12));
        mapLJIIJ.put("local_timestamp", String.valueOf(j));
        LJIIL(mapLJIIJ);
    }
}
