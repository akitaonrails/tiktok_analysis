package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1368920lj8 implements InterfaceC1368960ljC {
    public final C1368870lj3 LL;
    public View LLIZ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 44));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 42));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 43));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 41));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 45));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(22));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 46));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 47));

    @Override // X.InterfaceC1368960ljC
    public void E3(SharePackage sharePackage) {
    }

    @Override // X.InterfaceC1364650lcF
    public void Ew(boolean z) {
    }

    @Override // X.InterfaceC1364650lcF
    public void N9(boolean z) {
    }

    @Override // X.InterfaceC1364650lcF
    public final void TU0(int i, boolean z) {
    }

    @Override // X.InterfaceC1364650lcF
    public void bd(boolean z) {
    }

    @Override // X.InterfaceC1368960ljC
    public void onCreate(Bundle bundle) {
    }

    @Override // X.InterfaceC1368960ljC
    public void onDestroy() {
    }

    @Override // X.InterfaceC1368960ljC
    public void onStart() {
    }

    @Override // X.InterfaceC1368960ljC
    public void onStop() {
    }

    @Override // X.InterfaceC1364650lcF
    public void z51(boolean z) {
    }

    public final Context LIZ() {
        return (Context) this.LLILLL.getValue();
    }

    public final Fragment LIZIZ() {
        return (Fragment) this.LLILZ.getValue();
    }

    public final C1368320liA LIZJ() {
        return (C1368320liA) this.LLILLJJLI.getValue();
    }

    public final ShareMoreViewModel LIZLLL() {
        return (ShareMoreViewModel) this.LLILZLL.getValue();
    }

    public final boolean LJ() {
        return ((Boolean) this.LLIZLLLIL.getValue()).booleanValue();
    }

    public AbstractC1368920lj8(C1368870lj3 c1368870lj3) {
        this.LL = c1368870lj3;
    }
}
