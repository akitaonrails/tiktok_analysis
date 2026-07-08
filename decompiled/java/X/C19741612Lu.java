package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;

/* JADX INFO: renamed from: X.12Lu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19741612Lu {
    public static final HashMap<String, InterfaceC19741212Lq> LIZ;

    static {
        HashMap<String, InterfaceC19741212Lq> map = new HashMap<>();
        LIZ = map;
        C19741112Lp.LIZ.getClass();
        map.put("android.permission.ACCEPT_HANDOVER", new InterfaceC19741212Lq() { // from class: X.12Lv
            @Override // X.InterfaceC19741212Lq
            public final String LIZIZ() {
                return "android.permission.ACCEPT_HANDOVER";
            }

            @Override // X.InterfaceC19741212Lq
            public final Intent LIZJ(Context context) {
                return null;
            }

            @Override // X.InterfaceC19741212Lq
            public final boolean LIZ(Activity activity) {
                C19741112Lp.LIZ.getClass();
                if (Build.VERSION.SDK_INT < 28) {
                    return false;
                }
                return C19741812Lw.LIZ(this, activity);
            }

            @Override // X.InterfaceC19741212Lq
            public final boolean LIZLLL(Activity activity) {
                C19741112Lp.LIZ.getClass();
                if (Build.VERSION.SDK_INT >= 28 && C838410Wul.LIZ(activity, "android.permission.ACCEPT_HANDOVER") == 0) {
                    return true;
                }
                return false;
            }
        });
        map.put("android.permission.ACCESS_NOTIFICATION_POLICY", new InterfaceC19741212Lq() { // from class: X.12Lt
            @Override // X.InterfaceC19741212Lq
            public final String LIZIZ() {
                return "android.permission.ACCESS_NOTIFICATION_POLICY";
            }

            @Override // X.InterfaceC19741212Lq
            public final boolean LIZ(Activity activity) {
                return C19741812Lw.LIZ(this, activity);
            }

            @Override // X.InterfaceC19741212Lq
            public final Intent LIZJ(Context context) {
                C19741112Lp.LIZ.getClass();
                if (Build.VERSION.SDK_INT >= 26) {
                    Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                    if (C19741112Lp.LIZIZ(context, intent)) {
                        return intent;
                    }
                }
                return C19741112Lp.LIZJ(context);
            }

            @Override // X.InterfaceC19741212Lq
            public final boolean LIZLLL(Activity activity) {
                C19741112Lp.LIZ.getClass();
                return C19741112Lp.LJ(activity);
            }
        });
        map.put("android.permission.MANAGE_EXTERNAL_STORAGE", new InterfaceC19741212Lq() { // from class: X.12Lr
            @Override // X.InterfaceC19741212Lq
            public final String LIZIZ() {
                return "android.permission.MANAGE_EXTERNAL_STORAGE";
            }

            @Override // X.InterfaceC19741212Lq
            public final boolean LIZ(Activity activity) {
                return C19741812Lw.LIZ(this, activity);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
            @Override // X.InterfaceC19741212Lq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.content.Intent LIZJ(android.content.Context r5) {
                /*
                    r4 = this;
                    X.12Lp r0 = X.C19741112Lp.LIZ
                    r0.getClass()
                    int r3 = android.os.Build.VERSION.SDK_INT
                    r1 = 30
                    if (r3 >= r1) goto L11
                    r0 = 0
                    r2 = 0
                    if (r0 == 0) goto L3d
                    if (r3 < r1) goto L39
                L11:
                    android.content.Intent r2 = new android.content.Intent
                    java.lang.String r0 = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION"
                    r2.<init>(r0)
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "package:"
                    r1.append(r0)
                    java.lang.String r0 = r5.getPackageName()
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
                    r2.setData(r0)
                    boolean r0 = X.C19741112Lp.LIZIZ(r5, r2)
                    if (r0 != 0) goto L3d
                L39:
                    android.content.Intent r2 = X.C19741112Lp.LIZJ(r5)
                L3d:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19741312Lr.LIZJ(android.content.Context):android.content.Intent");
            }

            @Override // X.InterfaceC19741212Lq
            public final boolean LIZLLL(Activity activity) {
                C19741112Lp.LIZ.getClass();
                return C19741112Lp.LJFF(activity);
            }
        });
        map.put("android.permission.SYSTEM_ALERT_WINDOW", new InterfaceC19741212Lq() { // from class: X.12Ls
            @Override // X.InterfaceC19741212Lq
            public final String LIZIZ() {
                return "android.permission.SYSTEM_ALERT_WINDOW";
            }

            @Override // X.InterfaceC19741212Lq
            public final boolean LIZ(Activity activity) {
                return C19741812Lw.LIZ(this, activity);
            }

            @Override // X.InterfaceC19741212Lq
            public final Intent LIZJ(Context context) {
                C19741112Lp.LIZ.getClass();
                Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                if (Build.VERSION.SDK_INT < 30) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("package:");
                    sbLIZ.append(context.getPackageName());
                    intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                }
                if (!C19741112Lp.LIZIZ(context, intent)) {
                    return C19741112Lp.LIZJ(context);
                }
                return intent;
            }

            @Override // X.InterfaceC19741212Lq
            public final boolean LIZLLL(Activity activity) {
                C19741112Lp.LIZ.getClass();
                return Settings.canDrawOverlays(activity);
            }
        });
    }
}
