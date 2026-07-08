package Y;

import X.C1257500ipQ;
import X.C1257620ipc;
import X.C1257950iq9;
import X.InterfaceC1258060iqK;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness;

/* JADX INFO: loaded from: classes20.dex */
public class ACListenerS10S0401000_19 implements View.OnClickListener {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS10S0401000_19 aCListenerS10S0401000_19, View view) {
        ((InterfaceC1258060iqK) aCListenerS10S0401000_19.l0).LJIIJJI(((C1257950iq9) aCListenerS10S0401000_19.l1).LIZ);
        ViewPager viewPager = (ViewPager) aCListenerS10S0401000_19.l2;
        if (viewPager != null) {
            viewPager.setCurrentItem(aCListenerS10S0401000_19.i4);
        }
        ((C1257500ipQ) aCListenerS10S0401000_19.l3).getClass();
        C1257500ipQ.LJII(view);
        ProfileTabBaseBusiness profileTabBaseBusiness = ((C1257620ipc) ((C1257950iq9) aCListenerS10S0401000_19.l1)).LJIIIZ;
        if (profileTabBaseBusiness != null) {
            profileTabBaseBusiness.st2(view);
        }
        ((C1257500ipQ) aCListenerS10S0401000_19.l3).getTextNavigatorScrollable();
    }

    public static final void onClick$1(ACListenerS10S0401000_19 aCListenerS10S0401000_19, View view) {
        ((InterfaceC1258060iqK) aCListenerS10S0401000_19.l3).LJIIJJI(((C1257950iq9) aCListenerS10S0401000_19.l0).LIZ);
        ViewPager viewPager = (ViewPager) aCListenerS10S0401000_19.l1;
        if (viewPager != null) {
            viewPager.setCurrentItem(aCListenerS10S0401000_19.i4);
        }
        ((C1257500ipQ) aCListenerS10S0401000_19.l2).getClass();
        C1257500ipQ.LJII(view);
        ITabBusinessListener iTabBusinessListenerLIZ = ((C1257950iq9) aCListenerS10S0401000_19.l0).LIZ();
        if (iTabBusinessListenerLIZ != null) {
            iTabBusinessListenerLIZ.st2(view);
        }
        ((C1257500ipQ) aCListenerS10S0401000_19.l2).getTextNavigatorScrollable();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS10S0401000_19(int r2, X.C117P r3, X.C1257950iq9 r4, X.C1257500ipQ r5, X.InterfaceC1258060iqK r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            if (r7 == 0) goto L13
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.i4 = r2
            r0.l2 = r5
            r0.l3 = r6
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r6
            r0.l1 = r4
            r0.l2 = r3
            r0.i4 = r2
            r0.l3 = r5
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS10S0401000_19.<init>(int, X.117P, X.0iq9, X.0ipQ, X.0iqK, int):void");
    }
}
