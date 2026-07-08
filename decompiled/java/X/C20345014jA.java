package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorDetailDialog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14jA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20345014jA extends C09AY implements Function0<String> {
    public final /* synthetic */ PlaybookAnchorDetailDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20345014jA(PlaybookAnchorDetailDialog playbookAnchorDetailDialog) {
        super(0);
        this.LL = playbookAnchorDetailDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookAnchorDetailDialog_");
        sbLIZ.append(this.LL.hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
