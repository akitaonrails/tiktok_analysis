package X;

import Y.ACListenerS168S0100000_34;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS40S0310000_22;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1CzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248481CzW extends AbstractC1664490tPr<C1459370o51, C1461510o8T> {
    public ViewGroup LLJJJIL;
    public ViewGroup LLJJJJ;
    public C0GX9 LLJJJJJIL;
    public C0GX9 LLJJJJLIIL;
    public View LLJJL;
    public TextView LLJJLIIIJLLLLLLLZ;
    public TextView LLJL;
    public TuxIconView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public C1397510mTF LLJLL;
    public final C2248491CzX LLJLLIL;

    public final void LLLLLJLJLL() {
        C013C c013c = new C013C();
        c013c.element = true;
        new AwS578S0100000_34(c013c, 97);
        C0GX9 c0gx9 = this.LLJJJJLIIL;
        if (c0gx9 == null) {
            c0gx9 = null;
        }
        final int i = 0;
        SeekBar.OnSeekBarChangeListener c786820Utk = new SeekBar.OnSeekBarChangeListener(this, i) { // from class: X.1D11
            public final int $t;
            public Object l0;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                switch (this.$t) {
                    case 0:
                        onProgressChanged$0(this, seekBar, i2, z);
                        break;
                    case 1:
                        onProgressChanged$1(this, seekBar, i2, z);
                        break;
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                switch (this.$t) {
                    case 0:
                        onStartTrackingTouch$0(this, seekBar);
                        break;
                    case 1:
                        onStartTrackingTouch$1(this, seekBar);
                        break;
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                switch (this.$t) {
                    case 0:
                        onStopTrackingTouch$0(this, seekBar);
                        break;
                    case 1:
                        onStopTrackingTouch$1(this, seekBar);
                        break;
                }
            }

            {
                this.$t = i;
                this.l0 = this;
            }

            public static final void onStartTrackingTouch$0(C1D11 c1d11, SeekBar seekBar) {
                ((C0GX9) seekBar).LJI();
            }

            public static final void onStartTrackingTouch$1(C1D11 c1d11, SeekBar seekBar) {
                if (((C2248481CzW) c1d11.l0).LLLLLJIL(EnumC1461710o8n.VIDEO_VOICE)) {
                    ((C0GX9) seekBar).LJI();
                }
            }

            public static final void onStopTrackingTouch$0(C1D11 c1d11, SeekBar seekBar) {
                if (((C2248481CzW) c1d11.l0).LLLLLJIL(EnumC1461710o8n.MUSIC)) {
                    C0GX9 c0gx92 = (C0GX9) seekBar;
                    c0gx92.LJI();
                    ((C2248481CzW) c1d11.l0).LLLLIL().LJ.invoke(Integer.valueOf(c0gx92.getProgress()));
                }
            }

            public static final void onStopTrackingTouch$1(C1D11 c1d11, SeekBar seekBar) {
                if (((C2248481CzW) c1d11.l0).LLLLLJIL(EnumC1461710o8n.VIDEO_VOICE)) {
                    C0GX9 c0gx92 = (C0GX9) seekBar;
                    c0gx92.LJI();
                    ((C2248481CzW) c1d11.l0).LLLLIL().LIZLLL.invoke(Integer.valueOf(c0gx92.getProgress()));
                }
            }

            public static final void onProgressChanged$0(C1D11 c1d11, SeekBar seekBar, int i2, boolean z) {
                if (z && ((C2248481CzW) c1d11.l0).LLLLLJIL(EnumC1461710o8n.MUSIC)) {
                    ((C2248481CzW) c1d11.l0).LLLLIL().LIZIZ.invoke(Integer.valueOf(i2));
                }
            }

            public static final void onProgressChanged$1(C1D11 c1d11, SeekBar seekBar, int i2, boolean z) {
                if (z) {
                    if (((C2248481CzW) c1d11.l0).LLLLLJIL(EnumC1461710o8n.VIDEO_VOICE)) {
                        ((C2248481CzW) c1d11.l0).LLLLIL().LIZ.invoke(Integer.valueOf(i2));
                    }
                    ((C2248481CzW) c1d11.l0).LLLLLLIL();
                }
            }
        };
        if (C1848410yCV.LIZ) {
            c786820Utk = new C786820Utk(c786820Utk);
        }
        c0gx9.setOnSeekBarChangeListener(c786820Utk);
        C0GX9 c0gx92 = this.LLJJJJJIL;
        if (c0gx92 == null) {
            c0gx92 = null;
        }
        final int i2 = 1;
        SeekBar.OnSeekBarChangeListener c786820Utk2 = new SeekBar.OnSeekBarChangeListener(this, i2) { // from class: X.1D11
            public final int $t;
            public Object l0;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i22, boolean z) {
                switch (this.$t) {
                    case 0:
                        onProgressChanged$0(this, seekBar, i22, z);
                        break;
                    case 1:
                        onProgressChanged$1(this, seekBar, i22, z);
                        break;
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                switch (this.$t) {
                    case 0:
                        onStartTrackingTouch$0(this, seekBar);
                        break;
                    case 1:
                        onStartTrackingTouch$1(this, seekBar);
                        break;
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                switch (this.$t) {
                    case 0:
                        onStopTrackingTouch$0(this, seekBar);
                        break;
                    case 1:
                        onStopTrackingTouch$1(this, seekBar);
                        break;
                }
            }

            {
                this.$t = i2;
                this.l0 = this;
            }

            public static final void onStartTrackingTouch$0(C1D11 c1d11, SeekBar seekBar) {
                ((C0GX9) seekBar).LJI();
            }

            public static final void onStartTrackingTouch$1(C1D11 c1d11, SeekBar seekBar) {
                if (((C2248481CzW) c1d11.l0).LLLLLJIL(EnumC1461710o8n.VIDEO_VOICE)) {
                    ((C0GX9) seekBar).LJI();
                }
            }

            public static final void onStopTrackingTouch$0(C1D11 c1d11, SeekBar seekBar) {
                if (((C2248481CzW) c1d11.l0).LLLLLJIL(EnumC1461710o8n.MUSIC)) {
                    C0GX9 c0gx922 = (C0GX9) seekBar;
                    c0gx922.LJI();
                    ((C2248481CzW) c1d11.l0).LLLLIL().LJ.invoke(Integer.valueOf(c0gx922.getProgress()));
                }
            }

            public static final void onStopTrackingTouch$1(C1D11 c1d11, SeekBar seekBar) {
                if (((C2248481CzW) c1d11.l0).LLLLLJIL(EnumC1461710o8n.VIDEO_VOICE)) {
                    C0GX9 c0gx922 = (C0GX9) seekBar;
                    c0gx922.LJI();
                    ((C2248481CzW) c1d11.l0).LLLLIL().LIZLLL.invoke(Integer.valueOf(c0gx922.getProgress()));
                }
            }

            public static final void onProgressChanged$0(C1D11 c1d11, SeekBar seekBar, int i22, boolean z) {
                if (z && ((C2248481CzW) c1d11.l0).LLLLLJIL(EnumC1461710o8n.MUSIC)) {
                    ((C2248481CzW) c1d11.l0).LLLLIL().LIZIZ.invoke(Integer.valueOf(i22));
                }
            }

            public static final void onProgressChanged$1(C1D11 c1d11, SeekBar seekBar, int i22, boolean z) {
                if (z) {
                    if (((C2248481CzW) c1d11.l0).LLLLLJIL(EnumC1461710o8n.VIDEO_VOICE)) {
                        ((C2248481CzW) c1d11.l0).LLLLIL().LIZ.invoke(Integer.valueOf(i22));
                    }
                    ((C2248481CzW) c1d11.l0).LLLLLLIL();
                }
            }
        };
        if (C1848410yCV.LIZ) {
            c786820Utk2 = new C786820Utk(c786820Utk2);
        }
        c0gx92.setOnSeekBarChangeListener(c786820Utk2);
        View view = this.LLJJL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.I7(new ACListenerS168S0100000_34(this, 25), view);
        ViewGroup viewGroup = this.LLJJJIL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.K7(viewGroup, new ACListenerS168S0100000_34(this, 26));
        ViewGroup viewGroup2 = this.LLJJJJ;
        C786410Ut5.K7(viewGroup2 != null ? viewGroup2 : null, new View.OnClickListener() { // from class: X.1CzY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        });
        LLLLLL(EnumC1461710o8n.MUSIC);
        LLLLLL(EnumC1461710o8n.VIDEO_VOICE);
    }

    public final void LLLLLLIL() {
        C0GX9 c0gx9 = this.LLJJJJJIL;
        if (c0gx9 == null) {
            c0gx9 = null;
        }
        int iLIZ = C273400Ana.LIZ(c0gx9.getProgress());
        C0GX9 c0gx92 = this.LLJJJJLIIL;
        C0GX9 c0gx93 = c0gx92 != null ? c0gx92 : null;
        if (iLIZ <= 0) {
            iLIZ = -1;
        }
        c0gx93.setBottomDotProgress(iLIZ);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1CzX] */
    public C2248481CzW() {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(55));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
        this.LLJLLIL = new InterfaceC362610EJn() { // from class: X.1CzX
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i == 4) {
                    this.LL.LLLLIL().LIZJ.invoke("click_blank");
                    return true;
                }
                return false;
            }
        };
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.b8(this.LLJLLIL);
        }
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.b8(this.LLJLLIL);
            interfaceC524950KiLLIZ.kF(this.LLJLLIL);
        }
        C1397510mTF c1397510mTF = this.LLJLL;
        boolean z = false;
        if (c1397510mTF != null && c1397510mTF.LJIIIZ()) {
            z = true;
        }
        LLLLIL().LJIIIZ.invoke(Boolean.valueOf(z));
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        LLLLLJLJLL();
    }

    public final boolean LLLLLJIL(EnumC1461710o8n enumC1461710o8n) {
        if (!LLLLIL().LJII.invoke(EnumC1461520o8U.ENABLE_KEYFRAME).booleanValue()) {
            return true;
        }
        return !LLLLIL().LJI.invoke(enumC1461710o8n).booleanValue();
    }

    public final void LLLLLL(EnumC1461710o8n enumC1461710o8n) {
        C0GX9 c0gx9;
        int i = C1462890oAh.LIZ[enumC1461710o8n.ordinal()];
        if (i == 1 ? (c0gx9 = this.LLJJJJJIL) == null : !(i == 2 && (c0gx9 = this.LLJJJJLIIL) != null)) {
            c0gx9 = null;
        }
        if (LLLLIL().LJII.invoke(EnumC1461520o8U.ENABLE_KEYFRAME).booleanValue() && c0gx9 != null) {
            c0gx9.setInterceTouchEventCallBack(new AwS40S0310000_22(this, enumC1461710o8n, c0gx9, 4));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onActivityCreated(bundle);
        ViewGroup viewGroup = this.LLJJJJ;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        this.LLJJJJJIL = (C0GX9) viewGroup.findViewById(R.id.ujf);
        ViewGroup viewGroup3 = this.LLJJJJ;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        this.LLJJJJLIIL = (C0GX9) viewGroup3.findViewById(R.id.ujg);
        ViewGroup viewGroup4 = this.LLJJJJ;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.LLJJLIIIJLLLLLLLZ = (TextView) viewGroup4.findViewById(R.id.tv_people);
        ViewGroup viewGroup5 = this.LLJJJJ;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        this.LLJL = (TextView) viewGroup5.findViewById(R.id.tv_people2);
        ViewGroup viewGroup6 = this.LLJJJJ;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        this.LLJJL = viewGroup6.findViewById(R.id.lb_);
        ViewGroup viewGroup7 = this.LLJJJJ;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        this.LLJLIL = (TuxIconView) AnonymousClass1293.LIZ(R.id.jw6, viewGroup7);
        ViewGroup viewGroup8 = this.LLJJJJ;
        if (viewGroup8 == null) {
            viewGroup8 = null;
        }
        this.LLJLILLLLZIIL = (TuxIconView) AnonymousClass1293.LIZ(R.id.jvz, viewGroup8);
        C0GX9[] c0gx9Arr = new C0GX9[2];
        C0GX9 c0gx9 = this.LLJJJJJIL;
        if (c0gx9 == null) {
            c0gx9 = null;
        }
        c0gx9Arr[0] = c0gx9;
        C0GX9 c0gx92 = this.LLJJJJLIIL;
        if (c0gx92 == null) {
            c0gx92 = null;
        }
        c0gx9Arr[1] = c0gx92;
        List<C0GX9> listLJIIJJI = C1697810uHb.LJIIJJI(c0gx9Arr);
        if (C12DO.LIZ()) {
            if (C204644155u.LIZ(requireSceneContext())) {
                ViewGroup viewGroup9 = this.LLJJJJ;
                if (viewGroup9 == null) {
                    viewGroup9 = null;
                }
                viewGroup9.setBackgroundResource(R.drawable.a9e);
                for (C0GX9 c0gx93 : listLJIIJJI) {
                    c0gx93.setBackgroundColorRes(R.attr.a03);
                    c0gx93.setThumbColorRes(R.attr.a0p);
                    c0gx93.setThumbShadowColorRes(R.attr.zb);
                }
            }
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                ((C0GX9) it2.next()).setProgressColorRes(R.attr.a04);
            }
            Iterator it3 = listLJIIJJI.iterator();
            while (it3.hasNext()) {
                ((C0GX9) it3.next()).LLILLL.LJI = false;
            }
            for (TuxIconView tuxIconView : C1697810uHb.LJIIJJI(this.LLJLIL, this.LLJLILLLLZIIL)) {
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                }
            }
            TextView[] textViewArr = new TextView[2];
            TextView textView = this.LLJJLIIIJLLLLLLLZ;
            if (textView == null) {
                textView = null;
            }
            textViewArr[0] = textView;
            TextView textView2 = this.LLJL;
            if (textView2 == null) {
                textView2 = null;
            }
            textViewArr[1] = textView2;
            for (TextView textView3 : C1697810uHb.LJIIJJI(textViewArr)) {
                ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)));
                    C786410Ut5.g6(textView3, marginLayoutParams);
                }
            }
        }
        C0GX9 c0gx94 = this.LLJJJJJIL;
        if (c0gx94 == null) {
            c0gx94 = null;
        }
        c0gx94.setMax(200);
        C0GX9 c0gx95 = this.LLJJJJLIIL;
        if (c0gx95 == null) {
            c0gx95 = null;
        }
        c0gx95.setMax(200);
        C0GX9 c0gx96 = this.LLJJJJLIIL;
        if (c0gx96 == null) {
            c0gx96 = null;
        }
        c0gx96.setProgressSnapper(new AwS613S0100000_34(this, 57));
        LLLLLLIL();
        ViewGroup viewGroup10 = this.LLJJJIL;
        if (viewGroup10 != null) {
            viewGroup2 = viewGroup10;
        }
        C786410Ut5.K7(viewGroup2, new ACListenerS168S0100000_34(this, 24));
        LLLLLJLJLL();
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0o5A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1459370o51) obj).LJ);
            }
        }, Lifecycle.State.STARTED, new AwS613S0100000_34(this, 61));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0o5B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1459370o51) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS613S0100000_34(this, 62));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0o5D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1459370o51) obj).LJIIIZ;
            }
        }, new AwS587S0100000_8(this, 448));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0o59
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1459370o51) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS613S0100000_34(this, 56));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0o58
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1459370o51) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS613S0100000_34(this, 58));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0o5E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1459370o51) obj).LJII;
            }
        }, Lifecycle.State.STARTED, new AwS613S0100000_34(this, 59));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0o5F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1459370o51) obj).LJIIIIZZ;
            }
        }, Lifecycle.State.STARTED, new AwS613S0100000_34(this, 60));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (C204644155u.LIZ(requireSceneContext())) {
            setTheme(R.style.xm);
        } else {
            setTheme(R.style.y0);
        }
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.epg, viewGroup, false);
        this.LLJJJIL = viewGroup2;
        this.LLJJJJ = (ViewGroup) viewGroup2.findViewById(R.id.volume_layout);
        return viewGroup2;
    }
}
