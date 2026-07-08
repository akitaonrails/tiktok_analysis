package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.impl.mentionlist.component.MentionListComponent$onCreate$1", f = "MentionListComponent.kt", l = {211, 214}, m = "invokeSuspend")
public final class C554110LoH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C554100LoG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554110LoH(C554100LoG c554100LoG, InterfaceC1364105Vn<? super C554110LoH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c554100LoG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C554110LoH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "MentionListComponent@a6a.onCreate$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L37
            if (r0 != r5) goto L7f
            X.C155000ia.LIZIZ(r8)
        L16:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L21
            X.0LoG r1 = r7.LLILLJJLI
            r0 = 0
            java.util.List r8 = r1.P4(r0)
        L21:
            X.0LoG r2 = r7.LLILLJJLI
            kotlin.jvm.internal.AwS374S0200000_8 r1 = new kotlin.jvm.internal.AwS374S0200000_8
            r0 = 26
            r1.<init>(r2, r8, r0)
            r2.i3(r1)
        L2d:
            X.0LoG r0 = r7.LLILLJJLI
            r0.LLJLILLLLZIIL = r3
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L37:
            X.C155000ia.LIZIZ(r8)
            goto L2d
        L3b:
            X.C155000ia.LIZIZ(r8)
            X.0Ld2 r2 = X.C546820LcW.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onCreate: isFollow = "
            r1.append(r0)
            X.0LoG r0 = r7.LLILLJJLI
            boolean r0 = r0.M5()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MentionListComponent"
            r2.LIZ(r0, r1)
            X.0LoG r0 = r7.LLILLJJLI
            boolean r0 = r0.M5()
            if (r0 == 0) goto L71
            X.0LoG r0 = r7.LLILLJJLI
            r7.LL = r3
            java.lang.Object r0 = r0.F4(r3, r7)
            if (r0 != r4) goto L2d
            X.C1C7U.LIZIZ(r6)
            return r4
        L71:
            X.0LoG r0 = r7.LLILLJJLI
            r7.LL = r5
            java.lang.Object r8 = r0.H5(r7)
            if (r8 != r4) goto L16
            X.C1C7U.LIZIZ(r6)
            return r4
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C554110LoH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
