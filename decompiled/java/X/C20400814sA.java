package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookInteractivePolymerizationDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14sA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20400814sA extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PlaybookInteractivePolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20400814sA(PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog) {
        super(1);
        this.LL = playbookInteractivePolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog = this.LL;
            View view = playbookInteractivePolymerizationDialog.LLLI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            C500260Jjc.LJLJLJ(playbookInteractivePolymerizationDialog.LLLFFI, false);
        } else {
            PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog2 = this.LL;
            C500260Jjc.LJLJLJ(playbookInteractivePolymerizationDialog2.LLLFFI, true);
            View view2 = playbookInteractivePolymerizationDialog2.LLLI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        return Unit.LIZ;
    }
}
