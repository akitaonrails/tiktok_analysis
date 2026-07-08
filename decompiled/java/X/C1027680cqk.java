package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027680cqk extends AbstractC1027720cqo {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(358));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(359));

    public final Aweme LIZLLL() {
        Aweme awemeZr;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = interfaceC634840OvC != null ? interfaceC634840OvC.getContainerID() : null;
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        C1051660dTQ c1051660dTQ = c1537480q70LIZIZ != null ? (C1051660dTQ) c1537480q70LIZIZ.LJFF(C1051660dTQ.class) : null;
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService != null && (awemeZr = iAwemeService.zr(C1027610cqd.LIZJ(c1051660dTQ))) != null) {
            return awemeZr;
        }
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        if (c1019830ce5LIZ != null) {
            return c1019830ce5LIZ.LJIIL;
        }
        return null;
    }

    public final Context LJII() {
        Context context;
        Activity activityLIZJ;
        Activity activityLIZJ2;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && (((activityLIZJ = C0J3A.LIZJ(context)) == null || !activityLIZJ.isFinishing()) && ((activityLIZJ2 = C0J3A.LIZJ(context)) == null || !activityLIZJ2.isDestroyed()))) {
            return context;
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            return abstractC1387200mCcLIZIZ.LIZIZ();
        }
        return null;
    }

    public static String LJ(Map map) {
        if (map == null) {
            return null;
        }
        try {
            C1227904rF.LIZ.getClass();
            return C1227904rF.LJI(map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static AwemeRawAd LJFF(InterfaceC1027710cqn interfaceC1027710cqn) {
        String searchAdCacheKey;
        Long lValueOf;
        Aweme awemeZr;
        InterfaceC660150Puv interfaceC660150PuvLJJII;
        InterfaceC1010250cOd interfaceC1010250cOdMh;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        InterfaceC1027820cqy extra = interfaceC1027710cqn.getExtra();
        if (extra != null && (searchAdCacheKey = extra.getSearchAdCacheKey()) != null && C123100dR.LIZ(searchAdCacheKey)) {
            Number cid = interfaceC1027710cqn.getCid();
            if (cid != null) {
                lValueOf = Long.valueOf(cid.longValue());
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
            if (interfaceC657510PqfLIZLLL != null && (interfaceC660150PuvLJJII = interfaceC657510PqfLIZLLL.LJJII(searchAdCacheKey)) != null && (interfaceC1010250cOdMh = interfaceC660150PuvLJJII.Mh()) != null && (aweme = interfaceC1010250cOdMh.getAweme()) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                return awemeRawAd;
            }
            IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
            if (iAwemeService != null && (awemeZr = iAwemeService.zr(strValueOf)) != null) {
                return awemeZr.getAwemeRawAd();
            }
        }
        return null;
    }

    public final String LIZJ(InterfaceC1027710cqn interfaceC1027710cqn, String str) {
        InterfaceC1027810cqx btmParams;
        String lowerCase;
        InterfaceC1027820cqy extra = interfaceC1027710cqn.getExtra();
        View view = null;
        if (extra != null && (btmParams = extra.getBtmParams()) != null && btmParams.getBtm() != null) {
            Uri uri = UriProtector.parse(str);
            String scheme = uri.getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = null;
            }
            if (!C13LP.LJJJJ(lowerCase, C13LQ.LJLIIL(new String[]{"aweme", "snssdk1180", "snssdk1123", "sslocal"}))) {
                return str;
            }
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            String btm = btmParams.getBtm();
            if (btm == null) {
                btm = "";
            }
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                view = interfaceC634840OvC.getView();
            }
            PageFinder pageFinderVia = PageFinder.via(view);
            C212367188v c212367188v = BcmParams.Companion;
            Map<String, Object> bcm = btmParams.getBcm();
            c212367188v.getClass();
            return uri.buildUpon().appendQueryParameter("source_btm_token", btmSDK.createJumpSourceBtmToken(btm, pageFinderVia, C212367188v.LIZJ(bcm))).build().toString();
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:314:0x06ad, code lost:
    
        if (X.C1027410cqJ.LIZIZ(r0, X.C1027610cqd.LIZ(r2, r27, r22.intValue(), r21.intValue(), r20.intValue(), r16.intValue(), null, r3, null, r1, r36, r18.intValue(), r8, r17.intValue(), r15.intValue(), 0, java.lang.Boolean.valueOf(r19), new kotlin.jvm.internal.AwS595S0100000_16(r49, 204), r44, r0.getReportAdExtraData(), r0.getJumpData(), LJFF(r0), 98304), new kotlin.jvm.internal.AwS595S0100000_16(r0, 205)).LIZ() != false) goto L315;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05eb A[Catch: all -> 0x06da, TryCatch #0 {all -> 0x06da, blocks: (B:280:0x05eb, B:282:0x05f1, B:288:0x0602, B:287:0x05fc, B:289:0x0607, B:291:0x060d, B:293:0x0613, B:294:0x0617, B:296:0x061d, B:298:0x0627, B:300:0x062d, B:304:0x0637, B:306:0x063d, B:312:0x0652, B:311:0x0649, B:275:0x05b6, B:277:0x05d8, B:279:0x05e2), top: B:327:0x05b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020d  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r50, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r51, X.EnumC1063300dmC r52) {
        /*
            Method dump skipped, instruction units count: 1770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1027680cqk.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
