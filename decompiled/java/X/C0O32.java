package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O32, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.book.anchor.BookAnchorBusinessService$handleIconClick$1$1$2", f = "BookAnchorBusinessService.kt", l = {}, m = "invokeSuspend")
public final class C0O32 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C613410O4d LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AnchorCommonStruct LLILZ;
    public final /* synthetic */ C0O7A<? extends C0O3E> LLILZIL;
    public final /* synthetic */ InterfaceC497601wk LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O32(boolean z, C613410O4d c613410O4d, String str, AnchorCommonStruct anchorCommonStruct, C0O7A<? extends C0O3E> c0o7a, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0O32> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c613410O4d;
        this.LLILLL = str;
        this.LLILZ = anchorCommonStruct;
        this.LLILZIL = c0o7a;
        this.LLILZLL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O32(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "BookAnchorBusinessService@cb1.handleIconClick$1$1$2"
            X.C1C7U.LIZ(r8)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r10)
            boolean r0 = r9.LL
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.0O4d r0 = r9.LLILLJJLI
            java.lang.Boolean r0 = r0.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = 0
            if (r0 != 0) goto La2
            X.0O4d r1 = r9.LLILLJJLI
            boolean r0 = r9.LL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.LIZIZ = r0
            X.0O4d r3 = r9.LLILLJJLI
            java.lang.String r1 = r9.LLILLL
            java.lang.Boolean r0 = r3.LIZIZ
            if (r0 == 0) goto Lc2
            boolean r0 = r0.booleanValue()
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.LJIIL(r0, r1)
            X.0O4d r0 = r9.LLILLJJLI
            java.lang.Boolean r0 = r0.LIZIZ
            boolean r1 = r0.booleanValue()
            java.lang.String r7 = r9.LLILLL
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r9.LLILZ
            if (r0 == 0) goto L4d
            java.lang.String r6 = r0.getKeyword()
            if (r6 != 0) goto L4f
        L4d:
            java.lang.String r6 = ""
        L4f:
            X.0O7A<? extends X.0O3E> r0 = r9.LLILZIL
            X.0O79 r0 = (X.C0O79) r0
            D extends X.0O5h r5 = r0.LJ
            X.0O3E r5 = (X.C0O3E) r5
            if (r1 == 0) goto Lbf
            java.lang.String r3 = "favorite_topic"
        L5b:
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            if (r1 == 0) goto Lbc
            java.lang.String r1 = "favorite_from"
        L64:
            java.lang.String r0 = "book_panel_show"
            r4.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "book_id"
            r4.LJIIIIZZ(r0, r7)
            java.lang.String r0 = "book_title"
            r4.LJIIIIZZ(r0, r6)
            java.lang.String r1 = "category"
            java.lang.String r0 = "book"
            r4.LJIIIIZZ(r1, r0)
            boolean r0 = r5 instanceof X.C613230O3l
            if (r0 == 0) goto Lad
            X.0O3l r5 = (X.C613230O3l) r5
            com.ss.android.ugc.aweme.base.api.BaseResponse r0 = r5.LIZ
            if (r0 == 0) goto Lba
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r0.extra
            if (r0 == 0) goto Lba
            java.lang.String r0 = r0.logid
        L8a:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r1 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r1.<init>()
            r1.setImprId(r0)
            X.0NyV r0 = X.C584850Mwl.LIZ
            java.lang.String r1 = r0.LIZ(r1)
            java.lang.String r0 = "log_pb"
            r4.LJIIIIZZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.LIZ
            X.C20684815ws.LJIILLIIL(r3, r0)
        La2:
            X.01wk r0 = r9.LLILZLL
            X.C2296808zG.LIZJ(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        Lad:
            X.0O3m r5 = (X.C613240O3m) r5
            com.ss.android.ugc.aweme.base.api.BaseResponse r0 = r5.LIZ
            if (r0 == 0) goto Lba
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r0.extra
            if (r0 == 0) goto Lba
            java.lang.String r0 = r0.logid
            goto L8a
        Lba:
            r0 = r2
            goto L8a
        Lbc:
            java.lang.String r1 = "cancel_from"
            goto L64
        Lbf:
            java.lang.String r3 = "cancel_favorite_book"
            goto L5b
        Lc2:
            boolean r0 = r9.LL
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O32.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
