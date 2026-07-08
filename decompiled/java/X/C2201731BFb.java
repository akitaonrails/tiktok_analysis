package X;

import com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo;

/* JADX INFO: renamed from: X.1BFb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactByteSyncManager", f = "IMContactByteSyncManager.kt", l = {318, 320, 323}, m = "updateIMUserProfileInfo")
public final class C2201731BFb extends AbstractC23140094w {
    public IMUserProfileInfo LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C2201761BFe LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2201731BFb(C2201761BFe c2201761BFe, InterfaceC1364105Vn<? super C2201731BFb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c2201761BFe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactByteSyncManager@a519.updateIMUserProfileInfo$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(null, this);
        C1C7U.LIZIZ("IMContactByteSyncManager@a519.updateIMUserProfileInfo$1");
        return objLJ;
    }
}
