package X;

import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1G0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2325361G0o implements InterfaceC781210Ukh {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC781210Ukh
    public final void run() throws JSONException {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public static final void run$0(C2325361G0o c2325361G0o) throws JSONException {
        Integer numValueOf;
        String strOptString;
        Integer numValueOf2;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        String strOptString6;
        String strOptString7;
        String strOptString8;
        String strOptString9;
        String strOptString10;
        String strOptString11;
        String strOptString12;
        String strOptString13;
        String strOptString14;
        String strOptString15;
        String strOptString16;
        JSONObject jSONObject = (JSONObject) c2325361G0o.l1;
        if (jSONObject != null) {
            numValueOf = Integer.valueOf(jSONObject.optInt("http_status"));
        } else {
            numValueOf = null;
        }
        JSONObject jSONObject2 = (JSONObject) c2325361G0o.l1;
        if (jSONObject2 != null) {
            strOptString = jSONObject2.optString("err_code");
        } else {
            strOptString = null;
        }
        JSONObject jSONObject3 = (JSONObject) c2325361G0o.l1;
        if (jSONObject3 != null) {
            numValueOf2 = Integer.valueOf(jSONObject3.optInt("network_quality"));
        } else {
            numValueOf2 = null;
        }
        JSONObject jSONObject4 = (JSONObject) c2325361G0o.l1;
        if (jSONObject4 != null) {
            strOptString2 = jSONObject4.optString("fail_phase");
        } else {
            strOptString2 = null;
        }
        JSONObject jSONObject5 = (JSONObject) c2325361G0o.l1;
        if (jSONObject5 != null) {
            strOptString3 = jSONObject5.optString("scene_tag");
        } else {
            strOptString3 = null;
        }
        JSONObject jSONObject6 = (JSONObject) c2325361G0o.l1;
        if (jSONObject6 != null) {
            strOptString4 = jSONObject6.optString("duration");
        } else {
            strOptString4 = null;
        }
        JSONObject jSONObject7 = (JSONObject) c2325361G0o.l1;
        if (jSONObject7 != null) {
            strOptString5 = jSONObject7.optString("log_type");
        } else {
            strOptString5 = null;
        }
        JSONObject jSONObject8 = (JSONObject) c2325361G0o.l1;
        if (jSONObject8 != null) {
            strOptString6 = jSONObject8.optString("err_desc");
        } else {
            strOptString6 = null;
        }
        JSONObject jSONObject9 = (JSONObject) c2325361G0o.l1;
        if (jSONObject9 != null) {
            strOptString7 = jSONObject9.optString("uri");
        } else {
            strOptString7 = null;
        }
        JSONObject jSONObject10 = (JSONObject) c2325361G0o.l1;
        if (jSONObject10 != null) {
            strOptString8 = jSONObject10.optString("net_timing_detail");
        } else {
            strOptString8 = null;
        }
        JSONObject jSONObject11 = (JSONObject) c2325361G0o.l1;
        if (jSONObject11 != null) {
            strOptString9 = jSONObject11.optString("download_duration");
        } else {
            strOptString9 = null;
        }
        JSONObject jSONObject12 = (JSONObject) c2325361G0o.l1;
        if (jSONObject12 != null) {
            strOptString10 = jSONObject12.optString("decode_duration");
        } else {
            strOptString10 = null;
        }
        JSONObject jSONObject13 = (JSONObject) c2325361G0o.l1;
        if (jSONObject13 != null) {
            strOptString11 = jSONObject13.optString("image_sdk_version");
        } else {
            strOptString11 = null;
        }
        JSONObject jSONObject14 = (JSONObject) c2325361G0o.l1;
        if (jSONObject14 != null) {
            strOptString12 = jSONObject14.optString("headers");
        } else {
            strOptString12 = null;
        }
        JSONObject jSONObject15 = (JSONObject) c2325361G0o.l1;
        if (jSONObject15 != null) {
            strOptString13 = jSONObject15.optString("is_prefetch_image");
        } else {
            strOptString13 = null;
        }
        JSONObject jSONObject16 = (JSONObject) c2325361G0o.l1;
        if (jSONObject16 != null) {
            strOptString14 = jSONObject16.optString("sr_type");
        } else {
            strOptString14 = null;
        }
        JSONObject jSONObject17 = (JSONObject) c2325361G0o.l1;
        if (jSONObject17 != null) {
            strOptString15 = jSONObject17.optString("sr_status");
        } else {
            strOptString15 = null;
        }
        JSONObject jSONObject18 = (JSONObject) c2325361G0o.l1;
        if (jSONObject18 != null) {
            strOptString16 = jSONObject18.optString("sr_err");
        } else {
            strOptString16 = null;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoLoaded error url: ");
        sbLIZ.append(strOptString7);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        sb.append('\n');
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("aid: ");
        sbLIZ2.append(c2325361G0o.s0);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        sb.append('\n');
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("errCode: ");
        sbLIZ3.append(strOptString);
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        sb.append('\n');
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("httpStatus: ");
        sbLIZ4.append(numValueOf);
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        sb.append('\n');
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("failPhase: ");
        sbLIZ5.append(strOptString2);
        sb.append(C2188811AlT.LIZIZ(sbLIZ5));
        sb.append('\n');
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("networkQuality: ");
        sbLIZ6.append(numValueOf2);
        sb.append(C2188811AlT.LIZIZ(sbLIZ6));
        sb.append('\n');
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("duration: ");
        sbLIZ7.append(strOptString4);
        sb.append(C2188811AlT.LIZIZ(sbLIZ7));
        sb.append('\n');
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("sceneTag: ");
        sbLIZ8.append(strOptString3);
        sb.append(C2188811AlT.LIZIZ(sbLIZ8));
        sb.append('\n');
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("logType: ");
        sbLIZ9.append(strOptString5);
        sb.append(C2188811AlT.LIZIZ(sbLIZ9));
        sb.append('\n');
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("errDesc: ");
        sbLIZ10.append(strOptString6);
        sb.append(C2188811AlT.LIZIZ(sbLIZ10));
        sb.append('\n');
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("net_timing_detail: ");
        sbLIZ11.append(strOptString8);
        sb.append(C2188811AlT.LIZIZ(sbLIZ11));
        sb.append('\n');
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append("download_duration: ");
        sbLIZ12.append(strOptString9);
        sb.append(C2188811AlT.LIZIZ(sbLIZ12));
        sb.append('\n');
        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
        sbLIZ13.append("decode_duration: ");
        sbLIZ13.append(strOptString10);
        sb.append(C2188811AlT.LIZIZ(sbLIZ13));
        sb.append('\n');
        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
        sbLIZ14.append("image_sdk_version: ");
        sbLIZ14.append(strOptString11);
        sb.append(C2188811AlT.LIZIZ(sbLIZ14));
        sb.append('\n');
        StringBuilder sbLIZ15 = C2188811AlT.LIZ();
        sbLIZ15.append("headers: ");
        sbLIZ15.append(strOptString12);
        sb.append(C2188811AlT.LIZIZ(sbLIZ15));
        sb.append('\n');
        StringBuilder sbLIZ16 = C2188811AlT.LIZ();
        sbLIZ16.append("is_prefetch_image: ");
        sbLIZ16.append(strOptString13);
        sb.append(C2188811AlT.LIZIZ(sbLIZ16));
        sb.append('\n');
        StringBuilder sbLIZ17 = C2188811AlT.LIZ();
        sbLIZ17.append("sr_type: ");
        sbLIZ17.append(strOptString14);
        sb.append(C2188811AlT.LIZIZ(sbLIZ17));
        sb.append('\n');
        StringBuilder sbLIZ18 = C2188811AlT.LIZ();
        sbLIZ18.append("sr_status: ");
        sbLIZ18.append(strOptString15);
        sb.append(C2188811AlT.LIZIZ(sbLIZ18));
        sb.append('\n');
        StringBuilder sbLIZ19 = C2188811AlT.LIZ();
        sbLIZ19.append("sr_err: ");
        sbLIZ19.append(strOptString16);
        sb.append(C2188811AlT.LIZIZ(sbLIZ19));
        sb.append('\n');
        C2344809Gs.LIZLLL(6, "PhotoModeLoadFail", sb.toString());
        IAppConfig iAppConfigLIZIZ = C1475000oUE.LIZIZ();
        JSONObject jSONObject19 = new JSONObject();
        jSONObject19.put("uri", strOptString7);
        jSONObject19.put("err_code", strOptString);
        jSONObject19.put("err_desc", strOptString6);
        jSONObject19.put("http_status", numValueOf);
        jSONObject19.put("net_timing_detail", strOptString8);
        jSONObject19.put("download_duration", strOptString9);
        jSONObject19.put("decode_duration", strOptString10);
        jSONObject19.put("duration", strOptString4);
        jSONObject19.put("fail_phase", strOptString2);
        jSONObject19.put("image_sdk_version", strOptString11);
        jSONObject19.put("headers", strOptString12);
        jSONObject19.put("is_prefetch_image", strOptString13);
        jSONObject19.put("sr_type", strOptString14);
        jSONObject19.put("sr_status", strOptString15);
        jSONObject19.put("sr_err", strOptString16);
        iAppConfigLIZIZ.setExtraBusinessLog(jSONObject19, c2325361G0o.s0, 4);
    }

    public static final void run$1(C2325361G0o c2325361G0o) throws JSONException {
        Integer numValueOf;
        String strOptString;
        Integer numValueOf2;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        String strOptString6;
        String strOptString7;
        String strOptString8;
        String strOptString9;
        String strOptString10;
        String strOptString11;
        String strOptString12;
        String strOptString13;
        String strOptString14;
        String strOptString15;
        String strOptString16;
        JSONObject jSONObject = (JSONObject) c2325361G0o.l1;
        if (jSONObject != null) {
            numValueOf = Integer.valueOf(jSONObject.optInt("http_status"));
        } else {
            numValueOf = null;
        }
        JSONObject jSONObject2 = (JSONObject) c2325361G0o.l1;
        if (jSONObject2 != null) {
            strOptString = jSONObject2.optString("err_code");
        } else {
            strOptString = null;
        }
        JSONObject jSONObject3 = (JSONObject) c2325361G0o.l1;
        if (jSONObject3 != null) {
            numValueOf2 = Integer.valueOf(jSONObject3.optInt("network_quality"));
        } else {
            numValueOf2 = null;
        }
        JSONObject jSONObject4 = (JSONObject) c2325361G0o.l1;
        if (jSONObject4 != null) {
            strOptString2 = jSONObject4.optString("fail_phase");
        } else {
            strOptString2 = null;
        }
        JSONObject jSONObject5 = (JSONObject) c2325361G0o.l1;
        if (jSONObject5 != null) {
            strOptString3 = jSONObject5.optString("scene_tag");
        } else {
            strOptString3 = null;
        }
        JSONObject jSONObject6 = (JSONObject) c2325361G0o.l1;
        if (jSONObject6 != null) {
            strOptString4 = jSONObject6.optString("duration");
        } else {
            strOptString4 = null;
        }
        JSONObject jSONObject7 = (JSONObject) c2325361G0o.l1;
        if (jSONObject7 != null) {
            strOptString5 = jSONObject7.optString("log_type");
        } else {
            strOptString5 = null;
        }
        JSONObject jSONObject8 = (JSONObject) c2325361G0o.l1;
        if (jSONObject8 != null) {
            strOptString6 = jSONObject8.optString("err_desc");
        } else {
            strOptString6 = null;
        }
        JSONObject jSONObject9 = (JSONObject) c2325361G0o.l1;
        if (jSONObject9 != null) {
            strOptString7 = jSONObject9.optString("uri");
        } else {
            strOptString7 = null;
        }
        JSONObject jSONObject10 = (JSONObject) c2325361G0o.l1;
        if (jSONObject10 != null) {
            strOptString8 = jSONObject10.optString("net_timing_detail");
        } else {
            strOptString8 = null;
        }
        JSONObject jSONObject11 = (JSONObject) c2325361G0o.l1;
        if (jSONObject11 != null) {
            strOptString9 = jSONObject11.optString("download_duration");
        } else {
            strOptString9 = null;
        }
        JSONObject jSONObject12 = (JSONObject) c2325361G0o.l1;
        if (jSONObject12 != null) {
            strOptString10 = jSONObject12.optString("decode_duration");
        } else {
            strOptString10 = null;
        }
        JSONObject jSONObject13 = (JSONObject) c2325361G0o.l1;
        if (jSONObject13 != null) {
            strOptString11 = jSONObject13.optString("image_sdk_version");
        } else {
            strOptString11 = null;
        }
        JSONObject jSONObject14 = (JSONObject) c2325361G0o.l1;
        if (jSONObject14 != null) {
            strOptString12 = jSONObject14.optString("headers");
        } else {
            strOptString12 = null;
        }
        JSONObject jSONObject15 = (JSONObject) c2325361G0o.l1;
        if (jSONObject15 != null) {
            strOptString13 = jSONObject15.optString("is_prefetch_image");
        } else {
            strOptString13 = null;
        }
        JSONObject jSONObject16 = (JSONObject) c2325361G0o.l1;
        if (jSONObject16 != null) {
            strOptString14 = jSONObject16.optString("sr_type");
        } else {
            strOptString14 = null;
        }
        JSONObject jSONObject17 = (JSONObject) c2325361G0o.l1;
        if (jSONObject17 != null) {
            strOptString15 = jSONObject17.optString("sr_status");
        } else {
            strOptString15 = null;
        }
        JSONObject jSONObject18 = (JSONObject) c2325361G0o.l1;
        if (jSONObject18 != null) {
            strOptString16 = jSONObject18.optString("sr_err");
        } else {
            strOptString16 = null;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoLoaded error url: ");
        sbLIZ.append(strOptString7);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        sb.append('\n');
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("aid: ");
        sbLIZ2.append(c2325361G0o.s0);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        sb.append('\n');
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("errCode: ");
        sbLIZ3.append(strOptString);
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        sb.append('\n');
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("httpStatus: ");
        sbLIZ4.append(numValueOf);
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        sb.append('\n');
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("failPhase: ");
        sbLIZ5.append(strOptString2);
        sb.append(C2188811AlT.LIZIZ(sbLIZ5));
        sb.append('\n');
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("networkQuality: ");
        sbLIZ6.append(numValueOf2);
        sb.append(C2188811AlT.LIZIZ(sbLIZ6));
        sb.append('\n');
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("duration: ");
        sbLIZ7.append(strOptString4);
        sb.append(C2188811AlT.LIZIZ(sbLIZ7));
        sb.append('\n');
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("sceneTag: ");
        sbLIZ8.append(strOptString3);
        sb.append(C2188811AlT.LIZIZ(sbLIZ8));
        sb.append('\n');
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("logType: ");
        sbLIZ9.append(strOptString5);
        sb.append(C2188811AlT.LIZIZ(sbLIZ9));
        sb.append('\n');
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("errDesc: ");
        sbLIZ10.append(strOptString6);
        sb.append(C2188811AlT.LIZIZ(sbLIZ10));
        sb.append('\n');
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("net_timing_detail: ");
        sbLIZ11.append(strOptString8);
        sb.append(C2188811AlT.LIZIZ(sbLIZ11));
        sb.append('\n');
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append("download_duration: ");
        sbLIZ12.append(strOptString9);
        sb.append(C2188811AlT.LIZIZ(sbLIZ12));
        sb.append('\n');
        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
        sbLIZ13.append("decode_duration: ");
        sbLIZ13.append(strOptString10);
        sb.append(C2188811AlT.LIZIZ(sbLIZ13));
        sb.append('\n');
        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
        sbLIZ14.append("image_sdk_version: ");
        sbLIZ14.append(strOptString11);
        sb.append(C2188811AlT.LIZIZ(sbLIZ14));
        sb.append('\n');
        StringBuilder sbLIZ15 = C2188811AlT.LIZ();
        sbLIZ15.append("headers: ");
        sbLIZ15.append(strOptString12);
        sb.append(C2188811AlT.LIZIZ(sbLIZ15));
        sb.append('\n');
        StringBuilder sbLIZ16 = C2188811AlT.LIZ();
        sbLIZ16.append("is_prefetch_image: ");
        sbLIZ16.append(strOptString13);
        sb.append(C2188811AlT.LIZIZ(sbLIZ16));
        sb.append('\n');
        StringBuilder sbLIZ17 = C2188811AlT.LIZ();
        sbLIZ17.append("sr_type: ");
        sbLIZ17.append(strOptString14);
        sb.append(C2188811AlT.LIZIZ(sbLIZ17));
        sb.append('\n');
        StringBuilder sbLIZ18 = C2188811AlT.LIZ();
        sbLIZ18.append("sr_status: ");
        sbLIZ18.append(strOptString15);
        sb.append(C2188811AlT.LIZIZ(sbLIZ18));
        sb.append('\n');
        StringBuilder sbLIZ19 = C2188811AlT.LIZ();
        sbLIZ19.append("sr_err: ");
        sbLIZ19.append(strOptString16);
        sb.append(C2188811AlT.LIZIZ(sbLIZ19));
        sb.append('\n');
        C2344809Gs.LIZLLL(6, "PhotoModeLoadFail", sb.toString());
        IAppConfig iAppConfigLIZIZ = C1475000oUE.LIZIZ();
        JSONObject jSONObject19 = new JSONObject();
        jSONObject19.put("uri", strOptString7);
        jSONObject19.put("err_code", strOptString);
        jSONObject19.put("err_desc", strOptString6);
        jSONObject19.put("http_status", numValueOf);
        jSONObject19.put("net_timing_detail", strOptString8);
        jSONObject19.put("download_duration", strOptString9);
        jSONObject19.put("decode_duration", strOptString10);
        jSONObject19.put("duration", strOptString4);
        jSONObject19.put("fail_phase", strOptString2);
        jSONObject19.put("image_sdk_version", strOptString11);
        jSONObject19.put("headers", strOptString12);
        jSONObject19.put("is_prefetch_image", strOptString13);
        jSONObject19.put("sr_type", strOptString14);
        jSONObject19.put("sr_status", strOptString15);
        jSONObject19.put("sr_err", strOptString16);
        iAppConfigLIZIZ.setExtraBusinessLog(jSONObject19, c2325361G0o.s0, 4);
    }

    public C2325361G0o(String str, JSONObject jSONObject, int i) {
        this.$t = i;
        this.l1 = jSONObject;
        this.s0 = str;
    }
}
