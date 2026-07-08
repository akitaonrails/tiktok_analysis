package X;

import Y.ACListenerS143S0100000_8;
import Y.AObserverS208S0100000_4;
import Y.AObserverS212S0100000_8;
import Y.ARunnableS108S0100000_8;
import Y.AUListenerS253S0100000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0McS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572260McS extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final C1DRG LLJI;
    public InputMethodManager LLJIJIL;
    public LinearLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public C0I7D LLJILLL;
    public CharSequence LLJJ;
    public ConstraintLayout LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public C197039127h LLJJIJIIJIL;
    public C197039127h LLJJIJIL;
    public final C1664750tQH LLJJJ;
    public final C1664750tQH LLJJJIL;
    public final C1664750tQH LLJJJJ;
    public final C1664750tQH LLJJJJJIL;
    public final C1664750tQH LLJJJJLIIL;
    public C21647019ng LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public int LLJLIL;
    public View LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public final Rect LLJJL = new Rect();
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 396));
    public final SoftKeyBoardListener LLJLLL = C0FWN.LIZ(getActivity());
    public final C572060Mc8 LLJZ = new InterfaceC1391500mJY() { // from class: X.0Mc8
        @Override // X.InterfaceC1391500mJY
        public final void LJJIIJ(int i) {
            if (this.LL.LLLIL().U92()) {
                return;
            }
            this.LL.LLLIL().YG2(true);
            if (this.LL.LLJJL.height() <= 0) {
                return;
            }
            this.LL.LLLII(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("keyBoardShow ");
            sbLIZ.append(i);
            C201955140j.LIZIZ("TTIEditContainerScene", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC1391500mJY
        public final void LJZI(int i) {
            Integer numValueOf;
            if (!this.LL.LLLIL().U92()) {
                return;
            }
            this.LL.LLLIL().YG2(false);
            this.LL.LLLII(0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("keyBoardHide ");
            sbLIZ.append(i);
            C201955140j.LIZIZ("TTIEditContainerScene", C2188811AlT.LIZIZ(sbLIZ));
            C572260McS c572260McS = this.LL;
            if (((InterfaceC572090McB) c572260McS.LLJJJJLIIL.getValue(c572260McS, C572260McS.LLJZIJLIL[4])).ZY() || this.LL.LLLILZ().creativeModel.text2ImageModel.directToChoose) {
                return;
            }
            C572240McQ c572240McQ = C572240McQ.LIZ;
            VideoPublishEditModel videoPublishEditModelLLLILZ = this.LL.LLLILZ();
            c572240McQ.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", videoPublishEditModelLLLILZ.getEnterFrom());
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelLLLILZ));
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModelLLLILZ));
            c0lab.LJ("shoot_way", videoPublishEditModelLLLILZ.mShootWay);
            c0lab.LJ("creation_id", videoPublishEditModelLLLILZ.getCreationId());
            String str = videoPublishEditModelLLLILZ.creativeModel.text2ImageModel.text;
            if (str != null) {
                numValueOf = Integer.valueOf(str.length());
            } else {
                numValueOf = null;
            }
            c0lab.LIZLLL(numValueOf, "text_length");
            c0lab.LJ("text_description", videoPublishEditModelLLLILZ.creativeModel.text2ImageModel.text);
            c0lab.LIZ(1, "is_text_mode");
            c0lab.LIZ(1, "is_text_trans_pic");
            c0lab.LJ("entrance", C572310McX.LJI(videoPublishEditModelLLLILZ));
            C20684815ws.LJIILLIIL("text_image_finish_input", c0lab.LIZ);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C572070Mc9(this.LL, null), 3);
        }

        @Override // X.InterfaceC1391500mJY
        public final void LLLL(int i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("keyBoardModify ");
            sbLIZ.append(i);
            C201955140j.LIZIZ("TTIEditContainerScene", C2188811AlT.LIZIZ(sbLIZ));
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C572260McS.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C572260McS.class, "generateCover", "getGenerateCover()Lcom/ss/android/ugc/aweme/texttoimage/IGenerateCover;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C572260McS.class, "shouldPlayAnim", "getShouldPlayAnim()Lcom/ss/android/ugc/aweme/texttoimage/IShouldPlayAnim;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C572260McS.class, "containerComponent", "getContainerComponent()Lcom/ss/android/ugc/aweme/texttoimage/editcontainer/TextToImageEditContainerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C572260McS.class, "titleBarApi", "getTitleBarApi()Lcom/ss/android/ugc/aweme/texttoimage/toolbar/TextToImageTitleBarApi;", 0);
        c09r3.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public final InterfaceC572080McA LLLIL() {
        return (InterfaceC572080McA) this.LLJJJJJIL.getValue(this, LLJZIJLIL[3]);
    }

    public final VideoPublishEditModel LLLILZ() {
        return (VideoPublishEditModel) this.LLJJJ.getValue(this, LLJZIJLIL[0]);
    }

    public final void LLLIZZ() {
        View view;
        C0I7D c0i7d = this.LLJILLL;
        if (c0i7d != null) {
            c0i7d.requestFocus();
        }
        C0I7D c0i7d2 = this.LLJILLL;
        if (c0i7d2 != null) {
            Editable editableLLLLJI = C2204961BRm.LLLLJI(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6te4va0zsyfjeOovHKvH3tUD4CrBs2F9BXgNsQZ5VTgTci3d+OCkT/IsbW2L6YUnMwCg6gOSk=", null));
            c0i7d2.setSelection(editableLLLLJI != null ? editableLLLLJI.length() : 0);
        }
        InputMethodManager inputMethodManager = this.LLJIJIL;
        if ((inputMethodManager == null || !inputMethodManager.showSoftInput(this.LLJILLL, 1)) && (view = this.mView) != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS108S0100000_8(this, 69), 100L);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final C19EG getActivity() {
        return (C19EG) this.LLJLLIL.getValue();
    }

    public final void LLLIILIL() {
        if (LLLIL().U92()) {
            C0I7D c0i7d = this.LLJILLL;
            if (c0i7d != null) {
                c0i7d.clearFocus();
            }
            InputMethodManager inputMethodManager = this.LLJIJIL;
            if (inputMethodManager != null) {
                C0I7D c0i7d2 = this.LLJILLL;
                inputMethodManager.hideSoftInputFromWindow(c0i7d2 != null ? c0i7d2.getWindowToken() : null, 0);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x014a  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572260McS.onResume():void");
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0Mc8] */
    public C572260McS(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJJJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(c1drg, C0CSH.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(c1drg, InterfaceC572290McV.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(c1drg, InterfaceC572080McA.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(c1drg, InterfaceC572090McB.class, null);
    }

    public final void LLLII(final int i) {
        Object parent;
        final View view;
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C197039127h c197039127h = this.LLJJIJIIJIL;
        if (c197039127h != null) {
            parent = c197039127h.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams.bottomMargin == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                C426750GoL.LJIIJ(marginLayoutParams2, view.getContext(), 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + i), 32);
                C786410Ut5.W5(view, marginLayoutParams2);
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
        C1664750tQH c1664750tQH = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
        if (((InterfaceC572290McV) c1664750tQH.getValue(this, interfaceC2217461BqaArr[2])).LIZ()) {
            ((InterfaceC572290McV) this.LLJJJJ.getValue(this, interfaceC2217461BqaArr[2])).LIZIZ();
            ConstraintLayout constraintLayout = this.LLJJI;
            if (constraintLayout != null) {
                C786410Ut5.LL(0, constraintLayout);
            }
            LLLIIIIL(true, true);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJI, (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            if (!C07CH.LIZIZ()) {
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(getActivity().findViewById(R.id.i7d), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f));
            } else {
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            }
            animatorSet.setDuration(250L);
            animatorSet.start();
            return;
        }
        if (i > 0) {
            LLLIIIIL(true, false);
        } else {
            LLLIIIIL(false, false);
        }
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
            List listSingletonList = Collections.singletonList(new C19746412Nq("alphaButton", new C0HUY(f, 1.0f - f)));
            C21647019ng c21647019ng = this.LLJJLIIIJLLLLLLLZ;
            if (c21647019ng != null) {
                c21647019ng.LIZ();
            }
            C21647019ng c21647019ng2 = new C21647019ng(view.getContext(), view, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(32.31f)), listSingletonList), false);
            this.LLJJLIIIJLLLLLLLZ = c21647019ng2;
            c21647019ng2.LIZJ("alphaButton", new InterfaceC21641019mi() { // from class: X.0McT
                @Override // X.InterfaceC21641019mi
                public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                    int i2;
                    View view2 = view;
                    if (i == 0) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    C786410Ut5.LJLLLLLL(i2, view2);
                }

                @Override // X.InterfaceC21641019mi
                public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                    ViewParent parent2;
                    View viewFindViewById;
                    float value = interfaceC1844880y6o.getValue();
                    C197039127h c197039127h2 = this.LIZ.LLJJIJIL;
                    View view2 = null;
                    if (c197039127h2 != null) {
                        parent2 = c197039127h2.getParent();
                    } else {
                        parent2 = null;
                    }
                    if (parent2 instanceof View) {
                        view2 = (View) parent2;
                    }
                    if (view2 != null) {
                        C786410Ut5.T4(view2, 1 - value);
                    }
                    if (!C07CH.LIZIZ() && (viewFindViewById = this.LIZ.getActivity().findViewById(R.id.i7d)) != null) {
                        C786410Ut5.T4(viewFindViewById, 1 - value);
                    }
                }
            });
            C21647019ng c21647019ng3 = this.LLJJLIIIJLLLLLLLZ;
            if (c21647019ng3 != null) {
                c21647019ng3.LJI(true);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        InputMethodManager inputMethodManager;
        int i;
        TuxTextView tuxTextView;
        super.onActivityCreated(bundle);
        Object objJ2 = C786410Ut5.J2(getActivity(), "input_method");
        if (objJ2 instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) objJ2;
        } else {
            inputMethodManager = null;
        }
        this.LLJIJIL = inputMethodManager;
        C786410Ut5.x3(this.mView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC581000MqY(this, 3));
        C0I7D c0i7d = this.LLJILLL;
        if (c0i7d != null) {
            String str = LLLILZ().creativeModel.text2ImageModel.text;
            if (str == null) {
                str = "";
            }
            c0i7d.setText(str);
        }
        this.LLJL = true;
        Bundle bundle2 = LLLILZ().creativeModel.text2ImageModel.extraParams;
        if (bundle2 != null) {
            i = bundle2.getInt("HELP_POST_EDIT_STYLE");
        } else {
            i = 0;
        }
        this.LLJLIL = i;
        if (Intrinsics.LJFF(LLLILZ().creativeModel.text2ImageModel.entrance, "search")) {
            TuxTextView tuxTextView2 = this.LLJJIII;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(getString(2131835484));
            }
        } else if (C123100dR.LIZ(LLLILZ().creativeModel.text2ImageModel.textToImageEditTitle) && (tuxTextView = this.LLJJIII) != null) {
            tuxTextView.setText(LLLILZ().creativeModel.text2ImageModel.textToImageEditTitle);
        }
        LLLIL().wI0(LLLILZ().creativeModel.text2ImageModel.text, C1428470nHB.LJJJZ(LLLILZ()));
        LLLIL().Nj0().observe(this, new AObserverS212S0100000_8(this, 47));
        LLLIL().ua().observe(this, new AObserverS208S0100000_4(this, 6));
        LLLIL().dR1().observe(this, new AObserverS212S0100000_8(this, 48));
        LLLIL().Dd2().observe(this, new AObserverS212S0100000_8(this, 49));
        if (((InterfaceC572290McV) this.LLJJJJ.getValue(this, LLJZIJLIL[2])).LIZ()) {
            C786410Ut5.LJZ(4, (FrameLayout) this.mView.findViewById(R.id.hdn));
            ConstraintLayout constraintLayout = this.LLJJI;
            if (constraintLayout != null) {
                C786410Ut5.LL(4, constraintLayout);
            }
            C786410Ut5.T4(this.mView.findViewById(R.id.cpw), 0.0f);
        }
        if (this.LLJLIL == 1) {
            View view = this.LLJLILLLLZIIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        View view2 = this.LLJLILLLLZIIL;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    public final void LLLIIIIL(boolean z, boolean z2) {
        int height;
        ViewGroup.LayoutParams layoutParams;
        int height2;
        View decorView;
        if (this.LLJJL.height() <= 0) {
            return;
        }
        long j = 350;
        if (z) {
            int iHeight = this.LLJJL.height();
            Rect rect = new Rect();
            Window window = getActivity().getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            int iLIZIZ = (this.LLJJL.bottom - rect.bottom) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(66));
            if (iLIZIZ > 0) {
                ConstraintLayout constraintLayout = this.LLJJI;
                LinearLayout.LayoutParams layoutParams2 = null;
                if (constraintLayout != null) {
                    layoutParams = constraintLayout.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if ((layoutParams instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams) != null) {
                    layoutParams2.height = this.LLJJL.height();
                    layoutParams2.weight = 0.0f;
                }
                ConstraintLayout constraintLayout2 = this.LLJJI;
                if (constraintLayout2 != null) {
                    C786410Ut5.m6(constraintLayout2, layoutParams2);
                }
                int i = iHeight - iLIZIZ;
                ConstraintLayout constraintLayout3 = this.LLJJI;
                if (constraintLayout3 != null) {
                    height2 = constraintLayout3.getHeight();
                } else {
                    height2 = 0;
                }
                if (z2) {
                    j = 0;
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height2, i);
                valueAnimatorOfInt.setDuration(j);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(constraintLayout3, 8));
                valueAnimatorOfInt.start();
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout4 = this.LLJJI;
        if (constraintLayout4 != null) {
            height = constraintLayout4.getHeight();
        } else {
            height = 0;
        }
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(height, this.LLJJL.height());
        valueAnimatorOfInt2.setDuration(350L);
        valueAnimatorOfInt2.addUpdateListener(new AUListenerS253S0100000_2(constraintLayout4, 8));
        valueAnimatorOfInt2.start();
    }

    public final void LLLILZLLLI(C197039127h c197039127h, boolean z) {
        String strValueOf;
        Object parent;
        View view;
        CharSequence text = null;
        if (z) {
            if (c197039127h != null) {
                parent = c197039127h.getParent();
            } else {
                parent = null;
            }
            if ((parent instanceof View) && (view = (View) parent) != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
        if (c197039127h != null) {
            if (Intrinsics.LJFF(LLLILZ().creativeModel.text2ImageModel.entrance, "search")) {
                strValueOf = getString(2131835482);
            } else if (C07CL.LIZ() && !Intrinsics.LJFF(LLLILZ().creativeModel.text2ImageModel.entrance, "search")) {
                strValueOf = getString(2131830055);
            } else {
                C197039127h c197039127h2 = this.LLJJIJIIJIL;
                if (c197039127h2 != null) {
                    text = c197039127h2.getText();
                }
                strValueOf = String.valueOf(text);
            }
            c197039127h.setText(strValueOf);
        }
        if (C07CI.LIZ() == 2) {
            if (c197039127h != null) {
                c197039127h.LJJJJL(new AwS587S0100000_8(this, 299));
            } else {
                return;
            }
        } else if (c197039127h == null) {
            return;
        }
        c197039127h.setEnabled(C123100dR.LIZ(LLLILZ().creativeModel.text2ImageModel.text));
        C786410Ut5.U8(c197039127h, new ACListenerS143S0100000_8(this, 85));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        this.LLJLLL.LIZIZ(this.LLJZ);
        this.LLJILJIL = (LinearLayout) view.findViewById(R.id.i5f);
        this.LLJJ = getString(2131821535);
        C0I7D c0i7d = (C0I7D) view.findViewById(R.id.hdl);
        c0i7d.setHint(this.LLJJ);
        C786410Ut5.d9(c0i7d, new ACListenerS143S0100000_8(this, 83));
        this.LLJILLL = c0i7d;
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.zg_);
        this.LLJJI = (ConstraintLayout) view.findViewById(R.id.i5r);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.hcw);
        TuxTextView tuxTextView = this.LLJJIII;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(33);
        }
        TuxTextView tuxTextView2 = this.LLJJIII;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColorRes(R.attr.a1h);
        }
        TuxTextView tuxTextView3 = this.LLJJIII;
        if (tuxTextView3 != null) {
            layoutParams = tuxTextView3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        View viewFindViewById = view.findViewById(R.id.hdn);
        viewFindViewById.getLayoutParams().height = ((ScreenUtils.getScreenWidth(viewFindViewById.getContext()) - (view.getPaddingLeft() * 2)) * 4) / 3;
        final C817403Hg c817403Hg = new C817403Hg();
        final C013C c013c = new C013C();
        viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: X.0McU
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2 && motionEvent.getY() - c817403Hg.element > 50.0f) {
                            this.LLLIILIL();
                            c013c.element = true;
                        }
                        return false;
                    }
                    if (!c013c.element) {
                        if (!this.LLLIL().U92()) {
                            this.LLLIZZ();
                        } else {
                            this.LLLIILIL();
                        }
                    }
                    c013c.element = false;
                    return false;
                }
                c817403Hg.element = motionEvent.getY();
                return true;
            }
        });
        this.LLJLILLLLZIIL = view.findViewById(R.id.hdp);
        TextView textView = (TextView) view.findViewById(R.id.hdo);
        if (textView != null) {
            textView.setText(2131835483);
        }
        TuxTextView tuxTextView4 = (TuxTextView) view.findViewById(R.id.hdm);
        this.LLJLL = tuxTextView4;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(2131835481);
        }
        TuxTextView tuxTextView5 = this.LLJLL;
        if (tuxTextView5 != null) {
            C786410Ut5.h9(tuxTextView5, new ACListenerS143S0100000_8(this, 84));
        }
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
            c384050F3z.LIZ = -1;
            Drawable drawableLIZ = c384050F3z.LIZ(sceneContext);
            LinearLayout linearLayout = this.LLJILJIL;
            if (linearLayout != null) {
                linearLayout.setBackground(drawableLIZ);
            }
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
            c384050F3z2.LIZ = -1;
            Drawable drawableLIZ2 = c384050F3z2.LIZ(sceneContext);
            TuxTextView tuxTextView6 = this.LLJJIJI;
            if (tuxTextView6 != null) {
                tuxTextView6.setBackground(drawableLIZ2);
            }
        }
        C0I7D c0i7d2 = this.LLJILLL;
        if (c0i7d2 != null) {
            c0i7d2.addTextChangedListener(new C581030Mqb(this, 1));
        }
        InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(LSPassThroughRecordSizeConfig.DEFAULT)};
        C0I7D c0i7d3 = this.LLJILLL;
        if (c0i7d3 != null) {
            c0i7d3.setFilters(inputFilterArr);
        }
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.cpu);
        this.LLJJIJIIJIL = c197039127h;
        LLLILZLLLI(c197039127h, false);
        C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.cpv);
        this.LLJJIJIL = c197039127h2;
        LLLILZLLLI(c197039127h2, true);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.eru, viewGroup, false);
    }
}
