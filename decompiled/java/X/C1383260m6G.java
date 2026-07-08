package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;

/* JADX INFO: renamed from: X.0m6G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.share.ShareCheckEligibilityManager", f = "ShareCheckEligibilityManager.kt", l = {78}, m = "checkContactEligibility")
public final class C1383260m6G extends AbstractC23140094w {
    public IMContact LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1383240m6E LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1383260m6G(C1383240m6E c1383240m6E, InterfaceC1364105Vn<? super C1383260m6G> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1383240m6E;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareCheckEligibilityManager@2acc.checkContactEligibility$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("ShareCheckEligibilityManager@2acc.checkContactEligibility$1");
        return objLIZ;
    }
}
