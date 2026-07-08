package X;

import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.StoryMultiImageParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0npu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450000npu extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1463670oBx LL;
    public final /* synthetic */ SingleImageData LLILLJJLI;
    public final /* synthetic */ C259800zU<C1450190nqD> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Float LLILZLL;
    public final /* synthetic */ ImageAlbumData LLIZ;
    public final /* synthetic */ float LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1450000npu(C1463670oBx c1463670oBx, SingleImageData singleImageData, C259800zU<C1450190nqD> c259800zU, boolean z, boolean z2, Float f, ImageAlbumData imageAlbumData, float f2) {
        super(0);
        this.LL = c1463670oBx;
        this.LLILLJJLI = singleImageData;
        this.LLILLL = c259800zU;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = f;
        this.LLIZ = imageAlbumData;
        this.LLIZLLLIL = f2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Float fValueOf;
        C1450190nqD c1450190nqD;
        C1449990npt c1449990npt = C1449990npt.LIZ;
        C1463670oBx c1463670oBx = this.LL;
        NLEModel nLEModelLIZJ = c1463670oBx.LIZJ();
        SingleImageData singleImageData = this.LLILLJJLI;
        c1449990npt.getClass();
        C1449990npt.LJI(c1463670oBx, nLEModelLIZJ, singleImageData);
        if (C295670BiP.LIZ() && (c1450190nqD = this.LLILLL.element) != null) {
            c1450190nqD.LIZ();
        }
        if (this.LLILZ) {
            if (this.LLILZIL) {
                Float f = this.LLILZLL;
                if (f != null) {
                    C386890FEx.LIZJ(f.floatValue(), this.LL.LIZJ(), this.LL, new Size(this.LLIZ.getSurfaceData().getSurfaceViewWidth(), this.LLIZ.getSurfaceData().getSurfaceViewHeight()), new Size(this.LLILLJJLI.getSrcImageInfo().getWidth(), this.LLILLJJLI.getSrcImageInfo().getHeight()), true);
                }
                this.LL.LIZJ().setCanvasRatio(this.LLIZLLLIL);
                C0FWA c0fwaLIZJ = this.LL.LIZLLL().LIZJ();
                C346940Diu c346940Diu = new C346940Diu();
                StoryMultiImageParams storyMultiImageParams = this.LLILLJJLI.getEditImageInfo().getStoryMultiImageParams();
                if (storyMultiImageParams == null || (fValueOf = storyMultiImageParams.getCropScale()) == null) {
                    fValueOf = Float.valueOf(1.0f);
                }
                c346940Diu.LIZJ = fValueOf;
                c346940Diu.LIZLLL = Float.valueOf(0.0f);
                c346940Diu.LJ = Float.valueOf(0.0f);
                c346940Diu.LJFF = Float.valueOf(0.0f);
                c346940Diu.LJI = Boolean.FALSE;
                c0fwaLIZJ.LJIIZILJ(c346940Diu);
            } else {
                C386890FEx.LIZJ(this.LLIZLLLIL, this.LL.LIZJ(), this.LL, new Size(this.LLIZ.getSurfaceData().getSurfaceViewWidth(), this.LLIZ.getSurfaceData().getSurfaceViewHeight()), new Size(this.LLILLJJLI.getSrcImageInfo().getWidth(), this.LLILLJJLI.getSrcImageInfo().getHeight()), false);
            }
        }
        this.LL.jg();
        return Unit.LIZ;
    }
}
