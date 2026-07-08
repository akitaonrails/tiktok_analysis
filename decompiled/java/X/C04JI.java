package X;

import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.shopify.USCombinedSkuEmailAuthorizeCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shopify.USEmailAuthorizeCell;
import java.util.HashMap;

/* JADX INFO: renamed from: X.04JI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JI implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
        }
    }

    public C04JI(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onCheckedChanged$0(C04JI c04ji, CompoundButton compoundButton, boolean z) {
        String str;
        String str2;
        String str3;
        ((USEmailAuthorizeCell) c04ji.l0).L5().AT2(Boolean.valueOf(z), ((AnonymousClass0316) c04ji.l1).LLILZLL.authType, null);
        Fragment fragment = ((USEmailAuthorizeCell) c04ji.l0).getFragment();
        if (fragment != null) {
            AnonymousClass0316 anonymousClass0316 = (AnonymousClass0316) c04ji.l1;
            if (z) {
                C1389880mGw c1389880mGw = new C1389880mGw(fragment);
                c1389880mGw.LJIIIZ(anonymousClass0316.LLILZLL.enableAuthToast);
                c1389880mGw.LJIIJ();
            } else {
                C1389880mGw c1389880mGw2 = new C1389880mGw(fragment);
                c1389880mGw2.LJIIIZ(anonymousClass0316.LLILZLL.disableAuthToast);
                c1389880mGw2.LJIIJ();
            }
        }
        C03O0 c03o0 = C03O0.LIZ;
        Integer num = ((AnonymousClass0316) c04ji.l1).LLILZLL.authType;
        EnumC804803Ck enumC804803Ck = EnumC804803Ck.SELLER_CRM;
        int value = enumC804803Ck.getValue();
        if (num != null && num.intValue() == value) {
            str = "CRM_toggle";
        } else {
            str = "share_email_to_shopify";
        }
        if (z) {
            str2 = "select";
        } else {
            str2 = "cancel";
        }
        HashMap<String, Object> mapHi1 = ((USEmailAuthorizeCell) c04ji.l0).L5().hi1(false);
        C817603Hi c817603Hi = ((USEmailAuthorizeCell) c04ji.l0).L5().LLLZLZ;
        Integer num2 = ((AnonymousClass0316) c04ji.l1).LLILZLL.authType;
        int value2 = enumC804803Ck.getValue();
        if (num2 != null && num2.intValue() == value2) {
            str3 = "c77404.d63928";
        } else {
            str3 = "c92010.d2007";
        }
        C03O0.LJJJJLL(c03o0, str, str2, mapHi1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, c817603Hi.LIZ(str3), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -536870920, 8388607);
    }

    public static final void onCheckedChanged$1(C04JI c04ji, CompoundButton compoundButton, boolean z) {
        String str;
        ((USCombinedSkuEmailAuthorizeCell) c04ji.l0).N5().AT2(Boolean.valueOf(z), ((AnonymousClass0316) c04ji.l1).LLILZLL.authType, null);
        Fragment fragment = ((USCombinedSkuEmailAuthorizeCell) c04ji.l0).getFragment();
        if (fragment != null) {
            if (z) {
                C1389880mGw c1389880mGw = new C1389880mGw(fragment);
                c1389880mGw.LJIIIIZZ(2131832900);
                c1389880mGw.LJIIJ();
            } else {
                C1389880mGw c1389880mGw2 = new C1389880mGw(fragment);
                c1389880mGw2.LJIIIIZZ(2131832901);
                c1389880mGw2.LJIIJ();
            }
        }
        C03O0 c03o0 = C03O0.LIZ;
        if (z) {
            str = "select";
        } else {
            str = "cancel";
        }
        C03O0.LJJJJLL(c03o0, "share_email_to_shopify", str, ((USCombinedSkuEmailAuthorizeCell) c04ji.l0).N5().hi1(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((USCombinedSkuEmailAuthorizeCell) c04ji.l0).N5().LLLZLZ.LIZ("c92010.d2007"), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -536870920, 8388607);
    }
}
