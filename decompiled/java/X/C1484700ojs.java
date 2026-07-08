package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ojs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484700ojs {
    public static final void LIZIZ(C1482580ogS c1482580ogS, Video video, String str) {
        List<BitRate> bitRate;
        int codecType;
        long size;
        String urlKey;
        List<String> urlList;
        List<BitRate> bitRate2;
        if (video == null || (bitRate = video.getBitRate()) == null) {
            bitRate = C13BV.INSTANCE;
        }
        Iterator<BitRate> it2 = bitRate.iterator();
        while (true) {
            String str2 = "";
            int i = 1;
            if (!it2.hasNext()) {
                break;
            }
            BitRate next = it2.next();
            C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
            int iIsBytevc1 = next.isBytevc1();
            if (iIsBytevc1 != 1) {
                i = 2;
                if (iIsBytevc1 != 2) {
                    i = 0;
                }
            }
            c1058540deW.LIZJ = i;
            c1058540deW.LJ = next.getSize();
            String urlKey2 = next.getUrlKey();
            if (urlKey2 == null) {
                urlKey2 = "";
            }
            c1058540deW.LIZIZ = urlKey2;
            c1058540deW.LIZLLL = next.urlList();
            c1058540deW.LJII = str;
            C1484750ojx c1484750ojx = new C1484750ojx(c1058540deW);
            c1484750ojx.LIZ = next.getBitRate();
            String gearName = next.getGearName();
            if (gearName != null) {
                str2 = gearName;
            }
            c1484750ojx.LIZIZ = str2;
            c1484750ojx.LIZJ = next.getQualityType();
            c1058540deW.LJI = c1484750ojx;
            c1058540deW.LIZ();
        }
        VideoUrlModel playAddr = null;
        if ((video == null || (bitRate2 = video.getBitRate()) == null || bitRate2.isEmpty()) && C0C64.LJIILLIIL().LJIIIZ(31744, "ec_video_single_bitrate_add_bitrate_info", true, true)) {
            if (video != null) {
                playAddr = video.getPlayAddr();
            }
            C1058540deW c1058540deW2 = new C1058540deW(c1482580ogS);
            if (playAddr != null) {
                codecType = playAddr.getCodecType();
            } else {
                codecType = 0;
            }
            c1058540deW2.LIZJ = codecType;
            if (playAddr != null) {
                size = playAddr.getSize();
            } else {
                size = 0;
            }
            c1058540deW2.LJ = size;
            if (playAddr == null || (urlKey = playAddr.getUrlKey()) == null) {
                urlKey = "";
            }
            c1058540deW2.LIZIZ = urlKey;
            if (playAddr == null || (urlList = playAddr.getUrlList()) == null) {
                urlList = C13BV.INSTANCE;
            }
            c1058540deW2.LIZLLL = urlList;
            c1058540deW2.LJII = str;
            C1484750ojx c1484750ojx2 = new C1484750ojx(c1058540deW2);
            c1484750ojx2.LIZ = 0;
            c1484750ojx2.LIZIZ = "";
            c1484750ojx2.LIZJ = 0;
            c1058540deW2.LJI = c1484750ojx2;
            c1058540deW2.LIZ();
        }
    }

    public static final C1482570ogR LIZ(C1482580ogS c1482580ogS, boolean z, boolean z2, String str, String str2, Integer num, String str3, long j, OnPreRenderListener onPreRenderListener) {
        boolean zLIZ;
        String str4 = str2;
        String str5 = str;
        int iLJFF = (int) C13LZ.LJFF(j, 0L, 2147483647L);
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("enable_replay_pre_create", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zLIZ = true;
        }
        C1482570ogR c1482570ogRLIZ = c1482580ogS.LIZ();
        c1482570ogRLIZ.LIZ(EnumC1046760dLW.VIDEO);
        C1479570obb c1479570obb = c1482570ogRLIZ.LIZIZ;
        c1479570obb.LJJ = z;
        c1479570obb.LIZIZ = z2;
        if (str5 == null) {
            str5 = "";
        }
        c1479570obb.LJIILL = str5;
        c1479570obb.LJIIIZ = iLJFF;
        if (z2 && j > 0) {
            c1479570obb.LJIIJ = iLJFF;
        }
        if (str3 != null && !a0.LJJJIL(str3)) {
            c1482570ogRLIZ.LIZIZ.LJIIZILJ = C2097908Jt.LIZJ(new Pair("gec", str3));
        }
        if (num != null) {
            c1482570ogRLIZ.LIZIZ.LJJII = num.intValue();
        }
        C1479570obb c1479570obb2 = c1482570ogRLIZ.LIZIZ;
        if (str4 == null) {
            str4 = "";
        }
        c1479570obb2.LJJIIJ = str4;
        if (num == null && zLIZ) {
            c1479570obb2.LJIIIIZZ = true;
        }
        c1479570obb2.LJ = false;
        if (onPreRenderListener != null) {
            c1479570obb2.LIZ = onPreRenderListener;
            c1479570obb2.LIZLLL = false;
            c1479570obb2.LJIIIZ = iLJFF;
            c1479570obb2.LJIILIIL = true;
        }
        return c1482570ogRLIZ;
    }
}
