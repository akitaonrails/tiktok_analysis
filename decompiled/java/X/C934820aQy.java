package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C934820aQy extends C2217421BqW implements Function1<Integer, Unit> {
    public C934820aQy(Object obj) {
        super(1, obj, MultiLiveSettingDialog.class, "callUpdateAnchorPanelSettingsApi", "callUpdateAnchorPanelSettingsApi(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((MultiLiveSettingDialog) this.receiver).UR(num.intValue());
        return Unit.LIZ;
    }
}
