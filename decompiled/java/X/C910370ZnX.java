package X;

import Y.AAListenerS325S0100000_14;
import Y.ACListenerS117S0200000_14;
import Y.ACListenerS149S0100000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.common.utils.IAmbientDataSourceHelper;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import com.ss.android.ugc.aweme.im.strategy.commonresource.GreetingCardResource;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import com.zhiliaoapp.musically.R;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS258S0300000_14;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS5S0002000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910370ZnX extends FrameLayout {
    public final View LL;
    public final FrameLayout LLILLJJLI;
    public final View LLILLL;
    public final C1390410mHn LLILZ;
    public final LinearLayout LLILZIL;
    public final C1297500jrw LLILZLL;
    public final SmartImageView LLIZ;
    public final C1294120jmU LLIZLLLIL;
    public final TuxTextView LLJ;
    public final C1360570lVf LLJI;
    public final C1360570lVf LLJIJIL;
    public final C1360570lVf LLJILJIL;
    public final SmartImageView LLJILJILJ;
    public final C197039127h LLJILLL;
    public final FrameLayout LLJJ;
    public final C197039127h LLJJI;
    public final C197039127h LLJJIII;
    public String LLJJIJI;
    public final Map<EnumC910390ZnZ, DataSource> LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public AnimatorSet LLJJJ;
    public Animator LLJJJIL;
    public ImageSpan LLJJJJ;
    public C0H25 LLJJJJJIL;
    public EnumC910410Znb LLJJJJLIIL;
    public Boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;

    public final List<C909870Zmj> getTransitionHideViewConfigs() {
        return C1697810uHb.LJIIJJI(new C909870Zmj(Collections.singletonList(this.LLJIJIL), 0L), new C909870Zmj(Collections.singletonList(this.LLJILJIL), 100L), new C909870Zmj(C1697810uHb.LJIIJJI(this.LLJI, this.LLJJIII), 200L), new C909870Zmj(C1697810uHb.LJIIJJI(this.LLJ, this.LLJILLL, this.LLJJI), 550L));
    }

    public final void LIZIZ() throws Throwable {
        ImageSpan imageSpan;
        Editable editableL;
        Character chLJLLLL;
        C1360570lVf c1360570lVf = this.LLJILJIL;
        if (c1360570lVf == null || (imageSpan = this.LLJJJJ) == null) {
            return;
        }
        Editable editableL2 = C2204961BRm.L(c1360570lVf, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkhUnVyqPNelQccyqhQzo9Yn2hp0hKQ==", null));
        if ((editableL2 != null && (chLJLLLL = C13LN.LJLLLL(editableL2)) != null && chLJLLLL.charValue() == 65532) || (editableL = C2204961BRm.L(c1360570lVf, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkhUnVyqPNelQccyqhQzo9Yn2hp0hKQ==", null))) == null || editableL.length() == 0) {
            return;
        }
        CharSequence[] charSequenceArr = new CharSequence[2];
        CharSequence charSequenceL = C2204961BRm.L(c1360570lVf, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkhUnVyqPNelQccyqhQzo9Yn2hp0hKQ==", null));
        if (charSequenceL == null) {
            charSequenceL = "";
        }
        charSequenceArr[0] = charSequenceL;
        charSequenceArr[1] = "￼";
        CharSequence charSequenceConcat = TextUtils.concat(charSequenceArr);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceConcat);
        C09RC.LIZ(spannableStringBuilder, new CharSequence[0]);
        C786410Ut5.q2(spannableStringBuilder, imageSpan, charSequenceConcat.length() - 1, charSequenceConcat.length(), 33);
        c1360570lVf.setText(spannableStringBuilder);
    }

    public final void LIZJ() {
        boolean z = (C909880Zmk.LIZ(this.LLJILJIL, true) || C909880Zmk.LIZ(this.LLJI, false) || C909880Zmk.LIZ(this.LLJIJIL, false)) ? false : true;
        if (this.LLJLILLLLZIIL == z) {
            return;
        }
        this.LLJLILLLLZIIL = z;
        FrameLayout frameLayout = this.LLJJ;
        if (frameLayout != null) {
            C786410Ut5.U4(frameLayout, z ? 1.0f : 0.5f);
        }
        C197039127h c197039127h = this.LLJILLL;
        if (c197039127h != null) {
            c197039127h.setClickable(z);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJFF() {
        C1360570lVf c1360570lVf = this.LLJILJIL;
        if (c1360570lVf == null || this.LLJJJJ == null) {
            return;
        }
        int selectionStart = c1360570lVf.getSelectionStart();
        int selectionEnd = c1360570lVf.getSelectionEnd();
        CharSequence charSequenceL = C2204961BRm.L(c1360570lVf, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkhUnVyqPNelQccyqhQzo9Yn2hp0hKQ==", null));
        if (charSequenceL == null) {
            charSequenceL = "";
        }
        Character chLJLLLL = C13LN.LJLLLL(charSequenceL);
        if (chLJLLLL != null && chLJLLLL.charValue() == 65532) {
            charSequenceL = C13LN.LJLJLLL(charSequenceL);
            selectionStart = Math.min(charSequenceL.length(), selectionStart);
            selectionEnd = Math.min(charSequenceL.length(), selectionEnd);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceL);
        for (ImageSpan imageSpan : (ImageSpan[]) spannableStringBuilder.getSpans(0, charSequenceL.length(), ImageSpan.class)) {
            spannableStringBuilder.removeSpan(imageSpan);
        }
        c1360570lVf.setText(spannableStringBuilder);
        try {
            c1360570lVf.setSelection(selectionStart, selectionEnd);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIIL() {
        float fLIZIZ;
        C197039127h c197039127h = this.LLJJI;
        if (c197039127h != null) {
            int i = C910420Znc.LIZIZ[this.LLJJJJLIIL.ordinal()];
            if (i == 1) {
                fLIZIZ = C418440Gaw.LIZIZ(88);
            } else if (i == 2) {
                fLIZIZ = C418440Gaw.LIZIZ(24);
            } else {
                if (i != 3) {
                    throw new C1954807lC();
                }
                fLIZIZ = C418440Gaw.LIZIZ(12);
            }
            C426750GoL.LJIIIZ(c197039127h, null, Integer.valueOf((int) fLIZIZ), null, null, false, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
    
        if (r1 != null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment getFragment() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
            X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
            if (r0 == 0) goto L13
            X.198i r1 = r0.LIZLLL()
            if (r1 == 0) goto L13
        L10:
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            return r1
        L13:
            android.content.Context r0 = r3.getContext()
            android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            r2 = 0
            if (r0 == 0) goto L42
            android.content.Context r0 = r3.getContext()
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L35
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L42
        L30:
            androidx.fragment.app.Fragment r1 = X.C946803n0.LIZ(r3)
            return r1
        L35:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L30
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L42
            goto L30
        L42:
            androidx.fragment.app.Fragment r1 = X.C946803n0.LIZ(r3)
            if (r1 == 0) goto L30
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L52
            android.app.Activity r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L52:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L5d
            boolean r0 = r2 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L6c
            goto L30
        L5d:
            boolean r0 = r2 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L30
            X.198d r2 = (X.InterfaceC214897198d) r2
            boolean r0 = r2.getEnableSAF()
            if (r0 != 0) goto L6c
            goto L30
        L6a:
            if (r1 == 0) goto L30
        L6c:
            boolean r0 = r1 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L75
            X.198i r1 = (X.InterfaceC214902198i) r1
            if (r1 == 0) goto L30
            goto L10
        L75:
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C910370ZnX.getFragment():androidx.fragment.app.Fragment");
    }

    public C910370ZnX(Context context) {
        super(context, null, 0);
        this.LLJJIJI = "";
        this.LLJJIJIIJIL = new LinkedHashMap();
        this.LLJJJJLIIL = EnumC910410Znb.NORMAL;
        this.LLJLILLLLZIIL = true;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d55, this, true);
        this.LL = findViewById(R.id.bnu);
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.eux);
        this.LLILLL = findViewById(R.id.e10);
        this.LLILZ = (C1390410mHn) findViewById(R.id.gb7);
        this.LLILZIL = (LinearLayout) findViewById(R.id.j5l);
        this.LLIZ = (SmartImageView) findViewById(R.id.de7);
        this.LLILZLL = (C1297500jrw) findViewById(R.id.nru);
        this.LLIZLLLIL = (C1294120jmU) findViewById(R.id.axy);
        this.LLJ = (TuxTextView) findViewById(R.id.view_status_text);
        this.LLJI = (C1360570lVf) findViewById(R.id.uq5);
        this.LLJIJIL = (C1360570lVf) findViewById(R.id.svi);
        this.LLJILJIL = (C1360570lVf) findViewById(R.id.ev9);
        this.LLJILJILJ = (SmartImageView) findViewById(R.id.vfl);
        this.LLJILLL = (C197039127h) findViewById(R.id.a24);
        this.LLJJ = (FrameLayout) findViewById(R.id.a26);
        this.LLJJI = (C197039127h) findViewById(R.id.e1y);
        this.LLJJIII = (C197039127h) findViewById(R.id.ftq);
    }

    private final void setupKeyboardListener(GreetingCardViewModel greetingCardViewModel) {
        setupOldKeyboardListener(greetingCardViewModel);
    }

    private final void setupOldKeyboardListener(final GreetingCardViewModel greetingCardViewModel) {
        Activity activityLIZ;
        LinearLayout linearLayout = this.LLILZIL;
        if (linearLayout == null || (activityLIZ = C1388190mED.LIZ(getContext())) == null) {
            return;
        }
        C0H25 c0h25 = new C0H25(activityLIZ, new AwS558S0100000_14(linearLayout, 1403));
        final C013C c013c = new C013C();
        c0h25.LJJIIJ(new C0H26() { // from class: X.0ZnY
            @Override // X.C0H26
            public final void LIZ(int i, boolean z) throws Throwable {
                View focusedChild;
                int i2;
                C910370ZnX c910370ZnX = this.LIZ;
                if (z) {
                    FrameLayout frameLayout = c910370ZnX.LLILLJJLI;
                    if (frameLayout != null) {
                        int[] iArr = new int[2];
                        frameLayout.getLocationInWindow(iArr);
                        C197039127h c197039127h = c910370ZnX.LLJILLL;
                        if (c197039127h != null) {
                            int[] iArr2 = new int[2];
                            c197039127h.getLocationInWindow(iArr2);
                            float height = (iArr[1] + frameLayout.getHeight()) - (iArr2[1] + c197039127h.getHeight());
                            float f = i;
                            if (c910370ZnX.LLJJJJLIIL == EnumC910410Znb.NORMAL) {
                                i2 = 32;
                            } else {
                                i2 = 16;
                            }
                            C786410Ut5.fd(frameLayout, height - (f + C418440Gaw.LIZIZ(Integer.valueOf(i2))));
                        }
                    }
                } else {
                    FrameLayout frameLayout2 = c910370ZnX.LLILLJJLI;
                    if (frameLayout2 != null) {
                        C786410Ut5.fd(frameLayout2, 0.0f);
                    }
                }
                this.LIZ.LJIIL();
                C013C c013c2 = c013c;
                if (z == c013c2.element) {
                    return;
                }
                c013c2.element = z;
                if (z) {
                    C910370ZnX c910370ZnX2 = this.LIZ;
                    GreetingCardViewModel greetingCardViewModel2 = greetingCardViewModel;
                    if (!c910370ZnX2.LLJLIL) {
                        greetingCardViewModel2.BQ2("edit_text");
                    }
                    C1584506Ih.LIZ(c910370ZnX2.LLJJIII);
                    C337180DJs.LIZIZ(c910370ZnX2.LLJJI);
                    c910370ZnX2.LJFF();
                    return;
                }
                C910370ZnX c910370ZnX3 = this.LIZ;
                GreetingCardViewModel greetingCardViewModel3 = greetingCardViewModel;
                c910370ZnX3.getClass();
                if (!greetingCardViewModel3.LLILZ.isEmpty()) {
                    C337180DJs.LIZJ(c910370ZnX3.LLJJIII);
                }
                C337180DJs.LIZJ(c910370ZnX3.LLJJI);
                c910370ZnX3.LIZIZ();
                C1360570lVf c1360570lVf = c910370ZnX3.LLJI;
                if (c1360570lVf != null && C909880Zmk.LIZ(c1360570lVf, false)) {
                    c1360570lVf.setText(new SpannableStringBuilder(greetingCardViewModel3.LLILZIL));
                }
                C1360570lVf c1360570lVf2 = c910370ZnX3.LLJIJIL;
                if (c1360570lVf2 != null && C909880Zmk.LIZ(c1360570lVf2, false)) {
                    c1360570lVf2.setText(new SpannableStringBuilder(greetingCardViewModel3.LLILZLL));
                }
                C1360570lVf c1360570lVf3 = c910370ZnX3.LLJILJIL;
                if (c1360570lVf3 != null && C909880Zmk.LIZ(c1360570lVf3, true)) {
                    c1360570lVf3.setText(new SpannableStringBuilder(greetingCardViewModel3.LLIZ));
                    c910370ZnX3.LIZIZ();
                }
                LinearLayout linearLayout2 = c910370ZnX3.LLILZIL;
                if (linearLayout2 != null && (focusedChild = linearLayout2.getFocusedChild()) != null) {
                    focusedChild.clearFocus();
                }
                c910370ZnX3.LLJLIL = false;
            }
        });
        c0h25.onResume();
        this.LLJJJJJIL = c0h25;
    }

    public final void LIZLLL(GreetingCardViewModel greetingCardViewModel) {
        InterfaceC457860HxQ interfaceC457860HxQ;
        if (!this.LLJL) {
            return;
        }
        this.LLJL = false;
        Animator animator = this.LLJJJIL;
        if (animator != null) {
            animator.cancel();
        }
        AnimatorSet animatorSet = this.LLJJJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C1294120jmU c1294120jmU = this.LLIZLLLIL;
        if (c1294120jmU != null) {
            c1294120jmU.LIZLLL();
            c1294120jmU.LIZIZ();
            C1584506Ih.LIZ(c1294120jmU);
        }
        C1297500jrw c1297500jrw = this.LLILZLL;
        if (c1297500jrw != null) {
            c1297500jrw.LJ(true);
        }
        greetingCardViewModel.yQ2();
        C0H25 c0h25 = this.LLJJJJJIL;
        if (c0h25 != null) {
            c0h25.onPause();
        }
        C128Y fragment = getFragment();
        if ((fragment instanceof InterfaceC457860HxQ) && (interfaceC457860HxQ = (InterfaceC457860HxQ) fragment) != null) {
            interfaceC457860HxQ.WI(Collections.singletonList(this));
        }
    }

    public final void LJ(Map<String, String> map) {
        String str;
        DataSource dataSourceLIZ;
        for (EnumC910390ZnZ enumC910390ZnZ : EnumC910390ZnZ.values()) {
            String jsonPath = enumC910390ZnZ.getJsonPath();
            String videoPath = enumC910390ZnZ.getVideoPath();
            String str2 = map.get(jsonPath);
            if (str2 != null && (str = map.get(videoPath)) != null) {
                IAmbientDataSourceHelper.LIZ.getClass();
                IAmbientDataSourceHelper value = C910490Znj.LIZIZ.getValue();
                if (value != null && (dataSourceLIZ = value.LIZ(str2, str)) != null) {
                    this.LLJJIJIIJIL.put(enumC910390ZnZ, dataSourceLIZ);
                }
            }
        }
    }

    public final void setSendUI(GreetingCardViewModel greetingCardViewModel) {
        LJIIJ(getTransitionHideViewConfigs(), Collections.singletonList(new C909870Zmj(Collections.singletonList(this.LLJILJILJ), 0L)), AFwS201S0000000_14.get$arr$(399));
        C1584506Ih.LIZ(this.LLILLL);
        SmartImageView smartImageView = this.LLIZ;
        if (smartImageView != null) {
            C786410Ut5.u5(smartImageView, 1.0f);
        }
        C1294120jmU c1294120jmU = this.LLIZLLLIL;
        if (c1294120jmU != null) {
            c1294120jmU.LIZLLL();
            c1294120jmU.LIZIZ();
            C1584506Ih.LIZ(c1294120jmU);
        }
        C197039127h c197039127h = this.LLJILLL;
        if (c197039127h != null) {
            c197039127h.setText(C1383370m6R.LJIIJ(2131831041));
            C786410Ut5.U8(c197039127h, new ACListenerS117S0200000_14(this, greetingCardViewModel, 20));
        }
        if (greetingCardViewModel.LLILZ.isEmpty()) {
            C1584506Ih.LIZ(this.LLJJIII);
        } else {
            C197039127h c197039127h2 = this.LLJJIII;
            if (c197039127h2 != null) {
                C337180DJs.LIZJ(c197039127h2);
                C786410Ut5.U8(c197039127h2, new ACListenerS117S0200000_14(this, greetingCardViewModel, 21));
            }
        }
        C1360570lVf c1360570lVf = this.LLJI;
        if (c1360570lVf != null) {
            if (C909880Zmk.LIZ(c1360570lVf, false)) {
                c1360570lVf.setText(new SpannableStringBuilder(greetingCardViewModel.LLILZIL));
            }
            c1360570lVf.setKeyListener(c1360570lVf.getOriginalKeyListener());
            c1360570lVf.setOnEditCallback(new C910450Znf(this));
            c1360570lVf.setEnabled(true);
        }
        C1360570lVf c1360570lVf2 = this.LLJIJIL;
        if (c1360570lVf2 != null) {
            if (C909880Zmk.LIZ(c1360570lVf2, false)) {
                c1360570lVf2.setText(new SpannableStringBuilder(greetingCardViewModel.LLILZLL));
            }
            c1360570lVf2.setKeyListener(c1360570lVf2.getOriginalKeyListener());
            c1360570lVf2.setOnEditCallback(new C910460Zng(this));
            c1360570lVf2.setEnabled(true);
        }
        C1360570lVf c1360570lVf3 = this.LLJILJIL;
        if (c1360570lVf3 != null) {
            if (C909880Zmk.LIZ(c1360570lVf3, true)) {
                c1360570lVf3.setText(new SpannableStringBuilder(greetingCardViewModel.LLIZ));
            }
            c1360570lVf3.setOnEditCallback(new C910470Znh(this));
            c1360570lVf3.setKeyListener(c1360570lVf3.getOriginalKeyListener());
            c1360570lVf3.setFocusable(true);
            c1360570lVf3.setFocusableInTouchMode(true);
            if (greetingCardViewModel.LLILZ.isEmpty()) {
                this.LLJLIL = true;
                c1360570lVf3.requestFocus();
                KeyboardUtils.LIZJ(c1360570lVf3);
            }
        }
        LIZIZ();
    }

    public final void LJII(GreetingCardViewModel greetingCardViewModel, Function0<Unit> function0) {
        C337180DJs.LIZJ(this.LLILLL);
        LJI(greetingCardViewModel, Collections.singletonList(new C909870Zmj(Collections.singletonList(this.LLJILJILJ), 0L)), true, EnumC910390ZnZ.SWAP_TO_SENDER, null, new AwS258S0300000_14(greetingCardViewModel, (GreetingCardViewModel) this, (C910370ZnX) function0, (Function0<Unit>) 14));
    }

    public final void LJIIIZ(GreetingCardViewModel greetingCardViewModel, String str) {
        this.LLJJIJI = str;
        LJIIJJI(greetingCardViewModel, 350L);
        Boolean bool = this.LLJJL;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            return;
        }
        setupOldKeyboardListener(greetingCardViewModel);
        this.LLJJL = bool2;
        C1584506Ih.LIZ(this.LLJ);
        C337180DJs.LIZJ(this.LLJJ);
        C337180DJs.LIZJ(this.LLJILLL);
        if (bool == null) {
            LJI(greetingCardViewModel, C13BV.INSTANCE, false, EnumC910390ZnZ.SENDER_ENTER, new AwS410S0200000_9(this, greetingCardViewModel, 76), new AwS415S0200000_14(this, greetingCardViewModel, 87));
        } else {
            LJII(greetingCardViewModel, new AwS558S0100000_14(this, 1404));
        }
    }

    public final void LJIIJJI(GreetingCardViewModel greetingCardViewModel, long j) {
        EnumC910410Znb enumC910410Znb;
        boolean zLJFF;
        int iLJFF;
        final C1360570lVf c1360570lVf;
        final String strLJIIJ;
        InputFilter inputFilter;
        Integer sendButtonColorInt;
        Lifecycle lifecycle;
        LifecycleCoroutineScope lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope;
        InterfaceC457860HxQ interfaceC457860HxQ;
        if (this.LLJL) {
            return;
        }
        this.LLJL = true;
        this.LLJJLIIIJLLLLLLLZ = false;
        C910500Znk c910500Znk = EnumC910410Znb.Companion;
        Context context = getContext();
        c910500Znk.getClass();
        float fLIZ = C497820Jfg.LIZ(context);
        if (fLIZ < C418440Gaw.LIZIZ(640)) {
            enumC910410Znb = EnumC910410Znb.VERY_SMALL;
        } else if (fLIZ < C418440Gaw.LIZIZ(812)) {
            enumC910410Znb = EnumC910410Znb.SMALL;
        } else {
            enumC910410Znb = EnumC910410Znb.NORMAL;
        }
        this.LLJJJJLIIL = enumC910410Znb;
        C128Y fragment = getFragment();
        if ((fragment instanceof InterfaceC457860HxQ) && (interfaceC457860HxQ = (InterfaceC457860HxQ) fragment) != null) {
            interfaceC457860HxQ.ok(Collections.singletonList(this));
        }
        Map<String, String> mapWQ2 = GreetingCardViewModel.wQ2(this.LLJJIJI);
        GreetingCardResource greetingCardResource = greetingCardViewModel.LLILLL.get(this.LLJJIJI);
        if (greetingCardResource != null) {
            zLJFF = Intrinsics.LJFF(greetingCardResource.isUseDarkModeText(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        this.LLJJIJIL = zLJFF;
        Fragment fragment2 = getFragment();
        if (fragment2 != null && (lifecycle = fragment2.getLifecycle()) != null && (lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope = LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(lifecycle)) != null) {
            C23250099c.LIZLLL(lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope, C0PEM.LIZJ, null, new C910330ZnT(greetingCardViewModel, this, null), 2);
        }
        if (greetingCardResource != null && (sendButtonColorInt = greetingCardResource.getSendButtonColorInt()) != null) {
            int iIntValue = sendButtonColorInt.intValue();
            Integer numSendButtonTextColorInt = greetingCardResource.sendButtonTextColorInt();
            if (numSendButtonTextColorInt != null) {
                int iIntValue2 = numSendButtonTextColorInt.intValue();
                C197039127h c197039127h = this.LLJILLL;
                if (c197039127h != null) {
                    c197039127h.LJJJJL(new AwS5S0002000_1(iIntValue2, iIntValue, 1));
                }
            }
        }
        LJ(mapWQ2);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = (int) C418440Gaw.LIZIZ(14);
        c419910GdJ.LIZJ = (int) C418440Gaw.LIZIZ(14);
        c419910GdJ.LIZ = R.raw.icon_pen_fill;
        if (this.LLJJIJIL) {
            iLJFF = C1383370m6R.LJFF(R.attr.agt);
        } else {
            iLJFF = C1383370m6R.LJFF(R.attr.av3);
        }
        c419910GdJ.LIZLLL = Integer.valueOf(iLJFF);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        tuxIconDrawableLIZ.setBounds(0, 0, (int) C418440Gaw.LIZIZ(14), (int) C418440Gaw.LIZIZ(14));
        this.LLJJJJ = new ImageSpan(tuxIconDrawableLIZ);
        View view = this.LL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS149S0100000_14(this, 62), view);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LL, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(j);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            C786410Ut5.Pd(objectAnimatorOfFloat);
            this.LLJJJIL = objectAnimatorOfFloat;
        }
        C197039127h c197039127h2 = this.LLJILLL;
        if (c197039127h2 != null) {
            c197039127h2.setTypeface(C1697580uHE.LIZIZ(1.0f, 900, 17.0f, 0.0f, null, 0.0f, 0, null, 240));
            c197039127h2.setTextSize(1, 17.0f);
        }
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setTypeface(C1697580uHE.LIZIZ(1.0f, 600, 13.0f, 0.0f, null, 0.0f, 0, null, 240));
            tuxTextView.setTextSize(1, 13.0f);
            tuxTextView.setIncludeFontPadding(false);
        }
        C1360570lVf c1360570lVf2 = this.LLJIJIL;
        if (c1360570lVf2 != null) {
            c1360570lVf2.setTypeface(C1697580uHE.LIZIZ(1.0f, 600, 13.0f, 1.0f, null, 0.0f, 0, null, 240));
            c1360570lVf2.setTextSize(1, 13.0f);
            if (this.LLJJIJIL) {
                c1360570lVf2.setTextColor(C1383370m6R.LJFF(R.attr.agt));
                c1360570lVf2.setHintTextColor(C1383370m6R.LJFF(R.attr.agy));
            } else {
                c1360570lVf2.setTextColor(C1383370m6R.LJFF(R.attr.av3));
                c1360570lVf2.setHintTextColor(C1383370m6R.LJFF(R.attr.av8));
            }
        }
        C1360570lVf c1360570lVf3 = this.LLJI;
        if (c1360570lVf3 != null) {
            c1360570lVf3.setTypeface(C1697580uHE.LIZIZ(1.0f, 600, 13.0f, 1.0f, null, 0.0f, 0, null, 240));
            c1360570lVf3.setTextSize(1, 13.0f);
            if (this.LLJJIJIL) {
                c1360570lVf3.setTextColor(C1383370m6R.LJFF(R.attr.agt));
                c1360570lVf3.setHintTextColor(C1383370m6R.LJFF(R.attr.agy));
            } else {
                c1360570lVf3.setTextColor(C1383370m6R.LJFF(R.attr.av3));
                c1360570lVf3.setHintTextColor(C1383370m6R.LJFF(R.attr.av8));
            }
        }
        C1360570lVf c1360570lVf4 = this.LLJILJIL;
        if (c1360570lVf4 != null) {
            c1360570lVf4.setTypeface(C1697580uHE.LIZIZ(1.0f, 800, 14.0f, 1.0f, null, 0.0f, 0, null, 240));
            c1360570lVf4.setTextSize(1, 14.0f);
            if (Build.VERSION.SDK_INT >= 28) {
                c1360570lVf4.setLineHeight((int) C418440Gaw.LIZIZ(21));
            }
            if (this.LLJJIJIL) {
                c1360570lVf4.setTextColor(C1383370m6R.LJFF(R.attr.agq));
                c1360570lVf4.setHintTextColor(C1383370m6R.LJFF(R.attr.agy));
            } else {
                c1360570lVf4.setTextColor(C1383370m6R.LJFF(R.attr.av0));
                c1360570lVf4.setHintTextColor(C1383370m6R.LJFF(R.attr.av8));
            }
        }
        C197039127h c197039127h3 = this.LLJJIII;
        if (c197039127h3 != null) {
            c197039127h3.LJJJJL(new AwS593S0100000_14(this, 234));
            c197039127h3.LJJLI(true);
            if (this.LLJJIJIL) {
                c197039127h3.setIconTintColor(C1383370m6R.LJFF(R.attr.agq));
            } else {
                c197039127h3.setIconTintColor(C1383370m6R.LJFF(R.attr.av0));
            }
        }
        C197039127h c197039127h4 = this.LLJJI;
        if (c197039127h4 != null) {
            c197039127h4.LJJJJL(AFwS232S0000000_4.get$arr$(185));
            c197039127h4.LJJLI(true);
            c197039127h4.setTextColor(C1383370m6R.LJFF(R.attr.av0));
        }
        LJIIL();
        for (EnumC910430Znd enumC910430Znd : EnumC910430Znd.values()) {
            int i = C910420Znc.LIZ[enumC910430Znd.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c1360570lVf = this.LLJILJIL;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c1360570lVf = this.LLJIJIL;
                }
            } else {
                c1360570lVf = this.LLJI;
            }
            if (c1360570lVf != null) {
                if (enumC910430Znd == EnumC910430Znd.CONTENT) {
                    strLJIIJ = C1383370m6R.LJIIJ(2131831058);
                } else {
                    strLJIIJ = C1383370m6R.LJIIJ(2131831055);
                }
                final int maxLength = enumC910430Znd.getMaxLength();
                if (((Boolean) C0AEY.LIZ.getValue()).booleanValue()) {
                    inputFilter = new InputFilter() { // from class: X.0lVe
                        @Override // android.text.InputFilter
                        public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                            String string;
                            if (charSequence == null) {
                                return null;
                            }
                            String string2 = charSequence.subSequence(i2, i3).toString();
                            if (string2.length() == 0) {
                                c1360570lVf.setCanToast(true);
                                return null;
                            }
                            if (spanned != null) {
                                string = spanned.toString();
                            } else {
                                string = null;
                            }
                            if (string == null) {
                                string = "";
                            }
                            String str = string.substring(0, i4) + string2 + string.substring(i5);
                            c1360570lVf.getClass();
                            if (C1360570lVf.LJIIIIZZ(str) <= maxLength) {
                                c1360570lVf.setCanToast(true);
                                return null;
                            }
                            String str2 = string.substring(0, i4) + string.substring(i5);
                            int i6 = maxLength;
                            c1360570lVf.getClass();
                            int iLJIIIIZZ = i6 - C1360570lVf.LJIIIIZZ(str2);
                            if (iLJIIIIZZ <= 0) {
                                c1360570lVf.LJIIIZ(strLJIIJ);
                                return "";
                            }
                            c1360570lVf.getClass();
                            if (string2.length() == 0) {
                                string2 = "";
                            } else {
                                BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
                                characterInstance.setText(string2);
                                int iFirst = characterInstance.first();
                                while (iFirst != -1) {
                                    iFirst = characterInstance.next();
                                    if (iFirst != -1) {
                                        iLJIIIIZZ--;
                                        if (iLJIIIIZZ <= 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                string2 = string2.substring(0, iFirst);
                            }
                            if (string2.length() == 0) {
                                c1360570lVf.LJIIIZ(strLJIIJ);
                                return "";
                            }
                            c1360570lVf.LJIIIZ(strLJIIJ);
                            return string2;
                        }
                    };
                } else {
                    inputFilter = new InputFilter() { // from class: X.0Zne
                        @Override // android.text.InputFilter
                        public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                            int length;
                            if (charSequence == null) {
                                return null;
                            }
                            int i6 = maxLength;
                            if (spanned != null) {
                                length = spanned.length();
                            } else {
                                length = 0;
                            }
                            int i7 = i6 - (length - (i5 - i4));
                            if (charSequence.length() == 0) {
                                c1360570lVf.setCanToast(true);
                                return null;
                            }
                            if (i7 <= 0) {
                                c1360570lVf.LJIIIZ(strLJIIJ);
                                return "";
                            }
                            if (i7 >= i3 - i2) {
                                c1360570lVf.setCanToast(true);
                                return null;
                            }
                            int i8 = i7 + i2;
                            if (Character.isHighSurrogate(charSequence.charAt(i8 - 1)) && i8 - 1 == i2) {
                                c1360570lVf.LJIIIZ(strLJIIJ);
                                return "";
                            }
                            c1360570lVf.LJIIIZ(strLJIIJ);
                            return charSequence.subSequence(i2, i8);
                        }
                    };
                }
                c1360570lVf.setFilters(new InputFilter[]{inputFilter});
            }
        }
        C197039127h c197039127h5 = this.LLJJI;
        if (c197039127h5 != null) {
            C786410Ut5.U8(c197039127h5, new ACListenerS149S0100000_14(greetingCardViewModel, 61));
        }
    }

    public final void LJIIIIZZ(GreetingCardViewModel greetingCardViewModel, GreetingCardInfoComponent greetingCardInfoComponent, boolean z) {
        C197039127h c197039127h;
        LJIIJ(getTransitionHideViewConfigs(), Collections.singletonList(new C909870Zmj(Collections.singletonList(this.LLJILJILJ), 0L)), AFwS201S0000000_14.get$arr$(400));
        C1584506Ih.LIZ(this.LLILLL);
        SmartImageView smartImageView = this.LLIZ;
        if (smartImageView != null) {
            C786410Ut5.u5(smartImageView, 1.0f);
        }
        C1294120jmU c1294120jmU = this.LLIZLLLIL;
        if (c1294120jmU != null) {
            c1294120jmU.LIZLLL();
            c1294120jmU.LIZIZ();
            C1584506Ih.LIZ(c1294120jmU);
        }
        C197039127h c197039127h2 = this.LLJILLL;
        if (c197039127h2 != null) {
            c197039127h2.setText(C1383370m6R.LJIIJ(2131831059));
        }
        C1584506Ih.LIZ(this.LLJJIII);
        if (!z && (c197039127h = this.LLJILLL) != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS117S0200000_14(this, greetingCardViewModel, 22));
        }
        C1360570lVf c1360570lVf = this.LLJI;
        if (c1360570lVf != null) {
            c1360570lVf.setEnabled(false);
            c1360570lVf.setKeyListener(null);
            c1360570lVf.setText(new SpannableStringBuilder(greetingCardInfoComponent.senderText));
        }
        C1360570lVf c1360570lVf2 = this.LLJIJIL;
        if (c1360570lVf2 != null) {
            c1360570lVf2.setEnabled(false);
            c1360570lVf2.setKeyListener(null);
            c1360570lVf2.setText(new SpannableStringBuilder(greetingCardInfoComponent.receiverText));
        }
        C1360570lVf c1360570lVf3 = this.LLJILJIL;
        if (c1360570lVf3 != null) {
            c1360570lVf3.setKeyListener(null);
            c1360570lVf3.setFocusable(false);
            c1360570lVf3.setText(new SpannableStringBuilder(greetingCardInfoComponent.contentText));
        }
    }

    public final void LJIIJ(List<C909870Zmj> list, List<C909870Zmj> list2, Function0<Unit> function0) {
        AnimatorSet animatorSet = this.LLJJJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        for (C909870Zmj c909870Zmj : list) {
            for (View view : c909870Zmj.LIZ) {
                if (view != null) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 1.0f);
                    objectAnimatorOfFloat.setDuration(350L);
                    objectAnimatorOfFloat.setStartDelay(c909870Zmj.LIZIZ);
                    C1717206ny.LIZ(objectAnimatorOfFloat, arrayList);
                }
            }
        }
        Iterator<C909870Zmj> it2 = list2.iterator();
        while (it2.hasNext()) {
            for (View view2 : it2.next().LIZ) {
                if (view2 != null) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "alpha", view2.getAlpha(), 0.0f);
                    objectAnimatorOfFloat2.setDuration(200L);
                    C1717206ny.LIZ(objectAnimatorOfFloat2, arrayList);
                }
            }
        }
        animatorSet2.playTogether(arrayList);
        animatorSet2.setInterpolator(new LinearInterpolator());
        animatorSet2.addListener(new AAListenerS325S0100000_14(function0, 2));
        animatorSet2.start();
        this.LLJJJ = animatorSet2;
    }

    public final void LIZ(List<C909870Zmj> list, boolean z, DataSource dataSource, final Function0<Unit> function0) {
        LinearLayout linearLayout = this.LLILZIL;
        if (linearLayout != null) {
            C786410Ut5.W4(linearLayout, 1.0f);
        }
        C1390410mHn c1390410mHn = this.LLILZ;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C1584506Ih.LIZ(this.LLILZ);
        C197039127h c197039127h = this.LLJILLL;
        if (c197039127h != null) {
            c197039127h.setLoading(false);
        }
        if (z) {
            LJIIJ(list, getTransitionHideViewConfigs(), new AwS558S0100000_14(this, 1401));
        } else {
            Iterator<C909870Zmj> it2 = list.iterator();
            while (it2.hasNext()) {
                for (View view : it2.next().LIZ) {
                    if (view != null) {
                        C786410Ut5.T4(view, 1.0f);
                    }
                }
            }
            Iterator<C909870Zmj> it3 = getTransitionHideViewConfigs().iterator();
            while (it3.hasNext()) {
                for (View view2 : it3.next().LIZ) {
                    if (view2 != null) {
                        C786410Ut5.T4(view2, 0.0f);
                    }
                }
            }
            C337180DJs.LIZJ(this.LLIZLLLIL);
        }
        Fragment fragment = getFragment();
        if (fragment == null) {
            function0.invoke();
            return;
        }
        C1294120jmU c1294120jmU = this.LLIZLLLIL;
        if (c1294120jmU == null) {
            return;
        }
        c1294120jmU.LIZLLL();
        c1294120jmU.LIZ(c1294120jmU.getContext(), fragment, new AlphaPlayerAction() { // from class: X.0Zni
            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void onVideoSizeChange(int i, int i2, DataSource.ScaleType scaleType) {
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void startAction() {
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void endAction() {
                function0.invoke();
            }
        }, false);
        c1294120jmU.setFirstFrameListener(new AwS410S0200000_9(fragment, this, 77));
        PlayerController playerController = c1294120jmU.LL;
        if (playerController != null) {
            playerController.attachAlphaView(c1294120jmU);
        }
        c1294120jmU.LIZJ(dataSource, true);
    }

    public final void LJI(GreetingCardViewModel greetingCardViewModel, List<C909870Zmj> list, boolean z, EnumC910390ZnZ enumC910390ZnZ, Function0<Unit> function0, Function0<Unit> function02) {
        DataSource dataSource = (DataSource) ((LinkedHashMap) this.LLJJIJIIJIL).get(enumC910390ZnZ);
        if (dataSource != null) {
            LIZ(list, z, dataSource, function02);
            return;
        }
        if (enumC910390ZnZ != EnumC910390ZnZ.VIEWER_ENTER && enumC910390ZnZ != EnumC910390ZnZ.SENDER_ENTER) {
            C197039127h c197039127h = this.LLJILLL;
            if (c197039127h != null) {
                c197039127h.setLoading(true);
            }
        } else {
            C337180DJs.LIZJ(this.LLILZ);
            C1390410mHn c1390410mHn = this.LLILZ;
            if (c1390410mHn != null) {
                c1390410mHn.LIZJ();
            }
        }
        Fragment fragment = getFragment();
        if (fragment == null) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), C0PEM.LIZJ, null, new C910350ZnV(greetingCardViewModel, this, enumC910390ZnZ, fragment, function0, function02, list, z, null), 2);
    }
}
