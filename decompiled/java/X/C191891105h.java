package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.105h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191891105h extends C104X {
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
            iFindCtxSettingService.LJIJJ(c191848103q.LIZ, c191848103q.LIZJ, new C191892105i(this), new C191895105l(this));
            iFindCtxSettingService.LJFF(this.LLILZIL.LIZJ, new AwS394S0200000_28(iFindCtxSettingService, this, 78));
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
        IFindCtxSettingService iFindCtxSettingService;
        if (!C0XQ7.LJFF().isLogin() || (iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null)) == null || !iFindCtxSettingService.LJIILLIIL() || !z) {
            return false;
        }
        return true;
    }

    public final void LJIJJ(boolean z) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZIL.LIZJ), null, null, new C862100Xrs(this, z, null), 3);
    }

    public final void LJIJJLI(int i) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZIL.LIZJ), null, null, new C862110Xrt(i, this, null), 3);
    }

    public C191891105h(C191848103q c191848103q, C107P c107p) {
        super(C104Y.LIZ(c107p.LIZ, new AwS607S0100000_28(c107p, 280)), c191848103q);
        this.LLILZIL = c191848103q;
    }

    @Override // X.C104X
    public final void LJIJ(int i, View view) {
        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
        if (iFindCtxSettingService != null) {
            C191848103q c191848103q = this.LLILZIL;
            iFindCtxSettingService.LJIIIIZZ(c191848103q.LIZ, c191848103q.LIZJ, new C191893105j(this), new C191896105m(this));
        }
    }

    @Override // X.C104X
    public final void LJIJI(int i, View view) {
        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
        if (iFindCtxSettingService != null) {
            C191848103q c191848103q = this.LLILZIL;
            iFindCtxSettingService.LJIIIIZZ(c191848103q.LIZ, c191848103q.LIZJ, new C191894105k(this), new C191897105n(this));
        }
    }
}
