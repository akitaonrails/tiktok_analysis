package X;

import Y.ACListenerS165S0100000_31;
import Y.AObserverS233S0100000_31;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.setting.page.backgroundaudio.BGAudioViewModel;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15y6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20692415y6 extends C20692915yB {
    public final Fragment LLILZ;
    public final EnumC20692515y7 LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1526));

    @Override // X.AbstractC19318610i0
    public final AbstractC19293010ds LIZJ() {
        ((BGAudioViewModel) this.LLILZLL.getValue()).LLILLJJLI.observe(this.LLILZ.getViewLifecycleOwner(), new AObserverS233S0100000_31(this, 45));
        return super.LIZJ();
    }

    @Override // X.AbstractC19318610i0
    public final AbstractC19293010ds LIZLLL() {
        String string = this.LLILZ.getString(this.LLILZIL.getTitle());
        boolean z = ((BGAudioViewModel) this.LLILZLL.getValue()).LLILLJJLI.getValue() == this.LLILZIL.getPlayOrder();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = this.LLILZIL.getIcon();
        return new C20693415yG(z, string, c419910GdJ, null, new ACListenerS165S0100000_31(this, 212), 7146);
    }

    public C20692415y6(Fragment fragment, EnumC20692515y7 enumC20692515y7) {
        this.LLILZ = fragment;
        this.LLILZIL = enumC20692515y7;
    }
}
