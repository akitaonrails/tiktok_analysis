package X;

import com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission;

/* JADX INFO: renamed from: X.1BFW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactByteSyncManager", f = "IMContactByteSyncManager.kt", l = {132, 134, 135, 138, 139}, m = "updateSharePermission")
public final class C1BFW extends AbstractC23140094w {
    public SharePermission LL;
    public SharePermission LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C2201761BFe LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BFW(C2201761BFe c2201761BFe, InterfaceC1364105Vn<? super C1BFW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c2201761BFe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactByteSyncManager@a519.updateSharePermission$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZ.LJII(null, this);
        C1C7U.LIZIZ("IMContactByteSyncManager@a519.updateSharePermission$1");
        return objLJII;
    }
}
