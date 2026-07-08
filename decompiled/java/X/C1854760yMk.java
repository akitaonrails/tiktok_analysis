package X;

import Y.ACListenerS129S0200000_27;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS46S0110000_27;
import Y.ATListenerS459S0100000_27;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0yMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854760yMk extends FrameLayout {
    public final C01GW LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public C1854150yLl LLJ;
    public C1854790yMn LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public List<C1854470yMH> LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public C1852120yIU LLJLILLLLZIIL;
    public View LLJLL;
    public final C01GW LLJLLIL;
    public CharSequence LLJLLL;
    public final String LLJZ;
    public TakoReferenceAskInfo LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C1854750yMj LLLFZ;
    public long LLLI;
    public MotionEvent LLLII;
    public boolean LLLIIII;
    public MotionEvent LLLIIIIL;
    public boolean LLLIIIL;
    public EnumC1854770yMl LLLIIL;

    public final boolean LJIILJJIL() {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Integer numValueOf;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
        Long lValueOf = (iTakoContextAbility == null || (c13lcT712 = iTakoContextAbility.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null) ? null : Long.valueOf(c1863850ybP2.LLJJ);
        ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
        return (iTakoContextAbility2 == null || (c13lcT71 = iTakoContextAbility2.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (numValueOf = Integer.valueOf(c1863850ybP.LLJJI)) == null || numValueOf.intValue() != 1 || lValueOf == null || lValueOf.longValue() != 1) ? false : true;
    }

    public final Map<String, String> getCommonParams() {
        Map<String, String> commonParams;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
        return (iTakoContextAbility == null || (commonParams = iTakoContextAbility.getCommonParams()) == null) ? new LinkedHashMap() : commonParams;
    }

    private final TuxIconView getExpandBtn() {
        return (TuxIconView) this.LLJILLL.getValue();
    }

    private final ConstraintLayout getInputConstraintLayout() {
        return (ConstraintLayout) this.LLJLIL.getValue();
    }

    private final TuxIconView getReferenceAskInfoIconView() {
        return (TuxIconView) this.LLLFF.getValue();
    }

    private final LinearLayout getReferenceAskInfoLayout() {
        return (LinearLayout) this.LLL.getValue();
    }

    private final TuxTextView getReferenceAskInfoTextView() {
        return (TuxTextView) this.LLLF.getValue();
    }

    private final TuxIconView getSendBtn() {
        return (TuxIconView) this.LLJIJIL.getValue();
    }

    private final View getSendBtnLayout() {
        return (View) this.LLJILJIL.getValue();
    }

    private final TuxIconView getStopBtn() {
        return (TuxIconView) this.LLJJ.getValue();
    }

    private final View getStopBtnLayout() {
        return (View) this.LLJJI.getValue();
    }

    private final TuxAlertBadgeLayout getVoiceBadge() {
        return (TuxAlertBadgeLayout) this.LLJJIII.getValue();
    }

    private final View getVoiceBadgeLayout() {
        return (View) this.LLJJIJIIJIL.getValue();
    }

    private final TuxIconView getVoiceBtn() {
        return (TuxIconView) this.LLJJIJI.getValue();
    }

    public final boolean LIZLLL() {
        C1854150yLl c1854150yLl = this.LLJ;
        boolean z = false;
        if (c1854150yLl != null && c1854150yLl.LL == 3) {
            z = true;
        }
        return !z;
    }

    public final boolean LJ() {
        C1854150yLl c1854150yLl = this.LLJ;
        boolean z = false;
        if (c1854150yLl != null && c1854150yLl.LL == 3) {
            z = true;
        }
        return !z;
    }

    public final boolean LJFF() throws Throwable {
        C1855770yON.LIZ.getClass();
        if (!C1855770yON.LIZIZ()) {
            return false;
        }
        Editable editableV = C2204961BRm.v(getInputView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6gRXNGEdNA8bI9SKSxWjF8rAy", null));
        return (editableV != null && editableV.length() == 0) || this.LLILZ;
    }

    public final boolean LJIIJ() {
        C1854790yMn c1854790yMn;
        C1855670yOD.LIZ.getClass();
        return (!C1855670yOD.LIZ() || (c1854790yMn = this.LLJI) == null || c1854790yMn.LIZJ == null) ? false : true;
    }

    public final void LJIL() {
        setConstraints(this.LLLIIL);
    }

    public final TuxIconView getActionBarModeExitIcon() {
        return (TuxIconView) this.LLJJJJLIIL.getValue();
    }

    public final TuxIconView getActionBarModeIcon() {
        return (TuxIconView) this.LLJJJJ.getValue();
    }

    public final ConstraintLayout getActionBarModeLayout() {
        return (ConstraintLayout) this.LLJJJIL.getValue();
    }

    public final TuxTextView getActionBarModeTextView() {
        return (TuxTextView) this.LLJJJJJIL.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv getActionBarSugList() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJL.getValue();
    }

    public final View getActionModeSplitLine() {
        return (View) this.LLJL.getValue();
    }

    public final Drawable getDefaultBackground() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(getInputView().getMinimumHeight() / 2.0f);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.c3);
        return c384050F3z.LIZ(getContext());
    }

    public final View getExpandLayout() {
        return (View) this.LLJILJILJ.getValue();
    }

    public final InputMethodManager getImm() {
        return (InputMethodManager) this.LLLFFI.getValue();
    }

    public final C1842270y2b getInputView() {
        return (C1842270y2b) this.LLJJJ.getValue();
    }

    public final C1854650yMZ getPhotoDisplayLayout() {
        return (C1854650yMZ) this.LLJLLIL.getValue();
    }

    public final int getScreenHeight() {
        return ((Number) this.LL.getValue()).intValue();
    }

    public final ChoreographerFrameCallbackC1855380yNk getVoiceWaveView() {
        return (ChoreographerFrameCallbackC1855380yNk) this.LLJJIJIL.getValue();
    }

    public final void LIZJ() {
        String str;
        boolean z;
        C1854790yMn c1854790yMn;
        C1854540yMO c1854540yMO;
        ConvertStyleItem convertStyleItem;
        String strValueOf = String.valueOf(C2204961BRm.v(getInputView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6gRXNGEdNA8bI9SKSxWjF8rAy", null)));
        List listLLIIII = C13LP.LLIIII(getPhotoDisplayLayout().getDisplayPhotoList());
        C1854790yMn c1854790yMn2 = this.LLJI;
        if (c1854790yMn2 == null || (convertStyleItem = c1854790yMn2.LIZJ) == null || (str = convertStyleItem.stylePromptContent) == null || str.length() <= 0) {
            str = null;
        }
        C1855670yOD.LIZ.getClass();
        if (C1855670yOD.LIZ() && str != null) {
            if (strValueOf.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strValueOf);
                sbLIZ.append(' ');
                sbLIZ.append(str);
                strValueOf = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strValueOf = str;
            }
        }
        if (a0.LJJJIL(strValueOf) && (!listLLIIII.isEmpty())) {
            if (C1855670yOD.LIZ()) {
                C1854790yMn c1854790yMn3 = this.LLJI;
                if ((c1854790yMn3 == null || (strValueOf = c1854790yMn3.LJFF) == null || !(!a0.LJJJIL(strValueOf))) && ((c1854790yMn = this.LLJI) == null || (c1854540yMO = c1854790yMn.LIZ) == null || (strValueOf = c1854540yMO.LIZLLL) == null)) {
                    strValueOf = u.LJJIFFI(getResources().getQuantityString(2131755744, listLLIIII.size()), "...", "", false);
                }
            } else {
                C1854150yLl c1854150yLl = this.LLJ;
                if (c1854150yLl == null || c1854150yLl.LL != 2) {
                    strValueOf = u.LJJIFFI(getResources().getQuantityString(2131755744, listLLIIII.size()), "...", "", false);
                } else {
                    String str2 = c1854150yLl.LLIZLLLIL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    strValueOf = u.LJJIFFI(str2, "...", "", false);
                }
            }
            z = false;
        } else {
            z = true;
        }
        if (C1855670yOD.LIZ()) {
            boolean z2 = !listLLIIII.isEmpty();
            if (((!z2 || strValueOf.length() != 0) && LJIIIIZZ(strValueOf) && (!LJIIJ() || LJIJJ(strValueOf, z2))) || !this.LLILLJJLI) {
                return;
            }
        } else if (LJIIIIZZ(strValueOf)) {
            return;
        }
        if (!this.LLILLJJLI) {
            Function0<Unit> function0 = this.LLLFZ.LJFF;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        InterfaceC1631620sYq<? super String, ? super Boolean, ? super List<BaseImage>, Unit> interfaceC1631620sYq = this.LLLFZ.LIZJ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(strValueOf, Boolean.valueOf(z), listLLIIII);
        }
        Editable editableV = C2204961BRm.v(getInputView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6gRXNGEdNA8bI9SKSxWjF8rAy", null));
        if (editableV != null) {
            editableV.clear();
        }
    }

    public final void LJIIJJI() {
        if (C1862920yZu.LIZ()) {
            C1846330y99.LIZ(getInputView());
            return;
        }
        getInputView().clearFocus();
        InputMethodManager imm = getImm();
        if (imm != null) {
            imm.hideSoftInputFromWindow(getInputView().getWindowToken(), 0);
        }
    }

    public final void LJIIL() {
        View voiceBadgeLayout = getVoiceBadgeLayout();
        if (voiceBadgeLayout != null) {
            C0DSB.LIZIZ(voiceBadgeLayout);
        }
    }

    public final void LJIILIIL() {
        this.LLJLILLLLZIIL = (C1852120yIU) findViewById(R.id.xax);
        View viewFindViewById = findViewById(R.id.xay);
        this.LLJLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            setConstraints(this.LLLIIL);
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 60), viewFindViewById);
            C427690Gpr.LJI(viewFindViewById, null);
        }
    }

    public final void LJIILL() {
        TuxAlertBadgeLayout voiceBadge = getVoiceBadge();
        if (voiceBadge != null) {
            voiceBadge.LIZIZ();
        }
    }

    public final List<C1854470yMH> getActionBarSugListData() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final C1854790yMn getActiveSkillLabelData() {
        return this.LLJI;
    }

    public final C1854150yLl getActiveSubModeItem() {
        return this.LLJ;
    }

    public final boolean getAddTextFromVoice() {
        return this.LLILZ;
    }

    public final C1852120yIU getPhotoPickerEntranceView() {
        return this.LLJLILLLLZIIL;
    }

    public final View getPhotoPickerEntranceViewLayout() {
        return this.LLJLL;
    }

    public final TakoReferenceAskInfo getTakoReferenceAskInfo() {
        return this.LLJZIJLIL;
    }

    public final boolean getVoicePendingSend() {
        return this.LLILZIL;
    }

    public static boolean LJIIIIZZ(String str) {
        int i;
        boolean z;
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (Intrinsics.LJI(str.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else {
                if (!z) {
                    break;
                }
                length--;
            }
        }
        return TextUtils.isEmpty(str.subSequence(i2, length + 1).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setConstraints(X.EnumC1854770yMl r8) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1854760yMk.setConstraints(X.0yMl):void");
    }

    public final void LIZ(String str) {
        List listLLIIII = C13LP.LLIIII(getPhotoDisplayLayout().getDisplayPhotoList());
        if (!this.LLILLJJLI) {
            Function0<Unit> function0 = this.LLLFZ.LJFF;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        InterfaceC1631620sYq<? super String, ? super Boolean, ? super List<BaseImage>, Unit> interfaceC1631620sYq = this.LLLFZ.LIZJ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(str, Boolean.FALSE, listLLIIII);
        }
        Editable editableV = C2204961BRm.v(getInputView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6gRXNGEdNA8bI9SKSxWjF8rAy", null));
        if (editableV != null) {
            editableV.clear();
        }
    }

    public final void LIZIZ(boolean z) {
        float f;
        TuxIconView sendBtn = getSendBtn();
        sendBtn.setActivated(z);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        sendBtn.setBackground(c384050F3z.LIZ(sendBtn.getContext()));
        if (z) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        C786410Ut5.x5(sendBtn, f);
    }

    public final void LJIIIZ(boolean z) {
        int i;
        int i2;
        View voiceBadgeLayout = getVoiceBadgeLayout();
        if (voiceBadgeLayout != null) {
            voiceBadgeLayout.setEnabled(z);
        }
        TuxIconView voiceBtn = getVoiceBtn();
        if (voiceBtn != null) {
            voiceBtn.setEnabled(z);
        }
        TuxIconView voiceBtn2 = getVoiceBtn();
        if (voiceBtn2 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (!C07IF.LIZ() && !C07I1.LIZ()) {
                i = R.raw.icon_mic_fill;
            } else {
                i = R.raw.icon_microphone;
            }
            c419910GdJ.LIZ = i;
            if (z) {
                i2 = R.attr.a1h;
            } else {
                i2 = R.attr.a1k;
            }
            c419910GdJ.LJ = Integer.valueOf(i2);
            voiceBtn2.setTuxIcon(c419910GdJ);
        }
    }

    public final void LJIILLIIL(View view) {
        Function2<? super Boolean, ? super Long, Unit> function2;
        if (this.LLIZ && !this.LLILZIL) {
            this.LLILZIL = true;
            getVoiceWaveView().LIZJ();
            return;
        }
        if (!C0B14.LIZ()) {
            if (this.LLLI != 0 && (function2 = this.LLLFZ.LJ) != null) {
                function2.invoke(Boolean.FALSE, Long.valueOf(System.currentTimeMillis() - this.LLLI));
            }
            LJIJ(view);
        } else {
            Function2<? super Boolean, ? super Long, Unit> function22 = this.LLLFZ.LJ;
            if (function22 != null) {
                function22.invoke(Boolean.FALSE, 0L);
            }
        }
        this.LLLI = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        r1 = X.C13LP.LLIIII(getPhotoDisplayLayout().getDisplayPhotoList());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r4.LLILLJJLI != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        r0 = r4.LLLFZ.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        r0.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        r0 = r4.LLLFZ.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (r0 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        r0.invoke(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(android.view.View r5) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1854760yMk.LJIJ(android.view.View):void");
    }

    public final void LJJI(EnumC1854770yMl enumC1854770yMl) {
        int i;
        int i2;
        C1855770yON.LIZ.getClass();
        if (!C1855770yON.LIZIZ()) {
            return;
        }
        View viewFindViewById = findViewById(R.id.voice_btn);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 17;
            C786410Ut5.W5(viewFindViewById, layoutParams2);
            View viewFindViewById2 = findViewById(R.id.voice_badge);
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                C786410Ut5.W5(viewFindViewById2, layoutParams3);
                Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                EnumC1854770yMl enumC1854770yMl2 = EnumC1854770yMl.ACTIVE_SEND_WITH_VOICE_ICON;
                if (enumC1854770yMl == enumC1854770yMl2) {
                    i = 0;
                } else {
                    i = 6;
                }
                C426750GoL.LJIIIZ(viewFindViewById2, numValueOf, numValueOf2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), false, 16);
                View viewFindViewById3 = findViewById(R.id.voice_badge_layout);
                ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                if (layoutParams4 != null) {
                    if (enumC1854770yMl == enumC1854770yMl2) {
                        i2 = 42;
                    } else {
                        i2 = 48;
                    }
                    layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
                    C786410Ut5.W5(viewFindViewById3, layoutParams4);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function0<Unit> function0;
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && (function0 = this.LLLFZ.LJIIIIZZ) != null) {
            function0.invoke();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setActionBarSugListData(List<C1854470yMH> list) {
        this.LLJJLIIIJLLLLLLLZ = list;
    }

    public final void setActive(boolean z) {
        this.LLILLJJLI = z;
        LJI(null, null);
    }

    public final void setActiveSkillLabelData(C1854790yMn c1854790yMn) {
        this.LLJI = c1854790yMn;
    }

    public final void setActiveSubModeItem(C1854150yLl c1854150yLl) {
        this.LLJ = c1854150yLl;
    }

    public final void setAddTextFromVoice(boolean z) {
        this.LLILZ = z;
    }

    public final void setClickConfig(Function1<? super C1854750yMj, Unit> function1) {
        function1.invoke(this.LLLFZ);
    }

    public final void setPhotoPickerEntranceView(C1852120yIU c1852120yIU) {
        this.LLJLILLLLZIIL = c1852120yIU;
    }

    public final void setPhotoPickerEntranceViewLayout(View view) {
        this.LLJLL = view;
    }

    public final void setStop(boolean z) {
        this.LLILLL = z;
        LJI(null, null);
    }

    public final void setTakoReferenceAskInfo(TakoReferenceAskInfo takoReferenceAskInfo) {
        String str;
        float f;
        this.LLJZIJLIL = takoReferenceAskInfo;
        if (C1855050yND.LIZIZ(takoReferenceAskInfo)) {
            C0DSB.LIZJ(getReferenceAskInfoLayout());
            TuxTextView referenceAskInfoTextView = getReferenceAskInfoTextView();
            if (takoReferenceAskInfo != null) {
                str = takoReferenceAskInfo.text;
            } else {
                str = null;
            }
            referenceAskInfoTextView.setText(str);
            TuxIconView referenceAskInfoIconView = getReferenceAskInfoIconView();
            if (referenceAskInfoIconView != null) {
                if (getLayoutDirection() == 1) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                C786410Ut5.hc(referenceAskInfoIconView, f);
            }
            if (!Intrinsics.LJFF(getInputView().getHint(), this.LLJZ)) {
                this.LLJLLL = getInputView().getHint();
                getInputView().setHint(this.LLJZ);
                return;
            }
            return;
        }
        C0DSB.LIZIZ(getReferenceAskInfoLayout());
        if (!Intrinsics.LJFF(getInputView().getHint(), this.LLJZ) || this.LLJLLL == null) {
            return;
        }
        getInputView().setHint(this.LLJLLL);
    }

    public final void setVoicePendingSend(boolean z) {
        this.LLILZIL = z;
    }

    public final void setVoiceTalkV1(boolean z) {
        this.LLILZLL = z;
        LJI(null, null);
    }

    public final void setVoiceTalkV2(boolean z) {
        this.LLIZ = z;
        LJI(null, null);
        if (!z && this.LLILZIL) {
            this.LLILZIL = false;
            LJIILLIIL(getSendBtnLayout());
        }
    }

    public C1854760yMk(Context context, AttributeSet attributeSet) throws Throwable {
        int i;
        int i2;
        int i3;
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS560S0100000_16(context, 618));
        this.LLILLJJLI = true;
        this.LLIZLLLIL = "";
        this.LLJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1063));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1065));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1040));
        this.LLJILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1038));
        this.LLJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1070));
        this.LLJJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1072));
        this.LLJJIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1074));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1080));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1077));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1082));
        this.LLJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1047));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1081));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1079));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1084));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1076));
        this.LLJJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1086));
        this.LLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1087));
        this.LLJLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1044));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1054));
        this.LLJZ = C1857750yRZ.LJII(2131849707);
        this.LLL = C452501pT.LIZIZ(new AwS402S0200000_1(context, this, 45));
        this.LLLF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1060));
        this.LLLFF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1057));
        this.LLLFFI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1042));
        this.LLLFZ = new C1854750yMj(null);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TokeInputView);
        if (C298800BnS.LIZ() && TakoEnterMethodListExperiment.LIZ(false)) {
            C21146717pB.LIZIZ(context, R.layout.fpj, this, true);
        } else {
            FrameLayout.inflate(context, R.layout.fpj, this);
        }
        TuxIconView sendBtn = getSendBtn();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TokeInputView_tako_send_icon, 0);
        c419910GdJ.LIZLLL = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.TokeInputView_tako_send_tint_color, -65536));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        sendBtn.setTuxIcon(c419910GdJ);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        if (C07IF.LIZ()) {
            i = R.attr.a04;
        } else {
            i = R.attr.d5;
        }
        c384050F3z.LIZIZ = Integer.valueOf(i);
        sendBtn.setBackground(c384050F3z.LIZ(context));
        View sendBtnLayout = getSendBtnLayout();
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 111), sendBtnLayout);
        C427690Gpr.LJI(sendBtnLayout, new AwS641S0100000_27(this, 86));
        TuxAlertBadgeLayout voiceBadge = getVoiceBadge();
        if (voiceBadge != null) {
            voiceBadge.LIZIZ();
        }
        TuxIconView voiceBtn = getVoiceBtn();
        if (voiceBtn != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            if (!C07IF.LIZ() && !C07I1.LIZ()) {
                i3 = R.raw.icon_mic_fill;
            } else {
                i3 = R.raw.icon_microphone;
            }
            c419910GdJ2.LIZ = i3;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
            voiceBtn.setTuxIcon(c419910GdJ2);
        }
        TuxIconView stopBtn = getStopBtn();
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZ = R.raw.icon_stop_circle_fill;
        c419910GdJ3.LJ = Integer.valueOf(R.attr.a1i);
        stopBtn.setTuxIcon(c419910GdJ3);
        View voiceBadgeLayout = getVoiceBadgeLayout();
        if (voiceBadgeLayout != null) {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 113), voiceBadgeLayout);
        }
        View stopBtnLayout = getStopBtnLayout();
        if (stopBtnLayout != null) {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 114), stopBtnLayout);
        }
        TuxIconView expandBtn = getExpandBtn();
        C419910GdJ c419910GdJ4 = new C419910GdJ();
        c419910GdJ4.LIZ = R.raw.icon_chevron_expand;
        c419910GdJ4.LJ = Integer.valueOf(R.attr.a1k);
        c419910GdJ4.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ4.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        expandBtn.setTuxIcon(c419910GdJ4);
        C786410Ut5.I7(new ACListenerS129S0200000_27(this, context, 13), getExpandLayout());
        getInputView().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1864650ych(this, 6));
        getInputView().addTextChangedListener(new C1864790ycv(this, 3));
        getInputView().setOnFocusChangeListener(new ViewOnFocusChangeListenerC1864710ycn(this, 3));
        getInputView().setOnTouchListener(new ATListenerS459S0100000_27(this, 10));
        getInputView().setOnPasteListener(new AwS571S0100000_27(this, 1058));
        getInputView().setOnLongClickListener(new ViewOnLongClickListenerC1864690ycl(this, 10));
        C1855770yON.LIZ.getClass();
        if (!C1855770yON.LJ()) {
            getVoiceBadgeLayout().setOnTouchListener(new ATListenerS459S0100000_27(this, 11));
        }
        if (!C1855770yON.LJ()) {
            getVoiceBadgeLayout().setOnLongClickListener(new ViewOnLongClickListenerC1864690ycl(this, 11));
        }
        C21382118m3.LJFF(getInputView(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        getInputView().setTuxFont(111);
        if (Build.VERSION.SDK_INT >= 29) {
            C1842270y2b inputView = getInputView();
            if (C07IF.LIZ()) {
                i2 = R.drawable.den;
            } else {
                i2 = R.drawable.dem;
            }
            inputView.setTextCursorDrawable(i2);
        }
        getInputView().setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        C054G c054g = C319390CfZ.LIZ;
        C319390CfZ.LIZ(SystemClock.elapsedRealtime() - jElapsedRealtime, "tako_input_view_init");
        if (C1855770yON.LIZIZ()) {
            getInputView().setMaxLines(6);
            getInputView().setFilters(new InputFilter[]{new InputFilter() { // from class: X.0yMq
                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
                    C1854760yMk c1854760yMk = this.LL;
                    if (c1854760yMk.LLILZLL && c1854760yMk.LLIZ) {
                        return "";
                    }
                    return null;
                }
            }});
        } else {
            getInputView().setMaxLines(5);
        }
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.c3);
        setBackground(c384050F3z2.LIZ(context));
        C786410Ut5.a9((TuxIconView) findViewById(R.id.xbj), new ACListenerS161S0100000_27(this, 112));
        Editable editableV = C2204961BRm.v(getInputView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6gRXNGEdNA8bI9SKSxWjF8rAy", null));
        if (editableV != null) {
            editableV.clear();
        }
        LJI(null, null);
        this.LLLIIL = EnumC1854770yMl.EMPTY;
    }

    public static void LJJ(C1842270y2b c1842270y2b, View view) {
        int i;
        int width;
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ()) {
            i = 6;
        } else {
            i = 5;
        }
        Editable editableV = C2204961BRm.v(c1842270y2b, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6gRXNGEdNA8bI9SKSxWjF8rAy", null));
        boolean z = true;
        if (editableV == null || editableV.length() == 0 || (width = (c1842270y2b.getWidth() - c1842270y2b.getCompoundPaddingLeft()) - c1842270y2b.getCompoundPaddingRight()) <= 0 || StaticLayout.Builder.obtain(editableV, 0, editableV.length(), c1842270y2b.getPaint(), width).setLineSpacing(c1842270y2b.getLineSpacingExtra(), c1842270y2b.getLineSpacingMultiplier()).setBreakStrategy(c1842270y2b.getBreakStrategy()).setHyphenationFrequency(c1842270y2b.getHyphenationFrequency()).build().getLineCount() < i) {
            z = false;
        }
        HandlerHook.viewPost(view, new ARunnableS46S0110000_27(view, z, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(java.lang.Boolean r10, X.EnumC1854770yMl r11) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1854760yMk.LJI(java.lang.Boolean, X.0yMl):void");
    }

    public final void LJIIZILJ(MotionEvent motionEvent, View view) {
        Function2<? super Boolean, ? super Long, Unit> function2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.LLLI = 0L;
                    Function2<? super Boolean, ? super Long, Unit> function22 = this.LLLFZ.LJ;
                    if (function22 != null) {
                        function22.invoke(Boolean.TRUE, null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (view.isPressed() || (function2 = this.LLLFZ.LJ) == null) {
                return;
            }
            function2.invoke(Boolean.TRUE, null);
            return;
        }
        this.LLLI = System.currentTimeMillis();
        if (!C0B14.LIZ()) {
            return;
        }
        LJIJ(view);
    }

    public final void LJIJI(String str, boolean z) {
        this.LLILZ = z;
        InputFilter[] filters = getInputView().getFilters();
        getInputView().setFilters(new InputFilter[0]);
        this.LLIZLLLIL = str;
        getInputView().append(str);
        getInputView().setFilters(filters);
    }

    public final boolean LJIJJ(String str, boolean z) {
        EnumC1854550yMP enumC1854550yMP;
        C1854540yMO c1854540yMO;
        C1854790yMn c1854790yMn = this.LLJI;
        if (c1854790yMn != null && (c1854540yMO = c1854790yMn.LIZ) != null) {
            enumC1854550yMP = c1854540yMO.LIZ;
        } else {
            enumC1854550yMP = null;
        }
        C1854870yMv.LIZ.getClass();
        if (((Number) C1854870yMv.LIZIZ.getValue()).intValue() != 1 || z || !LJIIIIZZ(str)) {
            return false;
        }
        if ((enumC1854550yMP != EnumC1854550yMP.EDIT_IMAGE && enumC1854550yMP != EnumC1854550yMP.IMAGE_TO_VIDEO) || !LJIIJ()) {
            return false;
        }
        return true;
    }

    public final MotionEvent LJIJJLI(MotionEvent motionEvent, int i) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr);
        View voiceBadgeLayout = getVoiceBadgeLayout();
        if (voiceBadgeLayout != null) {
            voiceBadgeLayout.getLocationInWindow(iArr2);
        }
        return MotionEvent.obtain(motionEvent.getDownTime(), SystemClock.uptimeMillis(), i, motionEvent.getX() - (iArr[0] - iArr2[0]), motionEvent.getY() - (iArr[1] - iArr2[1]), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getMetaState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags());
    }
}
