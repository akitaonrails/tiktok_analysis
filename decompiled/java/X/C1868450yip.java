package X;

import com.bytedance.android.livesdk.game.model.BriefCreatorCode;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868450yip extends C09AY implements Function1<BriefGameTask, Boolean> {
    public final /* synthetic */ PartnershipGameOfflineMessage.OfflineGameInfo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1868450yip(PartnershipGameOfflineMessage.OfflineGameInfo offlineGameInfo) {
        super(1);
        this.LL = offlineGameInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(BriefGameTask briefGameTask) {
        boolean zLJFF;
        Long l;
        BriefGameTask briefGameTask2 = briefGameTask;
        String string = null;
        if (briefGameTask2.taskType == 4) {
            BriefCreatorCode briefCreatorCode = briefGameTask2.creatorCode;
            if (briefCreatorCode != null) {
                string = briefCreatorCode.activityId;
            }
            zLJFF = Intrinsics.LJFF(string, this.LL.taskId);
        } else {
            PartnershipTask partnershipTask = briefGameTask2.task;
            if (partnershipTask != null && (l = partnershipTask.id) != null) {
                string = l.toString();
            }
            zLJFF = Intrinsics.LJFF(string, this.LL.taskId);
        }
        return Boolean.valueOf(zLJFF);
    }
}
