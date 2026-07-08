package X;

import android.content.Context;
import com.bytedance.android.livesdk.goal.model.CommitV2Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0f9D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116010f9D extends C09AY implements Function1<CommitV2Response.Data, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1116000f9C LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1116010f9D(boolean z, C1116000f9C c1116000f9C, long j, Context context, String str) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = c1116000f9C;
        this.LLILLL = j;
        this.LLILZ = context;
        this.LLILZIL = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.bytedance.android.livesdk.goal.model.CommitV2Response.Data r13) {
        /*
            r12 = this;
            com.bytedance.android.livesdk.goal.model.CommitV2Response$Data r13 = (com.bytedance.android.livesdk.goal.model.CommitV2Response.Data) r13
            boolean r0 = r12.LL
            r4 = 0
            r9 = 1
            if (r0 == 0) goto L78
            X.0f9C r0 = r12.LLILLJJLI
            long r5 = r12.LLILLL
            r0.getClass()
            if (r13 == 0) goto L1f
            java.util.List<com.bytedance.android.livesdk.goal.model.CommitV2Response$Data$CommitV2Goal> r0 = r13.goals
            if (r0 == 0) goto L1f
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.bytedance.android.livesdk.goal.model.CommitV2Response$Data$CommitV2Goal r0 = (com.bytedance.android.livesdk.goal.model.CommitV2Response.Data.CommitV2Goal) r0
            if (r0 == 0) goto L1f
            com.bytedance.android.livesdk.gift.model.LiveStreamGoal r4 = r0.goal
        L1f:
            r10 = 0
            if (r4 == 0) goto L73
            long r2 = r4.id
            java.util.List<com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal> r0 = r4.subGoals
            if (r0 == 0) goto L75
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal r0 = (com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal) r0
            if (r0 == 0) goto L75
            long r7 = r0.id
        L33:
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L50
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 <= 0) goto L50
            com.bytedance.android.livesdk.goal.model.PinRequestParams r1 = new com.bytedance.android.livesdk.goal.model.PinRequestParams
            r1.<init>()
            r1.goalId = r2
            r1.subGoalId = r7
            r1.roomId = r5
            r1.type = r9
            com.bytedance.android.live.gift.GiftService r0 = com.bytedance.android.live.gift.GiftService.LLILLJJLI
            r0.pinGoal(r1)
        L4d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L50:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "pinAfterCommit skipped: missing ids (goalId="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", subGoalId="
            r1.append(r0)
            r1.append(r7)
            r0 = 41
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "SetGoalSchemaHandler"
            X.C20441214yg.LJ(r0, r1)
            goto L4d
        L73:
            r2 = 0
        L75:
            r7 = 0
            goto L33
        L78:
            X.0f9C r0 = r12.LLILLJJLI
            android.content.Context r3 = r12.LLILZ
            java.lang.String r2 = r12.LLILZIL
            r0.getClass()
            java.lang.String r0 = "aweme://roma_redirect/?spark_page=goal_edit_preset_page&roma_group_key=spark_page_goal_edit_preset_page&roma_page_key=p&tab=gift&page_type=detail&entrance=full_screen"
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            android.net.Uri$Builder r1 = r0.buildUpon()
            int r0 = r2.length()
            if (r0 <= 0) goto L96
            java.lang.String r0 = "tip_or_tag_id"
            r1.appendQueryParameter(r0, r2)
        L96:
            android.net.Uri r0 = r1.build()
            java.lang.String r1 = r0.toString()
            java.lang.Class<com.bytedance.android.live.browser.IHybridContainerService> r0 = com.bytedance.android.live.browser.IHybridContainerService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.browser.IHybridContainerService r0 = (com.bytedance.android.live.browser.IHybridContainerService) r0
            if (r0 == 0) goto L4d
            r0.YC1(r3, r1, r4)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1116010f9D.invoke(java.lang.Object):java.lang.Object");
    }
}
