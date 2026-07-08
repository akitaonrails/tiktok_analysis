package X;

import com.ss.android.ugc.aweme.story.inbox.StoryInsertCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01sd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.guideuploadcard.ResourcesPreloadStat$preloadCoversAndAvatar$3", f = "ResourcesPreloadStat.kt", l = {90, 94, 99}, m = "invokeSuspend")
public final class C472101sd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C0HBZ LLILZ;
    public final /* synthetic */ StoryInsertCard LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C472101sd(C0HBZ c0hbz, StoryInsertCard storyInsertCard, InterfaceC1364105Vn<? super C472101sd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0hbz;
        this.LLILZIL = storyInsertCard;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C472101sd(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "ResourcesPreloadStat@d1f2.preloadCoversAndAvatar$3"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r6 = 3
            r3 = 1
            r5 = 2
            if (r0 == 0) goto L26
            if (r0 == r3) goto L45
            if (r0 == r5) goto L23
            if (r0 != r6) goto L1b
            int r2 = r9.LLILLJJLI
            int r4 = r9.LL
            goto L93
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L23:
            int r4 = r9.LL
            goto L6b
        L26:
            X.C155000ia.LIZIZ(r10)
            X.0HBZ r2 = r9.LLILZ     // Catch: java.lang.Exception -> La9
            com.ss.android.ugc.aweme.story.inbox.StoryInsertCard r0 = r9.LLILZIL     // Catch: java.lang.Exception -> La9
            java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> r1 = r0.coverUrls     // Catch: java.lang.Exception -> La9
            r0 = 0
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)     // Catch: java.lang.Exception -> La9
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.ss.android.ugc.aweme.base.model.UrlModel) r0     // Catch: java.lang.Exception -> La9
            r9.LLILLL = r3     // Catch: java.lang.Exception -> La9
            r2.getClass()     // Catch: java.lang.Exception -> La9
            java.lang.Object r10 = X.C0HBZ.LIZ(r0, r9)     // Catch: java.lang.Exception -> La9
            if (r10 != r7) goto L48
            X.C1C7U.LIZIZ(r8)
            return r7
        L45:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> La9
        L48:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Exception -> La9
            int r4 = r10.intValue()     // Catch: java.lang.Exception -> La9
            X.0HBZ r1 = r9.LLILZ     // Catch: java.lang.Exception -> La9
            com.ss.android.ugc.aweme.story.inbox.StoryInsertCard r0 = r9.LLILZIL     // Catch: java.lang.Exception -> La9
            java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> r0 = r0.coverUrls     // Catch: java.lang.Exception -> La9
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r3, r0)     // Catch: java.lang.Exception -> La9
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.ss.android.ugc.aweme.base.model.UrlModel) r0     // Catch: java.lang.Exception -> La9
            r9.LL = r4     // Catch: java.lang.Exception -> La9
            r9.LLILLL = r5     // Catch: java.lang.Exception -> La9
            r1.getClass()     // Catch: java.lang.Exception -> La9
            java.lang.Object r10 = X.C0HBZ.LIZ(r0, r9)     // Catch: java.lang.Exception -> La9
            if (r10 != r7) goto L6e
            X.C1C7U.LIZIZ(r8)
            return r7
        L6b:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> La9
        L6e:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Exception -> La9
            int r2 = r10.intValue()     // Catch: java.lang.Exception -> La9
            X.0HBZ r1 = r9.LLILZ     // Catch: java.lang.Exception -> La9
            com.ss.android.ugc.aweme.story.inbox.StoryInsertCard r0 = r9.LLILZIL     // Catch: java.lang.Exception -> La9
            java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> r0 = r0.coverUrls     // Catch: java.lang.Exception -> La9
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r0)     // Catch: java.lang.Exception -> La9
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.ss.android.ugc.aweme.base.model.UrlModel) r0     // Catch: java.lang.Exception -> La9
            r9.LL = r4     // Catch: java.lang.Exception -> La9
            r9.LLILLJJLI = r2     // Catch: java.lang.Exception -> La9
            r9.LLILLL = r6     // Catch: java.lang.Exception -> La9
            r1.getClass()     // Catch: java.lang.Exception -> La9
            java.lang.Object r10 = X.C0HBZ.LIZ(r0, r9)     // Catch: java.lang.Exception -> La9
            if (r10 != r7) goto L96
            X.C1C7U.LIZIZ(r8)
            return r7
        L93:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> La9
        L96:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Exception -> La9
            int r1 = r10.intValue()     // Catch: java.lang.Exception -> La9
            X.0HBZ r0 = r9.LLILZ     // Catch: java.lang.Exception -> La9
            if (r4 != r5) goto La5
            if (r2 != r5) goto La5
            if (r1 != r5) goto La5
            goto La6
        La5:
            r5 = 1
        La6:
            r0.LIZLLL = r5     // Catch: java.lang.Exception -> La9
            goto Lb1
        La9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HBZ r0 = r9.LLILZ
            r0.LIZLLL = r3
        Lb1:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C472101sd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
