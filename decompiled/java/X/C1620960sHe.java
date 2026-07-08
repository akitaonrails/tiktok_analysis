package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620960sHe implements C0TVI {
    public final int $t;
    public Object l0;

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        switch (this.$t) {
            case 0:
                return onApplyWindowInsets$0(this, view, c20246014Ju);
            case 1:
                return onApplyWindowInsets$1(this, view, c20246014Ju);
            case 2:
                return onApplyWindowInsets$2(this, view, c20246014Ju);
            default:
                return null;
        }
    }

    public C1620960sHe(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C20246014Ju onApplyWindowInsets$0(X.C1620960sHe r5, android.view.View r6, X.C20246014Ju r7) {
        /*
            r0 = 7
            X.14Jj r4 = r7.LIZ(r0)
            int r3 = r4.LIZ
            int r2 = r4.LIZIZ
            int r1 = r4.LIZJ
            int r0 = r4.LIZLLL
            r6.setPadding(r3, r2, r1, r0)
            X.0ZNh r0 = com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi r0 = X.C898670ZNh.LIZIZ()
            if (r0 == 0) goto L99
            boolean r1 = r0.LIZLLL()
            r0 = 1
            if (r1 != r0) goto L99
        L22:
            if (r0 == 0) goto L67
            java.lang.Object r4 = r5.l0
            com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailLogicAssem r4 = (com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailLogicAssem) r4
            X.16GW r0 = r4.Go()
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            boolean r0 = r3 instanceof X.C16G1
            if (r0 == 0) goto L4c
            X.16G1 r3 = (X.C16G1) r3
            if (r3 == 0) goto L4c
            com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.NavBarMaximumScrollableBehavior r2 = new com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.NavBarMaximumScrollableBehavior
            X.01GW r0 = r4.LLJILJIL
            java.lang.Object r1 = r0.getValue()
            com.bytedance.tux.navigation.TuxNavBar r1 = (com.bytedance.tux.navigation.TuxNavBar) r1
            X.16GW r0 = r4.Go()
            r2.<init>(r1, r0)
            r3.LIZIZ(r2)
        L4c:
            java.lang.Object r3 = r5.l0
            com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailLogicAssem r3 = (com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailLogicAssem) r3
            android.view.View r1 = r3.LJJIJL()
            r0 = 2131369831(0x7f0a1f67, float:1.8359651E38)
            android.view.View r2 = r1.findViewById(r0)
            if (r2 == 0) goto L66
            Y.ARunnableS81S0200000_12 r1 = new Y.ARunnableS81S0200000_12
            r0 = 2
            r1.<init>(r3, r2, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
        L66:
            return r7
        L67:
            java.lang.Object r6 = r5.l0
            com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailLogicAssem r6 = (com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.ChatDetailLogicAssem) r6
            int r5 = r4.LIZIZ
            int r0 = r4.LIZLLL
            int r5 = r5 + r0
            X.16GW r0 = r6.Go()
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            boolean r0 = r4 instanceof X.C16G1
            if (r0 == 0) goto L66
            X.16G1 r4 = (X.C16G1) r4
            if (r4 == 0) goto L66
            com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.MaximumScrollableBehavior r3 = new com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.MaximumScrollableBehavior
            X.01GW r0 = r6.LLJ
            java.lang.Object r2 = r0.getValue()
            X.15jv r2 = (X.ViewOnAttachStateChangeListenerC20604515jv) r2
            X.16GW r1 = r6.Go()
            android.view.View r0 = r6.LJJIJL()
            r3.<init>(r2, r1, r0, r5)
            r4.LIZIZ(r3)
            return r7
        L99:
            r0 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620960sHe.onApplyWindowInsets$0(X.0sHe, android.view.View, X.14Ju):X.14Ju");
    }

    public static final C20246014Ju onApplyWindowInsets$1(C1620960sHe c1620960sHe, View view, C20246014Ju c20246014Ju) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        ((MainPageFragment) c1620960sHe.l0).getClass();
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LLLIIII() && (i2 = c20244914JjLIZ.LIZLLL) > 0) {
            ((MainPageFragment) c1620960sHe.l0).LLILZIL = i2;
        }
        ((MainPageFragment) c1620960sHe.l0).getClass();
        if (c19252910Tv.LIZLLL().LJIJI().LLLIIII()) {
            i = ((MainPageFragment) c1620960sHe.l0).LLILZIL;
        } else {
            i = c20244914JjLIZ.LIZLLL;
        }
        View view2 = ((MainPageFragment) c1620960sHe.l0).LLILZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = ((MainPageFragment) c1620960sHe.l0).LLILZ;
        if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
            layoutParams.height = i;
        }
        C426750GoL.LJIIL(view, null, null, null, Integer.valueOf(i), 23);
        ((MainPageFragment) c1620960sHe.l0).UR();
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$2(C1620960sHe c1620960sHe, View view, C20246014Ju c20246014Ju) {
        ((Function2) c1620960sHe.l0).invoke(view, c20246014Ju);
        return c20246014Ju;
    }
}
