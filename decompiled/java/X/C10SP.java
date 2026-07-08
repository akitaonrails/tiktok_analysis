package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.gp.newuser.DefaultNewUserDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;

/* JADX INFO: renamed from: X.10SP, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10SP implements INewUserDebugService {
    public static final C10SP LIZIZ = new C10SP();
    public final /* synthetic */ INewUserDebugService LIZ;

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final Integer LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final Integer LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final Integer LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final void LJ(int i, boolean z) {
        this.LIZ.LJ(i, z);
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final Boolean LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final void LJI(String str, String str2) {
        this.LIZ.LJI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final String LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final Integer LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final boolean LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final void LJIIJ() {
        this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final void LJIIJJI(String str, String str2) {
        this.LIZ.LJIIJJI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final boolean LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final Boolean LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final void LJIILJJIL(C2175508fh c2175508fh) {
        this.LIZ.LJIILJJIL(c2175508fh);
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final void LJIILL(String str) {
        this.LIZ.LJIILL(str);
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final void LJIILLIIL(String str, String str2, String str3) {
        this.LIZ.LJIILLIIL(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final void LJIIZILJ(String str, String str2) {
        this.LIZ.LJIIZILJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final String LJIJ() {
        return this.LIZ.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final int LJIJI() {
        return this.LIZ.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService
    public final boolean isOpen() {
        return this.LIZ.isOpen();
    }

    public C10SP() {
        INewUserDebugService iNewUserDebugService = (INewUserDebugService) PluggableExtentionKt.pluggableSpi$default(INewUserDebugService.class, false, false, false, 14, null);
        this.LIZ = iNewUserDebugService == null ? new DefaultNewUserDebugServiceImpl() : iNewUserDebugService;
    }
}
