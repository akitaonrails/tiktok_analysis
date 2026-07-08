package X;

import Y.ACListenerS116S0200000_12;
import Y.ACListenerS147S0100000_12;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS413S0200000_12;

/* JADX INFO: renamed from: X.0Tm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756540Tm0 extends AbstractC756550Tm1 {
    public C197039127h LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public C23237098p LJ;

    @Override // X.InterfaceC773410UVn
    public final void LJLJL() {
    }

    @Override // X.InterfaceC773410UVn
    public final void LLLZI() {
    }

    @Override // X.InterfaceC773410UVn
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC773410UVn
    public final void onHide() {
        AnonymousClass0956 anonymousClass0956;
        C197039127h c197039127h = this.LIZIZ;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, null);
        }
        View view = this.LIZJ;
        if (view != null) {
            C786410Ut5.I7(null, view);
        }
        C23237098p c23237098p = this.LJ;
        if (c23237098p == null || (anonymousClass0956 = c23237098p.LLJJJJJIL) == null || !anonymousClass0956.isActive()) {
            return;
        }
        AnonymousClass0956 anonymousClass09562 = c23237098p.LLJJJJJIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        c23237098p.LLJJJJJIL = null;
    }

    @Override // X.InterfaceC773410UVn
    public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
        Object obj;
        C756480Tlu c756480Tlu;
        Function1 function1;
        Function0 function0;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        C197039127h c197039127h;
        View view2;
        if (map != null) {
            obj = map.get("cardContentProvider");
        } else {
            obj = null;
        }
        if ((obj instanceof C756480Tlu) && (c756480Tlu = (C756480Tlu) obj) != null) {
            Object obj2 = map.get("cardDismissBlock");
            if (C19719512Dh.LJFF(1, obj2)) {
                function1 = (Function1) obj2;
            } else {
                function1 = null;
            }
            Object obj3 = map.get("cardCtaNavigateBlock");
            if (C19719512Dh.LJFF(0, obj3)) {
                function0 = (Function0) obj3;
            } else {
                function0 = null;
            }
            View viewFindViewById = view.findViewById(R.id.n1m);
            if (viewFindViewById == null || (tuxTextView = (TuxTextView) view.findViewById(R.id.n1n)) == null || (tuxTextView2 = (TuxTextView) view.findViewById(R.id.n1l)) == null || (c197039127h = (C197039127h) view.findViewById(R.id.n1k)) == null) {
                return;
            }
            this.LIZIZ = c197039127h;
            View viewFindViewById2 = view.findViewById(R.id.n1i);
            if (viewFindViewById2 == null) {
                return;
            }
            this.LIZJ = viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.n1j);
            if (viewFindViewById3 == null) {
                return;
            }
            this.LIZLLL = viewFindViewById3;
            C23237098p c23237098p = (C23237098p) view.findViewById(R.id.n1g);
            if (c23237098p == null) {
                return;
            }
            this.LJ = c23237098p;
            int i = C756460Tls.LIZ[c756480Tlu.LIZ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                    View view3 = this.LIZLLL;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
                View view4 = this.LIZJ;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(0, view4);
                }
                C197039127h c197039127h2 = this.LIZIZ;
                if (c197039127h2 != null) {
                    C786410Ut5.LLLLLLJ(c197039127h2, 0);
                }
            }
            tuxTextView.setTuxFont(92);
            tuxTextView.setText(c756480Tlu.LIZJ);
            tuxTextView2.setTuxFont(62);
            tuxTextView2.setText(c756480Tlu.LIZLLL);
            C197039127h c197039127h3 = this.LIZIZ;
            if (c197039127h3 != null && c197039127h3.getVisibility() == 0) {
                c197039127h3.setButtonSize(0);
                c197039127h3.setButtonVariant(0);
                c197039127h3.setTuxFont(72);
                C786410Ut5.U8(c197039127h3, new ACListenerS116S0200000_12(function0, this, 92));
                c197039127h3.setText(c756480Tlu.LJ);
            }
            View view5 = this.LIZJ;
            if (view5 != null && view5.getVisibility() == 0) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(function1, 407), view5);
            }
            C23237098p c23237098p2 = this.LJ;
            if (c23237098p2 != null && (view2 = this.LIZLLL) != null && view2.getVisibility() == 0) {
                c23237098p2.setTuxFont(91);
                long j = c756480Tlu.LIZIZ;
                AwS413S0200000_12 awS413S0200000_12 = new AwS413S0200000_12(this, (C756540Tm0) function1, (Function1<? super Boolean, Unit>) 61);
                if (j > 0) {
                    AnonymousClass0956 anonymousClass0956 = c23237098p2.LLJJJJJIL;
                    if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
                        return;
                    }
                    c23237098p2.LJJJJJ(j);
                    c23237098p2.LLJJJJJIL = C09IC.LJJI(c23237098p2.LLJJJJ, new C861640Xr8(new C347501Wn(c23237098p2, null), new C2325381G0q(new C347401Wm(awS413S0200000_12, c23237098p2, null), new C095D(new C347301Wl(1000L, j, null)), 0)));
                }
            }
        }
    }
}
