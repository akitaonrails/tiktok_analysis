package X;

import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Qt6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendCell$bindEndArea$2", f = "SearchFriendCell.kt", l = {}, m = "invokeSuspend")
public final class C684500Qt6 extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ SearchFriendCell LL;
    public final /* synthetic */ C1261050iv9 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C684500Qt6(SearchFriendCell searchFriendCell, C1261050iv9 c1261050iv9, InterfaceC1364105Vn<? super C684500Qt6> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = searchFriendCell;
        this.LLILLJJLI = c1261050iv9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C684500Qt6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "SearchFriendCell@cfbc.bindEndArea$2"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r8)
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendCell r1 = r7.LL
            X.0iv9 r0 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.profile.model.User r4 = r0.LL
            android.view.View r1 = r1.itemView
            r0 = 2131388127(0x7f0a66df, float:1.839676E38)
            android.view.View r5 = r1.findViewById(r0)
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            int r1 = r4.getFollowStatus()
            r3 = 0
            if (r1 == 0) goto L8a
            r0 = 1
            java.lang.String r4 = ""
            if (r1 == r0) goto L66
            r0 = 2
            if (r1 == r0) goto L87
            r0 = 4
            if (r1 == r0) goto L84
        L33:
            java.lang.String r0 = "button_type"
            r2.LJIIIIZZ(r0, r4)
            X.0iv9 r0 = r7.LLILLJJLI
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.LLILLJJLI
            r2.LJII(r0)
            X.1ER1 r1 = X.C1ER1.LIZIZ
            com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendCell r0 = r7.LL
            X.0zJl r0 = r0.getItem()
            X.0iv9 r0 = (X.C1261050iv9) r0
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.LL
        L4d:
            java.lang.Integer r1 = r1.LJJIJ(r3)
            java.lang.String r0 = "relation_tag"
            r2.LJ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "search_result_click"
            X.C20684815ws.LJIILLIIL(r0, r1)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C1C7U.LIZIZ(r6)
            return r0
        L66:
            android.content.Context r1 = r5.getContext()
            r0 = 2131834790(0x7f1137a6, float:1.93027E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.CharSequence r0 = r5.getText()
            if (r0 == 0) goto L7e
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L7e
            r4 = r0
        L7e:
            boolean r0 = kotlin.text.u.LJIILJJIL(r4, r1)
            if (r0 == 0) goto L87
        L84:
            java.lang.String r4 = "click_cancel_follow"
            goto L33
        L87:
            java.lang.String r4 = "click_message"
            goto L33
        L8a:
            boolean r0 = r4.isAccuratePrivateAccount()
            if (r0 == 0) goto L93
            java.lang.String r4 = "click_request"
            goto L33
        L93:
            java.lang.String r4 = "click_follow_button"
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C684500Qt6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
