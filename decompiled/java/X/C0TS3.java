package X;

import android.app.Dialog;
import android.content.Context;
import kotlin.jvm.internal.AwS378S0200000_12;

/* JADX INFO: renamed from: X.0TS3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@InterfaceC20647615qs("phone_login_error_hint_pop")
public final class C0TS3 extends AbstractC20660115st<Dialog> {
    public final C19EG LL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        C19EG c19eg = this.LL;
        return (c19eg == null || !(c19eg instanceof AbstractActivityC1237560iJG) || c19eg.isFinishing()) ? false : true;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        Context context = c688120Qyw.LIZ;
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI(context.getString(2131857417));
        c1397580mTM.LIZIZ(c688120Qyw.LIZ.getString(2131857416));
        C985403tE.LIZ(c1397580mTM, new AwS378S0200000_12(c688120Qyw, this, 5));
        c1397580mTM.LJII = false;
        return new C1397510mTF(c1397580mTM).LJ();
    }

    public C0TS3(InterfaceC20660615sy interfaceC20660615sy, C19EG c19eg) {
        super(interfaceC20660615sy);
        this.LL = c19eg;
    }
}
