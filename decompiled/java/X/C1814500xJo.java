package X;

import com.bytedance.android.live.broadcast.api.UpsertIntelligentBoardSuccessEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.IntelligentBoardSaveAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814500xJo extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ IntelligentBoardSaveAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814500xJo(IntelligentBoardSaveAssem intelligentBoardSaveAssem) {
        super(1);
        this.LL = intelligentBoardSaveAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.LLIZLLLIL = false;
        DataChannel dataChannel = this.LL.Go().LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.LC0(UpsertIntelligentBoardSuccessEvent.class, Boolean.FALSE);
        }
        DialogC19728412Gs dialogC19728412Gs = (DialogC19728412Gs) this.LL.LLJIJIL.getValue();
        if (dialogC19728412Gs != null) {
            C0FNV.LIZIZ(dialogC19728412Gs);
        }
        C0U4R c0u4r = new C0U4R();
        IntelligentBoardSaveAssem intelligentBoardSaveAssem = this.LL;
        c0u4r.LIZ = intelligentBoardSaveAssem.getContext();
        c0u4r.LIZIZ = C497740JfY.LJIJI(2131851181);
        c0u4r.LIZJ = "ttlive_aiBorads_goLive_boards_limitToast";
        c0u4r.LJII = intelligentBoardSaveAssem.Go().LLILLJJLI;
        c0u4r.LJFF = true;
        C766270U4b.LJIIJ(c0u4r);
        return Unit.LIZ;
    }
}
