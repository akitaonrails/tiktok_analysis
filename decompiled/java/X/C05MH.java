package X;

import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInteractionInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05MH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtPanelFragment$onCreateView$1$1$11$1$1", f = "SocialThoughtPanelFragment.kt", l = {605}, m = "invokeSuspend")
public final class C05MH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ ThoughtInteractionInfo LLILZIL;
    public final /* synthetic */ ISocialThoughtDataCenterService LLILZLL;
    public final /* synthetic */ ThoughtInfo LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05MH(boolean z, String str, ThoughtInteractionInfo thoughtInteractionInfo, ISocialThoughtDataCenterService iSocialThoughtDataCenterService, ThoughtInfo thoughtInfo, InterfaceC1364105Vn<? super C05MH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = thoughtInteractionInfo;
        this.LLILZLL = iSocialThoughtDataCenterService;
        this.LLIZ = thoughtInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05MH c05mh = new C05MH(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c05mh.LLILLJJLI = obj;
        return c05mh;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            java.lang.String r6 = "SocialThoughtPanelFragment@3c57.onCreateView$1$1$11$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            r7 = r17
            int r0 = r7.LL
            r4 = 1
            if (r0 == 0) goto L24
            if (r0 != r4) goto L1c
            java.lang.Object r3 = r7.LLILLJJLI
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.C155000ia.LIZIZ(r18)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L7b
            goto L75
        L1a:
            r0 = move-exception
            goto L45
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L24:
            X.C155000ia.LIZIZ(r18)
            java.lang.Object r3 = r7.LLILLJJLI
            X.01wk r3 = (X.InterfaceC497601wk) r3
            boolean r0 = r7.LLILLL     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L7b
            if (r0 == 0) goto L31
            r2 = 1
            goto L32
        L31:
            r2 = 2
        L32:
            com.ss.android.ugc.aweme.social.thought.api.ThoughtApi r1 = com.ss.android.ugc.aweme.social.thought.api.ThoughtApi.LIZIZ     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L7b
            java.lang.String r0 = r7.LLILZ     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L7b
            r7.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L7b
            r7.LL = r4     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L7b
            java.lang.Object r0 = r1.interactThought(r0, r2, r7)     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L7b
            if (r0 != r5) goto L75
            X.C1C7U.LIZIZ(r6)
            return r5
        L44:
            r0 = move-exception
        L45:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            boolean r0 = X.C2296808zG.LJI(r3)
            if (r0 != 0) goto L54
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L54:
            com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService r2 = r7.LLILZLL
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo r8 = r7.LLIZ
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInteractionInfo r14 = r7.LLILZIL
            if (r2 == 0) goto L75
            java.lang.String r9 = r8.thoughtId
            java.lang.String r10 = r8.textContent
            java.lang.Long r11 = r8.createTimeMs
            java.lang.Integer r12 = r8.privacySetting
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInteractionPreview r13 = r8.interactionPreview
            java.lang.String r15 = r8.authorUid
            boolean r0 = r8.isPublishing
            r16 = r0
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo r1 = r8.copy(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = ""
            r2.LJII(r0, r1)
        L75:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L7b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05MH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
