package X;

import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mlY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel$processFavoritesClicked$2$1$1", f = "EffectInfoViewModel.kt", l = {259, 260}, m = "invokeSuspend")
public final class C1408860mlY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1628970sUZ LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ Boolean LLILZ;
    public final /* synthetic */ EffectInfoViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408860mlY(EffectInfoViewModel effectInfoViewModel, InterfaceC1628970sUZ interfaceC1628970sUZ, Effect effect, Boolean bool, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1628970sUZ;
        this.LLILLL = effect;
        this.LLILZ = bool;
        this.LLILZIL = effectInfoViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408860mlY(this.LLILZIL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[Catch: Exception -> 0x0095, TryCatch #0 {Exception -> 0x0095, blocks: (B:24:0x0066, B:25:0x0069, B:27:0x0071, B:29:0x0075, B:30:0x0078, B:31:0x007b, B:33:0x007f, B:38:0x008b, B:18:0x0043, B:19:0x0046, B:20:0x0048, B:10:0x001f, B:12:0x0023, B:14:0x0037), top: B:43:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[Catch: Exception -> 0x0095, TryCatch #0 {Exception -> 0x0095, blocks: (B:24:0x0066, B:25:0x0069, B:27:0x0071, B:29:0x0075, B:30:0x0078, B:31:0x007b, B:33:0x007f, B:38:0x008b, B:18:0x0043, B:19:0x0046, B:20:0x0048, B:10:0x001f, B:12:0x0023, B:14:0x0037), top: B:43:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b A[Catch: Exception -> 0x0095, TRY_LEAVE, TryCatch #0 {Exception -> 0x0095, blocks: (B:24:0x0066, B:25:0x0069, B:27:0x0071, B:29:0x0075, B:30:0x0078, B:31:0x007b, B:33:0x007f, B:38:0x008b, B:18:0x0043, B:19:0x0046, B:20:0x0048, B:10:0x001f, B:12:0x0023, B:14:0x0037), top: B:43:0x000d }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r7 = "EffectInfoViewModel@79fd.processFavoritesClicked$2$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r14.LL
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L43
            if (r0 != r4) goto L14
            goto L66
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.C155000ia.LIZIZ(r15)
            X.0sUZ r6 = r14.LLILLJJLI     // Catch: java.lang.Exception -> L95
            if (r6 == 0) goto L48
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r14.LLILLL     // Catch: java.lang.Exception -> L95
            java.lang.Boolean r1 = r14.LLILZ     // Catch: java.lang.Exception -> L95
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L95
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L95
            X.0g11 r0 = X.EnumC1149370g11.PANEL     // Catch: java.lang.Exception -> L95
            X.11KQ r0 = r6.LJII(r0, r5, r1)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L48
            r14.LL = r2     // Catch: java.lang.Exception -> L95
            java.lang.Object r15 = X.C11UD.LIZIZ(r0, r14)     // Catch: java.lang.Exception -> L95
            if (r15 != r3) goto L46
            X.C1C7U.LIZIZ(r7)
            return r3
        L43:
            X.C155000ia.LIZIZ(r15)     // Catch: java.lang.Exception -> L95
        L46:
            java.util.List r15 = (java.util.List) r15     // Catch: java.lang.Exception -> L95
        L48:
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Exception -> L95
            X.08pq r0 = X.C2107308Nj.LIZ     // Catch: java.lang.Exception -> L95
            X.0mlU r8 = new X.0mlU     // Catch: java.lang.Exception -> L95
            X.0sUZ r10 = r14.LLILLJJLI     // Catch: java.lang.Exception -> L95
            java.lang.Boolean r12 = r14.LLILZ     // Catch: java.lang.Exception -> L95
            com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel r9 = r14.LLILZIL     // Catch: java.lang.Exception -> L95
            com.ss.android.ugc.effectmanager.effect.model.Effect r11 = r14.LLILLL     // Catch: java.lang.Exception -> L95
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L95
            r14.LL = r4     // Catch: java.lang.Exception -> L95
            java.lang.Object r0 = X.C23250099c.LJI(r14, r0, r8)     // Catch: java.lang.Exception -> L95
            if (r0 != r3) goto L69
            X.C1C7U.LIZIZ(r7)
            return r3
        L66:
            X.C155000ia.LIZIZ(r15)     // Catch: java.lang.Exception -> L95
        L69:
            com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel r0 = r14.LLILZIL     // Catch: java.lang.Exception -> L95
            X.0sTI r1 = r0.mR2()     // Catch: java.lang.Exception -> L95
            if (r1 == 0) goto L7b
            java.lang.Boolean r0 = r14.LLILZ     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L78
            r0.booleanValue()     // Catch: java.lang.Exception -> L95
        L78:
            r1.LIZIZ()     // Catch: java.lang.Exception -> L95
        L7b:
            java.lang.Boolean r0 = r14.LLILZ     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L88
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L95
            r0 = r0 ^ 1
            if (r0 != r2) goto L88
            goto L89
        L88:
            r2 = 0
        L89:
            if (r2 == 0) goto La0
            com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel r0 = r14.LLILZIL     // Catch: java.lang.Exception -> L95
            X.0Lyd<X.0skz> r1 = r0.LLJJ     // Catch: java.lang.Exception -> L95
            X.0sl2 r0 = X.C1639180sl2.LIZ     // Catch: java.lang.Exception -> L95
            r1.LJIIIZ(r0)     // Catch: java.lang.Exception -> L95
            goto La0
        L95:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = r0.getMessage()
            X.C201955140j.LJ(r0)
        La0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1408860mlY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
