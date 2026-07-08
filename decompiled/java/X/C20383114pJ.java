package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorDetailDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS575S0100000_31;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14pJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20383114pJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PlaybookAnchorDetailDialog LL;
    public final /* synthetic */ Playbook LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20383114pJ(PlaybookAnchorDetailDialog playbookAnchorDetailDialog, Playbook playbook, AwS575S0100000_31 awS575S0100000_31) {
        super(0);
        this.LL = playbookAnchorDetailDialog;
        this.LLILLJJLI = playbook;
        this.LLILLL = awS575S0100000_31;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        Function1<Long, Unit> function1;
        C20382814pG c20382814pG = this.LL.LLL;
        if (c20382814pG != null && (function1 = c20382814pG.LJIJJLI) != null) {
            function1.invoke(Long.valueOf(this.LLILLJJLI.playbookId));
        }
        if (C500260Jjc.LJJIL()) {
            C20382814pG c20382814pG2 = this.LL.LLL;
            if (C500260Jjc.LJJIJIL(c20382814pG2 != null ? Boolean.valueOf(c20382814pG2.LJIIIZ) : null)) {
                C766270U4b.LIZLLL(2131854097);
            }
            DataChannel dataChannel = this.LL.LLLFF;
            if (dataChannel != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) != null) {
                playbookAnchorServiceV2LIZIZ.LJIJI("previewStartPlaybook");
            }
        } else {
            C20382814pG c20382814pG3 = this.LL.LLL;
            if (C500260Jjc.LJJIJIL(c20382814pG3 != null ? Boolean.valueOf(c20382814pG3.LJIIIZ) : null)) {
                C766270U4b.LIZLLL(2131854099);
            }
        }
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
