package X;

import X.C08CI;
import X.C0MFP;
import X.C12WG;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS108S0100000_8;
import Y.ARunnableS27S0110000_8;
import Y.AfS177S0100000_8;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.Size;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import u4.q0;

/* JADX INFO: renamed from: X.0MFP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MFP extends AbstractC1664490tPr<C0MDA, C0MDB> implements InterfaceC1391500mJY {
    public ObjectAnimator LLLII;
    public C0MDK LLLIIL;
    public boolean LLLIILIL;
    public Integer LLLILZJ;
    public boolean LLLIZZ;
    public boolean LLLJIL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public ValueAnimator LLLLIIL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 549));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 560));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 552));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 562));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 564));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 563));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 553));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 551));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 542));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 556));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 558));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 561));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 559));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 547));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 545));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 550));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 541));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 544));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 546));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 554));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 548));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 543));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 555));
    public final C01GW LLLIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(256));
    public final C01GW LLLILZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(257));
    public final C11NJ LLLILZLLLI = new C11NJ();
    public boolean LLLJ = true;
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 566));
    public long LLLL = 500;
    public final C01GW LLLLIILL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 565));
    public final C0MFZ LLLLIILLL = new C0MFZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78)));
    public final C0MFZ LLLLIL = new C0MFZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
    public final C0MFX LLLLILI = new C0MFX(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(31)));
    public final C0MFX LLLLJ = new C0MFX(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(95)));
    public final C0MFT LLLLJI = new C0MFT(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), 1.0f);
    public final C0MFT LLLLL = new C0MFT(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(256)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), 0.0f);
    public final C01GW LLLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 557));
    public float LLLLLILLIL = 1.0f;
    public int LLLLLJIL = -1;
    public Size LLLLLJLJLL = new Size(-1, -1);
    public final C581030Mqb LLLLLL = new C581030Mqb(this, 3);

    public static final int LLLLZLLIL(float f, int i, int i2) {
        return (int) (((i2 - i) * f) + i);
    }

    @Override // X.InterfaceC1391500mJY
    public final void LLLL(int i) {
    }

    public final View LLLLLJLJLL() {
        return (View) this.LLLFF.getValue();
    }

    public final C0I7D LLLLLL() {
        return (C0I7D) this.LLJLL.getValue();
    }

    public final FrameLayout LLLLLLIL() {
        return (FrameLayout) this.LLJLLIL.getValue();
    }

    public final SmartImageView LLLLLLJ() {
        return (SmartImageView) this.LLJJJJLIIL.getValue();
    }

    public final View LLLLLLL() {
        return (View) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final View LLLLLLLLL() {
        return (View) this.LLJJL.getValue();
    }

    public final C438070HFt LLLLLLLLLL() {
        return (C438070HFt) this.LLJLILLLLZIIL.getValue();
    }

    public final C1287400jbe LLLLLLLZIL() {
        return (C1287400jbe) this.LLJL.getValue();
    }

    public final boolean LLLLLZ() {
        if (!this.LLLLII) {
            return false;
        }
        LLLLLL().clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.LLLJL.getValue();
        if (inputMethodManager == null) {
            return true;
        }
        inputMethodManager.hideSoftInputFromWindow(LLLLLL().getWindowToken(), 0);
        return true;
    }

    public final void LLLLZLLLI() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(activity.getString(2131825332));
        creativeToastBuilder.duration(3000L);
        C1390380mHk.LIZ(activity, 8008, creativeToastBuilder);
    }

    public final void LLLZ() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(activity.getString(2131825398, 400));
        creativeToastBuilder.duration(3000L);
        C1390380mHk.LIZ(activity, 8007, creativeToastBuilder);
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        Window window;
        Integer num = this.LLLILZJ;
        if (num != null) {
            int iIntValue = num.intValue();
            Activity activity = this.mActivity;
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(iIntValue);
            }
        }
        this.LLLLII = false;
        LLLLLLLLLL().LIZIZ(false);
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        Window window;
        Window window2;
        WindowManager.LayoutParams attributes;
        Activity activity = this.mActivity;
        this.LLLILZJ = (activity == null || (window2 = activity.getWindow()) == null || (attributes = window2.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        Activity activity2 = this.mActivity;
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        LLLLLLLLLL().LIZIZ(true);
        this.LLLIILIL = false;
        ((Set) this.LLLILZ.getValue()).clear();
        LLLLZ();
    }

    public final void LLLLZ() {
        for (C438110HFx c438110HFx : LLLLLLLLLL().getAttachedItemList()) {
            InterfaceC434700H2u interfaceC434700H2u = c438110HFx.LIZ;
            int i = c438110HFx.LIZIZ;
            if (interfaceC434700H2u instanceof PromptModel) {
                PromptModel promptModel = (PromptModel) interfaceC434700H2u;
                if (((Set) this.LLLILZ.getValue()).add(promptModel.prompt)) {
                    C564410MBr.LIZ.getClass();
                    C564410MBr.LJIL(LLLLILI().LIZ.LIZIZ, i + 1, promptModel);
                }
            }
        }
    }

    public final void LLLZIIL() {
        FrameLayout frameLayoutLLLLLLIL = LLLLLLIL();
        String strLJFF = LLLLILI().LIZ.LIZLLL.LJFF();
        C786410Ut5.U4(frameLayoutLLLLLLIL, (strLJFF == null || strLJFF.length() == 0 || LLLLILI().LIZ.LJI) ? 0.4f : 1.0f);
    }

    public final void LLLZIL() {
        if (!C123100dR.LIZ(LLLLILI().LIZ.LIZLLL.LJFF()) && this.LLLLLJLJLL.getWidth() > 0 && this.LLLLLJLJLL.getHeight() > 0) {
            Size sizeLLLLLJIL = LLLLLJIL((LLLLLLL().getHeight() * 1.0f) / LLLLLLL().getWidth(), (this.LLLLLJLJLL.getHeight() * 1.0f) / this.LLLLLJLJLL.getWidth());
            View viewLLLLLLLLL = LLLLLLLLL();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewLLLLLLLLL.getLayoutParams();
            marginLayoutParams.width = sizeLLLLLJIL.getWidth();
            marginLayoutParams.height = sizeLLLLLJIL.getHeight() - 2;
            C786410Ut5.W5(viewLLLLLLLLL, marginLayoutParams);
        }
    }

    public final void LLLZLL() {
        String strLJFF = LLLLILI().LIZ.LIZLLL.LJFF();
        if (strLJFF == null || strLJFF.length() == 0) {
            return;
        }
        Size sizeLLLLLJIL = LLLLLJIL((LLLLLLL().getHeight() * 1.0f) / LLLLLLL().getWidth(), this.LLLLLILLIL);
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("calW:");
        sbLIZ.append(sizeLLLLLJIL.getWidth());
        sbLIZ.append(", calH:");
        sbLIZ.append(sizeLLLLLJIL.getHeight());
        sbLIZ.append(", imageRatio:");
        sbLIZ.append(this.LLLLLILLIL);
        C201955140j.LJIILJJIL(c0l76, C2188811AlT.LIZIZ(sbLIZ));
        C0ID9 c0id9 = new C0ID9(11);
        SmartImageView smartImageViewLLLLLLJ = LLLLLLJ();
        smartImageViewLLLLLLJ.setAspectRatio(1 / this.LLLLLILLIL);
        smartImageViewLLLLLLJ.setOutlineProvider(c0id9);
        smartImageViewLLLLLLJ.setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) smartImageViewLLLLLLJ.getLayoutParams();
        marginLayoutParams.width = sizeLLLLLJIL.getWidth();
        marginLayoutParams.height = sizeLLLLLJIL.getHeight() - 2;
        C786410Ut5.G6(smartImageViewLLLLLLJ, marginLayoutParams);
    }

    public final void LLLZLZ() {
        LLLZIIL();
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_live_new_prompt_page_ai_writer_enable", true, false)) {
            C436180H8m.LIZIZ(LLLLLJLJLL());
            return;
        }
        String strLJFF = LLLLILI().LIZ.LIZLLL.LJFF();
        if (strLJFF == null || strLJFF.length() == 0) {
            C436180H8m.LIZIZ(LLLLLJLJLL());
        } else {
            C786410Ut5.LJLLLLLL(0, LLLLLJLJLL());
        }
    }

    @Override // X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        if (this.LLLLII) {
            return;
        }
        C201955140j.LIZLLL(C0L76.LIZIZ, "AILivePhotoV2Scene", "keyboard show");
        this.LLLLII = true;
        this.LLLLL.LIZIZ = (C1415610mwR.LIZIZ() - (((View) this.LLJZ.getValue()).getMeasuredWidth() + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2))) - this.LLLLL.LIZJ;
        LLLLZIL(new Pair<>(this.LLLLIILLL, this.LLLLIL), new Pair<>(this.LLLLJI, this.LLLLL), new Pair<>(this.LLLLILI, this.LLLLJ), true, i);
    }

    @Override // X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        if (!this.LLLLII) {
            return;
        }
        C201955140j.LIZLLL(C0L76.LIZIZ, "AILivePhotoV2Scene", "keyboard hide");
        this.LLLLII = false;
        LLLLLL().clearFocus();
        LLLLZIL(new Pair<>(this.LLLLIL, this.LLLLIILLL), new Pair<>(this.LLLLL, this.LLLLJI), new Pair<>(this.LLLLJ, this.LLLLILI), false, i);
    }

    public final void LLLLLLZZ(Function0<Unit> function0) {
        if (LLLLILI().LIZ.LJI) {
            LLLLZLLLI();
        } else {
            function0.invoke();
        }
    }

    public final void LLLLLZL(boolean z) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_new_prompt_page_use_shader", true, true)) {
            if ((Build.SUPPORTED_64_BIT_ABIS.length == 0 && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_new_prompt_page_32bit_downgrade", true, true)) || !this.LLLJIL) {
                return;
            }
            if (z) {
                if (LLLLLLLZIL().getVisibility() != 0) {
                    LLLLLLLZIL().onResume();
                    C786410Ut5.LJLLLLLL(0, LLLLLLLZIL());
                    return;
                }
                return;
            }
            if (LLLLLLLZIL().getVisibility() != 0) {
                return;
            }
            LLLLLLLZIL().onPause();
            C786410Ut5.LJLLLLLL(4, LLLLLLLZIL());
        }
    }

    public final void LLLZI(boolean z) {
        if (z) {
            C786410Ut5.LJLLLLLL(0, (View) this.LLLFFI.getValue());
            C436180H8m.LIZIZ(LLLLLJLJLL());
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLLFZ.getValue(), "rotation", 0.0f, 360.0f);
            this.LLLII = objectAnimatorOfFloat;
            if (objectAnimatorOfFloat != null) {
                objectAnimatorOfFloat.setDuration(800L);
            }
            ObjectAnimator objectAnimator = this.LLLII;
            if (objectAnimator != null) {
                objectAnimator.setRepeatMode(1);
            }
            ObjectAnimator objectAnimator2 = this.LLLII;
            if (objectAnimator2 != null) {
                objectAnimator2.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator3 = this.LLLII;
            if (objectAnimator3 != null) {
                C786410Ut5.Pd(objectAnimator3);
                return;
            }
            return;
        }
        C436180H8m.LIZIZ((View) this.LLLFFI.getValue());
        C786410Ut5.LJLLLLLL(0, LLLLLJLJLL());
        ObjectAnimator objectAnimator4 = this.LLLII;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
        this.LLLII = null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = this.mActivity;
        if (activity != null) {
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_live_new_prompt_page_default_prompt_enable", true, false)) {
                C786410Ut5.LJLLLLLL(8, (View) this.LLLI.getValue());
                C438070HFt c438070HFtLLLLLLLLLL = LLLLLLLLLL();
                int visibility = c438070HFtLLLLLLLLLL.getVisibility();
                c438070HFtLLLLLLLLLL.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c438070HFtLLLLLLLLLL);
            }
            C786410Ut5.I7(new AkS80S0100000_8(this, 16), LLLLLJLJLL());
            C786410Ut5.I7(new AkS80S0100000_8(this, 17), LLLLLLIL());
            C786410Ut5.I7(new AkS80S0100000_8(this, 18), (View) this.LLJJJJJIL.getValue());
            C786410Ut5.I7(new AkS80S0100000_8(this, 19), (View) this.LLLF.getValue());
            C786410Ut5.I7(new AkS80S0100000_8(this, 20), LLLLLLJ());
            View viewFindViewById = findViewById(R.id.ke6);
            if (viewFindViewById != null) {
                C786410Ut5.I7(new AkS80S0100000_8(this, 21), viewFindViewById);
            }
            C786410Ut5.I7(new AkS80S0100000_8(this, 22), LLLLLLL());
            C786410Ut5.I7(new AkS80S0100000_8(this, 23), LLLLLLLLL());
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_new_prompt_page_title_not_translate", true, true)) {
                ((TextView) this.LLJJJJ.getValue()).setText("AI Alive");
            } else {
                ((TextView) this.LLJJJJ.getValue()).setText(getResources().getString(2131820675));
            }
            C426750GoL.LJIIIZ((View) this.LLJJJJJIL.getValue(), null, Integer.valueOf(((Number) this.LLLLLIL.getValue()).intValue()), null, null, false, 29);
            C426750GoL.LJIIIZ((View) this.LLJJJJ.getValue(), null, Integer.valueOf(((Number) this.LLLLLIL.getValue()).intValue()), null, null, false, 29);
            LLLLLLLLLL().LIZ(getLifecycle());
            LLLLLLLLLL().setItemBackGroundColorRes(R.attr.a03);
            View view = (View) this.LLLLIILL.getValue();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            view.setBackground(c384050F3z.LIZ(view.getContext()));
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_live_new_prompt_page_button_style", true) == 1) {
                FrameLayout frameLayoutLLLLLLIL = LLLLLLIL();
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZ = -1;
                c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                frameLayoutLLLLLLIL.setBackground(c384050F3z2.LIZ(activity));
            }
            LLLLLL().setFilters(new C565290MFb[]{new InputFilter() { // from class: X.0MFb
                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                    int length;
                    if (spanned != null) {
                        length = spanned.length();
                    } else {
                        length = 0;
                    }
                    int i5 = 400 - (length - (i4 - i3));
                    if (i5 <= 0) {
                        this.LL.LLLZ();
                        return "";
                    }
                    if (i2 - i <= i5) {
                        return charSequence;
                    }
                    this.LL.LLLZ();
                    if (charSequence != null) {
                        return charSequence.subSequence(i, i5 + i);
                    }
                    return null;
                }
            }});
            C0I7D c0i7dLLLLLL = LLLLLL();
            c0i7dLLLLLL.addTextChangedListener(this.LLLLLL);
            c0i7dLLLLLL.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0MFY
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    return i == 6;
                }
            });
            C12WG.LIZJ(this, new ARunnableS106S0100000_6(this, 124));
            ((SoftKeyBoardListener) this.LLLIIIL.getValue()).LIZJ();
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_new_prompt_keyboard_animation", true, true) && (Build.SUPPORTED_64_BIT_ABIS.length != 0 || !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_new_prompt_page_32bit_downgrade", true, true))) {
                q0.LJJII((View) this.LLJJJIL.getValue(), new C14JJ() { // from class: X.0MFa
                    {
                        super(0);
                    }

                    @Override // X.C14JJ
                    public final void LIZ(C14JM c14jm) {
                        int i;
                        View view2 = (View) this.LLILLL.LLJJJIL.getValue();
                        C0MFP c0mfp = this.LLILLL;
                        if (c0mfp.LLLLII) {
                            i = c0mfp.LLLLLJIL;
                        } else {
                            i = 0;
                        }
                        C426750GoL.LJIIL(view2, null, null, null, Integer.valueOf(i), 23);
                    }

                    @Override // X.C14JJ
                    public final void LIZIZ(C14JM c14jm) {
                        if (c14jm.LIZ.LIZ() > 0) {
                            this.LLILLL.LLLL = c14jm.LIZ.LIZ();
                        }
                    }

                    @Override // X.C14JJ
                    public final C20246014Ju LIZJ(C20246014Ju c20246014Ju, List<C14JM> list) {
                        C14JM next;
                        float f;
                        Iterator<C14JM> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if ((next.LIZ() & 8) != 0) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        C14JM c14jm = next;
                        if (c14jm == null) {
                            return c20246014Ju;
                        }
                        float fLIZJ = c14jm.LIZ.LIZJ();
                        C0MFP c0mfp = this.LLILLL;
                        if (c0mfp.LLLLII) {
                            f = c0mfp.LLLLLJIL * fLIZJ;
                        } else {
                            f = (1 - fLIZJ) * c0mfp.LLLLLJIL;
                        }
                        C426750GoL.LJIIL((View) c0mfp.LLJJJIL.getValue(), null, null, null, Integer.valueOf((int) f), 23);
                        return c20246014Ju;
                    }

                    @Override // X.C14JJ
                    public final C14JL LIZLLL(C14JM c14jm, C14JL c14jl) {
                        C0MFP c0mfp = this.LLILLL;
                        if (c0mfp.LLLLLJIL == -1) {
                            c0mfp.LLLLLJIL = (c14jl.LIZIZ.LIZLLL - c14jl.LIZ.LIZLLL) - C14KI.LIZIZ(c0mfp.requireSceneContext());
                        }
                        C0L76 c0l76 = C0L76.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("keyboardHeight:");
                        sbLIZ.append(this.LLILLL.LLLLLJIL);
                        C201955140j.LJIILJJIL(c0l76, C2188811AlT.LIZIZ(sbLIZ));
                        return c14jl;
                    }
                });
            }
        }
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.gamora.editor.ailive.newprompt.core.AILivePhotoPromptV2Scene$initObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                int i = C08CI.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ((SoftKeyBoardListener) this.LL.LLLIIIL.getValue()).LIZ();
                            this.LL.LLLILZLLLI.dispose();
                            return;
                        }
                        return;
                    }
                    if (!this.LL.LLLLLZ()) {
                        return;
                    }
                    this.LL.LLLLIIIILLL = true;
                    return;
                }
                C0MFP c0mfp = this.LL;
                if (!c0mfp.LLLLIIIILLL) {
                    return;
                }
                c0mfp.LLLLIIIILLL = false;
                C12WG.LIZLLL(c0mfp, new ARunnableS108S0100000_8(c0mfp, 78), 100L);
            }
        });
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0MEa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0MDA) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 363));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0MFV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0MDA) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 350));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0MDP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0MDA) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 355));
        C1664690tQB<C0MDA> c1664690tQBLLLLILI = LLLLILI();
        C0MDG c0mdg = new C2217381BqS() { // from class: X.0MDG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0MDA) obj).LJ;
            }
        };
        Lifecycle.State state = Lifecycle.State.RESUMED;
        LLLLJI(c1664690tQBLLLLILI, c0mdg, state, new AwS587S0100000_8(this, 358));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0MDO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0MDA) obj).LJI);
            }
        }, state, new AwS587S0100000_8(this, 362));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C451350Hmv(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C451340Hmu(this, null), 3);
        ((SoftKeyBoardListener) this.LLLIIIL.getValue()).LIZIZ(this);
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.e26) {
            this.LLLLII = false;
            LLLLIL().LIZJ.invoke();
            return;
        }
        if (id == R.id.it0) {
            String strLJFF = LLLLILI().LIZ.LIZLLL.LJFF();
            if (strLJFF != null && strLJFF.length() != 0) {
                LLLLLLZZ(new AwS552S0100000_8(this, 567));
                return;
            }
            return;
        }
        if (id != R.id.ash || LLLLILI().LIZ.LJI) {
            return;
        }
        C371780Ehs.LIZ(this.LLLILZLLLI, LLLLIL().LIZLLL.invoke(String.valueOf(C2204961BRm.LLLLJI(LLLLLL(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0HZ4QeWTB9QhiAYCdRmXrnRXiUj1OPvMBfeP8b5puw5jCYHSaBtBm9GkICsFIAw==", null)))).LJJ(C1701940uOG.LIZIZ()).LJIILJJIL(new AfS177S0100000_8(this, 25)).LJIILL(new AfS177S0100000_8(this, 26)).LJIIL(new AfS177S0100000_8(this, 27)).LJJIIZ(new AfS177S0100000_8(this, 28), new AfS177S0100000_8(this, 24)));
    }

    public final Size LLLLLJIL(float f, float f2) {
        if (f2 <= f) {
            return new Size(LLLLLLL().getWidth(), (int) (LLLLLLL().getWidth() * f2));
        }
        int height = (int) (LLLLLLL().getHeight() / f2);
        int height2 = LLLLLLL().getHeight();
        if (height > LLLLLLL().getWidth()) {
            height = LLLLLLL().getWidth();
            height2 = (int) (LLLLLLL().getWidth() * f2);
        }
        return new Size(height, height2);
    }

    public final boolean LLLLLLZ(C0I7D c0i7d, String str) {
        if (LLLLILI().LIZ.LIZ.getEnterFrom() != C0MDI.SHOOT || str.length() == 0) {
            return false;
        }
        c0i7d.setHint(str);
        return true;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater.cloneInContext(new C1361400lX0(this.mActivity, R.style.y0)), R.layout.eml, viewGroup, false);
    }

    public final void LLLLZIL(final Pair<C0MFZ, C0MFZ> pair, final Pair<C0MFT, C0MFT> pair2, final Pair<C0MFX, C0MFX> pair3, final boolean z, final int i) {
        int i2;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_new_prompt_keyboard_animation", true, true) && (Build.SUPPORTED_64_BIT_ABIS.length != 0 || !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_new_prompt_page_32bit_downgrade", true, true))) {
            ValueAnimator valueAnimator = this.LLLLIIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.LLLL);
            duration.setInterpolator(C1619980sG4.LIZLLL());
            this.LLLLIIL = duration;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0MFR
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    Float f;
                    Object animatedValue = valueAnimator2.getAnimatedValue();
                    if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                        C0MFP.LLLLZLL(pair, pair2, pair3, this, z, i, f.floatValue());
                    }
                }
            });
            ValueAnimator valueAnimator2 = this.LLLLIIL;
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new Animator.AnimatorListener() { // from class: X.0MFQ
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        C0MFP c0mfp = this.LL;
                        HandlerHook.viewPost(c0mfp.LLLLLLL(), new ARunnableS27S0110000_8(c0mfp, z, 4));
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        C0MFP c0mfp = this.LL;
                        if (c0mfp.LLLLLLJ().getVisibility() != 0) {
                            c0mfp.LLLLLZL(false);
                        }
                    }
                });
            }
            ValueAnimator valueAnimator3 = this.LLLLIIL;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
                return;
            }
            return;
        }
        View view = (View) this.LLJJJIL.getValue();
        if (z) {
            i2 = i;
        } else {
            i2 = 0;
        }
        C426750GoL.LJIIL(view, null, null, null, Integer.valueOf(i2), 23);
        if (LLLLLLJ().getVisibility() != 0) {
            LLLLLZL(false);
        }
        LLLLZLL(pair, pair2, pair3, this, z, i, 1.0f);
        C12WG.LIZJ(this, new ARunnableS27S0110000_8(this, z, 3));
    }

    public static final void LLLLZLL(Pair<C0MFZ, C0MFZ> pair, Pair<C0MFT, C0MFT> pair2, Pair<C0MFX, C0MFX> pair3, C0MFP c0mfp, boolean z, int i, float f) {
        float f2;
        int iLLLLZLLIL = LLLLZLLIL(f, pair.getFirst().LIZ, pair.getSecond().LIZ);
        int iLLLLZLLIL2 = LLLLZLLIL(f, pair2.getFirst().LIZIZ, pair2.getSecond().LIZIZ);
        int iLLLLZLLIL3 = LLLLZLLIL(f, pair2.getFirst().LIZJ, pair2.getSecond().LIZJ);
        int iLLLLZLLIL4 = LLLLZLLIL(f, pair2.getFirst().LIZ, pair2.getSecond().LIZ);
        int iLLLLZLLIL5 = LLLLZLLIL(f, pair2.getFirst().LIZLLL, pair2.getSecond().LIZLLL);
        int iLLLLZLLIL6 = LLLLZLLIL(f, pair3.getFirst().LIZ, pair3.getSecond().LIZ);
        int iLLLLZLLIL7 = LLLLZLLIL(f, pair3.getFirst().LIZIZ, pair3.getSecond().LIZIZ);
        int iLLLLZLLIL8 = LLLLZLLIL(f, pair3.getFirst().LIZJ, pair3.getSecond().LIZJ);
        float f3 = pair2.getFirst().LJ;
        float f4 = ((pair2.getSecond().LJ - f3) * f * 2) + f3;
        C426750GoL.LJIIIZ((View) c0mfp.LLLLIILL.getValue(), null, null, null, Integer.valueOf(iLLLLZLLIL), false, 23);
        C426750GoL.LJIIIZ(c0mfp.LLLLLLIL(), Integer.valueOf(iLLLLZLLIL2), null, Integer.valueOf(iLLLLZLLIL3), Integer.valueOf(iLLLLZLLIL4), false, 18);
        C1383370m6R.LJIILJJIL(-1, iLLLLZLLIL5, c0mfp.LLLLLLIL());
        C426750GoL.LJIIIZ(c0mfp.LLLLLLL(), null, Integer.valueOf(iLLLLZLLIL6), null, Integer.valueOf(iLLLLZLLIL7), false, 21);
        C426750GoL.LJIIIZ(c0mfp.LLLLLLLLL(), Integer.valueOf(iLLLLZLLIL8), null, Integer.valueOf(iLLLLZLLIL8), null, false, 26);
        TuxTextView tuxTextView = (TuxTextView) c0mfp.LLJJJJ.getValue();
        if (c0mfp.LLLLII) {
            f2 = 1 - f;
        } else {
            f2 = f;
        }
        C786410Ut5.B5(tuxTextView, f2);
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showKey:");
        sbLIZ.append(z);
        sbLIZ.append(", keyHeight:");
        sbLIZ.append(i);
        sbLIZ.append(", ivW:");
        sbLIZ.append(c0mfp.LLLLLLL().getWidth());
        sbLIZ.append(", ivH:");
        sbLIZ.append(c0mfp.LLLLLLL().getHeight());
        sbLIZ.append(", value:");
        sbLIZ.append(f);
        C201955140j.LJIILJJIL(c0l76, C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.W4((LinearLayout) c0mfp.LLJLLL.getValue(), f4);
        C786410Ut5.W4((LinearLayout) c0mfp.LLJZ.getValue(), 1.0f - f4);
        c0mfp.LLLZLL();
        c0mfp.LLLZIL();
    }
}
