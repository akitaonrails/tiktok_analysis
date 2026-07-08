package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11zR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19681511zR extends AbstractC1664490tPr<C19680811zK, C19682211zY> implements C0F77 {
    public boolean LLJJJIL;
    public boolean LLJJJJJIL;
    public InterfaceC1631630sYr<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Boolean> LLJJJJLIIL;
    public final C0F76 LLJJJJ = new C0F76(this);
    public String LLJJL = "";

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        View view;
        View viewFindViewById;
        super.onPause();
        C386100FBw c386100FBw = LLLLILI().LIZ.LJ;
        if ((c386100FBw != null ? c386100FBw.LIZ : null) == EnumC371580EhY.SHOW || (view = this.mView) == null || (viewFindViewById = view.findViewById(R.id.grz)) == null) {
            return;
        }
        viewFindViewById.clearFocus();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        final C0FL4 c0fl4;
        TextView textView;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        View viewFindViewById5;
        FrameLayout frameLayout;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        super.onActivityCreated(bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11zN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19680811zK) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 138));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11zO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19680811zK) obj).LJFF;
            }
        }, new AwS608S0100000_29(this, 324));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11zS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19680811zK) obj).LJI;
            }
        }, new AwS608S0100000_29(this, 312));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11zL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19680811zK) obj).LJII;
            }
        }, new AwS608S0100000_29(this, 313));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11zM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19680811zK) obj).LJIIIIZZ;
            }
        }, new AwS608S0100000_29(this, 323));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11zP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19680811zK) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 136));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11zQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19680811zK) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 137));
        View view = this.mView;
        View viewFindViewById6 = null;
        if (view != null) {
            c0fl4 = (C0FL4) view.findViewById(R.id.grz);
        } else {
            c0fl4 = null;
        }
        TextWatcher textWatcher = new TextWatcher() { // from class: X.11zX
            public boolean LL;

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("afterTextChanged: ");
                sbLIZ.append((Object) editable);
                sbLIZ.append(", ");
                sbLIZ.append(false);
                sbLIZ.append(", ");
                sbLIZ.append(this.LL);
                C0F8J.LIZ("inspiration", C2188811AlT.LIZIZ(sbLIZ));
                if (this.LL) {
                    return;
                }
                C19681511zR c19681511zR = this.LLILLJJLI;
                if (!c19681511zR.LLJJJIL) {
                    c19681511zR.LLLLIL().LIZJ.invoke(String.valueOf(editable));
                }
                List<InterfaceC19682311zZ> list = this.LLILLJJLI.LLLLILI().LIZ.LJIIIZ;
                C19681511zR c19681511zR2 = this.LLILLJJLI;
                Iterator<InterfaceC19682311zZ> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(editable, c19681511zR2.LLJJJIL);
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.LL = false;
                this.LLILLJJLI.LLJJL = String.valueOf(charSequence);
                Iterator<InterfaceC19682311zZ> it2 = this.LLILLJJLI.LLLLILI().LIZ.LJIIIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onTextChanged(java.lang.CharSequence r9, int r10, int r11, int r12) {
                /*
                    Method dump skipped, instruction units count: 317
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19682111zX.onTextChanged(java.lang.CharSequence, int, int, int):void");
            }
        };
        if (c0fl4 != null) {
            c0fl4.addTextChangedListener(textWatcher);
        }
        View view2 = this.mView;
        if (view2 != null && (tuxIconView2 = (TuxIconView) view2.findViewById(R.id.gsk)) != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS163S0100000_29(this, 124));
        }
        View view3 = this.mView;
        if (view3 != null && (tuxIconView = (TuxIconView) view3.findViewById(R.id.gq6)) != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS163S0100000_29(this, 125));
        }
        View view4 = this.mView;
        if (view4 != null && (frameLayout = (FrameLayout) view4.findViewById(R.id.xog)) != null) {
            C786410Ut5.O7(frameLayout, new View.OnClickListener() { // from class: X.11zW
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                }
            });
        }
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            View view5 = this.mView;
            if (view5 != null && (viewFindViewById5 = view5.findViewById(R.id.xog)) != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
                c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(10));
                c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(10));
                viewFindViewById5.setBackground(c384050F3z.LIZ(sceneContext));
            }
            View view6 = this.mView;
            if (view6 != null) {
                textView = (TextView) view6.findViewById(R.id.grz);
            } else {
                textView = null;
            }
            if (textView != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
                textView.setBackground(c384050F3z2.LIZ(sceneContext));
                if (LLLLILI().LIZ.LJIIJ.LIZ) {
                    textView.setHint(sceneContext.getString(2131821598));
                }
            }
            if (C293810BfP.LIZ()) {
                View view7 = this.mView;
                if (view7 != null) {
                    viewFindViewById = view7.findViewById(R.id.kqx);
                } else {
                    viewFindViewById = null;
                }
                View view8 = this.mView;
                if (view8 != null) {
                    viewFindViewById2 = view8.findViewById(R.id.grz);
                } else {
                    viewFindViewById2 = null;
                }
                View view9 = this.mView;
                if (view9 != null) {
                    viewFindViewById3 = view9.findViewById(R.id.xo9);
                } else {
                    viewFindViewById3 = null;
                }
                View view10 = this.mView;
                if (view10 != null) {
                    viewFindViewById4 = view10.findViewById(R.id.gq6);
                } else {
                    viewFindViewById4 = null;
                }
                View view11 = this.mView;
                if (view11 != null) {
                    viewFindViewById6 = view11.findViewById(R.id.gsk);
                }
                if (viewFindViewById != null) {
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        C786410Ut5.W5(viewFindViewById, layoutParams);
                        C426750GoL.LJIIIZ(viewFindViewById, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 19);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                if (viewFindViewById2 != null) {
                    C426750GoL.LJIIIZ(viewFindViewById2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, false, 27);
                    C426750GoL.LJIIL(viewFindViewById2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 21);
                }
                if (viewFindViewById3 != null) {
                    ViewGroup.LayoutParams layoutParams2 = viewFindViewById3.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                        layoutParams2.height = -1;
                        C786410Ut5.W5(viewFindViewById3, layoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                if (viewFindViewById6 != null) {
                    C426750GoL.LJIIL(viewFindViewById6, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
                }
                if (viewFindViewById4 != null) {
                    C426750GoL.LJIIL(viewFindViewById4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
                }
            }
        }
    }

    @Override // X.C0F77
    public final void El(int i, boolean z) {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        EnumC371580EhY enumC371580EhY;
        TuxIconView tuxIconView3;
        TuxIconView tuxIconView4;
        int i2;
        C0FL4 c0fl4;
        int i3 = 0;
        this.LLJJJJJIL = false;
        View view = this.mView;
        if (view != null && (c0fl4 = (C0FL4) view.findViewById(R.id.grz)) != null) {
            c0fl4.setCursorVisible(z);
        }
        if (LLLLILI().LIZ.LJIIJ.LIZIZ) {
            View view2 = this.mView;
            if (view2 != null && (tuxIconView4 = (TuxIconView) view2.findViewById(R.id.gq6)) != null) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView4, i2);
            }
            View view3 = this.mView;
            if (view3 != null && (tuxIconView3 = (TuxIconView) view3.findViewById(R.id.gsk)) != null) {
                if (z) {
                    i3 = 8;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView3, i3);
            }
        } else {
            View view4 = this.mView;
            if (view4 != null && (tuxIconView2 = (TuxIconView) view4.findViewById(R.id.gq6)) != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
            View view5 = this.mView;
            if (view5 != null && (tuxIconView = (TuxIconView) view5.findViewById(R.id.gsk)) != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
        }
        Function1<C386100FBw, Unit> function1 = LLLLIL().LIZ;
        if (z) {
            enumC371580EhY = EnumC371580EhY.SHOW;
        } else {
            enumC371580EhY = EnumC371580EhY.HIDE;
        }
        function1.invoke(new C386100FBw(enumC371580EhY, i));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        setTheme(R.style.y0);
        if (C357780E0y.LIZ()) {
            i = R.layout.fal;
        } else {
            i = R.layout.fak;
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
