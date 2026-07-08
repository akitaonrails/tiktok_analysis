package Y;

import X.C1326305Gz;
import X.C13LP;
import android.view.View;
import com.ss.android.ugc.aweme.authorize.I18nAuthorizeFragment;
import java.util.HashMap;

/* JADX INFO: loaded from: classes35.dex */
public class ACListenerS91S1100000_34 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS91S1100000_34 aCListenerS91S1100000_34, View view) {
        ((I18nAuthorizeFragment) aCListenerS91S1100000_34.l1).u8(aCListenerS91S1100000_34.s0);
        C1326305Gz c1326305Gz = C1326305Gz.LIZ;
        HashMap map = new HashMap();
        I18nAuthorizeFragment i18nAuthorizeFragment = (I18nAuthorizeFragment) aCListenerS91S1100000_34.l1;
        map.putAll(i18nAuthorizeFragment.ZR().LIZ);
        map.put("pattern", i18nAuthorizeFragment.LLLLIIL.getValue());
        map.put("switch_account_icon", 1);
        map.put("toggled_scope", C13LP.LJJLIIIJ(i18nAuthorizeFragment.LLLLLLZ, ",", null, null, 0, null, null, 62));
        map.put("untoggled_scope", C13LP.LJJLIIIJ(i18nAuthorizeFragment.LLLLLLLZIL, ",", null, null, 0, null, null, 62));
        c1326305Gz.getClass();
        C1326305Gz.LIZ("auth_page_button_click", map, null);
    }

    public static final void onClick$1(ACListenerS91S1100000_34 aCListenerS91S1100000_34, View view) {
        ((I18nAuthorizeFragment) aCListenerS91S1100000_34.l1).u8(aCListenerS91S1100000_34.s0);
    }

    public static final void onClick$2(ACListenerS91S1100000_34 aCListenerS91S1100000_34, View view) {
        ((I18nAuthorizeFragment) aCListenerS91S1100000_34.l1).u8(aCListenerS91S1100000_34.s0);
    }

    public ACListenerS91S1100000_34(I18nAuthorizeFragment i18nAuthorizeFragment, String str, int i) {
        this.$t = i;
        this.l1 = i18nAuthorizeFragment;
        this.s0 = str;
    }
}
