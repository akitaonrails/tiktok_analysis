package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.creative.model.edit.StoryMultiImageParams;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450970nrT extends AbstractC2255721DQs<InterfaceC1451100nrg> implements InterfaceC1451100nrg {
    public static final int LLILZ = 8;
    public final C1DRG LL;
    public final InterfaceC1451100nrg LLILLJJLI = this;
    public final float LLILLL = C418440Gaw.LIZIZ(Float.valueOf(12.0f));

    @Override // X.InterfaceC1451100nrg
    public boolean c61() {
        return true;
    }

    @Override // X.InterfaceC1451100nrg
    public int sG2() {
        return 4;
    }

    public InterfaceC1451100nrg W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1450970nrT(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1451100nrg
    public View AK1(Context context) {
        return new C1450980nrU(context);
    }

    @Override // X.InterfaceC1451100nrg
    public void oG1(ImageView imageView) {
        C786410Ut5.Qb(imageView, 1.0f);
        C786410Ut5.rc(imageView, 1.0f);
    }

    @Override // X.InterfaceC1451100nrg
    public void uF1(View view) {
        if (view != null) {
            C1447470nlp.LIZIZ(view, this.LLILLL);
        }
    }

    @Override // X.InterfaceC1451100nrg
    public Float wM2(StoryMultiImageParams storyMultiImageParams) {
        Float cropScale;
        if (storyMultiImageParams == null || (cropScale = storyMultiImageParams.getCropScale()) == null) {
            return null;
        }
        float fFloatValue = cropScale.floatValue();
        if (fFloatValue <= 1.0f) {
            return null;
        }
        return Float.valueOf(fFloatValue);
    }

    @Override // X.InterfaceC1451100nrg
    public void xH2(View view) {
        C1450980nrU c1450980nrU;
        if ((view instanceof C1450980nrU) && (c1450980nrU = (C1450980nrU) view) != null) {
            c1450980nrU.setCornerRadius(0.0f);
            c1450980nrU.setStoryCornerRadius(this.LLILLL);
            c1450980nrU.invalidate();
        }
    }

    @Override // X.InterfaceC1451100nrg
    public float E50(float f, StoryMultiImageParams storyMultiImageParams) {
        Float cropScale;
        if (storyMultiImageParams != null) {
            if (storyMultiImageParams.getBgColorStart() != null) {
                if (storyMultiImageParams.getCropScale() == null) {
                    return f;
                }
            } else if (storyMultiImageParams == null) {
                return f;
            }
            if (storyMultiImageParams.getBgColorStart() != null || (storyMultiImageParams != null && (cropScale = storyMultiImageParams.getCropScale()) != null && cropScale.floatValue() > 1.0f)) {
                return 0.5625f;
            }
            return f;
        }
        return f;
    }

    @Override // X.InterfaceC1451100nrg
    public void N60(ImageView imageView, StoryMultiImageParams storyMultiImageParams) {
        Float fWM2 = wM2(storyMultiImageParams);
        if (fWM2 != null) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            C786410Ut5.Qb(imageView, fWM2.floatValue());
            C786410Ut5.rc(imageView, fWM2.floatValue());
            return;
        }
        oG1(imageView);
    }

    @Override // X.InterfaceC1451100nrg
    public void pG0(ImageView imageView, StoryMultiImageParams storyMultiImageParams) {
        Integer bgColorStart;
        if (storyMultiImageParams != null && (bgColorStart = storyMultiImageParams.getBgColorStart()) != null) {
            int iIntValue = bgColorStart.intValue();
            Integer bgColorEnd = storyMultiImageParams.getBgColorEnd();
            if (bgColorEnd != null) {
                imageView.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iIntValue, bgColorEnd.intValue()}));
            }
        }
    }

    @Override // X.InterfaceC1451100nrg
    public void UO1(View view, View view2, View view3) {
        C1836880xtu c1836880xtu;
        C1447470nlp.LIZIZ(view, this.LLILLL);
        C1447470nlp.LIZIZ(view2, this.LLILLL);
        if ((view3 instanceof C1450980nrU) && (c1836880xtu = (C1836880xtu) view3) != null) {
            c1836880xtu.setCornerRadius(this.LLILLL);
        }
    }

    @Override // X.InterfaceC1451100nrg
    public void tl2(View view, StoryMultiImageParams storyMultiImageParams, Function1<? super Float, Rect> function1) {
        C1450980nrU c1450980nrU;
        Integer bgColorStart;
        Integer bgColorEnd = null;
        if ((view instanceof C1450980nrU) && (c1450980nrU = (C1450980nrU) view) != null) {
            if (storyMultiImageParams != null) {
                bgColorStart = storyMultiImageParams.getBgColorStart();
            } else {
                bgColorStart = null;
            }
            c1450980nrU.setStoryBgColorStart(bgColorStart);
            if (storyMultiImageParams != null) {
                bgColorEnd = storyMultiImageParams.getBgColorEnd();
            }
            c1450980nrU.setStoryBgColorEnd(bgColorEnd);
            if (c1450980nrU.getStoryBgColorStart() != null) {
                c1450980nrU.setStoryVisibleRect(function1.invoke(Float.valueOf(0.5625f)));
            }
        }
    }
}
