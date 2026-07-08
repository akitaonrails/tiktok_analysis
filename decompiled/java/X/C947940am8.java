package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookLayoutSettingDialogV3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0am8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947940am8 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ PlaybookLayoutSettingDialogV3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C947940am8(PlaybookLayoutSettingDialogV3 playbookLayoutSettingDialogV3) {
        super(1);
        this.LL = playbookLayoutSettingDialogV3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.FS();
        return Unit.LIZ;
    }
}
