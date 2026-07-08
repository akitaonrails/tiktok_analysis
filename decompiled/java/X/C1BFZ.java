package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;

/* JADX INFO: renamed from: X.1BFZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactByteSyncManager", f = "IMContactByteSyncManager.kt", l = {346, 350}, m = "checkLocalIMUser")
public final class C1BFZ extends AbstractC23140094w {
    public Object LL;
    public IMUserBaseInfo LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C2201761BFe LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BFZ(C2201761BFe c2201761BFe, InterfaceC1364105Vn<? super C1BFZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c2201761BFe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactByteSyncManager@a519.checkLocalIMUser$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, null, this);
        C1C7U.LIZIZ("IMContactByteSyncManager@a519.checkLocalIMUser$1");
        return objLIZ;
    }
}
