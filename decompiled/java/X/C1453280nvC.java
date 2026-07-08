package X;

import Y.ARunnableS27S1100000_22;
import Y.ARunnableS41S0110000_22;
import Y.ARunnableS91S0200000_22;
import Y.ATListenerS455S0100000_22;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageTransformParams;
import com.ss.android.ugc.aweme.creative.model.edit.SingleAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.image.adjust.ImageAdjustViewModel;
import com.ss.android.ugc.aweme.image.thumbnail.CenterLinearLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import irm.AkS90S0100000_22;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453280nvC extends Scene implements InterfaceC362610EJn, InterfaceC379610EuV, InterfaceC1171660gay {
    public static final C1453640nvm LLLIIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public static final int LLLIIIL;
    public static final int LLLIIL;
    public final C1DRG LLJI;
    public View LLJIJIL;
    public RecyclerView LLJILJIL;
    public TextView LLJILJILJ;
    public TextView LLJILLL;
    public C367060EaG LLJJ;
    public TextView LLJJI;
    public TuxIconView LLJJIII;
    public TuxIconView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public View LLJJIJIL;
    public boolean LLJJJ;
    public long LLJJJJLIIL;
    public final C1664750tQH LLJLIL;
    public C1836880xtu LLJLILLLLZIIL;
    public SingleImageData LLJLL;
    public final C1664750tQH LLJLLL;
    public final C1664750tQH LLJZ;
    public final C1664750tQH LLJZIJLIL;
    public C1450610nqt LLL;
    public ValueAnimator LLLF;
    public float LLLFZ;
    public boolean LLLII;
    public final C1453320nvG LLJJJIL = new C1453320nvG();
    public final C1453550nvd LLJJJJ = new C1453550nvd();
    public String LLJJJJJIL = "";
    public final int LLJJL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    public final SafeHandler LLJJLIIIJLLLLLLLZ = new SafeHandler(this);
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 865));
    public Map<String, SingleAdjustInfo> LLJLLIL = new LinkedHashMap();
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS566S0100000_22(this, 863));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 864));
    public float LLLI = 1.0f;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0nvm] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1453280nvC.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1453280nvC.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C1453280nvC.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0), new C2217381BqS(C1453280nvC.class, "avListenableActivityRegistry", "getAvListenableActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0)};
        LLLIIII = new Object() { // from class: X.0nvm
        };
        LLLIIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        LLLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final float LLLIILIL() {
        return ((Number) this.LLLFFI.getValue()).floatValue();
    }

    public final InterfaceC1455860nzM LLLIL() {
        return (InterfaceC1455860nzM) this.LLJLLL.getValue(this, LLLIIIIL[1]);
    }

    public final InterfaceC1450920nrO LLLILZ() {
        return (InterfaceC1450920nrO) this.LLJZ.getValue(this, LLLIIIIL[2]);
    }

    public final VideoPublishEditModel LLLILZLLLI() {
        return (VideoPublishEditModel) this.LLJLIL.getValue(this, LLLIIIIL[0]);
    }

    public final void LLLLIL() {
        TuxIconView tuxIconView = this.LLJJIII;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        boolean z = !this.LLJJJJ.LIZ.isEmpty();
        int i = R.attr.zi;
        tuxIconView.setTintColorRes(z ? R.attr.zi : R.attr.zk);
        TuxIconView tuxIconView2 = this.LLJJIJI;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        if (!(!this.LLJJJJ.LIZIZ.isEmpty())) {
            i = R.attr.zk;
        }
        tuxIconView2.setTintColorRes(i);
        boolean zLIZ = C1403980mdg.LIZ(this.LLJLLIL);
        TuxIconView tuxIconView3 = this.LLJJIJIIJIL;
        C1428310nGv.LJIIIIZZ(tuxIconView3 != null ? tuxIconView3 : null, zLIZ);
    }

    public final int LLLIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPreviewMaskHeight ");
        View view = this.LLJJIJIL;
        if (view == null) {
            view = null;
        }
        sbLIZ.append(view.getHeight());
        sbLIZ.append(' ');
        View view2 = this.LLJIJIL;
        if (view2 == null) {
            view2 = null;
        }
        sbLIZ.append(view2.getHeight());
        sbLIZ.append(' ');
        View view3 = this.LLJIJIL;
        if (view3 == null) {
            view3 = null;
        }
        sbLIZ.append(view3.getLayoutParams().height);
        C2188811AlT.LIZIZ(sbLIZ);
        View view4 = this.LLJJIJIL;
        if (view4 == null) {
            view4 = null;
        }
        int height = view4.getHeight();
        View view5 = this.LLJIJIL;
        return (height - (view5 != null ? view5 : null).getLayoutParams().height) - (LLLIIIL * 2);
    }

    public final int LLLJ() {
        return ScreenUtils.getScreenWidth(requireSceneContext()) - (LLLIIL * 2);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C1453280nvC(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJLIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJLLL = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLJZ = C1664770tQJ.LIZ(c1drg, InterfaceC1450920nrO.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZ(c1drg, InterfaceC524950KiL.class, null);
    }

    public final void LLLIIIIL(Map<String, SingleAdjustInfo> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ARunnableS91S0200000_22 aRunnableS91S0200000_22 = new ARunnableS91S0200000_22(map, this, 32);
        if (jCurrentTimeMillis - this.LLJJJJLIIL < this.LLJJL) {
            this.LLJJLIIIJLLLLLLLZ.removeCallbacksAndMessages(null);
            this.LLJJLIIIJLLLLLLLZ.postDelayed(aRunnableS91S0200000_22, ((long) this.LLJJL) - (jCurrentTimeMillis - this.LLJJJJLIIL));
        } else {
            aRunnableS91S0200000_22.run();
        }
    }

    public final void LLLLII(boolean z) {
        if (this.LLJJJ) {
            return;
        }
        View view = null;
        if (z) {
            this.LLLII = false;
            C1456140nzo.LIZIZ(LLLIL(), false, false, false, false, 12);
            C19A3 c19a3 = (C19A3) this.mParentScene;
            if (c19a3 != null) {
                c19a3.show(this);
            }
            SingleImageData singleImageDataOR1 = LLLILZ().OR1();
            if (singleImageDataOR1.getAdjustInfo() == null) {
                singleImageDataOR1.setAdjustInfo(new ImageAdjustInfo(null, 1, null));
            }
            ImageAdjustInfo adjustInfo = singleImageDataOR1.getAdjustInfo();
            if (adjustInfo != null) {
                if (adjustInfo.getAdjustMap().isEmpty()) {
                    adjustInfo.setAdjustMap(new LinkedHashMap(C1451990nt7.LIZ()));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(adjustInfo.getAdjustMap());
                this.LLJLLIL = linkedHashMap;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    this.LLJJJIL.LLLFZ(str, C1404000mdi.LIZLLL(((SingleAdjustInfo) entry.getValue()).getIntensity(), str));
                }
            }
            this.LLJLL = singleImageDataOR1;
            this.LLJLILLLLZIIL = LLLILZ().wf2();
            this.LLL = (C1450610nqt) LLLILZ().V51(C1450610nqt.class);
            this.LLLFZ = C1450870nrJ.LIZ / 2;
            C1453550nvd c1453550nvd = this.LLJJJJ;
            c1453550nvd.LIZ.clear();
            c1453550nvd.LIZIZ.clear();
            LLLLIL();
            C367060EaG c367060EaG = this.LLJJ;
            if (c367060EaG == null) {
                c367060EaG = null;
            }
            C436180H8m.LIZIZ(c367060EaG);
            C1453320nvG c1453320nvG = this.LLJJJIL;
            c1453320nvG.LLILLJJLI = "";
            C1453340nvI c1453340nvI = c1453320nvG.LLILLL;
            if (c1453340nvI != null) {
                c1453340nvI.I5(false);
            }
            c1453320nvG.LLILLL = null;
            LLLILZ().NH0(true);
            LLLIL().vW1().setValue(C1452730nuJ.LIZJ());
        } else {
            C367060EaG c367060EaG2 = this.LLJJ;
            if (c367060EaG2 == null) {
                c367060EaG2 = null;
            }
            C786410Ut5.LJLLLLLL(4, c367060EaG2);
            TuxIconView tuxIconView = this.LLJJIJIIJIL;
            if (tuxIconView == null) {
                tuxIconView = null;
            }
            C337180DJs.LIZ(tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLJJIJI;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(0, tuxIconView2);
        } else {
            C786410Ut5.LJLLLLLL(4, tuxIconView2);
        }
        TuxIconView tuxIconView3 = this.LLJJIII;
        if (tuxIconView3 == null) {
            tuxIconView3 = null;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(0, tuxIconView3);
        } else {
            C786410Ut5.LJLLLLLL(4, tuxIconView3);
        }
        View view2 = this.LLJJIJIL;
        if (view2 == null) {
            view2 = null;
        }
        if (view2.getMeasuredHeight() > 0) {
            LLLLIIIILLL(z);
        } else {
            View view3 = this.LLJJIJIL;
            if (view3 == null) {
                view3 = null;
            }
            HandlerHook.viewPost(view3, new ARunnableS41S0110000_22(this, z, 5));
        }
        this.LLJJJ = true;
        View view4 = this.LLJIJIL;
        if (view4 != null) {
            view = view4;
        }
        C1462750oAT.LIZIZ(view, z, view.getHeight(), new View(requireSceneContext()), new C1466780oGy(this, z, 2));
        ((ImageAdjustViewModel) this.LLJL.getValue()).si(z);
    }

    public final void LLLLIIIILLL(final boolean z) {
        float scale;
        float imageRatio;
        SrcImageInfo srcImageInfo;
        float f;
        final float f2;
        final float fLLLIILIL;
        EditImageInfo editImageInfo;
        EditImageInfo editImageInfo2;
        ImageTransformParams canvasTransformParams;
        C1836880xtu c1836880xtu;
        float imageRatio2;
        SrcImageInfo srcImageInfo2;
        Rect rect;
        EditImageInfo editImageInfo3;
        if (C1441980ncy.LIZIZ(LLLILZLLLI())) {
            if (!z) {
                LLLILZ().NH0(false);
                return;
            }
            return;
        }
        final float f3 = 1.0f;
        if (z && (c1836880xtu = this.LLJLILLLLZIIL) != null) {
            SingleImageData singleImageData = this.LLJLL;
            if (singleImageData != null && (editImageInfo3 = singleImageData.getEditImageInfo()) != null) {
                imageRatio2 = editImageInfo3.getRatio();
            } else {
                SingleImageData singleImageData2 = this.LLJLL;
                if (singleImageData2 != null && (srcImageInfo2 = singleImageData2.getSrcImageInfo()) != null) {
                    imageRatio2 = srcImageInfo2.getImageRatio();
                } else {
                    imageRatio2 = 1.0f;
                }
            }
            float fLLLJ = (LLLJ() * 1.0f) / LLLIZZ();
            int screenWidth = ScreenUtils.getScreenWidth(requireSceneContext());
            if (imageRatio2 < fLLLJ) {
                int iLLLIZZ = (int) ((screenWidth - (imageRatio2 * LLLIZZ())) / 2);
                int iIntValue = LLLIIIL + ((Number) this.LLLFF.getValue()).intValue();
                rect = new Rect(iLLLIZZ, iIntValue, screenWidth - iLLLIZZ, LLLIZZ() + iIntValue);
            } else {
                float fLLLJ2 = LLLJ() / imageRatio2;
                int iLLLIZZ2 = ((int) ((LLLIZZ() - fLLLJ2) / 2)) + LLLIIIL + ((Number) this.LLLFF.getValue()).intValue();
                int i = LLLIIL;
                rect = new Rect(i, iLLLIZZ2, screenWidth - i, (int) (iLLLIZZ2 + fLLLJ2));
            }
            c1836880xtu.setCropRect(rect);
        }
        SingleImageData singleImageData3 = this.LLJLL;
        if (singleImageData3 != null && (editImageInfo2 = singleImageData3.getEditImageInfo()) != null && (canvasTransformParams = editImageInfo2.getCanvasTransformParams()) != null) {
            scale = canvasTransformParams.getScale();
        } else {
            scale = 1.0f;
        }
        SingleImageData singleImageData4 = this.LLJLL;
        if (singleImageData4 != null && (editImageInfo = singleImageData4.getEditImageInfo()) != null) {
            imageRatio = editImageInfo.getRatio();
        } else {
            SingleImageData singleImageData5 = this.LLJLL;
            if (singleImageData5 != null && (srcImageInfo = singleImageData5.getSrcImageInfo()) != null) {
                imageRatio = srcImageInfo.getImageRatio();
            } else {
                imageRatio = 1.0f;
            }
        }
        if (imageRatio < (LLLJ() * 1.0f) / LLLIZZ()) {
            this.LLLI = (LLLIZZ() * imageRatio) / C1450870nrJ.LIZIZ;
        } else {
            this.LLLI = (LLLJ() * 1.0f) / C1450870nrJ.LIZIZ;
        }
        float f4 = this.LLLI * scale;
        this.LLLF = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        final C817403Hg c817403Hg = new C817403Hg();
        if (z) {
            f = scale;
        } else {
            f = f4;
        }
        c817403Hg.element = f;
        final C817403Hg c817403Hg2 = new C817403Hg();
        if (z) {
            scale = f4;
        }
        c817403Hg2.element = scale;
        if (z) {
            LLLIILIL();
        } else {
            LLLIILIL();
        }
        final C817403Hg c817403Hg3 = new C817403Hg();
        c817403Hg3.element = c817403Hg.element;
        if (z) {
            f2 = 1.0f;
            f3 = this.LLLI;
        } else {
            f2 = this.LLLI;
        }
        final float fLLLIILIL2 = 0.0f;
        if (z) {
            fLLLIILIL = 0.0f;
            fLLLIILIL2 = (LLLIILIL() - this.LLLFZ) / C1450870nrJ.LIZ;
        } else {
            fLLLIILIL = (LLLIILIL() - this.LLLFZ) / C1450870nrJ.LIZ;
        }
        ValueAnimator valueAnimator = this.LLLF;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0niK
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f5 = c817403Hg.element;
                    float f6 = f5 + ((c817403Hg2.element - f5) * fFloatValue);
                    float f7 = f2;
                    float f8 = f7 + ((f3 - f7) * fFloatValue);
                    InterfaceC1455860nzM interfaceC1455860nzMLLLIL = this.LLLIL();
                    C346940Diu c346940Diu = new C346940Diu();
                    float f9 = fLLLIILIL;
                    float f10 = fLLLIILIL2;
                    c346940Diu.LIZJ = Float.valueOf(f8);
                    c346940Diu.LJ = Float.valueOf(f9 + ((f10 - f9) * fFloatValue));
                    interfaceC1455860nzMLLLIL.cv0(c346940Diu, false);
                    C1836880xtu c1836880xtu2 = this.LLJLILLLLZIIL;
                    if (c1836880xtu2 != null) {
                        c1836880xtu2.LIZLLL(fFloatValue, z);
                    }
                    c817403Hg3.element = f6;
                }
            });
        }
        ValueAnimator valueAnimator2 = this.LLLF;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new AnimatorListenerAdapter(this) { // from class: X.0nqq
                public final /* synthetic */ C1453280nvC LLILLJJLI;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (!z) {
                        this.LLILLJJLI.LLLILZ().NH0(false);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    C1836880xtu c1836880xtu2 = this.LLILLJJLI.LLJLILLLLZIIL;
                    if (c1836880xtu2 != null) {
                        C786410Ut5.LJLLLLLL(0, c1836880xtu2);
                    }
                }

                {
                    this.LLILLJJLI = this;
                }
            });
        }
        ValueAnimator valueAnimator3 = this.LLLF;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public final void LLLLIILL(String str) {
        if (Intrinsics.LJFF(str, "color_enhance") && C1441980ncy.LIZIZ(LLLILZLLLI())) {
            return;
        }
        RecyclerView recyclerView = this.LLJILJIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        HandlerHook.viewPost(recyclerView, new ARunnableS27S1100000_22(this, str, 3));
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJIJIL = requireViewById(R.id.eqx);
        this.LLJIJIL = requireViewById(R.id.cfl);
        this.LLJILJIL = (RecyclerView) requireViewById(R.id.ai5);
        this.LLJILJILJ = (TextView) requireViewById(R.id.zbp);
        this.LLJILLL = (TextView) requireViewById(R.id.tv_save);
        this.LLJJ = (C367060EaG) requireViewById(R.id.ai7);
        this.LLJJI = (TextView) requireViewById(R.id.ujr);
        this.LLJJIII = (TuxIconView) requireViewById(R.id.undo);
        this.LLJJIJI = (TuxIconView) requireViewById(R.id.t1i);
        this.LLJJIJIIJIL = (TuxIconView) requireViewById(R.id.eng);
        View view = this.LLJJIJIL;
        TuxIconView tuxIconView = null;
        if (view == null) {
            view = null;
        }
        C1428310nGv.LJI(0, view, true);
        View view2 = this.LLJJIJIL;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0nvn
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                return true;
            }
        });
        if (C1441980ncy.LIZIZ(LLLILZLLLI())) {
            View view3 = this.LLJIJIL;
            if (view3 == null) {
                view3 = null;
            }
            view3.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(144));
        }
        TextView textView = this.LLJILJILJ;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.I7(new AkS90S0100000_22(this, 21), textView);
        TextView textView2 = this.LLJILLL;
        if (textView2 == null) {
            textView2 = null;
        }
        C786410Ut5.I7(new AkS90S0100000_22(this, 22), textView2);
        TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        tuxIconView2.setOnTouchListener(new ATListenerS455S0100000_22(this, 7));
        RecyclerView recyclerView = this.LLJILJIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new CenterLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.LLJJJIL);
        if (C1441980ncy.LIZIZ(LLLILZLLLI())) {
            this.LLJJJIL.LLILZIL = true;
            C426750GoL.LJIIL(recyclerView, Integer.valueOf(recyclerView.getPaddingLeft()), 0, Integer.valueOf(recyclerView.getPaddingRight()), 0, 16);
        }
        this.LLJJJIL.LLILZ = new InterfaceC1453780nw0() { // from class: X.0nvH
            @Override // X.InterfaceC1453780nw0
            public final void LIZ(int i) {
                float intensity;
                String str = this.LIZ.LLJJJIL.LLILLJJLI;
                float fLIZIZ = C1404000mdi.LIZIZ(str);
                SingleAdjustInfo singleAdjustInfo = (SingleAdjustInfo) ((LinkedHashMap) this.LIZ.LLJLLIL).get(str);
                if (singleAdjustInfo != null) {
                    intensity = singleAdjustInfo.getIntensity();
                } else {
                    intensity = fLIZIZ;
                }
                Pair pairLIZJ = C1404000mdi.LIZJ(str);
                int iIntValue = ((Number) pairLIZJ.getFirst()).intValue();
                int iIntValue2 = ((Number) pairLIZJ.getSecond()).intValue();
                C1403960mde c1403960mde = C1403960mde.LIZ;
                VideoPublishEditModel videoPublishEditModelLLLILZLLLI = this.LIZ.LLLILZLLLI();
                c1403960mde.getClass();
                C0LAB c0labLIZJ = C1403960mde.LIZJ(videoPublishEditModelLLLILZLLLI);
                c0labLIZJ.LJ("adjust_function", a0.LJJJJZ("adjust_item_", str));
                C20684815ws.LJIILLIIL("adjust_click", c0labLIZJ.LIZ);
                C1453280nvC c1453280nvC = this.LIZ;
                c1453280nvC.LLJJJJJIL = str;
                C367060EaG c367060EaG = c1453280nvC.LLJJ;
                RecyclerView recyclerView2 = null;
                if (c367060EaG == null) {
                    c367060EaG = null;
                }
                c367060EaG.LJIIIIZZ(iIntValue, iIntValue2);
                C367060EaG c367060EaG2 = this.LIZ.LLJJ;
                if (c367060EaG2 == null) {
                    c367060EaG2 = null;
                }
                c367060EaG2.setDrawBeginScale(fLIZIZ);
                C367060EaG c367060EaG3 = this.LIZ.LLJJ;
                if (c367060EaG3 == null) {
                    c367060EaG3 = null;
                }
                c367060EaG3.setScale(intensity);
                if (Intrinsics.LJFF(str, "adjust_item_enhance") && intensity == 0.0f) {
                    C1453280nvC c1453280nvC2 = this.LIZ;
                    if (!c1453280nvC2.LLLII) {
                        C367060EaG c367060EaG4 = c1453280nvC2.LLJJ;
                        if (c367060EaG4 == null) {
                            c367060EaG4 = null;
                        }
                        c367060EaG4.setScale(0.8f);
                        this.LIZ.LLLII(0.8f, str);
                        C1453280nvC c1453280nvC3 = this.LIZ;
                        c1453280nvC3.LLLII = true;
                        C1453580nvg c1453580nvg = new C1453580nvg(str, intensity, 0.8f);
                        C1453550nvd c1453550nvd = c1453280nvC3.LLJJJJ;
                        c1453550nvd.LIZ.addLast(c1453580nvg);
                        c1453550nvd.LIZIZ.clear();
                        InterfaceC1453560nve interfaceC1453560nve = c1453550nvd.LIZJ;
                        if (interfaceC1453560nve != null) {
                            interfaceC1453560nve.LIZLLL(c1453580nvg);
                        }
                    }
                }
                C367060EaG c367060EaG5 = this.LIZ.LLJJ;
                if (c367060EaG5 == null) {
                    c367060EaG5 = null;
                }
                C786410Ut5.LJLLLLLL(0, c367060EaG5);
                RecyclerView recyclerView3 = this.LIZ.LLJILJIL;
                if (recyclerView3 != null) {
                    recyclerView2 = recyclerView3;
                }
                recyclerView2.smoothScrollToPosition(i);
            }
        };
        TextView textView3 = this.LLJJI;
        if (textView3 == null) {
            textView3 = null;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zh);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        TextView textView4 = this.LLJJI;
        if (textView4 == null) {
            textView4 = null;
        }
        textView3.setBackground(c384050F3z.LIZ(textView4.getContext()));
        C367060EaG c367060EaG = this.LLJJ;
        if (c367060EaG == null) {
            c367060EaG = null;
        }
        C786410Ut5.zb(c367060EaG, new SeekBar.OnSeekBarChangeListener() { // from class: X.0nvK
            public float LL;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                TextView textView5 = this.LLILLJJLI.LLJJI;
                if (textView5 == null) {
                    textView5 = null;
                }
                C12C5.LIZIZ(textView5, 200L, 0.0f, C1619980sG4.LJ(), 2);
                C367060EaG c367060EaG2 = (C367060EaG) seekBar;
                c367060EaG2.LJII(true);
                this.LL = c367060EaG2.getScale();
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                TextView textView5 = this.LLILLJJLI.LLJJI;
                if (textView5 == null) {
                    textView5 = null;
                }
                C12C5.LIZJ(textView5, 200L, C1619980sG4.LJ(), new AwS566S0100000_22(this.LLILLJJLI, 866), 2);
                C367060EaG c367060EaG2 = (C367060EaG) seekBar;
                c367060EaG2.LJII(false);
                float scale = c367060EaG2.getScale();
                C1453280nvC c1453280nvC = this.LLILLJJLI;
                C1453580nvg c1453580nvg = new C1453580nvg(c1453280nvC.LLJJJJJIL, this.LL, scale);
                C1453550nvd c1453550nvd = c1453280nvC.LLJJJJ;
                c1453550nvd.LIZ.addLast(c1453580nvg);
                c1453550nvd.LIZIZ.clear();
                InterfaceC1453560nve interfaceC1453560nve = c1453550nvd.LIZJ;
                if (interfaceC1453560nve != null) {
                    interfaceC1453560nve.LIZLLL(c1453580nvg);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    C1453280nvC c1453280nvC = this.LLILLJJLI;
                    c1453280nvC.LLLII((i * 1.0f) / seekBar.getMax(), c1453280nvC.LLJJJJJIL);
                    if (i != 0 && i != 100 && i != 200) {
                        return;
                    }
                    new C0ZDN(this.LLILLJJLI.requireSceneContext()).LIZ(0);
                }
            }
        });
        TuxIconView tuxIconView3 = this.LLJJIII;
        if (tuxIconView3 == null) {
            tuxIconView3 = null;
        }
        C786410Ut5.I7(new AkS90S0100000_22(this, 23), tuxIconView3);
        TuxIconView tuxIconView4 = this.LLJJIJI;
        if (tuxIconView4 != null) {
            tuxIconView = tuxIconView4;
        }
        C786410Ut5.I7(new AkS90S0100000_22(this, 24), tuxIconView);
        this.LLJJJJ.LIZJ = new InterfaceC1453560nve() { // from class: X.0nvJ
            @Override // X.InterfaceC1453560nve
            public final void LIZIZ(C1453580nvg c1453580nvg) {
                this.LIZ.LLLLIL();
                C1403960mde c1403960mde = C1403960mde.LIZ;
                VideoPublishEditModel videoPublishEditModelLLLILZLLLI = this.LIZ.LLLILZLLLI();
                String str = c1453580nvg.LIZ;
                float f = c1453580nvg.LIZJ;
                c1403960mde.getClass();
                C0LAB c0labLIZJ = C1403960mde.LIZJ(videoPublishEditModelLLLILZLLLI);
                c0labLIZJ.LJ("adjust_function", a0.LJJJJZ("adjust_item_", str));
                c0labLIZJ.LIZ(C1404000mdi.LIZ(f, str), "adjust_level_from");
                C20684815ws.LJIILLIIL("adjust_undo", c0labLIZJ.LIZ);
            }

            @Override // X.InterfaceC1453560nve
            public final void LIZJ(C1453580nvg c1453580nvg) {
                this.LIZ.LLLLIL();
                C1403960mde c1403960mde = C1403960mde.LIZ;
                VideoPublishEditModel videoPublishEditModelLLLILZLLLI = this.LIZ.LLLILZLLLI();
                String str = c1453580nvg.LIZ;
                float f = c1453580nvg.LIZJ;
                c1403960mde.getClass();
                C0LAB c0labLIZJ = C1403960mde.LIZJ(videoPublishEditModelLLLILZLLLI);
                c0labLIZJ.LJ("adjust_function", a0.LJJJJZ("adjust_item_", str));
                c0labLIZJ.LIZ(C1404000mdi.LIZ(f, str), "adjust_level_to");
                C20684815ws.LJIILLIIL("adjust_redo", c0labLIZJ.LIZ);
            }

            @Override // X.InterfaceC1453560nve
            public final void LIZLLL(C1453580nvg c1453580nvg) {
                C1453320nvG c1453320nvG = this.LIZ.LLJJJIL;
                String str = c1453580nvg.LIZ;
                c1453320nvG.LLLFZ(str, C1404000mdi.LIZLLL(c1453580nvg.LIZJ, str));
                this.LIZ.LLLLIL();
                C1403960mde c1403960mde = C1403960mde.LIZ;
                VideoPublishEditModel videoPublishEditModelLLLILZLLLI = this.LIZ.LLLILZLLLI();
                String str2 = c1453580nvg.LIZ;
                float f = c1453580nvg.LIZIZ;
                float f2 = c1453580nvg.LIZJ;
                c1403960mde.getClass();
                C0LAB c0labLIZJ = C1403960mde.LIZJ(videoPublishEditModelLLLILZLLLI);
                c0labLIZJ.LJ("adjust_function", a0.LJJJJZ("adjust_item_", str2));
                c0labLIZJ.LIZ(C1404000mdi.LIZ(f, str2), "adjust_level_from");
                c0labLIZJ.LIZ(C1404000mdi.LIZ(f2, str2), "adjust_level_to");
                C20684815ws.LJIILLIIL("adjust_set", c0labLIZJ.LIZ);
            }

            @Override // X.InterfaceC1453560nve
            public final void LIZ(float f, String str) {
                if (Intrinsics.LJFF(str, this.LIZ.LLJJJJJIL)) {
                    C367060EaG c367060EaG2 = this.LIZ.LLJJ;
                    if (c367060EaG2 == null) {
                        c367060EaG2 = null;
                    }
                    c367060EaG2.setScale(f);
                }
                this.LIZ.LLLII(f, str);
                this.LIZ.LLJJJIL.LLLFZ(str, C1404000mdi.LIZLLL(f, str));
            }
        };
        ((InterfaceC524950KiL) this.LLJZIJLIL.getValue(this, LLLIIIIL[3])).kF(this);
    }

    public final void LLLII(float f, String str) {
        C1460830o7N.LIZ.getClass();
        String strLIZ = C1460830o7N.LIZ(str);
        SingleAdjustInfo singleAdjustInfo = new SingleAdjustInfo(f, strLIZ);
        if (strLIZ == null) {
            strLIZ = "";
        }
        LLLJL(true, f, strLIZ, str);
        this.LLJLLIL.put(str, singleAdjustInfo);
    }

    @Override // X.InterfaceC362610EJn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ImageAdjustInfo adjustInfo;
        if (i != 4 || !isVisible()) {
            return false;
        }
        SingleImageData singleImageData = this.LLJLL;
        if (singleImageData != null && (adjustInfo = singleImageData.getAdjustInfo()) != null) {
            LLLIIIIL(adjustInfo.getAdjustMap());
        }
        LLLLII(false);
        return true;
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return C786410Ut5.Td(layoutInflater, R.layout.eq9, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public final void LLLJL(boolean z, float f, String str, String str2) {
        C348100Dkm c348100DkmLIZIZ;
        InterfaceC348530DlT interfaceC348530DlTLJ;
        C348240Dl0 c348240Dl0 = new C348240Dl0(C1451990nt7.LIZIZ(str2));
        c348240Dl0.LJFF(str, str2);
        String str3 = C1451990nt7.LIZ.get(str2);
        if (str3 == null) {
            str3 = "";
        }
        c348240Dl0.LJ(Float.valueOf(f), str, str3);
        InterfaceC1452170ntP value = LLLIL().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (interfaceC348530DlTLJ = c348100DkmLIZIZ.LJ()) != null) {
            interfaceC348530DlTLJ.LJIJ(c348240Dl0, z, false);
        }
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
