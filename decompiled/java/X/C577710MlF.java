package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MlF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577710MlF {
    public final C19EG LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final ShortVideoContext LIZLLL;
    public final FaceStickerBean LJ;
    public final BeautifySegmentInfo LJFF;
    public final int LJI;
    public final boolean LJII;
    public final ExtractFramesModel LJIIIIZZ;
    public final MediaModel LJIIIZ;
    public final Long LJIIJ;
    public final Function1<Boolean, Unit> LJIIJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C577710MlF(C19EG c19eg, String str, List<String> list, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, BeautifySegmentInfo beautifySegmentInfo, int i, boolean z, ExtractFramesModel extractFramesModel, MediaModel mediaModel, Long l, Function1<? super Boolean, Unit> function1) {
        this.LIZ = c19eg;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = shortVideoContext;
        this.LJ = faceStickerBean;
        this.LJFF = beautifySegmentInfo;
        this.LJI = i;
        this.LJII = z;
        this.LJIIIIZZ = extractFramesModel;
        this.LJIIIZ = mediaModel;
        this.LJIIJ = l;
        this.LJIIJJI = function1;
    }
}
