package X;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.KeyCharacterMap;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0rV1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590810rV1 {
    public static final C1590810rV1 LIZ = new C1590810rV1();
    public static final Map<String, String> LIZIZ = new LinkedHashMap();

    public static final String LIZIZ(Activity activity) {
        int integer;
        int height;
        int height2;
        if (activity != null) {
            LIZ.getClass();
            Resources resources = activity.getResources();
            int iN3 = C786410Ut5.n3(resources, "config_navBarInteractionMode", "integer", "android");
            if (iN3 > 0) {
                integer = resources.getInteger(iN3);
            } else {
                integer = 0;
            }
            boolean zHasPermanentMenuKey = ViewConfiguration.get(activity).hasPermanentMenuKey();
            boolean zDeviceHasKey = KeyCharacterMap.deviceHasKey(4);
            boolean zDeviceHasKey2 = KeyCharacterMap.deviceHasKey(3);
            if (!zHasPermanentMenuKey) {
                if (zDeviceHasKey && zDeviceHasKey2) {
                    return "backpress_real_icon";
                }
                if (integer < 2) {
                    View decorView = activity.getWindow().getDecorView();
                    if (decorView == null) {
                        height = 0;
                    } else {
                        int[] iArr = new int[2];
                        decorView.getLocationOnScreen(iArr);
                        height = decorView.getHeight() + iArr[1];
                    }
                    View viewFindViewById = decorView.findViewById(R.id.content);
                    if (viewFindViewById == null) {
                        height2 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        viewFindViewById.getLocationOnScreen(iArr2);
                        height2 = viewFindViewById.getHeight() + iArr2[1];
                    }
                    if (height != height2) {
                        return "backpress_virtual_icon";
                    }
                    return "backpress_virtual_gesture";
                }
                return "backpress_virtual_gesture";
            }
            return "backpress_real_icon";
        }
        return "backpress_virtual_gesture";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String LIZ(Activity activity, String str) {
        String str2 = (String) ((LinkedHashMap) LIZIZ).get(str);
        switch (str.hashCode()) {
            case 896693702:
                str.equals("shoot_2_main");
                break;
            case 1378457662:
                if (str.equals("live_2_feed") && TextUtils.isEmpty(str2)) {
                    return "click_back";
                }
                break;
            case 1737023713:
                if (str.equals("profile_2_feed") && TextUtils.isEmpty(str2)) {
                    return "slide_back";
                }
                break;
            case 1805271917:
                if (str.equals("setting_2_profile") && TextUtils.isEmpty(str2)) {
                    return LIZIZ(activity);
                }
                break;
        }
        LJ(str, "");
        return str2;
    }

    public static final void LIZJ(C19EG c19eg, String str) {
        if (c19eg != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_method", LIZIZ(c19eg));
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LIZJ(0, "is_quite");
            C20684815ws.LJIILLIIL("click_back_quit", c2344009Gk.LIZ);
        }
    }

    public static final void LJ(String str, String str2) {
        LIZIZ.put(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f A[PHI: r1
      0x002f: PHI (r1v10 java.lang.String) = (r1v5 java.lang.String), (r1v11 java.lang.String) binds: [B:16:0x002d, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[PHI: r1
      0x0079: PHI (r1v12 java.lang.String) = (r1v3 java.lang.String), (r1v13 java.lang.String) binds: [B:9:0x001a, B:7:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.String r5, java.lang.String r6, java.lang.String r7, com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            X.09Gk r3 = new X.09Gk
            r3.<init>()
            java.lang.String r0 = "enter_personal_homepage"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L50
            X.1D0F r4 = X.C1D0F.LIZ
            java.lang.String r2 = ""
            if (r4 == 0) goto L19
            java.lang.String r1 = r4.LIZ()
            if (r1 != 0) goto L79
        L19:
            r1 = r2
            if (r4 != 0) goto L79
            r0 = 0
        L1d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.LJ(r0, r1)
            if (r4 == 0) goto L2c
            java.lang.String r1 = r4.LIZIZ()
            if (r1 != 0) goto L2f
        L2c:
            r1 = r2
            if (r4 == 0) goto L36
        L2f:
            java.lang.String r0 = r4.LIZJ()
            if (r0 == 0) goto L36
            r2 = r0
        L36:
            r3.LJIIIIZZ(r1, r2)
            X.10Tv r0 = X.C19252910Tv.LIZIZ
            X.0sAf r0 = r0.LIZLLL()
            X.0Wdk r0 = r0.LJIIJ()
            int r0 = r0.LIZ()
            r1 = 1
            if (r0 != r1) goto L4b
            r1 = 3
        L4b:
            java.lang.String r0 = "pad_interface_orientation"
            r3.LIZJ(r1, r0)
        L50:
            java.lang.String r0 = "enter_method"
            r3.LJIIIIZZ(r0, r7)
            java.lang.String r0 = "enter_from"
            r3.LJIIIIZZ(r0, r6)
            r2 = 0
            if (r8 == 0) goto L77
            java.lang.String r1 = r8.getGroupId()
        L61:
            java.lang.String r0 = "group_id"
            r3.LJIIIIZZ(r0, r1)
            if (r8 == 0) goto L6c
            java.lang.String r2 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r8)
        L6c:
            java.lang.String r0 = "author_id"
            r3.LJFF(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.LIZ
            X.C20684815ws.LJIILLIIL(r5, r0)
            return
        L77:
            r1 = r2
            goto L61
        L79:
            boolean r0 = r4.isConnected()
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1590810rV1.LIZLLL(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
