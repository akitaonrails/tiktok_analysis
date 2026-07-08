package X;

import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hgz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment$onViewCreated$3", f = "CommentLongPressFragment.kt", l = {243, 245}, m = "invokeSuspend")
public final class C447670Hgz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommentLongPressFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C447670Hgz(CommentLongPressFragment commentLongPressFragment, InterfaceC1364105Vn<? super C447670Hgz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commentLongPressFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C447670Hgz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "CommentLongPressFragment@922.onViewCreated$3"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LL
            r6 = 0
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L4b
            if (r0 != r4) goto L6d
            X.C155000ia.LIZIZ(r9)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment r0 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.LLJ
            if (r0 == 0) goto L49
            com.ss.android.ugc.aweme.comment.model.CommentStickerStruct r0 = r0.getStickerStruct()
            if (r0 == 0) goto L49
            java.lang.String r1 = r0.getId()
            if (r1 == 0) goto L49
            X.0HY9 r0 = com.ss.android.ugc.aweme.util.IStickerStoreHelper.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.util.IStickerStoreHelper r0 = X.C0HY9.LIZ()
            if (r0 == 0) goto L49
            r8.LL = r2
            java.lang.Object r9 = r0.LIZ(r1, r8)
            if (r9 != r5) goto L4e
            X.C1C7U.LIZIZ(r7)
            return r5
        L49:
            r3 = 0
            goto L56
        L4b:
            X.C155000ia.LIZIZ(r9)
        L4e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L49
            boolean r3 = r9.booleanValue()
        L56:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0l8b r1 = new X.0l8b
            com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment r0 = r8.LLILLJJLI
            r1.<init>(r0, r3, r6)
            r8.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r8, r2, r1)
            if (r0 != r5) goto L17
            X.C1C7U.LIZIZ(r7)
            return r5
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447670Hgz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
