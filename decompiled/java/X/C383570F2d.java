package X;

import Y.ACListenerS140S0100000_5;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383570F2d extends AbstractC1664490tPr<C0EZ5, C378790EtB> {
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public C21411818qq LLJLL;
    public View LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public View LLJZIJLIL;
    public View LLL;
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 624));

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        List<TextStickerModel> listOo1;
        EnumC363350EMj enumC363350EMj;
        C1914207ee c1914207ee;
        String str;
        boolean zBooleanValue;
        TextStickerCompatModel compatModel;
        Boolean showPunctuation;
        super.onActivityCreated(bundle);
        View view = this.LLJJJJ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 71), view);
        }
        View view2 = this.LLJJJJJIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 72), view2);
        }
        View view3 = this.LLJJL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 73), view3);
        }
        View view4 = this.LLJJJJLIIL;
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 74), view4);
        }
        C21411818qq c21411818qq = this.LLJLL;
        if (c21411818qq != null) {
            C786410Ut5.f9(c21411818qq, new ACListenerS140S0100000_5(this, 75));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F2e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0EZ5) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 551));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EZ6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EZ5) obj).LIZLLL;
            }
        }, new AwS584S0100000_5(this, 552));
        C0EJ3 c0ej3LJIIIZ = ((C0ERA) this.LLLF.getValue()).LJIIIZ();
        if (c0ej3LJIIIZ == null || (listOo1 = c0ej3LJIIIZ.Oo1()) == null) {
            listOo1 = C13BV.INSTANCE;
        }
        TextStickerModel textStickerModel = (TextStickerModel) C13LP.LJJJLL(listOo1);
        C21411818qq c21411818qq2 = this.LLJLL;
        if (c21411818qq2 != null) {
            if (textStickerModel != null && (compatModel = textStickerModel.getCompatModel()) != null && (showPunctuation = compatModel.getShowPunctuation()) != null) {
                zBooleanValue = showPunctuation.booleanValue();
            } else {
                zBooleanValue = true;
            }
            c21411818qq2.setChecked(zBooleanValue);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listOo1, 10));
        Iterator<TextStickerModel> it2 = listOo1.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getCompatModel().getCapitalizationState());
        }
        if (!arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (it3.next() != C13LP.LJJJJZI(arrayList)) {
                        enumC363350EMj = EnumC363350EMj.NONE;
                        break;
                    }
                }
            }
            enumC363350EMj = (EnumC363350EMj) C13LP.LJJJJZI(arrayList);
        } else {
            enumC363350EMj = EnumC363350EMj.NONE;
            break;
        }
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(this.mView.getContext().getString(2131834021));
        }
        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(this.mView.getContext().getString(2131834022));
        }
        C0ERA c0era = (C0ERA) this.LLLF.getValue();
        if (c0era != null && (c1914207ee = c0era.LLJIJIL) != null && (str = c1914207ee.LIZJ) != null) {
            if (C13LP.LJJJJ(C371890Ei3.LIZIZ(str), C0FE6.LIZ())) {
                View view5 = this.LLJJJIL;
                if (view5 != null) {
                    C786410Ut5.T4(view5, 0.34f);
                }
                View view6 = this.LLJJJJJIL;
                if (view6 != null) {
                    view6.setClickable(false);
                }
                View view7 = this.LLJJL;
                if (view7 != null) {
                    view7.setClickable(false);
                }
                View view8 = this.LLJJJJ;
                if (view8 != null) {
                    view8.setClickable(false);
                }
                View view9 = this.LLJJJJLIIL;
                if (view9 != null) {
                    view9.setClickable(false);
                }
                enumC363350EMj = EnumC363350EMj.NONE;
            } else {
                View view10 = this.LLJJJIL;
                if (view10 != null) {
                    C786410Ut5.T4(view10, 1.0f);
                }
                View view11 = this.LLJJJJJIL;
                if (view11 != null) {
                    view11.setClickable(true);
                }
                View view12 = this.LLJJL;
                if (view12 != null) {
                    view12.setClickable(true);
                }
                View view13 = this.LLJJJJ;
                if (view13 != null) {
                    view13.setClickable(true);
                }
                View view14 = this.LLJJJJLIIL;
                if (view14 != null) {
                    view14.setClickable(true);
                }
            }
            int i = C383560F2c.LIZ[enumC363350EMj.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            LLLLLJIL(null, null, AFwS191S0000000_5.get$arr$(175));
                            return;
                        } else {
                            LLLLLJIL(this.LLJJJJ, this.LLJLLIL, AFwS191S0000000_5.get$arr$(174));
                            return;
                        }
                    }
                    LLLLLJIL(this.LLJJJJLIIL, this.LLJZIJLIL, AFwS191S0000000_5.get$arr$(173));
                    return;
                }
                LLLLLJIL(this.LLJJL, this.LLJZ, AFwS191S0000000_5.get$arr$(172));
                return;
            }
            LLLLLJIL(this.LLJJJJJIL, this.LLJLLL, AFwS191S0000000_5.get$arr$(171));
        }
    }

    public final void LLLLLJIL(View view, View view2, Function0<Unit> function0) {
        if (Intrinsics.LJFF(this.LLL, view)) {
            return;
        }
        View view3 = this.LLJLLIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(4, view3);
        }
        View view4 = this.LLJLLL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(4, view4);
        }
        View view5 = this.LLJZ;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(4, view5);
        }
        View view6 = this.LLJZIJLIL;
        if (view6 != null) {
            C786410Ut5.LJLLLLLL(4, view6);
        }
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        this.LLL = view;
        C01TT.LIZJ(new AwS549S0100000_5(function0, (Function0<Unit>) 625));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bzv, viewGroup, false);
        this.LLJJJIL = viewGroup2.findViewById(R.id.dbv);
        viewGroup2.findViewById(R.id.dbx);
        this.LLJJJJ = viewGroup2.findViewById(R.id.l1b);
        this.LLJJJJJIL = viewGroup2.findViewById(R.id.l12);
        this.LLJJL = viewGroup2.findViewById(R.id.l4g);
        this.LLJJJJLIIL = viewGroup2.findViewById(R.id.l13);
        viewGroup2.findViewById(R.id.z7w);
        viewGroup2.findViewById(R.id.tv_tt);
        viewGroup2.findViewById(R.id.z7x);
        this.LLJJLIIIJLLLLLLLZ = viewGroup2.findViewById(R.id.dbw);
        this.LLJL = viewGroup2.findViewById(R.id.v_x);
        this.LLJLILLLLZIIL = (TuxTextView) viewGroup2.findViewById(R.id.v_z);
        this.LLJLIL = (TuxTextView) viewGroup2.findViewById(R.id.dby);
        this.LLJLL = (C21411818qq) viewGroup2.findViewById(R.id.wup);
        this.LLJLLIL = viewGroup2.findViewById(R.id.c99);
        this.LLJLLL = viewGroup2.findViewById(R.id.c97);
        this.LLJZ = viewGroup2.findViewById(R.id.c9b);
        this.LLJZIJLIL = viewGroup2.findViewById(R.id.c98);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.uk);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.zi);
        Drawable drawableLIZ = c384050F3z.LIZ(requireSceneContext());
        View view = this.LLJLLIL;
        if (view != null) {
            view.setBackground(drawableLIZ);
        }
        View view2 = this.LLJLLL;
        if (view2 != null) {
            view2.setBackground(drawableLIZ);
        }
        View view3 = this.LLJZ;
        if (view3 != null) {
            view3.setBackground(drawableLIZ);
        }
        View view4 = this.LLJZIJLIL;
        if (view4 != null) {
            view4.setBackground(drawableLIZ);
        }
        View view5 = this.LLJLLIL;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        View view6 = this.LLJLLL;
        if (view6 != null) {
            C786410Ut5.LJLLLLLL(4, view6);
        }
        View view7 = this.LLJZ;
        if (view7 != null) {
            C786410Ut5.LJLLLLLL(4, view7);
        }
        View view8 = this.LLJZIJLIL;
        if (view8 != null) {
            C786410Ut5.LJLLLLLL(4, view8);
        }
        this.LLL = this.LLJJJJ;
        return viewGroup2;
    }
}
