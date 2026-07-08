package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hrx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentSortListVM$fetchSecondaryComment$1$3$1", f = "CommentListAssemVM.kt", l = {}, m = "invokeSuspend")
public final class C1220630hrx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1344210l5H LL;
    public final /* synthetic */ C1340820kzo LLILLJJLI;
    public final /* synthetic */ Throwable LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C20600815jK<InterfaceC1891350zJl> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220630hrx(C1344210l5H c1344210l5H, C1340820kzo c1340820kzo, Throwable th, boolean z, C20600815jK<InterfaceC1891350zJl> c20600815jK, InterfaceC1364105Vn<? super C1220630hrx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1344210l5H;
        this.LLILLJJLI = c1340820kzo;
        this.LLILLL = th;
        this.LLILZ = z;
        this.LLILZIL = c20600815jK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1220630hrx(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "CommentSortListVM@b6be.fetchSecondaryComment$1$3$1"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r9)
            X.0l5H r0 = r8.LL
            java.util.Set<java.lang.String> r1 = r0.LJJIFFI
            X.0kzo r0 = r8.LLILLJJLI
            java.lang.String r0 = r0.LLILLJJLI
            r1.remove(r0)
            X.0l5H r1 = r8.LL
            java.lang.Throwable r0 = r8.LLILLL
            r1.LJJIJL(r0)
            boolean r0 = r8.LLILZ
            if (r0 == 0) goto L31
            X.0l5H r0 = r8.LL
            java.util.List<java.lang.String> r1 = r0.LJJII
            X.0kzo r0 = r8.LLILLJJLI
            java.lang.String r0 = r0.LLILLJJLI
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L35
        L31:
            boolean r0 = r8.LLILZ
            if (r0 != 0) goto L95
        L35:
            android.app.Activity r1 = X.C2214201BlK.LJFF()
            java.lang.Throwable r0 = r8.LLILLL
            X.C1354920lMY.LIZJ(r1, r0)
            X.0l5H r0 = r8.LL
            java.util.List<java.lang.String> r1 = r0.LJJII
            X.0kzo r0 = r8.LLILLJJLI
            java.lang.String r0 = r0.LLILLJJLI
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.remove(r0)
            X.15jK<X.0zJl> r0 = r8.LLILZIL
            java.util.List r0 = r0.LJII()
            X.0kzo r6 = r8.LLILLJJLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
            r5 = 0
            r4 = 0
        L5b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r2 = r3.next()
            X.0zJl r2 = (X.InterfaceC1891350zJl) r2
            boolean r0 = r2 instanceof X.C1340820kzo
            r1 = 0
            if (r0 == 0) goto L72
            X.0kzo r2 = (X.C1340820kzo) r2
            if (r2 == 0) goto L72
            java.lang.String r1 = r2.LLILLJJLI
        L72:
            java.lang.String r0 = r6.LLILLJJLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L7e
            int r4 = r4 + 1
            goto L5b
        L7d:
            r4 = -1
        L7e:
            X.0kzo r3 = r8.LLILLJJLI
            int r2 = r3.LL
            X.0kzp r0 = r3.LLILZ
            int r0 = r0.LIZ
            r1 = 27
            if (r2 != r0) goto L9b
            X.0kzo r1 = X.C1340820kzo.LIZIZ(r3, r5, r5, r1)
        L8e:
            if (r4 < 0) goto L95
            X.15jK<X.0zJl> r0 = r8.LLILZIL
            r0.LJIILJJIL(r4, r1)
        L95:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L9b:
            r0 = 1
            X.0kzo r1 = X.C1340820kzo.LIZIZ(r3, r5, r0, r1)
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1220630hrx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
