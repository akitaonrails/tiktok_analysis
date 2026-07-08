package X;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiPanelManageGuestOptSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932260aMq extends AbstractC960470b6L<C929340aI8> {
    public final LifecycleOwner LL;
    public final InterfaceC302401Fe LLILLJJLI;
    public final InterfaceC932240aMo LLILLL;
    public final TextView LLILZ;
    public final LiveIconView LLILZIL;
    public final LiveIconView LLILZLL;
    public final LiveIconView LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        int i2;
        int iLIZJ;
        int i3;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LiveIconView liveIconView = this.LLIZ;
        int i4 = 8;
        if (this.LLJ) {
            C932160aMg.LIZJ("show", "microphone");
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLJJIJIL(liveIconView, i2);
        LiveIconView liveIconView2 = this.LLILZLL;
        if (this.LLIZLLLIL) {
            C932160aMg.LIZJ("show", "camera");
            i4 = 0;
        }
        C786410Ut5.LLJJIJIL(liveIconView2, i4);
        InterfaceC302401Fe interfaceC302401Fe = this.LLILLJJLI;
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
            iLIZJ = C921170a4x.LIZJ(abstractC928510aGnLIZ);
        } else {
            iLIZJ = 0;
        }
        this.LLILZ.setText(C497740JfY.LJIIL(2131755908, iLIZJ, Integer.valueOf(iLIZJ)));
        if (iLIZJ > 0) {
            i3 = R.attr.ewy;
        } else {
            i3 = R.attr.ewz;
        }
        int iLIZJ2 = C20736316Cj.LIZJ(i3, this.LLILZIL);
        this.LLILZIL.setIconTint(iLIZJ2);
        if (this.LLIZLLLIL) {
            this.LLILZLL.setIconTint(iLIZJ2);
        }
        if (this.LLJ) {
            this.LLIZ.setIconTint(iLIZJ2);
        }
        C500260Jjc.LJLIIIL(500L, this.LLILZIL, new AwS594S0100000_15(this, 58));
        C500260Jjc.LJLIIIL(500L, this.LLILZLL, new AwS594S0100000_15(this, 59));
        C500260Jjc.LJLIIIL(500L, this.LLIZ, new AwS594S0100000_15(this, 60));
    }

    public C932260aMq(View view, LifecycleOwner lifecycleOwner, InterfaceC302401Fe interfaceC302401Fe, InterfaceC932240aMo interfaceC932240aMo) {
        boolean z;
        super(view);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC302401Fe;
        this.LLILLL = interfaceC932240aMo;
        this.LLILZ = (TextView) view.findViewById(R.id.zgr);
        this.LLILZIL = (LiveIconView) view.findViewById(R.id.crh);
        this.LLILZLL = (LiveIconView) view.findViewById(R.id.cow);
        this.LLIZ = (LiveIconView) view.findViewById(R.id.cs8);
        int value = MultiPanelManageGuestOptSetting.INSTANCE.getValue();
        boolean zLIZLLL = C932270aMr.LIZLLL();
        boolean z2 = false;
        if (value >= 2 && zLIZLLL) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        if (value >= 1 && zLIZLLL) {
            z2 = true;
        }
        this.LLJ = z2;
    }
}
