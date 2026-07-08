package X;

import Y.ARunnableS132S0100000_32;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.188i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212354188i extends AbstractC21356318ht {
    public final C01GW LJIJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 845));

    @Override // X.AbstractC21356318ht
    public final void LIZLLL() {
        LJIIL(0);
    }

    @Override // X.AbstractC21356318ht
    public final InterfaceC212356188k LIZIZ() {
        return new InterfaceC212356188k() { // from class: X.188j
            @Override // X.InterfaceC212356188k
            public final void LJ(List<C1621190sI1> list, Map<C21356918hz, Integer> map) {
            }

            @Override // X.InterfaceC212356188k
            public final void LJFF(List<C1621190sI1> list) {
            }

            @Override // X.InterfaceC212356188k
            public final void LIZ() {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LIZ();
                }
            }

            @Override // X.InterfaceC212356188k
            public final void LIZIZ() {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LIZIZ();
                }
            }

            @Override // X.InterfaceC212356188k
            public final void LIZLLL() {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LIZLLL();
                }
            }

            @Override // X.InterfaceC212356188k
            public final void LJI() {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LJI();
                }
            }

            @Override // X.InterfaceC212356188k
            public final void LJIIL() {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LJIIL();
                }
                C212354188i c212354188i = this.LIZ;
                if (c212354188i.LJIIZILJ == null || !(!r0.LIZIZ)) {
                    return;
                }
                c212354188i.LJIIL(0);
            }

            @Override // X.InterfaceC212356188k
            public final void LIZJ(C21356918hz c21356918hz, C21355818ho c21355818ho) {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LIZJ(c21356918hz, c21355818ho);
                }
                C212354188i c212354188i = this.LIZ;
                if (c212354188i.LJIIZILJ != null && (!r0.LIZIZ)) {
                    c212354188i.LJIIL(1);
                }
            }
        };
    }

    @Override // X.AbstractC21356318ht
    public final void LIZJ() {
        ViewGroup viewGroup = this.LJIIIIZZ;
        if (viewGroup != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(viewGroup.getContext(), R.style.z4);
            if (ChangeImagePickerUIExperiment.isEnabled()) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(6.0f)));
                c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.zf, contextThemeWrapper);
                viewGroup.setBackground(c384050F3z.LIZ(contextThemeWrapper));
            } else {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(6.0f)));
                c384050F3z2.LIZ = C1308910kAL.LIZJ(R.attr.zh, contextThemeWrapper);
                viewGroup.setBackground(c384050F3z2.LIZ(contextThemeWrapper));
            }
        }
        TextView textView = (TextView) this.LJIJ.getValue();
        if (textView != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, new ContextThemeWrapper(textView.getContext(), R.style.z4));
            textView.setTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        }
    }

    @Override // X.AbstractC21356318ht
    public final void LJ() {
        ViewGroup viewGroup = this.LJIIIIZZ;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
    }

    @Override // X.AbstractC21356318ht
    public final void LJI(List<C1621190sI1> list) {
        LJIIL(list.size());
    }

    @Override // X.AbstractC21356318ht
    public final void LJIIIIZZ(String str) {
        int i = 0;
        if (ChangeImagePickerUIExperiment.isEnabled()) {
            if (this.LJIIZILJ != null && (!r0.LIZIZ)) {
                if (str == null || str.length() == 0) {
                    i = 1;
                }
                LJIIL(i ^ 1);
                return;
            }
            return;
        }
        if (str == null || str.length() == 0) {
            i = 1;
        }
        LJIIL(i ^ 1);
    }

    @Override // X.AbstractC21356318ht
    public final void LJIIIZ(int i) {
        if (ChangeImagePickerUIExperiment.isEnabled()) {
            LJIIL(i);
            ViewGroup viewGroup = this.LJIIIIZZ;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
                return;
            }
            return;
        }
        LJIIL(0);
        ViewGroup viewGroup2 = this.LJIIIIZZ;
        if (viewGroup2 == null) {
            return;
        }
        C786410Ut5.LJLZ(0, viewGroup2);
    }

    @Override // X.AbstractC21356318ht
    public final void LJIIJJI(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.LJIIIIZZ;
            if (viewGroup != null) {
                C21357918i9.LIZIZ(viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LJIIIIZZ;
        if (viewGroup2 == null) {
            return;
        }
        HandlerHook.viewPost(viewGroup2, new ARunnableS132S0100000_32(this, 101));
    }

    public final void LJIIL(int i) {
        int i2;
        C1624230sMv c1624230sMv = this.LJIIZILJ;
        if (c1624230sMv == null || (i2 = c1624230sMv.LIZLLL) <= 0) {
            i2 = 1;
        }
        TextView textView = (TextView) this.LJIJ.getValue();
        if (textView != null) {
            textView.setText(C786410Ut5.j4("%d / %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2)));
        }
    }

    @Override // X.AbstractC21356318ht
    public final void LJFF(C21356918hz c21356918hz, List list, Map map) {
        InterfaceC212356188k interfaceC212356188k = this.LIZLLL;
        if (interfaceC212356188k != null) {
            interfaceC212356188k.LJ(list, map);
        }
        LJIIL(list.size());
    }
}
