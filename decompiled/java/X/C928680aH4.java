package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aH4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C928680aH4 extends C2217421BqW implements Function1<Integer, Unit> {
    public C928680aH4(MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2) {
        super(1, multiLiveAsAnchorListDialogV2, MultiLiveAsAnchorListDialogV2.class, "onBannerClosed", "onBannerClosed(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((MultiLiveAsAnchorListDialogV2) this.receiver).LLIIZ(num.intValue());
        return Unit.LIZ;
    }
}
