package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.PcsServiceBioFragmentV2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521290KcR extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ PcsServiceBioFragmentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C521290KcR(PcsServiceBioFragmentV2 pcsServiceBioFragmentV2) {
        super(1);
        this.LL = pcsServiceBioFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String strValueOf;
        PcsDialogAbility pcsDialogAbility;
        PcsServiceBioFragmentV2 pcsServiceBioFragmentV2 = this.LL;
        pcsServiceBioFragmentV2.getClass();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C521380Kca c521380Kca = pcsServiceBioFragmentV2.LLILLL;
        Long lValueOf = null;
        if (c521380Kca == null || (strValueOf = c521380Kca.LIZJ) == null || strValueOf.length() == 0) {
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            }
            strValueOf = String.valueOf(lValueOf);
        }
        if (Intrinsics.LJFF(str, strValueOf) && (pcsDialogAbility = (PcsDialogAbility) this.LL.LL.getValue()) != null) {
            pcsDialogAbility.cj0();
        }
        return Unit.LIZ;
    }
}
