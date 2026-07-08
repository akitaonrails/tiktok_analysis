package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.00lW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C173200lW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PlaybookAnchorViewModel LL;
    public final /* synthetic */ List<Playbook> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C173200lW(PlaybookAnchorViewModel playbookAnchorViewModel, List<Playbook> list) {
        super(0);
        this.LL = playbookAnchorViewModel;
        this.LLILLJJLI = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LLJILJILJ.setValue(this.LLILLJJLI);
        this.LL.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set FavoritePlaybookList: ");
        sbLIZ.append(this.LLILLJJLI);
        C20441214yg.LIZIZ("PlaybookAnchorViewModel", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
