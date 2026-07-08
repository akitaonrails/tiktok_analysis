package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hgx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.photocomment.component.CommentImageComponent$bindCommentStickerLegacy$4$onComplete$2$1", f = "CommentImageComponent.kt", l = {1221, 1223}, m = "invokeSuspend")
public final class C447650Hgx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommentStickerStruct LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ C1341150l0L LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C447650Hgx(CommentStickerStruct commentStickerStruct, Map<String, String> map, C1341150l0L c1341150l0L, View view, InterfaceC1364105Vn<? super C447650Hgx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commentStickerStruct;
        this.LLILLL = map;
        this.LLILZ = c1341150l0L;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C447650Hgx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r5 = "CommentImageComponent@3874.bindCommentStickerLegacy$4$onComplete$2$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r13.LL
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L1c
            if (r0 == r4) goto L40
            if (r0 != r3) goto L69
            X.C155000ia.LIZIZ(r14)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r14)
            com.ss.android.ugc.aweme.comment.model.CommentStickerStruct r0 = r13.LLILLJJLI
            java.lang.String r1 = r0.getId()
            if (r1 == 0) goto L3e
            X.0HY9 r0 = com.ss.android.ugc.aweme.util.IStickerStoreHelper.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.util.IStickerStoreHelper r0 = X.C0HY9.LIZ()
            if (r0 == 0) goto L3e
            r13.LL = r4
            java.lang.Object r14 = r0.LIZ(r1, r13)
            if (r14 != r2) goto L43
            X.C1C7U.LIZIZ(r5)
            return r2
        L3e:
            r11 = 0
            goto L4b
        L40:
            X.C155000ia.LIZIZ(r14)
        L43:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            if (r14 == 0) goto L3e
            boolean r11 = r14.booleanValue()
        L4b:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0Hrx r6 = new X.0Hrx
            java.util.Map<java.lang.String, java.lang.String> r7 = r13.LLILLL
            X.0l0L r8 = r13.LLILZ
            com.ss.android.ugc.aweme.comment.model.CommentStickerStruct r9 = r13.LLILLJJLI
            android.view.View r10 = r13.LLILZIL
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r13, r0, r6)
            if (r0 != r2) goto L16
            X.C1C7U.LIZIZ(r5)
            return r2
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447650Hgx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
