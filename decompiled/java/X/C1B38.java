package X;

import com.ss.android.ugc.aweme.authorize.network.OAuthPageDetailApiRequest;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage;
import com.ss.android.ugc.aweme.openauthorize.entity.WebAuthV2Response;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1B38, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B38 {
    public static void LIZIZ(final String str, String str2, final String str3, String str4, String str5, String str6, final boolean z, final C1B31 c1b31) {
        C1B3I.LIZ.getClass();
        C1B3I.LIZIZ.LJ(str, str2, str3, "code", str4, str5, str6).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<WebAuthV2Response>() { // from class: X.1B3G
            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                WebAuthV2Response webAuthV2Response = new WebAuthV2Response("", null, null, null, null, null, null, null, null, null);
                if (th instanceof C1494450ozb) {
                    webAuthV2Response.netErrorCode = Integer.valueOf(((C1494450ozb) th).getCronetInternalErrorCode());
                } else if (th instanceof C1494690ozz) {
                    C1494690ozz c1494690ozz = (C1494690ozz) th;
                    webAuthV2Response.netErrorStatusCode = Integer.valueOf(c1494690ozz.getStatusCode());
                    if (c1494690ozz.getStatusCode() != 0) {
                        webAuthV2Response.netErrorCode = Integer.valueOf(c1494690ozz.getStatusCode());
                    } else if (c1494690ozz.getCronetInternalErrorCode() != 0) {
                        webAuthV2Response.netErrorCode = Integer.valueOf(c1494690ozz.getCronetInternalErrorCode());
                    } else {
                        webAuthV2Response.netErrorCode = -9999;
                    }
                } else {
                    webAuthV2Response.netErrorCode = -9999;
                }
                webAuthV2Response.netErrorMessage = C13LE.LIZ(th.getClass()).LIZLLL();
                c1b31.LIZ(webAuthV2Response);
                C1236610iHj.LIZIZ(str, "auth_web_auth_api_net_error", String.valueOf(webAuthV2Response.netErrorCode), C1236610iHj.LIZ(str, Intrinsics.LJFF(str3, "jsb"), z), EnumC21632119lH.TTOP, EnumC19415410xc.SERVER);
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(WebAuthV2Response webAuthV2Response) {
                String strValueOf;
                WebAuthV2Response webAuthV2Response2 = webAuthV2Response;
                c1b31.LIZ(webAuthV2Response2);
                String str7 = webAuthV2Response2.code;
                if (str7 == null || str7.length() == 0) {
                    String str8 = webAuthV2Response2.redirectUrl;
                    if (str8 == null || str8.length() == 0) {
                        Integer num = webAuthV2Response2.errorCode;
                        if (num != null && num.intValue() != 0) {
                            strValueOf = String.valueOf(webAuthV2Response2.errorCode);
                        } else {
                            Integer num2 = webAuthV2Response2.netErrorCode;
                            if (num2 != null && num2.intValue() != 0) {
                                strValueOf = String.valueOf(webAuthV2Response2.netErrorCode);
                            } else {
                                Integer num3 = webAuthV2Response2.netErrorStatusCode;
                                if (num3 != null && num3.intValue() != 0) {
                                    strValueOf = String.valueOf(webAuthV2Response2.netErrorStatusCode);
                                } else {
                                    Integer num4 = webAuthV2Response2.statusCode;
                                    if (num4 != null && num4.intValue() != 0) {
                                        strValueOf = String.valueOf(webAuthV2Response2.statusCode);
                                    } else {
                                        strValueOf = "";
                                    }
                                }
                            }
                        }
                        C1236610iHj.LIZIZ(str, "auth_web_auth_api_response", strValueOf, C1236610iHj.LIZ(str, Intrinsics.LJFF(str3, "jsb"), z), EnumC21632119lH.TTOP, EnumC19415410xc.SERVER);
                    }
                }
            }
        });
    }

    public static void LIZ(final String str, String str2, String str3, String str4, String str5, String str6, String str7, final String str8, String str9, Boolean bool, String str10, String str11, String str12, String str13, final boolean z, final C1B3H c1b3h) {
        String strLIZ;
        String str14 = str13;
        C1B3I.LIZ.getClass();
        C1B39 c1b39 = C1B3I.LIZJ;
        if (str7.length() > 0) {
            strLIZ = C1B3I.LIZIZ(str9);
        } else {
            strLIZ = C2084808Es.LIZ(str9);
        }
        boolean zLJFF = Intrinsics.LJFF(bool, Boolean.TRUE);
        C844470XAv.LIZ.getClass();
        int i = C844470XAv.LJIIJ;
        String string = Locale.getDefault().toString();
        if (str14 == null) {
            str14 = "";
        }
        c1b39.LIZLLL(new OAuthPageDetailApiRequest(str, str2, str3, str4, strLIZ, str6, str5, str7, "v2", str11, str8, "code", str9, zLJFF ? 1 : 0, i, string, str10, str12, str14)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<OAuthPage>() { // from class: X.1B3F
            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
            @Override // X.InterfaceC19474811He
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onError(java.lang.Throwable r11) {
                /*
                    r10 = this;
                    boolean r0 = r11 instanceof X.C1494450ozb
                    if (r0 == 0) goto L40
                    X.0ozb r11 = (X.C1494450ozb) r11
                    int r0 = r11.getCronetInternalErrorCode()
                La:
                    java.lang.String r3 = r2
                    java.lang.String r4 = "auth_detail_api_net_error"
                    java.lang.String r5 = java.lang.String.valueOf(r0)
                    java.lang.String r1 = r3
                    java.lang.String r0 = "jsb"
                    boolean r2 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    java.lang.String r1 = r2
                    boolean r0 = r4
                    X.0iHi r6 = X.C1236610iHj.LIZ(r1, r2, r0)
                    X.19lH r7 = X.EnumC21632119lH.TTOP
                    X.10xc r8 = X.EnumC19415410xc.SERVER
                    X.C1236610iHj.LIZIZ(r3, r4, r5, r6, r7, r8)
                    com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage r1 = new com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage
                    r2 = 0
                    r0 = -1
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                    r3 = r2
                    r4 = r2
                    r6 = r2
                    r7 = r2
                    r8 = r2
                    r9 = r2
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                    X.1B3H r0 = r1
                    r0.LIZIZ(r1)
                    return
                L40:
                    boolean r0 = r11 instanceof X.C1494690ozz
                    if (r0 == 0) goto L5c
                    X.0ozz r11 = (X.C1494690ozz) r11
                    int r0 = r11.getStatusCode()
                    if (r0 == 0) goto L51
                    int r0 = r11.getStatusCode()
                    goto La
                L51:
                    int r0 = r11.getCronetInternalErrorCode()
                    if (r0 == 0) goto L5c
                    int r0 = r11.getCronetInternalErrorCode()
                    goto La
                L5c:
                    r0 = -9999(0xffffffffffffd8f1, float:NaN)
                    goto La
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1B3F.onError(java.lang.Throwable):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
            @Override // X.InterfaceC19474811He
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage r10) {
                /*
                    r9 = this;
                    com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage r10 = (com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage) r10
                    java.lang.Integer r0 = r10.statusCode
                    if (r0 == 0) goto Lc
                    int r0 = r0.intValue()
                    if (r0 != 0) goto L26
                Lc:
                    java.lang.Integer r0 = r10.errorCode
                    if (r0 == 0) goto L16
                    int r0 = r0.intValue()
                    if (r0 != 0) goto L26
                L16:
                    java.lang.String r0 = r10.error
                    if (r0 == 0) goto L20
                    int r0 = r0.length()
                    if (r0 != 0) goto L26
                L20:
                    X.1B3H r0 = r1
                    r0.LIZ(r10)
                    return
                L26:
                    java.lang.Integer r0 = r10.errorCode
                    if (r0 == 0) goto L5d
                    int r0 = r0.intValue()
                    if (r0 == 0) goto L5d
                    java.lang.Integer r0 = r10.errorCode
                    if (r0 == 0) goto L70
                    int r0 = r0.intValue()
                L38:
                    java.lang.String r3 = r2
                    java.lang.String r4 = "auth_detail_api_response"
                    java.lang.String r5 = java.lang.String.valueOf(r0)
                    java.lang.String r1 = r3
                    java.lang.String r0 = "jsb"
                    boolean r2 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    java.lang.String r1 = r2
                    boolean r0 = r4
                    X.0iHi r6 = X.C1236610iHj.LIZ(r1, r2, r0)
                    X.19lH r7 = X.EnumC21632119lH.TTOP
                    X.10xc r8 = X.EnumC19415410xc.SERVER
                    X.C1236610iHj.LIZIZ(r3, r4, r5, r6, r7, r8)
                    X.1B3H r0 = r1
                    r0.LIZIZ(r10)
                    return
                L5d:
                    java.lang.Integer r0 = r10.statusCode
                    if (r0 == 0) goto L70
                    int r0 = r0.intValue()
                    if (r0 == 0) goto L70
                    java.lang.Integer r0 = r10.statusCode
                    if (r0 == 0) goto L70
                    int r0 = r0.intValue()
                    goto L38
                L70:
                    r0 = -9999(0xffffffffffffd8f1, float:NaN)
                    goto L38
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1B3F.onSuccess(java.lang.Object):void");
            }
        });
    }
}
