package X;

import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0J8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487250J8x implements C0J9E {
    public final Context LIZ;
    public C0P0T LIZIZ;
    public View LIZJ;
    public final View LIZLLL;
    public final ArrayList<InterfaceC482890Iwh> LJ = new ArrayList<>();

    @Override // X.C0J9E
    public final void LLZZ() {
        C0P0T c0p0t = this.LIZIZ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        TuxIconView tuxIconView = (TuxIconView) this.LIZLLL.findViewById(R.id.z0a);
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.LIZLLL.findViewById(R.id.z0b);
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
    }

    @Override // X.C0J9E
    public final boolean isShowing() {
        C0P0T c0p0t = this.LIZIZ;
        if (c0p0t != null) {
            return c0p0t.isShowing();
        }
        return false;
    }

    public C487250J8x(C19EG c19eg) {
        this.LIZ = c19eg;
        this.LIZLLL = C786410Ut5.Sd(R.layout.dj_, C786410Ut5.ne(c19eg), null);
    }

    @Override // X.C0J9E
    public final void LIZ(int i, int i2) {
        int iLIZ;
        View view = this.LIZJ;
        if (view != null) {
            int[] iArr = {0, 0};
            if (view instanceof TextView) {
                float fLIZIZ = (C0HCL.LIZIZ(r7.getMeasuredHeight(), this.LIZ) - C0HCL.LIZIZ(((TextView) view).getTextSize(), this.LIZ)) / 2;
                int i3 = iArr[1];
                if (fLIZIZ < 8.0f) {
                    iLIZ = C0HCL.LIZ(8 - fLIZIZ, this.LIZ);
                } else {
                    iLIZ = -C0HCL.LIZ(fLIZIZ - 8, this.LIZ);
                }
                iArr[1] = i3 + iLIZ;
            } else {
                iArr[1] = iArr[1] + C0HCL.LIZ(8.0f, this.LIZ);
            }
            C1391550mJd c1391550mJd = new C1391550mJd(this.LIZ);
            c1391550mJd.LLILLJJLI.LIZIZ = view;
            c1391550mJd.LJIIIIZZ(iArr[0] + i, iArr[1] + i2);
            EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.BOTTOM;
            C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
            c1391600mJi.LIZLLL = enumC1235690iGF;
            c1391600mJi.LJIIZILJ = this.LIZLLL;
            c1391550mJd.LJII(R.attr.e4);
            C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
            c1391600mJi2.LJII = 5600L;
            c1391600mJi2.LJIJJ = false;
            C1905770zh1.LIZJ(c1391550mJd, "live_following", true, new ACListenerS142S0100000_7(this, 326));
            EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.FOLLOWING;
            C1905770zh1.LIZIZ(c1391550mJd, "live_following", enumC1584360rKc, new AwS551S0100000_7(this, 819));
            C1905770zh1.LIZ(c1391550mJd, "live_following", enumC1584360rKc, new AwS586S0100000_7(this, 584));
            this.LIZIZ = c1391550mJd.LIZIZ();
        }
        if (C295090BhT.LIZ()) {
            C1905750zgz.LIZIZ.LJFF(new C1619360sF4("live_following", null, EnumC1584360rKc.FOLLOWING, true, Mp4ScreenVideoLoadTimeout.CONTROL, EnumC1619300sEy.SWITCH_TAB, this.LIZIZ, null, 130), null);
            return;
        }
        C1905750zgz.LIZIZ.LJIIIZ(this.LIZIZ, "live_following");
        C0P0T c0p0t = this.LIZIZ;
        if (c0p0t == null) {
            return;
        }
        c0p0t.show();
    }
}
