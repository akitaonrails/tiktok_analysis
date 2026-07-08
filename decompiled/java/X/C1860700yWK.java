package X;

import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yWK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotSetting$fetchBotSetting$3", f = "TakoBotSetting.kt", l = {68}, m = "invokeSuspend")
public final class C1860700yWK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function1<AIBotInfo, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1860700yWK(long j, int i, boolean z, Function1<? super AIBotInfo, Unit> function1, InterfaceC1364105Vn<? super C1860700yWK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1860700yWK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r1 = r13
            java.lang.String r11 = "TakoBotSetting@84d0.fetchBotSetting$3"
            X.C1C7U.LIZ(r11)
            java.lang.Object r8 = X.C099R.LJFF()
            r9 = r12
            int r0 = r9.LL
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L55
            if (r0 != r6) goto La5
            X.C155000ia.LIZIZ(r1)
        L16:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse r1 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse) r1
            java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo> r0 = r1.botInfos
            long r3 = r9.LLILLJJLI
            java.util.Iterator r6 = r0.iterator()
        L20:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r5 = r6.next()
            r0 = r5
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo) r0
            long r1 = r0.botId
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L20
        L33:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r5 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo) r5
            if (r5 == 0) goto L46
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.tako.model.AIBotInfo, kotlin.Unit> r1 = r9.LLILZIL
            if (r1 == 0) goto L46
            com.ss.android.ugc.aweme.tako.model.AIBotInfo r0 = X.C20231914Ej.LIZLLL(r5)
            r1.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L4d
        L46:
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.tako.model.AIBotInfo, kotlin.Unit> r0 = r9.LLILZIL
            if (r0 == 0) goto L4d
            r0.invoke(r7)
        L4d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L53:
            r5 = r7
            goto L33
        L55:
            X.C155000ia.LIZIZ(r1)
            X.0yW2 r0 = X.C1860520yW2.LIZ
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse r0 = r0.LJIIIIZZ()
            java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo> r0 = r0.botInfos
            long r4 = r9.LLILLJJLI
            java.util.Iterator r10 = r0.iterator()
        L66:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r3 = r10.next()
            r0 = r3
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo) r0
            long r1 = r0.botId
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L66
        L79:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r3 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo) r3
            if (r3 == 0) goto L90
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.tako.model.AIBotInfo, kotlin.Unit> r1 = r9.LLILZIL
            if (r1 == 0) goto L88
            com.ss.android.ugc.aweme.tako.model.AIBotInfo r0 = X.C20231914Ej.LIZLLL(r3)
            r1.invoke(r0)
        L88:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L8e:
            r3 = r7
            goto L79
        L90:
            X.0ybc r0 = X.C1863980ybc.LIZ
            long r2 = r9.LLILLJJLI
            int r1 = r9.LLILLL
            boolean r4 = r9.LLILZ
            r9.LL = r6
            r5 = r9
            java.lang.Object r1 = r0.LJ(r1, r2, r4, r5)
            if (r1 != r8) goto L16
            X.C1C7U.LIZIZ(r11)
            return r8
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1860700yWK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
