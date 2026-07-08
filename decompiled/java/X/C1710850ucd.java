package X;

import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0ucd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710850ucd extends C1711910ueL {
    public static final int LLJJJJJIL;
    public Function0<? extends List<String>> LLJILJIL;
    public Function1<? super String, Unit> LLJILJILJ;
    public Function1<? super String, Unit> LLJILLL;
    public String LLJJ;
    public Function1<? super String, C1710830ucb> LLJJI;
    public C1710790ucX LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public String LLJJJ;
    public final C1331730kl9 LLJJJIL;
    public LinearLayout LLJJJJ;

    @Override // X.C1711910ueL
    public final void LIZIZ() {
        C1710790ucX c1710790ucX = this.LLJJIII;
        if (c1710790ucX != null) {
            getEditText().removeTextChangedListener(c1710790ucX);
        }
        this.LLJJIII = null;
        LinearLayout linearLayout = this.LLJJJJ;
        if (Intrinsics.LJFF(linearLayout != null ? linearLayout.getParent() : null, this)) {
            LinearLayout linearLayout2 = this.LLJJJJ;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, linearLayout2);
            removeView(linearLayout2);
        }
        this.LLJJJJ = null;
        super.LIZIZ();
        this.LLJILJIL = null;
        this.LLJILJILJ = AFwS268S0000000_26.get$arr$(547);
        this.LLJILLL = AFwS268S0000000_26.get$arr$(548);
        this.LLJJ = null;
        this.LLJJI = AFwS268S0000000_26.get$arr$(549);
        this.LLJJJ = "";
    }

    static {
        SettingsManager.LIZLLL().getClass();
        LLJJJJJIL = SettingsManager.LJ("pipo_cashier_max_icon_show_count_of_card_number_input", 4);
    }

    public final String getValue() throws Throwable {
        String string;
        String strLJJIFFI;
        Editable editableLLJILLL = C2204961BRm.LLJILLL(getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CA3zMRkEGe2F3/FRz8DHtueHA4i57+swHAT/GA9lW1CFXaxMPvdCxUsTXI1q/EjM2M5bLzPP8=", null));
        return (editableLLJILLL == null || (string = editableLLJILLL.toString()) == null || (strLJJIFFI = u.LJJIFFI(string, " ", "", false)) == null) ? "" : strLJJIFFI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object c098200Yq;
        super.onAttachedToWindow();
        try {
            EventBus.LIZLLL().LJIJJ(this);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        try {
            EventBus.LIZLLL().LJJI(this);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.onDetachedFromWindow();
    }

    public final Function1<String, Unit> getAfterValueChanged() {
        return this.LLJILLL;
    }

    public final Function0<List<String>> getIconsProvider() {
        return this.LLJILJIL;
    }

    public final Function1<String, C1710830ucb> getOnCheckingCardIfSupported() {
        return this.LLJJI;
    }

    public final Function1<String, Unit> getOnValueChange() {
        return this.LLJILJILJ;
    }

    public final String getPrefilledValue() {
        return this.LLJJ;
    }

    public C1710850ucd(Context context) {
        super(context, null, 0);
        this.LLJILJILJ = AFwS268S0000000_26.get$arr$(552);
        this.LLJILLL = AFwS268S0000000_26.get$arr$(550);
        this.LLJJI = AFwS268S0000000_26.get$arr$(551);
        this.LLJJIJI = C1722120uuo.LIZ(6);
        this.LLJJIJIIJIL = C1722120uuo.LIZ(32);
        this.LLJJIJIL = C1722120uuo.LIZ(20);
        this.LLJJJ = "";
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C1722120uuo.LIZ(2);
        this.LLJJJIL = new C1331730kl9(c1331750klB);
    }

    public final void LIZLLL(List<String> list) {
        int size = list.size();
        int i = LLJJJJJIL;
        if (size > i) {
            list = list.subList(0, i);
        }
        LinearLayout linearLayout = this.LLJJJJ;
        ViewParent parent = null;
        if (linearLayout != null) {
            parent = linearLayout.getParent();
        }
        if (Intrinsics.LJFF(parent, this)) {
            LinearLayout linearLayout2 = this.LLJJJJ;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, linearLayout2);
            removeView(linearLayout2);
        }
        if (list.isEmpty()) {
            return;
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        C786410Ut5.d6(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 8388661));
        linearLayout3.setOrientation(0);
        this.LLJJJJ = linearLayout3;
        int i2 = 0;
        for (String str : list) {
            SmartImageView smartImageView = new SmartImageView(getContext());
            C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(this.LLJJIJIIJIL, this.LLJJIJIL));
            smartImageView.setCircleOptions(this.LLJJJIL);
            if (str.length() <= 0) {
                str = " ";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJIIZI(C1308910kAL.LJ(R.attr.c7, getContext()));
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_XY;
            c1331670kl3LJIIIZ.LJJI(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            LinearLayout linearLayout4 = this.LLJJJJ;
            if (linearLayout4 != null) {
                linearLayout4.addView(smartImageView);
            }
            if (i2 < list.size() - 1) {
                i2++;
                LinearLayout linearLayout5 = this.LLJJJJ;
                if (linearLayout5 != null) {
                    Space space = new Space(getContext());
                    C786410Ut5.f6(space, new LinearLayout.LayoutParams(this.LLJJIJI, 0));
                    linearLayout5.addView(space);
                }
            }
        }
        LinearLayout linearLayout6 = this.LLJJJJ;
        if (linearLayout6 != null) {
            addView(linearLayout6);
        }
    }

    @C14EU
    public final void onEvent(C1710980ucq c1710980ucq) {
        String str = c1710980ucq.LIZ;
        if (str != null) {
            getEditText().setText(str);
            getEditText().getOnFocusChangeListener().onFocusChange(getEditText(), false);
        }
    }

    public final void setAfterValueChanged(Function1<? super String, Unit> function1) {
        this.LLJILLL = function1;
    }

    public final void setIconsProvider(Function0<? extends List<String>> function0) {
        this.LLJILJIL = function0;
    }

    public final void setOnCheckingCardIfSupported(Function1<? super String, C1710830ucb> function1) {
        this.LLJJI = function1;
    }

    public final void setOnValueChange(Function1<? super String, Unit> function1) {
        this.LLJILJILJ = function1;
    }

    public final void setPrefilledValue(String str) {
        this.LLJJ = str;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ucX] */
    @Override // X.C1711910ueL
    public final void LIZ(Element element, C1709570uaZ c1709570uaZ, String str, int i) {
        String strLJJLIIIJ;
        super.LIZ(element, c1709570uaZ, str, i);
        C1748440vbG contentView = getContentView();
        Object obj = null;
        if (contentView != null) {
            C1710970ucp c1710970ucp = C1710970ucp.LIZ;
            String str2 = c1709570uaZ.LJIIZILJ.LJ;
            c1710970ucp.getClass();
            if (C1710970ucp.LIZIZ(str2)) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_camera;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                TuxIconView tuxIconViewLJ = contentView.LJ(c419910GdJ, false);
                TuxIconView tuxIconView = contentView.LLL;
                if (tuxIconView != null) {
                    C786410Ut5.LJJLIIIJLLLLLLLZ(contentView, tuxIconView);
                }
                contentView.LLL = tuxIconViewLJ;
                tuxIconViewLJ.setContentDescription(null);
                contentView.LIZIZ(tuxIconViewLJ);
            }
        }
        C1710970ucp c1710970ucp2 = C1710970ucp.LIZ;
        String str3 = c1709570uaZ.LJIIZILJ.LJ;
        c1710970ucp2.getClass();
        if (C1710970ucp.LIZIZ(str3)) {
            Iterator<View> it2 = new C09RD(getContentView()).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                }
                Object next = c09re.next();
                if (next instanceof TuxIconView) {
                    obj = next;
                }
            }
            View view = (View) obj;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS160S0100000_26(this, 46), view);
            }
        }
        this.LLJJJ = str;
        C1710790ucX c1710790ucX = this.LLJJIII;
        if (c1710790ucX != null) {
            getEditText().removeTextChangedListener(c1710790ucX);
        }
        EditText editText = getEditText();
        String str4 = this.LLJJ;
        String str5 = "";
        if (str4 != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(C13LN.LJLJL(4, u.LJJIFFI(str4, " ", "", false)), " ", null, null, 0, null, null, 62)) != null) {
            str5 = strLJJLIIIJ;
        }
        editText.setText(str5);
        final EditText editText2 = getEditText();
        this.LLJJIII = new C754920TjO(editText2) { // from class: X.0ucX
            @Override // X.C754920TjO, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                this.LLILZIL.getAfterValueChanged().invoke(this.LLILZIL.getValue());
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                List<String> listInvoke;
                try {
                    this.LLILZIL.getOnValueChange().invoke(this.LLILZIL.getValue());
                    C1710850ucd c1710850ucd = this.LLILZIL;
                    Function0<List<String>> iconsProvider = c1710850ucd.getIconsProvider();
                    if (iconsProvider == null || (listInvoke = iconsProvider.invoke()) == null) {
                        listInvoke = C13BV.INSTANCE;
                    }
                    c1710850ucd.LIZLLL(listInvoke);
                    C1710830ucb c1710830ucbInvoke = this.LLILZIL.getOnCheckingCardIfSupported().invoke(this.LLILZIL.getValue());
                    if (c1710830ucbInvoke != null) {
                        this.LLILZIL.LIZJ(c1710830ucbInvoke);
                    } else {
                        this.LLILZIL.LIZJ(null);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
            }
        };
        getEditText().addTextChangedListener(this.LLJJIII);
        getEditText().setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775810wJP(this, new C1710380ubs(str, "card_number", "ccdc_card_info", "ccdc"), 1));
    }
}
