package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookLayoutSettingDialogV3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0amB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947970amB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PlaybookLayoutSettingDialogV3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C947970amB(PlaybookLayoutSettingDialogV3 playbookLayoutSettingDialogV3) {
        super(0);
        this.LL = playbookLayoutSettingDialogV3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.show();
        return Unit.LIZ;
    }
}
