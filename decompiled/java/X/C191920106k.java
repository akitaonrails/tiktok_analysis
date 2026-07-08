package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;

/* JADX INFO: renamed from: X.106k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191920106k {
    public static final C191920106k LIZ = new C191920106k();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            switch(r0) {
                case -1499838031: goto La;
                case 765915793: goto L13;
                case 950345194: goto L27;
                case 950398559: goto L1e;
                case 1050790300: goto L30;
                case 1458418560: goto L3b;
                default: goto L7;
            }
        L7:
            java.lang.String r1 = ""
        L9:
            return r1
        La:
            java.lang.String r1 = "direct_message"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L9
            goto L7
        L13:
            java.lang.String r0 = "following"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "following_list"
            return r1
        L1e:
            java.lang.String r1 = "comment"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L9
            goto L7
        L27:
            java.lang.String r1 = "mention"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L7
            return r1
        L30:
            java.lang.String r0 = "favorite"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "liked"
            return r1
        L3b:
            java.lang.String r0 = "content_reuse_permission"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "reuse_of_content"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191920106k.LIZ(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZIZ(String str) {
        C191880104w.LIZ.getClass();
        int iLIZ = C105F.LIZ(C191880104w.LJIIL(), str, 0);
        switch (str.hashCode()) {
            case -1499838031:
                if (str.equals("direct_message")) {
                    if (iLIZ != 1) {
                        if (iLIZ != 2) {
                            if (iLIZ != 3) {
                                if (iLIZ == 4) {
                                }
                            }
                        }
                    }
                }
                break;
            case 765915793:
                if (str.equals("following")) {
                    if (iLIZ != 1) {
                        if (iLIZ != 2) {
                        }
                    }
                }
                break;
            case 950345194:
                if (str.equals("mention")) {
                    if (iLIZ != 1) {
                        if (iLIZ != 3) {
                            if (iLIZ != 4) {
                                if (iLIZ != 5) {
                                }
                            }
                        }
                    }
                }
                break;
            case 950398559:
                if (str.equals("comment")) {
                    if (iLIZ != 0) {
                        if (iLIZ != 1) {
                            if (iLIZ != 3) {
                            }
                        }
                    }
                }
                break;
            case 1050790300:
                if (str.equals("favorite")) {
                    if (iLIZ != 0) {
                        if (iLIZ != 1) {
                        }
                    }
                }
                break;
            case 1458418560:
                if (str.equals("content_reuse_permission")) {
                    if (iLIZ != 1) {
                        if (iLIZ != 3) {
                            if (iLIZ != 4) {
                                if (iLIZ != 5) {
                                }
                            }
                        }
                    }
                }
                break;
        }
        return "";
    }

    public static void LIZJ(String str) {
        int iLJI;
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
        c191969108h.LIZLLL("page_tag", LIZ(str));
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            iLJI = iPrivacySettingsDepService.LJI();
        } else {
            iLJI = 0;
        }
        c191969108h.LIZ(iLJI, "muf_cnt");
        c191969108h.LIZLLL("to_status", LIZIZ(str));
        c1163504gr.onEventV3("dismiss_privacy_permission_sheet", c191969108h.LIZ);
    }

    public static void LIZLLL(String str, String str2) {
        int iLJI;
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        if (str2 == null) {
            str2 = "privacy_and_safety_settings";
        }
        c191969108h.LIZLLL("enter_from", str2);
        c191969108h.LIZLLL("page_tag", LIZ(str));
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            iLJI = iPrivacySettingsDepService.LJI();
        } else {
            iLJI = 0;
        }
        c191969108h.LIZ(iLJI, "muf_cnt");
        c191969108h.LIZLLL("privacy_status", LIZIZ(str));
        c1163504gr.onEventV3("show_privacy_permission_sheet", c191969108h.LIZ);
    }
}
