package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent;

/* JADX INFO: renamed from: X.1BFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactByteSyncManager", f = "IMContactByteSyncManager.kt", l = {255, 261, 280}, m = "updateUserBizInfo")
public final class C2201721BFa extends AbstractC23140094w {
    public IMContactEvent LL;
    public IMUserBizInfo LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C2201761BFe LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2201721BFa(C2201761BFe c2201761BFe, InterfaceC1364105Vn<? super C2201721BFa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c2201761BFe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactByteSyncManager@a519.updateUserBizInfo$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILZLL.LJIIIIZZ(null, this);
        C1C7U.LIZIZ("IMContactByteSyncManager@a519.updateUserBizInfo$1");
        return objLJIIIIZZ;
    }
}
