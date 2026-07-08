package X;

import Y.ARunnableS12S1100000_7;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.FixReportPrioritySetting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS193S0000000_7;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0IXA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IXA implements InterfaceC463840IGw {
    public static final String[] LJIIJ = {"player_start", "player_prepare_end", "player_sdk_dns_analysis_end", "player_prepare_block_end", "player_player_dns_analysis_end", "player_tfo_fall_back_time", "player_tcp_connect_end", "player_tcp_first_package_end", "player_first_video_package_end", "player_first_audio_package_end", "player_first_frame_from_player_core", "player_first_frame_render_end", "player_video_device_open_start", "player_video_device_open_end", "player_audio_device_open_start", "player_audio_device_open_end"};
    public static final String[] LJIIJJI = {"start", "prepare_end", "sdk_dns_analysis_end", "prepare_block_end", "player_dns_analysis_end", "tfo_fall_back_time", "tcp_connect_end", "tcp_first_package_end", "first_video_package_end", "first_audio_package_end", "first_frame_from_player_core", "first_frame_render_end", "video_device_open_start", "video_device_open_end", "audio_device_open_start", "audio_device_open_end"};
    public Map<String, String> LIZ;
    public C463260IEq LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final Map<String, Long> LIZIZ = new ConcurrentHashMap();
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(271));

    public final long LIZ() {
        Long l = (Long) ((ConcurrentHashMap) this.LIZIZ).get("start");
        Long l2 = (Long) ((ConcurrentHashMap) this.LIZIZ).get("first_frame");
        long jLongValue = (l == null || l2 == null) ? 0L : l2.longValue() - l.longValue();
        C463260IEq c463260IEq = this.LIZJ;
        if (TextUtils.equals(c463260IEq != null ? c463260IEq.LIZ : null, "draw") && jLongValue < 0) {
            jLongValue = 0;
        }
        if (!this.LJIIIIZZ || jLongValue >= 0) {
            return jLongValue;
        }
        return 0L;
    }

    public final long LIZJ() {
        Long l = (Long) ((ConcurrentHashMap) this.LIZIZ).get("start_real");
        Long l2 = (Long) ((ConcurrentHashMap) this.LIZIZ).get("first_frame");
        long jLongValue = (l == null || l2 == null) ? 0L : l2.longValue() - l.longValue();
        if (!this.LJI || jLongValue >= 0) {
            return jLongValue;
        }
        return 0L;
    }

    public final long LIZLLL() {
        Long l = (Long) ((ConcurrentHashMap) this.LIZIZ).get("start_real");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final long LJ() {
        Long l = (Long) ((ConcurrentHashMap) this.LIZIZ).get("first_frame");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final long LJFF(String str) {
        Long l = (Long) ((ConcurrentHashMap) this.LIZIZ).get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.lang.String r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IXA.LJII(java.lang.String):void");
    }

    public final void LJIIIIZZ(String str) throws JSONException {
        if (!this.LJII && ((ConcurrentHashMap) this.LIZIZ).containsKey("start") && ((ConcurrentHashMap) this.LIZIZ).containsKey("first_frame")) {
            if (FixReportPrioritySetting.INSTANCE.isAsyncLog()) {
                C823050WQl.LIZJ().execute(new ARunnableS12S1100000_7(this, str, 10));
            } else {
                LJII(str);
            }
        }
    }

    public final long LIZIZ(String str, String str2) {
        Long l = (Long) ((ConcurrentHashMap) this.LIZIZ).get(str);
        Long l2 = (Long) ((ConcurrentHashMap) this.LIZIZ).get(str2);
        if (l != null && l2 != null) {
            long jLongValue = l2.longValue() - l.longValue();
            if (jLongValue < 0) {
                if (this.LJ != 0) {
                    return 0L;
                }
                return -1L;
            }
            return jLongValue;
        }
        return 0L;
    }

    public final void LJI(Long l, String str) {
        if (l != null) {
            ((ConcurrentHashMap) this.LIZIZ).put(str, l);
        }
    }
}
