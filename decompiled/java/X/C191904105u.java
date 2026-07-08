package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.105u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191904105u extends C104X {
    public final C191848103q LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    @Override // X.C104X
    public final boolean LJIILJJIL() {
        return true;
    }

    @Override // X.C104X
    public final boolean LJIILLIIL() {
        return false;
    }

    @Override // X.AbstractC191843103l
    public final void LJII() {
        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
        if (iFindCtxSettingService != null) {
            C191848103q c191848103q = this.LLILZIL;
            iFindCtxSettingService.LJIJ(c191848103q.LIZ, c191848103q.LIZJ, new C191906105w(this), new C191907105x(this));
            iFindCtxSettingService.LIZJ(this.LLILZIL.LIZJ, new AwS394S0200000_28(iFindCtxSettingService, this, 76));
        }
    }

    @Override // X.C104X
    public final boolean LJIILL() {
        return this.LLIZ;
    }

    @Override // X.C104X
    public final boolean LJIILIIL(boolean z) {
        return this.LLILZLL;
    }

    @Override // X.C104X
    public final boolean LJIIZILJ(boolean z) {
        if (C0XQ7.LJFF().isLogin() && z) {
            return true;
        }
        return false;
    }

    public final void LJIJJ(boolean z) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZIL.LIZJ), null, null, new C862060Xro(this, z, null), 3);
    }

    public final void LJIJJLI(int i) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZIL.LIZJ), null, null, new C862070Xrp(i, this, null), 3);
    }

    public C191904105u(C191848103q c191848103q, C107P c107p) {
        super(C104Y.LIZ(c107p.LIZ, new AwS607S0100000_28(c107p, 278)), c191848103q);
        this.LLILZIL = c191848103q;
    }

    @Override // X.C104X
    public final void LJIJ(int i, View view) {
        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
        if (iFindCtxSettingService != null) {
            C191848103q c191848103q = this.LLILZIL;
            iFindCtxSettingService.LJIIZILJ(c191848103q.LIZ, c191848103q.LIZJ, new AnonymousClass1060(this), new AnonymousClass1061(this));
        }
    }

    @Override // X.C104X
    public final void LJIJI(int i, View view) {
        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
        if (iFindCtxSettingService != null) {
            C191848103q c191848103q = this.LLILZIL;
            iFindCtxSettingService.LJIIZILJ(c191848103q.LIZ, c191848103q.LIZJ, new AnonymousClass1062(this), new AnonymousClass1063(this));
        }
    }
}
