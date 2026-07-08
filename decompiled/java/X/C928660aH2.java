package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0aH2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C928660aH2 extends C2217421BqW implements Function2<String, String, Unit> {
    public C928660aH2(MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2) {
        super(2, multiLiveAsAnchorListDialogV2, MultiLiveAsAnchorListDialogV2.class, "onBannerClick", "onBannerClick(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        ((MultiLiveAsAnchorListDialogV2) this.receiver).LLIILZL(str, str2);
        return Unit.LIZ;
    }
}
