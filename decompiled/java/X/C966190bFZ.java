package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.dataChannel.RustArchEnableEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966190bFZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966020bFI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966190bFZ(C966020bFI c966020bFI) {
        super(0);
        this.LL = c966020bFI;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1279800jPO interfaceC1279800jPO;
        C966020bFI c966020bFI = this.LL;
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if ((interfaceC965990bFF instanceof InterfaceC1279800jPO) && (interfaceC1279800jPO = (InterfaceC1279800jPO) interfaceC965990bFF) != null) {
            if (!c966020bFI.LIZIZ) {
                interfaceC1279800jPO.LLIIIILZ(LinkCoreError.Companion.getRTC_REINIT_ERROR());
            }
            interfaceC1279800jPO.LJLLI();
        }
        if (C952600ate.LIZ) {
            C966020bFI c966020bFI2 = this.LL;
            C1AZW.LIZIZ(c966020bFI2.LJJ, c966020bFI2.LJ, "DataChannelGlobal.postEvent(RustArchEnableEvent::class.java, (scene to false))", null, null);
            DataChannelGlobal.LLILZ.FQ2(RustArchEnableEvent.class, new Pair(Integer.valueOf(this.LL.LIZJ), Boolean.FALSE));
        }
        return Unit.LIZ;
    }
}
