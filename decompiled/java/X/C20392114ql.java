package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14ql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20392114ql extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC1821320xUo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20392114ql(AbstractC1821320xUo abstractC1821320xUo) {
        super(0);
        this.LL = abstractC1821320xUo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(null);
        if (c0utjPl1 != null) {
            Playbook playbook = ((C1821310xUn) this.LL).LIZ;
            long j = playbook.playbookId;
            PlaybookContent playbookContent = playbook.content;
            c0utjPl1.LJJIFFI(new C20382814pG(j, playbookContent != null ? playbookContent.playbookContentId : 0L, false, false, false, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -4), "one_stop_shop", new C915190ZvJ("one_stop_shop", false, 6), null, false);
        }
        return Unit.LIZ;
    }
}
