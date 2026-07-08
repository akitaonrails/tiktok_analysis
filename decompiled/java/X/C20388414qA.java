package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14qA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20388414qA extends C09AY implements Function1<Unit, Unit> {
    public final /* synthetic */ PlaybookAnchorViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20388414qA(PlaybookAnchorViewModel playbookAnchorViewModel) {
        super(1);
        this.LL = playbookAnchorViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LL;
        playbookAnchorViewModel.IQ2(false, C20385714pj.LIZ(playbookAnchorViewModel), 0, false, true, null);
        return Unit.LIZ;
    }
}
