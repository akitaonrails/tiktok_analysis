package X;

import Y.ACListenerS140S0100000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Ec8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368220Ec8 extends RelativeLayout {
    public static final int LLLLLILLIL = C0FU0.LIZ(10.0f);
    public static final long LLLLLJIL = ((Number) C0E5G.LIZIZ(EnumC357850E1f.VIDEO_CLIP_MIN_DURATION, 100L)).longValue();
    public LinearLayout LL;
    public C368230Ec9 LLILLJJLI;
    public C368400EcQ LLILLL;
    public C368290EcF LLILZ;
    public ViewStub LLILZIL;
    public RelativeLayout LLILZLL;
    public TextView LLIZ;
    public TextView LLIZLLLIL;
    public C368210Ec7 LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public Function0<Boolean> LLJILJIL;
    public C0E6E LLJILJILJ;
    public int LLJILLL;
    public float LLJJ;
    public long LLJJI;
    public long LLJJIII;
    public long LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public NLETrackSlot LLJJJ;
    public int LLJJJIL;
    public InterfaceC368360EcM LLJJJJ;
    public InterfaceC368590Ecj LLJJJJJIL;
    public float LLJJJJLIIL;
    public float LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public float LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public float LLJLLIL;
    public float LLJLLL;
    public boolean LLJZ;
    public float LLJZIJLIL;
    public int LLL;
    public int LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public final long LLLFZ;
    public final ValueAnimator LLLI;
    public final RelativeLayout.LayoutParams LLLII;
    public final C368240EcA LLLIIII;
    public final C368290EcF LLLIIIIL;
    public ImageView LLLIIIL;
    public View LLLIIL;
    public boolean LLLIILIL;
    public long LLLIL;
    public long LLLILZ;
    public boolean LLLILZJ;
    public final C368390EcP LLLILZLLLI;
    public final int LLLIZZ;
    public final int LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public EnumC368970EdL LLLL;
    public int LLLLII;
    public EnumC368970EdL LLLLIIIILLL;
    public InterfaceC369180Edg LLLLIIL;
    public float LLLLIILL;
    public EnumC368970EdL LLLLIILLL;
    public final C01GW LLLLIL;
    public boolean LLLLILI;
    public final C01GW LLLLJ;
    public final C01GW LLLLJI;
    public boolean LLLLL;
    public boolean LLLLLIL;

    public final void LJIIIZ() {
        int[] iArr = new int[2];
        getCheckboxFromXml().getLocationOnScreen(iArr);
        int i = iArr[0];
        this.LLL = this.LLLJ + this.LLLIZZ + i;
        this.LLLF = ((i + getCheckboxFromXml().getWidth()) - this.LLLJ) - this.LLLIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leftPosition is ");
        sbLIZ.append(this.LLL);
        sbLIZ.append(" right position is ");
        sbLIZ.append(this.LLLF);
        C355090Dw3.LIZIZ("ItemTrackLayout", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void setCoverMode(boolean z) {
    }

    private final FrameCacheViewModel getFrameCacheViewModel() {
        return (FrameCacheViewModel) this.LLLLIL.getValue();
    }

    private final float getInitLeftWithSpeed() {
        return (this.LLJJI / this.LLJJIJIIJIL) * C360610EBv.LIZJ();
    }

    private final float getInitRightWithSpeed() {
        return (((this.LLJJIJI - this.LLJJIII) - this.LLJJI) / this.LLJJIJIIJIL) * C360610EBv.LIZJ();
    }

    private final float getMaxLengthWithSpeed() {
        return (this.LLJJIJI / this.LLJJIJIIJIL) * C360610EBv.LIZJ();
    }

    private final Drawable getTransitionDrawableWithBorder() {
        return (Drawable) this.LLLLJ.getValue();
    }

    private final Drawable getTransitionDrawableWithoutBorder() {
        return (Drawable) this.LLLLJI.getValue();
    }

    public final void LIZ() {
        setTrackWidth(C360610EBv.LIZJ);
        C368230Ec9 itemFrameViewFromXml = getItemFrameViewFromXml();
        itemFrameViewFromXml.LLIZLLLIL = true;
        itemFrameViewFromXml.invalidate();
    }

    public final void LIZLLL() {
        ImageView imageView = this.LLLIIIL;
        if (imageView != null) {
            C368610Ecl.LIZIZ(imageView);
        }
        getCheckboxFromXml().setHandlerGone(true);
        RelativeLayout.LayoutParams layoutParams = this.LLLII;
        C368390EcP c368390EcP = this.LLLILZLLLI;
        layoutParams.setMarginStart(c368390EcP.LJI + c368390EcP.LJII);
        RelativeLayout.LayoutParams layoutParams2 = this.LLLII;
        C368390EcP c368390EcP2 = this.LLLILZLLLI;
        layoutParams2.setMarginEnd(c368390EcP2.LJI + c368390EcP2.LJII);
        C368240EcA c368240EcA = this.LLLIIII;
        ImageView imageView2 = c368240EcA.LIZIZ;
        if (imageView2 != null) {
            c368240EcA.LJIILJJIL.width = c368240EcA.LJIJJ;
            C786410Ut5.LJJL(imageView2, c368240EcA.LJIIIZ);
            c368240EcA.LIZLLL();
        }
        this.LLLIIII.LIZIZ();
        C368240EcA c368240EcA2 = this.LLLIIII;
        TextView textView = c368240EcA2.LJI;
        if (textView != null) {
            c368240EcA2.LJIILJJIL.width = c368240EcA2.LJIJJ;
            C786410Ut5.LJJL(textView, c368240EcA2.LJIIIZ);
            c368240EcA2.LIZLLL();
        }
        C368240EcA c368240EcA3 = this.LLLIIII;
        TextView textView2 = c368240EcA3.LJII;
        if (textView2 != null) {
            c368240EcA3.LJIILJJIL.width = c368240EcA3.LJIJJ;
            C786410Ut5.LJJL(textView2, c368240EcA3.LJIIIZ);
            c368240EcA3.LIZLLL();
        }
    }

    public final boolean LJ() {
        return ((Boolean) this.LLLJIL.getValue()).booleanValue();
    }

    public final void LJI() {
        NLETrackSlot nLETrackSlot = this.LLJJJ;
        if (nLETrackSlot != null) {
            setMuteIcon(C351220Dpo.LLLFZ(nLETrackSlot));
            setAudioFilter(nLETrackSlot);
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            C367900Ebc c367900Ebc = new C367900Ebc(0);
            c367900Ebc.LIZIZ = (nLESegmentVideoDynamicCast.getSegCurveSpeedPoints().isEmpty() && nLESegmentVideoDynamicCast.getCurveSpeedPoints().isEmpty()) ? 0 : 1;
            c367900Ebc.LIZ = nLESegmentVideoDynamicCast.getAbsSpeed();
            nLESegmentVideoDynamicCast.getCurveAveSpeed();
            C351510DqH.LIZ.getClass();
            c367900Ebc.LIZJ = C351510DqH.LJJI(nLETrackSlot);
            setSpeed(c367900Ebc);
            setAIGenerateTag(nLETrackSlot);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI() {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368220Ec8.LJIIJJI():void");
    }

    public final C368210Ec7 getAnimMaskFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b3p);
            this.LLJ = (C368210Ec7) callbackFindViewById;
        }
        return (C368210Ec7) callbackFindViewById;
    }

    public final C368400EcQ getCheckboxFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dqk);
            this.LLILLL = (C368400EcQ) callbackFindViewById;
        }
        return (C368400EcQ) callbackFindViewById;
    }

    public final C368290EcF getFrameViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ijv);
            this.LLILZ = (C368290EcF) callbackFindViewById;
        }
        return (C368290EcF) callbackFindViewById;
    }

    public final LinearLayout getFramesLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ikf);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final InterfaceC369250Edn getHapticFeedback() {
        return (InterfaceC369250Edn) this.LLLJL.getValue();
    }

    public final TextView getIconAddEpilogueFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxl);
            this.LLIZLLLIL = (TextView) callbackFindViewById;
        }
        return (TextView) callbackFindViewById;
    }

    public final TextView getIconEpilogueFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxw);
            this.LLIZ = (TextView) callbackFindViewById;
        }
        return (TextView) callbackFindViewById;
    }

    public final C368230Ec9 getItemFrameViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l0x);
            this.LLILLJJLI = (C368230Ec9) callbackFindViewById;
        }
        return (C368230Ec9) callbackFindViewById;
    }

    public final RelativeLayout getRlEpilogueFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tnc);
            this.LLILZLL = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final float getTransitionWidth() {
        NLESegmentTransition endTransition;
        long transitionDuration = 0;
        if (C347020Dj2.LIZIZ(this.LLJJJ)) {
            NLETrackSlot nLETrackSlot = this.LLJJJ;
            if (nLETrackSlot != null && (endTransition = nLETrackSlot.getEndTransition()) != null) {
                transitionDuration = endTransition.getTransitionDuration();
            }
            transitionDuration /= (long) LSPassThroughRecordSizeConfig.DEFAULT;
        }
        return transitionDuration * C360610EBv.LIZJ();
    }

    public final ViewStub getVsEpilogueFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vsEpilogue);
            this.LLILZIL = (ViewStub) callbackFindViewById;
        }
        return (ViewStub) callbackFindViewById;
    }

    public final void LJIIJ() {
        getItemFrameViewFromXml().setRound(this.LLLILZLLLI.LJIIIIZZ);
        C368400EcQ checkboxFromXml = getCheckboxFromXml();
        C0E6E c0e6e = C0E6E.NONE;
        checkboxFromXml.LIZJ(c0e6e, false);
        this.LLJILJILJ = c0e6e;
        setDurationIcon(this.LLJJIII);
        getItemFrameViewFromXml().setTrackStyle(this.LLJILJILJ);
        this.LLLIIIIL.LIZIZ(this.LLJILJILJ);
        C368210Ec7 animMaskFromXml = getAnimMaskFromXml();
        if (animMaskFromXml != null) {
            animMaskFromXml.LIZIZ(this.LLJILJILJ, true);
        }
    }

    public final void LJIILIIL() {
        C368400EcQ checkboxFromXml = getCheckboxFromXml();
        RelativeLayout.LayoutParams layoutParams = this.LLLII;
        int marginStart = layoutParams.width + layoutParams.getMarginStart() + this.LLLII.getMarginEnd();
        ViewGroup.LayoutParams layoutParams2 = checkboxFromXml.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = marginStart;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(checkboxFromXml);
            checkboxFromXml.setLayoutParams(layoutParams2);
        }
        C368290EcF c368290EcF = this.LLLIIIIL;
        int i = this.LLLII.width;
        ViewGroup.LayoutParams layoutParams3 = c368290EcF.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.width = i;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c368290EcF);
            c368290EcF.setLayoutParams(layoutParams3);
        }
        C368210Ec7 animMaskFromXml = getAnimMaskFromXml();
        if (animMaskFromXml != null) {
            int i2 = this.LLLII.width;
            ViewGroup.LayoutParams layoutParams4 = animMaskFromXml.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.width = i2;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(animMaskFromXml);
                animMaskFromXml.setLayoutParams(layoutParams4);
            }
        }
    }

    public final int getScreenWidth() {
        return C0FU0.LIZJ(getContext());
    }

    public final long getDuration() {
        return this.LLJJIII;
    }

    public final boolean getEnableDragMode() {
        return this.LLJI;
    }

    public final boolean getEnableTransitionDuration$editor_trackpanel_release() {
        return this.LLLLILI;
    }

    public final boolean getEnable_Long_click() {
        return this.LLJIJIL;
    }

    public final int getIndex() {
        return this.LLJJJIL;
    }

    public final C0E6E getStyle() {
        return this.LLJILJILJ;
    }

    public final View getTransitionHighlight() {
        return this.LLLIIL;
    }

    public final ImageView getTransitionIcon() {
        return this.LLLIIIL;
    }

    public C368220Ec8(Context context) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(context, null, 0);
        this.LLJI = true;
        this.LLJIJIL = true;
        this.LLJILJILJ = C0E6E.NONE;
        this.LLJJIJIIJIL = 1.0f;
        this.LLJLLIL = 1.0f;
        this.LLLFZ = LLLLLJIL;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLLI = valueAnimatorOfFloat;
        Typeface typeface = C368130Ebz.LIZ;
        C368390EcP c368390EcPLIZ = C368130Ebz.LIZ(getContext());
        this.LLLILZLLLI = c368390EcPLIZ;
        this.LLLIZZ = c368390EcPLIZ.LJII;
        this.LLLJ = c368390EcPLIZ.LJFF;
        this.LLLJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 975));
        this.LLLJL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(281));
        EnumC368970EdL enumC368970EdL = EnumC368970EdL.NULL;
        this.LLLL = enumC368970EdL;
        this.LLLLIIIILLL = enumC368970EdL;
        this.LLLLIILLL = enumC368970EdL;
        this.LLLLIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(280));
        this.LLLLJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 976));
        this.LLLLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 977));
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d_n, this, true);
        this.LLLIIII = new C368240EcA(this, getFramesLayoutFromXml());
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) getFramesLayoutFromXml().getLayoutParams();
        this.LLLII = layoutParams3;
        int i = c368390EcPLIZ.LJFF + c368390EcPLIZ.LJII;
        layoutParams3.setMarginStart(i);
        layoutParams3.setMarginEnd(i);
        C368290EcF c368290EcF = (C368290EcF) findViewById(R.id.ijv);
        this.LLLIIIIL = c368290EcF;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c368290EcF.getLayoutParams();
        marginLayoutParams2.setMarginStart(i);
        marginLayoutParams2.setMarginEnd(i);
        C368210Ec7 animMaskFromXml = getAnimMaskFromXml();
        ViewGroup.LayoutParams layoutParams4 = animMaskFromXml != null ? animMaskFromXml.getLayoutParams() : null;
        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
        }
        C368230Ec9 itemFrameViewFromXml = getItemFrameViewFromXml();
        if (itemFrameViewFromXml != null && (layoutParams2 = itemFrameViewFromXml.getLayoutParams()) != null) {
            layoutParams2.width = C0FU0.LIZ(C368130Ebz.LJIIJJI);
        }
        C368230Ec9 itemFrameViewFromXml2 = getItemFrameViewFromXml();
        if (itemFrameViewFromXml2 != null && (layoutParams = itemFrameViewFromXml2.getLayoutParams()) != null) {
            layoutParams.height = C0FU0.LIZ(C368130Ebz.LJIIJ);
        }
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 21));
        this.LLLLLIL = true;
    }

    private final void setAIGenerateTag(NLETrackSlot nLETrackSlot) {
        String string;
        if (!this.LLLLLIL) {
            return;
        }
        if (!C0E5J.LIZ(nLETrackSlot)) {
            C368240EcA c368240EcA = this.LLLIIII;
            TextView textView = c368240EcA.LJIIIIZZ;
            if (textView != null) {
                c368240EcA.LJIILJJIL.width = c368240EcA.LJIJJ;
                C786410Ut5.LJJL(textView, c368240EcA.LJIIIZ);
                c368240EcA.LIZLLL();
                return;
            }
            return;
        }
        if (C0E5J.LIZJ(nLETrackSlot)) {
            string = getContext().getString(2131825367);
        } else if (C0E5J.LIZLLL(nLETrackSlot)) {
            string = getContext().getString(2131825365);
        } else {
            string = getContext().getString(2131825366);
        }
        C368240EcA c368240EcA2 = this.LLLIIII;
        if (c368240EcA2.LJIIIIZZ == null) {
            TextView textView2 = new TextView(c368240EcA2.LIZ.getContext());
            Integer numLIZ = C1308910kAL.LIZ(R.attr.ef, textView2.getContext());
            if (numLIZ != null) {
                textView2.setTextColor(numLIZ.intValue());
            }
            textView2.setBackground(c368240EcA2.LIZ());
            textView2.setTextSize(1, c368240EcA2.LJIIJ);
            textView2.setGravity(17);
            C369030EdR.LIZJ(textView2, C0FU0.LIZ(4.0f), 0, C0FU0.LIZ(4.0f), 0);
            textView2.setSingleLine(true);
            textView2.setTypeface(c368240EcA2.LJIIJJI);
            textView2.requestLayout();
            c368240EcA2.LJIIIIZZ = textView2;
        }
        TextView textView3 = c368240EcA2.LJIIIIZZ;
        if (textView3 != null) {
            c368240EcA2.LJIILJJIL.width = c368240EcA2.LJIJJ;
            C786410Ut5.LJJL(textView3, c368240EcA2.LJIIIZ);
            LinearLayout linearLayout = c368240EcA2.LJIIIZ;
            linearLayout.addView(textView3, linearLayout.getChildCount(), c368240EcA2.LJIIZILJ);
            c368240EcA2.LIZLLL();
        }
        TextView textView4 = c368240EcA2.LJIIIIZZ;
        if (textView4 == null) {
            return;
        }
        textView4.setText(string);
    }

    private final void setAudioFilter(NLETrackSlot nLETrackSlot) {
        String extra;
        if (!this.LLLLLIL) {
            return;
        }
        if (nLETrackSlot.hasExtra("extra_associated_vc_slot_id")) {
            extra = nLETrackSlot.getExtra("extra_voice_change_effect_name");
        } else {
            extra = "";
        }
        if (extra.length() == 0) {
            C368240EcA c368240EcA = this.LLLIIII;
            TextView textView = c368240EcA.LJII;
            if (textView != null) {
                c368240EcA.LJIILJJIL.width = c368240EcA.LJIJJ;
                C786410Ut5.LJJL(textView, c368240EcA.LJIIIZ);
                c368240EcA.LIZLLL();
                return;
            }
            return;
        }
        C368240EcA c368240EcA2 = this.LLLIIII;
        if (c368240EcA2.LJII == null) {
            TextView textView2 = new TextView(c368240EcA2.LIZ.getContext());
            c368240EcA2.LJII = textView2;
            Typeface typeface = C368130Ebz.LIZ;
            Integer numLIZIZ = C368130Ebz.LIZIZ(c368240EcA2.LIZ.getContext(), Integer.valueOf(R.attr.ef));
            if (numLIZIZ != null) {
                textView2.setTextColor(numLIZIZ.intValue());
            }
            textView2.setBackground(c368240EcA2.LIZ());
            textView2.setTextSize(1, c368240EcA2.LJIIJ);
            textView2.setGravity(17);
            C369030EdR.LIZJ(textView2, C0FU0.LIZ(4.0f), 0, C0FU0.LIZ(4.0f), 0);
            textView2.setSingleLine(true);
            textView2.setTypeface(c368240EcA2.LJIIJJI);
            textView2.requestLayout();
        }
        TextView textView3 = c368240EcA2.LJII;
        if (textView3 != null) {
            Drawable drawable = (Drawable) c368240EcA2.LJ.getValue();
            textView3.setCompoundDrawablePadding(c368240EcA2.LJIIL);
            if (C423170GiZ.LIZ(textView3.getContext())) {
                textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            } else {
                textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            c368240EcA2.LJIILJJIL.width = c368240EcA2.LJIJJ;
            C786410Ut5.LJJL(textView3, c368240EcA2.LJIIIZ);
            LinearLayout linearLayout = c368240EcA2.LJIIIZ;
            linearLayout.addView(textView3, linearLayout.getChildCount(), c368240EcA2.LJIILLIIL);
            c368240EcA2.LIZLLL();
        }
        TextView textView4 = c368240EcA2.LJII;
        if (textView4 == null) {
            return;
        }
        textView4.setText(extra);
    }

    private final void setDurationIcon(long j) {
        TextPaint paint;
        float fLIZ;
        int iLIZIZ;
        String strLJJIFFI;
        if (!this.LLLFF && this.LLJILJILJ != C0E6E.NONE) {
            float f = j / this.LLJJIJIIJIL;
            C368240EcA c368240EcA = this.LLLIIII;
            long j2 = (long) f;
            int iLIZ = 0;
            if (c368240EcA.LJI == null) {
                TextView textView = new TextView(c368240EcA.LIZ.getContext());
                c368240EcA.LJI = textView;
                textView.setTextColor(textView.getResources().getColor(R.color.bd));
                textView.setBackground(c368240EcA.LIZ());
                textView.setTextSize(1, c368240EcA.LJIIJ);
                textView.setGravity(17);
                C369030EdR.LIZJ(textView, C0FU0.LIZ(4.0f), 0, C0FU0.LIZ(4.0f), 0);
                textView.setMaxLines(1);
                textView.setTypeface(c368240EcA.LJIIJJI);
                textView.requestLayout();
            }
            TextView textView2 = c368240EcA.LJI;
            if (textView2 != null) {
                c368240EcA.LJIILJJIL.width = c368240EcA.LJIJJ;
                C786410Ut5.LJJL(textView2, c368240EcA.LJIIIZ);
                c368240EcA.LJIIIZ.addView(textView2, 0, c368240EcA.LJIJ);
                c368240EcA.LIZLLL();
            }
            String strLIZ = C367880Eba.LIZ(j2);
            TextView textView3 = c368240EcA.LJI;
            if (textView3 != null) {
                textView3.setText(strLIZ);
                String strJ4 = C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(j2 / 1000.0f)}, 1));
                String str = (String) c368240EcA.LJIILIIL.getValue();
                if (str == null || (strLJJIFFI = u.LJJIFFI(str, "{time}", strJ4, false)) == null) {
                    strLJJIFFI = "";
                }
                textView3.setContentDescription(strLJJIFFI);
            }
            LinearLayout.LayoutParams layoutParams = c368240EcA.LJIJ;
            TextView textView4 = c368240EcA.LJI;
            if (textView4 != null) {
                paint = textView4.getPaint();
            } else {
                paint = null;
            }
            int length = strLIZ.length();
            if (paint != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(u.LJJ(length - 3, CardStruct.IStatusCode.DEFAULT));
                sbLIZ.append(".00");
                fLIZ = paint.measureText(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                fLIZ = C0FU0.LIZ(29.0f);
            }
            TextView textView5 = c368240EcA.LJI;
            if (textView5 != null) {
                iLIZIZ = C369030EdR.LIZIZ(textView5);
            } else {
                iLIZIZ = 0;
            }
            float f2 = fLIZ + iLIZIZ;
            TextView textView6 = c368240EcA.LJI;
            if (textView6 != null) {
                iLIZ = C369030EdR.LIZ(textView6);
            }
            layoutParams.width = (int) (f2 + iLIZ);
            TextView textView7 = c368240EcA.LJI;
            if (textView7 != null) {
                C786410Ut5.g6(textView7, c368240EcA.LJIJ);
            }
        } else {
            C368240EcA c368240EcA2 = this.LLLIIII;
            TextView textView8 = c368240EcA2.LJI;
            if (textView8 != null) {
                c368240EcA2.LJIILJJIL.width = c368240EcA2.LJIJJ;
                C786410Ut5.LJJL(textView8, c368240EcA2.LJIIIZ);
                c368240EcA2.LIZLLL();
            }
        }
        LJIILJJIL(this.LLLLII);
    }

    private final void setTrackWidth(int i) {
        this.LLLII.width = i;
        C786410Ut5.d6(getFramesLayoutFromXml(), this.LLLII);
        LJIILIIL();
    }

    public final void LIZJ(float f) {
        float f2;
        int iLIZIZ;
        int iLIZIZ2;
        if (this.LLLL == EnumC368970EdL.NULL) {
            this.LLJLIL += f;
            if (LJ()) {
                f2 = this.LLJLL - this.LLJLIL;
            } else {
                f2 = this.LLJLL + this.LLJLIL;
            }
            if (Math.abs((C360610EBv.LIZIZ() / 2) - f2) < LLLLLILLIL) {
                if (LJ()) {
                    iLIZIZ = this.LLL;
                    iLIZIZ2 = C360610EBv.LIZIZ() / 2;
                } else {
                    iLIZIZ = C360610EBv.LIZIZ() / 2;
                    iLIZIZ2 = this.LLLF;
                }
                f = iLIZIZ - iLIZIZ2;
                if (f != 0.0f) {
                    getHapticFeedback().LIZ(this, C0E4C.VIBRATE_IMPACT_LIGHT);
                }
            } else if (this.LLLLL) {
                getHapticFeedback().LIZ(this, C0E4C.VIBRATE_IMPACT_LIGHT);
            }
        }
        this.LLJJL -= f;
        LJII(f, false);
        InterfaceC368360EcM interfaceC368360EcM = this.LLJJJJ;
        if (interfaceC368360EcM != null) {
            interfaceC368360EcM.LIZJ(this.LLJJIJIL, this.LLJJJIL, (int) f, 1);
        }
    }

    public final void LJFF(boolean z) {
        boolean z2;
        if (this.LLLILZJ && this.LLJILJILJ == C0E6E.LINE) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && ((!this.LLLFF || this.LLLFFI) && z2 && !this.LLLIILIL)) {
            ImageView imageView = this.LLLIIIL;
            if (imageView != null) {
                C368610Ecl.LIZJ(imageView);
            }
            ImageView imageView2 = this.LLLIIIL;
            if (imageView2 != null) {
                imageView2.bringToFront();
                return;
            }
            return;
        }
        ImageView imageView3 = this.LLLIIIL;
        if (imageView3 == null) {
            return;
        }
        C368610Ecl.LIZIZ(imageView3);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(int r10) {
        /*
            r9 = this;
            r9.LLLLII = r10
            X.0E6E r1 = r9.LLJILJILJ
            X.0E6E r0 = X.C0E6E.CLIP
            if (r1 == r0) goto Lc
            X.0E6E r0 = X.C0E6E.LINE
            if (r1 != r0) goto L9e
        Lc:
            boolean r0 = r9.LJ()
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L95
            int r0 = r9.getScreenWidth()
            int r0 = -r0
            float r3 = (float) r0
            float r3 = r3 / r1
            float r0 = (float) r10
            float r3 = r3 - r0
        L1d:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r9.LLJJJ
            r1 = 0
            if (r0 == 0) goto L92
            long r6 = r0.getMeasuredEndTime()
        L27:
            r8 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r8
            long r6 = r6 / r4
            float r5 = (float) r6
            float r0 = X.C360610EBv.LIZJ()
            float r5 = r5 * r0
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r9.LLJJJ
            if (r0 == 0) goto L39
            long r1 = r0.getStartTime()
        L39:
            float r4 = (float) r1
            float r0 = X.C360610EBv.LIZJ()
            float r4 = r4 * r0
            float r0 = (float) r8
            float r4 = r4 / r0
            X.0EcA r0 = r9.LLLIIII
            android.widget.RelativeLayout$LayoutParams r0 = r0.LJIILJJIL
            int r0 = r0.getMarginStart()
            float r0 = (float) r0
            float r0 = r0 + r4
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9e
            X.0EcA r2 = r9.LLLIIII
            int r0 = r2.LJIJI
            float r1 = (float) r0
            float r0 = r1 + r3
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L8e
            float r3 = r3 - r4
            android.widget.RelativeLayout$LayoutParams r0 = r2.LJIILJJIL
            int r0 = r0.getMarginStart()
            float r0 = (float) r0
            float r3 = r3 - r0
        L63:
            X.0EcA r1 = r9.LLLIIII
            boolean r0 = r9.LJ()
            if (r0 == 0) goto L6c
            float r3 = -r3
        L6c:
            android.widget.LinearLayout r0 = r1.LJIIIZ
            X.C786410Ut5.Mc(r0, r3)
            boolean r0 = r9.LLLFF
            if (r0 != 0) goto L8d
            X.0Ec9 r2 = r9.getItemFrameViewFromXml()
            r2.getClass()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto La0
            r2.invalidate()
        L8d:
            return
        L8e:
            float r5 = r5 - r4
            float r3 = r5 - r1
            goto L63
        L92:
            r6 = 0
            goto L27
        L95:
            float r3 = (float) r10
            int r0 = r9.getScreenWidth()
            float r0 = (float) r0
            float r0 = r0 / r1
            float r3 = r3 - r0
            goto L1d
        L9e:
            r3 = 0
            goto L63
        La0:
            r2.postInvalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368220Ec8.LJIILJJIL(int):void");
    }

    public final void LJIILL(EnumC368330EcJ enumC368330EcJ) {
        View view;
        int i = C368320EcI.LIZIZ[enumC368330EcJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (this.LLLLILI) {
                        View view2 = this.LLLIIL;
                        if (view2 != null) {
                            view2.setBackground(getTransitionDrawableWithoutBorder());
                        }
                        View view3 = this.LLLIIL;
                        if (view3 != null) {
                            C368610Ecl.LIZJ(view3);
                        }
                        View view4 = this.LLLIIL;
                        if (view4 != null) {
                            view4.bringToFront();
                        }
                        ImageView imageView = this.LLLIIIL;
                        if (imageView != null) {
                            imageView.bringToFront();
                            return;
                        }
                        return;
                    }
                    View view5 = this.LLLIIL;
                    if (view5 == null) {
                        return;
                    }
                    C368610Ecl.LIZIZ(view5);
                    return;
                }
                throw new C1954807lC();
            }
            if (this.LLLLILI && (view = this.LLLIIL) != null) {
                view.setBackground(getTransitionDrawableWithBorder());
            }
            View view6 = this.LLLIIL;
            if (view6 != null) {
                C368610Ecl.LIZJ(view6);
            }
            View view7 = this.LLLIIL;
            if (view7 != null) {
                view7.bringToFront();
            }
            ImageView imageView2 = this.LLLIIIL;
            if (imageView2 == null) {
                return;
            }
            imageView2.bringToFront();
            return;
        }
        View view8 = this.LLLIIL;
        if (view8 == null) {
            return;
        }
        C368610Ecl.LIZIZ(view8);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x = motionEvent.getX();
            if (LJ()) {
                x = getWidth() - x;
            }
            long j = this.LLLIL;
            if (j != 0 && x <= (j * C360610EBv.LIZJ()) / 2) {
                if (this.LLJILJILJ != C0E6E.CLIP) {
                    return true;
                }
                return false;
            }
            if (this.LLLILZ != 0 && x >= getWidth() - ((this.LLLILZ * C360610EBv.LIZJ()) / 2)) {
                if (this.LLJILJILJ != C0E6E.CLIP) {
                    return true;
                }
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setAnimMaskFromXml(C368210Ec7 c368210Ec7) {
        this.LLJ = c368210Ec7;
    }

    public final void setCheckboxFromXml(C368400EcQ c368400EcQ) {
        this.LLILLL = c368400EcQ;
    }

    public final void setClipState(EnumC368970EdL enumC368970EdL) {
        if (this.LLLLIIIILLL != enumC368970EdL) {
            this.LLLLIIIILLL = enumC368970EdL;
        }
    }

    public final void setClipType(boolean z) {
        bringToFront();
        getItemFrameViewFromXml().setRound(0);
        C368400EcQ checkboxFromXml = getCheckboxFromXml();
        C0E6E c0e6e = C0E6E.CLIP;
        checkboxFromXml.LIZJ(c0e6e, z);
        this.LLJILJILJ = c0e6e;
        if (!this.LLLFF) {
            getCheckboxFromXml().getLeftHandler().LJ = true;
            getCheckboxFromXml().getRightHandler().LJ = true;
        }
        setDurationIcon(this.LLJJIII);
        getItemFrameViewFromXml().setTrackStyle(this.LLJILJILJ);
        this.LLLIIIIL.LIZIZ(this.LLJILJILJ);
    }

    public final void setDockerTopLevel(Function0<Boolean> function0) {
        this.LLJILJIL = function0;
    }

    public final void setDrawMyTransitionOverlap(boolean z) {
        getItemFrameViewFromXml().setDrawMyTransitionOverlap(z);
    }

    public final void setDrawPreTransitionOverlap(boolean z) {
        getItemFrameViewFromXml().setDrawPreTransitionOverlap(z);
    }

    public final void setDuration(long j) {
        this.LLJJIII = j;
    }

    public final void setEnableDragMode(boolean z) {
        this.LLJI = z;
    }

    public final void setEnableTransitionDuration$editor_trackpanel_release(boolean z) {
        this.LLLLILI = z;
    }

    public final void setEnable_Long_click(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setEndDivider(boolean z) {
        getItemFrameViewFromXml().setEndDivider(z);
    }

    public final void setEpilogueEnable(boolean z) {
        this.LLLFFI = z;
        if (z) {
            C786410Ut5.LLIL(getIconEpilogueFromXml(), 0);
            C786410Ut5.LLIL(getIconAddEpilogueFromXml(), 8);
        } else {
            C786410Ut5.LLIL(getIconAddEpilogueFromXml(), 0);
            C786410Ut5.LLIL(getIconEpilogueFromXml(), 8);
        }
        LJIIJJI();
    }

    public final void setFilterIcon(String str) {
        Context context;
        TextView textView;
        if (!this.LLLLLIL || this.LLLFF) {
            return;
        }
        if (str != null && !a0.LJJJIL(str)) {
            Function0<Boolean> function0 = this.LLJILJIL;
            if (function0 != null && function0.invoke().booleanValue()) {
                return;
            }
            C368240EcA c368240EcA = this.LLLIIII;
            c368240EcA.LJ();
            if (!TextUtils.isEmpty(str) && (textView = c368240EcA.LJFF) != null) {
                textView.setText(str);
            }
            TextView textView2 = c368240EcA.LJFF;
            if (textView2 != null) {
                context = textView2.getContext();
            } else {
                context = null;
            }
            if (C423170GiZ.LIZ(context)) {
                TextView textView3 = c368240EcA.LJFF;
                if (textView3 == null) {
                    return;
                }
                textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.byz, 0);
                return;
            }
            TextView textView4 = c368240EcA.LJFF;
            if (textView4 == null) {
                return;
            }
            textView4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.byz, 0, 0, 0);
            return;
        }
        this.LLLIIII.LIZIZ();
    }

    public final void setFooterType(boolean z) {
        this.LLLFF = z;
    }

    public final void setFrameSelectChangeListener(InterfaceC369190Edh interfaceC369190Edh) {
        this.LLLIIIIL.setFrameSelectChangeChangeListener(interfaceC369190Edh);
    }

    public final void setFrameViewCallback(InterfaceC369150Edd interfaceC369150Edd) {
        this.LLLIIIIL.setFrameViewCallback(interfaceC369150Edd);
    }

    public final void setFrameViewFromXml(C368290EcF c368290EcF) {
        this.LLILZ = c368290EcF;
    }

    public final void setFramesLayoutFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setIconAddEpilogueFromXml(TextView textView) {
        this.LLIZLLLIL = textView;
    }

    public final void setIconEpilogueFromXml(TextView textView) {
        this.LLIZ = textView;
    }

    public final void setIndex(int i) {
        this.LLJJJIL = i;
    }

    public final void setIsAiExtendVisible(boolean z) {
        C368230Ec9 itemFrameViewFromXml = getItemFrameViewFromXml();
        if (itemFrameViewFromXml != null) {
            itemFrameViewFromXml.setAiExtendVisible(z);
        }
        C368230Ec9 itemFrameViewFromXml2 = getItemFrameViewFromXml();
        if (itemFrameViewFromXml2 != null) {
            itemFrameViewFromXml2.invalidate();
        }
        C368400EcQ checkboxFromXml = getCheckboxFromXml();
        if (checkboxFromXml != null) {
            checkboxFromXml.setIsAiExtendVisible(z);
        }
    }

    public final void setIsLastSlot(boolean z) {
        C368230Ec9 itemFrameViewFromXml = getItemFrameViewFromXml();
        if (itemFrameViewFromXml != null) {
            itemFrameViewFromXml.setLastSlot(z);
        }
        C368230Ec9 itemFrameViewFromXml2 = getItemFrameViewFromXml();
        if (itemFrameViewFromXml2 != null) {
            itemFrameViewFromXml2.invalidate();
        }
        C368400EcQ checkboxFromXml = getCheckboxFromXml();
        if (checkboxFromXml != null) {
            checkboxFromXml.setIsLastSlot(z);
        }
    }

    public final void setItemFrameViewFromXml(C368230Ec9 c368230Ec9) {
        this.LLILLJJLI = c368230Ec9;
    }

    public final void setItemTrackCallback(InterfaceC368360EcM interfaceC368360EcM) {
        this.LLJJJJ = interfaceC368360EcM;
        getItemFrameViewFromXml().setFrameFetcher(new C367780EbQ(interfaceC368360EcM));
        getItemFrameViewFromXml().setDragThumbMask(interfaceC368360EcM.LJIIIIZZ());
    }

    public final void setLineType(Boolean bool) {
        bringToFront();
        getItemFrameViewFromXml().setRound(this.LLLILZLLLI.LJIIIIZZ);
        C368400EcQ checkboxFromXml = getCheckboxFromXml();
        C0E6E c0e6e = C0E6E.LINE;
        checkboxFromXml.LIZJ(c0e6e, false);
        this.LLJILJILJ = c0e6e;
        setDurationIcon(this.LLJJIII);
        getItemFrameViewFromXml().setTrackStyle(this.LLJILJILJ);
        C368210Ec7 animMaskFromXml = getAnimMaskFromXml();
        if (animMaskFromXml != null) {
            animMaskFromXml.LIZIZ(this.LLJILJILJ, true);
        }
        if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            C368610Ecl.LIZIZ(this.LLLIIIIL);
        } else {
            this.LLLIIIIL.LIZIZ(this.LLJILJILJ);
        }
    }

    public final void setMuteIcon(boolean z) {
        int iIndexOfChild;
        if (this.LLLLLIL && !this.LLLFF) {
            NLETrackSlot nLETrackSlot = this.LLJJJ;
            if (nLETrackSlot != null && !C351220Dpo.LLI(nLETrackSlot)) {
                return;
            }
            if (z) {
                C368240EcA c368240EcA = this.LLLIIII;
                if (c368240EcA.LIZIZ == null) {
                    ImageView imageView = new ImageView(c368240EcA.LIZ.getContext());
                    imageView.setBackground(c368240EcA.LIZ());
                    imageView.setImageDrawable(c368240EcA.LIZJ);
                    int iLIZ = (c368240EcA.LJIJJLI - C0FU0.LIZ(12.0f)) / 2;
                    C369030EdR.LIZJ(imageView, C0FU0.LIZ(3.0f), iLIZ, C0FU0.LIZ(3.0f), iLIZ);
                    imageView.requestLayout();
                    c368240EcA.LIZIZ = imageView;
                }
                TextView textView = c368240EcA.LJII;
                if (textView != null) {
                    iIndexOfChild = c368240EcA.LJIIIZ.indexOfChild(textView);
                } else {
                    iIndexOfChild = -1;
                }
                ImageView imageView2 = c368240EcA.LIZIZ;
                if (imageView2 == null) {
                    return;
                }
                c368240EcA.LJIILJJIL.width = c368240EcA.LJIJJ;
                C786410Ut5.LJJL(imageView2, c368240EcA.LJIIIZ);
                c368240EcA.LJIIIZ.addView(imageView2, iIndexOfChild, c368240EcA.LJIILL);
                c368240EcA.LIZLLL();
                return;
            }
            C368240EcA c368240EcA2 = this.LLLIIII;
            ImageView imageView3 = c368240EcA2.LIZIZ;
            if (imageView3 == null) {
                return;
            }
            c368240EcA2.LJIILJJIL.width = c368240EcA2.LJIJJ;
            C786410Ut5.LJJL(imageView3, c368240EcA2.LJIIIZ);
            c368240EcA2.LIZLLL();
        }
    }

    public final void setOnDragListener(InterfaceC368590Ecj interfaceC368590Ecj) {
        this.LLJJJJJIL = interfaceC368590Ecj;
    }

    public final void setOnEpilogueEnableListener(Function0<Unit> function0) {
        C786410Ut5.T7(getIconAddEpilogueFromXml(), new ACListenerS140S0100000_5(function0, 111));
    }

    public final void setOnFirstBitmapCallback(Function0<Unit> function0) {
        C368230Ec9 itemFrameViewFromXml = getItemFrameViewFromXml();
        if (itemFrameViewFromXml != null) {
            itemFrameViewFromXml.setOnBitmapFirstDrawn(function0);
        }
    }

    public final void setRlEpilogueFromXml(RelativeLayout relativeLayout) {
        this.LLILZLL = relativeLayout;
    }

    public final void setScrollHandler(InterfaceC369180Edg interfaceC369180Edg) {
        this.LLLLIIL = interfaceC369180Edg;
    }

    public final void setScrollState(EnumC368970EdL enumC368970EdL) {
        int i;
        int i2;
        if (this.LLLL == enumC368970EdL) {
            return;
        }
        this.LLLL = enumC368970EdL;
        if (C368320EcI.LIZ[enumC368970EdL.ordinal()] == 1) {
            if (LJ()) {
                i = this.LLLF;
            } else {
                i = this.LLL;
            }
            this.LLJLILLLLZIIL = i;
            if (LJ()) {
                i2 = this.LLL;
            } else {
                i2 = this.LLLF;
            }
            this.LLJLL = i2;
            this.LLJLIL = 0.0f;
            this.LLLI.cancel();
            return;
        }
        this.LLLI.start();
    }

    public final void setShowTips(boolean z) {
        this.LLLLLIL = z;
    }

    public final void setSpeed(C367900Ebc c367900Ebc) {
        if (!this.LLLLLIL) {
            return;
        }
        NLETrackSlot nLETrackSlot = this.LLJJJ;
        if ((nLETrackSlot == null || !C351220Dpo.LLJJIJIL(nLETrackSlot)) && c367900Ebc != null) {
            if (c367900Ebc.LIZIZ == 0) {
                float f = c367900Ebc.LIZ;
                if (f - 1.0f > -0.1f && f - 1.0f < 0.1f) {
                    this.LLLIIII.LIZIZ();
                    return;
                } else {
                    this.LLLIIII.LJFF(C786410Ut5.k4(Locale.ENGLISH, "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(((int) (this.LLJJIJIIJIL * 10)) / 10.0f)}, 1)));
                    return;
                }
            }
            this.LLLIIII.LJFF(c367900Ebc.LIZJ);
        }
    }

    public final void setStartDivider(boolean z) {
        getItemFrameViewFromXml().setStartDivider(z);
    }

    public final void setTransitionHighlight(View view) {
        this.LLLIIL = view;
    }

    public final void setTransitionIcon(int i) {
        ImageView imageView;
        if (this.LLLLLIL && (imageView = this.LLLIIIL) != null) {
            Typeface typeface = C368130Ebz.LIZ;
            Drawable drawable = C368130Ebz.LIZJ(getContext()).LIZJ;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            } else {
                imageView.setImageResource(i);
            }
        }
    }

    public final void setTransitionIconForceHidden(boolean z) {
        this.LLLIILIL = z;
    }

    public final void setTransitionSelected(boolean z) {
        EnumC368330EcJ enumC368330EcJ;
        ImageView imageView = this.LLLIIIL;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        if (z) {
            enumC368330EcJ = EnumC368330EcJ.WITH_BORDER;
        } else {
            enumC368330EcJ = EnumC368330EcJ.WITHOUT_BORDER;
        }
        LJIILL(enumC368330EcJ);
    }

    public final void setViewAnimCallback(InterfaceC369560EeI interfaceC369560EeI) {
        C368210Ec7 animMaskFromXml = getAnimMaskFromXml();
        if (animMaskFromXml != null) {
            animMaskFromXml.setViewAnimCallback(interfaceC369560EeI);
        }
    }

    public final void setVsEpilogueFromXml(ViewStub viewStub) {
        this.LLILZIL = viewStub;
    }

    private final void setScrollState(float f) {
        EnumC368970EdL enumC368970EdL;
        int screenWidth = getScreenWidth();
        int i = C360610EBv.LIZ;
        int i2 = C360610EBv.LJIIJJI;
        if (f >= screenWidth - i2) {
            if (LJ()) {
                enumC368970EdL = EnumC368970EdL.START;
            } else {
                enumC368970EdL = EnumC368970EdL.END;
            }
        } else if (f <= i2) {
            if (LJ()) {
                enumC368970EdL = EnumC368970EdL.END;
            } else {
                enumC368970EdL = EnumC368970EdL.START;
            }
        } else {
            enumC368970EdL = EnumC368970EdL.NULL;
        }
        setScrollState(enumC368970EdL);
    }

    public final void setTransitionIcon(ImageView imageView) {
        this.LLLIIIL = imageView;
    }

    public final void LJII(float f, boolean z) {
        float f2 = this.LLJZIJLIL + f;
        this.LLJZIJLIL = f2;
        this.LLLII.width = Math.round(f2);
        C786410Ut5.d6(getFramesLayoutFromXml(), this.LLLII);
        LJIILIIL();
        if (this.LLJZ && this.LLJZIJLIL + Math.abs(this.LLJILLL) > getItemFrameViewFromXml().getLayoutParams().width) {
            getItemFrameViewFromXml().LJ(this.LLLII.width + Math.abs(this.LLJILLL));
        }
        this.LLJILLL = C369030EdR.LIZIZ(getFramesLayoutFromXml());
        this.LLJJI = (long) ((Math.abs(r0) / C360610EBv.LIZJ()) * this.LLJJIJIIJIL);
        float f3 = this.LLJZIJLIL;
        this.LLJJ = f3;
        long jRound = Math.round((f3 / C360610EBv.LIZJ()) * this.LLJJIJIIJIL);
        this.LLJJIII = jRound;
        setDurationIcon(jRound);
        int iRound = Math.round(this.LLJZIJLIL) - C814420VxA.LIZIZ((this.LLLIL * C360610EBv.LIZJ()) / 2);
        C368240EcA c368240EcA = this.LLLIIII;
        c368240EcA.LJIJJ = iRound;
        if (iRound <= 0) {
            C786410Ut5.LJZL(8, c368240EcA.LJIIIZ);
        } else {
            C786410Ut5.LJZL(0, c368240EcA.LJIIIZ);
        }
        C368240EcA c368240EcA2 = this.LLLIIII;
        c368240EcA2.LJIILJJIL.width = iRound;
        C786410Ut5.d6(c368240EcA2.LJIIIZ, c368240EcA2.LJIILJJIL);
        if (!z) {
            float f4 = this.LLJJIJIL + f;
            this.LLJJIJIL = f4;
            InterfaceC368360EcM interfaceC368360EcM = this.LLJJJJ;
            if (interfaceC368360EcM != null) {
                interfaceC368360EcM.LJ(this.LLJJIJIIJIL, 1, this.LLJJI, this.LLJJIII, this.LLJJJIL, f4);
            }
            C368230Ec9 itemFrameViewFromXml = getItemFrameViewFromXml();
            itemFrameViewFromXml.LLIZ = this.LLJJIJIL;
            itemFrameViewFromXml.invalidate();
        }
        C355090Dw3.LIZIZ("ItemTrackLayout", "recycle layoutParams.width is " + this.LLLII.width);
    }

    public final void LJIIL(float f, boolean z) {
        float f2 = this.LLJZIJLIL - f;
        this.LLJZIJLIL = f2;
        this.LLLII.width = Math.round(f2);
        C786410Ut5.d6(getFramesLayoutFromXml(), this.LLLII);
        LJIILIIL();
        this.LLJJ = this.LLJZIJLIL;
        C369030EdR.LIZJ(getFramesLayoutFromXml(), Math.round(C369030EdR.LIZIZ(getFramesLayoutFromXml()) - f), 0, 0, 0);
        this.LLJILLL = C369030EdR.LIZIZ(getFramesLayoutFromXml());
        this.LLJJI = (long) ((Math.abs(r0) / C360610EBv.LIZJ()) * this.LLJJIJIIJIL);
        long jRound = Math.round((this.LLJJ / C360610EBv.LIZJ()) * this.LLJJIJIIJIL);
        this.LLJJIII = jRound;
        setDurationIcon(jRound);
        int iRound = Math.round(this.LLJZIJLIL) - C814420VxA.LIZIZ((this.LLLIL * C360610EBv.LIZJ()) / 2);
        C368240EcA c368240EcA = this.LLLIIII;
        c368240EcA.LJIJJ = iRound;
        if (iRound <= 0) {
            C786410Ut5.LJZL(8, c368240EcA.LJIIIZ);
        } else {
            C786410Ut5.LJZL(0, c368240EcA.LJIIIZ);
        }
        C368240EcA c368240EcA2 = this.LLLIIII;
        c368240EcA2.LJIILJJIL.width = iRound;
        C786410Ut5.d6(c368240EcA2.LJIIIZ, c368240EcA2.LJIILJJIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recycle layoutParams.width is ");
        sbLIZ.append(this.LLLII.width);
        C355090Dw3.LIZIZ("ItemTrackLayout", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + ((int) f));
            float f3 = this.LLJJIJIL - f;
            this.LLJJIJIL = f3;
            InterfaceC368360EcM interfaceC368360EcM = this.LLJJJJ;
            if (interfaceC368360EcM != null) {
                interfaceC368360EcM.LJ(this.LLJJIJIIJIL, 0, this.LLJJI, this.LLJJIII, this.LLJJJIL, f3);
            }
            C368230Ec9 itemFrameViewFromXml = getItemFrameViewFromXml();
            itemFrameViewFromXml.LLILZLL = -this.LLJJIJIL;
            itemFrameViewFromXml.invalidate();
            return;
        }
        this.LLJJIJIL = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.EnumC368970EdL r10, float r11, float r12) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368220Ec8.LIZIZ(X.0EdL, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0234  */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.0EcK] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(long r12, com.bytedance.ies.nle.editor_jni.NLETrackSlot r14, int r15, long r16) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368220Ec8.LJIIIIZZ(long, com.bytedance.ies.nle.editor_jni.NLETrackSlot, int, long):void");
    }
}
