package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ceO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1020020ceO {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public final C1020040ceQ LJ = new C1020040ceQ();
    public String LJFF;

    public final void LIZ(Object obj) {
        this.LJ.LIZIZ("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), obj));
    }

    public final void LIZIZ(Aweme aweme) {
        if (aweme == null) {
            throw new NullPointerException("getAwemeRawAd");
        }
        LIZLLL(aweme.getAwemeRawAd().getCreativeId());
        LJIIIIZZ(aweme.getAwemeRawAd().getLogExtra());
        this.LJ.LIZIZ("ad_id", aweme.getAwemeRawAd().getAdId());
    }

    public final void LIZJ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            LIZLLL(awemeRawAd.getCreativeId());
            LJIIIIZZ(awemeRawAd.getLogExtra());
            this.LJ.LIZIZ("ad_id", awemeRawAd.getAdId());
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

    public final void LJ(Aweme aweme) {
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            LJFF(aweme.getAwemeRawAd());
        }
    }

    public final void LJFF(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            LIZLLL(awemeRawAd.getCreativeId());
            LJII(awemeRawAd.getGroupId());
            LJIIIIZZ(awemeRawAd.getLogExtra());
        }
    }

    public final void LJI(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.LJ.LIZIZ(next, jSONObject.opt(next));
            }
        }
    }

    public final void LJII(Long l) {
        String string;
        if (l == null) {
            string = null;
        } else {
            string = l.toString();
        }
        this.LIZLLL = string;
    }

    public final void LJIIIIZZ(String str) {
        this.LJ.LIZIZ("log_extra", str);
    }

    public final void LJIIIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LJ.LIZIZ("refer", str);
        }
    }

    public final void LJIIJ(Context context) {
        String str;
        long j;
        String str2;
        Context contextLIZ = context;
        if (contextLIZ == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        this.LJ.LIZIZ("is_ad_event", "1");
        String strB3 = C786410Ut5.b3(contextLIZ);
        if (!C2093608Ic.LJ(strB3)) {
            this.LJ.LIZIZ("nt", strB3);
        }
        InterfaceC1035050d2d interfaceC1035050d2dLIZLLL = C1029590ctp.LIZLLL();
        String str3 = this.LIZ;
        String str4 = this.LIZIZ;
        JSONObject jSONObject = this.LJ.LIZ;
        String str5 = this.LIZJ;
        if (str5 != null && str5.matches("[+-]?\\d+")) {
            str = this.LIZJ;
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        try {
            str2 = this.LIZLLL;
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (str2 != null) {
            j = CastLongProtector.parseLong(str2);
        } else {
            j = 0;
        }
        interfaceC1035050d2dLIZLLL.LJJIFFI(j, contextLIZ, str3, str4, str, jSONObject);
        synchronized (C1020030ceP.class) {
            try {
                if (C1020030ceP.LIZ == null) {
                    C1020030ceP.LIZ = this;
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
}
