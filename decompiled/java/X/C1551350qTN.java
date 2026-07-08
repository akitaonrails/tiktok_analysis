package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.meta.ChannelMetaDataItem;
import com.bytedance.geckox.policy.meta.ChannelMetaDataReportSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0qTN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551350qTN {
    public static final C1551350qTN LIZ = new C1551350qTN();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(180));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(181));

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL() {
        /*
            com.bytedance.geckox.AppSettingsManager r0 = X.C1957007lY.LIZ
            com.bytedance.geckox.policy.meta.ChannelMetaDataReportSettings r4 = r0.LJIIL
            if (r4 != 0) goto Lb
            com.bytedance.geckox.policy.meta.ChannelMetaDataReportSettings r4 = new com.bytedance.geckox.policy.meta.ChannelMetaDataReportSettings
            r4.<init>()
        Lb:
            boolean r0 = r4.getEnabled()
            r3 = 0
            if (r0 != 0) goto L13
            return r3
        L13:
            long r5 = java.lang.System.currentTimeMillis()
            X.0qUK r0 = X.C797990VSb.LIZ
            android.content.Context r0 = r0.LJ()
            if (r0 == 0) goto L35
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L38
            android.content.pm.PackageInfo r0 = X.C786410Ut5.Y3(r1, r0, r3)     // Catch: java.lang.Throwable -> L38
            long r0 = r0.firstInstallTime     // Catch: java.lang.Throwable -> L38
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L38
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L38
            goto L44
        L35:
            r0 = 0
            goto L53
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L44:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L4b
            r1 = 0
        L4b:
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L35
            long r0 = r1.longValue()
        L53:
            long r5 = r5 - r0
            int r0 = r4.getNewUserThreshold()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            long r0 = (long) r0
            long r1 = r2.toMillis(r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L64
            return r3
        L64:
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r0 = 100
            int r1 = r1.nextInt(r0)
            int r0 = r4.getSampling()
            if (r1 >= r0) goto L76
            r3 = 1
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1551350qTN.LIZLLL():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[Catch: all -> 0x0138, TryCatch #0 {all -> 0x0138, blocks: (B:3:0x000b, B:5:0x0012, B:7:0x0015, B:8:0x001a, B:10:0x0020, B:12:0x0030, B:14:0x003b, B:16:0x0046, B:18:0x0049, B:19:0x004e, B:21:0x0054, B:23:0x0064, B:25:0x006a, B:27:0x0074, B:29:0x007f, B:30:0x0094, B:32:0x009a, B:34:0x00a5, B:36:0x00ab, B:38:0x00b1, B:50:0x0100, B:40:0x00b7, B:42:0x00bf, B:43:0x00c7, B:45:0x00d1, B:47:0x00dd, B:49:0x00e8, B:51:0x010d, B:53:0x0119, B:55:0x0122, B:57:0x012a, B:58:0x0132), top: B:63:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF() {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1551350qTN.LJFF():void");
    }

    public static ChannelMetaDataItem LIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = (ChannelMetaDataItem) C1551400qTS.LIZIZ.LIZ.LJII(str, ChannelMetaDataItem.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (ChannelMetaDataItem) c098200Yq;
    }

    public static SharedPreferences LIZIZ(String str) {
        C01GW c01gw = LIZJ;
        if (c01gw.getValue() == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gecko_resource_info-");
        sbLIZ.append((String) c01gw.getValue());
        sbLIZ.append('-');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gw2 = LIZIZ;
        if (!((Set) c01gw2.getValue()).contains(strLIZIZ)) {
            ((Set) c01gw2.getValue()).add(strLIZIZ);
            Context contextLJ = C797990VSb.LIZ.LJ();
            if (contextLJ != null) {
                C1551420qTU c1551420qTU = C1551440qTW.LIZ;
                LIZ.getClass();
                c1551420qTU.LIZLLL(contextLJ, "gecko_kv_list", (Set) c01gw2.getValue());
            }
        }
        Context contextLJ2 = C797990VSb.LIZ.LJ();
        if (contextLJ2 == null) {
            return null;
        }
        return C810670Vr7.LIZJ(contextLJ2, 0, strLIZIZ);
    }

    public static boolean LIZJ(String str) {
        ChannelMetaDataReportSettings channelMetaDataReportSettings = C1957007lY.LIZ.LJIIL;
        if (channelMetaDataReportSettings == null) {
            channelMetaDataReportSettings = new ChannelMetaDataReportSettings();
        }
        List<String> excludeAks = channelMetaDataReportSettings.getExcludeAks();
        if (excludeAks != null) {
            return excludeAks.contains(str);
        }
        return false;
    }

    public static void LJ(UpdatePackage updatePackage) {
        ChannelMetaDataItem channelMetaDataItemLIZ;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        String accessKey = updatePackage.getAccessKey();
        String channel = updatePackage.getChannel();
        boolean zLIZJ = LIZJ(accessKey);
        SharedPreferences sharedPreferencesLIZIZ = LIZIZ(accessKey);
        if (sharedPreferencesLIZIZ != null) {
            LIZ.getClass();
            String string = sharedPreferencesLIZIZ.getString(channel, null);
            if (string != null && (channelMetaDataItemLIZ = LIZ(string)) != null) {
                if (zLIZJ) {
                    SharedPreferences sharedPreferencesLIZIZ2 = LIZIZ(accessKey);
                    if (sharedPreferencesLIZIZ2 != null && (editorEdit = sharedPreferencesLIZIZ2.edit()) != null && (editorRemove = editorEdit.remove(channel)) != null) {
                        editorRemove.apply();
                        return;
                    }
                    return;
                }
                channelMetaDataItemLIZ.setLatestVersion(updatePackage.getVersion());
                SharedPreferences sharedPreferencesLIZIZ3 = LIZIZ(accessKey);
                if (sharedPreferencesLIZIZ3 == null) {
                    return;
                }
                LIZ.getClass();
                LJI(sharedPreferencesLIZIZ3, channel, channelMetaDataItemLIZ);
                return;
            }
        }
        if (zLIZJ) {
            return;
        }
        ChannelMetaDataItem channelMetaDataItem = new ChannelMetaDataItem(updatePackage.getVersion(), false, System.currentTimeMillis(), 0L, null, 0L, false);
        SharedPreferences sharedPreferencesLIZIZ4 = LIZIZ(accessKey);
        if (sharedPreferencesLIZIZ4 == null) {
            return;
        }
        LIZ.getClass();
        LJI(sharedPreferencesLIZIZ4, channel, channelMetaDataItem);
    }

    public static void LJI(SharedPreferences sharedPreferences, String str, ChannelMetaDataItem channelMetaDataItem) {
        Object c098200Yq;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        try {
            c098200Yq = C1551400qTS.LIZIZ.LIZ.LJIILL(channelMetaDataItem);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString(str, str2)) != null) {
            editorPutString.apply();
        }
    }
}
