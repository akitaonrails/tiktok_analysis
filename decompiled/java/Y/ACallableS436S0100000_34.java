package Y;

import X.AbstractC2457909k9;
import X.C013C;
import X.C07CM;
import X.C080U;
import X.C098200Yq;
import X.C0X52;
import X.C0XDN;
import X.C0XI3;
import X.C0XIR;
import X.C1720106oR;
import X.C189200o6;
import X.C1B58;
import X.C1BLC;
import X.C1BLL;
import X.C1BLM;
import X.C1BLN;
import X.C1BLO;
import X.C1BLV;
import X.C1C7U;
import X.C20166313vR;
import X.C20338014i2;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188108hj;
import X.C2188811AlT;
import X.C2199661B7c;
import X.C2199671B7d;
import X.C2204901BRg;
import X.C2204911BRh;
import X.C2218501BsG;
import X.C2218531BsJ;
import X.C786410Ut5;
import X.InterfaceC2457409k4;
import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class ACallableS436S0100000_34 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return call$13(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$0(Y.ACallableS436S0100000_34 r8) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS436S0100000_34.call$0(Y.ACallableS436S0100000_34):java.lang.Object");
    }

    public static final Object call$1(ACallableS436S0100000_34 aCallableS436S0100000_34) {
        C1C7U.LIZ("MorpheusSplitInstallWrapper@c113.mSplitInstallStateUpdatedListener$1$1");
        List<InterfaceC2457409k4> list = C1BLO.LIZ;
        AbstractC2457909k9 abstractC2457909k9 = (AbstractC2457909k9) aCallableS436S0100000_34.l0;
        for (String str : abstractC2457909k9.LJ()) {
            Map<String, String> map = C1BLV.LIZ;
            String strLIZIZ = C1BLV.LIZIZ(str);
            if (strLIZIZ != null) {
                C1BLN.LIZ(new C1BLM(strLIZIZ, abstractC2457909k9));
                ConcurrentHashMap<String, AbstractC2457909k9> concurrentHashMap = C20338014i2.LIZIZ;
                synchronized (concurrentHashMap) {
                    try {
                        concurrentHashMap.put(str, abstractC2457909k9);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
        for (String str2 : abstractC2457909k9.LIZLLL()) {
            if (str2 != null) {
                int iHashCode = str2.hashCode();
                if (iHashCode != 3325) {
                    if (iHashCode != 3355) {
                        if (iHashCode == 3856 && str2.equals("yi")) {
                            str2 = "ji";
                        }
                    } else if (str2.equals(FollowStatusChangeMethod.PARAM_UID)) {
                        str2 = "in";
                    }
                } else if (str2.equals("he")) {
                    str2 = "iw";
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("com.ss.android.ugc.aweme.dflanguage.");
            sbLIZ.append(str2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("df_language_");
            sbLIZ2.append(str2);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
            C1BLN.LIZ(new C1BLM(strLIZIZ2, abstractC2457909k9));
            C20338014i2.LIZIZ(strLIZIZ3, abstractC2457909k9);
        }
        C1C7U.LIZIZ("MorpheusSplitInstallWrapper@c113.mSplitInstallStateUpdatedListener$1$1");
        return null;
    }

    public static final Object call$10(ACallableS436S0100000_34 aCallableS436S0100000_34) {
        JSONObject jSONObject;
        String strLIZJ;
        String str;
        C2204911BRh c2204911BRh = (C2204911BRh) aCallableS436S0100000_34.l0;
        c2204911BRh.getClass();
        C1C7U.LIZ("ProxySendJsRequestHelperV2@f0ff.<init>$1L");
        String strLIZ = c2204911BRh.LIZ(c2204911BRh.LJII, c2204911BRh.LJIIIZ);
        c2204911BRh.LJII = strLIZ;
        try {
            try {
                C0X52<String> c0x52Execute = c2204911BRh.LJIJ.doGet(strLIZ, (Map<String, String>) null, c2204911BRh.LJIIJJI).execute();
                str = c0x52Execute.LIZIZ;
                strLIZJ = C2204911BRh.LIZJ(c0x52Execute.LIZ.LIZLLL);
            } catch (C0XIR e) {
                e = e;
                strLIZJ = "";
            }
            try {
                jSONObject = new JSONObject(str);
                Api.LIZIZ(str, c2204911BRh.LJII, jSONObject);
                jSONObject.put("_raw", str);
                jSONObject.put("code", 1);
                jSONObject.put("response", new JSONObject(str).put("_AME_Header_RequestID", strLIZJ));
            } catch (C0XIR e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                c2204911BRh.LJIILIIL = e;
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("_raw", C786410Ut5.J3(new JSONObject(e.getResponse()).put("_AME_Header_RequestID", strLIZJ)));
                } catch (JSONException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                C2204911BRh.LIZLLL(jSONObject, e.getErrorCode(), e.getErrorMsg(), e.getPrompt());
            }
        } catch (C0XI3 e4) {
            TryCatchGuardChecker.doCheck(e4);
            c2204911BRh.LJIILIIL = e4;
            jSONObject = new JSONObject();
            C2204911BRh.LIZLLL(jSONObject, e4.getStatusCode(), e4.getMessage(), "");
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
            c2204911BRh.LJIILIIL = e5;
            jSONObject = new JSONObject();
            C2204911BRh.LIZLLL(jSONObject, -408, e5.getMessage(), "");
        }
        C1C7U.LIZIZ("ProxySendJsRequestHelperV2@f0ff.<init>$1L");
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$11(ACallableS436S0100000_34 aCallableS436S0100000_34) {
        String str;
        JSONObject jSONObject;
        String str2;
        String str3;
        C2204911BRh c2204911BRh = (C2204911BRh) aCallableS436S0100000_34.l0;
        c2204911BRh.getClass();
        C1C7U.LIZ("ProxySendJsRequestHelperV2@f0ff.<init>$2L");
        c2204911BRh.LJII = c2204911BRh.LIZ(c2204911BRh.LJII, c2204911BRh.LJIIIZ);
        String strLIZJ = "";
        try {
            jSONObject = new JSONObject();
            str2 = c2204911BRh.LJIIL;
        } catch (Exception e) {
            e = e;
            str = "";
        }
        try {
            if (str2 != null) {
                C2188108hj c2188108hj = C2188108hj.LIZ;
                String str4 = c2204911BRh.LJII;
                JSONObject jSONObject2 = c2204911BRh.LJIIJ;
                List<C080U> list = c2204911BRh.LJIIJJI;
                c2188108hj.getClass();
                C0X52 c0x52LIZ = C2188108hj.LIZ(str4, jSONObject2, str2, list);
                str3 = (String) c0x52LIZ.LIZIZ;
                strLIZJ = C2204911BRh.LIZJ(c0x52LIZ.LIZ.LIZLLL);
            } else {
                HashMap map = new HashMap();
                JSONObject jSONObject3 = c2204911BRh.LJIIJ;
                if (jSONObject3 != null) {
                    Iterator<String> itKeys = jSONObject3.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, c2204911BRh.LJIIJ.optString(next, ""));
                    }
                }
                C0XDN.LIZJ(map, true);
                C0X52<String> c0x52Execute = c2204911BRh.LJIJ.doPost(c2204911BRh.LJII, 0, map).execute();
                str3 = c0x52Execute.LIZIZ;
                strLIZJ = C2204911BRh.LIZJ(c0x52Execute.LIZ.LIZLLL);
                Api.LIZ(str3, c2204911BRh.LJII);
            }
            jSONObject.put("code", 1);
            jSONObject.put("response", new JSONObject(str3).put("_AME_Header_RequestID", strLIZJ));
            jSONObject.put("_raw", str3);
        } catch (Exception e2) {
            e = e2;
            str = strLIZJ;
            strLIZJ = str3;
            TryCatchGuardChecker.doCheck(e);
            c2204911BRh.LJIILIIL = e;
            jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 0);
                jSONObject.put("response", new JSONObject(strLIZJ).put("_AME_Header_RequestID", str));
                jSONObject.put("_raw", strLIZJ);
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        C1C7U.LIZIZ("ProxySendJsRequestHelperV2@f0ff.<init>$2L");
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$12(ACallableS436S0100000_34 aCallableS436S0100000_34) {
        String str;
        JSONObject jSONObject;
        C2204911BRh c2204911BRh = (C2204911BRh) aCallableS436S0100000_34.l0;
        c2204911BRh.getClass();
        C1C7U.LIZ("ProxySendJsRequestHelperV2@f0ff.<init>$3L");
        String strLIZ = c2204911BRh.LIZ(c2204911BRh.LJII, c2204911BRh.LJIIIZ);
        c2204911BRh.LJII = strLIZ;
        String strLIZJ = "";
        try {
            C2188108hj c2188108hj = C2188108hj.LIZ;
            JSONObject jSONObject2 = c2204911BRh.LJIIJ;
            String str2 = c2204911BRh.LJIIL;
            if (str2 == null) {
                str2 = "application/x-www-form-urlencoded";
            }
            List<C080U> list = c2204911BRh.LJIIJJI;
            c2188108hj.getClass();
            C0X52 c0x52LIZIZ = C2188108hj.LIZIZ(strLIZ, jSONObject2, str2, list);
            String str3 = (String) c0x52LIZIZ.LIZIZ;
            try {
                jSONObject = new JSONObject();
                strLIZJ = C2204911BRh.LIZJ(c0x52LIZIZ.LIZ.LIZLLL);
                jSONObject.put("code", 1);
                jSONObject.put("response", new JSONObject(str3).put("_AME_Header_RequestID", strLIZJ));
                jSONObject.put("_raw", str3);
            } catch (Exception e) {
                e = e;
                str = strLIZJ;
                strLIZJ = str3;
                TryCatchGuardChecker.doCheck(e);
                c2204911BRh.LJIILIIL = e;
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 0);
                    jSONObject.put("response", new JSONObject(strLIZJ).put("_AME_Header_RequestID", str));
                    jSONObject.put("_raw", strLIZJ);
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
        }
        C1C7U.LIZIZ("ProxySendJsRequestHelperV2@f0ff.<init>$3L");
        return jSONObject;
    }

    public static final Object call$13(ACallableS436S0100000_34 aCallableS436S0100000_34) {
        JSONObject jSONObject;
        C2204911BRh c2204911BRh = (C2204911BRh) aCallableS436S0100000_34.l0;
        c2204911BRh.getClass();
        C1C7U.LIZ("ProxySendJsRequestHelperV2@f0ff.<init>$4L");
        String strLIZ = c2204911BRh.LIZ(c2204911BRh.LJII, c2204911BRh.LJIIIZ);
        c2204911BRh.LJII = strLIZ;
        try {
            String strLIZIZ = c2204911BRh.LIZIZ(strLIZ);
            jSONObject = new JSONObject(strLIZIZ);
            jSONObject.put("_raw", strLIZIZ);
            jSONObject.put("code", 1);
            jSONObject.put("response", new JSONObject(strLIZIZ));
        } catch (C0XI3 e) {
            TryCatchGuardChecker.doCheck(e);
            c2204911BRh.LJIILIIL = e;
            jSONObject = new JSONObject();
            C2204911BRh.LIZLLL(jSONObject, e.getStatusCode(), e.getMessage(), "");
        } catch (C0XIR e2) {
            TryCatchGuardChecker.doCheck(e2);
            c2204911BRh.LJIILIIL = e2;
            jSONObject = new JSONObject();
            try {
                jSONObject.put("_raw", e2.getResponse());
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            C2204911BRh.LIZLLL(jSONObject, e2.getErrorCode(), e2.getErrorMsg(), e2.getPrompt());
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            c2204911BRh.LJIILIIL = e4;
            jSONObject = new JSONObject();
            C2204911BRh.LIZLLL(jSONObject, -408, e4.getMessage(), "");
        }
        C1C7U.LIZIZ("ProxySendJsRequestHelperV2@f0ff.<init>$4L");
        return jSONObject;
    }

    public static final Object call$2(ACallableS436S0100000_34 aCallableS436S0100000_34) {
        C1C7U.LIZ("VideoQualityThreadUtil@6628.invokeAtFrontUninterruptibly$10");
        ((Runnable) aCallableS436S0100000_34.l0).run();
        C1C7U.LIZIZ("VideoQualityThreadUtil@6628.invokeAtFrontUninterruptibly$10");
        return null;
    }

    public static final Object call$3(ACallableS436S0100000_34 aCallableS436S0100000_34) {
        C1C7U.LIZ("SqlDownloadCache@494c.getAllDownloadInfo$1");
        ((C1B58) aCallableS436S0100000_34.l0).m1();
        ArrayList arrayList = new ArrayList();
        if (C1B58.LLILZLL != null) {
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = C1B58.LLILZLL.rawQuery(C786410Ut5.j4("SELECT * FROM %s", new Object[]{"downloader"}), null);
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(C2199661B7c.LJIJJ(cursorRawQuery));
                }
                C2199671B7d.LJJIII(cursorRawQuery);
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C2199671B7d.LJJIII(cursorRawQuery);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C2199671B7d.LJJIII(cursorRawQuery);
                    throw th2;
                }
            }
        }
        C1C7U.LIZIZ("SqlDownloadCache@494c.getAllDownloadInfo$1");
        return arrayList;
    }

    public static final Object call$4(ACallableS436S0100000_34 aCallableS436S0100000_34) {
        Object c098200Yq;
        String str;
        String str2;
        C1C7U.LIZ("ContactMonitor@a70a.reportEvent$1");
        C013C c013c = new C013C();
        c013c.element = true;
        JSONObject jSONObject = new JSONObject();
        C2218501BsG c2218501BsG = (C2218501BsG) aCallableS436S0100000_34.l0;
        try {
            jSONObject.put("monitor_version", c2218501BsG.LJIJJ);
            jSONObject.put("app_session_id", C2218501BsG.LJJJ);
            jSONObject.put("api_scene", c2218501BsG.LIZ.getValue());
            jSONObject.put("biz_scene", c2218501BsG.LIZIZ.getValue());
            jSONObject.put("upload_scene", c2218501BsG.LIZ.getValue());
            int iLIZ = C07CM.LIZ();
            if (c2218501BsG.LIZJ) {
                str = "device_read";
            } else if (iLIZ == 1) {
                str = "psi_only_post_process";
            } else if (iLIZ == 2) {
                str = "psi_mix_second_upload";
            } else {
                str = "device_upload";
            }
            jSONObject.put("step", str);
            jSONObject.put("session_id", UUID.randomUUID().toString());
            jSONObject.put("bpea_cert", c2218501BsG.LJJIL);
            jSONObject.put("raw_contacts_size", c2218501BsG.LJIJJLI);
            jSONObject.put("pn_valid_size", c2218501BsG.LJJI);
            jSONObject.put("pn_read_empty_size", c2218501BsG.LJIL);
            jSONObject.put("pn_normalized_empty_size", c2218501BsG.LJJ);
            jSONObject.put("email_valid_size", c2218501BsG.LJJIII);
            jSONObject.put("email_read_empty_size", c2218501BsG.LJJIFFI);
            jSONObject.put("email_normalized_empty_size", c2218501BsG.LJJII);
            jSONObject.put("invalid_contacts_size", c2218501BsG.LJJIIZ);
            jSONObject.put("parsed_contacts_size", c2218501BsG.LJIILLIIL);
            jSONObject.put("pn_parsed_size", c2218501BsG.LJJIIZI);
            jSONObject.put("pn_parsed_failed_size", c2218501BsG.LJJIJ);
            jSONObject.put("email_parsed_size", c2218501BsG.LJJIJIIJI);
            jSONObject.put("hashed_contacts_size", c2218501BsG.LJJIJIIJIL);
            jSONObject.put("pn_hashed_size", c2218501BsG.LJJIJIL);
            jSONObject.put("email_hashed_size", c2218501BsG.LJJIJL);
            jSONObject.put("raw_email_size", c2218501BsG.LJJIIJ);
            jSONObject.put("has_email_contact_size", c2218501BsG.LJJIIJZLJL);
            C2218531BsJ c2218531BsJ = C2218501BsG.LJJJI;
            long j = c2218531BsJ.LJFF;
            if (j != -1) {
                jSONObject.put("hashed_phone_modify_interval", j);
            }
            long j2 = c2218531BsJ.LJII;
            if (j2 != -1) {
                jSONObject.put("hashed_phone_modify_same_scene_interval", j2);
            }
            long j3 = c2218531BsJ.LIZIZ;
            if (j3 != -1) {
                jSONObject.put("hashed_email_modify_interval", j3);
            }
            long j4 = c2218531BsJ.LIZLLL;
            if (j4 != -1) {
                jSONObject.put("hashed_email_modify_same_scene_interval", j4);
            }
            jSONObject.put("error_count", c2218501BsG.LJIIZILJ);
            String str3 = c2218501BsG.LJIJ;
            if (str3 != null) {
                jSONObject.put("net_error", str3);
            }
            String str4 = c2218501BsG.LJIJI;
            if (str4 != null) {
                jSONObject.put("serialize_error", str4);
            }
            Long lLIZJ = C2218501BsG.LIZJ(c2218501BsG.LJIIIIZZ);
            if (lLIZJ != null) {
                jSONObject.put("db_cost", LIZ$0(lLIZJ.longValue(), c013c));
            }
            Long lLIZJ2 = C2218501BsG.LIZJ(c2218501BsG.LJIIIZ);
            if (lLIZJ2 != null) {
                jSONObject.put("normalize_cost", LIZ$0(lLIZJ2.longValue(), c013c));
            }
            Long lLIZJ3 = C2218501BsG.LIZJ(c2218501BsG.LJIIJ);
            if (lLIZJ3 != null) {
                jSONObject.put("parse_cost", LIZ$0(lLIZJ3.longValue(), c013c));
            }
            Long lLIZJ4 = C2218501BsG.LIZJ(c2218501BsG.LJIIJJI);
            if (lLIZJ4 != null) {
                jSONObject.put("hash_cost", LIZ$0(lLIZJ4.longValue(), c013c));
            }
            Long lLIZJ5 = C2218501BsG.LIZJ(c2218501BsG.LJIILIIL);
            if (lLIZJ5 != null) {
                jSONObject.put("serialize_cost", LIZ$0(lLIZJ5.longValue(), c013c));
            }
            Long lLIZJ6 = C2218501BsG.LIZJ(c2218501BsG.LJIIL);
            if (lLIZJ6 != null) {
                jSONObject.put("api_cost", LIZ$0(lLIZJ6.longValue(), c013c));
            }
            Long lLIZJ7 = C2218501BsG.LIZJ(c2218501BsG.LJIILJJIL);
            if (lLIZJ7 != null) {
                jSONObject.put("construct_cost", LIZ$0(lLIZJ7.longValue(), c013c));
            }
            jSONObject.put("cost", LIZ$0(c2218501BsG.LJIILL - c2218501BsG.LJII, c013c));
            if (c013c.element) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_valid", str2);
            jSONObject.put("is_cached", c2218501BsG.LJJIJLIJ);
            C20166313vR c20166313vR = (C20166313vR) c2218501BsG.LJJIZ.getValue();
            if (c20166313vR != null) {
                c20166313vR.LIZJ(jSONObject);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("report event relation_monitor_contact_android:\n ");
            sbLIZ.append(jSONObject);
            C2188811AlT.LIZIZ(sbLIZ);
            C20684815ws.LJIJ("relation_monitor_contact_android", jSONObject);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("ContactPef", "report contact monitor error", thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContactMonitor@a70a.reportEvent$1");
        return unit;
    }

    public static final Object call$5(ACallableS436S0100000_34 aCallableS436S0100000_34) {
        C1BLL c1bll = (C1BLL) aCallableS436S0100000_34.l0;
        c1bll.getClass();
        C1C7U.LIZ("DFDownloader@b801.tryExecuteNextTask$1L");
        C1BLC c1blc = c1bll.LLILZLL;
        if (c1blc != null && !c1blc.LJIIIZ.isFinished()) {
            C1C7U.LIZIZ("DFDownloader@b801.tryExecuteNextTask$1L");
            return null;
        }
        C1BLC c1blcPoll = c1bll.LLILLJJLI.poll();
        if (c1blcPoll != null) {
            c1bll.LIZLLL(c1blcPoll);
        }
        C1C7U.LIZIZ("DFDownloader@b801.tryExecuteNextTask$1L");
        return null;
    }

    public static final Object call$6(ACallableS436S0100000_34 aCallableS436S0100000_34) {
        JSONObject jSONObject;
        C0X52<String> c0x52Execute;
        String strLIZJ;
        C1C7U.LIZ("ProxySendJsRequestHelper@9f8a.<field>$1");
        C2204901BRg c2204901BRg = (C2204901BRg) aCallableS436S0100000_34.l0;
        c2204901BRg.LJII = c2204901BRg.LIZ(c2204901BRg.LJII, c2204901BRg.LJIIIZ);
        String str = "";
        try {
            try {
                ArrayList arrayList = new ArrayList();
                List<C080U> list = c2204901BRg.LJIIL;
                boolean z = false;
                if (list != null) {
                    for (C080U c080u : (ArrayList) list) {
                        arrayList.add(new C080U(c080u.LIZ, c080u.LIZIZ));
                        if ("x-tt-dataflow-id".equals(c080u.LIZ)) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    arrayList.add(new C080U("x-tt-dataflow-id", Integer.toString(671088659)));
                }
                c0x52Execute = c2204901BRg.LJIIJJI.doGet(c2204901BRg.LJII, (Map<String, String>) null, arrayList).execute();
                strLIZJ = C2204901BRg.LIZJ(c0x52Execute.LIZ.LIZLLL);
            } catch (C0XIR e) {
                e = e;
            }
            try {
                String str2 = c0x52Execute.LIZIZ;
                jSONObject = new JSONObject(str2);
                Api.LIZIZ(str2, c2204901BRg.LJII, jSONObject);
                jSONObject.put("_AME_Header_RequestID", strLIZJ);
                jSONObject.put("_raw", C786410Ut5.J3(jSONObject));
            } catch (C0XIR e2) {
                e = e2;
                str = strLIZJ;
                TryCatchGuardChecker.doCheck(e);
                c2204901BRg.LJIILJJIL = e;
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("_raw", C786410Ut5.J3(new JSONObject(e.getResponse()).put("_AME_Header_RequestID", str)));
                } catch (JSONException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                C2204901BRg.LIZLLL(jSONObject, e.getErrorCode(), e.getErrorMsg(), e.getPrompt());
            }
        } catch (C0XI3 e4) {
            TryCatchGuardChecker.doCheck(e4);
            c2204901BRg.LJIILJJIL = e4;
            jSONObject = new JSONObject();
            C2204901BRg.LIZLLL(jSONObject, e4.getStatusCode(), e4.getMessage(), "");
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
            c2204901BRg.LJIILJJIL = e5;
            jSONObject = new JSONObject();
            C2204901BRg.LIZLLL(jSONObject, -408, e5.getMessage(), "");
        }
        C1C7U.LIZIZ("ProxySendJsRequestHelper@9f8a.<field>$1");
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$7(ACallableS436S0100000_34 aCallableS436S0100000_34) {
        JSONObject jSONObject;
        String str;
        String str2;
        C1C7U.LIZ("ProxySendJsRequestHelper@9f8a.<field>$2");
        C2204901BRg c2204901BRg = (C2204901BRg) aCallableS436S0100000_34.l0;
        c2204901BRg.LJII = c2204901BRg.LIZ(c2204901BRg.LJII, c2204901BRg.LJIIIZ);
        String strLIZJ = "";
        try {
            try {
                jSONObject = new JSONObject();
                String str3 = c2204901BRg.LJIILIIL;
                try {
                    if (str3 != null) {
                        C2188108hj c2188108hj = C2188108hj.LIZ;
                        String str4 = c2204901BRg.LJII;
                        JSONObject jSONObject2 = c2204901BRg.LJIIJ;
                        List<C080U> list = c2204901BRg.LJIIL;
                        c2188108hj.getClass();
                        C0X52 c0x52LIZ = C2188108hj.LIZ(str4, jSONObject2, str3, list);
                        str2 = (String) c0x52LIZ.LIZIZ;
                        strLIZJ = C2204901BRg.LIZJ(c0x52LIZ.LIZ.LIZLLL);
                    } else {
                        HashMap map = new HashMap();
                        JSONObject jSONObject3 = c2204901BRg.LJIIJ;
                        if (jSONObject3 != null) {
                            Iterator<String> itKeys = jSONObject3.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                map.put(next, c2204901BRg.LJIIJ.optString(next, ""));
                            }
                        }
                        C0XDN.LIZJ(map, true);
                        C0X52<String> c0x52Execute = c2204901BRg.LJIIJJI.doPost(c2204901BRg.LJII, map).execute();
                        str2 = c0x52Execute.LIZIZ;
                        strLIZJ = C2204901BRg.LIZJ(c0x52Execute.LIZ.LIZLLL);
                        Api.LIZ(str2, c2204901BRg.LJII);
                    }
                    jSONObject.put("code", 1);
                    jSONObject.put("response", new JSONObject(str2).put("_AME_Header_RequestID", strLIZJ));
                    jSONObject.put("_raw", str2);
                } catch (Exception e) {
                    e = e;
                    str = strLIZJ;
                    strLIZJ = str2;
                    TryCatchGuardChecker.doCheck(e);
                    c2204901BRg.LJIILJJIL = e;
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("code", 0);
                        jSONObject.put("response", new JSONObject(strLIZJ).put("_AME_Header_RequestID", str));
                        jSONObject.put("_raw", strLIZJ);
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            } catch (Exception e3) {
                e = e3;
                str = "";
            }
        } catch (C0XI3 e4) {
            TryCatchGuardChecker.doCheck(e4);
            c2204901BRg.LJIILJJIL = e4;
            jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 0);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("errCode", e4.getStatusCode());
                jSONObject4.put("message", e4.getMessage());
                jSONObject.put("error", jSONObject4);
            } catch (JSONException e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
        C1C7U.LIZIZ("ProxySendJsRequestHelper@9f8a.<field>$2");
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$8(ACallableS436S0100000_34 aCallableS436S0100000_34) {
        String str;
        JSONObject jSONObject;
        C1C7U.LIZ("ProxySendJsRequestHelper@9f8a.<field>$3");
        C2204901BRg c2204901BRg = (C2204901BRg) aCallableS436S0100000_34.l0;
        String strLIZ = c2204901BRg.LIZ(c2204901BRg.LJII, c2204901BRg.LJIIIZ);
        c2204901BRg.LJII = strLIZ;
        String strLIZJ = "";
        try {
            try {
                C2188108hj c2188108hj = C2188108hj.LIZ;
                JSONObject jSONObject2 = c2204901BRg.LJIIJ;
                String str2 = c2204901BRg.LJIILIIL;
                if (str2 == null) {
                    str2 = "application/x-www-form-urlencoded";
                }
                List<C080U> list = c2204901BRg.LJIIL;
                c2188108hj.getClass();
                C0X52 c0x52LIZIZ = C2188108hj.LIZIZ(strLIZ, jSONObject2, str2, list);
                str = (String) c0x52LIZIZ.LIZIZ;
                try {
                    jSONObject = new JSONObject();
                    strLIZJ = C2204901BRg.LIZJ(c0x52LIZIZ.LIZ.LIZLLL);
                    try {
                        jSONObject.put("code", 1);
                        jSONObject.put("response", new JSONObject(str).put("_AME_Header_RequestID", strLIZJ));
                        jSONObject.put("_raw", str);
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        c2204901BRg.LJIILJJIL = e;
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", 0);
                            jSONObject.put("response", new JSONObject(str).put("_AME_Header_RequestID", strLIZJ));
                            jSONObject.put("_raw", str);
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (C0XI3 e4) {
                TryCatchGuardChecker.doCheck(e4);
                c2204901BRg.LJIILJJIL = e4;
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("errCode", e4.getStatusCode());
                    jSONObject3.put("message", e4.getMessage());
                    jSONObject.put("error", jSONObject3);
                } catch (JSONException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
            }
        } catch (Exception e6) {
            e = e6;
            str = "";
            strLIZJ = str;
        }
        C1C7U.LIZIZ("ProxySendJsRequestHelper@9f8a.<field>$3");
        return jSONObject;
    }

    public static final Object call$9(ACallableS436S0100000_34 aCallableS436S0100000_34) {
        JSONObject jSONObject;
        C1C7U.LIZ("ProxySendJsRequestHelper@9f8a.<field>$4");
        C2204901BRg c2204901BRg = (C2204901BRg) aCallableS436S0100000_34.l0;
        String strLIZ = c2204901BRg.LIZ(c2204901BRg.LJII, c2204901BRg.LJIIIZ);
        c2204901BRg.LJII = strLIZ;
        try {
            String strLIZIZ = c2204901BRg.LIZIZ(strLIZ);
            jSONObject = new JSONObject(strLIZIZ);
            jSONObject.put("_raw", strLIZIZ);
        } catch (C0XI3 e) {
            TryCatchGuardChecker.doCheck(e);
            c2204901BRg.LJIILJJIL = e;
            jSONObject = new JSONObject();
            C2204901BRg.LIZLLL(jSONObject, e.getStatusCode(), e.getMessage(), "");
        } catch (C0XIR e2) {
            TryCatchGuardChecker.doCheck(e2);
            c2204901BRg.LJIILJJIL = e2;
            jSONObject = new JSONObject();
            try {
                jSONObject.put("_raw", e2.getResponse());
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            C2204901BRg.LIZLLL(jSONObject, e2.getErrorCode(), e2.getErrorMsg(), e2.getPrompt());
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            c2204901BRg.LJIILJJIL = e4;
            jSONObject = new JSONObject();
            C2204901BRg.LIZLLL(jSONObject, -408, e4.getMessage(), "");
        }
        C1C7U.LIZIZ("ProxySendJsRequestHelper@9f8a.<field>$4");
        return jSONObject;
    }

    public ACallableS436S0100000_34(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final long LIZ$0(long j, C013C c013c) {
        if (0 <= j && j < 600001) {
            return j;
        }
        c013c.element = false;
        return -1L;
    }
}
