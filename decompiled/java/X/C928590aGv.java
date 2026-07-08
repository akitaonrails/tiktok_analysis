package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C928590aGv extends C2217421BqW implements Function0<Unit> {
    public C928590aGv(Object obj) {
        super(0, obj, MultiLiveAsAnchorListDialogV2.class, "closeMixModeMatchTips", "closeMixModeMatchTips()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) this.receiver;
        Iterator<?> it2 = multiLiveAsAnchorListDialogV2.LLLLIIIILLL.LL.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!(it2.next() instanceof C1174704if)) {
                i++;
            } else if (i >= 0) {
                C1117360fBO c1117360fBO = multiLiveAsAnchorListDialogV2.LLLLIIIILLL;
                C930320aJi.LJIILJJIL((C410901il) c1117360fBO.LL, i, c1117360fBO);
            }
        }
        return Unit.LIZ;
    }
}
