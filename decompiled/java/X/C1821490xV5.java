package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkFragment;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0xV5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821490xV5 extends C09AY implements InterfaceC1631620sYq<C03H5, Boolean, Boolean, Unit> {
    public final /* synthetic */ PcsThirdPartyLinkFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821490xV5(PcsThirdPartyLinkFragment pcsThirdPartyLinkFragment) {
        super(3);
        this.LL = pcsThirdPartyLinkFragment;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(C03H5 c03h5, Boolean bool, Boolean bool2) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C1821460xV2 c1821460xV2 = this.LL.LLILZIL;
        if (c1821460xV2 != null) {
            c1821460xV2.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2));
        }
        return Unit.LIZ;
    }
}
