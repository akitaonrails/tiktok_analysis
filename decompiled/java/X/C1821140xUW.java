package X;

import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0xUW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821140xUW implements InterfaceC736910SvR<InterfaceC1821220xUe> {
    public final InterfaceC1103460eoy LL;
    public final UserService LLILLJJLI;
    public final C1821180xUa LLILLL;

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    public C1821140xUW() {
        InterfaceC1103460eoy interfaceC1103460eoyEi = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).ei();
        UserService userService = UserService.getInstance();
        this.LL = interfaceC1103460eoyEi;
        this.LLILLJJLI = userService;
        this.LLILLL = new C1821180xUa(this);
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLL;
    }
}
