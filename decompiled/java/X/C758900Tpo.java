package X;

import Y.AcS353S0200000_12;
import android.content.Context;
import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Tpo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758900Tpo implements InterfaceC759380Tqa {
    @Override // X.InterfaceC759380Tqa
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC759380Tqa
    public final int getErrorCode() {
        return 206;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZIZ(C500840JkY c500840JkY, boolean z, C759360TqY c759360TqY) {
        CommercialContentToggle commercialContentToggle;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c759360TqY));
        C758920Tpq c758920Tpq = (C758920Tpq) DataChannelGlobal.LLILZ.gg0(ECBcToggleChannel.class);
        if (c758920Tpq != null && (commercialContentToggle = c758920Tpq.LIZIZ) != null && !C758060ToS.LIZ() && commercialContentToggle.openCommercialContentToggle && (commercialContentToggle.promoteMyself || commercialContentToggle.promoteThirdParty)) {
            Context context = c500840JkY.LIZ;
            C758060ToS.LIZIZ(c500840JkY.LIZIZ, "show");
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LJFF(R.drawable.eaz);
            c782110Um9.LJIIZILJ(2131841481);
            c782110Um9.LJII(2131841480);
            c782110Um9.LJIILIIL(2131841478, new AcS353S0200000_12(c23260099m, c500840JkY, 7));
            c782110Um9.LJIIJ(2131841479, new AcS353S0200000_12(c23260099m, c500840JkY, 8));
            c782110Um9.LJIILLIIL = false;
            C786410Ut5.E4(c782110Um9.LIZ());
            C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.f145u4;
            Boolean bool = Boolean.TRUE;
            c20337914i1.LJFF(bool);
            InterfaceC772390URp.LLZZLLIL.LJFF(bool);
        } else {
            C189200o6.m2constructorimpl(false);
            c23260099m.resumeWith(false);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c759360TqY);
        }
        return objLIZ;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZJ(C500840JkY c500840JkY, boolean z, C09AX c09ax) {
        return C759370TqZ.LIZ(this, c500840JkY, z, c09ax);
    }
}
