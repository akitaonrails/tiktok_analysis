package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compose.MentionVideoListPageKt$MentionVideoListPage$1$1", f = "MentionVideoListPage.kt", l = {}, m = "invokeSuspend")
public final class C1220250hrL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C05P1<C1220270hrN> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220250hrL(Function0<Unit> function0, boolean z, Function0<Unit> function02, C05P1<C1220270hrN> c05p1, InterfaceC1364105Vn<? super C1220250hrL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
        this.LLILLJJLI = z;
        this.LLILLL = function02;
        this.LLILZ = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1220250hrL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.String r2 = "MentionVideoListPageKt@5e1a.MentionVideoListPage$1$1"
            X.C1C7U.LIZ(r2)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r4)
            X.05P1<X.0hrN> r0 = r3.LLILZ
            java.lang.Object r0 = r0.getValue()
            X.0hrN r0 = (X.C1220270hrN) r0
            int r1 = r0.LLILLL
            r0 = 1
            if (r1 == r0) goto L2e
            r0 = 2
            if (r1 == r0) goto L24
            r0 = 5
            if (r1 == r0) goto L2e
        L1e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r2)
            return r0
        L24:
            boolean r0 = r3.LLILLJJLI
            if (r0 == 0) goto L1e
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r3.LLILLL
            r0.invoke()
            goto L1e
        L2e:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r3.LL
            r0.invoke()
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1220250hrL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
