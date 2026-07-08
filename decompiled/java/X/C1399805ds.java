package X;

import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM$onDeleteButtonClicked$1", f = "StoryNotePanelAuthorVM.kt", l = {251}, m = "invokeSuspend")
public final class C1399805ds extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryNotePanelAuthorVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1399805ds(StoryNotePanelAuthorVM storyNotePanelAuthorVM, InterfaceC1364105Vn<? super C1399805ds> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyNotePanelAuthorVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1399805ds(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[Catch: Exception -> 0x007d, TRY_LEAVE, TryCatch #0 {Exception -> 0x007d, blocks: (B:29:0x0070, B:30:0x0073, B:32:0x0077, B:9:0x001c, B:11:0x0023, B:14:0x0029, B:20:0x0035, B:21:0x004b, B:23:0x0060, B:25:0x0064), top: B:37:0x000c }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "StoryNotePanelAuthorVM@8a90.onDeleteButtonClicked$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LL
            r4 = 1
            if (r0 == 0) goto L19
            if (r0 != r4) goto L11
            goto L70
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM r2 = r8.LLILLJJLI     // Catch: java.lang.Exception -> L7d
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection r0 = r2.LL     // Catch: java.lang.Exception -> L7d
            r9 = 0
            if (r0 == 0) goto L26
            java.lang.String r6 = r0.aid     // Catch: java.lang.Exception -> L7d
            goto L27
        L26:
            r6 = r9
        L27:
            if (r6 == 0) goto L30
            int r0 = r6.length()     // Catch: java.lang.Exception -> L7d
            if (r0 == 0) goto L30
            goto L32
        L30:
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            if (r0 != 0) goto L4b
            androidx.lifecycle.MutableLiveData<kotlin.Unit> r1 = r2.LLJIJIL     // Catch: java.lang.Exception -> L7d
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L7d
            r1.setValue(r0)     // Catch: java.lang.Exception -> L7d
            X.01wk r3 = androidx.lifecycle.ViewModelKt.getViewModelScope(r2)     // Catch: java.lang.Exception -> L7d
            X.1DFB r2 = X.C0PEM.LIZJ     // Catch: java.lang.Exception -> L7d
            X.05DI r1 = new X.05DI     // Catch: java.lang.Exception -> L7d
            r1.<init>(r6, r9)     // Catch: java.lang.Exception -> L7d
            r0 = 2
            X.C23250099c.LIZLLL(r3, r2, r9, r1, r0)     // Catch: java.lang.Exception -> L7d
        L4b:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L7d
            java.lang.Class<com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager> r0 = com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager.class
            java.lang.Object r0 = r1.getService(r0)     // Catch: java.lang.Exception -> L7d
            com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager r0 = (com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager) r0     // Catch: java.lang.Exception -> L7d
            r0.onStoryNoteDelete()     // Catch: java.lang.Exception -> L7d
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM r1 = r8.LLILLJJLI     // Catch: java.lang.Exception -> L7d
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection r0 = r1.LL     // Catch: java.lang.Exception -> L7d
            if (r0 == 0) goto L75
            java.lang.String r0 = r0.aid     // Catch: java.lang.Exception -> L7d
            if (r0 == 0) goto L75
            r8.LL = r4     // Catch: java.lang.Exception -> L7d
            java.lang.Object r9 = r1.vQ2(r0, r8)     // Catch: java.lang.Exception -> L7d
            if (r9 != r5) goto L73
            X.C1C7U.LIZIZ(r7)
            return r5
        L70:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Exception -> L7d
        L73:
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = (com.ss.android.ugc.aweme.feed.model.Aweme) r9     // Catch: java.lang.Exception -> L7d
        L75:
            if (r9 == 0) goto L81
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM r0 = r8.LLILLJJLI     // Catch: java.lang.Exception -> L7d
            r0.xQ2(r9)     // Catch: java.lang.Exception -> L7d
            goto L81
        L7d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L81:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1399805ds.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
