package X;

import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM$toggleFavorite$1$1$2", f = "BookDetailVM.kt", l = {}, m = "invokeSuspend")
public final class C613350O3x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BookDetailVM LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0O7A<? extends C0O3E> LLILZ;
    public final /* synthetic */ InterfaceC497601wk LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613350O3x(BookDetailVM bookDetailVM, boolean z, String str, C0O7A<? extends C0O3E> c0o7a, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C613350O3x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bookDetailVM;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = c0o7a;
        this.LLILZIL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C613350O3x(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "BookDetailVM@4059.toggleFavorite$1$1$2"
            X.C1C7U.LIZ(r8)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM r0 = r9.LL
            X.002o r0 = r0.getState()
            X.0O46 r0 = (X.C0O46) r0
            boolean r3 = r0.LLILLJJLI
            com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM r1 = r9.LL
            boolean r0 = r1.LLILLJJLI
            r2 = 0
            if (r3 == r0) goto L92
            X.002o r0 = r1.getState()
            X.0O46 r0 = (X.C0O46) r0
            boolean r0 = r0.LLILLJJLI
            r1.LLILLJJLI = r0
            X.0O4K r3 = X.C0O4K.BOOK
            com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM r0 = r9.LL
            java.lang.String r1 = r0.vQ2()
            boolean r0 = r9.LLILLJJLI
            r0 = r0 ^ 1
            X.C0O4L.LIZLLL(r3, r1, r0)
            com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM r0 = r9.LL
            boolean r1 = r0.LLILLJJLI
            java.lang.String r7 = r0.vQ2()
            java.lang.String r6 = r9.LLILLL
            X.0O7A<? extends X.0O3E> r0 = r9.LLILZ
            X.0O79 r0 = (X.C0O79) r0
            D extends X.0O5h r5 = r0.LJ
            X.0O3E r5 = (X.C0O3E) r5
            if (r1 == 0) goto Laf
            java.lang.String r3 = "favorite_topic"
        L4b:
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            if (r1 == 0) goto Lac
            java.lang.String r1 = "favorite_from"
        L54:
            java.lang.String r0 = "detail_page"
            r4.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "book_id"
            r4.LJIIIIZZ(r0, r7)
            java.lang.String r0 = "book_title"
            r4.LJIIIIZZ(r0, r6)
            boolean r0 = r5 instanceof X.C613230O3l
            if (r0 == 0) goto L9d
            X.0O3l r5 = (X.C613230O3l) r5
            com.ss.android.ugc.aweme.base.api.BaseResponse r0 = r5.LIZ
            if (r0 == 0) goto Laa
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r0.extra
            if (r0 == 0) goto Laa
            java.lang.String r0 = r0.logid
        L73:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r1 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r1.<init>()
            r1.setImprId(r0)
            X.0NyV r0 = X.C584850Mwl.LIZ
            java.lang.String r1 = r0.LIZ(r1)
            java.lang.String r0 = "log_pb"
            r4.LJIIIIZZ(r0, r1)
            java.lang.String r1 = "category"
            java.lang.String r0 = "book"
            r4.LJIIIIZZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.LIZ
            X.C20684815ws.LJIILLIIL(r3, r0)
        L92:
            X.01wk r0 = r9.LLILZIL
            X.C2296808zG.LIZJ(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L9d:
            X.0O3m r5 = (X.C613240O3m) r5
            com.ss.android.ugc.aweme.base.api.BaseResponse r0 = r5.LIZ
            if (r0 == 0) goto Laa
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r0.extra
            if (r0 == 0) goto Laa
            java.lang.String r0 = r0.logid
            goto L73
        Laa:
            r0 = r2
            goto L73
        Lac:
            java.lang.String r1 = "cancel_from"
            goto L54
        Laf:
            java.lang.String r3 = "cancel_favorite_book"
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613350O3x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
