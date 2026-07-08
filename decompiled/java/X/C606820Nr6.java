package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.hox.Hox;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.profilerec.ui.ProfileRecFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS459S0200000_24;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: renamed from: X.0Nr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC20647615qs("profile_intro_popup")
public final class C606820Nr6 extends C10GR {
    public final C19EG LL;
    public final boolean LLILLJJLI;
    public final Function2<Boolean, Boolean, Unit> LLILLL;
    public TuxPanel LLILZ;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 1;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        AwS623S0100000_9 awS623S0100000_9 = new AwS623S0100000_9(this, 142);
        ProfileRecFragment profileRecFragment = new ProfileRecFragment();
        profileRecFragment.LL = awS623S0100000_9;
        TuxPanel tuxPanel = new C439850HMp().LIZ;
        tuxPanel.LLILLJJLI = profileRecFragment;
        tuxPanel.LLIZLLLIL = false;
        tuxPanel.LLJ = true;
        tuxPanel.LLJI = true;
        tuxPanel.LLJIJIL = true;
        tuxPanel.LLILZIL = new C0P4S(this, 5);
        this.LLILZ = tuxPanel;
        if (Hox.LLJILJIL.LIZ(this.LL).KQ2("For You")) {
            TuxPanel tuxPanel2 = this.LLILZ;
            if (tuxPanel2 != null) {
                tuxPanel2.showNow(this.LL.getSupportFragmentManager(), null);
            }
        } else {
            Function2<Boolean, Boolean, Unit> function2 = this.LLILLL;
            if (function2 != null) {
                function2.invoke(null, Boolean.FALSE);
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C0NIW(null), 3);
    }

    public C606820Nr6(C19EG c19eg, boolean z, AwS459S0200000_24 awS459S0200000_24) {
        this.LL = c19eg;
        this.LLILLJJLI = z;
        this.LLILLL = awS459S0200000_24;
    }
}
