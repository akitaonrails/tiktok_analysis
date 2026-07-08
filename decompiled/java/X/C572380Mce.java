package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageApiResp;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator;

/* JADX INFO: renamed from: X.0Mce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572380Mce {
    public final Text2ImageGenerator LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final CreativeInfo LIZJ;
    public final C572370Mcd LIZLLL;
    public final Context LJ;
    public final Surface LJFF;
    public final SurfaceTexture LJI;
    public final InterfaceC420801kM LJII;
    public boolean LJIIIIZZ;

    public final void LIZ() {
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        InterfaceC420801kM interfaceC420801kM = this.LJII;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LJFF.release();
        this.LJI.release();
        Text2ImageGenerator text2ImageGenerator = this.LIZ;
        C099G c099g = text2ImageGenerator.LJIIL;
        if (c099g != null) {
            c099g.LIZIZ(null);
        }
        AnonymousClass0957<Text2ImageApiResp> anonymousClass0957 = text2ImageGenerator.LJIILIIL;
        if (anonymousClass0957 != null) {
            anonymousClass0957.LIZIZ(null);
        }
    }

    public C572380Mce(Text2ImageGenerator text2ImageGenerator, VideoPublishEditModel videoPublishEditModel, CreativeInfo creativeInfo, C572370Mcd c572370Mcd, Context context, Surface surface, SurfaceTexture surfaceTexture, C11JF c11jf) {
        this.LIZ = text2ImageGenerator;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = creativeInfo;
        this.LIZLLL = c572370Mcd;
        this.LJ = context;
        this.LJFF = surface;
        this.LJI = surfaceTexture;
        this.LJII = c11jf;
    }
}
