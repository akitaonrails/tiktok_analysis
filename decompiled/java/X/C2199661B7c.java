package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.1B7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199661B7c {
    public static final String LIZ = C2199661B7c.class.getSimpleName();
    public static volatile SparseArray<Boolean> LIZIZ;
    public static volatile SparseArray<List<InterfaceC2199911B8b>> LIZJ;
    public static Pattern LIZLLL;
    public static Pattern LJ;
    public static Boolean LJFF;
    public static Boolean LJI;

    static {
        PatternProtector.compile(".*\\d+ *- *(\\d+) */ *\\d+");
        LIZIZ = new SparseArray<>();
        LIZJ = new SparseArray<>();
        LIZLLL = null;
        LJ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIL() {
        /*
            java.lang.Boolean r0 = X.C2199661B7c.LJI
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            android.content.Context r0 = X.C2199681B7e.LJFF()
            if (r0 != 0) goto L11
            r0 = 0
            return r0
        L11:
            android.content.Context r0 = X.C2199681B7e.LJFF()
            java.lang.String r2 = X.C2199671B7d.LJIIJ(r0)
            if (r2 == 0) goto L44
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            android.content.Context r0 = X.C2199681B7e.LJFF()
            java.lang.String r0 = r0.getPackageName()
            r1.append(r0)
            java.lang.String r0 = ":downloader"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L44
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            X.C2199661B7c.LJI = r0
        L3d:
            java.lang.Boolean r0 = X.C2199661B7c.LJI
            boolean r0 = r0.booleanValue()
            return r0
        L44:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.C2199661B7c.LJI = r0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199661B7c.LJIIL():boolean");
    }

    public static boolean LJIILJJIL() {
        Boolean bool = LJFF;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        if (C2199751B7l.LJFF.LJIIIIZZ("force_independent_process", 0) > 0) {
            Boolean bool2 = Boolean.FALSE;
            LJFF = bool2;
            return bool2.booleanValue();
        }
        if (C2199681B7e.LJFF() == null) {
            return true;
        }
        String strLJIIJ = C2199671B7d.LJIIJ(C2199681B7e.LJFF());
        if (strLJIIJ == null) {
            LJFF = Boolean.valueOf(z);
        } else if (strLJIIJ.contains(":")) {
            LJFF = Boolean.FALSE;
        } else {
            if (strLJIIJ.equals(C2199681B7e.LJFF().getPackageName())) {
                z = true;
            }
            LJFF = Boolean.valueOf(z);
        }
        return LJFF.booleanValue();
    }

    public static boolean LJIJ() {
        boolean z;
        if (LJIIL()) {
            return false;
        }
        Context context = C2199681B7e.LIZ;
        synchronized (C2199681B7e.class) {
            z = C2199681B7e.LJJII;
        }
        return z && C1B7E.LIZ(true).LIZLLL();
    }

    public static void LIZLLL(String str) {
        if (C1490830otl.LIZ() && C2199671B7d.LJIJJLI()) {
            String str2 = LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("This method:");
            sbLIZ.append(str);
            sbLIZ.append(" cannot be executed on the main thread");
            C1490830otl.LIZJ(str2, "checkWorkerThread", C2188811AlT.LIZIZ(sbLIZ));
            Context context = C2199681B7e.LIZ;
        }
    }

    public static C1B72 LJ(int i) {
        C1B72 c1b72 = C1B72.MAIN;
        C1B72 c1b722 = C1B72.SUB;
        if (i != c1b722.ordinal()) {
            c1b722 = C1B72.NOTIFICATION;
            if (i != c1b722.ordinal()) {
                return c1b72;
            }
        }
        return c1b722;
    }

    public static boolean LJIILL(Throwable th) {
        if (th == null) {
            return false;
        }
        if (C2199681B7e.LJIJJLI().LIZLLL(th) == 412) {
            return true;
        }
        String strLJIILLIIL = C2199671B7d.LJIILLIIL(th);
        if (TextUtils.isEmpty(strLJIILLIIL) || !strLJIILLIIL.contains("Precondition Failed")) {
            return false;
        }
        return true;
    }

    public static boolean LJIILLIIL(Throwable th) {
        if (th == null) {
            return false;
        }
        if (C2199681B7e.LJIJJLI().LIZLLL(th) == 416) {
            return true;
        }
        String strLJIILLIIL = C2199671B7d.LJIILLIIL(th);
        if (TextUtils.isEmpty(strLJIILLIIL) || !strLJIILLIIL.contains("Requested Range Not Satisfiable")) {
            return false;
        }
        return true;
    }

    public static long LJIJI(String str) {
        if (str == null) {
            return -1L;
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length >= 2) {
            try {
                return CastLongProtector.parseLong(strArrSplit[1]);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                String str2 = LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Exception:");
                sbLIZ.append(e);
                C1490830otl.LIZJ(str2, "parseContentRangeOfInstanceLength", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return -1L;
    }

    public static DownloadInfo LJIJJ(Cursor cursor) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        C1B83 c1b83 = new C1B83();
        try {
            int columnIndex = cursor.getColumnIndex("_id");
            if (columnIndex != -1) {
                c1b83.LJJL = cursor.getInt(columnIndex);
            }
            int columnIndex2 = cursor.getColumnIndex("name");
            if (columnIndex2 != -1) {
                c1b83.LIZ = cursor.getString(columnIndex2);
            }
            int columnIndex3 = cursor.getColumnIndex("title");
            if (columnIndex3 != -1) {
                c1b83.LIZIZ = cursor.getString(columnIndex3);
            }
            int columnIndex4 = cursor.getColumnIndex("url");
            if (columnIndex4 != -1) {
                c1b83.LIZJ = cursor.getString(columnIndex4);
            }
            int columnIndex5 = cursor.getColumnIndex("savePath");
            if (columnIndex5 != -1) {
                c1b83.LIZLLL = cursor.getString(columnIndex5);
            }
            int columnIndex6 = cursor.getColumnIndex("tempPath");
            if (columnIndex6 != -1) {
                c1b83.LJ = cursor.getString(columnIndex6);
            }
            int columnIndex7 = cursor.getColumnIndex("chunkCount");
            if (columnIndex7 != -1) {
                c1b83.LJJLI = cursor.getInt(columnIndex7);
            }
            int columnIndex8 = cursor.getColumnIndex(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            boolean z10 = false;
            if (columnIndex8 != -1) {
                c1b83.LJJLIIIIJ = cursor.getInt(columnIndex8);
            } else {
                c1b83.LJJLIIIIJ = 0;
            }
            int columnIndex9 = cursor.getColumnIndex("curBytes");
            if (columnIndex9 != -1) {
                c1b83.LJJLIIIJ = cursor.getLong(columnIndex9);
            } else {
                c1b83.LJJLIIIJ = 0L;
            }
            int columnIndex10 = cursor.getColumnIndex("totalBytes");
            if (columnIndex10 != -1) {
                c1b83.LJJLIIIJILLIZJL = cursor.getLong(columnIndex10);
            }
            int columnIndex11 = cursor.getColumnIndex("eTag");
            if (columnIndex11 != -1) {
                c1b83.LJJZ = cursor.getString(columnIndex11);
            }
            int columnIndex12 = cursor.getColumnIndex("onlyWifi");
            if (columnIndex12 != -1) {
                if (cursor.getInt(columnIndex12) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                c1b83.LJFF = z9;
            }
            int columnIndex13 = cursor.getColumnIndex("force");
            if (columnIndex13 != -1) {
                if (cursor.getInt(columnIndex13) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                c1b83.LJIILIIL = z8;
            }
            int columnIndex14 = cursor.getColumnIndex("retryCount");
            if (columnIndex14 != -1) {
                c1b83.LJIIJJI = cursor.getInt(columnIndex14);
            }
            int columnIndex15 = cursor.getColumnIndex("extra");
            if (columnIndex15 != -1) {
                c1b83.LJI = cursor.getString(columnIndex15);
            }
            int columnIndex16 = cursor.getColumnIndex("mimeType");
            if (columnIndex16 != -1) {
                c1b83.LJIJJ = cursor.getString(columnIndex16);
            }
            int columnIndex17 = cursor.getColumnIndex("notificationEnable");
            if (columnIndex17 != -1) {
                if (cursor.getInt(columnIndex17) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                c1b83.LJIJ = z7;
            }
            int columnIndex18 = cursor.getColumnIndex("notificationVisibility");
            if (columnIndex18 != -1) {
                c1b83.LJJLIIIJJI = cursor.getInt(columnIndex18);
            }
            int columnIndex19 = cursor.getColumnIndex("isFirstDownload");
            if (columnIndex19 != -1) {
                if (cursor.getInt(columnIndex19) == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                c1b83.LJJLIIIJJIZ = z6;
            }
            int columnIndex20 = cursor.getColumnIndex("isFirstSuccess");
            if (columnIndex20 != -1) {
                if (cursor.getInt(columnIndex20) == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c1b83.LJJLIIIJL = z5;
            }
            int columnIndex21 = cursor.getColumnIndex("needHttpsToHttpRetry");
            if (columnIndex21 != -1) {
                if (cursor.getInt(columnIndex21) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c1b83.LJIJJLI = z4;
            }
            int columnIndex22 = cursor.getColumnIndex("downloadTime");
            if (columnIndex22 != -1) {
                c1b83.LJJLIIIJLJLI = cursor.getLong(columnIndex22);
            }
            int columnIndex23 = cursor.getColumnIndex("packageName");
            if (columnIndex23 != -1) {
                c1b83.LJJIFFI = cursor.getString(columnIndex23);
            }
            int columnIndex24 = cursor.getColumnIndex("md5");
            if (columnIndex24 != -1) {
                c1b83.LJJII = cursor.getString(columnIndex24);
            }
            int columnIndex25 = cursor.getColumnIndex("retryDelay");
            if (columnIndex25 != -1) {
                if (cursor.getInt(columnIndex25) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1b83.LJJIIJ = z3;
            }
            int columnIndex26 = cursor.getColumnIndex("curRetryTime");
            if (columnIndex26 != -1) {
                c1b83.LJJLIIIJLLLLLLLZ = cursor.getInt(columnIndex26);
            }
            int columnIndex27 = cursor.getColumnIndex("retryDelayStatus");
            if (columnIndex27 != -1) {
                int i = cursor.getInt(columnIndex27);
                C1B7Y c1b7y = C1B7Y.DELAY_RETRY_WAITING;
                if (i == c1b7y.ordinal()) {
                    c1b83.LJJLIIJ = c1b7y;
                } else {
                    C1B7Y c1b7y2 = C1B7Y.DELAY_RETRY_DOWNLOADING;
                    if (i == c1b7y2.ordinal()) {
                        c1b83.LJJLIIJ = c1b7y2;
                    } else {
                        C1B7Y c1b7y3 = C1B7Y.DELAY_RETRY_DOWNLOADED;
                        if (i == c1b7y3.ordinal()) {
                            c1b83.LJJLIIJ = c1b7y3;
                        } else {
                            c1b83.LJJLIIJ = C1B7Y.DELAY_RETRY_NONE;
                        }
                    }
                }
            }
            int columnIndex28 = cursor.getColumnIndex("defaultHttpServiceBackUp");
            if (columnIndex28 != -1) {
                if (cursor.getInt(columnIndex28) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1b83.LJJI = z2;
            }
            int columnIndex29 = cursor.getColumnIndex("retryDelayTimeArray");
            if (columnIndex29 != -1) {
                c1b83.LJJIIJZLJL = cursor.getString(columnIndex29);
            }
            int columnIndex30 = cursor.getColumnIndex("backUpUrlsStr");
            if (columnIndex30 != -1) {
                c1b83.LJJLIL = cursor.getString(columnIndex30);
            }
            int columnIndex31 = cursor.getColumnIndex("backUpUrlRetryCount");
            if (columnIndex31 != -1) {
                c1b83.LJIIL = cursor.getInt(columnIndex31);
            }
            int columnIndex32 = cursor.getColumnIndex("realDownloadTime");
            if (columnIndex32 != -1) {
                c1b83.LJJLJ = cursor.getLong(columnIndex32);
            }
            int columnIndex33 = cursor.getColumnIndex("retryScheduleMinutes");
            if (columnIndex33 != -1) {
                c1b83.LJJLJLI = cursor.getInt(columnIndex33);
            }
            int columnIndex34 = cursor.getColumnIndex("independentProcess");
            if (columnIndex34 != -1) {
                if (cursor.getInt(columnIndex34) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                c1b83.LJJIIZI = z;
            }
            int columnIndex35 = cursor.getColumnIndex("auxiliaryJsonobjectString");
            if (columnIndex35 != -1) {
                c1b83.LJJLL = cursor.getString(columnIndex35);
            }
            int columnIndex36 = cursor.getColumnIndex("iconUrl");
            if (columnIndex36 != -1) {
                c1b83.LJJIJIL = cursor.getString(columnIndex36);
            }
            int columnIndex37 = cursor.getColumnIndex("appVersionCode");
            if (columnIndex37 != -1) {
                c1b83.LJJIJL = cursor.getInt(columnIndex37);
            }
            int columnIndex38 = cursor.getColumnIndex("taskId");
            if (columnIndex38 != -1) {
                c1b83.LJJZZI = cursor.getString(columnIndex38);
            }
            int columnIndex39 = cursor.getColumnIndex("downloadStartTimeStamp");
            if (columnIndex39 != -1) {
                c1b83.LJJZZIII = cursor.getLong(columnIndex39);
            }
            int columnIndex40 = cursor.getColumnIndex("downloadFinishTimeStamp");
            if (columnIndex40 != -1) {
                c1b83.LJL = cursor.getLong(columnIndex40);
            }
            int columnIndex41 = cursor.getColumnIndex("installedTimeStamp");
            if (columnIndex41 != -1) {
                c1b83.LJLI = cursor.getLong(columnIndex41);
            }
            int columnIndex42 = cursor.getColumnIndex("hasDoInstallation");
            if (columnIndex42 != -1) {
                if (cursor.getInt(columnIndex42) == 1) {
                    z10 = true;
                }
                c1b83.LJLIIIL = z10;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return c1b83.LIZ();
    }

    public static long LJIL(String str) {
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        Matcher matcher = PatternProtector.compile("max-age=([0-9]+)").matcher(str);
        if (matcher.find()) {
            try {
                j = CastLongProtector.parseLong(matcher.group(1));
                return j;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return j;
    }

    public static ContentValues LJJ(DownloadInfo downloadInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(downloadInfo.getRawId()));
        contentValues.put("url", downloadInfo.getUrl());
        contentValues.put("savePath", downloadInfo.getSavePath());
        contentValues.put("tempPath", downloadInfo.getRawTempPath());
        contentValues.put("name", downloadInfo.getName());
        contentValues.put("chunkCount", Integer.valueOf(downloadInfo.getChunkCount()));
        contentValues.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(downloadInfo.getStatus()));
        contentValues.put("curBytes", Long.valueOf(downloadInfo.getCurBytes()));
        contentValues.put("totalBytes", Long.valueOf(downloadInfo.getTotalBytes()));
        contentValues.put("eTag", downloadInfo.geteTag());
        contentValues.put("onlyWifi", Integer.valueOf(downloadInfo.isOnlyWifi() ? 1 : 0));
        contentValues.put("force", Integer.valueOf(downloadInfo.isForce() ? 1 : 0));
        contentValues.put("retryCount", Integer.valueOf(downloadInfo.getRetryCount()));
        contentValues.put("extra", downloadInfo.getExtra());
        contentValues.put("mimeType", downloadInfo.getMimeType());
        contentValues.put("title", downloadInfo.getRawTitle());
        contentValues.put("notificationEnable", Integer.valueOf(downloadInfo.isShowNotification() ? 1 : 0));
        contentValues.put("notificationVisibility", Integer.valueOf(downloadInfo.getNotificationVisibility()));
        contentValues.put("isFirstDownload", Integer.valueOf(downloadInfo.getIsFirstDownload() ? 1 : 0));
        contentValues.put("isFirstSuccess", Integer.valueOf(downloadInfo.isFirstSuccess() ? 1 : 0));
        contentValues.put("needHttpsToHttpRetry", Integer.valueOf(downloadInfo.isNeedHttpsToHttpRetry() ? 1 : 0));
        contentValues.put("downloadTime", Long.valueOf(downloadInfo.getDownloadTime()));
        contentValues.put("packageName", downloadInfo.getPackageName());
        contentValues.put("md5", downloadInfo.getMd5());
        contentValues.put("retryDelay", Integer.valueOf(downloadInfo.isNeedRetryDelay() ? 1 : 0));
        contentValues.put("curRetryTime", Integer.valueOf(downloadInfo.getCurRetryTime()));
        contentValues.put("retryDelayStatus", Integer.valueOf(downloadInfo.getRetryDelayStatus().ordinal()));
        contentValues.put("defaultHttpServiceBackUp", Integer.valueOf(downloadInfo.isNeedDefaultHttpServiceBackUp() ? 1 : 0));
        contentValues.put("chunkRunnableReuse", (Integer) 0);
        contentValues.put("retryDelayTimeArray", downloadInfo.getRetryDelayTimeArray());
        contentValues.put("chunkDowngradeRetry", (Integer) 0);
        contentValues.put("backUpUrlsStr", downloadInfo.getBackUpUrlsStr());
        contentValues.put("backUpUrlRetryCount", Integer.valueOf(downloadInfo.getBackUpUrlRetryCount()));
        contentValues.put("realDownloadTime", Long.valueOf(downloadInfo.getRawRealDownloadTime()));
        contentValues.put("retryScheduleMinutes", Long.valueOf(downloadInfo.getRetryScheduleMinutes()));
        contentValues.put("independentProcess", Integer.valueOf(downloadInfo.isNeedIndependentProcess() ? 1 : 0));
        contentValues.put("auxiliaryJsonobjectString", downloadInfo.getDBJsonDataString());
        contentValues.put("iconUrl", downloadInfo.getIconUrl());
        contentValues.put("appVersionCode", Integer.valueOf(downloadInfo.getAppVersionCode()));
        contentValues.put("taskId", downloadInfo.getTaskId());
        contentValues.put("downloadStartTimeStamp", Long.valueOf(downloadInfo.getDownloadStartTimeStamp()));
        contentValues.put("downloadFinishTimeStamp", Long.valueOf(downloadInfo.getDownloadFinishTimeStamp()));
        contentValues.put("installedTimeStamp", Long.valueOf(downloadInfo.getInstalledTimeStamp()));
        contentValues.put("hasDoInstallation", Integer.valueOf(downloadInfo.isHasDoInstallation() ? 1 : 0));
        return contentValues;
    }

    public static void LIZIZ(DownloadInfo downloadInfo, List list) {
        if (downloadInfo.isAddTTNetCommonParam()) {
            ((ArrayList) list).add(new HttpHeader("extra_ttnet_common_param", "true"));
        }
        if (C2199751B7l.LJFF.LJIIIIZZ("enable_download_network_tag", 0) > 0) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.add(new HttpHeader("x-ttnet-req-biz-id", "dl"));
            arrayList.add(new HttpHeader("x-ttnet-req-biz-ver", "1.3.8.36.8.lite-tiktok"));
        }
    }

    public static void LIZJ(DownloadInfo downloadInfo, List list) {
        if (C2199751B7l.LJFF(downloadInfo.getId(), null).LJIIIIZZ("use_default_throttle_speed", 1) != 1) {
            long throttleNetSpeed = downloadInfo.getThrottleNetSpeed();
            if (throttleNetSpeed > 0) {
                ((ArrayList) list).add(new HttpHeader("extra_throttle_net_speed", String.valueOf(throttleNetSpeed)));
            }
        }
    }

    public static boolean LJFF(C2199881B7y c2199881B7y, C2199881B7y c2199881B7y2) throws BaseException {
        File fileLIZJ;
        try {
            boolean z = false;
            if (!c2199881B7y.LJII() || c2199881B7y.isDirectory() || c2199881B7y.LJIIIIZZ().equals(c2199881B7y2.LJIIIIZZ())) {
                return false;
            }
            if (c2199881B7y2.LIZ.LIZIZ() == 1) {
                z = true;
            }
            if (z && (fileLIZJ = c2199881B7y2.LIZJ()) != null && !fileLIZJ.mkdirs() && !fileLIZJ.isDirectory()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Destination '");
                sbLIZ.append(fileLIZJ);
                sbLIZ.append("' directory cannot be created");
                throw new BaseException(1053, C2188811AlT.LIZIZ(sbLIZ));
            }
            if (C1490830otl.LIZ()) {
                String str = LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SrcFile:");
                sbLIZ2.append(c2199881B7y.getPath());
                sbLIZ2.append(" DestFile:");
                sbLIZ2.append(c2199881B7y2.getPath());
                C1490830otl.LIZIZ(str, "copyFile", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (c2199881B7y2.LJII() && !c2199881B7y2.LJIIJ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Destination '");
                sbLIZ3.append(c2199881B7y2.LJIIIIZZ());
                sbLIZ3.append("' exists but is read-only");
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            LJIIIIZZ(c2199881B7y, c2199881B7y2);
            return true;
        } catch (BaseException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIJJLI("CopyFile", th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.C2199881B7y r18, X.C2199881B7y r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199661B7c.LJIIIIZZ(X.1B7y, X.1B7y):void");
    }

    public static String LJIIIZ(InterfaceC2199921B8c interfaceC2199921B8c, String str) {
        String strLIZIZ = interfaceC2199921B8c.LIZIZ("Content-Disposition");
        String strGroup = null;
        if (strLIZIZ != null) {
            try {
                if (LIZLLL == null) {
                    LIZLLL = PatternProtector.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
                }
                Matcher matcher = LIZLLL.matcher(strLIZIZ);
                if (matcher.find()) {
                    strGroup = matcher.group(1);
                } else {
                    if (LJ == null) {
                        LJ = PatternProtector.compile("attachment;\\s*filename\\s*=\\s*(.*)");
                    }
                    Matcher matcher2 = LJ.matcher(strLIZIZ);
                    if (matcher2.find()) {
                        strGroup = matcher2.group(1);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (TextUtils.isEmpty(strGroup)) {
            return C2199671B7d.LJJIFFI(str);
        }
        return strGroup;
    }

    public static void LJIIJJI(C1B8V c1b8v, BaseException baseException) {
        if (c1b8v != null && (c1b8v instanceof C1B8F) && (baseException instanceof DownloadTTNetException)) {
            String strLIZJ = ((C1B8F) c1b8v).LIZJ();
            if (!TextUtils.isEmpty(strLIZJ)) {
                ((DownloadTTNetException) baseException).setRemoteIp(strLIZJ);
            }
            ((DownloadTTNetException) baseException).parseRemoteIp();
        }
    }

    public static boolean LJIILIIL(List<HttpHeader> list, List<HttpHeader> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list.size() != ((ArrayList) list2).size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIZILJ(X.C2199881B7y r6, X.C2199881B7y r7) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            boolean r0 = X.C1490830otl.LIZ()
            java.lang.String r3 = X.C2199661B7c.LIZ
            java.lang.String r4 = " Dest:"
            java.lang.String r2 = "moveFile"
            if (r0 == 0) goto L2d
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "DownloadFile Src:"
            r1.append(r0)
            java.lang.String r0 = r6.getPath()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r7.getPath()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1490830otl.LIZIZ(r3, r2, r0)
        L2d:
            android.util.SparseArray<X.13sk> r0 = X.C20149513sj.LIZ
            java.lang.Class<com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService> r0 = com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService.class
            java.lang.Object r0 = X.C1B82.LIZ(r0)
            com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService r0 = (com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService) r0
            android.content.Context r0 = r0.getAppContext()
            if (r0 == 0) goto L6d
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r5 = r0.targetSdkVersion
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L6d
            if (r5 != r0) goto L6a
            boolean r0 = android.os.Environment.isExternalStorageLegacy()
            if (r0 != 0) goto L6d
        L51:
            java.lang.String r0 = r6.LJIIIIZZ()
            boolean r0 = X.C20149513sj.LJ(r0)
            if (r0 != 0) goto L6d
            java.lang.String r0 = r7.LJIIIIZZ()
            boolean r0 = X.C20149513sj.LJ(r0)
            if (r0 == 0) goto L6d
        L65:
            boolean r5 = LJFF(r6, r7)
            goto L74
        L6a:
            if (r5 <= r0) goto L6d
            goto L51
        L6d:
            boolean r5 = r6.LJI(r7)
            if (r5 != 0) goto La3
            goto L65
        L74:
            boolean r0 = X.C1490830otl.LIZ()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L9b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = "Copy DownloadFile Src:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r6.getPath()     // Catch: java.lang.Throwable -> L9f
            r1.append(r0)     // Catch: java.lang.Throwable -> L9f
            r1.append(r4)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r7.getPath()     // Catch: java.lang.Throwable -> L9f
            r1.append(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L9f
            X.C1490830otl.LIZIZ(r3, r2, r0)     // Catch: java.lang.Throwable -> L9f
        L9b:
            r6.LIZ()     // Catch: java.lang.Throwable -> L9f
            return r5
        L9f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199661B7c.LJIIZILJ(X.1B7y, X.1B7y):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJLI(java.lang.String r8, java.lang.Throwable r9) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199661B7c.LJIJJLI(java.lang.String, java.lang.Throwable):void");
    }

    public static void LJI(DownloadInfo downloadInfo, String str, String str2) throws BaseException {
        if (downloadInfo != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !str2.equals(downloadInfo.getName())) {
            C2199881B7y c2199881B7y = new C2199881B7y(downloadInfo.getSavePath(), str2, true, true);
            C2199881B7y c2199881B7y2 = new C2199881B7y(downloadInfo.getSavePath(), downloadInfo.getName(), true, true);
            if (C1490830otl.LIZ()) {
                String str3 = LIZ;
                int id = downloadInfo.getId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ExistFile:");
                sbLIZ.append(c2199881B7y.getPath());
                sbLIZ.append(" targetFile:");
                sbLIZ.append(c2199881B7y2.getPath());
                C1490830otl.LIZLLL(id, str3, "copyFileFromExistFileWithSameName", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (c2199881B7y2.LJII() && !c2199881B7y2.LJIIJ()) {
                throw new BaseException(1001, "targetPath file exists but read-only");
            }
            if (!(!LJFF(c2199881B7y, c2199881B7y2))) {
            } else {
                throw new BaseException(1001, C786410Ut5.j4("Can't copy the exist file(%s/%s) to the target file(%s/%s)", new Object[]{downloadInfo.getSavePath(), str2, downloadInfo.getSavePath(), downloadInfo.getName()}));
            }
        }
    }

    public static void LJIIJ(int i, BaseException baseException, boolean z) {
        synchronized (LIZIZ) {
            try {
                List<InterfaceC2199911B8b> list = LIZJ.get(i);
                if (list != null) {
                    for (InterfaceC2199911B8b interfaceC2199911B8b : list) {
                        if (interfaceC2199911B8b != null) {
                            if (z) {
                                interfaceC2199911B8b.onSuccess();
                            } else {
                                interfaceC2199911B8b.LIZ(baseException);
                            }
                        }
                    }
                }
                if (C1490830otl.LIZ()) {
                    C1490830otl.LIZLLL(i, LIZ, "handleTempSaveCallback", "Run");
                }
                LIZIZ.remove(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static List LIZ(long j, long j2, String str, List list) {
        String strK4;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (Object obj : list) {
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new HttpHeader("If-Match", str));
        }
        arrayList.add(new HttpHeader("Accept-Encoding", "identity"));
        if (j2 <= 0) {
            strK4 = C786410Ut5.k4(Locale.US, "bytes=%d-", new Object[]{Long.valueOf(j)});
        } else {
            strK4 = C786410Ut5.k4(Locale.US, "bytes=%d-%d", new Object[]{Long.valueOf(j), Long.valueOf(j2)});
        }
        arrayList.add(new HttpHeader("Range", strK4));
        if (C1490830otl.LIZ()) {
            String str2 = LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CurrentOffset:");
            sbLIZ.append(j);
            sbLIZ.append(" EndOffset:");
            sbLIZ.append(j2);
            sbLIZ.append(", range = ");
            sbLIZ.append(strK4);
            C1490830otl.LIZIZ(str2, "addRangeHeader", C2188811AlT.LIZIZ(sbLIZ));
        }
        return arrayList;
    }

    public static C20130813pi LJII(int i, DownloadInfo downloadInfo, String str, String str2) throws BaseException {
        C2199751B7l c2199751B7lLJFF;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C0VSJ c0vsj = new C0VSJ(str, str2);
            if (c0vsj.exists() && c0vsj.isDirectory()) {
                throw new BaseException(1035, new IOException(C786410Ut5.j4("path is :%s, path is directory:%B:", new Object[]{str, Boolean.valueOf(c0vsj.isDirectory())})));
            }
            if (!c0vsj.exists()) {
                try {
                    C0VSJ c0vsj2 = new C0VSJ(str);
                    if (!c0vsj2.exists() || !c0vsj2.isDirectory()) {
                        if (!c0vsj2.exists()) {
                            if (!c0vsj2.mkdirs() && !c0vsj2.exists()) {
                                if (downloadInfo != null) {
                                    C1498850p6h<Integer, C2199751B7l> c1498850p6h = C2199751B7l.LJ;
                                    c2199751B7lLJFF = C2199751B7l.LJFF(downloadInfo.getId(), downloadInfo);
                                } else {
                                    c2199751B7lLJFF = C2199751B7l.LJFF;
                                }
                                if (c2199751B7lLJFF.LJIIIIZZ("opt_mkdir_failed", 0) == 1) {
                                    int i2 = 0;
                                    do {
                                        int i3 = i2 + 1;
                                        if (i2 < 3) {
                                            try {
                                                Thread.sleep(10L);
                                                i2 = i3;
                                            } catch (InterruptedException e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                        }
                                        if (C2199671B7d.LJIIIIZZ(downloadInfo.getSavePath()) < 16384) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("download savePath directory can not created:");
                                            sbLIZ.append(str);
                                            throw new BaseException(1006, C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("download savePath directory can not created:");
                                        sbLIZ2.append(str);
                                        throw new BaseException(1030, C2188811AlT.LIZIZ(sbLIZ2));
                                    } while (!c0vsj2.mkdirs());
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("download savePath directory can not created:");
                                sbLIZ3.append(str);
                                throw new BaseException(1030, C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        } else {
                            c0vsj2.delete();
                            if (!c0vsj2.mkdirs() && !c0vsj2.exists()) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("download savePath is not directory:path=");
                                sbLIZ4.append(str);
                                throw new BaseException(1031, C2188811AlT.LIZIZ(sbLIZ4));
                            }
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("download savePath is not directory:");
                            sbLIZ5.append(str);
                            throw new BaseException(1031, C2188811AlT.LIZIZ(sbLIZ5));
                        }
                    }
                    c0vsj.createNewFile();
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new BaseException(1036, e2);
                }
            }
            return new C20130813pi(c0vsj, i);
        }
        throw new BaseException(1021, new IOException("path must be not empty"));
    }
}
