package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815390Vyj extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C815390Vyj(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws Throwable {
        Context contextM4;
        Context context = this.LL;
        if (context != null) {
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "pref_name");
            if (!sharedPreferencesLIZJ.getBoolean("pref_short_cut", false)) {
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setFlags(2097152);
                intent.addFlags(1048576);
                intent.setPackage(packageName);
                List listLJJJJZ = C2204961BRm.LJJJJZ(packageManager, intent, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3a3yc6cYua47x8zyfa/eqINZU3QFEljw==", null));
                int size = listLJJJJZ.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    ResolveInfo resolveInfo = (ResolveInfo) ListProtector.get(listLJJJJZ, i);
                    if (Intrinsics.LJFF(resolveInfo.activityInfo.packageName, packageName)) {
                        String string = resolveInfo.loadLabel(packageManager).toString();
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        String str = activityInfo.name;
                        int i2 = activityInfo.applicationInfo.icon;
                        if (str != null) {
                            Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                            intent2.putExtra("android.intent.extra.shortcut.NAME", string);
                            intent2.putExtra("duplicate", false);
                            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent.setComponent(new ComponentName(packageName, str)));
                            if (Intrinsics.LJFF(context.getPackageName(), packageName)) {
                                contextM4 = context;
                            } else {
                                try {
                                    contextM4 = C786410Ut5.m4(context, 3, packageName);
                                    if (contextM4 != null) {
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                C2204961BRm.LJJJJI(context, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3a3yc6cYua47x8zyfa/eqINZU3QFEljw==", null));
                            }
                            intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextM4, i2));
                            C2204961BRm.LJJJJI(context, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3a3yc6cYua47x8zyfa/eqINZU3QFEljw==", null));
                        }
                    } else {
                        i++;
                    }
                }
                sharedPreferencesLIZJ.edit().putBoolean("pref_short_cut", true).apply();
            }
        }
        return Unit.LIZ;
    }
}
