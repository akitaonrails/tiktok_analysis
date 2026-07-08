package X;

import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HCR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM$onLikeClicked$1", f = "StoryNotePanelUserVM.kt", l = {205, 220}, m = "invokeSuspend")
public final class C0HCR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryNotePanelUserVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HCR(StoryNotePanelUserVM storyNotePanelUserVM, InterfaceC1364105Vn<? super C0HCR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyNotePanelUserVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HCR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[Catch: Exception -> 0x009e, TryCatch #0 {Exception -> 0x009e, blocks: (B:6:0x0014, B:18:0x003a, B:19:0x003d, B:22:0x0043, B:24:0x004e, B:26:0x0061, B:28:0x007f, B:31:0x0089, B:27:0x006e, B:10:0x0024, B:12:0x002a, B:14:0x002e), top: B:39:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[Catch: Exception -> 0x009e, TryCatch #0 {Exception -> 0x009e, blocks: (B:6:0x0014, B:18:0x003a, B:19:0x003d, B:22:0x0043, B:24:0x004e, B:26:0x0061, B:28:0x007f, B:31:0x0089, B:27:0x006e, B:10:0x0024, B:12:0x002a, B:14:0x002e), top: B:39:0x000e }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r7 = r12
            java.lang.String r5 = "StoryNotePanelUserVM@e1c1.onLikeClicked$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r11.LL
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L21
            if (r0 == r4) goto L3a
            if (r0 != r3) goto L19
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Exception -> L9e
            goto La2
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L21:
            X.C155000ia.LIZIZ(r7)
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM r1 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L9e
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection r0 = r1.LL     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L40
            java.lang.String r0 = r0.aid     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L40
            r11.LL = r4     // Catch: java.lang.Exception -> L9e
            java.lang.Object r7 = r1.wQ2(r0, r11)     // Catch: java.lang.Exception -> L9e
            if (r7 != r2) goto L3d
            X.C1C7U.LIZIZ(r5)
            return r2
        L3a:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Exception -> L9e
        L3d:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.ss.android.ugc.aweme.feed.model.Aweme) r7     // Catch: java.lang.Exception -> L9e
            goto L41
        L40:
            r7 = 0
        L41:
            if (r7 != 0) goto L4e
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM r0 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L9e
            r0.vQ2()     // Catch: java.lang.Exception -> L9e
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L9e
            X.C1C7U.LIZIZ(r5)     // Catch: java.lang.Exception -> L9e
            return r0
        L4e:
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM r0 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L9e
            androidx.lifecycle.MutableLiveData r0 = r0.LLJILJIL     // Catch: java.lang.Exception -> L9e
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L9e
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L9e
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L6e
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM r0 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L9e
            java.util.List<java.lang.String> r1 = r0.LLILZ     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = "unlike"
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Exception -> L9e
            r1.add(r0)     // Catch: java.lang.Exception -> L9e
            r9 = 0
            goto L7f
        L6e:
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM r0 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L9e
            java.util.List<java.lang.String> r1 = r0.LLILZ     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = "like"
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Exception -> L9e
            r1.add(r0)     // Catch: java.lang.Exception -> L9e
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM r0 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L9e
            r0.yQ2(r7)     // Catch: java.lang.Exception -> L9e
            r9 = 1
        L7f:
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM r6 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L9e
            java.lang.String r8 = r7.getAid()     // Catch: java.lang.Exception -> L9e
            if (r8 != 0) goto L89
            java.lang.String r8 = ""
        L89:
            kotlin.jvm.internal.AwS585S0100000_6 r10 = new kotlin.jvm.internal.AwS585S0100000_6     // Catch: java.lang.Exception -> L9e
            com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM r1 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L9e
            r0 = 15
            r10.<init>(r1, r0)     // Catch: java.lang.Exception -> L9e
            r11.LL = r3     // Catch: java.lang.Exception -> L9e
            java.lang.Object r0 = r6.zQ2(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L9e
            if (r0 != r2) goto La2
            X.C1C7U.LIZIZ(r5)
            return r2
        L9e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La2:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HCR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
