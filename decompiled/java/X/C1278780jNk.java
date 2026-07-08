package X;

import Y.ARunnableS4S1101000_20;
import android.text.TextUtils;
import com.google.gson.n;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.engine.MediaEncodeStream;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.transport.LibRTMPTransport;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278780jNk {
    public final C1277590jLp LIZ;
    public final PushBase LIZIZ;
    public final C1278910jNx LIZJ;
    public final C1278810jNn LIZLLL;

    public final void LIZIZ() {
        LibRTMPTransport libRTMPTransport;
        TEBundle tEBundle;
        MediaEncodeStream mediaEncodeStream;
        TEBundle tEBundle2;
        C1278940jO0 c1278940jO0 = (C1278940jO0) this.LIZJ.LJFF();
        if (c1278940jO0 != null) {
            libRTMPTransport = c1278940jO0.LJIIL;
            tEBundle = c1278940jO0.LJIILIIL;
        } else {
            libRTMPTransport = null;
            tEBundle = null;
        }
        if (libRTMPTransport != null && tEBundle != null) {
            tEBundle.setLong("rtmp_init_video_bitrate", this.LIZIZ.defaultBitrate);
            tEBundle.setLong("rtmp_max_video_bitrate", this.LIZIZ.maxBitrate);
            tEBundle.setLong("rtmp_min_video_bitrate", this.LIZIZ.minBitrate);
            tEBundle.setInt("video_width", this.LIZIZ.width);
            tEBundle.setInt("video_height", this.LIZIZ.height);
            tEBundle.setInt("video_fps", this.LIZIZ.fps);
            tEBundle.setBool("transport_enable_new_update_send_cache_config", this.LIZIZ.LJJJI);
            tEBundle.setBool("video_enable_accelera", this.LIZIZ.useHardwareEncode);
            tEBundle.setInt("rtmp_init_audio_bitrate", this.LIZIZ.audioBitrate);
            if (this.LIZ.LJI.LIZJ.LIZ()) {
                c1278940jO0.LJIIIIZZ(tEBundle);
            }
            libRTMPTransport.setParameter(tEBundle);
        }
        C1278760jNi c1278760jNiLIZIZ = this.LIZJ.LIZIZ();
        if (c1278760jNiLIZIZ != null) {
            mediaEncodeStream = c1278760jNiLIZIZ.LLJILLL;
            tEBundle2 = c1278760jNiLIZIZ.LLJJ;
        } else {
            mediaEncodeStream = null;
            tEBundle2 = null;
        }
        WeakReference<Object> weakReference = this.LIZJ.LJIIJJI;
        C1278750jNh c1278750jNh = (C1278750jNh) (weakReference != null ? weakReference.get() : null);
        if (mediaEncodeStream == null || tEBundle2 == null) {
            return;
        }
        if (c1278750jNh != null) {
            tEBundle2.setString("video_type", c1278750jNh.LJFF);
        }
        tEBundle2.setBool("video_enable_accelera", this.LIZIZ.useHardwareEncode);
        tEBundle2.setInt("video_width", this.LIZIZ.width);
        tEBundle2.setInt("video_height", this.LIZIZ.height);
        tEBundle2.setInt("video_min_bitrate", this.LIZIZ.minBitrate);
        tEBundle2.setInt("video_max_bitrate", this.LIZIZ.maxBitrate);
        tEBundle2.setInt("video_fps", this.LIZIZ.fps);
        n nVarLIZIZ = this.LIZIZ.LIZIZ();
        if (nVarLIZIZ != null) {
            tEBundle2.setString("videoEncoderStrategy", nVarLIZIZ.toString());
        }
        mediaEncodeStream.LJIIIZ(tEBundle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.pusher.core.base.TEBundle r15) {
        /*
            Method dump skipped, instruction units count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1278780jNk.LIZJ(com.ss.pusher.core.base.TEBundle):void");
    }

    public C1278780jNk(C1277590jLp c1277590jLp, C1278910jNx c1278910jNx) {
        this.LIZ = c1277590jLp;
        this.LIZIZ = c1277590jLp.LJI.mPushBase;
        this.LIZJ = c1278910jNx;
        c1278910jNx.getClass();
        c1278910jNx.LJIILJJIL = new WeakReference<>(this);
        this.LIZLLL = new C1278810jNn(this.LIZ, this.LIZJ);
    }

    public final void LIZ(int i, String str) {
        if (C786410Ut5.u3() != this.LIZJ.LIZ.getLooper().getThread()) {
            C786410Ut5.LJJZZIII(this.LIZJ.LIZ, new ARunnableS4S1101000_20(i, str, this, 10));
            return;
        }
        C1278810jNn c1278810jNn = this.LIZLLL;
        synchronized (c1278810jNn) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Integer num = c1278810jNn.LJ.get(str);
            if (i <= 0) {
                if (num != null) {
                    c1278810jNn.LJ.remove(str);
                }
            } else if (num == null || num.intValue() != i) {
                c1278810jNn.LJ.put(str, Integer.valueOf(i));
            }
        }
    }
}
