package Y;

import X.C2238181Ciu;
import X.InterfaceC2238201Ciw;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.profilebanner.data.ButtonInfo;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerInfoModel;

/* JADX INFO: loaded from: classes35.dex */
public class ACListenerS98S0300000_34 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS98S0300000_34 aCListenerS98S0300000_34, View view) {
        C2238181Ciu c2238181Ciu = (C2238181Ciu) aCListenerS98S0300000_34.l0;
        Context context = (Context) aCListenerS98S0300000_34.l1;
        String str = ((ProfileBannerInfoModel) aCListenerS98S0300000_34.l2).schemaUrl;
        c2238181Ciu.getClass();
        C2238181Ciu.LIZLLL(context, str);
        InterfaceC2238201Ciw interfaceC2238201Ciw = ((C2238181Ciu) aCListenerS98S0300000_34.l0).LIZ;
        if (interfaceC2238201Ciw != null) {
            interfaceC2238201Ciw.LIZIZ((ProfileBannerInfoModel) aCListenerS98S0300000_34.l2, "click_banner", true);
        }
    }

    public static final void onClick$1(ACListenerS98S0300000_34 aCListenerS98S0300000_34, View view) {
        String str;
        C2238181Ciu c2238181Ciu = (C2238181Ciu) aCListenerS98S0300000_34.l0;
        Context context = (Context) aCListenerS98S0300000_34.l1;
        ButtonInfo buttonInfo = ((ProfileBannerInfoModel) aCListenerS98S0300000_34.l2).buttonInfo;
        if (buttonInfo != null) {
            str = buttonInfo.schemaUrl;
        } else {
            str = null;
        }
        c2238181Ciu.getClass();
        C2238181Ciu.LIZLLL(context, str);
        InterfaceC2238201Ciw interfaceC2238201Ciw = ((C2238181Ciu) aCListenerS98S0300000_34.l0).LIZ;
        if (interfaceC2238201Ciw != null) {
            interfaceC2238201Ciw.LIZIZ((ProfileBannerInfoModel) aCListenerS98S0300000_34.l2, "click_button", true);
        }
    }

    public static final void onClick$2(ACListenerS98S0300000_34 aCListenerS98S0300000_34, View view) {
        C2238181Ciu c2238181Ciu = (C2238181Ciu) aCListenerS98S0300000_34.l0;
        Context context = ((View) aCListenerS98S0300000_34.l1).getContext();
        String str = ((ProfileBannerInfoModel) aCListenerS98S0300000_34.l2).schemaUrl;
        c2238181Ciu.getClass();
        C2238181Ciu.LIZLLL(context, str);
        InterfaceC2238201Ciw interfaceC2238201Ciw = ((C2238181Ciu) aCListenerS98S0300000_34.l0).LIZ;
        if (interfaceC2238201Ciw != null) {
            interfaceC2238201Ciw.LIZIZ((ProfileBannerInfoModel) aCListenerS98S0300000_34.l2, "click_banner", true);
        }
    }

    public static final void onClick$3(ACListenerS98S0300000_34 aCListenerS98S0300000_34, View view) {
        String str;
        C2238181Ciu c2238181Ciu = (C2238181Ciu) aCListenerS98S0300000_34.l0;
        Context context = ((View) aCListenerS98S0300000_34.l1).getContext();
        ButtonInfo buttonInfo = ((ProfileBannerInfoModel) aCListenerS98S0300000_34.l2).buttonInfo;
        if (buttonInfo != null) {
            str = buttonInfo.schemaUrl;
        } else {
            str = null;
        }
        c2238181Ciu.getClass();
        C2238181Ciu.LIZLLL(context, str);
        InterfaceC2238201Ciw interfaceC2238201Ciw = ((C2238181Ciu) aCListenerS98S0300000_34.l0).LIZ;
        if (interfaceC2238201Ciw != null) {
            interfaceC2238201Ciw.LIZIZ((ProfileBannerInfoModel) aCListenerS98S0300000_34.l2, "click_button", true);
        }
    }

    public ACListenerS98S0300000_34(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
