package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.common.experiment.IMImageCacheSizeSetting;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.saas.host.api.milo.IMMiloService;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18a6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21308018a6 implements InterfaceC658750Psf {
    public final String LL;
    public final C869590Y9l LLILLJJLI;
    public final Map<String, String> LLILLL;
    public final InterfaceC1493105sv LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    @Override // X.InterfaceC658750Psf
    public final void Ck(JSONObject jSONObject) {
        String strValueOf;
        if (((Boolean) this.LLIZ.getValue()).booleanValue()) {
            return;
        }
        boolean zOptBoolean = jSONObject.optBoolean("isSuccess");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LLILZIL.getValue();
        concurrentHashMap.put("width", jSONObject.optString("image_width"));
        concurrentHashMap.put("height", jSONObject.optString("image_height"));
        concurrentHashMap.put("error_msg", jSONObject.optString("err_msg"));
        String strLIZJ = C21307818a4.LIZJ(jSONObject.optString("err_desc"));
        if (strLIZJ == null && (strLIZJ = C21307818a4.LIZ(jSONObject.optString("err_msg"))) == null) {
            strLIZJ = "Unknown";
        }
        concurrentHashMap.put("failure_reason", strLIZJ);
        concurrentHashMap.put("format", jSONObject.optString("image_type"));
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        C894660Z7w.LIZ();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            strValueOf = "1";
        } else {
            strValueOf = String.valueOf(TTNetInit.getEffectiveConnectionType());
        }
        concurrentHashMap.put("network_type", strValueOf);
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(jSONObject.optString("from"));
        if (numLJIIJJI == null || numLJIIJJI.intValue() <= 0) {
            c0i0b.LIZJ();
            C894660Z7w.LIZ();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    return;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C21308218a8(zOptBoolean, this, jSONObject, null), 3);
    }

    public final String LIZIZ(boolean z) {
        String strValueOf;
        Map<String, String> localExt;
        String str;
        Long lLJIILIIL;
        C869590Y9l c869590Y9l = this.LLILLJJLI;
        if (c869590Y9l != null && (localExt = c869590Y9l.getLocalExt()) != null && (str = localExt.get("last_load_time")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            strValueOf = String.valueOf(System.currentTimeMillis() - lLJIILIIL.longValue());
        } else {
            strValueOf = "";
        }
        if (z && this.LLILLJJLI != null) {
            C0YNY c0yny = InterfaceC874680YTa.LIZ;
            C869590Y9l c869590Y9lLJJJ = C0YNY.LIZ(c0yny).LJJJ(this.LLILLJJLI.getMsgId());
            if (c869590Y9lLJJJ != null) {
                String strValueOf2 = String.valueOf(System.currentTimeMillis());
                c869590Y9lLJJJ.getLocalExt().put("last_load_time", strValueOf2);
                C0YNY.LIZ(c0yny).LIZIZ().LJFF(Collections.singletonList(new Pair(c869590Y9lLJJJ, C2097908Jt.LIZJ(new Pair("last_load_time", new C0Y3R(strValueOf2))))), false, new C0Y3I("mark the image's last load successful time"));
            }
        }
        return strValueOf;
    }

    public final void LIZ(Map<String, String> map, Map<String, String> map2) throws Throwable {
        String str;
        Double dValueOf;
        Double dValueOf2;
        Long lValueOf;
        long jLongValue;
        long jCurrentTimeMillis;
        C869590Y9l c869590Y9l = this.LLILLJJLI;
        String strValueOf = "";
        if (c869590Y9l == null) {
            str = "";
        } else if (Intrinsics.LJFF(String.valueOf(c869590Y9l.getSender()), ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId())) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_send", str);
        C869590Y9l c869590Y9l2 = this.LLILLJJLI;
        if (c869590Y9l2 != null && c869590Y9l2.getCreatedAt() > 0) {
            IMHostApi.LIZ.getClass();
            IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
            if (iMHostApiLIZ != null) {
                jCurrentTimeMillis = iMHostApiLIZ.LIZIZ();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            strValueOf = String.valueOf(jCurrentTimeMillis - this.LLILLJJLI.getCreatedAt());
        }
        map.put("time_from_msg_sent", strValueOf);
        map.put("disk_space", String.valueOf(C0WYJ.LJI() / ((long) 1048576)));
        Object[] objArr = new Object[1];
        IMMiloService.LIZ.getClass();
        IMMiloService iMMiloServiceLIZ = C0Z4Y.LIZ();
        Long lValueOf2 = null;
        if (iMMiloServiceLIZ != null) {
            dValueOf = Double.valueOf(iMMiloServiceLIZ.LJII());
        } else {
            dValueOf = null;
        }
        objArr[0] = dValueOf;
        map.put("cpu_usage", C786410Ut5.j4("%.3f", Arrays.copyOf(objArr, 1)));
        Object[] objArr2 = new Object[1];
        IMMiloService iMMiloServiceLIZ2 = C0Z4Y.LIZ();
        if (iMMiloServiceLIZ2 != null) {
            dValueOf2 = Double.valueOf(iMMiloServiceLIZ2.LIZJ());
        } else {
            dValueOf2 = null;
        }
        objArr2[0] = dValueOf2;
        map.put("cpu_speed", C786410Ut5.j4("%.3f", Arrays.copyOf(objArr2, 1)));
        IMMiloService iMMiloServiceLIZ3 = C0Z4Y.LIZ();
        if (iMMiloServiceLIZ3 != null) {
            lValueOf = Long.valueOf(iMMiloServiceLIZ3.LJFF());
        } else {
            lValueOf = null;
        }
        map.put("upload_traffic", String.valueOf(lValueOf));
        IMMiloService iMMiloServiceLIZ4 = C0Z4Y.LIZ();
        if (iMMiloServiceLIZ4 != null) {
            lValueOf2 = Long.valueOf(iMMiloServiceLIZ4.LJ());
        }
        map.put("download_traffic", String.valueOf(lValueOf2));
        try {
            Context contextLIZ = C894660Z7w.LIZ();
            C20595915iX c20595915iX = new C20595915iX();
            c20595915iX.LIZ = C0WYJ.LJIJI(contextLIZ);
            long jLJII = C0WYJ.LJII(contextLIZ);
            c20595915iX.LIZIZ = jLJII;
            long j = 1024;
            map.put("memory_available", String.valueOf(jLJII / j));
            map.put("memory_total", String.valueOf(c20595915iX.LIZ / j));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (map2 != null) {
            String str2 = map2.get("cache_space");
            if (str2 != null) {
                C1326200kcE c1326200kcE = C1326200kcE.LIZ;
                if (c1326200kcE.LIZ(str2) > 0) {
                    jLongValue = c1326200kcE.LIZ(str2);
                } else {
                    IMImageCacheSizeSetting.LIZ.getClass();
                    Long l = ((IMImageCacheSizeSetting.IMImageCacheSizeConfig) IMImageCacheSizeSetting.LIZJ.getValue()).cacheSizeMap.get(str2);
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 536870912;
                    }
                }
                map.put("cache_space_total", String.valueOf(jLongValue / ((long) 1024)));
                Keva kevaLIZIZ = c1326200kcE.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cache_space_used_");
                sbLIZ.append(str2);
                map.put("cache_space_usage", C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf(kevaLIZIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L) / jLongValue)}, 1)));
            }
            map.putAll(map2);
        }
    }

    @Override // X.InterfaceC658750Psf
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        if (jSONObject == null || ((Boolean) this.LLIZ.getValue()).booleanValue() || !jSONObject.optBoolean("is_request_network")) {
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C21308118a7(jSONObject, this, null), 3);
    }

    public C21308018a6(String str, C869590Y9l c869590Y9l, Map map, int i) {
        c869590Y9l = (i & 2) != 0 ? null : c869590Y9l;
        map = (i & 4) != 0 ? null : map;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = (i & 8) != 0 ? C0I0B.LJFF.LIZIZ() : null;
        this.LL = str;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = map;
        this.LLILZ = interfaceC1493505szLIZIZ;
        this.LLILZIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(993));
        this.LLILZLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 571));
        this.LLIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1047));
    }
}
