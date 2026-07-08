package X;

import Y.ACListenerS156S0100000_22;
import Y.ALAdapterS18S0100000_22;
import Y.AObserverS225S0100000_22;
import Y.AUListenerS0S0210002_22;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nGV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428050nGV {
    public final ViewGroup LIZ;
    public final InterfaceC1428340nGy LIZIZ;
    public final MutableLiveData<AbstractC1427970nGN> LIZJ;
    public final VideoPublishEditModel LIZLLL;
    public final ViewGroup LJ;
    public final C1427950nGL LJFF;
    public final C1427870nGD LJI;
    public final TuxIconView LJII;
    public final C01GW LJIIIIZZ;
    public final View LJIIIZ;
    public final View LJIIJ;
    public final View LJIIJJI;
    public final View LJIIL;
    public final View LJIILIIL;
    public final View LJIILJJIL;
    public final ImageView LJIILL;
    public final Rect LJIILLIIL;
    public final C1641720sp8 LJIIZILJ;
    public ValueAnimator LJIJ;

    public final void LIZJ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateView, error=");
        sbLIZ.append(z);
        C385200F8k.LIZ("PhotoTemplatePanelView", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C786410Ut5.LJLZ(8, this.LJ);
            C786410Ut5.LJLLLLLL(0, (View) this.LJIIIIZZ.getValue());
            C786410Ut5.I7(new ACListenerS156S0100000_22(this, 56), (View) this.LJIIIIZZ.getValue());
            return;
        }
        C786410Ut5.LJLZ(0, this.LJ);
        C786410Ut5.LJLLLLLL(8, (View) this.LJIIIIZZ.getValue());
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0nGZ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }, (View) this.LJIIIIZZ.getValue());
    }

    public final void LIZIZ(Bitmap bitmap, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMask, show=");
        sbLIZ.append(z);
        C385200F8k.LIZ("PhotoTemplatePanelView", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C786410Ut5.LJLLLLLL(0, this.LJIILL);
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            C01TT.LIZLLL(new AwS423S0200000_22(this, bitmap, 108));
            return;
        }
        C786410Ut5.LJLLLLLL(4, this.LJIILL);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [X.0nGW, java.lang.Object] */
    public final void LIZ(final boolean z, SingleImageData singleImageData, final Function2<? super Boolean, ? super Boolean, Unit> function2) {
        RectF rectF;
        ValueAnimator duration;
        int measuredHeight;
        int iLIZIZ;
        ValueAnimator valueAnimator;
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPanel ");
        sbLIZ.append(z);
        C385200F8k.LIZ("PhotoTemplatePanelView", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            this.LJII.setTintColorRes(R.attr.ei);
            this.LJII.setEnabled(false);
            C1427900nGG c1427900nGG = this.LJFF.LLILLJJLI;
            c1427900nGG.LLILZIL = null;
            C13BV c13bv = C13BV.INSTANCE;
            c1427900nGG.LLILZ = c13bv;
            c1427900nGG.notifyDataSetChanged();
            C1427840nGA c1427840nGA = this.LJI.LLILLJJLI;
            c1427840nGA.LLILZIL = null;
            c1427840nGA.setData(c13bv);
            this.LJIIZILJ.show();
            if (!C1441980ncy.LIZIZ(this.LIZLLL)) {
                Rect rect = this.LJIILLIIL;
                rect.left = 0;
                rect.right = 0;
                if (this.LIZIZ.mn()) {
                    i = this.LIZIZ.ej().topMargin;
                } else {
                    i = 0;
                }
                rect.top = i;
                rect.bottom = ((ScreenUtils.getFullScreenHeight(this.LIZ.getContext()) - this.LIZIZ.cn().getHeight()) - this.LJIILLIIL.top) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LIZ.getContext());
            } else {
                int i2 = C1428150nGf.LIZ;
                RectF rectFLIZJ = C1428150nGf.LIZJ();
                Rect rect2 = this.LJIILLIIL;
                rect2.left = (int) rectFLIZJ.left;
                rect2.right = (int) rectFLIZJ.right;
                rect2.bottom = (int) rectFLIZJ.bottom;
                rect2.top = (int) rectFLIZJ.top;
            }
        } else {
            this.LJIIZILJ.hide();
        }
        LIZJ(false);
        ValueAnimator valueAnimator2 = this.LJIJ;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.LJIJ) != null) {
            valueAnimator.cancel();
        }
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 850);
        ?? r13 = new InterfaceC1428100nGa() { // from class: X.0nGW
            @Override // X.InterfaceC1428100nGa
            public final void onEnd() {
                function2.invoke(Boolean.valueOf(z), Boolean.FALSE);
            }

            @Override // X.InterfaceC1428100nGa
            public final void onStart() {
                if (z) {
                    C786410Ut5.LJLLLLLL(0, this.LJIIJJI);
                    C786410Ut5.T4(this.LJIIJJI, 0.0f);
                } else {
                    C786410Ut5.LJLLLLLL(8, this.LJIIJJI);
                }
                function2.invoke(Boolean.valueOf(z), Boolean.TRUE);
            }

            @Override // X.InterfaceC1428100nGa
            public final void onProgress(float f) {
                if (z) {
                    C786410Ut5.T4(this.LJIIJJI, f);
                }
            }
        };
        if (!C1441980ncy.LIZIZ(this.LIZLLL)) {
            int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = 500;
            if (this.LIZIZ.mn()) {
                int measuredHeight2 = this.LJIIIZ.getMeasuredHeight();
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) + ScreenUtils.getStatusBarHeight(this.LIZ.getContext());
                if (measuredHeight2 <= 0) {
                    measuredHeight2 = iLIZIZ2;
                }
                measuredHeight = measuredHeight2 - this.LIZIZ.ej().topMargin;
                int measuredHeight3 = this.LJ.getMeasuredHeight();
                if (measuredHeight3 > 0) {
                    iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = measuredHeight3;
                }
                iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight += ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LIZ.getContext());
                iLIZIZ = this.LIZIZ.ej().bottomMargin;
            } else {
                measuredHeight = this.LJIIIZ.getMeasuredHeight();
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) + ScreenUtils.getStatusBarHeight(this.LIZ.getContext());
                if (measuredHeight <= 0) {
                    measuredHeight = iLIZIZ3;
                }
                int measuredHeight4 = this.LJ.getMeasuredHeight();
                if (measuredHeight4 > 0) {
                    iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = measuredHeight4;
                }
                iLIZIZ = C0LEO.LIZIZ();
            }
            int i3 = iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight - iLIZIZ;
            Size sizeN2 = this.LIZIZ.N2();
            int width = sizeN2.getWidth();
            float fMin = Math.min(width / singleImageData.getImageRatio(), sizeN2.getHeight());
            float fMin2 = Math.min(1.0f, ((sizeN2.getHeight() - measuredHeight) - i3) / fMin);
            float height = ((measuredHeight - i3) / sizeN2.getHeight()) / 2;
            if (height > 0.0f) {
                height = 0.0f;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(z);
            sbLIZ2.append(": screen={");
            sbLIZ2.append(sizeN2);
            sbLIZ2.append("}, content={");
            sbLIZ2.append(width);
            sbLIZ2.append('*');
            sbLIZ2.append(fMin);
            sbLIZ2.append("}, tools={");
            sbLIZ2.append(measuredHeight);
            sbLIZ2.append(',');
            sbLIZ2.append(i3);
            sbLIZ2.append("}, scale=");
            sbLIZ2.append(fMin2);
            sbLIZ2.append(", move=");
            sbLIZ2.append(height);
            C385200F8k.LIZ("ScalingEditPageAnimationHelper", C2188811AlT.LIZIZ(sbLIZ2));
            duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(C1619980sG4.LIZLLL());
            duration.addUpdateListener(new AUListenerS0S0210002_22(r13, z, height, fMin2, awS601S0100000_22, 1));
            duration.addListener(new ALAdapterS18S0100000_22(r13, 4));
        } else {
            int iLIZ = (int) C0JAI.LIZ(234.0f, C0CHQ.LIZ);
            RectF rectFLIZJ2 = C1428150nGf.LIZJ();
            int i4 = C1428150nGf.LIZ;
            float fHeight = rectFLIZJ2.height();
            int iLIZIZ4 = i4 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            float fLIZIZ = (C1428150nGf.LJFF - (iLIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)))) - iLIZIZ4;
            if (fLIZIZ > fHeight) {
                float f = (fLIZIZ - fHeight) / 2;
                float f2 = iLIZIZ4;
                rectF = new RectF(0.0f, f2 + f, C1428150nGf.LJI, (f2 + fLIZIZ) - f);
            } else {
                float f3 = iLIZIZ4;
                rectF = new RectF(0.0f, f3, C1428150nGf.LJI, fLIZIZ + f3);
            }
            float fHeight2 = rectF.height() / rectFLIZJ2.height();
            float f4 = rectFLIZJ2.bottom - rectF.bottom;
            duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(C1619980sG4.LIZLLL());
            duration.addUpdateListener(new AUListenerS0S0210002_22(r13, z, f4, fHeight2, awS601S0100000_22, 0));
            duration.addListener(new ALAdapterS18S0100000_22(r13, 3));
        }
        this.LJIJ = duration;
        duration.start();
    }

    public C1428050nGV(ViewGroup viewGroup, InterfaceC1428340nGy interfaceC1428340nGy, MutableLiveData<AbstractC1427970nGN> mutableLiveData, VideoPublishEditModel videoPublishEditModel) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        this.LIZ = viewGroup;
        this.LIZIZ = interfaceC1428340nGy;
        this.LIZJ = mutableLiveData;
        this.LIZLLL = videoPublishEditModel;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.kdq);
        this.LJ = viewGroup2;
        C1427950nGL c1427950nGL = (C1427950nGL) viewGroup.findViewById(R.id.kdx);
        if (C1441980ncy.LIZIZ(videoPublishEditModel)) {
            ViewGroup.LayoutParams layoutParams = c1427950nGL.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            ViewGroup.LayoutParams layoutParams2 = c1427950nGL.getLayoutParams();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1427950nGL);
            c1427950nGL.setLayoutParams(layoutParams2);
        }
        this.LJFF = c1427950nGL;
        C1427870nGD c1427870nGD = (C1427870nGD) viewGroup.findViewById(R.id.ke4);
        this.LJI = c1427870nGD;
        TuxIconView tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.ke5);
        this.LJII = tuxIconView;
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1057));
        View viewFindViewById = viewGroup.findViewById(R.id.u16);
        viewFindViewById.setPadding(0, ScreenUtils.getStatusBarHeight(viewGroup.getContext()), 0, 0);
        this.LJIIIZ = viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.u14);
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        C786410Ut5.W5(viewFindViewById2, viewFindViewById2.getLayoutParams());
        this.LJIIJ = viewFindViewById2;
        if (C1441980ncy.LIZIZ(videoPublishEditModel)) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
            viewFindViewById = viewFindViewById2;
        } else {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        this.LJIIJJI = viewFindViewById;
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.kdr);
        this.LJIIL = viewFindViewById3;
        View viewFindViewById4 = viewFindViewById.findViewById(R.id.ke3);
        this.LJIILIIL = viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.ke2);
        this.LJIILJJIL = viewFindViewById5;
        this.LJIILL = (ImageView) viewGroup.findViewById(R.id.kdv);
        this.LJIILLIIL = new Rect();
        c1427950nGL.setEvent(mutableLiveData);
        c1427870nGD.setEvent(mutableLiveData);
        this.LJIIZILJ = new C1641720sp8(viewGroup2, null, viewGroup2, AFwS261S0000000_22.get$arr$(347));
        C786410Ut5.I7(new ACListenerS156S0100000_22(this, 52), viewFindViewById3);
        C786410Ut5.I7(new ACListenerS156S0100000_22(this, 53), viewFindViewById4);
        C786410Ut5.a9(tuxIconView, new ACListenerS156S0100000_22(this, 54));
        viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: X.0nGX
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: X.0nGY
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        C786410Ut5.I7(new ACListenerS156S0100000_22(this, 55), viewFindViewById5);
        mutableLiveData.observeForever(new AObserverS225S0100000_22(this, 184));
    }
}
