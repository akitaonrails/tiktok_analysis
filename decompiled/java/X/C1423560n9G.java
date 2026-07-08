package X;

import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n9G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.favorite.TemplateFavoriteServiceKt$fetchTemplateTabFavoriteListFlow$1", f = "TemplateFavoriteService.kt", l = {142, 157}, m = "invokeSuspend")
public final class C1423560n9G extends C09AX implements Function2<InterfaceC346701Wf<? super C1423630n9N>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1423810n9f LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Function2<Integer, Asset, C1419590n2r> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1423560n9G(C1423810n9f c1423810n9f, int i, int i2, Function2<? super Integer, ? super Asset, C1419590n2r> function2, InterfaceC1364105Vn<? super C1423560n9G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1423810n9f;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1423560n9G c1423560n9G = new C1423560n9G(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1423560n9G.LLILLJJLI = obj;
        return c1423560n9G;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r4 = r23
            java.lang.String r9 = "TemplateFavoriteServiceKt@c1e0.fetchTemplateTabFavoriteListFlow$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r3 = X.C099R.LJFF()
            r5 = r22
            int r0 = r5.LL
            r2 = 2
            r8 = 1
            if (r0 == 0) goto L20
            if (r0 == r8) goto L3f
            if (r0 != r2) goto L91
            X.C155000ia.LIZIZ(r4)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L20:
            X.C155000ia.LIZIZ(r4)
            java.lang.Object r1 = r5.LLILLJJLI
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.0n9f r7 = r5.LLILLL
            if (r7 == 0) goto L48
            int r6 = r5.LLILZ
            int r4 = r5.LLILZIL
            kotlin.jvm.functions.Function2<java.lang.Integer, com.ss.android.ugc.effectmanager.effect.model.Asset, X.0n2r> r0 = r5.LLILZLL
            r5.LLILLJJLI = r1
            r5.LL = r8
            java.lang.Object r4 = r7.LIZIZ(r6, r4, r0, r5)
            if (r4 != r3) goto L46
            X.C1C7U.LIZIZ(r9)
            return r3
        L3f:
            java.lang.Object r1 = r5.LLILLJJLI
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.C155000ia.LIZIZ(r4)
        L46:
            if (r4 != 0) goto L82
        L48:
            X.0n9N r4 = new X.0n9N
            X.0n9R r17 = X.EnumC1423670n9R.FAIL
            r14 = 0
            r15 = 0
            X.0n8A r10 = new X.0n8A
            X.0n8S r11 = X.EnumC1423060n8S.FETCH_TEMPLATE_ERROR
            r12 = 10002(0x2712, float:1.4016E-41)
            java.lang.StringBuilder r6 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchTemplateTabFavoriteListFlow error, cursor = "
            r6.append(r0)
            int r0 = r5.LLILZ
            r6.append(r0)
            java.lang.String r0 = ", count = "
            r6.append(r0)
            int r0 = r5.LLILZIL
            r6.append(r0)
            java.lang.String r13 = X.C2188811AlT.LIZIZ(r6)
            r16 = r14
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r18 = r14
            r19 = r14
            r20 = r15
            r21 = r10
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21)
        L82:
            r0 = 0
            r5.LLILLJJLI = r0
            r5.LL = r2
            java.lang.Object r0 = r1.emit(r4, r5)
            if (r0 != r3) goto L1a
            X.C1C7U.LIZIZ(r9)
            return r3
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1423560n9G.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C1423630n9N> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
