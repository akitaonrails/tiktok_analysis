package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1024100cky {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public final C1024160cl4 LJ = new C1024160cl4();
    public String LJFF;

    public final void LJ() {
        this.LJ.LIZ("ad_event_type", "debug");
    }

    public final void LJII() {
        this.LJ.LIZ("is_ad_event", "1");
        C844470XAv.LIZ.getClass();
        String strB3 = C786410Ut5.b3(C844470XAv.LIZ());
        if (C2093608Ic.LJ(strB3)) {
            return;
        }
        this.LJ.LIZ("nt", strB3);
    }

    public final void LJIIIIZZ() {
        if (TextUtils.isEmpty("card_common")) {
            return;
        }
        this.LJ.LIZ("refer", "card_common");
    }

    public final void LJIIJ() {
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        LJII();
        HashMap map = new HashMap();
        try {
            map.put("category", "event_v3");
            if (!TextUtils.isEmpty(this.LIZ)) {
                map.put("tag", this.LIZ);
            }
            if (!TextUtils.isEmpty(this.LIZIZ)) {
                map.put("label", this.LIZIZ);
            }
            if (!TextUtils.isEmpty(this.LIZJ)) {
                map.put("value", this.LIZJ);
            }
            if (!TextUtils.isEmpty(this.LIZLLL)) {
                map.put("ext_value", this.LIZLLL);
            }
            C1024160cl4 c1024160cl4 = this.LJ;
            if (c1024160cl4.LIZ == null) {
                c1024160cl4.LIZ = new JSONObject();
            }
            JSONObject jSONObject = c1024160cl4.LIZ;
            C1019240cd8.LIZ.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, jSONObject);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.equals("has_v3", next)) {
                    try {
                        Object objOpt = jSONObject.opt(next);
                        if (objOpt instanceof String) {
                            map.put(next, (String) objOpt);
                        } else {
                            map.put(next, new Gson().LJIILL(objOpt));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }
            }
            if (!TextUtils.isEmpty(this.LJFF) && C2214471Bll.LIZ() != null) {
                C2214471Bll.LIZ().onEventV3Map(this.LJFF, map);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
        }
        synchronized (C1024150cl3.class) {
            try {
                if (C1024150cl3.LIZ == null) {
                    C1024150cl3.LIZ = this;
                    this.LIZ = null;
                    this.LIZIZ = null;
                    this.LIZJ = null;
                    this.LIZLLL = null;
                    this.LJ.LIZ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIIZ() {
        String str;
        LJII();
        String str2 = this.LIZ;
        String str3 = this.LIZIZ;
        JSONObject jSONObject = this.LJ.LIZ;
        String str4 = this.LIZJ;
        String str5 = (str4 == null || !str4.matches("[+-]?\\d+")) ? CardStruct.IStatusCode.DEFAULT : this.LIZJ;
        try {
            str = this.LIZLLL;
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        long j = str != null ? CastLongProtector.parseLong(str) : 0L;
        C1022500ciO.LIZ(str2, str3, str5, jSONObject, j);
        synchronized (C1024150cl3.class) {
            try {
                if (C1024150cl3.LIZ == null) {
                    C1024150cl3.LIZ = this;
                    this.LIZ = null;
                    this.LIZIZ = null;
                    this.LIZJ = null;
                    this.LIZLLL = null;
                    this.LJ.LIZ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ(Object obj) {
        this.LJ.LIZ("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), obj));
    }

    public final void LIZIZ(Aweme aweme) {
        if (aweme == null) {
            throw new NullPointerException("getAwemeRawAd");
        }
        LIZLLL(aweme.getAwemeRawAd().getCreativeId());
        LJI(aweme.getAwemeRawAd().getLogExtra());
        this.LJ.LIZ("ad_id", aweme.getAwemeRawAd().getAdId());
    }

    public final void LIZJ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            LIZLLL(awemeRawAd.getCreativeId());
            LJI(awemeRawAd.getLogExtra());
            this.LJ.LIZ("ad_id", awemeRawAd.getAdId());
        }
    }

    public final void LIZLLL(Long l) {
        String string;
        if (l == null) {
            string = null;
        } else {
            string = l.toString();
        }
        this.LIZJ = string;
    }

    public final void LJFF(AwemeRawAd awemeRawAd) {
        String string;
        if (awemeRawAd != null) {
            LIZLLL(awemeRawAd.getCreativeId());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId == null) {
                string = null;
            } else {
                string = groupId.toString();
            }
            this.LIZLLL = string;
            LJI(awemeRawAd.getLogExtra());
        }
    }

    public final void LJI(String str) {
        this.LJ.LIZ("log_extra", str);
    }
}
