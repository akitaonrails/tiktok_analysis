package X;

import Y.AObserverS231S0100000_29;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11tW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19644811tW extends AbstractC19644711tV<C19639911sj> {
    public final Function1<String, Unit> LJ;
    public final Function0<Unit> LJFF;
    public final Function0<Unit> LJI;
    public C19645111tZ LJII;
    public boolean LJIIIIZZ;
    public TuxTextView LJIIIZ;
    public C19646111tj LJIIJ;

    @Override // X.AbstractC19644711tV
    public final String LJFF() {
        return "ArticleTitleEditorSheet";
    }

    public final void LJIILIIL() {
        this.LIZIZ = null;
        this.LIZ = null;
        C19645111tZ c19645111tZ = this.LJII;
        if (c19645111tZ != null) {
            c19645111tZ.LIZIZ();
        }
        this.LJII = null;
    }

    @Override // X.AbstractC19644711tV
    public final void LJI() {
        C19646111tj c19646111tj = this.LJIIJ;
        if (c19646111tj != null) {
            KeyboardUtils.LIZ(c19646111tj.getContext(), c19646111tj.getEditor());
        }
    }

    @Override // X.AbstractC19644711tV
    public final void LJIIIIZZ() {
        C19645111tZ c19645111tZ = new C19645111tZ();
        c19645111tZ.LIZ(c19645111tZ.LIZLLL, new AObserverS231S0100000_29(this, 164));
        c19645111tZ.LIZ(c19645111tZ.LJ, new AObserverS231S0100000_29(this, 165));
        c19645111tZ.LIZ(c19645111tZ.LJFF, new AObserverS231S0100000_29(this, 166));
        this.LJII = c19645111tZ;
    }

    @Override // X.AbstractC19644711tV
    public final View LJIIIZ(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.rd, viewGroup, false);
        TuxNavBar tuxNavBar = (TuxNavBar) viewTd.findViewById(R.id.y08);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS573S0100000_29(this, 915));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        String strLIZIZ = C20467080b.LIZIZ(2131826641);
        String str = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        c1250250idj.LIZJ = strLIZIZ;
        c0om1.LIZJ = c1250250idj;
        C1250280idm c1250280idm = new C1250280idm();
        TuxTextView tuxTextViewLIZIZ = AbstractC19644711tV.LIZIZ(tuxNavBar.getContext());
        AbstractC19644711tV.LIZ(tuxTextViewLIZIZ, false);
        C786410Ut5.I7(new AkS95S0100000_29(this, 74), tuxTextViewLIZIZ);
        this.LJIIIZ = tuxTextViewLIZIZ;
        c1250280idm.LIZJ = tuxTextViewLIZIZ;
        c1250280idm.LIZLLL = true;
        c0om1.LIZIZ(c1250280idm);
        c0om1.LIZLLL = true;
        tuxNavBar.setNavActions(c0om1);
        C19646111tj c19646111tj = (C19646111tj) viewTd.findViewById(R.id.kqo);
        TuxTextView tvTitle = c19646111tj.getTvTitle();
        String strLIZIZ2 = C20467080b.LIZIZ(2131826643);
        if (strLIZIZ2 == null) {
            strLIZIZ2 = "";
        }
        tvTitle.setText(strLIZIZ2);
        View inputContainer = c19646111tj.getInputContainer();
        inputContainer.setPadding(inputContainer.getPaddingStart(), inputContainer.getPaddingTop(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), inputContainer.getPaddingBottom());
        C19655911vJ editor = c19646111tj.getEditor();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(13.5d)));
        editor.setPadding(editor.getPaddingStart(), iLIZIZ, editor.getPaddingEnd(), iLIZIZ);
        editor.setSingleLine(false);
        editor.setMaxLines(3);
        String strLIZIZ3 = C20467080b.LIZIZ(2131826642);
        if (strLIZIZ3 != null) {
            str = strLIZIZ3;
        }
        editor.setHint(str);
        editor.addTextChangedListener(new C19773412Ya(this, 18));
        c19646111tj.h0(100, true);
        this.LJIIJ = c19646111tj;
        return viewTd;
    }

    @Override // X.AbstractC19644711tV
    public final void LJIIJ(Function0<Unit> function0) {
        C19646111tj c19646111tj = this.LJIIJ;
        if (c19646111tj != null) {
            LJIIJJI(c19646111tj, function0);
        }
    }

    public final void LJIIL(Object obj) {
        boolean z;
        C19655911vJ editor;
        C19639911sj c19639911sj = (C19639911sj) obj;
        String str = c19639911sj.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C19646511tn c19646511tn = c19639911sj.LIZIZ;
        if (c19646511tn == null) {
            if (str.length() == 100) {
                EnumC1153550g7l enumC1153550g7l = EnumC1153550g7l.WARNING;
                String strLIZIZ = C20467080b.LIZIZ(2131826545);
                if (strLIZIZ != null) {
                    str2 = strLIZIZ;
                }
                c19646511tn = new C19646511tn(enumC1153550g7l, str2);
            } else {
                c19646511tn = null;
            }
        }
        boolean z2 = true;
        if ((!a0.LJJJIL(str)) && C19646011ti.LIZ(c19646511tn)) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIIIZZ = z;
        C19645111tZ c19645111tZ = this.LJII;
        if (c19645111tZ != null) {
            c19645111tZ.LIZJ.set(str);
            c19645111tZ.LIZLLL.postValue(c19646511tn);
            MutableLiveData<Boolean> mutableLiveData = c19645111tZ.LJFF;
            if (!(!a0.LJJJIL(str)) || !C19646011ti.LIZ(c19646511tn)) {
                z2 = false;
            }
            mutableLiveData.postValue(Boolean.valueOf(z2));
        }
        C19646111tj c19646111tj = this.LJIIJ;
        if (c19646111tj != null && (editor = c19646111tj.getEditor()) != null) {
            editor.setText(str);
            editor.setSelection(str.length());
        }
    }

    public C19644811tW(AwS573S0100000_29 awS573S0100000_29, AwS573S0100000_29 awS573S0100000_292, AwS608S0100000_29 awS608S0100000_29) {
        this.LJ = awS608S0100000_29;
        this.LJFF = awS573S0100000_29;
        this.LJI = awS573S0100000_292;
    }
}
