package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0W7D, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W7D implements C0W7G {
    public static final Map<String, C0W7G> LIZIZ;
    public C0W7G LIZ;

    static {
        HashMap map = new HashMap();
        LIZIZ = map;
        map.put("VIVO", new C0W7E() { // from class: X.0W7H
            @Override // X.C0W7E, X.C0W7G
            public final boolean LIZIZ() {
                return false;
            }
        });
        map.put("MEIZU", new C0W7E() { // from class: X.0W7F
            @Override // X.C0W7E, X.C0W7G
            public final Intent LIZ(Context context) {
                Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.putExtra("packageName", context.getPackageName());
                return intent;
            }
        });
        map.put("HUAWEI", new C0W7E() { // from class: X.0W7C
            @Override // X.C0W7E, X.C0W7G
            public final boolean LIZIZ() {
                return this instanceof C0W7F;
            }

            @Override // X.C0W7E, X.C0W7G
            public final Intent LIZ(Context context) {
                Intent intent = new Intent();
                intent.putExtra("packageName", context.getPackageName());
                intent.setComponent(new ComponentName("com.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
                return intent;
            }
        });
        map.put("XIAOMI", new C0W7E() { // from class: X.0W7B
            @Override // X.C0W7E, X.C0W7G
            public final boolean LIZIZ() {
                return this instanceof C0W7F;
            }

            @Override // X.C0W7E, X.C0W7G
            public final Intent LIZ(Context context) {
                Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
                intent.putExtra("extra_pkgname", context.getPackageName());
                return intent;
            }
        });
        map.put("OPPO", new C0W7E() { // from class: X.0W7A
            @Override // X.C0W7E, X.C0W7G
            public final boolean LIZIZ() {
                if (Build.VERSION.SDK_INT == 23) {
                    return true;
                }
                return this instanceof C0W7F;
            }

            @Override // X.C0W7E, X.C0W7G
            public final Intent LIZ(Context context) {
                String string;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
                intent.putExtra("pkg_name", context.getPackageName());
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                int i = applicationInfo.labelRes;
                if (i == 0) {
                    string = applicationInfo.nonLocalizedLabel.toString();
                } else {
                    string = context.getString(i);
                }
                intent.putExtra("app_name", string);
                intent.putExtra("class_name", C0W7A.class.getSimpleName());
                return intent;
            }
        });
    }

    public final C0W7G LIZJ() {
        if (this.LIZ == null) {
            this.LIZ = new C0W7E();
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                String upperCase = str.toUpperCase();
                Map<String, C0W7G> map = LIZIZ;
                if (((HashMap) map).containsKey(upperCase)) {
                    this.LIZ = (C0W7G) ((HashMap) map).get(upperCase);
                }
            }
        }
        return this.LIZ;
    }

    @Override // X.C0W7G
    public final boolean LIZIZ() {
        return LIZJ().LIZIZ();
    }

    @Override // X.C0W7G
    public final Intent LIZ(Context context) {
        return LIZJ().LIZ(context);
    }
}
