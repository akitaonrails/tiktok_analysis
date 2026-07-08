package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05nx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialgame.impl.jsb.GetConversationUserInfoMethodIDL$handle$2", f = "GetConversationUserInfoMethodIDL.kt", l = {57, 58}, m = "invokeSuspend")
public final class C1462305nx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Y8T LLILLL;
    public final /* synthetic */ C1462605o0 LLILZ;
    public final /* synthetic */ CompletionBlock<InterfaceC1463905oD> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1462305nx(C0Y8T c0y8t, C1462605o0 c1462605o0, CompletionBlock<InterfaceC1463905oD> completionBlock, InterfaceC1364105Vn<? super C1462305nx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0y8t;
        this.LLILZ = c1462605o0;
        this.LLILZIL = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1462305nx c1462305nx = new C1462305nx(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1462305nx.LLILLJJLI = obj;
        return c1462305nx;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "GetConversationUserInfoMethodIDL@995f.handle$2"
            X.C1C7U.LIZ(r10)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r11.LL
            r6 = 2
            r8 = 1
            r4 = 0
            if (r0 == 0) goto L1d
            if (r0 == r8) goto L61
            if (r0 != r6) goto L7f
            X.C155000ia.LIZIZ(r12)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r9 = r11.LLILLJJLI
            X.01wk r9 = (X.InterfaceC497601wk) r9
            X.0Y8T r0 = r11.LLILLL
            if (r0 == 0) goto L5f
            java.util.List r0 = r0.getMemberIds()
            if (r0 == 0) goto L5f
            X.05o0 r7 = r11.LLILZ
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L39:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r2.next()
            java.lang.Long r0 = (java.lang.Long) r0
            X.05nw r1 = new X.05nw
            r1.<init>(r7, r0, r4)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r9, r4, r4, r1, r0)
            r3.add(r0)
            goto L39
        L53:
            r11.LL = r8
            java.lang.Object r12 = X.C1D9F.LIZ(r3, r11)
            if (r12 != r5) goto L64
            X.C1C7U.LIZIZ(r10)
            return r5
        L5f:
            r12 = r4
            goto L66
        L61:
            X.C155000ia.LIZIZ(r12)
        L64:
            java.util.List r12 = (java.util.List) r12
        L66:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.05ny r2 = new X.05ny
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.05oD> r1 = r11.LLILZIL
            X.05o0 r0 = r11.LLILZ
            r2.<init>(r12, r1, r0, r4)
            r11.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r11, r3, r2)
            if (r0 != r5) goto L17
            X.C1C7U.LIZIZ(r10)
            return r5
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1462305nx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
