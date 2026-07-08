package Y;

import X.AbstractC1063740dmu;
import X.AbstractC1064990dov;
import X.C098200Yq;
import X.C1020020ceO;
import X.C1020030ceP;
import X.C1025340cmy;
import X.C1029200ctC;
import X.C1054780dYS;
import X.C1058780deu;
import X.C1058860df2;
import X.C1058870df3;
import X.C1059860dge;
import X.C1077200e8c;
import X.C1520350pfN;
import X.C1520360pfO;
import X.C1520380pfQ;
import X.C1520400pfS;
import X.C1551950qUL;
import X.C1552050qUV;
import X.C1553670qX7;
import X.C1553710qXB;
import X.C189200o6;
import X.C19262210Xk;
import X.C1C7U;
import X.C2184171Adz;
import X.C2439109h7;
import X.InterfaceC1054970dYl;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.profile.business.common.ProfilePageFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ACallableS246S0200000_16 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS246S0200000_16 aCallableS246S0200000_16) {
        C19262210Xk c19262210Xk = (C19262210Xk) aCallableS246S0200000_16.l0;
        Uri uri = (Uri) aCallableS246S0200000_16.l1;
        c19262210Xk.getClass();
        C1C7U.LIZ("DeeplinkEventComponent@6d7c.handleAdx$1L");
        C1025340cmy c1025340cmy = C1025340cmy.LIZIZ;
        AwemeRawAd awemeRawAd = c1025340cmy.LIZ;
        c1025340cmy.LIZ = null;
        if (awemeRawAd == null) {
            C1C7U.LIZIZ("DeeplinkEventComponent@6d7c.handleAdx$1L");
            return null;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tag");
        if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "draw_ad";
        }
        C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
        c1020020ceOLIZ.LJFF(awemeRawAd);
        c1020020ceOLIZ.LIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        c1020020ceOLIZ.LIZIZ = "open_url_appback";
        c1020020ceOLIZ.LJIIJ(c19262210Xk.LIZ);
        C2184171Adz.LIZLLL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "open_url_appback", awemeRawAd).LJIIIIZZ();
        C1C7U.LIZIZ("DeeplinkEventComponent@6d7c.handleAdx$1L");
        return null;
    }

    public static final Object call$1(ACallableS246S0200000_16 aCallableS246S0200000_16) {
        ProfilePageFragment profilePageFragment = (ProfilePageFragment) aCallableS246S0200000_16.l0;
        Aweme aweme = (Aweme) aCallableS246S0200000_16.l1;
        profilePageFragment.getClass();
        C1C7U.LIZ("ProfilePageFragment@e348.onAwemeChange$1L");
        InterfaceC1054970dYl adFlutterLandPageUtil = C1054780dYS.LIZIZ.getAdFlutterLandPageUtil();
        aweme.getAwemeRawAd();
        adFlutterLandPageUtil.LIZ();
        synchronized (profilePageFragment.LLJJL) {
            try {
                profilePageFragment.LLJJLIIIJLLLLLLLZ = profilePageFragment.kS(aweme);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("ProfilePageFragment@e348.onAwemeChange$1L");
        return null;
    }

    public static final Object call$2(ACallableS246S0200000_16 aCallableS246S0200000_16) {
        int iIntValue;
        C1C7U.LIZ("FeedGradientBackgroundHelper@5dac.loadAutoColorBitmap$1$onCompleted$1");
        Bitmap bitmap = (Bitmap) aCallableS246S0200000_16.l0;
        GradientDrawable gradientDrawable = null;
        if (bitmap != null) {
            int i = ((C1029200ctC) aCallableS246S0200000_16.l1).LIZ;
            Integer numLIZIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null)).LIZIZ();
            if (numLIZIZ != null) {
                iIntValue = numLIZIZ.intValue();
            } else {
                iIntValue = -1;
            }
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, iIntValue});
        }
        C1C7U.LIZIZ("FeedGradientBackgroundHelper@5dac.loadAutoColorBitmap$1$onCompleted$1");
        return gradientDrawable;
    }

    public static final Object call$3(ACallableS246S0200000_16 aCallableS246S0200000_16) {
        Unit unit;
        C1C7U.LIZ("AbsLemon8AnchorMaker@c606.preloadResources$1");
        ((AbstractC1064990dov) aCallableS246S0200000_16.l0).getClass();
        String strLIZ = C1553670qX7.LIZ();
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        List<String> listLJJIJIL = ((AbstractC1064990dov) aCallableS246S0200000_16.l0).LJJIJIL();
        if (listLJJIJIL != null) {
            for (String str : listLJJIJIL) {
                CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
                targetChannel.channelName = str;
                arrayList.add(targetChannel);
            }
        }
        map.put(strLIZ, arrayList);
        ((AbstractC1064990dov) aCallableS246S0200000_16.l0).getClass();
        C1551950qUL c1551950qULLJIIIZ = C1552050qUV.LJIIIZ(C1553670qX7.LIZ());
        if (c1551950qULLJIIIZ != null) {
            c1551950qULLJIIIZ.LIZJ(map, (C1077200e8c) aCallableS246S0200000_16.l1);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("AbsLemon8AnchorMaker@c606.preloadResources$1");
        return unit;
    }

    public static final Object call$4(ACallableS246S0200000_16 aCallableS246S0200000_16) {
        Object c098200Yq;
        String strLIZ;
        C1C7U.LIZ("XHostLogDependImpl@4d60.reportJSBError$1");
        C1059860dge c1059860dge = (C1059860dge) aCallableS246S0200000_16.l0;
        Map map = (Map) aCallableS246S0200000_16.l1;
        try {
            AbstractC1063740dmu abstractC1063740dmu = (AbstractC1063740dmu) C1553710qXB.LIZIZ(c1059860dge, AbstractC1063740dmu.class);
            C1520360pfO c1520360pfO = new C1520360pfO("bdx_monitor_xbridge_error");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", map.get("code"));
            jSONObject.put("error_message", map.get("error_message"));
            jSONObject.put("method_name", map.get("method_name"));
            c1520360pfO.LIZLLL = jSONObject;
            if (abstractC1063740dmu == null) {
                strLIZ = null;
            } else {
                strLIZ = abstractC1063740dmu.LIZ();
            }
            c1520360pfO.LIZ = strLIZ;
            c1520360pfO.LJIIL = new C1520400pfS();
            C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
            C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
            c1520380pfQ.getClass();
            C1520380pfQ.LIZ(c1520350pfNLIZ);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("XHostLogDependImpl@4d60.reportJSBError$1");
        return c189200o6M1boximpl;
    }

    public static final Object call$5(ACallableS246S0200000_16 aCallableS246S0200000_16) {
        JSONObject jSONObject;
        C1058870df3 c1058870df3 = (C1058870df3) aCallableS246S0200000_16.l0;
        C1058860df2 c1058860df2 = (C1058860df2) aCallableS246S0200000_16.l1;
        C1C7U.LIZ("MonitorReportService@293d.report$1L");
        try {
            String str = c1058870df3.LIZJ;
            String str2 = null;
            if (str == null) {
                str = null;
            }
            JSONObject jSONObjectLJ = c1058860df2.LJ(c1058870df3.LIZLLL, str);
            JSONObject jSONObject2 = c1058870df3.LJI;
            C1058780deu c1058780deu = c1058860df2.LIZLLL;
            if (c1058780deu == null) {
                jSONObject = null;
            } else {
                jSONObject = c1058780deu.LJ;
            }
            JSONObject jSONObjectLJFF = C1058860df2.LJFF(jSONObject2, jSONObject, str);
            C1058780deu c1058780deu2 = c1058860df2.LIZLLL;
            String str3 = "";
            if (c1058780deu2 != null) {
                String str4 = c1058780deu2.LIZ;
                if (str4 != null) {
                    str3 = str4;
                }
                str2 = c1058780deu2.LIZIZ;
            }
            String str5 = c1058870df3.LIZIZ;
            boolean zLJFF = Intrinsics.LJFF(c1058870df3.LJFF, Boolean.TRUE);
            C1520360pfO c1520360pfO = new C1520360pfO(c1058870df3.LIZ);
            c1520360pfO.LIZLLL = jSONObjectLJ;
            c1520360pfO.LJ = c1058870df3.LJ;
            c1520360pfO.LJIIL = c1058860df2.LJ;
            c1520360pfO.LJFF = c1058870df3.LJII;
            c1520360pfO.LIZIZ = str3;
            c1520360pfO.LIZ = str5;
            c1520360pfO.LJII = jSONObjectLJFF;
            c1520360pfO.LIZIZ(zLJFF ? 1 : 0);
            if (str2 != null) {
                c1520360pfO.LJIIIZ = str2;
            }
            C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
            C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
            c1520380pfQ.getClass();
            C1520380pfQ.LIZ(c1520350pfNLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MonitorReportService@293d.report$1L");
        return unit;
    }

    public ACallableS246S0200000_16(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
