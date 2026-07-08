package X;

import android.R;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager;

/* JADX INFO: renamed from: X.0ktW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336920ktW implements InterfaceC1584740rLE {
    public final /* synthetic */ BaseLynxViewPager<C1336770ktH, AbstractC1336950ktZ<Object>> LL;

    @Override // X.InterfaceC1586460rO0
    public final void ih(C19U0 c19u0) {
    }

    public C1336920ktW(BaseLynxViewPager<C1336770ktH, AbstractC1336950ktZ<Object>> baseLynxViewPager) {
        this.LL = baseLynxViewPager;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    @Override // X.InterfaceC1586460rO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oq(X.C19U0 r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L4d
            android.view.View r1 = r8.LJFF
            if (r1 == 0) goto L4d
            r0 = 16908308(0x1020014, float:2.3877285E-38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L4d
            com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager<X.0ktH, X.0ktZ<java.lang.Object>> r6 = r7.LL
            X.0ktZ r0 = r6.LJJIJ()
            r0.setSelectedTextStyle(r1)
            boolean r0 = r6.LL
            if (r0 == 0) goto L4d
            java.lang.CharSequence r0 = r1.getText()
            java.lang.String r5 = r0.toString()
            X.0ktZ r0 = r6.LJJIJ()
            X.19U1 r4 = r0.getMTabLayout()
            r3 = 0
            if (r4 == 0) goto L60
            int r2 = r4.getTabCount()
            r1 = 0
        L36:
            if (r1 >= r2) goto L60
            if (r4 == 0) goto L5d
            X.19U0 r0 = r4.getTabAt(r1)
            if (r0 == 0) goto L5d
            if (r0 != r8) goto L5d
        L42:
            boolean r0 = r6.LLILZIL
            if (r0 == 0) goto L53
            java.lang.String r0 = ""
        L48:
            r6.sendTabChangeEvent(r5, r1, r0)
            r6.LLILZIL = r3
        L4d:
            com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager<X.0ktH, X.0ktZ<java.lang.Object>> r1 = r7.LL
            r0 = 0
            r1.LLILZ = r0
            return
        L53:
            X.19U0 r0 = r6.LLILZ
            if (r0 != r8) goto L5a
            java.lang.String r0 = "click"
            goto L48
        L5a:
            java.lang.String r0 = "slide"
            goto L48
        L5d:
            int r1 = r1 + 1
            goto L36
        L60:
            r1 = 0
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1336920ktW.Oq(X.19U0):void");
    }

    @Override // X.InterfaceC1586460rO0
    public final void Yn(C19U0 c19u0) {
        View view;
        TextView textView;
        if (c19u0 != null && (view = c19u0.LJFF) != null && (textView = (TextView) view.findViewById(R.id.text1)) != null) {
            this.LL.LJJIJ().setUnSelectedTextStyle(textView);
        }
    }
}
