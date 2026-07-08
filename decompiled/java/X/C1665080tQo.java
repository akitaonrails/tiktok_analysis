package X;

import android.view.View;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.ComposeView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665080tQo implements InterfaceC1159800gHq {
    public final C05YD<InterfaceC1665180tQy> LL;
    public final Function1<Boolean, Unit> LLILLJJLI;
    public View LLILLL;
    public View LLILZ;

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        this.LLILLL = view.findViewById(R.id.mfz);
        this.LLILZ = view.findViewById(R.id.mfo);
        C1669670tYD.LJ((ComposeView) view.findViewById(R.id.eo9), EnumC1427810nG7.Dark, new C19719212De(2111979190, new AwS639S0100000_25(this, 103), true));
    }

    public C1665080tQo(C05YD c05yd, AwS604S0100000_25 awS604S0100000_25) {
        this.LL = c05yd;
        this.LLILLJJLI = awS604S0100000_25;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C323650CmR(this, null), 3);
    }

    public final void LIZ(InterfaceC1665180tQy interfaceC1665180tQy, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1667028560);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1665180tQy)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (!Intrinsics.LJFF(interfaceC1665180tQy, C1665160tQw.LIZ)) {
            if (interfaceC1665180tQy instanceof C1665070tQn) {
                C1665070tQn c1665070tQn = (C1665070tQn) interfaceC1665180tQy;
                C1666190tSb.LJI(c1665070tQn.LIZ, c.LJ(c.LIZIZ(InterfaceC1685750ty9.LIZ, 0.33f), 1.0f), c1665070tQn.LIZIZ, c1665070tQn.LIZJ, c1665070tQn.LIZLLL, c1665070tQn.LJ, c13zcLJIIJ, 48);
            } else {
                throw new C1954807lC();
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, interfaceC1665180tQy, i, 79);
        }
    }
}
