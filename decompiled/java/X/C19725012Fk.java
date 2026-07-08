package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastByteProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.mt.protector.impl.string2number.CastShortProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.12Fk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19725012Fk implements InterfaceC19725812Fs {
    public final Context LL;
    public final String LLILLJJLI;
    public final Class<? extends Activity> LLILLL;
    public C19725712Fr LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC19725812Fs
    public final boolean open(String str) {
        return LIZJ(null, str);
    }

    public static void LIZIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPindovLznygoQ8mlUMlTCAZgFmuAg==", null));
    }

    @Override // X.InterfaceC19725812Fs
    public final boolean LIZ(Activity activity, String str) {
        return LIZJ(activity, str);
    }

    public final boolean LIZJ(Activity activity, String str) throws Throwable {
        Context context;
        Intent intent;
        C19725712Fr c19725712Fr;
        int i;
        int i2;
        int i3;
        int i4;
        if (activity != null) {
            context = activity;
        } else {
            context = this.LL;
        }
        boolean z = false;
        if (context == null) {
            return false;
        }
        if (this.LLILZIL) {
            if (!SmartRouter.canOpen(str)) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        str = "empty url";
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("service", "in_app_router_no_matched");
                    jSONObject.put("open_url", str);
                    C793770VBv.LJ("common_log", jSONObject);
                    return false;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }
            if (this.LLILZ == null) {
                SmartRouter.buildRoute(context, str).open();
            } else {
                Intent intentBuildIntent = SmartRouter.buildRoute(context, str).buildIntent();
                if (intentBuildIntent == null) {
                    return false;
                }
                int i5 = this.LLILZ.LIZLLL;
                intentBuildIntent.addFlags(0);
                if (activity == null) {
                    intentBuildIntent.addFlags(268435456);
                }
                if (i5 == 0) {
                    LIZIZ(context, intentBuildIntent);
                } else if (1 == i5) {
                    if (activity != null) {
                        int i6 = this.LLILZ.LIZJ;
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentBuildIntent, "Activity_startActivityForResult_2");
                        C1701330uNH.LIZ(intentBuildIntent, activity);
                        C2204961BRm.LJIIZILJ(i6, activity, intentBuildIntent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPindovLznygoQ8mlUMlTCAZgFmuAg==", null));
                        C19725712Fr c19725712Fr2 = this.LLILZ;
                        i3 = c19725712Fr2.LIZ;
                        if (i3 != -1 && (i4 = c19725712Fr2.LIZIZ) != -1) {
                            C786410Ut5.ae(i3, activity, i4);
                            return true;
                        }
                    }
                }
                if (activity != null) {
                    C19725712Fr c19725712Fr22 = this.LLILZ;
                    i3 = c19725712Fr22.LIZ;
                    if (i3 != -1) {
                        C786410Ut5.ae(i3, activity, i4);
                        return true;
                    }
                }
            }
            return true;
        }
        if (!TextUtils.isEmpty(null)) {
            intent = new Intent();
            intent.setClassName(context, (String) null);
        } else {
            intent = new Intent(context, this.LLILLL);
        }
        List<String> listLIZ = C018G.LIZ(this.LLILLJJLI);
        List<String> listLIZ2 = C018G.LIZ(str);
        int size = listLIZ.size();
        for (int i7 = 1; i7 < size; i7++) {
            if (i7 < size) {
                intent.putExtra(((String) ListProtector.get(listLIZ, i7)).substring(1), (String) ListProtector.get(listLIZ2, i7));
            }
        }
        for (String str2 : ((HashMap) C018G.LIZJ(str)).keySet()) {
            String strLIZIZ = C018G.LIZIZ(str, str2);
            C686160Qvm c686160Qvm = C19724912Fj.LIZLLL().LIZ;
            if (c686160Qvm != null) {
                if (C686160Qvm.LIZ(str2, c686160Qvm.LIZ)) {
                    intent.putExtra(str2, CastIntegerProtector.parseInt(strLIZIZ));
                } else if (C686160Qvm.LIZ(str2, c686160Qvm.LIZIZ)) {
                    intent.putExtra(str2, CastLongProtector.parseLong(strLIZIZ));
                } else if (C686160Qvm.LIZ(str2, null)) {
                    intent.putExtra(str2, Boolean.parseBoolean(strLIZIZ));
                } else if (C686160Qvm.LIZ(str2, null)) {
                    intent.putExtra(str2, CastShortProtector.parseShort(strLIZIZ));
                } else if (C686160Qvm.LIZ(str2, null)) {
                    intent.putExtra(str2, CastFloatProtector.parseFloat(strLIZIZ));
                } else if (C686160Qvm.LIZ(str2, null)) {
                    intent.putExtra(str2, CastDoubleProtector.parseDouble(strLIZIZ));
                } else if (C686160Qvm.LIZ(str2, null)) {
                    intent.putExtra(str2, CastByteProtector.parseByte(strLIZIZ));
                } else if (C686160Qvm.LIZ(str2, null)) {
                    intent.putExtra(str2, strLIZIZ.charAt(0));
                } else {
                    C686160Qvm.LIZ(str2, c686160Qvm.LIZJ);
                    intent.putExtra(str2, strLIZIZ);
                }
            }
        }
        C686160Qvm c686160Qvm2 = C19724912Fj.LIZLLL().LIZ;
        ArrayList<String> arrayList = c686160Qvm2.LIZ;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList.clear();
        }
        ArrayList<String> arrayList2 = c686160Qvm2.LIZIZ;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            arrayList2.clear();
        }
        if (activity == null) {
            intent.addFlags(268435456);
        }
        C19725712Fr c19725712Fr3 = this.LLILZ;
        if (c19725712Fr3 == null) {
            LIZIZ(context, intent);
            return true;
        }
        int i8 = c19725712Fr3.LIZLLL;
        intent.addFlags(0);
        if (i8 == 0) {
            LIZIZ(context, intent);
        } else {
            if (1 != i8) {
                if (activity != null && (i = (c19725712Fr = this.LLILZ).LIZ) != -1 && (i2 = c19725712Fr.LIZIZ) != -1) {
                    C786410Ut5.ae(i, activity, i2);
                }
            } else if (activity != null) {
                int i9 = this.LLILZ.LIZJ;
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
                C1701330uNH.LIZ(intent, activity);
                C2204961BRm.LJIIZILJ(i9, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPindovLznygoQ8mlUMlTCAZgFmuAg==", null));
            }
            return z;
        }
        z = true;
        if (activity != null) {
            C786410Ut5.ae(i, activity, i2);
        }
        return z;
    }

    public C19725012Fk(Context context, Class cls, String str) {
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = cls;
    }
}
