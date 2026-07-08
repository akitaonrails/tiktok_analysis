package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.04Dr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1062904Dr extends LinearLayout implements C04EW {
    public static final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final float LLILZLL = C418440Gaw.LIZIZ(200);
    public final LinearLayout LL;
    public final LinearLayout LLILLJJLI;
    public final LinkedList<View> LLILLL;
    public final C1063104Dt LLILZ;

    public C1062904Dr(Context context) {
        super(context, null);
        this.LLILLL = new LinkedList<>();
        this.LLILZ = new C1063104Dt(this);
        int i = LLILZIL;
        setPadding(i, 0, i, 0);
        setOrientation(1);
        setGravity(17);
        C427690Gpr.LJ(this, LLILZLL);
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        this.LL = linearLayout;
        addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context);
        C786410Ut5.d6(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        this.LLILLJJLI = linearLayout2;
        addView(linearLayout2);
    }

    @Override // X.C04EW
    public final void LLF(C1063004Ds c1063004Ds) {
        boolean z;
        Integer numLIZLLL;
        Integer numLIZLLL2;
        List<C1062804Dq> list;
        this.LLILZ.LIZIZ(c1063004Ds);
        this.LLILZ.LIZ(c1063004Ds);
        LinearLayout linearLayout = this.LL;
        LinkedList<View> linkedList = this.LLILLL;
        while (true) {
            z = false;
            if (linearLayout.getChildCount() <= 0) {
                break;
            }
            View childAt = linearLayout.getChildAt(0);
            C786410Ut5.LJJJLZIJ(childAt, linearLayout);
            if (childAt instanceof View) {
                linkedList.add(childAt);
            }
        }
        LinearLayout linearLayout2 = this.LLILLJJLI;
        LinkedList<View> linkedList2 = this.LLILLL;
        while (linearLayout2.getChildCount() > 0) {
            View childAt2 = linearLayout2.getChildAt(0);
            C786410Ut5.LJJJLZIJ(childAt2, linearLayout2);
            if (childAt2 instanceof View) {
                linkedList2.add(childAt2);
            }
        }
        List<C1062804Dq> list2 = c1063004Ds.LJFF;
        if (list2 != null && list2.size() == 1 && ((list = c1063004Ds.LJII) == null || list.isEmpty())) {
            z = true;
        }
        List<C1062804Dq> list3 = c1063004Ds.LJFF;
        Integer num = null;
        if (list3 != null) {
            for (C1062804Dq c1062804Dq : list3) {
                String str = c1063004Ds.LJIILLIIL;
                CommonColor commonColor = c1063004Ds.LJI;
                if (commonColor != null) {
                    C1055504Av c1055504Av = C1055504Av.LIZ;
                    Context context = getContext();
                    c1055504Av.getClass();
                    numLIZLLL2 = C1055504Av.LIZLLL(context, commonColor);
                } else {
                    numLIZLLL2 = null;
                }
                View viewLIZ = LIZ(this, c1062804Dq, z, false, str, numLIZLLL2, null, 32);
                if (viewLIZ != null) {
                    this.LL.addView(viewLIZ);
                }
            }
        }
        List<C1062804Dq> list4 = c1063004Ds.LJII;
        if (list4 != null) {
            for (C1062804Dq c1062804Dq2 : list4) {
                String str2 = c1063004Ds.LJIILLIIL;
                CommonColor commonColor2 = c1063004Ds.LJIIIIZZ;
                if (commonColor2 != null) {
                    C1055504Av c1055504Av2 = C1055504Av.LIZ;
                    Context context2 = getContext();
                    c1055504Av2.getClass();
                    numLIZLLL = C1055504Av.LIZLLL(context2, commonColor2);
                } else {
                    numLIZLLL = num;
                }
                num = num;
                View viewLIZ2 = LIZ(this, c1062804Dq2, false, true, str2, num, numLIZLLL, 16);
                if (viewLIZ2 != null) {
                    this.LLILLJJLI.addView(viewLIZ2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
    
        if (r1 == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View LIZ(X.C1062904Dr r4, X.C1062804Dq r5, boolean r6, boolean r7, java.lang.String r8, java.lang.Integer r9, java.lang.Integer r10, int r11) {
        /*
            r0 = r11 & 16
            r3 = 0
            if (r0 == 0) goto L6
            r9 = r3
        L6:
            r0 = r11 & 32
            if (r0 == 0) goto Lb
            r10 = r3
        Lb:
            r4.getClass()
            if (r5 == 0) goto L5b
            java.lang.Integer r2 = r5.LIZ
            if (r2 == 0) goto L5b
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L61
            java.util.LinkedList<android.view.View> r0 = r4.LLILLL
            java.util.Iterator r2 = r0.iterator()
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C10505048x
            if (r0 == 0) goto L21
        L2f:
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L38
            java.util.LinkedList<android.view.View> r0 = r4.LLILLL
            r0.remove(r1)
        L38:
            boolean r0 = r1 instanceof X.C10505048x
            if (r0 == 0) goto L3d
            r3 = r1
        L3d:
            X.048x r3 = (X.C10505048x) r3
            if (r3 != 0) goto L4a
            X.048x r3 = new X.048x
            android.content.Context r0 = r4.getContext()
            r3.<init>(r0)
        L4a:
            r3.LJJJJJ(r9, r10, r7, r6)
            java.lang.String r0 = r5.LIZIZ
            r3.setText(r0)
            if (r8 == 0) goto L5b
            if (r7 == 0) goto L5c
            java.lang.String r0 = "buy_button_sub_desc"
        L58:
            X.C1757010vp5.LIZJ(r3, r8, r0)
        L5b:
            return r3
        L5c:
            java.lang.String r0 = "buy_button_desc"
            goto L58
        L5f:
            r1 = r3
            goto L2f
        L61:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L5b
            java.util.LinkedList<android.view.View> r0 = r4.LLILLL
            java.util.Iterator r2 = r0.iterator()
        L6e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C049U
            if (r0 == 0) goto L6e
        L7c:
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L85
            java.util.LinkedList<android.view.View> r0 = r4.LLILLL
            r0.remove(r1)
        L85:
            boolean r0 = r1 instanceof X.C049U
            if (r0 == 0) goto L8c
            r3 = r1
            if (r1 != 0) goto L5b
        L8c:
            X.049U r3 = new X.049U
            android.content.Context r0 = r4.getContext()
            r3.<init>(r0)
            return r3
        L96:
            r1 = r3
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1062904Dr.LIZ(X.04Dr, X.04Dq, boolean, boolean, java.lang.String, java.lang.Integer, java.lang.Integer, int):android.view.View");
    }
}
