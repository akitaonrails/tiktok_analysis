package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14se, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20403814se extends C09AY implements Function2<List<? extends Playbook>, String, Unit> {
    public final /* synthetic */ PlaybookPolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20403814se(PlaybookPolymerizationDialog playbookPolymerizationDialog) {
        super(2);
        this.LL = playbookPolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends Playbook> list, String str) {
        PlaybookPolymerizationDialog playbookPolymerizationDialog = this.LL;
        playbookPolymerizationDialog.JS(str, list);
        return Unit.LIZ;
    }
}
