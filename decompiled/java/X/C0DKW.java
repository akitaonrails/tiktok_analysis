package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.story.note.StoryThoughtNotificationActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DKW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtNotificationActivity$onCreate$1", f = "StoryThoughtNotificationActivity.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C0DKW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ StoryThoughtNotificationActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DKW(StoryThoughtNotificationActivity storyThoughtNotificationActivity, InterfaceC1364105Vn<? super C0DKW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = storyThoughtNotificationActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DKW(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r5 = r20
            java.lang.String r6 = "StoryThoughtNotificationActivity@bd96.onCreate$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            r2 = r19
            int r0 = r2.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L6c
            if (r0 != r3) goto Lb0
            java.lang.Object r12 = r2.LL
            java.lang.String r12 = (java.lang.String) r12
            X.C155000ia.LIZIZ(r5)
        L1b:
            X.0W5m r5 = (X.C817600W5m) r5
        L1d:
            java.lang.String r4 = "enter_from"
            if (r5 == 0) goto L46
            com.ss.android.ugc.aweme.story.note.StoryThoughtNotificationActivity r1 = r2.LLILLL
            java.lang.String r0 = "//story_thought_creation_activity"
            com.bytedance.router.SmartRoute r3 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            java.lang.String r1 = ""
            r3.withParam(r4, r1)
            java.lang.String r0 = "enter_method"
            r3.withParam(r0, r1)
            java.lang.String r0 = "draft_from_notification"
            r3.withParam(r0, r5)
            r3.open()
        L3b:
            com.ss.android.ugc.aweme.story.note.StoryThoughtNotificationActivity r0 = r2.LLILLL
            r0.finish()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L46:
            boolean r0 = X.C298600Bn8.LIZ()
            if (r0 == 0) goto L3b
            if (r12 == 0) goto L3b
            com.ss.android.ugc.aweme.story.note.StoryThoughtNotificationActivity r1 = r2.LLILLL
            java.lang.String r0 = "aweme://story/detail"
            com.bytedance.router.SmartRoute r3 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            java.lang.String r1 = "video_from"
            java.lang.String r0 = "STORY_ENTRANCE_DEFAULT"
            r3.withParam(r1, r0)
            java.lang.String r0 = "notification_page"
            r3.withParam(r4, r0)
            java.lang.String r0 = "id"
            r3.withParam(r0, r12)
            r3.open()
            goto L3b
        L6c:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.story.note.StoryThoughtNotificationActivity r0 = r2.LLILLL
            X.01GW r0 = r0.LL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class<com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService> r7 = com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService.class
            r8 = 0
            r14 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService r0 = (com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService) r0
            r5 = 0
            if (r0 == 0) goto L8f
            java.lang.String r12 = r0.LJI(r1)
        L8f:
            if (r1 == 0) goto L3b
            java.lang.Class<com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService> r13 = com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService.class
            r17 = 14
            r15 = r14
            r16 = r14
            r18 = r5
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService r0 = (com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService) r0
            if (r0 == 0) goto L1d
            r2.LL = r12
            r2.LLILLJJLI = r3
            java.lang.Object r5 = r0.LIZ(r1, r2)
            if (r5 != r4) goto L1b
            X.C1C7U.LIZIZ(r6)
            return r4
        Lb0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DKW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
