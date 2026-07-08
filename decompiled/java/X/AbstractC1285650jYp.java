package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.lynx.animax.player.IVideoPlayer;
import com.lynx.animax.player.VideoAsset;
import com.lynx.animax.service.IAnimaXMonitorService;
import com.lynx.animax.util.AnimaXLog;
import java.util.HashMap;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1285650jYp implements IVideoPlayer {
    public VideoAsset LL;
    public SurfaceTexture LLILLJJLI;
    public Surface LLILLL;
    public float[] LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C1285670jYr LLJ;

    @Override // com.lynx.animax.player.IVideoPlayer
    public final float[] getTransformMatrix() {
        if (this.LLILZ == null) {
            this.LLILZ = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
        }
        SurfaceTexture surfaceTexture = this.LLILLJJLI;
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(this.LLILZ);
        }
        return this.LLILZ;
    }

    @Override // com.lynx.animax.player.IVideoPlayer
    public void destroy() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy: ");
        sbLIZ.append(this);
        AnimaXLog.LIZIZ("AbsVideoPlayer", C2188811AlT.LIZIZ(sbLIZ));
        this.LL = null;
        Surface surface = this.LLILLL;
        if (surface != null) {
            surface.release();
            this.LLILLL = null;
        }
        SurfaceTexture surfaceTexture = this.LLILLJJLI;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            this.LLILLJJLI.release();
            this.LLILLJJLI = null;
        }
        if (this.LLILZLL > 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(e3.e);
            sbLIZ2.append(getClass().getName());
            sbLIZ2.append("]: Error has occurred, mHasDrewOnce: ");
            sbLIZ2.append(this.LLIZ);
            sbLIZ2.append(", mHasDrewOnceAfterError: ");
            sbLIZ2.append(this.LLIZLLLIL);
            LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public AbstractC1285650jYp(C1285670jYr c1285670jYr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create: ");
        sbLIZ.append(this);
        AnimaXLog.LIZIZ("AbsVideoPlayer", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJ = c1285670jYr;
    }

    public final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append("): ");
        sbLIZ.append(str);
        AnimaXLog.LIZ("AbsVideoPlayer", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZLLL(String str) {
        LIZIZ(str);
        IAnimaXMonitorService iAnimaXMonitorService = (IAnimaXMonitorService) this.LLJ.LIZ.LIZ(IAnimaXMonitorService.class);
        if (iAnimaXMonitorService == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("code", Integer.valueOf(EnumC1285690jYt.VIDEO_PLAYER_ERROR_HAS_OCCURRED.ordinal()));
        map.put("msg", str);
        map.put("error_count", Integer.valueOf(this.LLILZLL));
        iAnimaXMonitorService.reportError(new C1288060jci(map));
    }

    @Override // com.lynx.animax.player.IVideoPlayer
    public void attachAsset(VideoAsset videoAsset) {
        if (this.LL != null) {
            AnimaXLog.LIZ("AbsVideoPlayer", "Attach asset more than once");
        } else if (videoAsset != null && videoAsset.LIZJ) {
            this.LL = videoAsset;
        } else {
            AnimaXLog.LIZ("AbsVideoPlayer", "attachAsset error: asset isn't valid");
        }
    }

    @Override // com.lynx.animax.player.IVideoPlayer
    public void setSurface(int i) {
        Surface surface = this.LLILLL;
        if (surface != null) {
            surface.release();
            this.LLILLL = null;
        }
        SurfaceTexture surfaceTexture = this.LLILLJJLI;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            this.LLILLJJLI.release();
            this.LLILLJJLI = null;
        }
        this.LLILLJJLI = new SurfaceTexture(i);
        this.LLILLL = new Surface(this.LLILLJJLI);
    }
}
