package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ohh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483350ohh {
    public static boolean LJIIIIZZ;
    public final C0N0Y LJFF;
    public final InterfaceC1479560oba LJI;
    public long LIZ = -1;
    public long LIZIZ = -1;
    public final Object LIZJ = new Object();
    public volatile boolean LIZLLL = false;
    public int LJ = 1;
    public final Object LJII = new Object();

    public final void LIZ(boolean z) {
        if (InterfaceC1481090oe3.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preCreatePlayer force:");
            sbLIZ.append(z);
            sbLIZ.append(", mPreloaded:");
            sbLIZ.append(this.LIZLLL);
            C1481030odx.LIZJ("PreCreateHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!this.LIZLLL) {
            synchronized (this.LIZJ) {
                try {
                    if (!this.LIZLLL) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (!z && C0C64.LJIILLIIL().LJIJ(31744, 0, "player_precreateplayer", true) != 1) {
                            this.LIZLLL = true;
                            return;
                        }
                        this.LIZIZ = -1L;
                        if (this.LJ == 1 && this.LJFF.LJJIII() == null && !this.LJFF.LJIIZILJ()) {
                            this.LJI.LJLIIIL(new C1480630odJ());
                            this.LJI.init();
                            this.LJ = 2;
                        }
                        this.LIZIZ = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        this.LIZLLL = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public C1483350ohh(C0N0Y c0n0y, InterfaceC1479560oba interfaceC1479560oba) {
        this.LJFF = c0n0y;
        this.LJI = interfaceC1479560oba;
    }

    public final void LIZIZ(Aweme aweme, OnPlayerPreparedListener onPlayerPreparedListener) {
        boolean z;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_cold_start_enable_prerender", true) == 1) {
            return;
        }
        if (InterfaceC1481090oe3.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryPrepareVideo2FirstStart aweme:");
            sbLIZ.append(aweme);
            C1481030odx.LIZJ("PreCreateHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
        LIZ(true);
        if (this.LJ != 2) {
            C1832307Fp.LIZ.getClass();
            if (!C1832307Fp.LIZIZ()) {
                return;
            }
        }
        if (aweme != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.LIZ = -1L;
            C1479890oc7 c1479890oc7LIZ = C1483430ohp.LIZ(aweme, "FirstStart");
            Video video = aweme.getVideo();
            C1481230oeH.LJIIJ(C1479290ob9.LJII(C1481230oeH.LJI(video))).setSourceId(aweme.getAid());
            if (C582980Mtk.LIZIZ(aweme) || (aweme.getIsTikTokStory() && (aweme.getAwemeType() == 152 || aweme.getAwemeType() == 45 || aweme.getAwemeType() == 180))) {
                z = true;
            } else {
                z = false;
            }
            C1479720obq c1479720obq = new C1479720obq();
            c1479720obq.LIZ.LIZLLL = C1481230oeH.LJI(video);
            List<C1476750oX3> listConvertToSimAudio = Audio.convertToSimAudio(video, aweme.getAudio(), "PrepareFirstStart", aweme.getAid());
            C1479530obX c1479530obX = c1479720obq.LIZ;
            c1479530obX.LJ = listConvertToSimAudio;
            if (z) {
                c1479530obX.LJIILJJIL = null;
                c1479530obX.LJJJLL = false;
            }
            c1479530obX.LJFF = c1479890oc7LIZ;
            c1479530obX.LJIIJ = false;
            c1479530obX.LIZJ = onPlayerPreparedListener;
            C1479530obX c1479530obXLIZ = c1479720obq.LIZ();
            if (C1486210omJ.LIZ() && aweme.getVideo() != null) {
                c1479530obXLIZ.LJII = C1481230oeH.LJII(aweme.getVideo().getPlayAddrH264());
            }
            C1832307Fp.LIZ.getClass();
            if (C1832307Fp.LIZIZ()) {
                synchronized (this.LJII) {
                    try {
                        C0N0Y c0n0y = this.LJFF;
                        if (c0n0y != null) {
                            c0n0y.LJJZZIII(c1479530obXLIZ);
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } else {
                this.LJFF.LJJZZIII(c1479530obXLIZ);
            }
            this.LJ = 3;
            LJIIIIZZ = true;
            if (C0C64.LJIILLIIL().LJIJ(31744, 1, "enable_player_pre_create_pause", true) == 1) {
                this.LJI.pause();
            }
            this.LIZ = SystemClock.elapsedRealtime() - jElapsedRealtime;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("create_time", this.LIZIZ);
                jSONObject.put("prepare_time", this.LIZ);
                C20684815ws.LJIJ("pre_create_player", jSONObject);
            } catch (JSONException e) {
            }
        }
    }
}
