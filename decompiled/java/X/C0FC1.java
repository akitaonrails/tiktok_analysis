package X;

import Y.ACListenerS140S0100000_5;
import Y.AObserverS209S0100000_5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FC1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FC1 extends AbstractC1664490tPr<C382490Ez9, C382540EzE> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 313));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 321));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 309));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 310));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 311));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 312));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 317));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 314));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 315));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 316));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 318));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 319));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 320));
    public final MutableLiveData<Set<String>> LLJZIJLIL = new MutableLiveData<>();

    public final C0I7D LLLLLJLJLL() {
        return (C0I7D) this.LLJJL.getValue();
    }

    public final void LLLLLL() {
        C0FOJ c0foj = (C0FOJ) this.LLJLLL.getValue();
        MutableLiveData<Set<String>> mutableLiveData = this.LLJZIJLIL;
        mutableLiveData.setValue(C08CX.INSTANCE);
        c0foj.setEvent(mutableLiveData);
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            List<? extends C0FC7> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C0FC6(sceneContext.getString(2131825470)), new C0FC8(sceneContext.getString(2131825459)), new C0FC8(sceneContext.getString(2131825458)), new C0FC8(sceneContext.getString(2131825460)), new C0FC6(sceneContext.getString(2131825471)), new C0FC8(sceneContext.getString(2131825467)), new C0FC8(sceneContext.getString(2131825462)), new C0FC8(sceneContext.getString(2131825466)), new C0FC8(sceneContext.getString(2131825464)), new C0FC8(sceneContext.getString(2131825465)), new C0FC8(sceneContext.getString(2131825461)), new C0FC8(sceneContext.getString(2131825463)), new C0FC6(sceneContext.getString(2131825469)));
            C0FOJ c0foj2 = (C0FOJ) this.LLJLLL.getValue();
            c0foj2.LIZJ();
            c0foj2.setData(listLJIILJJIL);
        }
    }

    public final void LLLLLJIL() {
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            KeyboardUtils.LIZ(sceneContext, LLLLLJLJLL());
        }
    }

    public final boolean LLLLLLIL() {
        List<String> list;
        String str = LLLLILI().LIZ.LJII;
        if ((str == null || str.length() <= 0) && ((list = LLLLILI().LIZ.LJIIIIZZ) == null || !(!list.isEmpty()))) {
            return false;
        }
        String str2 = LLLLILI().LIZ.LJII;
        return str2 == null || str2.length() <= 300;
    }

    public final void LLLLLLJ(boolean z) {
        C786410Ut5.LJLLLLLL(0, this.mView);
        if (z) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.LLJJJJJIL.getValue();
            C786410Ut5.jd(constraintLayout, C418440Gaw.LIZIZ(580));
            constraintLayout.animate().translationY(0.0f).setDuration(250L).setInterpolator(new C21388418n4()).start();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawableLIZ;
        super.onViewCreated(view, bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EzH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382490Ez9) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1016));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EzG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382490Ez9) obj).LIZJ;
            }
        }, new AwS584S0100000_5(this, 1009));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FBu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382490Ez9) obj).LIZLLL;
            }
        }, new AwS584S0100000_5(this, 1013));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FBv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382490Ez9) obj).LJ;
            }
        }, new AwS584S0100000_5(this, 1014));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EzI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382490Ez9) obj).LJFF;
            }
        }, new AwS584S0100000_5(this, 1015));
        this.LLJZIJLIL.observe(this, new AObserverS209S0100000_5(this, 182));
        C786410Ut5.Y7((ConstraintLayout) this.LLJZ.getValue(), new ACListenerS140S0100000_5(this, 139));
        C786410Ut5.Y7((ConstraintLayout) this.LLJL.getValue(), new ACListenerS140S0100000_5(this, 140));
        C786410Ut5.R7((LinearLayout) this.LLJJLIIIJLLLLLLLZ.getValue(), new ACListenerS140S0100000_5(this, 141));
        C786410Ut5.R7((LinearLayout) this.LLJJJIL.getValue(), new ACListenerS140S0100000_5(this, 142));
        C786410Ut5.Y7((ConstraintLayout) this.LLJJJJ.getValue(), new ACListenerS140S0100000_5(this, 143));
        View view2 = (View) this.LLJJJJJIL.getValue();
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(14));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(14));
            drawableLIZ = c384050F3z.LIZ(sceneContext);
        } else {
            drawableLIZ = null;
        }
        view2.setBackground(drawableLIZ);
        LLLLLL();
        C786410Ut5.U8((C197039127h) this.LLJLLIL.getValue(), new ACListenerS140S0100000_5(this, 144));
        C197039127h c197039127h = (C197039127h) this.LLJLLIL.getValue();
        c197039127h.setLoading(false);
        c197039127h.setClickable(true);
        boolean zLLLLLLIL = LLLLLLIL();
        C197039127h c197039127h2 = (C197039127h) this.LLJLLIL.getValue();
        c197039127h2.setEnabled(zLLLLLLIL);
        c197039127h2.setClickable(zLLLLLLIL);
        final ConstraintLayout constraintLayout = (ConstraintLayout) this.LLJJJJJIL.getValue();
        C14K9.LJIJJ(constraintLayout, new C0F76(new C0F77() { // from class: X.0FC2
            @Override // X.C0F77
            public final void El(int i, boolean z) {
                int height = ((View) this.LL.LLJJJJ.getValue()).getHeight();
                int height2 = ((View) this.LL.LLJJJIL.getValue()).getHeight();
                if (z && i != 0 && height != 0 && height2 != 0) {
                    constraintLayout.getLayoutParams().height = height + height2 + i;
                    constraintLayout.requestLayout();
                }
            }
        }));
        C0I7D c0i7dLLLLLJLJLL = LLLLLJLJLL();
        c0i7dLLLLLJLJLL.setImeOptions(6);
        c0i7dLLLLLJLJLL.setRawInputType(1);
        c0i7dLLLLLJLJLL.addTextChangedListener(new C0FX5(this, 3));
        c0i7dLLLLLJLJLL.setText("");
        c0i7dLLLLLJLJLL.setOnTouchListener(new View.OnTouchListener() { // from class: X.0FC3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                view3.getParent().requestDisallowInterceptTouchEvent(true);
                if ((motionEvent.getAction() & 255) == 1) {
                    view3.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        });
        c0i7dLLLLLJLJLL.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0FC4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 6) {
                    this.LL.LLLLLJIL();
                    return true;
                }
                return false;
            }
        });
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bze, viewGroup, false);
        C786410Ut5.LJLLLLLL(8, viewTd);
        return (ViewGroup) viewTd;
    }
}
