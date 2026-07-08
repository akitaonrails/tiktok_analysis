package X;

import com.bytedance.android.live.liveinteract.api.event.ShowPlaybookPlayToolPage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aUH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936870aUH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C937020aUW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C936870aUH(C937020aUW c937020aUW) {
        super(0);
        this.LL = c937020aUW;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LLILLL.xh();
        C937020aUW c937020aUW = this.LL;
        c937020aUW.getClass();
        C932160aMg.LJFF(EnumC936960aUQ.WALLPAPER, "click", EnumC937290aUx.MULTI_TOOL, false, 0);
        DataChannel dataChannel = c937020aUW.LL;
        if (dataChannel != null) {
            EnumC936670aTx enumC936670aTx = EnumC936670aTx.WALLPAPER;
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            dataChannel.LC0(ShowPlaybookPlayToolPage.class, new C936640aTu(enumC936670aTx, C978360bZC.LJ()));
        }
        return Unit.LIZ;
    }
}
