package X;

import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21274018Ne extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ ProductListModel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21274018Ne(int i, ProductListModel productListModel, Integer num, String str, String str2, String str3, List list) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = list;
        this.LLILZIL = num;
        this.LLILZLL = i;
        this.LLIZ = productListModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C957403oi r9) {
        /*
            r8 = this;
            X.03oi r9 = (X.C957403oi) r9
            java.lang.String r1 = "EVENT_ORIGIN_FEATURE"
            java.lang.String r0 = "TEMAI"
            r9.LIZLLL(r1, r0)
            java.lang.String r1 = r8.LL
            if (r1 == 0) goto L12
            java.lang.String r0 = "enter_from"
            r9.LIZLLL(r0, r1)
        L12:
            java.lang.String r1 = r8.LLILLJJLI
            if (r1 == 0) goto L1b
            java.lang.String r0 = "author_id"
            r9.LIZLLL(r0, r1)
        L1b:
            java.lang.String r1 = r8.LLILLL
            if (r1 == 0) goto L24
            java.lang.String r0 = "group_id"
            r9.LIZLLL(r0, r1)
        L24:
            java.util.List<java.lang.String> r0 = r8.LLILZ
            java.lang.String r1 = ","
            r2 = 0
            r4 = 0
            r7 = 62
            r3 = r2
            r5 = r2
            r6 = r2
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "product_ids"
            r9.LIZLLL(r0, r1)
            java.lang.Integer r1 = r8.LLILZIL
            if (r1 == 0) goto L44
            r1.intValue()
            java.lang.String r0 = "req_type"
            r9.LIZLLL(r0, r1)
        L44:
            int r0 = r8.LLILZLL
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "scene"
            r9.LIZLLL(r0, r1)
            com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r0 = r8.LLIZ
            if (r0 == 0) goto L68
            com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig r0 = r0.panelConfig
            if (r0 == 0) goto L68
            boolean r1 = r0.panelFullScreen
            r0 = 1
            if (r1 != r0) goto L68
        L5c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_full_page"
            r9.LIZLLL(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L68:
            r0 = 0
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21274018Ne.invoke(java.lang.Object):java.lang.Object");
    }
}
