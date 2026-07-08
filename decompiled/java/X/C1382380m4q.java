package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: renamed from: X.0m4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382380m4q extends AbstractC2250601D7a<IMUser, IMContact> {
    public static final /* synthetic */ int LJIIL = 0;
    public Function0<? extends List<String>> LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public final AFwS259S0000000_21 LJIIJJI = AFwS259S0000000_21.get$arr$(11);

    @Override // X.AbstractC2250601D7a
    public final Function1<IMUser, IMContact> LIZJ() {
        return this.LJIIJJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    @Override // X.AbstractC2250601D7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>> r11) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1382380m4q.LJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    @Override // X.AbstractC2250601D7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C1382400m4s
            if (r0 == 0) goto L74
            r8 = r10
            X.0m4s r8 = (X.C1382400m4s) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r8.LLILZ = r2
        L12:
            java.lang.Object r3 = r8.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto Lab
            int r4 = r8.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L32:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = r9.LJIIIIZZ
            if (r0 != 0) goto Lb3
            int r0 = r9.LJ
            if (r0 >= 0) goto L41
            r0 = 100
            r9.LJ = r0
        L41:
            int r0 = r9.LJ
            int r4 = r0 + 5
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.06pF r3 = r0.LIZ()
            kotlin.jvm.functions.Function0<? extends java.util.List<java.lang.String>> r0 = r9.LJI
            r6 = 0
            if (r0 == 0) goto L5f
            java.lang.Object r7 = r0.invoke()
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L60
        L5f:
            r7 = r6
        L60:
            int r0 = r9.LJIIJ
            int r5 = r4 * r0
            java.lang.String r0 = r9.LJII
            if (r0 == 0) goto L69
            r6 = r0
        L69:
            r8.LL = r4
            r8.LLILZ = r1
            java.lang.Object r3 = r3.LJIIIIZZ(r4, r5, r6, r7, r8)
            if (r3 != r2) goto L24
            return r2
        L74:
            X.0m4s r8 = new X.0m4s
            r8.<init>(r9, r10)
            goto L12
        L7a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "loadMoreInternal: "
            r1.append(r0)
            int r0 = r3.size()
            r1.append(r0)
            java.lang.String r0 = " pageIndex:"
            r1.append(r0)
            int r0 = r9.LJIIJ
            r1.append(r0)
            java.lang.String r0 = " pageSize:"
            r1.append(r0)
            r1.append(r4)
            X.C2188811AlT.LIZIZ(r1)
            int r0 = r9.LJIIJ
            int r0 = r0 + 1
            r9.LJIIJ = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            return r0
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb3:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Weight sort mode not support load more!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1382380m4q.LJI(X.05Vn):java.lang.Object");
    }
}
