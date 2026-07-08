package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.userservice.api.IUserService;

/* JADX INFO: renamed from: X.0igr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252190igr implements InterfaceC736910SvR<InterfaceC1214350hhp> {
    public final IUserService LL;
    public final C1252180igq LLILLJJLI = new InterfaceC1214350hhp() { // from class: X.0igq
        @Override // X.InterfaceC1214350hhp
        public final C11NZ<BaseResponse> LIZLLL(String str, String str2) {
            return this.LL.LL.LIZLLL(str, str2);
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0igq] */
    public C1252190igr(IUserService iUserService) {
        this.LL = iUserService;
    }
}
