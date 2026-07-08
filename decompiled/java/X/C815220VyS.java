package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815220VyS {
    public static volatile AbstractC815200VyQ<?> LIZ;
    public static volatile List<AbstractC815400Vyk> LIZIZ;

    public static List<AbstractC815400Vyk> LIZIZ(Context context) {
        Bundle bundle;
        String string;
        if (LIZIZ == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator it2 = C2204961BRm.LJJJJZ(packageManager, intent, 128, new C0WZX("dTF6Tg0zW9KSVlgzQFyHafvE/Tf/OXlRN8+KfDZUSs5MZuZ8vOkCPx7NmMXiDA==", new String[]{"01789"})).iterator();
            while (it2.hasNext()) {
                ActivityInfo activityInfo = ((ResolveInfo) it2.next()).activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((AbstractC815400Vyk) Class.forName(string, false, C815220VyS.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            if (LIZIZ == null) {
                LIZIZ = arrayList;
            }
        }
        return LIZIZ;
    }

    public static AbstractC815200VyQ<?> LIZJ(Context context) {
        if (LIZ == null) {
            try {
                LIZ = (AbstractC815200VyQ) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C815220VyS.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (LIZ == null) {
                LIZ = new AbstractC815200VyQ<Void>() { // from class: X.0VyR
                    @Override // X.AbstractC815200VyQ
                    public final /* bridge */ /* synthetic */ void LIZ() {
                    }

                    @Override // X.AbstractC815200VyQ
                    public final /* bridge */ /* synthetic */ void LIZIZ() {
                    }
                };
            }
        }
        return LIZ;
    }

    public static boolean LJ(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        if (C838410Wul.LIZ(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        Iterator<ResolveInfo> it2 = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
        while (it2.hasNext()) {
            String str = it2.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZ(Context context, C815230VyT c815230VyT) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompatLJ;
        IconCompat iconCompat = c815230VyT.LJII;
        if (iconCompat == null) {
            return false;
        }
        int i = iconCompat.LIZ;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream inputStreamLJIIIZ = iconCompat.LJIIIZ(context);
        if (inputStreamLJIIIZ == null || (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamLJIIIZ)) == null) {
            return false;
        }
        if (i == 6) {
            iconCompatLJ = IconCompat.LIZLLL(bitmapDecodeStream);
        } else {
            iconCompatLJ = IconCompat.LJ(bitmapDecodeStream);
        }
        c815230VyT.LJII = iconCompatLJ;
        return true;
    }

    public static List LIZLLL(int i, Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            return C815230VyT.LIZ(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i));
        }
        if (i2 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            ArrayList arrayList = new ArrayList();
            if ((i & 1) != 0) {
                arrayList.addAll(shortcutManager.getManifestShortcuts());
            }
            if ((i & 2) != 0) {
                arrayList.addAll(shortcutManager.getDynamicShortcuts());
            }
            if ((i & 4) != 0) {
                arrayList.addAll(shortcutManager.getPinnedShortcuts());
            }
            return C815230VyT.LIZ(context, arrayList);
        }
        if ((i & 2) != 0) {
            try {
                LIZJ(context).getClass();
                return new ArrayList();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Collections.emptyList();
    }

    public static void LJFF(Context context, List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        LIZJ(context).LIZIZ();
        Iterator<AbstractC815400Vyk> it2 = LIZIZ(context).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
    }

    public static void LJI(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        }
        for (AbstractC815400Vyk abstractC815400Vyk : LIZIZ(context)) {
            Collections.singletonList(str);
            abstractC815400Vyk.getClass();
        }
    }

    public static boolean LJII(Context context, C815230VyT c815230VyT, IntentSender intentSender) throws Throwable {
        String str;
        String str2;
        Handler handler;
        Bitmap bitmapLIZJ;
        Context context2 = context;
        int i = Build.VERSION.SDK_INT;
        if (i <= 32) {
            c815230VyT.getClass();
            if (i < 26) {
                if (!LJ(context2)) {
                    return false;
                }
                Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                Intent[] intentArr = c815230VyT.LIZJ;
                intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", c815230VyT.LJ.toString());
                IconCompat iconCompat = c815230VyT.LJII;
                if (iconCompat != null) {
                    Context context3 = c815230VyT.LIZ;
                    iconCompat.LIZ(context3);
                    int i2 = iconCompat.LIZ;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 5) {
                                bitmapLIZJ = IconCompat.LIZJ((Bitmap) iconCompat.LIZIZ, true);
                            } else {
                                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                            }
                        } else {
                            try {
                                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(C786410Ut5.m4(context3, 0, iconCompat.LJII()), iconCompat.LJ));
                            } catch (PackageManager.NameNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Can't find package ");
                                sbLIZ.append(iconCompat.LIZIZ);
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
                            }
                        }
                    } else {
                        bitmapLIZJ = (Bitmap) iconCompat.LIZIZ;
                    }
                    intent.putExtra("android.intent.extra.shortcut.ICON", bitmapLIZJ);
                }
                if (intentSender == null) {
                    C2204961BRm.LJJJJI(context2, intent, new C0WZX("dTF6Tg0zW9KSVlgzQFyHafvE/Tf/OXlRN8+KfDZUSs5MZuZ8vOkCPx7NmMXiDA==", new String[]{"01789"}));
                    return true;
                }
                BroadcastReceiver c521490Kcl = new C521490Kcl(intentSender, 3);
                C0WZX c0wzx = new C0WZX("dTF6Tg0zW9KSVlgzQFyHafvE/Tf/OXlRN8+KfDZUSs5MZuZ8vOkCPx7NmMXiDA==", new String[]{"01789"});
                C0WST c0wst = new C0WST();
                Bundle bundle = null;
                int iIntValue = -1;
                Object[] objArr = {intent, null, c521490Kcl, null, -1, null, null};
                C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;Ljava/lang/String;Landroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11077, "android/content/Context", "sendOrderedBroadcast", context2, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(11077, "android/content/Context", "sendOrderedBroadcast", null, objArr, context2, c0wzw, false);
                    return true;
                }
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                if (objArr2 != null) {
                    Object obj = objArr2[0];
                    if (obj != null) {
                        context2 = (Context) obj;
                    }
                    Object obj2 = objArr2[1];
                    if (obj2 != null) {
                        intent = (Intent) obj2;
                    }
                    Object obj3 = objArr2[2];
                    if (obj3 != null) {
                        str2 = (String) obj3;
                    } else {
                        str2 = null;
                    }
                    Object obj4 = objArr2[3];
                    if (obj4 != null) {
                        c521490Kcl = (BroadcastReceiver) obj4;
                    }
                    Object obj5 = objArr2[4];
                    if (obj5 != null) {
                        handler = (Handler) obj5;
                    } else {
                        handler = null;
                    }
                    Object obj6 = objArr2[5];
                    if (obj6 != null) {
                        iIntValue = ((Integer) obj6).intValue();
                    }
                    Object[] objArr3 = c0wsuLIZIZ.LIZJ;
                    Object obj7 = objArr3[6];
                    if (obj7 != null) {
                        str = (String) obj7;
                    } else {
                        str = null;
                    }
                    Object obj8 = objArr3[7];
                    if (obj8 != null) {
                        bundle = (Bundle) obj8;
                    }
                } else {
                    str = null;
                    str2 = null;
                    handler = null;
                }
                context2.sendOrderedBroadcast(intent, str2, c521490Kcl, handler, iIntValue, str, bundle);
                c0wst.LIZ(11077, "android/content/Context", "sendOrderedBroadcast", null, objArr, context2, c0wzw, true);
                return true;
            }
        }
        return ((ShortcutManager) context2.getSystemService(ShortcutManager.class)).requestPinShortcut(c815230VyT.LIZIZ(), intentSender);
    }
}
