package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.amazon.model.AmazonConfigSettingModel;
import com.ss.android.ugc.aweme.amazon.model.AmazonTokenGenerateResponse;
import com.ss.android.ugc.aweme.amazon.model.AmazonTokenInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import java.security.MessageDigest;
import java.security.SecureRandom;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0DHD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DHD {
    public final WebView LIZ;
    public final Function2<String, String, Unit> LIZIZ;
    public final Function1<String, Unit> LIZJ;
    public final InterfaceC1036110d4L LIZLLL;
    public final C1035880d3y LJ;
    public DialogC1389620mGW LJFF;
    public AnonymousClass0956 LJI;

    public final void LJFF() {
        AnonymousClass0956 anonymousClass0956 = this.LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public static boolean LIZIZ(AmazonTokenGenerateResponse amazonTokenGenerateResponse) {
        Integer num;
        String str;
        if (amazonTokenGenerateResponse != null && (num = amazonTokenGenerateResponse.statusCode) != null && num.intValue() == 0) {
            AmazonTokenInfo amazonTokenInfo = amazonTokenGenerateResponse.amazonTokenInfo;
            if (amazonTokenInfo != null) {
                str = amazonTokenInfo.accessToken;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.amazon.model.AmazonTokenGenerateResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C315310CXp
            if (r0 == 0) goto L20
            r4 = r6
            X.0CXp r4 = (X.C315310CXp) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L43
        L20:
            X.0CXp r4 = new X.0CXp
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.0CPm r0 = X.InterfaceC315270CXl.LIZ     // Catch: java.lang.Exception -> L49
            r0.getClass()     // Catch: java.lang.Exception -> L49
            X.0CXl r0 = X.C313200CPm.LIZ()     // Catch: java.lang.Exception -> L49
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L49
            java.lang.Object r3 = r0.LIZJ(r4)     // Catch: java.lang.Exception -> L49
            if (r3 != r2) goto L46
            return r2
        L43:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L49
        L46:
            com.ss.android.ugc.aweme.amazon.model.AmazonTokenGenerateResponse r3 = (com.ss.android.ugc.aweme.amazon.model.AmazonTokenGenerateResponse) r3     // Catch: java.lang.Exception -> L49
            return r3
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DHD.LIZLLL(X.05Vn):java.lang.Object");
    }

    public final void LJ(String str) {
        String strEncodeToString;
        byte[] bytes;
        String strEncodeToString2;
        boolean z;
        String str2;
        int i;
        String awemeId;
        UrlModel authorAvatar;
        Activity activityLIZIZ;
        Activity activityLIZIZ2;
        PackageManager packageManager;
        byte[] bArrDigest;
        AwemeRawAd awemeRawAd = null;
        try {
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            strEncodeToString = Base64.encodeToString(bArr, 11);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            strEncodeToString = null;
        }
        if (strEncodeToString == null) {
            bytes = null;
        } else {
            try {
                bytes = strEncodeToString.getBytes(Charsets.UTF_8);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJ(e2);
                strEncodeToString2 = null;
            }
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        if (bytes != null) {
            bArrDigest = messageDigest.digest(bytes);
        } else {
            bArrDigest = null;
        }
        strEncodeToString2 = Base64.encodeToString(bArrDigest, 11);
        AmazonConfigSettingModel amazonConfigSettingModelLIZ = C0DHE.LIZ();
        Boolean bool = amazonConfigSettingModelLIZ.enableAmazonA2BSSO;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            if (!Intrinsics.LJFF(amazonConfigSettingModelLIZ.enableAndroidPrecheck, Boolean.FALSE)) {
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ != null) {
                    activityLIZIZ2 = abstractC1387200mCcLIZIZ.LIZIZ();
                } else {
                    activityLIZIZ2 = null;
                }
                Activity activityLIZ = C06MM.LIZ(activityLIZIZ2);
                if ((activityLIZ != null || (activityLIZ = C06MM.LIZ(this.LIZ.getContext())) != null) && (packageManager = activityLIZ.getPackageManager()) != null) {
                    try {
                        C786410Ut5.Y3(packageManager, "com.android.chrome", 0);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        C1AF0.LJ(e3);
                        z = false;
                    }
                }
                z = false;
            }
            z = true;
        } else {
            z = false;
        }
        String commerceAmazonClientId = amazonConfigSettingModelLIZ.getCommerceAmazonClientId();
        String commerceRedirectUri = amazonConfigSettingModelLIZ.getCommerceRedirectUri();
        if (z) {
            str2 = "na.account.amazon.com";
        } else {
            str2 = "www.amazon.com";
        }
        String string = new Uri.Builder().scheme("https").authority(str2).appendPath("ap").appendPath("oa").appendQueryParameter("client_id", commerceAmazonClientId).appendQueryParameter("scope", "profile:user_id shop_external::shared_orders").appendQueryParameter("response_type", "code").appendQueryParameter("redirect_uri", commerceRedirectUri).appendQueryParameter("state", "208257577ll0975l93l2l59l895857093449424").appendQueryParameter("code_challenge", strEncodeToString2).appendQueryParameter("code_challenge_method", "S256").build().toString();
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC1036110d4L interfaceC1036110d4L = this.LIZLLL;
        if (interfaceC1036110d4L != null) {
            interfaceC1036110d4L.LIZJ(Integer.valueOf(i));
        }
        AnonymousClass0956 anonymousClass0956 = this.LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C2252331DDr c2252331DDr = C315960Ca2.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        final AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(c054gLIZ, C315960Ca2.LIZIZ, null, new C315340CXs(c054gLIZ, null, this, jElapsedRealtime, str, strEncodeToString, i), 2);
        this.LJI = anonymousClass0956LIZLLL;
        if (z) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(UriProtector.parse(string));
            intent.addFlags(268435456);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ2 != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            Activity activityLIZ2 = C06MM.LIZ(activityLIZIZ);
            if (activityLIZ2 == null) {
                activityLIZ2 = C06MM.LIZ(this.LIZ.getContext());
            }
            if (activityLIZ2 != null && Intrinsics.LJFF(amazonConfigSettingModelLIZ.enableAndroidPrecheck, bool2)) {
                try {
                    C786410Ut5.Y3(activityLIZ2.getPackageManager(), "com.android.chrome", 0);
                    intent.setPackage("com.android.chrome");
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    C1AF0.LJ(e4);
                }
            }
            C2429209fW.LIZ().appendDataFlowId(intent, 1207969300);
            if (activityLIZ2 != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ2, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, activityLIZ2);
                C2204961BRm.LJIILLIIL(activityLIZ2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOulYoXB0nwCRDomivSAk2fsX/YMMAewqUA=", null));
                return;
            }
            return;
        }
        C0CZS c0czs = C0CZS.LIZ;
        Context context = this.LIZ.getContext();
        C1035880d3y c1035880d3y = this.LJ;
        c0czs.getClass();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null) {
                c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF);
            } else {
                return;
            }
        }
        if (c19egLIZIZ != null) {
            IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class);
            if (c1035880d3y != null) {
                awemeId = c1035880d3y.getAwemeId();
            } else {
                awemeId = null;
            }
            if (c1035880d3y != null) {
                authorAvatar = c1035880d3y.getAuthorAvatar();
            } else {
                authorAvatar = null;
            }
            AdlpExtraModel adlpExtraModel = new AdlpExtraModel(null, null, awemeId, null, null, "amazon_login", 1, 0, 0, null, authorAvatar, null, null, null, null, null, null, null, null, null, null, null);
            C1025720cna c1025720cna = new C1025720cna(0.9f, bool2, bool2, 1, bool2, -1, -1, bool2);
            C1028100crQ c1028100crQ = new C1028100crQ(bool2, context.getString(2131826485), Boolean.FALSE, false, false, Boolean.FALSE, Boolean.TRUE, null, null, null, false, false, false, false, null, Boolean.FALSE);
            if (c1035880d3y != null) {
                awemeRawAd = c1035880d3y.getAwemeRawAd();
            }
            iAdLandingPagePopUpService.LJIIJ(-1, c19egLIZIZ, new InterfaceC1036270d4b() { // from class: X.0DHF
                @Override // X.InterfaceC1036270d4b
                public final void Gn(MotionEvent motionEvent) {
                }

                @Override // X.InterfaceC1036270d4b
                public final void LLLFFI(TuxSheet tuxSheet, float f) {
                }

                @Override // X.InterfaceC1036270d4b
                public final void LLLLIIIILLL(TuxSheet tuxSheet, int i2) {
                }

                @Override // X.InterfaceC1036270d4b
                public final void Pu(InterfaceC1034470d1h interfaceC1034470d1h) {
                }

                @Override // X.InterfaceC1036270d4b
                public final void Rg(InterfaceC1034470d1h interfaceC1034470d1h) {
                }

                @Override // X.InterfaceC1036270d4b
                public final void V() {
                }

                @Override // X.InterfaceC1036270d4b
                public final void Yc() {
                }

                @Override // X.InterfaceC1036270d4b
                public final void ha(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str3, String str4) {
                }

                @Override // X.InterfaceC1036270d4b
                public final void s8(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str3) {
                }

                @Override // X.InterfaceC1036270d4b
                public final void ni(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h) {
                    C09AE c09ae = anonymousClass0956LIZLLL;
                    if (c09ae != null) {
                        c09ae.LIZIZ(null);
                    }
                }
            }, new C1026310coX(string, awemeRawAd, adlpExtraModel, false, c1025720cna, c1028100crQ), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.amazon.model.AmazonTokenGenerateResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C315300CXo
            if (r0 == 0) goto L20
            r4 = r8
            X.0CXo r4 = (X.C315300CXo) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L4a
        L20:
            X.0CXo r4 = new X.0CXo
            r4.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.amazon.model.AmazonTokenGenerateRequest r1 = new com.ss.android.ugc.aweme.amazon.model.AmazonTokenGenerateRequest
            java.lang.String r0 = "https://www.tiktok.com/third-party-oauth-redirect/commerce/buy-with-amazon"
            r1.<init>(r6, r7, r0)
            X.0CPm r0 = X.InterfaceC315270CXl.LIZ     // Catch: java.lang.Exception -> L50
            r0.getClass()     // Catch: java.lang.Exception -> L50
            X.0CXl r0 = X.C313200CPm.LIZ()     // Catch: java.lang.Exception -> L50
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L50
            java.lang.Object r1 = r0.LIZ(r1, r4)     // Catch: java.lang.Exception -> L50
            if (r1 != r3) goto L4d
            return r3
        L4a:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L50
        L4d:
            com.ss.android.ugc.aweme.amazon.model.AmazonTokenGenerateResponse r1 = (com.ss.android.ugc.aweme.amazon.model.AmazonTokenGenerateResponse) r1     // Catch: java.lang.Exception -> L50
            return r1
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DHD.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public C0DHD(WebView webView, AwS630S0100000_16 awS630S0100000_16, AwS595S0100000_16 awS595S0100000_16, InterfaceC1036110d4L interfaceC1036110d4L, C1035880d3y c1035880d3y) {
        this.LIZ = webView;
        this.LIZIZ = awS630S0100000_16;
        this.LIZJ = awS595S0100000_16;
        this.LIZLLL = interfaceC1036110d4L;
        this.LJ = c1035880d3y;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r8, java.lang.String r9, java.lang.String r10, java.lang.Long r11, java.lang.String r12, X.InterfaceC1364105Vn r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DHD.LIZJ(int, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
