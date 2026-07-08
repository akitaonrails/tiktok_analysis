package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.account.pin.PINApi;

/* JADX INFO: renamed from: X.0ttL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.pin.PINApi", f = "PINApi.kt", l = {31, LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "setPIN")
public final class C1682770ttL extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PINApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682770ttL(PINApi pINApi, InterfaceC1364105Vn<? super C1682770ttL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = pINApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PINApi@373e.setPIN$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, false, this);
        C1C7U.LIZIZ("PINApi@373e.setPIN$1");
        return objLIZ;
    }
}
