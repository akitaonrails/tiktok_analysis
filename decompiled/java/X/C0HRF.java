package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HRF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageViewModel$onPrepared$3$1$2", f = "MixStudioGeneratingPageViewModel.kt", l = {113}, m = "invokeSuspend")
public final class C0HRF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MixStudioGeneratingPageViewModel LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ MixStudioGeneratingPageViewModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HRF(int i, MixStudioGeneratingPageViewModel mixStudioGeneratingPageViewModel, InterfaceC1364105Vn<? super C0HRF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = i;
        this.LLILZLL = mixStudioGeneratingPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HRF(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0040 -> B:6:0x001b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "MixStudioGeneratingPageViewModel@f91f.onPrepared$3$1$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r5 = 1
            if (r0 == 0) goto L46
            if (r0 != r5) goto L5d
            int r4 = r8.LLILLL
            java.lang.Object r3 = r8.LLILLJJLI
            java.util.Iterator r3 = (java.util.Iterator) r3
            com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageViewModel r0 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L1b:
            kotlin.jvm.internal.AwS21S0001000_6 r2 = new kotlin.jvm.internal.AwS21S0001000_6
            r1 = 8
            r2.<init>(r4, r1)
            r0.setState(r2)
        L25:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L57
            r1 = r3
            X.08Jy r1 = (X.AbstractC2098408Jy) r1
            int r4 = r1.nextInt()
            r8.LL = r0
            r8.LLILLJJLI = r3
            r8.LLILLL = r4
            r8.LLILZ = r5
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r1, r8)
            if (r1 != r6) goto L1b
            X.C1C7U.LIZIZ(r7)
            return r6
        L46:
            X.C155000ia.LIZIZ(r9)
            int r1 = r8.LLILZIL
            r0 = 0
            X.0y9S r1 = X.C13LZ.LJIIIZ(r1, r0)
            com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageViewModel r0 = r8.LLILZLL
            X.0Kt9 r3 = r1.iterator()
            goto L25
        L57:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HRF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
