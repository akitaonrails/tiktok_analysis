package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nrs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451220nrs {
    public final SingleImageData LIZ;
    public final ImageAlbumData LIZIZ;
    public final C1451230nrt LIZJ;
    public final C1450610nqt LIZLLL;
    public final LiveData<InterfaceC1452170ntP> LJ;
    public final C1451190nrp LJFF;
    public final CreativeInfo LJI;
    public final CreativeModel LJII;
    public final C1DRG LJIIIIZZ;
    public final VideoPublishEditModel LJIIIZ;
    public final boolean LJIIJ;
    public final C375830EoP<Boolean> LJIIJJI;
    public final C375830EoP<Object> LJIIL;
    public final C375830EoP<C346940Diu> LJIILIIL;
    public final C375830EoP<Unit> LJIILJJIL;
    public final C375830EoP<C1451350ns5> LJIILL;
    public final C375830EoP<Bitmap> LJIILLIIL;
    public final C375830EoP<Unit> LJIIZILJ;
    public final C375830EoP<Unit> LJIJ;
    public final C375830EoP<Boolean> LJIJI;
    public final C371280Eh4 LJIJJ;

    public static C1451220nrs LIZ(C1451220nrs c1451220nrs, boolean z, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, int i) {
        SingleImageData singleImageData;
        ImageAlbumData imageAlbumData;
        C1451230nrt c1451230nrt;
        C1450610nqt c1450610nqt;
        LiveData<InterfaceC1452170ntP> liveData;
        C1451190nrp c1451190nrp;
        CreativeInfo creativeInfo;
        CreativeModel creativeModel;
        C1DRG c1drg;
        VideoPublishEditModel videoPublishEditModel;
        C375830EoP<Object> c375830EoP5;
        C375830EoP<C346940Diu> c375830EoP6;
        C375830EoP<Unit> c375830EoP7;
        C375830EoP<Unit> c375830EoP8;
        C375830EoP<Boolean> c375830EoP9;
        C375830EoP c375830EoP10 = c375830EoP4;
        C375830EoP c375830EoP11 = c375830EoP2;
        C375830EoP c375830EoP12 = c375830EoP;
        C375830EoP c375830EoP13 = c375830EoP3;
        boolean z2 = z;
        C371280Eh4 c371280Eh4 = null;
        if ((i & 1) != 0) {
            singleImageData = c1451220nrs.LIZ;
        } else {
            singleImageData = null;
        }
        if ((i & 2) != 0) {
            imageAlbumData = c1451220nrs.LIZIZ;
        } else {
            imageAlbumData = null;
        }
        if ((i & 4) != 0) {
            c1451230nrt = c1451220nrs.LIZJ;
        } else {
            c1451230nrt = null;
        }
        if ((i & 8) != 0) {
            c1450610nqt = c1451220nrs.LIZLLL;
        } else {
            c1450610nqt = null;
        }
        if ((i & 16) != 0) {
            liveData = c1451220nrs.LJ;
        } else {
            liveData = null;
        }
        if ((i & 32) != 0) {
            c1451190nrp = c1451220nrs.LJFF;
        } else {
            c1451190nrp = null;
        }
        if ((i & 64) != 0) {
            creativeInfo = c1451220nrs.LJI;
        } else {
            creativeInfo = null;
        }
        if ((i & 128) != 0) {
            creativeModel = c1451220nrs.LJII;
        } else {
            creativeModel = null;
        }
        if ((i & 256) != 0) {
            c1drg = c1451220nrs.LJIIIIZZ;
        } else {
            c1drg = null;
        }
        if ((i & 512) != 0) {
            videoPublishEditModel = c1451220nrs.LJIIIZ;
        } else {
            videoPublishEditModel = null;
        }
        if ((i & 1024) != 0) {
            z2 = c1451220nrs.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c375830EoP12 = c1451220nrs.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c375830EoP5 = c1451220nrs.LJIIL;
        } else {
            c375830EoP5 = null;
        }
        if ((i & 8192) != 0) {
            c375830EoP6 = c1451220nrs.LJIILIIL;
        } else {
            c375830EoP6 = null;
        }
        if ((i & 16384) != 0) {
            c375830EoP7 = c1451220nrs.LJIILJJIL;
        } else {
            c375830EoP7 = null;
        }
        if ((32768 & i) != 0) {
            c375830EoP11 = c1451220nrs.LJIILL;
        }
        if ((65536 & i) != 0) {
            c375830EoP13 = c1451220nrs.LJIILLIIL;
        }
        if ((131072 & i) != 0) {
            c375830EoP10 = c1451220nrs.LJIIZILJ;
        }
        if ((262144 & i) != 0) {
            c375830EoP8 = c1451220nrs.LJIJ;
        } else {
            c375830EoP8 = null;
        }
        if ((524288 & i) != 0) {
            c375830EoP9 = c1451220nrs.LJIJI;
        } else {
            c375830EoP9 = null;
        }
        if ((i & 1048576) != 0) {
            c371280Eh4 = c1451220nrs.LJIJJ;
        }
        c1451220nrs.getClass();
        return new C1451220nrs(singleImageData, imageAlbumData, c1451230nrt, c1450610nqt, liveData, c1451190nrp, creativeInfo, creativeModel, c1drg, videoPublishEditModel, z2, c375830EoP12, c375830EoP5, c375830EoP6, c375830EoP7, c375830EoP11, c375830EoP13, c375830EoP10, c375830EoP8, c375830EoP9, c371280Eh4);
    }

    public C1451220nrs(SingleImageData singleImageData, ImageAlbumData imageAlbumData, C1451230nrt c1451230nrt, C1450610nqt c1450610nqt, LiveData<InterfaceC1452170ntP> liveData, C1451190nrp c1451190nrp, CreativeInfo creativeInfo, CreativeModel creativeModel, C1DRG c1drg, VideoPublishEditModel videoPublishEditModel, boolean z, C375830EoP<Boolean> c375830EoP, C375830EoP<Object> c375830EoP2, C375830EoP<C346940Diu> c375830EoP3, C375830EoP<Unit> c375830EoP4, C375830EoP<C1451350ns5> c375830EoP5, C375830EoP<Bitmap> c375830EoP6, C375830EoP<Unit> c375830EoP7, C375830EoP<Unit> c375830EoP8, C375830EoP<Boolean> c375830EoP9, C371280Eh4 c371280Eh4) {
        this.LIZ = singleImageData;
        this.LIZIZ = imageAlbumData;
        this.LIZJ = c1451230nrt;
        this.LIZLLL = c1450610nqt;
        this.LJ = liveData;
        this.LJFF = c1451190nrp;
        this.LJI = creativeInfo;
        this.LJII = creativeModel;
        this.LJIIIIZZ = c1drg;
        this.LJIIIZ = videoPublishEditModel;
        this.LJIIJ = z;
        this.LJIIJJI = c375830EoP;
        this.LJIIL = c375830EoP2;
        this.LJIILIIL = c375830EoP3;
        this.LJIILJJIL = c375830EoP4;
        this.LJIILL = c375830EoP5;
        this.LJIILLIIL = c375830EoP6;
        this.LJIIZILJ = c375830EoP7;
        this.LJIJ = c375830EoP8;
        this.LJIJI = c375830EoP9;
        this.LJIJJ = c371280Eh4;
    }
}
