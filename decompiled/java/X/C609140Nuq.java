package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS31S0010000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nuq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609140Nuq extends C09AY implements Function2<QuickShareButtonAssem, C291001Au<? extends C570060MXk>, Unit> {
    public C609140Nuq() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(QuickShareButtonAssem quickShareButtonAssem, C291001Au<? extends C570060MXk> c291001Au) {
        C570060MXk c570060MXk;
        C570110MXp c570110MXp;
        EnumC609120Nuo enumC609120Nuo;
        QuickShareButtonAssem quickShareButtonAssem2 = quickShareButtonAssem;
        C291001Au<? extends C570060MXk> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (c570060MXk = (C570060MXk) c291001Au2.LIZ) != null && Intrinsics.LJFF(((VideoItemParams) C631370Opb.LIZ(quickShareButtonAssem2)).getAweme().getAid(), c570060MXk.LIZ)) {
            InterfaceC609180Nuu interfaceC609180Nuu = c570060MXk.LIZIZ;
            if ((interfaceC609180Nuu instanceof C570110MXp) && (c570110MXp = (C570110MXp) interfaceC609180Nuu) != null && (enumC609120Nuo = c570110MXp.LIZ) != null && C609130Nup.LIZ[enumC609120Nuo.ordinal()] == 1) {
                QuickShareVM quickShareVMGp = quickShareButtonAssem2.Gp();
                quickShareVMGp.getClass();
                quickShareVMGp.setStateImmediate(new AwS31S0010000_16(3));
            }
        }
        return Unit.LIZ;
    }
}
