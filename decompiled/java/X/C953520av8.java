package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: renamed from: X.0av8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953520av8 extends AbstractC960470b6L<C953540avA> {
    public final Function0<C953400auw> LL;
    public final C1324720kZq LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final TextView LLILZLL;

    public final void L5(C953540avA c953540avA) {
        if (c953540avA.LIZIZ) {
            View view = this.LLILLL;
            if (view != null) {
                C12ES.LJIILL(0, view);
            }
        } else {
            View view2 = this.LLILLL;
            if (view2 != null) {
                C12ES.LJIILL(4, view2);
            }
        }
        View view3 = this.itemView;
        if (view3 != null) {
            C500260Jjc.LJLIIIL(500L, view3, new AwS381S0200000_15(this, c953540avA, 84));
        }
    }

    public C953520av8(View view, Function0<C953400auw> function0) {
        super(view);
        this.LL = function0;
        this.LLILLJJLI = (C1324720kZq) view.findViewById(R.id.kb6);
        this.LLILLL = view.findViewById(R.id.bnu);
        this.LLILZ = view.findViewById(R.id.l34);
        this.LLILZIL = view.findViewById(R.id.l35);
        this.LLILZLL = (TextView) view.findViewById(R.id.l45);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[PHI: r1
      0x0030: PHI (r1v8 java.lang.String) = (r1v6 java.lang.String), (r1v9 java.lang.String) binds: [B:12:0x002e, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC960470b6L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(int r8, java.lang.Object r9) {
        /*
            r7 = this;
            X.0avA r9 = (X.C953540avA) r9
            r7.L5(r9)
            X.0avB r1 = r9.LIZ
            android.view.View r3 = r7.LLILZ
            if (r3 == 0) goto L17
            kotlin.jvm.internal.AwS381S0200000_15 r2 = new kotlin.jvm.internal.AwS381S0200000_15
            r0 = 83
            r2.<init>(r7, r1, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            X.C500260Jjc.LJLIIIL(r0, r3, r2)
        L17:
            android.widget.TextView r6 = r7.LLILZLL
            r3 = 1
            r5 = 0
            if (r6 == 0) goto L45
            java.lang.Object[] r4 = new java.lang.Object[r3]
            X.0avB r0 = r9.LIZ
            webcast.data.multi_guest_play.NoticeboardTemplate r0 = r0.LIZ
            webcast.data.multi_guest_play.SimpleUser r0 = r0.authorInfo
            java.lang.String r2 = ""
            if (r0 == 0) goto L2d
            java.lang.String r1 = r0.displayId
            if (r1 != 0) goto L30
        L2d:
            r1 = r2
            if (r0 == 0) goto L35
        L30:
            java.lang.String r0 = r0.nickname
            if (r0 == 0) goto L35
            r2 = r0
        L35:
            java.lang.String r0 = X.C0KVU.LIZIZ(r1, r2)
            r4[r5] = r0
            r0 = 2131854975(0x7f11867f, float:1.934364E38)
            java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r4)
            r6.setText(r0)
        L45:
            X.0kZq r2 = r7.LLILLJJLI
            X.0avB r0 = r9.LIZ
            webcast.data.multi_guest_play.NoticeboardTemplate r0 = r0.LIZ
            webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo r0 = r0.convertNoticeboardMaterialInfo
            if (r0 == 0) goto Lbf
            java.lang.String r1 = r0.thumbCoverImageUrl
        L51:
            if (r2 == 0) goto L6d
            if (r1 == 0) goto L6d
            X.0JBN r0 = X.C1819620xS4.LIZ()
            X.0kZf r1 = r0.setUrl(r1)
            r1.LJJIFFI = r3
            r0 = 2130976038(0x7f041d26, float:1.7560944E38)
            r1.LJIIIZ = r0
            r0 = 360(0x168, float:5.04E-43)
            r1.LJI = r0
            r1.LJII = r0
            r1.LJJI(r2)
        L6d:
            X.0avB r5 = r9.LIZ
            kotlin.jvm.functions.Function0<X.0auw> r0 = r7.LL
            java.lang.Object r0 = r0.invoke()
            X.0auw r0 = (X.C953400auw) r0
            if (r0 == 0) goto Lbb
            java.util.HashSet<java.lang.Long> r2 = r0.LJ
            if (r2 == 0) goto Lbb
            webcast.data.multi_guest_play.NoticeboardTemplate r0 = r5.LIZ
            long r0 = r0.noticeboardTemplateId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto Lbb
            int r0 = r5.LIZIZ
            if (r0 != 0) goto Lbc
            java.lang.String r4 = "personal"
        L91:
            X.0bOA r3 = X.EnumC971520bOA.SHOW
            webcast.data.multi_guest_play.NoticeboardTemplate r0 = r5.LIZ
            long r0 = r0.noticeboardTemplateId
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.0aUx r1 = X.EnumC937290aUx.DESIGN_PAGE
            java.lang.String r0 = "in_spots"
            X.C946850akN.LJIIIZ(r3, r2, r4, r1, r0)
            kotlin.jvm.functions.Function0<X.0auw> r0 = r7.LL
            java.lang.Object r0 = r0.invoke()
            X.0auw r0 = (X.C953400auw) r0
            if (r0 == 0) goto Lbb
            java.util.HashSet<java.lang.Long> r2 = r0.LJ
            if (r2 == 0) goto Lbb
            webcast.data.multi_guest_play.NoticeboardTemplate r0 = r5.LIZ
            long r0 = r0.noticeboardTemplateId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.add(r0)
        Lbb:
            return
        Lbc:
            java.lang.String r4 = "recommend"
            goto L91
        Lbf:
            r1 = 0
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C953520av8.I5(int, java.lang.Object):void");
    }
}
