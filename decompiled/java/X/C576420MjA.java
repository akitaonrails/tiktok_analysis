package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576420MjA extends AbstractC1664490tPr<C576510MjJ, C576450MjD> {
    public AbstractC577050MkB LLJJJJLIIL;
    public int LLJJL;
    public View LLJL;
    public boolean LLJLIL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 752));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 753));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 750));
    public int LLJJLIIIJLLLLLLLZ = -1;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 751));

    public final C576370Mj5 LLLLLJIL() {
        return (C576370Mj5) this.LLJJJJJIL.getValue();
    }

    public final SurfaceView LLLLLJLJLL() {
        return (SurfaceView) this.LLJJJIL.getValue();
    }

    public final void LLLLLL() {
        ViewGroup viewGroup;
        View view = this.LLJL;
        if (view != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
        }
        LLLLLLIL(null);
        this.LLJJLIIIJLLLLLLLZ = -1;
    }

    public final void LLLLLLIL(View view) {
        boolean z;
        if (this.LLJL == null && view == null) {
            return;
        }
        this.LLJL = view;
        Function2<Boolean, Integer, Unit> function2 = LLLLIL().LJI;
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        function2.invoke(Boolean.valueOf(z), Integer.valueOf(this.LLJJLIIIJLLLLLLLZ));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1447470nlp.LIZIZ(LLLLLJLJLL(), C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
        LLLLLJLJLL().getHolder().addCallback(new SurfaceHolder.Callback() { // from class: X.0MjB
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                this.LL.LLLLIL().LIZ.invoke(surfaceHolder.getSurface());
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                this.LL.LLLLIL().LIZIZ.invoke();
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                this.LL.LLLLIL().LIZ.invoke(surfaceHolder.getSurface());
            }
        });
        LLLLLJLJLL().setZOrderOnTop(true);
        LLLLLJLJLL().setZOrderMediaOverlay(true);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0MjF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C576510MjJ) obj).LJIIJJI;
            }
        }, new AwS587S0100000_8(this, 472));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0MjH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C576510MjJ) obj).LJI;
            }
        }, new AwS587S0100000_8(this, 475));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0MjI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C576510MjJ) obj).LIZLLL;
            }
        }, new AwS587S0100000_8(this, 478));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0MjK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C576510MjJ) obj).LJ;
            }
        }, new AwS587S0100000_8(this, 480));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0MjL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C576510MjJ) obj).LJFF;
            }
        }, new AwS587S0100000_8(this, 486));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0MjM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C576510MjJ) obj).LJII;
            }
        }, new AwS587S0100000_8(this, 489));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0MjN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C576510MjJ) obj).LJIIIIZZ;
            }
        }, new AwS587S0100000_8(this, 492));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0MjO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C576510MjJ) obj).LJIIIZ;
            }
        }, new AwS587S0100000_8(this, 496));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0MjP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C576510MjJ) obj).LJIIJ;
            }
        }, new AwS587S0100000_8(this, 458));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0MjE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C576510MjJ) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 465));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0MjG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C576510MjJ) obj).LIZJ;
            }
        }, new AwS587S0100000_8(this, 468));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ad1, viewGroup, false);
    }
}
