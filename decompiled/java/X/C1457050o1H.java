package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0o1H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457050o1H {
    public final VideoPublishEditModel LIZ;
    public String LIZIZ;
    public C0MBV LIZJ;
    public int LIZLLL;
    public Function0<Unit> LJ;
    public int LJFF;
    public final long LJI;
    public Function1<? super Bitmap, Unit> LJII;
    public InterfaceC1452170ntP LJIIIIZZ;
    public Function1<? super Bitmap, Bitmap> LJIIIZ;
    public InterfaceC1457180o1U LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final boolean LJIILIIL;
    public final int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public Bitmap.CompressFormat LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public int LJJ;
    public int LJJI;

    public final String toString() {
        return "ExtractCoverNewConfig(model=" + this.LIZ + ", savePath=" + this.LIZIZ + ", successListener=" + this.LIZJ + ", scene=" + this.LIZLLL + ", onStart=" + this.LJ + ", timeStamp=" + this.LJFF + ", currentTime=" + this.LJI + ", bitmapListener=" + this.LJII + ", veEditor=" + this.LJIIIIZZ + ", converter=" + this.LJIIIZ + ", errorListener=" + this.LJIIJ + ", getCoverWithoutSeek=" + this.LJIIJJI + ", runInBackground=" + this.LJIIL + ", handleBitmapInBackground=" + this.LJIILIIL + ", type=" + this.LJIILJJIL + ", cornerRadius=" + this.LJIILL + ", saveQuality=" + this.LJIILLIIL + ", format=" + this.LJIIZILJ + ", sync=" + this.LJIJ + ", aboutEffect=" + this.LJIJI + ", bitmapDelete=" + this.LJIJJ + ", fromDraftList=" + this.LJIJJLI + ", fromStoryPublishCoverFlow=" + this.LJIL + ')';
    }

    public C1457050o1H(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        int videoCoverStartTm = (int) (videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C1428470nHB.LLIIIJ(videoPublishEditModel) || (C1455550nyr.LIZIZ() && !videoPublishEditModel.isMvThemeVideoType() && videoPublishEditModel.getCanvasVideoData() == null)) {
            z = true;
        } else {
            z = false;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LJ = null;
        this.LJFF = videoCoverStartTm;
        this.LJI = jCurrentTimeMillis;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = z;
        this.LJIIL = true;
        this.LJIILIIL = true;
        this.LJIILJJIL = 3;
        this.LJIILL = iLIZIZ;
        this.LJIILLIIL = 100;
        this.LJIIZILJ = compressFormat;
        this.LJIJ = false;
        this.LJIJI = false;
        this.LJIJJ = false;
        this.LJIJJLI = false;
        this.LJIL = false;
        this.LJJ = -1;
        this.LJJI = -1;
    }
}
