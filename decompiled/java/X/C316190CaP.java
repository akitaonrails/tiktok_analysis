package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CaP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.ui.chunks.VideoCaptionMentionRemoteSearchChunk$searchPageConfig$2$1$onRefresh$1", f = "VideoCaptionMentionRemoteSearchChunk.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 71, 74}, m = "invokeSuspend")
public final class C316190CaP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C316990Cbh LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C316990Cbh LLILZ;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Boolean>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C316190CaP(C316990Cbh c316990Cbh, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C316190CaP> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILZ = c316990Cbh;
        this.LLILZIL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316190CaP(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r7 = "VideoCaptionMentionRemoteSearchChunk@558a.searchPageConfig$2$1$onRefresh$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r14.LLILLL
            r5 = 3
            r6 = 2
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L20
            if (r0 == r2) goto L4f
            if (r0 == r6) goto L66
            if (r0 != r5) goto L82
            X.C155000ia.LIZIZ(r15)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L20:
            X.C155000ia.LIZIZ(r15)
            X.0Cbh r0 = r14.LLILZ
            java.lang.String r9 = r0.LLJI
            X.0Cbh r1 = r14.LLILZ
            X.01GW r0 = r1.LLJILLL
            java.lang.Object r8 = r0.getValue()
            com.ss.android.ugc.ur.alias.IAliasService r8 = (com.ss.android.ugc.ur.alias.IAliasService) r8
            if (r8 == 0) goto L4d
            if (r9 != 0) goto L37
            java.lang.String r9 = ""
        L37:
            r10 = 6
            r14.LL = r1
            r14.LLILLJJLI = r2
            r14.LLILLL = r2
            r12 = 0
            X.099G r15 = r8.LJ(r9, r10, r12)
            if (r15 != r4) goto L4b
            X.C1C7U.LIZIZ(r7)
            return r4
        L4b:
            r2 = 1
            goto L56
        L4d:
            r15 = r3
            goto L58
        L4f:
            int r2 = r14.LLILLJJLI
            X.0Cbh r1 = r14.LL
            X.C155000ia.LIZIZ(r15)
        L56:
            X.0957 r15 = (X.AnonymousClass0957) r15
        L58:
            r14.LL = r3
            r14.LLILLL = r6
            java.lang.Object r15 = r1.LJJI(r2, r15, r14)
            if (r15 != r4) goto L69
            X.C1C7U.LIZIZ(r7)
            return r4
        L66:
            X.C155000ia.LIZIZ(r15)
        L69:
            X.0CbV r15 = (X.AbstractC316870CbV) r15
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0CaO r1 = new X.0CaO
            X.05Vn<X.0CbV<java.lang.Boolean>> r0 = r14.LLILZIL
            r1.<init>(r0, r15, r3)
            r14.LLILLL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r14, r2, r1)
            if (r0 != r4) goto L1a
            X.C1C7U.LIZIZ(r7)
            return r4
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C316190CaP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
