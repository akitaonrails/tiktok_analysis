package X;

import Y.AObserverS231S0100000_29;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import irm.AkS66S0200000_29;
import irm.AkS95S0100000_29;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS463S0200000_28;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11tX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19644911tX extends AbstractC19644711tV<C19639611sg> {
    public final String LJ;
    public final Function1<C19639811si, Unit> LJFF;
    public final Function2<Boolean, C19639811si, Unit> LJI;
    public final Function0<Unit> LJII;
    public boolean LJIIIIZZ;
    public C19645011tY LJIIIZ;
    public C1BHX LJIIJ;
    public TuxTextView LJIIJJI;
    public C19646111tj LJIIL;
    public C1397510mTF LJIILIIL;
    public final C19639811si LJIILJJIL = new C19639811si();

    @Override // X.AbstractC19644711tV
    public final String LJFF() {
        return "ArticleLinkEditorSheet";
    }

    public final void LJIILIIL() {
        this.LIZIZ = null;
        this.LIZ = null;
        C19645011tY c19645011tY = this.LJIIIZ;
        if (c19645011tY != null) {
            c19645011tY.LIZIZ();
        }
        this.LJIIIZ = null;
        C19639811si c19639811si = this.LJIILJJIL;
        c19639811si.LIZ = null;
        c19639811si.LIZIZ = null;
        c19639811si.LIZJ = null;
    }

    @Override // X.AbstractC19644711tV
    public final void LJI() {
        C19646111tj c19646111tj = this.LJIIL;
        if (c19646111tj != null) {
            KeyboardUtils.LIZ(c19646111tj.getContext(), c19646111tj.getEditor());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.127w] */
    @Override // X.AbstractC19644711tV
    public final void LJIIIIZZ() {
        C19645011tY c19645011tY = new C19645011tY(this.LJ, new InterfaceC19321510iT() { // from class: X.127w
            @Override // X.InterfaceC19321510iT
            public final void LIZ(final String str, final AwS463S0200000_28 awS463S0200000_28) {
                C1BHX c1bhx = this.LIZ.LJIIJ;
                if (c1bhx != null) {
                    c1bhx.setWebTitleCallback(new InterfaceC1542320qEo() { // from class: X.127x
                        @Override // X.InterfaceC1542320qEo
                        public final void LIZ(String str2) {
                        }

                        @Override // X.InterfaceC1542320qEo
                        public final void LIZJ(String str2, boolean z) {
                        }

                        @Override // X.InterfaceC1542320qEo
                        public final void LIZIZ(String str2) {
                            awS463S0200000_28.invoke(str, str2);
                        }
                    });
                    SparkThirdContext sparkThirdContext = new SparkThirdContext();
                    sparkThirdContext.url = str;
                    sparkThirdContext.bizCert = new ThirdPartyBizCert(402685966);
                    c1bhx.LIZ(sparkThirdContext);
                    return;
                }
                awS463S0200000_28.invoke(str, null);
            }
        });
        c19645011tY.LIZ(c19645011tY.LJII, new AObserverS231S0100000_29(this, 155));
        c19645011tY.LIZ(c19645011tY.LJIIJJI, new AObserverS231S0100000_29(this, 156));
        c19645011tY.LIZ(c19645011tY.LJI, new AObserverS231S0100000_29(this, 157));
        c19645011tY.LIZ(c19645011tY.LJIIIIZZ, new AObserverS231S0100000_29(this, 158));
        c19645011tY.LIZ(c19645011tY.LJIIIZ, new AObserverS231S0100000_29(this, 159));
        c19645011tY.LIZ(c19645011tY.LJIIJ, new AObserverS231S0100000_29(this, 160));
        c19645011tY.LIZ(c19645011tY.LJIIL, new AObserverS231S0100000_29(this, 161));
        this.LJIIIZ = c19645011tY;
    }

    @Override // X.AbstractC19644711tV
    public final View LJIIIZ(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.rd, viewGroup, false);
        TuxNavBar tuxNavBar = (TuxNavBar) viewTd.findViewById(R.id.y08);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS573S0100000_29(this, 897));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = tuxNavBar.getContext().getString(2131826632);
        c0om1.LIZJ = c1250250idj;
        C1250280idm c1250280idm = new C1250280idm();
        TuxTextView tuxTextViewLIZIZ = AbstractC19644711tV.LIZIZ(tuxNavBar.getContext());
        AbstractC19644711tV.LIZ(tuxTextViewLIZIZ, false);
        C786410Ut5.I7(new AkS95S0100000_29(this, 73), tuxTextViewLIZIZ);
        this.LJIIJJI = tuxTextViewLIZIZ;
        c1250280idm.LIZJ = tuxTextViewLIZIZ;
        c1250280idm.LIZLLL = true;
        c0om1.LIZIZ(c1250280idm);
        c0om1.LIZLLL = true;
        tuxNavBar.setNavActions(c0om1);
        this.LJIIJ = new C1BHX(viewTd.getContext(), null, 6);
        C19646111tj c19646111tj = (C19646111tj) viewTd.findViewById(R.id.kqo);
        c19646111tj.getTvTitle().setText(C20467080b.LIZIZ(2131826636));
        TuxIconView endIcon = c19646111tj.getEndIcon();
        C786410Ut5.LLLLLLZZ(endIcon, 0);
        endIcon.setIconRes(R.raw.icon_info_circle);
        C1097070eef.LIZ(endIcon, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
        C786410Ut5.I7(new AkS66S0200000_29(this, endIcon, 5), endIcon);
        C19655911vJ editor = c19646111tj.getEditor();
        editor.setHint(C20467080b.LIZIZ(2131826635));
        editor.addTextChangedListener(new C19773412Ya(this, 17));
        TuxTextView inputEndAction = c19646111tj.getInputEndAction();
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, inputEndAction.getContext());
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(10));
        inputEndAction.setBackground(gradientDrawable);
        C786410Ut5.I7(new AkS66S0200000_29(this, inputEndAction, 4), inputEndAction);
        this.LJIIL = c19646111tj;
        return viewTd;
    }

    @Override // X.AbstractC19644711tV
    public final void LJIIJ(Function0<Unit> function0) {
        C19646111tj c19646111tj;
        C1397510mTF c1397510mTF = this.LJIILIIL;
        if ((c1397510mTF == null || !c1397510mTF.LJIIIZ()) && (c19646111tj = this.LJIIL) != null) {
            LJIIJJI(c19646111tj, function0);
        }
    }

    public final void LJIIL(Object obj) {
        LJIILJJIL(((C19639611sg) obj).LIZ);
    }

    public final void LJIILJJIL(String str) {
        boolean z;
        C19655911vJ editor;
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIIIZZ = z;
        C19646111tj c19646111tj = this.LJIIL;
        if (c19646111tj != null && (editor = c19646111tj.getEditor()) != null) {
            editor.setText(str);
            editor.setSelection(str.length());
        }
    }

    public C19644911tX(String str, AwS395S0200000_29 awS395S0200000_29, AwS464S0200000_29 awS464S0200000_29, AwS573S0100000_29 awS573S0100000_29) {
        this.LJ = str;
        this.LJFF = awS395S0200000_29;
        this.LJI = awS464S0200000_29;
        this.LJII = awS573S0100000_29;
    }
}
