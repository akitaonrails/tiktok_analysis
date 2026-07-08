package X;

import com.ss.android.ugc.aweme.IMAiGroupShotServiceImpl;

/* JADX INFO: renamed from: X.0wVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.IMAiGroupShotServiceImpl", f = "IMAiGroupShotServiceImpl.kt", l = {40}, m = "checkRecentContactState")
public final class C1783460wVk extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ IMAiGroupShotServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783460wVk(IMAiGroupShotServiceImpl iMAiGroupShotServiceImpl, InterfaceC1364105Vn<? super C1783460wVk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = iMAiGroupShotServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMAiGroupShotServiceImpl@5e19.checkRecentContactState$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(this);
        C1C7U.LIZIZ("IMAiGroupShotServiceImpl@5e19.checkRecentContactState$1");
        return objLJ;
    }
}
