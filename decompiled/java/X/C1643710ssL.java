package X;

import Y.ACListenerS159S0100000_25;
import Y.ATListenerS457S0100000_25;
import Y.AfS194S0100000_25;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0ssL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643710ssL implements InterfaceC1640960snu {
    public final LifecycleOwner LIZ;
    public final ViewGroup LIZIZ;
    public final Function0<InterfaceC1641070so5<ProviderEffect>> LIZJ;
    public final View LIZLLL;
    public final Activity LJ;
    public final String LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final InterfaceC1640930snr LJIIIIZZ;
    public ViewGroup LJIIIZ;
    public EditText LJIIJ;
    public View LJIIJJI;
    public View LJIIL;
    public C21356818hy LJIILIIL;
    public boolean LJIILLIIL;
    public View LJIIZILJ;
    public SoftKeyBoardListener LJIJJ;
    public final C11RK<String> LJIILJJIL = new C11RK<>();
    public final C11RK<Boolean> LJIILL = new C11RK<>();
    public final C01GW LJIJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 935));
    public final C1698180uIC LJIJI = new C1698180uIC(this, 1);
    public final C1643720ssM LJIJJLI = new InterfaceC1391500mJY() { // from class: X.0ssM
        @Override // X.InterfaceC1391500mJY
        public final void LLLL(int i) {
        }

        @Override // X.InterfaceC1391500mJY
        public final void LJJIIJ(int i) {
            this.LL.LIZJ().Fp();
        }

        @Override // X.InterfaceC1391500mJY
        public final void LJZI(int i) {
            this.LL.LIZJ().Fp();
            EditText editText = this.LL.LJIIJ;
            if (editText == null) {
                editText = null;
            }
            editText.clearFocus();
        }
    };

    @Override // X.InterfaceC1640960snu
    public final C19475711Hn LIZIZ() {
        C11RK<Boolean> c11rk = this.LJIILL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final InterfaceC1641070so5<ProviderEffect> LIZJ() {
        return (InterfaceC1641070so5) this.LJIJ.getValue();
    }

    @Override // X.InterfaceC1640960snu
    public final void x4() {
        EditText editText = this.LJIIJ;
        if (editText != null) {
            KeyboardUtils.LIZ(this.LIZIZ.getContext(), editText);
        }
    }

    public final void LIZ(boolean z) {
        EditText editText = this.LJIIJ;
        View view = null;
        if (editText == null) {
            editText = null;
        }
        editText.setText("");
        if (z) {
            LIZJ().Ep("");
        }
        View view2 = this.LJIIJJI;
        if (view2 != null) {
            view = view2;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    @Override // X.InterfaceC1640960snu
    public final void setVisibility(boolean z) {
        int i;
        ViewGroup viewGroup = this.LIZIZ;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLZ(i, viewGroup);
        if (z && this.LJIIJ == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZIZ.getContext()), R.layout.fvk, this.LIZIZ, true);
            this.LJIIZILJ = viewTd;
            View view = null;
            if (viewTd == null) {
                viewTd = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) viewTd.findViewById(R.id.tpd);
            this.LJIIIZ = viewGroup2;
            if (this.LJII) {
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                viewGroup2.setBackgroundResource(R.drawable.cdb);
            }
            View view2 = this.LJIIZILJ;
            if (view2 == null) {
                view2 = null;
            }
            this.LJIIJ = (EditText) view2.findViewById(R.id.tv_search);
            View view3 = this.LJIIZILJ;
            if (view3 == null) {
                view3 = null;
            }
            this.LJIIJJI = view3.findViewById(R.id.coo);
            View view4 = this.LJIIZILJ;
            if (view4 == null) {
                view4 = null;
            }
            this.LJIIL = view4.findViewById(R.id.tv_search_action);
            Context context = this.LIZIZ.getContext();
            View view5 = this.LJIIZILJ;
            if (view5 == null) {
                view5 = null;
            }
            View view6 = this.LJIIL;
            if (view6 == null) {
                view6 = null;
            }
            ViewGroup viewGroup3 = this.LJIIIZ;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            this.LJIILIIL = new C21356818hy(context, view5, view6, viewGroup3);
            EditText editText = this.LJIIJ;
            if (editText == null) {
                editText = null;
            }
            editText.clearFocus();
            EditText editText2 = this.LJIIJ;
            if (editText2 == null) {
                editText2 = null;
            }
            editText2.setCursorVisible(false);
            String str = this.LJFF;
            if (str != null) {
                EditText editText3 = this.LJIIJ;
                if (editText3 == null) {
                    editText3 = null;
                }
                editText3.setHint(str);
            }
            EditText editText4 = this.LJIIJ;
            if (editText4 == null) {
                editText4 = null;
            }
            editText4.setOnEditorActionListener(new C1698080uI2(this, 0));
            EditText editText5 = this.LJIIJ;
            if (editText5 == null) {
                editText5 = null;
            }
            editText5.addTextChangedListener(this.LJIJI);
            EditText editText6 = this.LJIIJ;
            if (editText6 == null) {
                editText6 = null;
            }
            editText6.setOnTouchListener(new ATListenerS457S0100000_25(this, 5));
            View view7 = this.LJIIJJI;
            if (view7 == null) {
                view7 = null;
            }
            C786410Ut5.I7(new ACListenerS159S0100000_25(this, 62), view7);
            View view8 = this.LJIIL;
            if (view8 != null) {
                view = view8;
            }
            C786410Ut5.I7(new ACListenerS159S0100000_25(this, 63), view);
            this.LJIILJJIL.LJIL(600L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS194S0100000_25(this, 155), C09HN.LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0ssM] */
    public C1643710ssL(LifecycleOwner lifecycleOwner, ViewGroup viewGroup, AwS569S0100000_25 awS569S0100000_25, View view, Activity activity, String str, boolean z, boolean z2, InterfaceC1640930snr interfaceC1640930snr) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = viewGroup;
        this.LIZJ = awS569S0100000_25;
        this.LIZLLL = view;
        this.LJ = activity;
        this.LJFF = str;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = interfaceC1640930snr;
        C786410Ut5.LJLZ(8, viewGroup);
    }
}
