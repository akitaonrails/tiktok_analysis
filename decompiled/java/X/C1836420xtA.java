package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayDownloadSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836420xtA {
    public static C1836420xtA LIZJ;
    public final HashMap<Integer, C1836430xtB<Long, Long>> LIZ = new HashMap<>();
    public final HashMap<String, InterfaceC1835200xrC> LIZIZ = new HashMap<>();

    public static C1836420xtA LJFF() {
        if (LIZJ == null) {
            synchronized (C1836420xtA.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1836420xtA();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public static DownloadInfo LIZJ(String str) {
        List<DownloadInfo> allDownloadInfo = Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C01AB.LIZ()).getAllDownloadInfo();
        if (allDownloadInfo != null) {
            for (DownloadInfo downloadInfo : allDownloadInfo) {
                if (downloadInfo != null && TextUtils.equals(downloadInfo.getUrl(), str)) {
                    return downloadInfo;
                }
            }
            return null;
        }
        return null;
    }

    public static DownloadInfo LIZLLL(String str) {
        List<DownloadInfo> allDownloadInfo = Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C01AB.LIZ()).getAllDownloadInfo();
        if (allDownloadInfo != null) {
            int size = allDownloadInfo.size();
            while (true) {
                size--;
                if (size >= 0) {
                    DownloadInfo downloadInfo = (DownloadInfo) ListProtector.get(allDownloadInfo, size);
                    if (downloadInfo != null && TextUtils.equals(downloadInfo.getExtra(), str)) {
                        return downloadInfo;
                    }
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public static DownloadInfo LJ(int i) {
        return Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C01AB.LIZ()).getDownloadInfo(i);
    }

    public static String LJI(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(CardStruct.IStatusCode.DEFAULT);
                    sbLIZ.append(hexString);
                    hexString = C2188811AlT.LIZIZ(sbLIZ);
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            HashMap map = new HashMap();
            map.put("error_msg", e.getMessage());
            C1CC2.LJII(1, "ttlive_replay_MD5_fail", map);
            return null;
        }
    }

    public static void LJII(int i) {
        Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C01AB.LIZ()).pause(i);
    }

    public final void LJIIIIZZ(String str, InterfaceC1835200xrC interfaceC1835200xrC) {
        this.LIZIZ.put(str, interfaceC1835200xrC);
    }

    public final void LIZIZ(int i, String str, String str2, String str3) {
        LIZ(i, 1, str, str2, str3, null);
    }

    public final int LJIIIZ(int i, final String str, String str2, String str3, final String str4) {
        DownloadTask downloadTaskWith = C2200151B8z.with(C01AB.LIZ());
        downloadTaskWith.url(str);
        downloadTaskWith.name(str3);
        downloadTaskWith.savePath(str2);
        downloadTaskWith.monitorScene("live_replay");
        downloadTaskWith.minProgressTimeMsInterval(i);
        downloadTaskWith.mainThreadListener(new AbsDownloadListener() { // from class: X.0xrW
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPause(DownloadInfo downloadInfo) {
                super.onPause(downloadInfo);
                if (this.LLILLL.LIZIZ.get(str) != null) {
                    this.LLILLL.LIZIZ.get(str).onPause(downloadInfo);
                }
                if (!TextUtils.isEmpty(str4) && this.LLILLL.LIZIZ.get(str4) != null) {
                    this.LLILLL.LIZIZ.get(str4).onPause(downloadInfo);
                }
                HashMap map = new HashMap();
                map.put("download_url", str);
                C1CC2.LJII(2, "ttlive_live_replay_download_status_all", map);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                super.onProgress(downloadInfo);
                if (this.LLILLL.LIZIZ.get(str) != null) {
                    this.LLILLL.LIZIZ.get(str).onProgress(downloadInfo);
                }
                if (!TextUtils.isEmpty(str4) && this.LLILLL.LIZIZ.get(str4) != null) {
                    this.LLILLL.LIZIZ.get(str4).onProgress(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onStart(DownloadInfo downloadInfo) {
                super.onStart(downloadInfo);
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [F, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r0v31, types: [S, java.lang.Long] */
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                C1836430xtB<Long, Long> c1836430xtB;
                super.onSuccessed(downloadInfo);
                int id = downloadInfo.getId();
                if (this.LLILLL.LIZ.containsKey(Integer.valueOf(id)) && (c1836430xtB = this.LLILLL.LIZ.get(Integer.valueOf(id))) != null) {
                    c1836430xtB.LIZ = Long.valueOf((c1836430xtB.LIZ.longValue() + System.currentTimeMillis()) - c1836430xtB.LIZIZ.longValue());
                    c1836430xtB.LIZIZ = Long.valueOf(System.currentTimeMillis());
                    this.LLILLL.LIZ.put(Integer.valueOf(id), c1836430xtB);
                }
                if (this.LLILLL.LIZIZ.get(str) != null) {
                    this.LLILLL.LIZIZ.get(str).LIZ(downloadInfo);
                }
                if (!TextUtils.isEmpty(str4) && this.LLILLL.LIZIZ.get(str4) != null) {
                    this.LLILLL.LIZIZ.get(str4).LIZ(downloadInfo);
                }
                HashMap map = new HashMap();
                map.put("download_url", str);
                C1CC2.LJII(0, "ttlive_live_replay_download_status_all", map);
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [F, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r0v28, types: [S, java.lang.Long] */
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                int errorCode;
                String errorMessage;
                super.onFailed(downloadInfo, baseException);
                if (this.LLILLL.LIZIZ.get(str) != null) {
                    this.LLILLL.LIZIZ.get(str).onFailed(downloadInfo, baseException);
                }
                if (!TextUtils.isEmpty(str4) && this.LLILLL.LIZIZ.get(str4) != null) {
                    this.LLILLL.LIZIZ.get(str4).onFailed(downloadInfo, baseException);
                }
                int id = downloadInfo.getId();
                if (this.LLILLL.LIZ.containsKey(Integer.valueOf(id))) {
                    C1836430xtB<Long, Long> c1836430xtB = this.LLILLL.LIZ.get(Integer.valueOf(id));
                    if (c1836430xtB != null) {
                        c1836430xtB.LIZ = Long.valueOf((c1836430xtB.LIZ.longValue() + System.currentTimeMillis()) - c1836430xtB.LIZIZ.longValue());
                        c1836430xtB.LIZIZ = Long.valueOf(System.currentTimeMillis());
                        this.LLILLL.LIZ.put(Integer.valueOf(id), c1836430xtB);
                    }
                } else {
                    this.LLILLL.LIZ.remove(Integer.valueOf(id));
                }
                HashMap map = new HashMap();
                if (baseException != null) {
                    errorCode = baseException.getErrorCode();
                } else {
                    errorCode = -1;
                }
                map.put("error_code", Integer.valueOf(errorCode));
                if (baseException != null) {
                    errorMessage = baseException.getErrorMessage();
                } else {
                    errorMessage = "";
                }
                map.put("error_msg", errorMessage);
                map.put("download_url", str);
                C1CC2.LJII(1, "ttlive_live_replay_download_status_all", map);
                C1CC2.LJII(1, "ttlive_live_replay_download_status_error", map);
            }
        });
        if (!TextUtils.isEmpty(str4)) {
            downloadTaskWith.extra(str4);
        }
        if (LiveReplayDownloadSetting.INSTANCE.isEnable()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("segment_config", new JSONObject());
                downloadTaskWith.downloadSetting(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            downloadTaskWith.retryCount(5);
        }
        return downloadTaskWith.download();
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [F, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v25, types: [S, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v34, types: [S, java.lang.Long] */
    public final int LIZ(int i, int i2, String str, String str2, String str3, String str4) {
        C1836430xtB<Long, Long> c1836430xtB;
        C1836430xtB<Long, Long> c1836430xtB2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            return 0;
                        }
                        int downloadId = Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C01AB.LIZ()).getDownloadId(str, str2);
                        Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C01AB.LIZ()).restart(downloadId);
                        return downloadId;
                    }
                    int downloadId2 = Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C01AB.LIZ()).getDownloadId(str, str2);
                    if (this.LIZ.containsKey(Integer.valueOf(downloadId2)) && (c1836430xtB2 = this.LIZ.get(Integer.valueOf(downloadId2))) != null) {
                        c1836430xtB2.LIZIZ = Long.valueOf(System.currentTimeMillis());
                        this.LIZ.put(Integer.valueOf(downloadId2), c1836430xtB2);
                    }
                    LJIIIZ(i2, str, str2, str3, str4);
                    return downloadId2;
                }
                int downloadId3 = Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C01AB.LIZ()).getDownloadId(str, str2);
                if (this.LIZ.containsKey(Integer.valueOf(downloadId3)) && (c1836430xtB = this.LIZ.get(Integer.valueOf(downloadId3))) != null) {
                    c1836430xtB.LIZ = Long.valueOf((c1836430xtB.LIZ.longValue() + System.currentTimeMillis()) - c1836430xtB.LIZIZ.longValue());
                    c1836430xtB.LIZIZ = Long.valueOf(System.currentTimeMillis());
                    this.LIZ.put(Integer.valueOf(downloadId3), c1836430xtB);
                }
                Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C01AB.LIZ()).pause(downloadId3);
                return downloadId3;
            }
            int downloadId4 = Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C01AB.LIZ()).getDownloadId(str, str2);
            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C01AB.LIZ()).clearDownloadData(downloadId4);
            this.LIZ.remove(Integer.valueOf(downloadId4));
            return downloadId4;
        }
        int iLJIIIZ = LJIIIZ(i2, str, str2, str3, str4);
        this.LIZ.put(Integer.valueOf(iLJIIIZ), new C1836430xtB<>(0L, Long.valueOf(System.currentTimeMillis())));
        return iLJIIIZ;
    }
}
