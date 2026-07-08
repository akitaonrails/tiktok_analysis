package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager;
import com.ss.android.ugc.aweme.relation.recuser.IRecUserService;
import java.util.List;

/* JADX INFO: renamed from: X.1EDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277891EDz implements IRecUserService {
    public static final C2277891EDz LIZIZ = new C2277891EDz();
    public final /* synthetic */ IRecUserService LIZ = (IRecUserService) ServiceManager.get().getService(IRecUserService.class);

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC302490BtP LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1337505Lh LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1072780e1U LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1603120ros LIZLLL(C19EG c19eg, Aweme aweme, LifecycleOwner lifecycleOwner) {
        return this.LIZ.LIZLLL(c19eg, aweme, lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final void LJ(String str) {
        this.LIZ.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final boolean LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1588500rRI LJI(Fragment fragment, String str, InterfaceC1264650j0x interfaceC1264650j0x) {
        return this.LIZ.LJI(fragment, str, interfaceC1264650j0x);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1264190j0D LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    @InterfaceC1294060jmO
    public final InterfaceC1263910izl LJIIIIZZ(EnumC1262370ixH enumC1262370ixH) {
        return this.LIZ.LJIIIIZZ(enumC1262370ixH);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1073440e2Y LJIIIZ(C19EG c19eg, Bundle bundle) {
        return this.LIZ.LJIIIZ(c19eg, bundle);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final IRecUserMonManager LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final List<InterfaceC800130Va7> LJIIJJI(boolean z) {
        return this.LIZ.LJIIJJI(z);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final void LJIIL(TuxTextView tuxTextView, User user, Aweme aweme) {
        this.LIZ.LJIIL(tuxTextView, user, aweme);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC800130Va7 LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1589370rSh LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC1056430db7 LJIILL() {
        return this.LIZ.LJIILL();
    }
}
