package X;

import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;

/* JADX INFO: renamed from: X.0Xg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854830Xg9 extends C20094213jo {
    public final int $t;
    public Object l0;

    @Override // X.C20094213jo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        switch (this.$t) {
            case 0:
                return performAccessibilityAction$0(this, view, i, bundle);
            case 1:
                return performAccessibilityAction$1(this, view, i, bundle);
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public C854830Xg9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[PHI: r3
      0x0035: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v4 android.view.View) binds: [B:11:0x0022, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean performAccessibilityAction$0(X.C854830Xg9 r2, android.view.View r3, int r4, android.os.Bundle r5) {
        /*
            boolean r1 = super.performAccessibilityAction(r3, r4, r5)
            r0 = 0
            if (r1 == 0) goto L70
            r0 = 64
            r5 = 1
            if (r4 != r0) goto L6d
            java.lang.Object r4 = r2.l0
            com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreatePasswordFragment r4 = (com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreatePasswordFragment) r4
            X.0iMk r0 = r4.RS()
            if (r0 == 0) goto L6d
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L6d
            com.bytedance.tux.input.TuxTextView r3 = r4.LLLJ
            r2 = 2131373803(0x7f0a2eeb, float:1.8367708E38)
            r1 = 0
            if (r3 != 0) goto L35
            android.view.View r0 = r4.getView()
            if (r0 == 0) goto L6e
            android.view.View r3 = r0.findViewById(r2)
        L2e:
            r0 = r3
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r4.LLLJ = r0
            if (r3 == 0) goto L52
        L35:
            com.bytedance.tux.input.TuxTextView r0 = r4.LLLJ
            if (r0 != 0) goto L49
            android.view.View r0 = r4.getView()
            if (r0 == 0) goto L43
            android.view.View r1 = r0.findViewById(r2)
        L43:
            r0 = r1
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r4.LLLJ = r0
            r0 = r1
        L49:
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.CharSequence r0 = r0.getText()
            r3.announceForAccessibility(r0)
        L52:
            X.0Xb5 r0 = r4.NS()
            if (r0 == 0) goto L5b
            r0.LIZ()
        L5b:
            X.0Xb5 r0 = r4.QS()
            if (r0 == 0) goto L64
            r0.LIZ()
        L64:
            X.0Xb5 r0 = r4.PS()
            if (r0 == 0) goto L6d
            r0.LIZ()
        L6d:
            return r5
        L6e:
            r3 = r1
            goto L2e
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C854830Xg9.performAccessibilityAction$0(X.0Xg9, android.view.View, int, android.os.Bundle):boolean");
    }

    public static final boolean performAccessibilityAction$1(C854830Xg9 c854830Xg9, View view, int i, Bundle bundle) {
        BaseUpdatePasswordFragment baseUpdatePasswordFragment;
        C197039127h c197039127hNS;
        if (!super.performAccessibilityAction(view, i, bundle)) {
            return false;
        }
        if (i == 64 && ((c197039127hNS = (baseUpdatePasswordFragment = (BaseUpdatePasswordFragment) c854830Xg9.l0).nS()) == null || !c197039127hNS.isEnabled())) {
            C420580GeO c420580GeOPS = baseUpdatePasswordFragment.PS();
            if (!c420580GeOPS.LLILLL) {
                c420580GeOPS.announceForAccessibility(c420580GeOPS.getChecklistItemDescFromXml().getText());
                return true;
            }
        }
        return true;
    }
}
