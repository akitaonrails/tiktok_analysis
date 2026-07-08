package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05OT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository$1", f = "MufAffinityScoreRepository.kt", l = {100, 103}, m = "invokeSuspend")
public final class C05OT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MufAffinityScoreRepository LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05OT(MufAffinityScoreRepository mufAffinityScoreRepository, InterfaceC1364105Vn<? super C05OT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mufAffinityScoreRepository;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05OT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "MufAffinityScoreRepository@53bc.<init>$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L6b
            if (r0 == r5) goto L8a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C155000ia.LIZIZ(r8)
            X.01GW r0 = X.C05OV.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L38
            X.0s1W r3 = X.C1610960s1W.LIZIZ
            X.05OR r1 = new X.05OR
            com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository r0 = r7.LLILLJJLI
            r1.<init>()
            r3.LIZ(r1)
        L38:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository r0 = r7.LLILLJJLI
            X.05YD<java.lang.Boolean> r0 = r0.LJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5d
            com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository r0 = r7.LLILLJJLI
            java.util.Map r0 = r0.LIZIZ()
            int r1 = r0.size()
            com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository r0 = r7.LLILLJJLI
            r0.getClass()
            int r0 = com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository.LIZ()
            if (r1 >= r0) goto L6e
        L5d:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository r0 = r7.LLILLJJLI
            r7.LL = r2
            java.lang.Object r0 = r0.LJ(r7)
            if (r0 != r4) goto L6e
            X.C1C7U.LIZIZ(r6)
            return r4
        L6b:
            X.C155000ia.LIZIZ(r8)
        L6e:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository r0 = r7.LLILLJJLI
            r0.LJFF()
            com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository r3 = r7.LLILLJJLI
            X.05YD<java.lang.Boolean> r2 = r3.LJ
            Y.AgS283S0100000_2 r1 = new Y.AgS283S0100000_2
            r0 = 27
            r1.<init>(r3, r0)
            r7.LL = r5
            java.lang.Object r0 = r2.collect(r1, r7)
            if (r0 != r4) goto L8d
            X.C1C7U.LIZIZ(r6)
            return r4
        L8a:
            X.C155000ia.LIZIZ(r8)
        L8d:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05OT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
