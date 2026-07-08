package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.services.IFindCtxSettingService;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.105v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191905105v extends C104X {
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
            iFindCtxSettingService.LJIIJJI(c191848103q.LIZ, c191848103q.LIZJ, new C191908105y(this), new C191909105z(this));
            iFindCtxSettingService.LJIIL(this.LLILZIL.LIZJ, new AwS394S0200000_28(iFindCtxSettingService, this, 77));
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
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZIL.LIZJ), null, null, new C862080Xrq(this, z, null), 3);
    }

    public final void LJIJJLI(int i) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZIL.LIZJ), null, null, new C862090Xrr(i, this, null), 3);
    }

    public C191905105v(C191848103q c191848103q, C107P c107p) {
        super(C104Y.LIZ(c107p.LIZ, new AwS607S0100000_28(c107p, 279)), c191848103q);
        this.LLILZIL = c191848103q;
    }

    @Override // X.C104X
    public final void LJIJ(int i, View view) {
        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
        if (iFindCtxSettingService != null) {
            C191848103q c191848103q = this.LLILZIL;
            iFindCtxSettingService.LJIJI(c191848103q.LIZ, c191848103q.LIZJ, new AnonymousClass1064(this), new AnonymousClass1065(this));
        }
    }

    @Override // X.C104X
    public final void LJIJI(int i, View view) {
        IFindCtxSettingService iFindCtxSettingService = (IFindCtxSettingService) PluggableExtentionKt.pluggableSpi$default(IFindCtxSettingService.class, false, false, false, 14, null);
        if (iFindCtxSettingService != null) {
            C191848103q c191848103q = this.LLILZIL;
            iFindCtxSettingService.LJIJI(c191848103q.LIZ, c191848103q.LIZJ, new AnonymousClass1066(this), new AnonymousClass1067(this));
        }
    }
}
