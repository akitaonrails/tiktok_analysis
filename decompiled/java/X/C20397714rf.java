package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14rf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20397714rf extends C09AY implements Function1<Unit, Unit> {
    public final /* synthetic */ C20394514r9 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20397714rf(C20394514r9 c20394514r9) {
        super(1);
        this.LL = c20394514r9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        C20394514r9 c20394514r9 = this.LL;
        PlaybookAnchorViewModel playbookAnchorViewModel = c20394514r9.LLILLL;
        if (playbookAnchorViewModel != null) {
            c20394514r9.LIZJ(false, c20394514r9.LJ(), playbookAnchorViewModel.LLJJJJJIL.LJJIL(), false, null);
        }
        return Unit.LIZ;
    }
}
