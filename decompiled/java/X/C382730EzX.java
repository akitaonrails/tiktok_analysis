package X;

import Y.ACListenerS140S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EzX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382730EzX extends AbstractC1664490tPr<C382680EzS, C382690EzT> {
    public C0P0T LLJJJIL;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 294));
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;

    public final void LLLLLJLJLL() {
        if (LLLLILI().LIZ.LJII) {
            LLLLIL().LIZLLL.invoke();
            if (LLLLIL().LIZJ.invoke().booleanValue()) {
                return;
            }
            EnumC382750EzZ enumC382750EzZ = LLLLILI().LIZ.LIZJ;
            View view = this.LLJJJJJIL;
            if (view != null) {
                C0HWQ c0hwq = new C0HWQ(this.mView.getContext());
                c0hwq.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240));
                List[] listArr = new List[1];
                C443090HZb[] c443090HZbArr = new C443090HZb[2];
                c443090HZbArr[0] = new C443090HZb(getString(2131825420), new AwS549S0100000_5(this, 295), R.raw.icon_ai_video, null, enumC382750EzZ == EnumC382750EzZ.VIDEO ? R.raw.icon_tick_fill_small : 0, null, 0, false, false, null, LSPassThroughRecordSizeConfig.DEFAULT);
                c443090HZbArr[1] = new C443090HZb(getString(2131825419), new AwS549S0100000_5(this, 296), R.raw.icon_ai_image, null, enumC382750EzZ == EnumC382750EzZ.IMAGE ? R.raw.icon_tick_fill_small : 0, null, 0, false, false, null, LSPassThroughRecordSizeConfig.DEFAULT);
                listArr[0] = C1697810uHb.LJIIJJI(c443090HZbArr);
                c0hwq.LJIIL(C1697810uHb.LJ(listArr));
                C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
                c1391600mJi.LIZIZ = view;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c1391600mJi.LJIIL = true;
                c1391600mJi.LJIIJ = 150L;
                c0hwq.LIZIZ().show();
            }
        }
    }

    public final boolean LLLLLL() {
        return C307460C3k.LIZIZ() && !LLLLILI().LIZ.LIZLLL;
    }

    public static final void LLLLLJIL(C382730EzX c382730EzX) {
        String string = c382730EzX.LLLLILI().LIZ.LJFF;
        TuxTextView tuxTextView = c382730EzX.LLJJL;
        if (tuxTextView != null) {
            if (string == null) {
                int i = C382740EzY.LIZ[c382730EzX.LLLLILI().LIZ.LIZJ.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        string = c382730EzX.getString(2131825419);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    string = c382730EzX.getString(2131825420);
                }
            }
            tuxTextView.setText(string);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        TuxTextView tuxTextView;
        super.onActivityCreated(bundle);
        if (LLLLLL()) {
            View viewFindViewById = findViewById(R.id.oiv);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            View viewRequireViewById = requireViewById(R.id.oix);
            C786410Ut5.LJLLLLLL(0, viewRequireViewById);
            this.LLJJJJLIIL = viewRequireViewById.findViewById(R.id.oiw);
            this.LLJJJJJIL = viewRequireViewById.findViewById(R.id.oix);
            this.LLJJL = (TuxTextView) viewRequireViewById.findViewById(R.id.oiz);
            this.LLJL = (TuxTextView) viewRequireViewById.findViewById(R.id.h_c);
            this.LLJJLIIIJLLLLLLLZ = (TuxIconView) viewRequireViewById.findViewById(R.id.clw);
        } else {
            View viewRequireViewById2 = requireViewById(R.id.oiv);
            this.LLJJJJJIL = viewRequireViewById2;
            this.LLJJJJLIIL = viewRequireViewById2;
            TuxTextView tuxTextView2 = null;
            if (viewRequireViewById2 != null) {
                tuxTextView = (TuxTextView) viewRequireViewById2.findViewById(R.id.oiz);
            } else {
                tuxTextView = null;
            }
            this.LLJJL = tuxTextView;
            View view = this.LLJJJJJIL;
            if (view != null) {
                tuxTextView2 = (TuxTextView) view.findViewById(R.id.h_c);
            }
            this.LLJL = tuxTextView2;
            this.LLJJLIIIJLLLLLLLZ = (TuxIconView) requireViewById(R.id.clw);
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLJJJJ.getValue();
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS140S0100000_5(this, 24));
        }
        View view2 = this.LLJJJJLIIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 25), view2);
        }
        TuxIconView tuxIconView2 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS140S0100000_5(this, 26));
        }
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0Ezf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382680EzS) obj).LIZJ;
            }
        }), new AwS584S0100000_5(this, 293));
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0Ezg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382680EzS) obj).LJFF;
            }
        }), new AwS584S0100000_5(this, 294));
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0Ezc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382680EzS) obj).LJI);
            }
        }), new AwS584S0100000_5(this, 295));
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0Ezb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382680EzS) obj).LJII);
            }
        }), new AwS584S0100000_5(this, 290));
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0Ezd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382680EzS) obj).LIZ;
            }
        }), new AwS584S0100000_5(this, 291));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Eze
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382680EzS) obj).LIZIZ;
            }
        }, new AwS584S0100000_5(this, 292));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c1p, viewGroup, false);
    }
}
