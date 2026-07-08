package X;

import com.bytedance.android.live.liveinteract.api.event.ShowPlaybookPlayToolPage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aUF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936850aUF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C937020aUW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C936850aUF(C937020aUW c937020aUW) {
        super(0);
        this.LL = c937020aUW;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DataChannel dataChannel = this.LL.LL;
        if (dataChannel != null) {
            EnumC936670aTx enumC936670aTx = EnumC936670aTx.COUNT_DOWN_FOR_ALL;
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            dataChannel.LC0(ShowPlaybookPlayToolPage.class, new C936640aTu(enumC936670aTx, C978360bZC.LJ()));
        }
        return Unit.LIZ;
    }
}
