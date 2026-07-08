package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.paramsoperator.VideoProgressAdaptionParams;

/* JADX INFO: renamed from: X.15cM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20557615cM extends AbstractC20560815cs<VideoProgressAdaptionParams, VideoAdaptionResult> {
    public final C0T9Y LLIZ;
    public final Float LLJILLL;
    public final Float LLJJ;
    public final String LLILZLL = "feed_skylight_progress";
    public final Integer LLIZLLLIL = null;
    public final Integer LLJ = null;
    public final Integer LLJI = null;
    public final Integer LLJIJIL = null;
    public final Float LLJILJIL = null;
    public final Float LLJILJILJ = null;
    public final EnumC1783170wVH LLJJI = EnumC1783170wVH.MANAGER;

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC20561515cz, X.InterfaceC20562615dA
    public final EnumC1783170wVH getNodeType() {
        return this.LLJJI;
    }

    @Override // X.AbstractC20561515cz
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final void LIZJ(VideoProgressAdaptionParams videoProgressAdaptionParams) {
        int width;
        int height;
        Float translateX;
        Float translateY;
        VideoAdaptionResult initResult = videoProgressAdaptionParams.getInitResult();
        VideoAdaptionResult finalResult = videoProgressAdaptionParams.getFinalResult();
        Float f = this.LLILZIL;
        if (finalResult != null && f != null) {
            f.floatValue();
            Integer num = this.LLIZLLLIL;
            if (num != null && this.LLJ != null) {
                if (num.intValue() <= this.LLJ.intValue()) {
                    width = (int) ((C13LZ.LJ(finalResult.getWidth() - initResult.getWidth(), this.LLIZLLLIL.intValue(), this.LLJ.intValue()) * f.floatValue()) + initResult.getWidth());
                }
            } else {
                width = initResult.getWidth();
            }
            Integer num2 = this.LLJI;
            if (num2 != null && this.LLJIJIL != null) {
                if (num2.intValue() <= this.LLJIJIL.intValue()) {
                    height = (int) ((C13LZ.LJ(finalResult.getHeight() - initResult.getHeight(), this.LLJI.intValue(), this.LLJIJIL.intValue()) * f.floatValue()) + initResult.getHeight());
                }
            } else {
                height = initResult.getHeight();
            }
            Float translateX2 = initResult.getTranslateX();
            Float translateX3 = finalResult.getTranslateX();
            Float f2 = this.LLJILJIL;
            if (f2 != null && this.LLJILJILJ != null && translateX2 != null && translateX3 != null) {
                if (f2.floatValue() <= this.LLJILJILJ.floatValue()) {
                    translateX = Float.valueOf((C13LZ.LIZLLL(translateX3.floatValue() - translateX2.floatValue(), this.LLJILJIL.floatValue(), this.LLJILJILJ.floatValue()) * f.floatValue()) + translateX2.floatValue());
                }
            } else {
                translateX = initResult.getTranslateX();
            }
            Float translateY2 = initResult.getTranslateY();
            Float translateY3 = finalResult.getTranslateY();
            Float f3 = this.LLJILLL;
            if (f3 != null && this.LLJJ != null && translateY2 != null && translateY3 != null) {
                if (f3.floatValue() <= this.LLJJ.floatValue()) {
                    translateY = Float.valueOf((C13LZ.LIZLLL(translateY3.floatValue() - translateY2.floatValue(), this.LLJILLL.floatValue(), this.LLJJ.floatValue()) * f.floatValue()) + translateY2.floatValue());
                }
            } else {
                translateY = initResult.getTranslateY();
            }
            Float.valueOf(0.0f);
            initResult = new VideoAdaptionResult(width, height, translateX, translateY, null);
        }
        this.LLILZ = initResult;
        LIZLLL(initResult);
    }

    public C20557615cM(C20560215cm c20560215cm, Float f, Float f2) {
        this.LLIZ = c20560215cm;
        this.LLJILLL = f;
        this.LLJJ = f2;
    }
}
