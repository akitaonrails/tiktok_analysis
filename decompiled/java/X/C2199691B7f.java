package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199691B7f {
    public static void LIZJ(C1B5V c1b5v) {
        C1B67 c1b67 = C2199681B7e.LJJ;
        if (c1b67 == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("db_init_duration", c1b5v.LIZ);
            jSONObject.put("db_init_disk_cache_count", c1b5v.LIZIZ);
            jSONObject.put("db_init_memory_cache_count", c1b5v.LIZJ);
            jSONObject.put("db_init_disk_cache_size", c1b5v.LIZLLL);
            c1b67.LIZIZ("download_db", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJI(DownloadTask downloadTask, BaseException baseException, int i) {
        int[] iArrLIZ;
        if (downloadTask == null) {
            return;
        }
        try {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo == null) {
                return;
            }
            InterfaceC2199431B6f monitorDepend = downloadTask.getMonitorDepend();
            if (i != 2 && i != -3 && i != -1 && i != -4 && i != -2 && i != 6 && i != 0) {
                int[] extraMonitorStatus = downloadInfo.getExtraMonitorStatus();
                if (extraMonitorStatus != null && extraMonitorStatus.length > 0) {
                    for (int i2 : extraMonitorStatus) {
                        if (i != i2) {
                        }
                    }
                    if (monitorDepend == null) {
                        return;
                    } else {
                        return;
                    }
                }
                if (monitorDepend == null && (monitorDepend instanceof AbstractC2199441B6g) && (iArrLIZ = ((AbstractC2199441B6g) monitorDepend).LIZ()) != null && iArrLIZ.length > 0) {
                    for (int i3 : iArrLIZ) {
                        if (i != i3) {
                        }
                    }
                    return;
                }
                return;
            }
            try {
                IDownloadDepend depend = downloadTask.getDepend();
                if (depend != null) {
                    depend.monitorLogSend(downloadInfo, baseException, i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            LJIIIIZZ(monitorDepend, downloadInfo, baseException, i);
            LJII(C2199681B7e.LJJ, downloadInfo, baseException, i);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static void LJIIIZ(int i, JSONObject jSONObject, DownloadInfo downloadInfo) throws JSONException {
        String str;
        if (i != -5) {
            if (i != -4) {
                if (i != -3) {
                    if (i != -2) {
                        if (i != 0) {
                            if (i != 2) {
                                if (i != 6) {
                                    str = "";
                                } else {
                                    str = "download_first_start";
                                }
                            } else {
                                str = "download_start";
                            }
                        } else {
                            str = "download_create";
                        }
                    } else {
                        str = "download_pause";
                    }
                } else {
                    double downloadSpeed = downloadInfo.getDownloadSpeed();
                    if (downloadSpeed >= 0.0d) {
                        jSONObject.put("download_speed", downloadSpeed);
                    }
                    jSONObject.put("throttle_speed", downloadInfo.getThrottleNetSpeed());
                    str = "download_success";
                }
            } else {
                str = "download_cancel";
            }
        } else {
            str = "download_uncomplete";
        }
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
    }

    public static JSONObject LIZ(String str, DownloadInfo downloadInfo, BaseException baseException, int i) {
        JSONObject jSONObject;
        String errorMessage;
        int i2;
        int i3;
        int i4;
        String md5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String headConnectionException;
        String extra;
        int i10;
        int size;
        int curBackUpUrlIndex;
        String string;
        String taskId;
        int i11;
        try {
            jSONObject = new JSONObject();
            try {
                Context context = C2199681B7e.LIZ;
                synchronized (C2199681B7e.class) {
                }
                String requestLog = "";
                if (baseException != null && (baseException instanceof DownloadTTNetException)) {
                    requestLog = ((DownloadTTNetException) baseException).getRequestLog();
                }
                jSONObject.put("event_page", str);
                jSONObject.put("app_id", "");
                jSONObject.put("device_id", "");
                jSONObject.put("device_id_postfix", "");
                int errorCode = 0;
                jSONObject.put("update_version", 0);
                jSONObject.put("download_status", i);
                if (downloadInfo != null) {
                    C1498850p6h<Integer, C2199751B7l> c1498850p6h = C2199751B7l.LJ;
                    jSONObject.put("setting_tag", C2199751B7l.LJFF(downloadInfo.getId(), downloadInfo).LJIIJJI());
                    jSONObject.put("download_id", downloadInfo.getId());
                    jSONObject.put("name", downloadInfo.getName());
                    jSONObject.put("url", downloadInfo.getUrl());
                    jSONObject.put("save_path", downloadInfo.getSavePath());
                    jSONObject.put("download_time", downloadInfo.getDownloadTime());
                    jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
                    jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
                    jSONObject.put("network_quality", downloadInfo.getNetworkQuality());
                    int i12 = 1;
                    if (downloadInfo.isOnlyWifi()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    jSONObject.put("only_wifi", i2);
                    if (downloadInfo.isNeedHttpsToHttpRetry()) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    jSONObject.put("need_https_degrade", i3);
                    if (downloadInfo.isHttpsToHttpRetryUsed()) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    jSONObject.put("https_degrade_retry_used", i4);
                    if (downloadInfo.getMd5() == null) {
                        md5 = "";
                    } else {
                        md5 = downloadInfo.getMd5();
                    }
                    jSONObject.put("md5", md5);
                    jSONObject.put("chunk_count", downloadInfo.getChunkCount());
                    if (downloadInfo.isForce()) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    jSONObject.put("is_force", i5);
                    jSONObject.put("retry_count", downloadInfo.getRetryCount());
                    if (downloadInfo.isNeedRetryDelay()) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    jSONObject.put("need_retry_delay", i6);
                    if (downloadInfo.isNeedReuseFirstConnection()) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    jSONObject.put("need_reuse_first_connection", i7);
                    if (downloadInfo.isNeedDefaultHttpServiceBackUp()) {
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    jSONObject.put("default_http_service_backup", i8);
                    jSONObject.put("retry_delay_status", downloadInfo.getRetryDelayStatus().ordinal());
                    jSONObject.put("download_byte_error_retry_status", downloadInfo.getByteInvalidRetryStatus().ordinal());
                    jSONObject.put("forbidden_handler_status", downloadInfo.getAsyncHandleStatus().ordinal());
                    if (downloadInfo.isNeedIndependentProcess()) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    jSONObject.put("need_independent_process", i9);
                    if (downloadInfo.getHeadConnectionException() != null) {
                        headConnectionException = downloadInfo.getHeadConnectionException();
                    } else {
                        headConnectionException = "";
                    }
                    jSONObject.put("head_connection_error_msg", headConnectionException);
                    if (downloadInfo.getExtra() != null) {
                        extra = downloadInfo.getExtra();
                    } else {
                        extra = "";
                    }
                    jSONObject.put("extra", extra);
                    if (downloadInfo.isAddListenerToSameTask()) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    jSONObject.put("add_listener_to_same_task", i10);
                    if (downloadInfo.getBackUpUrls() != null) {
                        size = downloadInfo.getBackUpUrls().size();
                    } else {
                        size = 0;
                    }
                    jSONObject.put("backup_url_count", size);
                    if (downloadInfo.getBackUpUrls() != null) {
                        curBackUpUrlIndex = downloadInfo.getCurBackUpUrlIndex();
                    } else {
                        curBackUpUrlIndex = -1;
                    }
                    jSONObject.put("cur_backup_url_index", curBackUpUrlIndex);
                    if (downloadInfo.getForbiddenBackupUrls() != null) {
                        string = downloadInfo.getForbiddenBackupUrls().toString();
                    } else {
                        string = "";
                    }
                    jSONObject.put("forbidden_urls", string);
                    if (TextUtils.isEmpty(downloadInfo.getTaskId())) {
                        taskId = "";
                    } else {
                        taskId = downloadInfo.getTaskId();
                    }
                    jSONObject.put("task_id", taskId);
                    jSONObject.put("network_retry_count", downloadInfo.getCurNetworkRetryCount());
                    jSONObject.put("cache_exists_in_downloading", downloadInfo.isCacheExistsInDownloading());
                    if (i == -3 || i == -4 || i == -1 || i == -2) {
                        jSONObject.put("all_connect_time", downloadInfo.getAllConnectTime());
                        jSONObject.put("first_speed_time", downloadInfo.getFirstSpeedTime());
                        jSONObject.put("real_download_time", downloadInfo.getRealDownloadTime());
                        jSONObject.put("download_time", downloadInfo.getDownloadTime());
                        if (downloadInfo.isHttpsToHttpRetryUsed()) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        jSONObject.put("https_degrade_retry_used", i11);
                        if (!downloadInfo.isBackUpUrlUsed()) {
                            i12 = 0;
                        }
                        jSONObject.put("backup_url_used", i12);
                        jSONObject.put("cur_retry_time", downloadInfo.getCurRetryTime());
                        jSONObject.put("cur_retry_time_in_total", downloadInfo.getCurRetryTimeInTotal());
                    }
                    try {
                        String host = "";
                        String path = "";
                        String lastPathSegment = "";
                        String url = downloadInfo.getUrl();
                        if (!TextUtils.isEmpty(url)) {
                            Uri uri = UriProtector.parse(url);
                            host = uri.getHost();
                            path = uri.getPath();
                            lastPathSegment = uri.getLastPathSegment();
                            if (!TextUtils.isEmpty(path) && !TextUtils.isEmpty(lastPathSegment)) {
                                try {
                                    path = path.substring(0, path.length() - lastPathSegment.length());
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }
                        jSONObject.put("url_host", host);
                        jSONObject.put("url_path", path);
                        jSONObject.put("url_last_path_segment", lastPathSegment);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                if (baseException != null) {
                    errorCode = baseException.getErrorCode();
                }
                jSONObject.put("error_code", errorCode);
                if (baseException != null) {
                    errorMessage = baseException.getErrorMessage();
                } else {
                    errorMessage = "";
                }
                jSONObject.put("error_msg", errorMessage);
                jSONObject.put("request_log", requestLog);
                return jSONObject;
            } catch (JSONException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                return jSONObject;
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
        }
    }

    public static void LJII(C1B67 c1b67, DownloadInfo downloadInfo, BaseException baseException, int i) {
        int i2;
        if (c1b67 != null && downloadInfo.isNeedSDKMonitor()) {
            try {
                JSONObject jSONObjectLIZ = LIZ(downloadInfo.getMonitorScene(), downloadInfo, baseException, i);
                if (jSONObjectLIZ == null) {
                    jSONObjectLIZ = new JSONObject();
                }
                if (i == -1) {
                    jSONObjectLIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, baseException.getErrorCode());
                    if (C2199671B7d.LJIL(C2199681B7e.LJFF())) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    jSONObjectLIZ.put("net_connected", i2);
                    c1b67.LIZIZ("download_failed", jSONObjectLIZ);
                    return;
                }
                LJIIIZ(i, jSONObjectLIZ, downloadInfo);
                c1b67.LIZIZ("download_common", jSONObjectLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJIIIIZZ(InterfaceC2199431B6f interfaceC2199431B6f, DownloadInfo downloadInfo, BaseException baseException, int i) {
        if (interfaceC2199431B6f == null) {
            return;
        }
        try {
            String eventPage = interfaceC2199431B6f.getEventPage();
            if (TextUtils.isEmpty(eventPage)) {
                eventPage = "default";
            }
            JSONObject jSONObjectLIZ = LIZ(eventPage, downloadInfo, baseException, i);
            if (jSONObjectLIZ == null) {
                jSONObjectLIZ = new JSONObject();
            }
            interfaceC2199431B6f.monitorLogSend(jSONObjectLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[PHI: r8
      0x0036: PHI (r8v9 int) = (r8v0 int), (r8v2 int) binds: [B:12:0x0020, B:17:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073 A[PHI: r6 r8
      0x0073: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v1 java.lang.String), (r6v0 java.lang.String), (r6v0 java.lang.String) binds: [B:30:0x0052, B:43:0x0082, B:40:0x0071, B:22:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r8v8 int) = (r8v4 int), (r8v5 int), (r8v6 int), (r8v4 int) binds: [B:30:0x0052, B:43:0x0082, B:40:0x0071, B:22:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9 A[Catch: JSONException -> 0x0136, all -> 0x0162, TryCatch #2 {JSONException -> 0x0136, blocks: (B:53:0x00bd, B:55:0x00f9, B:57:0x0107, B:59:0x010d, B:61:0x0113, B:62:0x0117, B:63:0x011a), top: B:87:0x00bd, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0152 A[Catch: all -> 0x0162, TryCatch #0 {all -> 0x0162, blocks: (B:16:0x002b, B:18:0x002f, B:45:0x008a, B:47:0x00a0, B:51:0x00b5, B:52:0x00b8, B:53:0x00bd, B:55:0x00f9, B:57:0x0107, B:59:0x010d, B:61:0x0113, B:62:0x0117, B:63:0x011a, B:76:0x014e, B:78:0x0152, B:79:0x0159, B:70:0x0140, B:72:0x0144, B:66:0x0137, B:23:0x0041, B:25:0x0047, B:31:0x0054, B:33:0x005e, B:36:0x006b, B:37:0x006e, B:42:0x0075, B:44:0x0084, B:15:0x0028, B:49:0x00a6, B:13:0x0022), top: B:84:0x0020, inners: #1, #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.InterfaceC2199921B8c r14, java.lang.String r15, java.lang.String r16, long r17, java.lang.String r19, int r20, java.io.IOException r21, com.ss.android.socialbase.downloader.model.DownloadInfo r22) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199691B7f.LIZIZ(X.1B8c, java.lang.String, java.lang.String, long, java.lang.String, int, java.io.IOException, com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    public static void LJFF(C2199751B7l c2199751B7l, DownloadInfo downloadInfo, String str, String str2, String str3, boolean z, C1B8V c1b8v, BaseException baseException, long j, long j2) {
        LJ("segment_io", c2199751B7l.LJIIIIZZ("monitor_segment_io", 0), c2199751B7l, downloadInfo, str, str2, str3, c1b8v, z, false, baseException, j, j2, false, -1L, -1L, -1L);
    }

    public static void LIZLLL(C2199751B7l c2199751B7l, DownloadInfo downloadInfo, String str, C1B8V c1b8v, boolean z, boolean z2, BaseException baseException, long j, long j2, boolean z3, long j3, long j4, long j5) {
        LJ("download_io", c2199751B7l.LJIIIIZZ("monitor_download_io", 0), c2199751B7l, downloadInfo, str, null, null, c1b8v, z, z2, baseException, j, j2, z3, j3, j4, j5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #0 {all -> 0x01a6, blocks: (B:6:0x0010, B:8:0x0027, B:12:0x003c, B:28:0x006e, B:31:0x007a, B:35:0x0081, B:37:0x008d, B:38:0x0097, B:44:0x00ab, B:46:0x00af, B:47:0x00b2, B:49:0x00b6, B:50:0x00bc, B:53:0x0112, B:61:0x0136, B:56:0x0125, B:58:0x012b, B:60:0x0131, B:62:0x0139, B:64:0x0149, B:66:0x0151, B:67:0x016c, B:76:0x0192, B:78:0x0196, B:79:0x019d, B:70:0x0184, B:72:0x0188, B:21:0x004d, B:23:0x0057, B:27:0x006a, B:26:0x0066, B:10:0x002d), top: B:84:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112 A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:6:0x0010, B:8:0x0027, B:12:0x003c, B:28:0x006e, B:31:0x007a, B:35:0x0081, B:37:0x008d, B:38:0x0097, B:44:0x00ab, B:46:0x00af, B:47:0x00b2, B:49:0x00b6, B:50:0x00bc, B:53:0x0112, B:61:0x0136, B:56:0x0125, B:58:0x012b, B:60:0x0131, B:62:0x0139, B:64:0x0149, B:66:0x0151, B:67:0x016c, B:76:0x0192, B:78:0x0196, B:79:0x019d, B:70:0x0184, B:72:0x0188, B:21:0x004d, B:23:0x0057, B:27:0x006a, B:26:0x0066, B:10:0x002d), top: B:84:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149 A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:6:0x0010, B:8:0x0027, B:12:0x003c, B:28:0x006e, B:31:0x007a, B:35:0x0081, B:37:0x008d, B:38:0x0097, B:44:0x00ab, B:46:0x00af, B:47:0x00b2, B:49:0x00b6, B:50:0x00bc, B:53:0x0112, B:61:0x0136, B:56:0x0125, B:58:0x012b, B:60:0x0131, B:62:0x0139, B:64:0x0149, B:66:0x0151, B:67:0x016c, B:76:0x0192, B:78:0x0196, B:79:0x019d, B:70:0x0184, B:72:0x0188, B:21:0x004d, B:23:0x0057, B:27:0x006a, B:26:0x0066, B:10:0x002d), top: B:84:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151 A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:6:0x0010, B:8:0x0027, B:12:0x003c, B:28:0x006e, B:31:0x007a, B:35:0x0081, B:37:0x008d, B:38:0x0097, B:44:0x00ab, B:46:0x00af, B:47:0x00b2, B:49:0x00b6, B:50:0x00bc, B:53:0x0112, B:61:0x0136, B:56:0x0125, B:58:0x012b, B:60:0x0131, B:62:0x0139, B:64:0x0149, B:66:0x0151, B:67:0x016c, B:76:0x0192, B:78:0x0196, B:79:0x019d, B:70:0x0184, B:72:0x0188, B:21:0x004d, B:23:0x0057, B:27:0x006a, B:26:0x0066, B:10:0x002d), top: B:84:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0196 A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:6:0x0010, B:8:0x0027, B:12:0x003c, B:28:0x006e, B:31:0x007a, B:35:0x0081, B:37:0x008d, B:38:0x0097, B:44:0x00ab, B:46:0x00af, B:47:0x00b2, B:49:0x00b6, B:50:0x00bc, B:53:0x0112, B:61:0x0136, B:56:0x0125, B:58:0x012b, B:60:0x0131, B:62:0x0139, B:64:0x0149, B:66:0x0151, B:67:0x016c, B:76:0x0192, B:78:0x0196, B:79:0x019d, B:70:0x0184, B:72:0x0188, B:21:0x004d, B:23:0x0057, B:27:0x006a, B:26:0x0066, B:10:0x002d), top: B:84:0x0010, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1B67] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(java.lang.String r21, int r22, X.C2199751B7l r23, com.ss.android.socialbase.downloader.model.DownloadInfo r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, X.C1B8V r28, boolean r29, boolean r30, com.ss.android.socialbase.downloader.exception.BaseException r31, long r32, long r34, boolean r36, long r37, long r39, long r41) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199691B7f.LJ(java.lang.String, int, X.1B7l, com.ss.android.socialbase.downloader.model.DownloadInfo, java.lang.String, java.lang.String, java.lang.String, X.1B8V, boolean, boolean, com.ss.android.socialbase.downloader.exception.BaseException, long, long, boolean, long, long, long):void");
    }
}
