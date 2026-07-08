package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Zv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915070Zv7 extends C09AY implements Function1<MultiLiveAnchorPanelSettings, Unit> {
    public final /* synthetic */ MultiLiveAnchorPanelSettings LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C915070Zv7(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, Function0<Unit> function0) {
        super(1);
        this.LL = multiLiveAnchorPanelSettings;
        this.LLILLJJLI = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ != null) {
            multiGuestDataHolderLIZJ.LJJ(MultiLiveAnchorPanelSettings.LIZ(this.LL, 0, 0, 0, 8388607));
        }
        this.LLILLJJLI.invoke();
        return Unit.LIZ;
    }
}
