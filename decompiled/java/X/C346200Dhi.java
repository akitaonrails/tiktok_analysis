package X;

import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcIntroFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Dhi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346200Dhi extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                textPaint.setUnderlineText(false);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C346200Dhi c346200Dhi, View view) {
        int i;
        FragmentManager fragmentManager = ((ProfileAigcIntroFragment) c346200Dhi.l0).getFragmentManager();
        if (fragmentManager != null) {
            ProfileAigcIntroFragment profileAigcIntroFragment = (ProfileAigcIntroFragment) c346200Dhi.l0;
            Context context = (Context) c346200Dhi.l1;
            profileAigcIntroFragment.LLJILJILJ = true;
            DialogInterfaceOnDismissListenerC346390Di1 dialogInterfaceOnDismissListenerC346390Di1 = new DialogInterfaceOnDismissListenerC346390Di1(profileAigcIntroFragment, 3);
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "aigc_avatar_setting", true) == 1) {
                i = 2131820628;
            } else {
                i = 2131820632;
            }
            List listLJIILJJIL = C1697810uHb.LJIILJJIL(C03DF.LIZ(context, context.getString(2131820627)), C03DF.LIZ(context, context.getString(i)), C03DF.LIZ(context, context.getString(2131820629)));
            View viewSd = C786410Ut5.Sd(R.layout.ebj, C786410Ut5.ne(context), null);
            ViewGroup viewGroup = (ViewGroup) viewSd.findViewById(R.id.euh);
            Iterator it2 = listLJIILJJIL.iterator();
            while (it2.hasNext()) {
                viewGroup.addView((View) it2.next());
            }
            C197039127h c197039127h = (C197039127h) viewSd.findViewById(R.id.exe);
            C786410Ut5.U8(c197039127h, new ACListenerS139S0100000_4(viewSd, 91));
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            c197039127h.setBackground(c384050F3z.LIZ(context));
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIII = viewSd;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLILLJJLI = dialogInterfaceOnDismissListenerC346390Di1;
            tuxSheet.show(fragmentManager, "profile_aigc_term_detail_tag");
            profileAigcIntroFragment.LLJILLL = tuxSheet;
        }
    }

    public static final void onClick$1(C346200Dhi c346200Dhi, View view) {
        Context context = (Context) c346200Dhi.l0;
        String str = (String) C0BSK.LIZ.getValue();
        if (str == null) {
            str = "";
        }
        SmartRouter.buildRoute(context, str).open();
        C20515215Pi c20515215Pi = ((C344540Df2) c346200Dhi.l1).LLILLJJLI;
        if (c20515215Pi != null) {
            c20515215Pi.LIZIZ();
        }
        ((C344540Df2) c346200Dhi.l1).getClass();
        C344540Df2.LJIIL("replace");
    }

    public static final void updateDrawState$1(C346200Dhi c346200Dhi, TextPaint textPaint) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, (Context) c346200Dhi.l0);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.LIZ(62);
            textPaint.setTypeface(c444890HcV.getTypeface());
        }
        textPaint.setUnderlineText(false);
    }

    public C346200Dhi(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
