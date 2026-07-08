package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12TM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12TM extends AbstractC1664490tPr<C12TN, C12S2> {
    public int LLJJJIL = -1;
    public int LLJJJJ = -1;
    public int LLJJJJJIL = -1;
    public C0GX3 LLJJJJLIIL;
    public C0GX3 LLJJL;
    public C0GX3 LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public C1397510mTF LLJZ;

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        this.LLJJJIL = -1;
        this.LLJJJJ = -1;
        this.LLJJJJJIL = -1;
    }

    public final void LLLLLJLJLL() {
        C0GX3 c0gx3 = this.LLJJJJLIIL;
        if (c0gx3 == null) {
            c0gx3 = null;
        }
        int iLIZ = C273400Ana.LIZ(c0gx3.getProgress());
        C0GX3 c0gx32 = this.LLJJLIIIJLLLLLLLZ;
        C0GX3 c0gx33 = c0gx32 != null ? c0gx32 : null;
        if (iLIZ <= 0) {
            iLIZ = -1;
        }
        c0gx33.setBottomDotProgress(iLIZ);
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        int i = LLLLILI().LIZ.LIZ;
        if (this.LLJJJIL == -1) {
            this.LLJJJIL = i;
        }
        C0GX3 c0gx3 = this.LLJJJJLIIL;
        if (c0gx3 == null) {
            c0gx3 = null;
        }
        c0gx3.setProgress(i);
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        int i2 = LLLLILI().LIZ.LIZIZ;
        if (this.LLJJJJ == -1) {
            this.LLJJJJ = i2;
        }
        C0GX3 c0gx32 = this.LLJJLIIIJLLLLLLLZ;
        if (c0gx32 == null) {
            c0gx32 = null;
        }
        c0gx32.setProgress(i2);
        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(i2);
        sbLIZ2.append('%');
        tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
        int i3 = LLLLILI().LIZ.LIZJ;
        if (this.LLJJJJJIL == -1) {
            this.LLJJJJJIL = i3;
        }
        C0GX3 c0gx33 = this.LLJJL;
        if (c0gx33 == null) {
            c0gx33 = null;
        }
        c0gx33.setProgress(i3);
        TuxTextView tuxTextView3 = this.LLJLIL;
        TuxTextView tuxTextView4 = tuxTextView3 != null ? tuxTextView3 : null;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(i3);
        sbLIZ3.append('%');
        tuxTextView4.setText(C2188811AlT.LIZIZ(sbLIZ3));
        LLLLLJLJLL();
        LLLLLJIL(EnumC1461710o8n.VIDEO_VOICE);
        LLLLLJIL(EnumC1461710o8n.MUSIC);
        LLLLLJIL(EnumC1461710o8n.RECORDING);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLJIL(final X.EnumC1461710o8n r4) {
        /*
            r3 = this;
            int[] r1 = X.C19757212Ru.LIZ
            int r0 = r4.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L3a
            r0 = 2
            if (r1 == r0) goto L35
            r0 = 3
            if (r1 != r0) goto L3f
            X.0GX3 r2 = r3.LLJJL
            if (r2 != 0) goto L16
        L15:
            r2 = 0
        L16:
            java.lang.Object r0 = r3.LLLLIL()
            X.12S2 r0 = (X.C12S2) r0
            kotlin.jvm.functions.Function1<X.0o8U, java.lang.Boolean> r1 = r0.LJII
            X.0o8U r0 = X.EnumC1461520o8U.ENABLE_KEYFRAME
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            X.12SB r0 = new X.12SB
            r0.<init>()
            r2.setOnInterTouchListener(r0)
        L34:
            return
        L35:
            X.0GX3 r2 = r3.LLJJLIIIJLLLLLLLZ
            if (r2 != 0) goto L16
            goto L15
        L3a:
            X.0GX3 r2 = r3.LLJJJJLIIL
            if (r2 != 0) goto L16
            goto L15
        L3f:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12TM.LLLLLJIL(X.0o8n):void");
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bn);
        c384050F3z.LJIIIIZZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        c384050F3z.LJIIIZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        view.setBackground(c384050F3z.LIZ(requireSceneContext()));
        View viewRequireViewById = requireViewById(R.id.dat);
        View viewRequireViewById2 = requireViewById(R.id.g2z);
        C013C c013c = new C013C();
        c013c.element = true;
        C786410Ut5.I7(new AkS95S0100000_29(this, 37), viewRequireViewById2);
        this.LLJJJJLIIL = (C0GX3) requireViewById(R.id.pu0);
        this.LLJJL = (C0GX3) requireViewById(R.id.szx);
        this.LLJJLIIIJLLLLLLLZ = (C0GX3) requireViewById(R.id.oxf);
        TuxTextView tuxTextView = (TuxTextView) requireViewById(R.id.pu1);
        this.LLJL = tuxTextView;
        C0GX3 c0gx3 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C436180H8m.LIZIZ(tuxTextView);
        this.LLJLL = (TuxTextView) requireViewById(R.id.ptz);
        TuxTextView tuxTextView2 = (TuxTextView) requireViewById(R.id.szy);
        this.LLJLIL = tuxTextView2;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C436180H8m.LIZIZ(tuxTextView2);
        this.LLJLLIL = (TuxTextView) requireViewById(R.id.szw);
        TuxTextView tuxTextView3 = (TuxTextView) requireViewById(R.id.oxg);
        this.LLJLILLLLZIIL = tuxTextView3;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        C436180H8m.LIZIZ(tuxTextView3);
        this.LLJLLL = (TuxTextView) requireViewById(R.id.ou6);
        RelativeLayout relativeLayout = (RelativeLayout) requireViewById(R.id.owj);
        C0GX3 c0gx32 = this.LLJJLIIIJLLLLLLLZ;
        if (c0gx32 == null) {
            c0gx32 = null;
        }
        c0gx32.setProgressSnapper(new AwS608S0100000_29(this, 217));
        LLLLLJLJLL();
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12TW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12TN) obj).LIZLLL;
            }
        }, new AwS608S0100000_29(relativeLayout, 218));
        C0GX3 c0gx33 = this.LLJJJJLIIL;
        if (c0gx33 == null) {
            c0gx33 = null;
        }
        C786410Ut5.yb(c0gx33, new C12YM(this, 5));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12TQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C12TN) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 219));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12TX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12TN) obj).LJ;
            }
        }, new AwS608S0100000_29(this, 212));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12TV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12TN) obj).LJFF;
            }
        }, new AwS608S0100000_29(this, 213));
        C0GX3 c0gx34 = this.LLJJJJLIIL;
        if (c0gx34 == null) {
            c0gx34 = null;
        }
        c0gx34.setEnabled(true);
        C0GX3 c0gx35 = this.LLJJL;
        if (c0gx35 == null) {
            c0gx35 = null;
        }
        c0gx35.setEnabled(true);
        new AwS573S0100000_29(c013c, 266);
        C0GX3 c0gx36 = this.LLJJLIIIJLLLLLLLZ;
        if (c0gx36 == null) {
            c0gx36 = null;
        }
        C786410Ut5.yb(c0gx36, new C12YM(this, 3));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12TO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C12TN) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 214));
        C0GX3 c0gx37 = this.LLJJL;
        if (c0gx37 != null) {
            c0gx3 = c0gx37;
        }
        C786410Ut5.yb(c0gx3, new C12YM(this, 4));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12TP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C12TN) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 215));
        C786410Ut5.I7(new AkS95S0100000_29(this, 38), viewRequireViewById);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12TY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12TN) obj).LJI;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 216));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eny, viewGroup, false);
    }
}
