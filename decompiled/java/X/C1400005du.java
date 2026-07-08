package X;

import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05du, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM$setStoryNoteData$1", f = "StoryNotePanelAuthorVM.kt", l = {158}, m = "invokeSuspend")
public final class C1400005du extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryNoteDataCollection LLILLJJLI;
    public final /* synthetic */ StoryNotePanelAuthorVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1400005du(StoryNoteDataCollection storyNoteDataCollection, StoryNotePanelAuthorVM storyNotePanelAuthorVM, InterfaceC1364105Vn<? super C1400005du> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyNoteDataCollection;
        this.LLILLL = storyNotePanelAuthorVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1400005du(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:18:0x0035, B:19:0x0038, B:20:0x003a, B:22:0x003e, B:24:0x0044, B:25:0x004c, B:27:0x0050, B:28:0x0055, B:30:0x0063, B:9:0x001d, B:11:0x0021, B:13:0x0025), top: B:35:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[Catch: Exception -> 0x006f, TRY_LEAVE, TryCatch #0 {Exception -> 0x006f, blocks: (B:18:0x0035, B:19:0x0038, B:20:0x003a, B:22:0x003e, B:24:0x0044, B:25:0x004c, B:27:0x0050, B:28:0x0055, B:30:0x0063, B:9:0x001d, B:11:0x0021, B:13:0x0025), top: B:35:0x000d }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "StoryNotePanelAuthorVM@8a90.setStoryNoteData$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L12
            goto L35
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r7)
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection r0 = r6.LLILLJJLI     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L33
            java.lang.String r1 = r0.aid     // Catch: java.lang.Exception -> L6f
            if (r1 == 0) goto L33
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM r0 = r6.LLILLL     // Catch: java.lang.Exception -> L6f
            r6.LL = r2     // Catch: java.lang.Exception -> L6f
            java.lang.Object r7 = r0.vQ2(r1, r6)     // Catch: java.lang.Exception -> L6f
            if (r7 != r4) goto L38
            X.C1C7U.LIZIZ(r5)
            return r4
        L33:
            r7 = r3
            goto L3a
        L35:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Exception -> L6f
        L38:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.ss.android.ugc.aweme.feed.model.Aweme) r7     // Catch: java.lang.Exception -> L6f
        L3a:
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM r1 = r6.LLILLL     // Catch: java.lang.Exception -> L6f
            if (r7 == 0) goto L4c
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getStatusSafety(r7)     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L4c
            int r0 = r0.getPrivateStatus()     // Catch: java.lang.Exception -> L6f
            java.lang.Integer r3 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> L6f
        L4c:
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r1 = r1.LLILZIL     // Catch: java.lang.Exception -> L6f
            if (r3 != 0) goto L55
            r0 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L6f
        L55:
            r1.setValue(r3)     // Catch: java.lang.Exception -> L6f
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM r0 = r6.LLILLL     // Catch: java.lang.Exception -> L6f
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r0.LLIZ     // Catch: java.lang.Exception -> L6f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L6f
            r1.setValue(r0)     // Catch: java.lang.Exception -> L6f
            if (r7 == 0) goto L73
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM r0 = r6.LLILLL     // Catch: java.lang.Exception -> L6f
            r0.getClass()     // Catch: java.lang.Exception -> L6f
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM.yQ2(r7)     // Catch: java.lang.Exception -> L6f
            r0.wQ2(r7)     // Catch: java.lang.Exception -> L6f
            goto L73
        L6f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1400005du.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
