package X;

import Y.ACListenerS127S0200000_25;
import Y.ATListenerS457S0100000_25;
import Y.AfS194S0100000_25;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0ssP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643750ssP implements InterfaceC1640960snu {
    public final LifecycleOwner LIZ;
    public final ViewGroup LIZIZ;
    public final Function0<InterfaceC1641070so5<ProviderEffect>> LIZJ;
    public final View LIZLLL;
    public final Activity LJ;
    public final String LJFF;
    public final boolean LJI;
    public final InterfaceC1640930snr LJII;
    public C1749260vca LJIIIIZZ;
    public boolean LJIIIZ;
    public SoftKeyBoardListener LJIILJJIL;
    public final C01GW LJIIJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 942));
    public final C1698180uIC LJIIJJI = new C1698180uIC(this, 2);
    public final C11RK<String> LJIIL = new C11RK<>();
    public final C11RK<Boolean> LJIILIIL = new C11RK<>();
    public final C1643730ssN LJIILL = new InterfaceC1391500mJY() { // from class: X.0ssN
        @Override // X.InterfaceC1391500mJY
        public final void LLLL(int i) {
        }

        @Override // X.InterfaceC1391500mJY
        public final void LJJIIJ(int i) {
            this.LL.LIZJ().Fp();
        }

        @Override // X.InterfaceC1391500mJY
        public final void LJZI(int i) {
            C0I7D editTextView;
            this.LL.LIZJ().Fp();
            C1749260vca c1749260vca = this.LL.LJIIIIZZ;
            if (c1749260vca != null && (editTextView = c1749260vca.getEditTextView()) != null) {
                editTextView.clearFocus();
            }
        }
    };

    @Override // X.InterfaceC1640960snu
    public final C19475711Hn LIZIZ() {
        C11RK<Boolean> c11rk = this.LJIILIIL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final InterfaceC1641070so5<ProviderEffect> LIZJ() {
        return (InterfaceC1641070so5) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC1640960snu
    public final void x4() {
        C0I7D editTextView;
        C1749260vca c1749260vca = this.LJIIIIZZ;
        if (c1749260vca == null || (editTextView = c1749260vca.getEditTextView()) == null) {
            return;
        }
        KeyboardUtils.LIZ(this.LIZIZ.getContext(), editTextView);
    }

    public final void LIZ(boolean z) {
        C0I7D editTextView;
        C1749260vca c1749260vca = this.LJIIIIZZ;
        if (c1749260vca != null && (editTextView = c1749260vca.getEditTextView()) != null) {
            editTextView.setText("");
        }
        if (z) {
            LIZJ().Ep("");
        }
    }

    @Override // X.InterfaceC1640960snu
    public final void setVisibility(boolean z) {
        int i;
        boolean z2;
        int i2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.LIZIZ;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLZ(i, viewGroup2);
        if (z && this.LJIIIIZZ == null) {
            if (!this.LJI && C300250Bpn.LIZ()) {
                z2 = true;
            } else {
                z2 = false;
                C426750GoL.LJIIL(this.LIZIZ, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null, 29);
            }
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZIZ.getContext()), R.layout.fvn, this.LIZIZ, true);
            if (z2 && (viewGroup = (ViewGroup) viewTd.findViewById(R.id.u79)) != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                marginLayoutParams.topMargin = 0;
                C786410Ut5.X5(marginLayoutParams, viewGroup);
            }
            C1749260vca c1749260vca = (C1749260vca) viewTd.findViewById(R.id.u78);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.uk);
            Drawable drawableLIZ = c384050F3z.LIZ(c1749260vca.getContext());
            if (c1749260vca.getChildCount() > 0) {
                c1749260vca.getChildAt(0).setBackground(drawableLIZ);
            }
            c1749260vca.setEditBackgroundRadius(C418440Gaw.LIZIZ(8));
            c1749260vca.setOnClickClearListener(new ACListenerS127S0200000_25(c1749260vca, this, 4));
            c1749260vca.setSearchBarHeight(EnumC1726100v1E.LOW);
            c1749260vca.setShowSeparator(false);
            final C0I7D editTextView = c1749260vca.getEditTextView();
            editTextView.clearFocus();
            editTextView.setCursorVisible(false);
            String string = this.LJFF;
            if (string == null) {
                Context context = editTextView.getContext();
                if (C298250BmZ.LIZ()) {
                    i2 = 2131835510;
                } else {
                    i2 = 2131835509;
                }
                string = context.getString(i2);
            }
            editTextView.setHint(string);
            editTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0ssQ
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) throws Throwable {
                    if (i3 != 3) {
                        return false;
                    }
                    C1643750ssP c1643750ssP = this;
                    String string2 = null;
                    Editable editableLLLLJI = C2204961BRm.LLLLJI(editTextView, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2w2c2sgKOOmZZDdyDu6EgziCf02B+m77NtiqzhzSPR2Cb4FNFBZ6xYurpdjFlgTpD1Xbc84mohtVK9HFNNIUuFhviSeo9eg0A==", null));
                    if (editableLLLLJI != null) {
                        string2 = editableLLLLJI.toString();
                    }
                    c1643750ssP.getClass();
                    if (string2 != null && string2.length() != 0) {
                        c1643750ssP.LIZJ().Ep(string2);
                    } else {
                        C1638280sja c1638280sja = C21366318jV.LIZLLL;
                        Context context2 = c1643750ssP.LIZIZ.getContext();
                        c1638280sja.getClass();
                        C1638280sja.LIZ(2131857691, 0, context2).LIZ();
                    }
                    return true;
                }
            });
            editTextView.addTextChangedListener(this.LJIIJJI);
            editTextView.setOnTouchListener(new ATListenerS457S0100000_25(this, 6));
            this.LJIIIIZZ = c1749260vca;
            this.LJIIL.LJIL(600L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS194S0100000_25(this, 160), C09HN.LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0ssN] */
    public C1643750ssP(LifecycleOwner lifecycleOwner, ViewGroup viewGroup, AwS569S0100000_25 awS569S0100000_25, View view, Activity activity, String str, boolean z, InterfaceC1640930snr interfaceC1640930snr) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = viewGroup;
        this.LIZJ = awS569S0100000_25;
        this.LIZLLL = view;
        this.LJ = activity;
        this.LJFF = str;
        this.LJI = z;
        this.LJII = interfaceC1640930snr;
        C786410Ut5.LJLZ(8, viewGroup);
    }
}
