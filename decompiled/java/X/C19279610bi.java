package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10bi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19279610bi {
    public static final C19279610bi LIZ = new C19279610bi();
    public static final HashMap<String, Boolean> LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c9  */
    static {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19279610bi.<clinit>():void");
    }

    public static boolean LIZ(PushItem pushItem) {
        boolean zLIZIZ = LIZIZ(pushItem.itemId);
        if ((pushItem.clientControlFlags & 2) != 0) {
            if (zLIZIZ && ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isPhoneBinded()) {
                return true;
            }
            return false;
        }
        return zLIZIZ;
    }

    public static boolean LIZIZ(String str) {
        HashMap<String, Boolean> map = LIZIZ;
        if (map.containsKey(str)) {
            return Intrinsics.LJFF(map.get(str), Boolean.TRUE);
        }
        return true;
    }

    public static void LIZJ(String str, boolean z) {
        String curUserId;
        String str2 = "on";
        if (TextUtils.equals(str, "live_inner_push")) {
            if (!z) {
                str2 = "off";
            }
            HashMap map = new HashMap();
            map.put("to_status", str2);
            C20684815ws.LJIILLIIL("live_inner_push_setting", map);
        } else if (TextUtils.equals(str, "im_inner_push")) {
            if (!z) {
                str2 = "off";
            }
            HashMap map2 = new HashMap();
            map2.put("to_status", str2);
            C20684815ws.LJIILLIIL("inner_push_setting", map2);
        } else if (TextUtils.equals(str, "im_push_preview_v2")) {
            if (!z) {
                str2 = "off";
            }
            HashMap map3 = new HashMap();
            map3.put("to_status", str2);
            C20684815ws.LJIILLIIL("inner_push_setting", map3);
        } else if (!TextUtils.equals(str, "friends_only_push") && TextUtils.equals(str, "im_push")) {
            if (!z) {
                str2 = "off";
            }
            HashMap map4 = new HashMap();
            map4.put("to_status", str2);
            C20684815ws.LJIILLIIL("inner_push_setting", map4);
            if (!C1866720yg2.LIZ()) {
                boolean z2 = !z;
                AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
                if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ() == null) {
                    curUserId = "-1";
                } else {
                    curUserId = accountUserServiceLJIIJ.getCurUserId();
                }
                curUserId.toString();
                long j = CastLongProtector.parseLong(curUserId);
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("imbase_");
                sbLIZ.append(j);
                SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(contextLIZ, 0, C2188811AlT.LIZIZ(sbLIZ));
                if (z2) {
                    sharedPreferencesLIZJ.edit().putBoolean("key_mt_inner_push_switch_on", false).commit();
                } else {
                    sharedPreferencesLIZJ.edit().putBoolean("key_mt_inner_push_switch_on", true).commit();
                }
            }
        }
        if (Intrinsics.LJFF(str, "in_app_active_status_push") && z) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C897370ZIh.LIZ().LJIIIZ(EnumC898380ZMe.ACTIVITY_STATUS_PUSH_SETTING_CHANGED);
        }
    }
}
